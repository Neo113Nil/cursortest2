package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class caq implements aaq {
    public final String a;

    public caq(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof caq) && Intrinsics.d(this.a, ((caq) obj).a);
    }

    @Override // defpackage.aaq
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SharedYnisonGenerativeId(stationId=", this.a, ")");
    }
}
