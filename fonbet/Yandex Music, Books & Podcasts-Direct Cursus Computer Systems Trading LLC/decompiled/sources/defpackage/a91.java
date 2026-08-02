package defpackage;

import com.yandex.music.shared.artist.screen.data.familiar.ArtistFamiliarWaveInfoDto;
import com.yandex.music.shared.artist.screen.data.familiar.ArtistFamiliarWaveInfoResponse;
import com.yandex.music.shared.artist.screen.network.ArtistFamiliarApi;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class a91 {
    public final b71 a;
    public final jyr b;

    public a91(upq upqVar, b71 b71Var) {
        upqVar.getClass();
        e0j c = upqVar.c();
        c.getClass();
        this.a = b71Var;
        this.b = btf.b(new w2(c, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        z81 z81Var;
        int i;
        bii biiVar;
        e91 e91Var;
        Integer trackCount;
        if (cg6Var instanceof z81) {
            z81Var = (z81) cg6Var;
            int i2 = z81Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z81Var.l = i2 - Integer.MIN_VALUE;
                Object obj = z81Var.j;
                nm6 nm6Var = nm6.a;
                i = z81Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistFamiliarWaveInfoResponse>> a = ((ArtistFamiliarApi) this.b.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    z81Var.l = 1;
                    obj = swf.N(a, z81Var);
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
                    ArtistFamiliarWaveInfoResponse artistFamiliarWaveInfoResponse = (ArtistFamiliarWaveInfoResponse) ((aii) biiVar).a;
                    ArtistFamiliarWaveInfoDto wave = artistFamiliarWaveInfoResponse.getWave();
                    if (wave == null || (trackCount = wave.getTrackCount()) == null) {
                        e91Var = null;
                    } else {
                        int intValue = trackCount.intValue();
                        BlockAnalyticsDataDto analytics = artistFamiliarWaveInfoResponse.getAnalytics();
                        e91Var = new e91(intValue, analytics != null ? saf.n0(analytics) : null);
                    }
                    return e91Var == null ? new nj6(null) : new qj6(e91Var);
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
        z81Var = new z81(this, cg6Var);
        Object obj2 = z81Var.j;
        nm6 nm6Var2 = nm6.a;
        i = z81Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
