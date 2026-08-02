package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.aif;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.vng;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x8n;
import defpackage.zcz0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Laif;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.CurrentDynamicTimelineInteractor$currentTimelineFlow$1", f = "CurrentDynamicTimelineInteractor.kt", l = {38, 44, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CurrentDynamicTimelineInteractor$currentTimelineFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<Long> $timeBounds;
    final /* synthetic */ List<x8n> $timelines;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    long J$4;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentDynamicTimelineInteractor$currentTimelineFlow$1(List list, a aVar, List list2, Continuation continuation) {
        super(2, continuation);
        this.$timelines = list;
        this.this$0 = aVar;
        this.$timeBounds = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CurrentDynamicTimelineInteractor$currentTimelineFlow$1 currentDynamicTimelineInteractor$currentTimelineFlow$1 = new CurrentDynamicTimelineInteractor$currentTimelineFlow$1(this.$timelines, this.this$0, this.$timeBounds, continuation);
        currentDynamicTimelineInteractor$currentTimelineFlow$1.L$0 = obj;
        return currentDynamicTimelineInteractor$currentTimelineFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CurrentDynamicTimelineInteractor$currentTimelineFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01e9 -> B:8:0x01f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x01f3 -> B:9:0x01f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x012e -> B:30:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0136 -> B:31:0x0138). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        List<Long> list;
        Iterator it;
        int i;
        int i2;
        List<Long> list2;
        Iterator it2;
        int i3;
        int i4;
        int i5;
        long j2;
        char c;
        int i6;
        x8n x8nVar;
        long j3;
        long longValue;
        long j4;
        long j5;
        long j6;
        x8n x8nVar2;
        long j7;
        long j8;
        int i7;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.label;
        char c2 = 2;
        if (i8 == 0) {
            j = 0;
            kotlin.b.b(obj);
            List<x8n> list3 = this.$timelines;
            list = this.$timeBounds;
            it = list3.iterator();
            i = 0;
            i2 = 0;
            if (!it.hasNext()) {
            }
            return zy11.a;
        }
        if (i8 == 1) {
            j = 0;
            j2 = this.J$0;
            int i9 = this.I$3;
            int i10 = this.I$2;
            int i11 = this.I$1;
            int i12 = this.I$0;
            it2 = (Iterator) this.L$3;
            list2 = (List) this.L$2;
            kotlin.b.b(obj);
            i4 = i10;
            i5 = i9;
            i = i12;
            i3 = i11;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = list2;
            this.L$3 = it2;
            this.L$4 = null;
            this.L$5 = null;
            this.I$0 = i;
            this.I$1 = i3;
            this.I$2 = i4;
            this.I$3 = i5;
            this.J$0 = j2;
            c = 2;
            this.label = 2;
            if (kotlinx.coroutines.a.i(j2, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                long j9 = this.J$4;
                long j10 = this.J$3;
                j5 = this.J$2;
                i7 = this.I$0;
                j = 0;
                j8 = this.J$1;
                j7 = this.J$0;
                x8nVar2 = (x8n) this.L$1;
                kotlin.b.b(obj);
                j4 = j10;
                j6 = j9;
                long j11 = j5;
                this.L$0 = vprVar;
                this.L$1 = x8nVar2;
                this.J$0 = j7;
                this.J$1 = j8;
                this.I$0 = i7;
                this.J$2 = j11;
                this.J$3 = j4;
                this.J$4 = j6;
                this.label = 4;
                if (kotlinx.coroutines.a.i(j6, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i8 != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = this.I$0;
            long j12 = this.J$1;
            long j13 = this.J$0;
            x8n x8nVar3 = (x8n) this.L$1;
            kotlin.b.b(obj);
            i6 = i13;
            x8nVar = x8nVar3;
            j = 0;
            long j14 = j12;
            j3 = j13;
            longValue = j14;
            if (kotlinx.coroutines.a.p(get_context())) {
                int i14 = i6 + 1;
                j5 = (i6 * j3) + longValue;
                long j15 = j5 + j3;
                j6 = j15 - vng.I();
                if (j6 > j) {
                    aif aifVar = new aif(x8nVar, j5);
                    this.L$0 = vprVar;
                    this.L$1 = x8nVar;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.J$0 = j3;
                    this.J$1 = longValue;
                    this.I$0 = i14;
                    this.J$2 = j5;
                    long j16 = longValue;
                    this.J$3 = j15;
                    this.J$4 = j6;
                    this.label = 3;
                    if (vprVar.emit(aifVar, this) != coroutineSingletons) {
                        x8nVar2 = x8nVar;
                        i7 = i14;
                        j7 = j3;
                        j8 = j16;
                        j4 = j15;
                        long j112 = j5;
                        this.L$0 = vprVar;
                        this.L$1 = x8nVar2;
                        this.J$0 = j7;
                        this.J$1 = j8;
                        this.I$0 = i7;
                        this.J$2 = j112;
                        this.J$3 = j4;
                        this.J$4 = j6;
                        this.label = 4;
                        if (kotlinx.coroutines.a.i(j6, this) != coroutineSingletons) {
                            i6 = i7;
                            x8nVar = x8nVar2;
                            j14 = j8;
                            j3 = j7;
                            longValue = j14;
                            if (kotlinx.coroutines.a.p(get_context())) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                i6 = i14;
                if (kotlinx.coroutines.a.p(get_context())) {
                }
            }
            return zy11.a;
        }
        j = 0;
        int i15 = this.I$1;
        int i16 = this.I$0;
        Iterator it3 = (Iterator) this.L$3;
        List<Long> list4 = (List) this.L$2;
        kotlin.b.b(obj);
        list2 = list4;
        c = 2;
        i3 = i15;
        it = it3;
        i = i16;
        list = list2;
        c2 = c;
        i2 = i3;
        if (!it.hasNext()) {
            Object next = it.next();
            i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            x8n x8nVar4 = (x8n) next;
            if (kotlinx.coroutines.a.p(get_context())) {
                long longValue2 = list.get(i3).longValue() - vng.I();
                if (longValue2 > j) {
                    aif aifVar2 = new aif(x8nVar4, list.get(i2).longValue());
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = list;
                    this.L$3 = it;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.I$0 = i;
                    this.I$1 = i3;
                    this.I$2 = i2;
                    this.I$3 = 0;
                    this.J$0 = longValue2;
                    this.label = 1;
                    if (vprVar.emit(aifVar2, this) != coroutineSingletons) {
                        i4 = i2;
                        i5 = 0;
                        it2 = it;
                        list2 = list;
                        j2 = longValue2;
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.L$2 = list2;
                        this.L$3 = it2;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.I$0 = i;
                        this.I$1 = i3;
                        this.I$2 = i4;
                        this.I$3 = i5;
                        this.J$0 = j2;
                        c = 2;
                        this.label = 2;
                        if (kotlinx.coroutines.a.i(j2, this) != coroutineSingletons) {
                            i16 = i;
                            i15 = i3;
                            it3 = it2;
                            i3 = i15;
                            it = it3;
                            i = i16;
                            list = list2;
                            c2 = c;
                            i2 = i3;
                            if (!it.hasNext()) {
                                i6 = 0;
                                x8nVar = (x8n) kotlin.collections.a.b0(this.$timelines);
                                if (x8nVar != null) {
                                    this.this$0.getClass();
                                    Iterator it4 = x8nVar.a.iterator();
                                    j3 = j;
                                    while (it4.hasNext()) {
                                        j3 += ((zcz0) it4.next()).a;
                                    }
                                    Long l = (Long) kotlin.collections.a.b0(this.$timeBounds);
                                    if (l != null) {
                                        longValue = l.longValue();
                                        if (kotlinx.coroutines.a.p(get_context())) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                c = c2;
                c2 = c;
                i2 = i3;
                if (!it.hasNext()) {
                }
            }
        }
        return zy11.a;
    }
}
