package ru.yandex.taxi.routeselector.presentation;

import defpackage.cal0;
import defpackage.dal0;
import defpackage.e1c0;
import defpackage.eji;
import defpackage.fji;
import defpackage.lub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uwt;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wwt;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3", f = "RouteSelectorPinV2StateRepository.kt", l = {348, 354, 356, 357, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ e1c0 $exp$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3(Continuation continuation, l lVar, e1c0 e1c0Var) {
        super(3, continuation);
        this.this$0 = lVar;
        this.$exp$inlined = e1c0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3 routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3 = new RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0, this.$exp$inlined);
        routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01e4, code lost:
    
        if (r1.emit(r15, r17) == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01e6, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (r2 == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014a, code lost:
    
        if (r2 == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0184, code lost:
    
        if (r2 == r3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c0, code lost:
    
        if (r2 == r3) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        fji fjiVar;
        int i;
        Object obj3;
        Object d;
        Object obj4;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            Object obj5 = objArr[0];
            Object obj6 = objArr[1];
            Object obj7 = objArr[2];
            Object obj8 = objArr[3];
            Object obj9 = objArr[4];
            Object obj10 = objArr[5];
            wwt wwtVar = (wwt) objArr[6];
            obj2 = (SourceOnMapControl.a) obj10;
            lub0 lub0Var = (lub0) obj9;
            eji ejiVar = (eji) obj8;
            cal0 cal0Var = (cal0) obj7;
            boolean booleanValue = ((Boolean) obj6).booleanValue();
            AddressResolveRepository.State state = (AddressResolveRepository.State) obj5;
            if (this.this$0.a.b()) {
                if (ejiVar != null) {
                    fjiVar = ejiVar.a;
                    if (fjiVar == null || obj2 == null) {
                        i = dal0.a[state.ordinal()];
                        if (i == 1) {
                            if (i == 2) {
                                obj3 = null;
                                d = this.this$0.l;
                            } else if (i == 3 || i == 4) {
                                obj3 = null;
                                d = this.this$0.m;
                            } else {
                                if (i != 5) {
                                    w511.b();
                                    return null;
                                }
                                if (fjiVar != null && booleanValue) {
                                    l lVar = this.this$0;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = vprVar;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.L$8 = null;
                                    this.L$9 = null;
                                    this.L$10 = null;
                                    this.L$11 = null;
                                    this.L$12 = null;
                                    this.Z$0 = booleanValue;
                                    this.label = 2;
                                    obj4 = l.a(lVar, fjiVar, this);
                                } else if ((wwtVar instanceof uwt) && this.this$0.a.b()) {
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = vprVar;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.L$8 = null;
                                    this.L$9 = null;
                                    this.L$10 = null;
                                    this.L$11 = null;
                                    this.L$12 = null;
                                    this.Z$0 = booleanValue;
                                    this.label = 3;
                                    obj4 = l.b(this.this$0, (uwt) wwtVar, this);
                                } else {
                                    l lVar2 = this.this$0;
                                    if (booleanValue) {
                                        e1c0 e1c0Var = this.$exp$inlined;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = vprVar;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = null;
                                        this.L$9 = null;
                                        this.L$10 = null;
                                        this.L$11 = null;
                                        this.L$12 = null;
                                        this.Z$0 = booleanValue;
                                        this.label = 4;
                                        obj4 = lVar2.a.b() ? lVar2.f(cal0Var, e1c0Var, lub0Var, this) : lVar2.e(cal0Var, e1c0Var, this);
                                    } else {
                                        obj4 = lVar2.l;
                                    }
                                    obj2 = obj4;
                                }
                            }
                            obj2 = d;
                        } else {
                            obj3 = null;
                            l lVar3 = this.this$0;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = vprVar;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.L$10 = null;
                            this.L$11 = null;
                            this.L$12 = null;
                            this.Z$0 = booleanValue;
                            this.label = 1;
                            d = lVar3.d(this);
                        }
                        this.L$0 = obj3;
                        this.L$1 = obj3;
                        this.L$2 = obj3;
                        this.L$3 = obj3;
                        this.L$4 = obj3;
                        this.L$5 = obj3;
                        this.L$6 = obj3;
                        this.L$7 = obj3;
                        this.L$8 = obj3;
                        this.L$9 = obj3;
                        this.L$10 = obj3;
                        this.L$11 = obj3;
                        this.L$12 = obj3;
                        this.label = 5;
                    }
                    obj3 = null;
                    this.L$0 = obj3;
                    this.L$1 = obj3;
                    this.L$2 = obj3;
                    this.L$3 = obj3;
                    this.L$4 = obj3;
                    this.L$5 = obj3;
                    this.L$6 = obj3;
                    this.L$7 = obj3;
                    this.L$8 = obj3;
                    this.L$9 = obj3;
                    this.L$10 = obj3;
                    this.L$11 = obj3;
                    this.L$12 = obj3;
                    this.label = 5;
                }
                fjiVar = null;
                if (fjiVar == null) {
                }
                i = dal0.a[state.ordinal()];
                if (i == 1) {
                }
                this.L$0 = obj3;
                this.L$1 = obj3;
                this.L$2 = obj3;
                this.L$3 = obj3;
                this.L$4 = obj3;
                this.L$5 = obj3;
                this.L$6 = obj3;
                this.L$7 = obj3;
                this.L$8 = obj3;
                this.L$9 = obj3;
                this.L$10 = obj3;
                this.L$11 = obj3;
                this.L$12 = obj3;
                this.label = 5;
            } else {
                if (ejiVar != null) {
                    fjiVar = ejiVar.b;
                    if (fjiVar == null) {
                    }
                    i = dal0.a[state.ordinal()];
                    if (i == 1) {
                    }
                    this.L$0 = obj3;
                    this.L$1 = obj3;
                    this.L$2 = obj3;
                    this.L$3 = obj3;
                    this.L$4 = obj3;
                    this.L$5 = obj3;
                    this.L$6 = obj3;
                    this.L$7 = obj3;
                    this.L$8 = obj3;
                    this.L$9 = obj3;
                    this.L$10 = obj3;
                    this.L$11 = obj3;
                    this.L$12 = obj3;
                    this.label = 5;
                }
                fjiVar = null;
                if (fjiVar == null) {
                }
                i = dal0.a[state.ordinal()];
                if (i == 1) {
                }
                this.L$0 = obj3;
                this.L$1 = obj3;
                this.L$2 = obj3;
                this.L$3 = obj3;
                this.L$4 = obj3;
                this.L$5 = obj3;
                this.L$6 = obj3;
                this.L$7 = obj3;
                this.L$8 = obj3;
                this.L$9 = obj3;
                this.L$10 = obj3;
                this.L$11 = obj3;
                this.L$12 = obj3;
                this.label = 5;
            }
        } else if (i2 == 1) {
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            d = obj;
            obj3 = null;
            obj2 = d;
            this.L$0 = obj3;
            this.L$1 = obj3;
            this.L$2 = obj3;
            this.L$3 = obj3;
            this.L$4 = obj3;
            this.L$5 = obj3;
            this.L$6 = obj3;
            this.L$7 = obj3;
            this.L$8 = obj3;
            this.L$9 = obj3;
            this.L$10 = obj3;
            this.L$11 = obj3;
            this.L$12 = obj3;
            this.label = 5;
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                if (i2 == 5) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            obj4 = obj;
            obj2 = obj4;
            obj3 = null;
            this.L$0 = obj3;
            this.L$1 = obj3;
            this.L$2 = obj3;
            this.L$3 = obj3;
            this.L$4 = obj3;
            this.L$5 = obj3;
            this.L$6 = obj3;
            this.L$7 = obj3;
            this.L$8 = obj3;
            this.L$9 = obj3;
            this.L$10 = obj3;
            this.L$11 = obj3;
            this.L$12 = obj3;
            this.label = 5;
        }
    }
}
