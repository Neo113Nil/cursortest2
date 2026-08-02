package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di;

import android.content.Context;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class h implements com.yandex.plus.pay.ui.core.api.common.a {
    public final /* synthetic */ com.yandex.plus.home.plaque.plugin.internal.proxy.a a;
    public final /* synthetic */ i b;

    public h(com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, i iVar) {
        this.a = aVar;
        this.b = iVar;
    }

    @Override // com.yandex.plus.pay.ui.core.api.common.a
    public final String a(int i, Object... objArr) {
        Context a = ((com.yandex.plus.pay.ui.common.api.a) this.b.t.getValue()).a();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.getClass();
        String string = a.getString(((com.yandex.plus.resources.core.c) this.a.b).a(i), Arrays.copyOf(copyOf, copyOf.length));
        string.getClass();
        return string;
    }

    @Override // com.yandex.plus.pay.ui.core.api.common.a
    public final String get(int i) {
        Context a = ((com.yandex.plus.pay.ui.common.api.a) this.b.t.getValue()).a();
        a.getClass();
        String string = a.getString(((com.yandex.plus.resources.core.c) this.a.b).a(i));
        string.getClass();
        return string;
    }
}
