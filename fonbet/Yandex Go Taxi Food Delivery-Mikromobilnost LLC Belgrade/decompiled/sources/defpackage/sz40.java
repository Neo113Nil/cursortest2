package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes.dex */
public final class sz40 {
    public final oz40 a = f.j(Boolean.FALSE);
    public final oz40 b;
    public final oz40 c;

    public sz40(Object obj) {
        this.b = f.j(obj);
        this.c = f.j(obj);
    }

    public final boolean a() {
        return jl40.l(this.b.getValue(), this.c.getValue()) && !((Boolean) this.a.getValue()).booleanValue();
    }

    public final void b(Boolean bool) {
        this.c.setValue(bool);
    }
}
