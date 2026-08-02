package defpackage;

import android.content.Intent;
import io.appmetrica.analytics.impl.C0610p2;
import io.appmetrica.analytics.impl.InterfaceC0552n2;

/* loaded from: classes9.dex */
public final /* synthetic */ class u081 implements InterfaceC0552n2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0610p2 b;

    public /* synthetic */ u081(C0610p2 c0610p2, int i) {
        this.a = i;
        this.b = c0610p2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0552n2
    public final boolean a(Intent intent) {
        int i = this.a;
        C0610p2 c0610p2 = this.b;
        switch (i) {
            case 0:
                return C0610p2.c(c0610p2, intent);
            default:
                return C0610p2.a(c0610p2, intent);
        }
    }
}
