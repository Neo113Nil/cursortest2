package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.videoclip.VideoClipDto;
import com.yandex.music.shared.search.network.SearchApi;
import com.yandex.music.shared.search.network.SearchItemSuggestDto;
import com.yandex.music.shared.search.network.WaveDataDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class v2p {
    public final vy7 a;
    public final SearchApi b;

    public v2p(vy7 vy7Var, SearchApi searchApi) {
        this.a = vy7Var;
        this.b = searchApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        t2p t2pVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof t2p) {
            t2pVar = (t2p) cg6Var;
            int i2 = t2pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t2pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = t2pVar.j;
                nm6 nm6Var = nm6.a;
                i = t2pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> d = this.b.d(((frt) this.a.a.a(hag.I(frt.class))).c().a);
                    t2pVar.l = 1;
                    obj = swf.O(d, Unit.class, t2pVar);
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
                    return new qj6(((aii) biiVar).a);
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
        t2pVar = new t2p(this, cg6Var);
        Object obj2 = t2pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = t2pVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0138, code lost:
    
        if (r12.equals("track") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
    
        if (r5 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
    
        r12 = new defpackage.f4p(r5, defpackage.e4p.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
    
        if (r12.equals("ugc_track") == false) goto L49;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(c0p c0pVar, qzo qzoVar, cg6 cg6Var) {
        u2p u2pVar;
        int i;
        String str;
        String str2;
        bii biiVar;
        i4p g3pVar;
        if (cg6Var instanceof u2p) {
            u2pVar = (u2p) cg6Var;
            int i2 = u2pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u2pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = u2pVar.j;
                nm6 nm6Var = nm6.a;
                i = u2pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    String str3 = ((frt) this.a.a.a(hag.I(frt.class))).c().a;
                    int ordinal = c0pVar.ordinal();
                    if (ordinal == 0) {
                        str = "KIDS";
                    } else if (ordinal == 1) {
                        str = "PODCASTS";
                    } else if (ordinal == 2) {
                        str = "USER_LIBRARY";
                    } else if (ordinal == 3) {
                        str = null;
                    } else {
                        if (ordinal != 4) {
                            b6e.s();
                            return null;
                        }
                        str = "CONCERTS";
                    }
                    int ordinal2 = qzoVar.ordinal();
                    if (ordinal2 == 0) {
                        str2 = "track,podcast_episode,album,podcast,artist,playlist,ugc-track,wave,clip";
                    } else if (ordinal2 == 1) {
                        str2 = "track,album,artist,playlist";
                    } else if (ordinal2 == 2) {
                        str2 = "track,podcast_episode,album,podcast,artist,playlist,ugc-track,wave";
                    } else {
                        if (ordinal2 != 3) {
                            b6e.s();
                            return null;
                        }
                        str2 = "track";
                    }
                    Call<MusicBackendResponse<List<SearchItemSuggestDto>>> c = this.b.c(str3, str, str2);
                    u2pVar.l = 1;
                    obj = swf.N(c, u2pVar);
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
                        String str4 = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str4, message == null ? "" : message, xhiVar.a);
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
                List<SearchItemSuggestDto> list = (List) ((aii) biiVar).a;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (SearchItemSuggestDto searchItemSuggestDto : list) {
                    searchItemSuggestDto.getClass();
                    if (searchItemSuggestDto.getType() != null) {
                        AlbumDto album = searchItemSuggestDto.getAlbum();
                        oq G = album != null ? ild.G(album) : null;
                        ArtistDto artist = searchItemSuggestDto.getArtist();
                        c01 C = artist != null ? lxe.C(artist) : null;
                        PlaylistHeaderDto playlistHeader = searchItemSuggestDto.getPlaylistHeader();
                        cvl I = playlistHeader != null ? uwf.I(playlistHeader) : null;
                        TrackDto track = searchItemSuggestDto.getTrack();
                        mqs a = track != null ? wts.a(track) : null;
                        WaveDataDto wave = searchItemSuggestDto.getWave();
                        u1u E = wave != null ? s7g.E(wave) : null;
                        VideoClipDto clips = searchItemSuggestDto.getClips();
                        x1u p0 = clips != null ? o2g.p0(clips) : null;
                        String type = searchItemSuggestDto.getType();
                        switch (type.hashCode()) {
                            case -1409097913:
                                if (type.equals("artist") && C != null) {
                                    g3pVar = new g3p(C, e4p.e);
                                    break;
                                }
                                break;
                            case -1398995043:
                                break;
                            case 3056464:
                                if (type.equals("clip") && p0 != null) {
                                    g3pVar = new h4p(p0, e4p.e);
                                    break;
                                }
                                break;
                            case 3642105:
                                if (type.equals("wave") && E != null) {
                                    g3pVar = new g4p(E);
                                    break;
                                }
                                break;
                            case 92896879:
                                if (type.equals("album") && G != null) {
                                    if (u2x.I(G)) {
                                        g3pVar = new a4p(G, e4p.e);
                                        break;
                                    } else {
                                        g3pVar = new f3p(G, e4p.e);
                                        break;
                                    }
                                }
                                break;
                            case 110621003:
                                break;
                            case 1879474642:
                                if (type.equals("playlist") && I != null) {
                                    g3pVar = new b4p(I, e4p.e);
                                    break;
                                }
                                break;
                        }
                        if (g3pVar == null) {
                            arrayList.add(g3pVar);
                        }
                    }
                    g3pVar = null;
                    if (g3pVar == null) {
                    }
                }
                return new qj6(arrayList);
            }
        }
        u2pVar = new u2p(this, cg6Var);
        Object obj2 = u2pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = u2pVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
