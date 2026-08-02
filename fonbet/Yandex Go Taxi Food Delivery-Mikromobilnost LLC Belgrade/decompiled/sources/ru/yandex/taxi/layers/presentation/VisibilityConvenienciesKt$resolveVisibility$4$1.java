package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.if61;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ro00;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.xm00;
import defpackage.ym00;
import defpackage.ym91;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.intersection.Participant;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.VisibilityConvenienciesKt$resolveVisibility$4$1", f = "VisibilityConveniencies.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VisibilityConvenienciesKt$resolveVisibility$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ BoundingBox $boundingBox;
    final /* synthetic */ ym00 $component;
    final /* synthetic */ float $currentZoom;
    final /* synthetic */ Map<Participant, List<ro00>> $intersectsWith;
    final /* synthetic */ boolean $isIntersectionsCheckEnabled;
    final /* synthetic */ xm00 $layerCollection;
    final /* synthetic */ Map<String, Set<String>> $mapObjectsOverlaps;
    final /* synthetic */ wls $onVisibilityChanged;
    final /* synthetic */ tls $overrideZoomRangeProvider;
    final /* synthetic */ tls $provideScale;
    final /* synthetic */ Map<String, lm00> $this_resolveVisibility;
    final /* synthetic */ boolean $userplacesNewUiEnabled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VisibilityConvenienciesKt$resolveVisibility$4$1(Map map, ym00 ym00Var, wls wlsVar, tls tlsVar, float f, BoundingBox boundingBox, Map map2, boolean z, Map map3, boolean z2, tls tlsVar2, xm00 xm00Var, Continuation continuation) {
        super(2, continuation);
        this.$this_resolveVisibility = map;
        this.$component = ym00Var;
        this.$onVisibilityChanged = wlsVar;
        this.$overrideZoomRangeProvider = tlsVar;
        this.$currentZoom = f;
        this.$boundingBox = boundingBox;
        this.$mapObjectsOverlaps = map2;
        this.$isIntersectionsCheckEnabled = z;
        this.$intersectsWith = map3;
        this.$userplacesNewUiEnabled = z2;
        this.$provideScale = tlsVar2;
        this.$layerCollection = xm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VisibilityConvenienciesKt$resolveVisibility$4$1(this.$this_resolveVisibility, this.$component, this.$onVisibilityChanged, this.$overrideZoomRangeProvider, this.$currentZoom, this.$boundingBox, this.$mapObjectsOverlaps, this.$isIntersectionsCheckEnabled, this.$intersectsWith, this.$userplacesNewUiEnabled, this.$provideScale, this.$layerCollection, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VisibilityConvenienciesKt$resolveVisibility$4$1 visibilityConvenienciesKt$resolveVisibility$4$1 = (VisibilityConvenienciesKt$resolveVisibility$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        visibilityConvenienciesKt$resolveVisibility$4$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lm00 lm00Var = (lm00) kotlin.collections.b.g(this.$component.e(), this.$this_resolveVisibility);
        ym00 ym00Var = this.$component;
        ym91.b(ym00Var.g(), this.$onVisibilityChanged);
        a.e((if61) this.$overrideZoomRangeProvider.invoke(lm00Var.c), this.$currentZoom, lm00Var, this.$boundingBox, this.$component, this.$this_resolveVisibility, this.$mapObjectsOverlaps, this.$isIntersectionsCheckEnabled, this.$intersectsWith, this.$userplacesNewUiEnabled);
        a.b(this.$currentZoom, (Float) this.$provideScale.invoke(lm00Var.c), lm00Var, this.$component, this.$layerCollection);
        return zy11.a;
    }
}
