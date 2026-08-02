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
    private static final String f13017a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static final long f13018b = 1800000;

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f13019c;

    /* renamed from: f, reason: collision with root package name */
    private volatile Handler f13022f;

    /* renamed from: h, reason: collision with root package name */
    private C0075a f13024h;

    /* renamed from: e, reason: collision with root package name */
    private final Object f13021e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f13023g = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private final c f13020d = new b();

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
        public final void a(boolean z6) {
            String unused = a.f13017a;
            if (z6) {
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
                String f2 = a9.f();
                jSONObject.toString();
                if (TextUtils.isEmpty(f2)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(f2);
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
        if (this.f13022f != null) {
            long j6 = this.f13023g.get();
            if (j6 <= 0) {
                j6 = f13018b;
            }
            this.f13022f.removeCallbacksAndMessages(null);
            this.f13022f.postDelayed(new AnonymousClass3(), j6);
        }
    }

    private static void b(JSONObject jSONObject) {
        try {
            com.anythink.core.d.b a9 = d.a();
            if (a9 != null && !a9.S() && jSONObject != null) {
                String f2 = a9.f();
                jSONObject.toString();
                if (TextUtils.isEmpty(f2)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(f2);
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
        if (f13019c == null) {
            synchronized (a.class) {
                try {
                    if (f13019c == null) {
                        f13019c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13019c;
    }

    public final void a(com.anythink.core.d.b bVar) {
        boolean z6;
        if (bVar == null || bVar.S()) {
            return;
        }
        if (!bVar.aQ()) {
            this.f13023g.set(0L);
            if (this.f13022f != null) {
                this.f13022f.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        if (this.f13022f == null) {
            synchronized (this.f13021e) {
                try {
                    if (this.f13022f == null) {
                        this.f13022f = com.anythink.core.common.v.b.b.a().a(18);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int aR = bVar.aR();
        synchronized (this.f13021e) {
            long j6 = this.f13023g.get();
            this.f13023g.set(aR);
            z6 = j6 == 0;
        }
        if (!z6 || this.f13022f == null) {
            return;
        }
        this.f13022f.removeCallbacksAndMessages(null);
        this.f13022f.post(new Runnable() { // from class: com.anythink.core.common.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, t.b().x());
            }
        });
    }

    private void a(boolean z6) {
        synchronized (this.f13021e) {
            byte b9 = 0;
            try {
                if (!z6) {
                    if (this.f13024h != null) {
                        t.b().b(this.f13024h);
                    }
                    this.f13024h = new C0075a(this, b9);
                    t.b().a(this.f13024h);
                    i.a();
                    e.a(b.a.f17979A, com.anythink.core.common.res.image.c.f17033a, "The application is in the background and cannot be obtained", i.q(), "", "", "", (ATAdRequest) null);
                    return;
                }
                if (this.f13024h != null) {
                    t.b().b(this.f13024h);
                    this.f13024h = null;
                }
                byte[] a9 = this.f13020d.a(t.b().g());
                if (a9 == null || a9.length == 0) {
                    return;
                }
                this.f13023g.get();
                new com.anythink.core.common.m.c(new com.anythink.core.common.h.t(a9)).a(0, (q) new AnonymousClass2());
                if (this.f13022f != null) {
                    long j6 = this.f13023g.get();
                    if (j6 <= 0) {
                        j6 = f13018b;
                    }
                    this.f13022f.removeCallbacksAndMessages(null);
                    this.f13022f.postDelayed(new AnonymousClass3(), j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z6) {
        synchronized (aVar.f13021e) {
            byte b9 = 0;
            try {
                if (!z6) {
                    if (aVar.f13024h != null) {
                        t.b().b(aVar.f13024h);
                    }
                    aVar.f13024h = new C0075a(aVar, b9);
                    t.b().a(aVar.f13024h);
                    i.a();
                    e.a(b.a.f17979A, com.anythink.core.common.res.image.c.f17033a, "The application is in the background and cannot be obtained", i.q(), "", "", "", (ATAdRequest) null);
                    return;
                }
                if (aVar.f13024h != null) {
                    t.b().b(aVar.f13024h);
                    aVar.f13024h = null;
                }
                byte[] a9 = aVar.f13020d.a(t.b().g());
                if (a9 == null || a9.length == 0) {
                    return;
                }
                aVar.f13023g.get();
                new com.anythink.core.common.m.c(new com.anythink.core.common.h.t(a9)).a(0, (q) aVar.new AnonymousClass2());
                if (aVar.f13022f != null) {
                    long j6 = aVar.f13023g.get();
                    if (j6 <= 0) {
                        j6 = f13018b;
                    }
                    aVar.f13022f.removeCallbacksAndMessages(null);
                    aVar.f13022f.postDelayed(aVar.new AnonymousClass3(), j6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
