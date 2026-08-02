package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import kotlin.a;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;

/* loaded from: classes10.dex */
public final class spt {
    public static final w6h b = new w6h(7);
    public static final w6h c = new w6h(6);
    public static final w6h d = new w6h(5);
    public final i3y a;

    public spt(zuj0 zuj0Var, d6u0 d6u0Var) {
        this.a = a.a(new ou(21, zuj0Var, d6u0Var));
    }

    public final j9s0 a(ObserveStrategy observeStrategy) {
        switch (rpt.a[observeStrategy.ordinal()]) {
            case 1:
                return b;
            case 2:
                return c;
            case 3:
                return d;
            case 4:
                return (l6y0) this.a.getValue();
            case 5:
                return new egp0(Screen.FAVORITES);
            case 6:
                return new egp0(Screen.SCOOTERS_DISCOVERY);
            default:
                w511.b();
                return null;
        }
    }
}
