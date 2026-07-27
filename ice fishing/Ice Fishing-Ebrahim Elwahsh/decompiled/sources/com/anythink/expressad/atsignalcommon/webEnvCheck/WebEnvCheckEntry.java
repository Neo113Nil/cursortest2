package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.f.b.a;

/* loaded from: classes.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        try {
            WindVaneWebView windVaneWebView = new WindVaneWebView(context);
            StringBuilder sb = new StringBuilder("<html><script>");
            a.a();
            sb.append(a.b());
            sb.append("</script></html>");
            windVaneWebView.loadDataWithBaseURL(null, sb.toString(), "text/html", com.anythink.expressad.foundation.g.a.bR, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
