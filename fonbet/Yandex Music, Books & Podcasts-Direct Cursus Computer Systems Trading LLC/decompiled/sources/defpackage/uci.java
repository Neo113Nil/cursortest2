package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import kotlin.coroutines.Continuation;
import retrofit2.Call;

/* loaded from: classes4.dex */
public interface uci {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object y(uci uciVar, Call call, Continuation continuation) {
        tci tciVar;
        int i;
        bii biiVar;
        if (continuation instanceof tci) {
            tciVar = (tci) continuation;
            int i2 = tciVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tciVar.m = i2 - Integer.MIN_VALUE;
                Object obj = tciVar.k;
                nm6 nm6Var = nm6.a;
                i = tciVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tciVar.j = call;
                    tciVar.m = 1;
                    obj = swf.N(call, tciVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    call = tciVar.j;
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof xhi)) {
                    xhi xhiVar = (xhi) biiVar;
                    int i3 = xhiVar.b;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    musicBackendInvocationError.getClass();
                    call.getClass();
                    throw new MusicBackendHttpException(i3, musicBackendInvocationError, call.a().a.i);
                }
                if (biiVar instanceof aii) {
                    return ((aii) biiVar).a;
                }
                if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    throw new MusicCommonHttpException(yhiVar.b, yhiVar.c, yhiVar.a);
                }
                if (biiVar instanceof zhi) {
                    throw uwf.J((zhi) biiVar).a();
                }
                b6e.s();
                return null;
            }
        }
        tciVar = new tci(uciVar, continuation);
        Object obj2 = tciVar.k;
        nm6 nm6Var2 = nm6.a;
        i = tciVar.m;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof xhi)) {
        }
    }

    default Object B(Call call, Continuation continuation) {
        return y(this, call, continuation);
    }
}
