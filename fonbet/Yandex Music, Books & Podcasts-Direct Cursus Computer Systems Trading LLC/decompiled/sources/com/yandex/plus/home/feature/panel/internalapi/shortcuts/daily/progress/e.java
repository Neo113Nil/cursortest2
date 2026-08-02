package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress;

import android.view.View;
import com.yandex.plus.bdui.flex.ui.s;
import defpackage.mm6;
import defpackage.pjt;

/* loaded from: classes5.dex */
public final class e implements View.OnLayoutChangeListener {
    public final /* synthetic */ GiftProgressView a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d c;
    public final /* synthetic */ com.yandex.plus.home.feature.panel.internalapi.c d;
    public final /* synthetic */ mm6 e;

    public e(GiftProgressView giftProgressView, boolean z, d dVar, com.yandex.plus.home.feature.panel.internalapi.c cVar, mm6 mm6Var) {
        this.a = giftProgressView;
        this.b = z;
        this.c = dVar;
        this.d = cVar;
        this.e = mm6Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        GiftProgressView giftProgressView = this.a;
        boolean z = this.b;
        giftProgressView.l = z;
        GiftProgressView.p(giftProgressView, this.c);
        if (!z) {
            giftProgressView.invalidate();
            return;
        }
        com.yandex.plus.bdui.flex.ui.a.j(((s) this.d).y(giftProgressView, true), this.e, new pjt(giftProgressView, null, 28));
    }
}
