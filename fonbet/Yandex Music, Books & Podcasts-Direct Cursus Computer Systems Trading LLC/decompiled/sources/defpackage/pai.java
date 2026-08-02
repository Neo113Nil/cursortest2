package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class pai implements OnBackAnimationCallback {
    public final /* synthetic */ mm6 a;
    public final /* synthetic */ fk0 b;
    public final /* synthetic */ Function0 c;

    public pai(Function0 function0, fk0 fk0Var, mm6 mm6Var) {
        this.a = mm6Var;
        this.b = fk0Var;
        this.c = function0;
    }

    public final void onBackCancelled() {
        x97.y(this.a, null, null, new v41(1, this.b, null), 3);
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        x97.y(this.a, null, null, new oai(this.b, backEvent, null, 0), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        x97.y(this.a, null, null, new oai(this.b, backEvent, null, 1), 3);
    }
}
