package ru.yandex.taxi.requirements.repository;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.repository.LocallyPersistantRequirementsRepository$removeRequirements$1", f = "LocallyPersistantRequirementsRepository.kt", l = {HProv.PROV_GOST_2001_DH, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocallyPersistantRequirementsRepository$removeRequirements$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $storageKeys;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocallyPersistantRequirementsRepository$removeRequirements$1(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$storageKeys = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocallyPersistantRequirementsRepository$removeRequirements$1(this.this$0, this.$storageKeys, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocallyPersistantRequirementsRepository$removeRequirements$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        List<String> list;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                bVar = this.this$0;
                aVar = bVar.c;
                List<String> list2 = this.$storageKeys;
                this.L$0 = aVar;
                this.L$1 = list2;
                this.L$2 = bVar;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    list = list2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g050Var = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    g050Var.d(null);
                    return zy11.a;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var.d(null);
                    throw th;
                }
            }
            bVar = (b) this.L$2;
            list = (List) this.L$1;
            ?? r5 = (g050) this.L$0;
            kotlin.b.b(obj);
            aVar = r5;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bVar.d.remove((String) it.next());
            }
            ru.yandex.taxi.requirements.storage.a aVar2 = bVar.a;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (aVar2.a(list, this) != coroutineSingletons) {
                g050Var = aVar;
                g050Var.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
    }
}
