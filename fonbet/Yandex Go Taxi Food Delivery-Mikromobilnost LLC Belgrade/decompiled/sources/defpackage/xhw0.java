package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class xhw0 implements rhw0 {
    public static final whw0 w = new whw0();
    public final Object a = new Object();
    public volatile rhw0 b;
    public Object c;

    public xhw0(rhw0 rhw0Var) {
        this.b = rhw0Var;
    }

    @Override // defpackage.rhw0
    public final Object get() {
        rhw0 rhw0Var = this.b;
        whw0 whw0Var = w;
        if (rhw0Var != whw0Var) {
            synchronized (this.a) {
                try {
                    if (this.b != whw0Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = whw0Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == w) {
            obj = x4e.h(new StringBuilder("<supplier that returned "), this.c, ">");
        }
        return x4e.h(sb, obj, Extension.C_BRAKE);
    }
}
