package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack;

import defpackage.j6s;
import defpackage.mru;
import defpackage.mvg;
import defpackage.nru;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.HorizontalStackStateHolder$getWidgets$$inlined$combine$1$3", f = "HorizontalStackStateHolder.kt", l = {246, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HorizontalStackStateHolder$getWidgets$$inlined$combine$1$3 extends SuspendLambda implements zls {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
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
    final /* synthetic */ nru this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalStackStateHolder$getWidgets$$inlined$combine$1$3(Continuation continuation, nru nruVar) {
        super(3, continuation);
        this.this$0 = nruVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HorizontalStackStateHolder$getWidgets$$inlined$combine$1$3 horizontalStackStateHolder$getWidgets$$inlined$combine$1$3 = new HorizontalStackStateHolder$getWidgets$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        horizontalStackStateHolder$getWidgets$$inlined$combine$1$3.L$0 = (vpr) obj;
        horizontalStackStateHolder$getWidgets$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return horizontalStackStateHolder$getWidgets$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00da, code lost:
    
        if (r10.emit(r3, r14) != r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00dc, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
    
        if (r0 == r7) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        Object obj2;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            Object obj3 = objArr[0];
            Object obj4 = objArr[1];
            Object obj5 = objArr[2];
            Object obj6 = objArr[3];
            Object obj7 = objArr[4];
            Set set = (Set) objArr[5];
            boolean booleanValue = ((Boolean) obj7).booleanValue();
            FormLoadingStateRepository$State formLoadingStateRepository$State = (FormLoadingStateRepository$State) obj6;
            j6s j6sVar = (j6s) obj5;
            mru mruVar = (mru) obj4;
            ((Boolean) obj3).getClass();
            obj2 = EmptyList.a;
            if (mruVar != null && !this.this$0.g.C(mruVar)) {
                a aVar = this.this$0.c;
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
                this.I$0 = 0;
                this.Z$0 = booleanValue;
                this.I$1 = 0;
                this.label = 1;
                a = aVar.a(mruVar, formLoadingStateRepository$State, j6sVar, set, booleanValue, this);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            vpr vprVar2 = (vpr) this.L$2;
            kotlin.b.b(obj);
            vprVar = vprVar2;
            a = obj;
        }
        obj2 = Collections.singletonList(a);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.L$9 = null;
        this.label = 2;
    }
}
