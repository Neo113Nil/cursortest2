package defpackage;

import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.ui.api.car.CarIconPart$Layer;

/* loaded from: classes8.dex */
public final class y48 {
    public final List a;

    public y48(mqv0 mqv0Var) {
        int i = x48.a[mqv0Var.c().ordinal()];
        if (i == 1 || i == 2) {
            this.a = scc.g(new Pair(CarIconPart$Layer.MASK, Integer.valueOf(w2h0.car_layer_smart_mask)), new Pair(CarIconPart$Layer.SHADOW, Integer.valueOf(w2h0.car_layer_smart_cold_shadow)), new Pair(CarIconPart$Layer.WARM_LIGHT, Integer.valueOf(w2h0.car_layer_smart_hard_light)), new Pair(CarIconPart$Layer.SOFT_LIGHT, Integer.valueOf(w2h0.car_layer_smart_soft_light)), new Pair(CarIconPart$Layer.GLOSSY, Integer.valueOf(w2h0.car_layer_smart_glossy)), new Pair(CarIconPart$Layer.DETAILS, Integer.valueOf(w2h0.car_layer_smart_details)));
        } else {
            w511.b();
            throw null;
        }
    }
}
