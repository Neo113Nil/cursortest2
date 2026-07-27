package u6;

import b6.C0530a;
import b6.c;
import b6.g;
import c6.C0542a;
import c6.InterfaceC0543b;
import d6.C4460a;
import g6.C4531a;
import g6.e;
import h6.i;
import j6.InterfaceC4606h;
import java.util.ArrayList;
import java.util.Comparator;
import l7.C4707a;
import t0.AbstractC5051n;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5114a implements Z6.a {

    /* renamed from: a, reason: collision with root package name */
    public final C4707a f41252a;

    /* renamed from: b, reason: collision with root package name */
    public final U6.a f41253b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41254c;

    /* renamed from: d, reason: collision with root package name */
    public final long f41255d;

    /* renamed from: e, reason: collision with root package name */
    public final C4531a f41256e;

    /* renamed from: f, reason: collision with root package name */
    public final i f41257f;

    /* renamed from: g, reason: collision with root package name */
    public final String f41258g;

    /* renamed from: h, reason: collision with root package name */
    public final int f41259h;
    public final C0530a i;

    /* renamed from: j, reason: collision with root package name */
    public final g f41260j;

    /* renamed from: k, reason: collision with root package name */
    public final String f41261k;

    public C5114a(C4707a c4707a, U6.a aVar, long j9, long j10, C4531a c4531a, i iVar, String str, int i, C0530a c0530a, g gVar, String str2) {
        this.f41252a = c4707a;
        this.f41253b = aVar;
        this.f41254c = j9;
        this.f41255d = j10;
        this.f41256e = c4531a;
        this.f41257f = iVar;
        this.f41258g = str;
        this.f41259h = i;
        this.i = c0530a;
        this.f41260j = gVar;
        this.f41261k = str2;
    }

    @Override // Z6.a, Y6.a
    public final c a() {
        return this.i;
    }

    @Override // Y6.a
    public final i b() {
        return this.f41257f;
    }

    @Override // Y6.a
    public final g c() {
        return this.f41260j;
    }

    @Override // Y6.a
    public final long d() {
        return this.f41255d;
    }

    @Override // Y6.a
    public final int e() {
        return this.f41259h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5114a)) {
            return false;
        }
        C5114a c5114a = (C5114a) obj;
        if (!this.f41252a.equals(c5114a.f41252a) || !this.f41253b.equals(c5114a.f41253b) || this.f41254c != c5114a.f41254c || this.f41255d != c5114a.f41255d || !this.f41256e.equals(c5114a.f41256e) || !this.f41257f.equals(c5114a.f41257f)) {
            return false;
        }
        String str = c5114a.f41258g;
        String str2 = this.f41258g;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f41259h != c5114a.f41259h || !this.i.equals(c5114a.i)) {
            return false;
        }
        g gVar = c5114a.f41260j;
        g gVar2 = this.f41260j;
        if (gVar2 == null) {
            if (gVar != null) {
                return false;
            }
        } else if (!gVar2.equals(gVar)) {
            return false;
        }
        String str3 = c5114a.f41261k;
        String str4 = this.f41261k;
        return str4 == null ? str3 == null : str4.equals(str3);
    }

    @Override // Y6.a
    public final String f() {
        return this.f41261k;
    }

    @Override // Z6.a
    public final InterfaceC0543b g() {
        ArrayList arrayList = new ArrayList();
        C0530a c0530a = this.i;
        int i = 0;
        while (true) {
            Object[] objArr = c0530a.f37928n;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            e eVar = (e) obj;
            if (eVar != null && !eVar.f37932b.isEmpty() && obj2 != null) {
                C4460a c4 = C4460a.c(eVar);
                if (!c4.f37203b.isEmpty()) {
                    arrayList.add(c4);
                    arrayList.add(obj2);
                }
            }
            i += 2;
        }
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C0542a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C0542a.f5711w;
        for (int i4 = 0; i4 < array.length; i4 += 2) {
            C4460a c4460a = (C4460a) array[i4];
            if (c4460a != null && c4460a.f37203b.isEmpty()) {
                array[i4] = null;
            }
        }
        return new C0542a(array, C0542a.f5711w);
    }

    @Override // Y6.a
    public final InterfaceC4606h h() {
        return this.f41256e;
    }

    public final int hashCode() {
        int hashCode = (((this.f41252a.hashCode() ^ 1000003) * 1000003) ^ this.f41253b.hashCode()) * 1000003;
        long j9 = this.f41254c;
        int i = (hashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f41255d;
        int hashCode2 = (((((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f41256e.hashCode()) * 1000003) ^ this.f41257f.hashCode()) * 1000003;
        String str = this.f41258g;
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f41259h) * 1000003) ^ this.i.hashCode()) * 1000003;
        g gVar = this.f41260j;
        int hashCode4 = (hashCode3 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        String str2 = this.f41261k;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // Y6.a
    public final String i() {
        return this.f41258g;
    }

    @Override // Y6.a
    public final long j() {
        return this.f41254c;
    }

    @Override // Y6.a
    public final C4707a k() {
        return this.f41252a;
    }

    @Override // Y6.a
    public final U6.a l() {
        return this.f41253b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRecordDataImpl{resource=");
        sb.append(this.f41252a);
        sb.append(", instrumentationScopeInfo=");
        sb.append(this.f41253b);
        sb.append(", timestampEpochNanos=");
        sb.append(this.f41254c);
        sb.append(", observedTimestampEpochNanos=");
        sb.append(this.f41255d);
        sb.append(", spanContext=");
        sb.append(this.f41256e);
        sb.append(", severity=");
        sb.append(this.f41257f);
        sb.append(", severityText=");
        sb.append(this.f41258g);
        sb.append(", totalAttributeCount=");
        sb.append(this.f41259h);
        sb.append(", attributes=");
        sb.append(this.i);
        sb.append(", bodyValue=");
        sb.append(this.f41260j);
        sb.append(", eventName=");
        return AbstractC5051n.g(sb, this.f41261k, "}");
    }
}
