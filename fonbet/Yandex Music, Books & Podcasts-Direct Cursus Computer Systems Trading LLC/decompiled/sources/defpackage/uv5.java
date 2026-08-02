package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.concert.info.screen.network.ConcertHeaderApi;
import com.yandex.music.shared.concert.info.screen.network.data.ConcertDescriptionDto;
import com.yandex.music.shared.concert.info.screen.network.data.ConcertHeaderDataDto;
import com.yandex.music.shared.dto.concert.ConcertPriceDto;
import com.yandex.music.shared.dto.concert.ConcertShortDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class uv5 {
    public final upq a;
    public final jyr b = btf.b(new r25(12, this));

    public uv5(upq upqVar) {
        this.a = upqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0033  */
    /* JADX WARN: Type inference failed for: r2v16, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, cg6 cg6Var) {
        tv5 tv5Var;
        int i;
        bii biiVar;
        pv5 pv5Var;
        h06 C;
        ?? r3;
        qv5 qv5Var;
        List list;
        if (cg6Var instanceof tv5) {
            tv5Var = (tv5) cg6Var;
            int i2 = tv5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tv5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = tv5Var.j;
                nm6 nm6Var = nm6.a;
                i = tv5Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ConcertHeaderDataDto>> a = ((ConcertHeaderApi) this.b.getValue()).a(str, z ? "no-cache" : null);
                    tv5Var.l = 1;
                    obj = swf.N(a, tv5Var);
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
                ConcertHeaderDataDto concertHeaderDataDto = (ConcertHeaderDataDto) ((aii) biiVar).a;
                concertHeaderDataDto.getClass();
                ConcertShortDto concert = concertHeaderDataDto.getConcert();
                if (concert == null || (C = hag.C(concert, 1000)) == null) {
                    pv5Var = null;
                } else {
                    mu5 mu5Var = new mu5(C.a, C.h, C.b, C.i, C.j, C.e, C.g, C.k, C.l, C.f, C.d, C.m);
                    ConcertPriceDto minPrice = concertHeaderDataDto.getMinPrice();
                    uy5 b = minPrice != null ? nu5.b(minPrice) : null;
                    List<EntityCoverDto> covers = concertHeaderDataDto.getCovers();
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
                    List list2 = r3;
                    ConcertDescriptionDto description = concertHeaderDataDto.getDescription();
                    if (description != null) {
                        String text = description.getText();
                        qv5Var = text == null ? null : new qv5(text, description.getSource(), description.getGenre());
                    } else {
                        qv5Var = null;
                    }
                    String leadArtistId = concertHeaderDataDto.getLeadArtistId();
                    List<ArtistDomainItemDto> artists = concertHeaderDataDto.getArtists();
                    if (artists != null) {
                        list = new ArrayList();
                        for (ArtistDomainItemDto artistDomainItemDto : artists) {
                            u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                            if (K != null) {
                                list.add(K);
                            }
                        }
                    } else {
                        list = c5b.a;
                    }
                    pv5Var = new pv5(mu5Var, b, list2, qv5Var, leadArtistId, list);
                }
                return pv5Var == null ? new nj6(null) : new qj6(pv5Var);
            }
        }
        tv5Var = new tv5(this, cg6Var);
        Object obj2 = tv5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = tv5Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
