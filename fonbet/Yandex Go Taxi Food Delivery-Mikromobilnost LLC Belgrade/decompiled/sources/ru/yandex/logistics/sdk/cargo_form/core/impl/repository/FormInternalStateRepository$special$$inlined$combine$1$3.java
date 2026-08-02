package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.a6s;
import defpackage.arb0;
import defpackage.b7s;
import defpackage.c3s;
import defpackage.e0l0;
import defpackage.gw00;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.l9i;
import defpackage.mea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6s;
import defpackage.vpr;
import defpackage.vqb0;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormStateRestoreModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormInternalStateRepository$special$$inlined$combine$1$3", f = "FormInternalStateRepository.kt", l = {274, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class FormInternalStateRepository$special$$inlined$combine$1$3 extends SuspendLambda implements zls {
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
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormInternalStateRepository$special$$inlined$combine$1$3(Continuation continuation, c cVar) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FormInternalStateRepository$special$$inlined$combine$1$3 formInternalStateRepository$special$$inlined$combine$1$3 = new FormInternalStateRepository$special$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        formInternalStateRepository$special$$inlined$combine$1$3.L$0 = (vpr) obj;
        formInternalStateRepository$special$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return formInternalStateRepository$special$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0186, code lost:
    
        if (r2.emit(r8, r31) != r1) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        j6s j6sVar;
        vpr vprVar2;
        j6s j6sVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            b7s b7sVar = (b7s) objArr[8];
            Map map = (Map) obj9;
            mea0 mea0Var = (mea0) obj8;
            arb0 arb0Var = (arb0) obj7;
            vqb0 vqb0Var = (vqb0) obj6;
            String str = (String) obj5;
            List list = (List) obj4;
            e0l0 e0l0Var = (e0l0) obj3;
            l9i l9iVar = (l9i) obj2;
            Map map2 = b7sVar.a;
            List list2 = jl40.l(mea0Var != null ? mea0Var.b : null, "corp") ? list : null;
            Map map3 = vqb0Var.a;
            e0l0 e0l0Var2 = arb0Var.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((c3s) entry.getValue()).a());
            }
            j6sVar = new j6s(map2, mea0Var, e0l0Var, e0l0Var2, map3, list2, str, l9iVar, linkedHashMap);
            if (!b7sVar.b) {
                c cVar = this.this$0;
                ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c cVar2 = cVar.a;
                String str2 = cVar.c;
                r6s r6sVar = cVar.b;
                String str3 = r6sVar.a;
                a6s a6sVar = r6sVar.b;
                FormStateRestoreModel formStateRestoreModel = new FormStateRestoreModel(str3, a6sVar != null ? a6sVar.a : null, map2, r6s.a(e0l0Var), r6s.a(e0l0Var2));
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
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = j6sVar;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (cVar2.d(str2, formStateRestoreModel, this) != coroutineSingletons) {
                    vprVar2 = vprVar;
                    j6sVar2 = j6sVar;
                }
                return coroutineSingletons;
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
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = null;
            this.L$13 = null;
            this.L$14 = null;
            this.L$15 = null;
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
            j6sVar2 = (j6s) this.L$15;
            vprVar2 = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        j6sVar = j6sVar2;
        vprVar = vprVar2;
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
        this.L$10 = null;
        this.L$11 = null;
        this.L$12 = null;
        this.L$13 = null;
        this.L$14 = null;
        this.L$15 = null;
        this.label = 2;
    }
}
