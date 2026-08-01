package I6;

import c6.n;
import java.util.List;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class b extends c6.f {

    /* renamed from: G, reason: collision with root package name */
    public static final a f1314G;

    /* renamed from: A, reason: collision with root package name */
    public final List f1315A;

    /* renamed from: B, reason: collision with root package name */
    public final int f1316B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1317C;

    /* renamed from: D, reason: collision with root package name */
    public final y8.h f1318D;

    /* renamed from: E, reason: collision with root package name */
    public final y8.h f1319E;

    /* renamed from: F, reason: collision with root package name */
    public final String f1320F;

    /* renamed from: v, reason: collision with root package name */
    public final long f1321v;

    /* renamed from: w, reason: collision with root package name */
    public final long f1322w;

    /* renamed from: x, reason: collision with root package name */
    public final h f1323x;

    /* renamed from: y, reason: collision with root package name */
    public final String f1324y;

    /* renamed from: z, reason: collision with root package name */
    public final H6.b f1325z;

    static {
        c6.d dVar = c6.d.f5578u;
        n nVar = n.f5618u;
        f1314G = new a(b.class);
    }

    public b(long j6, long j9, h hVar, String str, H6.b bVar, d6.d dVar, int i, int i6, y8.h hVar2, y8.h hVar3, String str2, y8.h hVar4) {
        super(f1314G, hVar4);
        this.f1321v = j6;
        this.f1322w = j9;
        if (hVar == null) {
            throw new IllegalArgumentException("severity_number == null");
        }
        this.f1323x = hVar;
        if (str == null) {
            throw new IllegalArgumentException("severity_text == null");
        }
        this.f1324y = str;
        this.f1325z = bVar;
        this.f1315A = V2.a.o("attributes", dVar);
        this.f1316B = i;
        this.f1317C = i6;
        if (hVar2 == null) {
            throw new IllegalArgumentException("trace_id == null");
        }
        this.f1318D = hVar2;
        if (hVar3 == null) {
            throw new IllegalArgumentException("span_id == null");
        }
        this.f1319E = hVar3;
        if (str2 == null) {
            throw new IllegalArgumentException("event_name == null");
        }
        this.f1320F = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && V2.a.i(Long.valueOf(this.f1321v), Long.valueOf(bVar.f1321v)) && V2.a.i(Long.valueOf(this.f1322w), Long.valueOf(bVar.f1322w)) && V2.a.i(this.f1323x, bVar.f1323x) && V2.a.i(this.f1324y, bVar.f1324y) && V2.a.i(this.f1325z, bVar.f1325z) && this.f1315A.equals(bVar.f1315A) && V2.a.i(Integer.valueOf(this.f1316B), Integer.valueOf(bVar.f1316B)) && V2.a.i(Integer.valueOf(this.f1317C), Integer.valueOf(bVar.f1317C)) && V2.a.i(this.f1318D, bVar.f1318D) && V2.a.i(this.f1319E, bVar.f1319E) && V2.a.i(this.f1320F, bVar.f1320F);
    }

    public final int hashCode() {
        int i = this.f5587u;
        if (i != 0) {
            return i;
        }
        int hashCode = (Long.hashCode(this.f1322w) + ((Long.hashCode(this.f1321v) + (a().hashCode() * 37)) * 37)) * 37;
        h hVar = this.f1323x;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37;
        String str = this.f1324y;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        H6.b bVar = this.f1325z;
        int hashCode4 = (Integer.hashCode(this.f1317C) + ((Integer.hashCode(this.f1316B) + ((this.f1315A.hashCode() + ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37)) * 37)) * 37;
        y8.h hVar2 = this.f1318D;
        int hashCode5 = (hashCode4 + (hVar2 != null ? hVar2.hashCode() : 0)) * 37;
        y8.h hVar3 = this.f1319E;
        int hashCode6 = (hashCode5 + (hVar3 != null ? hVar3.hashCode() : 0)) * 37;
        String str2 = this.f1320F;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.f5587u = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        StringBuilder b9 = AbstractC5049e.b(", time_unix_nano=");
        b9.append(this.f1321v);
        b9.append(", observed_time_unix_nano=");
        b9.append(this.f1322w);
        h hVar = this.f1323x;
        if (hVar != null) {
            b9.append(", severity_number=");
            b9.append(hVar);
        }
        String str = this.f1324y;
        if (str != null) {
            b9.append(", severity_text=");
            b9.append(V2.a.t(str));
        }
        H6.b bVar = this.f1325z;
        if (bVar != null) {
            b9.append(", body=");
            b9.append(bVar);
        }
        List list = this.f1315A;
        if (!list.isEmpty()) {
            b9.append(", attributes=");
            b9.append(list);
        }
        b9.append(", dropped_attributes_count=");
        b9.append(this.f1316B);
        b9.append(", flags=");
        b9.append(this.f1317C);
        y8.h hVar2 = this.f1318D;
        if (hVar2 != null) {
            b9.append(", trace_id=");
            b9.append(hVar2);
        }
        y8.h hVar3 = this.f1319E;
        if (hVar3 != null) {
            b9.append(", span_id=");
            b9.append(hVar3);
        }
        String str2 = this.f1320F;
        if (str2 != null) {
            b9.append(", event_name=");
            b9.append(V2.a.t(str2));
        }
        StringBuilder replace = b9.replace(0, 2, "LogRecord{");
        replace.append('}');
        return replace.toString();
    }
}
