package cd;

import java.io.Serializable;
import yc.b1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements bd.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Serializable f1363h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1364i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1365j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1366k;

    public /* synthetic */ j(Serializable serializable, Object obj, Object obj2, Object obj3, int i10) {
        this.f1362g = i10;
        this.f1363h = serializable;
        this.f1364i = obj;
        this.f1365j = obj2;
        this.f1366k = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    @Override // bd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, fc.d dVar) {
        i iVar;
        int i10;
        j jVar;
        switch (this.f1362g) {
            case 0:
                if (dVar instanceof i) {
                    iVar = (i) dVar;
                    int i11 = iVar.f1361k;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        iVar.f1361k = i11 - Integer.MIN_VALUE;
                        Object obj2 = iVar.f1359i;
                        i10 = iVar.f1361k;
                        if (i10 != 0) {
                            v6.a.W(obj2);
                            b1 b1Var = (b1) ((pc.s) this.f1363h).f5683g;
                            if (b1Var != null) {
                                b1Var.a(new l("Child of the scoped flow was cancelled"));
                                iVar.f1357g = this;
                                iVar.f1358h = obj;
                                iVar.f1361k = 1;
                                Object j3 = b1Var.j(iVar);
                                gc.a aVar = gc.a.f2559g;
                                if (j3 == aVar) {
                                    return aVar;
                                }
                            }
                            jVar = this;
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = iVar.f1358h;
                            jVar = iVar.f1357g;
                            v6.a.W(obj2);
                        }
                        ((pc.s) jVar.f1363h).f5683g = yc.a0.q((yc.y) jVar.f1364i, null, new h((k) jVar.f1365j, (bd.f) jVar.f1366k, obj, null), 1);
                        return ac.o.f277a;
                    }
                }
                iVar = new i(this, dVar);
                Object obj22 = iVar.f1359i;
                i10 = iVar.f1361k;
                if (i10 != 0) {
                }
                ((pc.s) jVar.f1363h).f5683g = yc.a0.q((yc.y) jVar.f1364i, null, new h((k) jVar.f1365j, (bd.f) jVar.f1366k, obj, null), 1);
                return ac.o.f277a;
            default:
                y.h hVar = (y.h) obj;
                pc.q qVar = (pc.q) this.f1365j;
                pc.q qVar2 = (pc.q) this.f1364i;
                pc.q qVar3 = (pc.q) this.f1363h;
                boolean z10 = true;
                if (hVar instanceof y.k) {
                    qVar3.f5681g++;
                } else if (hVar instanceof y.l) {
                    qVar3.f5681g--;
                } else if (hVar instanceof y.j) {
                    qVar3.f5681g--;
                } else if (hVar instanceof y.f) {
                    qVar2.f5681g++;
                } else if (hVar instanceof y.g) {
                    qVar2.f5681g--;
                } else if (hVar instanceof y.d) {
                    qVar.f5681g++;
                } else if (hVar instanceof y.e) {
                    qVar.f5681g--;
                }
                int i12 = qVar3.f5681g;
                boolean z11 = false;
                boolean z12 = i12 > 0;
                boolean z13 = qVar2.f5681g > 0;
                boolean z14 = qVar.f5681g > 0;
                w.u uVar = (w.u) this.f1366k;
                if (uVar.f7510v != z12) {
                    uVar.f7510v = z12;
                    z11 = true;
                }
                if (uVar.f7511w != z13) {
                    uVar.f7511w = z13;
                    z11 = true;
                }
                if (uVar.f7512x != z14) {
                    uVar.f7512x = z14;
                } else {
                    z10 = z11;
                }
                if (z10) {
                    x1.f.m(uVar);
                }
                return ac.o.f277a;
        }
    }
}
