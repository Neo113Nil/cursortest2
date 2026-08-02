package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.skeleton.blocks.special.data.SpecialBlockApi;
import com.yandex.music.skeleton.blocks.special.data.SpecialBlockEntityDto;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class i5r extends xmm {
    public final q43 d;
    public final v4r e;
    public final xdr f = ydr.a(zft.a);
    public final jyr g = btf.b(new nrq(12));

    public i5r(s63 s63Var, q43 q43Var) {
        this.d = q43Var;
        this.e = (v4r) s63Var.a;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.e;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.f.getValue() instanceof ogt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        h5r h5rVar;
        int i;
        bii biiVar;
        Object J;
        boolean z2;
        if (cg6Var instanceof h5r) {
            h5rVar = (h5r) cg6Var;
            int i2 = h5rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h5rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = h5rVar.j;
                nm6 nm6Var = nm6.a;
                i = h5rVar.l;
                v4r v4rVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<SpecialBlockEntityDto>> a = ((SpecialBlockApi) this.g.getValue()).a(v4rVar.b.a, men.G(v4rVar.a), z ? "no-cache" : null);
                    h5rVar.l = 1;
                    obj = swf.N(a, h5rVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    a5r a2 = ((SpecialBlockEntityDto) ((aii) biiVar).a).a();
                    J = a2 == null ? new nj6(null) : new qj6(a2);
                } else if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    J = new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                } else if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    J = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                } else {
                    if (!(biiVar instanceof zhi)) {
                        b6e.s();
                        return null;
                    }
                    J = uwf.J((zhi) biiVar);
                }
                z2 = J instanceof qj6;
                xdr xdrVar = this.f;
                if (!z2) {
                    ogt ogtVar = new ogt((a5r) ((qj6) J).a);
                    xdrVar.getClass();
                    xdrVar.m(null, ogtVar);
                    q43 q43Var = this.d;
                    q43Var.b(q43Var.a, 1, null, null);
                    return new d73(v4rVar);
                }
                if (!(J instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                if (!n()) {
                    xdrVar.getClass();
                    xdrVar.m(null, yft.a);
                }
                ((pj6) J).a();
                return new c73(v4rVar);
            }
        }
        h5rVar = new h5r(this, cg6Var);
        Object obj2 = h5rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = h5rVar.l;
        v4r v4rVar2 = this.e;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
        z2 = J instanceof qj6;
        xdr xdrVar2 = this.f;
        if (!z2) {
        }
    }
}
