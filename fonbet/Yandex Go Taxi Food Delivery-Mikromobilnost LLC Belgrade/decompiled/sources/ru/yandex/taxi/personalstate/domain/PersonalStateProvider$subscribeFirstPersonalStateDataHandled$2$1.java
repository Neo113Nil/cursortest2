package ru.yandex.taxi.personalstate.domain;

import com.yandex.go.zone.model.Zone;
import defpackage.j6b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6b0;
import defpackage.p6b0;
import defpackage.s6b0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls6b0;", "personalStateLoadingState", "Lzy11;", "<anonymous>", "(Ls6b0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$subscribeFirstPersonalStateDataHandled$2$1", f = "PersonalStateProvider.kt", l = {157, HProv.PP_LICENSE, 162, HProv.PP_HANDLE_COUNT, 169}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$subscribeFirstPersonalStateDataHandled$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalStateProvider$subscribeFirstPersonalStateDataHandled$2$1(Continuation continuation, o oVar) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalStateProvider$subscribeFirstPersonalStateDataHandled$2$1 personalStateProvider$subscribeFirstPersonalStateDataHandled$2$1 = new PersonalStateProvider$subscribeFirstPersonalStateDataHandled$2$1(continuation, this.this$0);
        personalStateProvider$subscribeFirstPersonalStateDataHandled$2$1.L$0 = obj;
        return personalStateProvider$subscribeFirstPersonalStateDataHandled$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalStateProvider$subscribeFirstPersonalStateDataHandled$2$1) create((s6b0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        if (ru.yandex.taxi.personalstate.domain.o.b(r11, r10) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (ru.yandex.taxi.personalstate.domain.o.c(r11, r0, r10) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r11.b(r2, r10) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r11.a(r10) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s6b0 s6b0Var = (s6b0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (s6b0Var instanceof p6b0) {
                com.yandex.go.taxi.tariffs.interactor.b bVar = this.this$0.p;
                Zone zone = ((p6b0) s6b0Var).b.b;
                this.L$0 = s6b0Var;
                this.label = 1;
            } else {
                if (s6b0Var instanceof o6b0) {
                    com.yandex.go.taxi.tariffs.interactor.b bVar2 = this.this$0.p;
                    this.L$0 = null;
                    this.label = 3;
                }
                r0 r0Var = this.this$0.t;
                Boolean bool = Boolean.TRUE;
                this.L$0 = null;
                this.label = 5;
                r0Var.emit(bool, this);
                if (zy11Var != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    o oVar = this.this$0;
                    this.L$0 = null;
                    this.label = 4;
                } else if (i != 4) {
                    if (i == 5) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            r0 r0Var2 = this.this$0.t;
            Boolean bool2 = Boolean.TRUE;
            this.L$0 = null;
            this.label = 5;
            r0Var2.emit(bool2, this);
            return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        kotlin.b.b(obj);
        o oVar2 = this.this$0;
        j6b0 j6b0Var = ((p6b0) s6b0Var).b;
        this.L$0 = null;
        this.label = 2;
    }
}
