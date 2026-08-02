package ru.yandex.taxi.stories.data.repositories;

import defpackage.g050;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7m;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.repositories.DownloadRepository$cancelDownload$2", f = "DownloadRepository.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DownloadRepository$cancelDownload$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $storyId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadRepository$cancelDownload$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$storyId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadRepository$cancelDownload$2(this.this$0, this.$storyId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DownloadRepository$cancelDownload$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        g050 g050Var;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            kotlinx.coroutines.sync.a aVar2 = aVar.e;
            String str2 = this.$storyId;
            this.L$0 = aVar2;
            this.L$1 = aVar;
            this.L$2 = str2;
            this.label = 1;
            if (aVar2.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar2;
            str = str2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$2;
            aVar = (a) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            ConcurrentHashMap concurrentHashMap = aVar.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (jl40.l(((o7m) entry.getKey()).getStoryId(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                o7m o7mVar = (o7m) entry2.getKey();
                ((l8x) entry2.getValue()).a(null);
                aVar.c.remove(o7mVar);
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
