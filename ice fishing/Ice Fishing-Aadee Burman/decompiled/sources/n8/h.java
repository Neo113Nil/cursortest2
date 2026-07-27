package n8;

import com.google.android.gms.internal.ads.C3428jv;
import i8.n;
import i8.o;
import i8.v;
import java.util.ArrayList;
import m8.j;
import m8.q;
import q2.C4896n;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final q f39517a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39518b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39519c;

    /* renamed from: d, reason: collision with root package name */
    public final C3428jv f39520d;

    /* renamed from: e, reason: collision with root package name */
    public final C4896n f39521e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39522f;

    /* renamed from: g, reason: collision with root package name */
    public final int f39523g;

    /* renamed from: h, reason: collision with root package name */
    public final int f39524h;
    public int i;

    public h(q call, ArrayList arrayList, int i, C3428jv c3428jv, C4896n c4896n, int i6, int i9, int i10) {
        kotlin.jvm.internal.h.e(call, "call");
        this.f39517a = call;
        this.f39518b = arrayList;
        this.f39519c = i;
        this.f39520d = c3428jv;
        this.f39521e = c4896n;
        this.f39522f = i6;
        this.f39523g = i9;
        this.f39524h = i10;
    }

    public static h a(h hVar, int i, C3428jv c3428jv, C4896n c4896n, int i6) {
        if ((i6 & 1) != 0) {
            i = hVar.f39519c;
        }
        int i9 = i;
        if ((i6 & 2) != 0) {
            c3428jv = hVar.f39520d;
        }
        C3428jv c3428jv2 = c3428jv;
        if ((i6 & 4) != 0) {
            c4896n = hVar.f39521e;
        }
        C4896n request = c4896n;
        kotlin.jvm.internal.h.e(request, "request");
        return new h(hVar.f39517a, hVar.f39518b, i9, c3428jv2, request, hVar.f39522f, hVar.f39523g, hVar.f39524h);
    }

    public final v b(C4896n request) {
        kotlin.jvm.internal.h.e(request, "request");
        ArrayList arrayList = this.f39518b;
        int size = arrayList.size();
        int i = this.f39519c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        C3428jv c3428jv = this.f39520d;
        if (c3428jv != null) {
            if (!((j) c3428jv.f31348w).c().e((n) request.f40189u)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i6 = i + 1;
        h a9 = a(this, i6, null, request, 58);
        o oVar = (o) arrayList.get(i);
        v a10 = oVar.a(a9);
        if (a10 == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (c3428jv == null || i6 >= arrayList.size() || a9.i == 1) {
            return a10;
        }
        throw new IllegalStateException(("network interceptor " + oVar + " must call proceed() exactly once").toString());
    }
}
