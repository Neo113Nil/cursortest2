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
    private static volatile a f15013j;

    /* renamed from: k, reason: collision with root package name */
    private Map<Integer, c> f15022k;

    /* renamed from: l, reason: collision with root package name */
    private Map<Integer, c> f15023l;

    /* renamed from: q, reason: collision with root package name */
    private List<Integer> f15028q;

    /* renamed from: a, reason: collision with root package name */
    final int f15014a = -1;

    /* renamed from: b, reason: collision with root package name */
    final int f15015b = 100;

    /* renamed from: c, reason: collision with root package name */
    final int f15016c = 101;

    /* renamed from: d, reason: collision with root package name */
    final int f15017d = 102;

    /* renamed from: e, reason: collision with root package name */
    final int f15018e = 103;

    /* renamed from: f, reason: collision with root package name */
    final int f15019f = 104;

    /* renamed from: g, reason: collision with root package name */
    final int f15020g = 105;

    /* renamed from: h, reason: collision with root package name */
    final int f15021h = 106;

    /* renamed from: n, reason: collision with root package name */
    private String f15025n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f15026o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f15027p = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f15024m = false;

    private a() {
        HashMap hashMap = new HashMap();
        this.f15022k = hashMap;
        hashMap.put(2, new c(2, 755, 1));
        this.f15022k.put(33, new c(33, 755, 1));
        this.f15022k.put(6, new c(6, 867, 1));
        this.f15022k.put(3, new c(3, 333, 1));
        this.f15022k.put(37, new c(37, 262, 1));
        this.f15022k.put(13, new c(13, 667, 1));
        this.f15022k.put(36, new c(36, 31, 1));
        this.f15022k.put(58, new c(58, 512, 1));
        this.f15022k.put(75, new c(75, 793, 1));
        this.f15022k.put(1, new c(1, 89, 2));
        this.f15022k.put(12, new c(12, 3234, 2));
        this.f15022k.put(5, new c(5, 1301, 2));
        this.f15022k.put(9, new c(9, 2898, 2));
        this.f15022k.put(11, new c(11, 2878, 2));
        this.f15022k.put(23, new c(23, 1782, 2));
        this.f15022k.put(59, new c(59, 16831, 2));
        this.f15022k.put(45, new c(45, 3183, 2));
        this.f15022k.put(14, new c(14, 2710, 2));
        this.f15022k.put(10, new c(10, 1985, 2));
        this.f15022k.put(25, new c(25, 2312, 2));
        this.f15023l = new HashMap();
        this.f15028q = new ArrayList();
    }

    public final String c() {
        return this.f15025n;
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
        return this.f15024m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(i, str);
        }
    }

    public static a a() {
        if (f15013j == null) {
            synchronized (a.class) {
                try {
                    if (f15013j == null) {
                        f15013j = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15013j;
    }

    public final void a(final Activity activity, final ATGDPRConsentDismissListener aTGDPRConsentDismissListener) {
        boolean z6;
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
            z6 = true;
        } catch (Throwable unused) {
            z6 = false;
        }
        final boolean z9 = z6;
        if (t.b().F()) {
            b("Has UMP SDK:".concat(String.valueOf(z9)));
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.j.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!TextUtils.isEmpty(b.a(applicationContext).b())) {
                    if (z9) {
                        d.a(applicationContext).a(activity, new d.a() { // from class: com.anythink.core.common.j.a.1.1
                            @Override // com.anythink.core.common.j.d.a
                            public final void a(boolean z10) {
                                a.b("(UMP Update)UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z10)));
                            }

                            @Override // com.anythink.core.common.j.d.a
                            public final void a(String str) {
                                a.b("(UMP Update)UMP onConsentFail:".concat(String.valueOf(str)));
                            }
                        });
                    }
                    a.this.a(aTGDPRConsentDismissListener, "", 101);
                } else {
                    if (!z9) {
                        a.this.a(applicationContext, aTGDPRConsentDismissListener);
                        return;
                    }
                    d.a(applicationContext).a(activity, new d.a() { // from class: com.anythink.core.common.j.a.1.2
                        @Override // com.anythink.core.common.j.d.a
                        public final void a(boolean z10) {
                            if (t.b().F()) {
                                a.b("UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z10)));
                            }
                            if (z10) {
                                a.c(applicationContext);
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a.this.a(aTGDPRConsentDismissListener, "", z10 ? 105 : 103);
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
                public final void onResultCallback(boolean z6) {
                    if (z6) {
                        v.a(context).a(context, new ATGDPRAuthCallback() { // from class: com.anythink.core.common.j.a.2.1
                            @Override // com.anythink.core.api.ATGDPRAuthCallback
                            public final void onAuthResult(int i4) {
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
    public void a(final ATGDPRConsentDismissListener aTGDPRConsentDismissListener, final String str, final int i4) {
        t.b().b(new Runnable() { // from class: com.anythink.core.common.j.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (aTGDPRConsentDismissListener == null || a.this.f15028q.contains(Integer.valueOf(aTGDPRConsentDismissListener.hashCode()))) {
                    return;
                }
                a.this.f15028q.add(Integer.valueOf(aTGDPRConsentDismissListener.hashCode()));
                aTGDPRConsentDismissListener.onDismiss(new ATGDPRConsentDismissListener.ConsentDismissInfo(str, i4));
            }
        });
    }

    public final synchronized void a(Context context) {
        boolean a9;
        try {
            if (TextUtils.isEmpty(this.f15025n)) {
                this.f15025n = b.a(context).b();
                this.f15027p = b.a(context).d();
                this.f15026o = b.a(context).c();
            }
            b("IABTCF_TCString:" + this.f15025n);
            b("IABTCF_VendorConsents:" + this.f15027p);
            b("IABTCF_AddtlConsent:" + this.f15026o);
            if (TextUtils.isEmpty(this.f15025n)) {
                this.f15024m = true;
                return;
            }
            this.f15024m = false;
            this.f15023l.clear();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f15026o)) {
                try {
                    String[] split = this.f15026o.split("~");
                    if (split.length >= 2) {
                        for (String str : split[1].split("\\.")) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            for (Map.Entry<Integer, c> entry : this.f15022k.entrySet()) {
                Integer key = entry.getKey();
                c value = entry.getValue();
                int c9 = value.c();
                if (c9 == 1) {
                    a9 = a(this.f15027p, value.b());
                } else if (c9 == 2) {
                    a9 = arrayList.size() == 0 ? false : arrayList.contains(Integer.valueOf(value.b()));
                } else {
                    this.f15023l.put(key, value);
                    b("initNetworkConsentMap " + value.a() + ":" + value.d());
                }
                value.a(a9);
                this.f15023l.put(key, value);
                b("initNetworkConsentMap " + value.a() + ":" + value.d());
            }
            c(context);
            StringBuilder sb = new StringBuilder("initNetworkConsentMap others:");
            sb.append(v.a(context).a() == 0);
            b(sb.toString());
            this.f15024m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean a(Context context, int i4) {
        c cVar;
        if (this.f15023l.size() > 0 && (cVar = this.f15023l.get(Integer.valueOf(i4))) != null) {
            return cVar.d();
        }
        return v.a(context).c();
    }

    private static boolean a(String str, int i4) {
        if (!TextUtils.isEmpty(str) && i4 > 0) {
            try {
                if (str.length() >= i4) {
                    if (str.charAt(i4 - 1) == '1') {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean a(List<Integer> list, int i4) {
        if (list.size() == 0) {
            return false;
        }
        return list.contains(Integer.valueOf(i4));
    }

    public final synchronized JSONObject a(JSONObject jSONObject) {
        if (!b() && TextUtils.isEmpty(this.f15025n)) {
            this.f15025n = b.a(t.b().g()).b();
            this.f15027p = b.a(t.b().g()).d();
            this.f15026o = b.a(t.b().g()).c();
        }
        try {
            if (!TextUtils.isEmpty(this.f15025n)) {
                jSONObject.put("tc_string", this.f15025n);
            }
            if (!TextUtils.isEmpty(this.f15026o)) {
                jSONObject.put("addtl_consent", this.f15026o);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
