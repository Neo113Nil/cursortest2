package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zds {
    public final String a;
    public final String b;
    public final dtq c;
    public final s7g d;
    public final ftq e;

    public zds(String str, String str2, dtq dtqVar, s7g s7gVar, ftq ftqVar) {
        dtqVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = dtqVar;
        this.d = s7gVar;
        this.e = ftqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zds)) {
            return false;
        }
        zds zdsVar = (zds) obj;
        return Intrinsics.d(this.a, zdsVar.a) && Intrinsics.d(this.b, zdsVar.b) && Intrinsics.d(this.c, zdsVar.c) && this.d.equals(zdsVar.d) && Intrinsics.d(this.e, zdsVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        ftq ftqVar = this.e;
        return hashCode2 + (ftqVar != null ? ftqVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("TextSlideContentUiData(title=", this.a, ", subtitle=", this.b, ", align=");
        m.append(this.c);
        m.append(", titleSize=");
        m.append(this.d);
        m.append(", disclaimer=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
