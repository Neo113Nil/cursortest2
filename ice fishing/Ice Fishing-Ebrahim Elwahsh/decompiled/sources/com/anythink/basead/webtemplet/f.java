package com.anythink.basead.webtemplet;

import com.anythink.basead.webtemplet.adformat.WTCommonJSBridgePlugin;
import com.anythink.basead.webtemplet.adformat.intestitial.WTScreenJSBridgePlugin;
import com.anythink.basead.webtemplet.adformat.splash.WTSplashJSBridgePlugin;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f11656a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Object f11657b;

    /* renamed from: c, reason: collision with root package name */
    private WTWebView f11658c;

    public f(WTWebView wTWebView) {
        this.f11658c = wTWebView;
        try {
            a(com.anythink.core.common.m.e.Y, WTCommonJSBridgePlugin.class);
            a(com.anythink.expressad.foundation.g.a.f.f19282f, WTSplashJSBridgePlugin.class);
            a("inter", WTScreenJSBridgePlugin.class);
            a("reward", WTScreenJSBridgePlugin.class);
        } catch (ClassNotFoundException unused) {
        }
    }

    private void a(Object obj) {
        this.f11657b = obj;
    }

    private static void b(String str) {
        if (f11656a == null) {
            f11656a = new HashMap<>();
        }
        f11656a.remove(str);
    }

    private static Object a(String str, WTWebView wTWebView) {
        Class cls = f11656a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!d.class.isAssignableFrom(cls)) {
                return null;
            }
            d dVar = (d) cls.newInstance();
            dVar.initialize(wTWebView);
            return dVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private static void a(String str, Class cls) {
        if (f11656a == null) {
            f11656a = new HashMap<>();
        }
        f11656a.put(str, cls);
    }

    public final Object a(String str) {
        if (f11656a == null) {
            f11656a = new HashMap<>();
        }
        return a(str, this.f11658c);
    }

    private static void a() {
        try {
            a(com.anythink.core.common.m.e.Y, WTCommonJSBridgePlugin.class);
            a(com.anythink.expressad.foundation.g.a.f.f19282f, WTSplashJSBridgePlugin.class);
            a("inter", WTScreenJSBridgePlugin.class);
            a("reward", WTScreenJSBridgePlugin.class);
        } catch (ClassNotFoundException unused) {
        }
    }
}
