package n8;

import com.google.android.gms.internal.ads.C3451jv;
import i8.n;
import i8.o;
import i8.v;
import java.util.ArrayList;
import m8.p;
import s2.C4945n;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f39684a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39686c;

    /* renamed from: d, reason: collision with root package name */
    public final C3451jv f39687d;

    /* renamed from: e, reason: collision with root package name */
    public final C4945n f39688e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39689f;

    /* renamed from: g, reason: collision with root package name */
    public final int f39690g;

    /* renamed from: h, reason: collision with root package name */
    public final int f39691h;
    public int i;

    public h(p call, ArrayList arrayList, int i, C3451jv c3451jv, C4945n c4945n, int i4, int i6, int i9) {
        kotlin.jvm.internal.h.e(call, "call");
        this.f39684a = call;
        this.f39685b = arrayList;
        this.f39686c = i;
        this.f39687d = c3451jv;
        this.f39688e = c4945n;
        this.f39689f = i4;
        this.f39690g = i6;
        this.f39691h = i9;
    }

    public static h a(h hVar, int i, C3451jv c3451jv, C4945n c4945n, int i4) {
        if ((i4 & 1) != 0) {
            i = hVar.f39686c;
        }
        int i6 = i;
        if ((i4 & 2) != 0) {
            c3451jv = hVar.f39687d;
        }
        C3451jv c3451jv2 = c3451jv;
        if ((i4 & 4) != 0) {
            c4945n = hVar.f39688e;
        }
        C4945n request = c4945n;
        kotlin.jvm.internal.h.e(request, "request");
        return new h(hVar.f39684a, hVar.f39685b, i6, c3451jv2, request, hVar.f39689f, hVar.f39690g, hVar.f39691h);
    }

    public final v b(C4945n request) {
        kotlin.jvm.internal.h.e(request, "request");
        ArrayList arrayList = this.f39685b;
        int size = arrayList.size();
        int i = this.f39686c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        C3451jv c3451jv = this.f39687d;
        if (c3451jv != null) {
            if (!((m8.i) c3451jv.f32127w).b().d((n) request.f40491u)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i4 = i + 1;
        h a9 = a(this, i4, null, request, 58);
        o oVar = (o) arrayList.get(i);
        v a10 = oVar.a(a9);
        if (a10 == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (c3451jv == null || i4 >= arrayList.size() || a9.i == 1) {
            return a10;
        }
        throw new IllegalStateException(("network interceptor " + oVar + " must call proceed() exactly once").toString());
    }
}
