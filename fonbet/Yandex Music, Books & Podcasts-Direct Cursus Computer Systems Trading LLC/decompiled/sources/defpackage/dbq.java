package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dbq implements hbq {
    public final String a;
    public final String b;

    public dbq(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbq)) {
            return false;
        }
        dbq dbqVar = (dbq) obj;
        return Intrinsics.d(this.a, dbqVar.a) && Intrinsics.d(this.b, dbqVar.b);
    }

    @Override // defpackage.aaq
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("RawWithWave(rawStationId=", this.a, ", sessionId=", this.b, ")");
    }
}
