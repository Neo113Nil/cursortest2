package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes9.dex */
public final class zry extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public zry(String str) {
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r3 = r1.alertText;
     */
    @Override // androidx.core.view.AccessibilityDelegateCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        CharSequence charSequence;
        boolean hasError;
        String str;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
                ListItemInputComponent listItemInputComponent = (ListItemInputComponent) obj;
                charSequence = listItemInputComponent.hintText;
                CharSequence charSequence2 = (charSequence == null || evu0.J(charSequence)) ? listItemInputComponent.titleText : listItemInputComponent.hintText;
                hasError = listItemInputComponent.hasError();
                if (hasError && str != null && !evu0.J(str)) {
                    if (charSequence2 == null || evu0.J(charSequence2)) {
                        charSequence2 = str;
                    } else {
                        charSequence2 = ((Object) charSequence2) + Extension.FIX_SPACE + ((Object) str);
                    }
                }
                whVar.x(charSequence2);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.t((String) obj);
                break;
        }
    }

    public zry(ListItemInputComponent listItemInputComponent) {
        this.b = listItemInputComponent;
    }
}
