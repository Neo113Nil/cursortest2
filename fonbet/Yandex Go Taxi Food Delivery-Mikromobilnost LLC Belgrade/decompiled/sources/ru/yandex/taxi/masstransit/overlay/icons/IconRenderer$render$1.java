package ru.yandex.taxi.masstransit.overlay.icons;

import com.yandex.mapkit.map.PlacemarkMapObject;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.masstransit.model.VariantStyle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.overlay.icons.IconRenderer$render$1", f = "IconRenderer.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class IconRenderer$render$1 extends SuspendLambda implements wls {
    final /* synthetic */ VariantStyle.a $fallbackVariant;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $lineName;
    final /* synthetic */ PlacemarkMapObject $placemark;
    final /* synthetic */ float $rotation;
    final /* synthetic */ RouteType $routeType;
    final /* synthetic */ VariantStyle $style;
    final /* synthetic */ VariantStyle.a $variant;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconRenderer$render$1(b bVar, RouteType routeType, VariantStyle variantStyle, PlacemarkMapObject placemarkMapObject, String str, VariantStyle.a aVar, float f, boolean z, VariantStyle.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$routeType = routeType;
        this.$style = variantStyle;
        this.$placemark = placemarkMapObject;
        this.$lineName = str;
        this.$variant = aVar;
        this.$rotation = f;
        this.$isSelected = z;
        this.$fallbackVariant = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IconRenderer$render$1(this.this$0, this.$routeType, this.$style, this.$placemark, this.$lineName, this.$variant, this.$rotation, this.$isSelected, this.$fallbackVariant, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IconRenderer$render$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IconRenderer$render$1 iconRenderer$render$1;
        VariantStyle.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            RouteType routeType = this.$routeType;
            VariantStyle variantStyle = this.$style;
            PlacemarkMapObject placemarkMapObject = this.$placemark;
            String str = this.$lineName;
            VariantStyle.a aVar2 = this.$variant;
            float f = this.$rotation;
            boolean z = this.$isSelected;
            this.label = 1;
            iconRenderer$render$1 = this;
            obj = b.a(bVar, routeType, variantStyle, placemarkMapObject, str, aVar2, f, z, iconRenderer$render$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            iconRenderer$render$1 = this;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!booleanValue && (aVar = iconRenderer$render$1.$fallbackVariant) != null) {
            iconRenderer$render$1.this$0.d(iconRenderer$render$1.$routeType, iconRenderer$render$1.$style, iconRenderer$render$1.$placemark, iconRenderer$render$1.$lineName, aVar, iconRenderer$render$1.$rotation, iconRenderer$render$1.$isSelected);
        } else if (booleanValue && iconRenderer$render$1.$fallbackVariant == null) {
            iconRenderer$render$1.$placemark.setVisible(false);
        }
        return zy11.a;
    }
}
