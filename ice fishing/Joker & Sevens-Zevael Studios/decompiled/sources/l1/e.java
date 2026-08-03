package l1;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3965a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3966b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3967c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3968d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3969e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3970f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3971g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3972h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3973i;

    /* renamed from: j, reason: collision with root package name */
    public final d f3974j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3975k;

    public e(String str, float f10, float f11, float f12, float f13, long j3, int i10, boolean z10, int i11) {
        str = (i11 & 1) != 0 ? "" : str;
        long j6 = (i11 & 32) != 0 ? f1.q.f2283h : j3;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        this.f3965a = str;
        this.f3966b = f10;
        this.f3967c = f11;
        this.f3968d = f12;
        this.f3969e = f13;
        this.f3970f = j6;
        this.f3971g = i12;
        this.f3972h = z10;
        ArrayList arrayList = new ArrayList();
        this.f3973i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f3974j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, f1.i0 i0Var) {
        if (eVar.f3975k) {
            u1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((d) eVar.f3973i.get(r0.size() - 1)).f3962j.add(new k0("", arrayList, 0, i0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.f3975k) {
            u1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f3973i;
            if (arrayList.size() <= 1) {
                d dVar = this.f3974j;
                f fVar = new f(this.f3965a, this.f3966b, this.f3967c, this.f3968d, this.f3969e, new g0(dVar.f3953a, dVar.f3954b, dVar.f3955c, dVar.f3956d, dVar.f3957e, dVar.f3958f, dVar.f3959g, dVar.f3960h, dVar.f3961i, dVar.f3962j), this.f3970f, this.f3971g, this.f3972h);
                this.f3975k = true;
                return fVar;
            }
            if (this.f3975k) {
                u1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) arrayList.get(arrayList.size() - 1)).f3962j.add(new g0(dVar2.f3953a, dVar2.f3954b, dVar2.f3955c, dVar2.f3956d, dVar2.f3957e, dVar2.f3958f, dVar2.f3959g, dVar2.f3960h, dVar2.f3961i, dVar2.f3962j));
        }
    }
}
