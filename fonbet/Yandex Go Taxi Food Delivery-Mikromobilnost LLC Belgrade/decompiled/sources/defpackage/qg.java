package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qg extends AccessibilityDelegateCompat {
    public boolean a;
    public boolean b;

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(true);
        whVar.o(this.a);
        whVar.p("android.widget.CheckBox");
        if (this.b && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (TextUtils.isEmpty(viewGroup.getContentDescription())) {
                List h = vng.h(viewGroup);
                if (h.isEmpty()) {
                    return;
                }
                whVar.t(TextUtils.join(Extension.FIX_SPACE, h));
            }
        }
    }
}
