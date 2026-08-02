package ru.yandex.taxi.logistics.deliveries.map.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a2i0;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.c0c0;
import defpackage.doa1;
import defpackage.g7h;
import defpackage.i1c0;
import defpackage.i3y;
import defpackage.lzg0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rdi;
import defpackage.rrg0;
import defpackage.sdi;
import defpackage.sls;
import defpackage.tqh0;
import defpackage.vng;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xqg0;
import defpackage.xw31;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;
import ru.yandex.taxi.logistics.deliveries.map.android.DeliveryPinView;
import ru.yandex.taxi.logistics.deliveries.map.data.a;
import ru.yandex.taxi.widget.map.SourceOnMapControl;
import ru.yandex.taxi.widget.pin.FixedPinView;

/* loaded from: classes5.dex */
public final class a implements sdi {
    public final Context a;
    public final b b;
    public final ru.yandex.taxi.design.utils.a c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final i3y g;

    public a(Context context, b bVar, ru.yandex.taxi.design.utils.a aVar) {
        this.a = context;
        this.b = bVar;
        this.c = aVar;
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: y9h
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar2 = this.b;
                switch (i2) {
                    case 0:
                        return a.c(aVar2, mqg0.component_gray_450, lzg0.ic_logistics_delivery_auto_pin);
                    case 1:
                        return a.c(aVar2, mqg0.component_gray_450, lzg0.ic_logistics_delivery_pedestrian_pin);
                    case 2:
                        return ImageProvider.fromResource(aVar2.a, lzg0.ic_market_express_performer);
                    default:
                        return ImageProvider.fromBitmap(u8b1.h(lzg0.ic_logistics_another_order_point, aVar2.a));
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.a.a(new sls(this) { // from class: y9h
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar2 = this.b;
                switch (i22) {
                    case 0:
                        return a.c(aVar2, mqg0.component_gray_450, lzg0.ic_logistics_delivery_auto_pin);
                    case 1:
                        return a.c(aVar2, mqg0.component_gray_450, lzg0.ic_logistics_delivery_pedestrian_pin);
                    case 2:
                        return ImageProvider.fromResource(aVar2.a, lzg0.ic_market_express_performer);
                    default:
                        return ImageProvider.fromBitmap(u8b1.h(lzg0.ic_logistics_another_order_point, aVar2.a));
                }
            }
        });
        final int i3 = 2;
        this.f = kotlin.a.a(new sls(this) { // from class: y9h
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                a aVar2 = this.b;
                switch (i22) {
                    case 0:
                        return a.c(aVar2, mqg0.component_gray_450, lzg0.ic_logistics_delivery_auto_pin);
                    case 1:
                        return a.c(aVar2, mqg0.component_gray_450, lzg0.ic_logistics_delivery_pedestrian_pin);
                    case 2:
                        return ImageProvider.fromResource(aVar2.a, lzg0.ic_market_express_performer);
                    default:
                        return ImageProvider.fromBitmap(u8b1.h(lzg0.ic_logistics_another_order_point, aVar2.a));
                }
            }
        });
        final int i4 = 3;
        this.g = kotlin.a.a(new sls(this) { // from class: y9h
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                a aVar2 = this.b;
                switch (i22) {
                    case 0:
                        return a.c(aVar2, mqg0.component_gray_450, lzg0.ic_logistics_delivery_auto_pin);
                    case 1:
                        return a.c(aVar2, mqg0.component_gray_450, lzg0.ic_logistics_delivery_pedestrian_pin);
                    case 2:
                        return ImageProvider.fromResource(aVar2.a, lzg0.ic_market_express_performer);
                    default:
                        return ImageProvider.fromBitmap(u8b1.h(lzg0.ic_logistics_another_order_point, aVar2.a));
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(a aVar, ContinuationImpl continuationImpl) {
        DefaultDeliveryMapPointsDelegate$getSearchPinView$1 defaultDeliveryMapPointsDelegate$getSearchPinView$1;
        int i;
        Drawable t;
        if (continuationImpl instanceof DefaultDeliveryMapPointsDelegate$getSearchPinView$1) {
            defaultDeliveryMapPointsDelegate$getSearchPinView$1 = (DefaultDeliveryMapPointsDelegate$getSearchPinView$1) continuationImpl;
            int i2 = defaultDeliveryMapPointsDelegate$getSearchPinView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultDeliveryMapPointsDelegate$getSearchPinView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultDeliveryMapPointsDelegate$getSearchPinView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultDeliveryMapPointsDelegate$getSearchPinView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = aVar.b;
                    defaultDeliveryMapPointsDelegate$getSearchPinView$1.L$0 = aVar;
                    defaultDeliveryMapPointsDelegate$getSearchPinView$1.label = 1;
                    obj = bVar.a.b(defaultDeliveryMapPointsDelegate$getSearchPinView$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) defaultDeliveryMapPointsDelegate$getSearchPinView$1.L$0;
                    kotlin.b.b(obj);
                }
                PinV2Component pinV2Component = (PinV2Component) obj;
                Context context = aVar.a;
                t = vng.t(lzg0.ic_delivery_pin, context);
                if (t != null) {
                    pinV2Component.updateControlState(new SourceOnMapControl.a(new c0c0(t), null, null, false, false, null, null, 2046));
                }
                pinV2Component.updateControlStyle(new i1c0(context.getColor(xqg0.white), context.getColor(xqg0.black_two)));
                pinV2Component.updatePosition(PinV2Component.Position.ANCHORED, false);
                return pinV2Component;
            }
        }
        defaultDeliveryMapPointsDelegate$getSearchPinView$1 = new DefaultDeliveryMapPointsDelegate$getSearchPinView$1(aVar, continuationImpl);
        Object obj2 = defaultDeliveryMapPointsDelegate$getSearchPinView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultDeliveryMapPointsDelegate$getSearchPinView$1.label;
        if (i != 0) {
        }
        PinV2Component pinV2Component2 = (PinV2Component) obj2;
        Context context2 = aVar.a;
        t = vng.t(lzg0.ic_delivery_pin, context2);
        if (t != null) {
        }
        pinV2Component2.updateControlStyle(new i1c0(context2.getColor(xqg0.white), context2.getColor(xqg0.black_two)));
        pinV2Component2.updatePosition(PinV2Component.Position.ANCHORED, false);
        return pinV2Component2;
    }

    public static ImageProvider c(a aVar, int i, int i2) {
        int i3 = a2i0.IconWhiteNormal;
        Context context = aVar.a;
        Drawable t = vng.t(i2, new ContextThemeWrapper(context, i3));
        if (t == null) {
            w511.f(oyr.j(i2, "Drawable resource ", " not found"));
            return null;
        }
        int color = context.getColor(i);
        FixedPinView fixedPinView = doa1.a;
        if (fixedPinView == null) {
            fixedPinView = (FixedPinView) LayoutInflater.from(context).inflate(tqh0.fixed_map_pin, (ViewGroup) new FrameLayout(context), false);
            int i4 = fixedPinView.getLayoutParams().width;
            int i5 = fixedPinView.getLayoutParams().height;
            fixedPinView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            fixedPinView.layout(0, 0, i4, i5);
            doa1.a = fixedPinView;
        }
        fixedPinView.setIcon(t);
        fixedPinView.setPinColor(color);
        return fixedPinView.imageProviderForCurrentState();
    }

    public final ImageProvider a(Bitmap bitmap, String str, String str2) {
        if ((str == null || str.length() == 0) && ((str2 == null || str2.length() == 0) && bitmap == null)) {
            return null;
        }
        BubbleComponent bubbleComponent = new BubbleComponent(this.a, null, 0, 6, null);
        bubbleComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        g7h g7hVar = new g7h(bubbleComponent.getContext());
        g7hVar.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
        g7hVar.b(new bdc(xng0.bgMain));
        bubbleComponent.setDecorator(g7hVar);
        DeliveryPinView deliveryPinView = new DeliveryPinView(bubbleComponent.getContext(), null, 0, 6, null);
        deliveryPinView.setTitle(str);
        deliveryPinView.setSubtitle(str2);
        deliveryPinView.setLeadImage(bitmap);
        bubbleComponent.addView(deliveryPinView);
        xw31.r(bubbleComponent);
        Bitmap t = xw31.t(bubbleComponent);
        float dimension = bubbleComponent.getContext().getResources().getDimension(rrg0.delivery_bubble_badge_shadow_dy);
        float dimension2 = bubbleComponent.getContext().getResources().getDimension(rrg0.delivery_bubble_badge_shadow_blur);
        int color = bubbleComponent.getContext().getColor(mqg0.black_alpha10);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = bubbleComponent.getContext().getResources().getDimension(mrg0.bubble_component_corner_radius);
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.setIntrinsicWidth(t.getWidth());
        shapeDrawable.setIntrinsicHeight(t.getHeight());
        ru.yandex.taxi.design.utils.a aVar = this.c;
        int d = aVar.d(shapeDrawable);
        int b = aVar.b(shapeDrawable);
        float f = ru.yandex.taxi.design.utils.a.f(dimension2, 0.0f);
        float f2 = ru.yandex.taxi.design.utils.a.f(dimension2, dimension);
        int g = ru.yandex.taxi.design.utils.a.g(dimension2, d, f);
        int g2 = ru.yandex.taxi.design.utils.a.g(dimension2, b, f2);
        int c = (int) ru.yandex.taxi.design.utils.a.c(dimension2, 0.0f);
        int c2 = (int) ru.yandex.taxi.design.utils.a.c(dimension2, dimension);
        Rect rect = new Rect(c, c2, g - (d + c), g2 - (b + c2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{aVar.e(shapeDrawable, 0.0f, dimension, dimension2, color, false)});
        layerDrawable.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        bubbleComponent.setBackground(layerDrawable);
        xw31.r(bubbleComponent);
        return ImageProvider.fromBitmap(xw31.t(bubbleComponent));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Drawable drawable, int i, int i2, Continuation continuation) {
        DefaultDeliveryMapPointsDelegate$pinV2ImageProvider$1 defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1;
        int i3;
        if (continuation instanceof DefaultDeliveryMapPointsDelegate$pinV2ImageProvider$1) {
            defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1 = (DefaultDeliveryMapPointsDelegate$pinV2ImageProvider$1) continuation;
            int i4 = defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.label = i4 - Integer.MIN_VALUE;
                Object obj = defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.L$0 = null;
                    defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.I$0 = i;
                    defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.I$1 = i2;
                    defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.label = 1;
                    obj = this.b.a(drawable, i, i2, defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                bl00 bl00Var = (bl00) obj;
                return new rdi(bl00Var.a, bl00Var.b);
            }
        }
        defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1 = new DefaultDeliveryMapPointsDelegate$pinV2ImageProvider$1(this, continuation);
        Object obj2 = defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = defaultDeliveryMapPointsDelegate$pinV2ImageProvider$1.label;
        if (i3 != 0) {
        }
        bl00 bl00Var2 = (bl00) obj2;
        return new rdi(bl00Var2.a, bl00Var2.b);
    }
}
