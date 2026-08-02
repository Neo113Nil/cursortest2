package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.BadgesView;

/* loaded from: classes2.dex */
public final class zn4 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BadgesView b;
    public final /* synthetic */ int c;

    public /* synthetic */ zn4(BadgesView badgesView, int i, int i2) {
        this.a = i2;
        this.b = badgesView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        BadgesView badgesView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = badgesView.findViewById(i2);
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
                    View findViewById2 = badgesView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (LinearLayout) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            default:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = badgesView.findViewById(i2);
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
