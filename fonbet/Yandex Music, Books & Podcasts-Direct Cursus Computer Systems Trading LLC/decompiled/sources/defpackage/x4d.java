package defpackage;

import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.music_starter.executor.GenerativeQueueStartCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x4d implements u3l {
    public final y3l a;
    public final List b;
    public final kan c;

    public x4d(y3l y3lVar, List list, kan kanVar) {
        y3lVar.getClass();
        list.getClass();
        this.a = y3lVar;
        this.b = list;
        this.c = kanVar;
    }

    @Override // defpackage.u3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueLaunch.Substituting substituting, es6 es6Var, zrn zrnVar) {
        return b((GenerativeQueueStartCommand) substituting, zrnVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (r15 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(GenerativeQueueStartCommand generativeQueueStartCommand, cg6 cg6Var) {
        w4d w4dVar;
        int i;
        StartGenerativeQueueCommand startGenerativeQueueCommand;
        Iterator it;
        int i2;
        GenerativeQueueStartCommand generativeQueueStartCommand2;
        StartGenerativeQueueCommand startGenerativeQueueCommand2;
        PlaybackCommand$QueueLaunch.Basic basic;
        if (cg6Var instanceof w4d) {
            w4dVar = (w4d) cg6Var;
            int i3 = w4dVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w4dVar.p = i3 - Integer.MIN_VALUE;
                Object obj = w4dVar.n;
                Object obj2 = nm6.a;
                i = w4dVar.p;
                int i4 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    c5d c5dVar = new c5d(new w3d(generativeQueueStartCommand.getGenerativeStationId()), new v80(generativeQueueStartCommand.getFrom(), generativeQueueStartCommand.getStartUiAttributes().a, null));
                    startGenerativeQueueCommand = new StartGenerativeQueueCommand(new ikc(i4, 1, continuation), c5dVar, generativeQueueStartCommand.getPlayWhenReady(), this.a, new htb(21), generativeQueueStartCommand.getOnError());
                    it = this.b.iterator();
                    i2 = 0;
                    generativeQueueStartCommand2 = generativeQueueStartCommand;
                } else if (i == 1) {
                    int i5 = w4dVar.m;
                    it = w4dVar.l;
                    startGenerativeQueueCommand = w4dVar.k;
                    generativeQueueStartCommand2 = w4dVar.j;
                    qgg.h0(obj);
                    xcr xcrVar = (xcr) obj;
                    if (xcrVar instanceof vcr) {
                        generativeQueueStartCommand2.getOnError().invoke(((vcr) xcrVar).a);
                        return s3l.a;
                    }
                    i2 = i5;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    startGenerativeQueueCommand2 = w4dVar.k;
                    qgg.h0(obj);
                    basic = (PlaybackCommand$QueueLaunch.Basic) obj;
                }
                startGenerativeQueueCommand2 = startGenerativeQueueCommand;
                if (!it.hasNext()) {
                    if (it.next() != null) {
                        l1j.f();
                        return null;
                    }
                    generativeQueueStartCommand2.getClass();
                    w4dVar.j = generativeQueueStartCommand2;
                    w4dVar.k = startGenerativeQueueCommand2;
                    w4dVar.l = it;
                    w4dVar.m = i2;
                    w4dVar.p = 1;
                    throw null;
                }
                kan kanVar = this.c;
                if (kanVar != null) {
                    w4dVar.j = null;
                    w4dVar.k = startGenerativeQueueCommand2;
                    w4dVar.l = null;
                    w4dVar.p = 2;
                    obj = ((d0l) kanVar).a(startGenerativeQueueCommand2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    basic = (PlaybackCommand$QueueLaunch.Basic) obj;
                }
                basic = startGenerativeQueueCommand2;
                return new q3l(basic);
            }
        }
        w4dVar = new w4d(this, cg6Var);
        Object obj3 = w4dVar.n;
        Object obj22 = nm6.a;
        i = w4dVar.p;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        startGenerativeQueueCommand2 = startGenerativeQueueCommand;
        if (!it.hasNext()) {
        }
    }
}
