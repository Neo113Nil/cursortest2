package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AccessibilityDelegateCompat;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes11.dex */
public final class ug extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ug(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        int i = this.a;
        View view2 = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", view2.getResources().getString(kyh0.discovery_accessibility_content_description_button));
                break;
            case 1:
                whVar.F(view2);
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.b(new ph(16, view2.getContext().getResources().getString(mxh0.alice_2_hide_additional_info_content_description)));
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.b(new ph(16, c.G(kyh0.summary_accessibility_open_tariff_details, view2)));
                whVar.p("android.widget.Button");
                if ((view instanceof ViewGroup) && TextUtils.isEmpty(view.getContentDescription())) {
                    List h = vng.h((ViewGroup) view);
                    if (!h.isEmpty()) {
                        whVar.t(TextUtils.join(Extension.FIX_SPACE, h));
                        break;
                    }
                }
                break;
        }
    }
}
