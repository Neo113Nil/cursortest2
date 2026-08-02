package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassesOfferResponseScreenDto$Offer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class qga extends xqt {
    public static final qga e = new qga();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, rga.INSTANCE.serializer(), qoi0.a(rga.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("offer", ChargersPassesOfferResponseScreenDto$Offer.Companion.serializer(), qoi0.a(ChargersPassesOfferResponseScreenDto$Offer.class)));
    }
}
