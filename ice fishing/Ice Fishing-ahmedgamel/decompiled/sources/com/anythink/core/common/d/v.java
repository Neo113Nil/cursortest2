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
    private static volatile v f13654e;

    /* renamed from: b, reason: collision with root package name */
    Context f13656b;

    /* renamed from: c, reason: collision with root package name */
    int f13657c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13658d = "v";

    /* renamed from: a, reason: collision with root package name */
    final int f13655a = -100;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<Integer, Boolean> f13659f = new ConcurrentHashMap<>(5);

    private v(Context context) {
        this.f13657c = 2;
        if (context != null) {
            this.f13656b = context.getApplicationContext();
        }
        this.f13657c = af.b(this.f13656b, u.b.f13633a, u.a.f13621o, 2);
    }

    public final boolean c() {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.anythink.core.d.d.a(this.f13656b));
        return (k9 == null || k9.S()) ? this.f13657c != 1 : this.f13657c == 2 ? k9.ak() == 0 : k9.ai() == 1 ? k9.ah() == 0 : this.f13657c == 0 || k9.ak() == 0;
    }

    public final boolean d() {
        return af.b(this.f13656b, u.b.f13633a, u.a.f13629w, -100) == 1;
    }

    public static v a(Context context) {
        if (f13654e == null) {
            synchronized (v.class) {
                try {
                    if (f13654e == null) {
                        f13654e = new v(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13654e;
    }

    public final boolean b() {
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.anythink.core.d.d.a(this.f13656b));
        if (k9 == null || k9.S()) {
            return this.f13657c != 1;
        }
        if (k9.ak() == 0) {
            return true;
        }
        int i = this.f13657c;
        if (k9.ai() == 1) {
            i = k9.ah();
        }
        return i == 0;
    }

    public final void a(int i) {
        this.f13657c = i;
        af.a(this.f13656b, u.b.f13633a, u.a.f13621o, i);
    }

    public final int a() {
        return this.f13657c;
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
        int b9 = af.b(this.f13656b, u.b.f13633a, u.a.f13629w, -100);
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
            return com.anythink.core.common.j.a.a().a(this.f13656b, i);
        }
        return c();
    }

    public final boolean c(int i) {
        return this.f13659f.get(Integer.valueOf(i)) != null;
    }

    public final void a(final int i, final boolean z6) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.d.v.3
            @Override // java.lang.Runnable
            public final void run() {
                if (!v.this.c(i) || v.this.b(i, z6)) {
                    String unused = v.this.f13658d;
                    v a9 = v.a(t.b().g());
                    com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
                    if (TextUtils.isEmpty(com.anythink.core.common.j.a.a().c())) {
                        if (a9.f13657c == 2 && k9.ak() == 1 && k9.U() == 0) {
                            com.anythink.core.common.u.e.a(1, a9.f13657c, k9.ak(), i);
                        }
                        if (a9.f13657c == 1 && k9.ai() == 0 && k9.ak() == 0) {
                            com.anythink.core.common.u.e.a(2, a9.f13657c, k9.ak(), i);
                        }
                    } else {
                        com.anythink.core.common.u.e.a(3, !z6 ? 1 : 0, k9.ak(), i);
                    }
                    v.this.f13659f.put(Integer.valueOf(i), Boolean.valueOf(z6));
                }
            }
        }, 2);
    }

    public final boolean b(int i, boolean z6) {
        return this.f13659f.get(Integer.valueOf(i)) == null || this.f13659f.get(Integer.valueOf(i)).booleanValue() != z6;
    }
}
