package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.g8e;
import defpackage.i8n;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.y8n;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Li8n;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.DynamicHeaderInfoInteractor$getDynamicStringFlow$1", f = "DynamicHeaderInfoInteractor.kt", l = {HProv.PP_BIO_STATISTICA_LEN, 105}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DynamicHeaderInfoInteractor$getDynamicStringFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<y8n> $actualStatuses;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicHeaderInfoInteractor$getDynamicStringFlow$1(List list, Continuation continuation) {
        super(2, continuation);
        this.$actualStatuses = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DynamicHeaderInfoInteractor$getDynamicStringFlow$1 dynamicHeaderInfoInteractor$getDynamicStringFlow$1 = new DynamicHeaderInfoInteractor$getDynamicStringFlow$1(this.$actualStatuses, continuation);
        dynamicHeaderInfoInteractor$getDynamicStringFlow$1.L$0 = obj;
        return dynamicHeaderInfoInteractor$getDynamicStringFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicHeaderInfoInteractor$getDynamicStringFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b1, code lost:
    
        if (kotlinx.coroutines.a.i(r8, r14) != r1) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b1 -> B:6:0x0023). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        int i2;
        y8n y8nVar;
        Iterator it2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            it = this.$actualStatuses.iterator();
            i = 0;
            if (it.hasNext()) {
            }
            return zy11.a;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it2 = (Iterator) this.L$2;
            kotlin.b.b(obj);
            it = it2;
            if (it.hasNext()) {
                y8nVar = (y8n) it.next();
                if (kotlinx.coroutines.a.p(get_context())) {
                    String str = y8nVar.b;
                    String str2 = y8nVar.c;
                    i8n i8nVar = new i8n(str, str2, g8e.p(str, " ", str2), g8e.p(y8nVar.b, " ", str2));
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = it;
                    this.L$3 = null;
                    this.L$4 = y8nVar;
                    this.I$0 = i;
                    this.I$1 = 0;
                    this.label = 1;
                    if (vprVar.emit(i8nVar, this) != coroutineSingletons) {
                        it2 = it;
                        i2 = 0;
                        long millis = TimeUnit.SECONDS.toMillis(y8nVar.a);
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.L$2 = it2;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.label = 2;
                    }
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        int i4 = this.I$1;
        int i5 = this.I$0;
        y8nVar = (y8n) this.L$4;
        Iterator it3 = (Iterator) this.L$2;
        kotlin.b.b(obj);
        i2 = i4;
        i = i5;
        it2 = it3;
        long millis2 = TimeUnit.SECONDS.toMillis(y8nVar.a);
        this.L$0 = vprVar;
        this.L$1 = null;
        this.L$2 = it2;
        this.L$3 = null;
        this.L$4 = null;
        this.I$0 = i;
        this.I$1 = i2;
        this.label = 2;
    }
}
