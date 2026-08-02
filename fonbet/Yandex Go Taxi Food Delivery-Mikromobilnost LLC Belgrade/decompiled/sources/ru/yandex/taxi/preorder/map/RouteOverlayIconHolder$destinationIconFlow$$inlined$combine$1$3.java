package ru.yandex.taxi.preorder.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.mapkit.map.IconStyle;
import defpackage.avj0;
import defpackage.azi;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.boj0;
import defpackage.bzi;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.e6l0;
import defpackage.eja1;
import defpackage.f6l0;
import defpackage.fji;
import defpackage.g0c0;
import defpackage.g7h;
import defpackage.iyb;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pxy;
import defpackage.qj6;
import defpackage.qm6;
import defpackage.s0c0;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sgu0;
import defpackage.t3l0;
import defpackage.tje;
import defpackage.ugu0;
import defpackage.up11;
import defpackage.uyi;
import defpackage.vpr;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.preorder.map.model.RouteIconType;
import ru.yandex.taxi.preorder.source.points.StopPointsProvider$StopPointPlace;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.StyledTypefaceSpan;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.map.RouteOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3", f = "RouteOverlayIconHolder.kt", l = {342, 344, 346, 354, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class RouteOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3(Continuation continuation, n nVar) {
        super(3, continuation);
        this.this$0 = nVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RouteOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3 routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3 = new RouteOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0478, code lost:
    
        if (r7.emit(r0, r5) == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x047a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r0 == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012d, code lost:
    
        if (r0 == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0165, code lost:
    
        if (r0 == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c1, code lost:
    
        if (r0 == r8) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [T, android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, android.graphics.PointF] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Object obj2;
        RouteOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3 routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3 = this;
        vpr vprVar2 = (vpr) routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$0;
        Object[] objArr = (Object[]) routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.label;
        Object obj3 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj4 = objArr[0];
            Object obj5 = objArr[1];
            Object obj6 = objArr[2];
            Object obj7 = objArr[3];
            Object obj8 = objArr[4];
            Object obj9 = objArr[5];
            Object obj10 = objArr[6];
            String str = (String) objArr[7];
            ThemeType themeType = (ThemeType) obj10;
            boolean booleanValue = ((Boolean) obj9).booleanValue();
            qj6 qj6Var = (qj6) obj8;
            iyb iybVar = (iyb) obj7;
            fji fjiVar = (fji) obj6;
            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
            e6l0 e6l0Var = (e6l0) obj4;
            int i2 = (iybVar == null || !iybVar.e) ? 0 : 1;
            g0c0 g0c0Var = (i2 == 0 && iybVar != null) ? iybVar.d : null;
            if (i2 == 0) {
                if (fjiVar != null && booleanValue2) {
                    n nVar = routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.this$0;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$0 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$1 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$2 = vprVar2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$3 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$4 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$5 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$6 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$7 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$8 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$9 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$10 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$11 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$12 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.Z$0 = booleanValue;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.Z$1 = booleanValue2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.I$0 = i2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.label = 1;
                    obj2 = n.b(nVar, e6l0Var, themeType, routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3);
                } else if (fjiVar != null) {
                    n nVar2 = routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.this$0;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$0 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$1 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$2 = vprVar2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$3 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$4 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$5 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$6 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$7 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$8 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$9 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$10 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$11 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$12 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.Z$0 = booleanValue;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.Z$1 = booleanValue2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.I$0 = i2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.label = 2;
                    nVar2.H = fjiVar;
                    obj2 = nVar2.f(new RouteOverlayIconHolder$deliveryDestinationState$2(nVar2, n.class, "previousDeliveryDestinationState", "getPreviousDeliveryDestinationState()Lru/yandex/taxi/preorder/map/RouteOverlayIconHolder$IconState;", 0), new f6l0(nVar2, 4), new RouteOverlayIconHolder$deliveryDestinationState$4(nVar2, fjiVar, e6l0Var, null), scc.g(fjiVar, themeType), routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3);
                } else if (!booleanValue || g0c0Var == null) {
                    boolean equals = qj6Var.equals(qj6.f);
                    n nVar3 = routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.this$0;
                    if (!equals) {
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$0 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$1 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$2 = vprVar2;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$3 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$4 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$5 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$6 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$7 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$8 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$9 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$10 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$11 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$12 = null;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.Z$0 = booleanValue;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.Z$1 = booleanValue2;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.I$0 = i2;
                        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.label = 4;
                        nVar3.F = qj6Var;
                        obj2 = nVar3.f(new RouteOverlayIconHolder$brandingDestinationState$2(nVar3, n.class, "previousBrandingDestinationState", "getPreviousBrandingDestinationState()Lru/yandex/taxi/preorder/map/RouteOverlayIconHolder$IconState;", 0), new f6l0(nVar3, 3), new RouteOverlayIconHolder$brandingDestinationState$4(nVar3, qj6Var, e6l0Var, null), scc.g(qj6Var, themeType), routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3);
                    } else if (str != null) {
                        boj0 boj0Var = nVar3.j.d;
                        azi aziVar = (azi) ((bzi) boj0Var.z).a.b();
                        String v = cvu0.v(d6z.Y(aziVar, aziVar.d), "$ARRIVAL_TIME$", str, false);
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = new PointF();
                        ru.yandex.taxi.design.utils.a aVar = (ru.yandex.taxi.design.utils.a) boj0Var.x;
                        Context context = (Context) boj0Var.b;
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        RobotoTextView robotoTextView = new RobotoTextView(frameLayout.getContext(), null, 0, 6, null);
                        avj0 avj0Var = (avj0) ((zuj0) boj0Var.c);
                        int u = tje.u(8, avj0Var.a);
                        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        robotoTextView.setTextAlignment(4);
                        Context context2 = robotoTextView.getContext();
                        robotoTextView.setLineHeight((int) tje.b0(context2, 14.0f));
                        robotoTextView.setLineSpacing(0.0f, 1.0f);
                        robotoTextView.setTextSize(tje.b0(context2, 13.0f));
                        robotoTextView.setPadding(u, tje.u(4, context2), u, tje.u(5, context2));
                        SpannableString spannableString = new SpannableString(v);
                        int c = avj0Var.c(mrg0.component_text_size_caption);
                        int length = v.length();
                        spannableString.setSpan(new AbsoluteSizeSpan(c), 0, length, 18);
                        int[] iArr = up11.a;
                        vprVar = vprVar2;
                        spannableString.setSpan(new StyledTypefaceSpan(eja1.w(3, 0), 0, 2, null), 0, length, 18);
                        spannableString.setSpan(new ForegroundColorSpan(s8o.m(new bdc(xng0.textMain), context)), 0, length, 18);
                        robotoTextView.setText(spannableString);
                        frameLayout.addView(robotoTextView);
                        qm6 g7hVar = new g7h(context);
                        g7hVar.b(new bdc(xng0.bgMain));
                        BubbleComponent bubbleComponent = new BubbleComponent((Context) boj0Var.b, null, 0, 6, null);
                        bubbleComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        bubbleComponent.setDecorator(g7hVar);
                        bubbleComponent.addView(frameLayout);
                        xw31.r(bubbleComponent);
                        Bitmap t = xw31.t(bubbleComponent);
                        ShapeDrawable shapeDrawable = new ShapeDrawable();
                        float[] fArr = new float[8];
                        for (int i3 = 0; i3 < 8; i3++) {
                            fArr[i3] = bubbleComponent.getContext().getResources().getDimension(mrg0.bubble_component_corner_radius);
                        }
                        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
                        shapeDrawable.setIntrinsicWidth(t.getWidth());
                        shapeDrawable.setIntrinsicHeight(t.getHeight());
                        int d = aVar.d(shapeDrawable);
                        int b = aVar.b(shapeDrawable);
                        float f = ru.yandex.taxi.design.utils.a.f(60.0f, 0.0f);
                        float f2 = ru.yandex.taxi.design.utils.a.f(60.0f, 8.0f);
                        int g = ru.yandex.taxi.design.utils.a.g(60.0f, d, f);
                        int g2 = ru.yandex.taxi.design.utils.a.g(60.0f, b, f2);
                        int c2 = (int) ru.yandex.taxi.design.utils.a.c(60.0f, 0.0f);
                        int c3 = (int) ru.yandex.taxi.design.utils.a.c(60.0f, 8.0f);
                        Rect rect = new Rect(c2, c3, g - (d + c2), g2 - (b + c3));
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{aVar.e(shapeDrawable, 0.0f, 8.0f, 60.0f, 863335279, false)});
                        layerDrawable.setPadding(rect.left, rect.top / 2, rect.right, rect.bottom / 2);
                        bubbleComponent.setBackground(layerDrawable);
                        Bitmap b2 = ((ugu0) ((sgu0) boj0Var.y)).b(-1, ((ru.yandex.taxi.styling.f) ((s0c0) boj0Var.w)).b(false).a, true, StopPointsProvider$StopPointPlace.MAP);
                        xw31.r(bubbleComponent);
                        Bitmap t2 = xw31.t(bubbleComponent);
                        ref$ObjectRef.element = new PointF(0.5f, 1.0f - ((b2.getHeight() / 2.0f) / (b2.getHeight() + t2.getHeight())));
                        Rect rect2 = new Rect();
                        bubbleComponent.getBackground().getPadding(rect2);
                        Paint paint = new Paint(1);
                        int max = Math.max(t2.getWidth(), b2.getWidth());
                        int height = b2.getHeight() + (t2.getHeight() - rect2.bottom);
                        Bitmap createBitmap = Bitmap.createBitmap(max, height, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawBitmap(t2, (max - t2.getWidth()) / 2, 0.0f, paint);
                        int width = (max - b2.getWidth()) / 2;
                        canvas.drawBitmap(b2, new Rect(0, 0, b2.getWidth(), b2.getHeight()), new Rect(width, t2.getHeight() - rect2.bottom, max - width, height), paint);
                        obj2 = new t3l0(new bl00(new pxy(new uyi(0, createBitmap)), new IconStyle().setAnchor((PointF) ref$ObjectRef.element)), null, false, RouteIconType.DESTINATION_PIN_WITH_ARRIVAL_TIME, 6);
                    } else {
                        vprVar = vprVar2;
                        obj2 = nVar3.w;
                    }
                } else {
                    n nVar4 = routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.this$0;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$0 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$1 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$2 = vprVar2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$3 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$4 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$5 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$6 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$7 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$8 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$9 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$10 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$11 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$12 = null;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.Z$0 = booleanValue;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.Z$1 = booleanValue2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.I$0 = i2;
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.label = 3;
                    obj2 = n.a(nVar4, null, g0c0Var, e6l0Var, false, themeType, routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3);
                    routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3 = routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3;
                }
                return zy11.a;
            }
            obj2 = routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.this$0.w;
            vprVar = vprVar2;
            vprVar2 = vprVar;
            obj3 = null;
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar2 = (vpr) routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$2;
            kotlin.b.b(obj);
            obj2 = obj;
        }
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$0 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$1 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$2 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$3 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$4 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$5 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$6 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$7 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$8 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$9 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$10 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$11 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.L$12 = obj3;
        routeOverlayIconHolder$destinationIconFlow$$inlined$combine$1$3.label = 5;
    }
}
