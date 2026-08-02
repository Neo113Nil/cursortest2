package defpackage;

import com.squareup.moshi.Moshi;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.webview.internal.utils.NativeYbWebEventsListener;

/* loaded from: classes3.dex */
public final class s450 implements r450 {
    public final at20 a;

    public s450(at20 at20Var) {
        this.a = at20Var;
    }

    public final NativeYbWebEventsListener a(gv41 gv41Var) {
        at20 at20Var = this.a;
        return new NativeYbWebEventsListener((Moshi) ((rbg) at20Var.a).get(), (AppAnalyticsReporter) ((rbg) at20Var.b).get(), gv41Var);
    }
}
