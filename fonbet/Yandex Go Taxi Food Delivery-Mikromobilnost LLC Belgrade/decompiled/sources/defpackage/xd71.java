package defpackage;

import android.media.MediaFormat;
import yads.l03;

/* loaded from: classes7.dex */
public final class xd71 implements ai61, w981, i071 {
    public ai61 a;
    public w981 b;
    public rm81 c;
    public rm81 w;

    @Override // defpackage.i071
    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (ai61) obj;
            return;
        }
        if (i == 8) {
            this.b = (w981) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        l03 l03Var = (l03) obj;
        if (l03Var == null) {
            this.c = null;
            this.w = null;
        } else {
            rm81 rm81Var = l03Var.f;
            this.c = rm81Var;
            this.w = rm81Var;
        }
    }

    @Override // defpackage.w981
    public final void b(long j, float[] fArr) {
        rm81 rm81Var = this.w;
        if (rm81Var != null) {
            rm81Var.b(j, fArr);
        }
        w981 w981Var = this.b;
        if (w981Var != null) {
            w981Var.b(j, fArr);
        }
    }

    @Override // defpackage.w981
    public final void c() {
        rm81 rm81Var = this.w;
        if (rm81Var != null) {
            rm81Var.c();
        }
        w981 w981Var = this.b;
        if (w981Var != null) {
            w981Var.c();
        }
    }

    @Override // defpackage.ai61
    public final void a(long j, long j2, qd81 qd81Var, MediaFormat mediaFormat) {
        rm81 rm81Var = this.c;
        if (rm81Var != null) {
            rm81Var.a(j, j2, qd81Var, mediaFormat);
        }
        ai61 ai61Var = this.a;
        if (ai61Var != null) {
            ai61Var.a(j, j2, qd81Var, mediaFormat);
        }
    }
}
