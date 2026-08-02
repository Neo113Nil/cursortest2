package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import h.C4543G;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2846Vg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29013n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f29014u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f29015v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f29016w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f29017x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f29018y;

    public /* synthetic */ RunnableC2846Vg(C2590Gf c2590Gf, Throwable th, C4260yv c4260yv, String str, C4543G c4543g) {
        this.f29015v = c2590Gf;
        this.f29016w = th;
        this.f29017x = c4260yv;
        this.f29014u = str;
        this.f29018y = c4543g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c9;
        String str;
        Object obj = this.f29014u;
        Object obj2 = this.f29018y;
        Object obj3 = this.f29017x;
        Object obj4 = this.f29016w;
        Object obj5 = this.f29015v;
        switch (this.f29013n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheCanceled");
                hashMap.put("src", (String) obj);
                String str2 = (String) obj5;
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("cachedSrc", str2);
                }
                String str3 = (String) obj4;
                switch (str3.hashCode()) {
                    case -1947652542:
                        if (str3.equals("interrupted")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1396664534:
                        if (str3.equals("badUrl")) {
                            c9 = '\b';
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1347010958:
                        if (str3.equals("inProgress")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -918817863:
                        if (str3.equals("downloadTimeout")) {
                            c9 = '\t';
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -659376217:
                        if (str3.equals("contentLengthMissing")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -642208130:
                        if (str3.equals("playerFailed")) {
                            c9 = 5;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -354048396:
                        if (str3.equals("sizeExceeded")) {
                            c9 = 11;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -32082395:
                        if (str3.equals("externalAbort")) {
                            c9 = '\n';
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 3387234:
                        if (str3.equals("noop")) {
                            c9 = 4;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 96784904:
                        if (str3.equals("error")) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 580119100:
                        if (str3.equals("expireFailed")) {
                            c9 = 6;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 725497484:
                        if (str3.equals("noCacheDir")) {
                            c9 = 7;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                switch (c9) {
                    case 6:
                    case 7:
                        str = "io";
                        break;
                    case '\b':
                    case '\t':
                        str = "network";
                        break;
                    case '\n':
                    case 11:
                        str = "policy";
                        break;
                    default:
                        str = "internal";
                        break;
                }
                hashMap.put("type", str);
                hashMap.put("reason", str3);
                String str4 = (String) obj3;
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put("message", str4);
                }
                ((AbstractC2862Wg) obj2).n(hashMap);
                return;
            case 1:
                Throwable th = (Throwable) obj4;
                C2590Gf c2590Gf = (C2590Gf) obj5;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Jb)).booleanValue()) {
                    C2521Ce.c(((C2712Ni) c2590Gf.f25833x).f27294a).e("AttributionReporting.registerSourceAndPingClickUrl", th);
                } else {
                    C2521Ce.a(((C2712Ni) c2590Gf.f25833x).f27294a).e("AttributionReportingSampled.registerSourceAndPingClickUrl", th);
                }
                ((C4260yv) obj3).b((String) obj, (C4543G) obj2, null, null);
                return;
            case 2:
                String str5 = (String) obj;
                BinderC4307zo binderC4307zo = (BinderC4307zo) obj4;
                C3558lu c3558lu = (C3558lu) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                C2531Co c2531Co = (C2531Co) obj5;
                c2531Co.getClass();
                try {
                    try {
                        if (Objects.equals(str5, "com.google.ads.mediation.admob.AdMobAdapter")) {
                            binderC4307zo.d();
                            return;
                        }
                        Context context = (Context) c2531Co.f24972g.get();
                        if (context == null) {
                            context = c2531Co.f24971f;
                        }
                        try {
                            c3558lu.f32644a.l1(new Y2.b(context), binderC4307zo, arrayList);
                            return;
                        } catch (Throwable th2) {
                            throw new C3290gu(th2);
                        }
                    } catch (RemoteException e9) {
                        int i = w2.z.f41712b;
                        x2.i.d("", e9);
                        return;
                    }
                } catch (RemoteException e10) {
                    throw new B0.c(e10);
                } catch (C3290gu unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 74);
                    sb.append("Failed to initialize adapter. ");
                    sb.append(str5);
                    sb.append(" does not implement the initialize() method.");
                    binderC4307zo.U3(sb.toString());
                    return;
                }
            case 3:
                Pz pz = (Pz) obj;
                Context context2 = (Context) obj4;
                View view = (View) obj3;
                HashMap hashMap2 = (HashMap) obj5;
                hashMap2.putAll(pz.f27687e.b(context2, view));
                pz.g(hashMap2);
                hashMap2.put("f", "v");
                hashMap2.put("ctx", context2);
                hashMap2.put(com.anythink.expressad.a.f18383C, view);
                hashMap2.put("act", (Activity) obj2);
                hashMap2.put("bds", null);
                return;
            default:
                Pz pz2 = (Pz) obj5;
                HashMap hashMap3 = (HashMap) obj4;
                hashMap3.putAll(pz2.f27687e.c());
                pz2.g(hashMap3);
                hashMap3.put("f", "c");
                hashMap3.put("ctx", (Context) obj3);
                hashMap3.put(com.anythink.expressad.a.f18383C, (View) obj2);
                hashMap3.put("act", null);
                hashMap3.put("bds", (String) obj);
                return;
        }
    }

    public /* synthetic */ RunnableC2846Vg(C2531Co c2531Co, String str, BinderC4307zo binderC4307zo, C3558lu c3558lu, ArrayList arrayList) {
        this.f29015v = c2531Co;
        this.f29014u = str;
        this.f29016w = binderC4307zo;
        this.f29017x = c3558lu;
        this.f29018y = arrayList;
    }

    public /* synthetic */ RunnableC2846Vg(Pz pz, HashMap hashMap, Context context, View view, Activity activity) {
        this.f29014u = pz;
        this.f29015v = hashMap;
        this.f29016w = context;
        this.f29017x = view;
        this.f29018y = activity;
    }

    public /* synthetic */ RunnableC2846Vg(Pz pz, HashMap hashMap, Context context, View view, String str) {
        this.f29015v = pz;
        this.f29016w = hashMap;
        this.f29017x = context;
        this.f29018y = view;
        this.f29014u = str;
    }

    public RunnableC2846Vg(AbstractC2862Wg abstractC2862Wg, String str, String str2, String str3, String str4) {
        this.f29014u = str;
        this.f29015v = str2;
        this.f29016w = str3;
        this.f29017x = str4;
        Objects.requireNonNull(abstractC2862Wg);
        this.f29018y = abstractC2862Wg;
    }
}
