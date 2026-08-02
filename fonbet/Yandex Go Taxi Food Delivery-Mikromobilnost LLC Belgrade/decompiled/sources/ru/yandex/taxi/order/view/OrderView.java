package ru.yandex.taxi.order.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import com.yandex.go.taxi.order.experiments.h;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchProgressExperiment;
import com.yandex.go.taxi.order.state.OrderStateView;
import com.yandex.go.taxi.order.view.e;
import defpackage.a3y0;
import defpackage.a741;
import defpackage.an91;
import defpackage.c0g;
import defpackage.cby0;
import defpackage.ci70;
import defpackage.d1l0;
import defpackage.ea80;
import defpackage.fa80;
import defpackage.g18;
import defpackage.g8e;
import defpackage.ga80;
import defpackage.gs70;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.ht10;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.i5m;
import defpackage.jxi;
import defpackage.k1l0;
import defpackage.l0g;
import defpackage.lwf0;
import defpackage.m950;
import defpackage.ma80;
import defpackage.mrg0;
import defpackage.n080;
import defpackage.n0g;
import defpackage.na80;
import defpackage.ney;
import defpackage.nwf0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o480;
import defpackage.oep0;
import defpackage.p8h0;
import defpackage.pa80;
import defpackage.pep0;
import defpackage.pwf0;
import defpackage.q5z;
import defpackage.qim;
import defpackage.qn70;
import defpackage.qqo;
import defpackage.rim;
import defpackage.rp31;
import defpackage.rqo;
import defpackage.ry1;
import defpackage.sd30;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.ub60;
import defpackage.v770;
import defpackage.vb3;
import defpackage.vez0;
import defpackage.w791;
import defpackage.ww70;
import defpackage.xw31;
import defpackage.y480;
import defpackage.yln;
import defpackage.zkh0;
import defpackage.zxf0;
import defpackage.zy11;
import defpackage.zzf;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.altpins.order.p;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.OrderMvpView;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.i;
import ru.yandex.taxi.order.state.checkin.CheckInStateView;
import ru.yandex.taxi.order.state.complete.CompleteStateView;
import ru.yandex.taxi.order.state.driving.DrivingStateView;
import ru.yandex.taxi.order.state.scheduled.ScheduledStateView;
import ru.yandex.taxi.order.state.search.SearchStateView;
import ru.yandex.taxi.order.state.transporting.TransportingStateView;
import ru.yandex.taxi.order.state.waiting.WaitingStateView;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.order.view.walking_info.WalkingInfoView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.dialog.AlertDialog;

@jxi
@Metadata(d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\b¼\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u0016J)\u0010 \u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\u0017¢\u0006\u0004\b'\u0010\u0019J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\"H\u0016¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0017¢\u0006\u0004\b.\u0010\u0019J\r\u0010/\u001a\u00020\u0017¢\u0006\u0004\b/\u0010\u0019J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\"H\u0007¢\u0006\u0004\b0\u0010-J\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000e¢\u0006\u0004\b4\u0010\u0016J\r\u00105\u001a\u00020\u000e¢\u0006\u0004\b5\u0010\u0016J\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u0010\u0019J\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u0016J\u000f\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0016J\u0017\u0010>\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u000e2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000eH\u0016¢\u0006\u0004\bH\u0010\u0016J\u000f\u0010I\u001a\u00020\u000eH\u0016¢\u0006\u0004\bI\u0010\u0016J\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0016¢\u0006\u0004\bN\u0010\u0016J\r\u0010O\u001a\u00020\u0017¢\u0006\u0004\bO\u0010\u0019J\u000f\u0010P\u001a\u00020\u000eH\u0016¢\u0006\u0004\bP\u0010\u0016J\u0019\u0010R\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u000e¢\u0006\u0004\bT\u0010\u0016J\u000f\u0010U\u001a\u00020\u000eH\u0002¢\u0006\u0004\bU\u0010\u0016J\u0017\u0010V\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bX\u0010WJ\u0017\u0010Z\u001a\u00020Y2\u0006\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\"H\u0002¢\u0006\u0004\b\\\u0010$J\u000f\u0010]\u001a\u00020\u000eH\u0002¢\u0006\u0004\b]\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010^R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010o\u001a\u00020n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010v\u001a\u00020u8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R,\u0010~\u001a\b\u0012\u0004\u0012\u00020}0|8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\r\u001a\t\u0012\u0004\u0012\u00020\f0\u009d\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u009e\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010¡\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R \u0010ª\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\bª\u0001\u0010 \u0001\u0012\u0005\b«\u0001\u0010\u0016R\u0017\u0010¬\u0001\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0017\u0010®\u0001\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u00ad\u0001R\u0017\u0010¯\u0001\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010\u00ad\u0001R\u0019\u0010°\u0001\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u00ad\u0001R\u0018\u0010²\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0015\u0010·\u0001\u001a\u00030´\u00018F¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0015\u0010»\u0001\u001a\u00030¸\u00018F¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001¨\u0006½\u0001"}, d2 = {"Lru/yandex/taxi/order/view/OrderView;", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/order/OrderMvpView;", "Lnwy0;", "Landroid/content/Context;", "context", "Lga80;", "orderViewComponent", "Lfa80;", "fragmentCallback", "<init>", "(Landroid/content/Context;Lga80;Lfa80;)V", "Lcom/yandex/go/taxi/order/state/OrderStateView$a;", "orderExpandStateListener", "Lzy11;", "setOrderExpandStateListener", "(Lcom/yandex/go/taxi/order/state/OrderStateView$a;)V", "Lru/yandex/taxi/order/view/OrderView$a;", "listCallback", "setListCallback", "(Lru/yandex/taxi/order/view/OrderView$a;)V", "onAttachedToWindow", "()V", "", "hasStateView", "()Z", "onDetachedFromWindow", "Lru/yandex/taxi/object/DriveState;", "oldState", "newState", "Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;", "mode", "changeCardContent", "(Lru/yandex/taxi/object/DriveState;Lru/yandex/taxi/object/DriveState;Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;)V", "", "getStateViewPeekHeight", "()I", "getViewTopOffset", "getStateViewAnchorHeight", "onBackPressed", "Lru/yandex/taxi/order/OrderMvpView$State;", ClidProvider.STATE, "setState", "(Lru/yandex/taxi/order/OrderMvpView$State;Lcom/yandex/go/taxi/order/state/OrderStateView$Mode;)V", "setBottomSheetState", "(I)V", "isInSearchState", "isInCompleteState", "updateArrow", "driveState", "updateArrowViewBehaviour", "(Lru/yandex/taxi/object/DriveState;)V", "hideWarning", "hidePaidDiscountDialog", "Lcom/yandex/go/taxi/order/change/route/RouteChangeWarning;", "warning", "showRouteChangeWarning", "(Lcom/yandex/go/taxi/order/change/route/RouteChangeWarning;)V", "hasPopupsShown", "dispatchRatingClick", "dismissSelf", "negative", "openAfterFeedbackInfo", "(Z)V", "Lqim;", "driver", "showDriver", "(Lqim;)V", "", "previousValue", "showTipsInput", "(Ljava/lang/String;)V", "resetScroll", "showOrderInfo", "Lv770;", "openReason", "showPromocodeSharing", "(Lv770;)V", "disableFocusOnPinWhenZooming", "isCanBeExpandedFromAnchored", "checkCardState", "La741;", "renderWalkingInfo", "(La741;)V", "onContainerViewTransitionFinished", "initCard", "isSearchState", "(Lru/yandex/taxi/order/OrderMvpView$State;)Z", "isCompleteState", "Ljava/util/function/IntConsumer;", "getUpdateArrowStrategy", "(Lru/yandex/taxi/object/DriveState;)Ljava/util/function/IntConsumer;", "getWalkingInfoHeight", "onWalkingRouteCancel", "Lga80;", "Lfa80;", "Lcom/yandex/go/taxi/order/view/e;", "orderPresenter", "Lcom/yandex/go/taxi/order/view/e;", "getOrderPresenter", "()Lcom/yandex/go/taxi/order/view/e;", "setOrderPresenter", "(Lcom/yandex/go/taxi/order/view/e;)V", "Lney;", "lifecycle", "Lney;", "getLifecycle", "()Lney;", "setLifecycle", "(Lney;)V", "Lci70;", "orderAnalyticsReporter", "Lci70;", "getOrderAnalyticsReporter", "()Lci70;", "setOrderAnalyticsReporter", "(Lci70;)V", "Lcom/yandex/go/taxi/order/experiments/h;", "searchProgressExperimentProvider", "Lcom/yandex/go/taxi/order/experiments/h;", "getSearchProgressExperimentProvider", "()Lcom/yandex/go/taxi/order/experiments/h;", "setSearchProgressExperimentProvider", "(Lcom/yandex/go/taxi/order/experiments/h;)V", "Lh3y;", "Lk1l0;", "routeChangeRouter", "Lh3y;", "getRouteChangeRouter", "()Lh3y;", "setRouteChangeRouter", "(Lh3y;)V", "Loep0;", "screenStackNavigator", "Loep0;", "getScreenStackNavigator", "()Loep0;", "setScreenStackNavigator", "(Loep0;)V", "Landroid/view/ViewGroup;", "detailsCardLayout", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/widget/ArrowsView;", "arrowsView", "Lru/yandex/taxi/widget/ArrowsView;", "Landroid/widget/FrameLayout;", "orderStateViewFrame", "Landroid/widget/FrameLayout;", "Lru/yandex/taxi/order/view/walking_info/WalkingInfoView;", "walkingInfoBlock", "Lru/yandex/taxi/order/view/walking_info/WalkingInfoView;", "Landroid/view/View;", "navigationBar", "Landroid/view/View;", "Lg18;", "orderStateViewCancellable", "Lg18;", "Llwf0;", "Llwf0;", "anchorViewPadding", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/order/view/OrderView$a;", "Lcom/yandex/go/taxi/order/state/OrderStateView;", "orderStateView", "Lcom/yandex/go/taxi/order/state/OrderStateView;", "currentState", "Lru/yandex/taxi/order/OrderMvpView$State;", "Lru/yandex/taxi/widget/dialog/AlertDialog;", "payedOptionDiscountDialog", "Lru/yandex/taxi/widget/dialog/AlertDialog;", "currentArrowState", "getCurrentArrowState$annotations", "defaultUpdateArrowStrategy", "Ljava/util/function/IntConsumer;", "searchProgressUpdateArrowStrategy", "redesignUpdateStrategy", "updateArrowStrategy", "Landroid/view/View$OnLayoutChangeListener;", "cardLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lqn70;", "getOrderCardInfo", "()Lqn70;", "orderCardInfo", "Lo2y0;", "getOrderHolder", "()Lo2y0;", "orderHolder", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderView extends LinearLayout implements OrderMvpView, nwy0 {
    public static final int $stable = 8;
    private final int anchorViewPadding;
    private final ArrowsView arrowsView;
    private final View.OnLayoutChangeListener cardLayoutChangeListener;
    private int currentArrowState;
    private OrderMvpView.State currentState;
    private final IntConsumer defaultUpdateArrowStrategy;
    public final ViewGroup detailsCardLayout;
    private final fa80 fragmentCallback;
    public ney lifecycle;
    private a listCallback;
    public final View navigationBar;
    public ci70 orderAnalyticsReporter;
    private final lwf0 orderExpandStateListener;
    public e orderPresenter;
    private OrderStateView orderStateView;
    private g18 orderStateViewCancellable;
    private final FrameLayout orderStateViewFrame;
    private final ga80 orderViewComponent;
    private AlertDialog payedOptionDiscountDialog;
    private final IntConsumer redesignUpdateStrategy;
    public h3y routeChangeRouter;
    public oep0 screenStackNavigator;
    public h searchProgressExperimentProvider;
    private final IntConsumer searchProgressUpdateArrowStrategy;
    private IntConsumer updateArrowStrategy;
    public final WalkingInfoView walkingInfoBlock;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/order/view/OrderView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void B4();

        void Bb();

        void checkCardState();

        void k0();

        void oc(DriveState driveState);

        void onWalkingRouteCancel();

        void setBottomSheetState(int i);
    }

    public OrderView(Context context, ga80 ga80Var, fa80 fa80Var) {
        super(context);
        this.orderViewComponent = ga80Var;
        this.fragmentCallback = fa80Var;
        ru.yandex.taxi.design.utils.c.q(this, zkh0.order_view, true);
        int i = p8h0.details_card_layout;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, i));
        this.detailsCardLayout = viewGroup;
        this.arrowsView = (ArrowsView) ((View) rp31.d(this, p8h0.arrows_view));
        this.orderStateViewFrame = (FrameLayout) ((View) rp31.d(this, p8h0.order_state_view_frame));
        this.walkingInfoBlock = (WalkingInfoView) ((View) rp31.d(this, p8h0.walking_info_block));
        this.navigationBar = (View) rp31.d(this, p8h0.navigation_bar);
        this.orderStateViewCancellable = g18.u1;
        this.orderExpandStateListener = pwf0.b(OrderStateView.a.class);
        this.anchorViewPadding = tje.r(mrg0.go_design_s_space, getContext());
        this.listCallback = (a) ((zxf0) pwf0.c(a.class));
        ea80 ea80Var = new ea80(0, this);
        this.defaultUpdateArrowStrategy = ea80Var;
        this.searchProgressUpdateArrowStrategy = new ea80(1, this);
        this.redesignUpdateStrategy = new ea80(2, this);
        this.updateArrowStrategy = ea80Var;
        this.cardLayoutChangeListener = new yln(7, this);
        l0g l0gVar = (l0g) ga80Var;
        this.orderPresenter = (e) l0gVar.t.get();
        c0g c0gVar = l0gVar.c;
        this.lifecycle = (ney) c0gVar.E0.get();
        this.orderAnalyticsReporter = (ci70) l0gVar.b.Ma.get();
        zzf zzfVar = c0gVar.z;
        this.searchProgressExperimentProvider = new h((rqo) zzfVar.C.get(), (com.yandex.go.taxi.order.repositories.c) zzfVar.bb.get());
        this.routeChangeRouter = i5m.a(l0gVar.e.e0);
        this.screenStackNavigator = (oep0) c0gVar.T.get();
        setOrientation(1);
        tje.i(viewGroup, 80, new ub60(11, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(OrderView orderView, t1w t1wVar) {
        xw31.y(t1wVar.g, orderView.detailsCardLayout);
        View view = orderView.navigationBar;
        int i = t1wVar.g;
        xw31.x(-i, view);
        ru.yandex.taxi.design.utils.c.C(i, orderView.navigationBar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cardLayoutChangeListener$lambda$0(OrderView orderView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        orderView.listCallback.Bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultUpdateArrowStrategy$lambda$0(OrderView orderView, int i) {
        orderView.currentArrowState = i;
        if (i == 3) {
            orderView.arrowsView.showArrowDown();
            return;
        }
        if (i == 4) {
            orderView.arrowsView.showArrowUp();
            return;
        }
        if (i != 6) {
            ArrowsView arrowsView = orderView.arrowsView;
            if (i != 7) {
                arrowsView.showArrowPlain();
                return;
            } else {
                arrowsView.hideArrow();
                return;
            }
        }
        boolean isInSearchState = orderView.isInSearchState();
        ArrowsView arrowsView2 = orderView.arrowsView;
        if (isInSearchState) {
            arrowsView2.showArrowDown();
        } else {
            arrowsView2.showArrowUp();
        }
    }

    private static /* synthetic */ void getCurrentArrowState$annotations() {
    }

    private final IntConsumer getUpdateArrowStrategy(DriveState state) {
        e orderPresenter = getOrderPresenter();
        y480 y480Var = orderPresenter.R;
        TaxiOrder b = orderPresenter.B.b();
        y480Var.a.getClass();
        return gs70.a(b).b ? this.redesignUpdateStrategy : (an91.i(state) && ((SearchProgressExperiment) ((qqo) getSearchProgressExperimentProvider().b.getValue()).b()).b) ? this.searchProgressUpdateArrowStrategy : this.defaultUpdateArrowStrategy;
    }

    private final int getWalkingInfoHeight() {
        if (this.walkingInfoBlock.getVisibility() == 8) {
            return 0;
        }
        int height = this.walkingInfoBlock.getHeight();
        WalkingInfoView walkingInfoView = this.walkingInfoBlock;
        Rect rect = xw31.a;
        ViewGroup.LayoutParams layoutParams = walkingInfoView.getLayoutParams();
        return (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : 0) + height;
    }

    private final void initCard() {
        this.detailsCardLayout.setPivotX(getContext().getResources().getDisplayMetrics().widthPixels / 2.0f);
        this.arrowsView.setState(ArrowsView.State.UP);
    }

    private final boolean isCompleteState(OrderMvpView.State state) {
        return state == OrderMvpView.State.COMPLETE;
    }

    private final boolean isSearchState(OrderMvpView.State state) {
        return state == OrderMvpView.State.SEARCH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(OrderView orderView) {
        e orderPresenter = orderView.getOrderPresenter();
        ((p) orderPresenter.N).b(orderPresenter.B);
        orderPresenter.O.b.A3(ry1.e);
        orderView.onWalkingRouteCancel();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1(OrderView orderView) {
        e orderPresenter = orderView.getOrderPresenter();
        ((p) orderPresenter.N).d(orderPresenter.B);
        return zy11.a;
    }

    private final void onWalkingRouteCancel() {
        this.walkingInfoBlock.setVisibility(8);
        this.listCallback.onWalkingRouteCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void redesignUpdateStrategy$lambda$0(OrderView orderView, int i) {
        orderView.arrowsView.hideArrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void searchProgressUpdateArrowStrategy$lambda$0(OrderView orderView, int i) {
        orderView.currentArrowState = i;
        orderView.arrowsView.showArrowPlain();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void changeCardContent(DriveState oldState, DriveState newState, OrderStateView.Mode mode) {
        OrderStateView searchStateView;
        updateArrowViewBehaviour(newState);
        this.orderStateViewCancellable.cancel();
        OrderStateView orderStateView = this.orderStateView;
        if (orderStateView != null) {
            this.orderStateViewFrame.removeView(orderStateView);
        }
        e orderPresenter = getOrderPresenter();
        orderPresenter.getClass();
        pa80 pa80Var = new pa80(new o480(orderPresenter));
        Context context = getContext();
        l0g l0gVar = (l0g) this.orderViewComponent;
        l0gVar.getClass();
        n0g n0gVar = new n0g(l0gVar.b, l0gVar.c, l0gVar.d, l0gVar.e, l0gVar.f, pa80Var);
        i3y i3yVar = na80.a;
        switch (ma80.a[newState.ordinal()]) {
            case 1:
            case 2:
                searchStateView = new SearchStateView(context, n0gVar);
                break;
            case 3:
            case 4:
                searchStateView = new ScheduledStateView(context, n0gVar);
                break;
            case 5:
                searchStateView = new CheckInStateView(context, n0gVar);
                break;
            case 6:
                searchStateView = new DrivingStateView(context, n0gVar);
                break;
            case 7:
                searchStateView = new WaitingStateView(context, n0gVar);
                break;
            case 8:
                searchStateView = new TransportingStateView(context, n0gVar);
                break;
            case 9:
                searchStateView = new CompleteStateView(context, n0gVar);
                break;
            default:
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(g8e.o("No view associated with state ", newState.name()));
                a3y0.m((a3y0) na80.a.getValue(), "createViewForState", illegalArgumentException, null, 4);
                throw illegalArgumentException;
        }
        this.orderStateView = searchStateView;
        this.orderStateViewFrame.addView(searchStateView, -1, -2);
        searchStateView.handleOrderViewMode(mode);
        this.orderStateViewCancellable = searchStateView.addListener((OrderStateView.a) ((nwf0) this.orderExpandStateListener).b);
        this.listCallback.oc(newState);
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void checkCardState() {
        this.listCallback.checkCardState();
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void disableFocusOnPinWhenZooming() {
        n080 n080Var = ((OrderFragment) ((ht10) this.fragmentCallback).b).getPresenter().H0;
        if (n080Var != null) {
            n080Var.disableFocusOnPinWhenZooming();
        }
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void dismissSelf() {
        OrderStackView orderStackView;
        ht10 ht10Var = (ht10) this.fragmentCallback;
        OrderFragment orderFragment = (OrderFragment) ht10Var.b;
        orderStackView = orderFragment.orderStackView;
        if (orderStackView == null) {
            ny61.g("Required value was null.");
        } else {
            orderStackView.removeOrderView(this, new sd30(14, orderFragment, (o2y0) ht10Var.c));
        }
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void dispatchRatingClick() {
        this.listCallback.k0();
    }

    public final ney getLifecycle() {
        ney neyVar = this.lifecycle;
        if (neyVar != null) {
            return neyVar;
        }
        return null;
    }

    public final ci70 getOrderAnalyticsReporter() {
        ci70 ci70Var = this.orderAnalyticsReporter;
        if (ci70Var != null) {
            return ci70Var;
        }
        return null;
    }

    public final qn70 getOrderCardInfo() {
        return (qn70) ((l0g) this.orderViewComponent).m.get();
    }

    public final o2y0 getOrderHolder() {
        o2y0 o2y0Var = ((l0g) this.orderViewComponent).a.a;
        q5z.i(o2y0Var);
        return o2y0Var;
    }

    public final e getOrderPresenter() {
        e eVar = this.orderPresenter;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    public final h3y getRouteChangeRouter() {
        h3y h3yVar = this.routeChangeRouter;
        if (h3yVar != null) {
            return h3yVar;
        }
        return null;
    }

    public final oep0 getScreenStackNavigator() {
        oep0 oep0Var = this.screenStackNavigator;
        if (oep0Var != null) {
            return oep0Var;
        }
        return null;
    }

    public final h getSearchProgressExperimentProvider() {
        h hVar = this.searchProgressExperimentProvider;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    public final int getStateViewAnchorHeight() {
        OrderStateView orderStateView = this.orderStateView;
        if (orderStateView == null) {
            return 0;
        }
        return orderStateView.anchorHeight() + this.anchorViewPadding + getWalkingInfoHeight();
    }

    public final int getStateViewPeekHeight() {
        OrderStateView orderStateView = this.orderStateView;
        if (orderStateView == null) {
            return 0;
        }
        return orderStateView.peekHeight() + getWalkingInfoHeight();
    }

    public final int getViewTopOffset() {
        OrderStateView orderStateView = this.orderStateView;
        if (orderStateView == null) {
            return 0;
        }
        return w791.c(this.detailsCardLayout, orderStateView);
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public boolean hasPopupsShown() {
        ModalView modalView;
        if (this.payedOptionDiscountDialog != null || gtq0.u((m950) getRouteChangeRouter().get())) {
            return true;
        }
        modalView = ((OrderFragment) ((ht10) this.fragmentCallback).b).suggestedDestinationsModalView;
        return modalView != null || gtq0.u((m950) ((OrderFragment) ((ht10) this.fragmentCallback).b).getPresenter().K0.getValue());
    }

    public final boolean hasStateView() {
        return this.orderStateView != null;
    }

    public final void hidePaidDiscountDialog() {
        AlertDialog alertDialog = this.payedOptionDiscountDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.payedOptionDiscountDialog = null;
    }

    public final void hideWarning() {
        ((k1l0) getRouteChangeRouter().get()).i();
    }

    public final boolean isCanBeExpandedFromAnchored() {
        OrderStateView orderStateView = this.orderStateView;
        return orderStateView != null && orderStateView.isCanBeExpandedFromAnchored();
    }

    public final boolean isInCompleteState() {
        OrderMvpView.State state = this.currentState;
        if (state == null) {
            return false;
        }
        return isCompleteState(state);
    }

    public final boolean isInSearchState() {
        OrderMvpView.State state = this.currentState;
        if (state == null) {
            return false;
        }
        return isSearchState(state);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initCard();
        getOrderPresenter().Bg(this);
        getLifecycle().a(new vb3(8, this), this);
        this.detailsCardLayout.addOnLayoutChangeListener(this.cardLayoutChangeListener);
        final int i = 0;
        this.walkingInfoBlock.setOnCancelButtonClickListener(new sls(this) { // from class: da80
            public final /* synthetic */ OrderView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onAttachedToWindow$lambda$0;
                zy11 onAttachedToWindow$lambda$1;
                int i2 = i;
                OrderView orderView = this.b;
                switch (i2) {
                    case 0:
                        onAttachedToWindow$lambda$0 = OrderView.onAttachedToWindow$lambda$0(orderView);
                        return onAttachedToWindow$lambda$0;
                    default:
                        onAttachedToWindow$lambda$1 = OrderView.onAttachedToWindow$lambda$1(orderView);
                        return onAttachedToWindow$lambda$1;
                }
            }
        });
        final int i2 = 1;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: da80
            public final /* synthetic */ OrderView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onAttachedToWindow$lambda$0;
                zy11 onAttachedToWindow$lambda$1;
                int i22 = i2;
                OrderView orderView = this.b;
                switch (i22) {
                    case 0:
                        onAttachedToWindow$lambda$0 = OrderView.onAttachedToWindow$lambda$0(orderView);
                        return onAttachedToWindow$lambda$0;
                    default:
                        onAttachedToWindow$lambda$1 = OrderView.onAttachedToWindow$lambda$1(orderView);
                        return onAttachedToWindow$lambda$1;
                }
            }
        }, this.walkingInfoBlock);
        requestApplyInsets();
    }

    public final boolean onBackPressed() {
        OrderStateView orderStateView = this.orderStateView;
        if (orderStateView == null) {
            return false;
        }
        cby0 cby0Var = getOrderAnalyticsReporter().l;
        cby0Var.getClass();
        cby0Var.a.a("TaxiTracking.BackButton.Tapped", new HashMap(), 1, new HashMap());
        return orderStateView.onBackPressed();
    }

    public final void onContainerViewTransitionFinished() {
        OrderStateView orderStateView = this.orderStateView;
        if (orderStateView != null) {
            orderStateView.onContainerViewTransitionFinished();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        hidePaidDiscountDialog();
        super.onDetachedFromWindow();
        this.detailsCardLayout.removeOnLayoutChangeListener(this.cardLayoutChangeListener);
        this.orderStateViewCancellable.cancel();
        ((nwf0) this.orderExpandStateListener).a(null);
        getOrderPresenter().Cg();
        this.currentState = null;
        getLifecycle().d(this);
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void openAfterFeedbackInfo(boolean negative) {
        ht10 ht10Var = (ht10) this.fragmentCallback;
        i presenter = ((OrderFragment) ht10Var.b).getPresenter();
        ((f) presenter.J).i0((o2y0) ht10Var.c, negative);
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void renderWalkingInfo(a741 state) {
        this.walkingInfoBlock.setState(state);
    }

    public void resetScroll() {
        OrderStateView orderStateView = this.orderStateView;
        if (orderStateView != null) {
            orderStateView.resetScroll();
        }
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void setBottomSheetState(int state) {
        this.listCallback.setBottomSheetState(state);
    }

    public final void setLifecycle(ney neyVar) {
        this.lifecycle = neyVar;
    }

    public final void setListCallback(a listCallback) {
        this.listCallback = listCallback;
    }

    public final void setOrderAnalyticsReporter(ci70 ci70Var) {
        this.orderAnalyticsReporter = ci70Var;
    }

    public final void setOrderExpandStateListener(OrderStateView.a orderExpandStateListener) {
        ((nwf0) this.orderExpandStateListener).a(orderExpandStateListener);
    }

    public final void setOrderPresenter(e eVar) {
        this.orderPresenter = eVar;
    }

    public final void setRouteChangeRouter(h3y h3yVar) {
        this.routeChangeRouter = h3yVar;
    }

    public final void setScreenStackNavigator(oep0 oep0Var) {
        this.screenStackNavigator = oep0Var;
    }

    public final void setSearchProgressExperimentProvider(h hVar) {
        this.searchProgressExperimentProvider = hVar;
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void setState(OrderMvpView.State state, OrderStateView.Mode mode) {
        if (this.currentState == state) {
            return;
        }
        this.currentState = state;
        if (isCompleteState(state)) {
            hideWarning();
            ((OrderFragment) ((ht10) this.fragmentCallback).b).hideDestinationPicker();
            hidePaidDiscountDialog();
        }
        OrderStateView orderStateView = this.orderStateView;
        if (orderStateView != null) {
            orderStateView.resetScroll();
        }
        this.listCallback.B4();
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void showDriver(qim driver) {
        i presenter = ((OrderFragment) ((ht10) this.fragmentCallback).b).getPresenter();
        if (vez0.j0(presenter.y0, "Missing activeOrder")) {
            ((ww70) presenter.Dg()).Fa(driver);
        }
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void showOrderInfo() {
        ht10 ht10Var = (ht10) this.fragmentCallback;
        i presenter = ((OrderFragment) ht10Var.b).getPresenter();
        o2y0 o2y0Var = (o2y0) ht10Var.c;
        ga80 ga80Var = (ga80) presenter.I.e.get(o2y0Var);
        if (vez0.j0(ga80Var, "Missing OrderViewComponent")) {
            ww70 ww70Var = (ww70) presenter.Dg();
            if (ga80Var == null) {
                ny61.r("Required value was null.");
            } else {
                rim.a(o2y0Var.b());
                ww70Var.K6(ga80Var);
            }
        }
    }

    public void showPromocodeSharing(v770 openReason) {
        ht10 ht10Var = (ht10) this.fragmentCallback;
        i presenter = ((OrderFragment) ht10Var.b).getPresenter();
        if (((ga80) presenter.I.e.get((o2y0) ht10Var.c)) == null) {
            return;
        }
        ((ww70) presenter.Dg()).sc(openReason);
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void showRouteChangeWarning(RouteChangeWarning warning) {
        ((pep0) getScreenStackNavigator()).f((m950) getRouteChangeRouter().get(), new d1l0(getOrderHolder(), warning), hxx.a);
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void showTipsInput(String previousValue) {
        ht10 ht10Var = (ht10) this.fragmentCallback;
        i presenter = ((OrderFragment) ht10Var.b).getPresenter();
        ga80 ga80Var = (ga80) presenter.I.e.get((o2y0) ht10Var.c);
        if (vez0.j0(ga80Var, "Missing OrderViewComponent")) {
            ww70 ww70Var = (ww70) presenter.Dg();
            if (ga80Var != null) {
                ww70Var.S5(ga80Var, previousValue);
            } else {
                ny61.r("Required value was null.");
            }
        }
    }

    public final void updateArrow(int state) {
        this.updateArrowStrategy.accept(state);
    }

    @Override // ru.yandex.taxi.order.OrderMvpView
    public void updateArrowViewBehaviour(DriveState driveState) {
        this.updateArrowStrategy = getUpdateArrowStrategy(driveState);
        updateArrow(this.currentArrowState);
    }
}
