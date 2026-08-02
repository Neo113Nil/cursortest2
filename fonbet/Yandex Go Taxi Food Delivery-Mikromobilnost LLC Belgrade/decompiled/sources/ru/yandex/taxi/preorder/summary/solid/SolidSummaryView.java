package ru.yandex.taxi.preorder.summary.solid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.summary.analytics.SummaryAnalytics$LegacySummaryCardCloseMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import com.yandex.go.tariffcard.common.CardType;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import com.yandex.go.taxi.auction.ui.AuctionView;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.shared.analytics.TrapModeCloseReason;
import com.yandex.go.taxi.summary.shared.expanded.SummaryExpandedView$ScrollingState;
import com.yandex.go.taxi.summary.ui.SafeCoordinatorLayout;
import com.yandex.go.zone.dto.objects.VerticalMode;
import defpackage.a3v;
import defpackage.a7t0;
import defpackage.ah00;
import defpackage.ajv0;
import defpackage.amp0;
import defpackage.arb1;
import defpackage.arv0;
import defpackage.b1h0;
import defpackage.bdv0;
import defpackage.bhv0;
import defpackage.bov0;
import defpackage.ci70;
import defpackage.cma1;
import defpackage.cpv0;
import defpackage.dai;
import defpackage.dfh0;
import defpackage.djt0;
import defpackage.dpv0;
import defpackage.dzg0;
import defpackage.e6t0;
import defpackage.e7t0;
import defpackage.efv0;
import defpackage.eh2;
import defpackage.ehv0;
import defpackage.eit0;
import defpackage.ejt0;
import defpackage.epj0;
import defpackage.epo0;
import defpackage.erv0;
import defpackage.f0l0;
import defpackage.f6t0;
import defpackage.fco;
import defpackage.fjv0;
import defpackage.fnx0;
import defpackage.fpv0;
import defpackage.frv0;
import defpackage.g18;
import defpackage.g1a0;
import defpackage.g7t0;
import defpackage.gvz0;
import defpackage.h1g;
import defpackage.h3y;
import defpackage.h7t0;
import defpackage.hfv0;
import defpackage.hnx0;
import defpackage.ho4;
import defpackage.hos0;
import defpackage.hpo;
import defpackage.hpv0;
import defpackage.i130;
import defpackage.i7t0;
import defpackage.ijv0;
import defpackage.ipo;
import defpackage.irv0;
import defpackage.is60;
import defpackage.j6t0;
import defpackage.j7t0;
import defpackage.jdj;
import defpackage.jgv0;
import defpackage.jl40;
import defpackage.jpe;
import defpackage.jpv0;
import defpackage.jqr;
import defpackage.jst;
import defpackage.ju9;
import defpackage.k6t0;
import defpackage.k7t0;
import defpackage.khv0;
import defpackage.l7t0;
import defpackage.l89;
import defpackage.l9e;
import defpackage.lcv0;
import defpackage.lfv0;
import defpackage.m6t0;
import defpackage.m7t0;
import defpackage.mi31;
import defpackage.mrg0;
import defpackage.n070;
import defpackage.n6t0;
import defpackage.ncv0;
import defpackage.ney;
import defpackage.ngv0;
import defpackage.nnm;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.nzm;
import defpackage.o3;
import defpackage.o400;
import defpackage.ocv0;
import defpackage.od8;
import defpackage.oep0;
import defpackage.orx0;
import defpackage.osi;
import defpackage.osx0;
import defpackage.p7t0;
import defpackage.p81;
import defpackage.pav;
import defpackage.pcv0;
import defpackage.pe31;
import defpackage.pex0;
import defpackage.pwf0;
import defpackage.q7t0;
import defpackage.qdj0;
import defpackage.qje;
import defpackage.qov0;
import defpackage.qp00;
import defpackage.qpv0;
import defpackage.qr31;
import defpackage.qvz0;
import defpackage.r7t0;
import defpackage.rft0;
import defpackage.rp00;
import defpackage.rpt0;
import defpackage.rpv0;
import defpackage.rsg0;
import defpackage.s7t0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sls;
import defpackage.suh;
import defpackage.t1w;
import defpackage.t7t0;
import defpackage.t8;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;
import defpackage.u45;
import defpackage.u49;
import defpackage.ugv0;
import defpackage.uqs;
import defpackage.uyj;
import defpackage.v030;
import defpackage.vb3;
import defpackage.vev0;
import defpackage.vgv0;
import defpackage.viv0;
import defpackage.vng;
import defpackage.w030;
import defpackage.w0g;
import defpackage.w511;
import defpackage.wfh0;
import defpackage.win;
import defpackage.wiq0;
import defpackage.wrh0;
import defpackage.x4e;
import defpackage.xcv0;
import defpackage.xg;
import defpackage.xng0;
import defpackage.xvf0;
import defpackage.xw31;
import defpackage.yma;
import defpackage.yvf0;
import defpackage.z0a0;
import defpackage.z6t0;
import defpackage.z880;
import defpackage.zi70;
import defpackage.zxs0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LocationButtonIconComponent;
import ru.yandex.taxi.design.button.OrderButtonComponent;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.TariffsSelectorView$SelectorViewType;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.solid.cardhandler.SummaryArrowsView;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;
import ru.yandex.taxi.summary.solid.p;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.tooltips.CashbackAvailableTooltipPopup;
import ru.yandex.taxi.tooltips.CashbackTariffTooltipPopup;
import ru.yandex.taxi.widget.AnyTouchCatcherFrameLayout;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;
import ru.yandex.taxi.widget.views.SlideableShadowView;

@Metadata(d1 = {"\u0000ä\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 í\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\f\u008e\u0002î\u0002ï\u0002\u0097\u0002ð\u0002ñ\u0002B\u0081\u0003\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010P\u001a\u00020O\u0012\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010[\u001a\u00020Z\u0012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0Q¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H\u0014¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020`H\u0014¢\u0006\u0004\bc\u0010bJ\u0017\u0010f\u001a\u00020`2\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020`¢\u0006\u0004\bh\u0010bJ\u000f\u0010i\u001a\u00020`H\u0016¢\u0006\u0004\bi\u0010bJ\r\u0010j\u001a\u00020`¢\u0006\u0004\bj\u0010bJ\r\u0010l\u001a\u00020k¢\u0006\u0004\bl\u0010mJ\r\u0010o\u001a\u00020n¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020q2\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bv\u0010wJ/\u0010|\u001a\u00020`2\u0006\u0010x\u001a\u00020n2\u0006\u0010y\u001a\u00020n2\u0006\u0010z\u001a\u00020n2\u0006\u0010{\u001a\u00020nH\u0014¢\u0006\u0004\b|\u0010}J\u001a\u0010\u0080\u0001\u001a\u00020`2\u0006\u0010\u007f\u001a\u00020~H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u000f\u0010\u0082\u0001\u001a\u00020q¢\u0006\u0005\b\u0082\u0001\u0010sJ\u001c\u0010\u0085\u0001\u001a\u00020`2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0087\u0001\u001a\u00020`2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u001c\u0010\u008a\u0001\u001a\u00020`2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008c\u0001\u001a\u00020`H\u0016¢\u0006\u0005\b\u008c\u0001\u0010bJM\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0004¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020qH\u0016¢\u0006\u0005\b\u009a\u0001\u0010sJ\u0011\u0010\u009b\u0001\u001a\u00020qH\u0016¢\u0006\u0005\b\u009b\u0001\u0010sJ\u0011\u0010\u009c\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b\u009c\u0001\u0010bJ\u0011\u0010\u009d\u0001\u001a\u00020nH\u0002¢\u0006\u0005\b\u009d\u0001\u0010pJ\u0011\u0010\u009e\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b\u009e\u0001\u0010bJ\u0011\u0010\u009f\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b\u009f\u0001\u0010bJ\u0011\u0010 \u0001\u001a\u00020`H\u0002¢\u0006\u0005\b \u0001\u0010bJ\u0011\u0010¡\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b¡\u0001\u0010bJ\u001c\u0010¢\u0001\u001a\u00020`2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0002¢\u0006\u0006\b¢\u0001\u0010\u008b\u0001J\u0011\u0010£\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b£\u0001\u0010bJ\u0011\u0010¤\u0001\u001a\u00020nH\u0002¢\u0006\u0005\b¤\u0001\u0010pJ\u0011\u0010¥\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b¥\u0001\u0010bJ\u0011\u0010¦\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b¦\u0001\u0010bJ\u0011\u0010§\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b§\u0001\u0010bJ$\u0010ª\u0001\u001a\u00020`2\u0007\u0010¨\u0001\u001a\u00020n2\u0007\u0010©\u0001\u001a\u00020qH\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J1\u0010±\u0001\u001a\u00020`2\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00012\b\u0010¯\u0001\u001a\u00030®\u00012\u0007\u0010°\u0001\u001a\u00020qH\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001b\u0010´\u0001\u001a\u00020`2\u0007\u0010³\u0001\u001a\u00020qH\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001e\u0010¸\u0001\u001a\u00020`2\n\b\u0001\u0010·\u0001\u001a\u00030¶\u0001H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001e\u0010»\u0001\u001a\u00020`2\n\b\u0001\u0010º\u0001\u001a\u00030¶\u0001H\u0002¢\u0006\u0006\b»\u0001\u0010¹\u0001J\u001e\u0010¼\u0001\u001a\u00020`2\n\b\u0001\u0010º\u0001\u001a\u00030¶\u0001H\u0002¢\u0006\u0006\b¼\u0001\u0010¹\u0001J\u001b\u0010¾\u0001\u001a\u00020`2\u0007\u0010½\u0001\u001a\u00020qH\u0002¢\u0006\u0006\b¾\u0001\u0010µ\u0001J\u0011\u0010¿\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b¿\u0001\u0010bJ\u0011\u0010À\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÀ\u0001\u0010bJ\u0011\u0010Á\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÁ\u0001\u0010bJ\u0011\u0010Â\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÂ\u0001\u0010bJ\u0011\u0010Ã\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÃ\u0001\u0010bJ\u0011\u0010Ä\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÄ\u0001\u0010bJ\u001a\u0010Å\u0001\u001a\u00020`2\u0006\u0010\u007f\u001a\u00020~H\u0002¢\u0006\u0006\bÅ\u0001\u0010\u0081\u0001J\u001b\u0010Ç\u0001\u001a\u00020q2\u0007\u0010Æ\u0001\u001a\u00020qH\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J$\u0010Ë\u0001\u001a\u00020q2\u0007\u0010É\u0001\u001a\u00020k2\u0007\u0010Ê\u0001\u001a\u00020tH\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u0011\u0010Í\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÍ\u0001\u0010bJ\u0011\u0010Î\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÎ\u0001\u0010bJ\u001d\u0010Ò\u0001\u001a\u00030Ñ\u00012\b\u0010Ð\u0001\u001a\u00030Ï\u0001H\u0002¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J%\u0010Õ\u0001\u001a\u00020q2\b\u0010¨\u0001\u001a\u00030Ô\u00012\u0007\u0010Æ\u0001\u001a\u00020qH\u0002¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J%\u0010Ø\u0001\u001a\u00020`2\b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0007\u0010×\u0001\u001a\u00020qH\u0002¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u0011\u0010Ú\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÚ\u0001\u0010bJ\u0011\u0010Û\u0001\u001a\u00020`H\u0002¢\u0006\u0005\bÛ\u0001\u0010bJ$\u0010Þ\u0001\u001a\u00020`2\u0010\u0010Ý\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010k0Ü\u0001H\u0002¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u0013\u0010á\u0001\u001a\u00030à\u0001H\u0002¢\u0006\u0006\bá\u0001\u0010â\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010ã\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010ä\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010å\u0001R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010æ\u0001R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010ç\u0001R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010è\u0001R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010é\u0001R\u0015\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010ê\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010ë\u0001R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010ì\u0001R\u0015\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010í\u0001R\u0015\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010î\u0001R\u0015\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010ï\u0001R\u0015\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010ð\u0001R\u0015\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010ñ\u0001R\u0015\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010ò\u0001R\u0015\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b>\u0010ó\u0001R\u0015\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b@\u0010ô\u0001R\u0015\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010õ\u0001R\u0015\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010ö\u0001R\u0015\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010÷\u0001R\u0015\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010ø\u0001R\u0015\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010ù\u0001R\u0015\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010ú\u0001R\u0015\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010û\u0001R\u0015\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bP\u0010ü\u0001R\u001b\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010ý\u0001R\u0015\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010þ\u0001R\u0015\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010ÿ\u0001R\u0015\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bY\u0010\u0080\u0002R\u0015\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0081\u0002R\u001b\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0Q8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b]\u0010ý\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R\u001a\u0010\u0086\u0002\u001a\u00030\u0085\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001a\u0010\u0088\u0002\u001a\u00030\u0085\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0087\u0002R\u0017\u0010\u0089\u0002\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R\u001e\u0010\u008c\u0002\u001a\t\u0012\u0004\u0012\u00020k0\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001c\u0010\u008f\u0002\u001a\u00070\u008e\u0002R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0018\u0010\u0091\u0002\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0093\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0017\u0010\u0096\u0002\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u008a\u0002R\u001c\u0010\u0098\u0002\u001a\u00070\u0097\u0002R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0018\u0010\u009b\u0002\u001a\u00030\u009a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0019\u0010\u009d\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0019\u0010\u009f\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010\u009e\u0002R\u0019\u0010 \u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0002\u0010\u009e\u0002R\u001c\u0010¢\u0002\u001a\u0005\u0018\u00010¡\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u0019\u0010¤\u0002\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010\u008a\u0002R\u0019\u0010¥\u0002\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010\u008a\u0002R\u0019\u0010¦\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010\u009e\u0002R\u001a\u0010§\u0002\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R\u0017\u0010©\u0002\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0002\u0010\u008a\u0002R\u0017\u0010ª\u0002\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0002\u0010\u008a\u0002R\u001a\u0010«\u0002\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010¨\u0002R\u0019\u0010¬\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u009e\u0002R\u0019\u0010\u00ad\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010\u009e\u0002R\u001c\u0010®\u0002\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\u001c\u0010°\u0002\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010¯\u0002R\u001c\u0010±\u0002\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010¯\u0002R\u0019\u0010²\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010\u009e\u0002R\u0019\u0010³\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010\u009e\u0002R\u0019\u0010´\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010\u009e\u0002R\u0019\u0010µ\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010\u009e\u0002R\u0019\u0010¶\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010\u009e\u0002R\u0017\u0010·\u0002\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0002\u0010\u008a\u0002R\u0018\u0010¹\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u0018\u0010»\u0002\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0002\u0010¼\u0002R\u0018\u0010¾\u0002\u001a\u00030½\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u0018\u0010Á\u0002\u001a\u00030À\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u0018\u0010Ä\u0002\u001a\u00030Ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u0018\u0010Æ\u0002\u001a\u00030Ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010Å\u0002R\u001c\u0010È\u0002\u001a\u0005\u0018\u00010Ç\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010É\u0002R\u0018\u0010Ê\u0002\u001a\u00030\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010\u0087\u0002R\u0018\u0010Ì\u0002\u001a\u00030Ë\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R\u0018\u0010Ï\u0002\u001a\u00030Î\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0002\u0010Ð\u0002R\u001f\u0010Ò\u0002\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010Ñ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0002\u0010Ó\u0002R\u001a\u0010Ô\u0002\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010¯\u0002R\u0019\u0010Õ\u0002\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0002\u0010\u009e\u0002R\u001a\u0010×\u0002\u001a\u00030Ö\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0002\u0010Ø\u0002R\u0019\u0010Ù\u0002\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0002\u0010\u008a\u0002R\u0019\u0010Ú\u0002\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0002\u0010\u008a\u0002R\u001a\u0010Û\u0002\u001a\u00030Ö\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010Ø\u0002R\u0019\u0010Ü\u0002\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0002\u0010\u008a\u0002R\u0019\u0010Ý\u0002\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0002\u0010\u008a\u0002R\u0017\u0010Þ\u0002\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0002\u0010\u008a\u0002R\u0017\u0010ß\u0002\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0002\u0010\u008a\u0002R\u0018\u0010á\u0002\u001a\u00030à\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0002\u0010â\u0002R \u0010ä\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010k0ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0002\u0010å\u0002R\u0016\u0010æ\u0002\u001a\u00020q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bæ\u0002\u0010sR\u0016\u0010×\u0001\u001a\u00020q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010sR\u0016\u0010ç\u0002\u001a\u00020q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bç\u0002\u0010sR\u0016\u0010è\u0002\u001a\u00020q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bè\u0002\u0010sR\u0016\u0010é\u0002\u001a\u00020q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bé\u0002\u0010sR\u0016\u0010ê\u0002\u001a\u00020q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bê\u0002\u0010sR\u0018\u0010ì\u0002\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bë\u0002\u0010m¨\u0006ò\u0002"}, d2 = {"Lru/yandex/taxi/preorder/summary/solid/SolidSummaryView;", "Landroid/widget/FrameLayout;", "", "Lnwy0;", "Losx0;", "tariffsSelectorViewDependencies", "Larv0;", "summaryUiStateHolder", "Lru/yandex/taxi/utils/d;", "iconLoader", "Lh3y;", "Lfva0;", "performanceAnalytics", "Lj6t0;", "communicationsDelegateFactory", "Lngv0;", "headerHolderFactory", "Lgvz0;", "tooltipPlacementRepository", "Lncv0;", "controlCoordinatorDataFactory", "Lfrv0;", "summaryWidgetHolderFactory", "Lvev0;", "summaryConfig", "Lzi70;", "orderButtonPerformanceUiStateListener", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Li130;", "modalViewCoordinatorProvider", "Lw030;", "superAppModalViewCoordinator", "Lorx0;", "promoManager", "Lney;", "lifecycleObservable", "La3v;", "focusCoordinator", "Ljgv0;", "summaryFocusDelegate", "Lepj0;", "requirementsModalViewFactory", "Lru/yandex/taxi/preorder/summary/solid/l;", "presenter", "Lz0a0;", "paymentIconLoader", "Ljpe;", "cashbackTooltipPopupFactory", "Lru/yandex/taxi/summary/ui/SummaryStateTracker;", "summaryStateTracker", "Ltj60;", "notificationStackHolder", "Landroid/view/animation/Interpolator;", "alphaInterpolator", "Leh2;", "animationDelayHandler", "Lxg;", "accessibilityFullScreenBlocker", "Lsuh;", "deliveryAddStopPointHandler", "Ldjt0;", "sourcePointViewHolder", "Lqp00;", "mapObjectsOverlappingRepository", "Lhpo;", "expandedSummaryViewsHolderFactory", "Lqpv0;", "summaryTariffCardInteractor", "Llcv0;", "summaryAddressAnalytics", "Lhfv0;", "summaryExpandedViewPageFactory", "Lrft0;", "sourcePointFragmentNavigator", "Lbdv0;", "summaryAnalyticsReporter", "Lpav;", "imageLoader", "Lyvf0;", "Ld83;", "askNewStopRouterLazy", "Lf0l0;", "routeAnimationsHolder", "Lah00;", "mapController", "Loep0;", "screenStackNavigator", "Leit0;", "sourcePointRouteStopsV2MapInteractorFactory", "Lcom/yandex/go/taxi/summary/routestops/e;", "routeStopsV2RouteInteractor", "<init>", "(Losx0;Larv0;Lru/yandex/taxi/utils/d;Lh3y;Lj6t0;Lngv0;Lgvz0;Lncv0;Lfrv0;Lvev0;Lzi70;Landroid/content/Context;Ltse;Li130;Lw030;Lorx0;Lney;La3v;Ljgv0;Lepj0;Lru/yandex/taxi/preorder/summary/solid/l;Lz0a0;Ljpe;Lru/yandex/taxi/summary/ui/SummaryStateTracker;Ltj60;Landroid/view/animation/Interpolator;Leh2;Lxg;Lsuh;Ldjt0;Lqp00;Lhpo;Lqpv0;Llcv0;Lhfv0;Lrft0;Lbdv0;Lpav;Lyvf0;Lf0l0;Lah00;Loep0;Leit0;Lyvf0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onResume", "onDismissingStart", "onPause", "Landroid/view/View;", "summaryTopView", "()Landroid/view/View;", "", "anchorHeight", "()I", "", "onBackPressed", "()Z", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lcom/yandex/go/taxi/summary/api/analytics/SummaryExpandReason;", CRLReasonCodeExtension.REASON, "showCurrentTariffCard", "(Lcom/yandex/go/taxi/summary/api/analytics/SummaryExpandReason;)V", "addressOnTop", "Ljava/lang/Runnable;", "runnable", "runWhenOpen", "(Ljava/lang/Runnable;)V", "runWhenClosed", "Lbov0;", "params", "reveal", "(Lbov0;)V", "hide", "Lru/yandex/taxi/widget/AnyTouchCatcherFrameLayout;", "container", "Lhnx0;", "selectionListener", "Lpe31;", "verticalIdHolder", "Lqr31;", "bubbleContainer", "Ln070;", "onSelectVertical", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/c;", "createTariffsView", "(Losx0;Lru/yandex/taxi/widget/AnyTouchCatcherFrameLayout;Lhnx0;Lpe31;Lqr31;Ln070;)Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/c;", "applyThemeForChildrenByDefault", "allowTraverse", "refreshStatusBarInsets", "topShadowOffset", "initBottomAnchorBehavior", "initLayoutParams", "onRevealFinished", "attachSummaryExpandedView", "onReveal", "onHide", "contentViewHeight", "actualizeSummaryPosition", "refreshBottomOffset", "updateFrameBackground", ClidProvider.STATE, "movedByUser", "onBehaviorStateChanged", "(IZ)V", "Lu45;", "current", "Lru/yandex/taxi/widget/modalview/ModalViewCoordinator$StackChangeType;", "stackChangeType", "isSuperAppCoordinator", "onModalStackChanged", "(Lu45;Lru/yandex/taxi/widget/modalview/ModalViewCoordinator$StackChangeType;Z)V", "isOverlapped", "onModalOverlapChange", "(Z)V", "", CaretView.ALPHA_PROPERTY, "onContentAlphaChanged", "(F)V", "slide", "updateTopContainerElevation", "onExpandedSummarySlideChanged", "isSummaryCollapsed", "updateSummaryContentState", "onStateChangeFinished", "onSourceTrailClicked", "onAddDestinationClicked", "onSourceAddressClicked", "onDestinationAddressClicked", "toggleSummaryStateByHandlerTap", "tryExpandToPager", "animate", "collapseToSummary", "(Z)Z", "v", "e", "onTouchCover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "onRequirementsClick", "onPaymentMethodClicked", "Lcom/yandex/go/zone/dto/objects/VerticalMode;", "mode", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/TariffsSelectorView$SelectorViewType;", "getSelectorType", "(Lcom/yandex/go/zone/dto/objects/VerticalMode;)Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/TariffsSelectorView$SelectorViewType;", "Ljpv0;", "prepareAnimation", "(Ljpv0;Z)Z", "isOpened", "runWhenStates", "(Ljava/lang/Runnable;Z)V", "refreshSummaryMargins", "refreshFocusSequence", "", "views", "setFocusSequence", "(Ljava/util/List;)V", "Lcom/yandex/go/summary/analytics/SummaryAnalytics$SummaryExpandingState;", "analyticsSummaryExpandingState", "()Lcom/yandex/go/summary/analytics/SummaryAnalytics$SummaryExpandingState;", "Ltse;", "Li130;", "Lw030;", "Lorx0;", "Lney;", "La3v;", "Ljgv0;", "Lepj0;", "Lru/yandex/taxi/preorder/summary/solid/l;", "Lz0a0;", "Ljpe;", "Lru/yandex/taxi/summary/ui/SummaryStateTracker;", "Ltj60;", "Landroid/view/animation/Interpolator;", "Leh2;", "Lxg;", "Lsuh;", "Ldjt0;", "Lqp00;", "Lhpo;", "Lqpv0;", "Llcv0;", "Lhfv0;", "Lrft0;", "Lbdv0;", "Lpav;", "Lyvf0;", "Lf0l0;", "Lah00;", "Loep0;", "Leit0;", "Lt7t0;", "binding", "Lt7t0;", "Lg18;", "modalCoordinatorCancellable", "Lg18;", "superAppModalCoordinatorCancellable", "backButtonShadowCompensation", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "summaryAnchorBehavior", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Ll7t0;", "summaryAnchorCallback", "Ll7t0;", "tariffsSelectorView", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/c;", "Lru/yandex/taxi/preorder/summary/solid/cardhandler/SummaryArrowsView;", "summaryArrowsView", "Lru/yandex/taxi/preorder/summary/solid/cardhandler/SummaryArrowsView;", "topSummaryBackgroundRes", "Lp7t0;", "innerMvpView", "Lp7t0;", "Ln6t0;", "solidSummaryOrderButtonsController", "Ln6t0;", "summaryOverlapped", "Z", "isOverlappedByUsualStack", "isOverlappedBySuperAppStack", "Lru/yandex/taxi/tooltips/CashbackAvailableTooltipPopup;", "cashbackAvailableTooltipPopup", "Lru/yandex/taxi/tooltips/CashbackAvailableTooltipPopup;", "statusBarHeight", "anchorOffset", "animatingToSummary", "lastContentAlpha", "F", "topContainerElevation", "topContainerTopMargin", "lastExpandedSummarySlide", "isExpandedSummarySlideEdgeOver", "isInsetsHandled", "redirectToTariffCardForPickingRequirementCallback", "Ljava/lang/Runnable;", "redirectToPickingRequirementCallback", "showRequirementsSelectorCallback", "revealFinished", "firstAnimateToAnchored", "isLastStateExpanded", "summarySizeChanged", "canBeExpanded", "defaultTariffBottomMargin", "Lru/yandex/taxi/summary/solid/d;", "communicationsDelegate", "Lru/yandex/taxi/summary/solid/d;", "viewGroupBubbleContainer", "Lqr31;", "Lf6t0;", "buttonHolder", "Lf6t0;", "Lcom/yandex/go/taxi/summary/ui/d;", "summaryHeaderHolder", "Lcom/yandex/go/taxi/summary/ui/d;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "summaryAutolocationButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "summaryRouteButton", "Lcom/yandex/go/tariffcard/common/a;", "expandedSummaryViewsHolder", "Lcom/yandex/go/tariffcard/common/a;", "insetsCancellable", "Lcom/yandex/go/taxi/summary/ui/a;", "summaryAddressControlCoordinator", "Lcom/yandex/go/taxi/summary/ui/a;", "Lerv0;", "surgeWidgetHolder", "Lerv0;", "Ljava/util/Deque;", "runOnStateFinished", "Ljava/util/Deque;", "bottomOffsetCanceller", "animatingState", "Landroid/graphics/Rect;", "lastFocusRect", "Landroid/graphics/Rect;", "routeTopMargin", "routeBottomMargin", "addToFavoritesRect", "plusTopOffset", "surgeTopOffset", "plusTopOffsetPadding", "surgeTopOffsetPadding", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lkotlin/Function0;", "topRightViewProvider", "Lsls;", "isHidden", "isDragging", "isExpandedToPager", "isCollapsedToSummary", "isTransitioning", "getFocusedExpandedView", "focusedExpandedView", "Companion", "q7t0", "r7t0", "ru/yandex/taxi/preorder/summary/solid/o", "m7t0", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SolidSummaryView extends FrameLayout implements nwy0 {
    private static final int BEHAVIOR_SUMMARY_COLLAPSED = 6;
    private static final float EXPANDED_SUMMARY_SLIDE_EDGE = 0.3f;
    public static final String NAME = "SolidSummaryView";
    private static final float SELECTOR_APPEARANCE_EDGE = 0.3f;
    private static final int SUMMARY_BOTTOM_CONTENT_Z_INDEX = 1;
    private static final int SUMMARY_BUTTON_Z_INDEX = 4;
    private static final int SUMMARY_CLICK_CATCHER_Z_INDEX = 2;
    private static final int SUMMARY_EXPANDED_STATE = 3;
    private static final int SUMMARY_TOP_CONTENT_Z_INDEX = 3;
    private final xg accessibilityFullScreenBlocker;
    private Rect addToFavoritesRect;
    private final Interpolator alphaInterpolator;
    private int anchorOffset;
    private boolean animatingState;
    private boolean animatingToSummary;
    private final eh2 animationDelayHandler;
    private final yvf0 askNewStopRouterLazy;
    private final int backButtonShadowCompensation;
    private final t7t0 binding;
    private Runnable bottomOffsetCanceller;
    private final f6t0 buttonHolder;
    private boolean canBeExpanded;
    private CashbackAvailableTooltipPopup cashbackAvailableTooltipPopup;
    private final jpe cashbackTooltipPopupFactory;
    private final ru.yandex.taxi.summary.solid.d communicationsDelegate;
    private final tse coroutineScope;
    private final int defaultTariffBottomMargin;
    private final suh deliveryAddStopPointHandler;
    private com.yandex.go.tariffcard.common.a expandedSummaryViewsHolder;
    private final hpo expandedSummaryViewsHolderFactory;
    private boolean firstAnimateToAnchored;
    private final a3v focusCoordinator;
    private final pav imageLoader;
    private final p7t0 innerMvpView;
    private final g18 insetsCancellable;
    private boolean isExpandedSummarySlideEdgeOver;
    private boolean isInsetsHandled;
    private boolean isLastStateExpanded;
    private boolean isOverlappedBySuperAppStack;
    private boolean isOverlappedByUsualStack;
    private float lastContentAlpha;
    private float lastExpandedSummarySlide;
    private Rect lastFocusRect;
    private final View.OnLayoutChangeListener layoutChangeListener;
    private final ney lifecycleObservable;
    private final ah00 mapController;
    private final qp00 mapObjectsOverlappingRepository;
    private g18 modalCoordinatorCancellable;
    private final i130 modalViewCoordinatorProvider;
    private final tj60 notificationStackHolder;
    private final z0a0 paymentIconLoader;
    private int plusTopOffset;
    private final int plusTopOffsetPadding;
    private final l presenter;
    private final orx0 promoManager;
    private Runnable redirectToPickingRequirementCallback;
    private Runnable redirectToTariffCardForPickingRequirementCallback;
    private final epj0 requirementsModalViewFactory;
    private boolean revealFinished;
    private final f0l0 routeAnimationsHolder;
    private int routeBottomMargin;
    private final yvf0 routeStopsV2RouteInteractor;
    private int routeTopMargin;
    private final Deque<Runnable> runOnStateFinished;
    private final oep0 screenStackNavigator;
    private Runnable showRequirementsSelectorCallback;
    private final n6t0 solidSummaryOrderButtonsController;
    private final rft0 sourcePointFragmentNavigator;
    private final eit0 sourcePointRouteStopsV2MapInteractorFactory;
    private final djt0 sourcePointViewHolder;
    private int statusBarHeight;
    private final lcv0 summaryAddressAnalytics;
    private final com.yandex.go.taxi.summary.ui.a summaryAddressControlCoordinator;
    private final bdv0 summaryAnalyticsReporter;
    private final AnchorBottomSheetBehavior<View> summaryAnchorBehavior;
    private final l7t0 summaryAnchorCallback;
    private final SummaryArrowsView summaryArrowsView;
    private final FloatButtonIconComponent summaryAutolocationButton;
    private final hfv0 summaryExpandedViewPageFactory;
    private final jgv0 summaryFocusDelegate;
    private final com.yandex.go.taxi.summary.ui.d summaryHeaderHolder;
    private boolean summaryOverlapped;
    private final FloatButtonIconComponent summaryRouteButton;
    private boolean summarySizeChanged;
    private final SummaryStateTracker summaryStateTracker;
    private final qpv0 summaryTariffCardInteractor;
    private g18 superAppModalCoordinatorCancellable;
    private final w030 superAppModalViewCoordinator;
    private int surgeTopOffset;
    private final int surgeTopOffsetPadding;
    private final erv0 surgeWidgetHolder;
    private final ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c tariffsSelectorView;
    private final int topContainerElevation;
    private final int topContainerTopMargin;
    private final sls topRightViewProvider;
    private final int topSummaryBackgroundRes;
    private final qr31 viewGroupBubbleContainer;
    public static final m7t0 Companion = new m7t0();
    private static final Object mapObjectsPauseOwner = new Object();

    public SolidSummaryView(osx0 osx0Var, arv0 arv0Var, ru.yandex.taxi.utils.d dVar, h3y h3yVar, j6t0 j6t0Var, ngv0 ngv0Var, gvz0 gvz0Var, ncv0 ncv0Var, frv0 frv0Var, vev0 vev0Var, zi70 zi70Var, Context context, tse tseVar, i130 i130Var, w030 w030Var, orx0 orx0Var, ney neyVar, a3v a3vVar, jgv0 jgv0Var, epj0 epj0Var, l lVar, z0a0 z0a0Var, jpe jpeVar, SummaryStateTracker summaryStateTracker, tj60 tj60Var, Interpolator interpolator, eh2 eh2Var, xg xgVar, suh suhVar, djt0 djt0Var, qp00 qp00Var, hpo hpoVar, qpv0 qpv0Var, lcv0 lcv0Var, hfv0 hfv0Var, rft0 rft0Var, bdv0 bdv0Var, pav pavVar, yvf0 yvf0Var, f0l0 f0l0Var, ah00 ah00Var, oep0 oep0Var, eit0 eit0Var, yvf0 yvf0Var2) {
        super(context);
        SolidSummaryView solidSummaryView;
        View O;
        View O2;
        View O3;
        View O4;
        View O5;
        View O6;
        View O7;
        this.coroutineScope = tseVar;
        this.modalViewCoordinatorProvider = i130Var;
        this.superAppModalViewCoordinator = w030Var;
        this.promoManager = orx0Var;
        this.lifecycleObservable = neyVar;
        this.focusCoordinator = a3vVar;
        this.summaryFocusDelegate = jgv0Var;
        this.requirementsModalViewFactory = epj0Var;
        this.presenter = lVar;
        this.paymentIconLoader = z0a0Var;
        this.cashbackTooltipPopupFactory = jpeVar;
        this.summaryStateTracker = summaryStateTracker;
        this.notificationStackHolder = tj60Var;
        this.alphaInterpolator = interpolator;
        this.animationDelayHandler = eh2Var;
        this.accessibilityFullScreenBlocker = xgVar;
        this.deliveryAddStopPointHandler = suhVar;
        this.sourcePointViewHolder = djt0Var;
        this.mapObjectsOverlappingRepository = qp00Var;
        this.expandedSummaryViewsHolderFactory = hpoVar;
        this.summaryTariffCardInteractor = qpv0Var;
        this.summaryAddressAnalytics = lcv0Var;
        this.summaryExpandedViewPageFactory = hfv0Var;
        this.sourcePointFragmentNavigator = rft0Var;
        this.summaryAnalyticsReporter = bdv0Var;
        this.imageLoader = pavVar;
        this.askNewStopRouterLazy = yvf0Var;
        this.routeAnimationsHolder = f0l0Var;
        this.mapController = ah00Var;
        this.screenStackNavigator = oep0Var;
        this.sourcePointRouteStopsV2MapInteractorFactory = eit0Var;
        this.routeStopsV2RouteInteractor = yvf0Var2;
        LayoutInflater.from(context).inflate(wrh0.solid_summary_view, this);
        int i = wfh0.navigation_bar;
        View O8 = cma1.O(i, this);
        if (O8 != null) {
            i = wfh0.solid_bubble_container;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i, this);
            if (frameLayout != null && (O = cma1.O((i = wfh0.solid_click_catcher), this)) != null) {
                i = wfh0.solid_container;
                FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, this);
                if (frameLayout2 != null) {
                    i = wfh0.solid_coordinator_view;
                    SafeCoordinatorLayout safeCoordinatorLayout = (SafeCoordinatorLayout) cma1.O(i, this);
                    if (safeCoordinatorLayout != null && (O2 = cma1.O((i = wfh0.solid_cover), this)) != null) {
                        i = wfh0.solid_summary_arrows_view;
                        SummaryArrowsView summaryArrowsView = (SummaryArrowsView) cma1.O(i, this);
                        if (summaryArrowsView != null) {
                            i = wfh0.solid_summary_bottom_buttons_container;
                            LinearLayout linearLayout = (LinearLayout) cma1.O(i, this);
                            if (linearLayout != null) {
                                i = wfh0.solid_summary_bottom_container;
                                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, this);
                                if (constraintLayout != null) {
                                    i = wfh0.solid_summary_content;
                                    DialogueComponent dialogueComponent = (DialogueComponent) cma1.O(i, this);
                                    if (dialogueComponent != null && (O3 = cma1.O((i = wfh0.solid_summary_dialog_header), this)) != null) {
                                        ho4.q(O3);
                                        i = wfh0.solid_summary_dots_view;
                                        DotsIndicatorComponent dotsIndicatorComponent = (DotsIndicatorComponent) cma1.O(i, this);
                                        if (dotsIndicatorComponent != null) {
                                            i = wfh0.solid_summary_expanded_container;
                                            FrameLayout frameLayout3 = (FrameLayout) cma1.O(i, this);
                                            if (frameLayout3 != null && (O4 = cma1.O((i = wfh0.solid_summary_options_badge), this)) != null) {
                                                i = wfh0.solid_summary_options_container;
                                                FrameLayout frameLayout4 = (FrameLayout) cma1.O(i, this);
                                                if (frameLayout4 != null) {
                                                    i = wfh0.solid_summary_order_button;
                                                    OrderButtonComponent orderButtonComponent = (OrderButtonComponent) cma1.O(i, this);
                                                    if (orderButtonComponent != null) {
                                                        i = wfh0.solid_summary_order_button_shadow;
                                                        ImageView imageView = (ImageView) cma1.O(i, this);
                                                        if (imageView != null) {
                                                            i = wfh0.solid_summary_payment_icon;
                                                            CompositePaymentIconsView compositePaymentIconsView = (CompositePaymentIconsView) cma1.O(i, this);
                                                            if (compositePaymentIconsView != null) {
                                                                i = wfh0.source_destination_container_top;
                                                                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, this);
                                                                if (goFrameLayout != null) {
                                                                    i = wfh0.summary_autolocation_button;
                                                                    LocationButtonIconComponent locationButtonIconComponent = (LocationButtonIconComponent) cma1.O(i, this);
                                                                    if (locationButtonIconComponent != null) {
                                                                        i = wfh0.summary_back_button;
                                                                        BackButtonIconComponent backButtonIconComponent = (BackButtonIconComponent) cma1.O(i, this);
                                                                        if (backButtonIconComponent != null && (O5 = cma1.O((i = wfh0.summary_dialog_content), this)) != null) {
                                                                            int i2 = wfh0.auction_view;
                                                                            ViewStub viewStub = (ViewStub) cma1.O(i2, O5);
                                                                            if (viewStub != null) {
                                                                                i2 = wfh0.solid_summary_bottom_edge;
                                                                                Space space = (Space) cma1.O(i2, O5);
                                                                                if (space != null) {
                                                                                    i2 = wfh0.solid_summary_bubbles_container;
                                                                                    RequirementsBubblesContainer requirementsBubblesContainer = (RequirementsBubblesContainer) cma1.O(i2, O5);
                                                                                    if (requirementsBubblesContainer != null) {
                                                                                        i2 = wfh0.solid_summary_bubbles_container_anchor;
                                                                                        if (((Space) cma1.O(i2, O5)) != null && (O6 = cma1.O((i2 = wfh0.solid_summary_tariffs_container), O5)) != null) {
                                                                                            int i3 = wfh0.tariffs_container;
                                                                                            AnyTouchCatcherFrameLayout anyTouchCatcherFrameLayout = (AnyTouchCatcherFrameLayout) cma1.O(i3, O6);
                                                                                            if (anyTouchCatcherFrameLayout == null) {
                                                                                                ny61.t("Missing required view with ID: ".concat(O6.getResources().getResourceName(i3)));
                                                                                                throw null;
                                                                                            }
                                                                                            win winVar = new win((FrameLayout) O6, anyTouchCatcherFrameLayout);
                                                                                            int i4 = wfh0.solid_summary_tooltip_container;
                                                                                            FrameLayout frameLayout5 = (FrameLayout) cma1.O(i4, O5);
                                                                                            if (frameLayout5 == null || (O7 = cma1.O((i4 = wfh0.solid_summary_trap_title), O5)) == null) {
                                                                                                i2 = i4;
                                                                                            } else {
                                                                                                ListItemComponent listItemComponent = (ListItemComponent) O7;
                                                                                                qdj0 qdj0Var = new qdj0(listItemComponent, 1);
                                                                                                int i5 = wfh0.source_destination_container;
                                                                                                FrameLayout frameLayout6 = (FrameLayout) cma1.O(i5, O5);
                                                                                                if (frameLayout6 != null) {
                                                                                                    nzm nzmVar = new nzm((ConstraintLayout) O5, viewStub, space, requirementsBubblesContainer, winVar, frameLayout5, qdj0Var, frameLayout6);
                                                                                                    int i6 = wfh0.summary_route_button;
                                                                                                    FloatButtonIconComponent floatButtonIconComponent = (FloatButtonIconComponent) cma1.O(i6, this);
                                                                                                    if (floatButtonIconComponent != null) {
                                                                                                        i6 = wfh0.surge_widget_view_container;
                                                                                                        FrameLayout frameLayout7 = (FrameLayout) cma1.O(i6, this);
                                                                                                        if (frameLayout7 != null) {
                                                                                                            i6 = wfh0.surge_widget_view_stub;
                                                                                                            ViewStub viewStub2 = (ViewStub) cma1.O(i6, this);
                                                                                                            if (viewStub2 != null) {
                                                                                                                this.binding = new t7t0(this, O8, frameLayout, O, frameLayout2, safeCoordinatorLayout, O2, summaryArrowsView, linearLayout, constraintLayout, dialogueComponent, dotsIndicatorComponent, frameLayout3, O4, frameLayout4, orderButtonComponent, imageView, compositePaymentIconsView, goFrameLayout, locationButtonIconComponent, backButtonIconComponent, nzmVar, floatButtonIconComponent, frameLayout7, viewStub2);
                                                                                                                dai daiVar = g18.u1;
                                                                                                                this.modalCoordinatorCancellable = daiVar;
                                                                                                                this.superAppModalCoordinatorCancellable = daiVar;
                                                                                                                this.backButtonShadowCompensation = tje.u(-4, getContext());
                                                                                                                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                                                                                                                if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                                                                                                                    ny61.g("The view is not a child of CoordinatorLayout");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                                                                                                                if (!(behavior instanceof AnchorBottomSheetBehavior)) {
                                                                                                                    ny61.g("The view is not associated with AnchorBottomSheetBehavior");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
                                                                                                                this.summaryAnchorBehavior = anchorBottomSheetBehavior;
                                                                                                                this.summaryAnchorCallback = new l7t0(this);
                                                                                                                int i7 = b1h0.bg_solid_summary_anchored;
                                                                                                                this.topSummaryBackgroundRes = i7;
                                                                                                                this.innerMvpView = new p7t0(this);
                                                                                                                this.solidSummaryOrderButtonsController = new n6t0(linearLayout);
                                                                                                                this.lastContentAlpha = -1.0f;
                                                                                                                this.topContainerElevation = tje.u(20, getContext());
                                                                                                                this.topContainerTopMargin = tje.r(mrg0.go_design_s_space, getContext());
                                                                                                                this.lastExpandedSummarySlide = -1.0f;
                                                                                                                this.firstAnimateToAnchored = true;
                                                                                                                qr31 qr31Var = new qr31(frameLayout, gvz0Var);
                                                                                                                this.viewGroupBubbleContainer = qr31Var;
                                                                                                                this.summaryAutolocationButton = locationButtonIconComponent;
                                                                                                                this.summaryRouteButton = floatButtonIconComponent;
                                                                                                                this.insetsCancellable = tje.i(safeCoordinatorLayout, 119, new e7t0(this, 1));
                                                                                                                this.surgeWidgetHolder = frv0Var.a(viewStub2);
                                                                                                                this.runOnStateFinished = new LinkedList();
                                                                                                                this.bottomOffsetCanceller = new hos0(1);
                                                                                                                this.lastFocusRect = new Rect();
                                                                                                                this.addToFavoritesRect = new Rect();
                                                                                                                this.plusTopOffsetPadding = tje.r(rsg0.summary_plus_top_offset_padding, context);
                                                                                                                this.surgeTopOffsetPadding = context.getResources().getDimensionPixelSize(rsg0.summary_surge_top_offset_padding);
                                                                                                                final int i8 = 0;
                                                                                                                this.layoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: f7t0
                                                                                                                    public final /* synthetic */ SolidSummaryView b;

                                                                                                                    {
                                                                                                                        this.b = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnLayoutChangeListener
                                                                                                                    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                                                                                                                        switch (i8) {
                                                                                                                            case 0:
                                                                                                                                this.b.refreshSummaryMargins();
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                this.b.actualizeSummaryPosition();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                };
                                                                                                                this.topRightViewProvider = new g7t0(this, i8);
                                                                                                                o3 o3Var = new o3(new g7t0(this, 1), new g7t0(this, 2));
                                                                                                                yma ymaVar = ((ocv0) ncv0Var).a;
                                                                                                                this.summaryAddressControlCoordinator = new com.yandex.go.taxi.summary.ui.a(new amp0(o3Var, (dpv0) ymaVar.a.a, (vev0) ymaVar.b.get()), new o(this), frameLayout3, dotsIndicatorComponent, frameLayout6, goFrameLayout, anchorBottomSheetBehavior, qpv0Var);
                                                                                                                OneShotPreDrawListener.add(this, new j7t0(this, 3));
                                                                                                                initBottomAnchorBehavior();
                                                                                                                initLayoutParams();
                                                                                                                h7t0 h7t0Var = new h7t0(this, 0);
                                                                                                                zxs0 zxs0Var = ((k6t0) j6t0Var).a;
                                                                                                                this.communicationsDelegate = new ru.yandex.taxi.summary.solid.d((p) ((ju9) zxs0Var.a).get(), (pav) ((xvf0) zxs0Var.b).get(), dialogueComponent, requirementsBubblesContainer, linearLayout, frameLayout5, imageView, h7t0Var, O4, viewStub);
                                                                                                                setFocusableInTouchMode(true);
                                                                                                                requestFocus();
                                                                                                                ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
                                                                                                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
                                                                                                                this.defaultTariffBottomMargin = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                                                                                                                int i9 = 0;
                                                                                                                r7t0 r7t0Var = new r7t0(i9, this);
                                                                                                                a7t0 a7t0Var = (a7t0) arv0Var;
                                                                                                                a7t0Var.getClass();
                                                                                                                ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c createTariffsView = createTariffsView(osx0Var, anyTouchCatcherFrameLayout, r7t0Var, new z6t0(i9, a7t0Var), qr31Var, new k7t0(lVar));
                                                                                                                this.tariffsSelectorView = createTariffsView;
                                                                                                                createTariffsView.e(getSelectorType(vev0Var.d));
                                                                                                                frameLayout2.setBackground(tje.y(i7, getContext()));
                                                                                                                safeCoordinatorLayout.addView(new SlideableShadowView(getContext(), wfh0.solid_container, new i7t0(this, 0)), 0);
                                                                                                                this.summaryArrowsView = summaryArrowsView;
                                                                                                                summaryArrowsView.setDrawHandlerDefault();
                                                                                                                setImportantForAccessibility(2);
                                                                                                                backButtonIconComponent.setDebounceClickListener(new epo0(26, this, context));
                                                                                                                final int i10 = 1;
                                                                                                                locationButtonIconComponent.setDebounceClickListener(new h7t0(this, i10));
                                                                                                                floatButtonIconComponent.setDebounceClickListener(new h7t0(this, 2));
                                                                                                                floatButtonIconComponent.setIconTintEnable(false);
                                                                                                                frameLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: f7t0
                                                                                                                    public final /* synthetic */ SolidSummaryView b;

                                                                                                                    {
                                                                                                                        this.b = this;
                                                                                                                    }

                                                                                                                    @Override // android.view.View.OnLayoutChangeListener
                                                                                                                    public final void onLayoutChange(View view, int i92, int i102, int i11, int i12, int i13, int i14, int i15, int i16) {
                                                                                                                        switch (i10) {
                                                                                                                            case 0:
                                                                                                                                this.b.refreshSummaryMargins();
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                this.b.actualizeSummaryPosition();
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                linearLayout.setZ(4.0f);
                                                                                                                linearLayout.setTranslationY(context.getResources().getDisplayMetrics().heightPixels);
                                                                                                                O.setZ(2.0f);
                                                                                                                O.setOnClickListener(new od8(7));
                                                                                                                updateSummaryContentState(true);
                                                                                                                this.buttonHolder = new f6t0(z0a0Var, compositePaymentIconsView, orderButtonComponent, frameLayout4, zi70Var, new h7t0(this, 3), new h7t0(this, 4), new h7t0(this, 5));
                                                                                                                this.summaryHeaderHolder = new com.yandex.go.taxi.summary.ui.d(ngv0Var.a, ngv0Var.b, ngv0Var.c, ngv0Var.d, listItemComponent, new e7t0(this, 0));
                                                                                                                androidx.core.view.b.q(listItemComponent, true);
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    solidSummaryView = this;
                                                                                                    i = i6;
                                                                                                    ny61.t("Missing required view with ID: ".concat(solidSummaryView.getResources().getResourceName(i)));
                                                                                                    throw null;
                                                                                                }
                                                                                                i2 = i5;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            ny61.t("Missing required view with ID: ".concat(O5.getResources().getResourceName(i2)));
                                                                            throw null;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        solidSummaryView = this;
        ny61.t("Missing required view with ID: ".concat(solidSummaryView.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View _init_$lambda$0(SolidSummaryView solidSummaryView) {
        return solidSummaryView.binding.r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View _init_$lambda$1(SolidSummaryView solidSummaryView) {
        return (View) solidSummaryView.topRightViewProvider.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$11(SolidSummaryView solidSummaryView) {
        l lVar = solidSummaryView.presenter;
        z880 z880Var = lVar.S0;
        if (((l89) z880Var).c) {
            jst.e.n("Taxi order was initiated from Summary Screen, but another order was in processing");
        } else {
            ((ci70) lVar.T0).E = Events$Summary$SummaryState.COLLAPSED;
            z880Var.a();
            jst.e.n("Taxi order was initiated from Summary Screen");
        }
        if (((com.yandex.go.taxi.tariffs.internal.repository.k) lVar.x).m() == null) {
            jst.e.x(new NullPointerException(), "Selected tariff should not be null");
        } else {
            lVar.F.a(lVar.y1.q());
            lVar.a0.a(TrapModeCloseReason.ORDER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$13(SolidSummaryView solidSummaryView, vgv0 vgv0Var) {
        if (jl40.l(vgv0Var, ugv0.b)) {
            solidSummaryView.onRequirementsClick();
        } else if (!jl40.l(vgv0Var, ugv0.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _init_$lambda$4(SolidSummaryView solidSummaryView) {
        return Integer.valueOf(solidSummaryView.topShadowOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(SolidSummaryView solidSummaryView, Context context) {
        solidSummaryView.presenter.X1.getClass();
        l lVar = solidSummaryView.presenter;
        if (lVar.B3.c(lVar.v3.a())) {
            return;
        }
        arb1.d(context).onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(SolidSummaryView solidSummaryView) {
        ((s) solidSummaryView.presenter.O0).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(SolidSummaryView solidSummaryView) {
        solidSummaryView.presenter.N1.a(lfv0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void actualizeSummaryPosition() {
        boolean z;
        int max = (int) Math.max(getHeight() - contentViewHeight(), 0.0d);
        ru.yandex.taxi.summary.solid.d dVar = this.communicationsDelegate;
        boolean z2 = !dVar.l || dVar.u;
        dVar.l = false;
        dVar.u = false;
        ru.yandex.taxi.preorder.summary.solid.sourcedestination.b bVar = this.summaryAddressControlCoordinator.l;
        if (bVar != null) {
            int height = bVar.a.getHeight();
            boolean z3 = height != bVar.u;
            bVar.u = height;
            if (!z3) {
                z = true;
                if (max != this.anchorOffset && this.revealFinished) {
                    this.anchorOffset = max;
                    boolean z4 = this.summaryAnchorBehavior.y() != 6 && z2 && z && !this.summarySizeChanged;
                    this.summaryAnchorBehavior.M(contentViewHeight(), z4);
                    this.summaryAnchorBehavior.I(0, z4, max);
                }
                this.summarySizeChanged = false;
                if (isCollapsedToSummary()) {
                    return;
                }
                this.binding.k.setVisibility(8);
                return;
            }
        }
        z = false;
        if (max != this.anchorOffset) {
            this.anchorOffset = max;
            if (this.summaryAnchorBehavior.y() != 6) {
            }
            this.summaryAnchorBehavior.M(contentViewHeight(), z4);
            this.summaryAnchorBehavior.I(0, z4, max);
        }
        this.summarySizeChanged = false;
        if (isCollapsedToSummary()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SummaryAnalytics$SummaryExpandingState analyticsSummaryExpandingState() {
        return isExpandedToPager() ? SummaryAnalytics$SummaryExpandingState.Expanded : SummaryAnalytics$SummaryExpandingState.Collapsed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachSummaryExpandedView() {
        if (this.expandedSummaryViewsHolder == null) {
            q7t0 q7t0Var = new q7t0(this);
            hpo hpoVar = this.expandedSummaryViewsHolderFactory;
            t7t0 t7t0Var = this.binding;
            FrameLayout frameLayout = t7t0Var.l;
            DotsIndicatorComponent dotsIndicatorComponent = t7t0Var.k;
            hfv0 hfv0Var = this.summaryExpandedViewPageFactory;
            AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.summaryAnchorBehavior;
            g7t0 g7t0Var = new g7t0(this, 3);
            jdj jdjVar = ((ipo) hpoVar).a;
            com.yandex.go.tariffcard.common.a aVar = new com.yandex.go.tariffcard.common.a(frameLayout, q7t0Var, dotsIndicatorComponent, hfv0Var, anchorBottomSheetBehavior, g7t0Var, (h1g) ((xvf0) jdjVar.b).get(), (wiq0) ((w0g) jdjVar.c).get(), (viv0) ((xvf0) jdjVar.w).get());
            this.expandedSummaryViewsHolder = aVar;
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 attachSummaryExpandedView$lambda$0(SolidSummaryView solidSummaryView) {
        solidSummaryView.refreshStatusBarInsets();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomOffsetCanceller$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean collapseToSummary(boolean animate) {
        if (isCollapsedToSummary()) {
            return false;
        }
        if (!this.animatingToSummary) {
            this.animatingToSummary = true;
            this.summaryAnchorBehavior.P(BEHAVIOR_SUMMARY_COLLAPSED, animate, false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int contentViewHeight() {
        return this.binding.j.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getFocusedExpandedView() {
        efv0 efv0Var;
        com.yandex.go.tariffcard.common.a aVar = this.expandedSummaryViewsHolder;
        if (aVar == null || (efv0Var = aVar.m) == null) {
            return null;
        }
        return efv0Var.getFocusedView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TariffsSelectorView$SelectorViewType getSelectorType(VerticalMode mode) {
        int i = s7t0.a[mode.ordinal()];
        if (i == 1) {
            return TariffsSelectorView$SelectorViewType.DOUBLE_SELECTOR;
        }
        if (i == 2) {
            return TariffsSelectorView$SelectorViewType.USUAL;
        }
        w511.b();
        return null;
    }

    private final void initBottomAnchorBehavior() {
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.summaryAnchorBehavior;
        anchorBottomSheetBehavior.C = false;
        anchorBottomSheetBehavior.M(0, false);
        anchorBottomSheetBehavior.P(4, false, false);
        anchorBottomSheetBehavior.W = false;
        anchorBottomSheetBehavior.Z = false;
        anchorBottomSheetBehavior.J(true);
        anchorBottomSheetBehavior.c0 = true;
    }

    private final void initLayoutParams() {
        setClipToPadding(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean insetsCancellable$lambda$0(SolidSummaryView solidSummaryView, t1w t1wVar) {
        View view = solidSummaryView.binding.b;
        int i = t1wVar.d;
        Rect rect = xw31.a;
        ru.yandex.taxi.design.utils.c.D(view.getLayoutParams().width, i, view);
        xw31.E(solidSummaryView.binding.f, null, null, null, Integer.valueOf(t1wVar.d));
        int i2 = solidSummaryView.statusBarHeight;
        int i3 = t1wVar.b;
        if (i2 != i3) {
            solidSummaryView.statusBarHeight = i3;
            solidSummaryView.refreshStatusBarInsets();
        }
        solidSummaryView.actualizeSummaryPosition();
        solidSummaryView.isInsetsHandled = true;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCollapsedToSummary() {
        return this.summaryAnchorBehavior.E == BEHAVIOR_SUMMARY_COLLAPSED && isOpened();
    }

    private final boolean isDragging() {
        return this.summaryAnchorBehavior.E == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isExpandedToPager() {
        return this.summaryAnchorBehavior.E == SUMMARY_EXPANDED_STATE && isOpened();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHidden() {
        jpv0 b = this.presenter.v3.b();
        b.getClass();
        return b instanceof fpv0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOpened() {
        jpv0 b = this.presenter.v3.b();
        b.getClass();
        return b instanceof hpv0;
    }

    private final boolean isTransitioning() {
        int i = this.summaryAnchorBehavior.E;
        return (i == 1 || i == 2) && isOpened();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$9$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddDestinationClicked() {
        ru.yandex.taxi.preorder.summary.solid.sourcedestination.b bVar = this.summaryAddressControlCoordinator.l;
        if (bVar != null) {
            bVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBehaviorStateChanged(int state, boolean movedByUser) {
        efv0 efv0Var;
        com.yandex.go.tariffcard.common.a aVar;
        onStateChangeFinished();
        x4e.z(state, this.presenter.v3.c, null);
        if (state == 6) {
            this.binding.h.setTranslationY(0.0f);
            if (this.firstAnimateToAnchored) {
                this.firstAnimateToAnchored = false;
            }
            if (!this.canBeExpanded) {
                this.summaryAnchorBehavior.a0 = false;
            }
        }
        this.summaryArrowsView.setVisibility(state != 3 || (aVar = this.expandedSummaryViewsHolder) == null || aVar.n == CardType.PAGER ? 0 : 8);
        int i = state == 3 ? 2 : 1;
        this.binding.p.setImportantForAccessibility(i);
        this.summaryAutolocationButton.setImportantForAccessibility(i);
        this.summaryRouteButton.setImportantForAccessibility(i);
        SummaryExpandedView$ScrollingState summaryExpandedView$ScrollingState = SummaryExpandedView$ScrollingState.LOCKED;
        vev0 vev0Var = (vev0) this.summaryAddressControlCoordinator.a.c;
        int i2 = (vev0Var.e || (vev0Var.a instanceof p81)) ? 8 : 0;
        if (isCollapsedToSummary()) {
            this.summaryAnchorBehavior.M = null;
            if (movedByUser) {
                l lVar = this.presenter;
                e6t0 e6t0Var = lVar.V;
                e6t0Var.getClass();
                e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.Pull);
                e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.Pull);
                lVar.X1.getClass();
            }
            this.binding.p.show();
            this.summaryStateTracker.a.l(SummaryStateTracker.SolidSummaryState.COLLAPSED);
            this.notificationStackHolder.g();
            if (this.isLastStateExpanded) {
                this.isLastStateExpanded = false;
                ((rp00) this.mapObjectsOverlappingRepository).b(mapObjectsPauseOwner);
                this.accessibilityFullScreenBlocker.c(this);
                ((irv0) this.surgeWidgetHolder).h.setImportantForAccessibility(1);
                summaryTopView().setImportantForAccessibility(1);
            }
            i2 = 8;
        } else if (isExpandedToPager()) {
            com.yandex.go.tariffcard.common.a aVar2 = this.expandedSummaryViewsHolder;
            if (aVar2 != null) {
                AnchorBottomSheetBehavior anchorBottomSheetBehavior = aVar2.e;
                efv0 efv0Var2 = aVar2.m;
                anchorBottomSheetBehavior.L(efv0Var2 != null ? efv0Var2.getFocusedView() : null);
            }
            summaryExpandedView$ScrollingState = SummaryExpandedView$ScrollingState.UNLOCKED;
            if (movedByUser) {
                this.presenter.Ng(SummaryExpandReason.PULL);
            }
            this.binding.p.hide();
            ((com.yandex.go.preorder.map.a) this.routeAnimationsHolder).a(false);
            ((rp00) this.mapObjectsOverlappingRepository).a(mapObjectsPauseOwner);
            this.summaryStateTracker.a.l(SummaryStateTracker.SolidSummaryState.EXPANDED);
            this.notificationStackHolder.b();
            if (!this.isLastStateExpanded) {
                this.isLastStateExpanded = true;
                xg.b(this.accessibilityFullScreenBlocker, this, (ViewGroup) getParent().getParent().getParent().getParent(), 4);
                ((irv0) this.surgeWidgetHolder).h.setImportantForAccessibility(4);
                rpv0 rpv0Var = (rpv0) this.summaryTariffCardInteractor;
                if (rpv0Var.a.g(((com.yandex.go.taxi.tariffs.internal.repository.k) rpv0Var.b).h())) {
                    summaryTopView().setImportantForAccessibility(4);
                }
            }
        } else if (isTransitioning()) {
            this.summaryStateTracker.a.l(SummaryStateTracker.SolidSummaryState.TRANSITIONING);
        }
        this.solidSummaryOrderButtonsController.a.setVisibility(state == 3 ? 8 : 0);
        com.yandex.go.tariffcard.common.a aVar3 = this.expandedSummaryViewsHolder;
        if (aVar3 != null && (efv0Var = aVar3.m) != null) {
            efv0Var.setScrollingState(summaryExpandedView$ScrollingState);
        }
        this.binding.k.setVisibility(i2);
        this.communicationsDelegate.w = isDragging();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContentAlphaChanged(float alpha) {
        float interpolation;
        float f;
        if (Float.compare(this.lastContentAlpha, alpha) == 0) {
            return;
        }
        this.lastContentAlpha = alpha;
        float f2 = 1.0f - alpha;
        float compare = Float.compare(alpha, 0.3f);
        Interpolator interpolator = this.alphaInterpolator;
        if (compare == 1.0f) {
            f = interpolator.getInterpolation((alpha - 0.3f) / 0.7f);
            interpolation = 0.0f;
        } else {
            interpolation = interpolator.getInterpolation(1.0f - (alpha / 0.3f));
            f = 0.0f;
        }
        this.binding.g.setAlpha(alpha);
        if (Float.compare(alpha, 0.0f) == 0) {
            updateSummaryContentState(true);
        } else if (Float.compare(alpha, 0.0f) == 1) {
            updateSummaryContentState(false);
        }
        this.binding.j.setAlpha(Float.compare(alpha, 1.0f) == 0 ? 0.0f : 1.0f);
        this.binding.l.setAlpha(f);
        this.binding.k.setAlpha(alpha);
        CashbackAvailableTooltipPopup cashbackAvailableTooltipPopup = this.cashbackAvailableTooltipPopup;
        if (cashbackAvailableTooltipPopup != null) {
            if (f2 < 0.8f) {
                f2 = 0.0f;
            }
            cashbackAvailableTooltipPopup.setAlpha(f2);
            if (f2 > 0.0f) {
                cashbackAvailableTooltipPopup.updateAnchorPosition();
            }
        }
        CashbackTariffTooltipPopup cashbackTariffTooltipPopup = this.tariffsSelectorView.l;
        if (cashbackTariffTooltipPopup != null) {
            float f3 = interpolation < 0.8f ? 0.0f : interpolation;
            cashbackTariffTooltipPopup.setAlpha(f3);
            if (f3 > 0.0f) {
                cashbackTariffTooltipPopup.updateAnchorPosition();
            }
        }
        this.binding.c.setAlpha(interpolation);
        this.tariffsSelectorView.c.setAlpha(interpolation);
        this.communicationsDelegate.e(interpolation, alpha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDestinationAddressClicked() {
        ru.yandex.taxi.preorder.summary.solid.sourcedestination.b bVar = this.summaryAddressControlCoordinator.l;
        if (bVar != null) {
            bVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExpandedSummarySlideChanged(float slide) {
        efv0 efv0Var;
        efv0 efv0Var2;
        if (slide > 0.3f && slide > this.lastExpandedSummarySlide && !this.isExpandedSummarySlideEdgeOver) {
            this.isExpandedSummarySlideEdgeOver = true;
            com.yandex.go.tariffcard.common.a aVar = this.expandedSummaryViewsHolder;
            if (aVar != null && (efv0Var2 = aVar.m) != null) {
                efv0Var2.onGoingToExpand();
            }
        } else if (slide < 0.3f && slide < this.lastExpandedSummarySlide && this.isExpandedSummarySlideEdgeOver) {
            this.isExpandedSummarySlideEdgeOver = false;
            com.yandex.go.tariffcard.common.a aVar2 = this.expandedSummaryViewsHolder;
            if (aVar2 != null && (efv0Var = aVar2.m) != null) {
                efv0Var.onGoingToHide();
            }
        }
        this.lastExpandedSummarySlide = slide;
    }

    private final void onHide() {
        com.yandex.go.taxi.summary.ui.a aVar = this.summaryAddressControlCoordinator;
        ((o3) aVar.a.a).o(0);
        GoFrameLayout goFrameLayout = aVar.d;
        if (goFrameLayout.getHeight() > 0) {
            goFrameLayout.animate().translationY(-goFrameLayout.getHeight()).setInterpolator(pcv0.a).setDuration(400L).start();
        }
        goFrameLayout.animate();
        this.solidSummaryOrderButtonsController.a.setVisibility(0);
        this.binding.l.removeAllViews();
        this.summaryAnchorBehavior.M(0, true);
        this.summaryAnchorBehavior.P(4, true, false);
        this.modalCoordinatorCancellable.cancel();
        this.superAppModalCoordinatorCancellable.cancel();
    }

    private final void onModalOverlapChange(boolean isOverlapped) {
        CashbackAvailableTooltipPopup cashbackAvailableTooltipPopup;
        CashbackTariffTooltipPopup cashbackTariffTooltipPopup;
        this.summaryOverlapped = isOverlapped;
        ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar = this.tariffsSelectorView;
        cVar.o = isOverlapped;
        if (isOverlapped && (cashbackTariffTooltipPopup = cVar.l) != null) {
            cashbackTariffTooltipPopup.detach();
        }
        if (!this.summaryOverlapped || (cashbackAvailableTooltipPopup = this.cashbackAvailableTooltipPopup) == null) {
            return;
        }
        cashbackAvailableTooltipPopup.detach();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onModalStackChanged(u45 current, ModalViewCoordinator$StackChangeType stackChangeType, boolean isSuperAppCoordinator) {
        if (stackChangeType == ModalViewCoordinator$StackChangeType.PUSH) {
            if (isSuperAppCoordinator) {
                this.isOverlappedBySuperAppStack = true;
            } else {
                this.isOverlappedByUsualStack = true;
            }
            onModalOverlapChange(true);
            return;
        }
        if (stackChangeType == ModalViewCoordinator$StackChangeType.POLL && current == null) {
            if (isSuperAppCoordinator) {
                this.isOverlappedBySuperAppStack = false;
            } else {
                this.isOverlappedByUsualStack = false;
            }
            if (this.isOverlappedBySuperAppStack || this.isOverlappedByUsualStack) {
                return;
            }
            onModalOverlapChange(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPaymentMethodClicked() {
        l lVar = this.presenter;
        e6t0 e6t0Var = lVar.V;
        xcv0 xcv0Var = e6t0Var.b;
        xcv0Var.a.a("Summary.Payment", nnm.m(xcv0Var, "summary_state", ((a7t0) e6t0Var.a).a().b), 2, new HashMap());
        ((rpt0) lVar.X2).b(null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequirementsClick() {
        if (isExpandedToPager()) {
            return;
        }
        tryExpandToPager(SummaryExpandReason.OPTIONS_TAP);
    }

    private final void onReveal(bov0 params) {
        TariffsRibbonView tariffsRibbonView;
        ajv0 ajv0Var;
        l lVar = this.presenter;
        String str = null;
        lVar.F.i = null;
        osi osiVar = lVar.L0;
        ijv0 ijv0Var = params.c;
        osiVar.getClass();
        fjv0 fjv0Var = ijv0Var instanceof fjv0 ? (fjv0) ijv0Var : null;
        if (fjv0Var != null && (ajv0Var = fjv0Var.a) != null) {
            str = ajv0Var.a;
        }
        osiVar.a.a.l(str);
        final int i = 0;
        this.solidSummaryOrderButtonsController.a.setVisibility(0);
        ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c cVar = this.tariffsSelectorView;
        khv0 khv0Var = params.b;
        final int i2 = 1;
        boolean z = ((khv0Var instanceof bhv0) && ((bhv0) khv0Var).a.b) || ((khv0Var instanceof ehv0) && ((ehv0) khv0Var).a.b);
        cVar.p = z;
        if (cVar.q == TariffsSelectorView$SelectorViewType.USUAL && (tariffsRibbonView = cVar.m) != null) {
            tariffsRibbonView.setProcessVerticalFirstSelection(z);
        }
        this.summaryAnchorBehavior.M(0, false);
        this.summaryAnchorBehavior.G(0, false);
        this.modalCoordinatorCancellable = this.modalViewCoordinatorProvider.a().g(new v030(this) { // from class: d7t0
            public final /* synthetic */ SolidSummaryView b;

            {
                this.b = this;
            }

            @Override // defpackage.v030
            public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
                int i3 = i;
                SolidSummaryView solidSummaryView = this.b;
                switch (i3) {
                    case 0:
                        solidSummaryView.onModalStackChanged(u45Var2, modalViewCoordinator$StackChangeType, false);
                        break;
                    default:
                        solidSummaryView.onModalStackChanged(u45Var2, modalViewCoordinator$StackChangeType, true);
                        break;
                }
            }
        });
        this.superAppModalCoordinatorCancellable = this.superAppModalViewCoordinator.g(new v030(this) { // from class: d7t0
            public final /* synthetic */ SolidSummaryView b;

            {
                this.b = this;
            }

            @Override // defpackage.v030
            public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
                int i3 = i2;
                SolidSummaryView solidSummaryView = this.b;
                switch (i3) {
                    case 0:
                        solidSummaryView.onModalStackChanged(u45Var2, modalViewCoordinator$StackChangeType, false);
                        break;
                    default:
                        solidSummaryView.onModalStackChanged(u45Var2, modalViewCoordinator$StackChangeType, true);
                        break;
                }
            }
        });
        OneShotPreDrawListener.add(this, new uqs(15, this, params));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRevealFinished() {
        this.revealFinished = true;
        if (this.canBeExpanded) {
            attachSummaryExpandedView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSourceAddressClicked() {
        ru.yandex.taxi.preorder.summary.solid.sourcedestination.b bVar = this.summaryAddressControlCoordinator.l;
        if (bVar != null) {
            bVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSourceTrailClicked() {
        ru.yandex.taxi.preorder.summary.solid.sourcedestination.b bVar = this.summaryAddressControlCoordinator.l;
        if (bVar != null) {
            o oVar = bVar.b;
            Address e = bVar.g.l.e();
            oVar.a(e != null ? e.J1() : null);
        }
    }

    private final void onStateChangeFinished() {
        this.animatingState = (isExpandedToPager() || isCollapsedToSummary()) ? false : true;
        this.animatingToSummary = false;
        while (true) {
            Runnable pollLast = this.runOnStateFinished.pollLast();
            Runnable runnable = pollLast;
            if (pollLast == null) {
                break;
            } else if (runnable != null) {
                runnable.run();
            }
        }
        if (isOpened() && isCollapsedToSummary()) {
            l lVar = this.presenter;
            pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) lVar.x).m();
            qvz0 a = ((u49) lVar.T).a(m != null ? m.S : null);
            if (a.a) {
                ((m6t0) lVar.Dg()).t1(a.b);
            }
        }
        this.bottomOffsetCanceller = pwf0.c;
        actualizeSummaryPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onTouchCover(View v, MotionEvent e) {
        if (isCollapsedToSummary() || e.getAction() != 0) {
            return false;
        }
        l lVar = this.presenter;
        e6t0 e6t0Var = lVar.V;
        e6t0Var.getClass();
        e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.OutCard);
        e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.OutCardTap);
        lVar.X1.getClass();
        return collapseToSummary(true);
    }

    private final boolean prepareAnimation(jpv0 state, boolean animate) {
        jpv0 b = this.presenter.v3.b();
        b.getClass();
        boolean z = b instanceof hpv0;
        state.getClass();
        if (z == (state instanceof hpv0)) {
            if (!this.animatingState || animate) {
                return false;
            }
            this.bottomOffsetCanceller.run();
            return true;
        }
        this.runOnStateFinished.clear();
        this.bottomOffsetCanceller.run();
        this.presenter.v3.d(state);
        if (animate && isAttachedToWindow()) {
            this.animatingState = true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshBottomOffset() {
        xw31.E((Space) this.binding.q.c, null, null, null, Integer.valueOf(this.defaultTariffBottomMargin + this.communicationsDelegate.v));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshFocusSequence() {
        View view = (View) this.topRightViewProvider.invoke();
        View findViewById = view != null ? view.findViewById(dfh0.btn_cashback) : null;
        t7t0 t7t0Var = this.binding;
        setFocusSequence(scc.g(t7t0Var.s, findViewById, t7t0Var.p, this.summaryAutolocationButton, this.summaryRouteButton));
    }

    private final void refreshStatusBarInsets() {
        com.yandex.go.tariffcard.common.a aVar = this.expandedSummaryViewsHolder;
        if (aVar == null || !(aVar.m instanceof TariffOptionsCardView)) {
            xw31.E(this.binding.f, null, Integer.valueOf(this.statusBarHeight), null, null);
            xw31.E(this.binding.r, null, 0, null, null);
            xw31.E(this.binding.o, null, Integer.valueOf(this.topContainerTopMargin), null, null);
        } else {
            xw31.E(this.binding.f, null, 0, null, null);
            xw31.E(this.binding.r, null, Integer.valueOf(this.statusBarHeight), null, null);
            xw31.E(this.binding.o, null, Integer.valueOf(this.statusBarHeight + this.topContainerTopMargin), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshSummaryMargins() {
        int height = this.addToFavoritesRect.height() + anchorHeight() + this.routeBottomMargin;
        int height2 = summaryTopView().getHeight() + this.addToFavoritesRect.height() + this.statusBarHeight + this.plusTopOffset + this.routeTopMargin + this.surgeTopOffset;
        Rect rect = this.addToFavoritesRect;
        Rect rect2 = new Rect(rect.left, height2, rect.right, height);
        if (rect2.equals(this.lastFocusRect)) {
            return;
        }
        this.lastFocusRect = rect2;
        this.focusCoordinator.Lc(SolidSummaryView.class, rect2);
        ru.yandex.taxi.preorder.source.mode.interactor.e eVar = ((qov0) this.summaryFocusDelegate).a;
        if (eVar.a.a() == SourcePointMode.ROUTE) {
            eVar.e(true);
        }
    }

    private final void runWhenStates(Runnable runnable, boolean isOpened) {
        jpv0 b = this.presenter.v3.b();
        b.getClass();
        if ((b instanceof hpv0) != isOpened) {
            return;
        }
        if (this.animatingState) {
            this.runOnStateFinished.offer(runnable);
        } else {
            runnable.run();
        }
    }

    private final void setFocusSequence(List<? extends View> views) {
        ArrayList arrayList = (ArrayList) kotlin.collections.a.M(views);
        int size = arrayList.size() - 1;
        int i = 0;
        while (i < size) {
            View view = (View) arrayList.get(i);
            i++;
            view.setAccessibilityTraversalBefore(((View) arrayList.get(i)).getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleSummaryStateByHandlerTap() {
        int i = this.summaryAnchorBehavior.E;
        if (i == 1 || i == 2) {
            return;
        }
        if (!isExpandedToPager()) {
            tryExpandToPager(SummaryExpandReason.HANDLER_TAP);
            return;
        }
        l lVar = this.presenter;
        e6t0 e6t0Var = lVar.V;
        e6t0Var.getClass();
        e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.Tap);
        e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.ChevronDownTap);
        lVar.X1.getClass();
        collapseToSummary(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View topRightViewProvider$lambda$0(SolidSummaryView solidSummaryView) {
        View a = ((ejt0) solidSummaryView.sourcePointViewHolder).a();
        if (a != null) {
            return a.findViewById(dfh0.top_end_corner_shift_layout);
        }
        return null;
    }

    private final int topShadowOffset() {
        return this.binding.j.getChildAt(1).getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryExpandToPager(SummaryExpandReason reason) {
        mi31 mi31Var;
        l lVar = this.presenter;
        fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) lVar.x).n();
        if (n != null && (mi31Var = n.a) != null) {
            pex0 pex0Var = mi31Var.a;
            if (pex0Var.K0) {
                is60 is60Var = pex0Var.J0.b;
                fco fcoVar = lVar.A;
                String a = is60Var.a();
                r0 r0Var = fcoVar.a;
                r0Var.getClass();
                r0Var.m(null, a);
            }
        }
        if (this.expandedSummaryViewsHolder == null) {
            attachSummaryExpandedView();
        }
        if (isOpened()) {
            if (!isExpandedToPager()) {
                this.presenter.Ng(reason);
            }
            this.summaryAnchorBehavior.P(SUMMARY_EXPANDED_STATE, true, false);
        }
        this.summaryAnchorBehavior.a0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFrameBackground() {
        this.binding.e.setBackground(isExpandedToPager() ? null : tje.y(this.topSummaryBackgroundRes, getContext()));
    }

    private final void updateSummaryContentState(boolean isSummaryCollapsed) {
        this.binding.j.setZ(isSummaryCollapsed ? 3 : 1);
        this.binding.l.setZ(isSummaryCollapsed ? 1 : 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTopContainerElevation(float slide) {
        rpv0 rpv0Var = (rpv0) this.summaryTariffCardInteractor;
        this.binding.o.setElevation((float) Math.max(((rpv0Var.a.g(((com.yandex.go.taxi.tariffs.internal.repository.k) rpv0Var.b).h()) ? 0.5f : 1.0f) - slide) * this.topContainerElevation, 0.0d));
    }

    public final boolean addressOnTop() {
        return ((vev0) this.summaryAddressControlCoordinator.a.c).a instanceof p81;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    public final int anchorHeight() {
        int contentViewHeight = contentViewHeight();
        SafeCoordinatorLayout safeCoordinatorLayout = this.binding.f;
        Rect rect = xw31.a;
        ViewGroup.LayoutParams layoutParams = safeCoordinatorLayout.getLayoutParams();
        return (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : 0) + contentViewHeight;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.b.setBackgroundColor(qje.t(xng0.bgFloating, getContext()));
        this.binding.p.setIconBackground(vng.t(dzg0.fab_component_light, getContext()));
        this.binding.p.setIconTintAttr(xng0.textMain);
        updateFrameBackground();
        this.binding.i.setBackgroundColor(qje.t(xng0.bgFloating, getContext()));
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c createTariffsView(osx0 tariffsSelectorViewDependencies, AnyTouchCatcherFrameLayout container, hnx0 selectionListener, pe31 verticalIdHolder, qr31 bubbleContainer, n070 onSelectVertical) {
        return (ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.c) l9e.g(tariffsSelectorViewDependencies, container, selectionListener, verticalIdHolder, bubbleContainer, onSelectVertical, true).b.get();
    }

    public void hide() {
        if (prepareAnimation(fpv0.a, true)) {
            onHide();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.layoutChangeListener);
        summaryTopView().addOnLayoutChangeListener(this.layoutChangeListener);
        this.lifecycleObservable.a(new vb3(14, this), this);
        l lVar = this.presenter;
        p7t0 p7t0Var = this.innerMvpView;
        lVar.Bg(p7t0Var);
        tse Jg = lVar.Jg();
        lVar.E.getClass();
        sjh sjhVar = uyj.a;
        tje.N(Jg, sjhVar, null, new SolidSummaryPresenter$attachView$1(null, lVar), 2);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$2(lVar, p7t0Var, null), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$$inlined$safeCollectIn$1(lVar.R0.a(), null, p7t0Var), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$4(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$5(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$$inlined$safeCollectIn$2(lVar.N.a(), null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$$inlined$safeCollectIn$3(lVar.R.e, null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$$inlined$safeCollectIn$4(kotlinx.coroutines.flow.e.F(lVar.Q.a(new b(((com.yandex.go.taxi.tariffs.internal.repository.k) lVar.B).e())), sjhVar), null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$10(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$11(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$12(null, lVar), 3);
        com.yandex.go.coroutines.b.h(lVar.Jg(), lVar.f0.c());
        com.yandex.go.coroutines.b.h(lVar.Jg(), lVar.g0.a());
        com.yandex.go.coroutines.b.h(lVar.Jg(), lVar.i0.c());
        kotlinx.coroutines.flow.e.H(lVar.Jg(), new jqr(lVar.k0.a(), new SolidSummaryPresenter$attachView$13(2, p7t0Var, m6t0.class, "updateBadgeCount", "updateBadgeCount(I)V", 4), 3));
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$14(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$15(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$16(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$17(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$18(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$19(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$20(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$21(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$22(lVar, p7t0Var, null), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$23(lVar, p7t0Var, null), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$24(lVar, p7t0Var, null), 3);
        tje.N(lVar.Jg(), o400.a.x, null, new SolidSummaryPresenter$attachView$25(lVar, p7t0Var, null), 2);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$26(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$27(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$28(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$29(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$30(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$31(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$32(null, lVar), 3);
        lVar.Z.f.a();
        lVar.c0.a();
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$33(null, lVar), 3);
        lVar.A0.a(lVar.Jg());
        lVar.B0.b(lVar.Jg());
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$34(null, lVar), 3);
        kotlinx.coroutines.flow.e.H(lVar.Jg(), new m0(lVar.P0.e, lVar.v2.a(), new SolidSummaryPresenter$attachView$35(p7t0Var, null)));
        ru.yandex.taxi.deeplinks.a.c(lVar.Jg(), lVar.M0, new k(lVar));
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$37(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$38(lVar, p7t0Var, null), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$39(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$40(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$41(null, lVar), 3);
        tje.N(lVar.Jg(), null, null, new SolidSummaryPresenter$attachView$42(null, lVar), 3);
        this.summaryAddressControlCoordinator.a();
        this.tariffsSelectorView.a();
        ((g1a0) this.paymentIconLoader).a();
        this.communicationsDelegate.b();
        this.summaryAnchorBehavior.N = this.summaryAnchorCallback;
        this.binding.g.setOnTouchListener(new t8(21, this));
        this.summaryHeaderHolder.a();
        if (this.isInsetsHandled) {
            return;
        }
        requestApplyInsets();
    }

    public boolean onBackPressed() {
        boolean z = this.animatingState;
        boolean collapseToSummary = collapseToSummary(true);
        l lVar = this.presenter;
        if (collapseToSummary) {
            e6t0 e6t0Var = lVar.V;
            e6t0Var.getClass();
            e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.BackButton);
            e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.SystemBack);
            lVar.X1.getClass();
        } else {
            lVar.X1.getClass();
        }
        return (z || isHidden() || !collapseToSummary) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animatingState = false;
        this.lifecycleObservable.d(this);
        this.focusCoordinator.t4(SolidSummaryView.class);
        removeOnLayoutChangeListener(this.layoutChangeListener);
        summaryTopView().removeOnLayoutChangeListener(this.layoutChangeListener);
        this.summaryHeaderHolder.f.b();
        this.viewGroupBubbleContainer.a();
        this.summaryAnchorBehavior.N = null;
        this.tariffsSelectorView.b();
        com.yandex.go.taxi.summary.ui.a aVar = this.summaryAddressControlCoordinator;
        aVar.m.b();
        aVar.d.removeOnLayoutChangeListener(aVar.k);
        aVar.c.removeOnLayoutChangeListener(aVar.j);
        ru.yandex.taxi.preorder.summary.solid.sourcedestination.b bVar = aVar.l;
        if (bVar != null) {
            cpv0 cpv0Var = bVar.g;
            cpv0Var.v.b();
            cpv0Var.w.b();
            ViewPropertyAnimator viewPropertyAnimator = bVar.q;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        }
        this.presenter.Cg();
        ((g1a0) this.paymentIconLoader).d();
        CashbackAvailableTooltipPopup cashbackAvailableTooltipPopup = this.cashbackAvailableTooltipPopup;
        if (cashbackAvailableTooltipPopup != null) {
            cashbackAvailableTooltipPopup.detach();
        }
        ru.yandex.taxi.summary.solid.d dVar = this.communicationsDelegate;
        dVar.a.s.b();
        dVar.j.b();
        AuctionView auctionView = dVar.o;
        if (auctionView != null) {
            auctionView.detach();
        }
        dVar.o = null;
        dVar.d.removeOnLayoutChangeListener(dVar.p);
        this.binding.g.setOnTouchListener(null);
        this.runOnStateFinished.clear();
        this.animatingState = false;
        com.yandex.go.tariffcard.common.a aVar2 = this.expandedSummaryViewsHolder;
        if (aVar2 != null) {
            aVar2.j.b();
        }
        this.accessibilityFullScreenBlocker.c(this);
        Runnable runnable = this.showRequirementsSelectorCallback;
        if (runnable != null) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(runnable);
            }
            this.showRequirementsSelectorCallback = null;
        }
        Runnable runnable2 = this.redirectToPickingRequirementCallback;
        if (runnable2 != null) {
            Handler handler2 = getHandler();
            if (handler2 != null) {
                handler2.removeCallbacks(runnable2);
            }
            this.redirectToPickingRequirementCallback = null;
        }
        Runnable runnable3 = this.redirectToTariffCardForPickingRequirementCallback;
        if (runnable3 != null) {
            Handler handler3 = getHandler();
            if (handler3 != null) {
                handler3.removeCallbacks(runnable3);
            }
            this.redirectToTariffCardForPickingRequirementCallback = null;
        }
        this.insetsCancellable.cancel();
    }

    public void onDismissingStart() {
        this.presenter.c0.b();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.presenter.V.d = true;
        } else if (actionMasked == 1) {
            this.presenter.V.d = false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void onPause() {
        this.tariffsSelectorView.d();
    }

    public final void onResume() {
        this.tariffsSelectorView.a.resume();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.summarySizeChanged = true;
    }

    public void reveal(bov0 params) {
        if (prepareAnimation(new hpv0(params), params.a)) {
            onReveal(params);
        }
    }

    public void runWhenClosed(Runnable runnable) {
        runWhenStates(runnable, false);
    }

    public void runWhenOpen(Runnable runnable) {
        runWhenStates(runnable, true);
    }

    public void showCurrentTariffCard(SummaryExpandReason reason) {
        l lVar = this.presenter;
        fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) lVar.x).n();
        lVar.Rg(n != null ? n.a : null, reason);
    }

    public final View summaryTopView() {
        return this.binding.o;
    }
}
