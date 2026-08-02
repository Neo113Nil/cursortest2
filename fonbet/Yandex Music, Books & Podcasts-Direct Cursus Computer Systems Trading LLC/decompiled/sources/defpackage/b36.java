package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.concert.ConcertShortDto;
import com.yandex.music.skeleton.blocks.concerts.data.ConcertTopListDto;
import com.yandex.music.skeleton.blocks.concerts.data.ConcertsBlockApi;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class b36 {
    public final jyr a;

    public b36(upq upqVar) {
        this.a = btf.b(new z26(upqVar, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t26 t26Var, boolean z, String str, cg6 cg6Var) {
        a36 a36Var;
        int i;
        bii biiVar;
        ArrayList arrayList;
        if (cg6Var instanceof a36) {
            a36Var = (a36) cg6Var;
            int i2 = a36Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a36Var.l = i2 - Integer.MIN_VALUE;
                Object obj = a36Var.j;
                nm6 nm6Var = nm6.a;
                i = a36Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ConcertTopListDto>> a = ((ConcertsBlockApi) this.a.getValue()).a(t26Var.b.a, men.G(t26Var.a), z ? "no-cache" : null, str);
                    a36Var.l = 1;
                    obj = swf.N(a, a36Var);
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
                    ConcertTopListDto concertTopListDto = (ConcertTopListDto) ((aii) biiVar).a;
                    int t = wct.t();
                    List<ConcertShortDto> concerts = concertTopListDto.getConcerts();
                    if (concerts != null) {
                        arrayList = new ArrayList();
                        for (ConcertShortDto concertShortDto : concerts) {
                            h06 C = concertShortDto != null ? hag.C(concertShortDto, t) : null;
                            if (C != null) {
                                arrayList.add(C);
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
        }
        a36Var = new a36(this, cg6Var);
        Object obj2 = a36Var.j;
        nm6 nm6Var2 = nm6.a;
        i = a36Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
