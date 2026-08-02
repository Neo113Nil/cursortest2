package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ob4 extends j8t {
    public boolean a = false;
    public final ViewGroup b;

    public ob4(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void a() {
        hdg.j0(this.b, false);
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void c() {
        hdg.j0(this.b, true);
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void d(b8t b8tVar) {
        hdg.j0(this.b, false);
        this.a = true;
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void e(b8t b8tVar) {
        if (!this.a) {
            hdg.j0(this.b, false);
        }
        b8tVar.H(this);
    }
}
