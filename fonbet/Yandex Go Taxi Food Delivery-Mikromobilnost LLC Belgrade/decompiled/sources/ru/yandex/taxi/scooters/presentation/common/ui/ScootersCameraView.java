package ru.yandex.taxi.scooters.presentation.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ar7;
import defpackage.co7;
import defpackage.er7;
import defpackage.i5f0;
import defpackage.jl40;
import defpackage.k7h0;
import defpackage.kf61;
import defpackage.kyh0;
import defpackage.l1b1;
import defpackage.ndh0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ody;
import defpackage.qp7;
import defpackage.rp31;
import defpackage.tls;
import defpackage.vjh0;
import defpackage.w8v;
import defpackage.x3n0;
import defpackage.xs7;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0017J\u001c\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0087@¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u0017J\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u0017J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u0017J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u0017J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u0017J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0017J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u001bR\"\u00104\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010/\u001a\u0004\b;\u00101\"\u0004\b<\u0010\u001bR\u0017\u0010>\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010b¨\u0006d"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/ScootersCameraView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljava/lang/Runnable;", "listener", "Lzy11;", "setExitListener", "(Ljava/lang/Runnable;)V", "setGoToSettingsListener", "Lkotlin/Function1;", "", "setFlashlightListener", "(Ltls;)V", "Lw8v;", "setTakePhotoListener", "hidePermissionGroup", "()V", "showPhotoButtonsGroup", BackendConfig.Restrictions.ENABLED, "setFlashlightEnabled", "(Z)V", "hidePhotoButtonsGroup", "showPermissionNotGranted", "imageQuality", "startCamera", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enableShotButton", "disableShotButton", "stopCamera", "releaseCamera", "offsetPx", "setBottomOffset", "(I)V", "setFlashlightAccessibilityStateDescription", "showPermissionGroup", "Lco7;", "camera", "setMinimumZoom", "(Lco7;)V", "withFlashLight", "Z", "getWithFlashLight", "()Z", "setWithFlashLight", "Lxs7;", "cameraSelector", "Lxs7;", "getCameraSelector", "()Lxs7;", "setCameraSelector", "(Lxs7;)V", "useBackWideAngleLens", "getUseBackWideAngleLens", "setUseBackWideAngleLens", "Lru/yandex/taxi/camera/CameraPreview;", "cameraPreview", "Lru/yandex/taxi/camera/CameraPreview;", "getCameraPreview", "()Lru/yandex/taxi/camera/CameraPreview;", "Lru/yandex/taxi/widget/RobotoTextView;", "permissionTitle", "Lru/yandex/taxi/widget/RobotoTextView;", "permissionSubtitle", "Lru/yandex/taxi/design/ButtonComponent;", "exitBtn", "Lru/yandex/taxi/design/ButtonComponent;", "goToSettingsBtn", "Landroidx/constraintlayout/widget/Group;", "additionalPhotoButtonsGroup", "Landroidx/constraintlayout/widget/Group;", "Landroid/view/View;", "flashlightBtn", "Landroid/view/View;", "takePhotoBtn", "Landroidx/constraintlayout/widget/Guideline;", "bottomOffsetGuideline", "Landroidx/constraintlayout/widget/Guideline;", "Ler7;", "cameraLifecycleOwner", "Ler7;", "Lnoh;", "Li5f0;", "cameraProviderDeferred", "Lnoh;", "processCameraProvider", "Li5f0;", "Lco7;", "imageCapture", "Lw8v;", "", "flashlightEnableStateDescription", "Ljava/lang/String;", "flashlightDisableStateDescription", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCameraView extends ConstraintLayout {
    public static final int $stable = 8;
    private final Group additionalPhotoButtonsGroup;
    private final Guideline bottomOffsetGuideline;
    private co7 camera;
    private final er7 cameraLifecycleOwner;
    private final CameraPreview cameraPreview;
    private final noh cameraProviderDeferred;
    private xs7 cameraSelector;
    private final ButtonComponent exitBtn;
    private final View flashlightBtn;
    private final String flashlightDisableStateDescription;
    private final String flashlightEnableStateDescription;
    private final ButtonComponent goToSettingsBtn;
    private w8v imageCapture;
    private final RobotoTextView permissionSubtitle;
    private final RobotoTextView permissionTitle;
    private i5f0 processCameraProvider;
    private final View takePhotoBtn;
    private boolean useBackWideAngleLens;
    private boolean withFlashLight;

    public ScootersCameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c.q(this, vjh0.scooters_camera_view, true);
        this.withFlashLight = true;
        this.cameraSelector = xs7.c;
        int i2 = k7h0.camera_preview;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.cameraPreview = (CameraPreview) ((View) rp31.d(this, i2));
        this.permissionTitle = (RobotoTextView) ((View) rp31.d(this, k7h0.permission_title));
        this.permissionSubtitle = (RobotoTextView) ((View) rp31.d(this, k7h0.permission_subtitle));
        this.exitBtn = (ButtonComponent) ((View) rp31.d(this, ndh0.close));
        this.goToSettingsBtn = (ButtonComponent) ((View) rp31.d(this, k7h0.go_to_settings));
        this.additionalPhotoButtonsGroup = (Group) ((View) rp31.d(this, k7h0.photo_buttons_group));
        this.flashlightBtn = (View) rp31.d(this, k7h0.flash_light_btn);
        this.takePhotoBtn = (View) rp31.d(this, k7h0.take_photo_btn);
        this.bottomOffsetGuideline = (Guideline) ((View) rp31.d(this, k7h0.bottom_offset_guideline));
        this.cameraLifecycleOwner = new er7();
        this.cameraProviderDeferred = ru.yandex.taxi.camera.ml.a.b(context);
        this.flashlightEnableStateDescription = getContext().getString(kyh0.flashlight_enable);
        this.flashlightDisableStateDescription = getContext().getString(kyh0.flashlight_disable);
        setFlashlightAccessibilityStateDescription();
    }

    private final void setFlashlightAccessibilityStateDescription() {
        View view = this.flashlightBtn;
        androidx.core.view.b.t(view, view.isSelected() ? this.flashlightDisableStateDescription : this.flashlightEnableStateDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setFlashlightListener$lambda$0(ScootersCameraView scootersCameraView, tls tlsVar) {
        boolean z = !scootersCameraView.flashlightBtn.isSelected();
        scootersCameraView.setFlashlightEnabled(z);
        tlsVar.invoke(Boolean.valueOf(z));
        return zy11.a;
    }

    private final void setMinimumZoom(co7 camera) {
        kf61 kf61Var = (kf61) camera.c().k().d();
        if (kf61Var != null) {
            camera.b().d(kf61Var.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setTakePhotoListener$lambda$0(ScootersCameraView scootersCameraView, tls tlsVar) {
        w8v w8vVar = scootersCameraView.imageCapture;
        zy11 zy11Var = zy11.a;
        if (w8vVar == null) {
            return zy11Var;
        }
        tlsVar.invoke(w8vVar);
        return zy11Var;
    }

    private final void showPermissionGroup() {
        this.permissionTitle.setVisibility(0);
        this.permissionSubtitle.setVisibility(0);
        this.exitBtn.setVisibility(0);
        this.goToSettingsBtn.setVisibility(0);
    }

    public static /* synthetic */ Object startCamera$default(ScootersCameraView scootersCameraView, Integer num, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return scootersCameraView.startCamera(num, continuation);
    }

    public final void disableShotButton() {
        this.takePhotoBtn.setEnabled(false);
    }

    public final void enableShotButton() {
        this.takePhotoBtn.setEnabled(true);
    }

    public final CameraPreview getCameraPreview() {
        return this.cameraPreview;
    }

    public final xs7 getCameraSelector() {
        return this.cameraSelector;
    }

    public final boolean getUseBackWideAngleLens() {
        return this.useBackWideAngleLens;
    }

    public final boolean getWithFlashLight() {
        return this.withFlashLight;
    }

    public final void hidePermissionGroup() {
        this.permissionTitle.setVisibility(8);
        this.permissionSubtitle.setVisibility(8);
        this.exitBtn.setVisibility(8);
        this.goToSettingsBtn.setVisibility(8);
    }

    public final void hidePhotoButtonsGroup() {
        this.additionalPhotoButtonsGroup.setVisibility(8);
        this.flashlightBtn.setVisibility(8);
        this.takePhotoBtn.setVisibility(8);
    }

    public final void releaseCamera() {
        qp7 b;
        co7 co7Var = this.camera;
        if (co7Var != null && (b = co7Var.b()) != null) {
            b.f(false);
        }
        this.cameraLifecycleOwner.a();
        this.cameraPreview.detachPreview();
        i5f0 i5f0Var = this.processCameraProvider;
        if (i5f0Var != null) {
            i5f0Var.g();
        }
    }

    public final void setBottomOffset(int offsetPx) {
        this.bottomOffsetGuideline.setGuidelineEnd(offsetPx);
    }

    public final void setCameraSelector(xs7 xs7Var) {
        this.cameraSelector = xs7Var;
    }

    public final void setExitListener(Runnable listener) {
        this.exitBtn.setDebounceClickListener(listener);
    }

    public final void setFlashlightEnabled(boolean enabled) {
        qp7 b;
        this.flashlightBtn.setSelected(enabled);
        setFlashlightAccessibilityStateDescription();
        co7 co7Var = this.camera;
        if (co7Var == null || (b = co7Var.b()) == null) {
            return;
        }
        b.f(enabled);
    }

    public final void setFlashlightListener(tls listener) {
        c.z(new x3n0(this, listener, 0), this.flashlightBtn);
    }

    public final void setGoToSettingsListener(Runnable listener) {
        this.goToSettingsBtn.setDebounceClickListener(listener);
    }

    public final void setTakePhotoListener(tls listener) {
        c.z(new x3n0(this, listener, 1), this.takePhotoBtn);
    }

    public final void setUseBackWideAngleLens(boolean z) {
        this.useBackWideAngleLens = z;
    }

    public final void setWithFlashLight(boolean z) {
        this.withFlashLight = z;
    }

    public final void showPermissionNotGranted() {
        showPermissionGroup();
        hidePhotoButtonsGroup();
    }

    public final void showPhotoButtonsGroup() {
        co7 co7Var;
        ar7 c;
        this.takePhotoBtn.setVisibility(0);
        this.additionalPhotoButtonsGroup.setVisibility(0);
        this.flashlightBtn.setVisibility((!this.withFlashLight || (co7Var = this.camera) == null || (c = co7Var.c()) == null || !c.p()) ? 8 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startCamera(Integer num, Continuation<? super zy11> continuation) {
        ScootersCameraView$startCamera$1 scootersCameraView$startCamera$1;
        int i;
        w8v w8vVar;
        int i2;
        xs7 xs7Var;
        ody d;
        if (continuation instanceof ScootersCameraView$startCamera$1) {
            scootersCameraView$startCamera$1 = (ScootersCameraView$startCamera$1) continuation;
            int i3 = scootersCameraView$startCamera$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersCameraView$startCamera$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersCameraView$startCamera$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCameraView$startCamera$1.label;
                ody odyVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i4 = 0;
                    this.cameraPreview.setVisibility(0);
                    hidePermissionGroup();
                    this.cameraLifecycleOwner.b();
                    if (jl40.l(this.cameraSelector, xs7.c) && this.useBackWideAngleLens) {
                        i4 = 1;
                    }
                    w8v a = ru.yandex.taxi.camera.ml.a.a(ru.yandex.taxi.camera.ml.a.c(new Size(getWidth(), getHeight())), num);
                    this.imageCapture = a;
                    noh nohVar = this.cameraProviderDeferred;
                    scootersCameraView$startCamera$1.L$0 = null;
                    scootersCameraView$startCamera$1.L$1 = a;
                    scootersCameraView$startCamera$1.I$0 = i4;
                    scootersCameraView$startCamera$1.label = 1;
                    obj = nohVar.k(scootersCameraView$startCamera$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    w8vVar = a;
                    i2 = i4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = scootersCameraView$startCamera$1.I$0;
                    w8vVar = (w8v) scootersCameraView$startCamera$1.L$1;
                    kotlin.b.b(obj);
                }
                i5f0 i5f0Var = (i5f0) obj;
                this.processCameraProvider = i5f0Var;
                if (i2 == 0) {
                    xs7Var = l1b1.b(i5f0Var);
                    if (xs7Var == null) {
                        xs7Var = this.cameraSelector;
                    }
                } else {
                    xs7Var = this.cameraSelector;
                }
                d = ru.yandex.taxi.camera.ml.a.d(i5f0Var, this.cameraLifecycleOwner, xs7Var, this.cameraPreview, w8vVar);
                if (d != null) {
                    if (i2 != 0) {
                        setMinimumZoom(d);
                    }
                    odyVar = d;
                }
                this.camera = odyVar;
                showPhotoButtonsGroup();
                return zy11.a;
            }
        }
        scootersCameraView$startCamera$1 = new ScootersCameraView$startCamera$1(this, continuation);
        Object obj2 = scootersCameraView$startCamera$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCameraView$startCamera$1.label;
        ody odyVar2 = null;
        if (i != 0) {
        }
        i5f0 i5f0Var2 = (i5f0) obj2;
        this.processCameraProvider = i5f0Var2;
        if (i2 == 0) {
        }
        d = ru.yandex.taxi.camera.ml.a.d(i5f0Var2, this.cameraLifecycleOwner, xs7Var, this.cameraPreview, w8vVar);
        if (d != null) {
        }
        this.camera = odyVar2;
        showPhotoButtonsGroup();
        return zy11.a;
    }

    public final void stopCamera() {
        qp7 b;
        co7 co7Var = this.camera;
        if (co7Var != null && (b = co7Var.b()) != null) {
            b.f(false);
        }
        this.cameraLifecycleOwner.c();
        i5f0 i5f0Var = this.processCameraProvider;
        if (i5f0Var != null) {
            i5f0Var.g();
        }
    }

    public ScootersCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersCameraView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScootersCameraView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
