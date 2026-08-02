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
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.du, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3128du implements InterfaceC3765pl, KD, VJ, InterfaceC3254gB, InterfaceC3606mo {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30646n;

    /* renamed from: u, reason: collision with root package name */
    public Object f30647u;

    public C3128du(int i) {
        this.f30646n = i;
        switch (i) {
            case 5:
                this.f30647u = new a8.d();
                break;
            case 6:
                break;
            default:
                this.f30647u = new int[2];
                break;
        }
    }

    public static C3128du e(int i) {
        return new C3128du(8, C3263gK.a(AbstractC4228yG.a(i)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        switch (this.f30646n) {
            case 1:
                Iu iu = (Iu) this.f30647u;
                ((Mu) obj).b(iu.f26367u);
                break;
            case 10:
                ((InterfaceC4236yO) obj).k((DP) this.f30647u);
                break;
            default:
                ((InterfaceC4236yO) obj).o((DN) this.f30647u);
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
            YJ yj = (YJ) this.f30647u;
            if (!hasNext) {
                return yj.f(str, null);
            }
            try {
                return yj.f(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    public /* synthetic */ Object mo14c() {
        int i = EN.f25344A;
        return (C3169eh) this.f30647u;
    }

    public JSONObject d(View view) {
        if (view == null) {
            return AbstractC3937sw.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f30647u;
        view.getLocationOnScreen(iArr);
        return AbstractC3937sw.a(iArr[0], iArr[1], width, height);
    }

    public void f(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z6 = true;
            while (it.hasNext()) {
                if (!z6) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z6 = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            GB gb = (GB) this.f30647u;
            if (gb == null) {
                gb = new GB();
                this.f30647u = gb;
            }
            MB mb = (MB) gb.get(obj);
            if (mb == null) {
                mb = XB.n(asList instanceof Set ? Math.max(4, ((Set) asList).size()) : 4);
                GB gb2 = (GB) this.f30647u;
                if (gb2 == null) {
                    gb2 = new GB();
                    this.f30647u = gb2;
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
        int optInt = ((JSONObject) this.f30647u).optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        Object obj2;
        Fv fv = (Fv) this.f30647u;
        if (obj != null) {
            fv.f25665k.a();
            InterfaceC4963w0 j6 = fv.j(obj);
            double d9 = !(j6 instanceof BinderC3871rk) ? 0.0d : ((BinderC3871rk) j6).f34468C;
            InterfaceC4963w0 j9 = fv.j(obj);
            obj2 = obj;
            Mv mv = new Mv(obj2, fv.f25672r, d9, j9 instanceof BinderC3871rk ? ((BinderC3871rk) j9).f34469D : 2);
            Queue queue = fv.f25664j;
            synchronized (queue) {
                queue.add(mv);
            }
            InterfaceC4963w0 j10 = fv.j(obj2);
            fv.f25672r.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (fv.f25670p.get()) {
                w2.D.f41627l.post(new RunnableC3071cq(fv, j10));
            }
            ScheduledExecutorService scheduledExecutorService = fv.f25668n;
            scheduledExecutorService.execute(new RunnableC4050v0(fv, currentTimeMillis, j10));
            if (fv.f25661f != null) {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32818I)).booleanValue()) {
                    Gu gu = fv.f25669o;
                    Nv nv = new Nv(fv, 4, false);
                    long a9 = mv.a();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    gu.a(nv, a9);
                } else {
                    scheduledExecutorService.schedule(new Nv(fv, 3, false), mv.a(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32818I)).booleanValue()) {
                    Gu gu2 = fv.f25669o;
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
        fv.f25667m.set(false);
        if (obj2 == null || fv.f25661f == null) {
            fv.d(obj2 == null);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Fv fv = (Fv) this.f30647u;
        fv.f25667m.set(false);
        if ((th instanceof Dv) && ((Dv) th).f25250n == 0) {
            throw null;
        }
        fv.d(true);
    }

    public /* synthetic */ C3128du(int i, Object obj) {
        this.f30646n = i;
        this.f30647u = obj;
    }

    public /* synthetic */ C3128du(C4182xO c4182xO, DN dn) {
        this.f30646n = 11;
        this.f30647u = dn;
    }

    public /* synthetic */ C3128du(C4182xO c4182xO, DP dp, C4235yN c4235yN) {
        this.f30646n = 10;
        this.f30647u = dp;
    }

    public C3128du(C3819ql c3819ql, C2590Gf c2590Gf, Context context, View view, Activity activity, String str, HashMap hashMap, C4002u6 c4002u6, EnumC3616my enumC3616my) {
        this.f30646n = 4;
        C3374iN a9 = C3374iN.a(enumC3616my);
        C3374iN b9 = C3374iN.b(str);
        C3374iN a10 = C3374iN.a(c4002u6);
        C3266gN c3266gN = (C3266gN) c2590Gf.f25831v;
        C3374iN c3374iN = (C3374iN) c3819ql.f34161b;
        C3266gN c3266gN2 = (C3266gN) c3819ql.i;
        C3563lz c3563lz = new C3563lz(a10, c3266gN, c3374iN, c3266gN2, 0);
        C4255yq c4255yq = new C4255yq(a10, c3266gN, c3266gN2, 7);
        C3374iN a11 = C3374iN.a(hashMap);
        C3266gN c3266gN3 = (C3266gN) c2590Gf.f25831v;
        C3266gN c3266gN4 = (C3266gN) c3819ql.i;
        C3563lz c3563lz2 = new C3563lz(a10, c3266gN3, a11, c3266gN4, 2);
        C3563lz c3563lz3 = new C3563lz(a10, c3266gN3, (C3374iN) c3819ql.f34164e, c3266gN4, 1);
        Dy dy = new Dy(a10, c3266gN3, a9, a11, c3266gN4, 3);
        C4255yq c4255yq2 = new C4255yq(a10, c3266gN3, c3266gN4, 8);
        C3374iN a12 = C3374iN.a(context);
        C3266gN c3266gN5 = (C3266gN) c2590Gf.f25831v;
        C3266gN c3266gN6 = (C3266gN) c3819ql.i;
        C2729Oi c2729Oi = new C2729Oi(a10, c3266gN5, a9, a12, a11, c3266gN6);
        C3374iN c3374iN2 = (C3374iN) c3819ql.f34161b;
        C3374iN c3374iN3 = (C3374iN) c3819ql.f34164e;
        C3119dk c3119dk = new C3119dk(a10, c3266gN5, a11, c3374iN2, a9, c3374iN3, c3266gN6);
        C3563lz c3563lz4 = new C3563lz(a10, c3266gN5, c3374iN2, c3266gN6, 3);
        Dy dy2 = new Dy(a10, c3266gN5, a11, c3374iN2, c3266gN6, 2);
        C2956ai c2956ai = new C2956ai((InterfaceC3320hN) a10, (InterfaceC3320hN) a11, (InterfaceC3320hN) c3374iN3, c3266gN6, 23);
        int i = C3588mN.f32724c;
        ArrayList arrayList = new ArrayList(11);
        List list = Collections.EMPTY_LIST;
        arrayList.add(c3563lz);
        arrayList.add(c4255yq);
        arrayList.add(c3563lz2);
        arrayList.add(c3563lz3);
        arrayList.add(dy);
        arrayList.add(c4255yq2);
        arrayList.add(c2729Oi);
        arrayList.add(c3119dk);
        arrayList.add(c3563lz4);
        arrayList.add(dy2);
        arrayList.add(c2956ai);
        C3588mN c3588mN = new C3588mN(arrayList, list);
        C3374iN b10 = C3374iN.b(view);
        C3374iN b11 = C3374iN.b(activity);
        C3266gN c3266gN7 = (C3266gN) c2590Gf.f25831v;
        C3266gN c3266gN8 = (C3266gN) c3819ql.i;
        Dy dy3 = new Dy(a10, c3266gN7, b10, b11, c3266gN8, 1);
        C3266gN a13 = C3266gN.a(new C3117di(a12, 8));
        Ht ht = new Ht(a10, c3266gN7, a13, b10, c3266gN8, 3);
        ArrayList arrayList2 = new ArrayList(11);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(c3563lz);
        arrayList2.add(c4255yq);
        arrayList2.add(c3563lz3);
        arrayList2.add(dy3);
        arrayList2.add(ht);
        arrayList2.add(dy);
        arrayList2.add(c4255yq2);
        arrayList2.add(c2729Oi);
        arrayList2.add(c3119dk);
        arrayList2.add(c3563lz4);
        arrayList2.add(dy2);
        C3588mN c3588mN2 = new C3588mN(arrayList2, list2);
        Ht ht2 = new Ht(a10, (C3266gN) c2590Gf.f25831v, a11, a13, (C3266gN) c3819ql.i, 2);
        ArrayList arrayList3 = new ArrayList(12);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(c3563lz);
        arrayList3.add(c4255yq);
        arrayList3.add(c3563lz3);
        arrayList3.add(dy3);
        arrayList3.add(ht);
        arrayList3.add(dy);
        arrayList3.add(c4255yq2);
        arrayList3.add(c2729Oi);
        arrayList3.add(c3119dk);
        arrayList3.add(c3563lz4);
        arrayList3.add(dy2);
        arrayList3.add(ht2);
        this.f30647u = C3266gN.a(new C3601mj((C3266gN) c3819ql.f34168j, (C3266gN) c3819ql.f34170l, (C3266gN) c2590Gf.f25831v, a9, b9, a10, c3588mN, c3588mN2, new C3588mN(arrayList3, list3), (C3266gN) c3819ql.i, 5));
    }

    public C3128du(Fv fv) {
        this.f30646n = 2;
        Objects.requireNonNull(fv);
        this.f30647u = fv;
    }

    public /* synthetic */ C3128du(C3428jP c3428jP) {
        this.f30646n = 12;
        Objects.requireNonNull(c3428jP);
        this.f30647u = c3428jP;
    }
}
