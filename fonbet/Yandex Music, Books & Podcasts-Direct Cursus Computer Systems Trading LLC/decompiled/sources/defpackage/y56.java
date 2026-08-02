package defpackage;

import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class y56 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConnectionManager b;
    public final /* synthetic */ JSONObject c;

    public /* synthetic */ y56(ConnectionManager connectionManager, JSONObject jSONObject, int i) {
        this.a = i;
        this.b = connectionManager;
        this.c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$callOnConnectionCompleted$12(this.c);
                break;
            case 1:
                this.b.lambda$callOnReceivePlayCommand$13(this.c);
                break;
            case 2:
                this.b.lambda$sendGetParameterResponse$4(this.c);
                break;
            case 3:
                this.b.lambda$callOnReceiveSetParameter$16(this.c);
                break;
            case 4:
                this.b.lambda$callOnReceiveGetParameter$15(this.c);
                break;
            case 5:
                this.b.lambda$updateSourceDeviceCapability$3(this.c);
                break;
            default:
                this.b.lambda$callOnReceiveStopCommand$14(this.c);
                break;
        }
    }
}
