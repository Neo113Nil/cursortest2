package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.pools.applets.presenters.PoolIcon;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ int f$7;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda11(float f, MutableInteractionSourceImpl mutableInteractionSourceImpl, DefaultSliderColors defaultSliderColors, boolean z, int i) {
        this.$r8$classId = 0;
        this.f$2 = f;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = defaultSliderColors;
        this.f$5 = z;
        this.f$7 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                float f = this.f$2;
                SliderKt.m505SliderThumbPcYyNuk(f, (MutableInteractionSourceImpl) obj4, (DefaultSliderColors) obj3, this.f$5, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj4).m3764GraphicrAjV9yQ((BorrowAppletTileModel.Visual.Graphic) obj3, this.f$2, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                BarChartKt.m3449XAxisLabelsUuyPYSY((List) obj4, (TextStyle) obj3, this.f$2, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PoolsAppletTileKt.m3716PoolsTileEndContentjt2gSs((PoolIcon.Pool) obj4, (PoolIcon) obj3, this.f$5, this.f$2, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda11(PoolIcon.Pool pool, PoolIcon poolIcon, boolean z, float f, int i) {
        this.$r8$classId = 3;
        this.f$3 = pool;
        this.f$4 = poolIcon;
        this.f$5 = z;
        this.f$2 = f;
        this.f$7 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda11(Object obj, Object obj2, float f, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$3 = obj;
        this.f$4 = obj2;
        this.f$2 = f;
        this.f$5 = z;
        this.f$7 = i;
    }
}
