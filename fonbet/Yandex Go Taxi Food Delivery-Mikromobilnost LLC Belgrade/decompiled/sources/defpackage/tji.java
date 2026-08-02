package defpackage;

import android.content.Context;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import ru.yandex.taxi.logistics.deliveries.map.data.a;
import ru.yandex.taxi.logistics.deliveries.map.data.b;
import ru.yandex.taxi.logistics.deliveries.map.search.DeliveryPinPointView;

/* loaded from: classes5.dex */
public final class tji {
    public final sdi a;
    public final k7x0 b;
    public final pav c;
    public final ike d;
    public pzt0 e;

    public tji(tt2 tt2Var, sdi sdiVar, k7x0 k7x0Var, pav pavVar) {
        this.a = sdiVar;
        this.b = k7x0Var;
        this.c = pavVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d = bvf0.a(o400.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f4c0 a(yji yjiVar, nji njiVar) {
        a aVar = (a) this.a;
        b bVar = aVar.b;
        Context context = aVar.a;
        bVar.getClass();
        DeliveryPinPointView deliveryPinPointView = new DeliveryPinPointView(context, null, 2, 0 == true ? 1 : 0);
        xw31.r(deliveryPinPointView);
        ImageProvider fromBitmap = ImageProvider.fromBitmap(xw31.t(deliveryPinPointView));
        if (fromBitmap == null) {
            return null;
        }
        f4c0 f4c0Var = njiVar.b;
        if (f4c0Var == null) {
            f4c0Var = new f4c0(new Point(), null, 6);
            f4c0Var.k(6.0f);
        }
        f4c0Var.o(new Point(yjiVar.a, yjiVar.b));
        f4c0Var.y(fromBitmap);
        return f4c0Var;
    }
}
