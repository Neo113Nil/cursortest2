package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes15.dex */
public final class t4b extends vg41 {
    public final /* synthetic */ int c = 2;
    public final cms d;

    public t4b(zdb zdbVar) {
        super(UgcLiveVideoData.UgcLiveStatus.READY, true);
        this.d = zdbVar;
    }

    @Override // defpackage.vg41
    public final void a(fqv fqvVar) {
        JSONObject f;
        JSONObject f2;
        JSONObject f3;
        String g;
        int i = this.c;
        String str = null;
        cms cmsVar = this.d;
        switch (i) {
            case 0:
                JSONObject jSONObject = fqvVar.c;
                if (jSONObject != null && (f = hbb1.f(Constants.KEY_DATA, jSONObject)) != null) {
                    str = hbb1.g("chatId", f);
                }
                ((ydb) cmsVar).invoke(str);
                break;
            case 1:
                JSONObject jSONObject2 = fqvVar.c;
                if (jSONObject2 != null && (f2 = hbb1.f(Constants.KEY_DATA, jSONObject2)) != null) {
                    str = hbb1.g("chatId", f2);
                }
                ((ydb) cmsVar).invoke(str);
                break;
            case 2:
                JSONObject jSONObject3 = fqvVar.c;
                if (jSONObject3 != null && (f3 = hbb1.f(Constants.KEY_DATA, jSONObject3)) != null && (g = hbb1.g("location", f3)) != null) {
                    ((qq31) cmsVar).invoke(Uri.decode(g));
                    break;
                }
                break;
            default:
                ((zdb) cmsVar).invoke();
                break;
        }
    }

    public t4b(qq31 qq31Var) {
        super("locationChange", false);
        this.d = qq31Var;
    }

    public t4b(ydb ydbVar, byte b) {
        super("chatListLoaded", true);
        this.d = ydbVar;
    }

    public t4b(ydb ydbVar) {
        super("chatHistoryLoaded", false);
        this.d = ydbVar;
    }
}
