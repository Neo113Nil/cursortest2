package ru.yandex.taxi.preorder.source;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.preorder.fragment.BaseSourcePointFragment;
import com.yandex.go.preorder.map.CameraAnimationFinishType;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.preorder.navigation.ModalsVisibility;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.a3s0;
import defpackage.a3v;
import defpackage.agt0;
import defpackage.ah00;
import defpackage.aht0;
import defpackage.ast0;
import defpackage.b01;
import defpackage.bht0;
import defpackage.bk4;
import defpackage.bov0;
import defpackage.bvh0;
import defpackage.cey;
import defpackage.cp10;
import defpackage.czo0;
import defpackage.d6l0;
import defpackage.dai;
import defpackage.det0;
import defpackage.df4;
import defpackage.dfh0;
import defpackage.dgt0;
import defpackage.djt0;
import defpackage.edj;
import defpackage.eet0;
import defpackage.eft0;
import defpackage.eht0;
import defpackage.ejt0;
import defpackage.elo0;
import defpackage.eqh;
import defpackage.erg0;
import defpackage.ez00;
import defpackage.f0l0;
import defpackage.f4c0;
import defpackage.f8z;
import defpackage.fft0;
import defpackage.fpv0;
import defpackage.fva0;
import defpackage.fy01;
import defpackage.g18;
import defpackage.g6h0;
import defpackage.g8z;
import defpackage.gas0;
import defpackage.gbp;
import defpackage.gh00;
import defpackage.ght0;
import defpackage.grt0;
import defpackage.h2s0;
import defpackage.h3y;
import defpackage.h8z;
import defpackage.hbp0;
import defpackage.hc00;
import defpackage.hd5;
import defpackage.hft0;
import defpackage.hid0;
import defpackage.hjt0;
import defpackage.hpr0;
import defpackage.hpv0;
import defpackage.hrt0;
import defpackage.hxj0;
import defpackage.i5m;
import defpackage.ic00;
import defpackage.if4;
import defpackage.ift0;
import defpackage.ihf;
import defpackage.ii9;
import defpackage.ja00;
import defpackage.jc00;
import defpackage.jet0;
import defpackage.jft0;
import defpackage.jgt0;
import defpackage.jl40;
import defpackage.jpn0;
import defpackage.jpv0;
import defpackage.jst;
import defpackage.k20;
import defpackage.kc00;
import defpackage.kev0;
import defpackage.kft0;
import defpackage.kn4;
import defpackage.krl0;
import defpackage.ktg;
import defpackage.l30;
import defpackage.l56;
import defpackage.l8x;
import defpackage.la00;
import defpackage.lft0;
import defpackage.lp00;
import defpackage.m580;
import defpackage.m7q0;
import defpackage.m8t0;
import defpackage.mfv0;
import defpackage.mgt0;
import defpackage.mhf;
import defpackage.mrj;
import defpackage.muw;
import defpackage.mzz;
import defpackage.n3w;
import defpackage.ngt0;
import defpackage.nwx0;
import defpackage.ny61;
import defpackage.o0l0;
import defpackage.o500;
import defpackage.o800;
import defpackage.oft0;
import defpackage.osb1;
import defpackage.otg;
import defpackage.oxf0;
import defpackage.p0l0;
import defpackage.pft0;
import defpackage.pgk0;
import defpackage.pwf0;
import defpackage.pzt0;
import defpackage.qft0;
import defpackage.qp00;
import defpackage.qqb0;
import defpackage.qy41;
import defpackage.reu;
import defpackage.rey;
import defpackage.rg3;
import defpackage.rgt0;
import defpackage.rh00;
import defpackage.rjt0;
import defpackage.ro00;
import defpackage.rp00;
import defpackage.rud0;
import defpackage.ry41;
import defpackage.sni0;
import defpackage.so00;
import defpackage.tf91;
import defpackage.tj60;
import defpackage.tje;
import defpackage.to00;
import defpackage.tse;
import defpackage.u45;
import defpackage.u53;
import defpackage.u6o0;
import defpackage.ugt0;
import defpackage.uq40;
import defpackage.v2g;
import defpackage.v7p;
import defpackage.va00;
import defpackage.vet0;
import defpackage.vgt0;
import defpackage.vuz;
import defpackage.w2g;
import defpackage.w511;
import defpackage.w53;
import defpackage.w6h0;
import defpackage.wet0;
import defpackage.wtg0;
import defpackage.wwo;
import defpackage.x2g;
import defpackage.x5s0;
import defpackage.xet0;
import defpackage.xj10;
import defpackage.xm00;
import defpackage.xni0;
import defpackage.xsd0;
import defpackage.xvf0;
import defpackage.xvw;
import defpackage.xw31;
import defpackage.y2s0;
import defpackage.ya00;
import defpackage.yb60;
import defpackage.yet0;
import defpackage.ygt0;
import defpackage.yqv;
import defpackage.yz80;
import defpackage.z0s0;
import defpackage.zlm;
import defpackage.zs0;
import defpackage.zy11;
import defpackage.zzs;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator;
import ru.yandex.taxi.preorder.source.SourcePointFragment;
import ru.yandex.taxi.preorder.source.data.TaxiMainControlElementEvent;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000À\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0002ë\u0001\b\u0007\u0018\u0000 ú\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002û\u0001Bõ\u0002\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0010\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020S\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010\\\u001a\u00020[\u0012\u0006\u0010^\u001a\u00020]\u0012\u0006\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020c2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ-\u0010q\u001a\u0004\u0018\u00010p2\u0006\u0010k\u001a\u00020j2\b\u0010m\u001a\u0004\u0018\u00010l2\b\u0010o\u001a\u0004\u0018\u00010nH\u0016¢\u0006\u0004\bq\u0010rJ!\u0010t\u001a\u00020c2\u0006\u0010s\u001a\u00020p2\b\u0010o\u001a\u0004\u0018\u00010nH\u0016¢\u0006\u0004\bt\u0010uJ\r\u0010w\u001a\u00020v¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020yH\u0016¢\u0006\u0004\b|\u0010{J\u000f\u0010}\u001a\u00020cH\u0016¢\u0006\u0004\b}\u0010eJ\u000f\u0010~\u001a\u00020cH\u0016¢\u0006\u0004\b~\u0010eJ\u000f\u0010\u007f\u001a\u00020cH\u0016¢\u0006\u0004\b\u007f\u0010eJ\u0011\u0010\u0080\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u0080\u0001\u0010eJ\u0011\u0010\u0081\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u0081\u0001\u0010eJ\u0011\u0010\u0082\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u0082\u0001\u0010eJ\u0011\u0010\u0083\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u0083\u0001\u0010eJ\u0011\u0010\u0084\u0001\u001a\u00020yH\u0016¢\u0006\u0005\b\u0084\u0001\u0010{J\u0011\u0010\u0085\u0001\u001a\u00020yH\u0016¢\u0006\u0005\b\u0085\u0001\u0010{J\u0011\u0010\u0086\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u0086\u0001\u0010eJ\u000f\u0010\u0087\u0001\u001a\u00020y¢\u0006\u0005\b\u0087\u0001\u0010{J\u000f\u0010\u0088\u0001\u001a\u00020y¢\u0006\u0005\b\u0088\u0001\u0010{J\u0011\u0010\u0089\u0001\u001a\u00020yH\u0016¢\u0006\u0005\b\u0089\u0001\u0010{J\u000f\u0010\u008a\u0001\u001a\u00020y¢\u0006\u0005\b\u008a\u0001\u0010{J\u000f\u0010\u008b\u0001\u001a\u00020y¢\u0006\u0005\b\u008b\u0001\u0010{J\u001c\u0010\u008e\u0001\u001a\u00020c2\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u0090\u0001\u0010eJ\u0011\u0010\u0091\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u0091\u0001\u0010eJ&\u0010\u0095\u0001\u001a\u00020y2\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\b\u0010\u0094\u0001\u001a\u00030\u0092\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001c\u0010\u0099\u0001\u001a\u00020c2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u009b\u0001\u0010eJ\u0011\u0010\u009c\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u009c\u0001\u0010eJ\u0011\u0010\u009d\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b\u009d\u0001\u0010eJ\u0011\u0010\u009e\u0001\u001a\u00020yH\u0016¢\u0006\u0005\b\u009e\u0001\u0010{J%\u0010¢\u0001\u001a\u00020c2\b\u0010 \u0001\u001a\u00030\u009f\u00012\u0007\u0010¡\u0001\u001a\u00020yH\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020cH\u0016¢\u0006\u0005\b¤\u0001\u0010eJ\u001b\u0010¦\u0001\u001a\u00020c2\u0007\u0010¥\u0001\u001a\u00020yH\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u00020cH\u0002¢\u0006\u0005\b¨\u0001\u0010eJ\u0011\u0010©\u0001\u001a\u00020cH\u0002¢\u0006\u0005\b©\u0001\u0010eJ\u0011\u0010ª\u0001\u001a\u00020cH\u0002¢\u0006\u0005\bª\u0001\u0010eJ\u001b\u0010¬\u0001\u001a\u00020c2\u0007\u0010«\u0001\u001a\u00020yH\u0002¢\u0006\u0006\b¬\u0001\u0010§\u0001J\u0011\u0010\u00ad\u0001\u001a\u00020cH\u0002¢\u0006\u0005\b\u00ad\u0001\u0010eJ\u0011\u0010®\u0001\u001a\u00020yH\u0002¢\u0006\u0005\b®\u0001\u0010{J\u001b\u0010¯\u0001\u001a\u00020c2\u0007\u0010¡\u0001\u001a\u00020yH\u0002¢\u0006\u0006\b¯\u0001\u0010§\u0001J\u0011\u0010°\u0001\u001a\u00020cH\u0002¢\u0006\u0005\b°\u0001\u0010eJ\u0011\u0010±\u0001\u001a\u00020cH\u0002¢\u0006\u0005\b±\u0001\u0010eR\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010²\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010³\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010´\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010µ\u0001R\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010¶\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010·\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010¸\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010¹\u0001R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010º\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010»\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010¼\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010½\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010¾\u0001R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010¿\u0001R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010À\u0001R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010Á\u0001R\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010¶\u0001R\u0015\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010Â\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010Ã\u0001R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010Ä\u0001R\u0015\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010Å\u0001R\u0015\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010Æ\u0001R\u0015\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010Ç\u0001R\u0015\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010È\u0001R\u0015\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010É\u0001R\u0015\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010Ê\u0001R\u0015\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b@\u0010Ë\u0001R\u0015\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010Ì\u0001R\u0015\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010Í\u0001R\u0015\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010Î\u0001R\u0015\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010Ï\u0001R\u0015\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010Ð\u0001R\u0015\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010Ñ\u0001R\u0015\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010Ò\u0001R\u0015\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bP\u0010Ó\u0001R\u0015\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bR\u0010Ô\u0001R\u0015\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bT\u0010Õ\u0001R\u0015\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010Ö\u0001R\u0015\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bX\u0010×\u0001R\u0015\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bZ\u0010Ø\u0001R\u0015\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010Ù\u0001R\u0015\u0010^\u001a\u00020]8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b^\u0010Ú\u0001R\u0015\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b`\u0010Û\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u001b\u0010â\u0001\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001a\u0010å\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u001c\u0010è\u0001\u001a\u0005\u0018\u00010ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u001a\u0010ê\u0001\u001a\u00030ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010æ\u0001R\u0018\u0010ì\u0001\u001a\u00030ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0018\u0010ñ\u0001\u001a\u00030î\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001R\u0018\u0010ó\u0001\u001a\u00030î\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ð\u0001R\u0018\u0010÷\u0001\u001a\u00030ô\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010ö\u0001R\u0016\u0010ø\u0001\u001a\u00020y8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u0010{R\u0016\u0010ù\u0001\u001a\u00020y8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bù\u0001\u0010{¨\u0006ü\u0001"}, d2 = {"Lru/yandex/taxi/preorder/source/SourcePointFragment;", "Lcom/yandex/go/preorder/fragment/BaseSourcePointFragment;", "Lmgt0;", "Ldf4;", "Lihf;", "Lif4;", "Lwwo;", "Lyz80;", "Leht0;", "presenter", "Lugt0;", "currentPlaceOverlay", "Lg8z;", "diagnosticOverlay", "Lhjt0;", "sourcePointViewModeInteractor", "Lh3y;", "Ljet0;", "sourcePointActionRoutersInteractorLazy", "Lah00;", "mapController", "Ld6l0;", "routeOverlay", "Ltj60;", "notificationStackHolder", "Lhid0;", "plusPromoRouter", "Lmhf;", "currentScreenTracker", "Llp00;", "intersectionChecker", "Lso00;", "mapObjectSpaceFactory", "Ljgt0;", "sourcePointModeObserver", "Lo0l0;", "routeButtonHandler", "Lrgt0;", "notificationsVisibilityHandler", "Lsni0;", "referralGiftViewHolder", "Lgbp;", "familyInvitesInteractorLazy", "Leet0;", "sourcePinV1Configurator", "Lva00;", "pinV1DataRepository", "Lya00;", "pinV2DataRepository", "Lgrt0;", "splashRouter", "Last0;", "splashStateInteractor", "Lqy41;", "whereYouAreActionRouter", "Lxet0;", "badgeDelegate", "Lqp00;", "mapObjectsOverlappingRepository", "Ldgt0;", "sourcePointModalViewCoordinatorListener", "Lagt0;", "sourcePointMapInteractor", "Lkev0;", "summaryClarifyRepository", "Lqft0;", "sourcePointFragmentLifecycleTracker", "Lfva0;", "performanceAnalytics", "Lrh00;", "mapEventsRepository", "Luq40;", "multiexitDelegate", "Lhpr0;", "sharedPinDataHolder", "Lez00;", "massTransitHostLifecycleListener", "Lf0l0;", "routeAnimationsHolder", "Lotg;", "debouncingMapListenerDelegate", "Lja00;", "mainScreenHolder", "Lfy01;", "transitionCoordinatorHolder", "Ll56;", "blockedZonesHandler", "Loft0;", ClidProvider.STATE, "Ldjt0;", "sourcePointViewHolder", "Lxm00;", "mapObjectCollectionWrapper", "Ljc00;", "mainScreenTypeInteractor", "Lcom/yandex/go/pin/api/a;", "pin", "<init>", "(Leht0;Lugt0;Lg8z;Lhjt0;Lh3y;Lah00;Ld6l0;Ltj60;Lhid0;Lmhf;Llp00;Lso00;Ljgt0;Lo0l0;Lrgt0;Lsni0;Lh3y;Leet0;Lva00;Lya00;Lgrt0;Last0;Lqy41;Lxet0;Lqp00;Ldgt0;Lagt0;Lkev0;Lqft0;Lfva0;Lrh00;Luq40;Lhpr0;Lez00;Lf0l0;Lotg;Lja00;Lfy01;Ll56;Loft0;Ldjt0;Lxm00;Ljc00;Lcom/yandex/go/pin/api/a;)V", "Lzy11;", "onCameraMoveFromUserGestureFinished", "()V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/yandex/taxi/preorder/mainscreen/transition/ITransitionCoordinator;", "transitionCoordinator", "()Lru/yandex/taxi/preorder/mainscreen/transition/ITransitionCoordinator;", "", "canBackToActiveOrderStateBarBeVisible", "()Z", "canBackToActiveLinkedOrderStateBarBeVisible", "onDetach", "onResume", "onStart", "onStop", "onPause", "onDismissingStart", "onDestroyView", "canOpenMainMenu", "noModalViews", "hideRouteSelector", "summaryHidden", "summaryOpened", "routeSelectorShown", "tollRoadSelectorShown", "routeStopsV2Shown", "Lzzs;", "geoPoint", "setMapToPoint", "(Lzzs;)V", "onMapCollapsed", "onMapExpanded", "", RemoteBioParameters.X, RemoteBioParameters.Y, "onMapTapped", "(FF)Z", "Lru/yandex/taxi/preorder/source/data/TaxiMainControlElementEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "updateControlElements", "(Lru/yandex/taxi/preorder/source/data/TaxiMainControlElementEvent;)V", "onMapPressed", "onMapReleased", "onMapDragged", "onBackPressed", "Lzlm;", "route", "animated", "setDrivingRoute", "(Lzlm;Z)V", "showPlusHome", "hidden", "setForceHiddenReferralGift", "(Z)V", "bindViewsAndDimensInFields", "prepareIntersectionsParticipants", "unbindViewsInFields", "isScreenOverlapped", "handleScreenOverlapChanges", "hideDestinationPickerAndMainScreen", "isSuperAppMainScreenEnabled", "showControlElements", "disableControlElements", "enableControlElements", "Leht0;", "Lugt0;", "Lg8z;", "Lhjt0;", "Lh3y;", "Lah00;", "Ld6l0;", "Ltj60;", "Lhid0;", "Lmhf;", "Llp00;", "Lso00;", "Ljgt0;", "Lo0l0;", "Lrgt0;", "Lsni0;", "Leet0;", "Lva00;", "Lya00;", "Lgrt0;", "Last0;", "Lqy41;", "Lxet0;", "Lqp00;", "Ldgt0;", "Lkev0;", "Lqft0;", "Lfva0;", "Lrh00;", "Luq40;", "Lhpr0;", "Lez00;", "Lf0l0;", "Lotg;", "Lja00;", "Lfy01;", "Ll56;", "Loft0;", "Ldjt0;", "Lxm00;", "Ljc00;", "Lcom/yandex/go/pin/api/a;", "Lngt0;", "networkListener", "Lngt0;", "Landroid/widget/FrameLayout;", "content", "Landroid/widget/FrameLayout;", "summaryParent", "Landroid/view/ViewGroup;", "Lg18;", "modalViewCoordinatorListenersCancellable", "Lg18;", "Ll8x;", "doOnFirstContentfulPaint", "Ll8x;", "sourcePinV1ConfigureCancelable", "jft0", "inertiaMoveListener", "Ljft0;", "", "getBusinessName", "()Ljava/lang/String;", "businessName", "getPromoName", "promoName", "Lcom/yandex/go/navigation/screen/api/Screen;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "isOnMainScreen", "isMapMoving", "Companion", "hft0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourcePointFragment extends BaseSourcePointFragment implements mgt0, df4, ihf, if4, wwo, yz80 {
    private static final hft0 Companion = new hft0();
    private static final Object mapObjectsPauseOwner = new Object();
    private final xet0 badgeDelegate;
    private final l56 blockedZonesHandler;
    private FrameLayout content;
    private final ugt0 currentPlaceOverlay;
    private final mhf currentScreenTracker;
    private final otg debouncingMapListenerDelegate;
    private final g8z diagnosticOverlay;
    private l8x doOnFirstContentfulPaint;
    private final h3y familyInvitesInteractorLazy;
    private final jft0 inertiaMoveListener;
    private final lp00 intersectionChecker;
    private final ja00 mainScreenHolder;
    public final jc00 mainScreenTypeInteractor;
    private final ah00 mapController;
    private final rh00 mapEventsRepository;
    private final xm00 mapObjectCollectionWrapper;
    private final so00 mapObjectSpaceFactory;
    private final qp00 mapObjectsOverlappingRepository;
    private final ez00 massTransitHostLifecycleListener;
    private g18 modalViewCoordinatorListenersCancellable;
    private final uq40 multiexitDelegate;
    private final ngt0 networkListener = new ngt0(new x5s0(3, this));
    private final tj60 notificationStackHolder;
    private final rgt0 notificationsVisibilityHandler;
    private final fva0 performanceAnalytics;
    private final com.yandex.go.pin.api.a pin;
    private final va00 pinV1DataRepository;
    private final ya00 pinV2DataRepository;
    private final hid0 plusPromoRouter;
    private final eht0 presenter;
    private final sni0 referralGiftViewHolder;
    private final f0l0 routeAnimationsHolder;
    private final o0l0 routeButtonHandler;
    private final d6l0 routeOverlay;
    private final hpr0 sharedPinDataHolder;
    private final eet0 sourcePinV1Configurator;
    private g18 sourcePinV1ConfigureCancelable;
    private final h3y sourcePointActionRoutersInteractorLazy;
    private final qft0 sourcePointFragmentLifecycleTracker;
    private final dgt0 sourcePointModalViewCoordinatorListener;
    private final jgt0 sourcePointModeObserver;
    private final djt0 sourcePointViewHolder;
    private final hjt0 sourcePointViewModeInteractor;
    private final grt0 splashRouter;
    private final ast0 splashStateInteractor;
    private final oft0 state;
    private final kev0 summaryClarifyRepository;
    private ViewGroup summaryParent;
    private final fy01 transitionCoordinatorHolder;
    private final qy41 whereYouAreActionRouter;

    public SourcePointFragment(eht0 eht0Var, ugt0 ugt0Var, g8z g8zVar, hjt0 hjt0Var, h3y h3yVar, ah00 ah00Var, d6l0 d6l0Var, tj60 tj60Var, hid0 hid0Var, mhf mhfVar, lp00 lp00Var, so00 so00Var, jgt0 jgt0Var, o0l0 o0l0Var, rgt0 rgt0Var, sni0 sni0Var, h3y h3yVar2, eet0 eet0Var, va00 va00Var, ya00 ya00Var, grt0 grt0Var, ast0 ast0Var, qy41 qy41Var, xet0 xet0Var, qp00 qp00Var, dgt0 dgt0Var, agt0 agt0Var, kev0 kev0Var, qft0 qft0Var, fva0 fva0Var, rh00 rh00Var, uq40 uq40Var, hpr0 hpr0Var, ez00 ez00Var, f0l0 f0l0Var, otg otgVar, ja00 ja00Var, fy01 fy01Var, l56 l56Var, oft0 oft0Var, djt0 djt0Var, xm00 xm00Var, jc00 jc00Var, com.yandex.go.pin.api.a aVar) {
        this.presenter = eht0Var;
        this.currentPlaceOverlay = ugt0Var;
        this.diagnosticOverlay = g8zVar;
        this.sourcePointViewModeInteractor = hjt0Var;
        this.sourcePointActionRoutersInteractorLazy = h3yVar;
        this.mapController = ah00Var;
        this.routeOverlay = d6l0Var;
        this.notificationStackHolder = tj60Var;
        this.plusPromoRouter = hid0Var;
        this.currentScreenTracker = mhfVar;
        this.intersectionChecker = lp00Var;
        this.mapObjectSpaceFactory = so00Var;
        this.sourcePointModeObserver = jgt0Var;
        this.routeButtonHandler = o0l0Var;
        this.notificationsVisibilityHandler = rgt0Var;
        this.referralGiftViewHolder = sni0Var;
        this.familyInvitesInteractorLazy = h3yVar2;
        this.sourcePinV1Configurator = eet0Var;
        this.pinV1DataRepository = va00Var;
        this.pinV2DataRepository = ya00Var;
        this.splashRouter = grt0Var;
        this.splashStateInteractor = ast0Var;
        this.whereYouAreActionRouter = qy41Var;
        this.badgeDelegate = xet0Var;
        this.mapObjectsOverlappingRepository = qp00Var;
        this.sourcePointModalViewCoordinatorListener = dgt0Var;
        this.summaryClarifyRepository = kev0Var;
        this.sourcePointFragmentLifecycleTracker = qft0Var;
        this.performanceAnalytics = fva0Var;
        this.mapEventsRepository = rh00Var;
        this.multiexitDelegate = uq40Var;
        this.sharedPinDataHolder = hpr0Var;
        this.massTransitHostLifecycleListener = ez00Var;
        this.routeAnimationsHolder = f0l0Var;
        this.debouncingMapListenerDelegate = otgVar;
        this.mainScreenHolder = ja00Var;
        this.transitionCoordinatorHolder = fy01Var;
        this.blockedZonesHandler = l56Var;
        this.state = oft0Var;
        this.sourcePointViewHolder = djt0Var;
        this.mapObjectCollectionWrapper = xm00Var;
        this.mainScreenTypeInteractor = jc00Var;
        this.pin = aVar;
        dai daiVar = g18.u1;
        this.modalViewCoordinatorListenersCancellable = daiVar;
        this.sourcePinV1ConfigureCancelable = daiVar;
        this.inertiaMoveListener = new jft0(this, agt0Var);
    }

    private final void bindViewsAndDimensInFields() {
        this.content = (FrameLayout) nonNullViewById(w6h0.source_fragment_content);
        this.summaryParent = (ViewGroup) nonNullViewById(w6h0.summary_parent_view);
    }

    private final void disableControlElements() {
        View view;
        ((MainScreen) ((com.yandex.go.taxi.main.a) this.mainScreenHolder).n.b).disableControlElements();
        transitionCoordinator().Tb(false);
        ru.yandex.taxi.badge.b bVar = (ru.yandex.taxi.badge.b) this.badgeDelegate.a;
        bVar.f = false;
        kn4 kn4Var = bVar.e;
        if (kn4Var == null || (view = kn4Var.a) == null) {
            return;
        }
        view.setEnabled(false);
    }

    private final void enableControlElements() {
        View view;
        ((MainScreen) ((com.yandex.go.taxi.main.a) this.mainScreenHolder).n.b).enableControlElements();
        ic00 ic00Var = ((kc00) this.mainScreenTypeInteractor).a;
        ic00Var.getClass();
        if (!(ic00Var instanceof hc00)) {
            transitionCoordinator().Tb(true);
        }
        ru.yandex.taxi.badge.b bVar = (ru.yandex.taxi.badge.b) this.badgeDelegate.a;
        bVar.f = true;
        kn4 kn4Var = bVar.e;
        if (kn4Var == null || (view = kn4Var.a) == null) {
            return;
        }
        view.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScreenOverlapChanges(boolean isScreenOverlapped) {
        qp00 qp00Var = this.mapObjectsOverlappingRepository;
        if (isScreenOverlapped) {
            ((rp00) qp00Var).a(mapObjectsPauseOwner);
        } else {
            ((rp00) qp00Var).b(mapObjectsPauseOwner);
        }
    }

    private final void hideDestinationPickerAndMainScreen() {
        transitionCoordinator().f4();
    }

    private final boolean isSuperAppMainScreenEnabled() {
        return this.mainScreenTypeInteractor.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void networkListener$lambda$0(SourcePointFragment sourcePointFragment, Boolean bool) {
        if (sourcePointFragment.isResumed()) {
            eht0 eht0Var = sourcePointFragment.presenter;
            eht0Var.V.c(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttach$lambda$0(SourcePointFragment sourcePointFragment) {
        sourcePointFragment.debouncingMapListenerDelegate.f = false;
        sourcePointFragment.onCameraMoveFromUserGestureFinished();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(SourcePointFragment sourcePointFragment) {
        sourcePointFragment.presenter.Lg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$1(SourcePointFragment sourcePointFragment, PinV1Component pinV1Component) {
        FragmentActivity activity = sourcePointFragment.getActivity();
        if (sourcePointFragment.isAttachedAndActive() && activity != null) {
            eet0 eet0Var = sourcePointFragment.sourcePinV1Configurator;
            ViewSwitcher viewSwitcher = (ViewSwitcher) activity.findViewById(g6h0.pin_overlay);
            eet0Var.getClass();
            pinV1Component.setAnimationCallback(new det0(eet0Var, pinV1Component));
            j jVar = eet0Var.b;
            jVar.getClass();
            hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
            hbp0Var.a();
            jVar.h = viewSwitcher;
            pinV1Component.setPinCircleOverlayView(viewSwitcher);
            jVar.f = pinV1Component.getState();
            com.yandex.go.navigation.screen.c cVar = jVar.c;
            jVar.g = cVar.b();
            jVar.b(false);
            jVar.i = null;
            tje.N(hbp0Var, null, null, new SourcePointPinAppearanceProcessor$attachOverlay$$inlined$safeCollectIn$1(jVar.e.a(), null, jVar), 3);
            tje.N(hbp0Var, null, null, new SourcePointPinAppearanceProcessor$subscribeToLayoutChange$1(viewSwitcher, new gas0(18, pinV1Component), null), 3);
            g18 addListener = pinV1Component.addListener(new aht0(jVar));
            k20 a = cVar.a(new bht0(jVar));
            tje.N(hbp0Var, null, null, new SourcePointPinAppearanceProcessor$attachOverlay$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.t(jVar.d.b), null, jVar), 3);
            rey reyVar = new rey(3, addListener, a, hbp0Var);
            viewSwitcher.setVisibility(0);
            sourcePointFragment.sourcePinV1ConfigureCancelable = new rey(2, reyVar, viewSwitcher, pinV1Component);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$onSplashFadeOut(eht0 eht0Var) {
        tje.N(eht0Var.Jg(), null, null, new SourcePointPresenter$onSplashFadeOut$1(eht0Var, null), 3);
    }

    private final void prepareIntersectionsParticipants() {
        zy11 zy11Var;
        com.yandex.go.pin.api.a aVar = this.pin;
        fft0 fft0Var = new fft0(this, 1);
        ViewGroup g = aVar.g();
        if (g != null) {
            fft0Var.invoke(g);
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            aVar.o = fft0Var;
        }
        final int h = ru.yandex.taxi.design.utils.c.h(56, asView());
        ((ru.yandex.taxi.map_common.map.intersection.a) this.intersectionChecker).a(Participant.SPACE_WITHOUT_BUTTONS, new muw() { // from class: gft0
            @Override // defpackage.muw
            public final ro00 a() {
                ro00 prepareIntersectionsParticipants$lambda$1;
                prepareIntersectionsParticipants$lambda$1 = SourcePointFragment.prepareIntersectionsParticipants$lambda$1(SourcePointFragment.this, h);
                return prepareIntersectionsParticipants$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 prepareIntersectionsParticipants$lambda$0(SourcePointFragment sourcePointFragment, View view) {
        view.setImportantForAccessibility(1);
        view.setAccessibilityTraversalAfter(dfh0.btn_cashback);
        ((ru.yandex.taxi.map_common.map.intersection.a) sourcePointFragment.intersectionChecker).a(Participant.PIN, new eft0(sourcePointFragment, 0, view));
        ((ru.yandex.taxi.map_common.map.intersection.a) sourcePointFragment.intersectionChecker).a(Participant.ONLY_STEM_OF_PIN, new eft0(sourcePointFragment, 1, view));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro00 prepareIntersectionsParticipants$lambda$0$0(SourcePointFragment sourcePointFragment, View view) {
        to00 to00Var = (to00) sourcePointFragment.mapObjectSpaceFactory;
        to00Var.getClass();
        return to00Var.c(Participant.PIN, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro00 prepareIntersectionsParticipants$lambda$0$1(SourcePointFragment sourcePointFragment, View view) {
        so00 so00Var = sourcePointFragment.mapObjectSpaceFactory;
        return ((to00) so00Var).b(ru.yandex.taxi.design.utils.c.d(wtg0.pin_stem, sourcePointFragment.asView()), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro00 prepareIntersectionsParticipants$lambda$1(SourcePointFragment sourcePointFragment, int i) {
        to00 to00Var = (to00) sourcePointFragment.mapObjectSpaceFactory;
        CameraPosition cameraPosition = ((gh00) to00Var.a).e.c;
        ro00 ro00Var = ro00.d;
        Participant participant = Participant.SPACE_WITHOUT_BUTTONS;
        TaxiMapView h = ((gh00) to00Var.a).h();
        Point target = cameraPosition.getTarget();
        mzz mzzVar = to00Var.c;
        XYPoint xYPoint = (XYPoint) mzzVar.c(target);
        if (xYPoint == null) {
            xYPoint = to00Var.b.d(target);
            mzzVar.d(target, xYPoint);
        }
        return vuz.v(participant, h, xYPoint, cameraPosition.getZoom(), i, i, i, 272);
    }

    private final void showControlElements(boolean animated) {
        transitionCoordinator().showControlElements(animated);
        if (summaryHidden()) {
            this.blockedZonesHandler.showBlockedZones();
        }
    }

    private final void unbindViewsInFields() {
        com.yandex.go.taxi.main.a aVar = (com.yandex.go.taxi.main.a) this.mainScreenHolder;
        krl0 krl0Var = aVar.m;
        if (krl0Var != null) {
            ((a3v) krl0Var.b).Lc(MainScreen.class, null);
            ((ShortcutsMainScreen) krl0Var.a).dismiss();
        }
        aVar.m = null;
        aVar.a();
        this.content = null;
        this.summaryParent = null;
    }

    @Override // defpackage.if4
    public boolean canBackToActiveLinkedOrderStateBarBeVisible() {
        return this.currentScreenTracker.b() == Screen.MAIN && this.sourcePointModeObserver.a() == SourcePointMode.POINT;
    }

    @Override // defpackage.if4
    public boolean canBackToActiveOrderStateBarBeVisible() {
        Screen b = this.currentScreenTracker.a.b();
        return b == Screen.MAIN || b == Screen.MAIN_V4 || b == Screen.SUMMARY || b == Screen.MULTI_AREA;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public boolean canOpenMainMenu() {
        return (summaryOpened() || isSuperAppMainScreenEnabled()) ? false : true;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public String getBusinessName() {
        return "pickup_location";
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public String getPromoName() {
        return getBusinessName();
    }

    @Override // defpackage.ihf
    /* renamed from: getTrackedScreen */
    public Screen getScreen() {
        if (!summaryHidden() || tollRoadSelectorShown()) {
            return Screen.SUMMARY;
        }
        if (this.multiexitDelegate.d()) {
            return Screen.MULTI_AREA;
        }
        if (routeSelectorShown()) {
            return Screen.ROUTE_SELECTOR;
        }
        if (((ry41) this.whereYouAreActionRouter).f()) {
            return Screen.WHERE_YOU_ARE;
        }
        if (routeStopsV2Shown()) {
            return Screen.ROUTE_STOPS_V2;
        }
        ic00 ic00Var = ((kc00) this.mainScreenTypeInteractor).a;
        ic00Var.getClass();
        return ic00Var instanceof hc00 ? Screen.TAXI_MAIN : Screen.MAIN;
    }

    @Override // defpackage.mgt0
    public void hideRouteSelector() {
        modalViewCoordinator().c(RouteSelectorModalView.class, true, null);
    }

    @Override // defpackage.mgt0
    public boolean isMapMoving() {
        return this.debouncingMapListenerDelegate.f;
    }

    @Override // defpackage.mgt0
    public boolean isOnMainScreen() {
        return (!summaryHidden() || routeSelectorShown() || tollRoadSelectorShown()) ? false : true;
    }

    @Override // defpackage.mgt0
    public boolean noModalViews() {
        return modalViewCoordinator().isEmpty();
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onAttach(context);
        fva0 fva0Var = this.performanceAnalytics;
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        fva0Var.e("Spf.Inject", performanceAnalytics$Type, elapsedRealtime);
        fva0.b(this.performanceAnalytics, "Spf.Inject", performanceAnalytics$Type, null, 4);
        this.massTransitHostLifecycleListener.b = new gas0(17, this);
        ((com.yandex.go.taxi.summary.map.focus.data.c) this.summaryClarifyRepository).a();
        qft0 qft0Var = this.sourcePointFragmentLifecycleTracker;
        hbp0 hbp0Var = qft0Var.b;
        hbp0Var.a();
        Iterator it = qft0Var.a.iterator();
        while (it.hasNext()) {
            ((pft0) it.next()).a(hbp0Var);
        }
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        RouteSelectorModalView routeSelectorModalView = (RouteSelectorModalView) modalViewCoordinator().r(true, RouteSelectorModalView.class);
        if (routeSelectorModalView != null) {
            routeSelectorModalView.onBackPressed();
            hideRouteSelector();
            return true;
        }
        u45 e = modalViewCoordinator().e();
        if (e != null && e.getInterceptOnBackPress()) {
            jst.e.s(new IllegalStateException("Close modal view form fragment. OnBackPressed call missed for ".concat(e.getClass().getSimpleName())));
            modalViewCoordinator().l(e);
            return true;
        }
        eht0 eht0Var = this.presenter;
        ru.yandex.taxi.preorder.source.mode.interactor.e eVar = eht0Var.J;
        rjt0 rjt0Var = eht0Var.B;
        mgt0 mgt0Var = (mgt0) eht0Var.Dg();
        if (((mgt0) eht0Var.Dg()).isOnMainScreen()) {
            ic00 ic00Var = ((kc00) eht0Var.Q).a;
            ic00Var.getClass();
            if (ic00Var instanceof hc00) {
                return false;
            }
            ght0 ght0Var = eht0Var.K;
            boolean a = ght0Var.a.a();
            if (a) {
                ght0Var.b.c(null);
            }
            return a;
        }
        if (((mgt0) eht0Var.Dg()).routeSelectorShown()) {
            rjt0Var.b.a("Routes.EditBack", rjt0Var.o.getModeName());
            eht0Var.Kg();
            if (((mgt0) eht0Var.Dg()).routeSelectorShown()) {
                ((mgt0) eht0Var.Dg()).hideRouteSelector();
            }
            eht0Var.o0.b(bov0.e);
            return true;
        }
        if (eVar.a.a() != SourcePointMode.ROUTE || (!eht0Var.a0.a.a() && !mgt0Var.isMapMoving())) {
            eht0Var.n0.b(eht0Var.g0.a(), true);
            return true;
        }
        rjt0Var.b.a("Routes.FocusByBack", rjt0Var.o.getModeName());
        eVar.e(false);
        return true;
    }

    @Override // defpackage.wwo
    public void onCameraMoveFromUserGestureFinished() {
        eht0 eht0Var = this.presenter;
        CameraAnimationFinishType cameraAnimationFinishType = CameraAnimationFinishType.ANIMATE_GESTURE_CHANGED;
        if (eht0Var.Eg()) {
            ((yet0) eht0Var.f0.get()).a(cameraAnimationFinishType, false, null);
        }
        this.mapEventsRepository.a.g(cameraAnimationFinishType);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(bvh0.source_fragment, container, false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        hideDestinationPickerAndMainScreen();
        oft0 oft0Var = this.state;
        if (!summaryHidden()) {
            this.presenter.b0.a();
        }
        oft0Var.getClass();
        this.state.b = false;
        p0l0 p0l0Var = (p0l0) this.routeButtonHandler;
        hxj0 hxj0Var = p0l0Var.c;
        if (hxj0Var != null) {
            p0l0Var.b.removeCallbacks(hxj0Var);
        }
        unbindViewsInFields();
        djt0 djt0Var = this.sourcePointViewHolder;
        View asView = asView();
        ejt0 ejt0Var = (ejt0) djt0Var;
        WeakReference weakReference = ejt0Var.a;
        if (jl40.l(weakReference != null ? (View) weakReference.get() : null, asView)) {
            WeakReference weakReference2 = ejt0Var.a;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            ejt0Var.a = null;
        }
        this.mapObjectCollectionWrapper.d();
        this.mapObjectCollectionWrapper.m();
        this.pin.n = null;
        this.sourcePinV1ConfigureCancelable.cancel();
        uq40 uq40Var = this.multiexitDelegate;
        uq40Var.I = null;
        uq40Var.J.cancel();
        uq40Var.G.a();
        this.presenter.Cg();
        ru.yandex.taxi.preorder.source.routeoverlay.a aVar = (ru.yandex.taxi.preorder.source.routeoverlay.a) this.routeOverlay;
        aVar.Hg();
        aVar.C.d(aVar);
        vgt0 vgt0Var = (vgt0) this.currentPlaceOverlay;
        vgt0Var.C.Cg();
        ValueAnimator valueAnimator = vgt0Var.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f4c0 f4c0Var = vgt0Var.E;
        if (f4c0Var != null) {
            f4c0Var.d();
        }
        vgt0Var.E = null;
        vgt0Var.Ig();
        pzt0 pzt0Var = ((ru.yandex.taxi.yaplus.a) this.plusPromoRouter).d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.modalViewCoordinatorListenersCancellable.cancel();
        pzt0 pzt0Var2 = ((com.yandex.go.taxi.summary.map.focus.data.c) this.summaryClarifyRepository).c;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        Iterator it = this.sourcePointFragmentLifecycleTracker.a.iterator();
        while (it.hasNext()) {
            ((pft0) it.next()).onDestroyView();
        }
        this.sharedPinDataHolder.b(this.pinV1DataRepository, this.pinV2DataRepository);
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        NotificationStackComponent notificationStackComponent = this.notificationStackHolder.a;
        if (notificationStackComponent != null) {
            notificationStackComponent.dropOffset();
        }
        if (getActivity() != null) {
            l8x l8xVar = this.doOnFirstContentfulPaint;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            this.doOnFirstContentfulPaint = null;
        }
        qft0 qft0Var = this.sourcePointFragmentLifecycleTracker;
        qft0Var.b.b();
        Iterator it = qft0Var.a.iterator();
        while (it.hasNext()) {
            ((pft0) it.next()).onDetach();
        }
        super.onDetach();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public void onDismissingStart() {
        super.onDismissingStart();
        transitionCoordinator().D8();
        ((com.yandex.go.taxi.main.a) this.mainScreenHolder).a();
        com.yandex.go.preorder.map.a aVar = (com.yandex.go.preorder.map.a) this.routeAnimationsHolder;
        aVar.k.b();
        aVar.a.a0("SourcePointFocusOwner");
        ((ru.yandex.taxi.preorder.source.routeoverlay.a) this.routeOverlay).Hg();
        xet0 xet0Var = this.badgeDelegate;
        xet0Var.c.cancel();
        ru.yandex.taxi.badge.b bVar = (ru.yandex.taxi.badge.b) xet0Var.a;
        kn4 kn4Var = bVar.e;
        if (kn4Var != null) {
            kn4Var.b();
        }
        bVar.d.b();
    }

    @Override // defpackage.qt00
    public void onMapCollapsed() {
        ((MainScreen) ((com.yandex.go.taxi.main.a) this.mainScreenHolder).n.b).onMapCollapsed();
    }

    @Override // defpackage.qt00
    public void onMapDragged() {
        eht0 eht0Var = this.presenter;
        eht0Var.D.a = true;
        if (!eht0Var.J.a.a().q()) {
            eht0Var.U.a.f();
        }
        eht0Var.p0.a(mfv0.a);
        r rVar = eht0Var.S;
        rVar.d.j = "drag";
        rVar.D = null;
        rVar.g();
        com.yandex.go.where_you_are.impl.router.a aVar = ((ry41) this.whereYouAreActionRouter).b;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r2.q() != false) goto L16;
     */
    @Override // defpackage.qt00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMapExpanded() {
        eht0 eht0Var = this.presenter;
        eht0Var.u0.b.g(yb60.a);
        xvw xvwVar = eht0Var.Z;
        ru.yandex.taxi.preorder.source.mode.interactor.e eVar = xvwVar.d;
        SourcePointMode a = eVar.a.a();
        jpv0 b = xvwVar.n.b();
        b.getClass();
        if (((b instanceof fpv0) && a != SourcePointMode.WHERE_YOU_ARE) || xvwVar.f.d() == null) {
            xvwVar.j.b(AddressResolveRepository.State.WAITING);
        }
        if (a.n()) {
            xvwVar.z = false;
            xvwVar.a();
        }
        xvwVar.b.a.f();
        eVar.g(false);
        eVar.c();
        if (eht0Var.J.a.a().q()) {
            return;
        }
        eht0Var.h0.a.g(ModalsVisibility.HIDE);
    }

    @Override // defpackage.qt00
    public void onMapPressed() {
        eht0 eht0Var = this.presenter;
        boolean isMapMoving = isMapMoving();
        uq40 uq40Var = (uq40) eht0Var.H.get();
        ktg ktgVar = uq40Var.G;
        rg3 rg3Var = new rg3(uq40Var, isMapMoving, 7);
        ktgVar.a();
        ktgVar.b = rg3Var;
        ktgVar.a.postDelayed(rg3Var, 300L);
    }

    @Override // defpackage.qt00
    public void onMapReleased() {
        eht0 eht0Var = this.presenter;
        MultiexitModalView multiexitModalView = ((uq40) eht0Var.H.get()).I;
        if (multiexitModalView != null) {
            multiexitModalView.enable();
        }
        r rVar = eht0Var.S;
        rVar.d.j = "action_release_map";
        rVar.g();
    }

    @Override // defpackage.qt00
    public boolean onMapTapped(float x, float y) {
        eht0 eht0Var = this.presenter;
        if (!((com.yandex.go.tappable_poi.experiments.f) eht0Var.k0).a.c.isEmpty() && eht0Var.J.a.a() == SourcePointMode.POINT_WITH_ROUTE) {
            return false;
        }
        Point d = ((gh00) eht0Var.m0).e.d(new ScreenPoint(x, y));
        return eht0Var.l0.a(d != null ? ru.yandex.taxi.map.utils.a.E(d, null) : null);
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.debouncingMapListenerDelegate.c();
        ((com.yandex.go.taxi.main.a) this.mainScreenHolder).a();
        jet0 jet0Var = (jet0) this.sourcePointActionRoutersInteractorLazy.get();
        for (Map.Entry entry : jet0Var.b.entrySet()) {
            ((ru.yandex.taxi.map_common.b) jet0Var.a).c((Class) entry.getKey(), (xsd0) entry.getValue());
        }
        ah00 ah00Var = this.mapController;
        ((CopyOnWriteArraySet) ((gh00) ah00Var).f.j).remove(this.inertiaMoveListener);
        this.presenter.pause();
        ((ru.yandex.taxi.map_common.map.intersection.a) this.intersectionChecker).j(Participant.ONLY_STEM_OF_PIN);
        setNetworkReceiverListener(null);
        this.modalViewCoordinatorListenersCancellable.cancel();
        ((ru.yandex.taxi.map_common.map.intersection.a) this.intersectionChecker).j(Participant.PIN);
        ((ru.yandex.taxi.map_common.map.intersection.a) this.intersectionChecker).j(Participant.SPACE_WITHOUT_BUTTONS);
        ((com.yandex.go.payments.shared.family.invites.d) ((gbp) this.familyInvitesInteractorLazy.get())).e.b();
        qft0 qft0Var = this.sourcePointFragmentLifecycleTracker;
        qft0Var.d.b();
        Iterator it = qft0Var.a.iterator();
        while (it.hasNext()) {
            ((pft0) it.next()).onPause();
        }
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.debouncingMapListenerDelegate.a(this);
        jet0 jet0Var = (jet0) this.sourcePointActionRoutersInteractorLazy.get();
        for (Map.Entry entry : jet0Var.b.entrySet()) {
            ((ru.yandex.taxi.map_common.b) jet0Var.a).a((Class) entry.getKey(), (xsd0) entry.getValue());
        }
        ((com.yandex.go.taxi.main.a) this.mainScreenHolder).b();
        ((ru.yandex.taxi.preorder.source.mode.interactor.e) this.sourcePointViewModeInteractor).d();
        if (noModalViews() && summaryHidden()) {
            showControlElements(false);
        }
        ah00 ah00Var = this.mapController;
        ((CopyOnWriteArraySet) ((gh00) ah00Var).f.j).add(this.inertiaMoveListener);
        prepareIntersectionsParticipants();
        this.presenter.resume();
        this.modalViewCoordinatorListenersCancellable = modalViewCoordinator().g(this.sourcePointModalViewCoordinatorListener);
        eht0 eht0Var = this.presenter;
        eht0Var.V.c(osb1.b(requireContext()));
        setNetworkReceiverListener(this.networkListener);
        rgt0 rgt0Var = this.notificationsVisibilityHandler;
        rgt0Var.b.postDelayed(rgt0Var.c, 500L);
        modalViewCoordinator().n(new kft0(this));
        ((com.yandex.go.payments.shared.family.invites.d) ((gbp) this.familyInvitesInteractorLazy.get())).a();
        sni0 sni0Var = this.referralGiftViewHolder;
        ViewGroup rootView = getRootView();
        int i = w6h0.top_end_corner;
        com.yandex.go.promocodes.referral.impl.ui.b bVar = (com.yandex.go.promocodes.referral.impl.ui.b) sni0Var;
        bVar.e = rootView;
        bVar.d = i;
        ic00 ic00Var = ((kc00) this.mainScreenTypeInteractor).a;
        ic00Var.getClass();
        if (ic00Var instanceof hc00) {
            transitionCoordinator().Kf();
        }
        qft0 qft0Var = this.sourcePointFragmentLifecycleTracker;
        hbp0 hbp0Var = qft0Var.d;
        hbp0Var.a();
        Iterator it = qft0Var.a.iterator();
        while (it.hasNext()) {
            ((pft0) it.next()).d(hbp0Var);
        }
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        h8z h8zVar = (h8z) this.diagnosticOverlay;
        if (h8zVar.a.a()) {
            f8z f8zVar = (f8z) h8zVar.b.get();
            f8zVar.c.Bg(f8zVar);
            h8zVar.c = f8zVar;
        }
        qft0 qft0Var = this.sourcePointFragmentLifecycleTracker;
        hbp0 hbp0Var = qft0Var.c;
        hbp0Var.a();
        Iterator it = qft0Var.a.iterator();
        while (it.hasNext()) {
            ((pft0) it.next()).b(hbp0Var);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        h8z h8zVar = (h8z) this.diagnosticOverlay;
        f8z f8zVar = h8zVar.c;
        if (f8zVar != null) {
            f8zVar.c.Cg();
            w53 w53Var = f8zVar.B;
            Iterator it = ((u53) w53Var.values()).iterator();
            while (true) {
                yqv yqvVar = (yqv) it;
                if (!yqvVar.hasNext()) {
                    break;
                }
                rud0 rud0Var = (rud0) yqvVar.next();
                rud0Var.a.d();
                f4c0 f4c0Var = rud0Var.b;
                f4c0Var.g(null);
                f4c0Var.d();
            }
            w53Var.clear();
            h8zVar.c = null;
        }
        qft0 qft0Var = this.sourcePointFragmentLifecycleTracker;
        qft0Var.c.b();
        Iterator it2 = qft0Var.a.iterator();
        while (it2.hasNext()) {
            ((pft0) it2.next()).getClass();
        }
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        com.yandex.go.preorder.map.a aVar = (com.yandex.go.preorder.map.a) this.routeAnimationsHolder;
        aVar.k.f();
        aVar.a.b8("SourcePointFocusOwner");
        bindViewsAndDimensInFields();
        int i = 0;
        ((ViewGroup) view).setMotionEventSplittingEnabled(false);
        FrameLayout frameLayout = this.content;
        if (frameLayout != null) {
            int i2 = edj.x;
            tf91.a(frameLayout);
        }
        this.mapObjectCollectionWrapper.b(((gh00) this.mapController).i);
        djt0 djt0Var = this.sourcePointViewHolder;
        View asView = asView();
        ejt0 ejt0Var = (ejt0) djt0Var;
        ejt0Var.getClass();
        ejt0Var.a = new WeakReference(asView);
        eht0 eht0Var = this.presenter;
        eht0Var.Bg(this);
        ru.yandex.taxi.preorder.source.data.c cVar = eht0Var.E;
        zlm zlmVar = cVar.e;
        if (zlmVar == null) {
            zlm zlmVar2 = new zlm(cVar.d.c(), EmptyList.a, false);
            cVar.e = zlmVar2;
            zlmVar = zlmVar2;
        }
        setDrivingRoute(zlmVar, false);
        final r rVar = eht0Var.S;
        int i3 = 5;
        final x5s0 x5s0Var = new x5s0(i3, eht0Var);
        rVar.e.A.i = new qqb0() { // from class: mdt0
            @Override // defpackage.qqb0
            public final void a(wpb0 wpb0Var) {
                r.this.d.j = "label_tap";
                x5s0Var.accept(wpb0Var.b);
            }
        };
        rVar.a.a(rVar.B);
        tje.N(eht0Var.Jg(), null, null, new SourcePointPresenter$attachView$$inlined$safeCollectIn$1(eht0Var.i0.b, null, this), 3);
        tse Jg = eht0Var.Jg();
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        SourcePointPresenter$attachView$3 sourcePointPresenter$attachView$3 = new SourcePointPresenter$attachView$3(eht0Var, null);
        int i4 = 1;
        tje.N(Jg, null, coroutineStart, sourcePointPresenter$attachView$3, 1);
        ViewGroup viewGroup = this.summaryParent;
        if (viewGroup == null) {
            ny61.r("Required value was null.");
            return;
        }
        viewGroup.setElevation(xw31.b(erg0.summary_elevation, requireContext()));
        xet0 xet0Var = this.badgeDelegate;
        ViewGroup viewGroup2 = (ViewGroup) nonNullViewById(dfh0.btn_cashback);
        ((ru.yandex.taxi.badge.b) xet0Var.a).b(viewGroup2, null, new wet0(xet0Var.b));
        xet0Var.c = tje.i(viewGroup2, 48, new vet0(viewGroup2, i));
        vgt0 vgt0Var = (vgt0) this.currentPlaceOverlay;
        final ygt0 ygt0Var = vgt0Var.C;
        ygt0Var.Bg(vgt0Var);
        Lifecycle lifecycle = ygt0Var.y;
        ygt0Var.I = new l30(14, cey.a(lifecycle, Lifecycle.Event.ON_RESUME, new Runnable() { // from class: com.yandex.go.location.user.overlay.a
            @Override // java.lang.Runnable
            public final void run() {
                ygt0 ygt0Var2 = ygt0.this;
                ygt0Var2.J = tje.N(ygt0Var2.Jg(), null, null, new SourcePointOverlayPresenter$attachView$resumeCancellable$1$1(ygt0Var2, null), 3);
            }
        }), cey.a(lifecycle, Lifecycle.Event.ON_PAUSE, new m8t0(11, ygt0Var)));
        this.presenter.S.g();
        ru.yandex.taxi.preorder.source.routeoverlay.a aVar2 = (ru.yandex.taxi.preorder.source.routeoverlay.a) this.routeOverlay;
        aVar2.getClass();
        b01 b01Var = new b01(27, aVar2);
        aVar2.Og(((gh00) ((ah00) aVar2.b)).j());
        aVar2.Tg();
        aVar2.v0 = new cp10(i4, aVar2);
        aVar2.C.b(aVar2, new hd5(2, aVar2, b01Var));
        com.yandex.go.pin.api.a aVar3 = this.pin;
        aVar3.n = new m8t0(4, this);
        fft0 fft0Var = new fft0(this, i);
        com.yandex.go.pin.api.v1.a aVar4 = aVar3.g;
        if (aVar3.g() == null) {
            aVar3.p = fft0Var;
        } else if (aVar4 != null) {
            fft0Var.invoke(aVar4.i);
        }
        ((ru.yandex.taxi.preorder.source.routeoverlay.a) this.routeOverlay).c0 = new lft0(this);
        if (!((hrt0) this.splashRouter).a()) {
            this.doOnFirstContentfulPaint = ((com.yandex.go.splash.domain.b) this.splashStateInteractor).b(new m8t0(i3, this.presenter));
        }
        com.yandex.go.taxi.main.a aVar5 = (com.yandex.go.taxi.main.a) this.mainScreenHolder;
        aVar5.getClass();
        reu reuVar = aVar5.q;
        o500 o500Var = aVar5.i;
        xj10 xj10Var = new xj10(reuVar, o500Var);
        mrj mrjVar = aVar5.g;
        o800 o800Var = (o800) mrjVar.b;
        bk4 bk4Var = ((xet0) mrjVar.c).a;
        o800Var.getClass();
        bk4Var.getClass();
        v2g v2gVar = new v2g(o800Var, xj10Var, bk4Var);
        ((h2s0) ((pgk0) mrjVar.w).b).getClass();
        x2g x2gVar = new x2g(v2gVar, 13);
        w2g w2gVar = new w2g(v2gVar, 26);
        w2g w2gVar2 = new w2g(v2gVar, 6);
        w2g w2gVar3 = new w2g(v2gVar, 15);
        w2g w2gVar4 = new w2g(v2gVar, 16);
        w2g w2gVar5 = new w2g(v2gVar, 12);
        x2g x2gVar2 = new x2g(v2gVar, 9);
        w2g w2gVar6 = new w2g(v2gVar, 23);
        n3w a = n3w.a(v2gVar);
        w2g w2gVar7 = new w2g(v2gVar, 19);
        w2g w2gVar8 = new w2g(v2gVar, 14);
        eqh eqhVar = new eqh();
        x2g x2gVar3 = new x2g(v2gVar, 0);
        x2g x2gVar4 = new x2g(v2gVar, 7);
        int i5 = 4;
        m580 m580Var = new m580(w2gVar8, w2gVar2, eqhVar, x2gVar3, x2gVar4, new x2g(v2gVar, 1), new w2g(v2gVar, i5), new x2g(v2gVar, i5), new w2g(v2gVar, 8), 17);
        w2g w2gVar9 = new w2g(v2gVar, 20);
        w2g w2gVar10 = new w2g(v2gVar, 21);
        w2g w2gVar11 = new w2g(v2gVar, 3);
        int i6 = 10;
        x2g x2gVar5 = new x2g(v2gVar, i6);
        w2g w2gVar12 = new w2g(v2gVar, i6);
        w2g w2gVar13 = new w2g(v2gVar, 25);
        x2g x2gVar6 = new x2g(v2gVar, 3);
        xvf0 b = i5m.b(a3s0.a);
        int i7 = 0;
        xvf0 b2 = i5m.b(new m580(x2gVar, a, w2gVar7, m580Var, w2gVar9, w2gVar10, x2gVar4, new y2s0(eqhVar, new u6o0(w2gVar11, x2gVar5, w2gVar12, w2gVar13, x2gVar6, b), new elo0(w2gVar2, b, 25), i7), new x2g(v2gVar, 2), 16));
        xvf0 b3 = i5m.b(new z0s0(b2, i7));
        w2g w2gVar14 = new w2g(v2gVar, 22);
        w2g w2gVar15 = new w2g(v2gVar, 7);
        x2g x2gVar7 = new x2g(v2gVar, 14);
        w2g w2gVar16 = new w2g(v2gVar, 28);
        w2g w2gVar17 = new w2g(v2gVar, 13);
        w2g w2gVar18 = new w2g(v2gVar, 17);
        xvf0 b4 = i5m.b(new ii9(new w2g(v2gVar, 18), new w2g(v2gVar, 2), w2gVar15, new x2g(v2gVar, 8), new x2g(v2gVar, 6), w2gVar2, new x2g(v2gVar, 5), new w2g(v2gVar, 29), new w2g(v2gVar, 1), new x2g(v2gVar, 15), new x2g(v2gVar, 12), x2gVar, eqhVar, new w2g(v2gVar, 11), new w2g(v2gVar, 9), new x2g(v2gVar, 11), 13));
        eqh.a(eqhVar, i5m.b(new jpn0((xvf0) x2gVar, (xvf0) w2gVar15, (v7p) new zs0(w2gVar, w2gVar2, w2gVar3, w2gVar4, w2gVar5, x2gVar2, w2gVar6, b3, w2gVar14, w2gVar15, x2gVar7, w2gVar16, w2gVar17, w2gVar18, b4, x2gVar5, new w2g(v2gVar, 0)), (xvf0) new m7q0(b2, 29), (xvf0) new w2g(v2gVar, 24), b4, (xvf0) new w2g(v2gVar, 5), (xvf0) new w2g(v2gVar, 27), 9)));
        aVar5.m = new krl0(v2gVar.I(), v2gVar.j1(), (ShortcutsMainScreen) eqhVar.get());
        o500Var.a(reuVar);
        aVar5.p.add(pwf0.e(oxf0.class, new la00(0, aVar5)));
        Iterator it = this.sourcePointFragmentLifecycleTracker.a.iterator();
        while (it.hasNext()) {
            ((pft0) it.next()).c();
        }
        this.sharedPinDataHolder.a(this.pinV1DataRepository, this.pinV2DataRepository);
    }

    @Override // defpackage.mgt0
    public boolean routeSelectorShown() {
        return modalViewCoordinator().r(true, RouteSelectorModalView.class) != null;
    }

    public final boolean routeStopsV2Shown() {
        return modalViewCoordinator().j() != null;
    }

    @Override // defpackage.mgt0
    public void setDrivingRoute(zlm route, boolean animated) {
        ((ru.yandex.taxi.preorder.source.routeoverlay.a) this.routeOverlay).Rg(route, animated);
    }

    public void setForceHiddenReferralGift(boolean hidden) {
        xni0 xni0Var = ((com.yandex.go.promocodes.referral.impl.ui.b) this.referralGiftViewHolder).a;
        xni0Var.F = hidden;
        xni0Var.Lg(xni0Var.B, xni0Var.z.a.b());
    }

    @Override // defpackage.mgt0
    public void setMapToPoint(zzs geoPoint) {
        ((gh00) this.mapController).G(geoPoint);
    }

    @Override // defpackage.mgt0
    public void showPlusHome() {
        ((ru.yandex.taxi.yaplus.a) this.plusPromoRouter).a();
    }

    public final boolean summaryHidden() {
        jpv0 b = this.presenter.g0.b();
        b.getClass();
        return b instanceof fpv0;
    }

    public final boolean summaryOpened() {
        jpv0 b = this.presenter.g0.b();
        b.getClass();
        return b instanceof hpv0;
    }

    public final boolean tollRoadSelectorShown() {
        return transitionCoordinator().F4();
    }

    public final ITransitionCoordinator transitionCoordinator() {
        return ((nwx0) this.transitionCoordinatorHolder).a.c();
    }

    @Override // defpackage.mgt0
    public void updateControlElements(TaxiMainControlElementEvent event) {
        int i = ift0.a[event.ordinal()];
        if (i == 1) {
            showControlElements(true);
            return;
        }
        if (i == 2) {
            enableControlElements();
        } else if (i == 3) {
            disableControlElements();
        } else {
            w511.b();
        }
    }
}
