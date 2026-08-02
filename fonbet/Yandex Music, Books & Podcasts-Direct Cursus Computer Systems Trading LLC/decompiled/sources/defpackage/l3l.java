package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes5.dex */
public final class l3l implements evt, pur {
    public static v1t c(String str, boolean z) {
        str.getClass();
        return z ? v1t.e : gys.MyMusicPodcastEpisodes.a.contains(str) ? v1t.d : dw.MyMusicBooks.a.contains(str) ? v1t.c : !gys.MyMusicWithKids.a.contains(str) ? v1t.b : v1t.f;
    }

    public static Intent d(Context context, List list, int i, wmn wmnVar) {
        context.getClass();
        list.getClass();
        jyr jyrVar = VideoClipActivity.y;
        if (!((lwc) jyrVar.getValue()).b.a()) {
            ((lwc) jyrVar.getValue()).b(owc.a);
            int i2 = TariffPaywallActivity.z;
            return dml.b(context, new lik(vik.f, null, null));
        }
        Intent intent = new Intent(context, (Class<?>) VideoClipActivity.class);
        intent.putExtra("extra.videoclipid", (String[]) list.toArray(new String[0]));
        intent.putExtra("extra.videoclipstartpos", i);
        intent.putExtra("extra.videocliprectype", wmnVar);
        return intent;
    }

    public static Intent e(Context context, List list, int i) {
        jyr jyrVar = VideoClipActivity.y;
        if ((i & 2) != 0) {
            list = null;
        }
        wmn wmnVar = wmn.a;
        context.getClass();
        jyr jyrVar2 = VideoClipActivity.y;
        if (!((lwc) jyrVar2.getValue()).b.a()) {
            ((lwc) jyrVar2.getValue()).b(owc.a);
            int i2 = TariffPaywallActivity.z;
            return dml.b(context, new lik(vik.f, null, null));
        }
        Intent intent = new Intent(context, (Class<?>) VideoClipActivity.class);
        if (list != null) {
            intent.putExtra("extra.videoclip", (Parcelable[]) list.toArray(new x1u[0]));
        }
        intent.putExtra("extra.videocliprectype", wmnVar);
        return intent;
    }

    public static qe5 f(c cVar, u0f u0fVar, a6l a6lVar) {
        cVar.getClass();
        Continuation continuation = null;
        return g(cVar, new sfm(new hv0(new qs(u0fVar, continuation, 8), continuation, 27)), a6lVar);
    }

    public static qe5 g(c cVar, sfm sfmVar, a6l a6lVar) {
        cVar.getClass();
        a6lVar.getClass();
        return new qe5(cVar, sfmVar, new pe5(new v80(cVar.a(), a6lVar.a, a6lVar.b), null));
    }

    public static qe5 h(c cVar, List list, a6l a6lVar) {
        cVar.getClass();
        list.getClass();
        a6lVar.getClass();
        return g(cVar, new sfm(list, 6), a6lVar);
    }

    @Override // defpackage.evt
    public void a(c3c c3cVar) {
        Log.e(Constants.MODULE_ID, "Got unexpected exception: " + c3cVar);
    }

    @Override // defpackage.evt
    public void b(JSONObject jSONObject) {
        String optString = jSONObject != null ? jSONObject.optString(ConnectableDevice.KEY_ID) : null;
        if (optString == null) {
            Log.w(Constants.MODULE_ID, "No user ID returned on Me request");
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        nsh.o.f().N(new rtm(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null), true);
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f) {
        zcoVar.getClass();
        zcoVar.y((-(nmq.b(zcoVar.p) * 0.23703703f)) * f);
        zcoVar.a(1.0f - f);
    }
}
