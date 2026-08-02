package com.yandex.plus.pay.ui.core.debug.internal.ui.info;

import defpackage.up6;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends up6 {
    public static final a p = new a();

    @Override // defpackage.up6
    public final boolean o(Object obj, Object obj2) {
        return ((Pair) obj).equals((Pair) obj2);
    }

    @Override // defpackage.up6
    public final boolean p(Object obj, Object obj2) {
        return Intrinsics.d(((Pair) obj).a, ((Pair) obj2).a);
    }
}
