package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.bm00;
import defpackage.jdt0;
import defpackage.k7z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lq6z;", "Lk7z;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.input_controller.internal.InputLocationProviderImpl$getAllLastKnownLocations$2", f = "InputLocationProvider.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InputLocationProviderImpl$getAllLastKnownLocations$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.locationsdk.core.input_controller.internal.InputLocationProviderImpl$getAllLastKnownLocations$2$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            k7z k7zVar = (k7z) obj;
            k7z k7zVar2 = (k7z) obj2;
            return ((d) this.receiver).b.compare(k7zVar.a, k7zVar2.a) >= 0 ? k7zVar : k7zVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputLocationProviderImpl$getAllLastKnownLocations$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InputLocationProviderImpl$getAllLastKnownLocations$2 inputLocationProviderImpl$getAllLastKnownLocations$2 = new InputLocationProviderImpl$getAllLastKnownLocations$2(this.this$0, continuation);
        inputLocationProviderImpl$getAllLastKnownLocations$2.L$0 = obj;
        return inputLocationProviderImpl$getAllLastKnownLocations$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InputLocationProviderImpl$getAllLastKnownLocations$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            List list = dVar.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new InputLocationProviderImpl$getAllLastKnownLocations$2$1$1(dVar, (jdt0) it.next(), null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, this.this$0, d.class, "selectLastKnownOfSameSource", "selectLastKnownOfSameSource(Lru/yandex/taxi/locationsdk/core/location/Location;Lru/yandex/taxi/locationsdk/core/location/Location;)Lru/yandex/taxi/locationsdk/core/location/Location;", 0);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((Iterable) obj).iterator();
        while (it2.hasNext()) {
            ycc.r(((Map) it2.next()).entrySet(), arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.merge(entry.getKey(), entry.getValue(), new bm00(anonymousClass2, 1));
        }
        return linkedHashMap;
    }
}
