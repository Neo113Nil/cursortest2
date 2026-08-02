package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.a;

/* loaded from: classes2.dex */
public abstract class t2y implements rs11, kp31 {
    public final Context a;
    public final i3y b = a.a(new yow(11, this));

    public t2y(Context context) {
        this.a = context;
    }

    public void a(View view) {
    }

    public abstract View b(kp31 kp31Var);

    @Override // defpackage.kp31
    public final Context getCtx() {
        return this.a;
    }

    @Override // defpackage.rs11
    public final View getRoot() {
        return (View) this.b.getValue();
    }
}
