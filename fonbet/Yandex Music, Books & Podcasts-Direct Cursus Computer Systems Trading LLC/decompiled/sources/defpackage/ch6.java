package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.continuelisten.ContinueListenBlockApi;
import com.yandex.music.shared.skeleton.continuelisten.dto.ContinueListenBlockEntitiesDto;
import com.yandex.music.shared.skeleton.continuelisten.dto.a;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class ch6 {
    public final jyr a;

    public ch6(upq upqVar) {
        this.a = btf.b(new w2(upq.b(upqVar, null, new kz5(22), 1), 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        bh6 bh6Var;
        int i;
        bii biiVar;
        if (cg6Var instanceof bh6) {
            bh6Var = (bh6) cg6Var;
            int i2 = bh6Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bh6Var.l = i2 - Integer.MIN_VALUE;
                Object obj = bh6Var.j;
                nm6 nm6Var = nm6.a;
                i = bh6Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ContinueListenBlockEntitiesDto>> b = ((ContinueListenBlockApi) this.a.getValue()).b(null);
                    bh6Var.l = 1;
                    obj = swf.N(b, bh6Var);
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
                    wg6 a = a.a((ContinueListenBlockEntitiesDto) ((aii) biiVar).a);
                    return a == null ? new nj6(null) : new qj6(a);
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        bh6Var = new bh6(this, cg6Var);
        Object obj2 = bh6Var.j;
        nm6 nm6Var2 = nm6.a;
        i = bh6Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(uvn uvnVar, boolean z, cg6 cg6Var) {
        ah6 ah6Var;
        int i;
        bii biiVar;
        if (cg6Var instanceof ah6) {
            ah6Var = (ah6) cg6Var;
            int i2 = ah6Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ah6Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ah6Var.j;
                nm6 nm6Var = nm6.a;
                i = ah6Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ContinueListenBlockEntitiesDto>> a = ((ContinueListenBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    ah6Var.l = 1;
                    obj = swf.N(a, ah6Var);
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
                    wg6 a2 = a.a((ContinueListenBlockEntitiesDto) ((aii) biiVar).a);
                    return a2 == null ? new nj6(null) : new qj6(a2);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                }
                if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                }
                if (biiVar instanceof zhi) {
                    return uwf.J((zhi) biiVar);
                }
                b6e.s();
                return null;
            }
        }
        ah6Var = new ah6(this, cg6Var);
        Object obj2 = ah6Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ah6Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
