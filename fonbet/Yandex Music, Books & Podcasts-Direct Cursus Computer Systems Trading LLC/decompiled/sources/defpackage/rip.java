package defpackage;

/* loaded from: classes5.dex */
public final class rip extends zwf {
    @Override // defpackage.zwf
    public final boolean Y(sip sipVar) {
        synchronized (sipVar) {
            try {
                if (sipVar.c != 0) {
                    return false;
                }
                sipVar.c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zwf
    public final void Z(sip sipVar) {
        synchronized (sipVar) {
            sipVar.c = 0;
        }
    }
}
