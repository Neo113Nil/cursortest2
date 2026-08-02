package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y08 {
    public static final y08 e;
    public final p08 a;
    public final int b;
    public final svh c;
    public final enp d;

    static {
        p08 p08Var = p08.e;
        p08Var.getClass();
        e = new y08(p08Var, 0, null, null);
    }

    public y08(p08 p08Var, int i, svh svhVar, enp enpVar) {
        p08Var.getClass();
        this.a = p08Var;
        this.b = i;
        this.c = svhVar;
        this.d = enpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y08)) {
            return false;
        }
        y08 y08Var = (y08) obj;
        return Intrinsics.d(this.a, y08Var.a) && this.b == y08Var.b && Intrinsics.d(this.c, y08Var.c) && Intrinsics.d(this.d, y08Var.d);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, this.a.hashCode() * 31, 31);
        svh svhVar = this.c;
        int hashCode = (a + (svhVar == null ? 0 : svhVar.hashCode())) * 31;
        enp enpVar = this.d;
        return hashCode + (enpVar != null ? enpVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceInfoWithVolume(deviceInfo=" + this.a + ", deviceVolume=" + this.b + ", volumeProviderAttachable=" + this.c + ", volumeController=" + this.d + ")";
    }
}
