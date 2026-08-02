package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zrv implements asv {
    public final String a;
    public final wrv b;

    public zrv(String str, wrv wrvVar) {
        str.getClass();
        this.a = str;
        this.b = wrvVar;
    }

    @Override // defpackage.asv
    public final wrv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrv)) {
            return false;
        }
        zrv zrvVar = (zrv) obj;
        return Intrinsics.d(this.a, zrvVar.a) && this.b.equals(zrvVar.b);
    }

    @Override // defpackage.csv
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Simplified(id=" + this.a + ", coordinates=" + this.b + ")";
    }
}
