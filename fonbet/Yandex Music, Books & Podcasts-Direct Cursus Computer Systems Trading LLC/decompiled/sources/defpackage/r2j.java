package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.skeleton.blocks.neuromusic.data.NeuromusicBlockApi;
import com.yandex.music.skeleton.blocks.neuromusic.data.NeuromusicDtoHolder;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class r2j extends xmm {
    public final tun d;
    public final q43 e;
    public final xdr f;
    public final jyr g;

    public r2j(tun tunVar, q43 q43Var) {
        tunVar.getClass();
        this.d = tunVar;
        this.e = q43Var;
        this.f = ydr.a(new kgt(true));
        this.g = btf.b(new u5i(17));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.f.getValue() instanceof xgt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        q2j q2jVar;
        int i;
        bii biiVar;
        Object J;
        if (cg6Var instanceof q2j) {
            q2jVar = (q2j) cg6Var;
            int i2 = q2jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = q2jVar.j;
                nm6 nm6Var = nm6.a;
                i = q2jVar.l;
                tun tunVar = this.d;
                xdr xdrVar = this.f;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        kgt kgtVar = new kgt(true);
                        xdrVar.getClass();
                        xdrVar.m(null, kgtVar);
                    }
                    Call<MusicBackendResponse<NeuromusicDtoHolder>> a = ((NeuromusicBlockApi) this.g.getValue()).a(tunVar.b.a, men.G(tunVar.a), z ? "no-cache" : null);
                    q2jVar.l = 1;
                    obj = swf.N(a, q2jVar);
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
                    ArrayList a2 = ((NeuromusicDtoHolder) ((aii) biiVar).a).a();
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
                if (J instanceof qj6) {
                    if (!(J instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        kgt kgtVar2 = new kgt(false);
                        xdrVar.getClass();
                        xdrVar.m(null, kgtVar2);
                    }
                    ((pj6) J).a();
                    return new c73(tunVar);
                }
                List list = (List) ((qj6) J).a;
                if (!list.isEmpty()) {
                    xgt xgtVar = new xgt(list);
                    xdrVar.getClass();
                    xdrVar.m(null, xgtVar);
                } else if (!n()) {
                    kgt kgtVar3 = new kgt(false);
                    xdrVar.getClass();
                    xdrVar.m(null, kgtVar3);
                }
                int size = list.size();
                q43 q43Var = this.e;
                q43Var.b(q43Var.a, size, null, null);
                return new d73(tunVar);
            }
        }
        q2jVar = new q2j(this, cg6Var);
        Object obj2 = q2jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = q2jVar.l;
        tun tunVar2 = this.d;
        xdr xdrVar2 = this.f;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
        if (J instanceof qj6) {
        }
    }
}
