package defpackage;

import android.net.Uri;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import org.json.JSONObject;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes3.dex */
public final class mh4 extends mbv {
    public final /* synthetic */ int c = 2;
    public final syc d;

    public mh4(uf3 uf3Var) {
        super(UgcLiveVideoData$UgcLiveStatus.READY, true);
        this.d = uf3Var;
    }

    @Override // defpackage.mbv
    public final void a(hie hieVar) {
        JSONObject B;
        JSONObject B2;
        JSONObject B3;
        String F;
        switch (this.c) {
            case 0:
                JSONObject jSONObject = hieVar.c;
                ((wh4) this.d).invoke((jSONObject == null || (B = vnj.B("data", jSONObject)) == null) ? null : vnj.F("chatId", B));
                break;
            case 1:
                JSONObject jSONObject2 = hieVar.c;
                ((wh4) this.d).invoke((jSONObject2 == null || (B2 = vnj.B("data", jSONObject2)) == null) ? null : vnj.F("chatId", B2));
                break;
            case 2:
                JSONObject jSONObject3 = hieVar.c;
                if (jSONObject3 != null && (B3 = vnj.B("data", jSONObject3)) != null && (F = vnj.F(SSDPDeviceDescriptionParser.TAG_LOCATION, B3)) != null) {
                    q0v q0vVar = (q0v) this.d;
                    String decode = Uri.decode(F);
                    decode.getClass();
                    q0vVar.invoke(decode);
                    break;
                }
                break;
            default:
                ((uf3) this.d).invoke();
                break;
        }
    }

    public mh4(q0v q0vVar) {
        super("locationChange");
        this.d = q0vVar;
    }

    public mh4(wh4 wh4Var, byte b) {
        super("chatListLoaded", true);
        this.d = wh4Var;
    }

    public mh4(wh4 wh4Var) {
        super("chatHistoryLoaded", false);
        this.d = wh4Var;
    }
}
