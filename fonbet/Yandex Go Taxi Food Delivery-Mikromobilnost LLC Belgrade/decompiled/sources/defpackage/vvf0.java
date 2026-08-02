package defpackage;

import androidx.compose.runtime.h;

/* loaded from: classes.dex */
public final class vvf0 {
    public final h a;
    public final boolean b;
    public final e3t0 c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public vvf0(h hVar, Object obj, boolean z, e3t0 e3t0Var, boolean z2) {
        this.a = hVar;
        this.b = z;
        this.c = e3t0Var;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        lid.b("Unexpected form of a provided value");
        ny61.A();
        return null;
    }
}
