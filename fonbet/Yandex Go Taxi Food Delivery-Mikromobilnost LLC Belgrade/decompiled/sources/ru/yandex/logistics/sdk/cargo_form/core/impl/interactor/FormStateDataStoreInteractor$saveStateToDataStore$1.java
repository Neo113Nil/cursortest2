package ru.yandex.logistics.sdk.cargo_form.core.impl.interactor;

import defpackage.a6s;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.nuh;
import defpackage.ny61;
import defpackage.ouh;
import defpackage.puh;
import defpackage.quh;
import defpackage.r6s;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormStateRestoreModel;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.FormStateDataStoreInteractor$saveStateToDataStore$1", f = "FormStateDataStoreInteractor.kt", l = {21, 22}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormStateDataStoreInteractor$saveStateToDataStore$1 extends SuspendLambda implements wls {
    final /* synthetic */ j6s $state;
    final /* synthetic */ String $uuid;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormStateDataStoreInteractor$saveStateToDataStore$1(c cVar, String str, j6s j6sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$uuid = str;
        this.$state = j6sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FormStateDataStoreInteractor$saveStateToDataStore$1(this.this$0, this.$uuid, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FormStateDataStoreInteractor$saveStateToDataStore$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        if (r1.d(r4, r6, r12) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (r1.a(r5, r12) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String valueOf;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            e eVar = cVar.a;
            Iterable<quh> iterable = (Iterable) cVar.c.e().getValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (quh quhVar : iterable) {
                if (quhVar instanceof nuh) {
                    valueOf = ((nuh) quhVar).a.toString();
                } else if (quhVar instanceof ouh) {
                    valueOf = null;
                } else {
                    if (!(quhVar instanceof puh)) {
                        w511.b();
                        return null;
                    }
                    valueOf = String.valueOf(((puh) quhVar).c);
                }
                if (valueOf != null) {
                    linkedHashSet.add(valueOf);
                }
            }
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        c cVar2 = this.this$0;
        e eVar2 = cVar2.a;
        String str = this.$uuid;
        r6s r6sVar = cVar2.b;
        j6s j6sVar = this.$state;
        String str2 = r6sVar.a;
        a6s a6sVar = r6sVar.b;
        FormStateRestoreModel formStateRestoreModel = new FormStateRestoreModel(str2, a6sVar != null ? a6sVar.a : null, j6sVar.a, r6s.a(j6sVar.c), r6s.a(j6sVar.d));
        this.label = 2;
    }
}
