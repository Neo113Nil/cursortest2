package com.anythink.core.common.j;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.api.ATGDPRConsentDismissListener;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.NetTrafficeCallback;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.v;
import com.anythink.core.common.j.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static final String i = "anythink_ump";

    /* renamed from: j, reason: collision with root package name */
    private static volatile a f14227j;

    /* renamed from: k, reason: collision with root package name */
    private Map<Integer, c> f14236k;

    /* renamed from: l, reason: collision with root package name */
    private Map<Integer, c> f14237l;

    /* renamed from: q, reason: collision with root package name */
    private List<Integer> f14242q;

    /* renamed from: a, reason: collision with root package name */
    final int f14228a = -1;

    /* renamed from: b, reason: collision with root package name */
    final int f14229b = 100;

    /* renamed from: c, reason: collision with root package name */
    final int f14230c = 101;

    /* renamed from: d, reason: collision with root package name */
    final int f14231d = 102;

    /* renamed from: e, reason: collision with root package name */
    final int f14232e = 103;

    /* renamed from: f, reason: collision with root package name */
    final int f14233f = 104;

    /* renamed from: g, reason: collision with root package name */
    final int f14234g = 105;

    /* renamed from: h, reason: collision with root package name */
    final int f14235h = 106;

    /* renamed from: n, reason: collision with root package name */
    private String f14239n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f14240o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f14241p = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f14238m = false;

    private a() {
        HashMap hashMap = new HashMap();
        this.f14236k = hashMap;
        hashMap.put(2, new c(2, 755, 1));
        this.f14236k.put(33, new c(33, 755, 1));
        this.f14236k.put(6, new c(6, 867, 1));
        this.f14236k.put(3, new c(3, 333, 1));
        this.f14236k.put(37, new c(37, 262, 1));
        this.f14236k.put(13, new c(13, 667, 1));
        this.f14236k.put(36, new c(36, 31, 1));
        this.f14236k.put(58, new c(58, 512, 1));
        this.f14236k.put(75, new c(75, 793, 1));
        this.f14236k.put(1, new c(1, 89, 2));
        this.f14236k.put(12, new c(12, 3234, 2));
        this.f14236k.put(5, new c(5, 1301, 2));
        this.f14236k.put(9, new c(9, 2898, 2));
        this.f14236k.put(11, new c(11, 2878, 2));
        this.f14236k.put(23, new c(23, 1782, 2));
        this.f14236k.put(59, new c(59, 16831, 2));
        this.f14236k.put(45, new c(45, 3183, 2));
        this.f14236k.put(14, new c(14, 2710, 2));
        this.f14236k.put(10, new c(10, 1985, 2));
        this.f14236k.put(25, new c(25, 2312, 2));
        this.f14237l = new HashMap();
        this.f14242q = new ArrayList();
    }

    public final String c() {
        return this.f14239n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        String a9 = b.a(context).a();
        if (TextUtils.isEmpty(a9) || a9.contains("1")) {
            v.a(context).a(0);
        } else {
            v.a(context).a(1);
        }
    }

    public final synchronized boolean b() {
        return this.f14238m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(i, str);
        }
    }

    public static a a() {
        if (f14227j == null) {
            synchronized (a.class) {
                try {
                    if (f14227j == null) {
                        f14227j = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14227j;
    }

    public final void a(final Activity activity, final ATGDPRConsentDismissListener aTGDPRConsentDismissListener) {
        boolean z3;
        t.b();
        if (activity == null) {
            if (t.b().F()) {
                b("showGDPRConsentDialog fail:activity is null!");
            }
            a(aTGDPRConsentDismissListener, "activity is null!", -1);
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        try {
            d.a(applicationContext);
            z3 = true;
        } catch (Throwable unused) {
            z3 = false;
        }
        final boolean z6 = z3;
        if (t.b().F()) {
            b("Has UMP SDK:".concat(String.valueOf(z6)));
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.j.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!TextUtils.isEmpty(b.a(applicationContext).b())) {
                    if (z6) {
                        d.a(applicationContext).a(activity, new d.a() { // from class: com.anythink.core.common.j.a.1.1
                            @Override // com.anythink.core.common.j.d.a
                            public final void a(boolean z9) {
                                a.b("(UMP Update)UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z9)));
                            }

                            @Override // com.anythink.core.common.j.d.a
                            public final void a(String str) {
                                a.b("(UMP Update)UMP onConsentFail:".concat(String.valueOf(str)));
                            }
                        });
                    }
                    a.this.a(aTGDPRConsentDismissListener, "", 101);
                } else {
                    if (!z6) {
                        a.this.a(applicationContext, aTGDPRConsentDismissListener);
                        return;
                    }
                    d.a(applicationContext).a(activity, new d.a() { // from class: com.anythink.core.common.j.a.1.2
                        @Override // com.anythink.core.common.j.d.a
                        public final void a(boolean z9) {
                            if (t.b().F()) {
                                a.b("UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z9)));
                            }
                            if (z9) {
                                a.c(applicationContext);
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a.this.a(aTGDPRConsentDismissListener, "", z9 ? 105 : 103);
                        }

                        @Override // com.anythink.core.common.j.d.a
                        public final void a(String str) {
                            if (t.b().F()) {
                                a.b("UMP onConsentFail:".concat(String.valueOf(str)));
                            }
                            if (d.a(applicationContext).a()) {
                                a.b("UMP canRequestAd:true after onConsentFail");
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                a.this.a(aTGDPRConsentDismissListener, "", 106);
                            } else {
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                a.this.a(applicationContext, aTGDPRConsentDismissListener);
                            }
                        }
                    });
                    if (d.a(applicationContext).a()) {
                        a.b("UMP canRequestAd:true");
                        a.this.a(aTGDPRConsentDismissListener, "", 104);
                    }
                }
            }
        }, 2);
    }

    public final void a(final Context context, final ATGDPRConsentDismissListener aTGDPRConsentDismissListener) {
        if (v.a(context).a() != 2) {
            a(aTGDPRConsentDismissListener, "", 101);
        } else {
            ATSDK.checkIsEuTraffic(context, new NetTrafficeCallback() { // from class: com.anythink.core.common.j.a.2
                @Override // com.anythink.core.api.NetTrafficeCallback
                public final void onErrorCallback(String str) {
                    a.this.a(aTGDPRConsentDismissListener, str, -1);
                }

                @Override // com.anythink.core.api.NetTrafficeCallback
                public final void onResultCallback(boolean z3) {
                    if (z3) {
                        v.a(context).a(context, new ATGDPRAuthCallback() { // from class: com.anythink.core.common.j.a.2.1
                            @Override // com.anythink.core.api.ATGDPRAuthCallback
                            public final void onAuthResult(int i6) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                a.this.a(aTGDPRConsentDismissListener, "", 100);
                            }

                            @Override // com.anythink.core.api.ATGDPRAuthCallback
                            public final void onPageLoadFail() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                a.this.a(aTGDPRConsentDismissListener, "showUploadDataNotifyDialog onPageLoadFail", -1);
                            }
                        });
                    } else {
                        a.this.a(aTGDPRConsentDismissListener, "", 102);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ATGDPRConsentDismissListener aTGDPRConsentDismissListener, final String str, final int i6) {
        t.b().b(new Runnable() { // from class: com.anythink.core.common.j.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (aTGDPRConsentDismissListener == null || a.this.f14242q.contains(Integer.valueOf(aTGDPRConsentDismissListener.hashCode()))) {
                    return;
                }
                a.this.f14242q.add(Integer.valueOf(aTGDPRConsentDismissListener.hashCode()));
                aTGDPRConsentDismissListener.onDismiss(new ATGDPRConsentDismissListener.ConsentDismissInfo(str, i6));
            }
        });
    }

    public final synchronized void a(Context context) {
        boolean a9;
        try {
            if (TextUtils.isEmpty(this.f14239n)) {
                this.f14239n = b.a(context).b();
                this.f14241p = b.a(context).d();
                this.f14240o = b.a(context).c();
            }
            b("IABTCF_TCString:" + this.f14239n);
            b("IABTCF_VendorConsents:" + this.f14241p);
            b("IABTCF_AddtlConsent:" + this.f14240o);
            if (TextUtils.isEmpty(this.f14239n)) {
                this.f14238m = true;
                return;
            }
            this.f14238m = false;
            this.f14237l.clear();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f14240o)) {
                try {
                    String[] split = this.f14240o.split("~");
                    if (split.length >= 2) {
                        for (String str : split[1].split("\\.")) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            for (Map.Entry<Integer, c> entry : this.f14236k.entrySet()) {
                Integer key = entry.getKey();
                c value = entry.getValue();
                int c9 = value.c();
                if (c9 == 1) {
                    a9 = a(this.f14241p, value.b());
                } else if (c9 == 2) {
                    a9 = arrayList.size() == 0 ? false : arrayList.contains(Integer.valueOf(value.b()));
                } else {
                    this.f14237l.put(key, value);
                    b("initNetworkConsentMap " + value.a() + ":" + value.d());
                }
                value.a(a9);
                this.f14237l.put(key, value);
                b("initNetworkConsentMap " + value.a() + ":" + value.d());
            }
            c(context);
            StringBuilder sb = new StringBuilder("initNetworkConsentMap others:");
            sb.append(v.a(context).a() == 0);
            b(sb.toString());
            this.f14238m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean a(Context context, int i6) {
        c cVar;
        if (this.f14237l.size() > 0 && (cVar = this.f14237l.get(Integer.valueOf(i6))) != null) {
            return cVar.d();
        }
        return v.a(context).c();
    }

    private static boolean a(String str, int i6) {
        if (!TextUtils.isEmpty(str) && i6 > 0) {
            try {
                if (str.length() >= i6) {
                    if (str.charAt(i6 - 1) == '1') {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean a(List<Integer> list, int i6) {
        if (list.size() == 0) {
            return false;
        }
        return list.contains(Integer.valueOf(i6));
    }

    public final synchronized JSONObject a(JSONObject jSONObject) {
        if (!b() && TextUtils.isEmpty(this.f14239n)) {
            this.f14239n = b.a(t.b().g()).b();
            this.f14241p = b.a(t.b().g()).d();
            this.f14240o = b.a(t.b().g()).c();
        }
        try {
            if (!TextUtils.isEmpty(this.f14239n)) {
                jSONObject.put("tc_string", this.f14239n);
            }
            if (!TextUtils.isEmpty(this.f14240o)) {
                jSONObject.put("addtl_consent", this.f14240o);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
