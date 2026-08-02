package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di;

import android.content.Context;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class h implements com.yandex.plus.pay.ui.core.api.common.a {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // com.yandex.plus.pay.ui.core.api.common.a
    public final String a(int i, Object... objArr) {
        i iVar = this.a;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar = iVar.o;
        Context a = iVar.a().a();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.getClass();
        String string = a.getString(((com.yandex.plus.resources.core.c) aVar.b).a(i), Arrays.copyOf(copyOf, copyOf.length));
        string.getClass();
        return string;
    }

    @Override // com.yandex.plus.pay.ui.core.api.common.a
    public final String get(int i) {
        i iVar = this.a;
        com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar = iVar.o;
        Context a = iVar.a().a();
        a.getClass();
        String string = a.getString(((com.yandex.plus.resources.core.c) aVar.b).a(i));
        string.getClass();
        return string;
    }
}
