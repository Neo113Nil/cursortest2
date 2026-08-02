package defpackage;

import com.yandex.music.shared.artist.screen.data.release.ArtistReleaseDto;
import com.yandex.music.shared.artist.screen.data.release.ArtistReleaseResponseDto;
import com.yandex.music.shared.artist.screen.network.ArtistReleaseApi;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class ah1 {
    public final jyr a;

    public ah1(upq upqVar) {
        upqVar.getClass();
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        zg1 zg1Var;
        int i;
        bii biiVar;
        c5b c5bVar;
        lt J;
        qc7 releaseDate;
        Date date;
        qg1 qg1Var;
        if (cg6Var instanceof zg1) {
            zg1Var = (zg1) cg6Var;
            int i2 = zg1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zg1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = zg1Var.j;
                nm6 nm6Var = nm6.a;
                i = zg1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistReleaseResponseDto>> a = ((ArtistReleaseApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    zg1Var.l = 1;
                    obj = swf.N(a, zg1Var);
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
                ArtistReleaseResponseDto artistReleaseResponseDto = (ArtistReleaseResponseDto) ((aii) biiVar).a;
                ArtistReleaseDto release = artistReleaseResponseDto.getRelease();
                if (release != null) {
                    List<ArtistDomainItemDto> artists = release.getArtists();
                    if (artists != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ArtistDomainItemDto artistDomainItemDto : artists) {
                            u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                            if (K != null) {
                                arrayList.add(K);
                            }
                        }
                        boolean isEmpty = arrayList.isEmpty();
                        c5bVar = arrayList;
                        if (isEmpty) {
                            c5bVar = null;
                        }
                    }
                    c5bVar = c5b.a;
                    AlbumDomainItemDto album = release.getAlbum();
                    if (album != null && (J = xee.J(album)) != null && (releaseDate = release.getReleaseDate()) != null && (date = releaseDate.b) != null) {
                        og1 og1Var = new og1(c5bVar, J, date);
                        BlockAnalyticsDataDto analytics = artistReleaseResponseDto.getAnalytics();
                        qg1Var = new qg1(og1Var, analytics != null ? saf.n0(analytics) : null);
                        return qg1Var != null ? new nj6(null) : new qj6(qg1Var);
                    }
                }
                qg1Var = null;
                if (qg1Var != null) {
                }
            }
        }
        zg1Var = new zg1(this, cg6Var);
        Object obj2 = zg1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = zg1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
