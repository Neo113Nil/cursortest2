package ru.yandex.taxi.order;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.search.model.DecideLaterConfig;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.go.superapp.order.multi.old.view.OrderViewContainer;
import com.yandex.go.superapp.orders.known.KnownOrder;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.api.multi.TaxiOrderPresentationType;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonView;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterRideStatus;
import com.yandex.go.taxi.order.models.api.objects.OriginalRequest;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import defpackage.a3v;
import defpackage.a850;
import defpackage.aju;
import defpackage.arv0;
import defpackage.av6;
import defpackage.avj0;
import defpackage.b61;
import defpackage.b700;
import defpackage.bc;
import defpackage.bc00;
import defpackage.bk4;
import defpackage.bm40;
import defpackage.bt00;
import defpackage.c0g;
import defpackage.c4r0;
import defpackage.ci70;
import defpackage.clk0;
import defpackage.co40;
import defpackage.cy70;
import defpackage.d0g;
import defpackage.d1l0;
import defpackage.d441;
import defpackage.d8t0;
import defpackage.d8v0;
import defpackage.dai;
import defpackage.ddf;
import defpackage.dfh0;
import defpackage.dgs;
import defpackage.dhs0;
import defpackage.dne0;
import defpackage.dqe0;
import defpackage.dsd;
import defpackage.dz00;
import defpackage.e0g;
import defpackage.e0j;
import defpackage.eck0;
import defpackage.ed80;
import defpackage.edj;
import defpackage.ew70;
import defpackage.f0g;
import defpackage.fat0;
import defpackage.fcs;
import defpackage.fef;
import defpackage.fjm;
import defpackage.fw70;
import defpackage.fxe;
import defpackage.fy70;
import defpackage.g0j;
import defpackage.g18;
import defpackage.g680;
import defpackage.g6y0;
import defpackage.ga80;
import defpackage.gpx0;
import defpackage.gtq0;
import defpackage.gvv;
import defpackage.gw70;
import defpackage.gwe;
import defpackage.gxe;
import defpackage.h080;
import defpackage.h0j;
import defpackage.h1y0;
import defpackage.h2r;
import defpackage.h3y;
import defpackage.hc00;
import defpackage.hc80;
import defpackage.hk20;
import defpackage.hpr0;
import defpackage.hst;
import defpackage.ht10;
import defpackage.hvv;
import defpackage.hwe;
import defpackage.hwo0;
import defpackage.hxx;
import defpackage.i020;
import defpackage.i3j;
import defpackage.i3y;
import defpackage.i5m;
import defpackage.i6y0;
import defpackage.ic00;
import defpackage.ic80;
import defpackage.icv0;
import defpackage.ihf;
import defpackage.ii9;
import defpackage.ike;
import defpackage.iw70;
import defpackage.j4n;
import defpackage.jc00;
import defpackage.jc80;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jve;
import defpackage.jw70;
import defpackage.jwf0;
import defpackage.k7x0;
import defpackage.k9j0;
import defpackage.kc00;
import defpackage.kf00;
import defpackage.kh70;
import defpackage.ki70;
import defpackage.kk;
import defpackage.kkt;
import defpackage.kn4;
import defpackage.kpi0;
import defpackage.kvp0;
import defpackage.kw70;
import defpackage.kyh0;
import defpackage.l0g;
import defpackage.l1l0;
import defpackage.l1t;
import defpackage.l8h0;
import defpackage.lds;
import defpackage.lw70;
import defpackage.lx4;
import defpackage.m0g;
import defpackage.m1t;
import defpackage.m3o;
import defpackage.m6w0;
import defpackage.m950;
import defpackage.mhf;
import defpackage.mjg0;
import defpackage.mjv;
import defpackage.mw40;
import defpackage.mw70;
import defpackage.my70;
import defpackage.n080;
import defpackage.n20;
import defpackage.n3w;
import defpackage.ndh0;
import defpackage.njv;
import defpackage.nly;
import defpackage.nn4;
import defpackage.npv;
import defpackage.npx0;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.o241;
import defpackage.o2y0;
import defpackage.o4f;
import defpackage.o61;
import defpackage.o8g0;
import defpackage.oa1;
import defpackage.oc60;
import defpackage.oep0;
import defpackage.oh70;
import defpackage.otg;
import defpackage.ou4;
import defpackage.ow70;
import defpackage.oz70;
import defpackage.p370;
import defpackage.p51;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pep0;
import defpackage.pgu;
import defpackage.phm;
import defpackage.pho;
import defpackage.ps70;
import defpackage.pv0;
import defpackage.pw40;
import defpackage.pw70;
import defpackage.pwf0;
import defpackage.qa80;
import defpackage.qgu;
import defpackage.qh70;
import defpackage.qqy;
import defpackage.qs70;
import defpackage.qt00;
import defpackage.qv10;
import defpackage.qw70;
import defpackage.r51;
import defpackage.rbx0;
import defpackage.rh70;
import defpackage.ris;
import defpackage.rp31;
import defpackage.rqo;
import defpackage.rut;
import defpackage.rw70;
import defpackage.rwp0;
import defpackage.s3j;
import defpackage.s45;
import defpackage.scc;
import defpackage.sly;
import defpackage.sw70;
import defpackage.sxe;
import defpackage.t1w;
import defpackage.t26;
import defpackage.t3y0;
import defpackage.tbk0;
import defpackage.th70;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tjt0;
import defpackage.tl3;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.tw70;
import defpackage.tz70;
import defpackage.u45;
import defpackage.uc6;
import defpackage.uc80;
import defpackage.ud30;
import defpackage.uh70;
import defpackage.unr0;
import defpackage.urf0;
import defpackage.uw70;
import defpackage.uxe;
import defpackage.v1p;
import defpackage.va80;
import defpackage.vkh0;
import defpackage.vw70;
import defpackage.vx0;
import defpackage.w030;
import defpackage.w29;
import defpackage.w511;
import defpackage.wa80;
import defpackage.wi00;
import defpackage.wiq0;
import defpackage.wl40;
import defpackage.ww70;
import defpackage.wwe;
import defpackage.wyf;
import defpackage.x71;
import defpackage.x980;
import defpackage.xby;
import defpackage.xi00;
import defpackage.xid;
import defpackage.xk2;
import defpackage.xv8;
import defpackage.xvf0;
import defpackage.xw31;
import defpackage.xw70;
import defpackage.y1u;
import defpackage.y3y0;
import defpackage.y4c0;
import defpackage.y9y0;
import defpackage.yc;
import defpackage.yj70;
import defpackage.yvf0;
import defpackage.yyx0;
import defpackage.yz80;
import defpackage.z5y0;
import defpackage.z6x0;
import defpackage.zi60;
import defpackage.zu6;
import defpackage.zuj0;
import defpackage.zw70;
import defpackage.zwe;
import defpackage.zxf;
import defpackage.zxf0;
import defpackage.zy11;
import defpackage.zyx0;
import defpackage.zzf;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.costcenters.fields.CostCenterFieldsModalView;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.back.BackButtonView;
import ru.yandex.taxi.order.overlay.OrderBubblesOverlay;
import ru.yandex.taxi.order.recenter.NextRecenterButtonView;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

@Metadata(d1 = {"\u0000¨\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Ú\u00022\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0006Û\u0002Ü\u0002Ý\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\tJ\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"JC\u0010.\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u0010\tJ\u000f\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u0010\tJ\u000f\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u0010\tJ\u000f\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u0010\tJ\u001f\u00107\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b9\u0010\tJ\u000f\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u0010\fJ\r\u0010;\u001a\u00020\u000f¢\u0006\u0004\b;\u0010\tJ\u001d\u0010=\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010<\u001a\u00020\n¢\u0006\u0004\b=\u0010>J\u001f\u0010C\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020E2\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\n¢\u0006\u0004\bI\u0010\fJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\fJ\u001d\u0010O\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\u0015\u0010W\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bW\u0010RJ\u001d\u0010Z\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J+\u0010a\u001a\u00020\u000f2\b\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010^\u001a\u0004\u0018\u00010\\2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020(H\u0002¢\u0006\u0004\bc\u0010dJ\u0019\u0010g\u001a\u00020\u000f2\b\u0010f\u001a\u0004\u0018\u00010eH\u0002¢\u0006\u0004\bg\u0010hJ\u001f\u0010l\u001a\u00020k2\u0006\u0010$\u001a\u00020#2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u000fH\u0002¢\u0006\u0004\bn\u0010\tJ\u000f\u0010o\u001a\u00020\u000fH\u0002¢\u0006\u0004\bo\u0010\tJ\u0017\u0010q\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\nH\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\nH\u0002¢\u0006\u0004\bs\u0010\fJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020iH\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010y\u001a\u00020\u000f2\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zR$\u0010|\u001a\u00020{8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R1\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010 \u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010§\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010®\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010µ\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010¼\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ã\u0001\u001a\u00030Â\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R*\u0010Ê\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R*\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R*\u0010Ø\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010ß\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R1\u0010æ\u0001\u001a\n\u0012\u0005\u0012\u00030å\u00010\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bæ\u0001\u0010\u0093\u0001\u001a\u0006\bç\u0001\u0010\u0095\u0001\"\u0006\bè\u0001\u0010\u0097\u0001R1\u0010ê\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bê\u0001\u0010\u0093\u0001\u001a\u0006\bë\u0001\u0010\u0095\u0001\"\u0006\bì\u0001\u0010\u0097\u0001R1\u0010î\u0001\u001a\n\u0012\u0005\u0012\u00030í\u00010\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bî\u0001\u0010\u0093\u0001\u001a\u0006\bï\u0001\u0010\u0095\u0001\"\u0006\bð\u0001\u0010\u0097\u0001R*\u0010ò\u0001\u001a\u00030ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R1\u0010ù\u0001\u001a\n\u0012\u0005\u0012\u00030ø\u00010\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bù\u0001\u0010\u0093\u0001\u001a\u0006\bú\u0001\u0010\u0095\u0001\"\u0006\bû\u0001\u0010\u0097\u0001R*\u0010ý\u0001\u001a\u00030ü\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R*\u0010\u0084\u0002\u001a\u00030\u0083\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R*\u0010\u008b\u0002\u001a\u00030\u008a\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0006\b\u008f\u0002\u0010\u0090\u0002R*\u0010\u0092\u0002\u001a\u00030\u0091\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R*\u0010\u0099\u0002\u001a\u00030\u0098\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R\u001a\u0010 \u0002\u001a\u00030\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u001a\u0010¢\u0002\u001a\u00030\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010¡\u0002R\u0018\u0010¤\u0002\u001a\u00030£\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R\u0018\u0010§\u0002\u001a\u00030¦\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R\u001c\u0010ª\u0002\u001a\u0005\u0018\u00010©\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0002\u0010«\u0002R\u001b\u0010¬\u0002\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u001c\u0010²\u0002\u001a\u0005\u0018\u00010±\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R\u001c\u0010µ\u0002\u001a\u0005\u0018\u00010´\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u001b\u0010·\u0002\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010¸\u0002R\u001c\u0010º\u0002\u001a\u0005\u0018\u00010¹\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u001c\u0010½\u0002\u001a\u0005\u0018\u00010¼\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0002\u0010¾\u0002R\u001b\u0010¿\u0002\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010¸\u0002R\u001b\u0010À\u0002\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u0019\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010Â\u0002R\u001c\u0010Ä\u0002\u001a\u0005\u0018\u00010Ã\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u001c\u0010Ç\u0002\u001a\u0005\u0018\u00010Æ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0002\u0010È\u0002R\u001c\u0010É\u0002\u001a\u0005\u0018\u00010í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R\u001a\u0010Ë\u0002\u001a\u00030\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0002\u0010¡\u0002R\u001f\u0010Í\u0002\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010Ì\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0002\u0010Î\u0002R\u001f\u0010Ï\u0002\u001a\n\u0012\u0005\u0012\u00030å\u00010Ì\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0002\u0010Î\u0002R\u001f\u0010Ñ\u0002\u001a\n\u0012\u0005\u0012\u00030Ð\u00020Ì\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0002\u0010Î\u0002R\u001f\u0010Ò\u0002\u001a\n\u0012\u0005\u0012\u00030ø\u00010Ì\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0002\u0010Î\u0002R\u0018\u0010Ô\u0002\u001a\u00030Ó\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002R\u0018\u0010Ù\u0002\u001a\u00030Ö\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b×\u0002\u0010Ø\u0002¨\u0006Þ\u0002"}, d2 = {"Lru/yandex/taxi/order/OrderFragment;", "Lru/yandex/taxi/fragment/MapFragment;", "Ljava/lang/Void;", "Le0g;", "Lihf;", "Lwi00;", "Lyz80;", "Lqt00;", "<init>", "()V", "", "onBackPressed", "()Z", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "onDetach", "onDismissingStart", "restoreProcessing", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lo2y0;", "orderHolder", "", "Lcom/yandex/go/address/models/Address;", "addresses", "", "titleResId", "Lcom/yandex/go/taxi/order/api/change/destination/RouteChangeType;", "routeChangeType", "Ljava/util/function/Consumer;", "onAddressPicked", "showDestinationPicker", "(Lo2y0;Ljava/util/List;ILcom/yandex/go/taxi/order/api/change/destination/RouteChangeType;Ljava/util/function/Consumer;)V", "onDestroyView", "onResume", "onPause", "onMapDragged", "", RemoteBioParameters.X, RemoteBioParameters.Y, "onMapTapped", "(FF)Z", "onMapReleased", "hasSettings", "stopOverlayUpdates", "openKeyboard", "showChat", "(Lo2y0;Z)V", "Luc6;", "bottomModalParams", "Lfef;", "currencyRules", "openBottomModal", "(Luc6;Lfef;)V", "Ls3j;", "detailedPriceData", "openDetailedPriceModal", "(Ls3j;Lfef;)V", "isSomethingWentWrongHidden", "isChatHidden", "Lru/yandex/taxi/widget/ModalView;", "modalView", "Ls45;", "onAppearingListener", "openModalView", "(Lru/yandex/taxi/widget/ModalView;Ls45;)V", "openOrderPaymentMethods", "(Lo2y0;)V", "Lcom/yandex/go/taxi/order/change/route/RouteChangeWarning;", "changeWarning", "openRouteChange", "(Lo2y0;Lcom/yandex/go/taxi/order/change/route/RouteChangeWarning;)V", "openCostCenter", "Lcom/yandex/go/taxi/order/analytics/DetailsOpenReason;", "openReason", "expandOrderView", "(Lo2y0;Lcom/yandex/go/taxi/order/analytics/DetailsOpenReason;)V", "Lu45;", "previousView", "currentView", "Lru/yandex/taxi/widget/modalview/ModalViewCoordinator$StackChangeType;", "changeType", "updateScreenState", "(Lu45;Lu45;Lru/yandex/taxi/widget/modalview/ModalViewCoordinator$StackChangeType;)V", "getCashbackContainerIndexInParent", "()I", "Ledj;", "contentAccessibilityDelegate", "updateAccessibility", "(Ledj;)V", "Lga80;", "viewComponent", "Lru/yandex/taxi/order/view/OrderView;", "createOrderView", "(Lo2y0;Lga80;)Lru/yandex/taxi/order/view/OrderView;", "hideDestinationPicker", "unbindViewsInFields", "isLocked", "setMapLocked", "(Z)V", "shouldShowSettings", "activeOrderViewComponent", "createBubblesOverlay", "(Lga80;)V", "", "method", "logLifecycle", "(Ljava/lang/String;)V", "Lru/yandex/taxi/order/i;", "presenter", "Lru/yandex/taxi/order/i;", "getPresenter", "()Lru/yandex/taxi/order/i;", "setPresenter", "(Lru/yandex/taxi/order/i;)V", "Ltj60;", "notificationStackHolder", "Ltj60;", "getNotificationStackHolder", "()Ltj60;", "setNotificationStackHolder", "(Ltj60;)V", "Loep0;", "screenStackNavigator", "Loep0;", "getScreenStackNavigator", "()Loep0;", "setScreenStackNavigator", "(Loep0;)V", "Lyvf0;", "Lzyx0;", "taxiOrderChatFacadeRouterProvider", "Lyvf0;", "getTaxiOrderChatFacadeRouterProvider", "()Lyvf0;", "setTaxiOrderChatFacadeRouterProvider", "(Lyvf0;)V", "Lcom/yandex/go/superapp/order/multi/old/view/c;", "orderStackViewFactory", "Lcom/yandex/go/superapp/order/multi/old/view/c;", "getOrderStackViewFactory", "()Lcom/yandex/go/superapp/order/multi/old/view/c;", "setOrderStackViewFactory", "(Lcom/yandex/go/superapp/order/multi/old/view/c;)V", "Lmhf;", "currentScreenTracker", "Lmhf;", "getCurrentScreenTracker", "()Lmhf;", "setCurrentScreenTracker", "(Lmhf;)V", "Lru/yandex/taxi/banners/c;", "bannersController", "Lru/yandex/taxi/banners/c;", "getBannersController", "()Lru/yandex/taxi/banners/c;", "setBannersController", "(Lru/yandex/taxi/banners/c;)V", "Lsw70;", "fragmentComponent", "Lsw70;", "getFragmentComponent", "()Lsw70;", "setFragmentComponent", "(Lsw70;)V", "Lcom/yandex/go/taxi/order/interactors/b;", "buttonPositionInteractor", "Lcom/yandex/go/taxi/order/interactors/b;", "getButtonPositionInteractor", "()Lcom/yandex/go/taxi/order/interactors/b;", "setButtonPositionInteractor", "(Lcom/yandex/go/taxi/order/interactors/b;)V", "Loh70;", "orderAddressPickerRouter", "Loh70;", "getOrderAddressPickerRouter", "()Loh70;", "setOrderAddressPickerRouter", "(Loh70;)V", "Lwa80;", "orderViewTopOffsetCoordinator", "Lwa80;", "getOrderViewTopOffsetCoordinator", "()Lwa80;", "setOrderViewTopOffsetCoordinator", "(Lwa80;)V", "Lfy70;", "orderInitialStateRouter", "Lfy70;", "getOrderInitialStateRouter", "()Lfy70;", "setOrderInitialStateRouter", "(Lfy70;)V", "Loc60;", "noLocationPermissionRouterFactory", "Loc60;", "getNoLocationPermissionRouterFactory", "()Loc60;", "setNoLocationPermissionRouterFactory", "(Loc60;)V", "Laju;", "hideYourAddressOnMainExperimentProvider", "Laju;", "getHideYourAddressOnMainExperimentProvider", "()Laju;", "setHideYourAddressOnMainExperimentProvider", "(Laju;)V", "Lbk4;", "badgeCoordinator", "Lbk4;", "getBadgeCoordinator", "()Lbk4;", "setBadgeCoordinator", "(Lbk4;)V", "Lfjm;", "driverProfileRouterProvider", "getDriverProfileRouterProvider", "setDriverProfileRouterProvider", "Lcom/yandex/go/promocodes/d;", "promocodesRouterProvider", "getPromocodesRouterProvider", "setPromocodesRouterProvider", "Lcom/yandex/go/taxi/order/map/curtain/a;", "orderMapCurtainPresenterProvider", "getOrderMapCurtainPresenterProvider", "setOrderMapCurtainPresenterProvider", "Lth70;", "orderAddressSearchModalViewFactory", "Lth70;", "getOrderAddressSearchModalViewFactory", "()Lth70;", "setOrderAddressSearchModalViewFactory", "(Lth70;)V", "Ld8t0;", "somethingWrongOnboardingScreenRouterProvider", "getSomethingWrongOnboardingScreenRouterProvider", "setSomethingWrongOnboardingScreenRouterProvider", "Lg6y0;", "sessionTimelineTracker", "Lg6y0;", "getSessionTimelineTracker", "()Lg6y0;", "setSessionTimelineTracker", "(Lg6y0;)V", "Lhpr0;", "sharedPinDataHolder", "Lhpr0;", "getSharedPinDataHolder", "()Lhpr0;", "setSharedPinDataHolder", "(Lhpr0;)V", "Lxi00;", "mapHost", "Lxi00;", "getMapHost", "()Lxi00;", "setMapHost", "(Lxi00;)V", "Lotg;", "debouncingMapListenerDelegate", "Lotg;", "getDebouncingMapListenerDelegate", "()Lotg;", "setDebouncingMapListenerDelegate", "(Lotg;)V", "Lcom/yandex/go/delivery/tracking/map_overlay/a;", "deliveriesMapOverlay", "Lcom/yandex/go/delivery/tracking/map_overlay/a;", "getDeliveriesMapOverlay", "()Lcom/yandex/go/delivery/tracking/map_overlay/a;", "setDeliveriesMapOverlay", "(Lcom/yandex/go/delivery/tracking/map_overlay/a;)V", "Lg18;", "updateScreenStateCoordinatorListenerCancellable", "Lg18;", "currentScreenTrackerListenerCancellable", "Lpgu;", "hiddenPinV1DataRepository", "Lpgu;", "Lqgu;", "hiddenPinV2DataRepository", "Lqgu;", "Lcom/yandex/go/superapp/order/multi/old/a;", "orderTransitionCoordinator", "Lcom/yandex/go/superapp/order/multi/old/a;", "initialOrderHolder", "Lo2y0;", "Lx980;", "orderUiCallback", "Lx980;", "Lru/yandex/taxi/order/overlay/OrderBubblesOverlay;", "bubbles", "Lru/yandex/taxi/order/overlay/OrderBubblesOverlay;", "Landroid/widget/FrameLayout;", "orderBubblesOverlayContainer", "Landroid/widget/FrameLayout;", "orderListViewContainer", "Landroid/view/View;", "Lcom/yandex/go/taxi/order/search/ui/search/SearchViews;", "searchViews", "Lcom/yandex/go/taxi/order/search/ui/search/SearchViews;", "Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView;", "orderStackView", "Lcom/yandex/go/superapp/order/multi/old/view/OrderStackView;", "cashbackContainer", "suggestedDestinationsModalView", "Lru/yandex/taxi/widget/ModalView;", "Ledj;", "Lvw70;", "orderInstanceState", "Lvw70;", "Llds;", "fragmentRouter", "Llds;", "orderMapCurtainPresenter", "Lcom/yandex/go/taxi/order/map/curtain/a;", "insetsCancellable", "Li3y;", "taxiOrderChatFacadeRouter", "Li3y;", "driverProfileRouter", "Lurf0;", "promocodesRouter", "somethingWrongOnboardingScreenRouter", "Luw70;", "orderScreenStateHandler", "Luw70;", "Lcom/yandex/go/navigation/screen/api/Screen;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "Companion", "kw70", "lw70", "jw70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderFragment extends MapFragment<Void, e0g> implements ihf, wi00, yz80, qt00 {
    public static final jw70 Companion = new jw70();
    private static final String GROUP_TAG = "TaxiOrder.Navigation";
    private static final String TAG = "OrderFragment";
    public bk4 badgeCoordinator;
    public ru.yandex.taxi.banners.c bannersController;
    private OrderBubblesOverlay bubbles;
    public com.yandex.go.taxi.order.interactors.b buttonPositionInteractor;
    private View cashbackContainer;
    private edj contentAccessibilityDelegate;
    public mhf currentScreenTracker;
    private g18 currentScreenTrackerListenerCancellable;
    public otg debouncingMapListenerDelegate;
    public com.yandex.go.delivery.tracking.map_overlay.a deliveriesMapOverlay;
    private final i3y driverProfileRouter;
    public yvf0 driverProfileRouterProvider;
    public sw70 fragmentComponent;
    private lds fragmentRouter;
    private final pgu hiddenPinV1DataRepository;
    private final qgu hiddenPinV2DataRepository;
    public aju hideYourAddressOnMainExperimentProvider;
    private o2y0 initialOrderHolder;
    private g18 insetsCancellable;
    public xi00 mapHost;
    public oc60 noLocationPermissionRouterFactory;
    public tj60 notificationStackHolder;
    public oh70 orderAddressPickerRouter;
    public th70 orderAddressSearchModalViewFactory;
    private FrameLayout orderBubblesOverlayContainer;
    public fy70 orderInitialStateRouter;
    private vw70 orderInstanceState;
    private View orderListViewContainer;
    private com.yandex.go.taxi.order.map.curtain.a orderMapCurtainPresenter;
    public yvf0 orderMapCurtainPresenterProvider;
    private final uw70 orderScreenStateHandler;
    private OrderStackView orderStackView;
    public com.yandex.go.superapp.order.multi.old.view.c orderStackViewFactory;
    private com.yandex.go.superapp.order.multi.old.a orderTransitionCoordinator;
    private x980 orderUiCallback;
    public wa80 orderViewTopOffsetCoordinator;
    public i presenter;
    private final i3y promocodesRouter;
    public yvf0 promocodesRouterProvider;
    public oep0 screenStackNavigator;
    private SearchViews searchViews;
    public g6y0 sessionTimelineTracker;
    public hpr0 sharedPinDataHolder;
    private final i3y somethingWrongOnboardingScreenRouter;
    public yvf0 somethingWrongOnboardingScreenRouterProvider;
    private ModalView suggestedDestinationsModalView;
    private final i3y taxiOrderChatFacadeRouter;
    public yvf0 taxiOrderChatFacadeRouterProvider;
    private g18 updateScreenStateCoordinatorListenerCancellable;

    public OrderFragment() {
        dai daiVar = g18.u1;
        this.updateScreenStateCoordinatorListenerCancellable = daiVar;
        this.currentScreenTrackerListenerCancellable = daiVar;
        this.hiddenPinV1DataRepository = new pgu();
        this.hiddenPinV2DataRepository = new qgu();
        this.insetsCancellable = daiVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.taxiOrderChatFacadeRouter = kotlin.a.b(lazyThreadSafetyMode, new ew70(this, 0));
        this.driverProfileRouter = kotlin.a.b(lazyThreadSafetyMode, new ew70(this, 1));
        this.promocodesRouter = kotlin.a.b(lazyThreadSafetyMode, new ew70(this, 2));
        this.somethingWrongOnboardingScreenRouter = kotlin.a.b(lazyThreadSafetyMode, new ew70(this, 3));
        this.orderScreenStateHandler = new yj70(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createBubblesOverlay(ga80 activeOrderViewComponent) {
        FrameLayout frameLayout = this.orderBubblesOverlayContainer;
        if (frameLayout == null) {
            jst.e.e("TaxiOrder.Navigation.createBubblesOverlay", TAG, new IllegalStateException("::createBubblesOverlay orderBubblesOverlayContainer is null"));
            return;
        }
        ki70 ki70Var = (ki70) ((l0g) activeOrderViewComponent).w.get();
        ki70Var.getClass();
        OrderBubblesOverlay orderBubblesOverlay = new OrderBubblesOverlay(ki70Var.d, ki70Var.a, ki70Var.b, ki70Var.c, ki70Var.e, ki70Var.f, ki70Var.g, ki70Var.h, ki70Var.i, ki70Var.j);
        this.bubbles = orderBubblesOverlay;
        frameLayout.removeAllViews();
        frameLayout.addView(orderBubblesOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderView createOrderView(o2y0 orderHolder, ga80 viewComponent) {
        return new OrderView(requireContext(), viewComponent, new ht10(this, orderHolder, false, 26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fjm driverProfileRouter$lambda$0(OrderFragment orderFragment) {
        return (fjm) orderFragment.getDriverProfileRouterProvider().get();
    }

    private final int getCashbackContainerIndexInParent() {
        return getRootView().indexOfChild(this.cashbackContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideDestinationPicker() {
        ModalView modalView = this.suggestedDestinationsModalView;
        if (modalView == null) {
            return;
        }
        modalView.dismiss();
        this.suggestedDestinationsModalView = null;
    }

    private final void logLifecycle(String method) {
        unr0.C(new Object[]{TAG, getLifecycle().b(), Integer.valueOf(hashCode()), method}, 4, "%s[%s](%x)::%s", jst.e);
    }

    public static final OrderFragment newInstance(o2y0 o2y0Var, x980 x980Var, vw70 vw70Var) {
        Companion.getClass();
        OrderFragment orderFragment = new OrderFragment();
        orderFragment.initialOrderHolder = o2y0Var;
        orderFragment.orderUiCallback = x980Var;
        orderFragment.orderInstanceState = vw70Var;
        return orderFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(OrderFragment orderFragment, Screen screen) {
        com.yandex.go.superapp.order.multi.old.a aVar = orderFragment.orderTransitionCoordinator;
        if (aVar != null) {
            qv10.B(screen == Screen.ORDERS_LIST || screen == Screen.BUNDLED_ORDER_LIST, aVar.h, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreateView$lambda$0(OrderFragment orderFragment) {
        return orderFragment.orderStackView != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(OrderFragment orderFragment, int i, View view, int i2) {
        wa80 orderViewTopOffsetCoordinator = orderFragment.getOrderViewTopOffsetCoordinator();
        int i3 = i2 + i;
        int a = orderViewTopOffsetCoordinator.a();
        orderViewTopOffsetCoordinator.a.put("cashback", Integer.valueOf(i3));
        if (orderViewTopOffsetCoordinator.a() != a) {
            int a2 = orderViewTopOffsetCoordinator.a();
            Iterator it = orderViewTopOffsetCoordinator.b.iterator();
            while (it.hasNext()) {
                ((va80) it.next()).a(a2);
            }
        }
        edj edjVar = orderFragment.contentAccessibilityDelegate;
        if (edjVar != null) {
            edjVar.sendAccessibilityEvent(view, 32);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$1$0(View view, t1w t1wVar) {
        xw31.L(t1wVar.b, view);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openModalView$lambda$0(OrderFragment orderFragment, ModalView modalView, s45 s45Var) {
        if (orderFragment.getView() != null) {
            modalView.setOnAppearingListener(s45Var);
            orderFragment.modalViewCoordinator().s(modalView, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final urf0 promocodesRouter$lambda$0(OrderFragment orderFragment) {
        return new urf0((com.yandex.go.promocodes.d) orderFragment.getPromocodesRouterProvider().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMapLocked(boolean isLocked) {
        if (isLocked) {
            ((ru.yandex.taxi.viewholder.b) getMapHost()).a(this);
        } else {
            ((ru.yandex.taxi.viewholder.b) getMapHost()).f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowSettings() {
        OrderStackView orderStackView = this.orderStackView;
        if (orderStackView == null) {
            return false;
        }
        if (orderStackView.inMultiorderState()) {
            return true;
        }
        return orderStackView.shouldShowSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChat$lambda$0(OrderFragment orderFragment, o2y0 o2y0Var, String str) {
        i presenter = orderFragment.getPresenter();
        if (str == null) {
            str = "";
        }
        ((com.yandex.go.taxi.order.chat.navigation.a) presenter.t0.get()).b(o2y0Var, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChat$lambda$1(OrderFragment orderFragment) {
        orderFragment.getMenuButtonCoordinator().b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showChat$lambda$2(OrderFragment orderFragment) {
        orderFragment.getMenuButtonCoordinator().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDestinationPicker$lambda$0(OrderFragment orderFragment, o2y0 o2y0Var, RouteChangeType routeChangeType, int i, Consumer consumer, zzs zzsVar, zzs zzsVar2) {
        i presenter = orderFragment.getPresenter();
        n080 n080Var = presenter.H0;
        if (n080Var != null) {
            n080Var.stop();
        }
        x980 x980Var = presenter.J;
        String str = o2y0Var.b().b.Q;
        f fVar = (f) x980Var;
        fVar.E((m950) fVar.A0.get(), new kh70(i, PointType.DESTINATION, str, null, routeChangeType == RouteChangeType.CHANGE_MID_POINT ? zzsVar : zzsVar2), new phm(consumer, fVar, "dest_location", 1), hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDestinationPicker$lambda$1(Consumer consumer, pv0 pv0Var) {
        consumer.accept(pv0Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d8t0 somethingWrongOnboardingScreenRouter$lambda$0(OrderFragment orderFragment) {
        return (d8t0) orderFragment.getSomethingWrongOnboardingScreenRouterProvider().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zyx0 taxiOrderChatFacadeRouter$lambda$0(OrderFragment orderFragment) {
        return (zyx0) orderFragment.getTaxiOrderChatFacadeRouterProvider().get();
    }

    private final void unbindViewsInFields() {
        this.orderTransitionCoordinator = null;
        this.bubbles = null;
        this.orderBubblesOverlayContainer = null;
        this.orderListViewContainer = null;
        this.searchViews = null;
        this.orderStackView = null;
        this.cashbackContainer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAccessibility(edj contentAccessibilityDelegate) {
        if (contentAccessibilityDelegate == null) {
            return;
        }
        OrderStackView orderStackView = this.orderStackView;
        if (orderStackView == null) {
            ny61.g("Required value was null.");
            return;
        }
        boolean z = orderStackView.getBottomSheetState() == 7 || orderStackView.getBottomSheetState() == 3;
        View view = this.orderListViewContainer;
        if (view == null) {
            return;
        }
        if (this.searchViews != null) {
            contentAccessibilityDelegate.c(view);
        } else if (!z || orderStackView.isFocusedViewInCompleteState()) {
            contentAccessibilityDelegate.c(view);
        } else {
            contentAccessibilityDelegate.d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScreenState(u45 previousView, u45 currentView, ModalViewCoordinator$StackChangeType changeType) {
        if (changeType == ModalViewCoordinator$StackChangeType.CLEAN) {
            return;
        }
        if (currentView == null) {
            vw70 vw70Var = this.orderInstanceState;
            if (vw70Var != null) {
                vw70Var.a.clear();
                return;
            } else {
                ny61.g("Required value was null.");
                return;
            }
        }
        if (changeType == ModalViewCoordinator$StackChangeType.PUSH) {
            vw70 vw70Var2 = this.orderInstanceState;
            if (vw70Var2 == null) {
                ny61.g("Required value was null.");
                return;
            } else {
                if (currentView instanceof xid) {
                    LinkedList linkedList = vw70Var2.a;
                    tw70.a.getClass();
                    linkedList.push(tw70.b);
                    return;
                }
                return;
            }
        }
        if (previousView != null) {
            vw70 vw70Var3 = this.orderInstanceState;
            if (vw70Var3 == null) {
                ny61.g("Required value was null.");
            } else if (previousView instanceof xid) {
                LinkedList linkedList2 = vw70Var3.a;
                tw70.a.getClass();
                linkedList2.remove(tw70.b);
            }
        }
    }

    public final void expandOrderView(o2y0 orderHolder, DetailsOpenReason openReason) {
        OrderStackView orderStackView = this.orderStackView;
        if (orderStackView != null) {
            orderStackView.expandFocusedView(orderHolder, openReason);
            return;
        }
        jst.e.f("TaxiOrder.Navigation.expandOrderView", TAG, "Couldn't expand orderView with reason: " + openReason.alias);
    }

    public final bk4 getBadgeCoordinator() {
        bk4 bk4Var = this.badgeCoordinator;
        if (bk4Var != null) {
            return bk4Var;
        }
        return null;
    }

    public final ru.yandex.taxi.banners.c getBannersController() {
        ru.yandex.taxi.banners.c cVar = this.bannersController;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final com.yandex.go.taxi.order.interactors.b getButtonPositionInteractor() {
        com.yandex.go.taxi.order.interactors.b bVar = this.buttonPositionInteractor;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final mhf getCurrentScreenTracker() {
        mhf mhfVar = this.currentScreenTracker;
        if (mhfVar != null) {
            return mhfVar;
        }
        return null;
    }

    public final otg getDebouncingMapListenerDelegate() {
        otg otgVar = this.debouncingMapListenerDelegate;
        if (otgVar != null) {
            return otgVar;
        }
        return null;
    }

    public final com.yandex.go.delivery.tracking.map_overlay.a getDeliveriesMapOverlay() {
        com.yandex.go.delivery.tracking.map_overlay.a aVar = this.deliveriesMapOverlay;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final yvf0 getDriverProfileRouterProvider() {
        yvf0 yvf0Var = this.driverProfileRouterProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public final sw70 getFragmentComponent() {
        sw70 sw70Var = this.fragmentComponent;
        if (sw70Var != null) {
            return sw70Var;
        }
        return null;
    }

    public final aju getHideYourAddressOnMainExperimentProvider() {
        aju ajuVar = this.hideYourAddressOnMainExperimentProvider;
        if (ajuVar != null) {
            return ajuVar;
        }
        return null;
    }

    public final xi00 getMapHost() {
        xi00 xi00Var = this.mapHost;
        if (xi00Var != null) {
            return xi00Var;
        }
        return null;
    }

    public final oc60 getNoLocationPermissionRouterFactory() {
        oc60 oc60Var = this.noLocationPermissionRouterFactory;
        if (oc60Var != null) {
            return oc60Var;
        }
        return null;
    }

    public final tj60 getNotificationStackHolder() {
        tj60 tj60Var = this.notificationStackHolder;
        if (tj60Var != null) {
            return tj60Var;
        }
        return null;
    }

    public final oh70 getOrderAddressPickerRouter() {
        oh70 oh70Var = this.orderAddressPickerRouter;
        if (oh70Var != null) {
            return oh70Var;
        }
        return null;
    }

    public final th70 getOrderAddressSearchModalViewFactory() {
        th70 th70Var = this.orderAddressSearchModalViewFactory;
        if (th70Var != null) {
            return th70Var;
        }
        return null;
    }

    public final fy70 getOrderInitialStateRouter() {
        fy70 fy70Var = this.orderInitialStateRouter;
        if (fy70Var != null) {
            return fy70Var;
        }
        return null;
    }

    public final yvf0 getOrderMapCurtainPresenterProvider() {
        yvf0 yvf0Var = this.orderMapCurtainPresenterProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public final com.yandex.go.superapp.order.multi.old.view.c getOrderStackViewFactory() {
        com.yandex.go.superapp.order.multi.old.view.c cVar = this.orderStackViewFactory;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final wa80 getOrderViewTopOffsetCoordinator() {
        wa80 wa80Var = this.orderViewTopOffsetCoordinator;
        if (wa80Var != null) {
            return wa80Var;
        }
        return null;
    }

    public final i getPresenter() {
        i iVar = this.presenter;
        if (iVar != null) {
            return iVar;
        }
        return null;
    }

    public final yvf0 getPromocodesRouterProvider() {
        yvf0 yvf0Var = this.promocodesRouterProvider;
        if (yvf0Var != null) {
            return yvf0Var;
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

    public final g6y0 getSessionTimelineTracker() {
        g6y0 g6y0Var = this.sessionTimelineTracker;
        if (g6y0Var != null) {
            return g6y0Var;
        }
        return null;
    }

    public final hpr0 getSharedPinDataHolder() {
        hpr0 hpr0Var = this.sharedPinDataHolder;
        if (hpr0Var != null) {
            return hpr0Var;
        }
        return null;
    }

    public final yvf0 getSomethingWrongOnboardingScreenRouterProvider() {
        yvf0 yvf0Var = this.somethingWrongOnboardingScreenRouterProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public final yvf0 getTaxiOrderChatFacadeRouterProvider() {
        yvf0 yvf0Var = this.taxiOrderChatFacadeRouterProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    @Override // defpackage.ihf
    /* renamed from: getTrackedScreen */
    public Screen getScreen() {
        OrderStackView orderStackView = this.orderStackView;
        if (orderStackView == null) {
            return Screen.ORDER;
        }
        int i = mw70.a[orderStackView.getScreenState().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? Screen.ORDER : Screen.ORDER_TRACKING : Screen.ORDER_DETAILS : Screen.BUNDLED_ORDER_LIST : Screen.ORDERS_LIST;
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment
    public boolean hasSettings() {
        return shouldShowSettings();
    }

    public final boolean isChatHidden() {
        return this.taxiOrderChatFacadeRouterProvider != null && ((zyx0) this.taxiOrderChatFacadeRouter.getValue()).E.d == null;
    }

    public final boolean isSomethingWentWrongHidden() {
        return (this.somethingWrongOnboardingScreenRouter.isInitialized() && gtq0.u((m950) this.somethingWrongOnboardingScreenRouter.getValue())) ? false : true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        logLifecycle("onActivityCreated");
        super.onActivityCreated(savedInstanceState);
        getDebouncingMapListenerDelegate().g = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [ru.yandex.taxi.order.g] */
    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        logLifecycle("onAttach");
        super.onAttach(context);
        this.fragmentRouter = new nw70(0, this);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        e0g injector = injector();
        zzf zzfVar = injector.b;
        c0g c0gVar = injector.c;
        e0g e0gVar = injector.d;
        x980 x980Var = this.orderUiCallback;
        if (x980Var == null) {
            ny61.g("OrderUiCallback should be set in OrderFragment instance before attach");
            return;
        }
        lw70 lw70Var = new lw70(this);
        ow70 ow70Var = new ow70(this);
        lds ldsVar = this.fragmentRouter;
        if (ldsVar == null) {
            ny61.g("Required value was null.");
            return;
        }
        setFragmentComponent(new f0g(zzfVar, c0gVar, e0gVar, x980Var, lw70Var, ow70Var, ldsVar, new pw70(this)));
        f0g f0gVar = (f0g) getFragmentComponent();
        zzf zzfVar2 = f0gVar.w;
        e0g e0gVar2 = f0gVar.y;
        c0g c0gVar2 = f0gVar.x;
        this.receiverProvider = zzfVar2.Yp;
        this.presenter = (i) f0gVar.T1.get();
        zzf zzfVar3 = c0gVar2.z;
        this.notificationStackHolder = (tj60) c0gVar2.t7.get();
        this.screenStackNavigator = (oep0) c0gVar2.T.get();
        this.taxiOrderChatFacadeRouterProvider = f0gVar.V1;
        this.orderStackViewFactory = new com.yandex.go.superapp.order.multi.old.view.c(new m0g(f0gVar.w, c0gVar2, e0gVar2, f0gVar.z));
        this.currentScreenTracker = (mhf) c0gVar2.C.get();
        this.bannersController = (ru.yandex.taxi.banners.c) c0gVar2.M8.get();
        this.fragmentComponent = f0gVar;
        this.buttonPositionInteractor = (com.yandex.go.taxi.order.interactors.b) f0gVar.C.get();
        this.orderAddressPickerRouter = new oh70((w030) e0gVar2.o.get(), new com.yandex.go.taxi.order.multi.shortcuts.f((tse) c0gVar2.B.get(), c0gVar2.s2(), c0gVar2.v8, (wiq0) zzfVar3.B2.get(), (arv0) zzfVar3.c9.get(), new ru.yandex.taxi.superapp.orders.multi.a(c0gVar2.H6(), c0gVar2.E6(), zzfVar3.A1(), zzfVar3.n()), (icv0) zzfVar3.sm.get(), (c4r0) zzfVar3.qk.get(), (dqe0) zzfVar3.s2.get(), (jc00) zzfVar3.Xa.get(), (com.yandex.go.superapp.order.multi.old.provider.g) zzfVar3.e6.get(), (kpi0) zzfVar3.Xj.get(), c0gVar2.T9, (oep0) c0gVar2.T.get()), f0gVar.a, (com.yandex.go.route.interactor.b) zzfVar2.Qb.get(), zzfVar2.A1(), new ru.yandex.taxi.search.address.view.c(new dsd(c0gVar2), new tjt0(c0gVar2), (y9y0) zzfVar2.rm.get(), (zuj0) zzfVar2.W.get(), new xk2(c0gVar2), (com.yandex.go.navigation.screen.c) zzfVar2.Bc.get(), new d8v0((ru.yandex.taxi.perf.screen.c) zzfVar3.o2.get(), (com.yandex.go.navigation.screen.c) zzfVar3.Bc.get())));
        this.orderViewTopOffsetCoordinator = (wa80) f0gVar.X1.get();
        com.yandex.go.superapp.order.multi.old.provider.g gVar = (com.yandex.go.superapp.order.multi.old.provider.g) zzfVar2.e6.get();
        cy70 cy70Var = (cy70) zzfVar2.tr.get();
        dgs dgsVar = (dgs) zzfVar2.Qa.get();
        clk0 clk0Var = new clk0((rqo) zzfVar3.C.get());
        v1p v1pVar = new v1p((com.yandex.go.superapp.orders.known.b) zzfVar2.H2.get());
        d0g d0gVar = c0gVar2.a;
        this.orderInitialStateRouter = new fy70(new com.yandex.go.superapp.order.multi.old.interactors.a(gVar, cy70Var, dgsVar, clk0Var, v1pVar, d0gVar.O(), (ps70) zzfVar2.cb.get(), (ru.yandex.taxi.widgets.domain.b) f0gVar.p2.get(), (jc00) zzfVar2.Xa.get(), (tse) c0gVar2.B.get()), (com.yandex.go.superapp.order.multi.old.view.g) f0gVar.y2.get());
        this.noLocationPermissionRouterFactory = c0gVar2.J5();
        this.hideYourAddressOnMainExperimentProvider = new aju((rqo) zzfVar2.C.get());
        this.badgeCoordinator = d0gVar.a();
        this.driverProfileRouterProvider = f0gVar.G0;
        this.promocodesRouterProvider = c0gVar2.S9;
        this.orderMapCurtainPresenterProvider = f0gVar.C2;
        g0j g0jVar = new g0j(d0gVar.b);
        zzf zzfVar4 = d0gVar.a;
        this.orderAddressSearchModalViewFactory = new p370(3, g0jVar, (y9y0) zzfVar4.rm.get(), (zuj0) zzfVar4.W.get());
        this.somethingWrongOnboardingScreenRouterProvider = d0gVar.N5;
        this.sessionTimelineTracker = (g6y0) zzfVar2.lh.get();
        this.sharedPinDataHolder = (hpr0) c0gVar2.Tb.get();
        this.mapHost = (xi00) c0gVar2.Rb.get();
        this.debouncingMapListenerDelegate = e0gVar2.d();
        this.deliveriesMapOverlay = (com.yandex.go.delivery.tracking.map_overlay.a) c0gVar2.Hg.get();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        i6y0 i6y0Var = (i6y0) getSessionTimelineTracker();
        i6y0Var.b(new z5y0(TaxiOrderSessionCheckpoint.FRAGMENT_COMPONENT_CREATED, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime));
        getPresenter().Sg(this.initialOrderHolder);
        final i presenter = getPresenter();
        kw70 kw70Var = new kw70(this);
        presenter.Bg(kw70Var);
        jst.e.getClass();
        presenter.r0.a((ike) presenter.Jg(), new tls() { // from class: ru.yandex.taxi.order.g
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                i iVar = i.this;
                ArrayList arrayList = iVar.J0;
                for (o2y0 o2y0Var : (List) obj) {
                    if (!arrayList.contains(o2y0Var)) {
                        arrayList.add(o2y0Var);
                        TaxiOrderPerfTweaksExperiment.DelayType delayType = iVar.w0.b().f;
                        int i = delayType == null ? -1 : com.yandex.go.taxi.order.perf.experiment.c.a[delayType.ordinal()];
                        iVar.F0.add(tje.N(iVar.Jg(), null, null, new OrderFragmentPresenter$renderOrderHolders$job$1(iVar, i != 1 ? i != 2 ? i != 3 ? null : TaxiOrderSessionCheckpoint.LCP : TaxiOrderSessionCheckpoint.LCP_DEFAULTS : TaxiOrderSessionCheckpoint.FCP, o2y0Var, null), 3));
                    }
                }
                return zy11.a;
            }
        }, new xw70(presenter, 1));
        tje.N(presenter.Jg(), null, null, new OrderFragmentPresenter$attachView$3(presenter, null), 3);
        presenter.G.a();
        l1t l1tVar = presenter.D;
        presenter.C0 = ((m1t) l1tVar).a.h(new zw70(0, presenter));
        if (((com.yandex.go.taxi.tariffs.internal.repository.k) presenter.Q).j().a.isEmpty()) {
            presenter.B0 = tje.N(presenter.Jg(), null, null, new OrderFragmentPresenter$subscribeToUpdateTariffsFromZone$1(presenter, null), 3);
        }
        presenter.R.a((ike) presenter.Jg());
        tje.N(presenter.Jg(), null, null, new OrderFragmentPresenter$attachView$4(presenter, null), 3);
        presenter.Z.a();
        tje.N(presenter.Jg(), null, null, new OrderFragmentPresenter$attachView$5(presenter, kw70Var, null), 3);
        getDeliveriesMapOverlay().Hg(this);
        getNotificationStackHolder().f();
        this.updateScreenStateCoordinatorListenerCancellable = modalViewCoordinator().g(new qw70(this));
        mhf currentScreenTracker = getCurrentScreenTracker();
        this.currentScreenTrackerListenerCancellable = currentScreenTracker.a.a(new iw70(0, this));
    }

    public final boolean onBackPressed() {
        if (getBannersController().o()) {
            return true;
        }
        OrderStackView orderStackView = this.orderStackView;
        return orderStackView != null && orderStackView.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        logLifecycle("onCreateView");
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(vkh0.order_fragment, container, false);
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(l8h0.order_list_view_container);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.yandex.go.superapp.order.multi.old.view.c orderStackViewFactory = getOrderStackViewFactory();
        OrderStackView.a aVar = (OrderStackView.a) ((zxf0) pwf0.d(OrderStackView.a.class, new jwf0(new ew70(this, 4), new rw70(this))));
        m0g m0gVar = orderStackViewFactory.a;
        zzf zzfVar = m0gVar.a;
        c0g c0gVar = m0gVar.b;
        e0g e0gVar = m0gVar.c;
        f0g f0gVar = m0gVar.d;
        d441 d441Var = c0gVar.Mm;
        xvf0 xvf0Var = zzfVar.n;
        o241 o241Var = c0gVar.Gm;
        jc80 jc80Var = ic80.a;
        d0g d0gVar = c0gVar.a;
        yc ycVar = new yc((xvf0) new kk(n3w.a(new zu6(new av6(d441Var, xvf0Var, o241Var, jc80Var, d0gVar.m6, f0gVar.p6))), 7), dhs0.a(new tl3(c0gVar.U, 28)), c0gVar.os, d0gVar.U5, d0gVar.w5, (xvf0) c0gVar.ps, 14);
        kkt kktVar = f0gVar.m6;
        xvf0 xvf0Var2 = e0gVar.o;
        zi60 zi60Var = new zi60(ycVar, kktVar, xvf0Var2, 27);
        xvf0 xvf0Var3 = c0gVar.U;
        y1u y1uVar = c0gVar.Xb;
        xvf0 xvf0Var4 = zzfVar.Ye;
        xvf0 xvf0Var5 = f0gVar.Z;
        xvf0 xvf0Var6 = zzfVar.n;
        g680 g680Var = new g680(xvf0Var2, (xvf0) new o4f(xvf0Var3, y1uVar, xvf0Var4, xvf0Var5, xvf0Var6, zzfVar.S3, zzfVar.Ze, zzfVar.lr, f0gVar.y6, d0gVar.V4, c0gVar.D, zzfVar.d0, zzfVar.M3, zzfVar.p3, 3), 29);
        gpx0 gpx0Var = new gpx0(xvf0Var3, (xvf0) new fat0(f0gVar.F, f0gVar.L, 24), f0gVar.E, 6, (byte) 0);
        rbx0 rbx0Var = new rbx0(zzfVar.Y, 25);
        i020 i020Var = c0gVar.ke;
        xvf0 xvf0Var7 = f0gVar.w6;
        xvf0 xvf0Var8 = zzfVar.Nl;
        xv8 xv8Var = new xv8(c0gVar.U, f0gVar.A6, c0gVar.xb, gpx0Var, new ii9(i020Var, xvf0Var7, xvf0Var8, d0gVar.r6, f0gVar.p0, d0gVar.B, c0gVar.Vm, rbx0Var, zzfVar.C8, xvf0Var6, d0gVar.c6, zzfVar.vq, zzfVar.oh, f0gVar.B1, zzfVar.Q4, f0gVar.W5), f0gVar.B6, n3w.a(new h1y0(new hwo0(xvf0Var3, f0gVar.C6, new z6x0(xvf0Var8, new rbx0(zzfVar.C, 26), d0gVar.n6, d0gVar.Q4, 4), rbx0Var, 20))), zzfVar.lh, d0gVar.s6, zzfVar.U, c0gVar.h9, n3w.a(new t3y0(new vx0(c0gVar.U, d0gVar.t6, zzfVar.Nl))), zzfVar.Pj);
        Context context = (Context) c0gVar.U.get();
        MainActivity mainActivity = c0gVar.w;
        my70 my70Var = (my70) f0gVar.Z5.get();
        zzf zzfVar2 = c0gVar.z;
        kvp0 kvp0Var = new kvp0((rqo) zzfVar2.C.get());
        wa80 wa80Var = (wa80) f0gVar.X1.get();
        NextRecenterButtonView q1 = f0gVar.q1();
        BackButtonView backButtonView = new BackButtonView((Context) c0gVar.U.get(), new com.yandex.go.taxi.order.back.a((com.yandex.go.taxi.order.interactors.b) f0gVar.C.get(), (com.yandex.go.taxi.order.view.l) f0gVar.B.get(), c0gVar.D5(), f0gVar.c, (jc00) zzfVar.Xa.get()));
        OrderMapCurtainHideFloatingButtonView r1 = f0gVar.r1();
        ed80 ed80Var = (ed80) f0gVar.A.get();
        ps70 ps70Var = (ps70) zzfVar.cb.get();
        zzf zzfVar3 = f0gVar.w;
        OrderViewContainer orderViewContainer = new OrderViewContainer(mainActivity, my70Var, aVar, kvp0Var, wa80Var, q1, backButtonView, r1, ed80Var, ps70Var, new h080((zuj0) zzfVar3.W.get()), (oz70) f0gVar.B2.get());
        uc80 uc80Var = (uc80) f0gVar.d6.get();
        Lifecycle lifecycle = (Lifecycle) e0gVar.u.get();
        oep0 oep0Var = (oep0) c0gVar.T.get();
        com.yandex.go.taxi.order.view.l lVar = (com.yandex.go.taxi.order.view.l) f0gVar.B.get();
        com.yandex.go.taxi.order.provider.a aVar2 = (com.yandex.go.taxi.order.provider.a) zzfVar.o4.get();
        com.yandex.go.superapp.order.multi.old.view.l lVar2 = new com.yandex.go.superapp.order.multi.old.view.l((com.yandex.go.superapp.order.multi.old.view.g) f0gVar.y2.get(), (com.yandex.go.taxi.order.provider.a) zzfVar.o4.get(), (com.yandex.go.taxi.order.view.l) f0gVar.B.get(), (jc00) zzfVar.Xa.get());
        com.yandex.go.superapp.order.multi.old.view.g gVar = (com.yandex.go.superapp.order.multi.old.view.g) f0gVar.y2.get();
        mw40 mw40Var = (mw40) zzfVar.zn.get();
        hc80 hc80Var = (hc80) f0gVar.S5.get();
        p370 p370Var = new p370(9, (bc00) zzfVar.l8.get(), new co40((pho) zzfVar.d0.get()), (ru.yandex.taxi.perf.b) zzfVar.n2.get());
        com.yandex.go.taxi.order.tariff_upgrade.domain.c cVar = new com.yandex.go.taxi.order.tariff_upgrade.domain.c(new com.yandex.go.taxi.order.tariff_upgrade.domain.l((pav) zzfVar.p3.get(), zzfVar.n(), (ru.yandex.taxi.yaplus.b) zzfVar.w6.get(), (tt2) zzfVar.n.get(), (k7x0) zzfVar.M3.get(), zzfVar.x(), new npx0(new o61((pho) zzfVar2.d0.get()))), (n20) zzfVar.o4.get(), new npx0(new o61((pho) zzfVar2.d0.get())), (tt2) zzfVar.n.get());
        m6w0 m6w0Var = (m6w0) f0gVar.x6.get();
        rut rutVar = e0gVar.y;
        f0 f0Var = (f0) zzfVar.Nl.get();
        a3v a3vVar = (a3v) c0gVar.Wb.get();
        a850 a850Var = (a850) zzfVar.C8.get();
        bt00 bt00Var = (bt00) zzfVar.Ok.get();
        dz00 y5 = c0gVar.y5();
        com.yandex.go.taxi.order.recalculation.domain.a aVar3 = (com.yandex.go.taxi.order.recalculation.domain.a) zzfVar.lr.get();
        h3y a = i5m.a(g680Var);
        pw40 pw40Var = (pw40) zzfVar.mb.get();
        x980 x980Var = f0gVar.a;
        com.yandex.go.taxi.order.multi.feed.domain.a O = d0gVar.O();
        jc00 jc00Var = (jc00) zzfVar.Xa.get();
        com.yandex.go.taxi.order.details.v2.navigation.c cVar2 = new com.yandex.go.taxi.order.details.v2.navigation.c((m) zzfVar.Wh.get(), new eck0(new tbk0((pho) zzfVar3.d0.get())), (tt2) zzfVar.n.get(), c0gVar.E5());
        mjg0 mjg0Var = (mjg0) f0gVar.p0.get();
        oa1 oa1Var = new oa1((lx4) zzfVar2.Y.get());
        zzf zzfVar4 = d0gVar.a;
        OrderStackView orderStackView = new OrderStackView(context, orderViewContainer, uc80Var, new com.yandex.go.superapp.order.multi.old.view.f(lifecycle, oep0Var, lVar, aVar2, lVar2, gVar, mw40Var, hc80Var, p370Var, cVar, m6w0Var, rutVar, f0Var, a3vVar, a850Var, bt00Var, y5, zi60Var, aVar3, a, pw40Var, x980Var, O, jc00Var, cVar2, mjg0Var, oa1Var, new com.yandex.go.inapp_calls.navigation.fullscreenintent.d(new ris((dne0) zzfVar4.d.get()), d0gVar.q6, new q((rqo) zzfVar4.C.get()), new k9j0(), (n20) zzfVar4.o4.get(), new njv((lx4) zzfVar4.Y.get(), new mjv((pho) zzfVar4.d0.get()), new npv((pho) zzfVar4.d0.get())), new o8g0(zzfVar4.a), (oep0) d0gVar.b.T.get()), (g6y0) zzfVar.lh.get(), zzfVar.n1(), (y3y0) zzfVar.oh.get()), (com.yandex.go.taxi.order.details.v2.navigation.d) f0gVar.H0.get(), i5m.a(xv8Var), aVar);
        frameLayout2.addView(orderStackView);
        this.orderStackView = orderStackView;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        ((i6y0) getSessionTimelineTracker()).b(new z5y0(TaxiOrderSessionCheckpoint.STACK_VIEW_COMPONENT_CREATED, elapsedRealtime, elapsedRealtime2));
        this.orderBubblesOverlayContainer = (FrameLayout) frameLayout.findViewById(l8h0.order_bubbles_overlay_container);
        this.cashbackContainer = frameLayout.findViewById(dfh0.top_end_corner_shift_layout);
        return frameLayout;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        logLifecycle("onDestroyView");
        super.onDestroyView();
        hideDestinationPicker();
        com.yandex.go.superapp.order.multi.old.a aVar = this.orderTransitionCoordinator;
        if (aVar != null) {
            aVar.k.b();
            ((ru.yandex.taxi.badge.b) aVar.c).c(aVar.f);
        }
        this.insetsCancellable.cancel();
        unbindViewsInFields();
        getSharedPinDataHolder().b(this.hiddenPinV1DataRepository, this.hiddenPinV2DataRepository);
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        logLifecycle("onDetach");
        super.onDetach();
        com.yandex.go.delivery.tracking.map_overlay.a deliveriesMapOverlay = getDeliveriesMapOverlay();
        LinkedHashSet linkedHashSet = deliveriesMapOverlay.w;
        if (linkedHashSet.remove(this) && linkedHashSet.isEmpty()) {
            deliveriesMapOverlay.c.Cg();
        }
        this.updateScreenStateCoordinatorListenerCancellable.cancel();
        this.currentScreenTrackerListenerCancellable.cancel();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public void onDismissingStart() {
        super.onDismissingStart();
        if (this.driverProfileRouter.isInitialized()) {
            ((fjm) this.driverProfileRouter.getValue()).i();
        }
        if (this.promocodesRouter.isInitialized()) {
            ((urf0) this.promocodesRouter.getValue()).i();
        }
        getPresenter().Cg();
        ru.yandex.taxi.badge.b bVar = (ru.yandex.taxi.badge.b) getBadgeCoordinator();
        kn4 kn4Var = bVar.e;
        if (kn4Var != null) {
            kn4Var.b();
        }
        bVar.d.b();
    }

    @Override // defpackage.qt00
    public /* bridge */ void onMapCollapsed() {
    }

    @Override // defpackage.qt00
    public void onMapDragged() {
        i presenter = getPresenter();
        presenter.F.a(false);
        ((ww70) presenter.Dg()).Me();
    }

    @Override // defpackage.qt00
    public /* bridge */ void onMapExpanded() {
    }

    @Override // defpackage.qt00
    public /* bridge */ void onMapPressed() {
    }

    @Override // defpackage.qt00
    public void onMapReleased() {
        i presenter = getPresenter();
        presenter.F.a(false);
        ((ww70) presenter.Dg()).I7();
    }

    @Override // defpackage.qt00
    public boolean onMapTapped(float x, float y) {
        i presenter = getPresenter();
        o2y0 o2y0Var = presenter.y0;
        if (o2y0Var == null) {
            return false;
        }
        ci70 ci70Var = presenter.A;
        String str = o2y0Var.b().a;
        kf00 kf00Var = ci70Var.u;
        kf00Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        kf00Var.a.a("Map.DidTapMapView", hashMap, 1, new HashMap());
        return false;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        logLifecycle("onPause");
        super.onPause();
        getDebouncingMapListenerDelegate().c();
        com.yandex.go.superapp.order.multi.old.a aVar = this.orderTransitionCoordinator;
        if (aVar == null) {
            ny61.g("Required value was null.");
            return;
        }
        aVar.k.b();
        setMapLocked(false);
        com.yandex.go.taxi.order.map.curtain.a aVar2 = this.orderMapCurtainPresenter;
        if (aVar2 != null) {
            aVar2.pause();
        }
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        logLifecycle("onResume");
        super.onResume();
        getDebouncingMapListenerDelegate().a(this);
        com.yandex.go.superapp.order.multi.old.a aVar = this.orderTransitionCoordinator;
        if (aVar == null) {
            ny61.g("Required value was null.");
            return;
        }
        aVar.a();
        com.yandex.go.taxi.order.map.curtain.a aVar2 = this.orderMapCurtainPresenter;
        if (aVar2 != null) {
            aVar2.resume();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0185, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d8  */
    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        TaxiOrderPresentationType taxiOrderPresentationType;
        Object gvvVar;
        o2y0 a;
        logLifecycle("onViewCreated");
        super.onViewCreated(view, savedInstanceState);
        int i = l8h0.order_list_view_container;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.orderListViewContainer = (View) rp31.d(view, i);
        this.searchViews = (SearchViews) ((View) rp31.d(view, p8h0.search_animation_view_container));
        int i2 = edj.x;
        ViewGroup viewGroup = (ViewGroup) view;
        List singletonList = Collections.singletonList(Integer.valueOf(dfh0.top_end_corner_shift_layout));
        Object tag = viewGroup.getTag(ndh0.dialog_container_accessibility_delegate);
        Object obj = null;
        edj edjVar = tag instanceof edj ? (edj) tag : null;
        if (edjVar == null) {
            edjVar = new edj(viewGroup, singletonList);
            viewGroup.setTag(ndh0.dialog_container_accessibility_delegate, edjVar);
        }
        this.contentAccessibilityDelegate = edjVar;
        if (!tje.J(requireContext())) {
            com.yandex.go.taxi.order.map.curtain.a aVar = (com.yandex.go.taxi.order.map.curtain.a) getOrderMapCurtainPresenterProvider().get();
            this.orderMapCurtainPresenter = aVar;
            aVar.Kg(new tz70((ViewStub) ((View) rp31.d(view, l8h0.order_status_map_curtain_view_stub))));
        }
        FrameLayout frameLayout = (FrameLayout) getRootView();
        lds ldsVar = this.fragmentRouter;
        if (ldsVar == null) {
            ny61.g("Required value was null.");
            return;
        }
        this.orderTransitionCoordinator = new com.yandex.go.superapp.order.multi.old.a(frameLayout, ldsVar, getCashbackContainerIndexInParent(), ((f0g) getFragmentComponent()).c(), getMenuButtonCoordinator(), getBadgeCoordinator(), getButtonPositionInteractor(), getHideYourAddressOnMainExperimentProvider());
        final int u = tje.u(12, requireContext());
        ((ru.yandex.taxi.badge.b) getBadgeCoordinator()).b((ViewGroup) ((View) rp31.d(view, dfh0.btn_cashback)), null, new nn4() { // from class: hw70
            @Override // defpackage.nn4
            public final void a(int i3) {
                OrderFragment.onViewCreated$lambda$0(OrderFragment.this, u, view, i3);
            }
        });
        fy70 orderInitialStateRouter = getOrderInitialStateRouter();
        o2y0 o2y0Var = this.initialOrderHolder;
        com.yandex.go.superapp.order.multi.old.interactors.a aVar2 = orderInitialStateRouter.a;
        wl40 a2 = aVar2.a.a();
        boolean z = false;
        if (o2y0Var == null || (((aVar2.d.d() || !o2y0Var.b().l.Y) && !aVar2.d.g()) || (a = aVar2.a(a2)) == null || !jl40.l(o2y0Var.b().a, a.b().a))) {
            ic00 ic00Var = ((kc00) aVar2.i).a;
            ic00Var.getClass();
            if (!(ic00Var instanceof hc00) && (!aVar2.d.d() || aVar2.d.g())) {
                if (o2y0Var != null) {
                    boolean g = aVar2.d.d() ? aVar2.d.g() : o2y0Var.b().l.Y;
                    com.yandex.go.taxi.order.multi.feed.domain.a aVar3 = aVar2.f;
                    String str = o2y0Var.b().a;
                    String d = o2y0Var.d();
                    boolean z2 = o2y0Var.b().b.g0;
                    clk0 clk0Var = aVar3.c;
                    taxiOrderPresentationType = g ? TaxiOrderPresentationType.DETAILS : clk0Var.d() ? clk0Var.g() ? TaxiOrderPresentationType.DETAILS : TaxiOrderPresentationType.TRACKING : aVar3.a.b(d) ? TaxiOrderPresentationType.TRACKING : TaxiOrderPresentationType.DETAILS;
                }
                taxiOrderPresentationType = TaxiOrderPresentationType.DETAILS;
                if (aVar2.d.d() || (((qs70) aVar2.g).a().b && !taxiOrderPresentationType.a())) {
                    o2y0 a3 = aVar2.a(a2);
                    if ((aVar2.d.g() || (!aVar2.d.d() && ((qs70) aVar2.g).a().c)) && a3 != null) {
                        obj = new hvv(a3);
                    } else if (!aVar2.b.a) {
                        bm40 a4 = aVar2.h.a(a2);
                        if (a4.j() == 1) {
                            ArrayList arrayList = a4.a;
                            if (a4.c.isEmpty()) {
                                List<KnownOrder> list = (List) ((hk20) aVar2.e.a.a.a.getValue()).c();
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    for (KnownOrder knownOrder : list) {
                                        if (v1p.b.contains(knownOrder.b)) {
                                            String str2 = knownOrder.c;
                                            if (str2 != null) {
                                                for (EatsOrderStatus eatsOrderStatus : EatsOrderStatus.a()) {
                                                    if (str2.equalsIgnoreCase("order." + eatsOrderStatus.getId())) {
                                                        break;
                                                    }
                                                }
                                            }
                                            eatsOrderStatus = null;
                                            if (eatsOrderStatus != null ? eatsOrderStatus.getIsActive() : false) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (arrayList.isEmpty() || !((qs70) aVar2.g).a().e.contains(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                                ArrayList arrayList2 = a4.b;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (next instanceof nly) {
                                        arrayList3.add(next);
                                    }
                                }
                                sly slyVar = (sly) kotlin.collections.a.R(arrayList3);
                                if ((slyVar instanceof nly) && ((qs70) aVar2.g).a().e.contains("linked")) {
                                    gvvVar = new gvv(((nly) slyVar).a.c.a);
                                }
                            } else {
                                gvvVar = new hvv((o2y0) kotlin.collections.a.P(arrayList));
                            }
                            if (gvvVar != null) {
                                aVar2.b.a = true;
                            }
                            if (o2y0Var != null || !o2y0Var.b().l.y || !o2y0Var.b().l.A) {
                                obj = gvvVar;
                            }
                        }
                        gvvVar = null;
                        if (gvvVar != null) {
                        }
                        if (o2y0Var != null) {
                        }
                        obj = gvvVar;
                    }
                }
            }
        } else {
            obj = new hvv(a);
        }
        if (obj != null) {
            if (obj instanceof hvv) {
                hvv hvvVar = (hvv) obj;
                if (hvvVar.a.c() == DriveState.COMPLETE && !hvvVar.a.b().l.A) {
                    z = true;
                }
                orderInitialStateRouter.b.e(hvvVar.a, z, DetailsOpenReason.INITIAL_STATE);
            } else {
                if (!(obj instanceof gvv)) {
                    w511.b();
                    return;
                }
                orderInitialStateRouter.b.e.h(OrderScreen.LINKED_ORDER_DETAILS, false, new qa80(((gvv) obj).a), DetailsOpenReason.INITIAL_STATE, Boolean.FALSE);
            }
        }
        View view2 = this.cashbackContainer;
        if (view2 != null) {
            this.insetsCancellable = tje.i(view2, 48, new w29(view2, 8));
        }
        getSharedPinDataHolder().a(this.hiddenPinV1DataRepository, this.hiddenPinV2DataRepository);
    }

    public final void openBottomModal(uc6 bottomModalParams, fef currencyRules) {
        i presenter = getPresenter();
        ((pep0) presenter.i0).f((m950) presenter.m0.get(), kotlin.a.a(new b700(15, presenter, bottomModalParams, currencyRules)), hxx.a);
    }

    public final void openCostCenter(o2y0 orderHolder) {
        Object obj;
        gxe gxeVar = (gxe) getPresenter().l0.get();
        Context context = gxeVar.d;
        zuj0 zuj0Var = gxeVar.e;
        w030 w030Var = gxeVar.c;
        String str = orderHolder.b().q().b;
        ListBuilder h = ((com.yandex.go.payments.paymentlist.data.c) gxeVar.a).h();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = h.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                break;
            }
            Object next = qqyVar.next();
            if (next instanceof jve) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((jve) obj).a, str)) {
                    break;
                }
            }
        }
        jve jveVar = (jve) obj;
        if (jveVar == null) {
            xby.l(jst.e, "CostCenterRideRouter", null, null, "costCenter couldn't be opened, corpAccount is null", 6);
            return;
        }
        List list = jveVar.e;
        OriginalRequest originalRequest = orderHolder.b().V().f;
        CostCenterRideStatus g = originalRequest != null ? originalRequest.getG() : null;
        if (g == null) {
            xby.l(jst.e, "CostCenterRideRouter", null, null, "costCenter couldn't be opened, costCenterRideStatus is null", 6);
            return;
        }
        List h2 = orderHolder.b().h();
        if (h2 == null) {
            xby.l(jst.e, "CostCenterRideRouter", null, null, "costCenter couldn't be opened, costCenterValues is null", 6);
            return;
        }
        fxe fxeVar = new fxe(jveVar, h2);
        gwe gweVar = gxeVar.b;
        sxe sxeVar = new sxe(orderHolder);
        bc bcVar = new bc(fxeVar, jveVar, gxeVar, orderHolder, ((avj0) zuj0Var).h(kyh0.common_done));
        gweVar.getClass();
        w030Var.getClass();
        context.getClass();
        j4n j4nVar = new j4n(gweVar, (zwe) fxeVar, jveVar, (uxe) sxeVar, w030Var, context, (hwe) bcVar);
        if (list.size() != 1) {
            w030Var.s(new CostCenterFieldsModalView(context, j4nVar.m(), g.a), true);
            return;
        }
        wwe wweVar = gxeVar.g;
        CostCenterField costCenterField = (CostCenterField) list.get(0);
        bc bcVar2 = new bc(fxeVar, jveVar, gxeVar, orderHolder, ((avj0) zuj0Var).h(kyh0.common_done));
        costCenterField.getClass();
        zxf zxfVar = new zxf(j4nVar, costCenterField, 0, bcVar2);
        wweVar.getClass();
        w030Var.s(wwe.a(context, zxfVar), true);
    }

    public final void openDetailedPriceModal(s3j detailedPriceData, fef currencyRules) {
        i presenter = getPresenter();
        ((pep0) presenter.i0).f((m950) presenter.n0.get(), new i3j(detailedPriceData, currencyRules), hxx.a);
    }

    public final void openModalView(ModalView modalView, s45 onAppearingListener) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        ud30 ud30Var = new ud30(5, this, modalView, onAppearingListener);
        if (getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (getLifecycle().b().a(state)) {
            ud30Var.run();
        } else {
            getLifecycle().a(new fcs(state, ud30Var));
        }
    }

    public final void openOrderPaymentMethods(o2y0 orderHolder) {
        expandOrderView(orderHolder, DetailsOpenReason.PAYMENT_METHODS);
        getPresenter().Jb(orderHolder);
    }

    public final void openRouteChange(o2y0 orderHolder, RouteChangeWarning changeWarning) {
        i presenter = getPresenter();
        presenter.getClass();
        if (changeWarning == RouteChangeWarning.CHANGE_DESTINATION) {
            ((f) presenter.J).b0(orderHolder, DetailsOpenReason.POINT_B);
        }
        ((pep0) presenter.i0).f(presenter.h0, new d1l0(orderHolder, changeWarning), hxx.a);
    }

    public final void restoreProcessing() {
        vw70 vw70Var = this.orderInstanceState;
        if (vw70Var == null) {
            ny61.g("Required value was null.");
            return;
        }
        uw70 uw70Var = this.orderScreenStateHandler;
        LinkedList linkedList = vw70Var.a;
        tw70.a.getClass();
        tw70 tw70Var = tw70.b;
        if (linkedList.contains(tw70Var)) {
            ((OrderFragment) ((yj70) uw70Var).a).getOrderAddressPickerRouter().b(SourcePicker.A_FROM_ORDER, PointType.SOURCE);
            linkedList.remove(tw70Var);
        }
    }

    public final void setBadgeCoordinator(bk4 bk4Var) {
        this.badgeCoordinator = bk4Var;
    }

    public final void setBannersController(ru.yandex.taxi.banners.c cVar) {
        this.bannersController = cVar;
    }

    public final void setButtonPositionInteractor(com.yandex.go.taxi.order.interactors.b bVar) {
        this.buttonPositionInteractor = bVar;
    }

    public final void setCurrentScreenTracker(mhf mhfVar) {
        this.currentScreenTracker = mhfVar;
    }

    public final void setDebouncingMapListenerDelegate(otg otgVar) {
        this.debouncingMapListenerDelegate = otgVar;
    }

    public final void setDeliveriesMapOverlay(com.yandex.go.delivery.tracking.map_overlay.a aVar) {
        this.deliveriesMapOverlay = aVar;
    }

    public final void setDriverProfileRouterProvider(yvf0 yvf0Var) {
        this.driverProfileRouterProvider = yvf0Var;
    }

    public final void setFragmentComponent(sw70 sw70Var) {
        this.fragmentComponent = sw70Var;
    }

    public final void setHideYourAddressOnMainExperimentProvider(aju ajuVar) {
        this.hideYourAddressOnMainExperimentProvider = ajuVar;
    }

    public final void setMapHost(xi00 xi00Var) {
        this.mapHost = xi00Var;
    }

    public final void setNoLocationPermissionRouterFactory(oc60 oc60Var) {
        this.noLocationPermissionRouterFactory = oc60Var;
    }

    public final void setNotificationStackHolder(tj60 tj60Var) {
        this.notificationStackHolder = tj60Var;
    }

    public final void setOrderAddressPickerRouter(oh70 oh70Var) {
        this.orderAddressPickerRouter = oh70Var;
    }

    public final void setOrderAddressSearchModalViewFactory(th70 th70Var) {
        this.orderAddressSearchModalViewFactory = th70Var;
    }

    public final void setOrderInitialStateRouter(fy70 fy70Var) {
        this.orderInitialStateRouter = fy70Var;
    }

    public final void setOrderMapCurtainPresenterProvider(yvf0 yvf0Var) {
        this.orderMapCurtainPresenterProvider = yvf0Var;
    }

    public final void setOrderStackViewFactory(com.yandex.go.superapp.order.multi.old.view.c cVar) {
        this.orderStackViewFactory = cVar;
    }

    public final void setOrderViewTopOffsetCoordinator(wa80 wa80Var) {
        this.orderViewTopOffsetCoordinator = wa80Var;
    }

    public final void setPresenter(i iVar) {
        this.presenter = iVar;
    }

    public final void setPromocodesRouterProvider(yvf0 yvf0Var) {
        this.promocodesRouterProvider = yvf0Var;
    }

    public final void setScreenStackNavigator(oep0 oep0Var) {
        this.screenStackNavigator = oep0Var;
    }

    public final void setSessionTimelineTracker(g6y0 g6y0Var) {
        this.sessionTimelineTracker = g6y0Var;
    }

    public final void setSharedPinDataHolder(hpr0 hpr0Var) {
        this.sharedPinDataHolder = hpr0Var;
    }

    public final void setSomethingWrongOnboardingScreenRouterProvider(yvf0 yvf0Var) {
        this.somethingWrongOnboardingScreenRouterProvider = yvf0Var;
    }

    public final void setTaxiOrderChatFacadeRouterProvider(yvf0 yvf0Var) {
        this.taxiOrderChatFacadeRouterProvider = yvf0Var;
    }

    public final void showChat(o2y0 orderHolder, boolean openKeyboard) {
        if (orderHolder.b().V().R) {
            if (this.taxiOrderChatFacadeRouterProvider == null) {
                hst hstVar = jst.e;
                hstVar.m(GROUP_TAG).v(TAG, new IllegalStateException("Show chat called before fragment attach!"));
            } else if (((zyx0) this.taxiOrderChatFacadeRouter.getValue()).E.d == null) {
                ((pep0) getScreenStackNavigator()).f(new y4c0((zyx0) this.taxiOrderChatFacadeRouter.getValue(), new h2r(22, this, orderHolder), new fw70(this, 0), new fw70(this, 1), 18), new yyx0(orderHolder, openKeyboard), hxx.a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showDestinationPicker(o2y0 orderHolder, List<? extends Address> addresses, int titleResId, RouteChangeType routeChangeType, Consumer<Address> onAddressPicked) {
        int f;
        RouteChangeType routeChangeType2;
        Address address;
        String str;
        AddressDTO address2;
        th70 orderAddressSearchModalViewFactory = getOrderAddressSearchModalViewFactory();
        Object rh70Var = routeChangeType == RouteChangeType.CHANGE_DESTINATION ? new rh70(scc.f(addresses)) : addresses.size() == 2 ? qh70.a : new rh70(scc.f(addresses) - 1);
        gw70 gw70Var = new gw70(this, orderHolder, routeChangeType, titleResId, onAddressPicked);
        p370 p370Var = (p370) orderAddressSearchModalViewFactory;
        p370Var.getClass();
        boolean z = rh70Var instanceof rh70;
        AddressSearchModalView addressSearchModalView = null;
        if (z) {
            f = ((rh70) rh70Var).a;
        } else {
            if (!(rh70Var instanceof qh70)) {
                w511.b();
                addressSearchModalView.setOnAddressPickedListener(new x71(9, onAddressPicked));
                this.suggestedDestinationsModalView = addressSearchModalView;
                openModalView(addressSearchModalView, new ou4(8, addressSearchModalView, this));
            }
            f = scc.f(addresses) - 1;
        }
        Integer valueOf = Integer.valueOf(f);
        if (f < 0 || f >= addresses.size()) {
            valueOf = null;
        }
        if (valueOf != null) {
            if (valueOf.intValue() != scc.f(addresses)) {
                routeChangeType2 = RouteChangeType.CHANGE_MID_POINT;
                zzs B = (valueOf == null && addresses.size() > 2 && routeChangeType2 == RouteChangeType.CHANGE_MID_POINT) ? addresses.get(valueOf.intValue()).B() : null;
                int i = uh70.a[routeChangeType2.ordinal()] != 1 ? kyh0.address_route_point_title : kyh0.search_destination_address_hint;
                int i2 = l1l0.a[routeChangeType2.ordinal()];
                RoutePointType routePointType = (i2 != 1 || i2 == 2 || i2 == 3 || i2 == 4) ? RoutePointType.POINT_MID : RoutePointType.POINT_B;
                e0j e0jVar = e0j.a;
                wyf a = ((g0j) p370Var.b).a(valueOf != null ? new h0j(e0jVar, "TaxiOnTheWay", true) : new h0j(e0jVar, valueOf.intValue(), "TaxiOnTheWay", true), new ddf(11, new rwp0(routePointType, false)), new r51(SourcePicker.NONE, DecideLaterConfig.a, null), m3o.b, (y9y0) p370Var.c);
                address = valueOf == null ? (Address) kotlin.collections.a.S(valueOf.intValue(), addresses) : null;
                if (address != null || (address2 = address.getAddress()) == null || (str = address2.f) == null || !z) {
                    str = null;
                }
                Address address3 = (Address) kotlin.collections.a.b0(addresses);
                zzs B2 = address3 != null ? address3.B() : null;
                p51 p51Var = AddressSearchModalView.Companion;
                AddressSearchView.Companion.getClass();
                b61 b61Var = new b61(a);
                if (str != null) {
                    b61Var.l.oh(str);
                }
                b61Var.n = ((avj0) ((zuj0) p370Var.w)).h(i);
                b61Var.p = false;
                b61Var.q = new t26(15, B2, gw70Var, B);
                p51Var.getClass();
                addressSearchModalView = p51.a(b61Var);
                addressSearchModalView.setOnAddressPickedListener(new x71(9, onAddressPicked));
                this.suggestedDestinationsModalView = addressSearchModalView;
                openModalView(addressSearchModalView, new ou4(8, addressSearchModalView, this));
            }
        }
        routeChangeType2 = RouteChangeType.CHANGE_DESTINATION;
        if (valueOf == null) {
        }
        if (uh70.a[routeChangeType2.ordinal()] != 1) {
        }
        int i22 = l1l0.a[routeChangeType2.ordinal()];
        if (i22 != 1) {
        }
        e0j e0jVar2 = e0j.a;
        wyf a2 = ((g0j) p370Var.b).a(valueOf != null ? new h0j(e0jVar2, "TaxiOnTheWay", true) : new h0j(e0jVar2, valueOf.intValue(), "TaxiOnTheWay", true), new ddf(11, new rwp0(routePointType, false)), new r51(SourcePicker.NONE, DecideLaterConfig.a, null), m3o.b, (y9y0) p370Var.c);
        if (valueOf == null) {
        }
        if (address != null) {
        }
        str = null;
        Address address32 = (Address) kotlin.collections.a.b0(addresses);
        if (address32 != null) {
        }
        p51 p51Var2 = AddressSearchModalView.Companion;
        AddressSearchView.Companion.getClass();
        b61 b61Var2 = new b61(a2);
        if (str != null) {
        }
        b61Var2.n = ((avj0) ((zuj0) p370Var.w)).h(i);
        b61Var2.p = false;
        b61Var2.q = new t26(15, B2, gw70Var, B);
        p51Var2.getClass();
        addressSearchModalView = p51.a(b61Var2);
        addressSearchModalView.setOnAddressPickedListener(new x71(9, onAddressPicked));
        this.suggestedDestinationsModalView = addressSearchModalView;
        openModalView(addressSearchModalView, new ou4(8, addressSearchModalView, this));
    }

    public final void stopOverlayUpdates() {
        n080 n080Var;
        if (this.presenter == null || (n080Var = getPresenter().H0) == null) {
            return;
        }
        n080Var.stop();
    }
}
