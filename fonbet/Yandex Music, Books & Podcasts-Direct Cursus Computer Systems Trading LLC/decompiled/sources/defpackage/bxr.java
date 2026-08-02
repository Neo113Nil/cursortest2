package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bxr {
    public final String a;
    public final Date b;

    public bxr(Date date, String str) {
        date.getClass();
        this.a = str;
        this.b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxr)) {
            return false;
        }
        bxr bxrVar = (bxr) obj;
        return this.a.equals(bxrVar.a) && Intrinsics.d(this.b, bxrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SyncPreSaveInfo(preSaveId=" + this.a + ", timestamp=" + this.b + ")";
    }
}
