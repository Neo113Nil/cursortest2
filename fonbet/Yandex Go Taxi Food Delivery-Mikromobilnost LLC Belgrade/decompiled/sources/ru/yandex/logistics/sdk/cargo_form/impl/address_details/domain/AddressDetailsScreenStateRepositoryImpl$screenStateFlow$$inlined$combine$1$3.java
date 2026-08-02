package ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain;

import defpackage.at0;
import defpackage.e0l0;
import defpackage.g8l0;
import defpackage.gs0;
import defpackage.j6s;
import defpackage.jg00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rt0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.AddressDetailsState;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.AddressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3", f = "AddressDetailsScreenStateRepositoryImpl.kt", l = {248, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AddressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
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
    final /* synthetic */ rt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3(Continuation continuation, rt0 rt0Var) {
        super(3, continuation);
        this.this$0 = rt0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AddressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3 addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3 = new AddressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0141, code lost:
    
        if (r3.emit(r1, r2) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons;
        Object b;
        AddressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3 addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3;
        vpr vprVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar2 = (vpr) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            Object obj3 = objArr[0];
            Object obj4 = objArr[1];
            Object obj5 = objArr[2];
            Object obj6 = objArr[3];
            Object obj7 = objArr[4];
            Object obj8 = objArr[5];
            Object obj9 = objArr[6];
            Object obj10 = objArr[7];
            Object obj11 = objArr[8];
            Object obj12 = objArr[9];
            Object obj13 = objArr[10];
            Map map = (Map) objArr[11];
            boolean booleanValue = ((Boolean) obj12).booleanValue();
            Set set = (Set) obj9;
            FormLoadingStateRepository$State formLoadingStateRepository$State = (FormLoadingStateRepository$State) obj8;
            j6s j6sVar = (j6s) obj7;
            gs0 gs0Var = (gs0) obj6;
            List list = (List) obj5;
            at0 at0Var = (at0) obj4;
            e0l0 e0l0Var = (e0l0) obj3;
            rt0 rt0Var = this.this$0;
            c cVar = rt0Var.h;
            Integer num = rt0Var.a;
            g8l0 g8l0Var = rt0Var.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar2;
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
            this.L$13 = null;
            this.L$14 = null;
            this.L$15 = null;
            this.L$16 = null;
            this.I$0 = 0;
            this.Z$0 = booleanValue;
            this.I$1 = 0;
            this.label = 1;
            coroutineSingletons = coroutineSingletons2;
            b = cVar.b(e0l0Var, at0Var, list, gs0Var, j6sVar, formLoadingStateRepository$State, set, num, g8l0Var, (AddressDetailsState) obj10, (jg00) obj11, booleanValue, (Set) obj13, map, this);
            addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3 = this;
            if (b != coroutineSingletons) {
                vprVar = vprVar2;
                obj2 = null;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        vpr vprVar3 = (vpr) this.L$2;
        kotlin.b.b(obj);
        vprVar = vprVar3;
        obj2 = null;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3 = this;
        coroutineSingletons = coroutineSingletons2;
        b = obj;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$0 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$1 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$2 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$3 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$4 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$5 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$6 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$7 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$8 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$9 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$10 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$11 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$12 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$13 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$14 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$15 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.L$16 = obj2;
        addressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3.label = 2;
    }
}
