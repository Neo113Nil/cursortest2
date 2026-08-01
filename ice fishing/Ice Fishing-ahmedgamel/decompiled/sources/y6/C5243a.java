package y6;

import d7.InterfaceC4454a;
import f6.C4512a;
import f6.c;
import f6.g;
import g6.C4531a;
import g6.InterfaceC4532b;
import h6.C4574a;
import java.util.ArrayList;
import java.util.Comparator;
import k6.C4636a;
import k6.e;
import l6.i;
import n6.InterfaceC4766h;
import p7.C4853a;
import u1.h;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5243a implements InterfaceC4454a {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f41928a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f41929b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41930c;

    /* renamed from: d, reason: collision with root package name */
    public final long f41931d;

    /* renamed from: e, reason: collision with root package name */
    public final C4636a f41932e;

    /* renamed from: f, reason: collision with root package name */
    public final i f41933f;

    /* renamed from: g, reason: collision with root package name */
    public final String f41934g;

    /* renamed from: h, reason: collision with root package name */
    public final int f41935h;
    public final C4512a i;

    /* renamed from: j, reason: collision with root package name */
    public final g f41936j;

    /* renamed from: k, reason: collision with root package name */
    public final String f41937k;

    public C5243a(C4853a c4853a, Y6.a aVar, long j6, long j9, C4636a c4636a, i iVar, String str, int i, C4512a c4512a, g gVar, String str2) {
        this.f41928a = c4853a;
        this.f41929b = aVar;
        this.f41930c = j6;
        this.f41931d = j9;
        this.f41932e = c4636a;
        this.f41933f = iVar;
        this.f41934g = str;
        this.f41935h = i;
        this.i = c4512a;
        this.f41936j = gVar;
        this.f41937k = str2;
    }

    @Override // d7.InterfaceC4454a, c7.InterfaceC0545a
    public final c a() {
        return this.i;
    }

    @Override // c7.InterfaceC0545a
    public final i b() {
        return this.f41933f;
    }

    @Override // c7.InterfaceC0545a
    public final g c() {
        return this.f41936j;
    }

    @Override // c7.InterfaceC0545a
    public final long d() {
        return this.f41931d;
    }

    @Override // c7.InterfaceC0545a
    public final int e() {
        return this.f41935h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5243a)) {
            return false;
        }
        C5243a c5243a = (C5243a) obj;
        if (!this.f41928a.equals(c5243a.f41928a) || !this.f41929b.equals(c5243a.f41929b) || this.f41930c != c5243a.f41930c || this.f41931d != c5243a.f41931d || !this.f41932e.equals(c5243a.f41932e) || !this.f41933f.equals(c5243a.f41933f)) {
            return false;
        }
        String str = c5243a.f41934g;
        String str2 = this.f41934g;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f41935h != c5243a.f41935h || !this.i.equals(c5243a.i)) {
            return false;
        }
        g gVar = c5243a.f41936j;
        g gVar2 = this.f41936j;
        if (gVar2 == null) {
            if (gVar != null) {
                return false;
            }
        } else if (!gVar2.equals(gVar)) {
            return false;
        }
        String str3 = c5243a.f41937k;
        String str4 = this.f41937k;
        return str4 == null ? str3 == null : str4.equals(str3);
    }

    @Override // c7.InterfaceC0545a
    public final String f() {
        return this.f41937k;
    }

    @Override // d7.InterfaceC4454a
    public final InterfaceC4532b g() {
        ArrayList arrayList = new ArrayList();
        C4512a c4512a = this.i;
        int i = 0;
        while (true) {
            Object[] objArr = c4512a.f38682n;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            e eVar = (e) obj;
            if (eVar != null && !eVar.f38686b.isEmpty() && obj2 != null) {
                C4574a c9 = C4574a.c(eVar);
                if (!c9.f38020b.isEmpty()) {
                    arrayList.add(c9);
                    arrayList.add(obj2);
                }
            }
            i += 2;
        }
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C4531a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C4531a.f37656w;
        for (int i6 = 0; i6 < array.length; i6 += 2) {
            C4574a c4574a = (C4574a) array[i6];
            if (c4574a != null && c4574a.f38020b.isEmpty()) {
                array[i6] = null;
            }
        }
        return new C4531a(array, C4531a.f37656w);
    }

    @Override // c7.InterfaceC0545a
    public final InterfaceC4766h h() {
        return this.f41932e;
    }

    public final int hashCode() {
        int hashCode = (((this.f41928a.hashCode() ^ 1000003) * 1000003) ^ this.f41929b.hashCode()) * 1000003;
        long j6 = this.f41930c;
        int i = (hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f41931d;
        int hashCode2 = (((((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f41932e.hashCode()) * 1000003) ^ this.f41933f.hashCode()) * 1000003;
        String str = this.f41934g;
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f41935h) * 1000003) ^ this.i.hashCode()) * 1000003;
        g gVar = this.f41936j;
        int hashCode4 = (hashCode3 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        String str2 = this.f41937k;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // c7.InterfaceC0545a
    public final String i() {
        return this.f41934g;
    }

    @Override // c7.InterfaceC0545a
    public final long j() {
        return this.f41930c;
    }

    @Override // c7.InterfaceC0545a
    public final C4853a k() {
        return this.f41928a;
    }

    @Override // c7.InterfaceC0545a
    public final Y6.a l() {
        return this.f41929b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRecordDataImpl{resource=");
        sb.append(this.f41928a);
        sb.append(", instrumentationScopeInfo=");
        sb.append(this.f41929b);
        sb.append(", timestampEpochNanos=");
        sb.append(this.f41930c);
        sb.append(", observedTimestampEpochNanos=");
        sb.append(this.f41931d);
        sb.append(", spanContext=");
        sb.append(this.f41932e);
        sb.append(", severity=");
        sb.append(this.f41933f);
        sb.append(", severityText=");
        sb.append(this.f41934g);
        sb.append(", totalAttributeCount=");
        sb.append(this.f41935h);
        sb.append(", attributes=");
        sb.append(this.i);
        sb.append(", bodyValue=");
        sb.append(this.f41936j);
        sb.append(", eventName=");
        return h.g(sb, this.f41937k, "}");
    }
}
