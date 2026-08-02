package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class wis extends CancellationException implements dl6 {
    public final transient r2f a;

    public wis(String str, r2f r2fVar) {
        super(str);
        this.a = r2fVar;
    }

    @Override // defpackage.dl6
    public final Throwable createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        wis wisVar = new wis(message, this.a);
        wisVar.initCause(this);
        return wisVar;
    }
}
