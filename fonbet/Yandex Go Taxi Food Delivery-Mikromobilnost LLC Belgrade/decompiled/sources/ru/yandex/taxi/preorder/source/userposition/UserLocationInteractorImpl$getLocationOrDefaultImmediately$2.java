package ru.yandex.taxi.preorder.source.userposition;

import android.location.Location;
import defpackage.ccz;
import defpackage.hcz;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmo21;", "<anonymous>", "(Ltse;)Lmo21;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.UserLocationInteractorImpl$getLocationOrDefaultImmediately$2", f = "UserLocationInteractorImpl.kt", l = {HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class UserLocationInteractorImpl$getLocationOrDefaultImmediately$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLocationInteractorImpl$getLocationOrDefaultImmediately$2(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserLocationInteractorImpl$getLocationOrDefaultImmediately$2(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserLocationInteractorImpl$getLocationOrDefaultImmediately$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r7 != r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mo21 mo21Var;
        e eVar;
        e eVar2;
        e eVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        e eVar4 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            ccz cczVar = eVar4.i;
            th.toString();
            cczVar.getClass();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = e.c(eVar4, this);
        }
        if (eVar4 == 0) {
            kotlin.b.b(obj);
            e eVar5 = this.this$0;
            eVar5.i.getClass();
            ru.yandex.taxi.preorder.source.userposition.repository.d dVar = eVar5.e;
            this.L$0 = eVar5;
            this.L$1 = eVar5;
            this.label = 1;
            obj = dVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = eVar5;
            eVar2 = eVar5;
        } else {
            if (eVar4 != 1) {
                if (eVar4 != 2) {
                    if (eVar4 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    mo21Var = (mo21) obj;
                    this.this$0.a.b(mo21Var);
                    return mo21Var;
                }
                e eVar6 = (e) this.L$1;
                eVar3 = (e) this.L$0;
                kotlin.b.b(obj);
                eVar4 = eVar6;
                Location location = (Location) obj;
                ccz cczVar2 = eVar3.i;
                Objects.toString(location);
                cczVar2.getClass();
                eVar3.d.j(location);
                mo21Var = e.l(location);
                this.this$0.a.b(mo21Var);
                return mo21Var;
            }
            e eVar7 = (e) this.L$1;
            eVar = (e) this.L$0;
            kotlin.b.b(obj);
            eVar2 = eVar7;
        }
        this.L$0 = eVar;
        this.L$1 = eVar2;
        this.label = 2;
        obj = ((hcz) obj).b(this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        eVar3 = eVar;
        eVar4 = eVar2;
        Location location2 = (Location) obj;
        ccz cczVar22 = eVar3.i;
        Objects.toString(location2);
        cczVar22.getClass();
        eVar3.d.j(location2);
        mo21Var = e.l(location2);
        this.this$0.a.b(mo21Var);
        return mo21Var;
    }
}
