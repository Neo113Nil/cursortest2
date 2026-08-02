package defpackage;

import java.io.File;

/* loaded from: classes5.dex */
public final class f0o extends h0o {
    public final /* synthetic */ int a;
    public final twh b;
    public final Object c;

    public f0o(h0o h0oVar, twh twhVar) {
        this.a = 2;
        this.c = h0oVar;
        this.b = twhVar;
    }

    @Override // defpackage.h0o
    public final long a() {
        switch (this.a) {
            case 0:
                return ((File) this.c).length();
            case 1:
                return ((pn3) this.c).d();
            default:
                return ((h0o) this.c).a();
        }
    }

    @Override // defpackage.h0o
    public final twh b() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.h0o
    public final void d(gj3 gj3Var) {
        switch (this.a) {
            case 0:
                lt1 S = fxf.S((File) this.c);
                try {
                    gj3Var.o0(S);
                    S.close();
                    return;
                } finally {
                }
            case 1:
                gj3Var.W((pn3) this.c);
                return;
            default:
                ((h0o) this.c).d(gj3Var);
                return;
        }
    }

    public /* synthetic */ f0o(twh twhVar, Object obj, int i) {
        this.a = i;
        this.b = twhVar;
        this.c = obj;
    }
}
