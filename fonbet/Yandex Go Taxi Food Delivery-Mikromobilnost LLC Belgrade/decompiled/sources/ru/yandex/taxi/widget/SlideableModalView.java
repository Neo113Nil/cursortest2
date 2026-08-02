package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a130;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.d130;
import defpackage.d82;
import defpackage.e32;
import defpackage.eor;
import defpackage.g030;
import defpackage.h030;
import defpackage.hos0;
import defpackage.jos0;
import defpackage.k4o;
import defpackage.kos0;
import defpackage.ku31;
import defpackage.lp2;
import defpackage.lq31;
import defpackage.mq31;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.np31;
import defpackage.ny61;
import defpackage.qje;
import defpackage.r330;
import defpackage.s73;
import defpackage.sms;
import defpackage.sph0;
import defpackage.t52;
import defpackage.tje;
import defpackage.u130;
import defpackage.u73;
import defpackage.va90;
import defpackage.vjp0;
import defpackage.vpa;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.ymp0;
import defpackage.yvi0;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.Supplier;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.AnalyticsContext$ElementState;
import ru.yandex.taxi.analytics.ModalViewCloseReason;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.coordinator.BottomSheetBottomFloatButtonBehavior;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.views.SlideableShadowView;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b&\u0018\u0000 \u008e\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\b\u008f\u0002\u0090\u0002\u0095\u0001\u0091\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010B%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u0015J\u000f\u0010\u000b\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u000b\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0014¢\u0006\u0004\b%\u0010$J\u001f\u0010)\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\nH\u0015¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0016H\u0014¢\u0006\u0004\b+\u0010\u0017J\u0015\u0010-\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0016H\u0014¢\u0006\u0004\b2\u0010\u0017J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0014¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020\u00162\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J/\u0010?\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010@J'\u0010?\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010AJ'\u0010?\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010BJ\u001f\u0010?\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010CJ\u0017\u0010D\u001a\u00020\u00162\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0016H\u0014¢\u0006\u0004\bF\u0010\u0017J\u000f\u0010G\u001a\u00020\u0016H\u0014¢\u0006\u0004\bG\u0010\u0017J\r\u0010H\u001a\u00020\u0006¢\u0006\u0004\bH\u00104J\u000f\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u00104J'\u0010K\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00062\b\b\u0002\u0010<\u001a\u00020\u0006¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0013H\u0014¢\u0006\u0004\bM\u0010\u001eJ\u000f\u0010N\u001a\u00020\nH\u0014¢\u0006\u0004\bN\u0010$J\u000f\u0010O\u001a\u00020\u0006H\u0016¢\u0006\u0004\bO\u00104J\u000f\u0010Q\u001a\u00020PH\u0014¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\u00162\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00130SH\u0014¢\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\nH\u0014¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0016H\u0014¢\u0006\u0004\b[\u0010\u0017J\u000f\u0010\\\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\\\u0010\u0017J\u000f\u0010]\u001a\u00020\u0016H\u0014¢\u0006\u0004\b]\u0010\u0017J\u001f\u0010`\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\nH\u0004¢\u0006\u0004\b`\u0010ZJ\u0017\u0010`\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u0006H\u0004¢\u0006\u0004\b`\u0010.J!\u0010b\u001a\u00020\u00162\b\u0010a\u001a\u0004\u0018\u00010\u00062\u0006\u0010_\u001a\u00020\nH\u0004¢\u0006\u0004\bb\u0010cJ\u0019\u0010b\u001a\u00020\u00162\b\u0010a\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0004\bb\u0010dJ\u001f\u0010f\u001a\u00020\u00162\u0006\u0010e\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\nH\u0004¢\u0006\u0004\bf\u0010ZJ\u0017\u0010f\u001a\u00020\u00162\u0006\u0010e\u001a\u00020\u0006H\u0004¢\u0006\u0004\bf\u0010.J\u000f\u0010g\u001a\u00020\u0006H\u0014¢\u0006\u0004\bg\u00104J\u000f\u0010h\u001a\u00020\u0006H\u0014¢\u0006\u0004\bh\u00104J\u000f\u0010i\u001a\u00020\u0016H\u0014¢\u0006\u0004\bi\u0010\u0017J\u000f\u0010j\u001a\u00020\u0016H\u0016¢\u0006\u0004\bj\u0010\u0017J\u000f\u0010k\u001a\u00020\u0016H\u0016¢\u0006\u0004\bk\u0010\u0017J\u000f\u0010l\u001a\u00020\u0016H\u0016¢\u0006\u0004\bl\u0010\u0017J\u000f\u0010^\u001a\u00020\u0006H\u0014¢\u0006\u0004\b^\u00104J\u000f\u0010m\u001a\u00020\u0006H\u0014¢\u0006\u0004\bm\u00104J\u0017\u0010n\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\nH\u0015¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0006H\u0004¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\u0006H\u0014¢\u0006\u0004\br\u00104J\u000f\u0010s\u001a\u00020\nH\u0014¢\u0006\u0004\bs\u0010$J\u001d\u0010u\u001a\u00020\u00162\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00130SH\u0015¢\u0006\u0004\bu\u0010VJ\u000f\u0010v\u001a\u00020\nH\u0014¢\u0006\u0004\bv\u0010$J\u000f\u0010w\u001a\u00020\u0016H\u0014¢\u0006\u0004\bw\u0010\u0017J\u000f\u0010x\u001a\u00020\u0016H\u0014¢\u0006\u0004\bx\u0010\u0017J\u0019\u0010{\u001a\u00020\u00162\b\u0010z\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010}\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u0006H\u0014¢\u0006\u0004\b}\u0010.J\u000f\u0010~\u001a\u00020\u0016H\u0016¢\u0006\u0004\b~\u0010\u0017J\u000f\u0010\u007f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u007f\u0010$J\u001c\u0010\u0082\u0001\u001a\u00020\u00162\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0085\u0001\u001a\u00020\u00162\t\b\u0001\u0010\u0084\u0001\u001a\u000206H\u0015¢\u0006\u0005\b\u0085\u0001\u00109J\u001c\u0010\u0086\u0001\u001a\u00020\u00162\t\b\u0001\u0010\u0084\u0001\u001a\u000206H\u0014¢\u0006\u0005\b\u0086\u0001\u00109J\u001c\u0010\u0089\u0001\u001a\u00020\u00162\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001d\u0010\u008b\u0001\u001a\u0002062\t\b\u0001\u0010\u0084\u0001\u001a\u000206H\u0014¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0010\u0010\u008d\u0001\u001a\u000206¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u000f\u0010\u008f\u0001\u001a\u00020\u0016¢\u0006\u0005\b\u008f\u0001\u0010\u0017J\u000f\u0010\u0090\u0001\u001a\u00020\u0016¢\u0006\u0005\b\u0090\u0001\u0010\u0017J\u0018\u0010\u0092\u0001\u001a\u00020\u00162\u0007\u0010\u0091\u0001\u001a\u00020y¢\u0006\u0005\b\u0092\u0001\u0010|J\u0018\u0010\u0094\u0001\u001a\u00020\u00162\u0007\u0010\u0093\u0001\u001a\u00020y¢\u0006\u0005\b\u0094\u0001\u0010|J\u001c\u0010\u0097\u0001\u001a\u00020\u00162\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001c\u0010\u009b\u0001\u001a\u00020\u00162\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001b\u0010\u009e\u0001\u001a\u00020\u00162\u0007\u0010e\u001a\u00030\u009d\u0001H\u0004¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¡\u0001\u001a\u00020\u00162\t\b\u0001\u0010 \u0001\u001a\u00020\u0006H\u0004¢\u0006\u0005\b¡\u0001\u0010.J\u0011\u0010¢\u0001\u001a\u00020\u0006H\u0004¢\u0006\u0005\b¢\u0001\u00104J\u000f\u0010£\u0001\u001a\u00020\n¢\u0006\u0005\b£\u0001\u0010$J\u0018\u0010¥\u0001\u001a\u00020\u00162\u0007\u0010¤\u0001\u001a\u00020\n¢\u0006\u0005\b¥\u0001\u0010oJ\"\u0010¨\u0001\u001a\u00020\u00162\u0007\u0010¦\u0001\u001a\u00020\n2\u0007\u0010§\u0001\u001a\u00020\u0006¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0010\u0010ª\u0001\u001a\u000206¢\u0006\u0006\bª\u0001\u0010\u008e\u0001J\u001a\u0010¬\u0001\u001a\u00020\u00162\t\b\u0001\u0010«\u0001\u001a\u000206¢\u0006\u0005\b¬\u0001\u00109J\u0010\u0010\u00ad\u0001\u001a\u000206¢\u0006\u0006\b\u00ad\u0001\u0010\u008e\u0001J\u0018\u0010¯\u0001\u001a\u00020\u00162\u0007\u0010®\u0001\u001a\u00020\n¢\u0006\u0005\b¯\u0001\u0010oJ\u001a\u0010±\u0001\u001a\u00020\u00162\t\b\u0001\u0010°\u0001\u001a\u000206¢\u0006\u0005\b±\u0001\u00109J.\u0010·\u0001\u001a\u00030¶\u00012\b\u0010³\u0001\u001a\u00030²\u00012\u000f\u0010µ\u0001\u001a\n\u0012\u0005\u0012\u00030²\u00010´\u0001H\u0014¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0011\u0010¹\u0001\u001a\u00020\nH\u0014¢\u0006\u0005\b¹\u0001\u0010$J\u0016\u0010º\u0001\u001a\u00020\u0013*\u00020:H\u0002¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0019\u0010¼\u0001\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0005\b¼\u0001\u0010\"J\u0011\u0010½\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b½\u0001\u0010\u0017J\u0011\u0010¾\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b¾\u0001\u0010\u0017J\u0011\u0010¿\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b¿\u0001\u0010\u0017J)\u0010À\u0001\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0005\bÀ\u0001\u0010LJ\u0011\u0010Á\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\bÁ\u0001\u0010\u0017J\u001b\u0010Ã\u0001\u001a\u0002062\u0007\u0010Â\u0001\u001a\u000206H\u0003¢\u0006\u0006\bÃ\u0001\u0010\u008c\u0001J\u001a\u0010Å\u0001\u001a\u00020\u00162\u0007\u0010Ä\u0001\u001a\u000206H\u0002¢\u0006\u0005\bÅ\u0001\u00109J\u0012\u0010Æ\u0001\u001a\u000206H\u0002¢\u0006\u0006\bÆ\u0001\u0010\u008e\u0001R\u0018\u0010È\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R \u0010Ë\u0001\u001a\u00030Ê\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ì\u0001R\u0018\u0010Ð\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ì\u0001R\u0018\u0010Ñ\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ì\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ì\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ì\u0001R \u0010Ô\u0001\u001a\u00030Ê\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Ì\u0001\u001a\u0006\bÕ\u0001\u0010Î\u0001R#\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00130S8\u0004X\u0084\u0004¢\u0006\u000f\n\u0005\bT\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0018\u0010Ú\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0019\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010Ü\u0001\u001a\u0005\bÝ\u0001\u0010\u001eR\u0019\u0010Þ\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001c\u0010á\u0001\u001a\u0005\u0018\u00010à\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010ã\u0001R)\u0010å\u0001\u001a\u00020\u00132\u0007\u0010ä\u0001\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bå\u0001\u0010Ü\u0001\u001a\u0005\bæ\u0001\u0010\u001eR\u001c\u0010ç\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R)\u0010é\u0001\u001a\u00020\n2\u0007\u0010ä\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0005\bé\u0001\u0010$R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010ë\u0001R\u0017\u0010ì\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010ë\u0001R\u0019\u0010í\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0019\u0010®\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010ê\u0001R\u0019\u0010ï\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ê\u0001R\u001b\u0010ð\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R*\u0010ò\u0001\u001a\u0002062\u0007\u0010ä\u0001\u001a\u0002068\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bò\u0001\u0010î\u0001\u001a\u0006\bó\u0001\u0010\u008e\u0001R\u0019\u0010ô\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010ë\u0001R\u0017\u0010,\u001a\u00020\u00068\u0004@\u0004X\u0085\u000e¢\u0006\u0007\n\u0005\b,\u0010ë\u0001R\u0018\u0010ö\u0001\u001a\u00030õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0018\u0010ù\u0001\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0019\u0010\u0091\u0001\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010û\u0001R\u0019\u0010\u0093\u0001\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010û\u0001R(\u0010'\u001a\u00020&2\u0007\u0010ä\u0001\u001a\u00020&8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0005\b)\u0010þ\u0001R\u0016\u0010\u0080\u0002\u001a\u00020\u00068%X¤\u0004¢\u0006\u0007\u001a\u0005\bÿ\u0001\u00104R\u0016\u0010\u0082\u0002\u001a\u00020\u00068UX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0002\u00104R\u0016\u0010\u0084\u0002\u001a\u00020\u00068UX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0002\u00104R\u0016\u0010\u0086\u0002\u001a\u00020\u00068UX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0002\u00104R\u0016\u0010\u0088\u0002\u001a\u00020\u00068UX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0002\u00104R\u0016\u0010\u008a\u0002\u001a\u00020\u00068UX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0002\u00104R\u0013\u0010\u008b\u0002\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u008b\u0002\u0010$R\u0013\u0010\u008c\u0002\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u008c\u0002\u0010$R\u0013\u0010\u008d\u0002\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u008d\u0002\u0010$¨\u0006\u0092\u0002"}, d2 = {"Lru/yandex/taxi/widget/SlideableModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lr330;", "Lg030;", "Landroid/content/Context;", "context", "", "initialState", "<init>", "(Landroid/content/Context;I)V", "", "manualInit", "(Landroid/content/Context;Z)V", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "cardContentView", "(Landroid/view/View;Ljava/lang/Integer;)V", "Lzy11;", "()V", "onAttachedToWindow", "nestedViewContainer", "refreshNestedScrollView", "(Landroid/view/View;)V", "onDetachedFromWindow", "inflateCardContent", "()Landroid/view/View;", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "isApplyShadow", "()Z", "isNeedUpdateAnchoredHeightOnLayoutChanges", "Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "cardMode", "fromInit", "setCardMode", "(Lru/yandex/taxi/widget/SlideableModalView$CardMode;Z)V", "refreshTopPadding", "topSystemWindowInset", "setTopSystemWindowInset", "(I)V", "Lu130;", "attachInsetsHandler", "()Lu130;", "updateCurrentBackground", "getTopPadding", "()I", "getTopOffset", "", "scale", "setDefaultHorizontalScaleX", "(F)V", "Leor;", "button", "index", "gravity", "top", "addFloatButton", "(Leor;IIZ)V", "(Leor;IZ)V", "(Leor;II)V", "(Leor;I)V", "removeFloatButton", "(Leor;)V", "disableBottomButtonsShow", "enableBottomButtonsShow", "getTopWithFloatButtons", "contentTop", "view", "addViewAboveCard", "(Landroid/view/View;II)V", "contentView", "useBelowCardDimming", "getContentHeight", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "bottomSheetBehavior", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "updateUserInteractionBlockingOutside", "dispatchAccessibilityBlockOnExpanded", "dispatchAccessibilityReleaseOnCollapsed", "peekHeight", "settle", "setBehaviorPeekHeight", "height", "setBehaviorAnchorHeight", "(Ljava/lang/Integer;Z)V", "(Ljava/lang/Integer;)V", ClidProvider.STATE, "setBehaviorState", "behaviourState", "behaviourFinalState", "onKeyboardClosed", "collapse", "anchor", "expand", "anchoredHeight", "updateAnchoredHeight", "(Z)V", "convertToOffset", "(I)I", "getMaxAnchoredHeight", "settlingLayoutChanges", "behavior", "initBehavior", "canDragToExpandFromAnchored", "onSlideOut", "onArrowClick", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissWithAction", "(Ljava/lang/Runnable;)V", "onModalViewAppear", "updateArrow", "isArrowsPermanentlyHidden", "Lru/yandex/taxi/widget/ModalView$TransitionType;", "transitionType", "onTransitionEnd", "(Lru/yandex/taxi/widget/ModalView$TransitionType;)V", "newOffset", "onDialogSlide", "setBackgroundDimColor", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "convertToOffsetFromAnchored", "(F)F", "getSlideOffset", "()F", "startProgress", "stopProgress", "onSlideOutListener", "setOnSlideOutListener", "onArrowClickListener", "setOnArrowClickListener", "Lkos0;", "slideListener", "setSlideListener", "(Lkos0;)V", "Lh030;", "listener", "setAccessibilityListener", "(Lh030;)V", "Lru/yandex/taxi/widget/ArrowsView$State;", "setArrowState", "(Lru/yandex/taxi/widget/ArrowsView$State;)V", "color", "setArrowDefaultColor", "getArrowViewHeight", "getUseSpringSettling", "useSpringSettling", "setUseSpringSettling", "useOvershootSettling", "overshootBy", "setUseOvershootSettling", "(ZI)V", "getSpringDampingRatio", "dampingRatio", "setSpringDampingRatio", "getSpringStiffness", "updateScrollViewOnHeightChange", "setUpdateScrollViewOnHeightChange", "stiffness", "setSpringStiffness", "", "analyticsContextPrefix", "", "buttonList", "Le32;", "createAnalyticsContext", "(Ljava/lang/String;Ljava/util/Set;)Le32;", "hasCustomBackground", "asView", "(Leor;)Landroid/view/View;", "dispatchArrowTouch", "init", "updateOffsetOnState", "initBelowCardDimView", "addViewBelowCard", "onCollapsedStateInternal", "offset", "sanitizeOffset", "slideOffset", "setBottomSheetScaleX", "getBackgroundScaleCompensation", "Lru/yandex/taxi/widget/SlidableCoordinatorLayout;", "root", "Lru/yandex/taxi/widget/SlidableCoordinatorLayout;", "Landroid/view/ViewGroup;", "bottomSheet", "Landroid/view/ViewGroup;", "getBottomSheet", "()Landroid/view/ViewGroup;", "startSideFabContainer", "endSideFabContainer", "topCenterContainer", "bottomStartSideFabContainer", "bottomEndSideFabContainer", "cardContentContainer", "getCardContentContainer", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "getBottomSheetBehavior", "()Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Lru/yandex/taxi/widget/ArrowsView;", "arrowsView", "Lru/yandex/taxi/widget/ArrowsView;", "Landroid/view/View;", "getCardContentView", "_cardMode", "Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "Lku31;", "viewScalier", "Lku31;", "Lkos0;", "value", "dimBackgroundView", "getDimBackgroundView", "accessibilityExpandingStateListener", "Lh030;", "isLastReportedStateExpanded", "Z", CA20Status.STATUS_USER_I, "additionalHitAreaSize", "defaultCardScaleX", "F", "arrowCaptured", "maxAnchoredHeight", "Ljava/lang/Integer;", "currentOffset", "getCurrentOffset", "currentAnchoredHeightPx", "Lt52;", "bottomSheetBehaviorCallback", "Lt52;", "Landroid/view/View$OnLayoutChangeListener;", "cardContentLayoutListener", "Landroid/view/View$OnLayoutChangeListener;", "Ljava/lang/Runnable;", "getCardMode", "()Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "(Lru/yandex/taxi/widget/SlideableModalView$CardMode;)V", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "getFullscreenBackgroundAttrRes", "fullscreenBackgroundAttrRes", "getFloatButtonBackgroundOffset", "floatButtonBackgroundOffset", "getSlideableBackgroundAttrRes", "slideableBackgroundAttrRes", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "getSlideableBackgroundOffset", "slideableBackgroundOffset", "isCollapsed", "isAnchored", "isExpanded", "Companion", "va90", "jos0", "CardMode", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class SlideableModalView extends ModalView implements r330, g030 {
    public static final jos0 Companion = new jos0();
    public static final int DEFAULT_FLOAT_BUTTON_CONTAINER_INDEX = -1;
    private static final float MAX_OFFSET = 1.0f;
    public static final lq31 SLIDE_OUT_EVENT;
    public static final int STATE_NOT_DEFINED = -1;
    public static final lq31 TOUCH_OUTSIDE_EVENT;
    private CardMode _cardMode;
    private h030 accessibilityExpandingStateListener;
    private final int additionalHitAreaSize;
    private boolean arrowCaptured;
    private final ArrowsView arrowsView;
    private final ViewGroup bottomEndSideFabContainer;
    private final ViewGroup bottomSheet;
    private final AnchorBottomSheetBehavior<View> bottomSheetBehavior;
    private final t52 bottomSheetBehaviorCallback;
    private final ViewGroup bottomStartSideFabContainer;
    private final ViewGroup cardContentContainer;
    private final View.OnLayoutChangeListener cardContentLayoutListener;
    private final View cardContentView;
    private int currentAnchoredHeightPx;
    private float currentOffset;
    private float defaultCardScaleX;
    private View dimBackgroundView;
    private final ViewGroup endSideFabContainer;
    private final int initialState;
    private boolean isLastReportedStateExpanded;
    private Integer maxAnchoredHeight;
    private Runnable onArrowClickListener;
    private Runnable onSlideOutListener;
    private final SlidableCoordinatorLayout root;
    private kos0 slideListener;
    private final ViewGroup startSideFabContainer;
    private final ViewGroup topCenterContainer;
    protected int topSystemWindowInset;
    private boolean updateScrollViewOnHeightChange;
    private ku31 viewScalier;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/widget/SlideableModalView$CardMode;", "", "SLIDEABLE_CARD", "FIXED_CARD", "FULLSCREEN", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CardMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CardMode[] $VALUES;
        public static final CardMode FIXED_CARD;
        public static final CardMode FULLSCREEN;
        public static final CardMode SLIDEABLE_CARD;

        static {
            CardMode cardMode = new CardMode("SLIDEABLE_CARD", 0);
            SLIDEABLE_CARD = cardMode;
            CardMode cardMode2 = new CardMode("FIXED_CARD", 1);
            FIXED_CARD = cardMode2;
            CardMode cardMode3 = new CardMode("FULLSCREEN", 2);
            FULLSCREEN = cardMode3;
            CardMode[] cardModeArr = {cardMode, cardMode2, cardMode3};
            $VALUES = cardModeArr;
            $ENTRIES = kotlin.enums.a.a(cardModeArr);
        }

        public static CardMode valueOf(String str) {
            return (CardMode) Enum.valueOf(CardMode.class, str);
        }

        public static CardMode[] values() {
            return (CardMode[]) $VALUES.clone();
        }
    }

    static {
        ModalViewCloseReason modalViewCloseReason = ModalViewCloseReason.BACK_PRESSED;
        int i = 11;
        TOUCH_OUTSIDE_EVENT = new sms(i);
        ModalViewCloseReason modalViewCloseReason2 = ModalViewCloseReason.BACK_PRESSED;
        SLIDE_OUT_EVENT = new sms(i);
    }

    public SlideableModalView(View view, Integer num) {
        super(view.getContext());
        ru.yandex.taxi.design.utils.c.q(this, sph0.slideable_modal_view, true);
        this.root = (SlidableCoordinatorLayout) findViewById(ndh0.slideable_modal_view_root);
        ViewGroup viewGroup = (ViewGroup) findViewById(ndh0.slideable_modal_view_bottom_sheet);
        this.bottomSheet = viewGroup;
        this.startSideFabContainer = (ViewGroup) findViewById(ndh0.start_side_fab_container);
        this.endSideFabContainer = (ViewGroup) findViewById(ndh0.end_side_fab_container);
        this.topCenterContainer = (ViewGroup) findViewById(ndh0.top_center_container);
        this.bottomStartSideFabContainer = (ViewGroup) findViewById(ndh0.bottom_start_side_fab_container);
        this.bottomEndSideFabContainer = (ViewGroup) findViewById(ndh0.bottom_end_side_fab_container);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(ndh0.slideable_modal_view_card_content_container);
        this.cardContentContainer = viewGroup2;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ny61.g("The view is not a child of CoordinatorLayout");
            throw null;
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof AnchorBottomSheetBehavior)) {
            ny61.g("The view is not associated with AnchorBottomSheetBehavior");
            throw null;
        }
        this.bottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
        this.arrowsView = (ArrowsView) findViewById(ndh0.slideable_modal_view_arrows);
        this._cardMode = CardMode.SLIDEABLE_CARD;
        this.dimBackgroundView = this;
        this.additionalHitAreaSize = tje.r(mrg0.go_design_s_space, getContext());
        this.defaultCardScaleX = 1.0f;
        this.bottomSheetBehaviorCallback = new va90((Object) this);
        this.cardContentLayoutListener = new lp2(5, this);
        this.onSlideOutListener = new vpa(29);
        this.onArrowClickListener = new hos0(0);
        this.cardContentView = view;
        viewGroup2.addView(view);
        this.initialState = num != null ? num.intValue() : -1;
        init();
    }

    public static /* synthetic */ void addViewAboveCard$default(SlideableModalView slideableModalView, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: addViewAboveCard");
            return;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        slideableModalView.addViewAboveCard(view, i, i2);
    }

    private final void addViewBelowCard(View view, int gravity, int index) {
        int i = gravity & 8388615;
        if (i == 8388611) {
            addViewToContainer(this.bottomStartSideFabContainer, view, index);
        } else {
            if (i != 8388613) {
                return;
            }
            addViewToContainer(this.bottomEndSideFabContainer, view, index);
        }
    }

    public static final void addViewToContainer(ViewGroup viewGroup, View view, int i) {
        Companion.getClass();
        ViewParent parent = view.getParent();
        if (parent == null) {
            viewGroup.addView(view, i);
        } else if (parent != viewGroup) {
            ((ViewGroup) parent).removeView(view);
            viewGroup.addView(view, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View asView(eor eorVar) {
        return (View) eorVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cardContentLayoutListener$lambda$0(SlideableModalView slideableModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (slideableModalView.get_cardMode() != CardMode.FULLSCREEN && slideableModalView.isNeedUpdateAnchoredHeightOnLayoutChanges()) {
            slideableModalView.updateAnchoredHeight(slideableModalView.settlingLayoutChanges());
        }
        if (!slideableModalView.updateScrollViewOnHeightChange || i8 == i4) {
            return;
        }
        slideableModalView.refreshNestedScrollView(view);
    }

    private final boolean dispatchArrowTouch(MotionEvent ev) {
        boolean z = xw31.l((int) ev.getRawX(), (int) ev.getRawY(), this.additionalHitAreaSize, this.arrowsView) && this.arrowsView.getVisibility() == 0;
        int action = ev.getAction();
        if (action != 0) {
            if (action == 1) {
                if (!z || !this.arrowCaptured) {
                    return false;
                }
                this.arrowCaptured = false;
                this.arrowsView.performClick();
                return z;
            }
            if (action == 2) {
                return false;
            }
            if (action == 3) {
                this.arrowCaptured = false;
                return z;
            }
        } else if (z) {
            this.arrowCaptured = true;
        }
        return z;
    }

    private final float getBackgroundScaleCompensation() {
        if (getSlideableBackgroundOffset() == 0) {
            return 1.0f;
        }
        float width = getWidth();
        return width / (width - (r0 * 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPreDrawListener$lambda$0(SlideableModalView slideableModalView, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        slideableModalView.setInitialBehaviorState(slideableModalView.bottomSheetBehavior);
        return onPreDrawListener.onPreDraw();
    }

    private final void init() {
        ru.yandex.taxi.design.utils.c.B(this.arrowsView, new ymp0(5, this));
        setCardMode(CardMode.SLIDEABLE_CARD, true);
        final int i = 0;
        this.arrowsView.setExtraTopOffsetSupplier(new Supplier(this) { // from class: ios0
            public final /* synthetic */ SlideableModalView b;

            {
                this.b = this;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                Integer init$lambda$1;
                Integer init$lambda$2;
                int i2 = i;
                SlideableModalView slideableModalView = this.b;
                switch (i2) {
                    case 0:
                        init$lambda$1 = SlideableModalView.init$lambda$1(slideableModalView);
                        return init$lambda$1;
                    default:
                        init$lambda$2 = SlideableModalView.init$lambda$2(slideableModalView);
                        return init$lambda$2;
                }
            }
        });
        if (useBelowCardDimming()) {
            initBelowCardDimView();
        }
        if (getIsCollapsable()) {
            final int i2 = 1;
            this.root.addView(new SlideableShadowView(getContext(), ndh0.slideable_modal_view_bottom_sheet, new Supplier(this) { // from class: ios0
                public final /* synthetic */ SlideableModalView b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Supplier
                public final Object get() {
                    Integer init$lambda$1;
                    Integer init$lambda$2;
                    int i22 = i2;
                    SlideableModalView slideableModalView = this.b;
                    switch (i22) {
                        case 0:
                            init$lambda$1 = SlideableModalView.init$lambda$1(slideableModalView);
                            return init$lambda$1;
                        default:
                            init$lambda$2 = SlideableModalView.init$lambda$2(slideableModalView);
                            return init$lambda$2;
                    }
                }
            }), 0);
        }
        KeyEvent.Callback childAt = this.cardContentContainer.getChildAt(0);
        if (childAt instanceof vjp0) {
            this.root.setScrollableContent((vjp0) childAt);
        }
        xw31.K(getFloatButtonBackgroundOffset(), this.startSideFabContainer);
        xw31.z(getFloatButtonBackgroundOffset(), this.endSideFabContainer);
        xw31.K(getFloatButtonBackgroundOffset(), this.bottomStartSideFabContainer);
        xw31.z(getFloatButtonBackgroundOffset(), this.bottomEndSideFabContainer);
        updateOffsetOnState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer init$lambda$1(SlideableModalView slideableModalView) {
        return Integer.valueOf(slideableModalView.getTopOffset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer init$lambda$2(SlideableModalView slideableModalView) {
        return Integer.valueOf(slideableModalView.getTopOffset());
    }

    private final void initBelowCardDimView() {
        int max = Math.max(0, this.root.indexOfChild(this.bottomSheet));
        final Context context = getContext();
        this.dimBackgroundView = new View(context) { // from class: ru.yandex.taxi.widget.SlideableModalView$initBelowCardDimView$1
            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent event) {
                int behaviourFinalState = SlideableModalView.this.behaviourFinalState();
                if (behaviourFinalState == 3 || behaviourFinalState == 7) {
                    return SlideableModalView.this.onTouchEvent(event);
                }
                return false;
            }
        };
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        setClipChildren(false);
        setClipToPadding(false);
        this.root.setClipChildren(false);
        this.root.setClipToPadding(false);
        marginLayoutParams.topMargin = -getTopPadding();
        this.root.addView(this.dimBackgroundView, max, marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onArrowClickListener$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCollapsedStateInternal() {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        np31.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSlideOutListener$lambda$0() {
    }

    private final float sanitizeOffset(float offset) {
        if (Float.isNaN(offset)) {
            return 0.0f;
        }
        if (Float.compare(offset, -1.0f) < 0) {
            return -1.0f;
        }
        if (Float.compare(offset, 1.0f) > 0) {
            return 1.0f;
        }
        return offset;
    }

    private final void setBottomSheetScaleX(float slideOffset) {
        float backgroundScaleCompensation = getBackgroundScaleCompensation();
        if (Float.compare(this.defaultCardScaleX, 1.0f) == 0 && Float.compare(backgroundScaleCompensation, 1.0f) == 0) {
            return;
        }
        float f = this.defaultCardScaleX;
        this.bottomSheet.setScaleX((((1.0f - f) * slideOffset) + f) * backgroundScaleCompensation);
    }

    private final void updateOffsetOnState() {
        if (3 == this.initialState) {
            this.currentOffset = 1.0f;
        }
    }

    @Override // defpackage.r330
    public void addFloatButton(eor button, int gravity, boolean top) {
        if (top) {
            addFloatButton(button, gravity);
        } else {
            addViewBelowCard(asView(button), gravity, -1);
        }
    }

    public final void addViewAboveCard(View view, int gravity, int index) {
        int i = 8388615 & gravity;
        if (i == 1) {
            addViewToContainer(this.topCenterContainer, view, index);
            return;
        }
        if (i == 8388611) {
            addViewToContainer(this.startSideFabContainer, view, index);
            return;
        }
        if (i == 8388613) {
            addViewToContainer(this.endSideFabContainer, view, index);
            return;
        }
        addViewToContainer(this.root, view, index);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setAnchorId(ndh0.slideable_modal_view_bottom_sheet);
        layoutParams.anchorGravity = gravity;
        layoutParams.gravity = gravity;
        view.setLayoutParams(layoutParams);
    }

    public void anchor() {
        if (get_cardMode() != CardMode.SLIDEABLE_CARD) {
            return;
        }
        this.bottomSheetBehavior.P(6, true, false);
    }

    public int anchoredHeight() {
        int height = this.root.getHeight();
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        return height - anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        updateCurrentBackground();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public u130 attachInsetsHandler() {
        return new h(this);
    }

    public int behaviourFinalState() {
        return this.bottomSheetBehavior.y();
    }

    public int behaviourState() {
        return this.bottomSheetBehavior.E;
    }

    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return false;
    }

    public void collapse() {
        if (get_cardMode() != CardMode.SLIDEABLE_CARD) {
            return;
        }
        this.bottomSheetBehavior.P(4, true, false);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.y700
    public int contentTop() {
        return this.bottomSheet.getTop();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.root;
    }

    public final int convertToOffset(int height) {
        return this.root.getHeight() - Math.min(this.cardContentContainer.getHeight(), height);
    }

    public float convertToOffsetFromAnchored(float newOffset) {
        if (!getCanDragToExpandedState()) {
            return newOffset;
        }
        float x = this.bottomSheetBehavior.x();
        return Math.max(sanitizeOffset((newOffset - x) / (1.0f - x)), 0.0f);
    }

    public e32 createAnalyticsContext(String analyticsContextPrefix, Set<String> buttonList) {
        return get_cardMode() == CardMode.FULLSCREEN ? new e32(analyticsContextPrefix, AnalyticsContext$ElementState.SCREEN, buttonList) : new e32(analyticsContextPrefix, AnalyticsContext$ElementState.CARD, buttonList);
    }

    public void disableBottomButtonsShow() {
        this.bottomEndSideFabContainer.setVisibility(8);
        this.bottomStartSideFabContainer.setVisibility(8);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.bottomEndSideFabContainer.getLayoutParams();
        ((CoordinatorLayout.LayoutParams) this.bottomStartSideFabContainer.getLayoutParams()).setBehavior(null);
        layoutParams.setBehavior(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismissWithAction(Runnable onAnimationEnd) {
        if (isCollapsed()) {
            dismissInternalWithoutAnimation();
        } else {
            super.dismissWithAction(onAnimationEnd);
        }
    }

    public void dispatchAccessibilityBlockOnExpanded() {
        h030 h030Var = this.accessibilityExpandingStateListener;
        if (h030Var != null) {
            d130 d130Var = (d130) ((yvi0) h030Var).a;
            a130 a130Var = d130Var.g;
            FrameLayout frameLayout = d130Var.f;
            a130Var.e++;
            a130Var.a.a(frameLayout, a130Var.b, a130Var.c);
        }
    }

    public void dispatchAccessibilityReleaseOnCollapsed() {
        h030 h030Var = this.accessibilityExpandingStateListener;
        if (h030Var != null) {
            d130 d130Var = (d130) ((yvi0) h030Var).a;
            d130Var.g.a(d130Var.f);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return dispatchArrowTouch(ev) || super.dispatchTouchEvent(ev);
    }

    public void enableBottomButtonsShow() {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.bottomEndSideFabContainer.getLayoutParams();
        ((CoordinatorLayout.LayoutParams) this.bottomStartSideFabContainer.getLayoutParams()).setBehavior(new BottomSheetBottomFloatButtonBehavior());
        layoutParams.setBehavior(new BottomSheetBottomFloatButtonBehavior());
    }

    public void expand() {
        CardMode cardMode = get_cardMode();
        CardMode cardMode2 = CardMode.SLIDEABLE_CARD;
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        if (cardMode != cardMode2) {
            anchorBottomSheetBehavior.P(7, true, false);
        } else {
            anchorBottomSheetBehavior.P(3, true, false);
        }
    }

    public final int getArrowViewHeight() {
        return this.arrowsView.getHeight();
    }

    public final ViewGroup getBottomSheet() {
        return this.bottomSheet;
    }

    public final AnchorBottomSheetBehavior<View> getBottomSheetBehavior() {
        return this.bottomSheetBehavior;
    }

    public final ViewGroup getCardContentContainer() {
        return this.cardContentContainer;
    }

    public final View getCardContentView() {
        return this.cardContentView;
    }

    public abstract int getCardContentViewLayoutRes();

    /* renamed from: getCardMode, reason: from getter */
    public final CardMode get_cardMode() {
        return this._cardMode;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public int getContentHeight() {
        return this.cardContentView.getHeight();
    }

    /* renamed from: getCornerRadius */
    public int getCardCornerRadius() {
        return tje.r(mrg0.modal_view_corner_radius_big, getContext());
    }

    public final float getCurrentOffset() {
        return this.currentOffset;
    }

    public final View getDimBackgroundView() {
        return this.dimBackgroundView;
    }

    public int getFloatButtonBackgroundOffset() {
        return tje.r(mrg0.component_float_button_icon_shadow_compensation, getContext());
    }

    public int getFullscreenBackgroundAttrRes() {
        return xng0.bgMain;
    }

    public int getMaxAnchoredHeight() {
        Integer num = this.maxAnchoredHeight;
        return num != null ? num.intValue() : this.root.getHeight();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
        final ViewTreeObserver.OnPreDrawListener preDrawListener = super.getPreDrawListener();
        return new ViewTreeObserver.OnPreDrawListener() { // from class: gos0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean preDrawListener$lambda$0;
                preDrawListener$lambda$0 = SlideableModalView.getPreDrawListener$lambda$0(SlideableModalView.this, preDrawListener);
                return preDrawListener$lambda$0;
            }
        };
    }

    public final float getSlideOffset() {
        return this.bottomSheetBehavior.z();
    }

    public int getSlideableBackgroundAttrRes() {
        return xng0.bgMain;
    }

    public int getSlideableBackgroundOffset() {
        return 0;
    }

    public final float getSpringDampingRatio() {
        return (float) this.bottomSheetBehavior.k0.u.b;
    }

    public final float getSpringStiffness() {
        double d = this.bottomSheetBehavior.k0.u.a;
        return (float) (d * d);
    }

    public int getTopOffset() {
        return 0;
    }

    public int getTopPadding() {
        return tje.u(24, getContext()) + this.topSystemWindowInset;
    }

    public final int getTopWithFloatButtons() {
        return this.bottomSheet.getTop() - Math.max(this.startSideFabContainer.getHeight(), this.endSideFabContainer.getHeight());
    }

    public final boolean getUseSpringSettling() {
        return this.bottomSheetBehavior.l0;
    }

    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return false;
    }

    public View inflateCardContent() {
        return ru.yandex.taxi.design.utils.c.q(this.cardContentContainer, getCardContentViewLayoutRes(), true);
    }

    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        behavior.C = false;
        behavior.M(0, false);
        behavior.G(0, false);
        behavior.V = getCanDragToExpandedState();
        behavior.N = this.bottomSheetBehaviorCallback;
    }

    public final boolean isAnchored() {
        return this.bottomSheetBehavior.E == 6;
    }

    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return true;
    }

    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return false;
    }

    public final boolean isCollapsed() {
        return this.bottomSheetBehavior.E == 4;
    }

    public final boolean isExpanded() {
        int behaviourState = behaviourState();
        return (behaviourState == 6 && !getCanDragToExpandedState()) || behaviourState == 3 || behaviourState == 7;
    }

    /* renamed from: isLastReportedStateExpanded, reason: from getter */
    public final boolean getIsLastReportedStateExpanded() {
        return this.isLastReportedStateExpanded;
    }

    public boolean isNeedUpdateAnchoredHeightOnLayoutChanges() {
        return true;
    }

    public final void manualInit() {
        init();
    }

    public void onArrowClick() {
        if (this.arrowsView.getVisibility() == 0) {
            ModalViewCloseReason modalViewCloseReason = ModalViewCloseReason.TOUCH_OUTSIDE;
            setCloseTransitionReason(modalViewCloseReason);
            Map<String, Object> eventAnalyticsParams = eventAnalyticsParams(TOUCH_OUTSIDE_EVENT);
            mq31 mq31Var = ModalView.viewEventListener;
            getAnalyticsContext();
            mq31Var.getClass();
            ModalView.viewEventListener.d(getAnalyticsContext(), eventAnalyticsParams, modalViewCloseReason);
            dismiss();
            onDismissManually();
            this.onArrowClickListener.run();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initBehavior(this.bottomSheetBehavior);
        this.bottomSheetBehavior.L(this.cardContentView);
        updateArrow();
        this.cardContentView.addOnLayoutChangeListener(this.cardContentLayoutListener);
    }

    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        if (newState == 4 && isEnabled()) {
            onSlideOut();
        } else if ((newState == 3 || newState == 6) && get_cardMode() != CardMode.SLIDEABLE_CARD) {
            setBehaviorState(7);
        }
        updateUserInteractionBlockingOutside();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        np31.c(this);
        this.cardContentView.removeOnLayoutChangeListener(this.cardContentLayoutListener);
    }

    public void onDialogSlide(float newOffset) {
        float convertToOffsetFromAnchored = convertToOffsetFromAnchored(newOffset);
        this.currentOffset = convertToOffsetFromAnchored;
        setBackgroundDimColor(convertToOffsetFromAnchored);
        setBottomSheetScaleX(convertToOffsetFromAnchored);
    }

    public void onKeyboardClosed() {
        if (isCollapsed()) {
            return;
        }
        requestFocus();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        Integer num;
        int i;
        super.onModalViewAppear(contentTop);
        setBottomSheetScaleX(0.0f);
        updateArrow();
        long j = this.animateOnAppearing ? 200L : 0L;
        u73 decorator = this.arrowsView.getDecorator();
        int i2 = this.initialState;
        if (i2 == -1 || i2 == 3 || i2 == 7) {
            return;
        }
        ArrowsView arrowsView = decorator.a;
        num = arrowsView.colorFilter;
        i = arrowsView.arrowDefaultColor;
        cma1.e(num != null ? num.intValue() : 0, i, j, 0L, new s73(arrowsView, 4), null);
    }

    public void onSlideOut() {
        ModalViewCloseReason modalViewCloseReason = ModalViewCloseReason.SLIDE_OUT;
        setCloseTransitionReason(modalViewCloseReason);
        Map<String, Object> eventAnalyticsParams = eventAnalyticsParams(SLIDE_OUT_EVENT);
        mq31 mq31Var = ModalView.viewEventListener;
        getAnalyticsContext();
        mq31Var.getClass();
        ModalView.viewEventListener.d(getAnalyticsContext(), eventAnalyticsParams, modalViewCloseReason);
        dismissInternalWithoutAnimation();
        onDismissManually();
        this.onSlideOutListener.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTransitionEnd(ModalView.TransitionType transitionType) {
        super.onTransitionEnd(transitionType);
        updateArrow();
    }

    public int peekHeight() {
        return this.bottomSheetBehavior.a;
    }

    public void refreshNestedScrollView(View nestedViewContainer) {
        this.bottomSheetBehavior.L(nestedViewContainer);
    }

    public void refreshTopPadding() {
        int topPadding = get_cardMode() == CardMode.FULLSCREEN ? this.topSystemWindowInset : getTopPadding();
        setPadding(0, topPadding, 0, 0);
        ViewGroup.LayoutParams layoutParams = this.dimBackgroundView.getLayoutParams();
        if (useBelowCardDimming() && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            xw31.L(-topPadding, this.dimBackgroundView);
        }
    }

    @Override // defpackage.r330
    public void removeFloatButton(eor button) {
        ViewParent parent = asView(button).getParent();
        ViewGroup viewGroup = this.startSideFabContainer;
        if (parent == viewGroup) {
            viewGroup.removeView(asView(button));
            return;
        }
        ViewGroup viewGroup2 = this.endSideFabContainer;
        if (parent == viewGroup2) {
            viewGroup2.removeView(asView(button));
        }
    }

    public void setAccessibilityListener(h030 listener) {
        this.accessibilityExpandingStateListener = listener;
    }

    public final void setArrowDefaultColor(int color) {
        this.arrowsView.setArrowDefaultColor(color);
    }

    public final void setArrowState(ArrowsView.State state) {
        this.arrowsView.setState(state);
    }

    public void setBackgroundDimColor(float newOffset) {
        this.dimBackgroundView.setBackgroundColor(cma1.m(newOffset, getContext().getColor(getBackgroundColor())));
    }

    public final void setBehaviorAnchorHeight(Integer height, boolean settle) {
        this.maxAnchoredHeight = height;
        updateAnchoredHeight(settle);
    }

    public final void setBehaviorPeekHeight(int peekHeight, boolean settle) {
        this.bottomSheetBehavior.M(peekHeight, settle);
    }

    public final void setBehaviorState(int state, boolean settle) {
        this.bottomSheetBehavior.P(state, settle, false);
    }

    public void setCardMode(CardMode cardMode, boolean fromInit) {
        this._cardMode = cardMode;
        boolean z = cardMode == CardMode.FULLSCREEN;
        boolean z2 = cardMode == CardMode.SLIDEABLE_CARD;
        refreshTopPadding();
        updateCurrentBackground();
        setInitialBehaviorState(this.bottomSheetBehavior);
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        if (z) {
            anchorBottomSheetBehavior.N = null;
        } else {
            anchorBottomSheetBehavior.N = this.bottomSheetBehaviorCallback;
        }
        updateArrow();
        setDismissOnTouchOutside(z2);
    }

    public void setDefaultHorizontalScaleX(float scale) {
        if (Float.compare(scale, this.defaultCardScaleX) == 0) {
            return;
        }
        this.defaultCardScaleX = scale;
        if (behaviourState() == 4) {
            setBottomSheetScaleX(0.0f);
        }
    }

    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        int i = this.initialState;
        if (i != -1) {
            bottomSheetBehavior.P(i, true, false);
        } else if (get_cardMode() != CardMode.SLIDEABLE_CARD) {
            bottomSheetBehavior.P(7, true, false);
        } else {
            bottomSheetBehavior.P(6, true, false);
        }
        updateUserInteractionBlockingOutside();
    }

    public final void setOnArrowClickListener(Runnable onArrowClickListener) {
        this.onArrowClickListener = onArrowClickListener;
    }

    public final void setOnSlideOutListener(Runnable onSlideOutListener) {
        this.onSlideOutListener = onSlideOutListener;
    }

    public final void setSlideListener(kos0 slideListener) {
        this.slideListener = slideListener;
    }

    public final void setSpringDampingRatio(float dampingRatio) {
        this.bottomSheetBehavior.k0.u.a(dampingRatio);
    }

    public final void setSpringStiffness(float stiffness) {
        this.bottomSheetBehavior.k0.u.b(stiffness);
    }

    public final void setTopSystemWindowInset(int topSystemWindowInset) {
        if (this.topSystemWindowInset != topSystemWindowInset) {
            this.topSystemWindowInset = topSystemWindowInset;
            refreshTopPadding();
        }
    }

    public final void setUpdateScrollViewOnHeightChange(boolean updateScrollViewOnHeightChange) {
        this.updateScrollViewOnHeightChange = updateScrollViewOnHeightChange;
    }

    public final void setUseOvershootSettling(boolean useOvershootSettling, int overshootBy) {
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        anchorBottomSheetBehavior.m0 = useOvershootSettling;
        anchorBottomSheetBehavior.n0 = overshootBy;
        anchorBottomSheetBehavior.l0 = false;
    }

    public final void setUseSpringSettling(boolean useSpringSettling) {
        this.bottomSheetBehavior.l0 = useSpringSettling;
    }

    public boolean settlingLayoutChanges() {
        int min = Math.min(this.cardContentContainer.getHeight(), getMaxAnchoredHeight());
        if (this.currentAnchoredHeightPx == min) {
            return false;
        }
        this.currentAnchoredHeightPx = min;
        return true;
    }

    public final void startProgress() {
        if (this.viewScalier != null) {
            return;
        }
        ku31 ku31Var = new ku31(getContent());
        this.viewScalier = ku31Var;
        ku31Var.a();
    }

    public final void stopProgress() {
        ku31 ku31Var = this.viewScalier;
        if (ku31Var != null) {
            ku31Var.b();
        }
        this.viewScalier = null;
    }

    public void updateAnchoredHeight(boolean settle) {
        int convertToOffset = convertToOffset(getMaxAnchoredHeight());
        AnchorBottomSheetBehavior<View> anchorBottomSheetBehavior = this.bottomSheetBehavior;
        if (convertToOffset != anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x)) {
            this.bottomSheetBehavior.I(0, settle && behaviourFinalState() == 6, convertToOffset);
            kos0 kos0Var = this.slideListener;
            if (kos0Var != null) {
                kos0Var.r(anchoredHeight());
            }
        }
    }

    public void updateArrow() {
        if (getWithCloseButton() || get_cardMode() != CardMode.SLIDEABLE_CARD) {
            this.arrowsView.hideArrow();
        } else {
            this.arrowsView.showArrowPlain();
        }
    }

    public void updateCurrentBackground() {
        if (getHasCustomBackgroundColor()) {
            return;
        }
        CardMode cardMode = get_cardMode();
        CardMode cardMode2 = CardMode.FULLSCREEN;
        ViewGroup viewGroup = this.bottomSheet;
        if (cardMode == cardMode2) {
            cvw.g0(qje.t(getFullscreenBackgroundAttrRes(), getContext()), 0, viewGroup);
            this.bottomSheet.getLayoutParams().height = -1;
        } else {
            cvw.g0(qje.t(getSlideableBackgroundAttrRes(), getContext()), getCardCornerRadius(), viewGroup);
            this.bottomSheet.getLayoutParams().height = -2;
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void updateUserInteractionBlockingOutside() {
        int behaviourFinalState = behaviourFinalState();
        if (behaviourFinalState == 1 || behaviourState() == 2) {
            return;
        }
        boolean z = behaviourFinalState == 3 || behaviourFinalState == 7;
        boolean z2 = behaviourFinalState == 4 || behaviourFinalState == 6;
        if (this.accessibilityExpandingStateListener != null) {
            if (z && !this.isLastReportedStateExpanded) {
                dispatchAccessibilityBlockOnExpanded();
                this.isLastReportedStateExpanded = true;
            } else if (z2 && this.isLastReportedStateExpanded) {
                this.isLastReportedStateExpanded = false;
                dispatchAccessibilityReleaseOnCollapsed();
            }
        }
        setBlockUserInteractionOutside(z);
    }

    public boolean useBelowCardDimming() {
        return false;
    }

    public final void setBehaviorAnchorHeight(Integer height) {
        setBehaviorAnchorHeight(height, true);
    }

    public final void setBehaviorPeekHeight(int peekHeight) {
        setBehaviorPeekHeight(peekHeight, true);
    }

    public final void setBehaviorState(int state) {
        setBehaviorState(state, true);
    }

    public void addFloatButton(eor button, int index, int gravity, boolean top) {
        if (top) {
            addFloatButton(button, index, gravity);
        } else {
            addViewBelowCard(asView(button), gravity, index);
        }
    }

    public void addFloatButton(eor button, int index, int gravity) {
        addViewAboveCard(asView(button), gravity, index);
    }

    @Override // defpackage.r330
    public void addFloatButton(eor button, int gravity) {
        addFloatButton(button, -1, gravity);
    }

    public final void setCardMode(CardMode cardMode) {
        setCardMode(cardMode, false);
    }

    public SlideableModalView(Context context, boolean z) {
        super(context);
        ru.yandex.taxi.design.utils.c.q(this, sph0.slideable_modal_view, true);
        this.root = (SlidableCoordinatorLayout) findViewById(ndh0.slideable_modal_view_root);
        ViewGroup viewGroup = (ViewGroup) findViewById(ndh0.slideable_modal_view_bottom_sheet);
        this.bottomSheet = viewGroup;
        this.startSideFabContainer = (ViewGroup) findViewById(ndh0.start_side_fab_container);
        this.endSideFabContainer = (ViewGroup) findViewById(ndh0.end_side_fab_container);
        this.topCenterContainer = (ViewGroup) findViewById(ndh0.top_center_container);
        this.bottomStartSideFabContainer = (ViewGroup) findViewById(ndh0.bottom_start_side_fab_container);
        this.bottomEndSideFabContainer = (ViewGroup) findViewById(ndh0.bottom_end_side_fab_container);
        this.cardContentContainer = (ViewGroup) findViewById(ndh0.slideable_modal_view_card_content_container);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof AnchorBottomSheetBehavior) {
                this.bottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
                this.arrowsView = (ArrowsView) findViewById(ndh0.slideable_modal_view_arrows);
                this._cardMode = CardMode.SLIDEABLE_CARD;
                this.dimBackgroundView = this;
                this.additionalHitAreaSize = tje.r(mrg0.go_design_s_space, getContext());
                this.defaultCardScaleX = 1.0f;
                this.bottomSheetBehaviorCallback = new va90((Object) this);
                this.cardContentLayoutListener = new lp2(5, this);
                this.onSlideOutListener = new vpa(29);
                this.onArrowClickListener = new hos0(0);
                this.initialState = -1;
                this.cardContentView = inflateCardContent();
                if (z) {
                    return;
                }
                init();
                return;
            }
            ny61.g("The view is not associated with AnchorBottomSheetBehavior");
            throw null;
        }
        ny61.g("The view is not a child of CoordinatorLayout");
        throw null;
    }

    public SlideableModalView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SlideableModalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideableModalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, sph0.slideable_modal_view, true);
        this.root = (SlidableCoordinatorLayout) findViewById(ndh0.slideable_modal_view_root);
        ViewGroup viewGroup = (ViewGroup) findViewById(ndh0.slideable_modal_view_bottom_sheet);
        this.bottomSheet = viewGroup;
        this.startSideFabContainer = (ViewGroup) findViewById(ndh0.start_side_fab_container);
        this.endSideFabContainer = (ViewGroup) findViewById(ndh0.end_side_fab_container);
        this.topCenterContainer = (ViewGroup) findViewById(ndh0.top_center_container);
        this.bottomStartSideFabContainer = (ViewGroup) findViewById(ndh0.bottom_start_side_fab_container);
        this.bottomEndSideFabContainer = (ViewGroup) findViewById(ndh0.bottom_end_side_fab_container);
        this.cardContentContainer = (ViewGroup) findViewById(ndh0.slideable_modal_view_card_content_container);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof AnchorBottomSheetBehavior) {
                this.bottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
                this.arrowsView = (ArrowsView) findViewById(ndh0.slideable_modal_view_arrows);
                this._cardMode = CardMode.SLIDEABLE_CARD;
                this.dimBackgroundView = this;
                this.additionalHitAreaSize = tje.r(mrg0.go_design_s_space, getContext());
                this.defaultCardScaleX = 1.0f;
                this.bottomSheetBehaviorCallback = new va90((Object) this);
                this.cardContentLayoutListener = new lp2(5, this);
                this.onSlideOutListener = new d82(7);
                this.onArrowClickListener = new d82(8);
                this.cardContentView = inflateCardContent();
                this.initialState = -1;
                init();
                return;
            }
            ny61.g("The view is not associated with AnchorBottomSheetBehavior");
            throw null;
        }
        ny61.g("The view is not a child of CoordinatorLayout");
        throw null;
    }

    public SlideableModalView(Context context, int i) {
        super(context);
        ru.yandex.taxi.design.utils.c.q(this, sph0.slideable_modal_view, true);
        this.root = (SlidableCoordinatorLayout) findViewById(ndh0.slideable_modal_view_root);
        ViewGroup viewGroup = (ViewGroup) findViewById(ndh0.slideable_modal_view_bottom_sheet);
        this.bottomSheet = viewGroup;
        this.startSideFabContainer = (ViewGroup) findViewById(ndh0.start_side_fab_container);
        this.endSideFabContainer = (ViewGroup) findViewById(ndh0.end_side_fab_container);
        this.topCenterContainer = (ViewGroup) findViewById(ndh0.top_center_container);
        this.bottomStartSideFabContainer = (ViewGroup) findViewById(ndh0.bottom_start_side_fab_container);
        this.bottomEndSideFabContainer = (ViewGroup) findViewById(ndh0.bottom_end_side_fab_container);
        this.cardContentContainer = (ViewGroup) findViewById(ndh0.slideable_modal_view_card_content_container);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof AnchorBottomSheetBehavior) {
                this.bottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
                this.arrowsView = (ArrowsView) findViewById(ndh0.slideable_modal_view_arrows);
                this._cardMode = CardMode.SLIDEABLE_CARD;
                this.dimBackgroundView = this;
                this.additionalHitAreaSize = tje.r(mrg0.go_design_s_space, getContext());
                this.defaultCardScaleX = 1.0f;
                this.bottomSheetBehaviorCallback = new va90((Object) this);
                this.cardContentLayoutListener = new lp2(5, this);
                this.onSlideOutListener = new vpa(29);
                this.onArrowClickListener = new hos0(0);
                this.initialState = i;
                this.cardContentView = inflateCardContent();
                init();
                return;
            }
            ny61.g("The view is not associated with AnchorBottomSheetBehavior");
            throw null;
        }
        ny61.g("The view is not a child of CoordinatorLayout");
        throw null;
    }
}
