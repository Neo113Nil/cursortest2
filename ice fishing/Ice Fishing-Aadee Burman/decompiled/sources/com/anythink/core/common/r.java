package com.anythink.core.common;

import android.content.Context;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.common.h.az;
import com.anythink.network.myoffer.MyOfferAPI;
import java.lang.reflect.Method;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16037a = 35;

    /* renamed from: b, reason: collision with root package name */
    public static final String f16038b = "isDefaultOffer";

    /* renamed from: g, reason: collision with root package name */
    private static volatile r f16039g;

    /* renamed from: c, reason: collision with root package name */
    Method f16040c;

    /* renamed from: d, reason: collision with root package name */
    Method f16041d;

    /* renamed from: e, reason: collision with root package name */
    Method f16042e;

    /* renamed from: f, reason: collision with root package name */
    Method f16043f;

    private r() {
        try {
            this.f16040c = MyOfferAPI.class.getDeclaredMethod("preloadTopOnOffer", Context.class, az.class);
            this.f16041d = MyOfferAPI.class.getDeclaredMethod("getOutOfCapOfferIds", Context.class);
            this.f16042e = MyOfferAPI.class.getDeclaredMethod("getDefaultOfferId", Context.class, String.class);
            this.f16043f = MyOfferAPI.class.getDeclaredMethod("checkOffersOutOfCap", Context.class, String.class);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static r a() {
        if (f16039g == null) {
            synchronized (r.class) {
                try {
                    if (f16039g == null) {
                        f16039g = new r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16039g;
    }

    public final boolean b(Context context, String str) {
        try {
            Method method = this.f16043f;
            if (method != null) {
                return ((Boolean) method.invoke(null, context, str)).booleanValue();
            }
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final void a(Context context, String str, ATAdRequest aTAdRequest) {
        try {
            if (this.f16040c != null) {
                az azVar = new az();
                azVar.f13602b = str;
                azVar.f13601a = aTAdRequest;
                this.f16040c.invoke(null, context, azVar);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final JSONArray a(Context context) {
        try {
            Method method = this.f16041d;
            if (method != null) {
                return new JSONArray(method.invoke(null, context).toString());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return new JSONArray();
    }

    public final String a(Context context, String str) {
        try {
            Method method = this.f16042e;
            if (method != null) {
                return method.invoke(null, context, str).toString();
            }
            return "";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }
}
