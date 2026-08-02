package defpackage;

import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class sh21 {
    public final x22 a;
    public final LinkedHashSet b = new LinkedHashSet();

    public sh21(x22 x22Var) {
        this.a = x22Var;
    }

    public final void a(ye0 ye0Var, UrlPreviewReporter$Element urlPreviewReporter$Element) {
        this.a.reportEvent("url_preview_element_click", b.i(new Pair("type", gp41.a(ye0Var)), new Pair("element", urlPreviewReporter$Element.getMetricaName())));
    }
}
