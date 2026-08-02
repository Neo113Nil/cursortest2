package coil3.gif.internal;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class UtilsKt$animatable2CallbackOf$1 extends Animatable2.AnimationCallback {
    public final /* synthetic */ Object $onEnd;
    public final /* synthetic */ Function0 $onStart;
    public final /* synthetic */ int $r8$classId = 1;

    public UtilsKt$animatable2CallbackOf$1(AnimatedVectorDrawable animatedVectorDrawable, Function0 function0) {
        this.$onEnd = animatedVectorDrawable;
        this.$onStart = function0;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        int i = this.$r8$classId;
        Object obj = this.$onEnd;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                super.onAnimationEnd(drawable);
                ((AnimatedVectorDrawable) obj).clearAnimationCallbacks();
                this.$onStart.invoke();
                break;
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationStart(Drawable drawable) {
        switch (this.$r8$classId) {
            case 0:
                Function0 function0 = this.$onStart;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                super.onAnimationStart(drawable);
                break;
        }
    }

    public UtilsKt$animatable2CallbackOf$1(Function0 function0, Function0 function02) {
        this.$onStart = function0;
        this.$onEnd = function02;
    }
}
