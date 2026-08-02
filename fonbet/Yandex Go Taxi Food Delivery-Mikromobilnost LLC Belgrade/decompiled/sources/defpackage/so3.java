package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.FileUploadResponseData;
import com.yandex.messaging.core.net.entities.GetExperimentsResponse;
import com.yandex.messaging.core.net.entities.RequestUserData;
import com.yandex.messaging.internal.net.AuthorizedApiCalls$uploadVoiceFile$1$makeRequest$params$1;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.Arrays;
import ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl;

/* loaded from: classes15.dex */
public final class so3 extends w920 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public so3(mp90 mp90Var, cn3 cn3Var, RequestUserData requestUserData, op90 op90Var, boolean z) {
        this.y = mp90Var;
        this.c = cn3Var;
        this.w = requestUserData;
        this.x = op90Var;
        this.b = z;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        switch (this.a) {
            case 0:
                return ouu.b(((to3) this.c).b, "voice_upload/%s", FileUploadResponseData.class, kvj0Var);
            default:
                ouu ouuVar = (ouu) ((h3y) ((mp90) this.y).B.e).get();
                ouuVar.getClass();
                return ouu.b(ouuVar, "get_experiments", GetExperimentsResponse.class, kvj0Var);
        }
    }

    @Override // defpackage.w920
    public boolean e(ngz ngzVar) {
        switch (this.a) {
            case 1:
                mp90 mp90Var = (mp90) this.y;
                z83.g(null, mp90Var.a.getLooper(), Looper.myLooper());
                if (ho60.b(ngzVar) && !this.b) {
                    mp90Var.A = null;
                    mp90.b(mp90Var, ((op90) this.x).a);
                    return true;
                }
                if (!ho60.a(ngzVar)) {
                    return false;
                }
                mp90Var.A = null;
                ((rj21) mp90Var.B.g).a(25);
                return true;
            default:
                return super.e(ngzVar);
        }
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        int i = this.a;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                ((go3) obj2).D((FileUploadResponseData) obj);
                break;
            default:
                mp90 mp90Var = (mp90) obj2;
                z83.g(null, mp90Var.a.getLooper(), Looper.myLooper());
                mp90Var.b.post(new l9(this, (RequestUserData) this.w, (op90) this.x, (GetExperimentsResponse) obj, 23));
                break;
        }
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                AuthorizedApiCalls$uploadVoiceFile$1$makeRequest$params$1 authorizedApiCalls$uploadVoiceFile$1$makeRequest$params$1 = new AuthorizedApiCalls$uploadVoiceFile$1$makeRequest$params$1();
                authorizedApiCalls$uploadVoiceFile$1$makeRequest$params$1.put("recognized", Boolean.toString(this.b));
                evu evuVar = ((to3) obj).c;
                String format = String.format("voice_upload/%s", Arrays.copyOf(new Object[]{(String) this.w}, 1));
                oif0 oif0Var = (oif0) this.x;
                t4j0 c = evuVar.c(format, authorizedApiCalls$uploadVoiceFile$1$makeRequest$params$1);
                c.e("POST", oif0Var);
                return c;
            default:
                w040 w040Var = ((mp90) this.y).B;
                t4j0 a = ((cn3) obj).a(((ouu) ((h3y) w040Var.e).get()).a(null, "get_experiments"));
                String deviceId = AppMetricaYandex.getDeviceId(((gm51) ((q6v) w040Var.h)).a);
                if (deviceId != null) {
                    a.a(ManifestApiImpl.HEADER_DEVICE_ID, deviceId);
                }
                return a;
        }
    }

    public so3(to3 to3Var, String str, oif0 oif0Var, boolean z, go3 go3Var) {
        this.c = to3Var;
        this.w = str;
        this.x = oif0Var;
        this.b = z;
        this.y = go3Var;
    }
}
