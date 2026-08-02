package defpackage;

import android.view.View;
import android.widget.TextView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.PlusPanelBuyView;

/* loaded from: classes2.dex */
public final class v6d0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlusPanelBuyView b;
    public final /* synthetic */ int c;

    public /* synthetic */ v6d0(PlusPanelBuyView plusPanelBuyView, int i, int i2) {
        this.a = i2;
        this.b = plusPanelBuyView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        PlusPanelBuyView plusPanelBuyView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = plusPanelBuyView.findViewById(i2);
                    if (findViewById != null) {
                        return (TextView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = plusPanelBuyView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (TextView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            default:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = plusPanelBuyView.findViewById(i2);
                    if (findViewById3 != null) {
                        return (TextView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
        }
    }
}
