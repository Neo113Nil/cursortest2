package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public final class F7 extends Q7 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24747h = 1;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f24748j;

    public F7(C4196y7 c4196y7, C3979u6 c3979u6, int i, Context context) {
        super(c4196y7, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", c3979u6, i, 31);
        this.i = null;
        this.f24748j = context;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        switch (this.f24747h) {
            case 0:
                View view = (View) this.f24748j;
                if (view == null) {
                    return;
                }
                Boolean bool = (Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.u3);
                boolean booleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.f26983e.invoke(null, view, (Activity) this.i, bool);
                C3979u6 c3979u6 = this.f26982d;
                synchronized (c3979u6) {
                    try {
                        long longValue = ((Long) objArr[0]).longValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).d0(longValue);
                        long longValue2 = ((Long) objArr[1]).longValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).e0(longValue2);
                        if (booleanValue) {
                            String str = (String) objArr[2];
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).f0(str);
                        }
                    } finally {
                    }
                }
                return;
            default:
                C3979u6 c3979u62 = this.f26982d;
                c3979u62.h();
                ((H6) c3979u62.f27721u).B(-1L);
                c3979u62.h();
                ((H6) c3979u62.f27721u).C(-1L);
                Context context = (Context) this.f24748j;
                if (context == null) {
                    context = this.f26979a.f35095a;
                }
                if (((List) this.i) == null) {
                    this.i = (List) this.f26983e.invoke(null, context);
                }
                List list = (List) this.i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (c3979u62) {
                    long longValue3 = ((Long) ((List) this.i).get(0)).longValue();
                    c3979u62.h();
                    ((H6) c3979u62.f27721u).B(longValue3);
                    long longValue4 = ((Long) ((List) this.i).get(1)).longValue();
                    c3979u62.h();
                    ((H6) c3979u62.f27721u).C(longValue4);
                }
                return;
        }
    }

    public F7(C4196y7 c4196y7, C3979u6 c3979u6, int i, View view, Activity activity) {
        super(c4196y7, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", c3979u6, i, 62);
        this.f24748j = view;
        this.i = activity;
    }
}
