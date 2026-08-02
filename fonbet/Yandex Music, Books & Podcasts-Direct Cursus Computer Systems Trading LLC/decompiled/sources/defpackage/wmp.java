package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wmp implements r7c {
    public final Date a;
    public final String b;

    public wmp(Date date, String str) {
        date.getClass();
        str.getClass();
        this.a = date;
        this.b = str;
    }

    @Override // defpackage.r7c
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmp)) {
            return false;
        }
        wmp wmpVar = (wmp) obj;
        return Intrinsics.d(this.a, wmpVar.a) && Intrinsics.d(this.b, wmpVar.b);
    }

    @Override // defpackage.r7c
    public final Date getTimestamp() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionStartedFeedback(timestamp=" + this.a + ", from=" + this.b + ")";
    }
}
