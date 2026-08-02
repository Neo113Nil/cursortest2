package ru.yandex.taxi.map_common.map;

import android.app.Application;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.i18n.I18nManagerFactory;
import defpackage.ayn;
import defpackage.byn;
import defpackage.el00;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.hzk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yws;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitManagerImpl$initNativeLibraries$2", f = "MapKitManagerImpl.kt", l = {128}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapKitManagerImpl$initNativeLibraries$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapKitManagerImpl$initNativeLibraries$2(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapKitManagerImpl$initNativeLibraries$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapKitManagerImpl$initNativeLibraries$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0;
            Application application = nVar.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            byn bynVar = nVar.e;
            if (((ayn) bynVar.a.c()).b) {
                t1b0 t1b0Var = bynVar.a;
                if (((ayn) t1b0Var.c()).c) {
                    n.k("driving", linkedHashMap);
                }
                if (((ayn) t1b0Var.c()).d) {
                    n.k(PolicyMappingsExtension.MAP, linkedHashMap);
                }
                if (((ayn) t1b0Var.c()).e) {
                    n.k("search", linkedHashMap);
                }
                if (((ayn) t1b0Var.c()).f) {
                    n.k("suggest", linkedHashMap);
                }
                if (((ayn) t1b0Var.c()).g) {
                    n.k("traffic", linkedHashMap);
                }
            }
            linkedHashMap.put("yandex.maps.runtime.config.use_only_custom_experiments", "true");
            Runtime.init(application, linkedHashMap);
            fyc b = gwk0.b();
            hzk hzkVar = this.this$0.i;
            tje.N(this.this$0.j(), null, null, new MapKitManagerImpl$initNativeLibraries$2$invokeSuspend$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new com.yandex.go.proxyprovision.c(ru.yandex.taxi.experiments.d.b((yws) hzkVar.a), hzkVar)), null, this.this$0, b), 3);
            this.L$0 = null;
            this.label = 1;
            if (b.s(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        MapKitFactory.initialize(this.this$0.b);
        this.this$0.o = I18nManagerFactory.getLocale();
        this.this$0.getClass();
        el00.a = true;
        return zy11.a;
    }
}
