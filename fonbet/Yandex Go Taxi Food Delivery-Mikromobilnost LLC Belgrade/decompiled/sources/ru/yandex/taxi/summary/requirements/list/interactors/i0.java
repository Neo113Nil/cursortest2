package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.zone.dto.objects.TariffGroupDefinitionType;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class i0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k0 b;

    public i0(vpr vprVar, k0 k0Var) {
        this.a = vprVar;
        this.b = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0111, code lost:
    
        if (r8.emit((java.util.List) r10, r0) != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0113, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SupportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1 supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof SupportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1) {
            supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1 = (SupportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1) continuation;
            int i2 = supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((Zone) obj).k;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Iterable iterable = ((ZoneTariffInfo) it.next()).n;
                        if (iterable == null) {
                            iterable = EmptyList.a;
                        }
                        ycc.r(iterable, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((TariffInfoGroupDefinition) next).c == TariffGroupDefinitionType.CAROUSEL) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ycc.r(((TariffInfoGroupDefinition) it3.next()).b, arrayList3);
                    }
                    List I = kotlin.collections.a.I(arrayList3);
                    j jVar = this.b.m;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$0 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$1 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$2 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$5 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$6 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$7 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$8 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$9 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$10 = null;
                    supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = jVar.b(I, supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$0 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$1 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$2 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$3 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$4 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$5 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$6 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$7 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$8 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$9 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$10 = null;
                supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1 = new SupportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$0 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$1 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$2 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$3 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$4 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$5 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$6 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$7 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$8 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$9 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.L$10 = null;
        supportedRequirementsInteractor$allRequirementsInCarouselGroupFlow$$inlined$map$1$2$1.label = 2;
    }
}
