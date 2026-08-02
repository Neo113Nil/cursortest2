package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class g0 implements com.yandex.plus.bdui.ui.a {
    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_progress_view, viewGroup, false);
        inflate.getClass();
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        com.yandex.plus.core.insets.j jVar = com.yandex.plus.core.insets.j.c;
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(jVar, aVar);
        dVar.b(inflate);
        return inflate;
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        return Unit.a;
    }
}
