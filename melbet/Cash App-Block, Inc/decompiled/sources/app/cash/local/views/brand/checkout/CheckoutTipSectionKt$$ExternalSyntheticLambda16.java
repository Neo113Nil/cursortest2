package app.cash.local.views.brand.checkout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class CheckoutTipSectionKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ CheckoutTipSectionKt$$ExternalSyntheticLambda16(String str, boolean z, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = str;
        this.f$3 = z;
        this.f$4 = function0;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.getClass();
                CheckoutTipSectionKt.TipOptionItem(Updater.updateChangedFlags(this.f$5 | 1), composer, this.f$1, this.f$4, this.f$3);
                break;
            default:
                num.intValue();
                LocalBrandLocationRowKt.DropdownAnchor(Updater.updateChangedFlags(this.f$5 | 1), composer, this.f$1, this.f$4, this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }
}
