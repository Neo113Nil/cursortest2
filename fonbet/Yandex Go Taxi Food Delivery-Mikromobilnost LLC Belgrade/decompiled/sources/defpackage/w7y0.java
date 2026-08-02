package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.go.taxi.order.y;
import com.yandex.go.zone.repository.r;
import ru.yandex.taxi.communications.common.repository.b;
import ru.yandex.taxi.communications.ticket.domain.a;
import ru.yandex.taxi.jobs.push.j;
import ru.yandex.taxi.layers.api.TrackerApi;

/* loaded from: classes8.dex */
public final class w7y0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ w7y0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new d3a((rqo) xvf0Var.get(), 12);
            case 1:
                return new y7y0((zuj0) xvf0Var.get());
            case 2:
                return new e8y0((rqo) xvf0Var.get());
            case 3:
                return new m9y0((fva0) xvf0Var.get());
            case 4:
                return new o9y0((r) xvf0Var.get());
            case 5:
                return new iay0((pho) xvf0Var.get());
            case 6:
                return new pay0((dne0) xvf0Var.get());
            case 7:
                return new say0((dne0) xvf0Var.get());
            case 8:
                return new vay0((y) xvf0Var.get());
            case 9:
                return new cby0((pho) xvf0Var.get());
            case 10:
                return new b((TrackerApi) xvf0Var.get());
            case 11:
                return new ncy0((Context) xvf0Var.get());
            case 12:
                return new d6i((rqo) xvf0Var.get(), 4);
            case 13:
                return key0.a;
            case 14:
                i5m.a(xvf0Var);
                return new piy0();
            case 15:
                return new wvy0((rqo) xvf0Var.get());
            case 16:
                return new mxy0((k7x0) xvf0Var.get());
            case 17:
                return i6u.d((Handler) xvf0Var.get(), "Logic");
            case 18:
                return new Handler((Looper) xvf0Var.get());
            case 19:
                return new a((zpf0) xvf0Var.get());
            case 20:
                return new b4z0((yp2) xvf0Var.get());
            case 21:
                return new b6z0(7, ((dne0) xvf0Var.get()).b());
            case 22:
                return new nw8((zuj0) xvf0Var.get());
            case 23:
                return new nfz0((pho) xvf0Var.get());
            case 24:
                return new vfz0((dne0) xvf0Var.get());
            case 25:
                return new egz0((com.yandex.go.analytics.b) xvf0Var.get());
            case 26:
                return new ehu((rqo) xvf0Var.get(), 1);
            case 27:
                return new j((rqo) xvf0Var.get());
            case 28:
                return new moz0((com.yandex.go.analytics.b) xvf0Var.get());
            default:
                return new opz0((rqo) xvf0Var.get());
        }
    }
}
