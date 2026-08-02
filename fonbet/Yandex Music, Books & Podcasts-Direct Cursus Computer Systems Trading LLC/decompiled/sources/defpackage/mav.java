package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.waves.WavesBlockApi;
import com.yandex.music.shared.skeleton.blocks.waves.WavesEntityDtoHolder;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class mav {
    public final jyr a;

    public mav(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new mze(c, 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        lav lavVar;
        int i;
        bii biiVar;
        rav ravVar;
        if (cg6Var instanceof lav) {
            lavVar = (lav) cg6Var;
            int i2 = lavVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lavVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lavVar.j;
                nm6 nm6Var = nm6.a;
                i = lavVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<WavesEntityDtoHolder>> a = ((WavesBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    lavVar.l = 1;
                    obj = swf.N(a, lavVar);
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
                    WavesEntityDtoHolder wavesEntityDtoHolder = (WavesEntityDtoHolder) ((aii) biiVar).a;
                    wavesEntityDtoHolder.getClass();
                    ArrayList b = wavesEntityDtoHolder.b();
                    if (b == null) {
                        ravVar = null;
                    } else {
                        BlockAnalyticsDataDto analytics = wavesEntityDtoHolder.getAnalytics();
                        ravVar = new rav(b, analytics != null ? saf.n0(analytics) : null);
                    }
                    return ravVar == null ? new nj6(null) : new qj6(ravVar);
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
        lavVar = new lav(this, cg6Var);
        Object obj2 = lavVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lavVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
