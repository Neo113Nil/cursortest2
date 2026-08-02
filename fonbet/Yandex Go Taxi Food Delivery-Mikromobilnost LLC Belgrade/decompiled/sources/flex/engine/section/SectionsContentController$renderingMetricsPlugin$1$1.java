package flex.engine.section;

import android.os.SystemClock;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class SectionsContentController$renderingMetricsPlugin$1$1 extends FunctionReferenceImpl implements sls {
    public static final SectionsContentController$renderingMetricsPlugin$1$1 b = new SectionsContentController$renderingMetricsPlugin$1$1(0, 0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
