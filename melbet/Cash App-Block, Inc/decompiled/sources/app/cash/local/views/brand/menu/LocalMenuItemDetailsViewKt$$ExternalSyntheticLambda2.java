package app.cash.local.views.brand.menu;

import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.views.internal.LocalMapKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalMenuItemDetailsViewModel f$0;

    public /* synthetic */ LocalMenuItemDetailsViewKt$$ExternalSyntheticLambda2(LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = localMenuItemDetailsViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LocalMapKt.LocalExpandedHeader(Expect_jvmKt.rememberComposableLambda(1058946604, new SliderDefaults$$ExternalSyntheticLambda3(localMenuItemDetailsViewModel, 11), gapComposer), gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    MenuItemAvailability menuItemAvailability = localMenuItemDetailsViewModel.availability;
                    if (menuItemAvailability == null) {
                        gapComposer2.startReplaceGroup(-1241733515);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1241733514);
                        LocalMapKt.LocalMenuAvailabilityText(null, menuItemAvailability, false, LocalMapKt.mediumStyle(gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes, 1);
                        gapComposer2.end(false);
                    }
                    Integer num = localMenuItemDetailsViewModel.calories;
                    if (num == null) {
                        gapComposer2.startReplaceGroup(-1241447416);
                    } else {
                        gapComposer2.startReplaceGroup(-1241447415);
                        LocalCaloriesTextKt.LocalCaloriesText(num.intValue(), 0, gapComposer2, null);
                    }
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
