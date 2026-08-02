package ru.yandex.video.m3.player.bandwidth;

import defpackage.bvf0;
import defpackage.pz40;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tuw;
import defpackage.uuw;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/IntervalTaskImpl;", "Ltuw;", "Ltse;", "scope", "", "intervalMs", "Lkotlin/Function0;", "Lzy11;", "task", "<init>", "(Ltse;JLsls;)V", "start", "()V", "stop", "J", "Lsls;", "Lpz40;", "", "isActive", "Lpz40;", "Ltpr;", "taskFlow", "Ltpr;", "getTaskFlow$annotations", "Factory", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IntervalTaskImpl implements tuw {
    public static final int $stable = 8;
    private final long intervalMs;
    private final pz40 isActive;
    private final sls task;
    private final tpr taskFlow;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/IntervalTaskImpl$Factory;", "Luuw;", "Ltse;", "scope", "<init>", "(Ltse;)V", "Lkotlin/Function0;", "Lzy11;", "task", "", "intervalMs", "Ltuw;", "create", "(Lsls;D)Ltuw;", "Ltse;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory implements uuw {
        public static final int $stable = 8;
        private final tse scope;

        public Factory(tse tseVar) {
            this.scope = tseVar;
        }

        @Override // defpackage.uuw
        public tuw create(sls task, double intervalMs) {
            return new IntervalTaskImpl(this.scope, (long) intervalMs, task);
        }
    }

    public IntervalTaskImpl(tse tseVar, long j, sls slsVar) {
        this.intervalMs = j;
        this.task = slsVar;
        r0 c = bvf0.c(Boolean.FALSE);
        this.isActive = c;
        g X = e.X(c, new IntervalTaskImpl$special$$inlined$flatMapLatest$1(null, this));
        this.taskFlow = X;
        e.H(tseVar, X);
    }

    private static /* synthetic */ void getTaskFlow$annotations() {
    }

    @Override // defpackage.tuw
    public void start() {
        pz40 pz40Var = this.isActive;
        Boolean bool = Boolean.TRUE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.tuw
    public void stop() {
        pz40 pz40Var = this.isActive;
        Boolean bool = Boolean.FALSE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
