package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zuo {
    public static final zuo c = new zuo(null, "");
    public final String a;
    public final Object b;

    public zuo(Object obj, String str) {
        str.getClass();
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuo)) {
            return false;
        }
        zuo zuoVar = (zuo) obj;
        return Intrinsics.d(this.a, zuoVar.a) && Intrinsics.d(this.b, zuoVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ScreenData(loadedId=" + this.a + ", keyData=" + this.b + ")";
    }
}
