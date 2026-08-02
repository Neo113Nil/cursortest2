package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xmn {
    public int a;
    public ymn b;
    public w80 c;
    public Function2 d;
    public int e;
    public cpi f;
    public tpi g;

    public xmn(ymn ymnVar) {
        this.b = ymnVar;
    }

    public final boolean a() {
        if (this.b != null) {
            w80 w80Var = this.c;
            if (w80Var != null ? w80Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final gye b(Object obj) {
        gye b;
        ymn ymnVar = this.b;
        return (ymnVar == null || (b = ymnVar.b(this, obj)) == null) ? gye.a : b;
    }

    public final void c() {
        ymn ymnVar = this.b;
        if (ymnVar != null) {
            ymnVar.a();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void d(boolean z) {
        int i = this.a;
        if (z) {
            this.a = i | 32;
        } else {
            this.a = i & (-33);
        }
    }
}
