package defpackage;

import com.yandex.go.shortcuts.dto.response.Mode;
import com.yandex.go.shortcuts.dto.response.ProductMode$Chargers;
import com.yandex.go.shortcuts.dto.response.ProductMode$Eats;
import com.yandex.go.shortcuts.dto.response.ProductMode$Grocery;
import com.yandex.go.shortcuts.dto.response.ProductMode$Market;
import com.yandex.go.shortcuts.dto.response.ProductMode$MarketViewer;
import com.yandex.go.shortcuts.dto.response.ProductMode$Pharmacy;
import com.yandex.go.shortcuts.dto.response.ProductMode$Scooters;
import com.yandex.go.shortcuts.dto.response.ProductMode$Shop;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.n0;
import com.yandex.go.shortcuts.dto.response.o0;
import com.yandex.go.shortcuts.dto.response.p0;
import com.yandex.go.shortcuts.dto.response.s1;
import com.yandex.go.shortcuts.dto.response.u0;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class x8f0 extends lnt {
    public static final x8f0 f = new x8f0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s1.INSTANCE.serializer(), qoi0.a(s1.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "mode";
    }

    @Override // defpackage.h9
    public final List f() {
        Mode mode = Mode.TAXI;
        f9 f9Var = new f9((String) h().invoke(mode), ProductMode$Taxi.Companion.serializer(), qoi0.a(ProductMode$Taxi.class));
        Mode mode2 = Mode.EATS;
        f9 f9Var2 = new f9((String) h().invoke(mode2), ProductMode$Eats.Companion.serializer(), qoi0.a(ProductMode$Eats.class));
        Mode mode3 = Mode.GROCERY;
        f9 f9Var3 = new f9((String) h().invoke(mode3), ProductMode$Grocery.Companion.serializer(), qoi0.a(ProductMode$Grocery.class));
        Mode mode4 = Mode.PHARMACY;
        f9 f9Var4 = new f9((String) h().invoke(mode4), ProductMode$Pharmacy.Companion.serializer(), qoi0.a(ProductMode$Pharmacy.class));
        Mode mode5 = Mode.SHOP;
        f9 f9Var5 = new f9((String) h().invoke(mode5), ProductMode$Shop.Companion.serializer(), qoi0.a(ProductMode$Shop.class));
        Mode mode6 = Mode.MARKET;
        f9 f9Var6 = new f9((String) h().invoke(mode6), ProductMode$Market.Companion.serializer(), qoi0.a(ProductMode$Market.class));
        Mode mode7 = Mode.MARKET_VIEWER;
        f9 f9Var7 = new f9((String) h().invoke(mode7), ProductMode$MarketViewer.Companion.serializer(), qoi0.a(ProductMode$MarketViewer.class));
        Mode mode8 = Mode.CITY;
        f9 f9Var8 = new f9((String) h().invoke(mode8), n0.INSTANCE.serializer(), qoi0.a(n0.class));
        Mode mode9 = Mode.DRIVE;
        f9 f9Var9 = new f9((String) h().invoke(mode9), p0.INSTANCE.serializer(), qoi0.a(p0.class));
        Mode mode10 = Mode.SCOOTERS;
        f9 f9Var10 = new f9((String) h().invoke(mode10), ProductMode$Scooters.Companion.serializer(), qoi0.a(ProductMode$Scooters.class));
        Mode mode11 = Mode.CHARGERS;
        f9 f9Var11 = new f9((String) h().invoke(mode11), ProductMode$Chargers.Companion.serializer(), qoi0.a(ProductMode$Chargers.class));
        Mode mode12 = Mode.DELIVERY;
        f9 f9Var12 = new f9((String) h().invoke(mode12), o0.INSTANCE.serializer(), qoi0.a(o0.class));
        Mode mode13 = Mode.MASSTRANSIT;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, f9Var5, f9Var6, f9Var7, f9Var8, f9Var9, f9Var10, f9Var11, f9Var12, new f9((String) h().invoke(mode13), u0.INSTANCE.serializer(), qoi0.a(u0.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return Mode.Companion.serializer();
    }
}
