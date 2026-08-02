package defpackage;

import com.yandex.music.shared.artist.screen.data.pick.ArtistPickApi;
import com.yandex.music.shared.artist.screen.data.pick.ArtistPickResponse;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class gf1 {
    public final jyr a;

    public gf1(upq upqVar) {
        upqVar.getClass();
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r9v13, types: [c5b] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        ff1 ff1Var;
        int i;
        bii biiVar;
        ?? r9;
        te1 te1Var;
        eul H;
        if (cg6Var instanceof ff1) {
            ff1Var = (ff1) cg6Var;
            int i2 = ff1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ff1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ff1Var.j;
                nm6 nm6Var = nm6.a;
                i = ff1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistPickResponse>> a = ((ArtistPickApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    ff1Var.l = 1;
                    obj = swf.N(a, ff1Var);
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
                if (biiVar instanceof aii) {
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
                ArtistPickResponse artistPickResponse = (ArtistPickResponse) ((aii) biiVar).a;
                List<ArtistDomainItemDto> artists = artistPickResponse.getArtists();
                if (artists != null) {
                    r9 = new ArrayList();
                    for (ArtistDomainItemDto artistDomainItemDto : artists) {
                        u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                        if (K != null) {
                            r9.add(K);
                        }
                    }
                } else {
                    r9 = c5b.a;
                }
                PlaylistDomainItemDto playlist = artistPickResponse.getPlaylist();
                if (playlist == null || (H = neg.H(playlist)) == null) {
                    te1Var = null;
                } else {
                    BlockAnalyticsDataDto analytics = artistPickResponse.getAnalytics();
                    te1Var = new te1(r9, H, analytics != null ? saf.n0(analytics) : null);
                }
                return te1Var == null ? new nj6(null) : new qj6(te1Var);
            }
        }
        ff1Var = new ff1(this, cg6Var);
        Object obj2 = ff1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ff1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
