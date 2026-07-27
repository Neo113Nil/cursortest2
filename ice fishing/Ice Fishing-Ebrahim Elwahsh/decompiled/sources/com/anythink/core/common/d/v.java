package com.anythink.core.common.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.anythink.core.activity.AnyThinkGdprAuthActivity;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.api.AdError;
import com.anythink.core.api.NetTrafficeCallback;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v {

    /* renamed from: e, reason: collision with root package name */
    private static volatile v f13025e;

    /* renamed from: b, reason: collision with root package name */
    Context f13027b;

    /* renamed from: c, reason: collision with root package name */
    int f13028c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13029d = "v";

    /* renamed from: a, reason: collision with root package name */
    final int f13026a = -100;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<Integer, Boolean> f13030f = new ConcurrentHashMap<>(5);

    private v(Context context) {
        this.f13028c = 2;
        if (context != null) {
            this.f13027b = context.getApplicationContext();
        }
        this.f13028c = af.b(this.f13027b, u.b.f13004a, u.a.f12992o, 2);
    }

    public final boolean c() {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(this.f13027b));
        return (k6 == null || k6.S()) ? this.f13028c != 1 : this.f13028c == 2 ? k6.ak() == 0 : k6.ai() == 1 ? k6.ah() == 0 : this.f13028c == 0 || k6.ak() == 0;
    }

    public final boolean d() {
        return af.b(this.f13027b, u.b.f13004a, u.a.f13000w, -100) == 1;
    }

    public static v a(Context context) {
        if (f13025e == null) {
            synchronized (v.class) {
                try {
                    if (f13025e == null) {
                        f13025e = new v(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13025e;
    }

    public final boolean b() {
        com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(this.f13027b));
        if (k6 == null || k6.S()) {
            return this.f13028c != 1;
        }
        if (k6.ak() == 0) {
            return true;
        }
        int i = this.f13028c;
        if (k6.ai() == 1) {
            i = k6.ah();
        }
        return i == 0;
    }

    public final void a(int i) {
        this.f13028c = i;
        af.a(this.f13027b, u.b.f13004a, u.a.f12992o, i);
    }

    public final int a() {
        return this.f13028c;
    }

    public final void a(final Context context, final ATGDPRAuthCallback aTGDPRAuthCallback) {
        t.b().b(new Runnable() { // from class: com.anythink.core.common.d.v.1
            @Override // java.lang.Runnable
            public final void run() {
                AnyThinkGdprAuthActivity.mCallback = aTGDPRAuthCallback;
                Intent intent = new Intent(context, (Class<?>) AnyThinkGdprAuthActivity.class);
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
        });
    }

    public final void a(final NetTrafficeCallback netTrafficeCallback) {
        int b9 = af.b(this.f13027b, u.b.f13004a, u.a.f13000w, -100);
        if (b9 == -100) {
            new com.anythink.core.common.m.p().a(0, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.d.v.2
                @Override // com.anythink.core.common.m.q
                public final void onLoadCanceled(int i) {
                }

                @Override // com.anythink.core.common.m.q
                public final void onLoadError(int i, String str, AdError adError) {
                    NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                    if (netTrafficeCallback2 != null) {
                        netTrafficeCallback2.onErrorCallback(adError.printStackTrace());
                    }
                }

                @Override // com.anythink.core.common.m.q
                public final void onLoadFinish(int i, Object obj) {
                    try {
                        if (!(obj instanceof JSONObject)) {
                            NetTrafficeCallback netTrafficeCallback2 = netTrafficeCallback;
                            if (netTrafficeCallback2 != null) {
                                netTrafficeCallback2.onErrorCallback("There is no result.");
                                return;
                            }
                            return;
                        }
                        JSONObject jSONObject = (JSONObject) obj;
                        if (!jSONObject.has("is_eu")) {
                            NetTrafficeCallback netTrafficeCallback3 = netTrafficeCallback;
                            if (netTrafficeCallback3 != null) {
                                netTrafficeCallback3.onErrorCallback("There is no result.");
                                return;
                            }
                            return;
                        }
                        if (jSONObject.optInt("is_eu") == 1) {
                            NetTrafficeCallback netTrafficeCallback4 = netTrafficeCallback;
                            if (netTrafficeCallback4 != null) {
                                netTrafficeCallback4.onResultCallback(true);
                                return;
                            }
                            return;
                        }
                        NetTrafficeCallback netTrafficeCallback5 = netTrafficeCallback;
                        if (netTrafficeCallback5 != null) {
                            netTrafficeCallback5.onResultCallback(false);
                        }
                    } catch (Throwable unused) {
                        NetTrafficeCallback netTrafficeCallback6 = netTrafficeCallback;
                        if (netTrafficeCallback6 != null) {
                            netTrafficeCallback6.onErrorCallback("Internal error");
                        }
                    }
                }

                @Override // com.anythink.core.common.m.q
                public final void onLoadStart(int i) {
                }
            });
            return;
        }
        if (b9 == 1) {
            if (netTrafficeCallback != null) {
                netTrafficeCallback.onResultCallback(true);
            }
        } else if (netTrafficeCallback != null) {
            netTrafficeCallback.onResultCallback(false);
        }
    }

    public final boolean b(int i) {
        if (com.anythink.core.common.j.a.a().b()) {
            return com.anythink.core.common.j.a.a().a(this.f13027b, i);
        }
        return c();
    }

    public final boolean c(int i) {
        return this.f13030f.get(Integer.valueOf(i)) != null;
    }

    public final void a(final int i, final boolean z8) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.d.v.3
            @Override // java.lang.Runnable
            public final void run() {
                if (!v.this.c(i) || v.this.b(i, z8)) {
                    String unused = v.this.f13029d;
                    v a9 = v.a(t.b().g());
                    com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.basead.b.c.i.l());
                    if (TextUtils.isEmpty(com.anythink.core.common.j.a.a().c())) {
                        if (a9.f13028c == 2 && k6.ak() == 1 && k6.U() == 0) {
                            com.anythink.core.common.u.e.a(1, a9.f13028c, k6.ak(), i);
                        }
                        if (a9.f13028c == 1 && k6.ai() == 0 && k6.ak() == 0) {
                            com.anythink.core.common.u.e.a(2, a9.f13028c, k6.ak(), i);
                        }
                    } else {
                        com.anythink.core.common.u.e.a(3, !z8 ? 1 : 0, k6.ak(), i);
                    }
                    v.this.f13030f.put(Integer.valueOf(i), Boolean.valueOf(z8));
                }
            }
        }, 2);
    }

    public final boolean b(int i, boolean z8) {
        return this.f13030f.get(Integer.valueOf(i)) == null || this.f13030f.get(Integer.valueOf(i)).booleanValue() != z8;
    }
}
