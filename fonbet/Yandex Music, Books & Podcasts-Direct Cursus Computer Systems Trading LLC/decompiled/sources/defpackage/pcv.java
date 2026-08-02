package defpackage;

/* loaded from: classes5.dex */
public abstract class pcv {
    private gsk pingFrame;

    public gsk onPreparePing(ocv ocvVar) {
        if (this.pingFrame == null) {
            this.pingFrame = new gsk();
        }
        return this.pingFrame;
    }

    public djp onWebsocketHandshakeReceivedAsServer(ocv ocvVar, hma hmaVar, eo4 eo4Var) throws uxe {
        return new jsd(7);
    }

    public void onWebsocketPing(ocv ocvVar, svc svcVar) {
        ogm ogmVar = new ogm(dsj.e, 0);
        ogmVar.c = ((gsk) svcVar).c;
        ocvVar.sendFrame(ogmVar);
    }

    public void onWebsocketHandshakeSentAsClient(ocv ocvVar, eo4 eo4Var) throws uxe {
    }

    public void onWebsocketPong(ocv ocvVar, svc svcVar) {
    }

    public void onWebsocketHandshakeReceivedAsClient(ocv ocvVar, eo4 eo4Var, cjp cjpVar) throws uxe {
    }
}
