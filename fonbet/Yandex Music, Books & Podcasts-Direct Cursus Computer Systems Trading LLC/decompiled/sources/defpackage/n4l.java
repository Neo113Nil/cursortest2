package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n4l {
    public final String a;
    public final ewt b;

    public n4l(String str, ewt ewtVar) {
        this.a = str;
        this.b = ewtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4l)) {
            return false;
        }
        n4l n4lVar = (n4l) obj;
        return this.a.equals(n4lVar.a) && Intrinsics.d(this.b, n4lVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ewt ewtVar = this.b;
        return hashCode + (ewtVar == null ? 0 : ewtVar.hashCode());
    }

    public final String toString() {
        return "PlaybackReportingPayload(yclid=" + this.a + ", utm=" + this.b + ")";
    }
}
