package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class kka {
    public final int a;
    public final int b;
    public final String c;
    public final long d;

    public kka(long j, String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kka.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        kka kkaVar = (kka) obj;
        return this.a == kkaVar.a && this.b == kkaVar.b && Intrinsics.d(this.c, kkaVar.c) && this.d == kkaVar.d;
    }

    public final int hashCode() {
        int a = f1d.a(this.b, this.a * 31, 31);
        String str = this.c;
        return Long.hashCode(this.d) + ((a + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloaderConfig(maxSegmentsCount=");
        sb.append(this.a);
        sb.append(", sourceIndex=");
        sb.append(this.b);
        sb.append(", vsid=");
        sb.append(this.c);
        sb.append(", startPosition=");
        return eta.g(sb, this.d, ')');
    }
}
