package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassesOfferResponseScreenDto$Offer;
import com.yandex.go.chargers.passes.data.ChargersPassesResponseDto$PassesListScreen;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class zja extends xqt {
    public static final zja e = new zja();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, aka.INSTANCE.serializer(), qoi0.a(aka.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("list", ChargersPassesResponseDto$PassesListScreen.Companion.serializer(), qoi0.a(ChargersPassesResponseDto$PassesListScreen.class)), new f9("offer", ChargersPassesOfferResponseScreenDto$Offer.Companion.serializer(), qoi0.a(ChargersPassesOfferResponseScreenDto$Offer.class)));
    }
}
