package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.hardware.display.DisplayManager;
import defpackage.hzj;
import defpackage.xv10;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class b {
    public final xv10 a;

    public b(xv10 xv10Var) {
        this.a = xv10Var;
    }

    public final WebViewProxyApi$WebViewPlatformView a() {
        final hzj hzjVar = new hzj();
        final DisplayManager displayManager = (DisplayManager) ((Context) this.a.w).getSystemService("display");
        hzjVar.a = new ArrayList();
        WebViewProxyApi$WebViewPlatformView webViewProxyApi$WebViewPlatformView = new WebViewProxyApi$WebViewPlatformView(this);
        final ArrayList arrayList = new ArrayList();
        arrayList.removeAll(hzjVar.a);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: io.flutter.plugins.webviewflutter.DisplayListenerProxy$1
                    @Override // android.hardware.display.DisplayManager.DisplayListener
                    public void onDisplayAdded(int i) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((DisplayManager.DisplayListener) it2.next()).onDisplayAdded(i);
                        }
                    }

                    @Override // android.hardware.display.DisplayManager.DisplayListener
                    public void onDisplayChanged(int i) {
                        if (displayManager.getDisplay(i) == null) {
                            return;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((DisplayManager.DisplayListener) it2.next()).onDisplayChanged(i);
                        }
                    }

                    @Override // android.hardware.display.DisplayManager.DisplayListener
                    public void onDisplayRemoved(int i) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((DisplayManager.DisplayListener) it2.next()).onDisplayRemoved(i);
                        }
                    }
                }, null);
            }
        }
        return webViewProxyApi$WebViewPlatformView;
    }
}
