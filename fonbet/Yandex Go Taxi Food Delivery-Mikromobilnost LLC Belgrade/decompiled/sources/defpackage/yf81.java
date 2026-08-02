package defpackage;

import android.app.Activity;
import io.appmetrica.analytics.impl.C0747to;
import io.appmetrica.analytics.impl.Ng;
import io.appmetrica.analytics.impl.Yd;

/* loaded from: classes9.dex */
public final /* synthetic */ class yf81 implements Ng {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0747to b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ yf81(C0747to c0747to, Activity activity, int i) {
        this.a = i;
        this.b = c0747to;
        this.c = activity;
    }

    @Override // io.appmetrica.analytics.impl.Ng
    public final void consume(Object obj) {
        int i = this.a;
        Activity activity = this.c;
        C0747to c0747to = this.b;
        Yd yd = (Yd) obj;
        switch (i) {
            case 0:
                c0747to.a(activity, yd);
                break;
            default:
                c0747to.b(activity, yd);
                break;
        }
    }
}
