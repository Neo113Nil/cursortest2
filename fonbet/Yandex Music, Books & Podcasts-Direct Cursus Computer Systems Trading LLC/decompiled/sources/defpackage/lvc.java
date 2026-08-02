package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class lvc {
    public final List a;
    public long b;
    public long c;
    public boolean d;
    public long e;

    public lvc(ArrayList arrayList) {
        arrayList.getClass();
        arrayList.getClass();
        this.a = arrayList;
        this.b = 0L;
        this.c = 0L;
        this.d = false;
        this.e = 0L;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lvc lvcVar = (lvc) obj;
        return this.b == lvcVar.b && this.c == lvcVar.c && this.d == lvcVar.d && Intrinsics.d(this.a, lvcVar.a);
    }

    public final int b() {
        return this.a.hashCode() + k5r.e(tlm.c(this.c, Long.hashCode(this.b) * 31, 31), 31, this.d);
    }

    public boolean equals(Object obj) {
        return (obj instanceof lvc) && a(obj) && this.e == ((lvc) obj).e;
    }

    public int hashCode() {
        return Long.hashCode(this.e) + (b() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.b);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.c);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.e);
        sb.append(", isJank=");
        sb.append(this.d);
        sb.append(", states=");
        return eta.h(sb, this.a, ')');
    }
}
