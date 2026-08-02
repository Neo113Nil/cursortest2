package ru.yandex.taxi.order.state;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.b;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.api.titles.OrderTitles$Alignment;
import com.yandex.go.taxi.order.communications.FramedRecyclerView;
import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import com.yandex.go.taxi.order.communications.g;
import com.yandex.go.taxi.order.details.v1.elements.upsell.UpsellView;
import com.yandex.go.taxi.order.details.v1.style.OrderDetailsStyleState;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardHorizontalButtons;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.go.taxi.order.quality_question.ui.QualityQuestionButton;
import com.yandex.go.taxi.order.state.MakeAnotherOrderButtonPresenter$attachView$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.state.OrderStateView;
import com.yandex.go.taxi.order.state.e;
import com.yandex.go.taxi.order.state.l;
import com.yandex.go.taxi.order.state.o;
import defpackage.a5j;
import defpackage.ad11;
import defpackage.an6;
import defpackage.b8j;
import defpackage.b980;
import defpackage.bi;
import defpackage.c8j;
import defpackage.d8j;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.f6j;
import defpackage.fpf0;
import defpackage.fxx0;
import defpackage.g6j;
import defpackage.g6y0;
import defpackage.gk1;
import defpackage.hos0;
import defpackage.htc;
import defpackage.i6y0;
import defpackage.ibk0;
import defpackage.il70;
import defpackage.iqu;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jtc;
import defpackage.jxx0;
import defpackage.kdc;
import defpackage.kpf0;
import defpackage.kqu;
import defpackage.kyh0;
import defpackage.mrg0;
import defpackage.mxx0;
import defpackage.myk0;
import defpackage.n4h0;
import defpackage.nwy0;
import defpackage.nxx0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oxx0;
import defpackage.p4j;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.q48;
import defpackage.qje;
import defpackage.qnu0;
import defpackage.rp31;
import defpackage.tai0;
import defpackage.tcc;
import defpackage.teh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u4j;
import defpackage.ud00;
import defpackage.ul70;
import defpackage.usg0;
import defpackage.uxk0;
import defpackage.v4j;
import defpackage.vd00;
import defpackage.vmu0;
import defpackage.vng;
import defpackage.vxk0;
import defpackage.w4j;
import defpackage.w511;
import defpackage.wug0;
import defpackage.x4j;
import defpackage.xng0;
import defpackage.xtb1;
import defpackage.xvy0;
import defpackage.xw31;
import defpackage.y7x0;
import defpackage.yc11;
import defpackage.ycc;
import defpackage.yvf0;
import defpackage.zkb1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.combo.ui.TravelCompanionDetailView;
import ru.yandex.taxi.combo.ui.a;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.multiorder.BubbleModalView;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.BottomCircleButtonsView;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.order.view.CarDescriptionTextView;
import ru.yandex.taxi.order.view.HorizontalButtonsView;
import ru.yandex.taxi.order.view.TopCircleButtonsView;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;
import ru.yandex.taxi.widget.buttons.LoadingIconCircleButton;

@Metadata(d1 = {"\u0000Ú\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH$¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001fJ\u001f\u0010\"\u001a\u00028\u0001\"\b\b\u0001\u0010 *\u00020\u001b2\u0006\u0010!\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010*\u001a\u00020\u001bH\u0014¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H$¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0014¢\u0006\u0004\b/\u0010\u0018J\u000f\u00100\u001a\u00020\u000eH\u0014¢\u0006\u0004\b0\u0010\u0018J\u000f\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010\u0018J\u000f\u00102\u001a\u00020\u000eH\u0014¢\u0006\u0004\b2\u0010\u0018J\u0017\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b:\u00109J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000eH\u0015¢\u0006\u0004\b?\u0010\u0018J\u000f\u0010@\u001a\u00020\u001bH\u0014¢\u0006\u0004\b@\u0010+J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0016¢\u0006\u0004\bE\u0010\u0018J\u001d\u0010I\u001a\u00020\u000e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0FH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020QH\u0016¢\u0006\u0004\bT\u0010SJ\u0017\u0010W\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ%\u0010[\u001a\u00020\u000e2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0F2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b[\u0010\\J%\u0010^\u001a\u00020\u000e2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020Y0F2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b^\u0010\\J\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000eH\u0002¢\u0006\u0004\bb\u0010\u0018J\u000f\u0010c\u001a\u00020\u000eH\u0002¢\u0006\u0004\bc\u0010\u0018J\u000f\u0010d\u001a\u00020\u0011H\u0002¢\u0006\u0004\bd\u0010\u0013J+\u0010h\u001a\u00020\u000e2\f\u0010f\u001a\b\u0012\u0004\u0012\u0002060e2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002060eH\u0002¢\u0006\u0004\bh\u0010iJ+\u0010j\u001a\u00020\u000e2\f\u0010f\u001a\b\u0012\u0004\u0012\u0002060e2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002060eH\u0002¢\u0006\u0004\bj\u0010iJ+\u0010k\u001a\u00020\u000e2\f\u0010f\u001a\b\u0012\u0004\u0012\u0002060e2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002060eH\u0002¢\u0006\u0004\bk\u0010iJ+\u0010l\u001a\u00020\u000e2\f\u0010f\u001a\b\u0012\u0004\u0012\u0002060e2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002060eH\u0002¢\u0006\u0004\bl\u0010iJ\u0019\u0010m\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bm\u00109J\u0019\u0010n\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bn\u00109J\u000f\u0010o\u001a\u00020\u000eH\u0002¢\u0006\u0004\bo\u0010\u0018J\u001f\u0010r\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u00192\u0006\u0010q\u001a\u00020\u0019H\u0002¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\u000eH\u0002¢\u0006\u0004\bt\u0010\u0018J\u0017\u0010u\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bu\u0010XJ\u000f\u0010w\u001a\u00020vH\u0002¢\u0006\u0004\bw\u0010xJ\u0011\u0010z\u001a\u0004\u0018\u00010yH\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020\u0019H\u0002¢\u0006\u0004\b}\u0010~R)\u0010\u0080\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0005\b$\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010%\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010 \u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R*\u0010ª\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R&\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0005\b\u0015\u0010°\u0001\u001a\u0005\b±\u0001\u0010\u0016\"\u0006\b²\u0001\u0010³\u0001R*\u0010µ\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R1\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010»\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ä\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R1\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030Ê\u00010»\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bË\u0001\u0010¾\u0001\u001a\u0006\bÌ\u0001\u0010À\u0001\"\u0006\bÍ\u0001\u0010Â\u0001R*\u0010Ï\u0001\u001a\u00030Î\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R1\u0010Ö\u0001\u001a\u00030Õ\u00018\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\bÖ\u0001\u0010×\u0001\u0012\u0005\bÜ\u0001\u0010\u0018\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R\u001c\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010ß\u0001R\u0018\u0010â\u0001\u001a\u00030á\u00018\u0004X\u0085\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0018\u0010å\u0001\u001a\u00030ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u0019\u0010ç\u0001\u001a\u0004\u0018\u00010y8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u0019\u0010é\u0001\u001a\u0004\u0018\u00010y8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010è\u0001R\u0018\u0010ë\u0001\u001a\u00030ê\u00018\u0004X\u0085\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0018\u0010î\u0001\u001a\u00030í\u00018\u0004X\u0085\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0017\u0010ð\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u0018\u0010ó\u0001\u001a\u00030ò\u00018\u0004X\u0085\u0004¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u0019\u0010õ\u0001\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ñ\u0001R\u001c\u0010ö\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0018\u0010ù\u0001\u001a\u00030ø\u00018\u0004X\u0085\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0017\u0010û\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ñ\u0001R\u0018\u0010ý\u0001\u001a\u00030ü\u00018\u0004X\u0085\u0004¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u0018\u0010\u0080\u0002\u001a\u00030ÿ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0017\u0010\u0082\u0002\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010ñ\u0001R\u001a\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0083\u00028\u0004X\u0085\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u001a\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R\u001a\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u0089\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001a\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u0086\u00028\u0004X\u0085\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u0088\u0002R\u0018\u0010\u008e\u0002\u001a\u00030\u008d\u00028\u0004X\u0085\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0091\u0002\u001a\u00030\u0090\u00028\u0004X\u0085\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0093\u00028\u0004X\u0085\u0004¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0017\u0010\u0096\u0002\u001a\u00020y8\u0004X\u0085\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010è\u0001R\u0018\u0010\u0097\u0002\u001a\u00030\u0093\u00028\u0004X\u0085\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0095\u0002R\u0019\u0010\u0098\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R\u001a\u0010\u009b\u0002\u001a\u00030\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0018\u0010\u009e\u0002\u001a\u00030\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0017\u0010 \u0002\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0018\u0010£\u0002\u001a\u00030¢\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R\u0017\u0010¥\u0002\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¡\u0002R\u0017\u0010¦\u0002\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010¡\u0002R\u0018\u0010¨\u0002\u001a\u00030§\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002¨\u0006ª\u0002"}, d2 = {"Lru/yandex/taxi/order/state/TaxiOnTheWayStateView;", "Ljxx0;", "T", "Lcom/yandex/go/taxi/order/state/OrderStateView;", "Lil70;", "Lud00;", "Lyc11;", "Lnwy0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "Lqnu0;", "storiesUiHolderFactory", "()Lqnu0;", "inflateStateView", "()V", "", "layoutRes", "Landroid/view/View;", "inflate", "(I)Landroid/view/View;", "attachToRoot", "(IZ)Landroid/view/View;", CA20Status.STATUS_CERTIFICATE_V, "viewId", "nonNullViewById", "Lo2y0;", "orderHolder", "()Lo2y0;", "Liqu;", "getHorizontalButtonConfig", "()Liqu;", "resetScroll", "getAnchorView", "()Landroid/view/View;", "Lcom/yandex/go/taxi/order/state/o;", "getPresenter", "()Lcom/yandex/go/taxi/order/state/o;", "onAttachedToWindow", "onDetachedFromWindow", "onButtonsInitialized", "hideOrderButtonInBottomIfNeeded", "visible", "setMakeAnotherOrderVisible", "(Z)V", "", "text", "showMultiorderTooltip", "(Ljava/lang/String;)V", "showMultiorderTooltipWithoutDismissDelay", "Lul70;", ClidProvider.STATE, "render", "(Lul70;)V", "afterConstruction", "getPeekView", "Lb980;", "orderTitles", "setTitles", "(Lb980;)V", "onContainerViewTransitionFinished", "", "Lad11;", "travelCompanions", "renderCompanionCard", "(Ljava/util/List;)V", "Lcom/yandex/go/taxi/order/details/v1/style/OrderDetailsStyleState;", "renderDetailsCardStyle", "(Lcom/yandex/go/taxi/order/details/v1/style/OrderDetailsStyleState;)V", "Lf6j;", "renderDriverSection", "(Lf6j;)V", "Lx4j;", "renderTopButtons", "(Lx4j;)V", "renderBottomButtons", "La5j;", "detailsCardCancelUiState", "renderCancelButton", "(La5j;)V", "Lkpf0;", "topPlaques", "renderPromoPlaquesTopSection", "(Ljava/util/List;Lo2y0;)V", "bottomPlaques", "renderPromoPlaquesBottomSection", "Ld8j;", "renderUpsell", "(Ld8j;)V", "preventStoriesToGainFocusOnAttach", "reportButtonsVisibility", "orderButtonShouldShowInTop", "", "visibleButtons", "invisibleButtons", "appendDriverSectionVisibility", "(Ljava/util/List;Ljava/util/List;)V", "appendTopCircleButtonsVisibility", "appendButtonsButtonsVisibility", "appendCancelButtonVisibility", "showMultiorderTooltipInternal", "showMultiorderTooltipWithoutDismissDelayInternal", "setupHeightAnimations", "topPadding", "bottomPadding", "updateTopContainerPaddings", "(II)V", "hideCancelItem", "setupCancelButton", "Lru/yandex/taxi/design/ListItemComponent;", "getOrCreateCancelButton", "()Lru/yandex/taxi/design/ListItemComponent;", "Landroid/widget/LinearLayout;", "getTitlesLayout", "()Landroid/widget/LinearLayout;", "scrollY", "onScrollChanged", "(I)V", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "Lfxx0;", "component", "Lfxx0;", "getComponent", "()Lfxx0;", "setComponent", "(Lfxx0;)V", "Lcom/yandex/go/taxi/order/state/e;", "horizontalButtonsViewPresenter", "Lcom/yandex/go/taxi/order/state/e;", "getHorizontalButtonsViewPresenter", "()Lcom/yandex/go/taxi/order/state/e;", "setHorizontalButtonsViewPresenter", "(Lcom/yandex/go/taxi/order/state/e;)V", "Lo2y0;", "getOrderHolder", "setOrderHolder", "(Lo2y0;)V", "Lcom/yandex/go/taxi/order/state/l;", "cancelPresenter", "Lcom/yandex/go/taxi/order/state/l;", "getCancelPresenter", "()Lcom/yandex/go/taxi/order/state/l;", "setCancelPresenter", "(Lcom/yandex/go/taxi/order/state/l;)V", "Lvd00;", "makeAnotherOrderButtonPresenter", "Lvd00;", "getMakeAnotherOrderButtonPresenter", "()Lvd00;", "setMakeAnotherOrderButtonPresenter", "(Lvd00;)V", "Lg6j;", "detailsCardHeightAnimationsInteractor", "Lg6j;", "Lpav;", "imageLoader", "Lpav;", "getImageLoader", "()Lpav;", "setImageLoader", "(Lpav;)V", "Lqnu0;", "getStoriesUiHolderFactory", "setStoriesUiHolderFactory", "(Lqnu0;)V", "Lru/yandex/taxi/combo/ui/a;", "travelCompanionDetailPresenter", "Lru/yandex/taxi/combo/ui/a;", "getTravelCompanionDetailPresenter", "()Lru/yandex/taxi/combo/ui/a;", "setTravelCompanionDetailPresenter", "(Lru/yandex/taxi/combo/ui/a;)V", "Lyvf0;", "Lru/yandex/taxi/combo/ui/TravelCompanionStatusView;", "travelCompanionStatusViewProvider", "Lyvf0;", "getTravelCompanionStatusViewProvider", "()Lyvf0;", "setTravelCompanionStatusViewProvider", "(Lyvf0;)V", "Lhtc;", "communicationsAdapterFactory", "Lhtc;", "getCommunicationsAdapterFactory", "()Lhtc;", "setCommunicationsAdapterFactory", "(Lhtc;)V", "Lru/yandex/taxi/order/view/CarDescriptionTextView;", "carDescriptionTextViewProvider", "getCarDescriptionTextViewProvider", "setCarDescriptionTextViewProvider", "Lg6y0;", "sessionTimelineTracker", "Lg6y0;", "getSessionTimelineTracker", "()Lg6y0;", "setSessionTimelineTracker", "(Lg6y0;)V", "Ltse;", "coroutineScope", "Ltse;", "getCoroutineScope", "()Ltse;", "setCoroutineScope", "(Ltse;)V", "getCoroutineScope$annotations", "Lcom/yandex/go/taxi/order/communications/g;", "promoPlaqueTopAdapter", "Lcom/yandex/go/taxi/order/communications/g;", "promoPlaqueBottomAdapter", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "Lcom/yandex/go/taxi/order/details/v1/elements/upsell/UpsellView;", "upsell", "Lcom/yandex/go/taxi/order/details/v1/elements/upsell/UpsellView;", "titlesLayout", "Landroid/widget/LinearLayout;", "subtitleContainer", "Lru/yandex/taxi/widget/accessibility/AccessibilityLiveRegionTextView;", "titleView", "Lru/yandex/taxi/widget/accessibility/AccessibilityLiveRegionTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "subtitleView", "Lru/yandex/taxi/widget/RobotoTextView;", "headerDividerView", "Landroid/view/View;", "Lcom/yandex/go/taxi/order/details/v1/ui/DriverSectionView;", "driverSection", "Lcom/yandex/go/taxi/order/details/v1/ui/DriverSectionView;", "carDescriptionStub", "carDescription", "Lru/yandex/taxi/order/view/CarDescriptionTextView;", "Lru/yandex/taxi/order/view/HorizontalButtonsView;", "horizontalButtonsView", "Lru/yandex/taxi/order/view/HorizontalButtonsView;", "anchorTarget", "Lcom/yandex/go/taxi/order/communications/FramedRecyclerView;", "promoPlaqueTopSection", "Lcom/yandex/go/taxi/order/communications/FramedRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "promoPlaqueBottomSection", "Landroidx/recyclerview/widget/RecyclerView;", "bottomSheetCard", "Lcom/yandex/go/taxi/order/quality_question/ui/QualityQuestionButton;", "qualityQuestionButton", "Lcom/yandex/go/taxi/order/quality_question/ui/QualityQuestionButton;", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardHorizontalButtons;", "topHorizontalButtons", "Lcom/yandex/go/taxi/order/details/v1/ui/DetailsCardHorizontalButtons;", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "topCircleButtonsView", "Lru/yandex/taxi/order/view/TopCircleButtonsView;", "bottomHorizontalButtons", "Lru/yandex/taxi/order/BottomCircleButtonsView;", "bottomCircleButtonsView", "Lru/yandex/taxi/order/BottomCircleButtonsView;", "Lru/yandex/taxi/combo/ui/TravelCompanionDetailView;", "travelCompanionDetailView", "Lru/yandex/taxi/combo/ui/TravelCompanionDetailView;", "Landroid/view/ViewGroup;", "topContainer", "Landroid/view/ViewGroup;", "bottomContainer", "cardContainer", "isContainerViewPositioned", "Z", "Ljava/lang/Runnable;", "showMultiorderBubblePendingAction", "Ljava/lang/Runnable;", "Landroid/view/View$OnScrollChangeListener;", "onScrollChangedListener", "Landroid/view/View$OnScrollChangeListener;", "orderScreensCardElevation", CA20Status.STATUS_USER_I, "Lvxk0;", "roundSectionsHandler", "Lvxk0;", "topContainerDefaultPaddingTop", "topContainerDefaultPaddingBottom", "Lkqu;", "horizontalButtonsDelegate", "Lkqu;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class TaxiOnTheWayStateView<T extends jxx0> extends OrderStateView implements jxx0, il70, ud00, yc11, nwy0 {
    public static final int $stable = 8;
    public Activity activity;
    private final View anchorTarget;
    protected final BottomCircleButtonsView bottomCircleButtonsView;
    protected final LinearLayout bottomContainer;
    protected final DetailsCardHorizontalButtons bottomHorizontalButtons;
    private final View bottomSheetCard;
    public l cancelPresenter;
    protected CarDescriptionTextView carDescription;
    private final View carDescriptionStub;
    public yvf0 carDescriptionTextViewProvider;
    protected final ViewGroup cardContainer;
    public htc communicationsAdapterFactory;
    public fxx0 component;
    public tse coroutineScope;
    public g6j detailsCardHeightAnimationsInteractor;
    protected final DriverSectionView driverSection;
    private final View headerDividerView;
    private final kqu horizontalButtonsDelegate;
    protected final HorizontalButtonsView horizontalButtonsView;
    public e horizontalButtonsViewPresenter;
    public pav imageLoader;
    private boolean isContainerViewPositioned;
    public vd00 makeAnotherOrderButtonPresenter;
    private final View.OnScrollChangeListener onScrollChangedListener;
    public o2y0 orderHolder;
    private final int orderScreensCardElevation;
    private g promoPlaqueBottomAdapter;
    private final RecyclerView promoPlaqueBottomSection;
    private g promoPlaqueTopAdapter;
    protected final FramedRecyclerView promoPlaqueTopSection;
    protected final QualityQuestionButton qualityQuestionButton;
    private final vxk0 roundSectionsHandler;
    protected final NestedScrollView scrollView;
    public g6y0 sessionTimelineTracker;
    private Runnable showMultiorderBubblePendingAction;
    public qnu0 storiesUiHolderFactory;
    private final LinearLayout subtitleContainer;
    protected final RobotoTextView subtitleView;
    protected final AccessibilityLiveRegionTextView titleView;
    private final LinearLayout titlesLayout;
    private final TopCircleButtonsView topCircleButtonsView;
    protected final ViewGroup topContainer;
    private final int topContainerDefaultPaddingBottom;
    private final int topContainerDefaultPaddingTop;
    private final DetailsCardHorizontalButtons topHorizontalButtons;
    public a travelCompanionDetailPresenter;
    protected final TravelCompanionDetailView travelCompanionDetailView;
    public yvf0 travelCompanionStatusViewProvider;
    private final UpsellView upsell;

    public TaxiOnTheWayStateView(Context context) {
        super(context);
        inflateStateView();
        setImportantForAccessibility(2);
        this.scrollView = (NestedScrollView) nonNullViewById(p8h0.order_state_scroll_view);
        this.upsell = (UpsellView) nonNullViewById(p8h0.upsell);
        this.titlesLayout = getTitlesLayout();
        this.subtitleContainer = (LinearLayout) findViewById(p8h0.order_screens_subtitle_group);
        this.titleView = (AccessibilityLiveRegionTextView) findViewById(p8h0.order_screens_title);
        this.subtitleView = (RobotoTextView) findViewById(p8h0.order_screens_subtitle);
        this.headerDividerView = nonNullViewById(p8h0.header_divider);
        this.driverSection = (DriverSectionView) nonNullViewById(p8h0.driver_section);
        this.carDescriptionStub = findViewById(p8h0.car_description_stub);
        HorizontalButtonsView horizontalButtonsView = (HorizontalButtonsView) nonNullViewById(p8h0.horizontal_buttons_view);
        this.horizontalButtonsView = horizontalButtonsView;
        int i = p8h0.destination;
        WeakHashMap weakHashMap = b.a;
        this.anchorTarget = (View) rp31.d(horizontalButtonsView, i);
        this.promoPlaqueTopSection = (FramedRecyclerView) nonNullViewById(p8h0.promo_plaque_top_section);
        this.promoPlaqueBottomSection = (RecyclerView) nonNullViewById(p8h0.promo_plaque_bottom_section);
        this.bottomSheetCard = nonNullViewById(p8h0.bottom_sheet_card);
        this.qualityQuestionButton = (QualityQuestionButton) findViewById(p8h0.quality_question_button);
        this.topHorizontalButtons = (DetailsCardHorizontalButtons) findViewById(p8h0.top_horizontal_buttons);
        this.topCircleButtonsView = (TopCircleButtonsView) findViewById(p8h0.top_circle_buttons_view);
        this.bottomHorizontalButtons = (DetailsCardHorizontalButtons) findViewById(p8h0.bottom_horizontal_buttons);
        this.bottomCircleButtonsView = (BottomCircleButtonsView) nonNullViewById(p8h0.bottom_circle_buttons_view);
        this.travelCompanionDetailView = (TravelCompanionDetailView) nonNullViewById(p8h0.travel_companion_detail_view);
        ViewGroup viewGroup = (ViewGroup) nonNullViewById(p8h0.top_container);
        this.topContainer = viewGroup;
        this.bottomContainer = (LinearLayout) nonNullViewById(p8h0.bottom_container);
        this.cardContainer = (ViewGroup) nonNullViewById(p8h0.card_container);
        this.showMultiorderBubblePendingAction = new hos0(5);
        this.onScrollChangedListener = new gk1(9, this);
        this.orderScreensCardElevation = tje.r(wug0.order_screens_card_elevation, getContext());
        this.roundSectionsHandler = new vxk0(context, EmptyList.a, true);
        this.topContainerDefaultPaddingTop = viewGroup.getPaddingTop();
        this.topContainerDefaultPaddingBottom = viewGroup.getPaddingBottom();
        this.horizontalButtonsDelegate = new oxx0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 afterConstruction$lambda$1(TaxiOnTheWayStateView taxiOnTheWayStateView, fpf0 fpf0Var) {
        o presenter = taxiOnTheWayStateView.getPresenter();
        presenter.N.a(fpf0Var, PromoPlaqueAnalytics$Screen.DETAILS_TOP);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 afterConstruction$lambda$2(TaxiOnTheWayStateView taxiOnTheWayStateView, fpf0 fpf0Var) {
        o presenter = taxiOnTheWayStateView.getPresenter();
        presenter.N.a(fpf0Var, PromoPlaqueAnalytics$Screen.DETAILS);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 afterConstruction$lambda$3(TaxiOnTheWayStateView taxiOnTheWayStateView, ibk0 ibk0Var) {
        taxiOnTheWayStateView.getPresenter().M.f(ibk0Var);
        return zy11.a;
    }

    private final void appendButtonsButtonsVisibility(List<String> visibleButtons, List<String> invisibleButtons) {
        if (this.bottomCircleButtonsView.getVisibility() == 0) {
            visibleButtons.addAll(this.bottomCircleButtonsView.getVisibleButtons());
            invisibleButtons.addAll(this.bottomCircleButtonsView.getInvisibleButtons());
        }
        DetailsCardHorizontalButtons detailsCardHorizontalButtons = this.bottomHorizontalButtons;
        if (detailsCardHorizontalButtons == null || detailsCardHorizontalButtons.getVisibility() != 0) {
            return;
        }
        visibleButtons.addAll(detailsCardHorizontalButtons.getVisibleButtons());
        invisibleButtons.addAll(detailsCardHorizontalButtons.getInvisibleButtons());
    }

    private final void appendCancelButtonVisibility(List<String> visibleButtons, List<String> invisibleButtons) {
        View findViewById = findViewById(p8h0.cancel_order_button);
        if (findViewById != null && c.r(findViewById)) {
            visibleButtons.add("Cancel");
        } else if (findViewById != null) {
            invisibleButtons.add("Cancel");
        }
    }

    private final void appendDriverSectionVisibility(List<String> visibleButtons, List<String> invisibleButtons) {
        CarDescriptionTextView carDescriptionTextView = this.carDescription;
        boolean z = false;
        boolean z2 = this.driverSection.getVisibility() == 0;
        if (carDescriptionTextView != null && carDescriptionTextView.getVisibility() == 0) {
            z = true;
        }
        if (z2 && c.r(this.driverSection)) {
            visibleButtons.add("Driver");
            visibleButtons.add("CopyMenu");
            return;
        }
        if (z2) {
            invisibleButtons.add("Driver");
            invisibleButtons.add("CopyMenu");
        } else if (z && c.r(carDescriptionTextView)) {
            visibleButtons.add("CopyMenu");
        } else if (z) {
            invisibleButtons.add("CopyMenu");
        }
    }

    private final void appendTopCircleButtonsVisibility(List<String> visibleButtons, List<String> invisibleButtons) {
        TopCircleButtonsView topCircleButtonsView = this.topCircleButtonsView;
        if (topCircleButtonsView != null && topCircleButtonsView.getVisibility() == 0) {
            List<ActionType> visibleButtons2 = topCircleButtonsView.getVisibleButtons();
            o presenter = getPresenter();
            ArrayList arrayList = new ArrayList(tcc.n(visibleButtons2, 10));
            for (ActionType actionType : visibleButtons2) {
                presenter.B.getClass();
                arrayList.add(p4j.a(actionType));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                visibleButtons.add((String) it.next());
            }
            List<ActionType> invisibleButtons2 = topCircleButtonsView.getInvisibleButtons();
            o presenter2 = getPresenter();
            ArrayList arrayList2 = new ArrayList(tcc.n(invisibleButtons2, 10));
            for (ActionType actionType2 : invisibleButtons2) {
                presenter2.B.getClass();
                arrayList2.add(p4j.a(actionType2));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                invisibleButtons.add((String) it2.next());
            }
        }
        DetailsCardHorizontalButtons detailsCardHorizontalButtons = this.topHorizontalButtons;
        if (detailsCardHorizontalButtons == null || detailsCardHorizontalButtons.getVisibility() != 0) {
            return;
        }
        visibleButtons.addAll(detailsCardHorizontalButtons.getVisibleButtons());
        invisibleButtons.addAll(detailsCardHorizontalButtons.getInvisibleButtons());
    }

    public static /* synthetic */ void getCoroutineScope$annotations() {
    }

    private final ListItemComponent getOrCreateCancelButton() {
        ListItemComponent listItemComponent = (ListItemComponent) this.bottomContainer.findViewById(p8h0.cancel_order_button);
        if (listItemComponent != null) {
            return listItemComponent;
        }
        ListItemComponent listItemComponent2 = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent2.setBackground(vng.t(dzg0.bg_transparent_ripple, getContext()));
        listItemComponent2.setId(p8h0.cancel_order_button);
        this.bottomContainer.addView(listItemComponent2, 0);
        LinearLayout linearLayout = this.bottomContainer;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, this.bottomContainer.getPaddingRight(), this.bottomContainer.getPaddingBottom());
        return listItemComponent2;
    }

    private final LinearLayout getTitlesLayout() {
        LinearLayout linearLayout = (LinearLayout) findViewById(p8h0.titles_container);
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(p8h0.order_titles);
        return linearLayout2 != null ? linearLayout2 : (LinearLayout) findViewById(p8h0.titles_holder);
    }

    private final void hideCancelItem() {
        View findViewById = this.bottomContainer.findViewById(p8h0.cancel_order_button);
        if (findViewById != null) {
            this.bottomContainer.removeView(findViewById);
            LinearLayout linearLayout = this.bottomContainer;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), tje.r(mrg0.go_design_s_space, getContext()), this.bottomContainer.getPaddingRight(), this.bottomContainer.getPaddingBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(TaxiOnTheWayStateView taxiOnTheWayStateView, View view) {
        o presenter = taxiOnTheWayStateView.getPresenter();
        presenter.B.c("Driver");
        presenter.K.B(presenter.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onContainerViewTransitionFinished$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrollChanged(int scrollY) {
        if (scrollY >= 0) {
            float f = scrollY;
            this.upsell.setAlpha(1.0f - (f / 100.0f));
            int i = this.orderScreensCardElevation;
            this.upsell.setElevation(Math.max(i - ((i * f) / 100.0f), 0.0f));
            this.upsell.setEnabled(scrollY <= 10);
        }
    }

    private final boolean orderButtonShouldShowInTop() {
        LoadingIconCircleButton buttonForActionType;
        TopCircleButtonsView topCircleButtonsView = this.topCircleButtonsView;
        return topCircleButtonsView != null && topCircleButtonsView.getVisibility() == 0 && (buttonForActionType = topCircleButtonsView.getButtonForActionType(ActionType.MAKE_TAXI_ORDER)) != null && buttonForActionType.getVisibility() == 0;
    }

    private final void preventStoriesToGainFocusOnAttach() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
    }

    private final void reportButtonsVisibility() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        appendDriverSectionVisibility(arrayList, arrayList2);
        appendTopCircleButtonsVisibility(arrayList, arrayList2);
        appendButtonsButtonsVisibility(arrayList, arrayList2);
        appendCancelButtonVisibility(arrayList, arrayList2);
        getPresenter().B.d(arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitles$lambda$0(TaxiOnTheWayStateView taxiOnTheWayStateView, CarDescriptionTextView carDescriptionTextView, View view) {
        taxiOnTheWayStateView.getPresenter().Pg(carDescriptionTextView);
    }

    private final void setupCancelButton(a5j detailsCardCancelUiState) {
        ListItemComponent orCreateCancelButton = getOrCreateCancelButton();
        orCreateCancelButton.setTitle(detailsCardCancelUiState.b);
        orCreateCancelButton.setSubtitle(detailsCardCancelUiState.c);
        orCreateCancelButton.setLeadImage(detailsCardCancelUiState.e);
        orCreateCancelButton.setTrailMode(2);
        orCreateCancelButton.setDebounceClickListener(new y7x0(10, detailsCardCancelUiState, this));
        kdc kdcVar = detailsCardCancelUiState.d;
        if (kdcVar != null) {
            orCreateCancelButton.getNavigationIconParams().b = kdcVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCancelButton$lambda$0(a5j a5jVar, TaxiOnTheWayStateView taxiOnTheWayStateView) {
        a5jVar.f.invoke(taxiOnTheWayStateView.getOrderHolder());
    }

    private final void setupHeightAnimations() {
        g6j g6jVar = this.detailsCardHeightAnimationsInteractor;
        if (g6jVar == null) {
            ny61.g("Required value was null.");
            return;
        }
        this.driverSection.setupHeightInteractor(g6jVar);
        DetailsCardHorizontalButtons detailsCardHorizontalButtons = this.bottomHorizontalButtons;
        if (detailsCardHorizontalButtons != null) {
            detailsCardHorizontalButtons.setupHeightInteractor(g6jVar);
        }
        DetailsCardHorizontalButtons detailsCardHorizontalButtons2 = this.topHorizontalButtons;
        if (detailsCardHorizontalButtons2 != null) {
            detailsCardHorizontalButtons2.setupHeightInteractor(g6jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMultiorderBubblePendingAction$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMultiorderTooltipInternal(String text) {
        an6 an6Var = BubbleModalView.Companion;
        Context context = getContext();
        View makeAnotherOrderButton = this.bottomCircleButtonsView.makeAnotherOrderButton();
        an6Var.getClass();
        ((ViewGroup) getActivity().findViewById(teh0.top_fullscreen_modal_views_container)).addView(new BubbleModalView(context, text, makeAnotherOrderButton, true, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMultiorderTooltipWithoutDismissDelayInternal(String text) {
        an6 an6Var = BubbleModalView.Companion;
        Context context = getContext();
        View makeAnotherOrderButton = this.bottomCircleButtonsView.makeAnotherOrderButton();
        an6Var.getClass();
        ((ViewGroup) getActivity().findViewById(teh0.top_fullscreen_modal_views_container)).addView(new BubbleModalView(context, text, makeAnotherOrderButton, false, null));
    }

    private final void updateTopContainerPaddings(int topPadding, int bottomPadding) {
        int paddingTop = this.topContainer.getPaddingTop();
        int paddingBottom = this.topContainer.getPaddingBottom();
        if (paddingTop == topPadding && paddingBottom == bottomPadding) {
            return;
        }
        this.topContainer.setPadding(0, topPadding, 0, bottomPadding);
        requestLayout();
    }

    public void afterConstruction() {
        this.bottomCircleButtonsView.init(getComponent());
        this.horizontalButtonsView.init(getComponent());
        this.horizontalButtonsView.setUiDelegate(this.horizontalButtonsDelegate);
        final int i = 1;
        this.bottomSheetCard.setClipToOutline(true);
        View view = this.carDescriptionStub;
        if (view != null) {
            CarDescriptionTextView carDescriptionTextView = (CarDescriptionTextView) getCarDescriptionTextViewProvider().get();
            c.w(view, carDescriptionTextView);
            this.carDescription = carDescriptionTextView;
        }
        NestedScrollView nestedScrollView = this.scrollView;
        int r = tje.r(usg0.bottom_sheet_corner_radius, getContext());
        final int i2 = 0;
        nestedScrollView.setBackgroundResource(0);
        nestedScrollView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(r));
        nestedScrollView.setClipToOutline(true);
        myk0 myk0Var = new myk0(this.horizontalButtonsView);
        float r2 = tje.r(usg0.order_card_item_radius, getContext());
        myk0Var.b(r2, r2);
        vxk0 vxk0Var = this.roundSectionsHandler;
        uxk0 uxk0Var = new uxk0(56, true, j73.d0(new View[]{this.topContainer}));
        uxk0[] uxk0VarArr = {new uxk0(56, false, j73.d0(new View[]{this.bottomContainer}))};
        ArrayList arrayList = vxk0Var.d;
        arrayList.add(uxk0Var);
        ycc.t(arrayList, uxk0VarArr);
        this.roundSectionsHandler.b();
        this.bottomCircleButtonsView.setUiDelegate(new nxx0(this));
        getHorizontalButtonsViewPresenter().J = getHorizontalButtonConfig();
        preventStoriesToGainFocusOnAttach();
        g a = ((jtc) getCommunicationsAdapterFactory()).a(new tls(this) { // from class: lxx0
            public final /* synthetic */ TaxiOnTheWayStateView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 afterConstruction$lambda$3;
                zy11 afterConstruction$lambda$1;
                zy11 afterConstruction$lambda$2;
                int i3 = i;
                TaxiOnTheWayStateView taxiOnTheWayStateView = this.b;
                switch (i3) {
                    case 0:
                        afterConstruction$lambda$3 = TaxiOnTheWayStateView.afterConstruction$lambda$3(taxiOnTheWayStateView, (ibk0) obj);
                        return afterConstruction$lambda$3;
                    case 1:
                        afterConstruction$lambda$1 = TaxiOnTheWayStateView.afterConstruction$lambda$1(taxiOnTheWayStateView, (fpf0) obj);
                        return afterConstruction$lambda$1;
                    default:
                        afterConstruction$lambda$2 = TaxiOnTheWayStateView.afterConstruction$lambda$2(taxiOnTheWayStateView, (fpf0) obj);
                        return afterConstruction$lambda$2;
                }
            }
        });
        final int i3 = 2;
        g a2 = ((jtc) getCommunicationsAdapterFactory()).a(new tls(this) { // from class: lxx0
            public final /* synthetic */ TaxiOnTheWayStateView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 afterConstruction$lambda$3;
                zy11 afterConstruction$lambda$1;
                zy11 afterConstruction$lambda$2;
                int i32 = i3;
                TaxiOnTheWayStateView taxiOnTheWayStateView = this.b;
                switch (i32) {
                    case 0:
                        afterConstruction$lambda$3 = TaxiOnTheWayStateView.afterConstruction$lambda$3(taxiOnTheWayStateView, (ibk0) obj);
                        return afterConstruction$lambda$3;
                    case 1:
                        afterConstruction$lambda$1 = TaxiOnTheWayStateView.afterConstruction$lambda$1(taxiOnTheWayStateView, (fpf0) obj);
                        return afterConstruction$lambda$1;
                    default:
                        afterConstruction$lambda$2 = TaxiOnTheWayStateView.afterConstruction$lambda$2(taxiOnTheWayStateView, (fpf0) obj);
                        return afterConstruction$lambda$2;
                }
            }
        });
        this.promoPlaqueTopAdapter = a;
        this.promoPlaqueBottomAdapter = a2;
        this.upsell.setActionHandler(new tls(this) { // from class: lxx0
            public final /* synthetic */ TaxiOnTheWayStateView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 afterConstruction$lambda$3;
                zy11 afterConstruction$lambda$1;
                zy11 afterConstruction$lambda$2;
                int i32 = i2;
                TaxiOnTheWayStateView taxiOnTheWayStateView = this.b;
                switch (i32) {
                    case 0:
                        afterConstruction$lambda$3 = TaxiOnTheWayStateView.afterConstruction$lambda$3(taxiOnTheWayStateView, (ibk0) obj);
                        return afterConstruction$lambda$3;
                    case 1:
                        afterConstruction$lambda$1 = TaxiOnTheWayStateView.afterConstruction$lambda$1(taxiOnTheWayStateView, (fpf0) obj);
                        return afterConstruction$lambda$1;
                    default:
                        afterConstruction$lambda$2 = TaxiOnTheWayStateView.afterConstruction$lambda$2(taxiOnTheWayStateView, (fpf0) obj);
                        return afterConstruction$lambda$2;
                }
            }
        });
        this.promoPlaqueTopSection.setAdapter(a);
        this.promoPlaqueBottomSection.setAdapter(a2);
        setupHeightAnimations();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        xvy0.a(qje.t(xng0.cardDivider, getContext()), this.cardContainer);
        this.bottomSheetCard.setBackground(vng.t(n4h0.bg_rounded_top, getContext()));
        this.roundSectionsHandler.b();
        this.promoPlaqueBottomSection.setBackground(getContext().getDrawable(f1h0.round_section_bg));
        QualityQuestionButton qualityQuestionButton = this.qualityQuestionButton;
        if (qualityQuestionButton != null) {
            qualityQuestionButton.setBackground(getContext().getDrawable(f1h0.round_section_bg));
        }
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final Activity getActivity() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        return null;
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    /* renamed from: getAnchorView, reason: from getter */
    public View getAnchorTarget() {
        return this.anchorTarget;
    }

    public final l getCancelPresenter() {
        l lVar = this.cancelPresenter;
        if (lVar != null) {
            return lVar;
        }
        return null;
    }

    public final yvf0 getCarDescriptionTextViewProvider() {
        yvf0 yvf0Var = this.carDescriptionTextViewProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public final htc getCommunicationsAdapterFactory() {
        htc htcVar = this.communicationsAdapterFactory;
        if (htcVar != null) {
            return htcVar;
        }
        return null;
    }

    public final fxx0 getComponent() {
        fxx0 fxx0Var = this.component;
        if (fxx0Var != null) {
            return fxx0Var;
        }
        return null;
    }

    public final tse getCoroutineScope() {
        tse tseVar = this.coroutineScope;
        if (tseVar != null) {
            return tseVar;
        }
        return null;
    }

    public iqu getHorizontalButtonConfig() {
        return new iqu();
    }

    public final e getHorizontalButtonsViewPresenter() {
        e eVar = this.horizontalButtonsViewPresenter;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    public final pav getImageLoader() {
        pav pavVar = this.imageLoader;
        if (pavVar != null) {
            return pavVar;
        }
        return null;
    }

    public final vd00 getMakeAnotherOrderButtonPresenter() {
        vd00 vd00Var = this.makeAnotherOrderButtonPresenter;
        if (vd00Var != null) {
            return vd00Var;
        }
        return null;
    }

    public final o2y0 getOrderHolder() {
        o2y0 o2y0Var = this.orderHolder;
        if (o2y0Var != null) {
            return o2y0Var;
        }
        return null;
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    /* renamed from: getPeekView */
    public View getTitlesContainer() {
        View titlesContainer = super.getTitlesContainer();
        return titlesContainer.getVisibility() == 8 ? this.titleView : titlesContainer;
    }

    public abstract o getPresenter();

    public final g6y0 getSessionTimelineTracker() {
        g6y0 g6y0Var = this.sessionTimelineTracker;
        if (g6y0Var != null) {
            return g6y0Var;
        }
        return null;
    }

    public final qnu0 getStoriesUiHolderFactory() {
        qnu0 qnu0Var = this.storiesUiHolderFactory;
        if (qnu0Var != null) {
            return qnu0Var;
        }
        return null;
    }

    public final a getTravelCompanionDetailPresenter() {
        a aVar = this.travelCompanionDetailPresenter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final yvf0 getTravelCompanionStatusViewProvider() {
        yvf0 yvf0Var = this.travelCompanionStatusViewProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public void hideOrderButtonInBottomIfNeeded() {
        if (orderButtonShouldShowInTop()) {
            setMakeAnotherOrderVisible(false);
        }
    }

    @Override // defpackage.k780
    public /* bridge */ void hideSafetyCenterButton() {
    }

    public final View inflate(int layoutRes, boolean attachToRoot) {
        return LayoutInflater.from(getContext()).inflate(layoutRes, this, attachToRoot);
    }

    public abstract void inflateStateView();

    public final <V extends View> V nonNullViewById(int viewId) {
        WeakHashMap weakHashMap = b.a;
        return (V) rp31.d(this, viewId);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((i6y0) getSessionTimelineTracker()).b(zkb1.a(TaxiOrderSessionCheckpoint.SCREEN_DETAILS_ATTACHED));
        getHorizontalButtonsViewPresenter().Kg(this.horizontalButtonsView);
        getCancelPresenter().Kg(this);
        vd00 makeAnotherOrderButtonPresenter = getMakeAnotherOrderButtonPresenter();
        makeAnotherOrderButtonPresenter.Bg(this);
        tje.N(makeAnotherOrderButtonPresenter.Jg(), null, null, new MakeAnotherOrderButtonPresenter$attachView$$inlined$safeCollectIn$1(makeAnotherOrderButtonPresenter.x.a(), null, makeAnotherOrderButtonPresenter), 3);
        getTravelCompanionDetailPresenter().Kg(this);
        this.driverSection.setDriverClickListener(new vmu0(6, this));
        this.driverSection.setCarPlateClickListener(new vmu0(7, getPresenter()));
        this.scrollView.setOnScrollChangeListener(this.onScrollChangedListener);
    }

    @Override // defpackage.jxx0
    public void onButtonsInitialized() {
        hideOrderButtonInBottomIfNeeded();
        reportButtonsVisibility();
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    public void onContainerViewTransitionFinished() {
        super.onContainerViewTransitionFinished();
        this.isContainerViewPositioned = true;
        this.showMultiorderBubblePendingAction.run();
        this.showMultiorderBubblePendingAction = new hos0(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHorizontalButtonsViewPresenter().Cg();
        getCancelPresenter().Cg();
        getMakeAnotherOrderButtonPresenter().Cg();
        getTravelCompanionDetailPresenter().Cg();
        this.scrollView.setOnScrollChangeListener((View.OnScrollChangeListener) null);
    }

    public o2y0 orderHolder() {
        return getOrderHolder();
    }

    @Override // defpackage.il70
    public void render(ul70 state) {
        this.bottomCircleButtonsView.setCancelVisible(state.b);
        this.bottomCircleButtonsView.setCancelEnabled(state.a);
        this.bottomCircleButtonsView.setCancelCost(state.c);
    }

    @Override // defpackage.jxx0
    public void renderBottomButtons(x4j state) {
        DetailsCardHorizontalButtons detailsCardHorizontalButtons = this.bottomHorizontalButtons;
        if (detailsCardHorizontalButtons == null) {
            return;
        }
        if (jl40.l(state, v4j.a)) {
            this.bottomCircleButtonsView.setVisibility(8);
            detailsCardHorizontalButtons.setVisibility(8);
        } else if (jl40.l(state, u4j.a)) {
            this.bottomCircleButtonsView.setVisibility(0);
            detailsCardHorizontalButtons.setVisibility(8);
        } else {
            if (!(state instanceof w4j)) {
                w511.b();
                return;
            }
            this.bottomCircleButtonsView.setVisibility(8);
            detailsCardHorizontalButtons.setVisibility(0);
            detailsCardHorizontalButtons.render((w4j) state);
        }
    }

    @Override // defpackage.jxx0
    public void renderCancelButton(a5j detailsCardCancelUiState) {
        if (detailsCardCancelUiState.a) {
            setupCancelButton(detailsCardCancelUiState);
        } else {
            hideCancelItem();
        }
    }

    @Override // defpackage.yc11
    public void renderCompanionCard(List<ad11> travelCompanions) {
        boolean isEmpty = travelCompanions.isEmpty();
        TravelCompanionDetailView travelCompanionDetailView = this.travelCompanionDetailView;
        if (isEmpty) {
            travelCompanionDetailView.setVisibility(8);
        } else {
            travelCompanionDetailView.setVisibility(0);
            this.travelCompanionDetailView.setCompanionCards(getTravelCompanionStatusViewProvider(), travelCompanions);
        }
    }

    @Override // defpackage.jxx0
    public void renderDetailsCardStyle(OrderDetailsStyleState state) {
        if (state == OrderDetailsStyleState.DETAILS_STYLE_V2) {
            updateTopContainerPaddings(0, 0);
        } else if (state == OrderDetailsStyleState.DETAILS_STYLE_V1) {
            updateTopContainerPaddings(this.topContainerDefaultPaddingTop, this.topContainerDefaultPaddingBottom);
        }
    }

    @Override // defpackage.jxx0
    public void renderDriverSection(f6j state) {
        this.driverSection.render(state);
    }

    @Override // defpackage.jxx0
    public void renderPromoPlaquesBottomSection(List<kpf0> bottomPlaques, o2y0 orderHolder) {
        g gVar = this.promoPlaqueBottomAdapter;
        if (gVar != null) {
            this.promoPlaqueBottomSection.setVisibility(!bottomPlaques.isEmpty() ? 0 : 8);
            gVar.l(bottomPlaques, orderHolder, PromoPlaqueAnalytics$Screen.DETAILS);
        }
    }

    @Override // defpackage.jxx0
    public void renderPromoPlaquesTopSection(List<kpf0> topPlaques, o2y0 orderHolder) {
        g gVar = this.promoPlaqueTopAdapter;
        if (gVar != null) {
            this.promoPlaqueTopSection.setVisibility(!topPlaques.isEmpty() ? 0 : 8);
            gVar.l(topPlaques, orderHolder, PromoPlaqueAnalytics$Screen.DETAILS_TOP);
        }
    }

    @Override // defpackage.jxx0
    public void renderTopButtons(x4j state) {
        DetailsCardHorizontalButtons detailsCardHorizontalButtons;
        TopCircleButtonsView topCircleButtonsView = this.topCircleButtonsView;
        if (topCircleButtonsView == null || (detailsCardHorizontalButtons = this.topHorizontalButtons) == null) {
            return;
        }
        if (jl40.l(state, v4j.a)) {
            topCircleButtonsView.setVisibility(8);
            detailsCardHorizontalButtons.setVisibility(8);
        } else if (jl40.l(state, u4j.a)) {
            topCircleButtonsView.setVisibility(0);
            detailsCardHorizontalButtons.setVisibility(8);
        } else {
            if (!(state instanceof w4j)) {
                w511.b();
                return;
            }
            topCircleButtonsView.setVisibility(8);
            detailsCardHorizontalButtons.setVisibility(0);
            detailsCardHorizontalButtons.render((w4j) state);
        }
    }

    @Override // defpackage.jxx0
    public void renderUpsell(d8j state) {
        if (jl40.l(state, c8j.a)) {
            this.upsell.setVisibility(8);
        } else if (!(state instanceof b8j)) {
            w511.b();
        } else {
            this.upsell.setVisibility(0);
            this.upsell.render((b8j) state);
        }
    }

    @Override // com.yandex.go.taxi.order.state.OrderStateView
    public void resetScroll() {
        NestedScrollView nestedScrollView = this.scrollView;
        Rect rect = xw31.a;
        nestedScrollView.smoothScrollTo(0, 0);
        nestedScrollView.smoothScrollTo(0, 0);
    }

    public final void setActivity(Activity activity) {
        this.activity = activity;
    }

    public final void setCancelPresenter(l lVar) {
        this.cancelPresenter = lVar;
    }

    public final void setCarDescriptionTextViewProvider(yvf0 yvf0Var) {
        this.carDescriptionTextViewProvider = yvf0Var;
    }

    public final void setCommunicationsAdapterFactory(htc htcVar) {
        this.communicationsAdapterFactory = htcVar;
    }

    public final void setComponent(fxx0 fxx0Var) {
        this.component = fxx0Var;
    }

    public final void setCoroutineScope(tse tseVar) {
        this.coroutineScope = tseVar;
    }

    public final void setHorizontalButtonsViewPresenter(e eVar) {
        this.horizontalButtonsViewPresenter = eVar;
    }

    public final void setImageLoader(pav pavVar) {
        this.imageLoader = pavVar;
    }

    public final void setMakeAnotherOrderButtonPresenter(vd00 vd00Var) {
        this.makeAnotherOrderButtonPresenter = vd00Var;
    }

    @Override // defpackage.ud00
    public void setMakeAnotherOrderVisible(boolean visible) {
        this.bottomCircleButtonsView.setMakeAnotherOrderVisible(visible && !orderButtonShouldShowInTop());
    }

    public final void setOrderHolder(o2y0 o2y0Var) {
        this.orderHolder = o2y0Var;
    }

    public final void setSessionTimelineTracker(g6y0 g6y0Var) {
        this.sessionTimelineTracker = g6y0Var;
    }

    public final void setStoriesUiHolderFactory(qnu0 qnu0Var) {
        this.storiesUiHolderFactory = qnu0Var;
    }

    @Override // defpackage.jxx0
    public void setTitles(b980 orderTitles) {
        boolean z = true;
        int i = 0;
        if (orderTitles.i == OrderTitles$Alignment.START && this.titlesLayout != null) {
            this.titleView.setGravity(8388611);
            this.subtitleView.setGravity(8388611);
            this.titlesLayout.setGravity(8388611);
            this.headerDividerView.setVisibility(0);
            LinearLayout linearLayout = this.subtitleContainer;
            if (linearLayout != null) {
                linearLayout.setGravity(8388611);
            }
        } else if (this.titlesLayout != null) {
            this.titleView.setGravity(1);
            this.subtitleView.setGravity(1);
            this.titlesLayout.setGravity(1);
            this.headerDividerView.setVisibility(8);
            LinearLayout linearLayout2 = this.subtitleContainer;
            if (linearLayout2 != null) {
                linearLayout2.setGravity(1);
            }
        }
        String str = orderTitles.a;
        if (str == null || evu0.J(str)) {
            this.titleView.setVisibility(8);
        } else {
            this.titleView.setText(orderTitles.a);
            this.titleView.setContentDescription(orderTitles.h);
            this.titleView.setTextColor(orderTitles.b);
            this.titleView.setVisibility(0);
        }
        CharSequence charSequence = orderTitles.c;
        if (charSequence != null && !evu0.J(charSequence)) {
            if (xtb1.e(orderTitles.c, this.subtitleView.getText())) {
                this.subtitleView.setText(orderTitles.c);
            }
            this.subtitleView.setVisibility(0);
            CarDescriptionTextView carDescriptionTextView = this.carDescription;
            if (carDescriptionTextView != null) {
                carDescriptionTextView.setVisibility(8);
                return;
            }
            return;
        }
        this.subtitleView.setVisibility(8);
        CarDescriptionTextView carDescriptionTextView2 = this.carDescription;
        if (carDescriptionTextView2 != null) {
            q48 q48Var = orderTitles.e;
            if (q48Var == null || orderTitles.i != OrderTitles$Alignment.CENTER) {
                carDescriptionTextView2.setVisibility(8);
                return;
            }
            DriveState driveState = getOrderHolder().b().h.b;
            if (driveState != DriveState.SCHEDULED && driveState != DriveState.SCHEDULING) {
                z = false;
            }
            carDescriptionTextView2.setOnClickListener(new tai0(27, this, carDescriptionTextView2));
            b.p(carDescriptionTextView2, new bi(getContext().getString(kyh0.open_copy_menu), i));
            carDescriptionTextView2.setData(q48Var, z);
            carDescriptionTextView2.setVisibility(0);
        }
    }

    public final void setTravelCompanionDetailPresenter(a aVar) {
        this.travelCompanionDetailPresenter = aVar;
    }

    public final void setTravelCompanionStatusViewProvider(yvf0 yvf0Var) {
        this.travelCompanionStatusViewProvider = yvf0Var;
    }

    @Override // defpackage.ud00
    public void showMultiorderTooltip(String text) {
        if (this.isContainerViewPositioned) {
            showMultiorderTooltipInternal(text);
        } else {
            this.showMultiorderBubblePendingAction = new mxx0(this, text, 0);
        }
    }

    @Override // defpackage.ud00
    public void showMultiorderTooltipWithoutDismissDelay(String text) {
        if (this.isContainerViewPositioned) {
            showMultiorderTooltipWithoutDismissDelayInternal(text);
        } else {
            this.showMultiorderBubblePendingAction = new mxx0(this, text, 1);
        }
    }

    @Override // defpackage.k780
    public /* bridge */ void showSafetyCenterButton(String str) {
    }

    public qnu0 storiesUiHolderFactory() {
        return getStoriesUiHolderFactory();
    }

    public final View inflate(int layoutRes) {
        return c.q(this, layoutRes, true);
    }
}
