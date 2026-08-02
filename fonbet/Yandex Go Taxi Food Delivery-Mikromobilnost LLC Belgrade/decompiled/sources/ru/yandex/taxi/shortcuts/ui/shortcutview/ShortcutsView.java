package ru.yandex.taxi.shortcuts.ui.shortcutview;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.impl.repository.j;
import com.yandex.go.shortcuts.impl.view.adapter.t;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a4s0;
import defpackage.adc;
import defpackage.aog0;
import defpackage.b4s0;
import defpackage.b8r;
import defpackage.bwr0;
import defpackage.czg;
import defpackage.czo0;
import defpackage.d1z;
import defpackage.e6v;
import defpackage.ex00;
import defpackage.f1z;
import defpackage.fnx0;
import defpackage.ga5;
import defpackage.gnu0;
import defpackage.gnx0;
import defpackage.gzr0;
import defpackage.hbp0;
import defpackage.i0s0;
import defpackage.j1s0;
import defpackage.j2s0;
import defpackage.jl40;
import defpackage.jx70;
import defpackage.jzr0;
import defpackage.k3s0;
import defpackage.kx00;
import defpackage.l8x;
import defpackage.lsy;
import defpackage.mi31;
import defpackage.mmp0;
import defpackage.ms2;
import defpackage.mug0;
import defpackage.n3q0;
import defpackage.n680;
import defpackage.ng;
import defpackage.nwy0;
import defpackage.o1s0;
import defpackage.oc80;
import defpackage.p1s0;
import defpackage.pdc;
import defpackage.qje;
import defpackage.quq0;
import defpackage.qux0;
import defpackage.r4s0;
import defpackage.s1s0;
import defpackage.s4s0;
import defpackage.sj4;
import defpackage.sls;
import defpackage.sxr0;
import defpackage.t1w;
import defpackage.t4s0;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tqs;
import defpackage.u4s0;
import defpackage.u7h0;
import defpackage.v7k0;
import defpackage.vez0;
import defpackage.w3s0;
import defpackage.wor0;
import defpackage.x3s0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y3s0;
import defpackage.ykn0;
import defpackage.yln;
import defpackage.z3s0;
import defpackage.zj11;
import defpackage.zzr0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\b§\u0001¤\u0001Æ\u0001Ç\u0001B³\u0001\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u0019\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u0002092\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u0002092\b\u0010B\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\bC\u0010;J\u0019\u0010F\u001a\u0002092\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u000209H\u0014¢\u0006\u0004\bH\u0010=J\u000f\u0010I\u001a\u000209H\u0014¢\u0006\u0004\bI\u0010=J\u000f\u0010J\u001a\u000209H\u0016¢\u0006\u0004\bJ\u0010=J\u000f\u0010K\u001a\u000209H\u0016¢\u0006\u0004\bK\u0010=J\u000f\u0010L\u001a\u000204H\u0017¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u000204H\u0017¢\u0006\u0004\bN\u0010MJ\u0017\u0010P\u001a\u0002042\u0006\u0010O\u001a\u000202H\u0017¢\u0006\u0004\bP\u00106J\u0017\u0010R\u001a\u0002042\u0006\u0010Q\u001a\u000202H\u0017¢\u0006\u0004\bR\u00106J\u000f\u0010S\u001a\u000209H\u0016¢\u0006\u0004\bS\u0010=J\u001f\u0010W\u001a\u0002092\u0006\u0010T\u001a\u0002042\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020UH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u000209H\u0016¢\u0006\u0004\b[\u0010=J\u0017\u0010^\u001a\u0002092\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020UH\u0016¢\u0006\u0004\b`\u0010ZJ\u000f\u0010a\u001a\u000209H\u0016¢\u0006\u0004\ba\u0010=J\u000f\u0010b\u001a\u000209H\u0016¢\u0006\u0004\bb\u0010=J\u000f\u0010c\u001a\u000204H\u0017¢\u0006\u0004\bc\u0010MJ\u000f\u0010d\u001a\u000204H\u0017¢\u0006\u0004\bd\u0010MJ\u000f\u0010e\u001a\u00020UH\u0016¢\u0006\u0004\be\u0010ZJ\u0017\u0010g\u001a\u0002042\u0006\u0010f\u001a\u000202H\u0002¢\u0006\u0004\bg\u00106J\u000f\u0010h\u001a\u000209H\u0002¢\u0006\u0004\bh\u0010=J\u0017\u0010k\u001a\u00020U2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u000209H\u0002¢\u0006\u0004\bm\u0010=J\u0017\u0010m\u001a\u0002092\u0006\u0010n\u001a\u00020UH\u0002¢\u0006\u0004\bm\u0010oJ\u0017\u0010q\u001a\u0002092\u0006\u0010p\u001a\u00020iH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u0002092\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010y\u001a\u0002092\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJ\u0019\u0010}\u001a\u0004\u0018\u00010|2\u0006\u0010{\u001a\u00020iH\u0002¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u000209H\u0002¢\u0006\u0004\b\u007f\u0010=J\u001b\u0010\u0080\u0001\u001a\u00020U2\b\u0010j\u001a\u0004\u0018\u00010iH\u0002¢\u0006\u0005\b\u0080\u0001\u0010lJ\u001b\u0010\u0081\u0001\u001a\u00020U2\b\u0010j\u001a\u0004\u0018\u00010iH\u0002¢\u0006\u0005\b\u0081\u0001\u0010lJ%\u0010\u0085\u0001\u001a\u0002092\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u000209H\u0002¢\u0006\u0005\b\u0087\u0001\u0010=J\u0011\u0010\u0088\u0001\u001a\u000209H\u0002¢\u0006\u0005\b\u0088\u0001\u0010=R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0089\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u008a\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u008b\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u008c\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u008d\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u008e\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u008f\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0090\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0091\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0092\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0093\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¥\u0001\u001a\u00070¤\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010¨\u0001\u001a\u00070§\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0019\u0010B\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bB\u0010²\u0001R\u001c\u0010´\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010·\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010¹\u0001\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010»\u0001\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010º\u0001R\u0019\u0010¼\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010½\u0001R)\u0010À\u0001\u001a\u0002042\u0007\u0010¿\u0001\u001a\u0002048\u0016@RX\u0097\u000e¢\u0006\u000f\n\u0006\bÀ\u0001\u0010½\u0001\u001a\u0005\bÁ\u0001\u0010MR\u0018\u0010Å\u0001\u001a\u00030Â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006È\u0001"}, d2 = {"Lru/yandex/taxi/shortcuts/ui/shortcutview/ShortcutsView;", "Landroid/widget/FrameLayout;", "Loc80;", "Lgzr0;", "Lnwy0;", "Lr4s0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/shortcuts/ui/shortcutview/f;", "presenter", "Lgnu0;", "storiesProxy", "Lcom/yandex/go/shortcuts/impl/ui/shortcutview/a;", "imageLoaderDelegate", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "Li0s0;", "adapterFactory", "Lzzr0;", "shortcutItemDecorator", "Lp1s0;", "shortcutViewPaddingsCalculator", "Ls1s0;", "shortcutViewSetting", "Lsxr0;", "shortcutAnalytics", "Lt4s0;", "shortcutsVisibilityTracker", "Lk3s0;", "shortcutsOnPreDrawTracker", "Lj1s0;", "shortcutTextSizeCalculator", "Lms2;", "appCreateAnalytics", "Lru/yandex/taxi/design/utils/a;", "overlayShadowUtil", "Lcom/yandex/go/shortcuts/impl/repository/j;", "orderVisibilityTracker", "Ljx70;", "orderInconsistencyCheckInteractor", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lpdc;", "colorConverter", "Lv7k0;", "ridaTariffClickInteractor", "Lo1s0;", "shortcutViewConfig", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/shortcuts/ui/shortcutview/f;Lgnu0;Lcom/yandex/go/shortcuts/impl/ui/shortcutview/a;Lru/yandex/taxi/widget/c;Li0s0;Lzzr0;Lp1s0;Ls1s0;Lsxr0;Lt4s0;Lk3s0;Lj1s0;Lms2;Lru/yandex/taxi/design/utils/a;Lcom/yandex/go/shortcuts/impl/repository/j;Ljx70;Lru/yandex/taxi/widget/utils/e;Lpdc;Lv7k0;Lo1s0;)V", "", "collapseRate", "", "getHeight", "(F)I", "Ljava/lang/Runnable;", "refreshListener", "Lzy11;", "setPullToRefreshListener", "(Ljava/lang/Runnable;)V", "disableNestedScrolling", "()V", "Lt1w;", "insets", "insetsType", "(Lt1w;)V", "dataLoadedCallback", "setDataLoadedCallback", "Ls4s0;", "listener", "setShortcutsVisibilityListener", "(Ls4s0;)V", "onAttachedToWindow", "onDetachedFromWindow", "scrollToTop", "forceScrollToTop", "getShortcutsPaddingTop", "()I", "getLayoutHeight", "preferredUnitHeightMultiplier", "getPreferredLayoutHeight", "multiplier", "getMinimumLayoutHeight", "cancelSingleLoading", "newState", "", "movedByUser", "onListStateChanged", "(IZ)V", "topItemIsCompletelyVisible", "()Z", "updateGridView", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "resume", "pause", "getTopServicePosition", "getBottomDestinationShortcutPosition", "isEmpty", "size", "unitSizeToPixels", "initRecyclerView", "Le6v;", "model", "isShortcutOrMarketRecommendations", "(Le6v;)Z", "updateGridLayout", "itemsIsFallback", "(Z)V", "baseModel", "onItemClick", "(Le6v;)V", "Lcom/yandex/go/dto/response/q1;", "action", "onNestedClick", "(Lcom/yandex/go/dto/response/q1;)V", "Lsj4;", "badgeAction", "onBadgeClick", "(Lsj4;)V", "item", "Ln3q0;", "findSectionScrollableModel", "(Le6v;)Ln3q0;", "applyPullToRefreshStyle", "containsDestinationShortcut", "isDestinationShortcut", "Lf1z;", "loadingState", "isOrderAdapter", "onShortcutItemsCommitted", "(Lf1z;Z)V", "notifyShortcutsVisibilityListener", "onLayoutChangeListener", "Lru/yandex/taxi/shortcuts/ui/shortcutview/f;", "Lgnu0;", "Lzzr0;", "Lp1s0;", "Ls1s0;", "Lsxr0;", "Lt4s0;", "Lk3s0;", "Lms2;", "Lcom/yandex/go/shortcuts/impl/repository/j;", "Ljx70;", "Lv7k0;", "Lcom/yandex/go/shortcuts/impl/view/adapter/t;", "adapter", "Lcom/yandex/go/shortcuts/impl/view/adapter/t;", "Lru/yandex/taxi/recycler/SpannedGridLayoutManager;", "layoutManager", "Lru/yandex/taxi/recycler/SpannedGridLayoutManager;", "Lj2s0;", "gridCalculator", "Lj2s0;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "shortcutsRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "shortcutsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Ly3s0;", "mvpView", "Ly3s0;", "La4s0;", "storyCardDelegate", "La4s0;", "Lhbp0;", "scope", "Lhbp0;", "Landroidx/recyclerview/widget/RecyclerView$g;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$g;", "shortcutsVisibilityListener", "Ls4s0;", "Ljava/lang/Runnable;", "Ll8x;", "sendAppearEventJob", "Ll8x;", "Lcom/yandex/go/shortcuts/dto/response/Layout;", "currentLayout", "Lcom/yandex/go/shortcuts/dto/response/Layout;", "skipAddAnimation", "Z", "currentItemsIsFallback", "halfGap", CA20Status.STATUS_USER_I, "navigationBarHeight", "value", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "getCornerRadius", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "z3s0", "wor0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShortcutsView extends FrameLayout implements oc80, gzr0, nwy0, r4s0 {
    private final t adapter;
    private final ms2 appCreateAnalytics;
    private int cornerRadius;
    private boolean currentItemsIsFallback;
    private Layout currentLayout;
    private Runnable dataLoadedCallback;
    private final j2s0 gridCalculator;
    private int halfGap;
    private final SpannedGridLayoutManager layoutManager;
    private final y3s0 mvpView;
    private int navigationBarHeight;
    private final RecyclerView.g onScrollListener;
    private final jx70 orderInconsistencyCheckInteractor;
    private final j orderVisibilityTracker;
    private final f presenter;
    private final v7k0 ridaTariffClickInteractor;
    private final hbp0 scope;
    private l8x sendAppearEventJob;
    private final sxr0 shortcutAnalytics;
    private final zzr0 shortcutItemDecorator;
    private final p1s0 shortcutViewPaddingsCalculator;
    private final s1s0 shortcutViewSetting;
    private final k3s0 shortcutsOnPreDrawTracker;
    private final RecyclerView shortcutsRecyclerView;
    private final SwipeRefreshLayout shortcutsRefreshLayout;
    private s4s0 shortcutsVisibilityListener;
    private final t4s0 shortcutsVisibilityTracker;
    private boolean skipAddAnimation;
    private final gnu0 storiesProxy;
    private final a4s0 storyCardDelegate;

    public ShortcutsView(Context context, f fVar, gnu0 gnu0Var, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.widget.c cVar, i0s0 i0s0Var, zzr0 zzr0Var, p1s0 p1s0Var, s1s0 s1s0Var, sxr0 sxr0Var, t4s0 t4s0Var, k3s0 k3s0Var, j1s0 j1s0Var, ms2 ms2Var, ru.yandex.taxi.design.utils.a aVar2, j jVar, jx70 jx70Var, ru.yandex.taxi.widget.utils.e eVar, pdc pdcVar, v7k0 v7k0Var, o1s0 o1s0Var) {
        super(context);
        this.presenter = fVar;
        this.storiesProxy = gnu0Var;
        this.shortcutItemDecorator = zzr0Var;
        this.shortcutViewPaddingsCalculator = p1s0Var;
        this.shortcutViewSetting = s1s0Var;
        this.shortcutAnalytics = sxr0Var;
        this.shortcutsVisibilityTracker = t4s0Var;
        this.shortcutsOnPreDrawTracker = k3s0Var;
        this.appCreateAnalytics = ms2Var;
        this.orderVisibilityTracker = jVar;
        this.orderInconsistencyCheckInteractor = jx70Var;
        this.ridaTariffClickInteractor = v7k0Var;
        this.layoutManager = new SpannedGridLayoutManager(getContext(), SpannedGridLayoutManager.Orientation.VERTICAL);
        this.gridCalculator = new j2s0(getContext());
        RecyclerView recyclerView = new RecyclerView(context);
        this.shortcutsRecyclerView = recyclerView;
        y3s0 y3s0Var = new y3s0(this);
        this.mvpView = y3s0Var;
        this.storyCardDelegate = new a4s0(this);
        this.scope = new hbp0(new czo0(14), "", null);
        this.onScrollListener = new b4s0(this);
        this.currentLayout = Layout.e;
        recyclerView.setImportantForAccessibility(1);
        recyclerView.setId(u7h0.shortcuts_recycler_view);
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context);
        this.shortcutsRefreshLayout = swipeRefreshLayout;
        this.adapter = i0s0Var.a(getResources(), aVar, new w3s0(this), cVar, new x3s0(this, 0), new x3s0(this, 1), new x3s0(this, 2), new wor0(this), j1s0Var, new yln(29, this), new mmp0(20, y3s0Var), eVar, pdcVar, aVar2, sxr0Var, new ykn0(10, this), vez0.e0(o1s0Var.a()));
        initRecyclerView();
        updateGridLayout();
        swipeRefreshLayout.setSize(0);
        applyPullToRefreshStyle();
        setPullToRefreshListener(null);
        tje.i(this, 80, new quq0(9, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ShortcutsView shortcutsView, String str) {
        mi31 d;
        v7k0 v7k0Var = shortcutsView.ridaTariffClickInteractor;
        b8r b8rVar = v7k0Var.a;
        if (str == null || (d = b8r.d(b8rVar, str, "", 4)) == null || d.a.u) {
            return;
        }
        v7k0Var.b.a(new gnx0(new fnx0(d, SelectionOrigin.USER), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(ShortcutsView shortcutsView, t1w t1wVar) {
        int i = shortcutsView.navigationBarHeight;
        int i2 = t1wVar.d;
        if (i == i2) {
            return false;
        }
        shortcutsView.navigationBarHeight = i2;
        shortcutsView.updateGridLayout();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$resetShortcutSections(y3s0 y3s0Var) {
        y3s0Var.a.shortcutItemDecorator.h();
    }

    private final void applyPullToRefreshStyle() {
        this.shortcutsRefreshLayout.setProgressBackgroundColorSchemeColor(qje.t(xng0.bgMain, getContext()));
        this.shortcutsRefreshLayout.setColorSchemeColors(qje.t(xng0.textMain, getContext()));
    }

    private final boolean containsDestinationShortcut(e6v model) {
        Object obj;
        if (!(model instanceof n3q0)) {
            return isDestinationShortcut(model);
        }
        Iterator it = ((n3q0) model).c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (containsDestinationShortcut((e6v) obj)) {
                break;
            }
        }
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n3q0 findSectionScrollableModel(e6v item) {
        Object obj;
        Iterator it = adc.D(this.adapter.x.f, n3q0.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((n3q0) obj).c.contains(item)) {
                break;
            }
        }
        return (n3q0) obj;
    }

    private final void initRecyclerView() {
        SpannedGridLayoutManager spannedGridLayoutManager = this.layoutManager;
        spannedGridLayoutManager.U = this.adapter;
        spannedGridLayoutManager.i1();
        SpannedGridLayoutManager spannedGridLayoutManager2 = this.layoutManager;
        this.shortcutViewSetting.getClass();
        spannedGridLayoutManager2.o1();
        spannedGridLayoutManager2.K = true;
        this.shortcutsRecyclerView.setLayoutManager(this.layoutManager);
        this.shortcutsRecyclerView.setClipChildren(false);
        this.shortcutsRecyclerView.setClipToPadding(false);
        this.shortcutsRecyclerView.addItemDecoration(this.shortcutItemDecorator);
        RecyclerView recyclerView = this.shortcutsRecyclerView;
        s1s0 s1s0Var = this.shortcutViewSetting;
        s1s0Var.getClass();
        recyclerView.setItemAnimator(!(s1s0Var instanceof n680) ? new z3s0(this) : null);
        this.shortcutItemDecorator.m(qje.t(xng0.bgMain, getContext()));
        this.shortcutItemDecorator.o(qje.t(xng0.bgMinor, getContext()));
        this.shortcutItemDecorator.q(qje.t(xng0.shimmeringCenterColor, getContext()), qje.t(xng0.shimmeringEdgeColor, getContext()), qje.t(aog0.shimmeringEdgePoint2Color, getContext()), qje.t(aog0.shimmeringEdgePoint3Color, getContext()));
        this.shortcutItemDecorator.p(tje.r(mug0.shortcuts_gray_separator_height, getContext()));
    }

    private final boolean isDestinationShortcut(e6v model) {
        return (model instanceof lsy) || (model instanceof qux0);
    }

    private final boolean isShortcutOrMarketRecommendations(e6v model) {
        Object obj;
        if (model instanceof ga5) {
            if (((ga5) model).getBase().e != BaseShortcutModel$Source.ITEMS) {
                return false;
            }
        } else {
            if (!(model instanceof n3q0)) {
                return (model instanceof kx00) || (model instanceof ex00);
            }
            Iterator it = ((n3q0) model).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (isShortcutOrMarketRecommendations((e6v) obj)) {
                    break;
                }
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyShortcutsVisibilityListener() {
        ng ngVar;
        ng ngVar2;
        s4s0 s4s0Var = this.shortcutsVisibilityListener;
        if (s4s0Var == null) {
            return;
        }
        if (xw31.i(this)) {
            ngVar2 = ((ShortcutsModalView) ((wor0) s4s0Var).a).accessibilityButtonsDelegate;
            ngVar2.b();
        } else {
            ngVar = ((ShortcutsModalView) ((wor0) s4s0Var).a).accessibilityButtonsDelegate;
            ngVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBadgeClick(sj4 badgeAction) {
        f fVar = this.presenter;
        if (badgeAction instanceof jzr0) {
            fVar.C.b(new bwr0((jzr0) badgeAction));
        } else {
            fVar.getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(e6v baseModel) {
        this.presenter.Mg(baseModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLayoutChangeListener() {
        this.mvpView.a.shortcutItemDecorator.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNestedClick(q1 action) {
        f fVar = this.presenter;
        if (fVar.Eg() && fVar.c) {
            com.yandex.go.coroutines.b.g(fVar.Jg(), null, null, new ShortcutsViewPresenter$handleAction$1(fVar, action, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShortcutItemsCommitted(f1z loadingState, boolean isOrderAdapter) {
        Runnable runnable;
        d1z d1zVar = d1z.a;
        if (jl40.l(loadingState, d1zVar) && !isOrderAdapter) {
            this.mvpView.a.shortcutItemDecorator.h();
        }
        this.shortcutsRecyclerView.postInvalidateOnAnimation();
        this.shortcutsOnPreDrawTracker.c++;
        if (jl40.l(loadingState, d1zVar) && (runnable = this.dataLoadedCallback) != null) {
            runnable.run();
        }
        OneShotPreDrawListener.add(this.shortcutsRecyclerView, new tqs(16, this, loadingState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPullToRefreshListener$lambda$0(tfx tfxVar) {
        ((sls) tfxVar).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int unitSizeToPixels(float size) {
        return (int) ((size * this.layoutManager.F1()) - (this.halfGap * 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGridLayout(boolean itemsIsFallback) {
        long a = j2s0.a(this.gridCalculator, this.currentLayout.b);
        int i = ((int) (a >> 32)) / 2;
        this.halfGap = i;
        int i2 = (int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        this.shortcutViewPaddingsCalculator.getClass();
        int i3 = i2 - i;
        int a2 = this.shortcutViewPaddingsCalculator.a(i2, this.halfGap);
        p1s0 p1s0Var = this.shortcutViewPaddingsCalculator;
        int i4 = this.halfGap;
        p1s0Var.getClass();
        int i5 = (i2 - i4) + this.navigationBarHeight;
        this.cornerRadius = tje.r(mug0.shortcuts_main_screen_modal_view_corner_radius, getContext()) + i2;
        this.layoutManager.Q1(this.currentLayout.b);
        this.shortcutsRecyclerView.setPadding(i3, a2, i3, i5);
        this.shortcutItemDecorator.k(this.halfGap);
        this.shortcutItemDecorator.n(getCornerRadius());
        this.shortcutItemDecorator.i(i3);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.shortcutItemDecorator.m(qje.t(xng0.bgMain, getContext()));
        this.shortcutItemDecorator.o(qje.t(xng0.bgMinor, getContext()));
        this.shortcutItemDecorator.q(qje.t(xng0.shimmeringCenterColor, getContext()), qje.t(xng0.shimmeringEdgeColor, getContext()), qje.t(aog0.shimmeringEdgePoint2Color, getContext()), qje.t(aog0.shimmeringEdgePoint3Color, getContext()));
        this.shortcutItemDecorator.h();
        this.shortcutsRecyclerView.postInvalidateOnAnimation();
        applyPullToRefreshStyle();
        this.adapter.notifyDataSetChanged();
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // defpackage.r4s0
    public void cancelSingleLoading() {
        if (this.shortcutItemDecorator.f() instanceof czg) {
            this.shortcutItemDecorator.j(false);
        }
    }

    @Override // defpackage.oc80
    public void disableNestedScrolling() {
    }

    @Override // defpackage.oc80
    public void forceScrollToTop() {
        this.shortcutsRecyclerView.scrollToPosition(0);
    }

    @Override // defpackage.r4s0
    public int getBottomDestinationShortcutPosition() {
        int i;
        List list = this.adapter.x.f;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (containsDestinationShortcut((e6v) listIterator.previous())) {
                i = listIterator.nextIndex();
                break;
            }
        }
        View X = this.layoutManager.X(i);
        if (X != null) {
            return X.getBottom() + this.navigationBarHeight;
        }
        return 0;
    }

    @Override // defpackage.r4s0
    public int getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // defpackage.oc80
    public int getHeight(float collapseRate) {
        return getHeight();
    }

    @Override // defpackage.r4s0
    public int getLayoutHeight() {
        return this.shortcutsRecyclerView.getPaddingBottom() + this.shortcutsRecyclerView.computeVerticalScrollRange() + this.shortcutsRecyclerView.getPaddingTop();
    }

    public int getMinimumLayoutHeight(float multiplier) {
        return Math.min(this.shortcutsRecyclerView.computeVerticalScrollRange(), (int) (this.layoutManager.F1() * multiplier)) + this.shortcutsRecyclerView.getPaddingTop();
    }

    @Override // defpackage.r4s0
    public int getPreferredLayoutHeight(float preferredUnitHeightMultiplier) {
        Iterator it = this.adapter.x.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (isShortcutOrMarketRecommendations((e6v) it.next())) {
                break;
            }
            i++;
        }
        if (i < 0) {
            i = this.adapter.getItemCount() - 1;
        }
        Rect L1 = i >= 0 ? this.layoutManager.L1(i) : null;
        if (L1 == null) {
            return this.shortcutsRecyclerView.getPaddingBottom() + this.shortcutsRecyclerView.getPaddingTop();
        }
        return Math.min(this.shortcutsRecyclerView.computeVerticalScrollRange(), L1.top + ((int) (this.layoutManager.F1() * preferredUnitHeightMultiplier))) + this.shortcutsRecyclerView.getPaddingTop();
    }

    public int getShortcutsPaddingTop() {
        return this.shortcutsRecyclerView.getPaddingTop();
    }

    @Override // defpackage.r4s0
    public int getTopServicePosition() {
        Iterator it = this.adapter.x.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((e6v) it.next()) instanceof zj11) {
                break;
            }
            i++;
        }
        View X = this.layoutManager.X(i);
        if (X == null) {
            return 0;
        }
        return X.getPaddingBottom() + X.getBottom() + this.navigationBarHeight;
    }

    @Override // defpackage.oc80
    public View getView() {
        return this;
    }

    @Override // defpackage.oc80
    public void insetsType(t1w insets) {
    }

    @Override // defpackage.gzr0
    public boolean isEmpty() {
        return this.adapter.x.f.isEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scope.a();
        this.shortcutsRecyclerView.setAdapter(this.adapter);
        f fVar = this.presenter;
        fVar.Bg(this.mvpView);
        ((com.yandex.go.shortcuts.impl.analytic.a) fVar.D).h.a();
        tje.N(fVar.Jg(), null, null, new ShortcutsViewPresenter$attachView$1(null, fVar), 3);
        gnu0 gnu0Var = this.storiesProxy;
        a4s0 a4s0Var = this.storyCardDelegate;
        gnu0Var.c.add(a4s0Var);
        String str = gnu0Var.b;
        if (str != null) {
            a4s0Var.d(str);
        }
        this.shortcutsRecyclerView.addOnScrollListener(this.onScrollListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        gnu0 gnu0Var = this.storiesProxy;
        gnu0Var.c.remove(this.storyCardDelegate);
        this.shortcutsRecyclerView.removeOnScrollListener(this.onScrollListener);
        u4s0 u4s0Var = (u4s0) this.shortcutsVisibilityTracker;
        u4s0Var.a.clear();
        u4s0Var.b.clear();
        u4s0Var.c = kotlin.collections.b.f();
        this.shortcutsRecyclerView.setAdapter(null);
        this.scope.b();
    }

    @Override // defpackage.oc80
    public void onListStateChanged(int newState, boolean movedByUser) {
        this.orderVisibilityTracker.a(this.shortcutsRecyclerView);
        if (newState == 3) {
            this.shortcutItemDecorator.h();
            ((com.yandex.go.shortcuts.impl.analytic.a) this.shortcutAnalytics).n = true;
        } else if (newState == 4 || newState == 6) {
            ((com.yandex.go.shortcuts.impl.analytic.a) this.shortcutAnalytics).n = false;
            this.shortcutItemDecorator.h();
        } else {
            if (newState != 7) {
                return;
            }
            ((com.yandex.go.shortcuts.impl.analytic.a) this.shortcutAnalytics).n = true;
        }
    }

    @Override // defpackage.oc80
    public void pause() {
        this.presenter.pause();
    }

    @Override // defpackage.oc80
    public void resume() {
        this.presenter.resume();
    }

    @Override // defpackage.oc80
    public void scrollToTop() {
        int computeVerticalScrollOffset = this.shortcutsRecyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset > 0) {
            this.shortcutsRecyclerView.smoothScrollBy(0, -computeVerticalScrollOffset);
        }
    }

    @Override // defpackage.gzr0
    public void setDataLoadedCallback(Runnable dataLoadedCallback) {
        this.dataLoadedCallback = dataLoadedCallback;
    }

    public void setPullToRefreshListener(Runnable refreshListener) {
        boolean z = refreshListener != null;
        removeAllViews();
        if (this.shortcutsRecyclerView.getParent() != null) {
            ((ViewGroup) this.shortcutsRecyclerView.getParent()).removeView(this.shortcutsRecyclerView);
        }
        if (z) {
            addView(this.shortcutsRefreshLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        ViewGroup viewGroup = z ? this.shortcutsRefreshLayout : this;
        RecyclerView recyclerView = this.shortcutsRecyclerView;
        this.shortcutViewSetting.getClass();
        viewGroup.addView(recyclerView, new ViewGroup.LayoutParams(-1, -2));
        this.shortcutsRefreshLayout.setEnabled(z);
        SwipeRefreshLayout swipeRefreshLayout = this.shortcutsRefreshLayout;
        ShortcutsView$setPullToRefreshListener$1 shortcutsView$setPullToRefreshListener$1 = z ? new ShortcutsView$setPullToRefreshListener$1(0, refreshListener, Runnable.class, "run", "run()V", 0) : null;
        swipeRefreshLayout.setOnRefreshListener(shortcutsView$setPullToRefreshListener$1 != null ? new ykn0(11, shortcutsView$setPullToRefreshListener$1) : null);
        SwipeRefreshLayout swipeRefreshLayout2 = this.shortcutsRefreshLayout;
        swipeRefreshLayout2.setProgressViewOffset(false, swipeRefreshLayout2.getProgressViewStartOffset(), this.shortcutsRefreshLayout.getProgressViewEndOffset());
    }

    @Override // defpackage.r4s0
    public void setShortcutsVisibilityListener(s4s0 listener) {
        this.shortcutsVisibilityListener = listener;
    }

    @Override // defpackage.oc80
    public boolean topItemIsCompletelyVisible() {
        View X = this.layoutManager.X(0);
        if (X != null) {
            SpannedGridLayoutManager spannedGridLayoutManager = this.layoutManager;
            if (spannedGridLayoutManager.c.i(X) && spannedGridLayoutManager.w.i(X)) {
                return true;
            }
        }
        return false;
    }

    public void updateGridView() {
        this.presenter.Ng(true, true);
    }

    private final void updateGridLayout() {
        updateGridLayout(false);
    }
}
