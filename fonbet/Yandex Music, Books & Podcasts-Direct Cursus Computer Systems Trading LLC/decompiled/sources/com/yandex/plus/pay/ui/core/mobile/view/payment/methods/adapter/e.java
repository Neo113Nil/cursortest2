package com.yandex.plus.pay.ui.core.mobile.view.payment.methods.adapter;

import defpackage.up6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends up6 {
    public static final e p = new e();

    @Override // defpackage.up6
    public final boolean o(Object obj, Object obj2) {
        return ((d) obj).equals((d) obj2);
    }

    @Override // defpackage.up6
    public final boolean p(Object obj, Object obj2) {
        return Intrinsics.d(((d) obj).getId(), ((d) obj2).getId());
    }
}
