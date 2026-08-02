package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class vcu {
    public final String a;
    public final Integer b;
    public final mmq c;

    public vcu(String str, Integer num, mmq mmqVar) {
        this.a = str;
        this.b = num;
        this.c = mmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcu)) {
            return false;
        }
        vcu vcuVar = (vcu) obj;
        return Intrinsics.d(this.a, vcuVar.a) && Intrinsics.d(this.b, vcuVar.b) && this.c.equals(vcuVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VideoTrackData(title=" + this.a + ", bitrate=" + this.b + ", resolution=" + this.c + ')';
    }
}
