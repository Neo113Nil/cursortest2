package androidx.compose.ui.graphics.vector;

import com.squareup.cash.offers.presenters.OffersAnalyticsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class PathComponent$pathMeasure$2 extends Lambda implements Function0 {
    public static final PathComponent$pathMeasure$2 INSTANCE;
    public static final PathComponent$pathMeasure$2 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new PathComponent$pathMeasure$2(i, 0);
        INSTANCE$1 = new PathComponent$pathMeasure$2(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PathComponent$pathMeasure$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return OffersAnalyticsKt.PathMeasure();
            default:
                return Unit.INSTANCE;
        }
    }
}
