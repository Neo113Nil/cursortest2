package ru.yandex.taxi.experiments.storage;

import defpackage.hbp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rku0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.experiments.storage.StoredExperimentsLegacyMigrationRunner$onAppConfiguration$1", f = "StoredExperimentsLegacyMigrationRunner.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class StoredExperimentsLegacyMigrationRunner$onAppConfiguration$1 extends SuspendLambda implements wls {
    final /* synthetic */ hbp0 $migrationScope;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoredExperimentsLegacyMigrationRunner$onAppConfiguration$1(b bVar, hbp0 hbp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$migrationScope = hbp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoredExperimentsLegacyMigrationRunner$onAppConfiguration$1(this.this$0, this.$migrationScope, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StoredExperimentsLegacyMigrationRunner$onAppConfiguration$1 storedExperimentsLegacyMigrationRunner$onAppConfiguration$1 = (StoredExperimentsLegacyMigrationRunner$onAppConfiguration$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        storedExperimentsLegacyMigrationRunner$onAppConfiguration$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            ((rku0) this.this$0.a.get()).a();
            this.$migrationScope.b();
            return zy11.a;
        } catch (Throwable th) {
            this.$migrationScope.b();
            throw th;
        }
    }
}
