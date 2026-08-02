package defpackage;

import android.app.Activity;

/* loaded from: classes5.dex */
public final class f26 implements u26 {
    public final /* synthetic */ u26 a;
    public final bz2 b;
    public final rw5 c;

    public f26(u26 u26Var, bz2 bz2Var) {
        this.a = u26Var;
        this.b = bz2Var;
        this.c = u26Var.d();
    }

    @Override // defpackage.u26
    public final bz2 a() {
        return this.b;
    }

    @Override // defpackage.u26
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.u26
    public final t36 c(Activity activity) {
        activity.getClass();
        return this.a.c(activity);
    }

    @Override // defpackage.u26
    public final rw5 d() {
        return this.c;
    }

    @Override // defpackage.u26
    public final o36 e() {
        return this.a.e();
    }
}
