package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.trailers.api.model.TrackWithSmartPreviewDto;
import com.yandex.music.shared.trailers.data.TrailersApi;
import com.yandex.music.shared.trailers.data.network.dto.AlbumTrailerDto;
import com.yandex.music.shared.trailers.data.network.dto.ArtistTrailerDto;
import com.yandex.music.shared.trailers.data.network.dto.PlaylistTrailerDto;
import com.yandex.music.shared.trailers.data.network.dto.TrackTrailerDto;
import com.yandex.music.shared.trailers.data.network.dto.TrailerDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class k6t {
    public final jyr a;

    public k6t(i0j i0jVar) {
        this.a = btf.b(new jt5(i0jVar, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        g6t g6tVar;
        int i;
        bii biiVar;
        lt J;
        TrailerDto trailer;
        List tracks;
        ArrayList n0;
        if (cg6Var instanceof g6t) {
            g6tVar = (g6t) cg6Var;
            int i2 = g6tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g6tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = g6tVar.j;
                nm6 nm6Var = nm6.a;
                i = g6tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<AlbumTrailerDto>> d = e().d(str);
                    g6tVar.l = 1;
                    obj = swf.N(d, g6tVar);
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
                    AlbumTrailerDto albumTrailerDto = (AlbumTrailerDto) ((aii) biiVar).a;
                    albumTrailerDto.getClass();
                    TrailerDto trailer2 = albumTrailerDto.getTrailer();
                    String title = trailer2 != null ? trailer2.getTitle() : null;
                    AlbumDomainItemDto album = albumTrailerDto.getAlbum();
                    l20 l20Var = (album == null || (J = xee.J(album)) == null || (trailer = albumTrailerDto.getTrailer()) == null || (tracks = trailer.getTracks()) == null || (n0 = o2g.n0(tracks)) == null) ? null : new l20(J, title, n0);
                    return l20Var == null ? new nj6(null) : new qj6(l20Var);
                }
                if (!(biiVar instanceof xhi)) {
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
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        g6tVar = new g6t(this, cg6Var);
        Object obj2 = g6tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = g6tVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, boolean z, cg6 cg6Var) {
        h6t h6tVar;
        int i;
        bii biiVar;
        u51 K;
        TrailerDto trailer;
        List tracks;
        ArrayList n0;
        if (cg6Var instanceof h6t) {
            h6tVar = (h6t) cg6Var;
            int i2 = h6tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = h6tVar.j;
                nm6 nm6Var = nm6.a;
                i = h6tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistTrailerDto>> b = e().b(str, z);
                    h6tVar.l = 1;
                    obj = swf.N(b, h6tVar);
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
                    ArtistTrailerDto artistTrailerDto = (ArtistTrailerDto) ((aii) biiVar).a;
                    artistTrailerDto.getClass();
                    TrailerDto trailer2 = artistTrailerDto.getTrailer();
                    String title = trailer2 != null ? trailer2.getTitle() : null;
                    ArtistDomainItemDto artist = artistTrailerDto.getArtist();
                    fm1 fm1Var = (artist == null || (K = ltg.K(artist)) == null || (trailer = artistTrailerDto.getTrailer()) == null || (tracks = trailer.getTracks()) == null || (n0 = o2g.n0(tracks)) == null) ? null : new fm1(title, K, n0);
                    return fm1Var == null ? new nj6(null) : new qj6(fm1Var);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
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
        h6tVar = new h6t(this, cg6Var);
        Object obj2 = h6tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = h6tVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, cg6 cg6Var) {
        i6t i6tVar;
        int i;
        bii biiVar;
        o3m o3mVar;
        eul H;
        List tracks;
        ArrayList n0;
        if (cg6Var instanceof i6t) {
            i6tVar = (i6t) cg6Var;
            int i2 = i6tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i6tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = i6tVar.j;
                nm6 nm6Var = nm6.a;
                i = i6tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PlaylistTrailerDto>> a = e().a(str, str2);
                    i6tVar.l = 1;
                    obj = swf.N(a, i6tVar);
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
                        String str3 = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
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
                PlaylistTrailerDto playlistTrailerDto = (PlaylistTrailerDto) ((aii) biiVar).a;
                playlistTrailerDto.getClass();
                TrailerDto trailer = playlistTrailerDto.getTrailer();
                String title = trailer != null ? trailer.getTitle() : null;
                PlaylistDomainItemDto playlist = playlistTrailerDto.getPlaylist();
                if (playlist != null && (H = neg.H(playlist)) != null) {
                    Boolean shareable = playlistTrailerDto.getShareable();
                    boolean booleanValue = shareable != null ? shareable.booleanValue() : false;
                    TrailerDto trailer2 = playlistTrailerDto.getTrailer();
                    if (trailer2 != null && (tracks = trailer2.getTracks()) != null && (n0 = o2g.n0(tracks)) != null) {
                        o3mVar = new o3m(title, H, booleanValue, playlistTrailerDto.getPersonalColor() != null ? Float.valueOf(r7.intValue()) : null, n0);
                        return o3mVar != null ? new nj6(null) : new qj6(o3mVar);
                    }
                }
                o3mVar = null;
                if (o3mVar != null) {
                }
            }
        }
        i6tVar = new i6t(this, cg6Var);
        Object obj2 = i6tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = i6tVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        j6t j6tVar;
        int i;
        bii biiVar;
        h0r b0;
        TrackDto track;
        Map colorPalette;
        if (cg6Var instanceof j6t) {
            j6tVar = (j6t) cg6Var;
            int i2 = j6tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j6tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = j6tVar.j;
                nm6 nm6Var = nm6.a;
                i = j6tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<TrackTrailerDto>> c = e().c(str);
                    j6tVar.l = 1;
                    obj = swf.N(c, j6tVar);
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
                    TrackTrailerDto trackTrailerDto = (TrackTrailerDto) ((aii) biiVar).a;
                    trackTrailerDto.getClass();
                    TrackWithSmartPreviewDto track2 = trackTrailerDto.getTrack();
                    String str2 = (track2 == null || (track = track2.getTrack()) == null || (colorPalette = track.getColorPalette()) == null) ? null : (String) colorPalette.get("average");
                    TrackWithSmartPreviewDto track3 = trackTrailerDto.getTrack();
                    u1t u1tVar = (track3 == null || (b0 = zc4.b0(track3)) == null) ? null : new u1t(str2, b0);
                    return u1tVar == null ? new nj6(null) : new qj6(u1tVar);
                }
                if (!(biiVar instanceof xhi)) {
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
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        j6tVar = new j6t(this, cg6Var);
        Object obj2 = j6tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = j6tVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public final TrailersApi e() {
        Object value = this.a.getValue();
        value.getClass();
        return (TrailersApi) value;
    }
}
