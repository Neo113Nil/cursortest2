package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowId;
import android.view.inspector.WindowInspector;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class wqv {
    public static final vqv a = new vqv();

    public static final void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            List<View> globalWindowViews = WindowInspector.getGlobalWindowViews();
            globalWindowViews.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = globalWindowViews.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View view = (View) it.next();
                WindowId windowId = view != null ? view.getWindowId() : null;
                if (windowId != null) {
                    arrayList.add(windowId);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                WindowId windowId2 = (WindowId) it2.next();
                try {
                    windowId2.registerFocusObserver(a);
                } catch (IllegalStateException unused) {
                }
                ssg.a(4, "WindowLogger", "Window isFocused=" + windowId2.isFocused() + StringUtil.SPACE + windowId2, null);
            }
        } catch (NoClassDefFoundError e) {
            ssg.a(6, "WindowLogger", "Can not find class. This can happen on UI emulators", e);
        }
    }
}
