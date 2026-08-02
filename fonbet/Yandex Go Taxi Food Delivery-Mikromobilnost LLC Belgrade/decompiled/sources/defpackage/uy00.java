package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.go.layers.api.model.params.Mode;
import java.util.Locale;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.a;

/* loaded from: classes9.dex */
public final class uy00 implements a {
    public final vy00 a;
    public final dyx b;

    public uy00(vy00 vy00Var, dyx dyxVar) {
        this.a = vy00Var;
        this.b = dyxVar;
    }

    @Override // ru.yandex.taxi.layers.a
    public final void a(String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, sm00 sm00Var) {
        byx a = this.b.a();
        if (a.b.a != Mode.MASSTRANSIT) {
            return;
        }
        String lowerCase = a.a.name().toLowerCase(Locale.getDefault());
        int i = ty00.a[mapObjectComponentType.ordinal()];
        vy00 vy00Var = this.a;
        if (i == 1) {
            int i2 = ty00.b[event.ordinal()];
            if (i2 == 1) {
                vy00Var.a("Map.Stop.Shown", new tb(4, lowerCase, str));
                return;
            } else {
                if (i2 != 2) {
                    return;
                }
                vy00Var.a("Map.Stop.Tapped", new tb(4, lowerCase, str));
                return;
            }
        }
        if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                return;
            }
            w511.b();
            return;
        }
        int i3 = ty00.b[event.ordinal()];
        if (i3 == 1) {
            vy00Var.a("Map.StopPopup.Shown", new tb(4, lowerCase, str));
        } else {
            if (i3 != 2) {
                return;
            }
            vy00Var.a("Map.StopPopup.Tapped", new tb(4, lowerCase, str));
        }
    }
}
