package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.skeleton.blocks.banner.data.BannerBlockApi;
import com.yandex.music.skeleton.blocks.banner.data.BannerEntityDto;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class qm2 extends xmm implements ayd {
    public final q43 d;
    public final im2 f;
    public final jyr e = btf.b(new uu1(12));
    public final xdr g = ydr.a(new hgt(true));
    public final xdr h = ydr.a(Boolean.FALSE);
    public final jyr i = btf.b(new uu1(13));

    public qm2(s63 s63Var, q43 q43Var) {
        this.d = q43Var;
        this.f = (im2) s63Var.a;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.f;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        v3w.n(z, this.h, null);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.g.getValue() instanceof ugt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0173, code lost:
    
        if (r1 == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0064, code lost:
    
        if (r1 == r3) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        pm2 pm2Var;
        int i;
        boolean z2;
        ?? booleanValue;
        int i2;
        boolean z3;
        bii biiVar;
        Object J;
        Object lj6Var;
        if (cg6Var instanceof pm2) {
            pm2Var = (pm2) cg6Var;
            int i3 = pm2Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pm2Var.n = i3 - Integer.MIN_VALUE;
                Object obj = pm2Var.l;
                nm6 nm6Var = nm6.a;
                i = pm2Var.n;
                jyr jyrVar = this.i;
                xdr xdrVar = this.g;
                im2 im2Var = this.f;
                if (i != 0) {
                    qgg.h0(obj);
                    lnq lnqVar = (lnq) jyrVar.getValue();
                    z2 = z;
                    pm2Var.j = z2;
                    pm2Var.n = 1;
                    obj = lnqVar.a.c(im2Var, pm2Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj);
                                return new d73(im2Var);
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = pm2Var.k;
                        z3 = pm2Var.j;
                        qgg.h0(obj);
                        biiVar = (bii) obj;
                        if (biiVar instanceof aii) {
                            if (biiVar instanceof xhi) {
                                xhi xhiVar = (xhi) biiVar;
                                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                                int i4 = xhiVar.b;
                                String name = musicBackendInvocationError.getName();
                                if (name == null) {
                                    name = "";
                                }
                                String message = musicBackendInvocationError.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                J = new kj6(i4, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                            } else if (biiVar instanceof yhi) {
                                yhi yhiVar = (yhi) biiVar;
                                lj6Var = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                                J = lj6Var;
                            } else {
                                if (!(biiVar instanceof zhi)) {
                                    b6e.s();
                                    return null;
                                }
                                J = uwf.J((zhi) biiVar);
                            }
                            if (!(J instanceof qj6)) {
                            }
                        } else {
                            rm2 a = ((BannerEntityDto) ((aii) biiVar).a).a();
                            if (a == null) {
                                J = new nj6(null);
                                if (!(J instanceof qj6)) {
                                    if (!(J instanceof pj6)) {
                                        b6e.s();
                                        return null;
                                    }
                                    if (!n()) {
                                        hgt hgtVar = new hgt(false);
                                        xdrVar.getClass();
                                        xdrVar.m(null, hgtVar);
                                    }
                                    ((pj6) J).a();
                                    return new c73(im2Var);
                                }
                                q43 q43Var = this.d;
                                q43Var.b(q43Var.a, 1, null, null);
                                rm2 rm2Var = (rm2) ((qj6) J).a;
                                ugt ugtVar = new ugt(c3x.f(rm2Var.c), c3x.f(rm2Var.b), rm2Var.a, rm2Var.d, rm2Var.e);
                                xdrVar.getClass();
                                xdrVar.m(null, ugtVar);
                                pm2Var.j = z3;
                                pm2Var.k = i2;
                                pm2Var.n = 3;
                                Object a2 = ((lnq) jyrVar.getValue()).a.a(im2Var, false, pm2Var);
                                if (a2 != nm6Var) {
                                    a2 = Unit.a;
                                }
                            } else {
                                lj6Var = new qj6(a);
                                J = lj6Var;
                                if (!(J instanceof qj6)) {
                                }
                            }
                        }
                        return new d73(im2Var);
                    }
                    z2 = pm2Var.j;
                    qgg.h0(obj);
                }
                Boolean bool = (Boolean) obj;
                booleanValue = bool == null ? bool.booleanValue() : 0;
                if (booleanValue == 0) {
                    return new b73(im2Var);
                }
                if (!n()) {
                    hgt hgtVar2 = new hgt(true);
                    xdrVar.getClass();
                    xdrVar.m(null, hgtVar2);
                }
                Call<MusicBackendResponse<BannerEntityDto>> a3 = ((BannerBlockApi) this.e.getValue()).a(im2Var.b.a, men.G(im2Var.a), z2 ? "no-cache" : null);
                pm2Var.j = z2;
                pm2Var.k = booleanValue;
                pm2Var.n = 2;
                Object N = swf.N(a3, pm2Var);
                if (N != nm6Var) {
                    boolean z4 = z2;
                    i2 = booleanValue;
                    obj = N;
                    z3 = z4;
                    biiVar = (bii) obj;
                    if (biiVar instanceof aii) {
                    }
                    return new d73(im2Var);
                }
                return nm6Var;
            }
        }
        pm2Var = new pm2(this, cg6Var);
        Object obj2 = pm2Var.l;
        nm6 nm6Var2 = nm6.a;
        i = pm2Var.n;
        jyr jyrVar2 = this.i;
        xdr xdrVar2 = this.g;
        im2 im2Var2 = this.f;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null) {
        }
        if (booleanValue == 0) {
        }
    }
}
