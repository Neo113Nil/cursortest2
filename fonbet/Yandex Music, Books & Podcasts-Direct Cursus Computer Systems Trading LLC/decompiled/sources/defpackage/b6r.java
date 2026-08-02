package defpackage;

import com.yandex.music.screen.landing.header.data.SpecialHeaderApi;
import com.yandex.music.screen.landing.header.data.SpecialHeaderBlockDto;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class b6r {
    public final SpecialHeaderApi a;

    public b6r() {
        l18 l18Var = l18.b;
        bdt I = hag.I(upq.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.a = (SpecialHeaderApi) ((upq) qdcVar.C(I)).c().a.b(SpecialHeaderApi.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, cg6 cg6Var) {
        a6r a6rVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof a6r) {
            a6rVar = (a6r) cg6Var;
            int i2 = a6rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a6rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a6rVar.j;
                nm6 nm6Var = nm6.a;
                i = a6rVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<SpecialHeaderBlockDto>> a = this.a.a(z ? "no-cache" : null);
                    a6rVar.l = 1;
                    obj = swf.N(a, a6rVar);
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
                    return new qj6(((SpecialHeaderBlockDto) ((aii) biiVar).a).a());
                }
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
        }
        a6rVar = new a6r(this, cg6Var);
        Object obj2 = a6rVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a6rVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
