package defpackage;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fac {
    public final File a;
    public final List b;

    public fac(File file, List list) {
        list.getClass();
        this.a = file;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fac)) {
            return false;
        }
        fac facVar = (fac) obj;
        return this.a.equals(facVar.a) && Intrinsics.d(this.b, facVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.a);
        sb.append(", segments=");
        return eta.h(sb, this.b, ')');
    }
}
