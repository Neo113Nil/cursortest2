package ru.yandex.taxi.fragment.preorder;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import com.yandex.go.parks.nearest.data.models.NotSupportedAddressException;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.SizeChangedListener;
import defpackage.a3v;
import defpackage.a41;
import defpackage.a71;
import defpackage.a9y0;
import defpackage.ab20;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.avj0;
import defpackage.ay0;
import defpackage.b1c0;
import defpackage.b64;
import defpackage.bdc;
import defpackage.boj0;
import defpackage.bu0;
import defpackage.by0;
import defpackage.c7p;
import defpackage.c9y0;
import defpackage.cma1;
import defpackage.cy0;
import defpackage.czo0;
import defpackage.d4;
import defpackage.d6z;
import defpackage.ddf;
import defpackage.dy0;
import defpackage.e8y0;
import defpackage.eg3;
import defpackage.ey0;
import defpackage.f7r;
import defpackage.fu00;
import defpackage.fy0;
import defpackage.g18;
import defpackage.g191;
import defpackage.g6;
import defpackage.g7r;
import defpackage.g8e;
import defpackage.gh00;
import defpackage.gvz0;
import defpackage.h55;
import defpackage.h56;
import defpackage.hbm;
import defpackage.hbp0;
import defpackage.hnb0;
import defpackage.hpr0;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.i7r;
import defpackage.i8y0;
import defpackage.iy0;
import defpackage.j0;
import defpackage.jcs;
import defpackage.jl40;
import defpackage.jo0;
import defpackage.jqr;
import defpackage.jst;
import defpackage.jx0;
import defpackage.kr0;
import defpackage.kx0;
import defpackage.kyh0;
import defpackage.l110;
import defpackage.l56;
import defpackage.l8x;
import defpackage.lx4;
import defpackage.m110;
import defpackage.m950;
import defpackage.mo21;
import defpackage.mob0;
import defpackage.mse;
import defpackage.mx0;
import defpackage.nx0;
import defpackage.ny61;
import defpackage.oce0;
import defpackage.oep0;
import defpackage.otg;
import defpackage.ox0;
import defpackage.p2c0;
import defpackage.pav;
import defpackage.pce0;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.po21;
import defpackage.pp0;
import defpackage.pv0;
import defpackage.px0;
import defpackage.pzt0;
import defpackage.q330;
import defpackage.q5z;
import defpackage.qce0;
import defpackage.qke;
import defpackage.qq60;
import defpackage.qr31;
import defpackage.qt00;
import defpackage.quz;
import defpackage.qx0;
import defpackage.r0c0;
import defpackage.r31;
import defpackage.rs0;
import defpackage.rx0;
import defpackage.s0c0;
import defpackage.s31;
import defpackage.s6v;
import defpackage.s8o;
import defpackage.sce0;
import defpackage.si00;
import defpackage.sls;
import defpackage.sx0;
import defpackage.t31;
import defpackage.tb1;
import defpackage.tb90;
import defpackage.tf;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.tx0;
import defpackage.u31;
import defpackage.u90;
import defpackage.uce0;
import defpackage.udh0;
import defpackage.umb0;
import defpackage.uva;
import defpackage.ux0;
import defpackage.uyj;
import defpackage.v31;
import defpackage.v7j0;
import defpackage.vms;
import defpackage.vng;
import defpackage.vtb0;
import defpackage.vx0;
import defpackage.w511;
import defpackage.w6r;
import defpackage.wpb0;
import defpackage.wwo;
import defpackage.wx0;
import defpackage.x31;
import defpackage.x46;
import defpackage.xby;
import defpackage.xi00;
import defpackage.xng0;
import defpackage.xvf0;
import defpackage.xx0;
import defpackage.xx70;
import defpackage.y31;
import defpackage.y50;
import defpackage.ya20;
import defpackage.ydp;
import defpackage.ymb0;
import defpackage.ypb0;
import defpackage.yph0;
import defpackage.ysd0;
import defpackage.yvf0;
import defpackage.yx0;
import defpackage.z2e;
import defpackage.z31;
import defpackage.z81;
import defpackage.za20;
import defpackage.zi;
import defpackage.zuj0;
import defpackage.zx0;
import defpackage.zy11;
import defpackage.zyg0;
import defpackage.zzs;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;
import ru.yandex.taxi.preorder.source.pickup.PickupPointAnalytics$PointType;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.statebar.data.LocationErrorReason;
import ru.yandex.taxi.ui.PassMoveTouchListener;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

@Metadata(d1 = {"\u0000þ\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 ð\u0004*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0003oñ\u0004B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH$¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0014¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\u001bH\u0014¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u001bH\u0014¢\u0006\u0004\b%\u0010\u001dJ+\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0014¢\u0006\u0004\b2\u0010\nJ\u000f\u00103\u001a\u00020\u001bH\u0014¢\u0006\u0004\b3\u0010\u001dJ\u000f\u00104\u001a\u00020\u001bH\u0014¢\u0006\u0004\b4\u0010\u001dJ\u000f\u00105\u001a\u00020\rH\u0016¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\rH\u0014¢\u0006\u0004\b6\u0010\nJ\u000f\u00108\u001a\u000207H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0004¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\r2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001d\u0010D\u001a\u00020\r2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u001b¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u001bH\u0014¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001bH\u0014¢\u0006\u0004\bI\u0010\u001dJ\u000f\u0010J\u001a\u00020\u0013H\u0005¢\u0006\u0004\bJ\u0010\u0015J!\u0010O\u001a\u00020\r2\u0006\u0010L\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010MH\u0014¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\rH\u0016¢\u0006\u0004\bQ\u0010\nJ\u0017\u0010Q\u001a\u00020\r2\u0006\u0010R\u001a\u00020\u000bH\u0004¢\u0006\u0004\bQ\u0010\u000fJ\u0017\u0010S\u001a\u00020\r2\u0006\u0010R\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010\u000fJ\u000f\u0010T\u001a\u00020\rH\u0016¢\u0006\u0004\bT\u0010\nJ\u000f\u0010U\u001a\u00020\rH\u0016¢\u0006\u0004\bU\u0010\nJ\u000f\u0010V\u001a\u00020\rH\u0016¢\u0006\u0004\bV\u0010\nJ\u000f\u0010W\u001a\u00020\rH\u0016¢\u0006\u0004\bW\u0010\nJ\u000f\u0010X\u001a\u00020\rH\u0016¢\u0006\u0004\bX\u0010\nJ\u000f\u0010Y\u001a\u00020\rH\u0016¢\u0006\u0004\bY\u0010\nJ\u000f\u0010Z\u001a\u00020\rH\u0014¢\u0006\u0004\bZ\u0010\nJ\u000f\u0010[\u001a\u00020\rH\u0014¢\u0006\u0004\b[\u0010\nJ!\u0010]\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010,2\u0006\u0010\\\u001a\u00020\u001bH\u0004¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\rH\u0016¢\u0006\u0004\b_\u0010\nJ\u000f\u0010`\u001a\u00020\rH\u0016¢\u0006\u0004\b`\u0010\nJ\u000f\u0010a\u001a\u00020\rH\u0014¢\u0006\u0004\ba\u0010\nJ\u0017\u0010c\u001a\u00020b2\u0006\u0010L\u001a\u00020KH\u0014¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u001bH\u0014¢\u0006\u0004\be\u0010\u001dJ\u000f\u0010f\u001a\u00020\u001bH\u0014¢\u0006\u0004\bf\u0010\u001dJ\u000f\u0010g\u001a\u00020\u001bH\u0014¢\u0006\u0004\bg\u0010\u001dJ\u000f\u0010h\u001a\u00020\u001bH\u0014¢\u0006\u0004\bh\u0010\u001dJ\u001f\u0010l\u001a\u00020\u001b2\u0006\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020iH\u0016¢\u0006\u0004\bl\u0010mJ!\u0010l\u001a\u00020\u001b2\b\u0010n\u001a\u0004\u0018\u00010\u00172\u0006\u0010p\u001a\u00020oH\u0014¢\u0006\u0004\bl\u0010qJ#\u0010s\u001a\u00020\r2\u0006\u0010n\u001a\u00020\u00172\n\b\u0002\u0010r\u001a\u0004\u0018\u00010bH\u0004¢\u0006\u0004\bs\u0010tJ\u0019\u0010u\u001a\u00020\r2\b\u0010R\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bu\u0010\u000fJ\u000f\u0010v\u001a\u00020\u001bH\u0014¢\u0006\u0004\bv\u0010\u001dJ\u000f\u0010w\u001a\u00020\u001bH\u0014¢\u0006\u0004\bw\u0010\u001dJ\u000f\u0010y\u001a\u00020xH\u0014¢\u0006\u0004\by\u0010zJ\u000f\u0010|\u001a\u00020{H$¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\r2\b\u0010R\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b~\u0010\u000fJ\u001b\u0010\u0081\u0001\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0004¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0083\u0001\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0014¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u001c\u0010\u0085\u0001\u001a\u00020\r2\b\u0010\u0080\u0001\u001a\u00030\u0084\u0001H\u0004¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0019\u0010\u0087\u0001\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\u001bH\u0004¢\u0006\u0005\b\u0087\u0001\u0010HJ\u001b\u0010\u0089\u0001\u001a\u00020\r2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00020\u001bH\u0014¢\u0006\u0005\b\u008b\u0001\u0010\u001dJ\u0011\u0010\u008c\u0001\u001a\u00020\u001bH\u0014¢\u0006\u0005\b\u008c\u0001\u0010\u001dJ\u0014\u0010\u008d\u0001\u001a\u0004\u0018\u00010bH\u0014¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020 H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\"J\u000f\u0010u\u001a\u00020\rH\u0002¢\u0006\u0004\bu\u0010\nJ\u001c\u0010\u0092\u0001\u001a\u00020\r2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b\u0094\u0001\u0010\nJ\u0013\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u000f\u0010G\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010\nJ\u001b\u0010\u0099\u0001\u001a\u00020\r2\u0007\u0010\u0098\u0001\u001a\u00020AH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\r2\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b\u009f\u0001\u0010\nJ\u0019\u0010 \u0001\u001a\u00020\r2\u0006\u0010R\u001a\u00020\u000bH\u0002¢\u0006\u0005\b \u0001\u0010\u000fJ\u0011\u0010¡\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b¡\u0001\u0010\nJ\u0019\u0010¢\u0001\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0005\b¢\u0001\u0010\u001aJ\u0011\u0010£\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b£\u0001\u0010\nJ\u0019\u0010¤\u0001\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0005\b¤\u0001\u0010\u000fJ\u0011\u0010¥\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b¥\u0001\u0010\nJ\u001e\u0010¦\u0001\u001a\u00020\r2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0006\b¦\u0001\u0010\u008a\u0001J\u001b\u0010§\u0001\u001a\u00020\r2\b\u0010R\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0005\b§\u0001\u0010\u000fJ'\u0010§\u0001\u001a\u00020\r2\b\u0010R\u001a\u0004\u0018\u00010\u000b2\b\u0010©\u0001\u001a\u00030¨\u0001H\u0082@¢\u0006\u0006\b§\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b«\u0001\u0010\nJ\u0011\u0010¬\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b¬\u0001\u0010\nJ\u0011\u0010\u00ad\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b\u00ad\u0001\u0010\nJ\u0018\u0010®\u0001\u001a\u00020\u001b*\u0004\u0018\u00010KH\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0011\u0010°\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b°\u0001\u0010\nJ\u001b\u0010²\u0001\u001a\u00020\r2\u0007\u0010±\u0001\u001a\u00020bH\u0002¢\u0006\u0006\b²\u0001\u0010\u008a\u0001J\u001b\u0010³\u0001\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b³\u0001\u0010\u0082\u0001J\u001b\u0010´\u0001\u001a\u00020\r2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b´\u0001\u0010\u0082\u0001J\u001c\u0010¶\u0001\u001a\u00020\r2\b\u0010\u0080\u0001\u001a\u00030µ\u0001H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J.\u0010»\u0001\u001a\u00020\r2\u0007\u0010\u0098\u0001\u001a\u00020A2\u0007\u0010¸\u0001\u001a\u00020b2\b\u0010º\u0001\u001a\u00030¹\u0001H\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0011\u0010½\u0001\u001a\u00020\rH\u0002¢\u0006\u0005\b½\u0001\u0010\nR(\u0010R\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bR\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0005\bÁ\u0001\u0010\u000fR\u001a\u0010Ã\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R*\u0010Å\u0001\u001a\u0004\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\bÅ\u0001\u0010¾\u0001\u001a\u0006\bÆ\u0001\u0010À\u0001\"\u0005\bÇ\u0001\u0010\u000fR\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010È\u0001R.\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010É\u0001\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R'\u0010Î\u0001\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0005\bÎ\u0001\u0010\u001d\"\u0005\bÐ\u0001\u0010HR'\u0010Ñ\u0001\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\bÑ\u0001\u0010Ï\u0001\u001a\u0005\bÒ\u0001\u0010\u001d\"\u0005\bÓ\u0001\u0010HR'\u0010Ô\u0001\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\bÔ\u0001\u0010Ï\u0001\u001a\u0005\bÕ\u0001\u0010\u001d\"\u0005\bÖ\u0001\u0010HR'\u0010×\u0001\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0016\n\u0006\b×\u0001\u0010Ï\u0001\u001a\u0005\bØ\u0001\u0010\u001d\"\u0005\bÙ\u0001\u0010HR*\u0010Û\u0001\u001a\u00030Ú\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R,\u0010â\u0001\u001a\u0005\u0018\u00010á\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R,\u0010è\u0001\u001a\u0005\u0018\u00010á\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010ã\u0001\u001a\u0006\bé\u0001\u0010å\u0001\"\u0006\bê\u0001\u0010ç\u0001R,\u0010ì\u0001\u001a\u0005\u0018\u00010ë\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R,\u0010ó\u0001\u001a\u0005\u0018\u00010ò\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R8\u0010ú\u0001\u001a\u0005\u0018\u00010ù\u00012\n\u0010É\u0001\u001a\u0005\u0018\u00010ù\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R\u001c\u0010\u0080\u0002\u001a\u0005\u0018\u00010ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010û\u0001R\u001e\u0010\u0082\u0002\u001a\t\u0012\u0004\u0012\u00020\r0\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R+\u0010\u0084\u0002\u001a\u0004\u0018\u00010,8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0018\u0010\u008b\u0002\u001a\u00030\u008a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0018\u0010\u008e\u0002\u001a\u00030\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0090\u0002\u001a\u00030\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u008f\u0002R!\u0010\u0095\u0002\u001a\u00030\u008d\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u001c\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u0096\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R*\u0010\u009a\u0002\u001a\u00030\u0099\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0002\u0010\u009b\u0002\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002\"\u0006\b\u009e\u0002\u0010\u009f\u0002R*\u0010¡\u0002\u001a\u00030 \u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b¡\u0002\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R*\u0010¨\u0002\u001a\u00030§\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b¨\u0002\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010\u00ad\u0002R*\u0010¯\u0002\u001a\u00030®\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002R*\u0010¶\u0002\u001a\u00030µ\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b¶\u0002\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R1\u0010¾\u0002\u001a\n\u0012\u0005\u0012\u00030½\u00020¼\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b¾\u0002\u0010¿\u0002\u001a\u0006\bÀ\u0002\u0010Á\u0002\"\u0006\bÂ\u0002\u0010Ã\u0002R*\u0010Å\u0002\u001a\u00030Ä\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÅ\u0002\u0010Æ\u0002\u001a\u0006\bÇ\u0002\u0010È\u0002\"\u0006\bÉ\u0002\u0010Ê\u0002R*\u0010Ì\u0002\u001a\u00030Ë\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÌ\u0002\u0010Í\u0002\u001a\u0006\bÎ\u0002\u0010Ï\u0002\"\u0006\bÐ\u0002\u0010Ñ\u0002R*\u0010Ó\u0002\u001a\u00030Ò\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÓ\u0002\u0010Ô\u0002\u001a\u0006\bÕ\u0002\u0010Ö\u0002\"\u0006\b×\u0002\u0010Ø\u0002R*\u0010Ú\u0002\u001a\u00030Ù\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÚ\u0002\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002\"\u0006\bÞ\u0002\u0010ß\u0002R*\u0010á\u0002\u001a\u00030à\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bá\u0002\u0010â\u0002\u001a\u0006\bã\u0002\u0010ä\u0002\"\u0006\bå\u0002\u0010æ\u0002R*\u0010è\u0002\u001a\u00030ç\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bè\u0002\u0010é\u0002\u001a\u0006\bê\u0002\u0010ë\u0002\"\u0006\bì\u0002\u0010í\u0002R*\u0010ï\u0002\u001a\u00030î\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bï\u0002\u0010ð\u0002\u001a\u0006\bñ\u0002\u0010ò\u0002\"\u0006\bó\u0002\u0010ô\u0002R*\u0010ö\u0002\u001a\u00030õ\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bö\u0002\u0010÷\u0002\u001a\u0006\bø\u0002\u0010ù\u0002\"\u0006\bú\u0002\u0010û\u0002R*\u0010ý\u0002\u001a\u00030ü\u00028\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bý\u0002\u0010þ\u0002\u001a\u0006\bÿ\u0002\u0010\u0080\u0003\"\u0006\b\u0081\u0003\u0010\u0082\u0003R*\u0010\u0084\u0003\u001a\u00030\u0083\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0003\u0010\u0085\u0003\u001a\u0006\b\u0086\u0003\u0010\u0087\u0003\"\u0006\b\u0088\u0003\u0010\u0089\u0003R*\u0010\u008b\u0003\u001a\u00030\u008a\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u008b\u0003\u0010\u008c\u0003\u001a\u0006\b\u008d\u0003\u0010\u008e\u0003\"\u0006\b\u008f\u0003\u0010\u0090\u0003R&\u0010;\u001a\u00020:8\u0006@\u0007X\u0086.¢\u0006\u0016\n\u0005\b;\u0010\u0091\u0003\u001a\u0005\b\u0092\u0003\u0010<\"\u0006\b\u0093\u0003\u0010\u0094\u0003R*\u0010\u0096\u0003\u001a\u00030\u0095\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u0096\u0003\u0010\u0097\u0003\u001a\u0006\b\u0098\u0003\u0010\u0099\u0003\"\u0006\b\u009a\u0003\u0010\u009b\u0003R*\u0010\u009d\u0003\u001a\u00030\u009c\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0003\u0010\u009e\u0003\u001a\u0006\b\u009f\u0003\u0010 \u0003\"\u0006\b¡\u0003\u0010¢\u0003R*\u0010¤\u0003\u001a\u00030£\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b¤\u0003\u0010¥\u0003\u001a\u0006\b¦\u0003\u0010§\u0003\"\u0006\b¨\u0003\u0010©\u0003R*\u0010«\u0003\u001a\u00030ª\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b«\u0003\u0010¬\u0003\u001a\u0006\b\u00ad\u0003\u0010®\u0003\"\u0006\b¯\u0003\u0010°\u0003R*\u0010²\u0003\u001a\u00030±\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b²\u0003\u0010³\u0003\u001a\u0006\b´\u0003\u0010µ\u0003\"\u0006\b¶\u0003\u0010·\u0003R*\u0010¹\u0003\u001a\u00030¸\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b¹\u0003\u0010º\u0003\u001a\u0006\b»\u0003\u0010¼\u0003\"\u0006\b½\u0003\u0010¾\u0003R*\u0010À\u0003\u001a\u00030¿\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÀ\u0003\u0010Á\u0003\u001a\u0006\bÂ\u0003\u0010Ã\u0003\"\u0006\bÄ\u0003\u0010Å\u0003R*\u0010Ç\u0003\u001a\u00030Æ\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÇ\u0003\u0010È\u0003\u001a\u0006\bÉ\u0003\u0010Ê\u0003\"\u0006\bË\u0003\u0010Ì\u0003R*\u0010Î\u0003\u001a\u00030Í\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÎ\u0003\u0010Ï\u0003\u001a\u0006\bÐ\u0003\u0010Ñ\u0003\"\u0006\bÒ\u0003\u0010Ó\u0003R*\u0010Õ\u0003\u001a\u00030Ô\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÕ\u0003\u0010Ö\u0003\u001a\u0006\b×\u0003\u0010Ø\u0003\"\u0006\bÙ\u0003\u0010Ú\u0003R*\u0010Ü\u0003\u001a\u00030Û\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÜ\u0003\u0010Ý\u0003\u001a\u0006\bÞ\u0003\u0010ß\u0003\"\u0006\bà\u0003\u0010á\u0003R*\u0010ã\u0003\u001a\u00030â\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bã\u0003\u0010ä\u0003\u001a\u0006\bå\u0003\u0010æ\u0003\"\u0006\bç\u0003\u0010è\u0003R*\u0010ê\u0003\u001a\u00030é\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bê\u0003\u0010ë\u0003\u001a\u0006\bì\u0003\u0010í\u0003\"\u0006\bî\u0003\u0010ï\u0003R*\u0010ñ\u0003\u001a\u00030ð\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bñ\u0003\u0010ò\u0003\u001a\u0006\bó\u0003\u0010ô\u0003\"\u0006\bõ\u0003\u0010ö\u0003R*\u0010ø\u0003\u001a\u00030÷\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bø\u0003\u0010ù\u0003\u001a\u0006\bú\u0003\u0010û\u0003\"\u0006\bü\u0003\u0010ý\u0003R*\u0010ÿ\u0003\u001a\u00030þ\u00038\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\bÿ\u0003\u0010\u0080\u0004\u001a\u0006\b\u0081\u0004\u0010\u0082\u0004\"\u0006\b\u0083\u0004\u0010\u0084\u0004R*\u0010\u0086\u0004\u001a\u00030\u0085\u00048\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0004\u0010\u0087\u0004\u001a\u0006\b\u0088\u0004\u0010\u0089\u0004\"\u0006\b\u008a\u0004\u0010\u008b\u0004R*\u0010\u008d\u0004\u001a\u00030\u008c\u00048\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0004\u0010\u008e\u0004\u001a\u0006\b\u008f\u0004\u0010\u0090\u0004\"\u0006\b\u0091\u0004\u0010\u0092\u0004R*\u0010\u0094\u0004\u001a\u00030\u0093\u00048\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0004\u0010\u0095\u0004\u001a\u0006\b\u0096\u0004\u0010\u0097\u0004\"\u0006\b\u0098\u0004\u0010\u0099\u0004R*\u0010\u009b\u0004\u001a\u00030\u009a\u00048\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0004\u0010\u009c\u0004\u001a\u0006\b\u009d\u0004\u0010\u009e\u0004\"\u0006\b\u009f\u0004\u0010 \u0004R \u0010¢\u0004\u001a\u00030¡\u00048\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b¢\u0004\u0010£\u0004\u001a\u0006\b¤\u0004\u0010¥\u0004R!\u0010ª\u0004\u001a\u00030¦\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0004\u0010\u0092\u0002\u001a\u0006\b¨\u0004\u0010©\u0004R!\u0010¯\u0004\u001a\u00030«\u00048DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0004\u0010\u0092\u0002\u001a\u0006\b\u00ad\u0004\u0010®\u0004R*\u0010±\u0004\u001a\u00030°\u00048\u0006@\u0007X\u0086.¢\u0006\u0018\n\u0006\b±\u0004\u0010²\u0004\u001a\u0006\b³\u0004\u0010´\u0004\"\u0006\bµ\u0004\u0010¶\u0004R\u001d\u0010¸\u0004\u001a\u00030·\u00048\u0006¢\u0006\u0010\n\u0006\b¸\u0004\u0010¹\u0004\u001a\u0006\bº\u0004\u0010»\u0004R\u001d\u0010½\u0004\u001a\u00030¼\u00048\u0006¢\u0006\u0010\n\u0006\b½\u0004\u0010¾\u0004\u001a\u0006\b¿\u0004\u0010À\u0004R!\u0010Å\u0004\u001a\u00030Á\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0004\u0010\u0092\u0002\u001a\u0006\bÃ\u0004\u0010Ä\u0004R!\u0010Ê\u0004\u001a\u00030Æ\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0004\u0010\u0092\u0002\u001a\u0006\bÈ\u0004\u0010É\u0004R!\u0010Ï\u0004\u001a\u00030Ë\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÌ\u0004\u0010\u0092\u0002\u001a\u0006\bÍ\u0004\u0010Î\u0004R!\u0010Ò\u0004\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÐ\u0004\u0010\u0092\u0002\u001a\u0006\bÑ\u0004\u0010\u0097\u0001R\u001f\u0010Õ\u0004\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bÓ\u0004\u0010\u0092\u0002\u001a\u0005\bÔ\u0004\u00109R!\u0010Ú\u0004\u001a\u00030Ö\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b×\u0004\u0010\u0092\u0002\u001a\u0006\bØ\u0004\u0010Ù\u0004R\u001c\u0010Û\u0004\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0004\u0010Ü\u0004R\u0018\u0010Þ\u0004\u001a\u00030Ý\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0004\u0010ß\u0004R\u001c\u0010á\u0004\u001a\u0005\u0018\u00010à\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0004\u0010â\u0004R\u0018\u0010ä\u0004\u001a\u00030ã\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0004\u0010å\u0004R?\u0010ç\u0004\u001a\u0018\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\r0\u0081\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010æ\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bç\u0004\u0010è\u0004\u001a\u0006\bé\u0004\u0010ê\u0004\"\u0006\bë\u0004\u0010ì\u0004R\u001a\u0010î\u0004\u001a\u00030í\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0004\u0010ï\u0004¨\u0006ò\u0004"}, d2 = {"Lru/yandex/taxi/fragment/preorder/AddressMapFragment;", "Lsi00;", "L", "Ljcs;", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/fragment/MapFragment;", "Lqt00;", "Liy0;", "Lwwo;", "<init>", "()V", "Lpv0;", "info", "Lzy11;", "setInitialAddress", "(Lpv0;)V", "Lru/yandex/taxi/search/address/view/PointType;", "addressPointType", "()Lru/yandex/taxi/search/address/view/PointType;", "", "getLayoutId", "()I", "setSourceAddress", "Lzzs;", IssuingDistributionPointExtension.POINT, "updateInitialPoint", "(Lzzs;)V", "", "hasPickupPointsOnMap", "()Z", "getPickupPointAnchoredDrawableResId", "()Ljava/lang/Integer;", "Lru/yandex/taxi/preorder/source/pickup/PickupPointAnalytics$PointType;", "getPickupPointType", "()Lru/yandex/taxi/preorder/source/pickup/PickupPointAnalytics$PointType;", "shouldShowStateBarMessage", "shouldCacheAddressByLocationTap", "needUpdatePositionOnResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindViewsInFields", "isShowTopEndButtons", "isShowBlockedZoneBeforeUpdate", "onDestroyView", "unbindViewsInFields", "Lb1c0;", "setupPinV2DataRepository", "()Lb1c0;", "Ls6v;", "idleIconRepository", "()Ls6v;", "La41;", "uiState", "renderUiState", "(La41;)V", "Lmo21;", "userLocation", "isRelevant", "onPositionMapToCurrentLocation", "(Lmo21;Z)V", "requestLocation", "onLocationClick", "(Z)V", "isShowPanoramaButton", "getAddressLeadImageDrawable", "Lcom/yandex/go/address/models/Address;", "address", "Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;", "responseForAddress", "onUnsupportedTaxiAddress", "(Lcom/yandex/go/address/models/Address;Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;)V", "addressConfirmed", "addressInfo", "addressPicked", "onStart", "onStop", "onResume", "onPause", "onCameraMoveFromUserGestureFinished", "onMapExpanded", "hideControls", "showControls", "isVisible", "updateViewVisibility", "(Landroid/view/View;Z)V", "onMapPressed", "onMapDragged", "requestFocusRect", "", "getAddressTitle", "(Lcom/yandex/go/address/models/Address;)Ljava/lang/String;", "isClarifyMode", "reactOnUnsupportedAddress", "shouldDrawPickupPoints", "canHandlePoiTap", "", RemoteBioParameters.X, RemoteBioParameters.Y, "onMapTapped", "(FF)Z", "geoPoint", "Lqx0;", "callback", "(Lzzs;Lqx0;)Z", "action", "moveToPoint", "(Lzzs;Ljava/lang/String;)V", "onAddressChanged", "blockedZonesEnabled", "blockedZonesAlertsEnabled", "Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "pointType", "()Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "Ll56;", "blockedZonesHandler", "()Ll56;", "changeAddressInfo", "Lc7p;", ClidProvider.STATE, "changeBackButtonState", "(Lc7p;)V", "changeAutoLocateButtonState", "Lz2e;", "changeConfirmButtonState", "(Lz2e;)V", "changePickupFromPhotoButtonVisibility", "orderPrice", "setOrderPrice", "(Ljava/lang/String;)V", "isControlVisible", "isBackButtonVisible", "forcedCurrentMode", "()Ljava/lang/String;", "requirePickupPointType", "Lpex0;", "tariffDescription", "applyOrderPrice", "(Lpex0;)V", "initSourceAddress", "La71;", "setupPinV1DataRepository", "()La71;", "location", "onNewCurrentUserLocation", "(Lmo21;)V", "", Constants.KEY_EXCEPTION, "onNearestPositionError", "(Ljava/lang/Throwable;)V", "saveButtonClicked", "updateAddressPoint", "resetAddressPoint", "setPositionNoAnimationTo", "reportPinDropToEmptyGeoPointError", "processPickupPoints", "invalidatePickupPoints", "cameraAnimationFinished", "createPanoramaButtonIfNeed", "Lru/yandex/taxi/panorama/d;", "experiment", "(Lpv0;Lru/yandex/taxi/panorama/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFragmentContent", "updateUiVisibility", "hideControlElements", "isNeedShowPanorama", "(Lcom/yandex/go/address/models/Address;)Z", "showControlElements", "content", "setAddressText", "changeMenuButtonState", "changePanoramaButtonState", "Lq330;", "changeModalViewState", "(Lq330;)V", "pickAction", "Lru/yandex/taxi/persuggest/api/finalsuggest/PositionInitAction;", "positionInitAction", "onNewLocation", "(Lmo21;Ljava/lang/String;Lru/yandex/taxi/persuggest/api/finalsuggest/PositionInitAction;)V", "setupPickupPoints", "Lpv0;", "getAddressInfo", "()Lpv0;", "setAddressInfo", "", "lastAddressUpdate", "J", "addressSource", "getAddressSource", "setAddressSource", "Ljava/lang/String;", "value", "initialPoint", "Lzzs;", "getInitialPoint", "()Lzzs;", "isNeedControlViews", "Z", "setNeedControlViews", "defaultModalViewAllowed", "getDefaultModalViewAllowed", "setDefaultModalViewAllowed", "pickupFromPhotoAllowed", "getPickupFromPhotoAllowed", "setPickupFromPhotoAllowed", "showRoute", "getShowRoute", "setShowRoute", "Lcom/yandex/go/destination_picker/ChooseAddressMode;", "chooseAddressMode", "Lcom/yandex/go/destination_picker/ChooseAddressMode;", "getChooseAddressMode", "()Lcom/yandex/go/destination_picker/ChooseAddressMode;", "setChooseAddressMode", "(Lcom/yandex/go/destination_picker/ChooseAddressMode;)V", "Lru/yandex/taxi/design/AddressInputComponent;", "addressInitialPointComponent", "Lru/yandex/taxi/design/AddressInputComponent;", "getAddressInitialPointComponent", "()Lru/yandex/taxi/design/AddressInputComponent;", "setAddressInitialPointComponent", "(Lru/yandex/taxi/design/AddressInputComponent;)V", "addressTextSourceComponent", "getAddressTextSourceComponent", "setAddressTextSourceComponent", "Lru/yandex/taxi/design/ButtonComponent;", "confirm", "Lru/yandex/taxi/design/ButtonComponent;", "getConfirm", "()Lru/yandex/taxi/design/ButtonComponent;", "setConfirm", "(Lru/yandex/taxi/design/ButtonComponent;)V", "Lcom/yandex/go/design/view/GoImageButton;", "saveAddress", "Lcom/yandex/go/design/view/GoImageButton;", "getSaveAddress", "()Lcom/yandex/go/design/view/GoImageButton;", "setSaveAddress", "(Lcom/yandex/go/design/view/GoImageButton;)V", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "autoLocation", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "getAutoLocation", "()Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "setAutoLocation", "(Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;)V", "panoramaButton", "Lkotlin/Function0;", "massTransitPoiMovePinCallback", "Lsls;", "bottomButtonsLayout", "Landroid/view/View;", "getBottomButtonsLayout", "()Landroid/view/View;", "setBottomButtonsLayout", "(Landroid/view/View;)V", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lhbp0;", "decodePointScopeDelegate", "Lhbp0;", "orderPriceScopeDelegate", "panoramaScopeDelegate$delegate", "Li3y;", "getPanoramaScopeDelegate", "()Lhbp0;", "panoramaScopeDelegate", "Ll8x;", "showEntryPointJob", "Ll8x;", "Lcom/yandex/go/pin/api/a;", "pin", "Lcom/yandex/go/pin/api/a;", "getPin", "()Lcom/yandex/go/pin/api/a;", "setPin", "(Lcom/yandex/go/pin/api/a;)V", "Llx4;", "analyticsManager", "Llx4;", "getAnalyticsManager", "()Llx4;", "setAnalyticsManager", "(Llx4;)V", "Lpo21;", "userLocationInteractor", "Lpo21;", "getUserLocationInteractor", "()Lpo21;", "setUserLocationInteractor", "(Lpo21;)V", "Lah00;", "mapController", "Lah00;", "getMapController", "()Lah00;", "setMapController", "(Lah00;)V", "Ly50;", "activityRouter", "Ly50;", "getActivityRouter", "()Ly50;", "setActivityRouter", "(Ly50;)V", "Lyvf0;", "Luce0;", "positionAlertRouterFactory", "Lyvf0;", "getPositionAlertRouterFactory", "()Lyvf0;", "setPositionAlertRouterFactory", "(Lyvf0;)V", "Lfu00;", "zoomRepository", "Lfu00;", "getZoomRepository", "()Lfu00;", "setZoomRepository", "(Lfu00;)V", "Lqq60;", "observerForCurrentTariff", "Lqq60;", "getObserverForCurrentTariff", "()Lqq60;", "setObserverForCurrentTariff", "(Lqq60;)V", "Lt31;", "pickupPointsControllerFactory", "Lt31;", "getPickupPointsControllerFactory", "()Lt31;", "setPickupPointsControllerFactory", "(Lt31;)V", "Ltt2;", "appDispatchers", "Ltt2;", "getAppDispatchers", "()Ltt2;", "setAppDispatchers", "(Ltt2;)V", "Ls0c0;", "pinStyleProvider", "Ls0c0;", "getPinStyleProvider", "()Ls0c0;", "setPinStyleProvider", "(Ls0c0;)V", "Latd0;", "pointAddressDecoder", "Latd0;", "getPointAddressDecoder", "()Latd0;", "setPointAddressDecoder", "(Latd0;)V", "La3v;", "focusCoordinator", "La3v;", "getFocusCoordinator", "()La3v;", "setFocusCoordinator", "(La3v;)V", "Lya20;", "metricaActionInteractor", "Lya20;", "getMetricaActionInteractor", "()Lya20;", "setMetricaActionInteractor", "(Lya20;)V", "Lab20;", "metricaActionStateHolder", "Lab20;", "getMetricaActionStateHolder", "()Lab20;", "setMetricaActionStateHolder", "(Lab20;)V", "Lv7j0;", "requestPermissionInteractor", "Lv7j0;", "getRequestPermissionInteractor", "()Lv7j0;", "setRequestPermissionInteractor", "(Lv7j0;)V", "Lvtb0;", "pinAlertAnimationInteractor", "Lvtb0;", "getPinAlertAnimationInteractor", "()Lvtb0;", "setPinAlertAnimationInteractor", "(Lvtb0;)V", "Ls6v;", "getIdleIconRepository", "setIdleIconRepository", "(Ls6v;)V", "Lr0c0;", "pinStyleMapper", "Lr0c0;", "getPinStyleMapper", "()Lr0c0;", "setPinStyleMapper", "(Lr0c0;)V", "Lkr0;", "addressClarificationInteractor", "Lkr0;", "getAddressClarificationInteractor", "()Lkr0;", "setAddressClarificationInteractor", "(Lkr0;)V", "Ll110;", "massTransitStopsInteractor", "Ll110;", "getMassTransitStopsInteractor", "()Ll110;", "setMassTransitStopsInteractor", "(Ll110;)V", "Lzuj0;", "resourcesProxy", "Lzuj0;", "getResourcesProxy", "()Lzuj0;", "setResourcesProxy", "(Lzuj0;)V", "Lru/yandex/taxi/panorama/l;", "taxiPanoramaInteractor", "Lru/yandex/taxi/panorama/l;", "getTaxiPanoramaInteractor", "()Lru/yandex/taxi/panorama/l;", "setTaxiPanoramaInteractor", "(Lru/yandex/taxi/panorama/l;)V", "Li8y0;", "taxiPanoramaLogger", "Li8y0;", "getTaxiPanoramaLogger", "()Li8y0;", "setTaxiPanoramaLogger", "(Li8y0;)V", "Le8y0;", "taxiPanoramaExperimentRepository", "Le8y0;", "getTaxiPanoramaExperimentRepository", "()Le8y0;", "setTaxiPanoramaExperimentRepository", "(Le8y0;)V", "Lw6r;", "finalSuggestScreenRepository", "Lw6r;", "getFinalSuggestScreenRepository", "()Lw6r;", "setFinalSuggestScreenRepository", "(Lw6r;)V", "Lc9y0;", "taxiPanoramaTooltipRepository", "Lc9y0;", "getTaxiPanoramaTooltipRepository", "()Lc9y0;", "setTaxiPanoramaTooltipRepository", "(Lc9y0;)V", "La9y0;", "taxiPanoramaRouter", "La9y0;", "getTaxiPanoramaRouter", "()La9y0;", "setTaxiPanoramaRouter", "(La9y0;)V", "Loep0;", "screenStackNavigator", "Loep0;", "getScreenStackNavigator", "()Loep0;", "setScreenStackNavigator", "(Loep0;)V", "Lhpr0;", "sharedPinDataHolder", "Lhpr0;", "getSharedPinDataHolder", "()Lhpr0;", "setSharedPinDataHolder", "(Lhpr0;)V", "Lxi00;", "mapHost", "Lxi00;", "getMapHost", "()Lxi00;", "setMapHost", "(Lxi00;)V", "Ldy0;", "addressMapInteractor", "Ldy0;", "getAddressMapInteractor", "()Ldy0;", "setAddressMapInteractor", "(Ldy0;)V", "Lp2c0;", "pinWithStanExperimentRepository", "Lp2c0;", "getPinWithStanExperimentRepository", "()Lp2c0;", "setPinWithStanExperimentRepository", "(Lp2c0;)V", "Lotg;", "debouncingMapListenerDelegate", "Lotg;", "getDebouncingMapListenerDelegate", "()Lotg;", "setDebouncingMapListenerDelegate", "(Lotg;)V", "Lay0;", "blockedZoneControllerFactory", "Lay0;", "getBlockedZoneControllerFactory", "()Lay0;", "setBlockedZoneControllerFactory", "(Lay0;)V", "Ltx0;", "addressMapFragmentAddressControllerFactory", "Ltx0;", "getAddressMapFragmentAddressControllerFactory", "()Ltx0;", "setAddressMapFragmentAddressControllerFactory", "(Ltx0;)V", "Lysd0;", "pointActionRouterConsumer", "Lysd0;", "getPointActionRouterConsumer", "()Lysd0;", "setPointActionRouterConsumer", "(Lysd0;)V", "Lf7r;", "finalizeAddressByGravityRouterFactory", "Lf7r;", "getFinalizeAddressByGravityRouterFactory", "()Lf7r;", "setFinalizeAddressByGravityRouterFactory", "(Lf7r;)V", "Lru/yandex/taxi/address/repository/AddressResolveRepository;", "addressResolveRepository", "Lru/yandex/taxi/address/repository/AddressResolveRepository;", "getAddressResolveRepository", "()Lru/yandex/taxi/address/repository/AddressResolveRepository;", "Lru/yandex/taxi/fragment/preorder/e;", "addressMapFragmentAddressController$delegate", "getAddressMapFragmentAddressController", "()Lru/yandex/taxi/fragment/preorder/e;", "addressMapFragmentAddressController", "Ls31;", "pickupPointsController$delegate", "getPickupPointsController", "()Ls31;", "pickupPointsController", "Lx31;", "addressMapPresenterFactory", "Lx31;", "getAddressMapPresenterFactory", "()Lx31;", "setAddressMapPresenterFactory", "(Lx31;)V", "Lyx0;", "addressMapFragmentBlockedZoneControllerCallback", "Lyx0;", "getAddressMapFragmentBlockedZoneControllerCallback", "()Lyx0;", "Lzx0;", "addressMapFragmentBlockedZoneControllerConfig", "Lzx0;", "getAddressMapFragmentBlockedZoneControllerConfig", "()Lzx0;", "Lxx0;", "addressMapFragmentBlockedZoneController$delegate", "getAddressMapFragmentBlockedZoneController", "()Lxx0;", "addressMapFragmentBlockedZoneController", "Lru/yandex/taxi/address/c;", "presenter$delegate", "getPresenter", "()Lru/yandex/taxi/address/c;", "presenter", "Lg7r;", "finalizeAddressByGravityRouter$delegate", "getFinalizeAddressByGravityRouter", "()Lg7r;", "finalizeAddressByGravityRouter", "pinV1DataRepository$delegate", "getPinV1DataRepository", "pinV1DataRepository", "pinV2DataRepository$delegate", "getPinV2DataRepository", "pinV2DataRepository", "Ley0;", "networkListener$delegate", "getNetworkListener", "()Ley0;", "networkListener", "initialPointSetStacktrace", "Ljava/lang/Throwable;", "Lgvz0;", "tooltipPlacementRepository", "Lgvz0;", "Lqr31;", "viewGroupTooltipContainer", "Lqr31;", "Lcom/yandex/mapkit/map/SizeChangedListener;", "sizeChangedListener", "Lcom/yandex/mapkit/map/SizeChangedListener;", "Lkotlin/Function1;", "myLocationTriggerInitializer", "Ltls;", "getMyLocationTriggerInitializer", "()Ltls;", "setMyLocationTriggerInitializer", "(Ltls;)V", "Lg18;", "focusChangeListenerCancellable", "Lg18;", "Companion", "px0", "map_fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AddressMapFragment<L extends si00, I extends jcs> extends MapFragment<L, I> implements qt00, iy0, wwo {
    public static final px0 Companion = new px0();
    private static final int LOCATION_TTL_MS = 900000;
    protected static final long MAP_TRANSLATION_DURATION_SHORT = 300;
    public y50 activityRouter;
    public kr0 addressClarificationInteractor;
    private pv0 addressInfo;
    private AddressInputComponent addressInitialPointComponent;

    /* renamed from: addressMapFragmentAddressController$delegate, reason: from kotlin metadata */
    private final i3y addressMapFragmentAddressController;
    public tx0 addressMapFragmentAddressControllerFactory;
    private final yx0 addressMapFragmentBlockedZoneControllerCallback;
    public dy0 addressMapInteractor;
    public x31 addressMapPresenterFactory;
    private pv0 addressSource;
    private AddressInputComponent addressTextSourceComponent;
    public lx4 analyticsManager;
    public tt2 appDispatchers;
    private RotatableFloatButton autoLocation;
    public ay0 blockedZoneControllerFactory;
    private View bottomButtonsLayout;
    private ButtonComponent confirm;
    public otg debouncingMapListenerDelegate;
    public w6r finalSuggestScreenRepository;

    /* renamed from: finalizeAddressByGravityRouter$delegate, reason: from kotlin metadata */
    private final i3y finalizeAddressByGravityRouter;
    public f7r finalizeAddressByGravityRouterFactory;
    private g18 focusChangeListenerCancellable;
    public a3v focusCoordinator;
    public s6v idleIconRepository;
    private zzs initialPoint;
    private Throwable initialPointSetStacktrace;
    private long lastAddressUpdate;
    private final View.OnLayoutChangeListener layoutChangeListener;
    public ah00 mapController;
    public xi00 mapHost;
    public l110 massTransitStopsInteractor;
    public ya20 metricaActionInteractor;
    public ab20 metricaActionStateHolder;
    private tls myLocationTriggerInitializer;

    /* renamed from: networkListener$delegate, reason: from kotlin metadata */
    private final i3y networkListener;
    public qq60 observerForCurrentTariff;
    private String orderPrice;
    private RotatableFloatButton panoramaButton;
    public t31 pickupPointsControllerFactory;
    public com.yandex.go.pin.api.a pin;
    public vtb0 pinAlertAnimationInteractor;
    public r0c0 pinStyleMapper;
    public s0c0 pinStyleProvider;

    /* renamed from: pinV1DataRepository$delegate, reason: from kotlin metadata */
    private final i3y pinV1DataRepository;

    /* renamed from: pinV2DataRepository$delegate, reason: from kotlin metadata */
    private final i3y pinV2DataRepository;
    public p2c0 pinWithStanExperimentRepository;
    public ysd0 pointActionRouterConsumer;
    public atd0 pointAddressDecoder;
    public yvf0 positionAlertRouterFactory;
    public v7j0 requestPermissionInteractor;
    public zuj0 resourcesProxy;
    private GoImageButton saveAddress;
    public oep0 screenStackNavigator;
    public hpr0 sharedPinDataHolder;
    private l8x showEntryPointJob;
    private boolean showRoute;
    private final SizeChangedListener sizeChangedListener;
    public e8y0 taxiPanoramaExperimentRepository;
    public l taxiPanoramaInteractor;
    public i8y0 taxiPanoramaLogger;
    public a9y0 taxiPanoramaRouter;
    public c9y0 taxiPanoramaTooltipRepository;
    private final gvz0 tooltipPlacementRepository;
    public po21 userLocationInteractor;
    private qr31 viewGroupTooltipContainer;
    public fu00 zoomRepository;
    private boolean isNeedControlViews = true;
    private boolean defaultModalViewAllowed = true;
    private boolean pickupFromPhotoAllowed = true;
    private ChooseAddressMode chooseAddressMode = ChooseAddressMode.DESTINATION;
    private final sls massTransitPoiMovePinCallback = new kx0(this, 3);
    private final hbp0 decodePointScopeDelegate = vms.h(3, null);
    private final hbp0 orderPriceScopeDelegate = vms.h(3, null);

    /* renamed from: panoramaScopeDelegate$delegate, reason: from kotlin metadata */
    private final i3y panoramaScopeDelegate = kotlin.a.a(new kx0(this, 8));
    private final AddressResolveRepository addressResolveRepository = new AddressResolveRepository();

    /* renamed from: pickupPointsController$delegate, reason: from kotlin metadata */
    private final i3y pickupPointsController = kotlin.a.a(new kx0(this, 10));
    private final zx0 addressMapFragmentBlockedZoneControllerConfig = new g191(this);

    /* renamed from: addressMapFragmentBlockedZoneController$delegate, reason: from kotlin metadata */
    private final i3y addressMapFragmentBlockedZoneController = kotlin.a.a(new kx0(this, 11));

    /* renamed from: presenter$delegate, reason: from kotlin metadata */
    private final i3y presenter = kotlin.a.a(new kx0(this, 12));

    public AddressMapFragment() {
        int i = 1;
        this.layoutChangeListener = new u90(i, this);
        int i2 = 9;
        this.addressMapFragmentAddressController = kotlin.a.a(new kx0(this, i2));
        this.addressMapFragmentBlockedZoneControllerCallback = new ddf(i2, this);
        int i3 = 0;
        this.finalizeAddressByGravityRouter = kotlin.a.a(new kx0(this, i3));
        kx0 kx0Var = new kx0(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.pinV1DataRepository = kotlin.a.b(lazyThreadSafetyMode, kx0Var);
        this.pinV2DataRepository = kotlin.a.b(lazyThreadSafetyMode, new kx0(this, 2));
        this.networkListener = kotlin.a.a(new kx0(this, 7));
        this.tooltipPlacementRepository = new gvz0();
        this.sizeChangedListener = new ox0(i3, this);
        this.focusChangeListenerCancellable = g18.u1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e addressMapFragmentAddressController_delegate$lambda$0(AddressMapFragment addressMapFragment) {
        tx0 addressMapFragmentAddressControllerFactory = addressMapFragment.getAddressMapFragmentAddressControllerFactory();
        AddressResolveRepository addressResolveRepository = addressMapFragment.addressResolveRepository;
        sx0 sx0Var = new sx0(addressMapFragment.forcedCurrentMode(), addressMapFragment.pointType(), addressMapFragment.getLifecycleScope(), addressMapFragment.isClarifyMode(), addressMapFragment.shouldCacheAddressByLocationTap(), addressMapFragment.needUpdatePositionOnResume(), addressMapFragment.getBusinessName(), addressMapFragment.decodePointScopeDelegate, addressMapFragment.reactOnUnsupportedAddress());
        rx0 rx0Var = new rx0(addressMapFragment);
        vx0 vx0Var = ((ux0) addressMapFragmentAddressControllerFactory).a;
        return new e((atd0) vx0Var.a.get(), (qq60) vx0Var.b.get(), (kr0) vx0Var.c.get(), addressResolveRepository, sx0Var, rx0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xx0 addressMapFragmentBlockedZoneController_delegate$lambda$0(AddressMapFragment addressMapFragment) {
        ay0 blockedZoneControllerFactory = addressMapFragment.getBlockedZoneControllerFactory();
        AddressResolveRepository addressResolveRepository = addressMapFragment.addressResolveRepository;
        l56 blockedZonesHandler = addressMapFragment.blockedZonesHandler();
        zx0 zx0Var = addressMapFragment.addressMapFragmentBlockedZoneControllerConfig;
        yx0 yx0Var = addressMapFragment.addressMapFragmentBlockedZoneControllerCallback;
        boj0 boj0Var = ((by0) blockedZoneControllerFactory).a;
        return new xx0((pce0) ((xvf0) boj0Var.b).get(), (fu00) ((xvf0) boj0Var.c).get(), (dy0) ((g6) boj0Var.w).get(), (xvf0) boj0Var.x, (oep0) ((xvf0) boj0Var.y).get(), (h56) ((xvf0) boj0Var.z).get(), addressResolveRepository, blockedZonesHandler, zx0Var, yx0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOrderPrice(pex0 tariffDescription) {
        this.orderPrice = tariffDescription.e();
        AddressInputComponent addressInputComponent = this.addressInitialPointComponent;
        if (addressInputComponent == null) {
            ny61.g("Required value was null.");
        } else {
            addressInputComponent.stopTrailProgressAnimation();
            updateFragmentContent();
        }
    }

    private final void cameraAnimationFinished(String action) {
        if (hasView()) {
            zzs b = ((gh00) getMapController()).e.b();
            s31 pickupPointsController = getPickupPointsController();
            int i = 0;
            wpb0 h = pickupPointsController.a.h(pickupPointsController.f, b, false);
            boolean Kg = getPickupPointsController().b.Kg();
            if (h != null && Kg) {
                b = h.b;
                ((gh00) getMapController()).D(ru.yandex.taxi.map.utils.a.F(b), Math.max(((gh00) getMapController()).j(), getZoomRepository().b), 300.0f, new mx0(i, this));
            }
            za20 za20Var = new za20(false, isClarifyMode(), Kg);
            ab20 metricaActionStateHolder = getMetricaActionStateHolder();
            synchronized (metricaActionStateHolder) {
                metricaActionStateHolder.a = za20Var;
            }
            if (action == null) {
                action = getMetricaActionInteractor().a();
            }
            getAddressMapFragmentAddressController().b(b, action, h, PositionInitAction.MAP);
        }
    }

    public static /* synthetic */ void cameraAnimationFinished$default(AddressMapFragment addressMapFragment, String str, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: cameraAnimationFinished");
            return;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        addressMapFragment.cameraAnimationFinished(str);
    }

    private final void changeMenuButtonState(c7p state) {
        getPresenter().Og(state);
    }

    private final void changeModalViewState(q330 state) {
        getPresenter().Pg(state);
    }

    private final void changePanoramaButtonState(c7p state) {
        ru.yandex.taxi.address.c presenter = getPresenter();
        r0 r0Var = presenter.K;
        if (!presenter.H) {
            return;
        }
        while (true) {
            Object value = r0Var.getValue();
            c7p c7pVar = state;
            if (r0Var.k(value, a41.a((a41) value, null, null, c7pVar, null, null, null, null, HProv.PP_PASSWD_TERM))) {
                return;
            } else {
                state = c7pVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createPanoramaButtonIfNeed(pv0 pv0Var, ru.yandex.taxi.panorama.d dVar, Continuation<? super zy11> continuation) {
        Address address;
        boolean isShowTopEndButtons = isShowTopEndButtons();
        zy11 zy11Var = zy11.a;
        if (isShowTopEndButtons && isShowPanoramaButton() && (pointType() == RoutePointType.POINT_A || pointType() == RoutePointType.POINT_B)) {
            String o = g8e.o("clarify_point_", pointType().getType());
            if (dVar.e.contains(o)) {
                tb90 panoramaData = (pv0Var == null || (address = pv0Var.a) == null) ? null : address.getPanoramaData();
                tb90 tb90Var = panoramaData != null ? panoramaData : null;
                RotatableFloatButton rotatableFloatButton = this.panoramaButton;
                int i = 0;
                if (tb90Var != null) {
                    if (rotatableFloatButton == null) {
                        this.panoramaButton = eg3.e((FloatButtonHolderLayout) nonNullViewById(udh0.float_button_holder), new zi(2), d6z.Y(dVar, dVar.d));
                        this.viewGroupTooltipContainer = new qr31((FrameLayout) nonNullViewById(udh0.modal_view_container), this.tooltipPlacementRepository);
                    }
                    return getTaxiPanoramaInteractor().c(this.panoramaButton, pointType().getType(), tb90Var, o, dVar, dVar.j, getTaxiPanoramaRouter(), getScreenStackNavigator(), new nx0(this, i), continuation);
                }
                if (rotatableFloatButton != null) {
                    rotatableFloatButton.setVisibilityAnimated(false);
                }
                qr31 qr31Var = this.viewGroupTooltipContainer;
                if (qr31Var != null) {
                    qr31Var.a();
                }
            }
        }
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPanoramaButtonIfNeed$lambda$0$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createPanoramaButtonIfNeed$lambda$1(AddressMapFragment addressMapFragment, zzs zzsVar) {
        addressMapFragment.moveToPoint(zzsVar, "manual.panorama_pickup_point");
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g7r finalizeAddressByGravityRouter_delegate$lambda$0(AddressMapFragment addressMapFragment) {
        return ((i7r) addressMapFragment.getFinalizeAddressByGravityRouterFactory()).a(addressMapFragment.addressResolveRepository);
    }

    private final e getAddressMapFragmentAddressController() {
        return (e) this.addressMapFragmentAddressController.getValue();
    }

    private final xx0 getAddressMapFragmentBlockedZoneController() {
        return (xx0) this.addressMapFragmentBlockedZoneController.getValue();
    }

    private final g7r getFinalizeAddressByGravityRouter() {
        return (g7r) this.finalizeAddressByGravityRouter.getValue();
    }

    private final ey0 getNetworkListener() {
        return (ey0) this.networkListener.getValue();
    }

    private final hbp0 getPanoramaScopeDelegate() {
        return (hbp0) this.panoramaScopeDelegate.getValue();
    }

    private final a71 getPinV1DataRepository() {
        return (a71) this.pinV1DataRepository.getValue();
    }

    private final b1c0 getPinV2DataRepository() {
        return (b1c0) this.pinV2DataRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.yandex.taxi.address.c getPresenter() {
        return (ru.yandex.taxi.address.c) this.presenter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideControlElements() {
        si00 si00Var = (si00) this.callback;
        if (si00Var != null) {
            si00Var.g();
        }
        boolean z = false;
        changeMenuButtonState(new c7p(false, 2));
        changeBackButtonState(new c7p(false, 2));
        changeAutoLocateButtonState(new c7p(false, 2));
        changePanoramaButtonState(new c7p(false, 2));
        changeConfirmButtonState(new z2e(14, z, z, z));
        changePickupFromPhotoButtonVisibility(false);
    }

    private final void initSourceAddress() {
        AddressInputComponent addressInputComponent = this.addressTextSourceComponent;
        if (addressInputComponent == null) {
            return;
        }
        if (addressInputComponent == null) {
            ny61.g("Required value was null.");
            return;
        }
        pv0 pv0Var = this.addressSource;
        if (pv0Var != null) {
            if (pv0Var == null) {
                ny61.g("Required value was null.");
                return;
            }
            if (!pv0Var.a.X1()) {
                pv0 pv0Var2 = this.addressSource;
                if (pv0Var2 == null) {
                    ny61.g("Required value was null.");
                    return;
                }
                addressInputComponent.setAddress(getAddressTitle(pv0Var2.a));
                addressInputComponent.setAddressTextColorInt(ru.yandex.taxi.design.utils.c.c(xng0.textMinor, asView()));
                addressInputComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
                addressInputComponent.setLeadImage(getAddressLeadImageDrawable());
                addressInputComponent.setVisibility(0);
                addressInputComponent.setClickable(false);
                return;
            }
        }
        addressInputComponent.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidatePickupPoints() {
        if (hasView() && hasPickupPointsOnMap()) {
            getPickupPointsController().a();
        }
    }

    private final boolean isNeedShowPanorama(Address address) {
        return (address != null ? address.getPanoramaData() : null) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 massTransitPoiMovePinCallback$lambda$0(AddressMapFragment addressMapFragment) {
        addressMapFragment.getDebouncingMapListenerDelegate().b();
        return zy11.a;
    }

    public static /* synthetic */ void moveToPoint$default(AddressMapFragment addressMapFragment, zzs zzsVar, String str, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: moveToPoint");
            return;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        addressMapFragment.moveToPoint(zzsVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 moveToPoint$lambda$0(AddressMapFragment addressMapFragment, String str) {
        addressMapFragment.invalidatePickupPoints();
        addressMapFragment.cameraAnimationFinished(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ey0 networkListener_delegate$lambda$0(AddressMapFragment addressMapFragment) {
        return new ey0(new kx0(addressMapFragment, 4), addressMapFragment.getAddressMapFragmentBlockedZoneController(), addressMapFragment.getAddressMapFragmentAddressController(), addressMapFragment.getAddressMapInteractor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onLocationClick$lambda$0(AddressMapFragment addressMapFragment, mo21 mo21Var) {
        addressMapFragment.onNewCurrentUserLocation(mo21Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onMapTapped$lambda$0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNearestPositionError(Throwable exception) {
        AddressResolveRepository.State state;
        jst.e.k(exception, "Error while getting current location");
        boolean z = true;
        boolean z2 = false;
        if (s8o.A(exception)) {
            state = AddressResolveRepository.State.ERROR;
            ey0 networkListener = getNetworkListener();
            if (!networkListener.e) {
                networkListener.e = true;
            }
            getPresenter().B.d.a(LocationErrorReason.LOCATION_MESSAGE_REASON);
            changeAutoLocateButtonState(new c7p(false, false));
            changePanoramaButtonState(new c7p(false, false));
            changePickupFromPhotoButtonVisibility(false);
        } else if (exception instanceof NotSupportedAddressException) {
            AddressResolveRepository.State state2 = AddressResolveRepository.State.UNSUPPORTED;
            NotSupportedAddressException notSupportedAddressException = (NotSupportedAddressException) exception;
            onUnsupportedTaxiAddress(notSupportedAddressException.getAddress(), notSupportedAddressException.getNearestZoneResponse());
            state = state2;
        } else {
            state = AddressResolveRepository.State.ERROR;
            f fVar = getPresenter().B;
            fVar.d.c(((avj0) fVar.e).h(kyh0.address_resolving_error), "", LocationErrorReason.LOCATION_MESSAGE_REASON, null);
            AddressInputComponent addressInputComponent = this.addressInitialPointComponent;
            if (addressInputComponent == null) {
                ny61.g("Required value was null.");
                return;
            }
            addressInputComponent.setTrailText("");
            changeConfirmButtonState(new z2e(8, z, z2, z2));
            changeAutoLocateButtonState(new c7p(true, true));
            changePickupFromPhotoButtonVisibility(true);
        }
        this.addressResolveRepository.b(state);
    }

    private final void onNewCurrentUserLocation(mo21 location) {
        zzs a = location.a();
        dy0.a(getAddressMapInteractor(), a, new j0(14, this, a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onNewCurrentUserLocation$lambda$0(AddressMapFragment addressMapFragment, zzs zzsVar) {
        addressMapFragment.invalidatePickupPoints();
        e addressMapFragmentAddressController = addressMapFragment.getAddressMapFragmentAddressController();
        sx0 sx0Var = addressMapFragmentAddressController.e;
        hbp0 hbp0Var = sx0Var.h;
        AddressMapFragment addressMapFragment2 = addressMapFragmentAddressController.f.a;
        if (addressMapFragment2.getActivity() != null && addressMapFragment2.getView() != null) {
            addressMapFragmentAddressController.d.b(AddressResolveRepository.State.LOADING);
            hbp0Var.f();
            if (jl40.l(zzsVar, zzs.f)) {
                addressMapFragment2.reportPinDropToEmptyGeoPointError();
            }
            pzt0 pzt0Var = addressMapFragmentAddressController.g;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            atd0 atd0Var = addressMapFragmentAddressController.a;
            boolean z = sx0Var.d;
            addressMapFragmentAddressController.g = tje.N(hbp0Var, null, null, new AddressMapFragmentAddressController$requestUserLocationPinDrop$$inlined$safeCollectIn$1(new d(new jqr(((ru.yandex.taxi.search.suggest.i) atd0Var).q(z, zzsVar, sx0Var.b, true, true, z ? "clarify.geo" : "geo", sx0Var.a, PositionInitAction.GEO), new AddressMapFragmentAddressController$requestUserLocationPinDrop$1(null, addressMapFragmentAddressController), 3), addressMapFragmentAddressController), null, addressMapFragmentAddressController), 3);
        }
        return zy11.a;
    }

    private final void onNewLocation(mo21 location, String pickAction, PositionInitAction positionInitAction) {
        zzs a = location.a();
        float max = Math.max(((gh00) getMapController()).j(), Math.max(getZoomRepository().b, getZoomRepository().c));
        dy0 addressMapInteractor = getAddressMapInteractor();
        ((gh00) addressMapInteractor.a).D(ru.yandex.taxi.map.utils.a.F(a), max, 500.0f, new cy0(0, addressMapInteractor, new jo0(this, a, pickAction, positionInitAction, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onNewLocation$lambda$0(AddressMapFragment addressMapFragment, zzs zzsVar, String str, PositionInitAction positionInitAction) {
        addressMapFragment.invalidatePickupPoints();
        addressMapFragment.getAddressMapFragmentAddressController().b(zzsVar, str, null, positionInitAction);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPositionMapToCurrentLocation$lambda$0(AddressMapFragment addressMapFragment, mo21 mo21Var) {
        addressMapFragment.onNewLocation(mo21Var, "auto", PositionInitAction.AUTO_LOCATION);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(AddressMapFragment addressMapFragment) {
        dy0 addressMapInteractor = addressMapFragment.getAddressMapInteractor();
        a3v focusCoordinator = addressMapFragment.getFocusCoordinator();
        gh00 gh00Var = (gh00) addressMapInteractor.a;
        if (gh00Var.a.e(focusCoordinator)) {
            gh00Var.L(gh00Var.e.b());
        }
    }

    private static final zy11 onStart$lambda$0(AddressMapFragment addressMapFragment, TaxiMapView taxiMapView) {
        taxiMapView.addSizeChangedListener(addressMapFragment.sizeChangedListener);
        return zy11.a;
    }

    private static final zy11 onStop$lambda$0(AddressMapFragment addressMapFragment, TaxiMapView taxiMapView) {
        taxiMapView.removeSizeChangedListener(addressMapFragment.sizeChangedListener);
        addressMapFragment.getFocusCoordinator().t4(addressMapFragment);
        addressMapFragment.getFocusCoordinator().a0(addressMapFragment);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hbp0 panoramaScopeDelegate_delegate$lambda$0(AddressMapFragment addressMapFragment) {
        hbp0 hbp0Var = new hbp0(new czo0(14), "AddressMapFragmentPanoramaScope", (mse) addressMapFragment.getTaxiPanoramaLogger().a.getValue());
        hbp0Var.a();
        return hbp0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s31 pickupPointsController_delegate$lambda$0(AddressMapFragment addressMapFragment) {
        t31 pickupPointsControllerFactory = addressMapFragment.getPickupPointsControllerFactory();
        AddressResolveRepository addressResolveRepository = addressMapFragment.addressResolveRepository;
        v31 v31Var = ((u31) pickupPointsControllerFactory).a;
        return new s31((ru.yandex.taxi.preorder.source.pickup.a) v31Var.a.get(), (ru.yandex.taxi.map.overlay.pickup.d) v31Var.b.get(), (ypb0) v31Var.c.get(), (tb1) v31Var.d.get(), addressResolveRepository, (ah00) v31Var.e.get(), (tt2) v31Var.f.get(), (s0c0) v31Var.g.get(), (hbm) v31Var.h.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.yandex.taxi.address.c presenter_delegate$lambda$0(AddressMapFragment addressMapFragment) {
        x31 addressMapPresenterFactory = addressMapFragment.getAddressMapPresenterFactory();
        AddressResolveRepository addressResolveRepository = addressMapFragment.addressResolveRepository;
        bu0 bu0Var = ((y31) addressMapPresenterFactory).a;
        ru.yandex.taxi.address.c cVar = new ru.yandex.taxi.address.c(addressResolveRepository, (mob0) ((xvf0) bu0Var.a).get(), (pav) ((xvf0) bu0Var.b).get(), (hnb0) ((xvf0) bu0Var.c).get(), (f) ((rs0) bu0Var.d).get(), (z31) ((pp0) bu0Var.e).get(), (xvf0) bu0Var.f, (oep0) ((xvf0) bu0Var.g).get(), (ru.yandex.taxi.favorites.address.api.experiment.a) ((xvf0) bu0Var.h).get(), (ru.yandex.taxi.favorites.address.impl.data.a) ((xvf0) bu0Var.i).get());
        cVar.Lg(addressMapFragment.addressInfo);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processPickupPoints(pv0 info) {
        if (hasPickupPointsOnMap()) {
            s31 pickupPointsController = getPickupPointsController();
            List list = info.e;
            String str = info.f;
            hbp0 hbp0Var = pickupPointsController.k;
            if (hbp0Var == null) {
                return;
            }
            ru.yandex.taxi.preorder.source.pickup.a aVar = pickupPointsController.a;
            ah00 ah00Var = pickupPointsController.f;
            aVar.getClass();
            if (!ru.yandex.taxi.preorder.source.pickup.a.b(ah00Var)) {
                pickupPointsController.b.Ig();
            }
            tje.N(hbp0Var, null, null, new AddressMapPickupPointsController$processPickupPoints$1(pickupPointsController, list, str, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportPinDropToEmptyGeoPointError() {
        IllegalStateException illegalStateException;
        Throwable th = this.initialPointSetStacktrace;
        if (th != null) {
            illegalStateException = new IllegalStateException(th);
            this.initialPointSetStacktrace = null;
        } else {
            illegalStateException = new IllegalStateException();
        }
        xby.l(jst.e, "MAP_FRAGMENT_SUSPICIOUS_REQUEST", null, illegalStateException, "request pin drop for GeoPoint.EMPTY", 2);
    }

    private final PickupPointAnalytics$PointType requirePickupPointType() {
        PickupPointAnalytics$PointType pickupPointType = getPickupPointType();
        if (pickupPointType != null) {
            return pickupPointType;
        }
        ny61.r("you have to specify pickup point type");
        return null;
    }

    private final void resetAddressPoint() {
        zzs zzsVar = this.initialPoint;
        if (zzsVar == null) {
            getPresenter().Tg();
        } else {
            setPositionNoAnimationTo(zzsVar);
            getAddressMapFragmentAddressController().b(zzsVar, "auto", null, PositionInitAction.MAP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveButtonClicked() {
        pv0 pv0Var = this.addressInfo;
        if (pv0Var != null) {
            ru.yandex.taxi.address.c presenter = getPresenter();
            presenter.getClass();
            FavoriteAddress h = z81.h(pv0Var.a, null);
            d4 d4Var = new d4(20, presenter);
            ((pep0) presenter.E).f(new xx70(presenter.D, d4Var, 1), new ydp(h, true, "search", null, 20), hxx.a);
        }
    }

    private final void setAddressText(String content) {
        if (getView() == null) {
            return;
        }
        AddressInputComponent addressInputComponent = this.addressInitialPointComponent;
        if (addressInputComponent != null) {
            addressInputComponent.setAddress(content);
        } else {
            ny61.g("Required value was null.");
        }
    }

    private final void setPositionNoAnimationTo(zzs point) {
        ((gh00) getAddressMapInteractor().a).G(point);
        invalidatePickupPoints();
    }

    private final void setupPickupPoints() {
        s31 pickupPointsController = getPickupPointsController();
        hbp0 hbp0Var = this.decodePointScopeDelegate;
        PickupPointAnalytics$PointType requirePickupPointType = requirePickupPointType();
        kx0 kx0Var = new kx0(this, 5);
        kx0 kx0Var2 = new kx0(this, 6);
        pickupPointsController.k = hbp0Var;
        pickupPointsController.n = requirePickupPointType;
        pickupPointsController.l = kx0Var;
        pickupPointsController.m = kx0Var2;
        pickupPointsController.b.resume();
        s31 pickupPointsController2 = getPickupPointsController();
        pickupPointsController2.b.A.i = new r31(new nx0(this, 3));
        Integer pickupPointAnchoredDrawableResId = getPickupPointAnchoredDrawableResId();
        if (pickupPointAnchoredDrawableResId != null) {
            int intValue = pickupPointAnchoredDrawableResId.intValue();
            s31 pickupPointsController3 = getPickupPointsController();
            String str = ((ru.yandex.taxi.styling.f) pickupPointsController3.h).b(false).a;
            hbm hbmVar = pickupPointsController3.i;
            Drawable a = hbmVar.a(str, vng.t(intValue, hbmVar.a));
            if (a != null) {
                pickupPointsController3.b.Og(a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenRect setupPickupPoints$lambda$0(AddressMapFragment addressMapFragment) {
        return addressMapFragment.getPin().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupPickupPoints$lambda$1(AddressMapFragment addressMapFragment) {
        return addressMapFragment.getDebouncingMapListenerDelegate().f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupPickupPoints$lambda$2(AddressMapFragment addressMapFragment, wpb0 wpb0Var) {
        addressMapFragment.getPickupPointsController().a.j = "label_tap";
        moveToPoint$default(addressMapFragment, wpb0Var.b, null, 2, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a71 setupPinV1DataRepository() {
        return new a71(addressPointType(), getPinStyleMapper(), this.addressResolveRepository, getIdleIconRepository());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showControlElements() {
        si00 si00Var = (si00) this.callback;
        if (si00Var != null) {
            si00Var.i();
        }
        if (this.defaultModalViewAllowed) {
            pv0 pv0Var = this.addressInfo;
            boolean isNeedShowPanorama = isNeedShowPanorama(pv0Var != null ? pv0Var.a : null);
            changeMenuButtonState(new c7p(hasSettings(), 2));
            changeBackButtonState(new c7p(isBackButtonVisible(), 2));
            changeAutoLocateButtonState(new c7p(true, 2));
            changePanoramaButtonState(new c7p(isNeedShowPanorama, 2));
            boolean z = false;
            changeConfirmButtonState(new z2e(14, true, z, z));
            changePickupFromPhotoButtonVisibility(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAddressPoint(pv0 addressInfo) {
        dy0.a(getAddressMapInteractor(), addressInfo.a.B(), new AddressMapFragment$updateAddressPoint$1(0, this, AddressMapFragment.class, "invalidatePickupPoints", "invalidatePickupPoints()V", 0));
    }

    private final void updateFragmentContent() {
        if (getView() == null) {
            return;
        }
        jst.e.getClass();
        pv0 pv0Var = this.addressInfo;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = pv0Var != null;
        if (z3) {
            if (pv0Var == null) {
                ny61.g("Required value was null.");
                return;
            }
            setAddressText(getAddressTitle(pv0Var.a));
            if (this.chooseAddressMode == ChooseAddressMode.DESTINATION) {
                AddressInputComponent addressInputComponent = this.addressInitialPointComponent;
                if (addressInputComponent == null) {
                    ny61.g("Required value was null.");
                    return;
                }
                addressInputComponent.setTrailText(this.orderPrice);
            }
        }
        updateUiVisibility();
        changeConfirmButtonState(new z2e(8, z2, z3, z));
    }

    private final void updateUiVisibility() {
        Address address;
        if (this.defaultModalViewAllowed) {
            pv0 pv0Var = this.addressInfo;
            boolean z = false;
            boolean isNeedShowPanorama = (pv0Var == null || (address = pv0Var.a) == null) ? false : isNeedShowPanorama(address);
            boolean z2 = getDebouncingMapListenerDelegate().f;
            changeMenuButtonState(new c7p(hasSettings() && !z2, true));
            changeBackButtonState(new c7p(isBackButtonVisible() && !z2, true));
            boolean z3 = !z2;
            changeAutoLocateButtonState(new c7p(z3, true));
            changePanoramaButtonState(new c7p(isNeedShowPanorama && !z2, true));
            changeModalViewState(new q330(isControlVisible() && !z2, z, 2));
            changePickupFromPhotoButtonVisibility(z3);
        }
    }

    public final void addressConfirmed(pv0 addressInfo) {
        C c = this.callback;
        if (c != 0) {
            ((si00) c).c(addressInfo);
        } else {
            ny61.g("Required value was null.");
        }
    }

    public void addressPicked(pv0 addressInfo) {
        addressConfirmed(addressInfo);
    }

    public abstract PointType addressPointType();

    public void bindViewsInFields() {
        ButtonComponent buttonComponent = (ButtonComponent) nonNullViewById(udh0.confirm);
        this.confirm = buttonComponent;
        if (buttonComponent == null) {
            ny61.g("Required value was null.");
            return;
        }
        final int i = 0;
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: lx0
            public final /* synthetic */ AddressMapFragment b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                AddressMapFragment addressMapFragment = this.b;
                switch (i2) {
                    case 0:
                        addressMapFragment.addressConfirmed();
                        break;
                    default:
                        addressMapFragment.onLocationClick(true);
                        break;
                }
            }
        });
        GoImageButton goImageButton = (GoImageButton) findViewById(udh0.save_button);
        this.saveAddress = goImageButton;
        if (goImageButton != null) {
            goImageButton.setOnClickListener(new tf(6, this));
        }
        FloatButtonHolderLayout floatButtonHolderLayout = (FloatButtonHolderLayout) nonNullViewById(udh0.float_button_holder);
        if (this.autoLocation == null && isShowTopEndButtons()) {
            final int i2 = 1;
            this.autoLocation = eg3.d(floatButtonHolderLayout, new Runnable(this) { // from class: lx0
                public final /* synthetic */ AddressMapFragment b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    AddressMapFragment addressMapFragment = this.b;
                    switch (i22) {
                        case 0:
                            addressMapFragment.addressConfirmed();
                            break;
                        default:
                            addressMapFragment.onLocationClick(true);
                            break;
                    }
                }
            });
        }
        this.bottomButtonsLayout = nonNullViewById(udh0.bottom_buttons_layout);
        this.addressInitialPointComponent = (AddressInputComponent) nonNullViewById(udh0.address_map_fragment_address_component);
        this.addressTextSourceComponent = (AddressInputComponent) findViewById(udh0.address_map_fragment_address_source);
        View view = this.bottomButtonsLayout;
        if (view != null) {
            view.addOnLayoutChangeListener(this.layoutChangeListener);
        } else {
            ny61.g("Required value was null.");
        }
    }

    public boolean blockedZonesAlertsEnabled() {
        return true;
    }

    public boolean blockedZonesEnabled() {
        return true;
    }

    public abstract l56 blockedZonesHandler();

    public boolean canHandlePoiTap() {
        return false;
    }

    public final void changeAddressInfo(pv0 addressInfo) {
        getPresenter().Lg(addressInfo);
        onAddressChanged();
    }

    public void changeAutoLocateButtonState(c7p state) {
        getPresenter().Mg(state);
    }

    public final void changeBackButtonState(c7p state) {
        ru.yandex.taxi.address.c presenter = getPresenter();
        r0 r0Var = presenter.K;
        if (!presenter.H) {
            return;
        }
        while (true) {
            Object value = r0Var.getValue();
            c7p c7pVar = state;
            if (r0Var.k(value, a41.a((a41) value, c7pVar, null, null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD))) {
                return;
            } else {
                state = c7pVar;
            }
        }
    }

    public final void changeConfirmButtonState(z2e state) {
        getPresenter().Ng(state);
    }

    public final void changePickupFromPhotoButtonVisibility(boolean isVisible) {
        Object value;
        a41 a41Var;
        if (pointType() == RoutePointType.POINT_A) {
            ru.yandex.taxi.address.c presenter = getPresenter();
            r0 r0Var = presenter.K;
            if (presenter.y.b()) {
                ymb0 ymb0Var = ((a41) r0Var.getValue()).g;
                if (ymb0Var.b == null || ymb0Var.c == null || isVisible == ymb0Var.a) {
                    return;
                }
                if (isVisible) {
                    ((umb0) presenter.A).a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
                }
                if (presenter.H) {
                    do {
                        value = r0Var.getValue();
                        a41Var = (a41) value;
                    } while (!r0Var.k(value, a41.a(a41Var, null, null, null, null, null, null, ymb0.a(a41Var.g, isVisible, 14), 63)));
                }
            }
        }
    }

    public String forcedCurrentMode() {
        return null;
    }

    public final y50 getActivityRouter() {
        y50 y50Var = this.activityRouter;
        if (y50Var != null) {
            return y50Var;
        }
        return null;
    }

    public final kr0 getAddressClarificationInteractor() {
        kr0 kr0Var = this.addressClarificationInteractor;
        if (kr0Var != null) {
            return kr0Var;
        }
        return null;
    }

    public final pv0 getAddressInfo() {
        return this.addressInfo;
    }

    public final AddressInputComponent getAddressInitialPointComponent() {
        return this.addressInitialPointComponent;
    }

    public final int getAddressLeadImageDrawable() {
        return zyg0.ic_disabled_source_point;
    }

    public final tx0 getAddressMapFragmentAddressControllerFactory() {
        tx0 tx0Var = this.addressMapFragmentAddressControllerFactory;
        if (tx0Var != null) {
            return tx0Var;
        }
        return null;
    }

    public final yx0 getAddressMapFragmentBlockedZoneControllerCallback() {
        return this.addressMapFragmentBlockedZoneControllerCallback;
    }

    public final zx0 getAddressMapFragmentBlockedZoneControllerConfig() {
        return this.addressMapFragmentBlockedZoneControllerConfig;
    }

    public final dy0 getAddressMapInteractor() {
        dy0 dy0Var = this.addressMapInteractor;
        if (dy0Var != null) {
            return dy0Var;
        }
        return null;
    }

    public final x31 getAddressMapPresenterFactory() {
        x31 x31Var = this.addressMapPresenterFactory;
        if (x31Var != null) {
            return x31Var;
        }
        return null;
    }

    public final AddressResolveRepository getAddressResolveRepository() {
        return this.addressResolveRepository;
    }

    public final pv0 getAddressSource() {
        return this.addressSource;
    }

    public final AddressInputComponent getAddressTextSourceComponent() {
        return this.addressTextSourceComponent;
    }

    public String getAddressTitle(Address address) {
        return q5z.F(address);
    }

    public final lx4 getAnalyticsManager() {
        lx4 lx4Var = this.analyticsManager;
        if (lx4Var != null) {
            return lx4Var;
        }
        return null;
    }

    public final tt2 getAppDispatchers() {
        tt2 tt2Var = this.appDispatchers;
        if (tt2Var != null) {
            return tt2Var;
        }
        return null;
    }

    public final RotatableFloatButton getAutoLocation() {
        return this.autoLocation;
    }

    public final ay0 getBlockedZoneControllerFactory() {
        ay0 ay0Var = this.blockedZoneControllerFactory;
        if (ay0Var != null) {
            return ay0Var;
        }
        return null;
    }

    public final View getBottomButtonsLayout() {
        return this.bottomButtonsLayout;
    }

    public final ChooseAddressMode getChooseAddressMode() {
        return this.chooseAddressMode;
    }

    public final ButtonComponent getConfirm() {
        return this.confirm;
    }

    public final otg getDebouncingMapListenerDelegate() {
        otg otgVar = this.debouncingMapListenerDelegate;
        if (otgVar != null) {
            return otgVar;
        }
        return null;
    }

    public final boolean getDefaultModalViewAllowed() {
        return this.defaultModalViewAllowed;
    }

    public final w6r getFinalSuggestScreenRepository() {
        w6r w6rVar = this.finalSuggestScreenRepository;
        if (w6rVar != null) {
            return w6rVar;
        }
        return null;
    }

    public final f7r getFinalizeAddressByGravityRouterFactory() {
        f7r f7rVar = this.finalizeAddressByGravityRouterFactory;
        if (f7rVar != null) {
            return f7rVar;
        }
        return null;
    }

    public final a3v getFocusCoordinator() {
        a3v a3vVar = this.focusCoordinator;
        if (a3vVar != null) {
            return a3vVar;
        }
        return null;
    }

    public final s6v getIdleIconRepository() {
        s6v s6vVar = this.idleIconRepository;
        if (s6vVar != null) {
            return s6vVar;
        }
        return null;
    }

    public final zzs getInitialPoint() {
        return this.initialPoint;
    }

    public int getLayoutId() {
        return yph0.address_picker_map_fragment;
    }

    public final ah00 getMapController() {
        ah00 ah00Var = this.mapController;
        if (ah00Var != null) {
            return ah00Var;
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

    public final l110 getMassTransitStopsInteractor() {
        l110 l110Var = this.massTransitStopsInteractor;
        if (l110Var != null) {
            return l110Var;
        }
        return null;
    }

    public final ya20 getMetricaActionInteractor() {
        ya20 ya20Var = this.metricaActionInteractor;
        if (ya20Var != null) {
            return ya20Var;
        }
        return null;
    }

    public final ab20 getMetricaActionStateHolder() {
        ab20 ab20Var = this.metricaActionStateHolder;
        if (ab20Var != null) {
            return ab20Var;
        }
        return null;
    }

    public final tls getMyLocationTriggerInitializer() {
        return this.myLocationTriggerInitializer;
    }

    public final qq60 getObserverForCurrentTariff() {
        qq60 qq60Var = this.observerForCurrentTariff;
        if (qq60Var != null) {
            return qq60Var;
        }
        return null;
    }

    public final boolean getPickupFromPhotoAllowed() {
        return this.pickupFromPhotoAllowed;
    }

    public Integer getPickupPointAnchoredDrawableResId() {
        return null;
    }

    public PickupPointAnalytics$PointType getPickupPointType() {
        return null;
    }

    public final s31 getPickupPointsController() {
        return (s31) this.pickupPointsController.getValue();
    }

    public final t31 getPickupPointsControllerFactory() {
        t31 t31Var = this.pickupPointsControllerFactory;
        if (t31Var != null) {
            return t31Var;
        }
        return null;
    }

    public final com.yandex.go.pin.api.a getPin() {
        com.yandex.go.pin.api.a aVar = this.pin;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final vtb0 getPinAlertAnimationInteractor() {
        vtb0 vtb0Var = this.pinAlertAnimationInteractor;
        if (vtb0Var != null) {
            return vtb0Var;
        }
        return null;
    }

    public final r0c0 getPinStyleMapper() {
        r0c0 r0c0Var = this.pinStyleMapper;
        if (r0c0Var != null) {
            return r0c0Var;
        }
        return null;
    }

    public final s0c0 getPinStyleProvider() {
        s0c0 s0c0Var = this.pinStyleProvider;
        if (s0c0Var != null) {
            return s0c0Var;
        }
        return null;
    }

    public final p2c0 getPinWithStanExperimentRepository() {
        p2c0 p2c0Var = this.pinWithStanExperimentRepository;
        if (p2c0Var != null) {
            return p2c0Var;
        }
        return null;
    }

    public final ysd0 getPointActionRouterConsumer() {
        ysd0 ysd0Var = this.pointActionRouterConsumer;
        if (ysd0Var != null) {
            return ysd0Var;
        }
        return null;
    }

    public final atd0 getPointAddressDecoder() {
        atd0 atd0Var = this.pointAddressDecoder;
        if (atd0Var != null) {
            return atd0Var;
        }
        return null;
    }

    public final yvf0 getPositionAlertRouterFactory() {
        yvf0 yvf0Var = this.positionAlertRouterFactory;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public final v7j0 getRequestPermissionInteractor() {
        v7j0 v7j0Var = this.requestPermissionInteractor;
        if (v7j0Var != null) {
            return v7j0Var;
        }
        return null;
    }

    public final zuj0 getResourcesProxy() {
        zuj0 zuj0Var = this.resourcesProxy;
        if (zuj0Var != null) {
            return zuj0Var;
        }
        return null;
    }

    public final GoImageButton getSaveAddress() {
        return this.saveAddress;
    }

    public final oep0 getScreenStackNavigator() {
        oep0 oep0Var = this.screenStackNavigator;
        if (oep0Var != null) {
            return oep0Var;
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

    public final boolean getShowRoute() {
        return this.showRoute;
    }

    public final e8y0 getTaxiPanoramaExperimentRepository() {
        e8y0 e8y0Var = this.taxiPanoramaExperimentRepository;
        if (e8y0Var != null) {
            return e8y0Var;
        }
        return null;
    }

    public final l getTaxiPanoramaInteractor() {
        l lVar = this.taxiPanoramaInteractor;
        if (lVar != null) {
            return lVar;
        }
        return null;
    }

    public final i8y0 getTaxiPanoramaLogger() {
        i8y0 i8y0Var = this.taxiPanoramaLogger;
        if (i8y0Var != null) {
            return i8y0Var;
        }
        return null;
    }

    public final a9y0 getTaxiPanoramaRouter() {
        a9y0 a9y0Var = this.taxiPanoramaRouter;
        if (a9y0Var != null) {
            return a9y0Var;
        }
        return null;
    }

    public final c9y0 getTaxiPanoramaTooltipRepository() {
        c9y0 c9y0Var = this.taxiPanoramaTooltipRepository;
        if (c9y0Var != null) {
            return c9y0Var;
        }
        return null;
    }

    public final po21 getUserLocationInteractor() {
        po21 po21Var = this.userLocationInteractor;
        if (po21Var != null) {
            return po21Var;
        }
        return null;
    }

    public final fu00 getZoomRepository() {
        fu00 fu00Var = this.zoomRepository;
        if (fu00Var != null) {
            return fu00Var;
        }
        return null;
    }

    public abstract boolean hasPickupPointsOnMap();

    public void hideControls() {
        updateViewVisibility(this.bottomButtonsLayout, false);
    }

    public final s6v idleIconRepository() {
        return getIdleIconRepository();
    }

    public boolean isBackButtonVisible() {
        return false;
    }

    public boolean isClarifyMode() {
        return false;
    }

    public boolean isControlVisible() {
        return true;
    }

    /* renamed from: isNeedControlViews, reason: from getter */
    public final boolean getIsNeedControlViews() {
        return this.isNeedControlViews;
    }

    public boolean isShowBlockedZoneBeforeUpdate() {
        return false;
    }

    public boolean isShowPanoramaButton() {
        return false;
    }

    public boolean isShowTopEndButtons() {
        return true;
    }

    public final void moveToPoint(zzs geoPoint, String action) {
        dy0 addressMapInteractor = getAddressMapInteractor();
        j0 j0Var = new j0(13, this, action);
        gh00 gh00Var = (gh00) addressMapInteractor.a;
        gh00Var.D(ru.yandex.taxi.map.utils.a.F(geoPoint), gh00Var.j(), 300.0f, new mx0(1, j0Var));
    }

    public boolean needUpdatePositionOnResume() {
        return true;
    }

    public void onAddressChanged(pv0 addressInfo) {
        pv0 pv0Var;
        if (this.defaultModalViewAllowed) {
            createPanoramaButtonIfNeed(addressInfo);
            updateFragmentContent();
        }
        if (addressInfo != null) {
            Address address = addressInfo.a;
            if (blockedZonesEnabled()) {
                xx0 addressMapFragmentBlockedZoneController = getAddressMapFragmentBlockedZoneController();
                RoutePointType pointType = pointType();
                yx0 yx0Var = addressMapFragmentBlockedZoneController.j;
                l56 l56Var = addressMapFragmentBlockedZoneController.h;
                fu00 fu00Var = addressMapFragmentBlockedZoneController.b;
                x46 a = h56.a(addressMapFragmentBlockedZoneController.f, addressInfo, l56Var);
                int i = 0;
                if (a.f != null) {
                    if (((AddressMapFragment) ((g191) addressMapFragmentBlockedZoneController.i).a).isShowBlockedZoneBeforeUpdate()) {
                        l56Var.showBlockedZones();
                    }
                    pv0Var = addressInfo;
                    h56.b(addressMapFragmentBlockedZoneController.f, a, addressMapFragmentBlockedZoneController.h, pv0Var, null, pointType, 8);
                    if (a.b) {
                        fu00Var.a = Integer.MAX_VALUE;
                        fu00Var.b = 0;
                    } else if (a.c) {
                        int i2 = a.d;
                        fu00Var.a = a.e;
                        fu00Var.b = i2;
                    }
                    if (!a.a) {
                        ((AddressMapFragment) ((ddf) yx0Var).b).updateAddressPoint(pv0Var);
                    }
                } else {
                    pv0Var = addressInfo;
                    fu00Var.a = Integer.MAX_VALUE;
                    fu00Var.b = 0;
                    ((AddressMapFragment) ((ddf) yx0Var).b).updateAddressPoint(pv0Var);
                }
                xx0 addressMapFragmentBlockedZoneController2 = getAddressMapFragmentBlockedZoneController();
                boolean isAttachedAndActive = isAttachedAndActive();
                boolean blockedZonesAlertsEnabled = blockedZonesAlertsEnabled();
                yx0 yx0Var2 = addressMapFragmentBlockedZoneController2.j;
                oce0 a2 = ((qce0) addressMapFragmentBlockedZoneController2.a).a(address, pv0Var.j, pv0Var.g);
                if (a2 == null || !blockedZonesAlertsEnabled) {
                    m950 m950Var = addressMapFragmentBlockedZoneController2.k;
                    if (m950Var != null) {
                        ((h55) m950Var).i();
                        ((AddressMapFragment) ((ddf) yx0Var2).b).showControlElements();
                        addressMapFragmentBlockedZoneController2.k = null;
                    }
                    ((AddressMapFragment) ((ddf) yx0Var2).b).requestFocusRect();
                    dy0 dy0Var = addressMapFragmentBlockedZoneController2.c;
                    zzs B = address.B();
                    HapticController$Effect hapticController$Effect = HapticController$Effect.WARNING;
                    wx0 wx0Var = new wx0(addressMapFragmentBlockedZoneController2, i);
                    if (hapticController$Effect != null) {
                        qke.E(dy0Var.d.a, hapticController$Effect, false, 8);
                    } else {
                        dy0Var.getClass();
                    }
                    dy0.a(dy0Var, B, wx0Var);
                } else if (isAttachedAndActive) {
                    addressMapFragmentBlockedZoneController2.g.b(AddressResolveRepository.State.ERROR);
                    m950 m950Var2 = addressMapFragmentBlockedZoneController2.k;
                    if (m950Var2 != null) {
                        ((h55) m950Var2).i();
                    }
                    uce0 uce0Var = (uce0) addressMapFragmentBlockedZoneController2.d.get();
                    addressMapFragmentBlockedZoneController2.k = uce0Var;
                    ((pep0) addressMapFragmentBlockedZoneController2.e).f(new uva(1, uce0Var, new j0(15, addressMapFragmentBlockedZoneController2, a2)), new sce0(a2), hxx.a);
                    ((AddressMapFragment) ((ddf) yx0Var2).b).hideControlElements();
                }
            } else {
                updateAddressPoint(addressInfo);
                pv0Var = addressInfo;
            }
        } else {
            pv0Var = addressInfo;
            resetAddressPoint();
        }
        if (pv0Var != null) {
            getPresenter().B.d.a(LocationErrorReason.LOCATION_MESSAGE_REASON);
        }
    }

    @Override // defpackage.wwo
    public void onCameraMoveFromUserGestureFinished() {
        ((ru.yandex.taxi.persuggest.source.f) getFinalSuggestScreenRepository()).c(FinalSuggestScreen.ADDRESSES_EDIT_SUFFIX);
        if (getView() == null) {
            return;
        }
        updateFragmentContent();
        cameraAnimationFinished$default(this, null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((ru.yandex.taxi.map_common.b) getPointActionRouterConsumer()).c(s.class, getFinalizeAddressByGravityRouter());
        getPresenter().Cg();
        ((m110) getMassTransitStopsInteractor()).a(this.massTransitPoiMovePinCallback);
        unbindViewsInFields();
        this.orderPriceScopeDelegate.b();
        getPanoramaScopeDelegate().b();
        s31 pickupPointsController = getPickupPointsController();
        pickupPointsController.k = null;
        pickupPointsController.l = null;
        pickupPointsController.m = null;
        pickupPointsController.b.pause();
        getTaxiPanoramaTooltipRepository().a = "";
        getTaxiPanoramaTooltipRepository().b = "";
        getSharedPinDataHolder().b(getPinV1DataRepository(), getPinV2DataRepository());
    }

    public void onLocationClick(boolean requestLocation) {
        ((ru.yandex.taxi.analytics.j) getAnalyticsManager()).n(b64.j(getBusinessName(), ".myLocation"));
        getPresenter().Sg(shouldShowStateBarMessage(), new nx0(this, 2), new AddressMapFragment$onLocationClick$2(1, this, AddressMapFragment.class, "onNearestPositionError", "onNearestPositionError(Ljava/lang/Throwable;)V", 0));
    }

    @Override // defpackage.qt00
    public /* bridge */ void onMapCollapsed() {
    }

    public void onMapDragged() {
        if (getView() != null) {
            updateUiVisibility();
            this.decodePointScopeDelegate.f();
            invalidatePickupPoints();
        }
    }

    @Override // defpackage.qt00
    public void onMapExpanded() {
        getPresenter().B.d.a(LocationErrorReason.LOCATION_MESSAGE_REASON);
        this.addressResolveRepository.b(AddressResolveRepository.State.WAITING);
    }

    @Override // defpackage.qt00
    public void onMapPressed() {
        this.decodePointScopeDelegate.f();
    }

    @Override // defpackage.qt00
    public /* bridge */ void onMapReleased() {
    }

    public boolean onMapTapped(zzs geoPoint, qx0 callback) {
        if (!hasView() || !hasPickupPointsOnMap() || !getPickupPointsController().b.Kg()) {
            return false;
        }
        if (geoPoint == null) {
            return callback.d();
        }
        s31 pickupPointsController = getPickupPointsController();
        wpb0 h = pickupPointsController.a.h(pickupPointsController.f, geoPoint, true);
        if (h != null) {
            this.decodePointScopeDelegate.f();
            getPickupPointsController().a.j = "tap";
            moveToPoint$default(this, h.b, null, 2, null);
            return true;
        }
        s31 pickupPointsController2 = getPickupPointsController();
        wpb0 h2 = pickupPointsController2.a.h(pickupPointsController2.f, ((gh00) getMapController()).e.b(), false);
        if (h2 == null) {
            return callback.d();
        }
        this.decodePointScopeDelegate.f();
        getPickupPointsController().a.j = "tap";
        moveToPoint$default(this, h2.b, null, 2, null);
        return true;
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getDebouncingMapListenerDelegate().c();
        this.focusChangeListenerCancellable.cancel();
        pzt0 pzt0Var = getPresenter().L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        setNetworkReceiverListener(null);
        getPresenter().B.d.a(LocationErrorReason.LOCATION_MESSAGE_REASON);
        pzt0 pzt0Var2 = getAddressMapFragmentAddressController().g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        if (hasPickupPointsOnMap()) {
            getPickupPointsController().d.a = null;
        }
        ((gh00) getMapController()).L(null);
    }

    @Override // defpackage.iy0
    public final void onPositionMapToCurrentLocation(mo21 userLocation, boolean isRelevant) {
        if (isRelevant) {
            onNewLocation(userLocation, "auto", PositionInitAction.AUTO_LOCATION);
        } else {
            getPresenter().Ug(shouldShowStateBarMessage(), new nx0(this, 1), new AddressMapFragment$onPositionMapToCurrentLocation$2(1, this, AddressMapFragment.class, "onNearestPositionError", "onNearestPositionError(Ljava/lang/Throwable;)V", 0));
        }
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDebouncingMapListenerDelegate().a(this);
        setNetworkReceiverListener(getNetworkListener());
        if (needUpdatePositionOnResume()) {
            if (System.currentTimeMillis() - this.lastAddressUpdate > 900000) {
                this.addressInfo = null;
                onAddressChanged();
                getPresenter().Lg(null);
            }
            getAddressMapFragmentAddressController().b(((gh00) getMapController()).e.b(), "auto", null, PositionInitAction.MAP);
        }
        invalidatePickupPoints();
        this.focusChangeListenerCancellable.cancel();
        ah00 mapController = getMapController();
        this.focusChangeListenerCancellable = ((gh00) mapController).a.d.h(new jx0(0, this));
        if (hasPickupPointsOnMap()) {
            getPickupPointsController().d.a = new rx0(this);
        }
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getFocusCoordinator().b8(this);
        requestFocusRect();
        dy0 addressMapInteractor = getAddressMapInteractor();
        zzs zzsVar = this.initialPoint;
        fy0 fy0Var = addressMapInteractor.e;
        if (!fy0Var.a) {
            ((gh00) addressMapInteractor.a).L(zzsVar);
            fy0Var.a = true;
        }
        TaxiMapView h = ((gh00) getMapController()).h();
        if (h != null) {
            onStart$lambda$0(this, h);
        }
        View view = this.bottomButtonsLayout;
        if (view != null) {
            view.requestApplyInsets();
        }
        if (this.showRoute) {
            getPresenter().C.attach();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getPresenter().C.detach();
        TaxiMapView h = ((gh00) getMapController()).h();
        if (h != null) {
            onStop$lambda$0(this, h);
        }
    }

    public void onUnsupportedTaxiAddress(Address address, NearestZoneResponse responseForAddress) {
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AddressMapFragment<L, I> addressMapFragment;
        super.onViewCreated(view, savedInstanceState);
        this.decodePointScopeDelegate.a();
        this.orderPriceScopeDelegate.a();
        getPanoramaScopeDelegate().a();
        bindViewsInFields();
        initSourceAddress();
        getPresenter().H = this.isNeedControlViews;
        getPresenter().I = this.defaultModalViewAllowed && this.pickupFromPhotoAllowed;
        ((m110) getMassTransitStopsInteractor()).b(this.massTransitPoiMovePinCallback);
        getPresenter().Kg(this);
        View view2 = this.bottomButtonsLayout;
        if (view2 != null) {
            tje.k(80, view2);
        }
        ButtonComponent buttonComponent = this.confirm;
        if (buttonComponent == null) {
            ny61.g("Required value was null.");
            return;
        }
        buttonComponent.setOnTouchListener(new PassMoveTouchListener(((ru.yandex.taxi.viewholder.b) getMapHost()).c()));
        ((gh00) getAddressMapInteractor().a).J(17.0f);
        if (hasPickupPointsOnMap()) {
            setupPickupPoints();
        }
        zzs zzsVar = this.initialPoint;
        if (zzsVar != null) {
            setPositionNoAnimationTo(zzsVar);
        }
        ((gh00) getMapController()).L(null);
        if (this.chooseAddressMode == ChooseAddressMode.DESTINATION) {
            qq60 observerForCurrentTariff = getObserverForCurrentTariff();
            j jVar = new j(new h(((k) observerForCurrentTariff.b).e(), observerForCurrentTariff));
            observerForCurrentTariff.c.getClass();
            tje.N(this.orderPriceScopeDelegate, null, null, new AddressMapFragment$onViewCreated$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(jVar, uyj.a), null, this), 3);
        }
        invalidatePickupPoints();
        if (!this.defaultModalViewAllowed) {
            View view3 = this.bottomButtonsLayout;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            RotatableFloatButton rotatableFloatButton = this.panoramaButton;
            if (rotatableFloatButton != null) {
                rotatableFloatButton.setVisibility(8);
            }
            RotatableFloatButton rotatableFloatButton2 = this.autoLocation;
            if (rotatableFloatButton2 != null) {
                rotatableFloatButton2.setVisibility(8);
            }
            nonNullViewById(udh0.float_button_holder).setVisibility(8);
            qr31 qr31Var = this.viewGroupTooltipContainer;
            if (qr31Var != null) {
                qr31Var.c().a.setVisibility(8);
            }
        }
        tls tlsVar = this.myLocationTriggerInitializer;
        if (tlsVar != null) {
            addressMapFragment = this;
            tlsVar.invoke(new AddressMapFragment$onViewCreated$4(0, addressMapFragment, AddressMapFragment.class, "onLocationClick", "onLocationClick()V", 0));
        } else {
            addressMapFragment = this;
        }
        addressMapFragment.getSharedPinDataHolder().a(addressMapFragment.getPinV1DataRepository(), addressMapFragment.getPinV2DataRepository());
        ((ru.yandex.taxi.map_common.b) addressMapFragment.getPointActionRouterConsumer()).a(s.class, addressMapFragment.getFinalizeAddressByGravityRouter());
    }

    public RoutePointType pointType() {
        return RoutePointType.POINT_B;
    }

    public boolean reactOnUnsupportedAddress() {
        return false;
    }

    public void renderUiState(a41 uiState) {
        if (this.defaultModalViewAllowed) {
            c7p c7pVar = uiState.b;
            updateViewVisibility(this.autoLocation, c7pVar.a);
            RotatableFloatButton rotatableFloatButton = this.autoLocation;
            if (rotatableFloatButton != null) {
                rotatableFloatButton.setEnabled(c7pVar.b);
            }
            if (!uiState.c.a) {
                RotatableFloatButton rotatableFloatButton2 = this.panoramaButton;
                if (rotatableFloatButton2 != null) {
                    rotatableFloatButton2.setVisibilityAnimated(false);
                }
                qr31 qr31Var = this.viewGroupTooltipContainer;
                if (qr31Var != null) {
                    qr31Var.a();
                }
            }
            z2e z2eVar = uiState.d;
            ButtonComponent buttonComponent = this.confirm;
            if (buttonComponent == null) {
                ny61.g("Required value was null.");
                return;
            }
            boolean z = z2eVar.a;
            boolean z2 = z2eVar.c;
            boolean z3 = z2eVar.b;
            buttonComponent.setVisibility(!z ? 4 : 0);
            String str = z2eVar.d;
            if (str != null) {
                buttonComponent.setText(str);
            }
            if (z3) {
                buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
                buttonComponent.setTextColor(new bdc(xng0.textOnControl));
            } else {
                buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
                buttonComponent.setTextColor(new bdc(xng0.textOnControlMinor));
            }
            if (z2) {
                buttonComponent.startProgress();
            } else {
                buttonComponent.finishProgress();
            }
            buttonComponent.setClickable(z3 && !z2);
            q330 q330Var = uiState.e;
            boolean z4 = q330Var.a;
            boolean z5 = q330Var.b;
            if (z4) {
                showControls();
            } else {
                hideControls();
            }
            AddressInputComponent addressInputComponent = this.addressInitialPointComponent;
            if (addressInputComponent == null) {
                ny61.g("Required value was null.");
                return;
            }
            addressInputComponent.setProgress(z5);
            if (z5) {
                addressInputComponent.startTrailProgressAnimation();
            } else {
                addressInputComponent.stopTrailProgressAnimation();
            }
            c7p c7pVar2 = uiState.f;
            getMenuButtonCoordinator().setVisibility(c7pVar2.a ? 0 : 4);
            getMenuButtonCoordinator().setEnabled(c7pVar2.b);
        }
    }

    public void requestFocusRect() {
        a3v focusCoordinator = getFocusCoordinator();
        View view = this.bottomButtonsLayout;
        if (view != null) {
            focusCoordinator.Td(view.getHeight(), this);
        } else {
            ny61.g("Required value was null.");
        }
    }

    public final void setActivityRouter(y50 y50Var) {
        this.activityRouter = y50Var;
    }

    public final void setAddressClarificationInteractor(kr0 kr0Var) {
        this.addressClarificationInteractor = kr0Var;
    }

    public final void setAddressInfo(pv0 pv0Var) {
        this.addressInfo = pv0Var;
    }

    public final void setAddressInitialPointComponent(AddressInputComponent addressInputComponent) {
        this.addressInitialPointComponent = addressInputComponent;
    }

    public final void setAddressMapFragmentAddressControllerFactory(tx0 tx0Var) {
        this.addressMapFragmentAddressControllerFactory = tx0Var;
    }

    public final void setAddressMapInteractor(dy0 dy0Var) {
        this.addressMapInteractor = dy0Var;
    }

    public final void setAddressMapPresenterFactory(x31 x31Var) {
        this.addressMapPresenterFactory = x31Var;
    }

    public final void setAddressSource(pv0 pv0Var) {
        this.addressSource = pv0Var;
    }

    public final void setAddressTextSourceComponent(AddressInputComponent addressInputComponent) {
        this.addressTextSourceComponent = addressInputComponent;
    }

    public final void setAnalyticsManager(lx4 lx4Var) {
        this.analyticsManager = lx4Var;
    }

    public final void setAppDispatchers(tt2 tt2Var) {
        this.appDispatchers = tt2Var;
    }

    public final void setAutoLocation(RotatableFloatButton rotatableFloatButton) {
        this.autoLocation = rotatableFloatButton;
    }

    public final void setBlockedZoneControllerFactory(ay0 ay0Var) {
        this.blockedZoneControllerFactory = ay0Var;
    }

    public final void setBottomButtonsLayout(View view) {
        this.bottomButtonsLayout = view;
    }

    public final void setChooseAddressMode(ChooseAddressMode chooseAddressMode) {
        this.chooseAddressMode = chooseAddressMode;
    }

    public final void setConfirm(ButtonComponent buttonComponent) {
        this.confirm = buttonComponent;
    }

    public final void setDebouncingMapListenerDelegate(otg otgVar) {
        this.debouncingMapListenerDelegate = otgVar;
    }

    public final void setDefaultModalViewAllowed(boolean z) {
        this.defaultModalViewAllowed = z;
    }

    public final void setFinalSuggestScreenRepository(w6r w6rVar) {
        this.finalSuggestScreenRepository = w6rVar;
    }

    public final void setFinalizeAddressByGravityRouterFactory(f7r f7rVar) {
        this.finalizeAddressByGravityRouterFactory = f7rVar;
    }

    public final void setFocusCoordinator(a3v a3vVar) {
        this.focusCoordinator = a3vVar;
    }

    public final void setIdleIconRepository(s6v s6vVar) {
        this.idleIconRepository = s6vVar;
    }

    public final void setInitialAddress(pv0 info) {
        zzs zzsVar = info.j;
        if (zzsVar == null) {
            zzsVar = info.a.B();
        }
        updateInitialPoint(zzsVar);
        this.addressInfo = info;
        if (this.addressMapPresenterFactory != null) {
            onAddressChanged();
            getPresenter().Lg(info);
        }
        this.lastAddressUpdate = System.currentTimeMillis();
    }

    public final void setMapController(ah00 ah00Var) {
        this.mapController = ah00Var;
    }

    public final void setMapHost(xi00 xi00Var) {
        this.mapHost = xi00Var;
    }

    public final void setMassTransitStopsInteractor(l110 l110Var) {
        this.massTransitStopsInteractor = l110Var;
    }

    public final void setMetricaActionInteractor(ya20 ya20Var) {
        this.metricaActionInteractor = ya20Var;
    }

    public final void setMetricaActionStateHolder(ab20 ab20Var) {
        this.metricaActionStateHolder = ab20Var;
    }

    public final void setMyLocationTriggerInitializer(tls tlsVar) {
        this.myLocationTriggerInitializer = tlsVar;
    }

    public final void setNeedControlViews(boolean z) {
        this.isNeedControlViews = z;
    }

    public final void setObserverForCurrentTariff(qq60 qq60Var) {
        this.observerForCurrentTariff = qq60Var;
    }

    public final void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public final void setPickupFromPhotoAllowed(boolean z) {
        this.pickupFromPhotoAllowed = z;
    }

    public final void setPickupPointsControllerFactory(t31 t31Var) {
        this.pickupPointsControllerFactory = t31Var;
    }

    public final void setPin(com.yandex.go.pin.api.a aVar) {
        this.pin = aVar;
    }

    public final void setPinAlertAnimationInteractor(vtb0 vtb0Var) {
        this.pinAlertAnimationInteractor = vtb0Var;
    }

    public final void setPinStyleMapper(r0c0 r0c0Var) {
        this.pinStyleMapper = r0c0Var;
    }

    public final void setPinStyleProvider(s0c0 s0c0Var) {
        this.pinStyleProvider = s0c0Var;
    }

    public final void setPinWithStanExperimentRepository(p2c0 p2c0Var) {
        this.pinWithStanExperimentRepository = p2c0Var;
    }

    public final void setPointActionRouterConsumer(ysd0 ysd0Var) {
        this.pointActionRouterConsumer = ysd0Var;
    }

    public final void setPointAddressDecoder(atd0 atd0Var) {
        this.pointAddressDecoder = atd0Var;
    }

    public final void setPositionAlertRouterFactory(yvf0 yvf0Var) {
        this.positionAlertRouterFactory = yvf0Var;
    }

    public final void setRequestPermissionInteractor(v7j0 v7j0Var) {
        this.requestPermissionInteractor = v7j0Var;
    }

    public final void setResourcesProxy(zuj0 zuj0Var) {
        this.resourcesProxy = zuj0Var;
    }

    public final void setSaveAddress(GoImageButton goImageButton) {
        this.saveAddress = goImageButton;
    }

    public final void setScreenStackNavigator(oep0 oep0Var) {
        this.screenStackNavigator = oep0Var;
    }

    public final void setSharedPinDataHolder(hpr0 hpr0Var) {
        this.sharedPinDataHolder = hpr0Var;
    }

    public final void setShowRoute(boolean z) {
        this.showRoute = z;
    }

    public final void setSourceAddress(pv0 info) {
        this.addressSource = info;
    }

    public final void setTaxiPanoramaExperimentRepository(e8y0 e8y0Var) {
        this.taxiPanoramaExperimentRepository = e8y0Var;
    }

    public final void setTaxiPanoramaInteractor(l lVar) {
        this.taxiPanoramaInteractor = lVar;
    }

    public final void setTaxiPanoramaLogger(i8y0 i8y0Var) {
        this.taxiPanoramaLogger = i8y0Var;
    }

    public final void setTaxiPanoramaRouter(a9y0 a9y0Var) {
        this.taxiPanoramaRouter = a9y0Var;
    }

    public final void setTaxiPanoramaTooltipRepository(c9y0 c9y0Var) {
        this.taxiPanoramaTooltipRepository = c9y0Var;
    }

    public final void setUserLocationInteractor(po21 po21Var) {
        this.userLocationInteractor = po21Var;
    }

    public final void setZoomRepository(fu00 fu00Var) {
        this.zoomRepository = fu00Var;
    }

    public b1c0 setupPinV2DataRepository() {
        return new ru.yandex.taxi.address.map.c(addressPointType(), getPinStyleMapper(), this.addressResolveRepository, getPinAlertAnimationInteractor(), getPinWithStanExperimentRepository());
    }

    public boolean shouldCacheAddressByLocationTap() {
        return false;
    }

    public boolean shouldDrawPickupPoints() {
        s31 pickupPointsController = getPickupPointsController();
        ru.yandex.taxi.preorder.source.pickup.a aVar = pickupPointsController.a;
        ah00 ah00Var = pickupPointsController.f;
        aVar.getClass();
        return ru.yandex.taxi.preorder.source.pickup.a.b(ah00Var);
    }

    public boolean shouldShowStateBarMessage() {
        return true;
    }

    public void showControls() {
        if (this.defaultModalViewAllowed) {
            updateViewVisibility(this.bottomButtonsLayout, true);
        }
    }

    public void unbindViewsInFields() {
        ButtonComponent buttonComponent = this.confirm;
        if (buttonComponent == null) {
            ny61.g("Required value was null.");
            return;
        }
        buttonComponent.setOnClickListener((Runnable) null);
        buttonComponent.setOnTouchListener(null);
        this.confirm = null;
        FloatButtonHolderLayout floatButtonHolderLayout = (FloatButtonHolderLayout) nonNullViewById(udh0.float_button_holder);
        RotatableFloatButton rotatableFloatButton = this.autoLocation;
        if (rotatableFloatButton != null) {
            floatButtonHolderLayout.removeFloatButton(rotatableFloatButton);
        }
        this.autoLocation = null;
        RotatableFloatButton rotatableFloatButton2 = this.panoramaButton;
        if (rotatableFloatButton2 != null) {
            floatButtonHolderLayout.removeFloatButton(rotatableFloatButton2);
        }
        this.panoramaButton = null;
        View view = this.bottomButtonsLayout;
        if (view == null) {
            ny61.g("Required value was null.");
            return;
        }
        view.removeOnLayoutChangeListener(this.layoutChangeListener);
        this.bottomButtonsLayout = null;
        AddressInputComponent addressInputComponent = this.addressInitialPointComponent;
        if (addressInputComponent == null) {
            ny61.g("Required value was null.");
            return;
        }
        addressInputComponent.setOnClickListener(null);
        this.addressInitialPointComponent = null;
        AddressInputComponent addressInputComponent2 = this.addressTextSourceComponent;
        if (addressInputComponent2 != null) {
            addressInputComponent2.setOnClickListener(null);
        }
        this.addressTextSourceComponent = null;
    }

    public final void updateInitialPoint(zzs point) {
        this.initialPointSetStacktrace = new Throwable();
        this.initialPoint = point;
    }

    public final void updateViewVisibility(View view, boolean isVisible) {
        if (view == null) {
            return;
        }
        if (isVisible) {
            cma1.J(view);
        } else {
            cma1.M(view);
        }
    }

    @Override // defpackage.iy0
    public void addressConfirmed() {
        pv0 pv0Var = this.addressInfo;
        if (pv0Var != null) {
            addressConfirmed(pv0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLocationClick() {
        onLocationClick(true);
    }

    @Override // defpackage.qt00
    public boolean onMapTapped(float x, float y) {
        if (canHandlePoiTap()) {
            return false;
        }
        Point d = ((gh00) getMapController()).e.d(new ScreenPoint(x, y));
        return onMapTapped(d != null ? ru.yandex.taxi.map.utils.a.E(d, null) : null, new quz(7));
    }

    private final void createPanoramaButtonIfNeed(pv0 addressInfo) {
        l8x l8xVar = this.showEntryPointJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.showEntryPointJob = hbp0.e(getPanoramaScopeDelegate(), null, null, new AddressMapFragment$createPanoramaButtonIfNeed$1(this, addressInfo, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddressChanged() {
        tje.N(getLifecycleScope(), null, null, new AddressMapFragment$onAddressChanged$1(this, null), 3);
    }
}
