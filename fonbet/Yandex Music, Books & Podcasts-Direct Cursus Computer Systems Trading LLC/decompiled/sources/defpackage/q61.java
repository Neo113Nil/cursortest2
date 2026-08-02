package defpackage;

import com.yandex.music.shared.artist.screen.data.donations.ArtistDonationsApi;
import com.yandex.music.shared.artist.screen.data.donations.ArtistDonationsDataDto;
import com.yandex.music.shared.artist.screen.data.donations.ArtistDonationsResponseDto;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.donation.DonationDomainItemDto;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class q61 {
    public final jyr a;

    public q61(e0j e0jVar) {
        e0jVar.getClass();
        this.a = btf.b(new w2(e0jVar, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        p61 p61Var;
        int i;
        bii biiVar;
        g61 g61Var;
        DonationDomainItemDto donation;
        if (cg6Var instanceof p61) {
            p61Var = (p61) cg6Var;
            int i2 = p61Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p61Var.l = i2 - Integer.MIN_VALUE;
                Object obj = p61Var.j;
                nm6 nm6Var = nm6.a;
                i = p61Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistDonationsResponseDto>> a = ((ArtistDonationsApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), "no-cache");
                    p61Var.l = 1;
                    obj = swf.N(a, p61Var);
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
                ArtistDonationsResponseDto artistDonationsResponseDto = (ArtistDonationsResponseDto) ((aii) biiVar).a;
                artistDonationsResponseDto.getClass();
                List<ArtistDonationsDataDto> donations = artistDonationsResponseDto.getDonations();
                if (donations != null) {
                    ArrayList arrayList = new ArrayList();
                    for (ArtistDonationsDataDto artistDonationsDataDto : donations) {
                        m7a G = (artistDonationsDataDto == null || (donation = artistDonationsDataDto.getDonation()) == null) ? null : lxe.G(donation);
                        if (G != null) {
                            arrayList.add(G);
                        }
                    }
                    BlockAnalyticsDataDto analytics = artistDonationsResponseDto.getAnalytics();
                    g61Var = new g61(arrayList, analytics != null ? saf.n0(analytics) : null);
                } else {
                    g61Var = null;
                }
                return g61Var == null ? new nj6(null) : new qj6(g61Var);
            }
        }
        p61Var = new p61(this, cg6Var);
        Object obj2 = p61Var.j;
        nm6 nm6Var2 = nm6.a;
        i = p61Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
