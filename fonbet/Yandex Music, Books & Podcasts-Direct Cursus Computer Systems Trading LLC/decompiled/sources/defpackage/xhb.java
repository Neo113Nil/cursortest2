package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;
import ru.yandex.music.network.response.eventdata.EventDataDto;

/* loaded from: classes6.dex */
public final class xhb {
    public final gxm a;

    public xhb(gxm gxmVar) {
        this.a = gxmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, cg6 cg6Var) {
        whb whbVar;
        int i;
        try {
            if (cg6Var instanceof whb) {
                whbVar = (whb) cg6Var;
                int i2 = whbVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    whbVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = whbVar.j;
                    nm6 nm6Var = nm6.a;
                    i = whbVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        gxm gxmVar = this.a;
                        whbVar.l = 1;
                        obj = gxmVar.j(str, z, whbVar);
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
                    return new qj6(q6k.J((EventDataDto) obj));
                }
            }
            if (i != 0) {
            }
            return new qj6(q6k.J((EventDataDto) obj));
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
            return new oj6(btf.b(new ur(12, e4)));
        }
        whbVar = new whb(this, cg6Var);
        Object obj2 = whbVar.j;
        nm6 nm6Var2 = nm6.a;
        i = whbVar.l;
    }
}
