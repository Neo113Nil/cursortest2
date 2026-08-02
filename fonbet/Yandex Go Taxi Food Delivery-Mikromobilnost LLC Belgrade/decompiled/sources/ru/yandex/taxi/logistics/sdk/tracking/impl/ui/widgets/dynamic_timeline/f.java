package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline;

import defpackage.a9n;
import defpackage.b801;
import defpackage.b9n;
import defpackage.dqb1;
import defpackage.ey4;
import defpackage.g92;
import defpackage.jzt0;
import defpackage.mdh;
import defpackage.n1f;
import defpackage.ny61;
import defpackage.s9n;
import defpackage.sjh;
import defpackage.syc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.v9n;
import defpackage.x9n;
import defpackage.y9n;
import defpackage.z8n;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class f implements b801 {
    public final s9n a;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.domain.a b;
    public final x9n c;
    public final y9n d;
    public final String e = "dynamic-timeline-key";

    public f(ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, s9n s9nVar, ru.yandex.taxi.logistics.sdk.tracking.impl.domain.a aVar, x9n x9nVar) {
        this.a = s9nVar;
        this.b = aVar;
        this.c = x9nVar;
        this.d = new y9n(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new ey4(new syc(eVar.e, 11), 8)), new DynamicTimelineStateHolder$special$$inlined$flatMapLatest$1(null, this)), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f fVar, b9n b9nVar, ContinuationImpl continuationImpl) {
        DynamicTimelineStateHolder$mapToWidgetFlow$1 dynamicTimelineStateHolder$mapToWidgetFlow$1;
        int i;
        fVar.getClass();
        if (continuationImpl instanceof DynamicTimelineStateHolder$mapToWidgetFlow$1) {
            dynamicTimelineStateHolder$mapToWidgetFlow$1 = (DynamicTimelineStateHolder$mapToWidgetFlow$1) continuationImpl;
            int i2 = dynamicTimelineStateHolder$mapToWidgetFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dynamicTimelineStateHolder$mapToWidgetFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dynamicTimelineStateHolder$mapToWidgetFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dynamicTimelineStateHolder$mapToWidgetFlow$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(b9nVar instanceof z8n)) {
                        int i3 = 2;
                        if (!(b9nVar instanceof a9n)) {
                            return new g92(i3, obj2);
                        }
                        s9n s9nVar = fVar.a;
                        a9n a9nVar = (a9n) b9nVar;
                        s9nVar.getClass();
                        int i4 = a9nVar.a;
                        ListBuilder listBuilder = new ListBuilder(i4);
                        dqb1 dqb1Var = a9nVar.b;
                        listBuilder.add(new jzt0(dqb1Var != null ? s9nVar.a(dqb1Var) : null));
                        int i5 = i4 - 1;
                        for (int i6 = 0; i6 < i5; i6++) {
                            listBuilder.add(new jzt0(null));
                        }
                        return new g92(i3, new v9n(listBuilder.j()));
                    }
                    ArrayList arrayList = ((z8n) b9nVar).a;
                    dynamicTimelineStateHolder$mapToWidgetFlow$1.L$0 = null;
                    dynamicTimelineStateHolder$mapToWidgetFlow$1.label = 1;
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new DynamicTimelineStateHolder$getCurrentTimelineFlow$2(fVar, arrayList, null), dynamicTimelineStateHolder$mapToWidgetFlow$1);
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
                return new n1f(7, (tpr) obj, fVar);
            }
        }
        dynamicTimelineStateHolder$mapToWidgetFlow$1 = new DynamicTimelineStateHolder$mapToWidgetFlow$1(fVar, continuationImpl);
        Object obj3 = dynamicTimelineStateHolder$mapToWidgetFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dynamicTimelineStateHolder$mapToWidgetFlow$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        return new n1f(7, (tpr) obj3, fVar);
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.d;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.e;
    }
}
