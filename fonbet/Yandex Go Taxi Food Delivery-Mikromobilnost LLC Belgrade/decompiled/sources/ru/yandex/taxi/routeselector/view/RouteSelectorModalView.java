package ru.yandex.taxi.routeselector.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.b;
import com.yandex.go.address.models.Address;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.clarify_address.before_order.ClarifyAddressBeforeOrderOrigin;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoTooltipContainer$TooltipPointerAlignment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a2i0;
import defpackage.a3v;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.bj70;
import defpackage.cma1;
import defpackage.cqb0;
import defpackage.d0l0;
import defpackage.d9l0;
import defpackage.dkv0;
import defpackage.dt20;
import defpackage.e430;
import defpackage.e9l0;
import defpackage.eaj0;
import defpackage.eal0;
import defpackage.eg3;
import defpackage.f7r;
import defpackage.f9l0;
import defpackage.fal0;
import defpackage.faq0;
import defpackage.fnx0;
import defpackage.frg0;
import defpackage.g7r;
import defpackage.gal0;
import defpackage.gh00;
import defpackage.gpb0;
import defpackage.h9l0;
import defpackage.hal0;
import defpackage.hkv0;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.i7r;
import defpackage.i9l0;
import defpackage.ial0;
import defpackage.ip11;
import defpackage.j37;
import defpackage.j9l0;
import defpackage.jl40;
import defpackage.jpb0;
import defpackage.kpb0;
import defpackage.kyh0;
import defpackage.lhc;
import defpackage.lsg0;
import defpackage.m37;
import defpackage.m9l0;
import defpackage.mcb1;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.muw;
import defpackage.ndh0;
import defpackage.nfh0;
import defpackage.o8k0;
import defpackage.ohk0;
import defpackage.orh0;
import defpackage.pep0;
import defpackage.pv0;
import defpackage.qa0;
import defpackage.qje;
import defpackage.qv10;
import defpackage.ro00;
import defpackage.rp31;
import defpackage.so00;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.to00;
import defpackage.u0c0;
import defpackage.uva;
import defpackage.vbb;
import defpackage.w130;
import defpackage.w511;
import defpackage.wdt0;
import defpackage.wpb0;
import defpackage.x9l0;
import defpackage.xcb1;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.ydp;
import defpackage.ysd0;
import defpackage.yvf0;
import defpackage.z81;
import defpackage.zmh;
import defpackage.zuj0;
import defpackage.zxf0;
import defpackage.zy11;
import defpackage.zzi;
import defpackage.zzs;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$ActionV2;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$PointTypeV2;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorAnalytics$Button;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.routeselector.presentation.s;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ×\u00012\u00020\u00012\u00020\u0002:\u0004Ø\u0001Ù\u0001B\u0089\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020)H\u0014¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020)2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020)H\u0014¢\u0006\u0004\b3\u0010-J/\u00108\u001a\u00020)2\u0006\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020/H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010>\u001a\u00020)2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020)2\u0006\u0010@\u001a\u00020<H\u0014¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020<H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020)H\u0016¢\u0006\u0004\bE\u0010-J\u000f\u0010F\u001a\u00020)H\u0016¢\u0006\u0004\bF\u0010-J!\u0010J\u001a\u00020)2\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010I\u001a\u00020<H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020<2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020)H\u0016¢\u0006\u0004\bP\u0010-J\u0017\u0010R\u001a\u00020)2\u0006\u0010Q\u001a\u00020<H\u0016¢\u0006\u0004\bR\u0010BJ\u0017\u0010U\u001a\u00020)2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u00020)2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020/H\u0014¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020)2\u0006\u0010Q\u001a\u00020<H\u0016¢\u0006\u0004\b]\u0010BJ\u0017\u0010_\u001a\u00020)2\u0006\u0010^\u001a\u00020<H\u0016¢\u0006\u0004\b_\u0010BJ\u0017\u0010b\u001a\u00020)2\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ)\u0010i\u001a\u00020)2\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f2\b\u0010h\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bi\u0010jJ\u0019\u0010k\u001a\u00020)2\b\u0010h\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020)H\u0016¢\u0006\u0004\bm\u0010-J\u000f\u0010n\u001a\u00020)H\u0016¢\u0006\u0004\bn\u0010-J\r\u0010o\u001a\u00020<¢\u0006\u0004\bo\u0010DJ\r\u0010p\u001a\u00020)¢\u0006\u0004\bp\u0010-J\r\u0010q\u001a\u00020)¢\u0006\u0004\bq\u0010-J\u0015\u0010t\u001a\u00020)2\u0006\u0010s\u001a\u00020r¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020/H\u0016¢\u0006\u0004\bv\u0010\\J\u000f\u0010x\u001a\u00020wH\u0014¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020)2\u0006\u0010^\u001a\u00020<H\u0016¢\u0006\u0004\bz\u0010BJ\u000f\u0010|\u001a\u00020{H\u0002¢\u0006\u0004\b|\u0010}J\u000f\u0010~\u001a\u00020fH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0081\u0001\u001a\u00020)2\u0007\u0010T\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001c\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0007\u0010T\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0088\u0001\u001a\u00020)2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b\u008a\u0001\u0010-J\u001b\u0010\u008c\u0001\u001a\u00020)2\u0007\u0010a\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008f\u0001\u001a\u00020)2\u0007\u0010a\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J!\u0010\u0093\u0001\u001a\u00020)*\u00030\u0086\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0095\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0096\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0097\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u0098\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0099\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u009a\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u009b\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u009c\u0001R\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u009d\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u009e\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u009f\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010 \u0001R\u0017\u0010¡\u0001\u001a\u00020/8\u0002X\u0082D¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010£\u0001\u001a\u00020/8\u0002X\u0082D¢\u0006\b\n\u0006\b£\u0001\u0010¢\u0001R\u0017\u0010¤\u0001\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010ª\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010¬\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010¯\u0001\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010²\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0017\u0010´\u0001\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010¥\u0001R\u0018\u0010¶\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001b\u0010»\u0001\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¥\u0001R!\u0010Å\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R)\u0010Ê\u0001\u001a\u000b Æ\u0001*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010Â\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u001c\u0010Ì\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R!\u0010Ò\u0001\u001a\u00030Î\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Â\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010Ô\u0001\u001a\u00020/8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\\R\u0016\u0010Ö\u0001\u001a\u00020/8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010\\¨\u0006Ú\u0001"}, d2 = {"Lru/yandex/taxi/routeselector/view/RouteSelectorModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lm9l0;", "Landroid/content/Context;", "context", "La3v;", "focusCoordinator", "Lzuj0;", "resourcesProxy", "Lx9l0;", "params", "Lwdt0;", "sourcePinDrawableFactory", "Lzzi;", "destinationPinDrawableFactory", "Lru/yandex/taxi/routeselector/presentation/s;", "presenter", "Lso00;", "mapObjectSpaceFactory", "Lcqb0;", "bubbleIntersectionManager", "Lyvf0;", "Lru/yandex/taxi/address/design/AddressInputView;", "newbiesAddressViewProvider", "Lip11;", "typefaceDelegate", "Ljpb0;", "pickupFromPhotoTooltipFactory", "Lysd0;", "pointActionRouterConsumer", "Lru/yandex/taxi/address/repository/AddressResolveRepository;", "addressResolveRepository", "Lf7r;", "finalizeAddressByGravityRouterFactory", "<init>", "(Landroid/content/Context;La3v;Lzuj0;Lx9l0;Lwdt0;Lzzi;Lru/yandex/taxi/routeselector/presentation/s;Lso00;Lcqb0;Lyvf0;Lip11;Ljpb0;Lysd0;Lru/yandex/taxi/address/repository/AddressResolveRepository;Lf7r;)V", "Lw130;", "insetsType", "()Lw130;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Rect;", "rect", "", "anim", "onPinRectForBubbleChanged", "(Landroid/graphics/Rect;Z)V", "settle", "updateAnchoredHeight", "(Z)V", "dismissOnTariffChanged", "()Z", "close", "confirmRoute", "", "text", "progress", "setBubbleText", "(Ljava/lang/CharSequence;Z)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onBackPressed", BackendConfig.Restrictions.ENABLED, "setEnabled", "Le430;", "style", "applyStyle", "(Le430;)V", "Lru/yandex/taxi/search/address/view/PointType;", "pointType", "showAnotherAddressPicker", "(Lru/yandex/taxi/search/address/view/PointType;)V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "setDoneButtonEnabled", "visible", "setSaveButtonVisible", "Lhal0;", ClidProvider.STATE, "renderSourceDestination", "(Lhal0;)V", "Landroid/graphics/Bitmap;", "image", "", "contentDescription", "tooltipText", "renderPickupFromPhotoButton", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V", "renderPickupFromPhotoTooltip", "(Ljava/lang/String;)V", "showAddressAdjustment", "openPickupFromPhoto", "isClarifyMode", "updateFocusRect", "onMyLocationTapped", "Lwpb0;", IssuingDistributionPointExtension.POINT, "onPickupPointTapped", "(Lwpb0;)V", "getTopPadding", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "animateVisibility", "Landroid/graphics/drawable/GradientDrawable;", "createTopGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "doneButtonText", "()Ljava/lang/String;", "Lm37;", "applyButtonStyle", "(Lm37;)V", "Lbj70;", "buttonStyle", "(Lm37;)Lbj70;", "Lru/yandex/taxi/design/ListItemComponent;", "addressComponent", "appendEntrance", "(Lru/yandex/taxi/design/ListItemComponent;)V", "openEntranceInput", "Lfal0;", "renderCirclePinSourceDestination", "(Lfal0;)V", "Lgal0;", "renderNewbiesSourceDestination", "(Lgal0;)V", "Lu0c0;", "pinStyles", "applyPinStyles", "(Lru/yandex/taxi/design/ListItemComponent;Lu0c0;)V", "La3v;", "Lzuj0;", "Lx9l0;", "Lwdt0;", "Lzzi;", "Lru/yandex/taxi/routeselector/presentation/s;", "Lso00;", "Lcqb0;", "Lyvf0;", "Lip11;", "Ljpb0;", "Lysd0;", "locateButtonMarginHorizontalDp", CA20Status.STATUS_USER_I, "locateButtonBottomPaddingDp", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "bubbleComponent", "Lru/yandex/taxi/design/bubble/BubbleComponent;", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "bubbleTextComponent", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "hint", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "doneButton", "Lru/yandex/taxi/design/ButtonComponent;", "saveButton", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "floatButtonLayoutHolder", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "pickupFromPhotoButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "initialEntranceNumber", "Ljava/lang/String;", "Lmuw;", "clarifyBubbleSpace", "Lmuw;", "addressView", "circlePinAddressView$delegate", "Li3y;", "getCirclePinAddressView", "()Lru/yandex/taxi/design/ListItemComponent;", "circlePinAddressView", "kotlin.jvm.PlatformType", "newbiesAddressView$delegate", "getNewbiesAddressView", "()Lru/yandex/taxi/address/design/AddressInputView;", "newbiesAddressView", "Lgpb0;", "pickupFromPhotoTooltipContainer", "Lgpb0;", "Lg7r;", "finalizeAddressByGravityRouter$delegate", "getFinalizeAddressByGravityRouter", "()Lg7r;", "finalizeAddressByGravityRouter", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Companion", "a", "i9l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouteSelectorModalView extends SlideableModalView implements m9l0 {
    private static final int ADDRESS_VIEW_MAX_LINES = 3;
    public static final i9l0 Companion = new i9l0();
    private View addressView;
    private final FloatButtonIconComponent backButton;
    private final BubbleComponent bubbleComponent;
    private final cqb0 bubbleIntersectionManager;
    private final ShimmeringRobotoTextView bubbleTextComponent;

    /* renamed from: circlePinAddressView$delegate, reason: from kotlin metadata */
    private final i3y circlePinAddressView;
    private final muw clarifyBubbleSpace;
    private final View content;
    private final zzi destinationPinDrawableFactory;
    private final ButtonComponent doneButton;

    /* renamed from: finalizeAddressByGravityRouter$delegate, reason: from kotlin metadata */
    private final i3y finalizeAddressByGravityRouter;
    private final FloatButtonHolderLayout floatButtonLayoutHolder;
    private final a3v focusCoordinator;
    private final ListItemComponent hint;
    private String initialEntranceNumber;
    private final int locateButtonBottomPaddingDp;
    private final int locateButtonMarginHorizontalDp;
    private final so00 mapObjectSpaceFactory;

    /* renamed from: newbiesAddressView$delegate, reason: from kotlin metadata */
    private final i3y newbiesAddressView;
    private final yvf0 newbiesAddressViewProvider;
    private final x9l0 params;
    private final RotatableFloatButton pickupFromPhotoButton;
    private gpb0 pickupFromPhotoTooltipContainer;
    private final jpb0 pickupFromPhotoTooltipFactory;
    private final ysd0 pointActionRouterConsumer;
    private final s presenter;
    private final zuj0 resourcesProxy;
    private final View saveButton;
    private final wdt0 sourcePinDrawableFactory;
    private final ip11 typefaceDelegate;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/routeselector/view/RouteSelectorModalView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void K();

        void dismiss();

        void o3(PointType pointType, qa0 qa0Var);

        default void openPickupFromPhoto() {
        }

        default void showAddressAdjustment() {
        }

        default tls t2() {
            return null;
        }
    }

    public RouteSelectorModalView(Context context, a3v a3vVar, zuj0 zuj0Var, x9l0 x9l0Var, wdt0 wdt0Var, zzi zziVar, s sVar, so00 so00Var, cqb0 cqb0Var, yvf0 yvf0Var, ip11 ip11Var, jpb0 jpb0Var, ysd0 ysd0Var, AddressResolveRepository addressResolveRepository, f7r f7rVar) {
        super(context);
        this.focusCoordinator = a3vVar;
        this.resourcesProxy = zuj0Var;
        this.params = x9l0Var;
        this.sourcePinDrawableFactory = wdt0Var;
        this.destinationPinDrawableFactory = zziVar;
        this.presenter = sVar;
        this.mapObjectSpaceFactory = so00Var;
        this.bubbleIntersectionManager = cqb0Var;
        this.newbiesAddressViewProvider = yvf0Var;
        this.typefaceDelegate = ip11Var;
        this.pickupFromPhotoTooltipFactory = jpb0Var;
        this.pointActionRouterConsumer = ysd0Var;
        c.q(this, orh0.route_selector_modal_view_top_content, true);
        this.locateButtonMarginHorizontalDp = 13;
        this.locateButtonBottomPaddingDp = 9;
        int i = nfh0.route_selector_content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        BubbleComponent bubbleComponent = (BubbleComponent) ((View) rp31.d(this, nfh0.clarify_point_map_bubble));
        bubbleComponent.setBubbleColor(new bdc(xng0.bgMain));
        this.bubbleComponent = bubbleComponent;
        ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) ((View) rp31.d(this, nfh0.clarify_point_map_bubble_text));
        this.bubbleTextComponent = shimmeringRobotoTextView;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, nfh0.clarify_point_map_hint));
        this.hint = listItemComponent;
        d9l0 d9l0Var = new d9l0(this, 4);
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), null, 0, a2i0.FloatButtonIconStyle, 4, null);
        backButtonIconComponent.setDebounceClickListener(d9l0Var);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        backButton$lambda$0(backButtonIconComponent);
        addFloatButton(backButtonIconComponent, 8388611);
        this.backButton = backButtonIconComponent;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, nfh0.done_component));
        this.doneButton = buttonComponent;
        this.saveButton = (View) rp31.d(this, nfh0.save_button);
        this.clarifyBubbleSpace = new muw() { // from class: g9l0
            @Override // defpackage.muw
            public final ro00 a() {
                ro00 clarifyBubbleSpace$lambda$0;
                clarifyBubbleSpace$lambda$0 = RouteSelectorModalView.clarifyBubbleSpace$lambda$0(RouteSelectorModalView.this);
                return clarifyBubbleSpace$lambda$0;
            }
        };
        this.addressView = (View) rp31.d(this, nfh0.component_address_stub);
        this.circlePinAddressView = kotlin.a.a(new o8k0(13, context, this));
        this.newbiesAddressView = kotlin.a.a(new e9l0(this, 3));
        this.finalizeAddressByGravityRouter = kotlin.a.a(new h9l0(f7rVar, addressResolveRepository, 0));
        buttonComponent.setText(doneButtonText());
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setId(nfh0.route_selector_modal_view);
        setDismissOnTouchOutside(false);
        setElevation(tje.r(lsg0.route_selector_elevation, getContext()));
        setArrowState(ArrowsView.State.GONE);
        setDismissOnBackPressed(false);
        setPadding(0, 0, 0, 0);
        shimmeringRobotoTextView.setAnimateFullWidth(true);
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) rp31.d(this, nfh0.component_source_address_title));
        listItemComponent2.setTitle(x9l0Var.f);
        listItemComponent2.setSubtitle(x9l0Var.g);
        listItemComponent2.setTitleTypeface(((zmh) ip11Var).d());
        listItemComponent.setBackground(createTopGradientDrawable());
        b.q(listItemComponent, true);
        ((LinearLayout) ((View) rp31.d(this, ndh0.end_side_fab_container))).setGravity(8388613);
        RotatableFloatButton b = eg3.b(eg3.c(this, 12), new d9l0(this, 5));
        this.pickupFromPhotoButton = b;
        b.setVisibility(8);
        FloatButtonHolderLayout c = eg3.c(this, 13);
        this.floatButtonLayoutHolder = c;
        c.setBottomPadding(tje.u(9, getContext()));
        Runnable runnable = x9l0Var.o;
        if (runnable != null) {
            eg3.d(c, runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(RouteSelectorModalView routeSelectorModalView) {
        ((m9l0) routeSelectorModalView.presenter.Dg()).openPickupFromPhoto();
    }

    private final void appendEntrance(ListItemComponent addressComponent) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int r = tje.r(mrg0.go_design_m_space, getContext());
        layoutParams.setMarginStart(r);
        layoutParams.setMarginEnd(r);
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setText(getResources().getString(kyh0.favorite_porch_field));
        robotoTextView.setTextColor(qje.t(xng0.textMain, getContext()));
        robotoTextView.setGravity(17);
        int t = qje.t(xng0.bgMinor, getContext());
        float r2 = tje.r(frg0.porch_background_corners_radius, getContext());
        int argb = Color.argb((int) (Color.alpha(t) * 0.5f), Color.red(t), Color.green(t), Color.blue(t));
        vbb vbbVar = new vbb(t, r2);
        vbbVar.X(argb);
        int i = 0;
        vbbVar.Y(lhc.c(t) < 0.75d ? Color.argb(225, 255, 255, 255) : Color.argb(225, 0, 0, 0));
        robotoTextView.setBackground((Drawable) vbbVar.b);
        xw31.I(robotoTextView, Integer.valueOf(tje.r(frg0.porch_horizontal_padding, getContext())), Integer.valueOf(tje.r(frg0.porch_vertical_padding, getContext())), Integer.valueOf(tje.r(frg0.porch_horizontal_padding, getContext())), Integer.valueOf(tje.r(frg0.porch_vertical_padding, getContext())));
        frameLayout.addView(robotoTextView);
        addressComponent.setTrailView(frameLayout);
        addressComponent.setTrailContainerClickListener(new d9l0(this, 2));
        xw31.c(addressComponent, new f9l0(frameLayout, addressComponent, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendEntrance$lambda$1(FrameLayout frameLayout, ListItemComponent listItemComponent) {
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, listItemComponent.getHeight()));
    }

    private final void applyButtonStyle(m37 style) {
        mcb1.a(this.doneButton, buttonStyle(style));
    }

    private final void applyPinStyles(ListItemComponent listItemComponent, u0c0 u0c0Var) {
        Drawable b;
        String str = u0c0Var.a.c;
        String str2 = u0c0Var.b.c;
        int i = j9l0.a[this.params.b.ordinal()];
        if (i == 1) {
            b = this.params.b() ? this.sourcePinDrawableFactory.b(str) : this.destinationPinDrawableFactory.b(str2);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            b = this.params.b() ? this.sourcePinDrawableFactory.a(str) : this.destinationPinDrawableFactory.a(str2);
        }
        listItemComponent.setLeadImage(b);
    }

    private static final zy11 backButton$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setId(ndh0.back);
        return zy11.a;
    }

    private final bj70 buttonStyle(m37 style) {
        bj70 bj70Var = this.params.e;
        if (bj70Var != null) {
            return bj70Var;
        }
        j37 a2 = style.a(ButtonType.DEFAULT);
        if (a2 != null) {
            return xcb1.b(a2);
        }
        bj70 bj70Var2 = bj70.d;
        return bj70.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListItemComponent circlePinAddressView_delegate$lambda$0(Context context, RouteSelectorModalView routeSelectorModalView) {
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitleWithNavigationIcon(true);
        listItemComponent.setTitleMaxLines(3);
        listItemComponent.ellipsizeTitleMiddle(true);
        listItemComponent.setCenterClickListener(new d9l0(routeSelectorModalView, 0));
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void circlePinAddressView_delegate$lambda$0$0$0(RouteSelectorModalView routeSelectorModalView) {
        s sVar = routeSelectorModalView.presenter;
        ((m9l0) sVar.Dg()).showAnotherAddressPicker(routeSelectorModalView.params.b() ? PointType.SOURCE : PointType.DESTINATION);
        sVar.A.b(sVar.z.b(), RouteSelectorAnalytics$Button.SUGGEST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ro00 clarifyBubbleSpace$lambda$0(RouteSelectorModalView routeSelectorModalView) {
        return ((to00) routeSelectorModalView.mapObjectSpaceFactory).c(Participant.CLARIFY_POINT_BUBBLE, routeSelectorModalView.bubbleComponent);
    }

    private final GradientDrawable createTopGradientDrawable() {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int t = qje.t(xng0.bgMain, getContext());
        int argb = Color.argb((int) (Color.alpha(t) * 1.0f), Color.red(t), Color.green(t), Color.blue(t));
        int t2 = qje.t(xng0.bgMain, getContext());
        return new GradientDrawable(orientation, new int[]{argb, Color.argb((int) (Color.alpha(t2) * 0.0f), Color.red(t2), Color.green(t2), Color.blue(t2))});
    }

    private final String doneButtonText() {
        x9l0 x9l0Var = this.params;
        int i = x9l0Var.c;
        if (i != 0) {
            return ((avj0) this.resourcesProxy).h(i);
        }
        String str = x9l0Var.d;
        if (str != null) {
            return str;
        }
        return ((avj0) this.resourcesProxy).h(kyh0.common_done);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g7r finalizeAddressByGravityRouter_delegate$lambda$0(f7r f7rVar, AddressResolveRepository addressResolveRepository) {
        return ((i7r) f7rVar).a(addressResolveRepository);
    }

    private final ListItemComponent getCirclePinAddressView() {
        return (ListItemComponent) this.circlePinAddressView.getValue();
    }

    private final g7r getFinalizeAddressByGravityRouter() {
        return (g7r) this.finalizeAddressByGravityRouter.getValue();
    }

    private final AddressInputView getNewbiesAddressView() {
        return (AddressInputView) this.newbiesAddressView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(RouteSelectorModalView routeSelectorModalView, t1w t1wVar) {
        xw31.M(t1wVar.b, routeSelectorModalView.hint);
        xw31.y(t1wVar.g, routeSelectorModalView.getCardContentView());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressInputView newbiesAddressView_delegate$lambda$0(RouteSelectorModalView routeSelectorModalView) {
        AddressInputView addressInputView = (AddressInputView) routeSelectorModalView.newbiesAddressViewProvider.get();
        c.z(new e9l0(routeSelectorModalView, 0), addressInputView);
        addressInputView.setOnButtonClickListener(new e9l0(routeSelectorModalView, 1));
        return addressInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 newbiesAddressView_delegate$lambda$0$0$0(RouteSelectorModalView routeSelectorModalView) {
        s sVar = routeSelectorModalView.presenter;
        ((m9l0) sVar.Dg()).showAnotherAddressPicker(routeSelectorModalView.params.b() ? PointType.SOURCE : PointType.DESTINATION);
        sVar.A.b(sVar.z.b(), RouteSelectorAnalytics$Button.SUGGEST);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 newbiesAddressView_delegate$lambda$0$0$1(RouteSelectorModalView routeSelectorModalView) {
        routeSelectorModalView.openEntranceInput();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(RouteSelectorModalView routeSelectorModalView, View view) {
        s sVar = routeSelectorModalView.presenter;
        d0l0 c = sVar.y.c();
        x9l0 x9l0Var = sVar.z;
        int i = x9l0Var.k;
        Address h = i != -1 ? (Address) kotlin.collections.a.S(i, c.b) : x9l0Var.b() ? c.h() : c.b();
        if (h == null) {
            return;
        }
        ((pep0) sVar.f0).f(new uva(9, sVar.e0, new eal0(sVar, 0)), new ydp(z81.h(h, null), true, "clarify", null, 20), hxx.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onModalViewAppear$lambda$0(RouteSelectorModalView routeSelectorModalView) {
        routeSelectorModalView.backButton.performAccessibilityAction(64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openEntranceInput() {
        s sVar = this.presenter;
        sVar.A.b(this.params.b(), RouteSelectorAnalytics$Button.ENTRANCE);
        this.params.p.invoke(this.initialEntranceNumber);
    }

    private final void renderCirclePinSourceDestination(fal0 state) {
        getCirclePinAddressView().setTitleSpannableTextStrategy(SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_55_TEXT_SIZE);
        getCirclePinAddressView().setTitle(state.a);
        getCirclePinAddressView().setSubtitle(state.b);
        this.initialEntranceNumber = state.c;
        if (state.e) {
            appendEntrance(getCirclePinAddressView());
        } else {
            getCirclePinAddressView().setTrailView(null);
            getCirclePinAddressView().setTrailContainerClickListener(null);
        }
        applyPinStyles(getCirclePinAddressView(), state.d);
        c.w(this.addressView, getCirclePinAddressView());
        this.addressView = getCirclePinAddressView();
    }

    private final void renderNewbiesSourceDestination(gal0 state) {
        getNewbiesAddressView().render(state.a);
        c.w(this.addressView, getNewbiesAddressView());
        this.addressView = getNewbiesAddressView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderPickupFromPhotoButton$lambda$0(RouteSelectorModalView routeSelectorModalView) {
        ((m9l0) routeSelectorModalView.presenter.Dg()).openPickupFromPhoto();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAnotherAddressPicker$onSuggestSelected(s sVar, pv0 pv0Var) {
        faq0 faq0Var = sVar.B;
        x9l0 x9l0Var = sVar.z;
        SourcePicker sourcePicker = x9l0Var.a;
        faq0Var.getClass();
        zzs B = pv0Var.a.B();
        faq0Var.c(EditPointOnMapAnalytics$ActionV2.Suggest, B.a, B.b, faq0.a(sourcePicker), faq0.b(sourcePicker), null);
        int i = ial0.a[x9l0Var.a.ordinal()];
        if (i == 1 || i == 2) {
            ((com.yandex.go.clarify_address.a) sVar.V).c(true, AddressClarificationReason.Suggest);
        }
    }

    @Override // defpackage.m9l0
    public void animateVisibility(boolean visible) {
        setEnabled(visible);
        if (visible) {
            cma1.J(this);
        } else {
            cma1.M(this);
        }
    }

    @Override // defpackage.m9l0
    public void applyStyle(e430 style) {
        applyButtonStyle(style.a);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.hint.setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgMain, getContext())));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // defpackage.m9l0
    public void close() {
        dismiss();
        this.params.l.dismiss();
    }

    @Override // defpackage.m9l0
    public void confirmRoute() {
        s sVar = this.presenter;
        dkv0 dkv0Var = sVar.T;
        x9l0 x9l0Var = sVar.z;
        dkv0Var.a(new hkv0(x9l0Var.a));
        sVar.U.a(ClarifyAddressBeforeOrderOrigin.DESTINATION_ON_MAP);
        sVar.A.b(x9l0Var.b(), RouteSelectorAnalytics$Button.DONE);
        this.params.l.K();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContentView() {
        return this.content;
    }

    public boolean dismissOnTariffChanged() {
        return this.params.j;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return orh0.route_selector_modal_view_bottom_sheet;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(mrg0.modal_view_corner_radius_big, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return this.topSystemWindowInset;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new ohk0(15, this));
    }

    public final boolean isClarifyMode() {
        return this.params.h;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Mg(this);
        this.doneButton.setDebounceClickListener(new d9l0(this, 1));
        this.saveButton.setOnClickListener(new eaj0(2, this));
        this.bubbleIntersectionManager.d = this.clarifyBubbleSpace;
        ((ru.yandex.taxi.map_common.b) this.pointActionRouterConsumer).a(ru.yandex.taxi.common_models.net.map_object.s.class, getFinalizeAddressByGravityRouter());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        s sVar = this.presenter;
        sVar.A.b(sVar.z.b(), RouteSelectorAnalytics$Button.BACK);
        this.params.l.dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.doneButton.setDebounceClickListener(null);
        this.saveButton.setOnClickListener(null);
        this.bubbleIntersectionManager.d = null;
        gpb0 gpb0Var = this.pickupFromPhotoTooltipContainer;
        if (gpb0Var != null) {
            ((dt20) gpb0Var).c();
        }
        this.pickupFromPhotoTooltipContainer = null;
        ((ru.yandex.taxi.map_common.b) this.pointActionRouterConsumer).c(ru.yandex.taxi.common_models.net.map_object.s.class, getFinalizeAddressByGravityRouter());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        updateFocusRect();
        post(new d9l0(this, 3));
        s sVar = this.presenter;
        Double d = sVar.z.n;
        if (d != null) {
            double doubleValue = d.doubleValue();
            Address g = sVar.y.g();
            if (g == null) {
                return;
            }
            ((gh00) sVar.K).D(ru.yandex.taxi.map.utils.a.F(g.B()), (float) doubleValue, 300.0f, null);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        s sVar = this.presenter;
        qv10.B(sVar.z.r == RouteSelectorOpenReason.ADJUSTMENT, sVar.j0, null);
        this.focusCoordinator.Lc(RouteSelectorModalView.class, null);
        cma1.L(this.bubbleComponent);
    }

    public final void onMyLocationTapped() {
        s sVar = this.presenter;
        sVar.A.b(this.params.b(), RouteSelectorAnalytics$Button.GEO);
    }

    public final void onPickupPointTapped(wpb0 point) {
        s sVar = this.presenter;
        faq0 faq0Var = sVar.B;
        fnx0 n = ((k) sVar.M).n();
        boolean l = jl40.l(n != null ? n.d : null, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY);
        x9l0 x9l0Var = sVar.z;
        if (l) {
            EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV2 = x9l0Var.a() == PointType.DESTINATION ? EditPointOnMapAnalytics$PointTypeV2.DeliveryDestination : EditPointOnMapAnalytics$PointTypeV2.DeliverySource;
            faq0Var.getClass();
            EditPointOnMapAnalytics$ActionV2 editPointOnMapAnalytics$ActionV2 = EditPointOnMapAnalytics$ActionV2.PickupPointTap;
            zzs zzsVar = point.b;
            faq0Var.c(editPointOnMapAnalytics$ActionV2, zzsVar.a, zzsVar.b, editPointOnMapAnalytics$PointTypeV2, null, point.a);
            return;
        }
        SourcePicker sourcePicker = x9l0Var.a;
        faq0Var.getClass();
        EditPointOnMapAnalytics$ActionV2 editPointOnMapAnalytics$ActionV22 = EditPointOnMapAnalytics$ActionV2.PickupPointTap;
        zzs zzsVar2 = point.b;
        faq0Var.c(editPointOnMapAnalytics$ActionV22, zzsVar2.a, zzsVar2.b, faq0.a(sourcePicker), faq0.b(sourcePicker), point.a);
    }

    @Override // defpackage.m9l0
    public void onPinRectForBubbleChanged(Rect rect, boolean anim) {
        int height = rect.top - getHeight();
        BubbleComponent bubbleComponent = this.bubbleComponent;
        if (anim) {
            bubbleComponent.animate().setDuration(200L).translationY(height);
        } else {
            bubbleComponent.setTranslationY(height);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this.bubbleComponent.getTranslationY() == 0.0f) {
            this.bubbleComponent.setTranslationY(-getHeight());
        } else {
            onPinRectForBubbleChanged(this.focusCoordinator.Gf(), true);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // defpackage.m9l0
    public void openPickupFromPhoto() {
        this.params.l.openPickupFromPhoto();
    }

    @Override // defpackage.m9l0
    public void renderPickupFromPhotoButton(Bitmap image, String contentDescription, String tooltipText) {
        RotatableFloatButton rotatableFloatButton = this.pickupFromPhotoButton;
        rotatableFloatButton.setImageDrawable(new BitmapDrawable(rotatableFloatButton.getResources(), image));
        this.pickupFromPhotoButton.setContentDescription(contentDescription);
        c.z(new e9l0(this, 2), this.pickupFromPhotoButton);
        this.pickupFromPhotoButton.setVisibility(0);
        renderPickupFromPhotoTooltip(tooltipText);
    }

    @Override // defpackage.m9l0
    public void renderPickupFromPhotoTooltip(String tooltipText) {
        gpb0 gpb0Var = this.pickupFromPhotoTooltipContainer;
        if (tooltipText == null) {
            if (gpb0Var != null) {
                ((dt20) gpb0Var).a(false);
            }
            gpb0 gpb0Var2 = this.pickupFromPhotoTooltipContainer;
            if (gpb0Var2 != null) {
                ((dt20) gpb0Var2).c();
            }
            this.pickupFromPhotoTooltipContainer = null;
            return;
        }
        if (gpb0Var == null) {
            jpb0 jpb0Var = this.pickupFromPhotoTooltipFactory;
            int i = nfh0.root_frame_layout;
            WeakHashMap weakHashMap = b.a;
            FrameLayout frameLayout = (FrameLayout) ((View) rp31.d(this, i));
            ((kpb0) jpb0Var).getClass();
            dt20 dt20Var = new dt20(frameLayout);
            this.pickupFromPhotoTooltipContainer = dt20Var;
            RotatableFloatButton rotatableFloatButton = this.pickupFromPhotoButton;
            PickupFromPhotoTooltipContainer$TooltipPointerAlignment pickupFromPhotoTooltipContainer$TooltipPointerAlignment = PickupFromPhotoTooltipContainer$TooltipPointerAlignment.START;
            dt20Var.p(rotatableFloatButton, tooltipText);
            gpb0 gpb0Var3 = this.pickupFromPhotoTooltipContainer;
            if (gpb0Var3 != null) {
                ((dt20) gpb0Var3).a(true);
            }
        }
    }

    @Override // defpackage.m9l0
    public void renderSourceDestination(hal0 state) {
        if (state instanceof fal0) {
            renderCirclePinSourceDestination((fal0) state);
        } else {
            if (!(state instanceof gal0)) {
                w511.b();
                return;
            }
            renderNewbiesSourceDestination((gal0) state);
        }
        s sVar = this.presenter;
        FloatButtonHolderLayout floatButtonHolderLayout = this.floatButtonLayoutHolder;
        int i = nfh0.root_frame_layout;
        WeakHashMap weakHashMap = b.a;
        sVar.Lg(floatButtonHolderLayout, state, (FrameLayout) ((View) rp31.d(this, i)), this.params.l.t2());
    }

    @Override // defpackage.m9l0
    public void setBubbleText(CharSequence text, boolean progress) {
        this.bubbleTextComponent.setText(text);
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.bubbleTextComponent;
        if (progress) {
            shimmeringRobotoTextView.startAnimation();
        } else {
            shimmeringRobotoTextView.stopAnimation();
        }
        if (text == null || text.length() == 0) {
            cma1.L(this.bubbleComponent);
        } else {
            cma1.J(this.bubbleComponent);
        }
    }

    @Override // defpackage.m9l0
    public void setDoneButtonEnabled(boolean enabled) {
        this.doneButton.setEnabled(enabled);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled || isEnabled()) {
            return;
        }
        updateFocusRect();
    }

    @Override // defpackage.m9l0
    public void setSaveButtonVisible(boolean visible) {
        this.saveButton.setVisibility(visible ? 0 : 8);
    }

    @Override // defpackage.m9l0
    public void showAddressAdjustment() {
        this.params.l.showAddressAdjustment();
    }

    @Override // defpackage.m9l0
    public void showAnotherAddressPicker(PointType pointType) {
        this.params.l.o3(pointType, new qa0(21, this.presenter));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void updateAnchoredHeight(boolean settle) {
        super.updateAnchoredHeight(settle);
        if (isEnabled()) {
            updateFocusRect();
        }
    }

    public final void updateFocusRect() {
        if (isEnabled()) {
            this.focusCoordinator.Td(getContentHeight(), RouteSelectorModalView.class);
        }
    }
}
