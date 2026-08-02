package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout;

import defpackage.up6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends up6 {
    public static final k q = new k(0);
    public static final k r = new k(1);
    public final /* synthetic */ int p;

    public /* synthetic */ k(int i) {
        this.p = i;
    }

    @Override // defpackage.up6
    public final boolean o(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                CharSequence charSequence = ((b) obj).b;
                CharSequence charSequence2 = ((b) obj2).b;
                boolean z = charSequence instanceof String;
                if (z && charSequence2 != null) {
                    return ((String) charSequence).contentEquals(charSequence2);
                }
                if (z && (charSequence2 instanceof String)) {
                    return charSequence.equals(charSequence2);
                }
                if (charSequence != charSequence2) {
                    if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
                        int length = charSequence.length();
                        for (int i = 0; i < length; i++) {
                            if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                            }
                        }
                    }
                    return false;
                }
                return true;
            default:
                return ((e) obj).equals((e) obj2);
        }
    }

    @Override // defpackage.up6
    public final boolean p(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                return ((b) obj).a == ((b) obj2).a;
            default:
                return Intrinsics.d(((e) obj).a, ((e) obj2).a);
        }
    }
}
