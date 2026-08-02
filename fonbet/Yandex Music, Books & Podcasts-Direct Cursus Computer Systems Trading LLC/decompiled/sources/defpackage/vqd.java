package defpackage;

import java.net.ProxySelector;

/* loaded from: classes5.dex */
public final class vqd implements yqr {
    public final /* synthetic */ int a;

    @Override // defpackage.yqr
    public final Object get() {
        switch (this.a) {
            case 0:
                return new hhr();
            default:
                return ProxySelector.getDefault();
        }
    }
}
