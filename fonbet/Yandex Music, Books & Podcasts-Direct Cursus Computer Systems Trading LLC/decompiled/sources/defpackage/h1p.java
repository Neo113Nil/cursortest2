package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.search.api.feedback.SearchFeedbackRequest;
import com.yandex.music.shared.search.network.SearchApi;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class h1p {
    public final SearchApi a;

    public h1p(SearchApi searchApi) {
        this.a = searchApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SearchFeedbackRequest searchFeedbackRequest, cg6 cg6Var) {
        g1p g1pVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof g1p) {
            g1pVar = (g1p) cg6Var;
            int i2 = g1pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g1pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = g1pVar.j;
                nm6 nm6Var = nm6.a;
                i = g1pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> a = this.a.a(searchFeedbackRequest);
                    g1pVar.l = 1;
                    obj = swf.O(a, Unit.class, g1pVar);
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
                    return new qj6(((aii) biiVar).a);
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
        g1pVar = new g1p(this, cg6Var);
        Object obj2 = g1pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = g1pVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
