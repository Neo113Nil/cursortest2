package defpackage;

import com.yandex.music.shared.music_starter.executor.VideoClipQueueStartCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v6u implements u3l {
    public final arf a;
    public final y3l b;
    public final List c;
    public final kan d;

    public v6u(arf arfVar, y3l y3lVar, List list, kan kanVar) {
        arfVar.getClass();
        y3lVar.getClass();
        list.getClass();
        this.a = arfVar;
        this.b = y3lVar;
        this.c = list;
        this.d = kanVar;
    }

    @Override // defpackage.u3l
    public final /* bridge */ /* synthetic */ Object a(PlaybackCommand$QueueLaunch.Substituting substituting, es6 es6Var, zrn zrnVar) {
        return c((VideoClipQueueStartCommand) substituting, zrnVar);
    }

    public final StartVideoClipRadioQueueCommand b(VideoClipQueueStartCommand videoClipQueueStartCommand, ArrayList arrayList) {
        y7u y7uVar = new y7u(new w6u(videoClipQueueStartCommand.getQueueId()), videoClipQueueStartCommand.getFrom(), videoClipQueueStartCommand.getStartUiAttributes().a, arrayList, videoClipQueueStartCommand.getStartFrom(), null);
        return new StartVideoClipRadioQueueCommand(new ikc(1, 13, null), y7uVar, videoClipQueueStartCommand.getPlayWhenReady(), this.b, videoClipQueueStartCommand.getOnQueueStarted(), videoClipQueueStartCommand.getOnError());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f2, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        if (r2 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(VideoClipQueueStartCommand videoClipQueueStartCommand, cg6 cg6Var) {
        u6u u6uVar;
        int i;
        t6u initialClips;
        Object b;
        StartVideoClipRadioQueueCommand b2;
        Iterator it;
        int i2;
        VideoClipQueueStartCommand videoClipQueueStartCommand2;
        StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand;
        rj6 rj6Var;
        PlaybackCommand$QueueLaunch.Basic basic;
        if (cg6Var instanceof u6u) {
            u6uVar = (u6u) cg6Var;
            int i3 = u6uVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u6uVar.p = i3 - Integer.MIN_VALUE;
                Object obj = u6uVar.n;
                nm6 nm6Var = nm6.a;
                i = u6uVar.p;
                s3l s3lVar = s3l.a;
                if (i != 0) {
                    qgg.h0(obj);
                    initialClips = videoClipQueueStartCommand.getInitialClips();
                    if (Intrinsics.d(initialClips, q6u.a)) {
                        b2 = b(videoClipQueueStartCommand, null);
                    } else if (initialClips instanceof r6u) {
                        r6u r6uVar = (r6u) initialClips;
                        b2 = b(videoClipQueueStartCommand, y5g.T(r6uVar.a, r6uVar.b));
                    } else {
                        if (!(initialClips instanceof s6u)) {
                            b6e.s();
                            return null;
                        }
                        b8u b8uVar = (b8u) this.a.getValue();
                        List list = ((s6u) initialClips).a;
                        u6uVar.j = videoClipQueueStartCommand;
                        u6uVar.k = initialClips;
                        u6uVar.p = 1;
                        b = b8uVar.b(list, u6uVar);
                    }
                    it = this.c.iterator();
                    i2 = 0;
                    videoClipQueueStartCommand2 = videoClipQueueStartCommand;
                    startVideoClipRadioQueueCommand = b2;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    t6u t6uVar = (t6u) u6uVar.k;
                    VideoClipQueueStartCommand videoClipQueueStartCommand3 = u6uVar.j;
                    qgg.h0(obj);
                    initialClips = t6uVar;
                    videoClipQueueStartCommand = videoClipQueueStartCommand3;
                    b = obj;
                } else {
                    if (i == 2) {
                        int i4 = u6uVar.m;
                        it = u6uVar.l;
                        StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand2 = (StartVideoClipRadioQueueCommand) u6uVar.k;
                        videoClipQueueStartCommand2 = u6uVar.j;
                        qgg.h0(obj);
                        xcr xcrVar = (xcr) obj;
                        if (xcrVar instanceof vcr) {
                            videoClipQueueStartCommand2.getOnError().invoke(((vcr) xcrVar).a);
                            return s3lVar;
                        }
                        i2 = i4;
                        startVideoClipRadioQueueCommand = startVideoClipRadioQueueCommand2;
                        if (!it.hasNext()) {
                            kan kanVar = this.d;
                            if (kanVar != null) {
                                u6uVar.j = null;
                                u6uVar.k = startVideoClipRadioQueueCommand;
                                u6uVar.l = null;
                                u6uVar.p = 3;
                                obj = ((d0l) kanVar).a(startVideoClipRadioQueueCommand);
                            }
                            basic = startVideoClipRadioQueueCommand;
                            return new q3l(basic);
                        }
                        if (it.next() != null) {
                            l1j.f();
                            return null;
                        }
                        videoClipQueueStartCommand2.getClass();
                        u6uVar.j = videoClipQueueStartCommand2;
                        u6uVar.k = startVideoClipRadioQueueCommand;
                        u6uVar.l = it;
                        u6uVar.m = i2;
                        u6uVar.p = 2;
                        throw null;
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    startVideoClipRadioQueueCommand = (StartVideoClipRadioQueueCommand) u6uVar.k;
                    qgg.h0(obj);
                    basic = (PlaybackCommand$QueueLaunch.Basic) obj;
                }
                rj6Var = (rj6) b;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        videoClipQueueStartCommand.getOnError().invoke(((pj6) rj6Var).a());
                        return s3lVar;
                    }
                    b6e.s();
                    return null;
                }
                b2 = b(videoClipQueueStartCommand, y5g.T((List) ((qj6) rj6Var).a, ((s6u) initialClips).b));
                it = this.c.iterator();
                i2 = 0;
                videoClipQueueStartCommand2 = videoClipQueueStartCommand;
                startVideoClipRadioQueueCommand = b2;
                if (!it.hasNext()) {
                }
            }
        }
        u6uVar = new u6u(this, cg6Var);
        Object obj2 = u6uVar.n;
        nm6 nm6Var2 = nm6.a;
        i = u6uVar.p;
        s3l s3lVar2 = s3l.a;
        if (i != 0) {
        }
        rj6Var = (rj6) b;
        if (rj6Var instanceof qj6) {
        }
    }
}
