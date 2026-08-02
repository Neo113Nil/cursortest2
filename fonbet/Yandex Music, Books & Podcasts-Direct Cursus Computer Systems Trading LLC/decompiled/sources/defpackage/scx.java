package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class scx extends wcx {
    public final String a;

    public scx(String str) {
        this.a = str;
    }

    @Override // defpackage.wcx
    public final int a() {
        return wcx.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        wcx wcxVar = (wcx) obj;
        int a = wcxVar.a();
        int d = wcx.d((byte) 96);
        if (d != a) {
            return d - wcxVar.a();
        }
        String str = ((scx) wcxVar).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && scx.class == obj.getClass()) {
            return this.a.equals(((scx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(wcx.d((byte) 96)), this.a});
    }

    public final String toString() {
        return su4.o(new StringBuilder("\""), this.a, "\"");
    }
}
