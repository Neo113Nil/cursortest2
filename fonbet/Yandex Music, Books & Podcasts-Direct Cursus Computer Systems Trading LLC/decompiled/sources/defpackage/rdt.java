package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rdt {
    public final ges a;
    public final ges b;
    public final ges c;
    public final ges d;
    public final ges e;
    public final ges f;
    public final ges g;
    public final ges h;
    public final ges i;
    public final ges j;
    public final ges k;
    public final ges l;
    public final ges m;
    public final ges n;
    public final ges o;

    public rdt(ges gesVar, ges gesVar2, ges gesVar3, ges gesVar4, ges gesVar5, ges gesVar6, ges gesVar7, ges gesVar8, ges gesVar9, ges gesVar10, int i) {
        ges gesVar11 = (i & 1) != 0 ? xdt.d : gesVar;
        ges gesVar12 = (i & 2) != 0 ? xdt.e : gesVar2;
        ges gesVar13 = (i & 4) != 0 ? xdt.f : gesVar3;
        ges gesVar14 = (i & 8) != 0 ? xdt.g : gesVar4;
        ges gesVar15 = (i & 16) != 0 ? xdt.h : gesVar5;
        ges gesVar16 = (i & 32) != 0 ? xdt.i : gesVar6;
        ges gesVar17 = xdt.m;
        ges gesVar18 = xdt.n;
        ges gesVar19 = xdt.o;
        ges gesVar20 = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? xdt.a : gesVar7;
        ges gesVar21 = (i & 1024) != 0 ? xdt.b : gesVar8;
        ges gesVar22 = (i & 2048) != 0 ? xdt.c : gesVar9;
        ges gesVar23 = xdt.j;
        ges gesVar24 = xdt.k;
        ges gesVar25 = (i & 16384) != 0 ? xdt.l : gesVar10;
        this.a = gesVar11;
        this.b = gesVar12;
        this.c = gesVar13;
        this.d = gesVar14;
        this.e = gesVar15;
        this.f = gesVar16;
        this.g = gesVar17;
        this.h = gesVar18;
        this.i = gesVar19;
        this.j = gesVar20;
        this.k = gesVar21;
        this.l = gesVar22;
        this.m = gesVar23;
        this.n = gesVar24;
        this.o = gesVar25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdt)) {
            return false;
        }
        rdt rdtVar = (rdt) obj;
        return Intrinsics.d(this.a, rdtVar.a) && Intrinsics.d(this.b, rdtVar.b) && Intrinsics.d(this.c, rdtVar.c) && Intrinsics.d(this.d, rdtVar.d) && Intrinsics.d(this.e, rdtVar.e) && Intrinsics.d(this.f, rdtVar.f) && Intrinsics.d(this.g, rdtVar.g) && Intrinsics.d(this.h, rdtVar.h) && Intrinsics.d(this.i, rdtVar.i) && Intrinsics.d(this.j, rdtVar.j) && Intrinsics.d(this.k, rdtVar.k) && Intrinsics.d(this.l, rdtVar.l) && Intrinsics.d(this.m, rdtVar.m) && Intrinsics.d(this.n, rdtVar.n) && Intrinsics.d(this.o, rdtVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + tlm.d(this.n, tlm.d(this.m, tlm.d(this.l, tlm.d(this.k, tlm.d(this.j, tlm.d(this.i, tlm.d(this.h, tlm.d(this.g, tlm.d(this.f, tlm.d(this.e, tlm.d(this.d, tlm.d(this.c, tlm.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }
}
