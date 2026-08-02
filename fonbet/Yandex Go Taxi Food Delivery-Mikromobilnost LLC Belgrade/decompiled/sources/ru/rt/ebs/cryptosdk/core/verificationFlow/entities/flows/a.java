package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows;

import defpackage.bvf0;
import defpackage.bxy;
import defpackage.eci0;
import defpackage.eg01;
import defpackage.ffx;
import defpackage.hnr0;
import defpackage.k2u0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o6f0;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.r721;
import defpackage.sjh;
import defpackage.tje;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.w511;
import defpackage.z3v;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Optional;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalStateVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Action;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.GlobalProcessingState;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.c;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.f;

/* loaded from: classes4.dex */
public abstract class a implements IVerificationFlow {
    public final eg01 a;
    public final n0 b;
    public final eci0 c;
    public final r0 d;
    public final r0 e;
    public z3v f;
    public pzt0 g;

    public a(eg01 eg01Var) {
        this.a = eg01Var;
        n0 c = ffx.c(0, 0, null, 7);
        this.b = c;
        this.c = e.c(c);
        r0 c2 = bvf0.c(GlobalProcessingState.INITIAL);
        this.d = c2;
        this.e = c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(a aVar, Class cls, Continuation continuation) {
        BaseVerificationFlow$getValue$1 baseVerificationFlow$getValue$1;
        int i;
        Optional optional;
        if (continuation instanceof BaseVerificationFlow$getValue$1) {
            baseVerificationFlow$getValue$1 = (BaseVerificationFlow$getValue$1) continuation;
            int i2 = baseVerificationFlow$getValue$1.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseVerificationFlow$getValue$1.c = i2 - Integer.MIN_VALUE;
                Object obj = baseVerificationFlow$getValue$1.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseVerificationFlow$getValue$1.c;
                if (i != 0) {
                    b.b(obj);
                    z3v z3vVar = aVar.f;
                    if (z3vVar != null) {
                        baseVerificationFlow$getValue$1.c = 1;
                        obj = z3vVar.getValue(cls, baseVerificationFlow$getValue$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    throw new IllegalStateVerificationFlowEbsException("Not active session");
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                optional = (Optional) obj;
                if (optional != null) {
                    return optional;
                }
                throw new IllegalStateVerificationFlowEbsException("Not active session");
            }
        }
        baseVerificationFlow$getValue$1 = new BaseVerificationFlow$getValue$1(aVar, continuation);
        Object obj2 = baseVerificationFlow$getValue$1.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseVerificationFlow$getValue$1.c;
        if (i != 0) {
        }
        optional = (Optional) obj2;
        if (optional != null) {
        }
        throw new IllegalStateVerificationFlowEbsException("Not active session");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        BaseVerificationFlow$startProcessingStateChangingJob$1 baseVerificationFlow$startProcessingStateChangingJob$1;
        int i;
        pzt0 pzt0Var;
        if (continuation instanceof BaseVerificationFlow$startProcessingStateChangingJob$1) {
            baseVerificationFlow$startProcessingStateChangingJob$1 = (BaseVerificationFlow$startProcessingStateChangingJob$1) continuation;
            int i2 = baseVerificationFlow$startProcessingStateChangingJob$1.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseVerificationFlow$startProcessingStateChangingJob$1.d = i2 - Integer.MIN_VALUE;
                Object obj = baseVerificationFlow$startProcessingStateChangingJob$1.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseVerificationFlow$startProcessingStateChangingJob$1.d;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    GlobalProcessingState globalProcessingState = GlobalProcessingState.INITIAL;
                    baseVerificationFlow$startProcessingStateChangingJob$1.a = this;
                    baseVerificationFlow$startProcessingStateChangingJob$1.d = 1;
                    this.d.emit(globalProcessingState, baseVerificationFlow$startProcessingStateChangingJob$1);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = baseVerificationFlow$startProcessingStateChangingJob$1.a;
                    b.b(obj);
                }
                this.getClass();
                GlobalProcessingState globalProcessingState2 = GlobalProcessingState.ADDITIONAL;
                BaseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1 baseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1 = new BaseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1(this, null);
                pzt0Var = this.g;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                sjh sjhVar = uyj.a;
                this.g = tje.N(bvf0.a(o400.a), null, null, new BaseVerificationFlow$scheduleProcessingStateUpdating$1(this, globalProcessingState2, baseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1, null), 3);
                return zy11Var;
            }
        }
        baseVerificationFlow$startProcessingStateChangingJob$1 = new BaseVerificationFlow$startProcessingStateChangingJob$1(this, continuation);
        Object obj2 = baseVerificationFlow$startProcessingStateChangingJob$1.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseVerificationFlow$startProcessingStateChangingJob$1.d;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.getClass();
        GlobalProcessingState globalProcessingState22 = GlobalProcessingState.ADDITIONAL;
        BaseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1 baseVerificationFlow$scheduleAdditionalProcessingStateUpdating$12 = new BaseVerificationFlow$scheduleAdditionalProcessingStateUpdating$1(this, null);
        pzt0Var = this.g;
        if (pzt0Var != null) {
        }
        sjh sjhVar2 = uyj.a;
        this.g = tje.N(bvf0.a(o400.a), null, null, new BaseVerificationFlow$scheduleProcessingStateUpdating$1(this, globalProcessingState22, baseVerificationFlow$scheduleAdditionalProcessingStateUpdating$12, null), 3);
        return zy11Var2;
    }

    public void c(Exception exc) {
        z3v z3vVar = this.f;
        if (z3vVar != null) {
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
        }
        try {
            z3v createState = this.a.createState(qoi0.a(c.class), this);
            this.f = createState;
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState).l(exc);
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            emit(new Event.Error(e));
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public final Object cancelProcessingStateUpdating(Continuation continuation) {
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        return zy11.a;
    }

    public void d(Object obj) {
        z3v z3vVar = this.f;
        boolean z = z3vVar instanceof r721;
        eg01 eg01Var = this.a;
        if (z) {
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
            try {
                z3v createState = eg01Var.createState(qoi0.a(k2u0.class), this);
                this.f = createState;
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState).l(obj);
                return;
            } catch (Exception e) {
                EbsLogger.INSTANCE.error(e);
                emit(new Event.Error(e));
                return;
            }
        }
        if (z3vVar instanceof k2u0) {
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
            try {
                z3v createState2 = eg01Var.createState(qoi0.a(bxy.class), this);
                this.f = createState2;
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState2).l(obj);
                return;
            } catch (Exception e2) {
                EbsLogger.INSTANCE.error(e2);
                emit(new Event.Error(e2));
                return;
            }
        }
        if (z3vVar instanceof o6f0) {
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
            try {
                z3v createState3 = eg01Var.createState(qoi0.a(f.class), this);
                this.f = createState3;
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState3).l(obj);
                return;
            } catch (Exception e3) {
                EbsLogger.INSTANCE.error(e3);
                emit(new Event.Error(e3));
                return;
            }
        }
        if (z3vVar instanceof ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.b) {
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
            try {
                z3v createState4 = eg01Var.createState(qoi0.a(f.class), this);
                this.f = createState4;
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState4).l(obj);
                return;
            } catch (Exception e4) {
                EbsLogger.INSTANCE.error(e4);
                emit(new Event.Error(e4));
                return;
            }
        }
        if (!(z3vVar instanceof c)) {
            EbsLogger.INSTANCE.warning("Flow[" + getName() + "]> onFinishState");
            return;
        }
        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
        try {
            z3v createState5 = eg01Var.createState(qoi0.a(f.class), this);
            this.f = createState5;
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState5).l(obj);
        } catch (Exception e5) {
            EbsLogger.INSTANCE.error(e5);
            emit(new Event.Error(e5));
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public final void emit(Event event) {
        EbsLogger ebsLogger = EbsLogger.INSTANCE;
        ebsLogger.info(unr0.p("Flow[", getName(), "]> event[", event.getClass().getSimpleName(), "]"));
        boolean z = event instanceof Event.Start;
        eg01 eg01Var = this.a;
        if (z) {
            Object value = ((Event.Start) event).getValue();
            String name = getName();
            z3v z3vVar = this.f;
            ebsLogger.info(unr0.p("Flow[", name, "]> startState[", z3vVar != null ? ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).f() : null, "]"));
            z3v z3vVar2 = this.f;
            if (z3vVar2 instanceof f) {
                ebsLogger.warning("Flow[" + getName() + "]> startState -> Finish");
                return;
            }
            if (z3vVar2 != null) {
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
            }
            try {
                z3v createState = eg01Var.createState(qoi0.a(r721.class), this);
                this.f = createState;
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState).l(value);
                return;
            } catch (Exception e) {
                EbsLogger.INSTANCE.error(e);
                emit(new Event.Error(e));
                return;
            }
        }
        if (event instanceof Event.Process) {
            Object value2 = ((Event.Process) event).getValue();
            String name2 = getName();
            z3v z3vVar3 = this.f;
            ebsLogger.info(unr0.p("Flow[", name2, "]> processState[", z3vVar3 != null ? ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar3).f() : null, "]"));
            z3v z3vVar4 = this.f;
            if (z3vVar4 != null) {
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar4).j(value2);
                return;
            }
            return;
        }
        if (event instanceof Event.Finish) {
            Object value3 = ((Event.Finish) event).getValue();
            String name3 = getName();
            z3v z3vVar5 = this.f;
            ebsLogger.info(unr0.p("Flow[", name3, "]> finishState[", z3vVar5 != null ? ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar5).f() : null, "]"));
            if (!(this.f instanceof f)) {
                d(value3);
                return;
            }
            ebsLogger.warning("Flow[" + getName() + "]> finishState -> Finish");
            return;
        }
        if (!(event instanceof Event.Cancel)) {
            if (!(event instanceof Event.Error)) {
                w511.b();
                return;
            }
            Exception value4 = ((Event.Error) event).getValue();
            String name4 = getName();
            z3v z3vVar6 = this.f;
            ebsLogger.info(unr0.p("Flow[", name4, "]> errorState[", z3vVar6 != null ? ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar6).f() : null, "]"));
            if (!(this.f instanceof f)) {
                c(value4);
                return;
            }
            ebsLogger.warning("Flow[" + getName() + "]> errorState -> Finish");
            return;
        }
        Object value5 = ((Event.Cancel) event).getValue();
        String name5 = getName();
        z3v z3vVar7 = this.f;
        ebsLogger.info(unr0.p("Flow[", name5, "]> cancelState[", z3vVar7 != null ? ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar7).f() : null, "]"));
        z3v z3vVar8 = this.f;
        if (z3vVar8 instanceof f) {
            ebsLogger.warning("Flow[" + getName() + "]> cancelState -> Finish");
            return;
        }
        if (z3vVar8 != null) {
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar8).a();
        }
        try {
            z3v createState2 = eg01Var.createState(qoi0.a(ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.b.class), this);
            this.f = createState2;
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState2).l(value5);
        } catch (Exception e2) {
            EbsLogger.INSTANCE.error(e2);
            emit(new Event.Error(e2));
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public final hnr0 getActions() {
        return this.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow
    public final String getName() {
        return getClass().getSimpleName();
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public final n4u0 getProcessingState() {
        return this.e;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public final Object getValue(Class cls, Continuation continuation) {
        return b(this, cls, continuation);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow
    public final void release() {
        z3v z3vVar = this.f;
        if (z3vVar != null) {
            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
        }
        this.f = null;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public final Object sendAction(Action action, Continuation continuation) {
        Object emit = this.b.emit(action, continuation);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public final Object startProcessingStateUpdating(Continuation continuation) {
        Object a = a(continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public final Object startProcessingStateUpdatingIfNotStarted(Continuation continuation) {
        Object a;
        pzt0 pzt0Var = this.g;
        return ((pzt0Var == null || !pzt0Var.isActive()) && (a = a(continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? a : zy11.a;
    }
}
