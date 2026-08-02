package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w3a {
    public final String a;
    public final String b;

    public w3a(String str, String str2) {
        x3a x3aVar = x3a.a;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w3a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        w3a w3aVar = (w3a) obj;
        if (!this.a.equals(w3aVar.a) || !Intrinsics.d(this.b, w3aVar.b)) {
            return false;
        }
        x3a x3aVar = x3a.a;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return x3a.a.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        x3a x3aVar = x3a.a;
        StringBuilder m = f1d.m("DocumentError(type='", this.a, "', message='", this.b, "', issueType=");
        m.append(x3aVar);
        m.append(")");
        return m.toString();
    }
}
