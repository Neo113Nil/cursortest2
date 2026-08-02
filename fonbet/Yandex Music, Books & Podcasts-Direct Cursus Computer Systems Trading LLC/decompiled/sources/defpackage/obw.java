package defpackage;

import android.app.Activity;
import io.appmetrica.analytics.impl.Id;
import io.appmetrica.analytics.impl.InterfaceC0781xg;
import io.appmetrica.analytics.impl.Yn;

/* loaded from: classes5.dex */
public final /* synthetic */ class obw implements InterfaceC0781xg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Yn b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ obw(Yn yn, Activity activity, int i) {
        this.a = i;
        this.b = yn;
        this.c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0781xg
    public final void consume(Object obj) {
        switch (this.a) {
            case 0:
                this.b.b(this.c, (Id) obj);
                break;
            default:
                this.b.a(this.c, (Id) obj);
                break;
        }
    }
}
