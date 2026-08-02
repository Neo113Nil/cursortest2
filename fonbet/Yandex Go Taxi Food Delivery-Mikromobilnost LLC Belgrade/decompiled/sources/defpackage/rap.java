package defpackage;

import android.view.View;
import android.widget.Button;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class rap implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FamilyFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ rap(FamilyFragment familyFragment, int i, int i2) {
        this.a = i2;
        this.b = familyFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        FamilyFragment familyFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = familyFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (PlusPayToolbarView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = familyFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = familyFragment.requireView().findViewById(i2);
                    if (findViewById3 != null) {
                        return (WebViewContainer) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            default:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = familyFragment.requireView().findViewById(i2);
                    if (findViewById4 != null) {
                        return (Button) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
        }
    }
}
