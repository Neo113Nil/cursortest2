package com.yandex.plus.pay.ui.core.debug.internal.ui.log;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class g implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ g(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
        }
        return this.b.getViewLifecycleOwner().getLifecycle();
    }
}
