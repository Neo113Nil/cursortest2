package ru.yandex.taxi.masstransit.main.ui.modal;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b01;
import defpackage.c2x0;
import defpackage.czo0;
import defpackage.d2x0;
import defpackage.da0;
import defpackage.do30;
import defpackage.dwc;
import defpackage.e311;
import defpackage.eg3;
import defpackage.eo30;
import defpackage.fl10;
import defpackage.fo30;
import defpackage.ft20;
import defpackage.gh00;
import defpackage.go30;
import defpackage.hbp0;
import defpackage.ho30;
import defpackage.hr7;
import defpackage.i3y;
import defpackage.io30;
import defpackage.ip11;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.lo30;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.mth;
import defpackage.n891;
import defpackage.ndh0;
import defpackage.nz;
import defpackage.oo30;
import defpackage.p6q0;
import defpackage.pwy0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.sf30;
import defpackage.t1w;
import defpackage.t8;
import defpackage.tf30;
import defpackage.tje;
import defpackage.uf30;
import defpackage.ve30;
import defpackage.w130;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xzl;
import defpackage.y6i0;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.masstransit.analytic.TransportMainAnalytics$ModalState;
import ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView;
import ru.yandex.taxi.masstransit.main.ui.header.compose.MtHeader;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f*\u0002\u0099\u0001\b\u0007\u0018\u0000 ®\u00012\u00020\u0001:\b¯\u0001°\u0001±\u0001²\u0001Bu\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0002H\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b)\u0010%J\u001d\u0010*\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b*\u0010%J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J7\u00108\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0014¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001aH\u0014¢\u0006\u0004\b=\u0010\u001cJ\u000f\u0010>\u001a\u00020\u001aH\u0014¢\u0006\u0004\b>\u0010\u001cJ\u000f\u0010?\u001a\u00020\u001aH\u0014¢\u0006\u0004\b?\u0010\u001cJ\u001d\u0010B\u001a\u00020\u001a2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020:0@H\u0014¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u0004H\u0014¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001aH\u0014¢\u0006\u0004\bG\u0010\u001cJ\u000f\u0010H\u001a\u00020\u001aH\u0014¢\u0006\u0004\bH\u0010\u001cJ\u0017\u0010K\u001a\u00020\"2\u0006\u0010J\u001a\u00020IH\u0017¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0004H\u0014¢\u0006\u0004\bM\u0010\u0019J\u000f\u0010N\u001a\u00020\u001aH\u0014¢\u0006\u0004\bN\u0010\u001cJ\u000f\u0010O\u001a\u00020\u0004H\u0002¢\u0006\u0004\bO\u0010\u0019J\u000f\u0010P\u001a\u00020\u0004H\u0002¢\u0006\u0004\bP\u0010\u0019J\u000f\u0010Q\u001a\u00020\u001aH\u0002¢\u0006\u0004\bQ\u0010\u001cJ\u000f\u0010R\u001a\u00020\u001aH\u0002¢\u0006\u0004\bR\u0010\u001cJ\u000f\u0010S\u001a\u00020\u001aH\u0002¢\u0006\u0004\bS\u0010\u001cJ\u000f\u0010T\u001a\u00020\"H\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u001aH\u0002¢\u0006\u0004\bV\u0010\u001cJ\u000f\u0010W\u001a\u00020\u001aH\u0002¢\u0006\u0004\bW\u0010\u001cJ\u000f\u0010X\u001a\u00020\u0004H\u0002¢\u0006\u0004\bX\u0010\u0019J\u0019\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010]\u001a\u00020\"2\u0006\u0010\\\u001a\u00020Y2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u001aH\u0002¢\u0006\u0004\b_\u0010\u001cJ)\u0010f\u001a\u00020\u001a2\u0010\u0010c\u001a\f\u0012\b\u0012\u00060aj\u0002`b0`2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010m\u001a\u0004\br\u0010o\"\u0004\bs\u0010qR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010mR\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000b\u0010t\u0012\u0004\bu\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010vR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010wR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010xR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010yR\u001b\u0010\u007f\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R*\u0010\u0085\u0001\u001a\r \u0081\u0001*\u0005\u0018\u00010\u0080\u00010\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010|\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u008c\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u0012\u0005\b\u008e\u0001\u0010\u001cR\u0019\u0010\u008f\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0090\u0001R\u0017\u0010\u0093\u0001\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0090\u0001R\u001b\u0010\u0096\u0001\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0090\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009c\u0001\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0094\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010«\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u0019R\u0016\u0010\u00ad\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\u0019¨\u0006³\u0001"}, d2 = {"Lru/yandex/taxi/masstransit/main/ui/modal/MtMainFlexModalView;", "Lru/yandex/taxi/masstransit/main/ui/flex/SlideableFlexModalView;", "", "maxHeightToScreenRatio", "", "minHeight", "minHiddenContentHeight", "modalCornerRadius", "Landroid/content/Context;", "context", "Lcom/yandex/feedsdk/di/FeedSdkComponent;", "feedSdk", "Ldwc;", "compassButtonPresenter", "Llo30;", "presenter", "Lc2x0;", "systemBarsCoordinator", "Lpwy0;", "themeSwitcherProvider", "Lip11;", "typefaceDelegate", "<init>", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/Context;Lcom/yandex/feedsdk/di/FeedSdkComponent;Ldwc;Llo30;Lc2x0;Lpwy0;Lip11;)V", "getMaxAnchoredHeight", "()I", "Lzy11;", "updateCurrentBackground", "()V", "rootHeight", "contentHeight", "computeExpandedMinOffset", "(II)I", "newState", "", "movedByUser", "updateUserSheetGestureState", "(IZ)V", "newOffset", "onDialogSlide", "(F)V", "onBehaviorStateChanged", "sendTransportMainStateChanged", "getTopPadding", "Lw130;", "insetsType", "()Lw130;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/View;", "inflateCardContent", "()Landroid/view/View;", "onAttachedToWindow", "onModalViewDisappear", "onDetachedFromWindow", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "contentTop", "onModalViewAppear", "(I)V", "onSlideOut", "onTouchOutside", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "animateDismissBackground", "getMinimizeAnchorHeight", "expandedTopReserveForFloatButtonsPx", "updateLocationButtonVisibilityForSheetState", "updateCompassButtonVisibilityForSheetState", "updateExpandedSheetScrim", "isSheetVisuallyExpanded", "()Z", "updateSheetOverHeaderZOrder", "liftCoordinatorFloatsAboveExpandedScrim", "currentVisibleBottomSheetHeightPx", "Lru/yandex/taxi/masstransit/analytic/TransportMainAnalytics$ModalState;", "behaviorStateToAnalyticsModalState", "(I)Lru/yandex/taxi/masstransit/analytic/TransportMainAnalytics$ModalState;", ClidProvider.STATE, "shouldReportTransportMainAnalyticsState", "(Lru/yandex/taxi/masstransit/analytic/TransportMainAnalytics$ModalState;Z)Z", "setForceStatusBarTheme", "", "", "Lflex/tag/Tag;", "tags", "Lxzl;", "documentFetchResult", "revealFlexContentForTalkBack", "(Ljava/util/List;Lxzl;)V", "Ljava/lang/Float;", "getMaxHeightToScreenRatio", "()Ljava/lang/Float;", "setMaxHeightToScreenRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Integer;", "getMinHeight", "()Ljava/lang/Integer;", "setMinHeight", "(Ljava/lang/Integer;)V", "getMinHiddenContentHeight", "setMinHiddenContentHeight", "Lcom/yandex/feedsdk/di/FeedSdkComponent;", "getFeedSdk$annotations", "Ldwc;", "Llo30;", "Lc2x0;", "Lpwy0;", "Lru/yandex/taxi/masstransit/main/ui/header/compose/MtHeader;", "header$delegate", "Li3y;", "getHeader", "()Lru/yandex/taxi/masstransit/main/ui/header/compose/MtHeader;", "header", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "slideableRoot$delegate", "getSlideableRoot", "()Landroid/view/ViewGroup;", "slideableRoot", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Ll8x;", "restoreModalStateJob", "Ll8x;", "behaviorLastState", CA20Status.STATUS_USER_I, "getBehaviorLastState$annotations", "minimized", "Z", "scrimAfterUserExpand", "userSheetGestureInProgress", "navBarScrimView", "Landroid/view/View;", "lcpReported", "lastReportedTransportMainState", "Lru/yandex/taxi/masstransit/analytic/TransportMainAnalytics$ModalState;", "isFlexContentAccessible", "io30", "perfDocumentTracker", "Lio30;", "expandedSheetScrim", "Lhr7;", "mapListener", "Lhr7;", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "compassButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "locationButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "floatButtonLayoutHolder", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Companion", "go30", "uf30", "jo30", "fo30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtMainFlexModalView extends SlideableFlexModalView {
    public static final int $stable = 8;
    private static final int COLLAPSED_PEEK_HEIGHT_DP = 84;
    private static final fo30 Companion = new fo30();
    private static final float EXPANDED_OFFSET_EPSILON = 0.99f;
    private final FloatButtonIconComponent backButton;
    private int behaviorLastState;
    private final RotatableFloatButton compassButton;
    private final dwc compassButtonPresenter;
    private final View expandedSheetScrim;
    private final FeedSdkComponent feedSdk;
    private final FloatButtonHolderLayout floatButtonLayoutHolder;

    /* renamed from: header$delegate, reason: from kotlin metadata */
    private final i3y header;
    private boolean isFlexContentAccessible;
    private TransportMainAnalytics$ModalState lastReportedTransportMainState;
    private boolean lcpReported;
    private final RotatableFloatButton locationButton;
    private final hr7 mapListener;
    private Float maxHeightToScreenRatio;
    private Integer minHeight;
    private Integer minHiddenContentHeight;
    private volatile boolean minimized;
    private final Integer modalCornerRadius;
    private final View navBarScrimView;
    private final io30 perfDocumentTracker;
    private final lo30 presenter;
    private l8x restoreModalStateJob;
    private final hbp0 scopeDelegate;
    private boolean scrimAfterUserExpand;

    /* renamed from: slideableRoot$delegate, reason: from kotlin metadata */
    private final i3y slideableRoot;
    private final c2x0 systemBarsCoordinator;
    private final pwy0 themeSwitcherProvider;
    private boolean userSheetGestureInProgress;

    public MtMainFlexModalView(Float f, Integer num, Integer num2, Integer num3, Context context, FeedSdkComponent feedSdkComponent, dwc dwcVar, lo30 lo30Var, c2x0 c2x0Var, pwy0 pwy0Var, ip11 ip11Var) {
        super(context, feedSdkComponent);
        this.maxHeightToScreenRatio = f;
        this.minHeight = num;
        this.minHiddenContentHeight = num2;
        this.modalCornerRadius = num3;
        this.feedSdk = feedSdkComponent;
        this.compassButtonPresenter = dwcVar;
        this.presenter = lo30Var;
        this.systemBarsCoordinator = c2x0Var;
        this.themeSwitcherProvider = pwy0Var;
        this.header = kotlin.a.a(new ve30(6, context, ip11Var));
        this.slideableRoot = kotlin.a.a(new eo30(this, 1));
        this.scopeDelegate = new hbp0(new czo0(14), "", null);
        this.behaviorLastState = 6;
        View view = new View(context);
        view.setBackgroundColor(qje.t(xng0.bgMain, view.getContext()));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0, 80));
        this.navBarScrimView = view;
        this.isFlexContentAccessible = true;
        this.perfDocumentTracker = new io30(this);
        View view2 = new View(context);
        view2.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -1));
        view2.setBackgroundColor(qje.t(xng0.fog, view2.getContext()));
        view2.setImportantForAccessibility(2);
        view2.setAlpha(0.0f);
        view2.setVisibility(8);
        this.expandedSheetScrim = view2;
        this.mapListener = new b01(18, this);
        int i = 3;
        this.backButton = qdb1.b(this, new do30(this, i));
        FloatButtonHolderLayout c = eg3.c(this, 12);
        this.floatButtonLayoutHolder = c;
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        setDismissOnTouchOutside(false);
        this.compassButton = eg3.a(c, new tf30(dwcVar, 2));
        this.locationButton = eg3.d(c, new sf30(i, lo30Var));
        setArrowState(ArrowsView.State.GONE);
        getBottomSheetBehavior().W = true;
        getBottomSheetBehavior().Z = false;
        addView(view);
        ViewGroup slideableRoot = getSlideableRoot();
        if (slideableRoot != null) {
            slideableRoot.addView(view2, Math.max(0, slideableRoot.indexOfChild(getBottomSheet())));
        }
        view2.setOnTouchListener(new t8(13, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(MtMainFlexModalView mtMainFlexModalView, View view, MotionEvent motionEvent) {
        if (mtMainFlexModalView.expandedSheetScrim.getVisibility() == 0 && mtMainFlexModalView.shouldUseFullHeightExpandedGeometry()) {
            return mtMainFlexModalView.onTouchEvent(motionEvent);
        }
        return false;
    }

    private final TransportMainAnalytics$ModalState behaviorStateToAnalyticsModalState(int newState) {
        if (newState != 3) {
            if (newState == 4) {
                return TransportMainAnalytics$ModalState.Collapsed;
            }
            if (newState == 6) {
                return TransportMainAnalytics$ModalState.Default;
            }
            if (newState != 7) {
                return null;
            }
        }
        return TransportMainAnalytics$ModalState.Expanded;
    }

    private final int currentVisibleBottomSheetHeightPx() {
        int height = getContent().getHeight();
        if (height == 0) {
            return getHeight();
        }
        int top = height - getBottomSheet().getTop();
        if (top < 0) {
            return 0;
        }
        return top;
    }

    private final int expandedTopReserveForFloatButtonsPx() {
        ViewGroup viewGroup = (ViewGroup) findViewById(ndh0.start_side_fab_container);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(ndh0.end_side_fab_container);
        return getFloatButtonBackgroundOffset() + Math.max(viewGroup != null ? viewGroup.getHeight() : 0, viewGroup2 != null ? viewGroup2.getHeight() : 0) + getCurrentInsets().b;
    }

    private static /* synthetic */ void getBehaviorLastState$annotations() {
    }

    private static /* synthetic */ void getFeedSdk$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MtHeader getHeader() {
        return (MtHeader) this.header.getValue();
    }

    private final int getMinimizeAnchorHeight() {
        return tje.u(56, getContext()) + getCurrentInsets().g;
    }

    private final ViewGroup getSlideableRoot() {
        return (ViewGroup) this.slideableRoot.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MtHeader header_delegate$lambda$0(Context context, ip11 ip11Var) {
        return new MtHeader(context, ip11Var, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(MtMainFlexModalView mtMainFlexModalView, t1w t1wVar) {
        mtMainFlexModalView.applyFlexWindowInsets(t1wVar);
        ((FrameLayout.LayoutParams) mtMainFlexModalView.navBarScrimView.getLayoutParams()).height = t1wVar.d;
        mtMainFlexModalView.navBarScrimView.requestLayout();
        return zy11.a;
    }

    private final boolean isSheetVisuallyExpanded() {
        int i = getBottomSheetBehavior().E;
        return (i == 1 || i == 2) ? getCurrentOffset() >= EXPANDED_OFFSET_EPSILON : i == 3 || i == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$onCompassButtonClicked(dwc dwcVar) {
        ((gh00) dwcVar.x).w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$onGeoTap(lo30 lo30Var) {
        tje.N(lo30Var.Jg(), null, null, new MtMainFlexPresenter$onGeoTap$1(lo30Var, null), 3);
    }

    private final void liftCoordinatorFloatsAboveExpandedScrim() {
        ViewGroup slideableRoot;
        if (this.expandedSheetScrim.getVisibility() != 0 || (slideableRoot = getSlideableRoot()) == null || slideableRoot.indexOfChild(this.expandedSheetScrim) < 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(ndh0.start_side_fab_container);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(ndh0.end_side_fab_container);
        ViewGroup viewGroup3 = (ViewGroup) findViewById(ndh0.top_center_container);
        View findViewById = findViewById(ndh0.slideable_modal_view_arrows);
        slideableRoot.bringChildToFront(viewGroup);
        slideableRoot.bringChildToFront(viewGroup2);
        slideableRoot.bringChildToFront(viewGroup3);
        slideableRoot.bringChildToFront(findViewById);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mapListener$lambda$0(MtMainFlexModalView mtMainFlexModalView, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        if (ho30.a[cameraUpdateReason.ordinal()] == 1) {
            int i = 3;
            if (z) {
                if (mtMainFlexModalView.minimized) {
                    mtMainFlexModalView.restoreModalStateJob = hbp0.e(mtMainFlexModalView.scopeDelegate, null, null, new MtMainFlexModalView$mapListener$1$1(mtMainFlexModalView, null), 3);
                    return;
                }
                return;
            }
            if (mtMainFlexModalView.minimized) {
                return;
            }
            l8x l8xVar = mtMainFlexModalView.restoreModalStateJob;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            mtMainFlexModalView.minimized = true;
            int behaviourState = mtMainFlexModalView.behaviourState();
            if (behaviourState != 3) {
                int i2 = 4;
                if (behaviourState != 4) {
                    i2 = 6;
                    if (behaviourState != 6) {
                        if (behaviourState != 7) {
                            i = mtMainFlexModalView.behaviorLastState;
                        }
                    }
                }
                i = i2;
            }
            mtMainFlexModalView.behaviorLastState = i;
            mtMainFlexModalView.setBehaviorAnchorHeight(Integer.valueOf(mtMainFlexModalView.getMaxAnchoredHeight()));
            mtMainFlexModalView.anchor();
            mtMainFlexModalView.post(new do30(mtMainFlexModalView, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(MtMainFlexModalView mtMainFlexModalView) {
        ru.yandex.taxi.masstransit.main.router.b bVar = mtMainFlexModalView.presenter.x.a;
        bVar.z((da0) bVar.I.get(), new oo30(bVar));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(MtMainFlexModalView mtMainFlexModalView) {
        mtMainFlexModalView.updateLocationButtonVisibilityForSheetState();
        mtMainFlexModalView.updateCompassButtonVisibilityForSheetState();
        mtMainFlexModalView.updateExpandedSheetScrim();
        mtMainFlexModalView.updateSheetOverHeaderZOrder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void revealFlexContentForTalkBack(List<String> tags, xzl documentFetchResult) {
        p6q0 p6q0Var;
        if (this.isFlexContentAccessible || (p6q0Var = (p6q0) documentFetchResult.a.c.b(qoi0.a(p6q0.class))) == null || p6q0Var.a.isEmpty()) {
            return;
        }
        List<String> list = tags;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (String str : list) {
            if (jl40.l(str, "fromNetwork") || jl40.l(str, "fromCache") || jl40.l(str, "fromFallback")) {
                this.isFlexContentAccessible = true;
                getCardContentView().setImportantForAccessibility(0);
                return;
            }
        }
    }

    private final void setForceStatusBarTheme() {
        ((d2x0) this.systemBarsCoordinator).a(0, qoi0.a(MtMainFlexModalView.class), !this.themeSwitcherProvider.getThemeType().c());
    }

    private final boolean shouldReportTransportMainAnalyticsState(TransportMainAnalytics$ModalState state, boolean movedByUser) {
        int i = ho30.b[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return false;
                }
                if (!shouldUseFullHeightExpandedGeometry()) {
                    return movedByUser && this.lastReportedTransportMainState == TransportMainAnalytics$ModalState.Collapsed;
                }
            } else if (!shouldUseFullHeightExpandedGeometry()) {
                return false;
            }
        }
        return movedByUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup slideableRoot_delegate$lambda$0(MtMainFlexModalView mtMainFlexModalView) {
        return (ViewGroup) mtMainFlexModalView.findViewById(ndh0.slideable_modal_view_root);
    }

    private final void updateCompassButtonVisibilityForSheetState() {
        if (shouldUseFullHeightExpandedGeometry() && isSheetVisuallyExpanded()) {
            this.compassButton.setVisibility(8);
        } else {
            this.compassButton.setVisibility(this.compassButtonPresenter.z.a ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCurrentBackground$lambda$0(MtMainFlexModalView mtMainFlexModalView) {
        mtMainFlexModalView.updateExpandedSheetScrim();
        mtMainFlexModalView.updateSheetOverHeaderZOrder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateExpandedSheetScrim() {
        float f = 0.0f;
        if (this.minimized) {
            this.expandedSheetScrim.setAlpha(0.0f);
            this.expandedSheetScrim.setVisibility(8);
            return;
        }
        if (!shouldUseFullHeightExpandedGeometry()) {
            this.expandedSheetScrim.setAlpha(0.0f);
            this.expandedSheetScrim.setVisibility(8);
            return;
        }
        float c = y6i0.c(getCurrentOffset(), 0.0f, 1.0f);
        int i = getBottomSheetBehavior().E;
        if (i == 1 || i == 2) {
            if (this.userSheetGestureInProgress) {
                f = c;
            }
        } else if ((i == 3 || i == 7) && this.scrimAfterUserExpand) {
            f = 1.0f;
        }
        this.expandedSheetScrim.setAlpha(f);
        this.expandedSheetScrim.setVisibility(f > 0.001f ? 0 : 8);
    }

    private final void updateLocationButtonVisibilityForSheetState() {
        RotatableFloatButton rotatableFloatButton = this.locationButton;
        boolean z = true;
        if (shouldUseFullHeightExpandedGeometry() && isSheetVisuallyExpanded()) {
            z = false;
        }
        rotatableFloatButton.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSheetOverHeaderZOrder() {
        if (!shouldUseFullHeightExpandedGeometry()) {
            bringChildToFront(getSlideableRoot());
            bringChildToFront(this.navBarScrimView);
            bringChildToFront(getHeader());
            liftCoordinatorFloatsAboveExpandedScrim();
            return;
        }
        if (getHeader().isLaidOut()) {
            if (getBottomSheet().getTop() < getHeader().getBottom()) {
                bringChildToFront(getHeader());
                bringChildToFront(getSlideableRoot());
                bringChildToFront(this.navBarScrimView);
            } else {
                bringChildToFront(getSlideableRoot());
                bringChildToFront(this.navBarScrimView);
                bringChildToFront(getHeader());
            }
            liftCoordinatorFloatsAboveExpandedScrim();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.navBarScrimView.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        this.expandedSheetScrim.setBackgroundColor(qje.t(xng0.fog, getContext()));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView
    public int computeExpandedMinOffset(int rootHeight, int contentHeight) {
        int computeExpandedMinOffset = super.computeExpandedMinOffset(rootHeight, contentHeight);
        if (super.getMaxAnchoredHeight() == contentHeight) {
            setArrowState(ArrowsView.State.GONE);
            return computeExpandedMinOffset;
        }
        setArrowState(ArrowsView.State.PLAIN);
        return Math.min(expandedTopReserveForFloatButtonsPx(), computeExpandedMinOffset);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        Integer num = this.modalCornerRadius;
        return num != null ? tje.u(num.intValue(), getContext()) : tje.r(mrg0.modal_view_corner_radius_big, getContext());
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView, ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        return this.minimized ? getMinimizeAnchorHeight() : super.getMaxAnchoredHeight();
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView
    public Float getMaxHeightToScreenRatio() {
        return this.maxHeightToScreenRatio;
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView
    public Integer getMinHeight() {
        return this.minHeight;
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView
    public Integer getMinHiddenContentHeight() {
        return this.minHiddenContentHeight;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return this.topSystemWindowInset;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public View inflateCardContent() {
        GoFrameLayout goFrameLayout = new GoFrameLayout(getContext(), null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        getCardContentContainer().addView(goFrameLayout);
        return goFrameLayout;
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView, ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new ft20(18, this));
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lastReportedTransportMainState = null;
        Context context = getContext();
        int i = 4;
        int i2 = 0;
        int i3 = 1;
        if (context != null && tje.L(context)) {
            this.isFlexContentAccessible = false;
            getCardContentView().setImportantForAccessibility(4);
        }
        OneShotPreDrawListener.add(this, new nz(this, this, SystemClock.elapsedRealtimeNanos(), this, 3));
        this.feedSdk.getEngine().c(this.perfDocumentTracker);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        this.scopeDelegate.a();
        setForceStatusBarTheme();
        setUseSpringSettling(true);
        setSpringDampingRatio(0.9f);
        setSpringStiffness(75.0f);
        lo30 lo30Var = this.presenter;
        go30 go30Var = new go30(this);
        lo30Var.L.a.set(null);
        lo30Var.Bg(go30Var);
        lo30Var.B.b8(lo30Var);
        tje.N(lo30Var.Jg(), null, null, new MtMainFlexPresenter$attachView$$inlined$safeCollectIn$1(lo30Var.y.a(), null, go30Var), 3);
        tje.N(lo30Var.Jg(), null, null, new MtMainFlexPresenter$attachView$$inlined$safeCollectIn$2(new mth(e.t(new b(e.d(lo30Var.F.b))), i), null, lo30Var, go30Var), 3);
        tje.N(lo30Var.Jg(), null, null, new MtMainFlexPresenter$attachView$4(lo30Var, null), 3);
        tje.N(lo30Var.Jg(), null, null, new MtMainFlexPresenter$attachView$$inlined$safeCollectIn$3(lo30Var.I.a(), null, lo30Var), 3);
        addView(getHeader());
        this.compassButtonPresenter.Kg(new uf30(this, 2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM));
        setSlideListener(new fl10(this));
        getHeader().statusBarPadding(tje.u(12, getContext()) + dimensionPixelSize);
        getHeader().onSubtitleClicked(new eo30(this, i2));
        lo30 lo30Var2 = this.presenter;
        ((gh00) lo30Var2.z).e(this.mapListener);
        post(new do30(this, i3));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        updateUserSheetGestureState(newState, movedByUser);
        sendTransportMainStateChanged(newState, movedByUser);
        updateLocationButtonVisibilityForSheetState();
        updateCompassButtonVisibilityForSheetState();
        updateExpandedSheetScrim();
        updateSheetOverHeaderZOrder();
        invalidateFlexVisibleBoundsAfterLayout();
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lastReportedTransportMainState = null;
        ((d2x0) this.systemBarsCoordinator).b(qoi0.a(MtMainFlexModalView.class));
        this.compassButtonPresenter.Cg();
        removeView(getHeader());
        lo30 lo30Var = this.presenter;
        ((gh00) lo30Var.z).u(this.mapListener);
        this.feedSdk.getEngine().x(this.perfDocumentTracker);
        this.lcpReported = false;
        this.isFlexContentAccessible = true;
        this.scopeDelegate.b();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        updateLocationButtonVisibilityForSheetState();
        updateCompassButtonVisibilityForSheetState();
        updateExpandedSheetScrim();
        updateSheetOverHeaderZOrder();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        setBehaviorPeekHeight(tje.u(84, getContext()) + getCurrentInsets().d, true);
        updateExpandedSheetScrim();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService(AccessibilityManager.class);
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            getBottomSheetBehavior().O(3);
        }
        invalidateFlexVisibleBoundsAfterLayout();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        setSlideListener(null);
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        if (shouldUseFullHeightExpandedGeometry() && isSheetVisuallyExpanded()) {
            if (event.getAction() != 1 && event.getAction() != 3) {
                return super.onTouchEvent(event);
            }
            anchor();
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        if (shouldUseFullHeightExpandedGeometry() && isSheetVisuallyExpanded()) {
            setBehaviorState(6);
        }
    }

    public final void sendTransportMainStateChanged(int newState, boolean movedByUser) {
        TransportMainAnalytics$ModalState behaviorStateToAnalyticsModalState = behaviorStateToAnalyticsModalState(newState);
        if (behaviorStateToAnalyticsModalState == null) {
            return;
        }
        if (!shouldReportTransportMainAnalyticsState(behaviorStateToAnalyticsModalState, movedByUser)) {
            if (shouldUseFullHeightExpandedGeometry()) {
                this.lastReportedTransportMainState = null;
                return;
            }
            return;
        }
        if (behaviorStateToAnalyticsModalState == this.lastReportedTransportMainState) {
            return;
        }
        this.lastReportedTransportMainState = behaviorStateToAnalyticsModalState;
        lo30 lo30Var = this.presenter;
        int currentVisibleBottomSheetHeightPx = currentVisibleBottomSheetHeightPx();
        int contentHeight = getContentHeight();
        e311 e311Var = lo30Var.K;
        String valueOf = String.valueOf(n891.k(currentVisibleBottomSheetHeightPx));
        String valueOf2 = String.valueOf(n891.k(contentHeight));
        String str = (String) lo30Var.L.a.get();
        e311Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(ClidProvider.STATE, behaviorStateToAnalyticsModalState.getEventValue());
        hashMap.put("modal_height", valueOf);
        hashMap.put("content_height", valueOf2);
        if (str != null) {
            hashMap.put("request_id", str);
        }
        e311Var.a.a("TransportMain.StateChanged", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService(AccessibilityManager.class);
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.setInitialBehaviorState(bottomSheetBehavior);
        } else {
            bottomSheetBehavior.O(3);
        }
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView
    public void setMaxHeightToScreenRatio(Float f) {
        this.maxHeightToScreenRatio = f;
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView
    public void setMinHeight(Integer num) {
        this.minHeight = num;
    }

    @Override // ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView
    public void setMinHiddenContentHeight(Integer num) {
        this.minHiddenContentHeight = num;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateCurrentBackground() {
        super.updateCurrentBackground();
        ViewGroup bottomSheet = getBottomSheet();
        bottomSheet.getLayoutParams().height = -1;
        bottomSheet.requestLayout();
        post(new do30(this, 0));
        invalidateFlexVisibleBoundsAfterLayout();
    }

    public final void updateUserSheetGestureState(int newState, boolean movedByUser) {
        if (newState == 1) {
            this.userSheetGestureInProgress = movedByUser;
            return;
        }
        if (newState != 2) {
            if (newState != 3) {
                if (newState == 4 || newState == 6) {
                    this.scrimAfterUserExpand = false;
                    this.userSheetGestureInProgress = false;
                    return;
                } else if (newState != 7) {
                    this.scrimAfterUserExpand = false;
                    this.userSheetGestureInProgress = false;
                    return;
                }
            }
            this.scrimAfterUserExpand = movedByUser;
            this.userSheetGestureInProgress = false;
        }
    }
}
