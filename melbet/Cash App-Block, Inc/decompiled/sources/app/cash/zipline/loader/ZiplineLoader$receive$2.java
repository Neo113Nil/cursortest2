package app.cash.zipline.loader;

import androidx.lifecycle.BlockRunner$cancel$1;
import app.cash.zipline.EventListener;
import app.cash.zipline.ZiplineManifest;
import app.cash.zipline.internal.EventListenerAdapter;
import app.cash.zipline.loader.ZiplineLoader;
import app.cash.zipline.loader.internal.fetcher.LoadedManifest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ZiplineLoader$receive$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $applicationName;
    public final /* synthetic */ EventListener $eventListener;
    public final /* synthetic */ LoadedManifest $loadedManifest;
    public final /* synthetic */ long $nowEpochMs;
    public final /* synthetic */ EventListenerAdapter $receiver;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ ZiplineLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineLoader$receive$2(LoadedManifest loadedManifest, ZiplineLoader ziplineLoader, String str, EventListener eventListener, EventListenerAdapter eventListenerAdapter, long j, Continuation continuation) {
        super(2, continuation);
        this.$loadedManifest = loadedManifest;
        this.this$0 = ziplineLoader;
        this.$applicationName = str;
        this.$eventListener = eventListener;
        this.$receiver = eventListenerAdapter;
        this.$nowEpochMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZiplineLoader$receive$2 ziplineLoader$receive$2 = new ZiplineLoader$receive$2(this.$loadedManifest, this.this$0, this.$applicationName, this.$eventListener, this.$receiver, this.$nowEpochMs, continuation);
        ziplineLoader$receive$2.L$0 = obj;
        return ziplineLoader$receive$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ZiplineLoader$receive$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        LoadedManifest loadedManifest = this.$loadedManifest;
        Map map = loadedManifest.manifest.modules;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new ZiplineLoader.ModuleJob(this.this$0, this.$applicationName, this.$eventListener, (String) entry.getKey(), loadedManifest.manifest.unsigned.baseUrl, (ZiplineManifest.Module) entry.getValue(), this.$receiver, this.$nowEpochMs));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ZiplineLoader.ModuleJob moduleJob = (ZiplineLoader.ModuleJob) it.next();
            StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope, null, null, new BlockRunner$cancel$1(moduleJob, (Continuation) null, 18), 3);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((ZiplineLoader.ModuleJob) next).module.dependsOnIds.contains(moduleJob.id)) {
                    arrayList2.add(next);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((ZiplineLoader.ModuleJob) it3.next()).upstreams.add(launch$default);
            }
        }
        return Unit.INSTANCE;
    }
}
