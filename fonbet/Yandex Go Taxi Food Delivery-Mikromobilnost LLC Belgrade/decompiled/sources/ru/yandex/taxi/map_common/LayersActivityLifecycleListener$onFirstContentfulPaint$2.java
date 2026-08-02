package ru.yandex.taxi.map_common;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.a4e0;
import defpackage.bn00;
import defpackage.hyx;
import defpackage.iyx;
import defpackage.jyx;
import defpackage.lp00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.vg10;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.presentation.f;
import ru.yandex.taxi.layers.presentation.i;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.intersection.ParticipantRelationsMode;
import ru.yandex.taxi.map_common.map.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.LayersActivityLifecycleListener$onFirstContentfulPaint$2", f = "LayersActivityLifecycleListener.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LayersActivityLifecycleListener$onFirstContentfulPaint$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.map_common.LayersActivityLifecycleListener$onFirstContentfulPaint$2$1", f = "LayersActivityLifecycleListener.kt", l = {45, 46, 49}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.map_common.LayersActivityLifecycleListener$onFirstContentfulPaint$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0156, code lost:
        
            if (kotlinx.coroutines.a.d(r16) == r0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0158, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x004f, code lost:
        
            if (r2.c(r16) != r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0039, code lost:
        
            if (r2 == r0) goto L52;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object u0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    pzt0 pzt0Var = this.this$0.f;
                    if (pzt0Var != null) {
                        this.label = 1;
                        u0 = pzt0Var.u0(this);
                    }
                    p pVar = (p) this.this$0.c.get();
                    this.label = 2;
                } else if (i == 1) {
                    kotlin.b.b(obj);
                    u0 = obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        throw new KotlinNothingValueException();
                    }
                    kotlin.b.b(obj);
                    ru.yandex.taxi.layers.b bVar = (ru.yandex.taxi.layers.b) this.this$0.d.get();
                    if (!bVar.k) {
                        bVar.k = true;
                        hyx hyxVar = (hyx) bVar.d.get();
                        for (Map.Entry entry : ((Map) hyxVar.h.get()).entrySet()) {
                            ((LayersAnalyticEventEmmiter) hyxVar.e.get()).a.put((EnumMap) entry.getKey(), (MapObjectType) entry.getValue());
                        }
                        ((jyx) hyxVar.c.get()).a.add((iyx) hyxVar.a.get());
                        f fVar = bVar.f;
                        if (fVar != null) {
                            fVar.M.g(fVar.e0);
                            lp00 lp00Var = fVar.w;
                            for (Map.Entry entry2 : fVar.J.entrySet()) {
                                ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var).a((Participant) entry2.getKey(), (bn00) entry2.getValue());
                            }
                            for (Map.Entry entry3 : fVar.I.entrySet()) {
                                Participant participant = (Participant) entry3.getKey();
                                Pair pair = (Pair) entry3.getValue();
                                ParticipantRelationsMode participantRelationsMode = (ParticipantRelationsMode) pair.c();
                                Participant[] participantArr = (Participant[]) pair.f();
                                Participant[] participantArr2 = (Participant[]) Arrays.copyOf(participantArr, participantArr.length);
                                vg10 vg10Var = new vg10(23);
                                for (Participant participant2 : participantArr2) {
                                    ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var).i(participant, participant2, participantRelationsMode, vg10Var);
                                }
                            }
                            fVar.c.resume();
                        }
                        a4e0 a4e0Var = bVar.g;
                        if (a4e0Var != null) {
                            a4e0Var.c.resume();
                        }
                        i iVar = bVar.h;
                        if (iVar != null) {
                            iVar.c.resume();
                        }
                    }
                    this.label = 3;
                }
                p pVar2 = (p) this.this$0.c.get();
                this.label = 2;
            } catch (Throwable th) {
                ru.yandex.taxi.layers.b bVar2 = (ru.yandex.taxi.layers.b) this.this$0.d.get();
                hyx hyxVar2 = (hyx) bVar2.d.get();
                Iterator it = ((Map) hyxVar2.h.get()).entrySet().iterator();
                while (it.hasNext()) {
                    ((LayersAnalyticEventEmmiter) hyxVar2.e.get()).a.remove((MapObjectType) ((Map.Entry) it.next()).getKey());
                }
                ((jyx) hyxVar2.c.get()).a.remove((iyx) hyxVar2.a.get());
                f fVar2 = bVar2.f;
                if (fVar2 != null) {
                    fVar2.M.g(null);
                    fVar2.c.pause();
                    lp00 lp00Var2 = fVar2.w;
                    for (Map.Entry entry4 : fVar2.I.entrySet()) {
                        Participant participant3 = (Participant) entry4.getKey();
                        Participant[] participantArr3 = (Participant[]) ((Pair) entry4.getValue()).f();
                        for (Participant participant4 : (Participant[]) Arrays.copyOf(participantArr3, participantArr3.length)) {
                            ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var2).l(participant3, participant4);
                        }
                    }
                    Iterator it2 = fVar2.J.keySet().iterator();
                    while (it2.hasNext()) {
                        ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var2).j((Participant) it2.next());
                    }
                    fVar2.x.pause();
                }
                a4e0 a4e0Var2 = bVar2.g;
                if (a4e0Var2 != null) {
                    a4e0Var2.c.pause();
                }
                i iVar2 = bVar2.h;
                if (iVar2 != null) {
                    iVar2.c.pause();
                }
                bVar2.k = false;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActivityLifecycleListener$onFirstContentfulPaint$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LayersActivityLifecycleListener$onFirstContentfulPaint$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersActivityLifecycleListener$onFirstContentfulPaint$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Lifecycle lifecycle = aVar.b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
