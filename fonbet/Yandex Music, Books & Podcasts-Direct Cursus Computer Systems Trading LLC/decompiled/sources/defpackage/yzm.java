package defpackage;

import com.yandex.music.shared.player.download2.exo.a;

/* loaded from: classes6.dex */
public final class yzm implements t6t {
    public final /* synthetic */ int a = 1;
    public final t6t b;
    public final Object c;

    public yzm(t6t t6tVar, bl2 bl2Var) {
        this.b = t6tVar;
        this.c = bl2Var;
    }

    @Override // defpackage.t6t
    public final void C(db7 db7Var, nb7 nb7Var, boolean z) {
        int i = this.a;
        db7Var.getClass();
        nb7Var.getClass();
        switch (i) {
            case 0:
                ((bl2) this.c).C(db7Var, nb7Var, z);
                t6t t6tVar = this.b;
                if (t6tVar != null) {
                    t6tVar.C(db7Var, nb7Var, z);
                    break;
                }
                break;
            default:
                a aVar = (a) this.c;
                if (!aVar.s) {
                    aVar.s = true;
                    this.b.C(db7Var, nb7Var, z);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.t6t
    public final void a(lq2 lq2Var, nb7 nb7Var, boolean z, int i) {
        int i2 = this.a;
        nb7Var.getClass();
        switch (i2) {
            case 0:
                ((bl2) this.c).a(lq2Var, nb7Var, z, i);
                t6t t6tVar = this.b;
                if (t6tVar != null) {
                    t6tVar.a(lq2Var, nb7Var, z, i);
                    break;
                }
                break;
            default:
                this.b.a(lq2Var, nb7Var, z, i);
                break;
        }
    }

    @Override // defpackage.t6t
    public final void h(db7 db7Var, nb7 nb7Var, boolean z) {
        int i = this.a;
        db7Var.getClass();
        nb7Var.getClass();
        switch (i) {
            case 0:
                ((bl2) this.c).h(db7Var, nb7Var, z);
                t6t t6tVar = this.b;
                if (t6tVar != null) {
                    t6tVar.h(db7Var, nb7Var, z);
                    break;
                }
                break;
            default:
                a aVar = (a) this.c;
                if (!aVar.r) {
                    aVar.r = true;
                    this.b.h(db7Var, nb7Var, z);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.t6t
    public final void z(db7 db7Var, nb7 nb7Var, boolean z) {
        int i = this.a;
        nb7Var.getClass();
        switch (i) {
            case 0:
                ((bl2) this.c).z(db7Var, nb7Var, z);
                t6t t6tVar = this.b;
                if (t6tVar != null) {
                    t6tVar.z(db7Var, nb7Var, z);
                    break;
                }
                break;
            default:
                a aVar = (a) this.c;
                if (!aVar.q) {
                    aVar.t = true;
                    this.b.z(db7Var, nb7Var, z);
                    break;
                }
                break;
        }
    }

    public yzm(a aVar, t6t t6tVar) {
        this.c = aVar;
        this.b = t6tVar;
    }
}
