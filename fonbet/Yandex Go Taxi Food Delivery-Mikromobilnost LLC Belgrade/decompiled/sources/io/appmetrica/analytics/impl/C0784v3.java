package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0784v3 implements Vr {
    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(Object obj) {
        Ir[] irArr = ((Lr) obj).a;
        return (irArr == null || irArr.length == 0) ? new Tr(this, false, "attributes list is empty") : new Tr(this, true, "");
    }
}
