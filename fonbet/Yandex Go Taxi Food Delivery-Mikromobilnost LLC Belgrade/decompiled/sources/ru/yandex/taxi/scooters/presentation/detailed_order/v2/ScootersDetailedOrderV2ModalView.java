package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.a4n0;
import defpackage.a60;
import defpackage.afn0;
import defpackage.agn0;
import defpackage.ah00;
import defpackage.ahn0;
import defpackage.bfn0;
import defpackage.bhn0;
import defpackage.boo0;
import defpackage.c0n0;
import defpackage.c4p0;
import defpackage.cfn0;
import defpackage.chn0;
import defpackage.cma1;
import defpackage.d5n0;
import defpackage.dew;
import defpackage.dfn0;
import defpackage.dhn0;
import defpackage.e230;
import defpackage.e4n0;
import defpackage.e7p0;
import defpackage.ea90;
import defpackage.ean0;
import defpackage.efn0;
import defpackage.ehn0;
import defpackage.ffn0;
import defpackage.fgn0;
import defpackage.fhn0;
import defpackage.fva0;
import defpackage.g641;
import defpackage.g8n0;
import defpackage.gfn0;
import defpackage.gh00;
import defpackage.ghn0;
import defpackage.hfn0;
import defpackage.hhn0;
import defpackage.ho4;
import defpackage.ifn0;
import defpackage.ihn0;
import defpackage.jfn0;
import defpackage.k7x0;
import defpackage.kfn0;
import defpackage.kyh0;
import defpackage.lhn0;
import defpackage.lrj0;
import defpackage.m950;
import defpackage.mqg0;
import defpackage.msg0;
import defpackage.mth;
import defpackage.mw0;
import defpackage.nhn0;
import defpackage.nso0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pfh0;
import defpackage.pfn0;
import defpackage.pxm0;
import defpackage.pzt0;
import defpackage.q7p0;
import defpackage.qje;
import defpackage.qrh0;
import defpackage.qwo0;
import defpackage.shn0;
import defpackage.sls;
import defpackage.sy60;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.uen0;
import defpackage.v1n0;
import defpackage.v770;
import defpackage.ven0;
import defpackage.vng;
import defpackage.vpa;
import defpackage.vxm0;
import defpackage.w130;
import defpackage.w511;
import defpackage.wen0;
import defpackage.wnj;
import defpackage.wro0;
import defpackage.x770;
import defpackage.xen0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y50;
import defpackage.yen0;
import defpackage.yfn0;
import defpackage.yln;
import defpackage.z7n0;
import defpackage.zen0;
import defpackage.zfn0;
import defpackage.zno0;
import defpackage.zuo0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.domain.model.ScootersDetailedOrderOneShotAction;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.ScootersDetailedOrderAnalytics$CloseReason;
import ru.yandex.taxi.scooters.presentation.detailed_order.ScootersDetailedOrderAnalytics$RideDetailsButton;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;
import ru.yandex.taxi.scooters.presentation.ontheway.f;
import ru.yandex.taxi.scooters.presentation.route_navigation.route_summary.ScootersRouteSummaryView;
import ru.yandex.taxi.scooters.utils.ScootersCompassRotatableFloatButton;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersSupportButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoButtonIconComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005*\u0002§\u0001\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002ª\u0001Bµ\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%\u0012\b\b\u0001\u0010(\u001a\u00020'\u0012\b\b\u0001\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b.\u0010/J\u001d\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0014¢\u0006\u0004\b4\u00105J\u001f\u0010:\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000203H\u0014¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u0002032\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0014¢\u0006\u0004\bC\u0010DJ\u001f\u0010H\u001a\u0002032\u0006\u0010E\u001a\u00020B2\u0006\u0010G\u001a\u00020FH\u0014¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u0002032\u0006\u0010K\u001a\u00020JH\u0014¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u0002032\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020F2\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u000203H\u0015¢\u0006\u0004\bV\u0010=J\u000f\u0010W\u001a\u000203H\u0015¢\u0006\u0004\bW\u0010=J\u000f\u0010X\u001a\u00020FH\u0014¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020FH\u0014¢\u0006\u0004\bZ\u0010YJ\u000f\u0010[\u001a\u000203H\u0014¢\u0006\u0004\b[\u0010=J\u000f\u0010\\\u001a\u000203H\u0002¢\u0006\u0004\b\\\u0010=J\u001f\u0010a\u001a\u0002032\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ'\u0010f\u001a\u0002032\u0006\u0010d\u001a\u00020c2\u0006\u0010^\u001a\u00020]2\u0006\u0010e\u001a\u00020FH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u000203H\u0002¢\u0006\u0004\bh\u0010=J\u000f\u0010i\u001a\u000203H\u0002¢\u0006\u0004\bi\u0010=J\u0017\u0010k\u001a\u0002032\u0006\u0010`\u001a\u00020jH\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u000203H\u0002¢\u0006\u0004\bm\u0010=J\u0017\u0010n\u001a\u0002032\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u000203H\u0002¢\u0006\u0004\bp\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010qR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010rR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010sR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010tR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010uR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010vR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010wR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010xR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010yR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010zR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010{R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010|R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010}R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010~R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u009b\u0001\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\"\u0010¡\u0001\u001a\u000b\u0012\u0004\u0012\u000203\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010£\u0001\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010¥\u0001\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¤\u0001R\u0017\u0010¦\u0001\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010¤\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001¨\u0006«\u0001"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/v2/ScootersDetailedOrderV2ModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lihn0;", "Landroid/content/Context;", "context", "Lk7x0;", "tagUrlFormatter", "Lc0n0;", "scootersBatteryViewFactory", "Lwro0;", "scootersRemainingChargeTextFactory", "Lg8n0;", "scootersCompassRotatableFloatButtonFactory", "Lpav;", "imageLoader", "Lah00;", "mapController", "La3v;", "iFocusCoordinator", "Lfva0;", "performanceAnalytics", "Lvxm0;", "scootersAppTypeInteractor", "Lnso0;", "scootersRideCardAnalytics", "Lzno0;", "scootersPromotionsAnalytics", "Lc4p0;", "scootersTariffFixAreaOverlay", "Lpfn0;", "scootersDetailedOrderAnalytics", "Lzfn0;", "scootersDetailedOrderLocationOverlay", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "chargeConfig", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;", "batteryChargePercents", "Lru/yandex/taxi/scooters/presentation/ontheway/f;", "scootersOnTheWayPresenter", "Lru/yandex/taxi/scooters/presentation/detailed_order/v2/e;", "scootersDetailedOrderPresenter", "Llhn0;", "scootersDetailedOrderV2ModalViewNavigator", "<init>", "(Landroid/content/Context;Lk7x0;Lc0n0;Lwro0;Lg8n0;Lpav;Lah00;La3v;Lfva0;Lvxm0;Lnso0;Lzno0;Lc4p0;Lpfn0;Lzfn0;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;Lru/yandex/taxi/scooters/presentation/ontheway/f;Lru/yandex/taxi/scooters/presentation/detailed_order/v2/e;Llhn0;)V", "Le230;", "insetsType", "()Le230;", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "Lzy11;", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lihn0;", "onAttachedToWindow", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "newState", "", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "", "newOffset", "onDialogSlide", "(F)V", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchOutside", "onBackPressed", "isArrowsPermanentlyHidden", "()Z", "canDragToExpandFromAnchored", "onDetachedFromWindow", "updateDialogueHeaderColor", "Lkfn0;", "action", "Lahn0;", Constants.KEY_DATA, "onActionClicked", "(Lkfn0;Lahn0;)V", "Lzuo0;", "scootersSessionState", "isChecked", "onActionToggleClicked", "(Lzuo0;Lkfn0;Z)V", "configureMap", "updateFocusCoordinatorMargins", "Lshn0;", "bindStatusBar", "(Lshn0;)V", "onBackButtonClick", "bindHeader", "(Lahn0;)V", "cleanAndSetNullTooltipContainer", "Lpav;", "Lah00;", "La3v;", "Lfva0;", "Lvxm0;", "Lnso0;", "Lzno0;", "Lc4p0;", "Lpfn0;", "Lzfn0;", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;", "Lru/yandex/taxi/scooters/presentation/ontheway/f;", "Lru/yandex/taxi/scooters/presentation/detailed_order/v2/e;", "Llhn0;", "Lru/yandex/taxi/scooters/utils/ScootersCompassRotatableFloatButton;", "compassButton", "Lru/yandex/taxi/scooters/utils/ScootersCompassRotatableFloatButton;", "Lru/yandex/taxi/scooters/utils/ScootersVehicleActualPhotoButtonIconComponent;", "vehicleActualPhotoButton", "Lru/yandex/taxi/scooters/utils/ScootersVehicleActualPhotoButtonIconComponent;", "Lbhn0;", "topButtonContainer", "Lbhn0;", "Lru/yandex/taxi/scooters/presentation/route_navigation/route_summary/ScootersRouteSummaryView;", "routeSummary", "Lru/yandex/taxi/scooters/presentation/route_navigation/route_summary/ScootersRouteSummaryView;", "Lru/yandex/taxi/scooters/utils/ScootersGeoButtonIconComponent;", "geoButton", "Lru/yandex/taxi/scooters/utils/ScootersGeoButtonIconComponent;", "Lru/yandex/taxi/design/BackButtonIconComponent;", "back", "Lru/yandex/taxi/design/BackButtonIconComponent;", "Lru/yandex/taxi/widget/ArrowsView;", "arrowsViewAboveRouteSummary", "Lru/yandex/taxi/widget/ArrowsView;", "Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/ScootersOrderSelectorView;", "orderSelectorView", "Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/ScootersOrderSelectorView;", "Le7p0;", "vehicleActualPhotoTooltipContainer", "Le7p0;", "routeSummaryIsVisible", "Z", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lkotlin/Function0;", "backPressedListener", "Lsls;", "minimizedHeight", CA20Status.STATUS_USER_I, "focusRectTopMargin", "focusRectBottomAdditionalMargin", "hhn0", "onActionButtonClickListener", "Lhhn0;", "ghn0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersDetailedOrderV2ModalView extends SlideableBindingModalView<ihn0> {
    public static final int $stable = 8;
    private final ArrowsView arrowsViewAboveRouteSummary;
    private final BackButtonIconComponent back;
    private sls backPressedListener;
    private final ScootersCardV2.a batteryChargePercents;
    private final ScootersCardV2.ChargeConfig chargeConfig;
    private final ScootersCompassRotatableFloatButton compassButton;
    private final int focusRectBottomAdditionalMargin;
    private final int focusRectTopMargin;
    private final ScootersGeoButtonIconComponent geoButton;
    private final a3v iFocusCoordinator;
    private final pav imageLoader;
    private final ah00 mapController;
    private final int minimizedHeight;
    private final hhn0 onActionButtonClickListener;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private final ScootersOrderSelectorView orderSelectorView;
    private final fva0 performanceAnalytics;
    private final ScootersRouteSummaryView routeSummary;
    private boolean routeSummaryIsVisible;
    private final vxm0 scootersAppTypeInteractor;
    private final pfn0 scootersDetailedOrderAnalytics;
    private final zfn0 scootersDetailedOrderLocationOverlay;
    private final e scootersDetailedOrderPresenter;
    private final lhn0 scootersDetailedOrderV2ModalViewNavigator;
    private final f scootersOnTheWayPresenter;
    private final zno0 scootersPromotionsAnalytics;
    private final nso0 scootersRideCardAnalytics;
    private final c4p0 scootersTariffFixAreaOverlay;
    private final bhn0 topButtonContainer;
    private final ScootersVehicleActualPhotoButtonIconComponent vehicleActualPhotoButton;
    private e7p0 vehicleActualPhotoTooltipContainer;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements tls {
        public final void i(jfn0 jfn0Var) {
            e eVar = (e) this.receiver;
            pzt0 pzt0Var = eVar.a0;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            eVar.a0 = tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$reportPromoPlateShown$1(eVar, jfn0Var, null), 3);
        }

        @Override // defpackage.tls
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((jfn0) obj);
            return zy11.a;
        }
    }

    public ScootersDetailedOrderV2ModalView(Context context, k7x0 k7x0Var, c0n0 c0n0Var, wro0 wro0Var, g8n0 g8n0Var, pav pavVar, ah00 ah00Var, a3v a3vVar, fva0 fva0Var, vxm0 vxm0Var, nso0 nso0Var, zno0 zno0Var, c4p0 c4p0Var, pfn0 pfn0Var, zfn0 zfn0Var, ScootersCardV2.ChargeConfig chargeConfig, ScootersCardV2.a aVar, f fVar, e eVar, lhn0 lhn0Var) {
        super(context);
        this.imageLoader = pavVar;
        this.mapController = ah00Var;
        this.iFocusCoordinator = a3vVar;
        this.performanceAnalytics = fva0Var;
        this.scootersAppTypeInteractor = vxm0Var;
        this.scootersRideCardAnalytics = nso0Var;
        this.scootersPromotionsAnalytics = zno0Var;
        this.scootersTariffFixAreaOverlay = c4p0Var;
        this.scootersDetailedOrderAnalytics = pfn0Var;
        this.scootersDetailedOrderLocationOverlay = zfn0Var;
        this.chargeConfig = chargeConfig;
        this.batteryChargePercents = aVar;
        this.scootersOnTheWayPresenter = fVar;
        this.scootersDetailedOrderPresenter = eVar;
        this.scootersDetailedOrderV2ModalViewNavigator = lhn0Var;
        ScootersCompassRotatableFloatButton a = g8n0Var.a();
        this.compassButton = a;
        vpa vpaVar = new vpa(24);
        ScootersVehicleActualPhotoButtonIconComponent scootersVehicleActualPhotoButtonIconComponent = new ScootersVehicleActualPhotoButtonIconComponent(getContext(), null, 0, 0, 14, null);
        scootersVehicleActualPhotoButtonIconComponent.setDebounceClickListener(vpaVar);
        scootersVehicleActualPhotoButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, scootersVehicleActualPhotoButtonIconComponent.getContext())));
        vehicleActualPhotoButton$lambda$1(scootersVehicleActualPhotoButtonIconComponent);
        addFloatButton(scootersVehicleActualPhotoButtonIconComponent, 8388613);
        this.vehicleActualPhotoButton = scootersVehicleActualPhotoButtonIconComponent;
        bhn0 a2 = ru.yandex.taxi.scooters.presentation.detailed_order.v2.utils.a.a(this, a, new fhn0(this, 0), new fhn0(this, 1), new fhn0(this, 2), new v1n0(17));
        this.topButtonContainer = a2;
        this.routeSummary = a2.f;
        this.geoButton = a2.d;
        this.back = a2.c;
        this.arrowsViewAboveRouteSummary = a2.b;
        ScootersOrderSelectorView scootersOrderSelectorView = a2.e;
        this.orderSelectorView = scootersOrderSelectorView;
        this.onLayoutChangeListener = new yln(22, this);
        int u = tje.u(HProv.PP_LCD_QUERY, getContext());
        this.minimizedHeight = u;
        this.focusRectTopMargin = tje.r(msg0.scooters_top_notification_focus_rect_margin, getContext());
        this.focusRectBottomAdditionalMargin = tje.u(64, getContext());
        this.onActionButtonClickListener = new hhn0(this);
        vpa vpaVar2 = new vpa(25);
        ScootersSupportButtonIconComponent scootersSupportButtonIconComponent = new ScootersSupportButtonIconComponent(getContext(), null, 0, 0, 14, null);
        scootersSupportButtonIconComponent.setDebounceClickListener(vpaVar2);
        scootersSupportButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, scootersSupportButtonIconComponent.getContext())));
        _init_$lambda$1(scootersSupportButtonIconComponent);
        addFloatButton(scootersSupportButtonIconComponent, 8388613);
        ShimmeringFrameLayout shimmeringFrameLayout = ((ihn0) getBinding()).f;
        shimmeringFrameLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.u(24, getContext())));
        shimmeringFrameLayout.setClipToOutline(true);
        ((ihn0) getBinding()).d.show();
        ScootersCardHeaderComponent.init$default(((ihn0) getBinding()).e, pavVar, k7x0Var, c0n0Var, wro0Var, chargeConfig, aVar, null, 64, null);
        ((ihn0) getBinding()).c.init(pavVar, pfn0Var, zno0Var, new AnonymousClass3(1, eVar, e.class, "reportPromoPlateShown", "reportPromoPlateShown(Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersDetailedOrderAction$ScootersPromoPlate;)V", 0));
        setBehaviorAnchorHeight(Integer.valueOf(u));
        scootersOrderSelectorView.setOnChangeScooterListener(new dhn0(this, 1));
        scootersOrderSelectorView.setOnOneMoreScooterListener(new ehn0(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0() {
    }

    private static final zy11 _init_$lambda$1(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setVisibility(4);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView, String str) {
        scootersDetailedOrderV2ModalView.scootersOnTheWayPresenter.F.b.l(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView) {
        ((fgn0) scootersDetailedOrderV2ModalView.scootersDetailedOrderV2ModalViewNavigator).a.r(new agn0(new pxm0("detailed_order", "order_selector"), 0));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindHeader(ahn0 data) {
        yfn0 yfn0Var = data.b;
        ScootersCardHeaderComponent.success$default(getBinding().e, yfn0Var.a, ScootersCardHeaderComponent.AppearanceMode.AS_SINGLE, new q7p0((float) yfn0Var.d, yfn0Var.b, yfn0Var.c), yfn0Var.f, null, new d5n0(data.d.c()), 0, 80, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindStatusBar(shn0 data) {
        ((RobotoTextView) getBinding().g.b).setText(data.a);
        ((RobotoTextView) getBinding().g.d).setText(data.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanAndSetNullTooltipContainer() {
        e7p0 e7p0Var = this.vehicleActualPhotoTooltipContainer;
        if (e7p0Var != null) {
            if (e7p0Var.d != null) {
                e7p0Var.b();
                BubbleComponent.hide$default(e7p0Var.c().a, false, 1, null);
            }
            e7p0Var.d = null;
        }
        this.vehicleActualPhotoTooltipContainer = null;
    }

    private final void configureMap() {
        ((gh00) this.mapController).L(null);
        getBinding().b.addOnLayoutChangeListener(this.onLayoutChangeListener);
        this.routeSummary.addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView, t1w t1wVar) {
        boolean z = t1wVar.f;
        zy11 zy11Var = zy11.a;
        if (z) {
            return zy11Var;
        }
        scootersDetailedOrderV2ModalView.setTopSystemWindowInset(t1wVar.b);
        scootersDetailedOrderV2ModalView.getBinding().f.setPadding(0, 0, 0, t1wVar.g);
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActionClicked(kfn0 action, ahn0 data) {
        if ((action instanceof uen0) || (action instanceof xen0) || (action instanceof wen0)) {
            this.scootersOnTheWayPresenter.Ng(data.d, action.i);
            return;
        }
        if ((action instanceof ffn0) || (action instanceof ven0)) {
            f fVar = this.scootersOnTheWayPresenter;
            zuo0 zuo0Var = data.d;
            ScootersOnTheWayAction scootersOnTheWayAction = action.i;
            qwo0 qwo0Var = fVar.B;
            if (!qwo0Var.d()) {
                qwo0Var.w.setValue(qwo0Var, qwo0.B[21], Boolean.TRUE);
            }
            fVar.Og(zuo0Var, scootersOnTheWayAction);
            return;
        }
        if (action instanceof yen0) {
            this.scootersOnTheWayPresenter.Qg(data.d, action.i);
            return;
        }
        if (action instanceof cfn0) {
            this.scootersOnTheWayPresenter.Rg(data.d);
            return;
        }
        if (action instanceof ifn0) {
            this.scootersOnTheWayPresenter.Vg(data.d);
            return;
        }
        if (action instanceof gfn0) {
            f fVar2 = this.scootersOnTheWayPresenter;
            ((fgn0) fVar2.S).a(data.d);
            return;
        }
        if (action instanceof dfn0) {
            this.scootersOnTheWayPresenter.Pg(data.d, action.i);
            return;
        }
        if (action instanceof bfn0) {
            ((fgn0) this.scootersDetailedOrderV2ModalViewNavigator).a.r(new agn0(new pxm0("detailed_order", "one_more_item"), 0));
            return;
        }
        if (action instanceof zen0) {
            return;
        }
        if (action instanceof afn0) {
            lhn0 lhn0Var = this.scootersDetailedOrderV2ModalViewNavigator;
            String str = ((afn0) action).j;
            fgn0 fgn0Var = (fgn0) lhn0Var;
            fgn0Var.getClass();
            z7n0 z7n0Var = new z7n0(str, true);
            a aVar = fgn0Var.a;
            aVar.A((m950) aVar.R.get(), z7n0Var, sy60.Q2);
            return;
        }
        if (action instanceof efn0) {
            e eVar = this.scootersDetailedOrderPresenter;
            tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$showAboutShareLocationDialog$1(null, eVar), 3);
        } else {
            if (action instanceof hfn0) {
                return;
            }
            if (!(action instanceof jfn0)) {
                w511.b();
                return;
            }
            fgn0 fgn0Var2 = this.scootersDetailedOrderPresenter.V;
            String str2 = ((jfn0) action).k;
            ((a60) ((y50) fgn0Var2.a.H.get())).c(str2, v770.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActionToggleClicked(zuo0 scootersSessionState, kfn0 action, boolean isChecked) {
        if (action instanceof efn0) {
            e eVar = this.scootersDetailedOrderPresenter;
            tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$setLocationSharingState$1(isChecked, eVar, null), 3);
        } else if (action instanceof hfn0) {
            e eVar2 = this.scootersDetailedOrderPresenter;
            tje.N(eVar2.Jg(), null, null, new ScootersDetailedOrderV2Presenter$onVoluntarySlowdownClick$1(eVar2, isChecked, scootersSessionState, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackButtonClick() {
        pfn0 pfn0Var = this.scootersDetailedOrderAnalytics;
        ScootersDetailedOrderAnalytics$RideDetailsButton scootersDetailedOrderAnalytics$RideDetailsButton = ScootersDetailedOrderAnalytics$RideDetailsButton.BACK;
        x770 x770Var = pfn0Var.a;
        String buttonName = scootersDetailedOrderAnalytics$RideDetailsButton.getButtonName();
        String str = pfn0Var.b;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", buttonName);
        if (str != null) {
            hashMap.put("order_id", str);
        }
        x770Var.a.a("ScootersRideDetails.Tapped", hashMap, 1, new HashMap());
        e eVar = this.scootersDetailedOrderPresenter;
        zuo0 zuo0Var = eVar.b0;
        if (zuo0Var != null && (eVar.c0 instanceof wnj)) {
            eVar.Mg(zuo0Var.getSessionId());
        }
        ((nhn0) eVar.Dg()).dismiss();
        onBackButtonClick$lambda$0(this);
    }

    private static final zy11 onBackButtonClick$lambda$0(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView) {
        scootersDetailedOrderV2ModalView.scootersDetailedOrderAnalytics.a(ScootersDetailedOrderAnalytics$CloseReason.BUTTON);
        return zy11.a;
    }

    private static final zy11 onBackPressed$lambda$0(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView) {
        scootersDetailedOrderV2ModalView.scootersDetailedOrderAnalytics.a(ScootersDetailedOrderAnalytics$CloseReason.BUTTON);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setOnBackPressedListener$lambda$0(Runnable runnable) {
        runnable.run();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void topButtonContainer$lambda$0(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView) {
        e eVar = scootersDetailedOrderV2ModalView.scootersDetailedOrderPresenter;
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$onGeoTap$1(null, eVar), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void topButtonContainer$lambda$2(ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView) {
        e eVar = scootersDetailedOrderV2ModalView.scootersDetailedOrderPresenter;
        zuo0 zuo0Var = eVar.b0;
        if (zuo0Var == null) {
            return;
        }
        if (eVar.J.b.b() != null) {
            eVar.T.d(((zuo0Var instanceof lrj0) || (zuo0Var instanceof ea90)) ? ScootersDetailedOrderOneShotAction.CANCEL : ScootersDetailedOrderOneShotAction.FINISH, zuo0Var.getSessionId());
        } else {
            fgn0 fgn0Var = eVar.V;
            tmm0 tmm0Var = new tmm0(15, eVar, zuo0Var);
            fgn0Var.getClass();
            e4n0 e4n0Var = new e4n0(zuo0Var.m(), zuo0Var.getNumber(), new a4n0(kyh0.scooters_cancel_route_navigation_title, kyh0.scooters_cancel_route_navigation_yes_btn, kyh0.scooters_cancel_route_navigation_no_btn));
            a aVar = fgn0Var.a;
            aVar.A((m950) aVar.O.get(), e4n0Var, new ean0(1, tmm0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 topButtonContainer$lambda$3(bhn0 bhn0Var) {
        bhn0Var.c.setVisibility(0);
        bhn0Var.f.setVisibility(8);
        bhn0Var.b.setState(ArrowsView.State.GONE);
        return zy11.a;
    }

    private final void updateDialogueHeaderColor() {
        getBinding().d.updateHeaderColor(Integer.valueOf(qje.t(xng0.bgMinor, getContext())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFocusCoordinatorMargins() {
        int behaviourState = behaviourState();
        if (behaviourState == 1 || behaviourState == 2) {
            return;
        }
        this.iFocusCoordinator.Lc(this, new Rect(0, this.focusRectTopMargin, 0, this.routeSummary.getHeight() + (behaviourState == 6 ? this.minimizedHeight : getBinding().b.getHeight()) + this.focusRectBottomAdditionalMargin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vehicleActualPhotoButton$lambda$0() {
    }

    private static final zy11 vehicleActualPhotoButton$lambda$1(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setY(ru.yandex.taxi.design.utils.c.j(44, floatButtonIconComponent));
        floatButtonIconComponent.setVisibility(8);
        return zy11.a;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        updateDialogueHeaderColor();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ihn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(qrh0.scooters_detailed_order_v2_modal_view, parent, false);
        GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
        int i = pfh0.control_panel;
        ScootersNewControlPanelView scootersNewControlPanelView = (ScootersNewControlPanelView) cma1.O(i, inflate);
        if (scootersNewControlPanelView != null) {
            i = pfh0.dialogue_component;
            DialogueComponent dialogueComponent = (DialogueComponent) cma1.O(i, inflate);
            if (dialogueComponent != null) {
                i = pfh0.order_card_header;
                ScootersCardHeaderComponent scootersCardHeaderComponent = (ScootersCardHeaderComponent) cma1.O(i, inflate);
                if (scootersCardHeaderComponent != null) {
                    i = pfh0.shimmering_layout;
                    ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i, inflate);
                    if (shimmeringFrameLayout != null && (O = cma1.O((i = pfh0.status_bar_view), inflate)) != null) {
                        int i2 = pfh0.state_additional_value;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O);
                        if (robotoTextView != null) {
                            i2 = pfh0.state_name;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, O);
                            if (robotoTextView2 != null) {
                                return new ihn0(goConstraintLayout, goConstraintLayout, scootersNewControlPanelView, dialogueComponent, scootersCardHeaderComponent, shimmeringFrameLayout, new ho4((ViewGroup) O, (View) robotoTextView, robotoTextView2, 13));
                            }
                        }
                        ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
                        return null;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new dhn0(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden, reason: from getter */
    public boolean getIsArrowHidden() {
        return this.routeSummaryIsVisible;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        updateDialogueHeaderColor();
        e eVar = this.scootersDetailedOrderPresenter;
        eVar.Bg(new ghn0(this));
        chn0 chn0Var = eVar.H;
        g gVar = chn0Var.i;
        n b = gVar.b(true);
        n b2 = gVar.b(true);
        u uVar = chn0Var.c;
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$listenSessionState$$inlined$collectIn$1(new m0(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.l(b, kotlinx.coroutines.flow.e.X(new mth(kotlinx.coroutines.flow.e.t(new m0(b2, uVar.a(), new ScootersDetailedOrderV2Interactor$listenPromoPlate$1(3, null))), 6), new ScootersDetailedOrderV2Interactor$listenPromoPlate$$inlined$flatMapLatest$1(null, chn0Var)), uVar.a(), chn0Var.f.b(false), new c(vng.l(new m0(gVar.b(true), uVar.a(), new ScootersDetailedOrderV2Interactor$listenScootersVehicleActualPhotoState$1(3, null)), new v1n0(16), vng.c), chn0Var), new ScootersDetailedOrderV2Interactor$listenModel$1(6, chn0Var, chn0.class, "handleModelsState", "handleModelsState(Lru/yandex/taxi/scooters/domain/model/ScootersActiveOrdersState;Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersDetailedOrderAction$ScootersPromoPlate;Lcom/yandex/go/scooters/api/domain/model/ScootersSessionState;Lru/yandex/taxi/scooters/domain/model/ScootersUserState;Lru/yandex/taxi/scooters/presentation/detailed_order/v2/ScootersDetailedOrderV2$ScootersVehicleActualPhotoState;)Lkotlinx/coroutines/flow/Flow;", 4)), new ScootersDetailedOrderV2Interactor$listenModel$$inlined$flatMapLatest$1(3, null))), eVar.B.a(), new ScootersDetailedOrderV2Presenter$listenSessionState$1(3, null)), null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$listenNavigationStateChange$$inlined$collectLatestIn$1(eVar.N.a(), null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$handleIntents$1(null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$listenToBackButtonBadge$$inlined$collectIn$1(eVar.C.b(), null, (nhn0) eVar.Dg()), 3);
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$listenToFocusType$$inlined$collectLatestIn$1(eVar.L.b(), null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$listenToSlowdownRidingTogetherCommunicationState$1(null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$listenToSlowdownRidingTogetherCommunicationState$$inlined$collectIn$1(eVar.D.b(), null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$handleSlowdownPreactivationForNewbie$1(null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new ScootersDetailedOrderV2Presenter$listenToTransportSegment$$inlined$collectLatestIn$1(kotlinx.coroutines.flow.e.d(eVar.G.a), null, eVar), 3);
        this.scootersOnTheWayPresenter.Bg(new dew());
        getBinding().f.setShimmering(false);
        getBinding().c.setOnActionButtonClickListener(this.onActionButtonClickListener);
        configureMap();
        Iterator it = ((boo0) this.scootersPromotionsAnalytics).b.values().iterator();
        while (it.hasNext()) {
            ((Set) it.next()).clear();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        e eVar = this.scootersDetailedOrderPresenter;
        zuo0 zuo0Var = eVar.b0;
        if (zuo0Var != null && (eVar.c0 instanceof wnj)) {
            eVar.Mg(zuo0Var.getSessionId());
        }
        ((nhn0) eVar.Dg()).dismiss();
        onBackPressed$lambda$0(this);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        updateFocusCoordinatorMargins();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBinding().b.removeOnLayoutChangeListener(this.onLayoutChangeListener);
        this.routeSummary.removeOnLayoutChangeListener(this.onLayoutChangeListener);
        this.iFocusCoordinator.t4(this);
        this.scootersTariffFixAreaOverlay.Hg();
        this.scootersOnTheWayPresenter.Cg();
        this.scootersDetailedOrderPresenter.Cg();
        zfn0 zfn0Var = this.scootersDetailedOrderLocationOverlay;
        g641 g641Var = zfn0Var.d;
        if (g641Var != null) {
            g641Var.detach();
        }
        zfn0Var.d = null;
        cleanAndSetNullTooltipContainer();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        this.orderSelectorView.setTranslationY((1.0f - Math.max(0.0f, Math.min(getSlideOffset(), 1.0f))) * this.topButtonContainer.a.getHeight());
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getBinding().f, event) || xw31.o(getRootView(), this.back, event) || xw31.o(getRootView(), this.vehicleActualPhotoButton, event) || xw31.o(getRootView(), this.geoButton, event) || xw31.o(getRootView(), this.compassButton, event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        bottomSheetBehavior.O(3);
        updateUserInteractionBlockingOutside();
        bottomSheetBehavior.C = false;
        bottomSheetBehavior.W = false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.backPressedListener = new mw0(5, onBackPressedListener);
    }
}
