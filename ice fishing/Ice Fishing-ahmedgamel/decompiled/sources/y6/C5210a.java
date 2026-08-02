package y6;

import com.google.android.gms.internal.ads.Wv;
import d7.InterfaceC4465a;
import f6.C4522a;
import f6.c;
import f6.g;
import g6.C4535a;
import g6.InterfaceC4536b;
import h6.C4579a;
import java.util.ArrayList;
import java.util.Comparator;
import k6.C4647a;
import k6.e;
import l6.i;
import n6.InterfaceC4782h;
import p7.C4853a;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5210a implements InterfaceC4465a {

    /* renamed from: a, reason: collision with root package name */
    public final C4853a f41899a;

    /* renamed from: b, reason: collision with root package name */
    public final Y6.a f41900b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41901c;

    /* renamed from: d, reason: collision with root package name */
    public final long f41902d;

    /* renamed from: e, reason: collision with root package name */
    public final C4647a f41903e;

    /* renamed from: f, reason: collision with root package name */
    public final i f41904f;

    /* renamed from: g, reason: collision with root package name */
    public final String f41905g;

    /* renamed from: h, reason: collision with root package name */
    public final int f41906h;
    public final C4522a i;

    /* renamed from: j, reason: collision with root package name */
    public final g f41907j;

    /* renamed from: k, reason: collision with root package name */
    public final String f41908k;

    public C5210a(C4853a c4853a, Y6.a aVar, long j6, long j9, C4647a c4647a, i iVar, String str, int i, C4522a c4522a, g gVar, String str2) {
        this.f41899a = c4853a;
        this.f41900b = aVar;
        this.f41901c = j6;
        this.f41902d = j9;
        this.f41903e = c4647a;
        this.f41904f = iVar;
        this.f41905g = str;
        this.f41906h = i;
        this.i = c4522a;
        this.f41907j = gVar;
        this.f41908k = str2;
    }

    @Override // d7.InterfaceC4465a, c7.InterfaceC0556a
    public final c a() {
        return this.i;
    }

    @Override // c7.InterfaceC0556a
    public final i b() {
        return this.f41904f;
    }

    @Override // c7.InterfaceC0556a
    public final g c() {
        return this.f41907j;
    }

    @Override // c7.InterfaceC0556a
    public final long d() {
        return this.f41902d;
    }

    @Override // c7.InterfaceC0556a
    public final int e() {
        return this.f41906h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5210a)) {
            return false;
        }
        C5210a c5210a = (C5210a) obj;
        if (!this.f41899a.equals(c5210a.f41899a) || !this.f41900b.equals(c5210a.f41900b) || this.f41901c != c5210a.f41901c || this.f41902d != c5210a.f41902d || !this.f41903e.equals(c5210a.f41903e) || !this.f41904f.equals(c5210a.f41904f)) {
            return false;
        }
        String str = c5210a.f41905g;
        String str2 = this.f41905g;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f41906h != c5210a.f41906h || !this.i.equals(c5210a.i)) {
            return false;
        }
        g gVar = c5210a.f41907j;
        g gVar2 = this.f41907j;
        if (gVar2 == null) {
            if (gVar != null) {
                return false;
            }
        } else if (!gVar2.equals(gVar)) {
            return false;
        }
        String str3 = c5210a.f41908k;
        String str4 = this.f41908k;
        return str4 == null ? str3 == null : str4.equals(str3);
    }

    @Override // c7.InterfaceC0556a
    public final String f() {
        return this.f41908k;
    }

    @Override // d7.InterfaceC4465a
    public final InterfaceC4536b g() {
        ArrayList arrayList = new ArrayList();
        C4522a c4522a = this.i;
        int i = 0;
        while (true) {
            Object[] objArr = c4522a.f38609n;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            e eVar = (e) obj;
            if (eVar != null && !eVar.f38613b.isEmpty() && obj2 != null) {
                C4579a c9 = C4579a.c(eVar);
                if (!c9.f38137b.isEmpty()) {
                    arrayList.add(c9);
                    arrayList.add(obj2);
                }
            }
            i += 2;
        }
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new C4535a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = C4535a.f37681w;
        for (int i4 = 0; i4 < array.length; i4 += 2) {
            C4579a c4579a = (C4579a) array[i4];
            if (c4579a != null && c4579a.f38137b.isEmpty()) {
                array[i4] = null;
            }
        }
        return new C4535a(array, C4535a.f37681w);
    }

    @Override // c7.InterfaceC0556a
    public final InterfaceC4782h h() {
        return this.f41903e;
    }

    public final int hashCode() {
        int hashCode = (((this.f41899a.hashCode() ^ 1000003) * 1000003) ^ this.f41900b.hashCode()) * 1000003;
        long j6 = this.f41901c;
        int i = (hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f41902d;
        int hashCode2 = (((((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f41903e.hashCode()) * 1000003) ^ this.f41904f.hashCode()) * 1000003;
        String str = this.f41905g;
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f41906h) * 1000003) ^ this.i.hashCode()) * 1000003;
        g gVar = this.f41907j;
        int hashCode4 = (hashCode3 ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        String str2 = this.f41908k;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // c7.InterfaceC0556a
    public final String i() {
        return this.f41905g;
    }

    @Override // c7.InterfaceC0556a
    public final long j() {
        return this.f41901c;
    }

    @Override // c7.InterfaceC0556a
    public final C4853a k() {
        return this.f41899a;
    }

    @Override // c7.InterfaceC0556a
    public final Y6.a l() {
        return this.f41900b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRecordDataImpl{resource=");
        sb.append(this.f41899a);
        sb.append(", instrumentationScopeInfo=");
        sb.append(this.f41900b);
        sb.append(", timestampEpochNanos=");
        sb.append(this.f41901c);
        sb.append(", observedTimestampEpochNanos=");
        sb.append(this.f41902d);
        sb.append(", spanContext=");
        sb.append(this.f41903e);
        sb.append(", severity=");
        sb.append(this.f41904f);
        sb.append(", severityText=");
        sb.append(this.f41905g);
        sb.append(", totalAttributeCount=");
        sb.append(this.f41906h);
        sb.append(", attributes=");
        sb.append(this.i);
        sb.append(", bodyValue=");
        sb.append(this.f41907j);
        sb.append(", eventName=");
        return Wv.i(sb, this.f41908k, "}");
    }
}
