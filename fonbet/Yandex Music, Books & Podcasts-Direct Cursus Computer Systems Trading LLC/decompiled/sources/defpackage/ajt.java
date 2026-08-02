package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ajt {
    public final rht a;
    public final String b;
    public final String c;
    public final String d;
    public final pkb e;
    public final int f;
    public final String g;
    public final wjb h;
    public final int i;

    public ajt(rht rhtVar, String str, String str2, String str3, pkb pkbVar, int i, String str4, wjb wjbVar, int i2) {
        rhtVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = rhtVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = pkbVar;
        this.f = i;
        this.g = str4;
        this.h = wjbVar;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajt)) {
            return false;
        }
        ajt ajtVar = (ajt) obj;
        return this.a == ajtVar.a && Intrinsics.d(this.b, ajtVar.b) && Intrinsics.d(this.c, ajtVar.c) && Intrinsics.d(this.d, ajtVar.d) && this.e == ajtVar.e && this.f == ajtVar.f && this.g.equals(ajtVar.g) && this.h == ajtVar.h && this.i == ajtVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ((this.h.hashCode() + k5r.c(f1d.a(this.f, (this.e.hashCode() + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalEntitiesAnalyticsEvent(uiType=");
        sb.append(this.a);
        sb.append(", objectId=");
        sb.append(this.b);
        sb.append(", blockId=");
        su4.v(sb, this.c, ", entityType=", this.d, ", objectType=");
        sb.append(this.e);
        sb.append(", pos=");
        sb.append(this.f);
        sb.append(", viewUuid=");
        sb.append(this.g);
        sb.append(", to=");
        sb.append(this.h);
        sb.append(", objectsCount=");
        return f1d.i(sb, this.i, ")");
    }
}
