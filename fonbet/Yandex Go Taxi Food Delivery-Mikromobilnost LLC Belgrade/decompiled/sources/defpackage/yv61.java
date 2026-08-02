package defpackage;

import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class yv61 extends erd0 {
    @Override // defpackage.erd0
    public final void a() {
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting signer identifier...");
        this.c = ((acs0) this.b).getSID();
        JCPLogger.subExit();
    }
}
