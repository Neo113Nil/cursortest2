package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.push.impl.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1027f implements v2 {
    public final v2[] a;
    public final String b;

    public C1027f(v2... v2VarArr) {
        this.a = v2VarArr;
        StringBuilder sb = new StringBuilder("ALL");
        ArrayList arrayList = new ArrayList(v2VarArr.length);
        for (v2 v2Var : v2VarArr) {
            arrayList.add(v2Var.a());
        }
        sb.append(arrayList);
        this.b = sb.toString();
    }

    @Override // io.appmetrica.analytics.push.impl.v2
    public final boolean a(u2 u2Var) {
        for (v2 v2Var : this.a) {
            boolean a = v2Var.a(u2Var);
            PublicLogger.INSTANCE.info(v2Var.a() + " provider: " + u2Var.a + ", shouldSend: " + a, new Object[0]);
            if (!a) {
                return false;
            }
        }
        return true;
    }

    @Override // io.appmetrica.analytics.push.impl.v2
    public final String a() {
        return this.b;
    }
}
