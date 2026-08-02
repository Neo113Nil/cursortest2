package defpackage;

import com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.LongSearchV2CarOverlayPresenter$queryRoute$$inlined$suspendCallbackApi$2;
import com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes14.dex */
public final class zmz extends uhs0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ LongSearchV2CarOverlayPresenter$queryRoute$$inlined$suspendCallbackApi$2 b;
    public final /* synthetic */ m58 c;

    public zmz(c cVar, LongSearchV2CarOverlayPresenter$queryRoute$$inlined$suspendCallbackApi$2 longSearchV2CarOverlayPresenter$queryRoute$$inlined$suspendCallbackApi$2, m58 m58Var) {
        this.a = cVar;
        this.b = longSearchV2CarOverlayPresenter$queryRoute$$inlined$suspendCallbackApi$2;
        this.c = m58Var;
    }

    @Override // defpackage.nlm
    public final void a() {
        this.a.E.getClass();
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar = jst.e;
    }

    @Override // defpackage.uhs0
    public final void b(DrivingRoute drivingRoute) {
        this.a.E.getClass();
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar = jst.e;
        this.b.invoke(drivingRoute);
    }

    @Override // defpackage.nlm
    public final void d(IOException iOException) {
        this.a.E.b("queryRoute", iOException, new a80(22, this.c));
        this.b.invoke(null);
    }
}
