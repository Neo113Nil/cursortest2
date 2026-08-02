package ru.yandex.taxi.combo.interactor;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.zls;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class TravelCompanionDetailInteractor$listenTravelCompanionDetail$1 extends AdaptedFunctionReference implements zls {
    public static final TravelCompanionDetailInteractor$listenTravelCompanionDetail$1 a = new TravelCompanionDetailInteractor$listenTravelCompanionDetail$1(3, 4, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new Pair((List) obj, (OrderScreen) obj2);
    }
}
