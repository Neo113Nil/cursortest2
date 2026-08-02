package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;

/* loaded from: classes9.dex */
public abstract class H0 implements PushFilter {
    public final Q1 a;

    public H0(Q1 q1) {
        this.a = q1;
    }

    public static PushFilter[] a(Context context, r rVar) {
        return new PushFilter[]{new K2(context), new C1031g(), new I1(rVar.f()), new o2(rVar.f()), new E1(rVar), new C1017c1(new I0()), new S1(rVar.f()), new J(rVar.f()), new C1037h1(rVar), new s2()};
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        return this.a.filter(pushMessage);
    }

    public final void a(PushFilter... pushFilterArr) {
        for (PushFilter pushFilter : pushFilterArr) {
            this.a.a.add(pushFilter);
        }
    }
}
