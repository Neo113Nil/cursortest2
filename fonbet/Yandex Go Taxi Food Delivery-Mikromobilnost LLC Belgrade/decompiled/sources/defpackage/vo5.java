package defpackage;

import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes7.dex */
public final class vo5 implements Session.RouteListener {
    public final /* synthetic */ wo5 a;
    public final /* synthetic */ ba20 b;

    public vo5(wo5 wo5Var, ba20 ba20Var) {
        this.a = wo5Var;
        this.b = ba20Var;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        this.a.c = null;
        this.b.success(rsq0.h(list));
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        this.a.c = null;
        this.b.error("requestRoutes", "Error during routes building", error.toString());
    }
}
