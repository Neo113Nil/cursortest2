package defpackage;

import com.google.gson.JsonObject;
import com.yandex.music.screen.search.analytics.MixedSearchException;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.album.SearchBestResultAlbumDto;
import com.yandex.music.shared.dto.album.SearchBestResultNonMusicDto;
import com.yandex.music.shared.dto.album.SearchBestResultPodcastDto;
import com.yandex.music.shared.dto.album.SearchBestResultRecentReleaseDto;
import com.yandex.music.shared.dto.album.SearchBestResultReleaseDto;
import com.yandex.music.shared.dto.album.SearchBestResultReleasesDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.artist.SearchBestResultArtistDto;
import com.yandex.music.shared.dto.artist.SearchBestResultArtistsRelatedDto;
import com.yandex.music.shared.dto.concert.ConcertDto;
import com.yandex.music.shared.dto.concert.ConcertWithPriceDto;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.WaveColorsDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.SearchBestResultPlaylistDto;
import com.yandex.music.shared.dto.presave.UserPreSaveDto;
import com.yandex.music.shared.dto.search.SearchBestResultOverviewDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import com.yandex.music.shared.dto.videoclip.VideoClipDto;
import com.yandex.music.shared.dto.wave.AgentDto;
import com.yandex.music.shared.dto.wave.QueryToVibeWaveDto;
import com.yandex.music.shared.dto.wave.QueryToVibeWaveItemDto;
import com.yandex.music.shared.search.network.BestResultWaveDto;
import com.yandex.music.shared.search.network.SearchApi;
import com.yandex.music.shared.search.network.SearchFilterDto;
import com.yandex.music.shared.search.network.SearchItemDto;
import com.yandex.music.shared.search.network.SearchResultDto;
import com.yandex.music.shared.search.network.WaveDataDto;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class g5p {
    public final SearchApi a;
    public final sml b;
    public final e5o c;
    public final zzp d;
    public final e5o e;
    public final e06 f;

    public g5p(SearchApi searchApi, sml smlVar, e5o e5oVar, zzp zzpVar, e5o e5oVar2, e06 e06Var) {
        e06Var.getClass();
        this.a = searchApi;
        this.b = smlVar;
        this.c = e5oVar;
        this.d = zzpVar;
        this.e = e5oVar2;
        this.f = e06Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0990 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:600:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v16, types: [c5b] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [t1p] */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r21v27, types: [u51] */
    /* JADX WARN: Type inference failed for: r21v32, types: [u51] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [jcv] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [jcv] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v115 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77, types: [np] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [zsu] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v58, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, c0p c0pVar, String str2, String str3, int i, rzo rzoVar, boolean z2, String str4, cg6 cg6Var) {
        f5p f5pVar;
        int i2;
        long j;
        j8q j8qVar;
        String str5;
        String str6;
        String str7;
        int ordinal;
        String str8;
        String str9;
        String str10;
        c0p c0pVar2;
        String str11;
        Object N;
        Object obj;
        e8q e8qVar;
        bii biiVar;
        h6i h6iVar;
        zzp zzpVar;
        long j2;
        Object J;
        j8q j8qVar2;
        boolean z3;
        c5b c5bVar;
        c5b c5bVar2;
        boolean z4;
        c5b c5bVar3;
        c5b c5bVar4;
        QueryToVibeWaveDto queryToVibeWave;
        QueryToVibeWaveItemDto wave;
        n7n I;
        ArrayList arrayList;
        Object k8qVar;
        String str12;
        String str13;
        String str14;
        h8q h8qVar;
        ?? r14;
        String id;
        String displayName;
        Object obj2;
        Iterator it;
        c5b c5bVar5;
        boolean z5;
        long j3;
        Object obj3;
        SearchBestResultReleasesDto bestResultReleases;
        List<SearchBestResultReleaseDto> releases;
        ?? r11;
        Object obj4;
        AlbumDomainItemDto album;
        lt J2;
        SearchBestResultArtistDto bestResultArtist;
        ArtistDomainItemDto artist;
        u51 K;
        Object i3pVar;
        Integer likesCount;
        SearchBestResultArtistsRelatedDto bestResultArtistsRelated;
        List<ArtistDomainItemDto> artists;
        SearchBestResultRecentReleaseDto bestResultRecentRelease;
        AlbumDomainItemDto album2;
        lt J3;
        List<ArtistDomainItemDto> artists2;
        TrackDto bestResultPodcastEpisode;
        mqs a;
        SearchBestResultOverviewDto bestResultOverview;
        String message;
        SearchBestResultPodcastDto bestResultPodcast;
        AlbumDomainItemDto album3;
        lt J4;
        Integer likesCount2;
        UserPreSaveDto bestResultUpcoming;
        kjm R;
        VideoClipDto bestResultClip;
        x1u p0;
        BestResultWaveDto bestResultWave;
        ?? r9;
        SearchBestResultPlaylistDto bestResultPlaylist;
        PlaylistDomainItemDto playlist;
        eul H;
        Integer likesCount3;
        boolean z6;
        mqs a2;
        AlbumDomainItemDto album4;
        lt J5;
        List<ArtistDomainItemDto> artists3;
        boolean z7;
        SearchBestResultAlbumDto searchBestResultAlbumDto;
        j8q j8qVar3;
        mqs a3;
        us5 a4;
        AlbumDomainItemDto album5;
        lt J6;
        List<ArtistDomainItemDto> artists4;
        c5b c5bVar6;
        j8q j8qVar4;
        j8q j8qVar5;
        Iterator it2;
        boolean z8;
        Object obj5;
        ArtistDto artist2;
        c01 C;
        AlbumDto podcast;
        oq G;
        TrackDto podcast_episode;
        mqs a5;
        VideoClipDto clip;
        x1u p02;
        WaveDataDto wave2;
        u1u E;
        Object g4pVar;
        AlbumDto album6;
        oq G2;
        TrackDto track;
        mqs a6;
        ConcertWithPriceDto concert;
        s26 D;
        PlaylistHeaderDto playlist2;
        h6i h6iVar2 = (h6i) this.b.a;
        if (cg6Var instanceof f5p) {
            f5pVar = (f5p) cg6Var;
            int i3 = f5pVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f5pVar.q = i3 - Integer.MIN_VALUE;
                Object obj6 = f5pVar.o;
                nm6 nm6Var = nm6.a;
                i2 = f5pVar.q;
                zzp zzpVar2 = this.d;
                if (i2 != 0) {
                    qgg.h0(obj6);
                    long a7 = zzpVar2.a();
                    e8q e8qVar2 = new e8q(str, c0pVar, str2, str3, i, a7);
                    j = a7;
                    int ordinal2 = c0pVar.ordinal();
                    j8qVar = null;
                    if (ordinal2 == 0) {
                        str5 = "kids";
                    } else if (ordinal2 == 1) {
                        str5 = "podcasts";
                    } else if (ordinal2 == 2 || ordinal2 == 3) {
                        str6 = null;
                        if (!z) {
                            str7 = "voice";
                        } else {
                            if (z) {
                                b6e.s();
                                return null;
                            }
                            str7 = "keyboard";
                        }
                        String str15 = str7;
                        ordinal = rzoVar.ordinal();
                        if (ordinal != 0) {
                            str8 = "all";
                        } else if (ordinal == 1) {
                            str8 = "track,album,artist,playlist";
                        } else if (ordinal != 2) {
                            if (ordinal == 3) {
                                str9 = "track";
                            } else {
                                if (ordinal != 4) {
                                    b6e.s();
                                    return null;
                                }
                                str9 = "artist";
                            }
                            Call<MusicBackendResponse<SearchResultDto>> b = this.a.b(str, false, str6, str15, i, 20, str9, str2, str3, Boolean.valueOf(z2), Boolean.FALSE, str4);
                            str10 = str;
                            f5pVar.j = str10;
                            c0pVar2 = c0pVar;
                            f5pVar.k = c0pVar2;
                            str11 = str2;
                            f5pVar.l = str11;
                            f5pVar.m = e8qVar2;
                            f5pVar.n = j;
                            f5pVar.q = 1;
                            N = swf.N(b, f5pVar);
                            if (N == nm6Var) {
                                return nm6Var;
                            }
                            obj = N;
                            e8qVar = e8qVar2;
                        } else {
                            str8 = "track,album,artist,playlist,podcast,podcast-episode";
                        }
                        str9 = str8;
                        Call<MusicBackendResponse<SearchResultDto>> b2 = this.a.b(str, false, str6, str15, i, 20, str9, str2, str3, Boolean.valueOf(z2), Boolean.FALSE, str4);
                        str10 = str;
                        f5pVar.j = str10;
                        c0pVar2 = c0pVar;
                        f5pVar.k = c0pVar2;
                        str11 = str2;
                        f5pVar.l = str11;
                        f5pVar.m = e8qVar2;
                        f5pVar.n = j;
                        f5pVar.q = 1;
                        N = swf.N(b2, f5pVar);
                        if (N == nm6Var) {
                        }
                    } else {
                        if (ordinal2 != 4) {
                            b6e.s();
                            return null;
                        }
                        str5 = "concerts";
                    }
                    str6 = str5;
                    if (!z) {
                    }
                    String str152 = str7;
                    ordinal = rzoVar.ordinal();
                    if (ordinal != 0) {
                    }
                    str9 = str8;
                    Call<MusicBackendResponse<SearchResultDto>> b22 = this.a.b(str, false, str6, str152, i, 20, str9, str2, str3, Boolean.valueOf(z2), Boolean.FALSE, str4);
                    str10 = str;
                    f5pVar.j = str10;
                    c0pVar2 = c0pVar;
                    f5pVar.k = c0pVar2;
                    str11 = str2;
                    f5pVar.l = str11;
                    f5pVar.m = e8qVar2;
                    f5pVar.n = j;
                    f5pVar.q = 1;
                    N = swf.N(b22, f5pVar);
                    if (N == nm6Var) {
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j4 = f5pVar.n;
                    e8qVar = f5pVar.m;
                    String str16 = f5pVar.l;
                    c0p c0pVar3 = f5pVar.k;
                    String str17 = f5pVar.j;
                    qgg.h0(obj6);
                    obj = obj6;
                    str10 = str17;
                    c0pVar2 = c0pVar3;
                    j = j4;
                    j8qVar = null;
                    str11 = str16;
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    h6iVar = h6iVar2;
                    zzpVar = zzpVar2;
                    j2 = j;
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i4 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        if (name == null) {
                            name = "";
                        }
                        String message2 = musicBackendInvocationError.getMessage();
                        J = new kj6(i4, musicBackendInvocationError.getDetails(), name, message2 != null ? message2 : "", xhiVar.a);
                    } else if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        J = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    } else {
                        if (!(biiVar instanceof zhi)) {
                            b6e.s();
                            return null;
                        }
                        J = uwf.J((zhi) biiVar);
                    }
                } else {
                    SearchResultDto searchResultDto = (SearchResultDto) ((aii) biiVar).a;
                    boolean z9 = str11 != null && c0pVar2 == c0p.d;
                    boolean booleanValue = ((Boolean) this.c.invoke()).booleanValue();
                    boolean booleanValue2 = ((Boolean) this.e.invoke()).booleanValue();
                    int i5 = this.f.a;
                    searchResultDto.getClass();
                    str10.getClass();
                    String text = searchResultDto.getText();
                    if (text == null) {
                        h6iVar = h6iVar2;
                        zzpVar = zzpVar2;
                        j2 = j;
                    } else {
                        String misspellResult = searchResultDto.getMisspellResult();
                        j8q j8qVar6 = misspellResult != null ? new j8q(misspellResult) : j8qVar;
                        List results = searchResultDto.getResults();
                        String str18 = "podcast";
                        String str19 = str10;
                        String str20 = "clip";
                        h6iVar = h6iVar2;
                        String str21 = "album";
                        boolean z10 = z9;
                        if (results != null) {
                            zzpVar = zzpVar2;
                            ?? arrayList2 = new ArrayList();
                            Iterator it3 = results.iterator();
                            while (it3.hasNext()) {
                                SearchItemDto searchItemDto = (SearchItemDto) it3.next();
                                if (searchItemDto != null) {
                                    j8qVar5 = j8qVar6;
                                    it2 = it3;
                                    e4p e4pVar = z10 ? e4p.b : e4p.a;
                                    String type = searchItemDto.getType();
                                    if (type != null) {
                                        switch (type.hashCode()) {
                                            case -1409097913:
                                                z8 = booleanValue;
                                                if (type.equals("artist") && (artist2 = searchItemDto.getArtist()) != null && (C = lxe.C(artist2)) != null) {
                                                    obj5 = new g3p(C, e4pVar);
                                                    break;
                                                }
                                                obj5 = j8qVar;
                                                break;
                                            case -405568764:
                                                z8 = booleanValue;
                                                if (type.equals("podcast") && (podcast = searchItemDto.getPodcast()) != null && (G = ild.G(podcast)) != null) {
                                                    obj5 = new a4p(G, e4pVar);
                                                    break;
                                                }
                                                obj5 = j8qVar;
                                                break;
                                            case -348937280:
                                                z8 = booleanValue;
                                                if (type.equals("podcast_episode") && (podcast_episode = searchItemDto.getPodcast_episode()) != null && (a5 = wts.a(podcast_episode)) != null) {
                                                    obj5 = new c4p(a5, e4pVar);
                                                    break;
                                                }
                                                obj5 = j8qVar;
                                                break;
                                            case 3056464:
                                                z8 = booleanValue;
                                                if (type.equals("clip") && z8 && (clip = searchItemDto.getClip()) != null && (p02 = o2g.p0(clip)) != null) {
                                                    obj5 = new h4p(p02, e4pVar);
                                                    break;
                                                }
                                                obj5 = j8qVar;
                                                break;
                                            case 3642105:
                                                z8 = booleanValue;
                                                if (type.equals("wave") && (wave2 = searchItemDto.getWave()) != null && (E = s7g.E(wave2)) != null) {
                                                    g4pVar = new g4p(E);
                                                    obj5 = g4pVar;
                                                    break;
                                                }
                                                obj5 = j8qVar;
                                                break;
                                            case 92896879:
                                                z8 = booleanValue;
                                                if (type.equals("album") && (album6 = searchItemDto.getAlbum()) != null && (G2 = ild.G(album6)) != null) {
                                                    obj5 = new f3p(G2, e4pVar);
                                                    break;
                                                }
                                                obj5 = j8qVar;
                                                break;
                                            case 110621003:
                                                z8 = booleanValue;
                                                if (type.equals("track") && (track = searchItemDto.getTrack()) != null && (a6 = wts.a(track)) != null) {
                                                    obj5 = new f4p(a6, e4pVar);
                                                    break;
                                                }
                                                obj5 = j8qVar;
                                                break;
                                            case 951024294:
                                                z8 = booleanValue;
                                                if (type.equals("concert") && (concert = searchItemDto.getConcert()) != null && (D = hag.D(concert, i5)) != null) {
                                                    g4pVar = new z3p(D);
                                                    obj5 = g4pVar;
                                                    break;
                                                }
                                                obj5 = j8qVar;
                                                break;
                                            case 1879474642:
                                                if (type.equals("playlist") && (playlist2 = searchItemDto.getPlaylist()) != null) {
                                                    z8 = booleanValue;
                                                    obj5 = new b4p(uwf.I(playlist2), e4pVar);
                                                    break;
                                                }
                                                break;
                                            default:
                                                z8 = booleanValue;
                                                obj5 = j8qVar;
                                                break;
                                        }
                                        if (obj5 == null) {
                                            arrayList2.add(obj5);
                                        }
                                        it3 = it2;
                                        j8qVar6 = j8qVar5;
                                        booleanValue = z8;
                                    }
                                } else {
                                    j8qVar5 = j8qVar6;
                                    it2 = it3;
                                }
                                z8 = booleanValue;
                                obj5 = j8qVar;
                                if (obj5 == null) {
                                }
                                it3 = it2;
                                j8qVar6 = j8qVar5;
                                booleanValue = z8;
                            }
                            j8qVar2 = j8qVar6;
                            z3 = booleanValue;
                            c5bVar = arrayList2;
                        } else {
                            zzpVar = zzpVar2;
                            j8qVar2 = j8qVar6;
                            z3 = booleanValue;
                            c5bVar = c5b.a;
                        }
                        List bestResults = searchResultDto.getBestResults();
                        if (bestResults != null) {
                            ?? arrayList3 = new ArrayList();
                            Iterator it4 = bestResults.iterator();
                            c5b c5bVar7 = c5bVar;
                            while (it4.hasNext()) {
                                SearchItemDto searchItemDto2 = (SearchItemDto) it4.next();
                                if (searchItemDto2 != null) {
                                    String type2 = searchItemDto2.getType();
                                    if (type2 != null) {
                                        switch (type2.hashCode()) {
                                            case -1889716525:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_releases") && (bestResultReleases = searchItemDto2.getBestResultReleases()) != null && (releases = bestResultReleases.getReleases()) != null) {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (SearchBestResultReleaseDto searchBestResultReleaseDto : releases) {
                                                        if (searchBestResultReleaseDto == null || (album = searchBestResultReleaseDto.getAlbum()) == null || (J2 = xee.J(album)) == null) {
                                                            obj4 = j8qVar;
                                                        } else {
                                                            sc7 releaseDate = searchBestResultReleaseDto.getReleaseDate();
                                                            obj4 = new s3p(J2, releaseDate != null ? releaseDate.b : j8qVar);
                                                        }
                                                        if (obj4 != null) {
                                                            arrayList4.add(obj4);
                                                        }
                                                    }
                                                    List<TrackDto> topTracks = bestResultReleases.getTopTracks();
                                                    if (topTracks != null) {
                                                        r11 = new ArrayList();
                                                        for (TrackDto trackDto : topTracks) {
                                                            Object a8 = trackDto != null ? wts.a(trackDto) : j8qVar;
                                                            if (a8 != null) {
                                                                r11.add(a8);
                                                            }
                                                        }
                                                    } else {
                                                        r11 = c5b.a;
                                                    }
                                                    Intrinsics.d(bestResultReleases.getHasRecentReleases(), Boolean.TRUE);
                                                    r11.getClass();
                                                    obj3 = new t3p();
                                                    break;
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case -1540099442:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_artist") && (bestResultArtist = searchItemDto2.getBestResultArtist()) != null && (artist = bestResultArtist.getArtist()) != null && (K = ltg.K(artist)) != null && (likesCount = bestResultArtist.getLikesCount()) != null) {
                                                    int intValue = likesCount.intValue();
                                                    TrailerDto trailer = bestResultArtist.getTrailer();
                                                    i3pVar = new i3p(K, intValue, trailer != null ? Intrinsics.d(trailer.getAvailable(), Boolean.TRUE) : false);
                                                    obj3 = i3pVar;
                                                    break;
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case -1155125871:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_artists_related") && (bestResultArtistsRelated = searchItemDto2.getBestResultArtistsRelated()) != null && (artists = bestResultArtistsRelated.getArtists()) != null) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    for (ArtistDomainItemDto artistDomainItemDto : artists) {
                                                        Object K2 = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : j8qVar;
                                                        if (K2 != null) {
                                                            arrayList5.add(K2);
                                                        }
                                                    }
                                                    String title = bestResultArtistsRelated.getTitle();
                                                    if (title != null) {
                                                        obj3 = new j3p(title, arrayList5);
                                                        break;
                                                    }
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case -991074710:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_recent_release") && (bestResultRecentRelease = searchItemDto2.getBestResultRecentRelease()) != null && (album2 = bestResultRecentRelease.getAlbum()) != null && (J3 = xee.J(album2)) != null && (artists2 = bestResultRecentRelease.getArtists()) != null) {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    for (ArtistDomainItemDto artistDomainItemDto2 : artists2) {
                                                        Object K3 = artistDomainItemDto2 != null ? ltg.K(artistDomainItemDto2) : j8qVar;
                                                        if (K3 != null) {
                                                            arrayList6.add(K3);
                                                        }
                                                    }
                                                    TrailerDto trailer2 = bestResultRecentRelease.getTrailer();
                                                    i3pVar = new r3p(J3, arrayList6, trailer2 != null ? Intrinsics.d(trailer2.getAvailable(), Boolean.TRUE) : false);
                                                    obj3 = i3pVar;
                                                    break;
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case -840544167:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_podcast_episode") && (bestResultPodcastEpisode = searchItemDto2.getBestResultPodcastEpisode()) != null && (a = wts.a(bestResultPodcastEpisode)) != null) {
                                                    obj3 = new q3p(a);
                                                    break;
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case -808301824:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_overview") && (bestResultOverview = searchItemDto2.getBestResultOverview()) != null && (message = bestResultOverview.getMessage()) != null) {
                                                    String title2 = bestResultOverview.getTitle();
                                                    Boolean expandable = bestResultOverview.getExpandable();
                                                    boolean booleanValue3 = expandable != null ? expandable.booleanValue() : true;
                                                    Integer visibleLines = bestResultOverview.getVisibleLines();
                                                    int intValue2 = visibleLines != null ? visibleLines.intValue() : 3;
                                                    q5i q5iVar = new q5i();
                                                    q5iVar.c = title2;
                                                    q5iVar.d = message;
                                                    q5iVar.a = booleanValue3;
                                                    q5iVar.b = intValue2;
                                                    obj3 = new n3p(q5iVar);
                                                    break;
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case -171648867:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_podcast") && (bestResultPodcast = searchItemDto2.getBestResultPodcast()) != null && (album3 = bestResultPodcast.getAlbum()) != null && (J4 = xee.J(album3)) != null && (likesCount2 = bestResultPodcast.getLikesCount()) != null) {
                                                    i3pVar = new p3p(J4, likesCount2.intValue());
                                                    obj3 = i3pVar;
                                                    break;
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case -31725917:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_upcoming") && (bestResultUpcoming = searchItemDto2.getBestResultUpcoming()) != null && (R = o5g.R(bestResultUpcoming)) != null) {
                                                    obj3 = new v3p(R);
                                                    break;
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case 306830423:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_clip") && (bestResultClip = searchItemDto2.getBestResultClip()) != null && (p0 = o2g.p0(bestResultClip)) != null) {
                                                    obj3 = new w3p(p0);
                                                    break;
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case 307416064:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                j3 = j;
                                                if (type2.equals("best_result_wave") && (bestResultWave = searchItemDto2.getBestResultWave()) != null) {
                                                    List seeds = bestResultWave.getSeeds();
                                                    if (seeds != null) {
                                                        ArrayList O = CollectionsKt.O(seeds);
                                                        String title3 = bestResultWave.getTitle();
                                                        if (title3 != null) {
                                                            String header = bestResultWave.getHeader();
                                                            String bgImageUrl = bestResultWave.getBgImageUrl();
                                                            ?? jcvVar = bgImageUrl != null ? new jcv(bgImageUrl, WebPath$Storage.AVATARS_NO_CROP) : j8qVar;
                                                            String compactImageUrl = bestResultWave.getCompactImageUrl();
                                                            ?? jcvVar2 = compactImageUrl != null ? new jcv(compactImageUrl, WebPath$Storage.AVATARS_NO_CROP) : j8qVar;
                                                            String stationId = bestResultWave.getStationId();
                                                            if (stationId != null) {
                                                                WaveColorsDto colors = bestResultWave.getColors();
                                                                ?? average = colors != null ? colors.getAverage() : j8qVar;
                                                                WaveColorsDto colors2 = bestResultWave.getColors();
                                                                r9 = new zsu(title3, header, jcvVar, jcvVar2, stationId, O, new rnu(average, colors2 != null ? colors2.getWaveText() : j8qVar));
                                                                if (r9 != 0) {
                                                                    AgentDto agent = bestResultWave.getAgent();
                                                                    i3pVar = new x3p(r9, agent != null ? w1g.E(agent) : j8qVar);
                                                                    obj3 = i3pVar;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    r9 = j8qVar;
                                                    if (r9 != 0) {
                                                    }
                                                }
                                                obj3 = j8qVar;
                                                break;
                                            case 541056857:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                if (type2.equals("best_result_playlist") && (bestResultPlaylist = searchItemDto2.getBestResultPlaylist()) != null && (playlist = bestResultPlaylist.getPlaylist()) != null && (H = neg.H(playlist)) != null && (likesCount3 = bestResultPlaylist.getLikesCount()) != null) {
                                                    int intValue3 = likesCount3.intValue();
                                                    Integer trackCount = bestResultPlaylist.getTrackCount();
                                                    if (trackCount != null) {
                                                        int intValue4 = trackCount.intValue();
                                                        TrailerDto trailer3 = bestResultPlaylist.getTrailer();
                                                        if (trailer3 != null) {
                                                            j3 = j;
                                                            z6 = Intrinsics.d(trailer3.getAvailable(), Boolean.TRUE);
                                                        } else {
                                                            j3 = j;
                                                            z6 = false;
                                                        }
                                                        i3pVar = new o3p(H, intValue3, intValue4, z6);
                                                        obj3 = i3pVar;
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 803907326:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                if (type2.equals("best_result_book_chapter")) {
                                                    TrackDto bestResultBookChapter = searchItemDto2.getBestResultBookChapter();
                                                    if (bestResultBookChapter != null && (a2 = wts.a(bestResultBookChapter)) != null) {
                                                        obj3 = new k3p(a2);
                                                        j3 = j;
                                                        break;
                                                    }
                                                    obj3 = j8qVar;
                                                    j3 = j;
                                                }
                                                break;
                                            case 919955016:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                if (type2.equals("best_result_album")) {
                                                    SearchBestResultAlbumDto bestResultAlbum = searchItemDto2.getBestResultAlbum();
                                                    if (bestResultAlbum == null || (album4 = bestResultAlbum.getAlbum()) == null || (J5 = xee.J(album4)) == null || (artists3 = bestResultAlbum.getArtists()) == null) {
                                                        z5 = booleanValue2;
                                                        obj3 = j8qVar;
                                                        j3 = j;
                                                        break;
                                                    } else {
                                                        ArrayList arrayList7 = new ArrayList();
                                                        for (ArtistDomainItemDto artistDomainItemDto3 : artists3) {
                                                            if (artistDomainItemDto3 != null) {
                                                                searchBestResultAlbumDto = bestResultAlbum;
                                                                j8qVar3 = ltg.K(artistDomainItemDto3);
                                                            } else {
                                                                searchBestResultAlbumDto = bestResultAlbum;
                                                                j8qVar3 = j8qVar;
                                                            }
                                                            if (j8qVar3 != null) {
                                                                arrayList7.add(j8qVar3);
                                                            }
                                                            bestResultAlbum = searchBestResultAlbumDto;
                                                        }
                                                        TrailerDto trailer4 = bestResultAlbum.getTrailer();
                                                        if (trailer4 != null) {
                                                            z5 = booleanValue2;
                                                            z7 = Intrinsics.d(trailer4.getAvailable(), Boolean.TRUE);
                                                        } else {
                                                            z5 = booleanValue2;
                                                            z7 = false;
                                                        }
                                                        obj3 = new h3p(J5, arrayList7, z7);
                                                        j3 = j;
                                                    }
                                                }
                                                z5 = booleanValue2;
                                                break;
                                            case 937679140:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                if (type2.equals("best_result_track")) {
                                                    TrackDto bestResultTrack = searchItemDto2.getBestResultTrack();
                                                    if (bestResultTrack != null && (a3 = wts.a(bestResultTrack)) != null) {
                                                        obj3 = new u3p(a3);
                                                        z5 = booleanValue2;
                                                        j3 = j;
                                                        break;
                                                    }
                                                    obj3 = j8qVar;
                                                    z5 = booleanValue2;
                                                    j3 = j;
                                                }
                                                z5 = booleanValue2;
                                                break;
                                            case 1184944191:
                                                it = it4;
                                                c5bVar5 = c5bVar7;
                                                if (type2.equals("best_result_concert")) {
                                                    ConcertDto bestResultConcert = searchItemDto2.getBestResultConcert();
                                                    if (bestResultConcert != null && (a4 = nu5.a(bestResultConcert)) != null) {
                                                        obj3 = new l3p(a4);
                                                        z5 = booleanValue2;
                                                        j3 = j;
                                                        break;
                                                    }
                                                    obj3 = j8qVar;
                                                    z5 = booleanValue2;
                                                    j3 = j;
                                                }
                                                z5 = booleanValue2;
                                                break;
                                            case 2050834828:
                                                it = it4;
                                                if (type2.equals("best_result_non_music")) {
                                                    SearchBestResultNonMusicDto bestResultNonMusic = searchItemDto2.getBestResultNonMusic();
                                                    if (bestResultNonMusic == null || (album5 = bestResultNonMusic.getAlbum()) == null || (J6 = xee.J(album5)) == null || (artists4 = bestResultNonMusic.getArtists()) == null) {
                                                        c5bVar5 = c5bVar7;
                                                        obj3 = j8qVar;
                                                        z5 = booleanValue2;
                                                        j3 = j;
                                                        break;
                                                    } else {
                                                        ArrayList arrayList8 = new ArrayList();
                                                        c5b c5bVar8 = c5bVar7;
                                                        for (ArtistDomainItemDto artistDomainItemDto4 : artists4) {
                                                            if (artistDomainItemDto4 != null) {
                                                                c5bVar6 = c5bVar8;
                                                                j8qVar4 = ltg.K(artistDomainItemDto4);
                                                            } else {
                                                                c5bVar6 = c5bVar8;
                                                                j8qVar4 = j8qVar;
                                                            }
                                                            if (j8qVar4 != null) {
                                                                arrayList8.add(j8qVar4);
                                                            }
                                                            c5bVar8 = c5bVar6;
                                                        }
                                                        c5bVar5 = c5bVar8;
                                                        obj3 = new m3p(J6, bestResultNonMusic.getReleaseYear(), arrayList8);
                                                        z5 = booleanValue2;
                                                        j3 = j;
                                                    }
                                                }
                                                c5bVar5 = c5bVar7;
                                                z5 = booleanValue2;
                                                break;
                                        }
                                        if (obj3 == null) {
                                            arrayList3.add(obj3);
                                        }
                                        it4 = it;
                                        booleanValue2 = z5;
                                        c5bVar7 = c5bVar5;
                                        j = j3;
                                    }
                                    it = it4;
                                    c5bVar5 = c5bVar7;
                                    z5 = booleanValue2;
                                } else {
                                    it = it4;
                                    c5bVar5 = c5bVar7;
                                    z5 = booleanValue2;
                                }
                                j3 = j;
                                obj3 = j8qVar;
                                if (obj3 == null) {
                                }
                                it4 = it;
                                booleanValue2 = z5;
                                c5bVar7 = c5bVar5;
                                j = j3;
                            }
                            c5bVar2 = c5bVar7;
                            z4 = booleanValue2;
                            j2 = j;
                            c5bVar3 = arrayList3;
                        } else {
                            c5bVar2 = c5bVar;
                            z4 = booleanValue2;
                            j2 = j;
                            c5bVar3 = c5b.a;
                        }
                        if (z4) {
                            List<SearchItemDto> queryToVibeResults = searchResultDto.getQueryToVibeResults();
                            if (queryToVibeResults != null) {
                                ?? arrayList9 = new ArrayList();
                                for (SearchItemDto searchItemDto3 : queryToVibeResults) {
                                    Object d4pVar = (searchItemDto3 == null || !Intrinsics.d(searchItemDto3.getType(), "q2v_wave") || (queryToVibeWave = searchItemDto3.getQueryToVibeWave()) == null || (wave = queryToVibeWave.getWave()) == null || (I = p6g.I(wave)) == null) ? j8qVar : new d4p(I);
                                    if (d4pVar != null) {
                                        arrayList9.add(d4pVar);
                                    }
                                }
                                c5bVar4 = arrayList9;
                            } else {
                                c5bVar4 = c5b.a;
                            }
                        } else {
                            c5bVar4 = c5b.a;
                        }
                        String searchRequestId = searchResultDto.getSearchRequestId();
                        if (searchRequestId != null) {
                            List<SearchFilterDto> filters = searchResultDto.getFilters();
                            if (filters != null) {
                                arrayList = new ArrayList();
                                for (SearchFilterDto searchFilterDto : filters) {
                                    if (searchFilterDto != null) {
                                        String id2 = searchFilterDto.getId();
                                        if (id2 != null) {
                                            switch (id2.hashCode()) {
                                                case -1409097913:
                                                    if (id2.equals("artist")) {
                                                        obj2 = t1p.f;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case -992041166:
                                                    if (id2.equals("kids_podcast")) {
                                                        obj2 = t1p.n;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case -895767710:
                                                    if (id2.equals("spoken")) {
                                                        obj2 = t1p.j;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case -405568764:
                                                    if (id2.equals(str18)) {
                                                        obj2 = t1p.h;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case -361151021:
                                                    if (id2.equals("kids_music")) {
                                                        obj2 = t1p.k;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case -69356017:
                                                    if (id2.equals("spoken_playlist")) {
                                                        obj2 = t1p.p;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 115029:
                                                    if (id2.equals("top")) {
                                                        obj2 = t1p.a;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 3029737:
                                                    if (id2.equals("book")) {
                                                        obj2 = t1p.i;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 3056464:
                                                    if (id2.equals(str20)) {
                                                        obj2 = z3 ? t1p.q : j8qVar;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 92896879:
                                                    if (id2.equals(str21)) {
                                                        obj2 = t1p.e;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 110621003:
                                                    if (id2.equals("track")) {
                                                        obj2 = t1p.d;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 112905370:
                                                    if (id2.equals("waves")) {
                                                        obj2 = t1p.b;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 126563707:
                                                    if (id2.equals("kids_book")) {
                                                        obj2 = t1p.m;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 878699364:
                                                    if (id2.equals("kids_playlist")) {
                                                        obj2 = t1p.l;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 951024294:
                                                    if (id2.equals("concert")) {
                                                        obj2 = t1p.c;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 1856260468:
                                                    if (id2.equals("kids_spoken")) {
                                                        obj2 = t1p.o;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                                case 1879474642:
                                                    if (id2.equals("playlist")) {
                                                        obj2 = t1p.g;
                                                        str12 = str18;
                                                        str13 = str20;
                                                        str14 = str21;
                                                        r14 = obj2;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            if (r14 != 0 && (id = searchFilterDto.getId()) != null && (displayName = searchFilterDto.getDisplayName()) != null) {
                                                h8qVar = new h8q(id, displayName, r14);
                                                if (h8qVar != null) {
                                                    arrayList.add(h8qVar);
                                                }
                                                str18 = str12;
                                                str20 = str13;
                                                str21 = str14;
                                                j8qVar = null;
                                            }
                                        }
                                        str12 = str18;
                                        str13 = str20;
                                        str14 = str21;
                                        v3w.l("Unexpected search filter type: ", id2, 5, "SearchFilterParser", j8qVar);
                                        r14 = t1p.s;
                                        if (r14 != 0) {
                                            h8qVar = new h8q(id, displayName, r14);
                                            if (h8qVar != null) {
                                            }
                                            str18 = str12;
                                            str20 = str13;
                                            str21 = str14;
                                            j8qVar = null;
                                        }
                                    } else {
                                        str12 = str18;
                                        str13 = str20;
                                        str14 = str21;
                                    }
                                    h8qVar = null;
                                    if (h8qVar != null) {
                                    }
                                    str18 = str12;
                                    str20 = str13;
                                    str21 = str14;
                                    j8qVar = null;
                                }
                            } else {
                                arrayList = null;
                            }
                            k8qVar = new k8q(str19, text, searchRequestId, arrayList, j8qVar2, CollectionsKt.g0(CollectionsKt.g0(c5bVar4, c5bVar3), c5bVar2), !Intrinsics.d(searchResultDto.getLastPage(), Boolean.TRUE), !c5bVar3.isEmpty());
                            J = k8qVar != null ? new nj6(null) : new qj6(k8qVar);
                        }
                    }
                    k8qVar = j8qVar;
                    if (k8qVar != null) {
                    }
                }
                if (!(J instanceof qj6)) {
                    e8q a9 = e8q.a(e8qVar, zzpVar.a() - j2);
                    h6iVar.getClass();
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.u("query", a9.a);
                    jsonObject.u("context", a9.b.name());
                    jsonObject.u("filterId", a9.d);
                    jsonObject.u("artistId", a9.c);
                    jsonObject.s(Integer.valueOf(a9.e), Constants.KEY_PAGE);
                    jsonObject.s(Long.valueOf(a9.f), "time");
                    h6iVar.e().b(h6i.h(g6i.OnlineSearchElapsed, jsonObject));
                    return J;
                }
                if (J instanceof nj6) {
                    return J;
                }
                if (!(J instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                ssg.a(3, "SearchRepository", "Network error", ((pj6) J).a());
                e8q a10 = e8q.a(e8qVar, zzpVar.a() - j2);
                MixedSearchException[] mixedSearchExceptionArr = MixedSearchException.a;
                h6iVar.getClass();
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.u("query", a10.a);
                jsonObject2.u("context", a10.b.name());
                jsonObject2.u("filterId", a10.d);
                jsonObject2.u("artistId", a10.c);
                jsonObject2.u("error", "Network error");
                jsonObject2.s(Long.valueOf(a10.f), "time");
                h6iVar.e().b(h6i.h(g6i.OnlineSearchError, jsonObject2));
                return J;
            }
        }
        f5pVar = new f5p(this, cg6Var);
        Object obj62 = f5pVar.o;
        nm6 nm6Var2 = nm6.a;
        i2 = f5pVar.q;
        zzp zzpVar22 = this.d;
        if (i2 != 0) {
        }
        biiVar = (bii) obj;
        if (biiVar instanceof aii) {
        }
        if (!(J instanceof qj6)) {
        }
    }
}
