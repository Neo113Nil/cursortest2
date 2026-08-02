package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.editorialwaves.EditorialWavesBlockApi;
import com.yandex.music.shared.skeleton.blocks.editorialwaves.EditorialWavesDtoHolder;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class i2b {
    public final jyr a;

    public i2b(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        h2b h2bVar;
        int i;
        bii biiVar;
        g2b g2bVar;
        if (cg6Var instanceof h2b) {
            h2bVar = (h2b) cg6Var;
            int i2 = h2bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h2bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = h2bVar.j;
                nm6 nm6Var = nm6.a;
                i = h2bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<EditorialWavesDtoHolder>> a = ((EditorialWavesBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    h2bVar.l = 1;
                    obj = swf.N(a, h2bVar);
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
                    EditorialWavesDtoHolder editorialWavesDtoHolder = (EditorialWavesDtoHolder) ((aii) biiVar).a;
                    editorialWavesDtoHolder.getClass();
                    ArrayList b = editorialWavesDtoHolder.b();
                    if (b == null) {
                        g2bVar = null;
                    } else {
                        BlockAnalyticsDataDto analytics = editorialWavesDtoHolder.getAnalytics();
                        g2bVar = new g2b(b, analytics != null ? saf.n0(analytics) : null);
                    }
                    return g2bVar == null ? new nj6(null) : new qj6(g2bVar);
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
        h2bVar = new h2b(this, cg6Var);
        Object obj2 = h2bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = h2bVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
