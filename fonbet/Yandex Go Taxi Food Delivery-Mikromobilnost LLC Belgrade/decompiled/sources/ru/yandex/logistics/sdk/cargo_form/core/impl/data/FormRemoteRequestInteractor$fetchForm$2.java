package ru.yandex.logistics.sdk.cargo_form.core.impl.data;

import defpackage.a0t;
import defpackage.a6s;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.v5s;
import defpackage.w230;
import defpackage.w5s;
import defpackage.x43;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.address.g;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormUserInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.V2FormRequestDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormResponseDto;", "<anonymous>", "()Lan2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.data.FormRemoteRequestInteractor$fetchForm$2", f = "FormRemoteRequestInteractor.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormRemoteRequestInteractor$fetchForm$2 extends SuspendLambda implements tls {
    final /* synthetic */ j6s $state;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v5s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormRemoteRequestInteractor$fetchForm$2(v5s v5sVar, j6s j6sVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = v5sVar;
        this.$state = j6sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FormRemoteRequestInteractor$fetchForm$2(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FormRemoteRequestInteractor$fetchForm$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FormApi formApi;
        w5s w5sVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            formApi = (FormApi) this.this$0.i.get();
            v5s v5sVar = this.this$0;
            w5s w5sVar2 = v5sVar.j;
            g gVar = v5sVar.k;
            this.L$0 = formApi;
            this.L$1 = w5sVar2;
            this.label = 1;
            obj = gVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            w5sVar = w5sVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w5sVar = (w5s) this.L$1;
            formApi = (FormApi) this.L$0;
            b.b(obj);
        }
        a0t a0tVar = (a0t) obj;
        j6s j6sVar = this.$state;
        w5sVar.getClass();
        FormUserInfoDto formUserInfoDto = new FormUserInfoDto(scc.g(Double.valueOf(a0tVar.b), Double.valueOf(a0tVar.a)));
        LinkedHashMap f = w5sVar.b.f(j6sVar);
        String str = w5sVar.a;
        x43 x43Var = w5sVar.c.a;
        ArrayList arrayList = new ArrayList(tcc.n(x43Var, 10));
        Iterator it = x43Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((w230) it.next()).a);
        }
        a6s a6sVar = w5sVar.d;
        return formApi.a(new V2FormRequestDto(formUserInfoDto, f, str, arrayList, a6sVar != null ? a6sVar.a : null));
    }
}
