package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.gdpr.data.GdprApi;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import kotlin.Unit;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class t1d {
    public final jyr a;

    public t1d(jyr jyrVar) {
        this.a = jyrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        s1d s1dVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof s1d) {
            s1dVar = (s1d) cg6Var;
            int i2 = s1dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s1dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = s1dVar.j;
                nm6 nm6Var = nm6.a;
                i = s1dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> a = ((GdprApi) this.a.getValue()).a(new o3f(ConstantDeviceInfo.APP_PLATFORM));
                    s1dVar.l = 1;
                    obj = swf.O(a, Unit.class, s1dVar);
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
        s1dVar = new s1d(this, cg6Var);
        Object obj2 = s1dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = s1dVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
