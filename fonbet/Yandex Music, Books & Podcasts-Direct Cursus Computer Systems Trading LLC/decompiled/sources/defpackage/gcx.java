package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gcx extends wcx {
    public final boolean a;

    public gcx(boolean z) {
        this.a = z;
    }

    @Override // defpackage.wcx
    public final int a() {
        return wcx.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        wcx wcxVar = (wcx) obj;
        int a = wcxVar.a();
        int d = wcx.d((byte) -32);
        if (d != a) {
            return d - wcxVar.a();
        }
        return (true != this.a ? 20 : 21) - (true != ((gcx) wcxVar).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gcx.class == obj.getClass() && this.a == ((gcx) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(wcx.d((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
