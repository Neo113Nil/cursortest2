package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.universalentities.UniversalEntityDto;
import com.yandex.music.shared.skeleton.blocks.carousel.CarouselBlockApi;
import com.yandex.music.shared.skeleton.blocks.carousel.CarouselEntitiesDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class j14 {
    public final jyr a;

    public j14(upq upqVar) {
        this.a = btf.b(new w2(upq.b(upqVar, null, new h14(0), 1), 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        i14 i14Var;
        int i;
        bii biiVar;
        r14 r14Var;
        if (cg6Var instanceof i14) {
            i14Var = (i14) cg6Var;
            int i2 = i14Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i14Var.l = i2 - Integer.MIN_VALUE;
                Object obj = i14Var.j;
                nm6 nm6Var = nm6.a;
                i = i14Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<CarouselEntitiesDto>> a = ((CarouselBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    i14Var.l = 1;
                    obj = swf.N(a, i14Var);
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
                CarouselEntitiesDto carouselEntitiesDto = (CarouselEntitiesDto) ((aii) biiVar).a;
                carouselEntitiesDto.getClass();
                List<UniversalEntityDto> items = carouselEntitiesDto.getItems();
                if (items == null && (items = carouselEntitiesDto.getLikedPlaylists()) == null && (items = carouselEntitiesDto.getCreatedPlaylists()) == null) {
                    items = carouselEntitiesDto.getLikedArtists();
                }
                if (items != null) {
                    ArrayList arrayList = new ArrayList();
                    for (UniversalEntityDto universalEntityDto : items) {
                        yit H = universalEntityDto != null ? tyf.H(universalEntityDto) : null;
                        if (H != null) {
                            arrayList.add(H);
                        }
                    }
                    BlockAnalyticsDataDto analytics = carouselEntitiesDto.getAnalytics();
                    r14Var = new r14(arrayList, analytics != null ? saf.n0(analytics) : null);
                } else {
                    r14Var = null;
                }
                return r14Var == null ? new nj6(null) : new qj6(r14Var);
            }
        }
        i14Var = new i14(this, cg6Var);
        Object obj2 = i14Var.j;
        nm6 nm6Var2 = nm6.a;
        i = i14Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
