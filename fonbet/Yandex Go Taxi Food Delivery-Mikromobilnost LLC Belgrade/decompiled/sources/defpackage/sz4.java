package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes6.dex */
public final class sz4 extends cdj {
    public final /* synthetic */ BaseDialog a;

    public sz4(BaseDialog baseDialog) {
        this.a = baseDialog;
    }

    @Override // defpackage.cdj
    public final void a() {
        this.a.dismiss();
    }

    @Override // defpackage.cdj
    public final boolean b() {
        boolean z;
        z = this.a.cancelableOnTouchOutside;
        return z;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        String str;
        String str2;
        if (super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent)) {
            return true;
        }
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText().clear();
            return false;
        }
        accessibilityEvent.getText().clear();
        BaseDialog baseDialog = this.a;
        str = baseDialog.titleContentDescription;
        str2 = baseDialog.messageContentDescription;
        if (str != null && !evu0.J(str) && str2 != null && !evu0.J(str2)) {
            accessibilityEvent.getText().add(str + Extension.FIX_SPACE + str2);
            return false;
        }
        if (str != null && !evu0.J(str)) {
            accessibilityEvent.getText().add(str);
            return false;
        }
        if (str2 != null && !evu0.J(str2)) {
            accessibilityEvent.getText().add(str2);
        }
        return false;
    }
}
