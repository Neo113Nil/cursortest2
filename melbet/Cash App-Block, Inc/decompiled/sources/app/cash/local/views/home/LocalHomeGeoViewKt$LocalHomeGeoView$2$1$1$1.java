package app.cash.local.views.home;

import androidx.compose.runtime.Composer;
import com.squareup.cash.maps.views.CashCluster;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$LocalHomeGeoView$2$1$1$1 extends FunctionReferenceImpl implements Function3 {
    public static final LocalHomeGeoViewKt$LocalHomeGeoView$2$1$1$1 INSTANCE = new LocalHomeGeoViewKt$LocalHomeGeoView$2$1$1$1(3, LocalHomeGeoViewKt.class, "LocalHomeGeoCluster", "LocalHomeGeoCluster(Lcom/squareup/cash/maps/views/CashCluster;Landroidx/compose/runtime/Composer;I)V", 1);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CashCluster cashCluster = (CashCluster) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        cashCluster.getClass();
        composer.getClass();
        LocalHomeGeoViewKt.LocalHomeGeoCluster(cashCluster, composer, intValue);
        return Unit.INSTANCE;
    }
}
