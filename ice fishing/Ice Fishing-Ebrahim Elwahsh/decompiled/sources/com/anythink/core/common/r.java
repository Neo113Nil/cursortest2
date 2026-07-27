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
    public static final int f16195a = 35;

    /* renamed from: b, reason: collision with root package name */
    public static final String f16196b = "isDefaultOffer";

    /* renamed from: g, reason: collision with root package name */
    private static volatile r f16197g;

    /* renamed from: c, reason: collision with root package name */
    Method f16198c;

    /* renamed from: d, reason: collision with root package name */
    Method f16199d;

    /* renamed from: e, reason: collision with root package name */
    Method f16200e;

    /* renamed from: f, reason: collision with root package name */
    Method f16201f;

    private r() {
        try {
            this.f16198c = MyOfferAPI.class.getDeclaredMethod("preloadTopOnOffer", Context.class, az.class);
            this.f16199d = MyOfferAPI.class.getDeclaredMethod("getOutOfCapOfferIds", Context.class);
            this.f16200e = MyOfferAPI.class.getDeclaredMethod("getDefaultOfferId", Context.class, String.class);
            this.f16201f = MyOfferAPI.class.getDeclaredMethod("checkOffersOutOfCap", Context.class, String.class);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static r a() {
        if (f16197g == null) {
            synchronized (r.class) {
                try {
                    if (f16197g == null) {
                        f16197g = new r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16197g;
    }

    public final boolean b(Context context, String str) {
        try {
            Method method = this.f16201f;
            if (method != null) {
                return ((Boolean) method.invoke(null, context, str)).booleanValue();
            }
            return false;
        } catch (Exception e6) {
            e6.printStackTrace();
            return false;
        }
    }

    public final void a(Context context, String str, ATAdRequest aTAdRequest) {
        try {
            if (this.f16198c != null) {
                az azVar = new az();
                azVar.f13759b = str;
                azVar.f13758a = aTAdRequest;
                this.f16198c.invoke(null, context, azVar);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public final JSONArray a(Context context) {
        try {
            Method method = this.f16199d;
            if (method != null) {
                return new JSONArray(method.invoke(null, context).toString());
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return new JSONArray();
    }

    public final String a(Context context, String str) {
        try {
            Method method = this.f16200e;
            if (method != null) {
                return method.invoke(null, context, str).toString();
            }
            return "";
        } catch (Exception e6) {
            e6.printStackTrace();
            return "";
        }
    }
}
