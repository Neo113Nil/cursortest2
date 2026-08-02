package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.waveagents.WaveAgentsBlockApi;
import com.yandex.music.shared.skeleton.blocks.waveagents.WaveAgentsEntityDtoHolder;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class qlu {
    public final jyr a;

    public qlu(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new mze(c, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        plu pluVar;
        int i;
        bii biiVar;
        tlu tluVar;
        if (cg6Var instanceof plu) {
            pluVar = (plu) cg6Var;
            int i2 = pluVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pluVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pluVar.j;
                nm6 nm6Var = nm6.a;
                i = pluVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<WaveAgentsEntityDtoHolder>> a = ((WaveAgentsBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    pluVar.l = 1;
                    obj = swf.N(a, pluVar);
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
                    WaveAgentsEntityDtoHolder waveAgentsEntityDtoHolder = (WaveAgentsEntityDtoHolder) ((aii) biiVar).a;
                    waveAgentsEntityDtoHolder.getClass();
                    ArrayList b = waveAgentsEntityDtoHolder.b();
                    if (b == null) {
                        tluVar = null;
                    } else {
                        BlockAnalyticsDataDto analytics = waveAgentsEntityDtoHolder.getAnalytics();
                        tluVar = new tlu(b, analytics != null ? saf.n0(analytics) : null);
                    }
                    return tluVar == null ? new nj6(null) : new qj6(tluVar);
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
        pluVar = new plu(this, cg6Var);
        Object obj2 = pluVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pluVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
