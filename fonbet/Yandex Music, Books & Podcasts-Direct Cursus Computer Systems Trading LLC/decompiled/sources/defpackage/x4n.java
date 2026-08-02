package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import kotlin.Unit;
import retrofit2.Call;
import ru.yandex.music.push.update.PushApi;

/* loaded from: classes6.dex */
public final class x4n {
    public final PushApi a;

    public x4n(PushApi pushApi) {
        pushApi.getClass();
        this.a = pushApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, cg6 cg6Var) {
        w4n w4nVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof w4n) {
            w4nVar = (w4n) cg6Var;
            int i2 = w4nVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w4nVar.l = i2 - Integer.MIN_VALUE;
                Object obj = w4nVar.j;
                nm6 nm6Var = nm6.a;
                i = w4nVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<Unit> a = this.a.a(str, str2);
                    w4nVar.l = 1;
                    obj = swf.O(a, Unit.class, w4nVar);
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
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str3 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str3, message == null ? "" : message, xhiVar.a);
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
        w4nVar = new w4n(this, cg6Var);
        Object obj2 = w4nVar.j;
        nm6 nm6Var2 = nm6.a;
        i = w4nVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
