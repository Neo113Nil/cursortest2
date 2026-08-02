package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.skeleton.blocks.likes_and_history.data.LikesAndHistoryApi;
import com.yandex.music.skeleton.blocks.likes_and_history.data.LikesAndHistoryEntityDto;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class l2g {
    public final jyr a;

    public l2g(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new mze(c, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        k2g k2gVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof k2g) {
            k2gVar = (k2g) cg6Var;
            int i2 = k2gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k2gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = k2gVar.j;
                nm6 nm6Var = nm6.a;
                i = k2gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<LikesAndHistoryEntityDto>> a = ((LikesAndHistoryApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    k2gVar.l = 1;
                    obj = swf.N(a, k2gVar);
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
                    bzd a2 = ((LikesAndHistoryEntityDto) ((aii) biiVar).a).a();
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
        k2gVar = new k2g(this, cg6Var);
        Object obj2 = k2gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = k2gVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
