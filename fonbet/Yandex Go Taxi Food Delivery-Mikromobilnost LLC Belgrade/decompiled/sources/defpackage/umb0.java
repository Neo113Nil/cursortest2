package defpackage;

import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$ErrorModalButtonName;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalButtonName;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalCloseReason;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalFeedbackAnswer;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpButtonName;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpCloseReason;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpScreen;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSourceScreen;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$TipAnimation;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes13.dex */
public final class umb0 implements hnb0 {
    public final nhb0 a;
    public final vmb0 b;

    public umb0(nhb0 nhb0Var, vmb0 vmb0Var) {
        this.a = nhb0Var;
        this.b = vmb0Var;
    }

    public final void a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen pickupFromPhotoEntryPointAnalytics$EntryPointScreen) {
        PhotoPickUpAnalytics$PhotoPickUpScreen photoPickUpAnalytics$PhotoPickUpScreen;
        int i = tmb0.a[pickupFromPhotoEntryPointAnalytics$EntryPointScreen.ordinal()];
        if (i == 1) {
            photoPickUpAnalytics$PhotoPickUpScreen = PhotoPickUpAnalytics$PhotoPickUpScreen.Zerosuggest;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            photoPickUpAnalytics$PhotoPickUpScreen = PhotoPickUpAnalytics$PhotoPickUpScreen.Clarify;
        }
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, photoPickUpAnalytics$PhotoPickUpScreen.getEventValue());
        nhb0Var.a.a("PhotoPickUp.EntryButton.Shown", hashMap, 1, new HashMap());
    }

    public final void b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen pickupFromPhotoEntryPointAnalytics$EntryPointScreen) {
        PhotoPickUpAnalytics$PhotoPickUpScreen photoPickUpAnalytics$PhotoPickUpScreen;
        int i = tmb0.a[pickupFromPhotoEntryPointAnalytics$EntryPointScreen.ordinal()];
        if (i == 1) {
            photoPickUpAnalytics$PhotoPickUpScreen = PhotoPickUpAnalytics$PhotoPickUpScreen.Zerosuggest;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            photoPickUpAnalytics$PhotoPickUpScreen = PhotoPickUpAnalytics$PhotoPickUpScreen.Clarify;
        }
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, photoPickUpAnalytics$PhotoPickUpScreen.getEventValue());
        nhb0Var.a.a("PhotoPickUp.EntryButton.Tapped", hashMap, 1, new HashMap());
    }

    public final void c(PhotoPickUpAnalytics$ErrorModalButtonName photoPickUpAnalytics$ErrorModalButtonName) {
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", photoPickUpAnalytics$ErrorModalButtonName.getEventValue());
        nhb0Var.a.a("PhotoPickUp.ErrorModal.Tapped", hashMap, 1, new HashMap());
    }

    public final void d(PhotoPickUpAnalytics$FoundModalCloseReason photoPickUpAnalytics$FoundModalCloseReason) {
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, photoPickUpAnalytics$FoundModalCloseReason.getEventValue());
        nhb0Var.a.a("PhotoPickUp.FoundModal.Closed", hashMap, 1, new HashMap());
    }

    public final void e(PhotoPickUpAnalytics$FoundModalButtonName photoPickUpAnalytics$FoundModalButtonName) {
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", photoPickUpAnalytics$FoundModalButtonName.getEventValue());
        nhb0Var.a.a("PhotoPickUp.FoundModal.Tapped", hashMap, 1, new HashMap());
    }

    public final void f(PhotoPickUpAnalytics$PhotoPickUpCloseReason photoPickUpAnalytics$PhotoPickUpCloseReason) {
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, photoPickUpAnalytics$PhotoPickUpCloseReason.getEventValue());
        nhb0Var.a.a("PhotoPickUp.Closed", hashMap, 1, new HashMap());
    }

    public final void g(PhotoPickUpAnalytics$PhotoPickUpButtonName photoPickUpAnalytics$PhotoPickUpButtonName) {
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", photoPickUpAnalytics$PhotoPickUpButtonName.getEventValue());
        nhb0Var.a.a("PhotoPickUp.Tapped", hashMap, 1, new HashMap());
    }

    public final void h(PhotoPickUpAnalytics$PhotoPickUpSourceScreen photoPickUpAnalytics$PhotoPickUpSourceScreen) {
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source_screen", photoPickUpAnalytics$PhotoPickUpSourceScreen.getEventValue());
        nhb0Var.a.a("PhotoPickUp.Opened", hashMap, 1, new HashMap());
    }

    public final void i(PhotoPickUpAnalytics$FoundModalFeedbackAnswer photoPickUpAnalytics$FoundModalFeedbackAnswer) {
        nhb0 nhb0Var = this.a;
        String str = this.b.a;
        if (str == null) {
            str = "";
        }
        String str2 = this.b.b;
        String str3 = str2 != null ? str2 : "";
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("feedback_answer", photoPickUpAnalytics$FoundModalFeedbackAnswer.getEventValue());
        hashMap.put("trace_id", str);
        nhb0Var.a.a("PhotoPickUp.FoundModal.Feedback", hashMap, 1, tse0.r("task_id", hashMap, str3));
    }

    public final void j(PhotoPickUpAnalytics$TipAnimation photoPickUpAnalytics$TipAnimation) {
        nhb0 nhb0Var = this.a;
        nhb0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", photoPickUpAnalytics$TipAnimation.getEventValue());
        nhb0Var.a.a("PhotoPickUp.TipAnimation.Shown", hashMap, 1, new HashMap());
    }
}
