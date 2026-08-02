package com.anythink.basead.exoplayer.j.a;

import com.anythink.basead.exoplayer.j.a.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final int f8856c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8857d = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final int f8858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8859b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8862g;

    /* renamed from: f, reason: collision with root package name */
    private l f8861f = l.f8879b;

    /* renamed from: e, reason: collision with root package name */
    private final TreeSet<n> f8860e = new TreeSet<>();

    public g(int i, String str) {
        this.f8858a = i;
        this.f8859b = str;
    }

    public static g a(int i, DataInputStream dataInputStream) {
        g gVar = new g(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i >= 2) {
            gVar.f8861f = l.a(dataInputStream);
            return gVar;
        }
        long readLong = dataInputStream.readLong();
        k kVar = new k();
        j.a(kVar, readLong);
        gVar.a(kVar);
        return gVar;
    }

    public final boolean b() {
        return this.f8862g;
    }

    public final TreeSet<n> c() {
        return this.f8860e;
    }

    public final boolean d() {
        return this.f8860e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f8858a == gVar.f8858a && this.f8859b.equals(gVar.f8859b) && this.f8860e.equals(gVar.f8860e) && this.f8861f.equals(gVar.f8861f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8860e.hashCode() + (a(f8857d) * 31);
    }

    public final n b(n nVar) {
        com.anythink.basead.exoplayer.k.a.b(this.f8860e.remove(nVar));
        n a9 = nVar.a(this.f8858a);
        if (nVar.f8850e.renameTo(a9.f8850e)) {
            this.f8860e.add(a9);
            return a9;
        }
        throw new a.C0034a("Renaming of " + nVar.f8850e + " to " + a9.f8850e + " failed.");
    }

    public final void a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f8858a);
        dataOutputStream.writeUTF(this.f8859b);
        this.f8861f.a(dataOutputStream);
    }

    public final i a() {
        return this.f8861f;
    }

    public final boolean a(k kVar) {
        l lVar = this.f8861f;
        l a9 = lVar.a(kVar);
        this.f8861f = a9;
        return !a9.equals(lVar);
    }

    public final void a(boolean z6) {
        this.f8862g = z6;
    }

    public final void a(n nVar) {
        this.f8860e.add(nVar);
    }

    public final n a(long j6) {
        n a9 = n.a(this.f8859b, j6);
        n floor = this.f8860e.floor(a9);
        if (floor != null && floor.f8847b + floor.f8848c > j6) {
            return floor;
        }
        n ceiling = this.f8860e.ceiling(a9);
        if (ceiling == null) {
            return n.b(this.f8859b, j6);
        }
        return n.a(this.f8859b, j6, ceiling.f8847b - j6);
    }

    public final long a(long j6, long j9) {
        n a9 = a(j6);
        if (a9.b()) {
            return -Math.min(a9.a() ? Long.MAX_VALUE : a9.f8848c, j9);
        }
        long j10 = j6 + j9;
        long j11 = a9.f8847b + a9.f8848c;
        if (j11 < j10) {
            for (n nVar : this.f8860e.tailSet(a9, false)) {
                long j12 = nVar.f8847b;
                if (j12 > j11) {
                    break;
                }
                j11 = Math.max(j11, j12 + nVar.f8848c);
                if (j11 >= j10) {
                    break;
                }
            }
        }
        return Math.min(j11 - j6, j9);
    }

    public final boolean a(e eVar) {
        if (!this.f8860e.remove(eVar)) {
            return false;
        }
        eVar.f8850e.delete();
        return true;
    }

    public final int a(int i) {
        int hashCode = this.f8859b.hashCode() + (this.f8858a * 31);
        if (i < 2) {
            long a9 = j.a(this.f8861f);
            return (hashCode * 31) + ((int) (a9 ^ (a9 >>> 32)));
        }
        return this.f8861f.hashCode() + (hashCode * 31);
    }
}
