package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.openplaylist.OpenPlaylistBlockApi;
import com.yandex.music.shared.skeleton.blocks.openplaylist.OpenPlaylistBlockEntityDto;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class tsj {
    public final jyr a;

    public tsj(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new mze(c, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        ssj ssjVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof ssj) {
            ssjVar = (ssj) cg6Var;
            int i2 = ssjVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ssjVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ssjVar.j;
                nm6 nm6Var = nm6.a;
                i = ssjVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<OpenPlaylistBlockEntityDto>> a = ((OpenPlaylistBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    ssjVar.l = 1;
                    obj = swf.N(a, ssjVar);
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
                    isj a2 = ((OpenPlaylistBlockEntityDto) ((aii) biiVar).a).a();
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
        ssjVar = new ssj(this, cg6Var);
        Object obj2 = ssjVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ssjVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
