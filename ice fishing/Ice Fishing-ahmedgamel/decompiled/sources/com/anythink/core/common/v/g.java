package com.anythink.core.common.v;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.u;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static volatile g f17534d;

    /* renamed from: g, reason: collision with root package name */
    private String f17540g;
    private File i;

    /* renamed from: l, reason: collision with root package name */
    private String f17544l;

    /* renamed from: m, reason: collision with root package name */
    private String f17545m;

    /* renamed from: c, reason: collision with root package name */
    private final String f17537c = getClass().getSimpleName();

    /* renamed from: e, reason: collision with root package name */
    private final String f17538e = k.b("aHR0cHM6Ly9tb3Jlcy5hbnl0aGlua3RlY2guY29tL3RpbmlmeS90YWt1X2FkeF9leHRfcmVzX2pzb24udHh0");

    /* renamed from: f, reason: collision with root package name */
    private final String f17539f = "adx_optional_res.txt";

    /* renamed from: h, reason: collision with root package name */
    private final String f17541h = "anythink_optres/";

    /* renamed from: a, reason: collision with root package name */
    boolean f17535a = false;

    /* renamed from: b, reason: collision with root package name */
    final String f17536b = "adx_optional_res_url";

    /* renamed from: j, reason: collision with root package name */
    private final Object f17542j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f17543k = new HashMap();

    /* renamed from: com.anythink.core.common.v.g$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17550a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17551b;

        public AnonymousClass3(String str, String str2) {
            this.f17550a = str;
            this.f17551b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (g.this.f17542j) {
                try {
                    if (!g.this.i.exists()) {
                        g.this.i.mkdirs();
                    }
                    File file = new File(g.this.i, this.f17550a);
                    if (file.exists()) {
                        file.delete();
                    }
                    w.a(this.f17551b.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Map<String, String> e(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Map<String, String> d(String str) {
        Map<String, String> e9;
        synchronized (this.f17542j) {
            String str2 = "";
            try {
                File file = new File(this.i, str);
                if (file.exists() && file.canRead()) {
                    str2 = w.a(file);
                }
            } catch (Throwable unused) {
            }
            e9 = e(str2);
        }
        return e9;
    }

    public final boolean b(Context context) {
        String str;
        if (this.f17535a) {
            return false;
        }
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.anythink.core.d.d.a(context));
        if (k9 != null && !k9.S()) {
            str = k9.aa();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f17538e;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f17545m, str)) {
            return false;
        }
        String b9 = b();
        if (!TextUtils.isEmpty(b9) && TextUtils.equals(b9, str)) {
            if (this.f17543k.isEmpty()) {
                this.f17543k = d("adx_optional_res.txt");
            }
            return false;
        }
        this.f17540g = str;
        return true;
    }

    public final void c(final Context context) {
        if (b(context)) {
            String str = this.f17540g;
            this.f17535a = true;
            try {
                new com.anythink.core.common.m.h(str).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.g.2
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        g.this.f17535a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str2, AdError adError) {
                        g gVar = g.this;
                        gVar.f17545m = gVar.f17540g;
                        g gVar2 = g.this;
                        gVar2.f17535a = false;
                        com.anythink.core.common.u.e.a(3, gVar2.f17540g, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = g.this.f17537c;
                        String unused2 = g.this.f17540g;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            g gVar = g.this;
                            gVar.a(context, gVar.f17540g);
                            g gVar2 = g.this;
                            gVar2.f17543k = gVar2.e(obj2);
                            g.a(g.this, obj2, "adx_optional_res.txt");
                        }
                        g.this.f17535a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f17535a = false;
            }
        }
    }

    public static g a() {
        if (f17534d == null) {
            synchronized (g.class) {
                try {
                    if (f17534d == null) {
                        f17534d = new g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17534d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(Context context) {
        if (context == null) {
            try {
                context = com.anythink.core.common.d.t.b().g();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17544l = af.c(context, u.b.f13633a, "adx_optional_res_url", "");
    }

    public final Bitmap c(String str) {
        Map<String, String> map = this.f17543k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str2 = this.f17543k.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return com.IceFishing.LiveIceFishing.k.j().b(new com.anythink.core.common.res.e(3, str2), 0, 0);
    }

    public final void a(final Context context) {
        try {
            this.i = new File(com.anythink.core.common.d.t.b().g().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/anythink_optres/");
        } catch (Throwable unused) {
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.this.d(context);
                g gVar = g.this;
                gVar.f17543k = gVar.d("adx_optional_res.txt");
            }
        }, 2);
    }

    private void a(String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass3(str2, str), 2);
    }

    public final String a(String str) {
        Map<String, String> map = this.f17543k;
        if (map != null && !map.isEmpty()) {
            return this.f17543k.get(str);
        }
        return "";
    }

    private void a(List<String> list, String str) {
        if (list == null) {
            return;
        }
        String a9 = a(str);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        list.add(a9);
    }

    public final boolean b(String str) {
        Map<String, String> map = this.f17543k;
        if (map != null && !map.isEmpty()) {
            String str2 = this.f17543k.get(str);
            if (!TextUtils.isEmpty(str2) && com.IceFishing.LiveIceFishing.k.j().b(new com.anythink.core.common.res.e(3, str2), 0, 0) != null) {
                return true;
            }
        }
        return false;
    }

    public final void a(Set<String> set, String str) {
        String a9 = a(str);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        set.add(a9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, String str) {
        this.f17544l = str;
        af.b(context, u.b.f13633a, "adx_optional_res_url", str);
    }

    public static /* synthetic */ void a(g gVar, String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(gVar.new AnonymousClass3(str2, str), 2);
    }

    private synchronized String b() {
        return this.f17544l;
    }
}
