package com.anythink.basead.exoplayer.j.a;

import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.C0544a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final int f8227c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8228d = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final int f8229a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8230b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8233g;

    /* renamed from: f, reason: collision with root package name */
    private l f8232f = l.f8250b;

    /* renamed from: e, reason: collision with root package name */
    private final TreeSet<n> f8231e = new TreeSet<>();

    public g(int i, String str) {
        this.f8229a = i;
        this.f8230b = str;
    }

    public static g a(int i, DataInputStream dataInputStream) {
        g gVar = new g(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i >= 2) {
            gVar.f8232f = l.a(dataInputStream);
            return gVar;
        }
        long readLong = dataInputStream.readLong();
        k kVar = new k();
        j.a(kVar, readLong);
        gVar.a(kVar);
        return gVar;
    }

    public final boolean b() {
        return this.f8233g;
    }

    public final TreeSet<n> c() {
        return this.f8231e;
    }

    public final boolean d() {
        return this.f8231e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f8229a == gVar.f8229a && this.f8230b.equals(gVar.f8230b) && this.f8231e.equals(gVar.f8231e) && this.f8232f.equals(gVar.f8232f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8231e.hashCode() + (a(f8228d) * 31);
    }

    public final n b(n nVar) {
        C0544a.b(this.f8231e.remove(nVar));
        n a9 = nVar.a(this.f8229a);
        if (nVar.f8221e.renameTo(a9.f8221e)) {
            this.f8231e.add(a9);
            return a9;
        }
        throw new a.C0033a("Renaming of " + nVar.f8221e + " to " + a9.f8221e + " failed.");
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f8229a);
        dataOutputStream.writeUTF(this.f8230b);
        this.f8232f.a(dataOutputStream);
    }

    public final i a() {
        return this.f8232f;
    }

    public final boolean a(k kVar) {
        l lVar = this.f8232f;
        l a9 = lVar.a(kVar);
        this.f8232f = a9;
        return !a9.equals(lVar);
    }

    public final void a(boolean z8) {
        this.f8233g = z8;
    }

    public final void a(n nVar) {
        this.f8231e.add(nVar);
    }

    public final n a(long j9) {
        n a9 = n.a(this.f8230b, j9);
        n floor = this.f8231e.floor(a9);
        if (floor != null && floor.f8218b + floor.f8219c > j9) {
            return floor;
        }
        n ceiling = this.f8231e.ceiling(a9);
        if (ceiling == null) {
            return n.b(this.f8230b, j9);
        }
        return n.a(this.f8230b, j9, ceiling.f8218b - j9);
    }

    public final long a(long j9, long j10) {
        n a9 = a(j9);
        if (a9.b()) {
            return -Math.min(a9.a() ? Long.MAX_VALUE : a9.f8219c, j10);
        }
        long j11 = j9 + j10;
        long j12 = a9.f8218b + a9.f8219c;
        if (j12 < j11) {
            for (n nVar : this.f8231e.tailSet(a9, false)) {
                long j13 = nVar.f8218b;
                if (j13 > j12) {
                    break;
                }
                j12 = Math.max(j12, j13 + nVar.f8219c);
                if (j12 >= j11) {
                    break;
                }
            }
        }
        return Math.min(j12 - j9, j10);
    }

    public final boolean a(e eVar) {
        if (!this.f8231e.remove(eVar)) {
            return false;
        }
        eVar.f8221e.delete();
        return true;
    }

    public final int a(int i) {
        int hashCode = this.f8230b.hashCode() + (this.f8229a * 31);
        if (i < 2) {
            long a9 = j.a(this.f8232f);
            return (hashCode * 31) + ((int) (a9 ^ (a9 >>> 32)));
        }
        return this.f8232f.hashCode() + (hashCode * 31);
    }
}
