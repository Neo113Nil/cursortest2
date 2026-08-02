package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.concert.ConcertWithPriceDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.concerts.ArtistsWithConcertsApi;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.concerts.ArtistsWithConcertsEntitiesDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.concerts.ArtistsWithConcertsEntityDto;
import com.yandex.music.shared.player.screen.skeleton.blocks.data.concerts.ArtistsWithConcertsRequestDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class fq1 {
    public final jyr a;

    public fq1(e0j e0jVar) {
        e0jVar.getClass();
        this.a = btf.b(new w2(e0jVar, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(cg6 cg6Var, String str, ArrayList arrayList) {
        eq1 eq1Var;
        int i;
        bii biiVar;
        gq1 gq1Var;
        rp1 rp1Var;
        String artistId;
        List<ConcertWithPriceDto> concerts;
        if (cg6Var instanceof eq1) {
            eq1Var = (eq1) cg6Var;
            int i2 = eq1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eq1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = eq1Var.j;
                nm6 nm6Var = nm6.a;
                i = eq1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistsWithConcertsEntitiesDto>> a = ((ArtistsWithConcertsApi) this.a.getValue()).a(new ArtistsWithConcertsRequestDto(arrayList), null, str);
                    eq1Var.l = 1;
                    obj = swf.N(a, eq1Var);
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
                ArtistsWithConcertsEntitiesDto artistsWithConcertsEntitiesDto = (ArtistsWithConcertsEntitiesDto) ((aii) biiVar).a;
                artistsWithConcertsEntitiesDto.getClass();
                List<ArtistsWithConcertsEntityDto> items = artistsWithConcertsEntitiesDto.getItems();
                if (items != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ArtistsWithConcertsEntityDto artistsWithConcertsEntityDto : items) {
                        if (artistsWithConcertsEntityDto != null && (artistId = artistsWithConcertsEntityDto.getArtistId()) != null && (concerts = artistsWithConcertsEntityDto.getConcerts()) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (ConcertWithPriceDto concertWithPriceDto : concerts) {
                                s26 D = concertWithPriceDto != null ? hag.D(concertWithPriceDto, wct.t()) : null;
                                if (D != null) {
                                    arrayList3.add(D);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                arrayList3 = null;
                            }
                            if (arrayList3 != null) {
                                rp1Var = new rp1(artistId, arrayList3);
                                if (rp1Var == null) {
                                    arrayList2.add(rp1Var);
                                }
                            }
                        }
                        rp1Var = null;
                        if (rp1Var == null) {
                        }
                    }
                    gq1Var = new gq1(arrayList2);
                } else {
                    gq1Var = null;
                }
                return gq1Var == null ? new nj6(null) : new qj6(gq1Var);
            }
        }
        eq1Var = new eq1(this, cg6Var);
        Object obj2 = eq1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = eq1Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    public fq1() {
        this.a = l18.b.b(hag.I(ggf.class), true);
    }
}
