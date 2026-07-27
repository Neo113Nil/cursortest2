package com.anythink.basead.exoplayer.j.a;

import com.anythink.basead.exoplayer.j.a.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final int f8070c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8071d = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final int f8072a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8073b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8076g;

    /* renamed from: f, reason: collision with root package name */
    private l f8075f = l.f8093b;

    /* renamed from: e, reason: collision with root package name */
    private final TreeSet<n> f8074e = new TreeSet<>();

    public g(int i, String str) {
        this.f8072a = i;
        this.f8073b = str;
    }

    public static g a(int i, DataInputStream dataInputStream) {
        g gVar = new g(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i >= 2) {
            gVar.f8075f = l.a(dataInputStream);
            return gVar;
        }
        long readLong = dataInputStream.readLong();
        k kVar = new k();
        j.a(kVar, readLong);
        gVar.a(kVar);
        return gVar;
    }

    public final boolean b() {
        return this.f8076g;
    }

    public final TreeSet<n> c() {
        return this.f8074e;
    }

    public final boolean d() {
        return this.f8074e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f8072a == gVar.f8072a && this.f8073b.equals(gVar.f8073b) && this.f8074e.equals(gVar.f8074e) && this.f8075f.equals(gVar.f8075f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8074e.hashCode() + (a(f8071d) * 31);
    }

    public final n b(n nVar) {
        com.anythink.basead.exoplayer.k.a.b(this.f8074e.remove(nVar));
        n a9 = nVar.a(this.f8072a);
        if (nVar.f8064e.renameTo(a9.f8064e)) {
            this.f8074e.add(a9);
            return a9;
        }
        throw new a.C0034a("Renaming of " + nVar.f8064e + " to " + a9.f8064e + " failed.");
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f8072a);
        dataOutputStream.writeUTF(this.f8073b);
        this.f8075f.a(dataOutputStream);
    }

    public final i a() {
        return this.f8075f;
    }

    public final boolean a(k kVar) {
        l lVar = this.f8075f;
        l a9 = lVar.a(kVar);
        this.f8075f = a9;
        return !a9.equals(lVar);
    }

    public final void a(boolean z3) {
        this.f8076g = z3;
    }

    public final void a(n nVar) {
        this.f8074e.add(nVar);
    }

    public final n a(long j6) {
        n a9 = n.a(this.f8073b, j6);
        n floor = this.f8074e.floor(a9);
        if (floor != null && floor.f8061b + floor.f8062c > j6) {
            return floor;
        }
        n ceiling = this.f8074e.ceiling(a9);
        if (ceiling == null) {
            return n.b(this.f8073b, j6);
        }
        return n.a(this.f8073b, j6, ceiling.f8061b - j6);
    }

    public final long a(long j6, long j9) {
        n a9 = a(j6);
        if (a9.b()) {
            return -Math.min(a9.a() ? Long.MAX_VALUE : a9.f8062c, j9);
        }
        long j10 = j6 + j9;
        long j11 = a9.f8061b + a9.f8062c;
        if (j11 < j10) {
            for (n nVar : this.f8074e.tailSet(a9, false)) {
                long j12 = nVar.f8061b;
                if (j12 > j11) {
                    break;
                }
                j11 = Math.max(j11, j12 + nVar.f8062c);
                if (j11 >= j10) {
                    break;
                }
            }
        }
        return Math.min(j11 - j6, j9);
    }

    public final boolean a(e eVar) {
        if (!this.f8074e.remove(eVar)) {
            return false;
        }
        eVar.f8064e.delete();
        return true;
    }

    public final int a(int i) {
        int hashCode = this.f8073b.hashCode() + (this.f8072a * 31);
        if (i < 2) {
            long a9 = j.a(this.f8075f);
            return (hashCode * 31) + ((int) (a9 ^ (a9 >>> 32)));
        }
        return this.f8075f.hashCode() + (hashCode * 31);
    }
}
