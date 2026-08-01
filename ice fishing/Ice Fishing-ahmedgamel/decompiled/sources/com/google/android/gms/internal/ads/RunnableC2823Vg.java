package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import l.C4648e;

/* renamed from: com.google.android.gms.internal.ads.Vg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2823Vg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28216n = 2;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28217u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28218v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28219w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f28220x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f28221y;

    public /* synthetic */ RunnableC2823Vg(C2570Gf c2570Gf, Throwable th, C4237yv c4237yv, String str, C4648e c4648e) {
        this.f28218v = c2570Gf;
        this.f28219w = th;
        this.f28220x = c4237yv;
        this.f28217u = str;
        this.f28221y = c4648e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c9;
        String str;
        Object obj = this.f28217u;
        Object obj2 = this.f28221y;
        Object obj3 = this.f28220x;
        Object obj4 = this.f28219w;
        Object obj5 = this.f28218v;
        switch (this.f28216n) {
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
                ((AbstractC2839Wg) obj2).n(hashMap);
                return;
            case 1:
                Throwable th = (Throwable) obj4;
                C2570Gf c2570Gf = (C2570Gf) obj5;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Jb)).booleanValue()) {
                    C2501Ce.c(((C2692Ni) c2570Gf.f25045x).f26511a).e("AttributionReporting.registerSourceAndPingClickUrl", th);
                } else {
                    C2501Ce.a(((C2692Ni) c2570Gf.f25045x).f26511a).e("AttributionReportingSampled.registerSourceAndPingClickUrl", th);
                }
                ((C4237yv) obj3).b((String) obj, (C4648e) obj2, null, null);
                return;
            case 2:
                String str5 = (String) obj;
                BinderC4230yo binderC4230yo = (BinderC4230yo) obj4;
                C3535lu c3535lu = (C3535lu) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                C2494Bo c2494Bo = (C2494Bo) obj5;
                c2494Bo.getClass();
                try {
                    try {
                        if (Objects.equals(str5, "com.google.ads.mediation.admob.AdMobAdapter")) {
                            binderC4230yo.d();
                            return;
                        }
                        Context context = (Context) c2494Bo.f23959g.get();
                        if (context == null) {
                            context = c2494Bo.f23958f;
                        }
                        try {
                            c3535lu.f31864a.l1(new W2.b(context), binderC4230yo, arrayList);
                            return;
                        } catch (Throwable th2) {
                            throw new C3267gu(th2);
                        }
                    } catch (RemoteException e9) {
                        int i = u2.z.f41322b;
                        v2.i.d("", e9);
                        return;
                    }
                } catch (RemoteException e10) {
                    throw new B0.c(e10);
                } catch (C3267gu unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 74);
                    sb.append("Failed to initialize adapter. ");
                    sb.append(str5);
                    sb.append(" does not implement the initialize() method.");
                    binderC4230yo.U3(sb.toString());
                    return;
                }
            case 3:
                Pz pz = (Pz) obj;
                Context context2 = (Context) obj4;
                View view = (View) obj3;
                HashMap hashMap2 = (HashMap) obj5;
                hashMap2.putAll(pz.f26900e.b(context2, view));
                pz.g(hashMap2);
                hashMap2.put("f", "v");
                hashMap2.put("ctx", context2);
                hashMap2.put(com.anythink.expressad.a.f17596C, view);
                hashMap2.put("act", (Activity) obj2);
                hashMap2.put("bds", null);
                return;
            default:
                Pz pz2 = (Pz) obj5;
                HashMap hashMap3 = (HashMap) obj4;
                hashMap3.putAll(pz2.f26900e.c());
                pz2.g(hashMap3);
                hashMap3.put("f", "c");
                hashMap3.put("ctx", (Context) obj3);
                hashMap3.put(com.anythink.expressad.a.f17596C, (View) obj2);
                hashMap3.put("act", null);
                hashMap3.put("bds", (String) obj);
                return;
        }
    }

    public /* synthetic */ RunnableC2823Vg(C2494Bo c2494Bo, String str, BinderC4230yo binderC4230yo, C3535lu c3535lu, ArrayList arrayList) {
        this.f28218v = c2494Bo;
        this.f28217u = str;
        this.f28219w = binderC4230yo;
        this.f28220x = c3535lu;
        this.f28221y = arrayList;
    }

    public /* synthetic */ RunnableC2823Vg(Pz pz, HashMap hashMap, Context context, View view, Activity activity) {
        this.f28217u = pz;
        this.f28218v = hashMap;
        this.f28219w = context;
        this.f28220x = view;
        this.f28221y = activity;
    }

    public /* synthetic */ RunnableC2823Vg(Pz pz, HashMap hashMap, Context context, View view, String str) {
        this.f28218v = pz;
        this.f28219w = hashMap;
        this.f28220x = context;
        this.f28221y = view;
        this.f28217u = str;
    }

    public RunnableC2823Vg(AbstractC2839Wg abstractC2839Wg, String str, String str2, String str3, String str4) {
        this.f28217u = str;
        this.f28218v = str2;
        this.f28219w = str3;
        this.f28220x = str4;
        Objects.requireNonNull(abstractC2839Wg);
        this.f28221y = abstractC2839Wg;
    }
}
