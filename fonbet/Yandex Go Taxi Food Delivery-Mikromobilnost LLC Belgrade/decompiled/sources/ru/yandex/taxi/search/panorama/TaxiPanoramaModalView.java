package ru.yandex.taxi.search.panorama;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import defpackage.a2i0;
import defpackage.a8y0;
import defpackage.aqt;
import defpackage.c8y0;
import defpackage.cma1;
import defpackage.dna;
import defpackage.dqt;
import defpackage.dzg0;
import defpackage.eph0;
import defpackage.f1h0;
import defpackage.glr;
import defpackage.ho4;
import defpackage.hrg0;
import defpackage.i3y;
import defpackage.i7z;
import defpackage.ifq0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.l8y0;
import defpackage.m8y0;
import defpackage.mrg0;
import defpackage.mse;
import defpackage.mth;
import defpackage.n8y0;
import defpackage.ny61;
import defpackage.o8y0;
import defpackage.ofp0;
import defpackage.oyr;
import defpackage.pb90;
import defpackage.pzt0;
import defpackage.q8y0;
import defpackage.r19;
import defpackage.r8y0;
import defpackage.rju;
import defpackage.s8y0;
import defpackage.t8y0;
import defpackage.tb90;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8w;
import defpackage.u8y0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wb90;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y8y0;
import defpackage.zch0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.panorama.PanoramaAnalytics$PanoramaPinType;
import ru.yandex.taxi.panorama.PanoramaAnalytics$UserInteractAction;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001mB9\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0014¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010\u001aJ\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010(J\u0017\u0010.\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001cH\u0002¢\u0006\u0004\b0\u0010\u001eJ\u000f\u00101\u001a\u00020\u0018H\u0002¢\u0006\u0004\b1\u0010\u001aJ\u000f\u00102\u001a\u00020\u0018H\u0002¢\u0006\u0004\b2\u0010\u001aJ\u000f\u00103\u001a\u00020\u0018H\u0002¢\u0006\u0004\b3\u0010\u001aJ+\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001c062\u0006\u0010&\u001a\u00020%2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0018H\u0002¢\u0006\u0004\b:\u0010\u001aJ\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020)*\u00020)H\u0002¢\u0006\u0004\b>\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010@R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR\u001a\u0010\f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010B\u0012\u0004\bC\u0010\u001aR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010RR\"\u0010U\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020D0T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u0002040W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010K\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010n\u001a\u00060mR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lru/yandex/taxi/search/panorama/TaxiPanoramaModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lo8y0;", "Ly8y0;", "taxiPanoramaPresenter", "Ls8y0;", "payload", "Landroid/content/Context;", "context", "Ldqt;", "goPanoramaViewFactory", "Ltse;", "mainScope", "<init>", "(Ly8y0;Ls8y0;Landroid/content/Context;Ldqt;Ltse;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo8y0;", "Lq8y0;", "createPickupPointView", "()Lq8y0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "hasCustomBackground", "()Z", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onBackPressed", "showPanorama", "Lwb90;", "panoramaInfo", "refreshTooltip", "(Lwb90;)V", "", "angle", "normalizeAngle", "(D)D", "movePanoramaPin", "isMoveAwayFromStartPoint", "(Lwb90;)Z", "isPickupPointSelected", "clearPickupPoints", "renderPickupPoints", "renderDescription", "Lzzs;", "pinGeoPosition", "Lkotlin/Pair;", "Landroid/graphics/PointF;", "calculateScreenPoint", "(Lwb90;Lzzs;)Lkotlin/Pair;", "initCloseButton", "", "getCurrentPanoramaId", "()Ljava/lang/String;", "inRad", "Ly8y0;", "Ls8y0;", "Ldqt;", "Ltse;", "getMainScope$annotations", "Lt8y0;", "selectedPickupPoint", "Lt8y0;", "lastPanoramaInfo", "Lwb90;", "Lcom/yandex/go/design/view/GoFrameLayout;", "frameLayoutPickupPoint$delegate", "Li3y;", "getFrameLayoutPickupPoint", "()Lcom/yandex/go/design/view/GoFrameLayout;", "frameLayoutPickupPoint", "", "pickupPointSizePx$delegate", "getPickupPointSizePx", "()I", "pickupPointSizePx", "", "pickupPointsData", "Ljava/util/Map;", "", "pickupPoints", "Ljava/util/List;", "Landroid/view/View;", "currentPanoramaView", "Landroid/view/View;", "currentPanoramaId", "Ljava/lang/String;", "Lc8y0;", "bubbleHolder$delegate", "getBubbleHolder", "()Lc8y0;", "bubbleHolder", "Lu8y0;", "pin", "Lu8y0;", "Li7z;", "locationCoordinateInteractor", "Li7z;", "Lr19;", "cartesianCoordinateInteractor", "Lr19;", "Ln8y0;", "mvpView", "Ln8y0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TaxiPanoramaModalView extends SlideableBindingModalView<o8y0> {

    /* renamed from: bubbleHolder$delegate, reason: from kotlin metadata */
    private final i3y bubbleHolder;
    private final r19 cartesianCoordinateInteractor;
    private String currentPanoramaId;
    private View currentPanoramaView;

    /* renamed from: frameLayoutPickupPoint$delegate, reason: from kotlin metadata */
    private final i3y frameLayoutPickupPoint;
    private final dqt goPanoramaViewFactory;
    private wb90 lastPanoramaInfo;
    private final i7z locationCoordinateInteractor;
    private final tse mainScope;
    private final n8y0 mvpView;
    private final s8y0 payload;

    /* renamed from: pickupPointSizePx$delegate, reason: from kotlin metadata */
    private final i3y pickupPointSizePx;
    private List<zzs> pickupPoints;
    private Map<zzs, t8y0> pickupPointsData;
    private final u8y0 pin;
    private t8y0 selectedPickupPoint;
    private final y8y0 taxiPanoramaPresenter;

    public TaxiPanoramaModalView(y8y0 y8y0Var, s8y0 s8y0Var, Context context, dqt dqtVar, tse tseVar) {
        super(context);
        this.taxiPanoramaPresenter = y8y0Var;
        this.payload = s8y0Var;
        this.goPanoramaViewFactory = dqtVar;
        this.mainScope = tseVar;
        this.frameLayoutPickupPoint = kotlin.a.a(new l8y0(this, 3));
        this.pickupPointSizePx = kotlin.a.a(new l8y0(this, 4));
        this.pickupPointsData = new LinkedHashMap();
        this.pickupPoints = s8y0Var.g;
        this.currentPanoramaId = s8y0Var.a.a;
        this.bubbleHolder = kotlin.a.a(new l8y0(this, 5));
        View inflate = LayoutInflater.from(context).inflate(eph0.taxi_panorama_pin, (ViewGroup) this, false);
        int i = zch0.pin_icon;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            throw null;
        }
        this.pin = new u8y0((GoFrameLayout) inflate, goImageView);
        this.locationCoordinateInteractor = new i7z();
        this.cartesianCoordinateInteractor = new r19();
        this.mvpView = new n8y0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c8y0 bubbleHolder_delegate$lambda$0(TaxiPanoramaModalView taxiPanoramaModalView) {
        return new c8y0(taxiPanoramaModalView.getBinding().g);
    }

    private final Pair<PointF, Boolean> calculateScreenPoint(wb90 panoramaInfo, zzs pinGeoPosition) {
        i7z i7zVar = this.locationCoordinateInteractor;
        zzs zzsVar = panoramaInfo.a;
        double d = zzsVar.a;
        double d2 = zzsVar.b;
        double d3 = pinGeoPosition.a;
        double d4 = pinGeoPosition.b;
        i7zVar.getClass();
        double d5 = (d * 3.141592653589793d) / 180.0d;
        double d6 = (d3 * 3.141592653589793d) / 180.0d;
        double d7 = ((d4 * 3.141592653589793d) / 180.0d) - ((d2 * 3.141592653589793d) / 180.0d);
        double d8 = (d6 - d5) / 2.0d;
        double d9 = d7 / 2.0d;
        double sin = (Math.sin(d9) * Math.sin(d9) * Math.cos(d6) * Math.cos(d5)) + (Math.sin(d8) * Math.sin(d8));
        double atan2 = Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d * 6378137.0d;
        double atan22 = Math.atan2(Math.cos(d6) * Math.sin(d7), (Math.sin(d6) * Math.cos(d5)) - (Math.cos(d7) * (Math.cos(d6) * Math.sin(d5))));
        if (atan22 < 0.0d) {
            atan22 += 6.283185307179586d;
        }
        float[] fArr = {(float) (Math.sin(atan22) * atan2), 0.0f, -((float) (Math.cos(atan22) * atan2))};
        r19 r19Var = this.cartesianCoordinateInteractor;
        float[] fArr2 = {0.0f, -2.0f, 0.0f};
        float[] fArr3 = {-((float) inRad(panoramaInfo.c)), -((float) inRad(panoramaInfo.d)), 0.0f};
        float inRad = (float) inRad(panoramaInfo.e);
        SizeF sizeF = new SizeF(panoramaInfo.f, panoramaInfo.g);
        r19Var.getClass();
        float[] fArr4 = {fArr[0], fArr[1], fArr[2], 1.0f};
        double d10 = fArr3[0];
        double d11 = fArr3[1];
        double d12 = fArr3[2];
        float[][] a = r19.a(r19.a(new float[][]{new float[]{1.0f, 0.0f, 0.0f, 0.0f}, new float[]{0.0f, (float) Math.cos(d10), (float) Math.sin(d10), 0.0f}, new float[]{0.0f, -((float) Math.sin(d10)), (float) Math.cos(d10), 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 1.0f}}, new float[][]{new float[]{(float) Math.cos(d11), 0.0f, -((float) Math.sin(d11)), 0.0f}, new float[]{0.0f, 1.0f, 0.0f, 0.0f}, new float[]{(float) Math.sin(d11), 0.0f, (float) Math.cos(d11), 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 1.0f}}), new float[][]{new float[]{(float) Math.cos(d12), (float) Math.sin(d12), 0.0f, 0.0f}, new float[]{-((float) Math.sin(d12)), (float) Math.cos(d12), 0.0f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f, 0.0f}, new float[]{0.0f, 0.0f, 0.0f, 1.0f}});
        int length = a[0].length;
        float[][] fArr5 = new float[length][];
        for (int i = 0; i < length; i++) {
            fArr5[i] = new float[a.length];
        }
        int length2 = a.length;
        for (int i2 = 0; i2 < length2; i2++) {
            int length3 = a[i2].length;
            for (int i3 = 0; i3 < length3; i3++) {
                fArr5[i3][i2] = a[i2][i3];
            }
        }
        float[] fArr6 = r19.a(new float[][]{new float[]{fArr2[0], fArr2[1], fArr2[2], 1.0f}}, fArr5)[0];
        ArrayList arrayList = new ArrayList(fArr6.length);
        for (float f : fArr6) {
            arrayList.add(Float.valueOf(-f));
        }
        float[] G0 = kotlin.collections.a.G0(arrayList);
        fArr5[3] = new float[]{G0[0], G0[1], G0[2], 1.0f};
        float tan = (float) Math.tan(inRad / 2.0f);
        float[][] fArr7 = {new float[]{1.0f / ((sizeF.getWidth() / sizeF.getHeight()) * tan), 0.0f, 0.0f, 0.0f}, new float[]{0.0f, -(1.0f / tan), 0.0f, 0.0f}, new float[]{0.0f, 0.0f, -1.0002f, -1.0f}, new float[]{0.0f, 0.0f, -0.020002f, 0.0f}};
        float[] fArr8 = r19.a(new float[][]{fArr4}, fArr5)[0];
        float[] fArr9 = r19.a(new float[][]{fArr8}, fArr7)[0];
        float f2 = fArr9[3];
        ArrayList arrayList2 = new ArrayList(fArr9.length);
        for (float f3 : fArr9) {
            arrayList2.add(Float.valueOf(f3 / f2));
        }
        float[] G02 = kotlin.collections.a.G0(arrayList2);
        return new Pair<>(new PointF((float) ((G02[0] + 1.0d) * 0.5d * sizeF.getWidth()), (float) (sizeF.getHeight() * (1.0d - G02[1]) * 0.5d)), Boolean.valueOf(fArr8[2] < 0.0f));
    }

    private final void clearPickupPoints() {
        ((ListItemComponent) getBinding().f.e).setVisibility(8);
        getFrameLayoutPickupPoint().removeAllViews();
        this.pickupPointsData.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoFrameLayout frameLayoutPickupPoint_delegate$lambda$0(TaxiPanoramaModalView taxiPanoramaModalView) {
        return (GoFrameLayout) taxiPanoramaModalView.getBinding().c.b;
    }

    private final c8y0 getBubbleHolder() {
        return (c8y0) this.bubbleHolder.getValue();
    }

    private final String getCurrentPanoramaId() {
        String str;
        wb90 wb90Var = this.lastPanoramaInfo;
        return (wb90Var == null || (str = wb90Var.k) == null) ? this.payload.a.a : str;
    }

    private final GoFrameLayout getFrameLayoutPickupPoint() {
        return (GoFrameLayout) this.frameLayoutPickupPoint.getValue();
    }

    private static /* synthetic */ void getMainScope$annotations() {
    }

    private final int getPickupPointSizePx() {
        return ((Number) this.pickupPointSizePx.getValue()).intValue();
    }

    private final double inRad(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    private final void initCloseButton() {
        RotatableFloatButton rotatableFloatButton = getBinding().b;
        int i = dzg0.ic_arrow_back_24dp;
        Drawable t = vng.t(i, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t == null) {
            w511.f(oyr.j(i, "Drawable resource ", " not found"));
            return;
        }
        rotatableFloatButton.setImageDrawable(t);
        getBinding().b.setContentDescription(getContext().getString(kyh0.common_close));
        getBinding().b.setIconTintAttr(xng0.textMain);
        ru.yandex.taxi.design.utils.c.z(new l8y0(this, 2), getBinding().b);
        androidx.core.view.b.p(getBinding().b, new ifq0(8, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initCloseButton$lambda$0(TaxiPanoramaModalView taxiPanoramaModalView) {
        taxiPanoramaModalView.taxiPanoramaPresenter.Kg(taxiPanoramaModalView.getCurrentPanoramaId());
        return zy11.a;
    }

    private final boolean isMoveAwayFromStartPoint(wb90 panoramaInfo) {
        String str;
        t8y0 t8y0Var = this.selectedPickupPoint;
        if (t8y0Var == null || (str = t8y0Var.c) == null) {
            str = this.payload.a.a;
        }
        return !jl40.l(str, panoramaInfo.k);
    }

    private final boolean isPickupPointSelected() {
        t8y0 t8y0Var = this.selectedPickupPoint;
        return this.selectedPickupPoint != null && (t8y0Var != null && (ru.yandex.taxi.map.utils.a.j(t8y0Var.d, this.payload.a.b) > 1.0f ? 1 : (ru.yandex.taxi.map.utils.a.j(t8y0Var.d, this.payload.a.b) == 1.0f ? 0 : -1)) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void movePanoramaPin(wb90 panoramaInfo) {
        this.lastPanoramaInfo = panoramaInfo;
        String str = this.currentPanoramaId;
        String str2 = panoramaInfo.k;
        View view = panoramaInfo.h;
        boolean l = jl40.l(str, str2);
        this.currentPanoramaId = panoramaInfo.k;
        if (!l) {
            clearPickupPoints();
            if (jl40.l(this.currentPanoramaId, this.payload.a.a)) {
                this.mvpView.Yb(this.payload.g);
            } else {
                y8y0 y8y0Var = this.taxiPanoramaPresenter;
                pzt0 pzt0Var = y8y0Var.I;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                if (y8y0Var.y.o) {
                    y8y0Var.I = tje.N(y8y0Var.Jg(), (mse) y8y0Var.F.a.getValue(), null, new TaxiPanoramaPresenter$requestPickupPoints$1(y8y0Var, panoramaInfo, null), 2);
                } else {
                    ((r8y0) y8y0Var.Dg()).Yb(EmptyList.a);
                }
            }
        }
        boolean isMoveAwayFromStartPoint = isMoveAwayFromStartPoint(panoramaInfo);
        u8y0 u8y0Var = this.pin;
        if (isMoveAwayFromStartPoint) {
            u8y0Var.a.setAlpha((float) this.payload.d);
        } else {
            u8y0Var.a.setAlpha(1.0f);
        }
        ((RotatableFloatButton) getBinding().f.f).setVisibility(isMoveAwayFromStartPoint(panoramaInfo) ? 0 : 8);
        Pair<PointF, Boolean> calculateScreenPoint = calculateScreenPoint(panoramaInfo, panoramaInfo.b);
        if (((Boolean) calculateScreenPoint.f()).booleanValue()) {
            view.setX(((PointF) calculateScreenPoint.c()).x - (view.getWidth() * 0.5f));
            view.setY(((PointF) calculateScreenPoint.c()).y - view.getHeight());
        } else {
            view.setX(-ofp0.b);
        }
        refreshTooltip(panoramaInfo);
        if (l) {
            renderPickupPoints();
        }
    }

    private final double normalizeAngle(double angle) {
        double d = angle % 360.0d;
        return d < 0.0d ? d + 360.0d : d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(TaxiPanoramaModalView taxiPanoramaModalView) {
        taxiPanoramaModalView.getBubbleHolder().a.setVisibility(8);
        taxiPanoramaModalView.taxiPanoramaPresenter.Lg(PanoramaAnalytics$UserInteractAction.ReturnTap, taxiPanoramaModalView.getCurrentPanoramaId());
        taxiPanoramaModalView.showPanorama();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(TaxiPanoramaModalView taxiPanoramaModalView) {
        ((GoConstraintLayout) taxiPanoramaModalView.getBinding().d.c).setVisibility(8);
        taxiPanoramaModalView.showPanorama();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pickupPointSizePx_delegate$lambda$0(TaxiPanoramaModalView taxiPanoramaModalView) {
        return ru.yandex.taxi.design.utils.c.d(hrg0.panorama_pickup_point_size, taxiPanoramaModalView);
    }

    private final void refreshTooltip(wb90 panoramaInfo) {
        String str = this.payload.f;
        int length = str.length();
        u8y0 u8y0Var = this.pin;
        if (length == 0) {
            u8y0Var.a.setVisibility(0);
            getBubbleHolder().a.setVisibility(8);
            return;
        }
        float x = u8y0Var.a.getX() + (this.pin.a.getWidth() / 2);
        if (x >= 0.0f && x <= ofp0.b) {
            this.pin.a.setVisibility(0);
            getBubbleHolder().a.setVisibility(8);
            return;
        }
        this.pin.a.setVisibility(8);
        getBubbleHolder().a.setVisibility(0);
        getBubbleHolder().a.setY((getContentHeight() / 2.0f) - (this.pin.a.getHeight() / 2));
        rju rjuVar = getBubbleHolder().b;
        rjuVar.F = HintBubbleDecorator$Direction.DOWN;
        rjuVar.i();
        c8y0 bubbleHolder = getBubbleHolder();
        ((RobotoTextView) bubbleHolder.c.c).setText(str);
        BubbleComponent bubbleComponent = bubbleHolder.a;
        bubbleComponent.show(false);
        bubbleComponent.setAlpha(0.8f);
        double normalizeAngle = normalizeAngle(panoramaInfo.d);
        double normalizeAngle2 = normalizeAngle(panoramaInfo.i);
        double d = normalizeAngle - normalizeAngle2;
        if (d < 0.0d) {
            d += 360.0d;
        }
        double d2 = normalizeAngle2 - normalizeAngle;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        if (d < d2) {
            getBubbleHolder().a.setX(0.0f);
            getBubbleHolder().b.g(HintBubbleDecorator$Position.OFFSET_START);
        } else {
            getBubbleHolder().a.setX(ofp0.b - getBubbleHolder().a.getWidth());
            getBubbleHolder().b.g(HintBubbleDecorator$Position.OFFSET_END);
        }
    }

    private final void renderDescription() {
        t8y0 t8y0Var = this.selectedPickupPoint;
        if (this.pickupPointsData.isEmpty()) {
            ((ListItemComponent) getBinding().f.e).setVisibility(8);
            return;
        }
        if (t8y0Var != null && t8y0Var.e) {
            ((ListItemComponent) getBinding().f.e).setVisibility(8);
        } else if (this.payload.k.length() == 0) {
            ((ListItemComponent) getBinding().f.e).setVisibility(8);
        } else {
            ((ListItemComponent) getBinding().f.e).setVisibility(0);
            ((ListItemComponent) getBinding().f.e).setTitle(this.payload.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPickupPoints() {
        wb90 wb90Var = this.lastPanoramaInfo;
        if (wb90Var == null || this.payload.n == null) {
            return;
        }
        List<zzs> list = this.pickupPoints;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ru.yandex.taxi.map.utils.a.j((zzs) obj, wb90Var.a) < this.payload.m) {
                arrayList.add(obj);
            }
        }
        y8y0 y8y0Var = this.taxiPanoramaPresenter;
        String str = wb90Var.k;
        String str2 = y8y0Var.H;
        y8y0Var.H = str;
        if (!jl40.l(str2, str) && !arrayList.isEmpty()) {
            a8y0 a8y0Var = y8y0Var.z;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzs zzsVar = (zzs) it.next();
                arrayList2.add(new pb90(zzsVar.a, zzsVar.b));
            }
            u8w u8wVar = a8y0Var.a;
            u8wVar.getClass();
            HashMap hashMap = new HashMap();
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((pb90) it2.next()).c);
            }
            hashMap.put("points_list", arrayList3);
            if (str != null) {
                hashMap.put("panorama_id", str);
            }
            u8wVar.a.a("Panorama.PickUpPoints.Shown", hashMap, 1, new HashMap());
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (ru.yandex.taxi.map.utils.a.j((zzs) next, wb90Var.b) > 1.0f) {
                arrayList4.add(next);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            zzs zzsVar2 = (zzs) it4.next();
            Map<zzs, t8y0> map = this.pickupPointsData;
            t8y0 t8y0Var = map.get(zzsVar2);
            if (t8y0Var == null) {
                q8y0 createPickupPointView = createPickupPointView();
                createPickupPointView.a.setImportantForAccessibility(2);
                GoFrameLayout goFrameLayout = createPickupPointView.a;
                boolean z = ru.yandex.taxi.map.utils.a.j(zzsVar2, this.payload.a.b) > 1.0f;
                t8y0Var = new t8y0(goFrameLayout, zzsVar2.equals(this.selectedPickupPoint), wb90Var.k, zzsVar2, z);
                ru.yandex.taxi.design.utils.c.z(new glr(this, t8y0Var, wb90Var, zzsVar2, z, 3), goFrameLayout);
                getFrameLayoutPickupPoint().addView(goFrameLayout);
                map.put(zzsVar2, t8y0Var);
            }
            t8y0 t8y0Var2 = t8y0Var;
            GoFrameLayout goFrameLayout2 = t8y0Var2.a;
            Pair<PointF, Boolean> calculateScreenPoint = calculateScreenPoint(wb90Var, zzsVar2);
            goFrameLayout2.setVisibility((!((Boolean) calculateScreenPoint.f()).booleanValue() || t8y0Var2.b) ? 8 : 0);
            goFrameLayout2.setX(((PointF) calculateScreenPoint.c()).x - (getPickupPointSizePx() * 0.5f));
            goFrameLayout2.setY(((PointF) calculateScreenPoint.c()).y - (getPickupPointSizePx() * 0.5f));
        }
        renderDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderPickupPoints$lambda$3$0$0(TaxiPanoramaModalView taxiPanoramaModalView, t8y0 t8y0Var, wb90 wb90Var, zzs zzsVar, boolean z) {
        t8y0 t8y0Var2 = taxiPanoramaModalView.selectedPickupPoint;
        int i = 0;
        if (t8y0Var2 != null) {
            t8y0Var2.a.setVisibility(0);
        }
        taxiPanoramaModalView.selectedPickupPoint = t8y0Var;
        int i2 = 8;
        if (t8y0Var != null) {
            t8y0Var.a.setVisibility(8);
        }
        wb90Var.j.invoke(zzsVar);
        y8y0 y8y0Var = taxiPanoramaModalView.taxiPanoramaPresenter;
        String str = wb90Var.k;
        zzs zzsVar2 = t8y0Var.d;
        u8w u8wVar = y8y0Var.z.a;
        Double valueOf = Double.valueOf(zzsVar2.a);
        Double valueOf2 = Double.valueOf(zzsVar2.b);
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("panorama_id", str);
        }
        hashMap.put("geo_lat", valueOf);
        hashMap.put("geo_lon", valueOf2);
        u8wVar.a.a("Panorama.PickUpPoint.Tapped", hashMap, 1, new HashMap());
        ((ListItemComponent) taxiPanoramaModalView.getBinding().f.e).setVisibility(8);
        GoFrameLayout goFrameLayout = (GoFrameLayout) taxiPanoramaModalView.getBinding().f.c;
        if (taxiPanoramaModalView.isPickupPointSelected() && z) {
            i2 = 0;
        }
        goFrameLayout.setVisibility(i2);
        ((ButtonComponent) taxiPanoramaModalView.getBinding().f.b).setText(taxiPanoramaModalView.payload.j);
        taxiPanoramaModalView.renderDescription();
        ((ButtonComponent) taxiPanoramaModalView.getBinding().f.b).setDebounceClickListener(new m8y0(taxiPanoramaModalView, i));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderPickupPoints$lambda$3$0$0$0(TaxiPanoramaModalView taxiPanoramaModalView) {
        t8y0 t8y0Var = taxiPanoramaModalView.selectedPickupPoint;
        if (t8y0Var != null) {
            y8y0 y8y0Var = taxiPanoramaModalView.taxiPanoramaPresenter;
            zzs zzsVar = taxiPanoramaModalView.payload.a.b;
            String str = t8y0Var.c;
            zzs zzsVar2 = t8y0Var.d;
            u8w u8wVar = y8y0Var.z.a;
            double d = zzsVar.a;
            double d2 = zzsVar.b;
            Double valueOf = Double.valueOf(zzsVar2.a);
            Double valueOf2 = Double.valueOf(zzsVar2.b);
            u8wVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("original_point_geo_lat", Double.valueOf(d));
            hashMap.put("original_point_geo_lon", Double.valueOf(d2));
            if (str != null) {
                hashMap.put("panorama_id", str);
            }
            hashMap.put("geo_lat", valueOf);
            hashMap.put("geo_lon", valueOf2);
            u8wVar.a.a("Panorama.PickUpPoint.Confirmed", hashMap, 1, new HashMap());
            tje.N(taxiPanoramaModalView.mainScope, null, null, new TaxiPanoramaModalView$renderPickupPoints$4$data$1$1$1$1(taxiPanoramaModalView, t8y0Var, null), 3);
        }
        taxiPanoramaModalView.taxiPanoramaPresenter.Kg(taxiPanoramaModalView.getCurrentPanoramaId());
    }

    private final void showPanorama() {
        String str;
        t8y0 t8y0Var = this.selectedPickupPoint;
        if (t8y0Var == null || (str = t8y0Var.c) == null) {
            str = this.payload.a.a;
        }
        zzs zzsVar = t8y0Var != null ? t8y0Var.d : this.payload.a.b;
        tb90 tb90Var = this.payload.a;
        View a = this.goPanoramaViewFactory.a(new aqt(f1h0.transparent_dot, new tb90(str, zzsVar, tb90Var.c, tb90Var.d), true, true, false, new l8y0(this, 7), new l8y0(this, 8), this.pin.a, true, true, false, new TaxiPanoramaModalView$showPanorama$panoramaView$1(1, this, TaxiPanoramaModalView.class, "movePanoramaPin", "movePanoramaPin(Lcom/yandex/go/panorama/api/data/PanoramaInfo;)V", 0), new l8y0(this, 9), new l8y0(this, 0), new l8y0(this, 1)));
        if (a == null) {
            this.taxiPanoramaPresenter.Kg(getCurrentPanoramaId());
            return;
        }
        ((GoFrameLayout) getBinding().c.c).setVisibility(0);
        View view = this.currentPanoramaView;
        if (view != null) {
            ru.yandex.taxi.design.utils.c.w(view, a);
        } else {
            ru.yandex.taxi.design.utils.c.w((GoView) getBinding().c.d, a);
        }
        this.pin.a.setVisibility(4);
        ((RotatableFloatButton) getBinding().f.f).setVisibility(8);
        this.currentPanoramaView = a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPanorama$lambda$0(TaxiPanoramaModalView taxiPanoramaModalView) {
        y8y0 y8y0Var = taxiPanoramaModalView.taxiPanoramaPresenter;
        String currentPanoramaId = taxiPanoramaModalView.getCurrentPanoramaId();
        a8y0 a8y0Var = y8y0Var.z;
        s8y0 s8y0Var = y8y0Var.y;
        String str = s8y0Var.b;
        String str2 = s8y0Var.c;
        Double d = s8y0Var.a.c;
        u8w u8wVar = a8y0Var.a;
        PanoramaAnalytics$PanoramaPinType b = a8y0.b(str2);
        Integer valueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, str);
        hashMap.put("pin_type", b.getEventValue());
        if (valueOf != null) {
            hashMap.put("distance_m", valueOf);
        }
        if (currentPanoramaId != null) {
            hashMap.put("panorama_id", currentPanoramaId);
        }
        u8wVar.a.a("Panorama.Loaded", hashMap, 1, new HashMap());
        taxiPanoramaModalView.pin.a.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPanorama$lambda$1(TaxiPanoramaModalView taxiPanoramaModalView) {
        y8y0 y8y0Var = taxiPanoramaModalView.taxiPanoramaPresenter;
        String currentPanoramaId = taxiPanoramaModalView.getCurrentPanoramaId();
        a8y0 a8y0Var = y8y0Var.z;
        s8y0 s8y0Var = y8y0Var.y;
        String str = s8y0Var.b;
        String str2 = s8y0Var.c;
        Double d = s8y0Var.a.c;
        u8w u8wVar = a8y0Var.a;
        PanoramaAnalytics$PanoramaPinType b = a8y0.b(str2);
        Integer valueOf = d != null ? Integer.valueOf((int) d.doubleValue()) : null;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, str);
        hashMap.put("pin_type", b.getEventValue());
        if (valueOf != null) {
            hashMap.put("distance_m", valueOf);
        }
        if (currentPanoramaId != null) {
            hashMap.put("panorama_id", currentPanoramaId);
        }
        u8wVar.a.a("Panorama.LoadError", hashMap, 1, new HashMap());
        ((GoFrameLayout) taxiPanoramaModalView.getBinding().c.c).setVisibility(8);
        ((GoConstraintLayout) taxiPanoramaModalView.getBinding().d.c).setVisibility(0);
        ((ListItemComponent) taxiPanoramaModalView.getBinding().d.d).setTitle(taxiPanoramaModalView.payload.h);
        ((ButtonComponent) taxiPanoramaModalView.getBinding().d.b).setText(taxiPanoramaModalView.payload.i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPanorama$lambda$2(TaxiPanoramaModalView taxiPanoramaModalView) {
        taxiPanoramaModalView.taxiPanoramaPresenter.Lg(PanoramaAnalytics$UserInteractAction.Zoom, taxiPanoramaModalView.getCurrentPanoramaId());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPanorama$lambda$3(TaxiPanoramaModalView taxiPanoramaModalView) {
        taxiPanoramaModalView.taxiPanoramaPresenter.Lg(PanoramaAnalytics$UserInteractAction.ArrowTap, taxiPanoramaModalView.getCurrentPanoramaId());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showPanorama$lambda$4(TaxiPanoramaModalView taxiPanoramaModalView) {
        taxiPanoramaModalView.taxiPanoramaPresenter.Lg(PanoramaAnalytics$UserInteractAction.Move, taxiPanoramaModalView.getCurrentPanoramaId());
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public o8y0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(eph0.taxi_panorama_modal_view, parent, false);
        int i = zch0.close;
        RotatableFloatButton rotatableFloatButton = (RotatableFloatButton) cma1.O(i, inflate);
        if (rotatableFloatButton != null && (O = cma1.O((i = zch0.content), inflate)) != null) {
            int i2 = zch0.frame_layout_pickup_point;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i2, O);
            if (goFrameLayout != null) {
                i2 = zch0.root_for_replace;
                GoView goView = (GoView) cma1.O(i2, O);
                if (goView != null) {
                    ho4 ho4Var = new ho4((GoFrameLayout) O, goFrameLayout, goView, 19);
                    int i3 = zch0.error_content;
                    View O2 = cma1.O(i3, inflate);
                    if (O2 != null) {
                        int i4 = zch0.icon;
                        if (((GoImageView) cma1.O(i4, O2)) != null) {
                            i4 = zch0.reload;
                            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i4, O2);
                            if (buttonComponent != null) {
                                i4 = zch0.text;
                                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i4, O2);
                                if (listItemComponent != null) {
                                    ho4 ho4Var2 = new ho4((GoConstraintLayout) O2, buttonComponent, listItemComponent, 20);
                                    GoFrameLayout goFrameLayout2 = (GoFrameLayout) inflate;
                                    int i5 = zch0.taxi_panorama_bottom_modal_view;
                                    View O3 = cma1.O(i5, inflate);
                                    if (O3 != null) {
                                        int i6 = zch0.accept_pickup_point;
                                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i6, O3);
                                        if (buttonComponent2 != null) {
                                            i6 = zch0.accept_pickup_point_frame_layout;
                                            GoFrameLayout goFrameLayout3 = (GoFrameLayout) cma1.O(i6, O3);
                                            if (goFrameLayout3 != null) {
                                                i6 = zch0.description_pickup_point_item_component;
                                                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i6, O3);
                                                if (listItemComponent2 != null) {
                                                    i6 = zch0.return_to_init_point;
                                                    RotatableFloatButton rotatableFloatButton2 = (RotatableFloatButton) cma1.O(i6, O3);
                                                    if (rotatableFloatButton2 != null) {
                                                        dna dnaVar = new dna((GoLinearLayout) O3, buttonComponent2, goFrameLayout3, listItemComponent2, rotatableFloatButton2, 7);
                                                        i5 = zch0.tooltip_container;
                                                        GoFrameLayout goFrameLayout4 = (GoFrameLayout) cma1.O(i5, inflate);
                                                        if (goFrameLayout4 != null) {
                                                            return new o8y0(goFrameLayout2, rotatableFloatButton, ho4Var, ho4Var2, goFrameLayout2, dnaVar, goFrameLayout4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ny61.t("Missing required view with ID: ".concat(O3.getResources().getResourceName(i6)));
                                        return null;
                                    }
                                    i = i5;
                                }
                            }
                        }
                        ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i4)));
                        return null;
                    }
                    i = i3;
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final q8y0 createPickupPointView() {
        View inflate = LayoutInflater.from(getContext()).inflate(eph0.taxi_panorama_modal_view_pickup_point, (ViewGroup) this, false);
        if (inflate != null) {
            return new q8y0((GoFrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y8y0 y8y0Var = this.taxiPanoramaPresenter;
        n8y0 n8y0Var = this.mvpView;
        y8y0Var.Bg(n8y0Var);
        tje.N(y8y0Var.Jg(), (mse) y8y0Var.F.a.getValue(), null, new TaxiPanoramaPresenter$loadIcons$1(y8y0Var, y8y0Var.y.l, null), 2);
        int i = 4;
        tje.N(y8y0Var.Jg(), null, null, new TaxiPanoramaPresenter$attachView$$inlined$collectIn$1(new mth(e.p(y8y0Var.J, 500L), i), null, y8y0Var), 3);
        tje.N(y8y0Var.Jg(), null, null, new TaxiPanoramaPresenter$attachView$$inlined$collectIn$2(new mth(e.p(y8y0Var.K, 500L), i), null, y8y0Var), 3);
        tje.N(y8y0Var.Jg(), null, null, new TaxiPanoramaPresenter$attachView$3(y8y0Var, n8y0Var, null), 3);
        tje.N(y8y0Var.Jg(), null, null, new TaxiPanoramaPresenter$attachView$4(y8y0Var, n8y0Var, null), 3);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        this.pin.b.setImageBitmap(this.payload.e);
        showPanorama();
        getBinding().e.addView(getBubbleHolder().a, new ViewGroup.LayoutParams(-2, -2));
        xw31.B((int) tje.x(getContext(), 12.0f), getBubbleHolder().a);
        ((GoLinearLayout) getBinding().f.d).setImportantForAccessibility(2);
        ((ListItemComponent) getBinding().f.e).disableAccessibility();
        ru.yandex.taxi.design.utils.c.z(new l8y0(this, 6), (RotatableFloatButton) getBinding().f.f);
        GoFrameLayout goFrameLayout = getBinding().e;
        goFrameLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.r(mrg0.go_design_card_divider_radius, getContext())));
        goFrameLayout.setClipToOutline(true);
        ((ButtonComponent) getBinding().d.b).setDebounceClickListener(new m8y0(this, 1));
        initCloseButton();
        getBottomSheet().setBackground(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        y8y0 y8y0Var = this.taxiPanoramaPresenter;
        String currentPanoramaId = getCurrentPanoramaId();
        a8y0 a8y0Var = y8y0Var.z;
        s8y0 s8y0Var = y8y0Var.y;
        a8y0Var.a(currentPanoramaId, s8y0Var.b, s8y0Var.c, s8y0Var.a.c);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.taxiPanoramaPresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }
}
