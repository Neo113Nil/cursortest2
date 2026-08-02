package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uaq implements aaq {
    public final String a;

    public uaq(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uaq) && Intrinsics.d(this.a, ((uaq) obj).a);
    }

    @Override // defpackage.aaq
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SharedYnisonVideoWaveId(videoId=", this.a, ")");
    }
}
