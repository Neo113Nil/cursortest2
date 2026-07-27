package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.du, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3105du implements InterfaceC3742pl, KD, VJ, InterfaceC3231gB, InterfaceC3529lo {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29858n;

    /* renamed from: u, reason: collision with root package name */
    public Object f29859u;

    public C3105du(int i) {
        this.f29858n = i;
        switch (i) {
            case 5:
                this.f29859u = new a8.d();
                break;
            case 6:
                break;
            default:
                this.f29859u = new int[2];
                break;
        }
    }

    public static C3105du e(int i) {
        return new C3105du(8, C3240gK.a(AbstractC4205yG.a(i)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public void mo1a(Object obj) {
        switch (this.f29858n) {
            case 1:
                Iu iu = (Iu) this.f29859u;
                ((Mu) obj).b(iu.f25614u);
                break;
            case 10:
                ((InterfaceC4213yO) obj).k((DP) this.f29859u);
                break;
            default:
                ((InterfaceC4213yO) obj).o((DN) this.f29859u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.VJ
    public Object b(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            YJ yj = (YJ) this.f29859u;
            if (!hasNext) {
                return yj.f(str, null);
            }
            try {
                return yj.f(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public /* synthetic */ Object mo15c() {
        int i = EN.f24583A;
        return (C3146eh) this.f29859u;
    }

    public JSONObject d(View view) {
        if (view == null) {
            return AbstractC3914sw.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f29859u;
        view.getLocationOnScreen(iArr);
        return AbstractC3914sw.a(iArr[0], iArr[1], width, height);
    }

    public void f(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z3 = true;
            while (it.hasNext()) {
                if (!z3) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z3 = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            GB gb = (GB) this.f29859u;
            if (gb == null) {
                gb = new GB();
                this.f29859u = gb;
            }
            MB mb = (MB) gb.get(obj);
            if (mb == null) {
                mb = XB.n(asList instanceof Set ? Math.max(4, ((Set) asList).size()) : 4);
                GB gb2 = (GB) this.f29859u;
                if (gb2 == null) {
                    gb2 = new GB();
                    this.f29859u = gb2;
                }
                gb2.put(obj, mb);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                MA.i(obj, next);
                mb.c(next);
            }
        }
    }

    public int g() {
        int optInt = ((JSONObject) this.f29859u).optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        Object obj2;
        Fv fv = (Fv) this.f29859u;
        if (obj != null) {
            fv.f24875k.a();
            InterfaceC4914w0 j6 = fv.j(obj);
            double d2 = !(j6 instanceof BinderC3848rk) ? 0.0d : ((BinderC3848rk) j6).f33696C;
            InterfaceC4914w0 j9 = fv.j(obj);
            obj2 = obj;
            Mv mv = new Mv(obj2, fv.f24882r, d2, j9 instanceof BinderC3848rk ? ((BinderC3848rk) j9).f33697D : 2);
            Queue queue = fv.f24874j;
            synchronized (queue) {
                queue.add(mv);
            }
            InterfaceC4914w0 j10 = fv.j(obj2);
            fv.f24882r.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (fv.f24880p.get()) {
                u2.D.f41234l.post(new RunnableC3048cq(fv, j10));
            }
            ScheduledExecutorService scheduledExecutorService = fv.f24878n;
            scheduledExecutorService.execute(new RunnableC4027v0(fv, currentTimeMillis, j10));
            if (fv.f24871f != null) {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32038I)).booleanValue()) {
                    Gu gu = fv.f24879o;
                    Nv nv = new Nv(fv, 4, false);
                    long a9 = mv.a();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    gu.a(nv, a9);
                } else {
                    scheduledExecutorService.schedule(new Nv(fv, 3, false), mv.a(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32038I)).booleanValue()) {
                    Gu gu2 = fv.f24879o;
                    Nv nv2 = new Nv(fv, 0);
                    long a10 = mv.a();
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    gu2.a(nv2, a10);
                } else {
                    scheduledExecutorService.schedule(new Nv(fv, 0), mv.a(), TimeUnit.MILLISECONDS);
                }
            }
        } else {
            obj2 = obj;
        }
        fv.f24877m.set(false);
        if (obj2 == null || fv.f24871f == null) {
            fv.d(obj2 == null);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Fv fv = (Fv) this.f29859u;
        fv.f24877m.set(false);
        if ((th instanceof Dv) && ((Dv) th).f24489n == 0) {
            throw null;
        }
        fv.d(true);
    }

    public /* synthetic */ C3105du(int i, Object obj) {
        this.f29858n = i;
        this.f29859u = obj;
    }

    public /* synthetic */ C3105du(C4159xO c4159xO, DN dn) {
        this.f29858n = 11;
        this.f29859u = dn;
    }

    public /* synthetic */ C3105du(C4159xO c4159xO, DP dp, C4212yN c4212yN) {
        this.f29858n = 10;
        this.f29859u = dp;
    }

    public C3105du(C3796ql c3796ql, C2570Gf c2570Gf, Context context, View view, Activity activity, String str, HashMap hashMap, C3979u6 c3979u6, EnumC3593my enumC3593my) {
        this.f29858n = 4;
        C3351iN a9 = C3351iN.a(enumC3593my);
        C3351iN b9 = C3351iN.b(str);
        C3351iN a10 = C3351iN.a(c3979u6);
        C3243gN c3243gN = (C3243gN) c2570Gf.f25043v;
        C3351iN c3351iN = (C3351iN) c3796ql.f33379b;
        C3243gN c3243gN2 = (C3243gN) c3796ql.i;
        C3540lz c3540lz = new C3540lz(a10, c3243gN, c3351iN, c3243gN2, 0);
        C4232yq c4232yq = new C4232yq(a10, c3243gN, c3243gN2, 7);
        C3351iN a11 = C3351iN.a(hashMap);
        C3243gN c3243gN3 = (C3243gN) c2570Gf.f25043v;
        C3243gN c3243gN4 = (C3243gN) c3796ql.i;
        C3540lz c3540lz2 = new C3540lz(a10, c3243gN3, a11, c3243gN4, 2);
        C3540lz c3540lz3 = new C3540lz(a10, c3243gN3, (C3351iN) c3796ql.f33382e, c3243gN4, 1);
        Dy dy = new Dy(a10, c3243gN3, a9, a11, c3243gN4, 3);
        C4232yq c4232yq2 = new C4232yq(a10, c3243gN3, c3243gN4, 8);
        C3351iN a12 = C3351iN.a(context);
        C3243gN c3243gN5 = (C3243gN) c2570Gf.f25043v;
        C3243gN c3243gN6 = (C3243gN) c3796ql.i;
        C2709Oi c2709Oi = new C2709Oi(a10, c3243gN5, a9, a12, a11, c3243gN6);
        C3351iN c3351iN2 = (C3351iN) c3796ql.f33379b;
        C3351iN c3351iN3 = (C3351iN) c3796ql.f33382e;
        C3096dk c3096dk = new C3096dk(a10, c3243gN5, a11, c3351iN2, a9, c3351iN3, c3243gN6);
        C3540lz c3540lz4 = new C3540lz(a10, c3243gN5, c3351iN2, c3243gN6, 3);
        Dy dy2 = new Dy(a10, c3243gN5, a11, c3351iN2, c3243gN6, 2);
        C2933ai c2933ai = new C2933ai((InterfaceC3297hN) a10, (InterfaceC3297hN) a11, (InterfaceC3297hN) c3351iN3, c3243gN6, 23);
        int i = C3565mN.f31944c;
        ArrayList arrayList = new ArrayList(11);
        List list = Collections.EMPTY_LIST;
        arrayList.add(c3540lz);
        arrayList.add(c4232yq);
        arrayList.add(c3540lz2);
        arrayList.add(c3540lz3);
        arrayList.add(dy);
        arrayList.add(c4232yq2);
        arrayList.add(c2709Oi);
        arrayList.add(c3096dk);
        arrayList.add(c3540lz4);
        arrayList.add(dy2);
        arrayList.add(c2933ai);
        C3565mN c3565mN = new C3565mN(arrayList, list);
        C3351iN b10 = C3351iN.b(view);
        C3351iN b11 = C3351iN.b(activity);
        C3243gN c3243gN7 = (C3243gN) c2570Gf.f25043v;
        C3243gN c3243gN8 = (C3243gN) c3796ql.i;
        Dy dy3 = new Dy(a10, c3243gN7, b10, b11, c3243gN8, 1);
        C3243gN a13 = C3243gN.a(new C3094di(a12, 8));
        Ht ht = new Ht(a10, c3243gN7, a13, b10, c3243gN8, 3);
        ArrayList arrayList2 = new ArrayList(11);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(c3540lz);
        arrayList2.add(c4232yq);
        arrayList2.add(c3540lz3);
        arrayList2.add(dy3);
        arrayList2.add(ht);
        arrayList2.add(dy);
        arrayList2.add(c4232yq2);
        arrayList2.add(c2709Oi);
        arrayList2.add(c3096dk);
        arrayList2.add(c3540lz4);
        arrayList2.add(dy2);
        C3565mN c3565mN2 = new C3565mN(arrayList2, list2);
        Ht ht2 = new Ht(a10, (C3243gN) c2570Gf.f25043v, a11, a13, (C3243gN) c3796ql.i, 2);
        ArrayList arrayList3 = new ArrayList(12);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(c3540lz);
        arrayList3.add(c4232yq);
        arrayList3.add(c3540lz3);
        arrayList3.add(dy3);
        arrayList3.add(ht);
        arrayList3.add(dy);
        arrayList3.add(c4232yq2);
        arrayList3.add(c2709Oi);
        arrayList3.add(c3096dk);
        arrayList3.add(c3540lz4);
        arrayList3.add(dy2);
        arrayList3.add(ht2);
        this.f29859u = C3243gN.a(new C3578mj((C3243gN) c3796ql.f33386j, (C3243gN) c3796ql.f33388l, (C3243gN) c2570Gf.f25043v, a9, b9, a10, c3565mN, c3565mN2, new C3565mN(arrayList3, list3), (C3243gN) c3796ql.i, 5));
    }

    public C3105du(Fv fv) {
        this.f29858n = 2;
        Objects.requireNonNull(fv);
        this.f29859u = fv;
    }

    public /* synthetic */ C3105du(C3405jP c3405jP) {
        this.f29858n = 12;
        Objects.requireNonNull(c3405jP);
        this.f29859u = c3405jP;
    }
}
