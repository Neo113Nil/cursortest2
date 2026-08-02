package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import defpackage.am81;
import defpackage.g8e;
import defpackage.sj71;
import defpackage.xga1;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public abstract class mo extends WebView {
    public final LinkedHashMap a;

    public mo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashMap();
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (xga1.b(11)) {
            settings.setAllowContentAccess(false);
            if (xga1.b(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    public final String a(String str) {
        return g8e.p(str, a(), "<body style='margin:0; padding:0;'>");
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        this.a.put(str, obj);
    }

    public void b() {
        am81 am81Var = sj71.a;
        try {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } catch (Exception unused) {
        }
        try {
            removeAllViews();
        } catch (Exception unused2) {
        }
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.a.clear();
        destroy();
        getClass().toString();
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (xga1.b(11)) {
            super.removeJavascriptInterface(str);
        }
    }

    public final void setDisplayZoomControls(boolean z) {
        if (xga1.b(11)) {
            getSettings().setDisplayZoomControls(z);
        }
    }

    public String a() {
        return "";
    }
}
