package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.stories.api.StoriesScreensParams;
import com.ybsdk.feature.stories.internal.domain.a;
import com.ybsdk.feature.stories.internal.screens.stories.b;
import com.ybsdk.feature.stories.internal.screens.stories.d;

/* loaded from: classes3.dex */
public final class unu0 implements rnu0 {
    public final vmn0 a;

    public unu0(vmn0 vmn0Var) {
        this.a = vmn0Var;
    }

    public final d a(StoriesScreensParams storiesScreensParams) {
        vmn0 vmn0Var = this.a;
        return new d(storiesScreensParams, (b) ((qmu0) vmn0Var.a).get(), (a) ((gaq0) vmn0Var.b).get(), (Context) ((hag) vmn0Var.c).get(), (tfl0) ((hag) vmn0Var.w).get(), (AppAnalyticsReporter) ((hag) vmn0Var.x).get(), (nmu0) ((hag) vmn0Var.y).get());
    }
}
