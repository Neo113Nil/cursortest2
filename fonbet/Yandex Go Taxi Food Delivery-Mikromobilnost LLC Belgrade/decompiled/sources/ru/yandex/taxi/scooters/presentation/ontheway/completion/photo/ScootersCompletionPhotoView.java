package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.scooters.api.analytics.AnalyticsCameraState;
import com.yandex.go.scooters.api.analytics.CameraTappedButton;
import defpackage.a6o0;
import defpackage.ban0;
import defpackage.c06;
import defpackage.cfv;
import defpackage.e230;
import defpackage.f9n0;
import defpackage.fhh;
import defpackage.g8m0;
import defpackage.j6m0;
import defpackage.j9n0;
import defpackage.lq31;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.o9n0;
import defpackage.pfh0;
import defpackage.qrh0;
import defpackage.qu;
import defpackage.r7p0;
import defpackage.rp31;
import defpackage.t1w;
import defpackage.tso0;
import defpackage.w130;
import defpackage.x770;
import defpackage.y1w;
import defpackage.z1w;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001a\u0010\u0016J%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/ScootersCompletionPhotoView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/camera_ui/a;", "scootersCompletionPhotoCameraUiFactory", "Lban0;", "scootersCompletionPhotoViewAnalytics", "La6o0;", "completionType", "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "scootersErrorCode", "Ltso0;", "scootersRidingCompletionInfo", "Lf9n0;", "scootersCompletionPhotoConfig", "Lj9n0;", "scootersCompletionPhotoNavigator", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/camera_ui/a;Lban0;La6o0;Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;Ltso0;Lf9n0;Lj9n0;)V", "Lzy11;", "close", "()V", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lban0;", "Ltso0;", "Lf9n0;", "Lj9n0;", "Landroid/view/ViewGroup;", "cameraUiContainer", "Landroid/view/ViewGroup;", "Ly1w;", "insetsChangeRepository", "Ly1w;", "Lcom/yandex/go/scooters/api/analytics/AnalyticsCameraState;", "getAnalyticsCameraState", "()Lcom/yandex/go/scooters/api/analytics/AnalyticsCameraState;", "analyticsCameraState", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCompletionPhotoView extends SlideableModalView {
    public static final int $stable = 8;
    private final ViewGroup cameraUiContainer;
    private final y1w insetsChangeRepository;
    private final f9n0 scootersCompletionPhotoConfig;
    private final j9n0 scootersCompletionPhotoNavigator;
    private final ban0 scootersCompletionPhotoViewAnalytics;
    private final tso0 scootersRidingCompletionInfo;

    public ScootersCompletionPhotoView(Context context, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.a aVar, ban0 ban0Var, a6o0 a6o0Var, ScootersErrorCode scootersErrorCode, tso0 tso0Var, f9n0 f9n0Var, j9n0 j9n0Var) {
        super(context);
        this.scootersCompletionPhotoViewAnalytics = ban0Var;
        this.scootersRidingCompletionInfo = tso0Var;
        this.scootersCompletionPhotoConfig = f9n0Var;
        this.scootersCompletionPhotoNavigator = j9n0Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.component_fog_light));
        setAnalyticsContext(createAnalyticsContext("ScootersPhotoOfCompletionCard", new LinkedHashSet()));
        c06 a = aVar.a(scootersErrorCode, a6o0Var, new cfv(true), tso0Var, f9n0Var, j9n0Var, new j6m0(25, this));
        GoFrameLayout goFrameLayout = (GoFrameLayout) a.a;
        this.cameraUiContainer = goFrameLayout;
        this.insetsChangeRepository = (z1w) a.b;
        int i = pfh0.camera_view_stub;
        WeakHashMap weakHashMap = b.a;
        c.w((View) rp31.d(this, i), goFrameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(ScootersCompletionPhotoView scootersCompletionPhotoView) {
        scootersCompletionPhotoView.close();
        return zy11.a;
    }

    private final void close() {
        ban0 ban0Var = this.scootersCompletionPhotoViewAnalytics;
        CameraTappedButton cameraTappedButton = CameraTappedButton.EXIT;
        AnalyticsCameraState analyticsCameraState = getAnalyticsCameraState();
        tso0 tso0Var = this.scootersRidingCompletionInfo;
        ban0Var.a(cameraTappedButton, analyticsCameraState, tso0Var.e, tso0Var.a);
        ((o9n0) this.scootersCompletionPhotoNavigator).b.r(new qu(9));
        ban0 ban0Var2 = this.scootersCompletionPhotoViewAnalytics;
        AnalyticsCameraState analyticsCameraState2 = getAnalyticsCameraState();
        tso0 tso0Var2 = this.scootersRidingCompletionInfo;
        r7p0 r7p0Var = tso0Var2.e;
        String str = tso0Var2.a;
        x770 x770Var = ban0Var2.a;
        String str2 = r7p0Var.a;
        String state = analyticsCameraState2.getState();
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", "button");
        if (str != null) {
            hashMap.put("order_id", str);
        }
        if (str2 != null) {
            hashMap.put("scooter_number", str2);
        }
        if (state != null) {
            hashMap.put(ClidProvider.STATE, state);
        }
        x770Var.a.a("ScootersPhotoOfCompletionCard.Closed", hashMap, 1, new HashMap());
    }

    private final AnalyticsCameraState getAnalyticsCameraState() {
        ViewGroup viewGroup = this.cameraUiContainer;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return AnalyticsCameraState.CAMERA;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return null;
            }
            if (childAt.getTag(fhh.n) != null) {
                return AnalyticsCameraState.PERMISSION_REQUEST;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersCompletionPhotoView scootersCompletionPhotoView, t1w t1wVar) {
        z1w z1wVar = (z1w) scootersCompletionPhotoView.insetsChangeRepository;
        z1wVar.b.setValue(z1wVar, z1w.c[0], t1wVar);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return qrh0.scooters_completion_photo_modal_view;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return kotlin.collections.b.l(new Pair("scooter_number", this.scootersRidingCompletionInfo.e), new Pair(ClidProvider.STATE, getAnalyticsCameraState().getState()), new Pair("order_id", this.scootersRidingCompletionInfo.a));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new g8m0(25, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
    }
}
