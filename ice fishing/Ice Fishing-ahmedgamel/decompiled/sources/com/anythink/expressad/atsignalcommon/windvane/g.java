package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.bridge.BannerJSPlugin;
import com.anythink.expressad.atsignalcommon.mraid.MraidSignalCommunication;
import com.anythink.expressad.atsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.anythink.expressad.splash.js.SplashJs;
import com.anythink.expressad.video.signal.communication.RewardJs;
import com.anythink.expressad.video.signal.communication.VideoBridge;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f18072a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f18073b;

    /* renamed from: c, reason: collision with root package name */
    private Object f18074c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f18075d;

    public g(Context context, WindVaneWebView windVaneWebView) {
        this.f18073b = context;
        this.f18075d = windVaneWebView;
        try {
            a(BannerJSPlugin.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(RewardJs.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(VideoBridge.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.f17938e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(SplashJs.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.f17941h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
    }

    private static void b(String str) {
        if (f18072a == null) {
            f18072a = new HashMap<>();
        }
        f18072a.remove(str);
    }

    public final void a(Context context) {
        this.f18073b = context;
    }

    public final void a(Object obj) {
        this.f18074c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f18072a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!j.class.isAssignableFrom(cls)) {
                return null;
            }
            j jVar = (j) cls.newInstance();
            jVar.initialize(context, windVaneWebView);
            jVar.initialize(this.f18074c, windVaneWebView);
            return jVar;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public static void a(Class cls) {
        if (f18072a == null) {
            f18072a = new HashMap<>();
        }
        f18072a.put(cls.getSimpleName(), cls);
    }

    private static void a(String str, Class cls) {
        if (f18072a == null) {
            f18072a = new HashMap<>();
        }
        f18072a.put(str, cls);
    }

    public final Object a(String str) {
        if (f18072a == null) {
            f18072a = new HashMap<>();
        }
        return a(str, this.f18075d, this.f18073b);
    }

    private static void a() {
        try {
            a(BannerJSPlugin.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(RewardJs.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(VideoBridge.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.f17938e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(SplashJs.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.anythink.expressad.atsignalcommon.a.b.f17941h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
    }
}
