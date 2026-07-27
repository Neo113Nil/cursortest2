package l4;

import u1.h;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4664a {

    /* renamed from: a, reason: collision with root package name */
    public final String f38914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38915b;

    public C4664a(String str, String str2) {
        this.f38914a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f38915b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4664a) {
            C4664a c4664a = (C4664a) obj;
            if (this.f38914a.equals(c4664a.f38914a) && this.f38915b.equals(c4664a.f38915b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f38914a.hashCode() ^ 1000003) * 1000003) ^ this.f38915b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f38914a);
        sb.append(", version=");
        return h.g(sb, this.f38915b, "}");
    }
}
