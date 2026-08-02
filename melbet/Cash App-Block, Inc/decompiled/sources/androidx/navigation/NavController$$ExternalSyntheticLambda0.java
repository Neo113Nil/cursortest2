package androidx.navigation;

import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class NavController$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavHostController f$0;

    public /* synthetic */ NavController$$ExternalSyntheticLambda0(NavHostController navHostController, int i) {
        this.$r8$classId = i;
        this.f$0 = navHostController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.$r8$classId;
        NavHostController navHostController = this.f$0;
        switch (i2) {
            case 0:
                RedwoodLayoutKt$toAndroid$1 redwoodLayoutKt$toAndroid$1 = navHostController.onBackPressedCallback;
                boolean z = false;
                if (navHostController.enableOnBackPressedCallback) {
                    ArrayDeque arrayDeque = navHostController.impl.backQueue;
                    if (arrayDeque == null || !arrayDeque.isEmpty()) {
                        Iterator it = arrayDeque.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((NavBackStackEntry) it.next()).destination instanceof NavGraph) && (i = i + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                redwoodLayoutKt$toAndroid$1.setEnabled(z);
                return Unit.INSTANCE;
            default:
                return new NavInflater(navHostController.context, navHostController.impl._navigatorProvider);
        }
    }
}
