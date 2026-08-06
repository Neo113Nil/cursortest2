package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class aq0 extends CancellationException {
    public final /* synthetic */ int OOA6hdeuvCS;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq0(String str, int i) {
        super(str);
        this.OOA6hdeuvCS = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                setStackTrace(rj0.encWxUiV2);
                break;
            case 1:
                setStackTrace(p.uFEq9NpZ);
                break;
            default:
                setStackTrace(fb1.OOA6hdeuvCS);
                break;
        }
        return this;
    }
}
