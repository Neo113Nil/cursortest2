package ru.yandex.taxi.address.design;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.adh0;
import defpackage.bct0;
import defpackage.cct0;
import defpackage.cma1;
import defpackage.dct0;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fph0;
import defpackage.hg;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.kq0;
import defpackage.ktg;
import defpackage.kyh0;
import defpackage.lct0;
import defpackage.m8t0;
import defpackage.mct0;
import defpackage.mq0;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.o1d;
import defpackage.pqk0;
import defpackage.qgu0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tqk0;
import defpackage.uqk0;
import defpackage.vng;
import defpackage.vqk0;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xqg0;
import defpackage.yyg0;
import defpackage.zxf0;
import defpackage.zy11;
import defpackage.zyg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.AddressAutofitHelper$ExtraSuffixType;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;
import ru.yandex.taxi.design.sourcedestination.SourceTrailMode;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ShimmeringPaint;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006¥\u0001¦\u0001§\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\rH\u0014¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\rH\u0014¢\u0006\u0004\b\"\u0010\u001fJ7\u0010)\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020#H\u0016¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u00020#¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020#¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\r2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\r2\u0006\u0010?\u001a\u00020\u0006¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\rH\u0002¢\u0006\u0004\bB\u0010\u001fJ\u000f\u0010C\u001a\u00020\rH\u0002¢\u0006\u0004\bC\u0010\u001fJ\u000f\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\bD\u0010\u001fJ\u0019\u0010F\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bF\u0010GJ#\u0010K\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010\u00102\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bK\u0010LJ!\u0010P\u001a\u00020O2\u0006\u0010H\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\rH\u0002¢\u0006\u0004\bR\u0010\u001fJ\u000f\u0010S\u001a\u00020\rH\u0002¢\u0006\u0004\bS\u0010\u001fJ\u000f\u0010T\u001a\u00020\rH\u0002¢\u0006\u0004\bT\u0010\u001fJ\u0017\u0010W\u001a\u00020\r2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\r2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J#\u0010_\u001a\u00020\r2\b\u0010]\u001a\u0004\u0018\u00010\u00102\b\u0010^\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b_\u0010\u0014J5\u0010d\u001a\u00020\r2\b\u0010`\u001a\u0004\u0018\u00010\u00102\b\u0010a\u001a\u0004\u0018\u00010\u00102\b\u0010b\u001a\u0004\u0018\u00010M2\u0006\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010kR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR$\u0010q\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010x\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010\u0085\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0085\u0001R\u0019\u0010\u0087\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0093\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0096\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0096\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0096\u0001R\u0019\u0010 \u0001\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0096\u0001R\u0015\u0010¤\u0001\u001a\u00030¡\u00018F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001¨\u0006¨\u0001"}, d2 = {"Lru/yandex/taxi/address/design/SourceDestinationComponent;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "sourceSimpleDrawable", "destinationSimpleDrawable", "Lzy11;", "applyDrawables", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "", "addressTitle", "porchNumber", "setSourceAddress", "(Ljava/lang/String;Ljava/lang/String;)V", "numberOfPoints", "setDestinationAddresses", "(Ljava/lang/String;I)V", "Lqgu0;", "stopPointsDelegate", "setStopPointsDelegate", "(Lqgu0;)Lru/yandex/taxi/address/design/SourceDestinationComponent;", "startDestinationProgressAnimation", "()Lru/yandex/taxi/address/design/SourceDestinationComponent;", "startProgressAnimation", "()V", "stopProgressAnimation", "onAttachedToWindow", "onDetachedFromWindow", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "()Z", "animate", "setAnimateLayoutChanged", "(Z)Lru/yandex/taxi/address/design/SourceDestinationComponent;", "hideKeyboardOnDetach", "setHideKeyboardOnDetach", "(Z)V", "Lmct0;", "newModel", "render", "(Lmct0;)V", "minHeight", "setInputMinHeight", "(I)V", "init", "applyDestinationContentDescription", "applyDestinationTitle", "pickupTime", "applyPickupTime", "(Ljava/lang/String;)V", "routeTime", "Lpqk0;", "drawable", "applyRouteTime", "(Ljava/lang/String;Lpqk0;)V", "", "rideTimeAppearance", "Lkq0;", "appendIconIfExist", "(Ljava/lang/CharSequence;Lpqk0;)Lkq0;", "applyDividers", "applyMode", "invalidateProgressAnimation", "Lru/yandex/taxi/design/sourcedestination/SourceTrailMode;", "sourceTrailMode", "applySourceTrailMode", "(Lru/yandex/taxi/design/sourcedestination/SourceTrailMode;)V", "Lru/yandex/taxi/design/sourcedestination/DestinationTrailMode;", "destinationTrailMode", "applyDestinationTrailMode", "(Lru/yandex/taxi/design/sourcedestination/DestinationTrailMode;)V", "sourceAddress", "sourceSubtitle", "applySourceAddress", "destinationAddress", "destinationAddressSubtitle", "destinationHint", "numberOfDestinationPoints", "applyDestinationAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;I)V", "Lo1d;", "binding", "Lo1d;", "Lru/yandex/taxi/design/AddressInputComponent;", "sourceAddressComponent", "Lru/yandex/taxi/design/AddressInputComponent;", "destinationAddressComponent", "Lru/yandex/taxi/design/ButtonComponent;", "trailButton", "Lru/yandex/taxi/design/ButtonComponent;", "Lru/yandex/taxi/address/design/SourceDestinationComponent$a;", "sourceDestinationListener", "Lru/yandex/taxi/address/design/SourceDestinationComponent$a;", "getSourceDestinationListener", "()Lru/yandex/taxi/address/design/SourceDestinationComponent$a;", "setSourceDestinationListener", "(Lru/yandex/taxi/address/design/SourceDestinationComponent$a;)V", "Lru/yandex/taxi/address/design/SourceDestinationComponent$AddDestinationListener;", "destinationTrailClickListener", "Lru/yandex/taxi/address/design/SourceDestinationComponent$AddDestinationListener;", "getDestinationTrailClickListener", "()Lru/yandex/taxi/address/design/SourceDestinationComponent$AddDestinationListener;", "setDestinationTrailClickListener", "(Lru/yandex/taxi/address/design/SourceDestinationComponent$AddDestinationListener;)V", "Lru/yandex/taxi/address/design/SourceDestinationComponent$SourceTrailClickListener;", "sourceTrailClickListener", "Lru/yandex/taxi/address/design/SourceDestinationComponent$SourceTrailClickListener;", "getSourceTrailClickListener", "()Lru/yandex/taxi/address/design/SourceDestinationComponent$SourceTrailClickListener;", "setSourceTrailClickListener", "(Lru/yandex/taxi/address/design/SourceDestinationComponent$SourceTrailClickListener;)V", "Landroid/graphics/drawable/Drawable;", "destinationNoStopPointsDrawable", "hasProgressAnimation", "Z", "srcDstModel", "Lmct0;", "Lktg;", "routeTimeDebouncer", "Lktg;", "Ltqk0;", "rideTimeSpanFactory", "Ltqk0;", "Lmq0;", "sourceAutofitHelper", "Lmq0;", "destinationAutofitHelper", "simpleColorAttr", CA20Status.STATUS_USER_I, "chevronRes", "addDestinationRes", "addDestinationDescriptionRes", "Ljava/lang/String;", "addDestinationEndMargin", "Lru/yandex/taxi/widget/ShimmeringPaint;", "shimmeringPaint", "Lru/yandex/taxi/widget/ShimmeringPaint;", "sourceTextColorAttr", "destinationTextColorAttr", "Llct0;", "getRenderModelBuilder", "()Llct0;", "renderModelBuilder", "a", "AddDestinationListener", "SourceTrailClickListener", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourceDestinationComponent extends DividerAwareComponent {
    private final String addDestinationDescriptionRes;
    private final int addDestinationEndMargin;
    private final int addDestinationRes;
    private final o1d binding;
    private final int chevronRes;
    private final AddressInputComponent destinationAddressComponent;
    private final mq0 destinationAutofitHelper;
    private Drawable destinationNoStopPointsDrawable;
    private Drawable destinationSimpleDrawable;
    private int destinationTextColorAttr;
    private AddDestinationListener destinationTrailClickListener;
    private boolean hasProgressAnimation;
    private final tqk0 rideTimeSpanFactory;
    private final ktg routeTimeDebouncer;
    private ShimmeringPaint shimmeringPaint;
    private final int simpleColorAttr;
    private final AddressInputComponent sourceAddressComponent;
    private final mq0 sourceAutofitHelper;
    private a sourceDestinationListener;
    private Drawable sourceSimpleDrawable;
    private int sourceTextColorAttr;
    private SourceTrailClickListener sourceTrailClickListener;
    private mct0 srcDstModel;
    private final ButtonComponent trailButton;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/address/design/SourceDestinationComponent$AddDestinationListener;", "Landroid/view/View$OnClickListener;", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface AddDestinationListener extends View.OnClickListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/address/design/SourceDestinationComponent$SourceTrailClickListener;", "Landroid/view/View$OnClickListener;", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface SourceTrailClickListener extends View.OnClickListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/address/design/SourceDestinationComponent$a;", "Lzxf0;", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface a extends zxf0 {
        void Y();

        void x0();
    }

    public SourceDestinationComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(fph0.component_source_destination, this);
        int i2 = adh0.address_divider;
        View O = cma1.O(i2, this);
        if (O != null) {
            i2 = adh0.component_destination_address;
            AddressInputComponent addressInputComponent = (AddressInputComponent) cma1.O(i2, this);
            if (addressInputComponent != null) {
                i2 = adh0.component_source_address;
                AddressInputComponent addressInputComponent2 = (AddressInputComponent) cma1.O(i2, this);
                if (addressInputComponent2 != null) {
                    this.binding = new o1d(this, O, addressInputComponent, addressInputComponent2);
                    this.sourceAddressComponent = addressInputComponent2;
                    this.destinationAddressComponent = addressInputComponent;
                    this.trailButton = (ButtonComponent) LayoutInflater.from(context).inflate(fph0.source_destination_component_trail_button, (ViewGroup) this, false);
                    this.sourceSimpleDrawable = vng.t(yyg0.ic_order_card_source, getContext());
                    this.routeTimeDebouncer = new ktg();
                    this.rideTimeSpanFactory = new tqk0(context);
                    int i3 = xng0.textMain;
                    this.simpleColorAttr = i3;
                    this.chevronRes = f1h0.ic_keyboard_arrow_right_icon_main_24dp;
                    this.addDestinationRes = zyg0.ic_add_destination;
                    this.addDestinationDescriptionRes = getContext().getString(kyh0.add_route_stop);
                    this.addDestinationEndMargin = tje.u(4, getContext());
                    this.sourceTextColorAttr = i3;
                    this.destinationTextColorAttr = i3;
                    this.srcDstModel = new mct0(null, null, SourceTrailMode.NONE, null, null, DestinationTrailMode.NONE, "", "", "", null, null, 0);
                    mq0 createAutofitHelper = addressInputComponent2.createAutofitHelper();
                    createAutofitHelper.a.d(14.0f, 1);
                    createAutofitHelper.a.c(true);
                    createAutofitHelper.g = getContext().getString(kyh0.new_mainscreen_from);
                    createAutofitHelper.k = this.srcDstModel.h;
                    this.sourceAutofitHelper = createAutofitHelper;
                    hg.a(addressInputComponent2);
                    mq0 createAutofitHelper2 = addressInputComponent.createAutofitHelper();
                    createAutofitHelper2.a.d(14.0f, 1);
                    createAutofitHelper2.a.c(true);
                    createAutofitHelper2.e = getContext().getString(kyh0.time_to_arrive_content_description);
                    createAutofitHelper2.d = new bct0(this, 0);
                    createAutofitHelper2.g = getContext().getString(kyh0.select_address_to);
                    this.destinationAutofitHelper = createAutofitHelper2;
                    hg.a(addressInputComponent);
                    setBackground(vng.t(dzg0.bg_transparent_ripple, context));
                    init();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kq0 _init_$lambda$0(SourceDestinationComponent sourceDestinationComponent) {
        String str = sourceDestinationComponent.srcDstModel.i;
        if (str == null) {
            str = "";
        }
        return sourceDestinationComponent.appendIconIfExist(str.replace(HexString.CHAR_SPACE, (char) 160), sourceDestinationComponent.srcDstModel.k);
    }

    private final kq0 appendIconIfExist(CharSequence routeTime, pqk0 rideTimeAppearance) {
        if (evu0.J(routeTime)) {
            return new kq0(routeTime, AddressAutofitHelper$ExtraSuffixType.PLAIN_TEXT);
        }
        if (!(rideTimeAppearance instanceof vqk0)) {
            return rideTimeAppearance instanceof uqk0 ? this.rideTimeSpanFactory.b(routeTime, ((uqk0) rideTimeAppearance).a) : new kq0(routeTime, AddressAutofitHelper$ExtraSuffixType.PLAIN_TEXT);
        }
        tqk0 tqk0Var = this.rideTimeSpanFactory;
        vqk0 vqk0Var = (vqk0) rideTimeAppearance;
        Drawable drawable = vqk0Var.a;
        kdc kdcVar = vqk0Var.b;
        int m = kdcVar != null ? s8o.m(kdcVar, getContext()) : getContext().getColor(xqg0.orange_normal);
        kdc kdcVar2 = vqk0Var.c;
        int m2 = kdcVar2 != null ? s8o.m(kdcVar2, getContext()) : getContext().getColor(mqg0.white);
        kdc kdcVar3 = vqk0Var.d;
        return tqk0Var.a(routeTime, drawable, m, m2, kdcVar3 != null ? s8o.m(kdcVar3, getContext()) : getContext().getColor(mqg0.white));
    }

    private final void applyDestinationAddress(String destinationAddress, String destinationAddressSubtitle, CharSequence destinationHint, int numberOfDestinationPoints) {
        mq0 mq0Var = this.destinationAutofitHelper;
        mq0Var.j = destinationAddress;
        mq0Var.l = destinationAddress;
        mq0Var.h = destinationAddress;
        mq0Var.i = numberOfDestinationPoints;
        mq0Var.b();
        applyDestinationAddress$applyDestinationLeadImage(this, destinationAddress);
        this.destinationAddressComponent.setHint(destinationHint);
        this.srcDstModel = mct0.a(this.srcDstModel, null, null, destinationAddressSubtitle, null, null, 0, 4079);
        this.destinationAddressComponent.setSubtitle(destinationAddressSubtitle);
    }

    private static final void applyDestinationAddress$applyDestinationLeadImage(SourceDestinationComponent sourceDestinationComponent, String str) {
        AddressInputComponent addressInputComponent = sourceDestinationComponent.destinationAddressComponent;
        if (str == null || str.length() == 0) {
            Drawable drawable = sourceDestinationComponent.destinationNoStopPointsDrawable;
            if (drawable != null) {
                addressInputComponent.setLeadImage(drawable);
                return;
            }
            return;
        }
        Drawable drawable2 = sourceDestinationComponent.destinationSimpleDrawable;
        if (drawable2 != null) {
            addressInputComponent.setLeadImage(drawable2);
        }
    }

    private final void applyDestinationContentDescription() {
        setContentDescription(null);
    }

    private final void applyDestinationTitle() {
        this.destinationAddressComponent.setTitle((CharSequence) null);
    }

    private final void applyDestinationTrailMode(DestinationTrailMode destinationTrailMode) {
        int i = dct0.b[destinationTrailMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            AddressInputComponent addressInputComponent = this.destinationAddressComponent;
            addressInputComponent.setTrailImage((Drawable) null);
            addressInputComponent.setTrailEndMargin(0);
            addressInputComponent.setTrailText((CharSequence) null);
            addressInputComponent.setTrailClickable(false);
            addressInputComponent.applyTrailTextRobust();
            addressInputComponent.setTrailImportantForAccessibility(false);
            return;
        }
        AddressInputComponent addressInputComponent2 = this.destinationAddressComponent;
        addressInputComponent2.setTrailImage(this.addDestinationRes);
        addressInputComponent2.setTrailEndMargin(this.addDestinationEndMargin);
        addressInputComponent2.setTrailText((CharSequence) null);
        addressInputComponent2.setTrailClickable(true);
        addressInputComponent2.applyTrailTextRobust();
        addressInputComponent2.setTrailImportantForAccessibility(true);
        View trailView = addressInputComponent2.getTrailView();
        if (trailView != null) {
            trailView.setContentDescription(this.addDestinationDescriptionRes);
        }
    }

    private final void applyDividers() {
        this.destinationAddressComponent.setDividers(DividerPosition.TOP, DividerType.ICON);
    }

    private final void applyMode() {
        AddressInputComponent addressInputComponent = this.sourceAddressComponent;
        AddressInputComponent.Mode mode = AddressInputComponent.Mode.VIEW;
        addressInputComponent.setMode(mode);
        addressInputComponent.setAddressTextColorAttr(this.sourceTextColorAttr);
        addressInputComponent.setComponentEnabled(true);
        AddressInputComponent addressInputComponent2 = this.destinationAddressComponent;
        addressInputComponent2.setMode(mode);
        addressInputComponent2.setComponentEnabled(true);
        addressInputComponent2.setAddressTextColorAttr(this.destinationTextColorAttr);
    }

    private final void applyPickupTime(String pickupTime) {
        mq0 mq0Var = this.sourceAutofitHelper;
        mq0Var.k = pickupTime;
        mq0Var.b();
    }

    private final void applyRouteTime(String routeTime, pqk0 drawable) {
        this.srcDstModel = mct0.a(this.srcDstModel, null, null, null, routeTime, drawable, 0, 2815);
        this.routeTimeDebouncer.a();
        if (routeTime == null || routeTime.length() == 0) {
            ktg ktgVar = this.routeTimeDebouncer;
            m8t0 m8t0Var = new m8t0(3, this);
            ktgVar.a();
            ktgVar.b = m8t0Var;
            ktgVar.a.postDelayed(m8t0Var, 200L);
        } else {
            this.destinationAddressComponent.setSubtitle(this.srcDstModel.e);
        }
        mq0 mq0Var = this.destinationAutofitHelper;
        mq0Var.getClass();
        mq0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyRouteTime$lambda$0(SourceDestinationComponent sourceDestinationComponent) {
        sourceDestinationComponent.destinationAddressComponent.setSubtitle(sourceDestinationComponent.srcDstModel.e);
    }

    private final void applySourceAddress(String sourceAddress, String sourceSubtitle) {
        this.sourceAddressComponent.setLeadImage(this.sourceSimpleDrawable);
        AddressInputComponent addressInputComponent = this.sourceAddressComponent;
        addressInputComponent.setTitle((CharSequence) null);
        addressInputComponent.setSubtitle(sourceSubtitle);
        addressInputComponent.setHint((CharSequence) null);
        addressInputComponent.setAddress(sourceAddress);
        addressInputComponent.setContentDescription(addressInputComponent.getResources().getString(kyh0.summory_route_point_description, addressInputComponent.getResources().getString(kyh0.pin_a_name)) + "," + sourceAddress);
        mq0 mq0Var = this.sourceAutofitHelper;
        mq0Var.j = sourceAddress;
        mq0Var.l = sourceAddress;
        mq0Var.h = sourceAddress;
        mq0Var.i = 1;
        mq0Var.b();
    }

    private final void applySourceTrailMode(SourceTrailMode sourceTrailMode) {
        int i = dct0.a[sourceTrailMode.ordinal()];
        int i2 = 2;
        if (i == 1) {
            AddressInputComponent addressInputComponent = this.sourceAddressComponent;
            addressInputComponent.setTrailView(this.trailButton);
            addressInputComponent.setTrailDividerVisibility(false);
            this.trailButton.setDebounceClickListener(new cct0(this, addressInputComponent, i2));
            this.trailButton.setText(addressInputComponent.getResources().getString(kyh0.summary_porch_button_label));
            return;
        }
        if (i == 2) {
            AddressInputComponent addressInputComponent2 = this.sourceAddressComponent;
            addressInputComponent2.setTrailImage(this.chevronRes);
            addressInputComponent2.setTrailText((CharSequence) null);
            addressInputComponent2.setTrailEndMargin(0);
            addressInputComponent2.setTrailDividerVisibility(false);
            addressInputComponent2.setTrailClickable(true);
            return;
        }
        if (i != 3) {
            w511.b();
            return;
        }
        AddressInputComponent addressInputComponent3 = this.sourceAddressComponent;
        addressInputComponent3.setTrailView(null);
        addressInputComponent3.setTrailImage((Drawable) null);
        addressInputComponent3.setTrailText((CharSequence) null);
        addressInputComponent3.setTrailEndMargin(0);
        addressInputComponent3.setTrailDividerVisibility(false);
        addressInputComponent3.setTrailClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applySourceTrailMode$lambda$0$0(SourceDestinationComponent sourceDestinationComponent, AddressInputComponent addressInputComponent) {
        SourceTrailClickListener sourceTrailClickListener = sourceDestinationComponent.sourceTrailClickListener;
        if (sourceTrailClickListener != null) {
            sourceTrailClickListener.onClick(addressInputComponent);
        }
    }

    private final void init() {
        setInputMinHeight(tje.u(64, getContext()));
        applyMode();
        applySourceTrailMode(this.srcDstModel.c);
        mct0 mct0Var = this.srcDstModel;
        applySourceAddress(mct0Var.a, mct0Var.b);
        applyDestinationTrailMode(this.srcDstModel.f);
        applyDestinationContentDescription();
        mct0 mct0Var2 = this.srcDstModel;
        applyDestinationAddress(mct0Var2.d, mct0Var2.e, mct0Var2.g, mct0Var2.l);
        applyDestinationTitle();
        mct0 mct0Var3 = this.srcDstModel;
        applyRouteTime(mct0Var3.i, mct0Var3.k);
        applyDividers();
    }

    private final void invalidateProgressAnimation() {
        if (!this.hasProgressAnimation) {
            this.shimmeringPaint = null;
            return;
        }
        ShimmeringPaint shimmeringPaint = new ShimmeringPaint(getContext());
        shimmeringPaint.updateOffset(this);
        this.shimmeringPaint = shimmeringPaint;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0$0(SourceDestinationComponent sourceDestinationComponent) {
        a aVar = sourceDestinationComponent.sourceDestinationListener;
        if (aVar != null) {
            aVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$1(SourceDestinationComponent sourceDestinationComponent, AddressInputComponent addressInputComponent) {
        SourceTrailClickListener sourceTrailClickListener = sourceDestinationComponent.sourceTrailClickListener;
        if (sourceTrailClickListener != null) {
            sourceTrailClickListener.onClick(addressInputComponent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$1$0(SourceDestinationComponent sourceDestinationComponent) {
        a aVar = sourceDestinationComponent.sourceDestinationListener;
        if (aVar != null) {
            aVar.x0();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1$1(SourceDestinationComponent sourceDestinationComponent, AddressInputComponent addressInputComponent) {
        AddDestinationListener addDestinationListener = sourceDestinationComponent.destinationTrailClickListener;
        if (addDestinationListener != null) {
            addDestinationListener.onClick(addressInputComponent);
        }
    }

    public final void applyDrawables(Drawable sourceSimpleDrawable, Drawable destinationSimpleDrawable) {
        this.sourceAddressComponent.setLeadImage(sourceSimpleDrawable);
        this.sourceSimpleDrawable = sourceSimpleDrawable;
        String str = this.srcDstModel.d;
        if (str == null || str.length() == 0) {
            Drawable drawable = this.destinationNoStopPointsDrawable;
            if (drawable != null) {
                this.destinationAddressComponent.setLeadImage(drawable);
            }
        } else if (destinationSimpleDrawable != null) {
            this.destinationAddressComponent.setLeadImage(destinationSimpleDrawable);
        }
        this.destinationSimpleDrawable = destinationSimpleDrawable;
    }

    @Override // ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyMode();
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // ru.yandex.taxi.design.DividerAwareComponent, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ShimmeringPaint shimmeringPaint = this.shimmeringPaint;
        if (shimmeringPaint != null) {
            shimmeringPaint.updateShimmering();
            canvas.drawPaint(shimmeringPaint);
            postInvalidateOnAnimation();
        }
    }

    public final AddDestinationListener getDestinationTrailClickListener() {
        return this.destinationTrailClickListener;
    }

    public final lct0 getRenderModelBuilder() {
        return this.srcDstModel.b();
    }

    public final a getSourceDestinationListener() {
        return this.sourceDestinationListener;
    }

    public final SourceTrailClickListener getSourceTrailClickListener() {
        return this.sourceTrailClickListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AddressInputComponent addressInputComponent = this.sourceAddressComponent;
        int i = 1;
        c.z(new bct0(this, i), addressInputComponent);
        addressInputComponent.setOnTrailClickListener(new cct0(this, addressInputComponent, 0));
        AddressInputComponent addressInputComponent2 = this.destinationAddressComponent;
        c.z(new bct0(this, 2), addressInputComponent2);
        addressInputComponent2.setOnTrailClickListener(new cct0(this, addressInputComponent2, i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AddressInputComponent addressInputComponent = this.sourceAddressComponent;
        addressInputComponent.setOnClickListener(null);
        addressInputComponent.setOnTrailClickListener(null);
        AddressInputComponent addressInputComponent2 = this.destinationAddressComponent;
        addressInputComponent2.setOnClickListener(null);
        addressInputComponent2.setOnTrailClickListener(null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ShimmeringPaint shimmeringPaint = this.shimmeringPaint;
        if (shimmeringPaint != null) {
            shimmeringPaint.updateOffset(this);
        }
    }

    public final void render(mct0 newModel) {
        mct0 mct0Var;
        mct0 mct0Var2;
        mct0 mct0Var3;
        mct0 mct0Var4;
        applyMode();
        mct0 mct0Var5 = this.srcDstModel;
        if (mct0Var5 == null || !jl40.l(newModel.c, mct0Var5.c)) {
            applySourceTrailMode(newModel.c);
        }
        mct0 mct0Var6 = this.srcDstModel;
        if (mct0Var6 == null || !jl40.l(newModel.a, mct0Var6.a) || (mct0Var4 = this.srcDstModel) == null || !jl40.l(newModel.b, mct0Var4.b)) {
            applySourceAddress(newModel.a, newModel.b);
        }
        mct0 mct0Var7 = this.srcDstModel;
        if (mct0Var7 == null || !jl40.l(newModel.f, mct0Var7.f)) {
            applyDestinationTrailMode(newModel.f);
        }
        mct0 mct0Var8 = this.srcDstModel;
        if (mct0Var8 == null || !jl40.l(newModel.d, mct0Var8.d) || (mct0Var2 = this.srcDstModel) == null || !jl40.l(newModel.e, mct0Var2.e) || (mct0Var3 = this.srcDstModel) == null || newModel.l != mct0Var3.l || mct0Var3 == null || !jl40.l(newModel.g, mct0Var3.g)) {
            applyDestinationAddress(newModel.d, newModel.e, newModel.g, newModel.l);
        }
        mct0 mct0Var9 = this.srcDstModel;
        if (mct0Var9 == null || !jl40.l(newModel.i, mct0Var9.i) || (mct0Var = this.srcDstModel) == null || !jl40.l(newModel.k, mct0Var.k)) {
            applyRouteTime(newModel.i, newModel.k);
        }
        mct0 mct0Var10 = this.srcDstModel;
        if (mct0Var10 == null || !jl40.l(newModel.h, mct0Var10.h)) {
            applyPickupTime(newModel.h);
        }
        applyDividers();
        this.srcDstModel = newModel;
    }

    public final SourceDestinationComponent setAnimateLayoutChanged(boolean animate) {
        this.sourceAddressComponent.setAnimateLayoutChanges(animate);
        this.destinationAddressComponent.setAnimateLayoutChanges(animate);
        return this;
    }

    public final void setDestinationAddresses(String addressTitle, int numberOfPoints) {
        render(mct0.a(this.srcDstModel, null, addressTitle, null, null, null, numberOfPoints, 2039));
    }

    public final void setDestinationTrailClickListener(AddDestinationListener addDestinationListener) {
        this.destinationTrailClickListener = addDestinationListener;
    }

    public final void setHideKeyboardOnDetach(boolean hideKeyboardOnDetach) {
        this.sourceAddressComponent.setHideKeyboardOnDetach(hideKeyboardOnDetach);
        this.destinationAddressComponent.setHideKeyboardOnDetach(hideKeyboardOnDetach);
    }

    public final void setInputMinHeight(int minHeight) {
        this.sourceAddressComponent.setMinimumHeight(minHeight);
        this.destinationAddressComponent.setMinimumHeight(minHeight);
    }

    public final void setSourceAddress(String addressTitle, String porchNumber) {
        render(mct0.a(this.srcDstModel, c.H(this, kyh0.summary_address_with_porch_number_template, addressTitle, porchNumber), null, null, null, null, 0, 4094));
    }

    public final void setSourceDestinationListener(a aVar) {
        this.sourceDestinationListener = aVar;
    }

    public final void setSourceTrailClickListener(SourceTrailClickListener sourceTrailClickListener) {
        this.sourceTrailClickListener = sourceTrailClickListener;
    }

    public final SourceDestinationComponent setStopPointsDelegate(qgu0 stopPointsDelegate) {
        this.destinationNoStopPointsDrawable = stopPointsDelegate.b();
        this.destinationSimpleDrawable = stopPointsDelegate.a();
        mct0 mct0Var = this.srcDstModel;
        applyDestinationAddress(mct0Var.d, mct0Var.e, mct0Var.g, mct0Var.l);
        return this;
    }

    public final SourceDestinationComponent startDestinationProgressAnimation() {
        this.destinationAddressComponent.startTrailProgressAnimation();
        return this;
    }

    public final void startProgressAnimation() {
        this.hasProgressAnimation = true;
        invalidateProgressAnimation();
    }

    public final void stopProgressAnimation() {
        this.hasProgressAnimation = false;
        invalidateProgressAnimation();
    }

    public SourceDestinationComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SourceDestinationComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SourceDestinationComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
