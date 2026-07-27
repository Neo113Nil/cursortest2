package com.google.android.gms.internal.ads;

import O.C0357t;
import a.AbstractC0415a;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n2.C4809e;
import o2.C4829b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class MD implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26310n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f26311u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f26312v;

    public /* synthetic */ MD(int i, Object obj, Object obj2) {
        this.f26310n = i;
        this.f26311u = obj;
        this.f26312v = obj2;
    }

    private final void a() {
        InterfaceC3858rh interfaceC3858rh;
        Rx rx = new Rx(15, (C2486Bh) this.f26311u);
        C3276gq c3276gq = (C3276gq) this.f26312v;
        synchronized (c3276gq) {
            C2955aw c2955aw = c3276gq.f31109f;
            if (c2955aw == null || (interfaceC3858rh = c3276gq.f31107d) == null) {
                return;
            }
            p2.j.f39798C.f39823x.getClass();
            C3431jl.r(new RunnableC3329hp(1, c2955aw, rx));
            c3276gq.f31109f = null;
            interfaceC3858rh.f0(null);
        }
    }

    private final void b() {
        View view;
        C2474Am c2474Am = (C2474Am) this.f26311u;
        C3917sm c3917sm = c2474Am.f23892d;
        synchronized (c3917sm) {
            view = c3917sm.f34288o;
        }
        if (view != null) {
            boolean z8 = ((ViewGroup) this.f26312v) != null;
            int q6 = c3917sm.q();
            C3226fu c3226fu = c2474Am.f23890b;
            t2.E e6 = c2474Am.f23889a;
            if (q6 == 2 || c3917sm.q() == 1) {
                e6.p(c3226fu.f30904g, String.valueOf(c3917sm.q()), z8);
            } else if (c3917sm.q() == 6) {
                String str = c3226fu.f30904g;
                e6.p(str, "2", z8);
                e6.p(str, "1", z8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    private final void c() {
        ViewGroup viewGroup;
        View view;
        View view2;
        ViewGroup viewGroup2;
        InterfaceC3529lb interfaceC3529lb;
        Drawable drawable;
        C2474Am c2474Am = (C2474Am) this.f26311u;
        C4025um c4025um = c2474Am.f23891c;
        boolean d2 = c4025um.d();
        ?? r42 = (AbstractBinderC3186f8) this.f26312v;
        if (d2 || c4025um.b()) {
            String[] strArr = {"1098", "3011"};
            for (int i = 0; i < 2; i++) {
                View G02 = r42.G0(strArr[i]);
                if (G02 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) G02;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = r42.A0().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        C3917sm c3917sm = c2474Am.f23892d;
        synchronized (c3917sm) {
            view = c3917sm.f34278d;
        }
        if (view != null) {
            synchronized (c3917sm) {
                view2 = c3917sm.f34278d;
            }
            C3261gb c3261gb = c2474Am.i;
            if (c3261gb != null && viewGroup == null) {
                C2474Am.b(layoutParams, c3261gb.f31027x);
                view2.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (c3917sm.s() instanceof BinderC2989bb) {
            BinderC2989bb binderC2989bb = (BinderC2989bb) c3917sm.s();
            if (viewGroup == null) {
                C2474Am.b(layoutParams, binderC2989bb.f29512A);
                viewGroup = null;
            }
            C3043cb c3043cb = new C3043cb(context);
            O2.w.h(binderC2989bb);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(C3043cb.f29714u, null, null));
            shapeDrawable.getPaint().setColor(binderC2989bb.f29516w);
            c3043cb.setLayoutParams(layoutParams);
            c3043cb.setBackground(shapeDrawable);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            String str = binderC2989bb.f29513n;
            if (!TextUtils.isEmpty(str)) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams3);
                textView.setId(1195835393);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setText(str);
                textView.setTextColor(binderC2989bb.f29517x);
                textView.setTextSize(binderC2989bb.f29518y);
                u2.d dVar = C4907p.f40108g.f40109a;
                textView.setPadding(u2.d.b(context, 4), 0, u2.d.q(context.getResources().getDisplayMetrics(), 4), 0);
                c3043cb.addView(textView);
                layoutParams2.addRule(1, textView.getId());
            }
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams2);
            imageView.setId(1195835394);
            ArrayList arrayList = binderC2989bb.f29514u;
            if (arrayList != null && arrayList.size() > 1) {
                c3043cb.f29715n = new AnimationDrawable();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        c3043cb.f29715n.addFrame((Drawable) V2.b.A0(((BinderC3098db) it.next()).d()), binderC2989bb.f29519z);
                    } catch (Exception e6) {
                        int i4 = t2.C.f40822b;
                        u2.i.d("Error while getting drawable.", e6);
                    }
                }
                imageView.setBackground(c3043cb.f29715n);
            } else if (arrayList.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) V2.b.A0(((BinderC3098db) arrayList.get(0)).d()));
                } catch (Exception e9) {
                    int i9 = t2.C.f40822b;
                    u2.i.d("Error while getting drawable.", e9);
                }
            }
            c3043cb.addView(imageView);
            c3043cb.setContentDescription((CharSequence) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31454H4));
            view2 = c3043cb;
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
                C4809e c4809e = new C4809e(r42.A0().getContext());
                c4809e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c4809e.addView(view2);
                FrameLayout q32 = r42.q3();
                if (q32 != null) {
                    q32.addView(c4809e);
                }
            }
            r42.N0(view2, r42.m());
        }
        C3675oC c3675oC = ViewTreeObserverOnGlobalLayoutListenerC4241ym.f35393I;
        int i10 = c3675oC.f33117w;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                viewGroup2 = null;
                break;
            }
            View G03 = r42.G0((String) c3675oC.get(i11));
            i11++;
            if (G03 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) G03;
                break;
            }
        }
        c2474Am.f23896h.execute(new MD(25, c2474Am, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (c2474Am.c(viewGroup2, true)) {
            if (c3917sm.h() != null) {
                c3917sm.h().j1(new C2881Yl((InterfaceViewOnClickListenerC2678Mm) r42, viewGroup2));
                return;
            }
            return;
        }
        C3151ea c3151ea = AbstractC3368ia.ub;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && c2474Am.c(viewGroup2, false)) {
            if (c3917sm.i() != null) {
                c3917sm.i().j1(new C2881Yl((InterfaceViewOnClickListenerC2678Mm) r42, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View A02 = r42.A0();
        Context context2 = A02 != null ? A02.getContext() : null;
        if (context2 != null) {
            C3756pm c3756pm = c2474Am.f23897j;
            synchronized (c3756pm) {
                interfaceC3529lb = c3756pm.f33505a;
            }
            if (interfaceC3529lb != null) {
                try {
                    V2.a e10 = interfaceC3529lb.e();
                    if (e10 == null || (drawable = (Drawable) V2.b.A0(e10)) == null) {
                        return;
                    }
                    ImageView imageView2 = new ImageView(context2);
                    imageView2.setImageDrawable(drawable);
                    V2.a p6 = r42.p();
                    if (p6 != null) {
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31648d7)).booleanValue()) {
                            imageView2.setScaleType((ImageView.ScaleType) V2.b.A0(p6));
                            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView2);
                        }
                    }
                    imageView2.setScaleType(C2474Am.f23888k);
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView2);
                } catch (RemoteException unused) {
                    int i12 = t2.C.f40822b;
                    u2.i.f("Could not get main image drawable");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d() {
        C3542lo c3542lo;
        C3656nu a9;
        Executor executor;
        C2527Do c2527Do;
        final C2527Do c2527Do2 = (C2527Do) ((C3761pr) this.f26311u).f33523u;
        String str = (String) this.f26312v;
        Context context = c2527Do2.f24560f;
        int i = 5;
        Vu f6 = Vu.f(context, 5);
        f6.a();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject(com.anythink.expressad.foundation.g.g.a.b.ai);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Vu f9 = Vu.f(context, i);
                f9.a();
                f9.p0(next);
                final Object obj = new Object();
                final C3320hg c3320hg = new C3320hg();
                J3.a w9 = C3686oN.w(c3320hg, ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31809v2)).longValue(), TimeUnit.SECONDS, c2527Do2.f24564k);
                c2527Do2.f24565l.a(next);
                c2527Do2.f24568o.d(next);
                p2.j.f39798C.f39810k.getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                w9.c(new Runnable() { // from class: com.google.android.gms.internal.ads.Bo
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2527Do c2527Do3 = c2527Do2;
                        Object obj2 = obj;
                        C3320hg c3320hg2 = c3320hg;
                        String str2 = next;
                        long j9 = elapsedRealtime;
                        Vu vu = f9;
                        c2527Do3.getClass();
                        synchronized (obj2) {
                            try {
                                if (!c3320hg2.f31242n.isDone()) {
                                    p2.j.f39798C.f39810k.getClass();
                                    c2527Do3.d(str2, (int) (SystemClock.elapsedRealtime() - j9), "Timeout.", false);
                                    c2527Do3.f24565l.c(str2, "timeout");
                                    c2527Do3.f24568o.i(str2, "timeout");
                                    Zu zu = c2527Do3.f24569p;
                                    vu.h("Timeout");
                                    vu.b(false);
                                    zu.b(vu.m());
                                    c3320hg2.a(Boolean.FALSE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, c2527Do2.i);
                arrayList.add(w9);
                BinderC4297zo binderC4297zo = new BinderC4297zo(elapsedRealtime, c3320hg, c2527Do2, f9, obj, next);
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
                            arrayList2.add(new C4285zc(optString, bundle));
                            i4++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                c2527Do2.d(next, 0, "", false);
                try {
                    a9 = c2527Do2.f24562h.a(next, new JSONObject());
                    executor = c2527Do2.f24563j;
                    try {
                        c2527Do = c2527Do2;
                    } catch (C3334hu e6) {
                        e = e6;
                    }
                } catch (C3334hu e9) {
                    e = e9;
                }
                try {
                    c2527Do2 = c2527Do;
                    executor.execute(new RunnableC2774Sg(c2527Do, next, binderC4297zo, a9, arrayList2));
                } catch (C3334hu e10) {
                    e = e10;
                    c2527Do2 = c2527Do;
                    binderC4297zo = binderC4297zo;
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.xe)).booleanValue()) {
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                            sb.append("Failed to create Adapter.");
                            sb.append(" ");
                            sb.append(message);
                            str2 = sb.toString();
                        }
                        binderC4297zo.G3(str2);
                    } catch (RemoteException e11) {
                        int i9 = t2.C.f40822b;
                        u2.i.d("", e11);
                    }
                    i = 5;
                } catch (JSONException e12) {
                    e = e12;
                    c2527Do2 = c2527Do;
                    t2.C.l("Malformed CLD response", e);
                    c2527Do2.f24568o.E("MalformedJson");
                    c3542lo = c2527Do2.f24565l;
                    synchronized (c3542lo) {
                    }
                }
                i = 5;
            }
            UB n9 = UB.n(arrayList);
            T6 t62 = new T6(4, c2527Do2, f6);
            SD sd = c2527Do2.i;
            GD gd = new GD(n9, false, false);
            gd.f25114I = new FD(gd, t62, sd);
            gd.w();
        } catch (JSONException e13) {
            e = e13;
            t2.C.l("Malformed CLD response", e);
            c2527Do2.f24568o.E("MalformedJson");
            c3542lo = c2527Do2.f24565l;
            synchronized (c3542lo) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31445G2)).booleanValue()) {
                    HashMap e14 = c3542lo.e();
                    e14.put(NativeAdvancedJsUtils.f18064p, "aaia");
                    e14.put("aair", "MalformedJson");
                    c3542lo.f32594b.add(e14);
                }
            }
            c2527Do2.f24559e.b(e);
            p2.j.f39798C.f39808h.d("AdapterInitializer.updateAdapterStatus", e);
            Zu zu = c2527Do2.f24569p;
            f6.c(e);
            f6.b(false);
            zu.b(f6.m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable a9;
        C2486Bh c2486Bh;
        MediaPlayer mediaPlayer;
        int i;
        MediaFormat format;
        int i4 = 9;
        Application application = null;
        InterfaceC3563m8 c3455k8 = null;
        int i9 = 2;
        int i10 = 0;
        int i11 = 1;
        switch (this.f26310n) {
            case 0:
                J3.a aVar = (J3.a) this.f26311u;
                boolean z8 = aVar instanceof AbstractC3192fE;
                LD ld = (LD) this.f26312v;
                if (z8 && (a9 = ((AbstractC3192fE) aVar).a()) != null) {
                    ld.q(a9);
                    return;
                }
                try {
                    ld.mo7l(C3686oN.H(aVar));
                    return;
                } catch (ExecutionException e6) {
                    ld.q(e6.getCause());
                    return;
                } catch (Throwable th) {
                    ld.q(th);
                    return;
                }
            case 1:
                C3932t0 c3932t0 = (C3932t0) this.f26311u;
                c3932t0.getClass();
                String str = AbstractC3548lu.f32613a;
                VN vn = c3932t0.f34333b;
                vn.getClass();
                C4086vt c4086vt = new C4086vt(i4, (C3100dd) this.f26312v);
                C3759pp c3759pp = vn.f28243n.f30013G;
                c3759pp.c(25, c4086vt);
                c3759pp.d();
                return;
            case 2:
                C3932t0 c3932t02 = (C3932t0) this.f26311u;
                LN ln = (LN) this.f26312v;
                c3932t02.getClass();
                synchronized (ln) {
                }
                String str2 = AbstractC3548lu.f32613a;
                OO oo = c3932t02.f34333b.f28243n.f30021L;
                KO y6 = oo.y((BQ) oo.f26694d.f27123x);
                oo.s(y6, 1020, new C2478Aq(y6, ln, 17));
                return;
            case 3:
                C3932t0 c3932t03 = (C3932t0) this.f26311u;
                c3932t03.getClass();
                String str3 = AbstractC3548lu.f32613a;
                c3932t03.f34333b.f28243n.Y.N((KN) this.f26312v);
                return;
            case 4:
                try {
                    ((U4) this.f26312v).f27924u.put((AbstractC3074d5) this.f26311u);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 5:
                C4264z8 c4264z8 = (C4264z8) this.f26312v;
                View view = (View) this.f26311u;
                c4264z8.getClass();
                try {
                    C4048v8 c4048v8 = new C4048v8(c4264z8.f35494y, c4264z8.f35495z, c4264z8.f35481A, c4264z8.f35482B, c4264z8.f35483C, c4264z8.f35484D, c4264z8.f35485E, c4264z8.f35488H);
                    com.bumptech.glide.manager.o oVar = p2.j.f39798C.f39807g;
                    synchronized (oVar.f23624v) {
                        C4102w8 c4102w8 = (C4102w8) oVar.f23625w;
                        if (c4102w8 != null) {
                            application = c4102w8.f34947u;
                        }
                    }
                    if (application != null) {
                        String str4 = c4264z8.f35486F;
                        if (!TextUtils.isEmpty(str4)) {
                            String str5 = (String) view.getTag(application.getResources().getIdentifier((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31434F0), "id", application.getPackageName()));
                            if (str5 != null && str5.equals(str4)) {
                                return;
                            }
                        }
                    }
                    C0357t a10 = c4264z8.a(view, c4048v8);
                    c4048v8.b();
                    if (a10.f2319a == 0 && a10.f2320b == 0) {
                        return;
                    }
                    int i12 = a10.f2320b;
                    if (i12 == 0 && c4048v8.f34726k == 0) {
                        return;
                    }
                    if (i12 == 0) {
                        C3398j5 c3398j5 = c4264z8.f35492w;
                        synchronized (c3398j5.f32084u) {
                            try {
                                if (((LinkedList) c3398j5.f32085v).contains(c4048v8)) {
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    c4264z8.f35492w.q(c4048v8);
                    return;
                } catch (Exception e9) {
                    int i13 = t2.C.f40822b;
                    u2.i.d("Exception in fetchContentOnUIThread", e9);
                    p2.j.f39798C.f39808h.d("ContentFetchTask.fetchContent", e9);
                    return;
                }
            case 6:
                if (((W8) this.f26312v).isCancelled()) {
                    ((J3.a) this.f26311u).cancel(true);
                    return;
                }
                return;
            case 7:
                boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31630b6)).booleanValue();
                Context context = (Context) this.f26312v;
                com.bumptech.glide.manager.o oVar2 = (com.bumptech.glide.manager.o) this.f26311u;
                if (booleanValue) {
                    try {
                        try {
                            IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i14 = AbstractBinderC3509l8.f32544n;
                            if (b9 != null) {
                                IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                c3455k8 = queryLocalInterface instanceof InterfaceC3563m8 ? (InterfaceC3563m8) queryLocalInterface : new C3455k8(b9, "com.google.android.gms.ads.clearcut.IClearcut", 2);
                            }
                            oVar2.f23624v = c3455k8;
                            ((C3455k8) ((InterfaceC3563m8) oVar2.f23624v)).R0(new V2.b(context));
                            oVar2.f23623u = true;
                            return;
                        } catch (Exception e10) {
                            throw new u2.j(e10);
                        }
                    } catch (RemoteException | NullPointerException | u2.j unused2) {
                        u2.i.a("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 8:
                C2770Sc c2770Sc = (C2770Sc) this.f26312v;
                c7.m mVar = (c7.m) this.f26311u;
                mVar.getClass();
                p2.j.f39798C.f39810k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    t2.C.k("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context2 = (Context) mVar.f5722e;
                    C5107a c5107a = (C5107a) mVar.f5723f;
                    C2634Kc c2634Kc = new C2634Kc();
                    InterfaceC3858rh g9 = C2837Wb.g(null, new W2.b(0, 0, 0), context2, null, new C2914a9(), null, null, null, null, null, null, null, "", c5107a, false, false);
                    c2634Kc.f25993n = g9;
                    g9.b0().setWillNotDraw(true);
                    t2.C.k("loadJavascriptEngine > After createJavascriptEngine");
                    t2.C.k("loadJavascriptEngine > Before setting new engine loaded listener");
                    C2736Qc c2736Qc = new C2736Qc(mVar, arrayList, currentTimeMillis, c2770Sc, c2634Kc);
                    InterfaceC3858rh interfaceC3858rh = c2634Kc.f25993n;
                    if (interfaceC3858rh != null) {
                        interfaceC3858rh.j0().f25381A = new C3761pr(10, c2736Qc);
                    }
                    t2.C.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    c2634Kc.f("/jsLoaded", new C2668Mc(mVar, currentTimeMillis, c2770Sc, c2634Kc));
                    t2.w wVar = new t2.w(0);
                    C2685Nc c2685Nc = new C2685Nc(mVar, c2634Kc, wVar);
                    wVar.f40939u = c2685Nc;
                    t2.C.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) AbstractC2632Ka.f25981d.r()).booleanValue() || TextUtils.equals(((Context) mVar.f5722e).getPackageName(), "com.google.android.gms")) {
                        c2634Kc.f("/requestReload", c2685Nc);
                    }
                    String str6 = mVar.f5719b;
                    t2.C.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str6)));
                    if (str6.endsWith(".js")) {
                        t2.C.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                        t2.C.k("loadJavascript on adWebView from path: ".concat(str6));
                        C2634Kc.l(new RunnableC2617Jc(c2634Kc, "<!DOCTYPE html><html><head><script src=\"" + str6 + "\"></script></head><body></body></html>", i10));
                        t2.C.k("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str6.startsWith("<html>")) {
                        t2.C.k("loadJavascriptEngine > Before newEngine.loadHtml");
                        t2.C.k("loadHtml on adWebView from html");
                        C2634Kc.l(new RunnableC2617Jc(c2634Kc, str6, 1));
                        t2.C.k("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        t2.C.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        t2.C.k("loadHtmlWrapper on adWebView from path: ".concat(str6));
                        C2634Kc.l(new RunnableC2617Jc(c2634Kc, str6, i9));
                        t2.C.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    t2.C.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    t2.G.f40858l.postDelayed(new RunnableC2719Pc(mVar, c2770Sc, c2634Kc, arrayList, currentTimeMillis, 0), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31650e)).intValue());
                    return;
                } catch (Throwable th2) {
                    int i15 = t2.C.f40822b;
                    u2.i.d("Error creating webview.", th2);
                    C3151ea c3151ea = AbstractC3368ia.C8;
                    q2.r rVar = q2.r.f40116e;
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        c2770Sc.r("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th2);
                        return;
                    } else if (((Boolean) rVar.f40119c.a(AbstractC3368ia.E8)).booleanValue()) {
                        p2.j.f39798C.f39808h.e("SdkJavascriptFactory.loadJavascriptEngine", th2);
                        c2770Sc.q();
                        return;
                    } else {
                        p2.j.f39798C.f39808h.d("SdkJavascriptFactory.loadJavascriptEngine", th2);
                        c2770Sc.q();
                        return;
                    }
                }
            case 9:
                L2.i iVar = p2.j.f39798C.f39802b;
                L2.i.y(((zzbyb) this.f26312v).f35647a, (AdOverlayInfoParcel) this.f26311u, true, null);
                return;
            case 10:
                ((u2.l) this.f26311u).a(null, (String) this.f26312v);
                return;
            case 11:
                C4072vf c4072vf = (C4072vf) this.f26311u;
                Bitmap bitmap = (Bitmap) this.f26312v;
                c4072vf.getClass();
                QK qk = SK.f27529u;
                RK rk = new RK();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, rk);
                synchronized (c4072vf.f34827h) {
                    C3900sM c3900sM = c4072vf.f34820a;
                    IM A8 = JM.A();
                    SK b10 = rk.b();
                    A8.h();
                    ((JM) A8.f30000u).C(b10);
                    A8.h();
                    ((JM) A8.f30000u).B("image/png");
                    A8.h();
                    ((JM) A8.f30000u).D(2);
                    JM jm = (JM) A8.j();
                    c3900sM.h();
                    ((TM) c3900sM.f30000u).K(jm);
                }
                return;
            case 12:
                C3320hg c3320hg = (C3320hg) this.f26312v;
                try {
                    c3320hg.a(C4829b.a((Context) this.f26311u));
                    return;
                } catch (L2.g | IOException | IllegalStateException e11) {
                    c3320hg.b(e11);
                    u2.i.d("Exception while getting advertising Id info", e11);
                    return;
                }
            case 13:
                TextureViewSurfaceTextureListenerC3696og textureViewSurfaceTextureListenerC3696og = (TextureViewSurfaceTextureListenerC3696og) this.f26312v;
                textureViewSurfaceTextureListenerC3696og.getClass();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue() && (c2486Bh = textureViewSurfaceTextureListenerC3696og.f33172v) != null && (mediaPlayer = (MediaPlayer) this.f26311u) != null) {
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
                                                textureViewSurfaceTextureListenerC3696og.f33171L = valueOf;
                                                hashMap.put("bitRate", String.valueOf(valueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger("height");
                                                i = i11;
                                                StringBuilder sb = new StringBuilder(CL.b(integer, i11) + String.valueOf(integer2).length());
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
                                c2486Bh.a("onMetadataEvent", hashMap);
                            }
                        }
                    } catch (RuntimeException e12) {
                        p2.j.f39798C.f39808h.d("AdMediaPlayerView.reportMetadata", e12);
                    }
                }
                C3965tg c3965tg = textureViewSurfaceTextureListenerC3696og.J;
                if (c3965tg != null) {
                    c3965tg.e();
                    return;
                }
                return;
            case 14:
                AbstractC2655Lg.f26183n = (AudioManager) ((Context) this.f26311u).getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
                ((C2865Xm) this.f26312v).a();
                return;
            case 15:
                AtomicInteger atomicInteger = C3267gh.f31034N;
                ((InterfaceC3858rh) this.f26311u).a("onGcacheInfoEvent", (HashMap) this.f26312v);
                return;
            case 16:
                a();
                return;
            case 17:
                ((ViewTreeObserverOnGlobalLayoutListenerC2520Dh) this.f26311u).z((String) this.f26312v);
                return;
            case 18:
                ((BinderC2554Fh) this.f26311u).f24999n.a("pubVideoCmd", (HashMap) this.f26312v);
                return;
            case 19:
                C2571Gh c2571Gh = (C2571Gh) this.f26311u;
                Uri parse = Uri.parse((String) this.f26312v);
                C2588Hh c2588Hh = ((ViewTreeObserverOnGlobalLayoutListenerC2520Dh) c2571Gh.f25201a.f28329u).f24472G;
                if (c2588Hh != null) {
                    c2588Hh.f(parse);
                    return;
                } else {
                    int i16 = t2.C.f40822b;
                    u2.i.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                }
            case 20:
                C2997bj c2997bj = (C2997bj) this.f26311u;
                c2997bj.getClass();
                JSONObject jSONObject = (JSONObject) this.f26312v;
                String obj = jSONObject.toString();
                String o9 = D.y.o(new StringBuilder(obj.length() + 31), "Calling AFMA_updateActiveView(", obj, ")");
                int i17 = t2.C.f40822b;
                u2.i.a(o9);
                c2997bj.f29552n.b("AFMA_updateActiveView", jSONObject);
                return;
            case 21:
                try {
                    ((InterfaceC3701ol) this.f26311u).mo2b(this.f26312v);
                    return;
                } catch (Throwable th3) {
                    p2.j.f39798C.f39808h.e("EventEmitter.notify", th3);
                    t2.C.l("Event emitter exception.", th3);
                    return;
                }
            case 22:
                C2728Pl c2728Pl = (C2728Pl) this.f26311u;
                if (c2728Pl.f27029a == 0) {
                    c2728Pl.m((Integer) this.f26312v);
                    return;
                }
                return;
            case 23:
                C2728Pl c2728Pl2 = (C2728Pl) this.f26311u;
                int i18 = c2728Pl2.f27029a - 1;
                c2728Pl2.f27029a = i18;
                if (i18 == 0) {
                    c2728Pl2.m(this.f26312v);
                    return;
                }
                return;
            case 24:
                C2728Pl c2728Pl3 = (C2728Pl) this.f26311u;
                Object apply = ((UN) this.f26312v).apply(c2728Pl3.f27034f);
                c2728Pl3.f27034f = apply;
                MD md = new MD(23, c2728Pl3, apply);
                C3709ot c3709ot = (C3709ot) c2728Pl3.f27031c;
                if (c3709ot.f33230a.getLooper().getThread().isAlive()) {
                    c3709ot.e(md);
                    return;
                }
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                C2527Do c2527Do = (C2527Do) this.f26311u;
                c2527Do.getClass();
                c2527Do.i.execute(new RunnableC3376ij(i4, (C3320hg) this.f26312v));
                return;
            default:
                try {
                    ((InterfaceC4231yc) this.f26312v).R2(((C2527Do) this.f26311u).b());
                    return;
                } catch (RemoteException e13) {
                    int i19 = t2.C.f40822b;
                    u2.i.d("", e13);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f26310n) {
            case 0:
                C3602mu c3602mu = new C3602mu(MD.class.getSimpleName(), 18);
                C2593Hm c2593Hm = new C2593Hm(26, false);
                ((C2593Hm) c3602mu.f32776w).f25416u = c2593Hm;
                c3602mu.f32776w = c2593Hm;
                c2593Hm.f25417v = (LD) this.f26312v;
                return c3602mu.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MD(C2474Am c2474Am, InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm) {
        this.f26310n = 26;
        this.f26311u = c2474Am;
        this.f26312v = (AbstractBinderC3186f8) interfaceViewOnClickListenerC2678Mm;
    }

    public /* synthetic */ MD(Object obj, Object obj2, int i, boolean z8) {
        this.f26310n = i;
        this.f26311u = obj2;
        this.f26312v = obj;
    }

    public MD(U4 u42, AbstractC3074d5 abstractC3074d5) {
        this.f26310n = 4;
        this.f26311u = abstractC3074d5;
        Objects.requireNonNull(u42);
        this.f26312v = u42;
    }

    public MD(C2837Wb c2837Wb, Context context, C3320hg c3320hg) {
        this.f26310n = 12;
        this.f26311u = context;
        this.f26312v = c3320hg;
    }
}
