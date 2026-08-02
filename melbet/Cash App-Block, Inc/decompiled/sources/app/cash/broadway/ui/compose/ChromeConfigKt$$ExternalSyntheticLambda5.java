package app.cash.broadway.ui.compose;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ChromeConfigKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ ChromeConfigKt$$ExternalSyntheticLambda5(Object obj, boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = obj;
        this.f$0 = z;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$4 | 1);
                ChromeConfigKt.ChromeConfig(this.f$0, (Boolean) this.f$2, (Composer) obj, updateChangedFlags, this.f$5);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$4 | 1);
                AllowanceViewKt.FamilyHomeSectionHeader((String) this.f$2, this.f$0, (Composer) obj, updateChangedFlags2, this.f$5);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int updateChangedFlags3 = Updater.updateChangedFlags(this.f$5 | 1);
                CardViewApi21Impl.MaintainBottomOnInsetGrowthEffect((LazyListState) this.f$2, this.f$0, this.f$4, (Composer) obj, updateChangedFlags3);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(this.f$4 | 1);
                ListItemKt.UnclassifiedErrorContent(this.f$0, (Function0) this.f$2, (Composer) obj, updateChangedFlags4, this.f$5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ChromeConfigKt$$ExternalSyntheticLambda5(boolean z, Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = z;
        this.f$2 = obj;
        this.f$4 = i;
        this.f$5 = i2;
    }
}
