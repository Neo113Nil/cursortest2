package O1;

import J1.p;
import J1.v;
import J1.y;
import N1.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final i f1238a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1239b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1240c;

    /* renamed from: d, reason: collision with root package name */
    public final N1.e f1241d;

    /* renamed from: e, reason: collision with root package name */
    public final v f1242e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1243f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1244g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1245h;

    /* renamed from: i, reason: collision with root package name */
    public int f1246i;

    public g(i call, ArrayList arrayList, int i2, N1.e eVar, v request, int i3, int i4, int i5) {
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(request, "request");
        this.f1238a = call;
        this.f1239b = arrayList;
        this.f1240c = i2;
        this.f1241d = eVar;
        this.f1242e = request;
        this.f1243f = i3;
        this.f1244g = i4;
        this.f1245h = i5;
    }

    public static g a(g gVar, int i2, N1.e eVar, v vVar, int i3) {
        if ((i3 & 1) != 0) {
            i2 = gVar.f1240c;
        }
        int i4 = i2;
        if ((i3 & 2) != 0) {
            eVar = gVar.f1241d;
        }
        N1.e eVar2 = eVar;
        if ((i3 & 4) != 0) {
            vVar = gVar.f1242e;
        }
        v request = vVar;
        int i5 = gVar.f1243f;
        int i6 = gVar.f1244g;
        int i7 = gVar.f1245h;
        gVar.getClass();
        kotlin.jvm.internal.i.e(request, "request");
        return new g(gVar.f1238a, gVar.f1239b, i4, eVar2, request, i5, i6, i7);
    }

    public final y b(v request) {
        kotlin.jvm.internal.i.e(request, "request");
        ArrayList arrayList = this.f1239b;
        int size = arrayList.size();
        int i2 = this.f1240c;
        if (i2 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f1246i++;
        N1.e eVar = this.f1241d;
        if (eVar != null) {
            if (!((N1.f) eVar.f1169c).b(request.f977a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port").toString());
            }
            if (this.f1246i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i3 = i2 + 1;
        g a2 = a(this, i3, null, request, 58);
        p pVar = (p) arrayList.get(i2);
        y a3 = pVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (eVar != null && i3 < arrayList.size() && a2.f1246i != 1) {
            throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
        }
        if (a3.f1006g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
    }
}
