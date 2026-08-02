package defpackage;

import android.content.Intent;
import io.appmetrica.analytics.impl.C0536p2;
import io.appmetrica.analytics.impl.InterfaceC0478n2;

/* loaded from: classes5.dex */
public final /* synthetic */ class svw implements InterfaceC0478n2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0536p2 b;

    public /* synthetic */ svw(C0536p2 c0536p2, int i) {
        this.a = i;
        this.b = c0536p2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0478n2
    public final boolean a(Intent intent) {
        switch (this.a) {
            case 0:
                return C0536p2.b(this.b, intent);
            case 1:
                return C0536p2.c(this.b, intent);
            default:
                return C0536p2.a(this.b, intent);
        }
    }
}
