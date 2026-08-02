package defpackage;

import android.net.NetworkRequest;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fa6 {
    public static final fa6 j = new fa6();
    public final g2j a;
    public final f1j b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public fa6(fa6 fa6Var) {
        fa6Var.getClass();
        this.c = fa6Var.c;
        this.d = fa6Var.d;
        this.b = fa6Var.b;
        this.a = fa6Var.a;
        this.e = fa6Var.e;
        this.f = fa6Var.f;
        this.i = fa6Var.i;
        this.g = fa6Var.g;
        this.h = fa6Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !fa6.class.equals(obj.getClass())) {
            return false;
        }
        fa6 fa6Var = (fa6) obj;
        if (this.c == fa6Var.c && this.d == fa6Var.d && this.e == fa6Var.e && this.f == fa6Var.f && this.g == fa6Var.g && this.h == fa6Var.h && Intrinsics.d(a(), fa6Var.a()) && this.a == fa6Var.a) {
            return Intrinsics.d(this.i, fa6Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int f = su4.f(this.i, (i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31);
        NetworkRequest a = a();
        return f + (a != null ? a.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public fa6(f1j f1jVar, g2j g2jVar, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        set.getClass();
        this.b = f1jVar;
        this.a = g2jVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public fa6() {
        g2j g2jVar = g2j.a;
        q5b q5bVar = q5b.a;
        q5bVar.getClass();
        this.b = new f1j(null);
        this.a = g2jVar;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = q5bVar;
    }
}
