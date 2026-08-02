package defpackage;

import com.yandex.music.shared.artist.screen.data.presave.ArtistPreSaveResponse;
import com.yandex.music.shared.artist.screen.network.ArtistPreSaveApi;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.artist.PreSaveDomainItemDto;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class fg1 {
    public final jyr a;

    public fg1(upq upqVar) {
        upqVar.getClass();
        e0j c = upqVar.c();
        c.getClass();
        this.a = btf.b(new w2(c, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        eg1 eg1Var;
        int i;
        bii biiVar;
        ikm ikmVar;
        nf1 nf1Var;
        AlbumDomainItemDto album;
        lt J;
        qc7 releaseDate;
        Date date;
        if (cg6Var instanceof eg1) {
            eg1Var = (eg1) cg6Var;
            int i2 = eg1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eg1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = eg1Var.j;
                nm6 nm6Var = nm6.a;
                i = eg1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistPreSaveResponse>> a = ((ArtistPreSaveApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), "no-cache");
                    eg1Var.l = 1;
                    obj = swf.N(a, eg1Var);
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
                ArtistPreSaveResponse artistPreSaveResponse = (ArtistPreSaveResponse) ((aii) biiVar).a;
                PreSaveDomainItemDto release = artistPreSaveResponse.getRelease();
                if (release != null) {
                    Boolean presaved = artistPreSaveResponse.getPresaved();
                    boolean booleanValue = presaved != null ? presaved.booleanValue() : false;
                    List<ArtistDomainItemDto> artists = release.getArtists();
                    if (artists != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ArtistDomainItemDto artistDomainItemDto : artists) {
                            u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                            if (K != null) {
                                arrayList.add(K);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (arrayList != null && (album = release.getAlbum()) != null && (J = xee.J(album)) != null && (releaseDate = release.getReleaseDate()) != null && (date = releaseDate.b) != null) {
                            ikmVar = new ikm(arrayList, J, date);
                            if (ikmVar != null) {
                                BlockAnalyticsDataDto analytics = artistPreSaveResponse.getAnalytics();
                                nf1Var = new nf1(ikmVar, booleanValue, analytics != null ? saf.n0(analytics) : null);
                                return nf1Var != null ? new nj6(null) : new qj6(nf1Var);
                            }
                        }
                    }
                    ikmVar = null;
                    if (ikmVar != null) {
                    }
                }
                nf1Var = null;
                if (nf1Var != null) {
                }
            }
        }
        eg1Var = new eg1(this, cg6Var);
        Object obj2 = eg1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = eg1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
