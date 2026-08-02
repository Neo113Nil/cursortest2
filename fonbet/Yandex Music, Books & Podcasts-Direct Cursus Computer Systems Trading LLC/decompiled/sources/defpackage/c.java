package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c extends Animatable2.AnimationCallback {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;

    public c(Function0 function0, Function0 function02) {
        this.a = function0;
        this.b = function02;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Function0 function0 = this.b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Function0 function0 = this.a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
