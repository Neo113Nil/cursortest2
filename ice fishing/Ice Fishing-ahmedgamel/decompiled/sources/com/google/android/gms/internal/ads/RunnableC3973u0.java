package com.google.android.gms.internal.ads;

import O.C0344t;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l.C4648e;
import n2.C4754e;
import o2.C4784b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4816f;
import p2.C4835j;
import q2.C4900p;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3973u0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34446n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f34447u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f34448v;

    public /* synthetic */ RunnableC3973u0(int i, Object obj, Object obj2) {
        this.f34446n = i;
        this.f34447u = obj;
        this.f34448v = obj2;
    }

    private final void a() {
        InterfaceC4061vh interfaceC4061vh;
        Qx qx = new Qx(15, (C2555Fh) this.f34447u);
        C3155eq c3155eq = (C3155eq) this.f34448v;
        synchronized (c3155eq) {
            Yv yv = c3155eq.f29985f;
            if (yv == null || (interfaceC4061vh = c3155eq.f29983d) == null) {
                return;
            }
            C4835j.f39733C.f39758x.getClass();
            C3472kl.p(new RunnableC3048cq(0, yv, qx));
            c3155eq.f29985f = null;
            interfaceC4061vh.L0(null);
        }
    }

    private final void b() {
        View view;
        C2509Cm c2509Cm = (C2509Cm) this.f34447u;
        C4012um c4012um = c2509Cm.f24220d;
        synchronized (c4012um) {
            view = c4012um.f34577o;
        }
        if (view != null) {
            boolean z3 = ((ViewGroup) this.f34448v) != null;
            int q8 = c4012um.q();
            C3052cu c3052cu = c2509Cm.f24218b;
            C5069B c5069b = c2509Cm.f24217a;
            if (q8 == 2 || c4012um.q() == 1) {
                c5069b.p(c3052cu.f29626g, String.valueOf(c4012um.q()), z3);
            } else if (c4012um.q() == 6) {
                String str = c3052cu.f29626g;
                c5069b.p(str, "2", z3);
                c5069b.p(str, "1", z3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    private final void c() {
        ViewGroup viewGroup;
        View view;
        View view2;
        ViewGroup viewGroup2;
        InterfaceC3732pb interfaceC3732pb;
        Drawable drawable;
        C2509Cm c2509Cm = (C2509Cm) this.f34447u;
        C4120wm c4120wm = c2509Cm.f24219c;
        boolean d2 = c4120wm.d();
        ?? r42 = (AbstractBinderC3336i8) this.f34448v;
        if (d2 || c4120wm.b()) {
            String[] strArr = {"1098", "3011"};
            for (int i = 0; i < 2; i++) {
                View S8 = r42.S(strArr[i]);
                if (S8 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) S8;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = r42.H0().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        C4012um c4012um = c2509Cm.f24220d;
        synchronized (c4012um) {
            view = c4012um.f34567d;
        }
        if (view != null) {
            synchronized (c4012um) {
                view2 = c4012um.f34567d;
            }
            C3462kb c3462kb = c2509Cm.i;
            if (c3462kb != null && viewGroup == null) {
                C2509Cm.b(layoutParams, c3462kb.f31475x);
                view2.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (c4012um.s() instanceof BinderC3248gb) {
            BinderC3248gb binderC3248gb = (BinderC3248gb) c4012um.s();
            if (viewGroup == null) {
                C2509Cm.b(layoutParams, binderC3248gb.f30575A);
                viewGroup = null;
            }
            C3302hb c3302hb = new C3302hb(context);
            P2.w.h(binderC3248gb);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(C3302hb.f30817u, null, null));
            shapeDrawable.getPaint().setColor(binderC3248gb.f30579w);
            c3302hb.setLayoutParams(layoutParams);
            c3302hb.setBackground(shapeDrawable);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            String str = binderC3248gb.f30576n;
            if (!TextUtils.isEmpty(str)) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams3);
                textView.setId(1195835393);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setText(str);
                textView.setTextColor(binderC3248gb.f30580x);
                textView.setTextSize(binderC3248gb.f30581y);
                v2.d dVar = C4900p.f40199g.f40200a;
                textView.setPadding(v2.d.b(context, 4), 0, v2.d.r(context.getResources().getDisplayMetrics(), 4), 0);
                c3302hb.addView(textView);
                layoutParams2.addRule(1, textView.getId());
            }
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams2);
            imageView.setId(1195835394);
            ArrayList arrayList = binderC3248gb.f30577u;
            if (arrayList != null && arrayList.size() > 1) {
                c3302hb.f30818n = new AnimationDrawable();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        c3302hb.f30818n.addFrame((Drawable) W2.b.F0(((BinderC3356ib) it.next()).c()), binderC3248gb.f30582z);
                    } catch (Exception e9) {
                        int i6 = u2.z.f41322b;
                        v2.i.d("Error while getting drawable.", e9);
                    }
                }
                imageView.setBackground(c3302hb.f30818n);
            } else if (arrayList.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) W2.b.F0(((BinderC3356ib) arrayList.get(0)).c()));
                } catch (Exception e10) {
                    int i9 = u2.z.f41322b;
                    v2.i.d("Error while getting drawable.", e10);
                }
            }
            c3302hb.addView(imageView);
            c3302hb.setContentDescription((CharSequence) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32034H4));
            view2 = c3302hb;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            if (view2.getParent() instanceof ViewGroup) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view2);
            } else {
                C4754e c4754e = new C4754e(r42.H0().getContext());
                c4754e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c4754e.addView(view2);
                FrameLayout D32 = r42.D3();
                if (D32 != null) {
                    D32.addView(c4754e);
                }
            }
            r42.F0(view2, r42.l());
        }
        C3500lC c3500lC = ViewTreeObserverOnGlobalLayoutListenerC2492Bm.f23937I;
        int i10 = c3500lC.f31747w;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                viewGroup2 = null;
                break;
            }
            View S9 = r42.S((String) c3500lC.get(i11));
            i11++;
            if (S9 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) S9;
                break;
            }
        }
        c2509Cm.f24224h.execute(new RunnableC3973u0(24, c2509Cm, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (c2509Cm.c(viewGroup2, true)) {
            if (c4012um.h() != null) {
                c4012um.h().W0(new S0.c((InterfaceViewOnClickListenerC2713Om) r42, viewGroup2));
                return;
            }
            return;
        }
        C3301ha c3301ha = AbstractC3569ma.ub;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && c2509Cm.c(viewGroup2, false)) {
            if (c4012um.i() != null) {
                c4012um.i().W0(new S0.c((InterfaceViewOnClickListenerC2713Om) r42, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View H02 = r42.H0();
        Context context2 = H02 != null ? H02.getContext() : null;
        if (context2 != null) {
            C3904sm c3904sm = c2509Cm.f24225j;
            synchronized (c3904sm) {
                interfaceC3732pb = c3904sm.f34135a;
            }
            if (interfaceC3732pb != null) {
                try {
                    W2.a h9 = interfaceC3732pb.h();
                    if (h9 == null || (drawable = (Drawable) W2.b.F0(h9)) == null) {
                        return;
                    }
                    ImageView imageView2 = new ImageView(context2);
                    imageView2.setImageDrawable(drawable);
                    W2.a b02 = r42.b0();
                    if (b02 != null) {
                        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32229d7)).booleanValue()) {
                            imageView2.setScaleType((ImageView.ScaleType) W2.b.F0(b02));
                            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView2);
                        }
                    }
                    imageView2.setScaleType(C2509Cm.f24216k);
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView2);
                } catch (RemoteException unused) {
                    int i12 = u2.z.f41322b;
                    v2.i.f("Could not get main image drawable");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d() {
        C3421jo c3421jo;
        C3535lu a9;
        Executor executor;
        C2494Bo c2494Bo;
        int i = 5;
        final C2494Bo c2494Bo2 = (C2494Bo) ((C3694or) this.f34447u).f32954u;
        String str = (String) this.f34448v;
        Context context = c2494Bo2.f23958f;
        Su g4 = Su.g(context, 5);
        g4.c();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject(com.anythink.expressad.foundation.g.g.a.b.ai);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Su g9 = Su.g(context, i);
                g9.c();
                g9.m(next);
                final Object obj = new Object();
                final C3467kg c3467kg = new C3467kg();
                N3.a s9 = QC.s(c3467kg, ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32390v2)).longValue(), TimeUnit.SECONDS, c2494Bo2.f23962k);
                c2494Bo2.f23963l.a(next);
                c2494Bo2.f23966o.b(next);
                C4835j.f39733C.f39745k.getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                s9.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Ao
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2494Bo c2494Bo3 = c2494Bo2;
                        Object obj2 = obj;
                        C3467kg c3467kg2 = c3467kg;
                        String str2 = next;
                        long j6 = elapsedRealtime;
                        Su su = g9;
                        c2494Bo3.getClass();
                        synchronized (obj2) {
                            try {
                                if (!c3467kg2.f31479n.isDone()) {
                                    C4835j.f39733C.f39745k.getClass();
                                    c2494Bo3.d(str2, (int) (SystemClock.elapsedRealtime() - j6), "Timeout.", false);
                                    c2494Bo3.f23963l.c(str2, "timeout");
                                    c2494Bo3.f23966o.c(str2, "timeout");
                                    Wu wu = c2494Bo3.f23967p;
                                    su.S("Timeout");
                                    su.a(false);
                                    wu.b(su.q());
                                    c3467kg2.b(Boolean.FALSE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, c2494Bo2.i);
                arrayList.add(s9);
                BinderC4230yo binderC4230yo = new BinderC4230yo(elapsedRealtime, c3467kg, c2494Bo2, g9, obj, next);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i6 = 0;
                        while (i6 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new C2533Ec(optString, bundle));
                            i6++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                c2494Bo2.d(next, 0, "", false);
                try {
                    a9 = c2494Bo2.f23960h.a(next, new JSONObject());
                    executor = c2494Bo2.f23961j;
                    try {
                        c2494Bo = c2494Bo2;
                    } catch (C3267gu e9) {
                        e = e9;
                    }
                } catch (C3267gu e10) {
                    e = e10;
                }
                try {
                    c2494Bo2 = c2494Bo;
                    executor.execute(new RunnableC2823Vg(c2494Bo, next, binderC4230yo, a9, arrayList2));
                } catch (C3267gu e11) {
                    e = e11;
                    c2494Bo2 = c2494Bo;
                    binderC4230yo = binderC4230yo;
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.De)).booleanValue()) {
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                            sb.append("Failed to create Adapter.");
                            sb.append(" ");
                            sb.append(message);
                            str2 = sb.toString();
                        }
                        binderC4230yo.U3(str2);
                    } catch (RemoteException e12) {
                        int i9 = u2.z.f41322b;
                        v2.i.d("", e12);
                    }
                    i = 5;
                } catch (JSONException e13) {
                    e = e13;
                    c2494Bo2 = c2494Bo;
                    u2.z.l("Malformed CLD response", e);
                    c2494Bo2.f23966o.H("MalformedJson");
                    c3421jo = c2494Bo2.f23963l;
                    synchronized (c3421jo) {
                    }
                }
                i = 5;
            }
            RB n9 = RB.n(arrayList);
            C2.x xVar = new C2.x(5, c2494Bo2, g4);
            RD rd = c2494Bo2.i;
            FD fd = new FD(n9, false, false);
            fd.f24757I = new ED(fd, xVar, rd);
            fd.w();
        } catch (JSONException e14) {
            e = e14;
            u2.z.l("Malformed CLD response", e);
            c2494Bo2.f23966o.H("MalformedJson");
            c3421jo = c2494Bo2.f23963l;
            synchronized (c3421jo) {
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32025G2)).booleanValue()) {
                    HashMap e15 = c3421jo.e();
                    e15.put(NativeAdvancedJsUtils.f17906p, "aaia");
                    e15.put("aair", "MalformedJson");
                    c3421jo.f31320b.add(e15);
                }
            }
            c2494Bo2.f23957e.c(e);
            C4835j.f39733C.f39743h.d("AdapterInitializer.updateAdapterStatus", e);
            Wu wu = c2494Bo2.f23967p;
            g4.d(e);
            g4.a(false);
            wu.b(g4.q());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2555Fh c2555Fh;
        MediaPlayer mediaPlayer;
        int i;
        MediaFormat format;
        String b9;
        int i6 = 9;
        Application application = null;
        InterfaceC3766q8 c3658o8 = null;
        int i9 = 2;
        int i10 = 0;
        int i11 = 1;
        switch (this.f34446n) {
            case 0:
                S0.e eVar = (S0.e) this.f34447u;
                eVar.getClass();
                String str = AbstractC3159eu.f29993a;
                HN hn = (HN) eVar.f2782v;
                hn.getClass();
                C4019ut c4019ut = new C4019ut(i6, (C3035cd) this.f34448v);
                C3530lp c3530lp = hn.f25264n.f26776G;
                c3530lp.c(25, c4019ut);
                c3530lp.d();
                return;
            case 1:
                S0.e eVar2 = (S0.e) this.f34447u;
                C4158xN c4158xN = (C4158xN) this.f34448v;
                eVar2.getClass();
                synchronized (c4158xN) {
                }
                String str2 = AbstractC3159eu.f29993a;
                BO bo = ((HN) eVar2.f2782v).f25264n.f26780K;
                C4159xO v9 = bo.v((C3676oQ) bo.f23898d.f27699x);
                bo.s(v9, 1020, new C4178xq(v9, c4158xN, 17));
                return;
            case 2:
                S0.e eVar3 = (S0.e) this.f34447u;
                eVar3.getClass();
                String str3 = AbstractC3159eu.f29993a;
                ((HN) eVar3.f2782v).f25264n.f26793X.q((C4104wN) this.f34448v);
                return;
            case 3:
                try {
                    ((X4) this.f34448v).f28480u.put((AbstractC3171f5) this.f34447u);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 4:
                D8 d82 = (D8) this.f34448v;
                View view = (View) this.f34447u;
                d82.getClass();
                try {
                    C4197y8 c4197y8 = new C4197y8(d82.f24357y, d82.f24358z, d82.f24344A, d82.f24345B, d82.f24346C, d82.f24347D, d82.f24348E, d82.f24351H);
                    com.bumptech.glide.manager.p pVar = C4835j.f39733C.f39742g;
                    synchronized (pVar.f23470v) {
                        C4251z8 c4251z8 = (C4251z8) pVar.f23471w;
                        if (c4251z8 != null) {
                            application = c4251z8.f35298u;
                        }
                    }
                    if (application != null) {
                        String str4 = d82.f24349F;
                        if (!TextUtils.isEmpty(str4)) {
                            String str5 = (String) view.getTag(application.getResources().getIdentifier((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32014F0), "id", application.getPackageName()));
                            if (str5 != null && str5.equals(str4)) {
                                return;
                            }
                        }
                    }
                    C0344t a9 = d82.a(view, c4197y8);
                    c4197y8.b();
                    if (a9.f2133a == 0 && a9.f2134b == 0) {
                        return;
                    }
                    int i12 = a9.f2134b;
                    if (i12 == 0 && c4197y8.f35118k == 0) {
                        return;
                    }
                    if (i12 == 0) {
                        C3493l5 c3493l5 = d82.f24355w;
                        synchronized (c3493l5.f31708u) {
                            try {
                                if (((LinkedList) c3493l5.f31709v).contains(c4197y8)) {
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    d82.f24355w.q(c4197y8);
                    return;
                } catch (Exception e9) {
                    int i13 = u2.z.f41322b;
                    v2.i.d("Exception in fetchContentOnUIThread", e9);
                    C4835j.f39733C.f39743h.d("ContentFetchTask.fetchContent", e9);
                    return;
                }
            case 5:
                if (((Z8) this.f34447u).isCancelled()) {
                    ((N3.a) this.f34448v).cancel(true);
                    return;
                }
                return;
            case 6:
                boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32209b6)).booleanValue();
                Context context = (Context) this.f34448v;
                com.bumptech.glide.manager.p pVar2 = (com.bumptech.glide.manager.p) this.f34447u;
                if (booleanValue) {
                    try {
                        try {
                            IBinder b10 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i14 = AbstractBinderC3712p8.f33033n;
                            if (b10 != null) {
                                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                c3658o8 = queryLocalInterface instanceof InterfaceC3766q8 ? (InterfaceC3766q8) queryLocalInterface : new C3658o8(b10, "com.google.android.gms.ads.clearcut.IClearcut", 2);
                            }
                            pVar2.f23470v = c3658o8;
                            ((C3658o8) ((InterfaceC3766q8) pVar2.f23470v)).t1(new W2.b(context));
                            pVar2.f23469u = true;
                            return;
                        } catch (Exception e10) {
                            throw new v2.j(e10);
                        }
                    } catch (RemoteException | NullPointerException | v2.j unused2) {
                        v2.i.a("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 7:
                C2851Xc c2851Xc = (C2851Xc) this.f34448v;
                g7.m mVar = (g7.m) this.f34447u;
                mVar.getClass();
                C4835j.f39733C.f39745k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    u2.z.k("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context2 = (Context) mVar.f37667e;
                    C5110a c5110a = (C5110a) mVar.f37668f;
                    C2720Pc c2720Pc = new C2720Pc();
                    InterfaceC4061vh g4 = C2866Yb.g(new X2.b(0, 0, 0), context2, null, new C3068d9(), null, null, null, null, null, null, null, "", null, c5110a, false, false);
                    c2720Pc.f26837n = g4;
                    g4.V().setWillNotDraw(true);
                    u2.z.k("loadJavascriptEngine > After createJavascriptEngine");
                    u2.z.k("loadJavascriptEngine > Before setting new engine loaded listener");
                    C2819Vc c2819Vc = new C2819Vc(mVar, arrayList, currentTimeMillis, c2851Xc, c2720Pc);
                    InterfaceC4061vh interfaceC4061vh = c2720Pc.f26837n;
                    if (interfaceC4061vh != null) {
                        interfaceC4061vh.g0().f26128A = new C3694or(11, c2819Vc);
                    }
                    u2.z.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    c2720Pc.i("/jsLoaded", new C2754Rc(mVar, currentTimeMillis, c2851Xc, c2720Pc));
                    C4648e c4648e = new C4648e(i6);
                    C2771Sc c2771Sc = new C2771Sc(mVar, c2720Pc, c4648e);
                    c4648e.f38761u = c2771Sc;
                    u2.z.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) AbstractC2718Pa.f26825d.r()).booleanValue() || TextUtils.equals(((Context) mVar.f37667e).getPackageName(), "com.google.android.gms")) {
                        c2720Pc.i("/requestReload", c2771Sc);
                    }
                    String str6 = mVar.f37664b;
                    u2.z.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str6)));
                    if (str6.endsWith(".js")) {
                        u2.z.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                        u2.z.k("loadJavascript on adWebView from path: ".concat(str6));
                        C2720Pc.f(new RunnableC2703Oc(c2720Pc, "<!DOCTYPE html><html><head><script src=\"" + str6 + "\"></script></head><body></body></html>", i10));
                        u2.z.k("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str6.startsWith("<html>")) {
                        u2.z.k("loadJavascriptEngine > Before newEngine.loadHtml");
                        u2.z.k("loadHtml on adWebView from html");
                        C2720Pc.f(new RunnableC2703Oc(c2720Pc, str6, 1));
                        u2.z.k("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        u2.z.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        u2.z.k("loadHtmlWrapper on adWebView from path: ".concat(str6));
                        C2720Pc.f(new RunnableC2703Oc(c2720Pc, str6, i9));
                        u2.z.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    u2.z.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    u2.D.f41237l.postDelayed(new RunnableC2803Uc(mVar, c2851Xc, c2720Pc, arrayList, currentTimeMillis, 0), ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32231e)).intValue());
                    return;
                } catch (Throwable th) {
                    int i15 = u2.z.f41322b;
                    v2.i.d("Error creating webview.", th);
                    C3301ha c3301ha = AbstractC3569ma.C8;
                    q2.r rVar = q2.r.f40207e;
                    if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                        c2851Xc.r("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th);
                        return;
                    } else if (((Boolean) rVar.f40210c.a(AbstractC3569ma.E8)).booleanValue()) {
                        C4835j.f39733C.f39743h.e("SdkJavascriptFactory.loadJavascriptEngine", th);
                        c2851Xc.q();
                        return;
                    } else {
                        C4835j.f39733C.f39743h.d("SdkJavascriptFactory.loadJavascriptEngine", th);
                        c2851Xc.q();
                        return;
                    }
                }
            case 8:
                a4.e eVar4 = C4835j.f39733C.f39737b;
                a4.e.n(((zzbym) this.f34448v).f35484a, (AdOverlayInfoParcel) this.f34447u, true, null);
                return;
            case 9:
                ((v2.l) this.f34447u).a(null, (String) this.f34448v);
                return;
            case 10:
                C4221yf c4221yf = (C4221yf) this.f34447u;
                Bitmap bitmap = (Bitmap) this.f34448v;
                c4221yf.getClass();
                HK hk = JK.f25675u;
                IK ik = new IK();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, ik);
                synchronized (c4221yf.f35188h) {
                    C3134eM c3134eM = c4221yf.f35181a;
                    C3995uM A9 = C4049vM.A();
                    JK b11 = ik.b();
                    A9.h();
                    ((C4049vM) A9.f27721u).C(b11);
                    A9.h();
                    ((C4049vM) A9.f27721u).B("image/png");
                    A9.h();
                    ((C4049vM) A9.f27721u).D(2);
                    C4049vM c4049vM = (C4049vM) A9.j();
                    c3134eM.h();
                    ((FM) c3134eM.f27721u).K(c4049vM);
                }
                return;
            case 11:
                C3467kg c3467kg = (C3467kg) this.f34448v;
                try {
                    c3467kg.b(C4784b.a((Context) this.f34447u));
                    return;
                } catch (M2.g | IOException | IllegalStateException e11) {
                    c3467kg.c(e11);
                    v2.i.d("Exception while getting advertising Id info", e11);
                    return;
                }
            case 12:
                TextureViewSurfaceTextureListenerC3898sg textureViewSurfaceTextureListenerC3898sg = (TextureViewSurfaceTextureListenerC3898sg) this.f34448v;
                textureViewSurfaceTextureListenerC3898sg.getClass();
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32409x2)).booleanValue() && (c2555Fh = textureViewSurfaceTextureListenerC3898sg.f33998v) != null && (mediaPlayer = (MediaPlayer) this.f34447u) != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap hashMap = new HashMap();
                            while (i10 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i10];
                                if (trackInfo2 != null) {
                                    int trackType = trackInfo2.getTrackType();
                                    if (trackType == i11) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused3) {
                                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                textureViewSurfaceTextureListenerC3898sg.f33997L = valueOf;
                                                hashMap.put("bitRate", String.valueOf(valueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger("height");
                                                i = i11;
                                                StringBuilder sb = new StringBuilder(AbstractC4404f.b(integer, i11) + String.valueOf(integer2).length());
                                                sb.append(integer);
                                                sb.append("x");
                                                sb.append(integer2);
                                                hashMap.put("resolution", sb.toString());
                                            } else {
                                                i = i11;
                                            }
                                            if (format2.containsKey("mime")) {
                                                hashMap.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                            i10++;
                                            i11 = i;
                                        }
                                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            hashMap.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            hashMap.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                }
                                i = i11;
                                i10++;
                                i11 = i;
                            }
                            if (!hashMap.isEmpty()) {
                                c2555Fh.d("onMetadataEvent", hashMap);
                            }
                        }
                    } catch (RuntimeException e12) {
                        C4835j.f39733C.f39743h.d("AdMediaPlayerView.reportMetadata", e12);
                    }
                }
                C4114wg c4114wg = textureViewSurfaceTextureListenerC3898sg.J;
                if (c4114wg != null) {
                    c4114wg.e();
                    return;
                }
                return;
            case 13:
                AbstractC2639Kg.f25951n = (AudioManager) ((Context) this.f34447u).getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
                ((C2781Sm) this.f34448v).a();
                return;
            case 14:
                AtomicInteger atomicInteger = C3414jh.f31276N;
                ((InterfaceC4061vh) this.f34447u).d("onGcacheInfoEvent", (HashMap) this.f34448v);
                return;
            case 15:
                a();
                return;
            case 16:
                ((ViewTreeObserverOnGlobalLayoutListenerC2572Gh) this.f34447u).y((String) this.f34448v);
                return;
            case 17:
                ((BinderC2606Ih) this.f34447u).f25551n.d("pubVideoCmd", (HashMap) this.f34448v);
                return;
            case 18:
                C2623Jh c2623Jh = (C2623Jh) this.f34447u;
                Uri parse = Uri.parse((String) this.f34448v);
                C2657Lh c2657Lh = ((ViewTreeObserverOnGlobalLayoutListenerC2572Gh) c2623Jh.f25727a.f28050u).f25061G;
                if (c2657Lh != null) {
                    c2657Lh.f(parse);
                    return;
                } else {
                    int i16 = u2.z.f41322b;
                    v2.i.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                }
            case 19:
                C3095dj c3095dj = (C3095dj) this.f34447u;
                c3095dj.getClass();
                JSONObject jSONObject = (JSONObject) this.f34448v;
                String obj = jSONObject.toString();
                String s9 = D.y.s(new StringBuilder(obj.length() + 31), "Calling AFMA_updateActiveView(", obj, ")");
                int i17 = u2.z.f41322b;
                v2.i.a(s9);
                c3095dj.f29823n.a("AFMA_updateActiveView", jSONObject);
                return;
            case 20:
                C2712Ol c2712Ol = (C2712Ol) this.f34447u;
                if (c2712Ol.f26650a == 0) {
                    c2712Ol.m((Integer) this.f34448v);
                    return;
                }
                return;
            case 21:
                try {
                    ((InterfaceC3742pl) this.f34447u).mo1a(this.f34448v);
                    return;
                } catch (Throwable th2) {
                    C4835j.f39733C.f39743h.e("EventEmitter.notify", th2);
                    u2.z.l("Event emitter exception.", th2);
                    return;
                }
            case 22:
                C2712Ol c2712Ol2 = (C2712Ol) this.f34447u;
                int i18 = c2712Ol2.f26650a - 1;
                c2712Ol2.f26650a = i18;
                if (i18 == 0) {
                    c2712Ol2.m(this.f34448v);
                    return;
                }
                return;
            case 23:
                C2712Ol c2712Ol3 = (C2712Ol) this.f34447u;
                Object apply = ((GN) this.f34448v).apply(c2712Ol3.f26655f);
                c2712Ol3.f26655f = apply;
                RunnableC3973u0 runnableC3973u0 = new RunnableC3973u0(22, c2712Ol3, apply);
                C3212ft c3212ft = (C3212ft) c2712Ol3.f26652c;
                if (c3212ft.f30468a.getLooper().getThread().isAlive()) {
                    c3212ft.e(runnableC3973u0);
                    return;
                }
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                C2494Bo c2494Bo = (C2494Bo) this.f34447u;
                c2494Bo.getClass();
                c2494Bo.i.execute(new RunnableC3470kj(i6, (C3467kg) this.f34448v));
                return;
            case 28:
                try {
                    ((InterfaceC2516Dc) this.f34448v).H1(((C2494Bo) this.f34447u).b());
                    return;
                } catch (RemoteException e13) {
                    int i19 = u2.z.f41322b;
                    v2.i.d("", e13);
                    return;
                }
            default:
                C3262gp c3262gp = (C3262gp) this.f34447u;
                c3262gp.getClass();
                C4054va c4054va = C4835j.f39733C.f39748n;
                Context context3 = (Context) this.f34448v;
                if (c4054va.f34705n.getAndSet(true)) {
                    return;
                }
                c4054va.f34706u = context3;
                c4054va.f34707v = c3262gp.f30660u;
                if (c4054va.f34709x != null || (b9 = AbstractC4816f.b(context3)) == null || b9.equals(context3.getPackageName())) {
                    return;
                }
                AbstractC4816f.a(context3, b9, c4054va);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3973u0(C2509Cm c2509Cm, InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om) {
        this.f34446n = 25;
        this.f34447u = c2509Cm;
        this.f34448v = (AbstractBinderC3336i8) interfaceViewOnClickListenerC2713Om;
    }

    public /* synthetic */ RunnableC3973u0(Object obj, Object obj2, int i, boolean z3) {
        this.f34446n = i;
        this.f34447u = obj2;
        this.f34448v = obj;
    }

    public RunnableC3973u0(X4 x42, AbstractC3171f5 abstractC3171f5) {
        this.f34446n = 3;
        this.f34447u = abstractC3171f5;
        Objects.requireNonNull(x42);
        this.f34448v = x42;
    }

    public RunnableC3973u0(C2866Yb c2866Yb, Context context, C3467kg c3467kg) {
        this.f34446n = 11;
        this.f34447u = context;
        this.f34448v = c3467kg;
    }
}
