package com.yandex.music.shared.wave.domain.commands;

import defpackage.aur;
import defpackage.fyu;
import defpackage.gxj;
import defpackage.kr7;
import defpackage.nm6;
import defpackage.nyn;
import defpackage.pvu;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.s9p;
import defpackage.svu;
import defpackage.xq0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ kr7 l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kr7 kr7Var = (kr7) obj;
        switch (this.j) {
            case 0:
                b bVar = new b(3, 0, (Continuation) obj3);
                bVar.l = kr7Var;
                bVar.m = (WaveQueueCommandsFactory$SetShuffle) obj2;
                return bVar.invokeSuspend(Unit.a);
            case 1:
                b bVar2 = new b(3, 1, (Continuation) obj3);
                bVar2.l = kr7Var;
                bVar2.m = (WaveQueueCommandsFactory$SetQueue) obj2;
                return bVar2.invokeSuspend(Unit.a);
            case 2:
                b bVar3 = new b(3, 2, (Continuation) obj3);
                bVar3.l = kr7Var;
                bVar3.m = (WaveQueueCommandsFactory$SetReverse) obj2;
                return bVar3.invokeSuspend(Unit.a);
            case 3:
                b bVar4 = new b(3, 3, (Continuation) obj3);
                bVar4.l = kr7Var;
                bVar4.m = (WaveQueueCommandsFactory$SetRepeatMode) obj2;
                return bVar4.invokeSuspend(Unit.a);
            case 4:
                b bVar5 = new b(3, 4, (Continuation) obj3);
                bVar5.l = kr7Var;
                bVar5.m = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj2;
                return bVar5.invokeSuspend(Unit.a);
            case 5:
                b bVar6 = new b(3, 5, (Continuation) obj3);
                bVar6.l = kr7Var;
                bVar6.m = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj2;
                return bVar6.invokeSuspend(Unit.a);
            case 6:
                b bVar7 = new b(3, 6, (Continuation) obj3);
                bVar7.l = kr7Var;
                bVar7.m = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj2;
                return bVar7.invokeSuspend(Unit.a);
            case 7:
                b bVar8 = new b(3, 7, (Continuation) obj3);
                bVar8.l = kr7Var;
                bVar8.m = (WaveQueueCommandsFactory$RemovePlayable) obj2;
                return bVar8.invokeSuspend(Unit.a);
            default:
                b bVar9 = new b(3, 8, (Continuation) obj3);
                bVar9.l = kr7Var;
                bVar9.m = (WaveQueueCommandsFactory$MovePlayable) obj2;
                return bVar9.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                kr7 kr7Var = this.l;
                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) this.m;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    boolean shuffle = waveQueueCommandsFactory$SetShuffle.getShuffle();
                    gxj newOriginalPosition = waveQueueCommandsFactory$SetShuffle.getNewOriginalPosition();
                    List shufflePositions = waveQueueCommandsFactory$SetShuffle.getShufflePositions();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    obj = kr7Var.r(shuffle, newOriginalPosition, shufflePositions, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(!Intrinsics.d((svu) obj, pvu.a));
            case 1:
                kr7 kr7Var2 = this.l;
                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) this.m;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    List fixedQueueOriginalPlayables = waveQueueCommandsFactory$SetQueue.getFixedQueueOriginalPlayables();
                    fyu fixedQueueShuffleState = waveQueueCommandsFactory$SetQueue.getFixedQueueShuffleState();
                    List recommendedElements = waveQueueCommandsFactory$SetQueue.getRecommendedElements();
                    int newQueuePosition = waveQueueCommandsFactory$SetQueue.getNewQueuePosition();
                    int newLivePosition = waveQueueCommandsFactory$SetQueue.getNewLivePosition();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    obj = kr7Var2.o(fixedQueueOriginalPlayables, fixedQueueShuffleState, recommendedElements, newQueuePosition, newLivePosition, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(!Intrinsics.d((svu) obj, pvu.a));
            case 2:
                kr7 kr7Var3 = this.l;
                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) this.m;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                boolean reverse = waveQueueCommandsFactory$SetReverse.getReverse();
                this.l = null;
                this.m = null;
                this.k = 1;
                Object q = kr7Var3.q(reverse, this);
                return q == nm6Var3 ? nm6Var3 : q;
            case 3:
                kr7 kr7Var4 = this.l;
                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) this.m;
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                nyn modeType = waveQueueCommandsFactory$SetRepeatMode.getModeType();
                this.l = null;
                this.m = null;
                this.k = 1;
                Object p = kr7Var4.p(modeType, this);
                return p == nm6Var4 ? nm6Var4 : p;
            case 4:
                kr7 kr7Var5 = this.l;
                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) this.m;
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                s9p seeds = waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                this.l = null;
                this.m = null;
                this.k = 1;
                Object e = kr7Var5.e(seeds, this);
                return e == nm6Var5 ? nm6Var5 : e;
            case 5:
                kr7 kr7Var6 = this.l;
                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) this.m;
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                List playables = waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                this.l = null;
                this.m = null;
                this.k = 1;
                Object c = kr7Var6.c(playables, this);
                return c == nm6Var6 ? nm6Var6 : c;
            case 6:
                kr7 kr7Var7 = this.l;
                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) this.m;
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                List playables2 = waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                this.l = null;
                this.m = null;
                this.k = 1;
                Object b = kr7Var7.b(playables2, this);
                return b == nm6Var7 ? nm6Var7 : b;
            case 7:
                kr7 kr7Var8 = this.l;
                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) this.m;
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                int position = waveQueueCommandsFactory$RemovePlayable.getPosition();
                this.l = null;
                this.m = null;
                this.k = 1;
                Object l = kr7Var8.l(position, this);
                return l == nm6Var8 ? nm6Var8 : l;
            default:
                kr7 kr7Var9 = this.l;
                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) this.m;
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                int fromPosition = waveQueueCommandsFactory$MovePlayable.getFromPosition();
                int toPosition = waveQueueCommandsFactory$MovePlayable.getToPosition();
                this.l = null;
                this.m = null;
                this.k = 1;
                Object h = kr7Var9.h(fromPosition, toPosition, this);
                return h == nm6Var9 ? nm6Var9 : h;
        }
    }
}
