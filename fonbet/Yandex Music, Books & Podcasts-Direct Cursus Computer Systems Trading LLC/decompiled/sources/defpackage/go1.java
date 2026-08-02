package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.artist.ArtistBrandedButtonDto;
import com.yandex.music.shared.dto.artist.ArtistDeprecationDto;
import com.yandex.music.shared.dto.artist.ArtistHeaderDataDto;
import com.yandex.music.shared.dto.artist.ArtistHeaderDonationDto;
import com.yandex.music.shared.dto.artist.ArtistStatsDto;
import com.yandex.music.shared.dto.artist.ArtistTracksPageDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.ArtistsApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class go1 {
    public final ArtistsApi a;

    public go1(e0j e0jVar) {
        this.a = (ArtistsApi) e0jVar.a.b(ArtistsApi.class);
        btf.b(new w2(e0jVar, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r3v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, cg6 cg6Var) {
        eo1 eo1Var;
        int i;
        bii biiVar;
        s91 s91Var;
        u51 K;
        t91 t91Var;
        h21 h21Var;
        ?? r3;
        r51 r51Var;
        Boolean available;
        h21 h21Var2;
        BlockActionDto action;
        o43 b0;
        if (cg6Var instanceof eo1) {
            eo1Var = (eo1) cg6Var;
            int i2 = eo1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eo1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = eo1Var.j;
                nm6 nm6Var = nm6.a;
                i = eo1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistHeaderDataDto>> c = this.a.c(str, z ? "no-cache" : null);
                    eo1Var.l = 1;
                    obj = swf.N(c, eo1Var);
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
                ArtistHeaderDataDto artistHeaderDataDto = (ArtistHeaderDataDto) ((aii) biiVar).a;
                artistHeaderDataDto.getClass();
                ArtistDomainItemDto artist = artistHeaderDataDto.getArtist();
                if (artist == null || (K = ltg.K(artist)) == null) {
                    s91Var = null;
                } else {
                    ArtistHeaderDonationDto donation = artistHeaderDataDto.getDonation();
                    if (donation != null) {
                        String tipUrl = donation.getTipUrl();
                        t91Var = tipUrl == null ? null : new t91(tipUrl);
                    } else {
                        t91Var = null;
                    }
                    ArtistBrandedButtonDto brandedButton = artistHeaderDataDto.getBrandedButton();
                    if (brandedButton != null) {
                        String title = brandedButton.getTitle();
                        if (title == null || (action = brandedButton.getAction()) == null || (b0 = jf0.b0(action)) == null) {
                            h21Var2 = null;
                        } else {
                            Boolean viewBrowser = brandedButton.getViewBrowser();
                            h21Var2 = new h21(title, b0, viewBrowser != null ? viewBrowser.booleanValue() : true);
                        }
                        h21Var = h21Var2;
                    } else {
                        h21Var = null;
                    }
                    Integer likesCount = artistHeaderDataDto.getLikesCount();
                    boolean z2 = false;
                    int intValue = likesCount != null ? likesCount.intValue() : 0;
                    ArtistStatsDto stats = artistHeaderDataDto.getStats();
                    fk1 D = stats != null ? lxe.D(stats) : null;
                    TrailerDto trailer = artistHeaderDataDto.getTrailer();
                    if (trailer != null && (available = trailer.getAvailable()) != null) {
                        z2 = available.booleanValue();
                    }
                    boolean z3 = z2;
                    List<EntityCoverDto> covers = artistHeaderDataDto.getCovers();
                    if (covers != null) {
                        r3 = new ArrayList();
                        for (EntityCoverDto entityCoverDto : covers) {
                            u9b V = entityCoverDto != null ? c3x.V(entityCoverDto) : null;
                            if (V != null) {
                                r3.add(V);
                            }
                        }
                    } else {
                        r3 = c5b.a;
                    }
                    List list = r3;
                    String description = artistHeaderDataDto.getDescription();
                    ArtistDeprecationDto deprecation = artistHeaderDataDto.getDeprecation();
                    if (deprecation != null) {
                        String targetArtistId = deprecation.getTargetArtistId();
                        r51Var = targetArtistId == null ? null : new r51(targetArtistId);
                    } else {
                        r51Var = null;
                    }
                    s91Var = new s91(K, t91Var, h21Var, intValue, D, z3, list, description, r51Var);
                }
                return s91Var == null ? new nj6(null) : new qj6(s91Var);
            }
        }
        eo1Var = new eo1(this, cg6Var);
        Object obj2 = eo1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = eo1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, int i, cg6 cg6Var) {
        fo1 fo1Var;
        int i2;
        if (cg6Var instanceof fo1) {
            fo1Var = (fo1) cg6Var;
            int i3 = fo1Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fo1Var.l = i3 - Integer.MIN_VALUE;
                Object obj = fo1Var.j;
                nm6 nm6Var = nm6.a;
                i2 = fo1Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistTracksPageDto>> b = this.a.b(str, 0, i, null);
                    fo1Var.l = 2;
                    Object g = uwf.g(b, fo1Var);
                    return g == nm6Var ? nm6Var : g;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    qgg.h0(obj);
                    ArtistTracksPageDto artistTracksPageDto = (ArtistTracksPageDto) obj;
                    return artistTracksPageDto == null ? new nj6(null) : new qj6(artistTracksPageDto);
                } catch (IllegalRequestOnNetworkModeException e) {
                    return new oj6(e.a, e.b);
                } catch (MusicBackendHttpException e2) {
                    MusicBackendInvocationError musicBackendInvocationError = e2.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(e2.a, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, e2.c);
                } catch (MusicCommonHttpException e3) {
                    return new lj6(e3.a, e3.b, e3.c);
                } catch (IOException e4) {
                    return new oj6(btf.b(new ur(3, e4)));
                }
            }
        }
        fo1Var = new fo1(this, cg6Var);
        Object obj2 = fo1Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = fo1Var.l;
        if (i2 != 0) {
        }
    }
}
