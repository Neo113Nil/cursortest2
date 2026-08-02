package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import com.yandex.music.shared.skeleton.blocks.newreleases.NewReleasesBlockApi;
import com.yandex.music.shared.skeleton.blocks.newreleases.NewReleasesEntitiesDto;
import com.yandex.music.shared.skeleton.blocks.newreleases.NewReleasesEntityDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class p4j {
    public final jyr a;

    public p4j(upq upqVar) {
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new mze(c, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        o4j o4jVar;
        int i;
        bii biiVar;
        b5j b5jVar;
        c5j c5jVar;
        AlbumDomainItemDto album;
        lt J;
        List<ArtistDomainItemDto> artists;
        Boolean available;
        if (cg6Var instanceof o4j) {
            o4jVar = (o4j) cg6Var;
            int i2 = o4jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o4jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = o4jVar.j;
                nm6 nm6Var = nm6.a;
                i = o4jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<NewReleasesEntitiesDto>> a = ((NewReleasesBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    o4jVar.l = 1;
                    obj = swf.N(a, o4jVar);
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
                NewReleasesEntitiesDto newReleasesEntitiesDto = (NewReleasesEntitiesDto) ((aii) biiVar).a;
                newReleasesEntitiesDto.getClass();
                List<NewReleasesEntityDto> newReleases = newReleasesEntitiesDto.getNewReleases();
                if (newReleases != null) {
                    ArrayList arrayList = new ArrayList();
                    for (NewReleasesEntityDto newReleasesEntityDto : newReleases) {
                        if (newReleasesEntityDto == null || (album = newReleasesEntityDto.getAlbum()) == null || (J = xee.J(album)) == null || (artists = newReleasesEntityDto.getArtists()) == null) {
                            c5jVar = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (ArtistDomainItemDto artistDomainItemDto : artists) {
                                u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                                if (K != null) {
                                    arrayList2.add(K);
                                }
                            }
                            EntityCoverDto cover = newReleasesEntityDto.getCover();
                            u9b V = cover != null ? c3x.V(cover) : null;
                            qc7 releaseDate = newReleasesEntityDto.getReleaseDate();
                            Date date = releaseDate != null ? releaseDate.b : null;
                            TrailerDto trailerDto = newReleasesEntityDto.getTrailerDto();
                            c5jVar = new c5j(J, arrayList2, V, date, (trailerDto == null || (available = trailerDto.getAvailable()) == null) ? false : available.booleanValue(), newReleasesEntityDto.getDescription());
                        }
                        if (c5jVar != null) {
                            arrayList.add(c5jVar);
                        }
                    }
                    BlockAnalyticsDataDto analytics = newReleasesEntitiesDto.getAnalytics();
                    b5jVar = new b5j(arrayList, analytics != null ? saf.n0(analytics) : null);
                } else {
                    b5jVar = null;
                }
                return b5jVar == null ? new nj6(null) : new qj6(b5jVar);
            }
        }
        o4jVar = new o4j(this, cg6Var);
        Object obj2 = o4jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = o4jVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
