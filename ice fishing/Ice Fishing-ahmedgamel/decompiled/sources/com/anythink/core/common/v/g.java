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
    private static volatile g f16747d;

    /* renamed from: g, reason: collision with root package name */
    private String f16753g;
    private File i;

    /* renamed from: l, reason: collision with root package name */
    private String f16757l;

    /* renamed from: m, reason: collision with root package name */
    private String f16758m;

    /* renamed from: c, reason: collision with root package name */
    private final String f16750c = getClass().getSimpleName();

    /* renamed from: e, reason: collision with root package name */
    private final String f16751e = k.b("aHR0cHM6Ly9tb3Jlcy5hbnl0aGlua3RlY2guY29tL3RpbmlmeS90YWt1X2FkeF9leHRfcmVzX2pzb24udHh0");

    /* renamed from: f, reason: collision with root package name */
    private final String f16752f = "adx_optional_res.txt";

    /* renamed from: h, reason: collision with root package name */
    private final String f16754h = "anythink_optres/";

    /* renamed from: a, reason: collision with root package name */
    boolean f16748a = false;

    /* renamed from: b, reason: collision with root package name */
    final String f16749b = "adx_optional_res_url";

    /* renamed from: j, reason: collision with root package name */
    private final Object f16755j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private Map<String, String> f16756k = new HashMap();

    /* renamed from: com.anythink.core.common.v.g$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16764b;

        public AnonymousClass3(String str, String str2) {
            this.f16763a = str;
            this.f16764b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (g.this.f16755j) {
                try {
                    if (!g.this.i.exists()) {
                        g.this.i.mkdirs();
                    }
                    File file = new File(g.this.i, this.f16763a);
                    if (file.exists()) {
                        file.delete();
                    }
                    w.a(this.f16764b.getBytes(), file);
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
        synchronized (this.f16755j) {
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
        if (this.f16748a) {
            return false;
        }
        com.anythink.core.d.b g4 = D.y.g(com.anythink.core.d.d.a(context));
        if (g4 != null && !g4.S()) {
            str = g4.aa();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f16751e;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.f16758m, str)) {
            return false;
        }
        String b9 = b();
        if (!TextUtils.isEmpty(b9) && TextUtils.equals(b9, str)) {
            if (this.f16756k.isEmpty()) {
                this.f16756k = d("adx_optional_res.txt");
            }
            return false;
        }
        this.f16753g = str;
        return true;
    }

    public final void c(final Context context) {
        if (b(context)) {
            String str = this.f16753g;
            this.f16748a = true;
            try {
                new com.anythink.core.common.m.h(str).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.g.2
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        g.this.f16748a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str2, AdError adError) {
                        g gVar = g.this;
                        gVar.f16758m = gVar.f16753g;
                        g gVar2 = g.this;
                        gVar2.f16748a = false;
                        com.anythink.core.common.u.e.a(3, gVar2.f16753g, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = g.this.f16750c;
                        String unused2 = g.this.f16753g;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            g gVar = g.this;
                            gVar.a(context, gVar.f16753g);
                            g gVar2 = g.this;
                            gVar2.f16756k = gVar2.e(obj2);
                            g.a(g.this, obj2, "adx_optional_res.txt");
                        }
                        g.this.f16748a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }
                });
            } catch (Throwable unused) {
                this.f16748a = false;
            }
        }
    }

    public static g a() {
        if (f16747d == null) {
            synchronized (g.class) {
                try {
                    if (f16747d == null) {
                        f16747d = new g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16747d;
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
        this.f16757l = af.c(context, u.b.f12847a, "adx_optional_res_url", "");
    }

    public final Bitmap c(String str) {
        Map<String, String> map = this.f16756k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str2 = this.f16756k.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return D.y.f().b(new com.anythink.core.common.res.e(3, str2), 0, 0);
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
                gVar.f16756k = gVar.d("adx_optional_res.txt");
            }
        }, 2);
    }

    private void a(String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass3(str2, str), 2);
    }

    public final String a(String str) {
        Map<String, String> map = this.f16756k;
        if (map != null && !map.isEmpty()) {
            return this.f16756k.get(str);
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
        Map<String, String> map = this.f16756k;
        if (map != null && !map.isEmpty()) {
            String str2 = this.f16756k.get(str);
            if (!TextUtils.isEmpty(str2) && D.y.f().b(new com.anythink.core.common.res.e(3, str2), 0, 0) != null) {
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
        this.f16757l = str;
        af.b(context, u.b.f12847a, "adx_optional_res_url", str);
    }

    public static /* synthetic */ void a(g gVar, String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(gVar.new AnonymousClass3(str2, str), 2);
    }

    private synchronized String b() {
        return this.f16757l;
    }
}
