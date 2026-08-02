package com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class c implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ com.yandex.plus.core.theme.c c;

    public /* synthetic */ c(f fVar, com.yandex.plus.core.theme.c cVar, int i) {
        this.a = i;
        this.b = fVar;
        this.c = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                f fVar = this.b;
                TextView textView = fVar.t;
                if (textView != null) {
                    com.yandex.plus.bdui.flex.ui.a.D(textView, this.c, new com.yandex.plus.home.dailyquests.feature.internal.utils.a(3, textView, fVar));
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                TextView textView2 = this.b.s;
                if (textView2 != null) {
                    com.yandex.plus.bdui.flex.ui.a.D(textView2, this.c, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
                    break;
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                TextView textView3 = this.b.q;
                if (textView3 != null) {
                    com.yandex.plus.bdui.flex.ui.a.D(textView3, this.c, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
                    break;
                }
                break;
        }
    }
}
