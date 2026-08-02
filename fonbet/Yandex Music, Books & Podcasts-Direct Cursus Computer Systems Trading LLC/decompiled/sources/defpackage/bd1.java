package defpackage;

import com.yandex.music.shared.artist.screen.data.common.ArtistLinkDto;
import com.yandex.music.shared.artist.screen.network.ArtistLinkApi;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.artist.LinkDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class bd1 {
    public final jyr a;

    public bd1(upq upqVar) {
        upqVar.getClass();
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        ad1 ad1Var;
        int i;
        bii biiVar;
        nc1 nc1Var;
        m7g D;
        if (cg6Var instanceof ad1) {
            ad1Var = (ad1) cg6Var;
            int i2 = ad1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ad1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ad1Var.j;
                nm6 nm6Var = nm6.a;
                i = ad1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistLinkDto>> a = ((ArtistLinkApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    ad1Var.l = 1;
                    obj = swf.N(a, ad1Var);
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
                    ArtistLinkDto artistLinkDto = (ArtistLinkDto) ((aii) biiVar).a;
                    artistLinkDto.getClass();
                    LinkDto link = artistLinkDto.getLink();
                    if (link == null || (D = s7g.D(link)) == null) {
                        nc1Var = null;
                    } else {
                        BlockAnalyticsDataDto analytics = artistLinkDto.getAnalytics();
                        nc1Var = new nc1(D, analytics != null ? saf.n0(analytics) : null);
                    }
                    return nc1Var == null ? new nj6(null) : new qj6(nc1Var);
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
        ad1Var = new ad1(this, cg6Var);
        Object obj2 = ad1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ad1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
