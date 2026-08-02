package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.promo.data.AlbumPromoApi;
import com.yandex.music.shared.promo.data.AlbumPromoDto;
import com.yandex.music.shared.promo.data.AlbumPromoListDto;
import com.yandex.music.shared.promo.data.PlaybackReportingPayloadDto;
import com.yandex.music.shared.promo.data.PromoReportingPayloadDto;
import com.yandex.music.shared.promo.data.ReportingConfigBundleDto;
import com.yandex.music.shared.promo.data.ReportingConfigDto;
import com.yandex.music.shared.promo.data.UtmPayloadDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class ox {
    public final AlbumPromoApi a;

    public ox(AlbumPromoApi albumPromoApi) {
        this.a = albumPromoApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, b80 b80Var, cg6 cg6Var) {
        nx nxVar;
        int i;
        bii biiVar;
        tw twVar;
        AlbumPromoDto albumPromoDto;
        ow owVar;
        wzn wznVar;
        AlbumDomainItemDto album;
        lt J;
        EntityCoverDto cover;
        u9b V;
        Object obj;
        u51 u51Var;
        n4l n4lVar;
        String clickUrl;
        Object obj2;
        if (cg6Var instanceof nx) {
            nxVar = (nx) cg6Var;
            int i2 = nxVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nxVar.l = i2 - Integer.MIN_VALUE;
                Object obj3 = nxVar.j;
                nm6 nm6Var = nm6.a;
                i = nxVar.l;
                if (i != 0) {
                    qgg.h0(obj3);
                    Call<MusicBackendResponse<AlbumPromoListDto>> b = this.a.b(str, b80Var, null);
                    nxVar.l = 1;
                    obj3 = swf.N(b, nxVar);
                    if (obj3 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj3);
                }
                biiVar = (bii) obj3;
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
                AlbumPromoListDto albumPromoListDto = (AlbumPromoListDto) ((aii) biiVar).a;
                albumPromoListDto.getClass();
                List albumBanners = albumPromoListDto.getAlbumBanners();
                if (albumBanners != null && (albumPromoDto = (AlbumPromoDto) CollectionsKt.firstOrNull(albumBanners)) != null) {
                    List<ArtistDomainItemDto> artists = albumPromoDto.getArtists();
                    if (artists != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ArtistDomainItemDto artistDomainItemDto : artists) {
                            u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                            if (K != null) {
                                arrayList.add(K);
                            }
                        }
                        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
                        if (arrayList2 != null && (album = albumPromoDto.getAlbum()) != null && (J = xee.J(album)) != null && (cover = albumPromoDto.getCover()) != null && (V = c3x.V(cover)) != null) {
                            wfl wflVar = fxm.b;
                            String coverContentMode = albumPromoDto.getCoverContentMode();
                            wflVar.getClass();
                            Iterator it = fxm.e.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((fxm) obj).a.equals(coverContentMode)) {
                                    break;
                                }
                            }
                            fxm fxmVar = (fxm) obj;
                            if (fxmVar == null) {
                                fxmVar = fxm.c;
                            }
                            fxm fxmVar2 = fxmVar;
                            String artistId = albumPromoDto.getArtistId();
                            if (artistId != null) {
                                Iterator it2 = arrayList2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    if (Intrinsics.d(((u51) obj2).a, artistId)) {
                                        break;
                                    }
                                }
                                u51Var = (u51) obj2;
                            } else {
                                u51Var = null;
                            }
                            PlaybackReportingPayloadDto playbackReportingPayload = albumPromoDto.getPlaybackReportingPayload();
                            if (playbackReportingPayload != null) {
                                String yclid = playbackReportingPayload.getYclid();
                                if (yclid == null) {
                                    n4lVar = null;
                                } else {
                                    UtmPayloadDto utm = playbackReportingPayload.getUtm();
                                    n4lVar = new n4l(yclid, utm != null ? new ewt(utm.getSource(), utm.getMedium(), utm.getCampaign(), utm.getGroup(), utm.getContent(), utm.getTerm()) : null);
                                }
                                if (n4lVar != null) {
                                    PromoReportingPayloadDto promoPayload = albumPromoDto.getPromoPayload();
                                    owVar = new ow(J, arrayList2, u51Var, V, fxmVar2, n4lVar, (promoPayload == null || (clickUrl = promoPayload.getClickUrl()) == null) ? null : new lxm(clickUrl));
                                    if (owVar != null) {
                                        ReportingConfigBundleDto reportingConfig = albumPromoListDto.getReportingConfig();
                                        if (reportingConfig != null) {
                                            ReportingConfigDto blockRender = reportingConfig.getBlockRender();
                                            diu t0 = blockRender != null ? bkp.t0(blockRender, 0) : null;
                                            ReportingConfigDto blockImpression = reportingConfig.getBlockImpression();
                                            diu t02 = blockImpression != null ? bkp.t0(blockImpression, 2100) : null;
                                            ReportingConfigDto adImpressions = reportingConfig.getAdImpressions();
                                            wznVar = new wzn(t0, t02, adImpressions != null ? bkp.t0(adImpressions, 2100) : null);
                                        } else {
                                            wznVar = null;
                                        }
                                        twVar = new tw(owVar, wznVar);
                                        return twVar != null ? new nj6(null) : new qj6(twVar);
                                    }
                                }
                            }
                        }
                    }
                    owVar = null;
                    if (owVar != null) {
                    }
                }
                twVar = null;
                if (twVar != null) {
                }
            }
        }
        nxVar = new nx(this, cg6Var);
        Object obj32 = nxVar.j;
        nm6 nm6Var2 = nm6.a;
        i = nxVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj32;
        if (biiVar instanceof aii) {
        }
    }
}
