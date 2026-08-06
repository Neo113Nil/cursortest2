package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class na extends CancellationException {
    public final /* synthetic */ int OOA6hdeuvCS;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na(String str, int i) {
        super(str);
        this.OOA6hdeuvCS = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(ki1.JFJ3QoxA);
                break;
        }
        return this;
    }
}
