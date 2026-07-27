package com.anythink.core.common.b;

import android.os.Handler;
import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.m;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.s;
import com.anythink.core.common.i;
import com.anythink.core.common.m.q;
import com.anythink.core.common.u.e;
import com.anythink.core.d.b;
import com.anythink.core.d.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12231a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static final long f12232b = 1800000;

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f12233c;

    /* renamed from: f, reason: collision with root package name */
    private volatile Handler f12236f;

    /* renamed from: h, reason: collision with root package name */
    private C0075a f12238h;

    /* renamed from: e, reason: collision with root package name */
    private final Object f12235e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f12237g = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private final c f12234d = new b();

    /* renamed from: com.anythink.core.common.b.a$2, reason: invalid class name */
    public class AnonymousClass2 extends com.anythink.core.common.m.b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadError(int i, String str, AdError adError) {
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadFinish(int i, Object obj) {
            if (obj instanceof JSONObject) {
                a.a((JSONObject) obj);
            }
        }
    }

    /* renamed from: com.anythink.core.common.b.a$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.a(a.this, t.b().x());
        }
    }

    /* renamed from: com.anythink.core.common.b.a$a, reason: collision with other inner class name */
    public class C0075a implements m {
        private C0075a() {
        }

        @Override // com.anythink.core.common.d.m
        public final void a(boolean z3) {
            String unused = a.f12231a;
            if (z3) {
                a.a(a.this, true);
            }
        }

        public /* synthetic */ C0075a(a aVar, byte b9) {
            this();
        }
    }

    private a() {
    }

    public static /* synthetic */ void a(JSONObject jSONObject) {
        try {
            com.anythink.core.d.b a9 = d.a();
            if (a9 != null && !a9.S() && jSONObject != null) {
                String f3 = a9.f();
                jSONObject.toString();
                if (TextUtils.isEmpty(f3)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(f3);
                JSONArray optJSONArray = jSONObject2.optJSONArray("tags");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(optJSONArray.optJSONObject(i).optString("name"));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                List<s.a> a10 = s.a(jSONObject).a();
                if (a10 != null && !a10.isEmpty()) {
                    for (s.a aVar : a10) {
                        if (!arrayList.contains(aVar.a())) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("name", aVar.a());
                            arrayList2.add(jSONObject3);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    optJSONArray.put((JSONObject) it.next());
                }
                jSONObject2.put("tags", optJSONArray);
                a9.a(jSONObject2.toString());
                t.b().a(a9);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void c() {
        if (this.f12236f != null) {
            long j6 = this.f12237g.get();
            if (j6 <= 0) {
                j6 = f12232b;
            }
            this.f12236f.removeCallbacksAndMessages(null);
            this.f12236f.postDelayed(new AnonymousClass3(), j6);
        }
    }

    private static void b(JSONObject jSONObject) {
        try {
            com.anythink.core.d.b a9 = d.a();
            if (a9 != null && !a9.S() && jSONObject != null) {
                String f3 = a9.f();
                jSONObject.toString();
                if (TextUtils.isEmpty(f3)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(f3);
                JSONArray optJSONArray = jSONObject2.optJSONArray("tags");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(optJSONArray.optJSONObject(i).optString("name"));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                List<s.a> a10 = s.a(jSONObject).a();
                if (a10 != null && !a10.isEmpty()) {
                    for (s.a aVar : a10) {
                        if (!arrayList.contains(aVar.a())) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("name", aVar.a());
                            arrayList2.add(jSONObject3);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    optJSONArray.put((JSONObject) it.next());
                }
                jSONObject2.put("tags", optJSONArray);
                a9.a(jSONObject2.toString());
                t.b().a(a9);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static a a() {
        if (f12233c == null) {
            synchronized (a.class) {
                try {
                    if (f12233c == null) {
                        f12233c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12233c;
    }

    public final void a(com.anythink.core.d.b bVar) {
        boolean z3;
        if (bVar == null || bVar.S()) {
            return;
        }
        if (!bVar.aQ()) {
            this.f12237g.set(0L);
            if (this.f12236f != null) {
                this.f12236f.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        if (this.f12236f == null) {
            synchronized (this.f12235e) {
                try {
                    if (this.f12236f == null) {
                        this.f12236f = com.anythink.core.common.v.b.b.a().a(18);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int aR = bVar.aR();
        synchronized (this.f12235e) {
            long j6 = this.f12237g.get();
            this.f12237g.set(aR);
            z3 = j6 == 0;
        }
        if (!z3 || this.f12236f == null) {
            return;
        }
        this.f12236f.removeCallbacksAndMessages(null);
        this.f12236f.post(new Runnable() { // from class: com.anythink.core.common.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, t.b().x());
            }
        });
    }

    private void a(boolean z3) {
        synchronized (this.f12235e) {
            byte b9 = 0;
            try {
                if (!z3) {
                    if (this.f12238h != null) {
                        t.b().b(this.f12238h);
                    }
                    this.f12238h = new C0075a(this, b9);
                    t.b().a(this.f12238h);
                    i.a();
                    e.a(b.a.f17192A, com.anythink.core.common.res.image.c.f16246a, "The application is in the background and cannot be obtained", i.q(), "", "", "", (ATAdRequest) null);
                    return;
                }
                if (this.f12238h != null) {
                    t.b().b(this.f12238h);
                    this.f12238h = null;
                }
                byte[] a9 = this.f12234d.a(t.b().g());
                if (a9 == null || a9.length == 0) {
                    return;
                }
                this.f12237g.get();
                new com.anythink.core.common.m.c(new com.anythink.core.common.h.t(a9)).a(0, (q) new AnonymousClass2());
                if (this.f12236f != null) {
                    long j6 = this.f12237g.get();
                    if (j6 <= 0) {
                        j6 = f12232b;
                    }
                    this.f12236f.removeCallbacksAndMessages(null);
                    this.f12236f.postDelayed(new AnonymousClass3(), j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z3) {
        synchronized (aVar.f12235e) {
            byte b9 = 0;
            try {
                if (!z3) {
                    if (aVar.f12238h != null) {
                        t.b().b(aVar.f12238h);
                    }
                    aVar.f12238h = new C0075a(aVar, b9);
                    t.b().a(aVar.f12238h);
                    i.a();
                    e.a(b.a.f17192A, com.anythink.core.common.res.image.c.f16246a, "The application is in the background and cannot be obtained", i.q(), "", "", "", (ATAdRequest) null);
                    return;
                }
                if (aVar.f12238h != null) {
                    t.b().b(aVar.f12238h);
                    aVar.f12238h = null;
                }
                byte[] a9 = aVar.f12234d.a(t.b().g());
                if (a9 == null || a9.length == 0) {
                    return;
                }
                aVar.f12237g.get();
                new com.anythink.core.common.m.c(new com.anythink.core.common.h.t(a9)).a(0, (q) aVar.new AnonymousClass2());
                if (aVar.f12236f != null) {
                    long j6 = aVar.f12237g.get();
                    if (j6 <= 0) {
                        j6 = f12232b;
                    }
                    aVar.f12236f.removeCallbacksAndMessages(null);
                    aVar.f12236f.postDelayed(aVar.new AnonymousClass3(), j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
