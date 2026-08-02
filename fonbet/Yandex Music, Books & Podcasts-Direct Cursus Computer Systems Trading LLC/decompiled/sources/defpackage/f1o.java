package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1o {
    public final String a;
    public final Map b;

    public f1o(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f1o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        f1o f1oVar = (f1o) obj;
        return Intrinsics.d(this.a, f1oVar.a) && Intrinsics.d(this.b, f1oVar.b);
    }

    public final int hashCode() {
        return f1d.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RequestNetworkDataModel(path=" + this.a + ", queryItems=" + this.b + ", patchParams=null)";
    }
}
