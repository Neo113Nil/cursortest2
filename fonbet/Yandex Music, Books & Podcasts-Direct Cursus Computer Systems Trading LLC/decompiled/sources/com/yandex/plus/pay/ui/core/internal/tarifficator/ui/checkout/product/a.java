package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product;

import defpackage.up6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends up6 {
    public static final a q = new a(0);
    public static final a r = new a(1);
    public final /* synthetic */ int p;

    public /* synthetic */ a(int i) {
        this.p = i;
    }

    @Override // defpackage.up6
    public final boolean o(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                return ((CharSequence) obj).equals((CharSequence) obj2);
            default:
                return ((c) obj).equals((c) obj2);
        }
    }

    @Override // defpackage.up6
    public final boolean p(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                return ((CharSequence) obj).equals((CharSequence) obj2);
            default:
                return Intrinsics.d(((c) obj).a, ((c) obj2).a);
        }
    }
}
