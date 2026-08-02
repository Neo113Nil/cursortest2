package defpackage;

import com.yandex.music.screen.mymusic.wave_agent.data.CollectionWaveAgentBlockApi;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.wave.AgentDto;
import com.yandex.music.shared.dto.wave.NewWaveModelDto;
import com.yandex.music.shared.dto.wave.NewWaveModelWithAgentDto;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public final class a75 extends xmm implements ayd {
    public final rmb d;
    public final s63 e;
    public final lnq f;
    public final drf g;
    public final xdr h = ydr.a(d75.a);
    public final xdr i = ydr.a(Boolean.TRUE);
    public final jyr j = btf.b(new ym4(15));

    public a75(rmb rmbVar, s63 s63Var, lnq lnqVar) {
        this.d = rmbVar;
        this.e = s63Var;
        this.f = lnqVar;
        this.g = s63Var.a;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        v3w.n(z, this.i, null);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof b75;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x008a, code lost:
    
        if (r2 == r4) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        z65 z65Var;
        int i;
        bii biiVar;
        Object J;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        AgentDto agentDto;
        NewWaveModelDto wave;
        boolean z3 = z;
        if (cg6Var instanceof z65) {
            z65Var = (z65) cg6Var;
            int i6 = z65Var.m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                z65Var.m = i6 - Integer.MIN_VALUE;
                Object obj = z65Var.k;
                Object obj2 = nm6.a;
                i = z65Var.m;
                rmb rmbVar = this.d;
                drf drfVar = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<NewWaveModelWithAgentDto>> a = ((CollectionWaveAgentBlockApi) this.j.getValue()).a(((v65) this.e.a).c.a, men.G(drfVar.a()), z3 ? "no-cache" : null);
                    z65Var.j = z3;
                    z65Var.m = 1;
                    obj = swf.O(a, MusicBackendResponse.class, z65Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            i5 = 1;
                            i4 = 2;
                            rmb.h(rmbVar, i5, i4);
                            return new d73(drfVar);
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            i3 = 2;
                            rmb.h(rmbVar, 0, i3);
                            return new b73(drfVar);
                        }
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        i2 = 2;
                        rmb.h(rmbVar, 0, i2);
                        return new b73(drfVar);
                    }
                    z3 = z65Var.j;
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    J = new qj6(((aii) biiVar).a);
                } else if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i7 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    J = new kj6(i7, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
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
                c75 c75Var = c75.a;
                xdr xdrVar = this.h;
                if (z2) {
                    if (!(J instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, c75Var);
                    return new c73(drfVar);
                }
                NewWaveModelWithAgentDto newWaveModelWithAgentDto = (NewWaveModelWithAgentDto) ((MusicBackendResponse) ((qj6) J).a).getResult();
                dou a2 = (newWaveModelWithAgentDto == null || (wave = newWaveModelWithAgentDto.getWave()) == null) ? null : wave.a();
                np E = (newWaveModelWithAgentDto == null || (agentDto = newWaveModelWithAgentDto.getAgentDto()) == null) ? null : w1g.E(agentDto);
                if (a2 == null || E == null) {
                    xdrVar.getClass();
                    xdrVar.m(null, c75Var);
                    z65Var.j = z3;
                    z65Var.m = 4;
                    if (p(true, z65Var) != obj2) {
                        i2 = 2;
                        rmb.h(rmbVar, 0, i2);
                        return new b73(drfVar);
                    }
                } else {
                    op opVar = E.b;
                    Integer b0 = y2x.b0(opVar.b);
                    if (b0 != null) {
                        b75 b75Var = new b75(new ilu(new klu(a2.d, null, new jcv(opVar.a, WebPath$Storage.AVATARS).getPathForSize(wct.s()), E.a, b0.intValue(), E.c), a2));
                        xdrVar.getClass();
                        xdrVar.m(null, b75Var);
                        z65Var.j = z3;
                        i4 = 2;
                        z65Var.m = 2;
                        if (p(false, z65Var) != obj2) {
                            i5 = 1;
                            rmb.h(rmbVar, i5, i4);
                            return new d73(drfVar);
                        }
                    } else {
                        xdrVar.getClass();
                        xdrVar.m(null, c75Var);
                        z65Var.j = z3;
                        z65Var.m = 3;
                        if (p(true, z65Var) != obj2) {
                            i3 = 2;
                            rmb.h(rmbVar, 0, i3);
                            return new b73(drfVar);
                        }
                    }
                }
                return obj2;
            }
        }
        z65Var = new z65(this, cg6Var);
        Object obj3 = z65Var.k;
        Object obj22 = nm6.a;
        i = z65Var.m;
        rmb rmbVar2 = this.d;
        drf drfVar2 = this.g;
        if (i != 0) {
        }
        biiVar = (bii) obj3;
        if (!(biiVar instanceof aii)) {
        }
        z2 = J instanceof qj6;
        c75 c75Var2 = c75.a;
        xdr xdrVar2 = this.h;
        if (z2) {
        }
    }

    public final Object p(boolean z, Continuation continuation) {
        Object a = this.f.a.a((wfm) this.e.a, z, continuation);
        return a == nm6.a ? a : Unit.a;
    }
}
