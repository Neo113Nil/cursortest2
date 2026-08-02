package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jsi {
    public final String a;
    public final List b;

    public jsi(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final qsi a() {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((zqi) obj) instanceof qsi) {
                break;
            }
        }
        if (obj instanceof qsi) {
            return (qsi) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsi)) {
            return false;
        }
        jsi jsiVar = (jsi) obj;
        return this.a.equals(jsiVar.a) && Intrinsics.d(this.b, jsiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.h("MyShelfCatalog(title=", this.a, ", blocks=", ")", this.b);
    }
}
