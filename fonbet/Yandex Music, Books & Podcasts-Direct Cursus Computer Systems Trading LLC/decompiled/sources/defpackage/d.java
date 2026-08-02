package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d extends ek0 {
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public d(Function0 function0, Function0 function02) {
        this.b = function0;
        this.c = function02;
    }

    @Override // defpackage.ek0
    public final void a(Drawable drawable) {
        Function0 function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // defpackage.ek0
    public final void b(Drawable drawable) {
        Function0 function0 = this.b;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
