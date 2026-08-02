package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.donation.DonationDomainItemDto;
import com.yandex.music.skeleton.blocks.donations.data.DonationDto;
import com.yandex.music.skeleton.blocks.donations.data.DonationsBlockApi;
import com.yandex.music.skeleton.blocks.donations.data.DonationsListDto;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class c8a {
    public final jyr a;

    public c8a(upq upqVar) {
        this.a = btf.b(new z26(upqVar, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z7a z7aVar, boolean z, cg6 cg6Var) {
        b8a b8aVar;
        int i;
        bii biiVar;
        ArrayList arrayList;
        DonationDomainItemDto data;
        if (cg6Var instanceof b8a) {
            b8aVar = (b8a) cg6Var;
            int i2 = b8aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b8aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = b8aVar.j;
                nm6 nm6Var = nm6.a;
                i = b8aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<DonationsListDto>> a = ((DonationsBlockApi) this.a.getValue()).a(z7aVar.b.a, men.G(z7aVar.a), z ? "no-cache" : null);
                    b8aVar.l = 1;
                    obj = swf.N(a, b8aVar);
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
                if (!(biiVar instanceof aii)) {
                    List<DonationDto> donations = ((DonationsListDto) ((aii) biiVar).a).getDonations();
                    if (donations != null) {
                        arrayList = new ArrayList();
                        for (DonationDto donationDto : donations) {
                            m7a G = (donationDto == null || (data = donationDto.getData()) == null) ? null : lxe.G(data);
                            if (G != null) {
                                arrayList.add(G);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return arrayList == null ? new nj6(null) : new qj6(arrayList);
                }
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
        }
        b8aVar = new b8a(this, cg6Var);
        Object obj2 = b8aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = b8aVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
