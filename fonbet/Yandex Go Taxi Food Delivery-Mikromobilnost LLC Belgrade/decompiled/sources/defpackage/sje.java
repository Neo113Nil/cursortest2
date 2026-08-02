package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.c;
import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.ui.UserPhotoUploadingModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class sje implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sje(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((x6f0) ((y6f0) obj)).d(Boolean.valueOf(z));
                break;
            case 1:
                c cVar = (c) obj;
                AutoCompleteTextView autoCompleteTextView = cVar.h;
                if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
                    cVar.d.setImportantForAccessibility(z ? 2 : 1);
                    break;
                }
                break;
            case 2:
                ((RideCardModalView) obj).updateAccessibilityButtons();
                break;
            case 3:
                ((oz40) obj).setValue(Boolean.valueOf(z));
                break;
            case 4:
                ((ScootersCardV2ModalView) obj).onTouchExplorationStateChanged(z);
                break;
            default:
                UserPhotoUploadingModalView.touchExplorationStateChangeListener$lambda$0((UserPhotoUploadingModalView) obj, z);
                break;
        }
    }
}
