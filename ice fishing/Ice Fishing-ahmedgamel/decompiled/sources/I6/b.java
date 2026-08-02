package I6;

import c6.n;
import java.util.List;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class b extends c6.f {

    /* renamed from: G, reason: collision with root package name */
    public static final a f1344G;

    /* renamed from: A, reason: collision with root package name */
    public final List f1345A;

    /* renamed from: B, reason: collision with root package name */
    public final int f1346B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1347C;

    /* renamed from: D, reason: collision with root package name */
    public final y8.h f1348D;

    /* renamed from: E, reason: collision with root package name */
    public final y8.h f1349E;

    /* renamed from: F, reason: collision with root package name */
    public final String f1350F;

    /* renamed from: v, reason: collision with root package name */
    public final long f1351v;

    /* renamed from: w, reason: collision with root package name */
    public final long f1352w;

    /* renamed from: x, reason: collision with root package name */
    public final h f1353x;

    /* renamed from: y, reason: collision with root package name */
    public final String f1354y;

    /* renamed from: z, reason: collision with root package name */
    public final H6.b f1355z;

    static {
        c6.d dVar = c6.d.f5754u;
        n nVar = n.f5794u;
        f1344G = new a(b.class);
    }

    public b(long j6, long j9, h hVar, String str, H6.b bVar, d6.d dVar, int i, int i4, y8.h hVar2, y8.h hVar3, String str2, y8.h hVar4) {
        super(f1344G, hVar4);
        this.f1351v = j6;
        this.f1352w = j9;
        if (hVar == null) {
            throw new IllegalArgumentException("severity_number == null");
        }
        this.f1353x = hVar;
        if (str == null) {
            throw new IllegalArgumentException("severity_text == null");
        }
        this.f1354y = str;
        this.f1355z = bVar;
        this.f1345A = A8.b.m("attributes", dVar);
        this.f1346B = i;
        this.f1347C = i4;
        if (hVar2 == null) {
            throw new IllegalArgumentException("trace_id == null");
        }
        this.f1348D = hVar2;
        if (hVar3 == null) {
            throw new IllegalArgumentException("span_id == null");
        }
        this.f1349E = hVar3;
        if (str2 == null) {
            throw new IllegalArgumentException("event_name == null");
        }
        this.f1350F = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && A8.b.i(Long.valueOf(this.f1351v), Long.valueOf(bVar.f1351v)) && A8.b.i(Long.valueOf(this.f1352w), Long.valueOf(bVar.f1352w)) && A8.b.i(this.f1353x, bVar.f1353x) && A8.b.i(this.f1354y, bVar.f1354y) && A8.b.i(this.f1355z, bVar.f1355z) && this.f1345A.equals(bVar.f1345A) && A8.b.i(Integer.valueOf(this.f1346B), Integer.valueOf(bVar.f1346B)) && A8.b.i(Integer.valueOf(this.f1347C), Integer.valueOf(bVar.f1347C)) && A8.b.i(this.f1348D, bVar.f1348D) && A8.b.i(this.f1349E, bVar.f1349E) && A8.b.i(this.f1350F, bVar.f1350F);
    }

    public final int hashCode() {
        int i = this.f5763u;
        if (i != 0) {
            return i;
        }
        int hashCode = (Long.hashCode(this.f1352w) + ((Long.hashCode(this.f1351v) + (a().hashCode() * 37)) * 37)) * 37;
        h hVar = this.f1353x;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37;
        String str = this.f1354y;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        H6.b bVar = this.f1355z;
        int hashCode4 = (Integer.hashCode(this.f1347C) + ((Integer.hashCode(this.f1346B) + ((this.f1345A.hashCode() + ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37)) * 37)) * 37;
        y8.h hVar2 = this.f1348D;
        int hashCode5 = (hashCode4 + (hVar2 != null ? hVar2.hashCode() : 0)) * 37;
        y8.h hVar3 = this.f1349E;
        int hashCode6 = (hashCode5 + (hVar3 != null ? hVar3.hashCode() : 0)) * 37;
        String str2 = this.f1350F;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.f5763u = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        StringBuilder b9 = AbstractC5050e.b(", time_unix_nano=");
        b9.append(this.f1351v);
        b9.append(", observed_time_unix_nano=");
        b9.append(this.f1352w);
        h hVar = this.f1353x;
        if (hVar != null) {
            b9.append(", severity_number=");
            b9.append(hVar);
        }
        String str = this.f1354y;
        if (str != null) {
            b9.append(", severity_text=");
            b9.append(A8.b.u(str));
        }
        H6.b bVar = this.f1355z;
        if (bVar != null) {
            b9.append(", body=");
            b9.append(bVar);
        }
        List list = this.f1345A;
        if (!list.isEmpty()) {
            b9.append(", attributes=");
            b9.append(list);
        }
        b9.append(", dropped_attributes_count=");
        b9.append(this.f1346B);
        b9.append(", flags=");
        b9.append(this.f1347C);
        y8.h hVar2 = this.f1348D;
        if (hVar2 != null) {
            b9.append(", trace_id=");
            b9.append(hVar2);
        }
        y8.h hVar3 = this.f1349E;
        if (hVar3 != null) {
            b9.append(", span_id=");
            b9.append(hVar3);
        }
        String str2 = this.f1350F;
        if (str2 != null) {
            b9.append(", event_name=");
            b9.append(A8.b.u(str2));
        }
        StringBuilder replace = b9.replace(0, 2, "LogRecord{");
        replace.append('}');
        return replace.toString();
    }
}
