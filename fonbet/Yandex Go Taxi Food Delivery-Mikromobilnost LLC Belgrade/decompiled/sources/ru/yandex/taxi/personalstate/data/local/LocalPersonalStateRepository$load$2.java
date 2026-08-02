package ru.yandex.taxi.personalstate.data.local;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.c6b0;
import defpackage.d6b0;
import defpackage.evu0;
import defpackage.h4z;
import defpackage.j7b0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.np40;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lj7b0;", "<anonymous>", "(Ltse;)Lj7b0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.data.local.LocalPersonalStateRepository$load$2", f = "LocalPersonalStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LocalPersonalStateRepository$load$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalPersonalStateRepository$load$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalPersonalStateRepository$load$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalPersonalStateRepository$load$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        h4z h4zVar = this.this$0.b;
        String l = h4zVar.b.l(ClidProvider.STATE, null);
        j7b0 j7b0Var = l != null ? (j7b0) ((xnt) h4zVar.a).c(l, j7b0.Companion.serializer()) : null;
        if (j7b0Var == null) {
            jst.e.k(new LocalPersonalStateEmptyException(), "PersonalState.Local.Repository.Empty");
            throw new LocalPersonalStateEmptyException();
        }
        ru.yandex.taxi.personalstate.data.remote.a aVar = this.this$0.c;
        aVar.getClass();
        d6b0 d6b0Var = new d6b0();
        np40 np40Var = j7b0Var.g;
        boolean z = false;
        if (np40Var != null && np40Var.b) {
            z = true;
        }
        String str = z ? "multiclass" : null;
        if (str == null || evu0.J(str)) {
            str = j7b0Var.b;
        }
        d6b0Var.d(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        String str2 = z ? np40Var != null ? np40Var.c : null : null;
        if (str2 == null || evu0.J(str2)) {
            str2 = j7b0Var.h;
        }
        LinkedHashMap linkedHashMap = d6b0Var.a;
        linkedHashMap.put("vertical", str2);
        c6b0 c6b0Var = aVar.b;
        String f = ru.yandex.taxi.personalstate.data.remote.a.f(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, linkedHashMap);
        String f2 = ru.yandex.taxi.personalstate.data.remote.a.f("vertical", linkedHashMap);
        c6b0Var.getClass();
        HashMap hashMap = new HashMap();
        if (f != null) {
            hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, f);
        }
        if (f2 != null) {
            hashMap.put("vertical", f2);
        }
        c6b0Var.a.a("PersonalState.Local.Loaded", hashMap, 1, new HashMap());
        return j7b0Var;
    }
}
