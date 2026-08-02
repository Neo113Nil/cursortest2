package ru.yandex.taxi.stories.data.repositories;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7m;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.repositories.DownloadRepository$resumeDownloads$2", f = "DownloadRepository.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class DownloadRepository$resumeDownloads$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadRepository$resumeDownloads$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadRepository$resumeDownloads$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DownloadRepository$resumeDownloads$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            g050Var = aVar2.e;
            this.L$0 = g050Var;
            this.L$1 = aVar2;
            this.label = 1;
            if (g050Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            List J0 = kotlin.collections.a.J0(aVar.d);
            aVar.d.clear();
            g050Var.d(null);
            a aVar3 = this.this$0;
            Iterator it = J0.iterator();
            while (it.hasNext()) {
                aVar3.b((o7m) it.next());
            }
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
