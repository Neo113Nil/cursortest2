package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public final class F7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25503h = 1;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f25504j;

    public F7(C4219y7 c4219y7, C4002u6 c4002u6, int i, Context context) {
        super(c4219y7, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", c4002u6, i, 31);
        this.i = null;
        this.f25504j = context;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        switch (this.f25503h) {
            case 0:
                View view = (View) this.f25504j;
                if (view == null) {
                    return;
                }
                Boolean bool = (Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33162u3);
                boolean booleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.f27770e.invoke(null, view, (Activity) this.i, bool);
                C4002u6 c4002u6 = this.f27769d;
                synchronized (c4002u6) {
                    try {
                        long longValue = ((Long) objArr[0]).longValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).d0(longValue);
                        long longValue2 = ((Long) objArr[1]).longValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).e0(longValue2);
                        if (booleanValue) {
                            String str = (String) objArr[2];
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).f0(str);
                        }
                    } finally {
                    }
                }
                return;
            default:
                C4002u6 c4002u62 = this.f27769d;
                c4002u62.h();
                ((H6) c4002u62.f28504u).B(-1L);
                c4002u62.h();
                ((H6) c4002u62.f28504u).C(-1L);
                Context context = (Context) this.f25504j;
                if (context == null) {
                    context = this.f27766a.f35881a;
                }
                if (((List) this.i) == null) {
                    this.i = (List) this.f27770e.invoke(null, context);
                }
                List list = (List) this.i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (c4002u62) {
                    long longValue3 = ((Long) ((List) this.i).get(0)).longValue();
                    c4002u62.h();
                    ((H6) c4002u62.f28504u).B(longValue3);
                    long longValue4 = ((Long) ((List) this.i).get(1)).longValue();
                    c4002u62.h();
                    ((H6) c4002u62.f28504u).C(longValue4);
                }
                return;
        }
    }

    public F7(C4219y7 c4219y7, C4002u6 c4002u6, int i, View view, Activity activity) {
        super(c4219y7, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", c4002u6, i, 62);
        this.f25504j = view;
        this.i = activity;
    }
}
