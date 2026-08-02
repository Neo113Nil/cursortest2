package ru.yandex.video.m3.preload_manager;

import android.os.Looper;
import defpackage.jl40;
import defpackage.sls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadManagerTasksBatcher;", "", "Lru/yandex/video/m3/preload_manager/PreloadWorkers;", "preloadWorkers", "<init>", "(Lru/yandex/video/m3/preload_manager/PreloadWorkers;)V", "Lkotlin/Function0;", "Lzy11;", "runnable", "schedule", "(Lsls;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "commitChanges", "()Ljava/util/ArrayList;", "Lru/yandex/video/m3/preload_manager/PreloadWorkers;", "Landroid/os/Looper;", "caller", "Landroid/os/Looper;", "tasks", "Ljava/util/ArrayList;", "", "committed", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadManagerTasksBatcher {
    public static final int $stable = 8;
    private final Looper caller = Looper.myLooper();
    private boolean committed;
    private final PreloadWorkers preloadWorkers;
    private final ArrayList<sls> tasks;

    public PreloadManagerTasksBatcher(PreloadWorkers preloadWorkers) {
        this.preloadWorkers = preloadWorkers;
        ArrayList<sls> arrayList = new ArrayList<>();
        this.tasks = arrayList;
        arrayList.add(new sls() { // from class: ru.yandex.video.m3.preload_manager.PreloadManagerTasksBatcher.1
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m899invoke() {
                PreloadManagerTasksBatcher.this.preloadWorkers.enterBatchMode();
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m899invoke();
                return zy11.a;
            }
        });
    }

    public final ArrayList<sls> commitChanges() {
        jl40.l(this.caller, Looper.myLooper());
        this.tasks.add(new sls() { // from class: ru.yandex.video.m3.preload_manager.PreloadManagerTasksBatcher$commitChanges$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m900invoke() {
                PreloadManagerTasksBatcher.this.preloadWorkers.exitBatchMode();
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m900invoke();
                return zy11.a;
            }
        });
        this.committed = true;
        return this.tasks;
    }

    public final void schedule(sls runnable) {
        jl40.l(this.caller, Looper.myLooper());
        this.tasks.add(runnable);
    }
}
