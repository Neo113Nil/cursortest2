package defpackage;

import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManager;
import com.connectsdk.service.webos.lgcast.common.connection.LGCastCommandListener;
import com.connectsdk.service.webos.lgcast.common.utils.TimerUtil;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class z56 implements TimerUtil.TimerListener, LGCastCommandListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConnectionManager b;

    public /* synthetic */ z56(ConnectionManager connectionManager, int i) {
        this.a = i;
        this.b = connectionManager;
    }

    @Override // com.connectsdk.service.webos.lgcast.common.connection.LGCastCommandListener
    public void onReceive(JSONObject jSONObject) {
        switch (this.a) {
            case 1:
                this.b.lambda$subscribe$6(jSONObject);
                break;
            default:
                this.b.lambda$subscribe$8(jSONObject);
                break;
        }
    }

    @Override // com.connectsdk.service.webos.lgcast.common.utils.TimerUtil.TimerListener
    public void onTime() {
        this.b.lambda$setSourceDeviceCapability$2();
    }
}
