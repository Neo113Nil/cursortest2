package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.skeleton.blocks.pay_offers.data.PayOffersBlockApi;
import com.yandex.music.skeleton.blocks.pay_offers.data.dto.PayOffersButtonDto;
import com.yandex.music.skeleton.blocks.pay_offers.data.dto.PayOffersDataDto;
import com.yandex.music.skeleton.blocks.pay_offers.data.dto.PayOffersEntityDto;
import retrofit2.Call;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class mck {
    public final jyr a;

    public mck(upq upqVar) {
        this.a = btf.b(new mze(upq.b(upqVar, null, new hpj(21), 1), 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uvn uvnVar, boolean z, cg6 cg6Var) {
        lck lckVar;
        int i;
        bii biiVar;
        PayOffersDataDto payOffersDataDto;
        String text;
        PayOffersButtonDto button;
        String title;
        Boolean selected;
        Object fckVar;
        u9b V;
        if (cg6Var instanceof lck) {
            lckVar = (lck) cg6Var;
            int i2 = lckVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lckVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lckVar.j;
                nm6 nm6Var = nm6.a;
                i = lckVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<PayOffersEntityDto>> a = ((PayOffersBlockApi) this.a.getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null);
                    lckVar.l = 1;
                    obj = swf.N(a, lckVar);
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
                PayOffersEntityDto payOffersEntityDto = (PayOffersEntityDto) ((aii) biiVar).a;
                payOffersEntityDto.getClass();
                if (payOffersEntityDto instanceof PayOffersEntityDto.PayOfferAvailableDto) {
                    payOffersDataDto = ((PayOffersEntityDto.PayOfferAvailableDto) payOffersEntityDto).getData();
                } else if (payOffersEntityDto instanceof PayOffersEntityDto.PayOfferSelectedDto) {
                    payOffersDataDto = ((PayOffersEntityDto.PayOfferSelectedDto) payOffersEntityDto).getData();
                } else {
                    if (!payOffersEntityDto.equals(uck.a)) {
                        b6e.s();
                        return null;
                    }
                    payOffersDataDto = null;
                }
                if (payOffersDataDto == null) {
                    fckVar = gck.a;
                } else {
                    String id = payOffersEntityDto.getId();
                    if (id == null || (text = payOffersDataDto.getText()) == null || (button = payOffersDataDto.getButton()) == null || (title = button.getTitle()) == null || (selected = payOffersDataDto.getButton().getSelected()) == null) {
                        fckVar = null;
                    } else {
                        boolean booleanValue = selected.booleanValue();
                        BlockActionDto action = payOffersDataDto.getButton().getAction();
                        String deeplink = action != null ? action.getDeeplink() : null;
                        EntityCoverDto cover = payOffersDataDto.getCover();
                        fckVar = new fck(id, text, title, (cover == null || (V = c3x.V(cover)) == null) ? null : V.e(wct.s(), WebPath$Storage.AVATARS), deeplink, booleanValue);
                    }
                }
                return fckVar == null ? new nj6(null) : new qj6(fckVar);
            }
        }
        lckVar = new lck(this, cg6Var);
        Object obj2 = lckVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lckVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
