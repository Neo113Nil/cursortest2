package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.scooters.api.analytics.AnalyticsCameraState;
import com.yandex.go.scooters.api.analytics.CameraTappedButton;
import defpackage.a60;
import defpackage.e230;
import defpackage.ecn0;
import defpackage.fcn0;
import defpackage.g0c;
import defpackage.gcn0;
import defpackage.i3y;
import defpackage.jho0;
import defpackage.kyh0;
import defpackage.lq31;
import defpackage.mr1;
import defpackage.pav;
import defpackage.pfh0;
import defpackage.ppm0;
import defpackage.qoi0;
import defpackage.qrh0;
import defpackage.r7p0;
import defpackage.rp31;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.uq1;
import defpackage.uqu;
import defpackage.vpa;
import defpackage.w130;
import defpackage.w8v;
import defpackage.wbn0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraSlideableModalView;
import ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraView;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001SBy\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0014¢\u0006\u0004\b#\u0010\u001eJ\u000f\u0010$\u001a\u00020\u000fH\u0014¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u000fH\u0014¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u000fH\u0014¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J%\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010.0-2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010:R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010;R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020 8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/damage/ScootersDamageView;", "Lru/yandex/taxi/scooters/presentation/common/ui/ScootersCameraSlideableModalView;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Luq1;", "alertDialogFactory", "Ljho0;", "photoOfDamageCardAnalytics", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "", "forFeedback", "Lkotlin/Function0;", "Lzy11;", "onUploadImage", "Lr7p0;", "vehicleNumber", "Lkotlin/Function1;", "", "showErrorDialog", "Lru/yandex/taxi/scooters/presentation/ontheway/damage/d;", "scootersDamagePresenter", "<init>", "(Landroid/content/Context;Lpav;Luq1;Ljho0;Ljava/lang/String;ZLsls;Lr7p0;Ltls;Lru/yandex/taxi/scooters/presentation/ontheway/damage/d;)V", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "()V", "onCloseClicked", "", "topTextRes", "()Ljava/lang/Integer;", "onDetachedFromWindow", "onBackPressed", "onArrowClick", "onSlideOut", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Llq31;", "eventType", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lwbn0;", "requireDamageAdapter", "()Lwbn0;", "Lpav;", "Luq1;", "Ljho0;", "Ljava/lang/String;", "Z", "Lsls;", "Lr7p0;", "Ltls;", "Lru/yandex/taxi/scooters/presentation/ontheway/damage/d;", "Lru/yandex/taxi/scooters/presentation/common/ui/ScootersCameraView;", "scootersCameraView$delegate", "Li3y;", "getScootersCameraView", "()Lru/yandex/taxi/scooters/presentation/common/ui/ScootersCameraView;", "scootersCameraView", "Landroid/view/View;", "doneBtn", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/yandex/go/scooters/api/analytics/AnalyticsCameraState;", "analyticsCameraState", "Lcom/yandex/go/scooters/api/analytics/AnalyticsCameraState;", "backPressedListener", "Ljava/lang/Runnable;", "scootersDamageAdapter", "Lwbn0;", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "ru/yandex/taxi/scooters/presentation/ontheway/damage/e", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersDamageView extends ScootersCameraSlideableModalView {
    public static final int $stable = 8;
    private final uq1 alertDialogFactory;
    private AnalyticsCameraState analyticsCameraState;
    private Runnable backPressedListener;
    private final View doneBtn;
    private final boolean forFeedback;
    private final pav imageLoader;
    private final sls onUploadImage;
    private final String orderId;
    private final jho0 photoOfDamageCardAnalytics;
    private final RecyclerView rv;

    /* renamed from: scootersCameraView$delegate, reason: from kotlin metadata */
    private final i3y scootersCameraView;
    private wbn0 scootersDamageAdapter;
    private final d scootersDamagePresenter;
    private final tls showErrorDialog;
    private final r7p0 vehicleNumber;

    public ScootersDamageView(Context context, pav pavVar, uq1 uq1Var, jho0 jho0Var, String str, boolean z, sls slsVar, r7p0 r7p0Var, tls tlsVar, d dVar) {
        super(context);
        this.imageLoader = pavVar;
        this.alertDialogFactory = uq1Var;
        this.photoOfDamageCardAnalytics = jho0Var;
        this.orderId = str;
        this.forFeedback = z;
        this.onUploadImage = slsVar;
        this.vehicleNumber = r7p0Var;
        this.showErrorDialog = tlsVar;
        this.scootersDamagePresenter = dVar;
        this.scootersCameraView = kotlin.a.b(LazyThreadSafetyMode.NONE, new ecn0(this, 0));
        int i = pfh0.done_btn;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.doneBtn = (View) rp31.d(this, i);
        this.rv = (RecyclerView) ((View) rp31.d(this, pfh0.rv));
        this.analyticsCameraState = AnalyticsCameraState.PERMISSION_REQUEST;
        setAnalyticsContext(createAnalyticsContext("ScootersPhotoOfDamageCard", new LinkedHashSet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScootersCameraView getScootersCameraView() {
        return (ScootersCameraView) this.scootersCameraView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersDamageView scootersDamageView, t1w t1wVar) {
        scootersDamageView.getScootersCameraView().setBottomOffset(t1wVar.g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ScootersDamageView scootersDamageView) {
        scootersDamageView.photoOfDamageCardAnalytics.b(CameraTappedButton.EXIT.getButtonName(), scootersDamageView.orderId, scootersDamageView.vehicleNumber.a, scootersDamageView.analyticsCameraState.getState());
        Runnable runnable = scootersDamageView.backPressedListener;
        if (runnable != null) {
            runnable.run();
        }
        scootersDamageView.photoOfDamageCardAnalytics.a(scootersDamageView.orderId, scootersDamageView.vehicleNumber.a, scootersDamageView.analyticsCameraState.getState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(ScootersDamageView scootersDamageView) {
        scootersDamageView.photoOfDamageCardAnalytics.b(CameraTappedButton.GO_TO_SETTINGS.getButtonName(), scootersDamageView.orderId, scootersDamageView.vehicleNumber.a, scootersDamageView.analyticsCameraState.getState());
        ((a60) scootersDamageView.scootersDamagePresenter.x).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$3(ScootersDamageView scootersDamageView, boolean z) {
        scootersDamageView.scootersDamagePresenter.D = z;
        scootersDamageView.photoOfDamageCardAnalytics.b(CameraTappedButton.TORCH.getButtonName(), scootersDamageView.orderId, scootersDamageView.vehicleNumber.a, scootersDamageView.analyticsCameraState.getState());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$4(ScootersDamageView scootersDamageView, w8v w8vVar) {
        d dVar = scootersDamageView.scootersDamagePresenter;
        tje.N(dVar.Jg(), null, null, new ScootersDamagePresenter$takePicture$1(dVar, w8vVar, null), 3);
        scootersDamageView.photoOfDamageCardAnalytics.b(CameraTappedButton.TAKE_PHOTO.getButtonName(), scootersDamageView.orderId, scootersDamageView.vehicleNumber.a, scootersDamageView.analyticsCameraState.getState());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$5(ScootersDamageView scootersDamageView) {
        scootersDamageView.photoOfDamageCardAnalytics.b(CameraTappedButton.DONE.getButtonName(), scootersDamageView.orderId, scootersDamageView.vehicleNumber.a, scootersDamageView.analyticsCameraState.getState());
        scootersDamageView.onUploadImage.invoke();
        scootersDamageView.photoOfDamageCardAnalytics.a(scootersDamageView.orderId, scootersDamageView.vehicleNumber.a, scootersDamageView.analyticsCameraState.getState());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wbn0 requireDamageAdapter() {
        wbn0 wbn0Var = this.scootersDamageAdapter;
        if (wbn0Var != null) {
            return wbn0Var;
        }
        pav pavVar = this.imageLoader;
        boolean z = this.forFeedback;
        ScootersDamageView$requireDamageAdapter$1 scootersDamageView$requireDamageAdapter$1 = new ScootersDamageView$requireDamageAdapter$1(1, this.scootersDamagePresenter, d.class, "removePhoto", "removePhoto(Lru/yandex/taxi/scooters/domain/model/ScooterPhotoWithStatus;)V", 0);
        int i = b.a0;
        g0c a = qoi0.a(ppm0.class);
        wbn0 wbn0Var2 = new wbn0(Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new mr1(pavVar, z, scootersDamageView$requireDamageAdapter$1, 7))));
        this.scootersDamageAdapter = wbn0Var2;
        return wbn0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScootersCameraView scootersCameraView_delegate$lambda$0(ScootersDamageView scootersDamageView) {
        int i = pfh0.camera_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        return (ScootersCameraView) ((View) rp31.d(scootersDamageView, i));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return qrh0.scooters_damage_modal_view;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return kotlin.collections.b.l(new Pair("scooter_number", this.vehicleNumber.a), new Pair(ClidProvider.STATE, this.analyticsCameraState.getState()), new Pair("order_id", this.orderId));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new gcn0(this, 2));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        this.scootersDamagePresenter.dismiss();
        super.onArrowClick();
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraSlideableModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnSlideOutListener(new vpa(23));
        int i = 0;
        getScootersCameraView().setExitListener(new fcn0(this, i));
        int i2 = 1;
        getScootersCameraView().setGoToSettingsListener(new fcn0(this, i2));
        getScootersCameraView().setFlashlightListener(new gcn0(this, i));
        getScootersCameraView().setTakePhotoListener(new gcn0(this, i2));
        ru.yandex.taxi.design.utils.c.z(new ecn0(this, i2), this.doneBtn);
        this.rv.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.rv.setAdapter(requireDamageAdapter());
        this.rv.addItemDecoration(new uqu((int) tje.w(4, getContext())));
        d dVar = this.scootersDamagePresenter;
        dVar.Bg(new e(this));
        dVar.y.b(dVar, new c(dVar));
        tje.N(dVar.Jg(), null, null, new ScootersDamagePresenter$listenToPhotos$1(dVar, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.scootersDamagePresenter.dismiss();
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraSlideableModalView
    public void onCloseClicked() {
        this.photoOfDamageCardAnalytics.b(CameraTappedButton.CLOSE.getButtonName(), this.orderId, this.vehicleNumber.a, this.analyticsCameraState.getState());
        this.scootersDamagePresenter.dismiss();
        this.photoOfDamageCardAnalytics.a(this.orderId, this.vehicleNumber.a, this.analyticsCameraState.getState());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersDamagePresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.scootersDamagePresenter.dismiss();
        super.onSlideOut();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        this.backPressedListener = onBackPressedListener;
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraSlideableModalView
    public Integer topTextRes() {
        return Integer.valueOf(kyh0.scooters_damage_camera_top_hint);
    }
}
