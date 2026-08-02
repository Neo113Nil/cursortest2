package com.google.android.gms.internal.ads;

import O.C0349t;
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
import h.C4543G;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4820f;
import p2.C4834e;
import q2.C4870b;
import r2.C4906k;
import s2.C4949p;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3996u0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35220n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f35221u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f35222v;

    public /* synthetic */ RunnableC3996u0(int i, Object obj, Object obj2) {
        this.f35220n = i;
        this.f35221u = obj;
        this.f35222v = obj2;
    }

    private final void a() {
        InterfaceC4084vh interfaceC4084vh;
        Qx qx = new Qx(15, (C2575Fh) this.f35221u);
        C3178eq c3178eq = (C3178eq) this.f35222v;
        synchronized (c3178eq) {
            Zv zv = c3178eq.f30774f;
            if (zv == null || (interfaceC4084vh = c3178eq.f30772d) == null) {
                return;
            }
            C4906k.f40186C.f40211x.getClass();
            C3495kl.p(new RunnableC3071cq(0, zv, qx));
            c3178eq.f30774f = null;
            interfaceC4084vh.L0(null);
        }
    }

    private final void b() {
        View view;
        C2546Dm c2546Dm = (C2546Dm) this.f35221u;
        C4089vm c4089vm = c2546Dm.f25206d;
        synchronized (c4089vm) {
            view = c4089vm.f35498o;
        }
        if (view != null) {
            boolean z6 = ((ViewGroup) this.f35222v) != null;
            int q8 = c4089vm.q();
            C3075cu c3075cu = c2546Dm.f25204b;
            C5140B c5140b = c2546Dm.f25203a;
            if (q8 == 2 || c4089vm.q() == 1) {
                c5140b.p(c3075cu.f30396g, String.valueOf(c4089vm.q()), z6);
            } else if (c4089vm.q() == 6) {
                String str = c3075cu.f30396g;
                c5140b.p(str, "2", z6);
                c5140b.p(str, "1", z6);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    private final void c() {
        ViewGroup viewGroup;
        View view;
        View view2;
        ViewGroup viewGroup2;
        InterfaceC3755pb interfaceC3755pb;
        Drawable drawable;
        C2546Dm c2546Dm = (C2546Dm) this.f35221u;
        C4197xm c4197xm = c2546Dm.f25205c;
        boolean d9 = c4197xm.d();
        ?? r42 = (AbstractBinderC3359i8) this.f35222v;
        if (d9 || c4197xm.b()) {
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
        Context context = r42.F0().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        C4089vm c4089vm = c2546Dm.f25206d;
        synchronized (c4089vm) {
            view = c4089vm.f35488d;
        }
        if (view != null) {
            synchronized (c4089vm) {
                view2 = c4089vm.f35488d;
            }
            C3485kb c3485kb = c2546Dm.i;
            if (c3485kb != null && viewGroup == null) {
                C2546Dm.b(layoutParams, c3485kb.f32252x);
                view2.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (c4089vm.s() instanceof BinderC3271gb) {
            BinderC3271gb binderC3271gb = (BinderC3271gb) c4089vm.s();
            if (viewGroup == null) {
                C2546Dm.b(layoutParams, binderC3271gb.f31342A);
                viewGroup = null;
            }
            C3325hb c3325hb = new C3325hb(context);
            R2.w.h(binderC3271gb);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(C3325hb.f31578u, null, null));
            shapeDrawable.getPaint().setColor(binderC3271gb.f31346w);
            c3325hb.setLayoutParams(layoutParams);
            c3325hb.setBackground(shapeDrawable);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            String str = binderC3271gb.f31343n;
            if (!TextUtils.isEmpty(str)) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams3);
                textView.setId(1195835393);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setText(str);
                textView.setTextColor(binderC3271gb.f31347x);
                textView.setTextSize(binderC3271gb.f31348y);
                x2.d dVar = C4949p.f40498g.f40499a;
                textView.setPadding(x2.d.b(context, 4), 0, x2.d.r(context.getResources().getDisplayMetrics(), 4), 0);
                c3325hb.addView(textView);
                layoutParams2.addRule(1, textView.getId());
            }
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams2);
            imageView.setId(1195835394);
            ArrayList arrayList = binderC3271gb.f31344u;
            if (arrayList != null && arrayList.size() > 1) {
                c3325hb.f31579n = new AnimationDrawable();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        c3325hb.f31579n.addFrame((Drawable) Y2.b.D0(((BinderC3379ib) it.next()).c()), binderC3271gb.f31349z);
                    } catch (Exception e9) {
                        int i4 = w2.z.f41712b;
                        x2.i.d("Error while getting drawable.", e9);
                    }
                }
                imageView.setBackground(c3325hb.f31579n);
            } else if (arrayList.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) Y2.b.D0(((BinderC3379ib) arrayList.get(0)).c()));
                } catch (Exception e10) {
                    int i6 = w2.z.f41712b;
                    x2.i.d("Error while getting drawable.", e10);
                }
            }
            c3325hb.addView(imageView);
            c3325hb.setContentDescription((CharSequence) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32814H4));
            view2 = c3325hb;
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
                C4834e c4834e = new C4834e(r42.F0().getContext());
                c4834e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c4834e.addView(view2);
                FrameLayout z32 = r42.z3();
                if (z32 != null) {
                    z32.addView(c4834e);
                }
            }
            r42.D0(view2, r42.l());
        }
        C3523lC c3523lC = ViewTreeObserverOnGlobalLayoutListenerC2529Cm.f24950I;
        int i9 = c3523lC.f32527w;
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                viewGroup2 = null;
                break;
            }
            View S9 = r42.S((String) c3523lC.get(i10));
            i10++;
            if (S9 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) S9;
                break;
            }
        }
        c2546Dm.f25210h.execute(new RunnableC3996u0(24, c2546Dm, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (c2546Dm.c(viewGroup2, true)) {
            if (c4089vm.h() != null) {
                c4089vm.h().V0(new S0.c((InterfaceViewOnClickListenerC2750Pm) r42, viewGroup2));
                return;
            }
            return;
        }
        C3324ha c3324ha = AbstractC3592ma.ub;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && c2546Dm.c(viewGroup2, false)) {
            if (c4089vm.i() != null) {
                c4089vm.i().V0(new S0.c((InterfaceViewOnClickListenerC2750Pm) r42, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View F02 = r42.F0();
        Context context2 = F02 != null ? F02.getContext() : null;
        if (context2 != null) {
            C3981tm c3981tm = c2546Dm.f25211j;
            synchronized (c3981tm) {
                interfaceC3755pb = c3981tm.f35164a;
            }
            if (interfaceC3755pb != null) {
                try {
                    Y2.a h3 = interfaceC3755pb.h();
                    if (h3 == null || (drawable = (Drawable) Y2.b.D0(h3)) == null) {
                        return;
                    }
                    ImageView imageView2 = new ImageView(context2);
                    imageView2.setImageDrawable(drawable);
                    Y2.a b02 = r42.b0();
                    if (b02 != null) {
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33009d7)).booleanValue()) {
                            imageView2.setScaleType((ImageView.ScaleType) Y2.b.D0(b02));
                            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView2);
                        }
                    }
                    imageView2.setScaleType(C2546Dm.f25202k);
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView2);
                } catch (RemoteException unused) {
                    int i11 = w2.z.f41712b;
                    x2.i.f("Could not get main image drawable");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d() {
        C3498ko c3498ko;
        C3558lu a9;
        Executor executor;
        C2531Co c2531Co;
        int i = 5;
        final C2531Co c2531Co2 = (C2531Co) ((C3717or) this.f35221u).f33740u;
        String str = (String) this.f35222v;
        Context context = c2531Co2.f24971f;
        Su e9 = Su.e(context, 5);
        e9.c();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject(com.anythink.expressad.foundation.g.g.a.b.ai);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Su e10 = Su.e(context, i);
                e10.c();
                e10.m(next);
                final Object obj = new Object();
                final C3490kg c3490kg = new C3490kg();
                P3.a s9 = QC.s(c3490kg, ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33170v2)).longValue(), TimeUnit.SECONDS, c2531Co2.f24975k);
                c2531Co2.f24976l.a(next);
                c2531Co2.f24979o.b(next);
                C4906k.f40186C.f40198k.getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                s9.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Bo
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2531Co c2531Co3 = c2531Co2;
                        Object obj2 = obj;
                        C3490kg c3490kg2 = c3490kg;
                        String str2 = next;
                        long j6 = elapsedRealtime;
                        Su su = e10;
                        c2531Co3.getClass();
                        synchronized (obj2) {
                            try {
                                if (!c3490kg2.f32256n.isDone()) {
                                    C4906k.f40186C.f40198k.getClass();
                                    c2531Co3.d(str2, (int) (SystemClock.elapsedRealtime() - j6), "Timeout.", false);
                                    c2531Co3.f24976l.c(str2, "timeout");
                                    c2531Co3.f24979o.c(str2, "timeout");
                                    Wu wu = c2531Co3.f24980p;
                                    su.S("Timeout");
                                    su.a(false);
                                    wu.b(su.q());
                                    c3490kg2.b(Boolean.FALSE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, c2531Co2.i);
                arrayList.add(s9);
                BinderC4307zo binderC4307zo = new BinderC4307zo(elapsedRealtime, c3490kg, c2531Co2, e10, obj, next);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i4 = 0;
                        while (i4 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
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
                            arrayList2.add(new C2553Ec(optString, bundle));
                            i4++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                c2531Co2.d(next, 0, "", false);
                try {
                    a9 = c2531Co2.f24973h.a(next, new JSONObject());
                    executor = c2531Co2.f24974j;
                    try {
                        c2531Co = c2531Co2;
                    } catch (C3290gu e11) {
                        e = e11;
                    }
                } catch (C3290gu e12) {
                    e = e12;
                }
                try {
                    c2531Co2 = c2531Co;
                    executor.execute(new RunnableC2846Vg(c2531Co, next, binderC4307zo, a9, arrayList2));
                } catch (C3290gu e13) {
                    e = e13;
                    c2531Co2 = c2531Co;
                    binderC4307zo = binderC4307zo;
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.De)).booleanValue()) {
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                            sb.append("Failed to create Adapter.");
                            sb.append(" ");
                            sb.append(message);
                            str2 = sb.toString();
                        }
                        binderC4307zo.U3(str2);
                    } catch (RemoteException e14) {
                        int i6 = w2.z.f41712b;
                        x2.i.d("", e14);
                    }
                    i = 5;
                } catch (JSONException e15) {
                    e = e15;
                    c2531Co2 = c2531Co;
                    w2.z.l("Malformed CLD response", e);
                    c2531Co2.f24979o.G("MalformedJson");
                    c3498ko = c2531Co2.f24976l;
                    synchronized (c3498ko) {
                    }
                }
                i = 5;
            }
            RB n9 = RB.n(arrayList);
            E2.w wVar = new E2.w(5, c2531Co2, e9);
            RD rd = c2531Co2.i;
            FD fd = new FD(n9, false, false);
            fd.f25513I = new ED(fd, wVar, rd);
            fd.w();
        } catch (JSONException e16) {
            e = e16;
            w2.z.l("Malformed CLD response", e);
            c2531Co2.f24979o.G("MalformedJson");
            c3498ko = c2531Co2.f24976l;
            synchronized (c3498ko) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.G2)).booleanValue()) {
                    HashMap e17 = c3498ko.e();
                    e17.put(NativeAdvancedJsUtils.f18693p, "aaia");
                    e17.put("aair", "MalformedJson");
                    c3498ko.f32410b.add(e17);
                }
            }
            c2531Co2.f24970e.c(e);
            C4906k.f40186C.f40196h.d("AdapterInitializer.updateAdapterStatus", e);
            Wu wu = c2531Co2.f24980p;
            e9.d(e);
            e9.a(false);
            wu.b(e9.q());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2575Fh c2575Fh;
        MediaPlayer mediaPlayer;
        int i;
        MediaFormat format;
        String b9;
        int i4 = 9;
        int i6 = 2;
        Application application = null;
        InterfaceC3789q8 c3681o8 = null;
        int i9 = 0;
        int i10 = 1;
        switch (this.f35220n) {
            case 0:
                S0.e eVar = (S0.e) this.f35221u;
                eVar.getClass();
                String str = AbstractC3182eu.f30782a;
                HN hn = (HN) eVar.f2909v;
                hn.getClass();
                C4042ut c4042ut = new C4042ut(i4, (C3058cd) this.f35222v);
                C3553lp c3553lp = hn.f26036n.f27555G;
                c3553lp.c(25, c4042ut);
                c3553lp.d();
                return;
            case 1:
                S0.e eVar2 = (S0.e) this.f35221u;
                C4181xN c4181xN = (C4181xN) this.f35222v;
                eVar2.getClass();
                synchronized (c4181xN) {
                }
                String str2 = AbstractC3182eu.f30782a;
                BO bo = ((HN) eVar2.f2909v).f26036n.f27558K;
                C4182xO v9 = bo.v((C3860rQ) bo.f24669d.f28482x);
                bo.s(v9, 1020, new C4201xq(v9, c4181xN, 17));
                return;
            case 2:
                S0.e eVar3 = (S0.e) this.f35221u;
                eVar3.getClass();
                String str3 = AbstractC3182eu.f30782a;
                ((HN) eVar3.f2909v).f26036n.f27571X.F((C4127wN) this.f35222v);
                return;
            case 3:
                try {
                    ((X4) this.f35222v).f29260u.put((AbstractC3194f5) this.f35221u);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 4:
                D8 d82 = (D8) this.f35222v;
                View view = (View) this.f35221u;
                d82.getClass();
                try {
                    C4220y8 c4220y8 = new C4220y8(d82.f25102y, d82.f25103z, d82.f25089A, d82.f25090B, d82.f25091C, d82.f25092D, d82.f25093E, d82.f25096H);
                    com.bumptech.glide.manager.o oVar = C4906k.f40186C.f40195g;
                    synchronized (oVar.f24255v) {
                        C4274z8 c4274z8 = (C4274z8) oVar.f24256w;
                        if (c4274z8 != null) {
                            application = c4274z8.f36082u;
                        }
                    }
                    if (application != null) {
                        String str4 = d82.f25094F;
                        if (!TextUtils.isEmpty(str4)) {
                            String str5 = (String) view.getTag(application.getResources().getIdentifier((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32795F0), "id", application.getPackageName()));
                            if (str5 != null && str5.equals(str4)) {
                                return;
                            }
                        }
                    }
                    C0349t a9 = d82.a(view, c4220y8);
                    c4220y8.b();
                    if (a9.f2221a == 0 && a9.f2222b == 0) {
                        return;
                    }
                    int i11 = a9.f2222b;
                    if (i11 == 0 && c4220y8.f35904k == 0) {
                        return;
                    }
                    if (i11 == 0) {
                        C3516l5 c3516l5 = d82.f25100w;
                        synchronized (c3516l5.f32488u) {
                            try {
                                if (((LinkedList) c3516l5.f32489v).contains(c4220y8)) {
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    d82.f25100w.p(c4220y8);
                    return;
                } catch (Exception e9) {
                    int i12 = w2.z.f41712b;
                    x2.i.d("Exception in fetchContentOnUIThread", e9);
                    C4906k.f40186C.f40196h.d("ContentFetchTask.fetchContent", e9);
                    return;
                }
            case 5:
                if (((Z8) this.f35221u).isCancelled()) {
                    ((P3.a) this.f35222v).cancel(true);
                    return;
                }
                return;
            case 6:
                boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32988b6)).booleanValue();
                Context context = (Context) this.f35222v;
                com.bumptech.glide.manager.o oVar2 = (com.bumptech.glide.manager.o) this.f35221u;
                if (booleanValue) {
                    try {
                        try {
                            IBinder b10 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i13 = AbstractBinderC3735p8.f33823n;
                            if (b10 != null) {
                                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                c3681o8 = queryLocalInterface instanceof InterfaceC3789q8 ? (InterfaceC3789q8) queryLocalInterface : new C3681o8(b10, "com.google.android.gms.ads.clearcut.IClearcut", 1);
                            }
                            oVar2.f24255v = c3681o8;
                            ((C3681o8) ((InterfaceC3789q8) oVar2.f24255v)).r1(new Y2.b(context));
                            oVar2.f24254u = true;
                            return;
                        } catch (Exception e10) {
                            throw new x2.j(e10);
                        }
                    } catch (RemoteException | NullPointerException | x2.j unused2) {
                        x2.i.a("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 7:
                C2874Xc c2874Xc = (C2874Xc) this.f35222v;
                g7.m mVar = (g7.m) this.f35221u;
                mVar.getClass();
                C4906k.f40186C.f40198k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    w2.z.k("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context2 = (Context) mVar.f37692e;
                    C5189a c5189a = (C5189a) mVar.f37693f;
                    C2740Pc c2740Pc = new C2740Pc();
                    InterfaceC4084vh g9 = C2889Yb.g(new A3.r(0, 0, 0), context2, null, new C3091d9(), null, null, null, null, null, null, null, "", null, c5189a, false, false);
                    c2740Pc.f27625n = g9;
                    g9.V().setWillNotDraw(true);
                    w2.z.k("loadJavascriptEngine > After createJavascriptEngine");
                    w2.z.k("loadJavascriptEngine > Before setting new engine loaded listener");
                    C2842Vc c2842Vc = new C2842Vc(mVar, arrayList, currentTimeMillis, c2874Xc, c2740Pc);
                    InterfaceC4084vh interfaceC4084vh = c2740Pc.f27625n;
                    if (interfaceC4084vh != null) {
                        interfaceC4084vh.h0().f26925A = new C3717or(11, c2842Vc);
                    }
                    w2.z.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    c2740Pc.i("/jsLoaded", new C2774Rc(mVar, currentTimeMillis, c2874Xc, c2740Pc));
                    C4543G c4543g = new C4543G();
                    C2791Sc c2791Sc = new C2791Sc(mVar, c2740Pc, c4543g);
                    c4543g.f37843n = c2791Sc;
                    w2.z.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) AbstractC2738Pa.f27613d.r()).booleanValue() || TextUtils.equals(((Context) mVar.f37692e).getPackageName(), "com.google.android.gms")) {
                        c2740Pc.i("/requestReload", c2791Sc);
                    }
                    String str6 = mVar.f37689b;
                    w2.z.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str6)));
                    if (str6.endsWith(".js")) {
                        w2.z.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                        w2.z.k("loadJavascript on adWebView from path: ".concat(str6));
                        C2740Pc.f(new RunnableC2723Oc(c2740Pc, "<!DOCTYPE html><html><head><script src=\"" + str6 + "\"></script></head><body></body></html>", i9));
                        w2.z.k("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str6.startsWith("<html>")) {
                        w2.z.k("loadJavascriptEngine > Before newEngine.loadHtml");
                        w2.z.k("loadHtml on adWebView from html");
                        C2740Pc.f(new RunnableC2723Oc(c2740Pc, str6, 1));
                        w2.z.k("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        w2.z.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        w2.z.k("loadHtmlWrapper on adWebView from path: ".concat(str6));
                        C2740Pc.f(new RunnableC2723Oc(c2740Pc, str6, i6));
                        w2.z.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    w2.z.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    w2.D.f41627l.postDelayed(new RunnableC2825Uc(mVar, c2874Xc, c2740Pc, arrayList, currentTimeMillis, 0), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33011e)).intValue());
                    return;
                } catch (Throwable th) {
                    int i14 = w2.z.f41712b;
                    x2.i.d("Error creating webview.", th);
                    C3324ha c3324ha = AbstractC3592ma.C8;
                    s2.r rVar = s2.r.f40506e;
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        c2874Xc.r("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th);
                        return;
                    } else if (((Boolean) rVar.f40509c.a(AbstractC3592ma.E8)).booleanValue()) {
                        C4906k.f40186C.f40196h.e("SdkJavascriptFactory.loadJavascriptEngine", th);
                        c2874Xc.q();
                        return;
                    } else {
                        C4906k.f40186C.f40196h.d("SdkJavascriptFactory.loadJavascriptEngine", th);
                        c2874Xc.q();
                        return;
                    }
                }
            case 8:
                c4.e eVar4 = C4906k.f40186C.f40190b;
                c4.e.q(((zzbym) this.f35222v).f36253a, (AdOverlayInfoParcel) this.f35221u, true, null);
                return;
            case 9:
                ((x2.l) this.f35221u).a(null, (String) this.f35222v);
                return;
            case 10:
                C4244yf c4244yf = (C4244yf) this.f35221u;
                Bitmap bitmap = (Bitmap) this.f35222v;
                c4244yf.getClass();
                HK hk = JK.f26428u;
                IK ik = new IK();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, ik);
                synchronized (c4244yf.f35978h) {
                    C3157eM c3157eM = c4244yf.f35971a;
                    C4018uM A9 = C4072vM.A();
                    JK b11 = ik.b();
                    A9.h();
                    ((C4072vM) A9.f28504u).C(b11);
                    A9.h();
                    ((C4072vM) A9.f28504u).B("image/png");
                    A9.h();
                    ((C4072vM) A9.f28504u).D(2);
                    C4072vM c4072vM = (C4072vM) A9.j();
                    c3157eM.h();
                    ((FM) c3157eM.f28504u).K(c4072vM);
                }
                return;
            case 11:
                C3490kg c3490kg = (C3490kg) this.f35222v;
                try {
                    c3490kg.b(C4870b.a((Context) this.f35221u));
                    return;
                } catch (O2.g | IOException | IllegalStateException e11) {
                    c3490kg.c(e11);
                    x2.i.d("Exception while getting advertising Id info", e11);
                    return;
                }
            case 12:
                TextureViewSurfaceTextureListenerC3921sg textureViewSurfaceTextureListenerC3921sg = (TextureViewSurfaceTextureListenerC3921sg) this.f35222v;
                textureViewSurfaceTextureListenerC3921sg.getClass();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue() && (c2575Fh = textureViewSurfaceTextureListenerC3921sg.f34764v) != null && (mediaPlayer = (MediaPlayer) this.f35221u) != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap hashMap = new HashMap();
                            while (i9 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i9];
                                if (trackInfo2 != null) {
                                    int trackType = trackInfo2.getTrackType();
                                    if (trackType == i10) {
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
                                                textureViewSurfaceTextureListenerC3921sg.f34763L = valueOf;
                                                hashMap.put("bitRate", String.valueOf(valueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger("height");
                                                i = i10;
                                                StringBuilder sb = new StringBuilder(Wv.b(integer, i10) + String.valueOf(integer2).length());
                                                sb.append(integer);
                                                sb.append("x");
                                                sb.append(integer2);
                                                hashMap.put("resolution", sb.toString());
                                            } else {
                                                i = i10;
                                            }
                                            if (format2.containsKey("mime")) {
                                                hashMap.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                            i9++;
                                            i10 = i;
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
                                i = i10;
                                i9++;
                                i10 = i;
                            }
                            if (!hashMap.isEmpty()) {
                                c2575Fh.d("onMetadataEvent", hashMap);
                            }
                        }
                    } catch (RuntimeException e12) {
                        C4906k.f40186C.f40196h.d("AdMediaPlayerView.reportMetadata", e12);
                    }
                }
                C4137wg c4137wg = textureViewSurfaceTextureListenerC3921sg.J;
                if (c4137wg != null) {
                    c4137wg.e();
                    return;
                }
                return;
            case 13:
                AbstractC2659Kg.f26729n = (AudioManager) ((Context) this.f35221u).getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
                ((C2818Tm) this.f35222v).a();
                return;
            case 14:
                AtomicInteger atomicInteger = C3437jh.f32063N;
                ((InterfaceC4084vh) this.f35221u).d("onGcacheInfoEvent", (HashMap) this.f35222v);
                return;
            case 15:
                a();
                return;
            case 16:
                ((ViewTreeObserverOnGlobalLayoutListenerC2592Gh) this.f35221u).y((String) this.f35222v);
                return;
            case 17:
                ((BinderC2626Ih) this.f35221u).f26300n.d("pubVideoCmd", (HashMap) this.f35222v);
                return;
            case 18:
                C2643Jh c2643Jh = (C2643Jh) this.f35221u;
                Uri parse = Uri.parse((String) this.f35222v);
                C2677Lh c2677Lh = ((ViewTreeObserverOnGlobalLayoutListenerC2592Gh) c2643Jh.f26481a.f28847u).f25846G;
                if (c2677Lh != null) {
                    c2677Lh.f(parse);
                    return;
                } else {
                    int i15 = w2.z.f41712b;
                    x2.i.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                }
            case 19:
                C3118dj c3118dj = (C3118dj) this.f35221u;
                c3118dj.getClass();
                JSONObject jSONObject = (JSONObject) this.f35222v;
                String obj = jSONObject.toString();
                String p9 = D.x.p(new StringBuilder(obj.length() + 31), "Calling AFMA_updateActiveView(", obj, ")");
                int i16 = w2.z.f41712b;
                x2.i.a(p9);
                c3118dj.f30596n.a("AFMA_updateActiveView", jSONObject);
                return;
            case 20:
                C2749Pl c2749Pl = (C2749Pl) this.f35221u;
                if (c2749Pl.f27642a == 0) {
                    c2749Pl.m((Integer) this.f35222v);
                    return;
                }
                return;
            case 21:
                try {
                    ((InterfaceC3765pl) this.f35221u).mo5a(this.f35222v);
                    return;
                } catch (Throwable th2) {
                    C4906k.f40186C.f40196h.e("EventEmitter.notify", th2);
                    w2.z.l("Event emitter exception.", th2);
                    return;
                }
            case 22:
                C2749Pl c2749Pl2 = (C2749Pl) this.f35221u;
                int i17 = c2749Pl2.f27642a - 1;
                c2749Pl2.f27642a = i17;
                if (i17 == 0) {
                    c2749Pl2.m(this.f35222v);
                    return;
                }
                return;
            case 23:
                C2749Pl c2749Pl3 = (C2749Pl) this.f35221u;
                Object apply = ((GN) this.f35222v).apply(c2749Pl3.f27647f);
                c2749Pl3.f27647f = apply;
                RunnableC3996u0 runnableC3996u0 = new RunnableC3996u0(22, c2749Pl3, apply);
                C3235ft c3235ft = (C3235ft) c2749Pl3.f27644c;
                if (c3235ft.f31231a.getLooper().getThread().isAlive()) {
                    c3235ft.e(runnableC3996u0);
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
                C2531Co c2531Co = (C2531Co) this.f35221u;
                c2531Co.getClass();
                c2531Co.i.execute(new RunnableC3493kj(i4, (C3490kg) this.f35222v));
                return;
            case 28:
                try {
                    ((InterfaceC2536Dc) this.f35222v).C1(((C2531Co) this.f35221u).b());
                    return;
                } catch (RemoteException e13) {
                    int i18 = w2.z.f41712b;
                    x2.i.d("", e13);
                    return;
                }
            default:
                C3285gp c3285gp = (C3285gp) this.f35221u;
                c3285gp.getClass();
                C4077va c4077va = C4906k.f40186C.f40201n;
                Context context3 = (Context) this.f35222v;
                if (c4077va.f35462n.getAndSet(true)) {
                    return;
                }
                c4077va.f35463u = context3;
                c4077va.f35464v = c3285gp.f31429u;
                if (c4077va.f35466x != null || (b9 = AbstractC4820f.b(context3)) == null || b9.equals(context3.getPackageName())) {
                    return;
                }
                AbstractC4820f.a(context3, b9, c4077va);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3996u0(C2546Dm c2546Dm, InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm) {
        this.f35220n = 25;
        this.f35221u = c2546Dm;
        this.f35222v = (AbstractBinderC3359i8) interfaceViewOnClickListenerC2750Pm;
    }

    public /* synthetic */ RunnableC3996u0(Object obj, Object obj2, int i, boolean z6) {
        this.f35220n = i;
        this.f35221u = obj2;
        this.f35222v = obj;
    }

    public RunnableC3996u0(X4 x42, AbstractC3194f5 abstractC3194f5) {
        this.f35220n = 3;
        this.f35221u = abstractC3194f5;
        Objects.requireNonNull(x42);
        this.f35222v = x42;
    }

    public RunnableC3996u0(C2889Yb c2889Yb, Context context, C3490kg c3490kg) {
        this.f35220n = 11;
        this.f35221u = context;
        this.f35222v = c3490kg;
    }
}
