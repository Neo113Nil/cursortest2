package androidx.compose.ui.window;

import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.AppCompatDelegateImpl;
import com.google.android.material.motion.MaterialBackHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class Api33Impl$$ExternalSyntheticLambda0 implements OnBackInvokedCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Api33Impl$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public final void onBackInvoked() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 1:
                ((AppCompatDelegateImpl) obj).onBackPressed();
                break;
            case 2:
                ((Runnable) obj).run();
                break;
            default:
                ((MaterialBackHandler) obj).handleBackInvoked();
                break;
        }
    }
}
