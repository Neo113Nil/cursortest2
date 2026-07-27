package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public final class E7 extends P7 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24661h = 1;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f24662j;

    public E7(C4101w7 c4101w7, C3830r6 c3830r6, int i, Context context) {
        super(c4101w7, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", c3830r6, i, 31);
        this.i = null;
        this.f24662j = context;
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void a() {
        switch (this.f24661h) {
            case 0:
                View view = (View) this.f24662j;
                if (view == null) {
                    return;
                }
                Boolean bool = (Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31801u3);
                boolean booleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.f26845e.invoke(null, view, (Activity) this.i, bool);
                C3830r6 c3830r6 = this.f26844d;
                synchronized (c3830r6) {
                    try {
                        long longValue = ((Long) objArr[0]).longValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).d0(longValue);
                        long longValue2 = ((Long) objArr[1]).longValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).e0(longValue2);
                        if (booleanValue) {
                            String str = (String) objArr[2];
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).f0(str);
                        }
                    } finally {
                    }
                }
                return;
            default:
                C3830r6 c3830r62 = this.f26844d;
                c3830r62.h();
                ((D6) c3830r62.f30000u).B(-1L);
                c3830r62.h();
                ((D6) c3830r62.f30000u).C(-1L);
                Context context = (Context) this.f24662j;
                if (context == null) {
                    context = this.f26841a.f34929a;
                }
                if (((List) this.i) == null) {
                    this.i = (List) this.f26845e.invoke(null, context);
                }
                List list = (List) this.i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (c3830r62) {
                    long longValue3 = ((Long) ((List) this.i).get(0)).longValue();
                    c3830r62.h();
                    ((D6) c3830r62.f30000u).B(longValue3);
                    long longValue4 = ((Long) ((List) this.i).get(1)).longValue();
                    c3830r62.h();
                    ((D6) c3830r62.f30000u).C(longValue4);
                }
                return;
        }
    }

    public E7(C4101w7 c4101w7, C3830r6 c3830r6, int i, View view, Activity activity) {
        super(c4101w7, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", c3830r6, i, 62);
        this.f24662j = view;
        this.i = activity;
    }
}
