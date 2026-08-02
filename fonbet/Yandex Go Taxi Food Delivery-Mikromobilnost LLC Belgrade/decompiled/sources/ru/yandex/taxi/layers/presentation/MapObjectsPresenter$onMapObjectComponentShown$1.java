package ru.yandex.taxi.layers.presentation;

import android.util.LruCache;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import defpackage.j22;
import defpackage.k22;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sm00;
import defpackage.tse;
import defpackage.v35;
import defpackage.w511;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsPresenter$onMapObjectComponentShown$1", f = "MapObjectsPresenter.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsPresenter$onMapObjectComponentShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $fullMode;
    final /* synthetic */ lm00 $hostMapObject;
    final /* synthetic */ ym00 $mapObjectComponent;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsPresenter$onMapObjectComponentShown$1(ym00 ym00Var, g gVar, lm00 lm00Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$mapObjectComponent = ym00Var;
        this.this$0 = gVar;
        this.$hostMapObject = lm00Var;
        this.$fullMode = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsPresenter$onMapObjectComponentShown$1(this.$mapObjectComponent, this.this$0, this.$hostMapObject, this.$fullMode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsPresenter$onMapObjectComponentShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LruCache lruCache;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean z = this.$mapObjectComponent.g().b;
        zy11 zy11Var = zy11.a;
        if (z) {
            k22 k22Var = this.this$0.y;
            lm00 lm00Var = this.$hostMapObject;
            ym00 ym00Var = this.$mapObjectComponent;
            sm00 a = sm00.a(lm00Var.h, this.$fullMode);
            k22Var.getClass();
            v35 v35Var = (v35) ym00Var;
            int i2 = j22.a[v35Var.e.ordinal()];
            if (i2 == 1) {
                lruCache = (LruCache) k22Var.f.getValue();
            } else if (i2 == 2) {
                lruCache = (LruCache) k22Var.g.getValue();
            } else if (i2 == 3) {
                lruCache = (LruCache) k22Var.h.getValue();
            } else if (i2 == 4) {
                lruCache = (LruCache) k22Var.i.getValue();
            } else if (i2 != 5) {
                w511.b();
                return null;
            }
            String str = lm00Var.a;
            if (lruCache.get(str) == null) {
                LayersAnalyticEventEmmiter layersAnalyticEventEmmiter = k22Var.a;
                MapObjectType mapObjectType = lm00Var.c;
                MapObjectComponentType mapObjectComponentType = v35Var.e;
                ru.yandex.taxi.layers.a aVar = (ru.yandex.taxi.layers.a) layersAnalyticEventEmmiter.a.get(mapObjectType);
                if (aVar != null) {
                    aVar.a(str, mapObjectComponentType, LayersAnalyticEventEmmiter.Event.SEEN, a);
                }
                lruCache.put(str + lm00Var.h.j, zy11Var);
            }
        }
        return zy11Var;
    }
}
