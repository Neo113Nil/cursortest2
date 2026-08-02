package com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation;

import com.yandex.plus.pay.ui.core.debug.internal.ui.form.e;
import com.yandex.plus.plaquesdk.plaque.api.dependencies.d;
import defpackage.js6;
import defpackage.otc;
import defpackage.s9f;
import defpackage.ton;
import defpackage.wp3;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements js6, ton, d {
    public final /* synthetic */ int a;

    public static void c(s9f s9fVar, ClassCastException classCastException) {
        s9fVar.getClass();
        throw new wp3("Invalid view binding (see cause) for " + s9fVar, classCastException);
    }

    public static /* synthetic */ void d(Object obj, Object obj2) {
        throw new NoSuchElementException("Dependencies " + obj + ((Object) " do not exist in ") + obj2 + '!');
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.dependencies.d
    public void a() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // defpackage.ton
    public int b(int i, int i2) {
        switch (this.a) {
        }
        return (i - i2) - 1;
    }

    @Override // defpackage.js6
    public Object h(otc otcVar) {
        otcVar.getClass();
        return new e();
    }
}
