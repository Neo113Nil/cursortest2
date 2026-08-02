package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Jj implements Lq {
    public final /* synthetic */ C0878ya a;

    public Jj(C0878ya c0878ya) {
        this.a = c0878ya;
    }

    @Override // io.appmetrica.analytics.impl.Lq
    public final void a(List<Go> list) {
        if (Or.a((Collection) list)) {
            return;
        }
        C0878ya c0878ya = this.a;
        int size = list.size();
        C0820wa[] c0820waArr = new C0820wa[size];
        for (int i = 0; i < size; i++) {
            Go go = list.get(i);
            Map map = Di.a;
            C0820wa c0820wa = new C0820wa();
            Integer num = go.a;
            if (num != null) {
                c0820wa.a = num.intValue();
            }
            Integer num2 = go.b;
            if (num2 != null) {
                c0820wa.b = num2.intValue();
            }
            if (!StringUtils.isNullOrEmpty(go.d)) {
                c0820wa.c = go.d;
            }
            c0820wa.d = go.c;
            c0820waArr[i] = c0820wa;
        }
        c0878ya.d = c0820waArr;
    }
}
