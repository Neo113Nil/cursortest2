package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.dto.concert.ConcertDto;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class hu5 {
    public final xv5 a;

    public hu5(xv5 xv5Var) {
        this.a = xv5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x0049, B:13:0x0051, B:16:0x0058, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: IOException -> 0x0027, IllegalRequestOnNetworkModeException -> 0x002a, MusicCommonHttpException -> 0x002d, MusicBackendHttpException -> 0x0030, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x002a, MusicBackendHttpException -> 0x0030, MusicCommonHttpException -> 0x002d, IOException -> 0x0027, blocks: (B:10:0x0023, B:11:0x0049, B:13:0x0051, B:16:0x0058, B:21:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        gu5 gu5Var;
        int i;
        try {
            if (cg6Var instanceof gu5) {
                gu5Var = (gu5) cg6Var;
                int i2 = gu5Var.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gu5Var.l = i2 - Integer.MIN_VALUE;
                    Object obj = gu5Var.j;
                    nm6 nm6Var = nm6.a;
                    i = gu5Var.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        xv5 xv5Var = this.a;
                        gu5Var.l = 1;
                        obj = xv5Var.q(str, false, gu5Var);
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
                    us5 a = nu5.a((ConcertDto) obj);
                    return a != null ? new nj6(null) : new qj6(a);
                }
            }
            if (i != 0) {
            }
            us5 a2 = nu5.a((ConcertDto) obj);
            if (a2 != null) {
            }
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError = e2.b;
            String name = musicBackendInvocationError.getName();
            String str2 = name == null ? "" : name;
            String message = musicBackendInvocationError.getMessage();
            return new kj6(e2.a, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(10, e4)));
        }
        gu5Var = new gu5(this, cg6Var);
        Object obj2 = gu5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = gu5Var.l;
    }
}
