package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.playlist.ChartResultDto;
import com.yandex.music.shared.skeleton.blocks.chart.ChartTracksBlockApi;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class gg4 {
    public final jyr a;

    public gg4(upq upqVar) {
        this.a = btf.b(new w2(upqVar.c(), 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, int i, boolean z, cg6 cg6Var) {
        fg4 fg4Var;
        int i2;
        bii biiVar;
        if (cg6Var instanceof fg4) {
            fg4Var = (fg4) cg6Var;
            int i3 = fg4Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fg4Var.l = i3 - Integer.MIN_VALUE;
                Object obj = fg4Var.j;
                nm6 nm6Var = nm6.a;
                i2 = fg4Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ChartResultDto>> a = ((ChartTracksBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null, i);
                    fg4Var.l = 1;
                    obj = swf.N(a, fg4Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    qe4 J = wct.J((ChartResultDto) ((aii) biiVar).a);
                    return J == null ? new nj6(null) : new qj6(J);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i4 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i4, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
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
        fg4Var = new fg4(this, cg6Var);
        Object obj2 = fg4Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = fg4Var.l;
        if (i2 != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
