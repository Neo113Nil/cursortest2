package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.hz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3326hz extends AbstractC3810qz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30974f = 3;

    /* renamed from: g, reason: collision with root package name */
    public final Object f30975g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f30976h;

    public C3326hz(C3979u6 c3979u6, C3218fz c3218fz, DisplayMetrics displayMetrics, View view, C3983uA c3983uA) {
        super("1WgZ3mEd4p+W8SVE9tx/naUqatZo+XVfLsKM/o+CSVYyRyaBWFiQiHaYs+1ib01V", "yEc5jsed/vAVK/yCIwJWSyA9BW0RHK/xnzaQgPM8Vgw=", c3979u6, c3218fz, c3983uA.a(124));
        this.f30975g = displayMetrics;
        this.f30976h = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3810qz
    public final void a(Method method, C3979u6 c3979u6) {
        switch (this.f30974f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.f30976h, (Activity) this.f30975g);
                objArr.getClass();
                synchronized (c3979u6) {
                    long longValue = ((Long) objArr[0]).longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).d0(longValue);
                    long longValue2 = ((Long) objArr[1]).longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).e0(longValue2);
                    String str = (String) objArr[2];
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).f0(str);
                }
                return;
            case 1:
                Long l9 = -1L;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Long l10 = (Long) method.invoke("", (Context) this.f30975g);
                        if (l10 == null) {
                            throw null;
                        }
                        l9 = l10;
                    } else {
                        N3.a aVar = (N3.a) ((Map) this.f30976h).get("gs");
                        if (aVar != null && aVar.isDone()) {
                            l9 = Long.valueOf(((H6) aVar.get()).y0());
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (c3979u6) {
                    long longValue3 = l9.longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).c0(longValue3);
                }
                return;
            case 2:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.f30975g;
                Long l11 = (Long) map.get("tcq");
                if (l11 == null) {
                    l11 = -1L;
                }
                lArr[0] = l11;
                Long l12 = (Long) map.get("tpq");
                if (l12 == null) {
                    l12 = -1L;
                }
                lArr[1] = l12;
                Long l13 = (Long) map.get("tcv");
                if (l13 == null) {
                    l13 = -1L;
                }
                lArr[2] = l13;
                Long l14 = (Long) map.get("tpv");
                if (l14 == null) {
                    l14 = -1L;
                }
                lArr[3] = l14;
                Long l15 = (Long) map.get("tchv");
                if (l15 == null) {
                    l15 = -1L;
                }
                lArr[4] = l15;
                Long l16 = (Long) map.get("tphv");
                if (l16 == null) {
                    l16 = -1L;
                }
                lArr[5] = l16;
                Long l17 = (Long) map.get("tcc");
                if (l17 == null) {
                    l17 = -1L;
                }
                lArr[6] = l17;
                Long l18 = (Long) map.get("tpc");
                if (l18 == null) {
                    l18 = -1L;
                }
                lArr[7] = l18;
                Long l19 = (Long) map.get("tst");
                if (l19 == null) {
                    l19 = -1L;
                }
                lArr[8] = l19;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((EnumC3593my) this.f30976h).ordinal()));
                lArr2.getClass();
                synchronized (c3979u6) {
                    long longValue4 = lArr2[0].longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).n0(longValue4);
                    long longValue5 = lArr2[1].longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).D(longValue5);
                    long longValue6 = lArr2[2].longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).R0(longValue6);
                    long longValue7 = lArr2[3].longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).O0(longValue7);
                    long longValue8 = lArr2[4].longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).j0(longValue8);
                    long longValue9 = lArr2[5].longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).k0(longValue9);
                    long longValue10 = lArr2[6].longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).Q(longValue10);
                    long longValue11 = lArr2[7].longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).R(longValue11);
                }
                return;
            default:
                View view = (View) this.f30976h;
                if (view == null) {
                    return;
                }
                Object invoke = method.invoke("", (DisplayMetrics) this.f30975g, view);
                invoke.getClass();
                Long[] lArr3 = (Long[]) invoke;
                E6 A9 = F6.A();
                long longValue12 = lArr3[2].longValue();
                A9.h();
                ((F6) A9.f27721u).C(longValue12);
                long longValue13 = lArr3[1].longValue();
                A9.h();
                ((F6) A9.f27721u).D(longValue13);
                long longValue14 = lArr3[0].longValue();
                A9.h();
                ((F6) A9.f27721u).E(longValue14);
                long longValue15 = lArr3[3].longValue();
                A9.h();
                ((F6) A9.f27721u).B(longValue15);
                long longValue16 = lArr3[4].longValue();
                A9.h();
                ((F6) A9.f27721u).F(longValue16);
                F6 f62 = (F6) A9.j();
                c3979u6.h();
                ((H6) c3979u6.f27721u).W(f62);
                return;
        }
    }

    public C3326hz(C3979u6 c3979u6, C3218fz c3218fz, View view, Activity activity, C3983uA c3983uA) {
        super("1lfY2PujDI83L37TUM18aHWHBqDSAahgyhidgEksUB/zDEol7S6B03Ggb0FWJZjW", "FoX2EoxLxkVC+ircfmZ3nlw9JLpL8iQtQvisY+wPqkA=", c3979u6, c3218fz, c3983uA.a(111));
        this.f30976h = view;
        this.f30975g = activity;
    }

    public C3326hz(C3979u6 c3979u6, C3218fz c3218fz, EnumC3593my enumC3593my, Map map, C3983uA c3983uA) {
        super("FRbH3YSkWLoeHfFsbLmVPzOa63aS7qRNcxlL25CUBAPaDEl/9m5xoZHvOSUnXb3F", "n3MzKzWgNLpU97/XE2w+GCw7DhFJXqnLmao7nSZ1jSU=", c3979u6, c3218fz, c3983uA.a(122));
        this.f30975g = map;
        this.f30976h = enumC3593my;
    }

    public C3326hz(C3979u6 c3979u6, C3218fz c3218fz, Map map, Context context, C3983uA c3983uA) {
        super("SZhD94EfxCH1aUaqL3kliCVXsuzYhOJtOn/V0ec5JepY8dU6lMpt78s7q3QiFI+n", "9JUJL19Ne/lezLGl66/0Sq/KunPDyKseh4J4ncxdc50=", c3979u6, c3218fz, c3983uA.a(120));
        this.f30975g = context;
        this.f30976h = map;
    }
}
