package defpackage;

import java.util.UUID;

/* loaded from: classes6.dex */
public final class ton0 {
    public final UUID a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public ton0(UUID uuid, int i, int i2, int i3, long j) {
        this.a = uuid;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.e;
    }

    public final int d() {
        return this.d;
    }

    public final UUID e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ton0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            ton0 ton0Var = (ton0) obj;
            return jl40.l(this.a, ton0Var.a) && this.b == ton0Var.b && this.c == ton0Var.c;
        }
        ny61.t("null cannot be cast to non-null type com.yandex.go.scooters.ignition.data.model.ScootersIgnitionBeacon");
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.c);
        UUID uuid = this.a;
        return valueOf2.hashCode() + ((valueOf.hashCode() + ((uuid != null ? uuid.hashCode() : 0) * 31)) * 31);
    }

    public /* synthetic */ ton0(UUID uuid, int i, int i2) {
        this(uuid, i, i2, -100, -1L);
    }
}
