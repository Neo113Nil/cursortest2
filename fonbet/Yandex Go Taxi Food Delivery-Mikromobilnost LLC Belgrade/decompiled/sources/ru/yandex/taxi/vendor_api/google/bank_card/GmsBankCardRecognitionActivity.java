package ru.yandex.taxi.vendor_api.google.bank_card;

import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b;
import com.adjust.sdk.Constants;
import defpackage.co7;
import defpackage.eja1;
import defpackage.hsh0;
import defpackage.igh0;
import defpackage.kyh0;
import defpackage.mdh;
import defpackage.ndh0;
import defpackage.qke;
import defpackage.qp7;
import defpackage.s1r;
import defpackage.sjh;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tkt;
import defpackage.uyj;
import defpackage.w9f;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.camera.ml.c;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lru/yandex/taxi/vendor_api/google/bank_card/GmsBankCardRecognitionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lw9f;", "cardData", "Lzy11;", "complete", "(Lw9f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initWindow", "setFlashlightAccessibilityStateDescription", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onStop", "onPause", "onDestroy", "onBackPressed", "Lru/yandex/taxi/camera/ml/c;", "mlCameraController", "Lru/yandex/taxi/camera/ml/c;", "Lco7;", "camera", "Lco7;", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "btnFlashLight", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "", "flashlightEnableStateDescription", "Ljava/lang/String;", "flashlightDisableStateDescription", "Companion", "tkt", Constants.REFERRER_API_GOOGLE}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GmsBankCardRecognitionActivity extends AppCompatActivity {
    public static final tkt Companion = new tkt();
    public static final String EXTRA_EXPIRY_MONTH = "ru.yandex.taxi.bcr.gms.EXPIRY_MONTH";
    public static final String EXTRA_EXPIRY_YEAR = "ru.yandex.taxi.bcr.gms.EXPIRY_YEAR";
    public static final String EXTRA_PAN = "ru.yandex.taxi.bcr.gms.PAN";
    public static final int RESULT_INSUFFICIENT_PERMISSIONS = 19773;
    private CircleButtonImageView btnFlashLight;
    private co7 camera;
    private c mlCameraController;
    private String flashlightEnableStateDescription = "";
    private String flashlightDisableStateDescription = "";

    /* JADX INFO: Access modifiers changed from: private */
    public final Object complete(w9f w9fVar, Continuation<? super zy11> continuation) {
        setResult(-1, new Intent().putExtra(EXTRA_PAN, w9fVar.a).putExtra(EXTRA_EXPIRY_MONTH, w9fVar.b).putExtra(EXTRA_EXPIRY_YEAR, w9fVar.c));
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new GmsBankCardRecognitionActivity$complete$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    private final void initWindow() {
        getWindow().getDecorView().setSystemUiVisibility(HProv.ALG_TYPE_BLOCK);
        getWindow().setBackgroundDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$0(GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity, t1w t1wVar) {
        CircleButtonImageView circleButtonImageView = gmsBankCardRecognitionActivity.btnFlashLight;
        if (circleButtonImageView == null) {
            circleButtonImageView = null;
        }
        xw31.E(circleButtonImageView, null, null, null, Integer.valueOf(xw31.g(circleButtonImageView).bottomMargin + t1wVar.g));
        View findViewById = gmsBankCardRecognitionActivity.findViewById(ndh0.back);
        xw31.E(findViewById, null, Integer.valueOf(xw31.g(findViewById).topMargin + t1wVar.b), null, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFlashlightAccessibilityStateDescription() {
        CircleButtonImageView circleButtonImageView = this.btnFlashLight;
        CircleButtonImageView circleButtonImageView2 = circleButtonImageView == null ? null : circleButtonImageView;
        if (circleButtonImageView == null) {
            circleButtonImageView = null;
        }
        b.t(circleButtonImageView2, circleButtonImageView.isSelected() ? this.flashlightDisableStateDescription : this.flashlightEnableStateDescription);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (qke.h(this, "android.permission.CAMERA") != 0) {
            setResult(RESULT_INSUFFICIENT_PERMISSIONS);
            finish();
            return;
        }
        initWindow();
        setContentView(hsh0.gms_bank_card_recognition_layout);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(igh0.gms_bank_card_view);
        this.btnFlashLight = (CircleButtonImageView) findViewById(igh0.flashlight_button);
        this.flashlightEnableStateDescription = getResources().getString(kyh0.flashlight_enable);
        this.flashlightDisableStateDescription = getResources().getString(kyh0.flashlight_disable);
        setFlashlightAccessibilityStateDescription();
        tje.i(constraintLayout, 80, new s1r(26, this));
        com.yandex.go.coroutines.b.g(eja1.s(this), null, null, new GmsBankCardRecognitionActivity$onCreate$2(this, this, null), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.mlCameraController;
        if (cVar != null) {
            cVar.a();
        }
        this.mlCameraController = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        CircleButtonImageView circleButtonImageView = this.btnFlashLight;
        if (circleButtonImageView == null) {
            circleButtonImageView = null;
        }
        circleButtonImageView.setSelected(false);
        co7 co7Var = this.camera;
        if (co7Var == null) {
            co7Var = null;
        }
        qp7 b = co7Var.b();
        CircleButtonImageView circleButtonImageView2 = this.btnFlashLight;
        b.f((circleButtonImageView2 != null ? circleButtonImageView2 : null).isSelected());
        c cVar = this.mlCameraController;
        if (cVar != null) {
            cVar.f.c();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c cVar = this.mlCameraController;
        if (cVar != null) {
            cVar.b(new Size(720, 1280));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getWindow().setFlags(8192, 8192);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getWindow().setFlags(0, 8192);
    }
}
