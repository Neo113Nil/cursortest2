package ru.yandex.taxi.am.internal;

import defpackage.bgb0;
import defpackage.cne0;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.internal.AccountPhoneMigrationInteractor$doMigration$1", f = "AccountPhoneMigrationInteractor.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AccountPhoneMigrationInteractor$doMigration$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $legacyPhone;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPhoneMigrationInteractor$doMigration$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$legacyPhone = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountPhoneMigrationInteractor$doMigration$1(this.this$0, this.$legacyPhone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountPhoneMigrationInteractor$doMigration$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            d dVar = aVar2.b;
            this.L$0 = aVar2;
            this.label = 1;
            Object b = dVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
        }
        String str = this.$legacyPhone;
        aVar.getClass();
        String b2 = bgb0.b(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (bgb0.b(((kj) obj2).b).equals(b2)) {
                arrayList.add(obj2);
            }
        }
        a aVar3 = this.this$0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kj kjVar = (kj) it.next();
            k kVar = aVar3.a;
            if (!kVar.x.a().a()) {
                kVar.Pg(kjVar);
            }
            ((cne0) kVar.b).w("phone number");
        }
        return zy11.a;
    }
}
