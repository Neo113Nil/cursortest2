package a0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final i f77a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.x f78b;

    /* renamed from: c, reason: collision with root package name */
    public final long f79c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.x f80d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0.d f83g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f84h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f86j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0 f87k;

    public o(long j3, i iVar, b0.x xVar, int i10, int i11, y0.d dVar, int i12, int i13, long j6, b0 b0Var) {
        this.f80d = xVar;
        this.f81e = i10;
        this.f82f = i11;
        this.f83g = dVar;
        this.f84h = i12;
        this.f85i = i13;
        this.f86j = j6;
        this.f87k = b0Var;
        this.f77a = iVar;
        this.f78b = xVar;
        this.f79c = s2.b.b(s2.a.h(j3), Integer.MAX_VALUE, 5);
    }

    public final t a(int i10, long j3) {
        long j6;
        List list;
        i iVar = this.f77a;
        Object d10 = iVar.d(i10);
        Object b2 = iVar.b(i10);
        b0.x xVar = this.f78b;
        i iVar2 = xVar.f928i;
        HashMap hashMap = xVar.f929j;
        List list2 = (List) hashMap.get(Integer.valueOf(i10));
        if (list2 != null) {
            j6 = j3;
            list = list2;
        } else {
            Object d11 = iVar2.d(i10);
            List O = xVar.f927h.O(d11, xVar.f926g.a(i10, d11, iVar2.b(i10)));
            int size = O.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((v1.d0) O.get(i11)).e(j3));
            }
            j6 = j3;
            hashMap.put(Integer.valueOf(i10), arrayList);
            list = arrayList;
        }
        return new t(i10, list, this.f83g, this.f80d.f927h.getLayoutDirection(), this.f84h, this.f85i, i10 != this.f81e + (-1) ? this.f82f : 0, this.f86j, d10, b2, this.f87k.f28m, j6);
    }
}
