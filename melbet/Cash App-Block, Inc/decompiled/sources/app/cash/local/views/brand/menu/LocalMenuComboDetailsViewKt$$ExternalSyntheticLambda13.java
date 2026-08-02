package app.cash.local.views.brand.menu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.util.compose.ScaledSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ int f$6;

    public /* synthetic */ LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda13(Modifier modifier, String str, long j, boolean z, int i, int i2) {
        this.f$1 = modifier;
        this.f$2 = str;
        this.f$3 = j;
        this.f$4 = z;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(7);
                LocalCaloriesTextKt.m1310ComboSlotSubtitleTextuDo3WH8(this.f$1, (String) this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags, this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                ScaledSizeKt.m3993HypeIntroAnimationcf5BqRc(this.f$4, this.f$1, this.f$3, (Function0) this.f$2, (Composer) obj, Updater.updateChangedFlags(this.f$6 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalMenuComboDetailsViewKt$$ExternalSyntheticLambda13(boolean z, Modifier modifier, long j, Function0 function0, int i) {
        this.f$4 = z;
        this.f$1 = modifier;
        this.f$3 = j;
        this.f$2 = function0;
        this.f$6 = i;
    }
}
