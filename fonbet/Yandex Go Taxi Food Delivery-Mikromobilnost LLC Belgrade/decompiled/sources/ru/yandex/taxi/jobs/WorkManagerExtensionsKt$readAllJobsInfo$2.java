package ru.yandex.taxi.jobs;

import androidx.work.WorkManager;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0002\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003j\u0002`\u00060\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltse;", "", "", "Lkotlin/Pair;", "", "Lp951;", "Lru/yandex/taxi/jobs/JobsMeta;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.jobs.WorkManagerExtensionsKt$readAllJobsInfo$2", f = "WorkManagerExtensions.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class WorkManagerExtensionsKt$readAllJobsInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ Set<String> $tags;
    final /* synthetic */ WorkManager $this_readAllJobsInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkManagerExtensionsKt$readAllJobsInfo$2(Set set, WorkManager workManager, Continuation continuation) {
        super(2, continuation);
        this.$tags = set;
        this.$this_readAllJobsInfo = workManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WorkManagerExtensionsKt$readAllJobsInfo$2 workManagerExtensionsKt$readAllJobsInfo$2 = new WorkManagerExtensionsKt$readAllJobsInfo$2(this.$tags, this.$this_readAllJobsInfo, continuation);
        workManagerExtensionsKt$readAllJobsInfo$2.L$0 = obj;
        return workManagerExtensionsKt$readAllJobsInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkManagerExtensionsKt$readAllJobsInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00a9 -> B:5:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        Iterator it;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Set<String> set = this.$tags;
            WorkManager workManager = this.$this_readAllJobsInfo;
            ArrayList arrayList = new ArrayList(tcc.n(set, 10));
            for (String str : set) {
                arrayList.add(new Pair(str, tje.h(tseVar, null, null, new WorkManagerExtensionsKt$readAllJobsInfo$2$1$1(workManager, str, null), 3)));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            collection = arrayList2;
            it = it2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = (String) this.L$8;
            it = (Iterator) this.L$5;
            collection = (Collection) this.L$3;
            kotlin.b.b(obj);
            Pair pair = (Pair) obj;
            Pair pair2 = pair == null ? new Pair(str2, pair) : null;
            if (pair2 != null) {
                collection.add(pair2);
            }
            if (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                str2 = (String) pair3.getFirst();
                noh nohVar = (noh) pair3.getSecond();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = collection;
                this.L$4 = null;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = str2;
                this.L$9 = null;
                this.label = 1;
                obj = nohVar.k(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Pair pair4 = (Pair) obj;
                if (pair4 == null) {
                }
                if (pair2 != null) {
                }
                if (it.hasNext()) {
                    return kotlin.collections.b.s((List) collection);
                }
            }
        }
    }
}
