package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.components.ThemeSwitcherViewKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class AlertDialogKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda1(List list, float f, float f2, int i) {
        this.$r8$classId = 2;
        this.f$2 = list;
        this.f$0 = f;
        this.f$1 = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        float f = this.f$1;
        float f2 = this.f$0;
        Object obj3 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AlertDialogKt.m515AlertDialogFlowRowixp7dh8(f2, f, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(439));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ThemeSwitcherViewKt.GlitterWipeAnimation(f2, f, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                break;
            default:
                ((Integer) obj2).getClass();
                AlphaKt.StickerOverlay((List) obj3, f2, f, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda1(float f, float f2, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = f;
        this.f$1 = f2;
        this.f$2 = obj;
    }
}
