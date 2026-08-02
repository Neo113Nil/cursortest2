package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.internal.ui.bouncer.roundabout.items.g0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.h0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.i0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.j0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class l implements Function1 {
    public static final l b = new l(0);
    public static final l c = new l(1);
    public static final l d = new l(2);
    public static final l e = new l(3);
    public static final l f = new l(4);
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof g0);
            case 1:
                return Boolean.valueOf(obj instanceof com.yandex.passport.internal.ui.bouncer.roundabout.items.e0);
            case 2:
                return Boolean.valueOf(obj instanceof j0);
            case 3:
                return Boolean.valueOf(obj instanceof h0);
            default:
                return Boolean.valueOf(obj instanceof i0);
        }
    }
}
