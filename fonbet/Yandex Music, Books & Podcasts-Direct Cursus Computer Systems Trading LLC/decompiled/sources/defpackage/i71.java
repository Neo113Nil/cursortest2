package defpackage;

import com.yandex.music.screen.artist.albums.data.ArtistApi;
import com.yandex.music.screen.artist.albums.data.ArtistFamiliarWaveTracksDto;
import com.yandex.music.screen.artist.albums.data.ArtistFamiliarWaveTracksResponse;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.track.TrackDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class i71 {
    public final jyr a = btf.b(new zb0(26));
    public final jyr b = btf.b(new zb0(27));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v3, types: [c5b] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        h71 h71Var;
        int i;
        rj6 rj6Var;
        ?? r0;
        List<TrackDto> tracks;
        if (cg6Var instanceof h71) {
            h71Var = (h71) cg6Var;
            int i2 = h71Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h71Var.l = i2 - Integer.MIN_VALUE;
                Object obj = h71Var.j;
                nm6 nm6Var = nm6.a;
                i = h71Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistFamiliarWaveTracksResponse>> b = ((ArtistApi) this.a.getValue()).b(str);
                    h71Var.l = 1;
                    obj = uwf.g(b, h71Var);
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
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                ArtistFamiliarWaveTracksDto wave = ((ArtistFamiliarWaveTracksResponse) ((qj6) rj6Var).a).getWave();
                if (wave == null || (tracks = wave.getTracks()) == null) {
                    r0 = c5b.a;
                } else {
                    r0 = new ArrayList();
                    for (TrackDto trackDto : tracks) {
                        mqs a = trackDto != null ? wts.a(trackDto) : null;
                        if (a != null) {
                            r0.add(a);
                        }
                    }
                }
                return r0 == 0 ? new nj6(null) : new qj6(r0);
            }
        }
        h71Var = new h71(this, cg6Var);
        Object obj2 = h71Var.j;
        nm6 nm6Var2 = nm6.a;
        i = h71Var.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
