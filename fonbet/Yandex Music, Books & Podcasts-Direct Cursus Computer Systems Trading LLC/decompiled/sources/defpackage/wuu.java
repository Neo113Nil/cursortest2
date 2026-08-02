package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.yandex.music.shared.wave.domain.commands.b;
import com.yandex.music.shared.wave.domain.commands.c;
import com.yandex.pulse.metrics.o;
import defpackage.hrg;
import defpackage.ran;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class wuu implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ wuu(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02bd, code lost:
    
        if (r0 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0327, code lost:
    
        if (r0.equals("on1") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:?, code lost:
    
        return defpackage.plj.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0330, code lost:
    
        if (r0.equals("on") != false) goto L140;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        long j;
        Long l;
        long j2;
        Long l2;
        Set set;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        long j7;
        Set set2;
        int i = this.a;
        final int i2 = 5;
        final int i3 = 6;
        final int i4 = 8;
        final int i5 = 7;
        l18 l18Var = l18.b;
        final int i6 = 1;
        final int i7 = 2;
        final int i8 = 4;
        final int i9 = 0;
        Continuation continuation = null;
        final int i10 = 3;
        switch (i) {
            case 0:
                jyr jyrVar = dvu.e;
                return Boolean.valueOf(kwl.d());
            case 1:
                jyr jyrVar2 = dvu.e;
                return (dvu) ((byb) l18Var.c(hag.I(byb.class))).b(dvu.class);
            case 2:
                jyr jyrVar3 = dvu.e;
                String b = kwl.a().b();
                int hashCode = b.hashCode();
                if (hashCode == 3551) {
                    break;
                } else {
                    if (hashCode == 110130) {
                        break;
                    } else if (hashCode == 2072332025 && b.equals("shuffle")) {
                        return plj.b;
                    }
                    return plj.a;
                }
            case 3:
                jyr jyrVar4 = dvu.e;
                boolean d = kwl.d();
                Long valueOf = kwl.a().a().b("trackSkipTimeoutSec") != null ? Long.valueOf(r1.intValue() * 1000) : null;
                long longValue = valueOf != null ? valueOf.longValue() : 10000L;
                Long valueOf2 = kwl.a().a().b("trackSkipTimeoutAfterUserSkipSec") != null ? Long.valueOf(r1.intValue() * 1000) : null;
                long longValue2 = valueOf2 != null ? valueOf2.longValue() : 10000L;
                Long valueOf3 = kwl.a().a().b("trackSkipTimeoutAfterLaunchSec") != null ? Long.valueOf(r1.intValue() * 1000) : null;
                long longValue3 = valueOf3 != null ? valueOf3.longValue() : 10000L;
                if (kwl.a().a().b("prolongationTimeoutSec") != null) {
                    j = 1000;
                    l = Long.valueOf(r1.intValue() * 1000);
                } else {
                    j = 1000;
                    l = null;
                }
                long longValue4 = l != null ? l.longValue() : 5000L;
                Long valueOf4 = kwl.a().a().b("prolongationTimeoutSec") != null ? Long.valueOf(r1.intValue() * j) : null;
                long longValue5 = valueOf4 != null ? valueOf4.longValue() : 5000L;
                plj pljVar = (plj) dvu.f.getValue();
                Long valueOf5 = kwl.a().a().b("programExpirationTimeoutSec") != null ? Long.valueOf(r12.intValue() * j) : null;
                long longValue6 = valueOf5 != null ? valueOf5.longValue() : 432000000L;
                long j8 = j;
                if (kwl.a().a().b("programUpdateDebounceTimeoutSec") != null) {
                    j2 = longValue5;
                    l2 = Long.valueOf(r0.intValue() * j8);
                } else {
                    j2 = longValue5;
                    l2 = null;
                }
                long longValue7 = l2 != null ? l2.longValue() : 600000L;
                pljVar.getClass();
                ck7 ck7Var = new ck7();
                ck7Var.c = pljVar;
                ck7Var.a = longValue6;
                ck7Var.b = longValue7;
                JsonArray c = kwl.a().a().c("supportedSeedTypes");
                if (c != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c.a.iterator();
                    while (it.hasNext()) {
                        JsonElement jsonElement = (JsonElement) it.next();
                        jsonElement.getClass();
                        String I = cxb.I(jsonElement);
                        if (I != null) {
                            arrayList.add(I);
                        }
                    }
                    set = CollectionsKt.A0(arrayList);
                    break;
                }
                set = q5b.a;
                Boolean a = kwl.a().a().a("prolongateForAnySeed");
                if (a != null) {
                    z = a.booleanValue();
                    j6 = longValue4;
                    long j9 = longValue2;
                    j3 = longValue3;
                    j4 = longValue;
                    j5 = j9;
                    set2 = set;
                    j7 = j2;
                } else {
                    long j10 = longValue2;
                    j3 = longValue3;
                    j4 = longValue;
                    j5 = j10;
                    j6 = longValue4;
                    z = false;
                    j7 = j2;
                    set2 = set;
                }
                return new vuu(d, j4, j5, j3, j6, j7, ck7Var, set2, z);
            case 4:
                final int i11 = 10;
                return new gyu(new b(i10, i8, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i11) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 5:
                return new qyu();
            case 6:
                return new vyu();
            case 7:
                return new czu();
            case 8:
                return new yyu();
            case 9:
                final int i12 = 13;
                return new gyu(new b(i10, i2, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i12) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 10:
                final int i13 = 12;
                return new gyu(new b(i10, i3, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i13) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 11:
                return new gyu(new b(i10, i5, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i7) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 12:
                final int i14 = 11;
                return new gyu(new b(i10, i4, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 13:
                return new gyu(new b(i10, i9, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i6) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 14:
                return new gyu(new b(i10, i6, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i10) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 15:
                return new gyu(new c(i10, i9, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i2) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 16:
                return new gyu(new b(i10, i7, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i3) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 17:
                return new gyu(new b(i10, i10, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i4) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 18:
                return new gyu(new c(i10, i6, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i5) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 19:
                return new gyu(new c(i10, i7, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i9) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 20:
                return new gyu(new c(i10, i10, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i8) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 21:
                final int i15 = 9;
                return new gyu(new c(i10, i8, continuation), new Function1() { // from class: com.yandex.music.shared.wave.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                ((WaveQueueCommandsFactory$UndoLike) obj).getClass();
                                return "undoLike";
                            case 1:
                                WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
                                waveQueueCommandsFactory$SetShuffle.getClass();
                                return "set shuffle " + waveQueueCommandsFactory$SetShuffle.getShuffle();
                            case 2:
                                WaveQueueCommandsFactory$RemovePlayable waveQueueCommandsFactory$RemovePlayable = (WaveQueueCommandsFactory$RemovePlayable) obj;
                                waveQueueCommandsFactory$RemovePlayable.getClass();
                                return "remove playable ".concat(ran.a(waveQueueCommandsFactory$RemovePlayable.getPosition()));
                            case 3:
                                WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
                                waveQueueCommandsFactory$SetQueue.getClass();
                                return "set queue newQueuePosition=".concat(ran.a(waveQueueCommandsFactory$SetQueue.d()));
                            case 4:
                                ((WaveQueueCommandsFactory$UndoDislike) obj).getClass();
                                return "undoDislike";
                            case 5:
                                ((WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync) obj).getClass();
                                return "launch prolongation if needed async";
                            case 6:
                                WaveQueueCommandsFactory$SetReverse waveQueueCommandsFactory$SetReverse = (WaveQueueCommandsFactory$SetReverse) obj;
                                waveQueueCommandsFactory$SetReverse.getClass();
                                return "set reverse " + waveQueueCommandsFactory$SetReverse.getReverse();
                            case 7:
                                ((WaveQueueCommandsFactory$Like) obj).getClass();
                                return "like";
                            case 8:
                                WaveQueueCommandsFactory$SetRepeatMode waveQueueCommandsFactory$SetRepeatMode = (WaveQueueCommandsFactory$SetRepeatMode) obj;
                                waveQueueCommandsFactory$SetRepeatMode.getClass();
                                return "set repeat mode " + waveQueueCommandsFactory$SetRepeatMode.getModeType();
                            case 9:
                                ((WaveQueueCommandsFactory$RebuildOnExplicitChange) obj).getClass();
                                return "rebuildOnExplicitChange";
                            case 10:
                                WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline = (WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline) obj;
                                waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getClass();
                                return "change seeds to " + waveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.getSeeds();
                            case 11:
                                WaveQueueCommandsFactory$MovePlayable waveQueueCommandsFactory$MovePlayable = (WaveQueueCommandsFactory$MovePlayable) obj;
                                waveQueueCommandsFactory$MovePlayable.getClass();
                                return hrg.r("move playable from ", ran.a(waveQueueCommandsFactory$MovePlayable.getFromPosition()), " to ", ran.a(waveQueueCommandsFactory$MovePlayable.getToPosition()));
                            case 12:
                                WaveQueueCommandsFactory$AddPlayablesAsLast waveQueueCommandsFactory$AddPlayablesAsLast = (WaveQueueCommandsFactory$AddPlayablesAsLast) obj;
                                waveQueueCommandsFactory$AddPlayablesAsLast.getClass();
                                return "add playables as last " + waveQueueCommandsFactory$AddPlayablesAsLast.getPlayables();
                            default:
                                WaveQueueCommandsFactory$AddPlayablesAsNext waveQueueCommandsFactory$AddPlayablesAsNext = (WaveQueueCommandsFactory$AddPlayablesAsNext) obj;
                                waveQueueCommandsFactory$AddPlayablesAsNext.getClass();
                                return "add playables as next " + waveQueueCommandsFactory$AddPlayablesAsNext.getPlayables();
                        }
                    }
                });
            case 22:
                return Unit.a;
            case 23:
                return new zqj();
            case 24:
                float f = w0v.a;
                return Float.valueOf(0.0f);
            case 25:
                return Unit.a;
            case 26:
                float f2 = r2v.a;
                return Float.valueOf(0.0f);
            case 27:
                throw new IllegalStateException("WaveScreenUiConfig is not initialized");
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jyr jyrVar5 = u5v.e;
                return Boolean.valueOf(((u5v) ((byb) l18Var.c(hag.I(byb.class))).b(u5v.class)).h());
            default:
                return new Gson();
        }
    }
}
