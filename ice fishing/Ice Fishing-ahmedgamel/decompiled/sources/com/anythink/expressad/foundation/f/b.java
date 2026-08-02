package com.anythink.expressad.foundation.f;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.f.a.a;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.a.c;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f19834a = -2;

    /* renamed from: b, reason: collision with root package name */
    public static int f19835b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f19836c = false;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.anythink.expressad.foundation.f.a.a> f19837d;

    /* renamed from: e, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f19838e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.expressad.f.a f19839f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f19840a = new b(0);
    }

    public /* synthetic */ b(byte b9) {
        this();
    }

    public static b a() {
        return a.f19840a;
    }

    private static boolean b(Context context, c cVar) {
        Activity a9 = a(context);
        if (a9 == null || cVar == null || a9.isDestroyed()) {
            return false;
        }
        try {
            if (!cVar.isShowing() && !a9.isFinishing()) {
                cVar.show();
                return true;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return false;
    }

    private com.anythink.expressad.foundation.f.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.c().f();
        }
        if (this.f19837d.containsKey(str)) {
            return this.f19837d.get(str);
        }
        return null;
    }

    private void e(String str) {
        a(str).e();
    }

    public final void c(String str) {
        try {
            String f2 = TextUtils.isEmpty(str) ? com.anythink.expressad.foundation.b.a.c().f() : str;
            com.anythink.expressad.foundation.f.a.a aVar = this.f19837d.containsKey(f2) ? this.f19837d.get(f2) : null;
            if (aVar != null) {
                aVar.d();
            }
            this.f19837d.remove(str);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private b() {
        this.f19837d = new ConcurrentHashMap<>();
        this.f19838e = new RelativeLayout.LayoutParams(f19834a, f19835b);
    }

    public static Activity a(Context context) {
        Activity activity;
        Context h3 = com.anythink.expressad.foundation.b.a.c().h();
        Activity activity2 = null;
        try {
            activity = h3 instanceof Activity ? (Activity) h3 : null;
        } catch (Exception e9) {
            e = e9;
        }
        try {
            if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                activity = (Activity) context;
            }
            if (activity != null && !activity.isFinishing()) {
                if (!activity.isDestroyed()) {
                    return activity;
                }
            }
            return null;
        } catch (Exception e10) {
            e = e10;
            activity2 = activity;
            e.printStackTrace();
            return activity2;
        }
    }

    public final boolean b() {
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.a c9 = com.anythink.expressad.f.b.c();
        this.f19839f = c9;
        return c9.K() != 0;
    }

    public final void b(String str, int i) {
        a(str).c(i);
    }

    public static boolean a(Context context, c cVar) {
        if (cVar == null) {
            return false;
        }
        return b(context, cVar);
    }

    public final FeedBackButton b(String str) {
        return a(str).c();
    }

    private void a(String str, int i, ViewGroup viewGroup) {
        com.anythink.expressad.foundation.f.a.a a9 = a(str);
        if (a9.c() != null) {
            a9.a(i);
            if (i == 0) {
                a(str, t.b().g(), viewGroup, null, null);
            }
        }
    }

    private void a(String str, int i, int i4, int i6, float f2, float f9, float f10, String str2, String str3) {
        com.anythink.expressad.foundation.f.a.a a9 = a(str);
        Context g9 = t.b().g();
        a9.a(v.b(g9, f2), v.b(g9, f9), v.b(g9, i), v.b(g9, i4), v.b(g9, i6), f10, str2, str3);
    }

    private void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        a(str, context, viewGroup, layoutParams, null);
    }

    public final void a(String str, com.anythink.expressad.foundation.f.a aVar) {
        a(str).a(new a.C0120a(str, aVar));
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.anythink.expressad.foundation.f.a aVar) {
        if (b()) {
            com.anythink.expressad.foundation.f.a.a a9 = a(str);
            if (aVar != null) {
                a9.a(new a.C0120a(str, aVar));
            }
            FeedBackButton c9 = a9.c();
            if (c9 != null) {
                if (layoutParams == null) {
                    int e9 = k.e(10.0f);
                    this.f19838e.setMargins(e9, e9, e9, e9);
                    layoutParams = this.f19838e;
                }
                ViewGroup viewGroup2 = (ViewGroup) c9.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c9);
                }
                Activity a10 = a(context);
                if (a10 != null && viewGroup == null) {
                    viewGroup = (ViewGroup) a10.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(c9);
                    viewGroup.addView(c9, layoutParams);
                }
            }
        }
    }

    private void a(String str, int i, com.anythink.expressad.foundation.f.a aVar) {
        com.anythink.expressad.foundation.f.a.a a9 = a(str);
        a9.a(new a.C0120a(str, aVar));
        if (i == 1) {
            a9.b();
        } else {
            a9.a();
        }
    }

    public final void a(String str, d dVar) {
        a(str).a(dVar);
    }

    public final void a(String str, int i) {
        a(str).b(i);
    }

    public final com.anythink.expressad.foundation.f.a.a a(String str) {
        com.anythink.expressad.foundation.f.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.c().f();
        }
        if (!this.f19837d.containsKey(str)) {
            aVar = new com.anythink.expressad.foundation.f.a.a(str);
            this.f19837d.put(str, aVar);
        } else {
            aVar = this.f19837d.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.anythink.expressad.foundation.f.a.a aVar2 = new com.anythink.expressad.foundation.f.a.a(str);
        this.f19837d.put(str, aVar2);
        return aVar2;
    }

    public final void a(String str, FeedBackButton feedBackButton) {
        a(str).a(feedBackButton);
    }
}
