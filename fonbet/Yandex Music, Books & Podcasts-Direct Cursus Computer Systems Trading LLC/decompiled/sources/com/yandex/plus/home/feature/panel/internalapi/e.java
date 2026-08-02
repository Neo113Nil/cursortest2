package com.yandex.plus.home.feature.panel.internalapi;

import android.util.SparseArray;
import android.view.View;
import com.yandex.plus.bdui.flex.ui.s;

/* loaded from: classes5.dex */
public final class e implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ s b;
    public final /* synthetic */ com.yandex.plus.home.common.utils.flow.b c;
    public final /* synthetic */ boolean d;

    public e(View view, s sVar, com.yandex.plus.home.common.utils.flow.b bVar, boolean z) {
        this.a = view;
        this.b = sVar;
        this.c = bVar;
        this.d = z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        s sVar = this.b;
        ((SparseArray) sVar.g).put(view.getId(), this.c);
        s.d(sVar, view);
        s.b(sVar, view);
        SparseArray sparseArray = (SparseArray) sVar.a;
        int id = view.getId();
        boolean z = this.d;
        sparseArray.put(id, new f(sVar, view, z));
        ((SparseArray) sVar.f).put(view.getId(), new g(sVar, view, z));
        s.a(sVar, view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
