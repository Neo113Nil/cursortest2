package defpackage;

import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManager;

/* loaded from: classes.dex */
public final /* synthetic */ class a66 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConnectionManager b;

    public /* synthetic */ a66(ConnectionManager connectionManager, int i) {
        this.a = i;
        this.b = connectionManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$callOnPairingRequested$9();
                break;
            case 1:
                this.b.subscribe();
                break;
            default:
                this.b.lambda$callOnPairingRejected$10();
                break;
        }
    }
}
