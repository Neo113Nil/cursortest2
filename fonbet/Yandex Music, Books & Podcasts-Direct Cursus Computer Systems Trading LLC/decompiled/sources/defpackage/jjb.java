package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.ebs.g;
import com.yandex.passport.internal.properties.j;
import com.yandex.passport.internal.ui.sloth.ebs.k0;
import com.yandex.passport.internal.ui.sloth.ebs.l0;
import com.yandex.passport.internal.ui.sloth.ebs.m0;
import com.yandex.passport.internal.ui.sloth.ebs.n0;
import com.yandex.passport.internal.ui.sloth.ebs.o0;
import com.yandex.passport.internal.ui.sloth.ebs.p0;
import com.yandex.passport.internal.ui.sloth.ebs.q0;
import com.yandex.plus.pay.ui.core.b;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.LoadCancelData;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveData;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public final class jjb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjb(bjb bjbVar, Continuation continuation, a aVar, PlayerState playerState, TrackType trackType, Integer num, cjb cjbVar) {
        super(2, continuation);
        this.j = 1;
        this.l = bjbVar;
        this.m = aVar;
        this.n = playerState;
        this.p = trackType;
        this.q = num;
        this.o = cjbVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                jjb jjbVar = new jjb((bjb) this.l, continuation, (a) this.m, (PlaybackException) this.p, (PlayerState) this.n, (DefaultEventData) this.q, (cjb) this.o, 0);
                jjbVar.k = obj;
                return jjbVar;
            case 1:
                jjb jjbVar2 = new jjb((bjb) this.l, continuation, (a) this.m, (PlayerState) this.n, (TrackType) this.p, (Integer) this.q, (cjb) this.o);
                jjbVar2.k = obj;
                return jjbVar2;
            case 2:
                jjb jjbVar3 = new jjb((bjb) this.l, continuation, (a) this.m, (n0l) this.p, (PlayerState) this.n, (List) this.q, (cjb) this.o, 2);
                jjbVar3.k = obj;
                return jjbVar3;
            default:
                jjb jjbVar4 = new jjb((s7h) this.l, (s7h) this.m, (s7h) this.p, (s7h) this.n, (Context) this.q, (Function0) this.o, continuation);
                jjbVar4.k = obj;
                return jjbVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((jjb) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((jjb) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((jjb) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((jjb) create((q0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.p;
        Object obj6 = this.q;
        Object obj7 = this.m;
        switch (i) {
            case 0:
                PlaybackException playbackException = (PlaybackException) obj5;
                a aVar = (a) obj7;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                bjb bjbVar = (bjb) obj2;
                try {
                    r7o r7oVar = z7o.b;
                    aVar.q(bjbVar, (PlayerState) obj4, playbackException, true, a.b(aVar, playbackException), (DefaultEventData) obj6, (cjb) obj3);
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                return Unit.a;
            case 1:
                cjb cjbVar = (cjb) obj3;
                Integer num = (Integer) obj6;
                TrackType trackType = (TrackType) obj5;
                PlayerState playerState = (PlayerState) obj4;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar2 = (bjb) obj2;
                try {
                    r7o r7oVar3 = z7o.b;
                    a aVar2 = (a) obj7;
                    Event event = Event.LOAD_CANCELED;
                    EventType eventType = EventType.EVENT;
                    aVar2.g.getClass();
                    eventType.getClass();
                    boolean z = aVar2.l;
                    ylr ylrVar = aVar2.a;
                    a aVar3 = (a) obj7;
                    if (z) {
                        PlayerAliveState.Companion.getClass();
                        EventDefault h = a.h(aVar3, bjbVar2, event, null, null, null, new LoadCancelData(l9l.a(playerState), trackType, num), cjbVar, 14);
                        ylrVar.getClass();
                        ylrVar.c(h);
                    } else {
                        PlayerAliveState.Companion.getClass();
                        ylrVar.b(a.h(aVar3, bjbVar2, event, null, null, null, new LoadCancelData(l9l.a(playerState), trackType, num), cjbVar, 14));
                    }
                } catch (Throwable unused2) {
                    r7o r7oVar4 = z7o.b;
                }
                return Unit.a;
            case 2:
                cjb cjbVar2 = (cjb) obj3;
                List list = (List) obj6;
                PlayerState playerState2 = (PlayerState) obj4;
                n0l n0lVar = (n0l) obj5;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar5 = z7o.b;
                    a aVar4 = (a) obj7;
                    Event event2 = Event.PLAYER_ALIVE;
                    EventType eventType2 = EventType.EVENT;
                    aVar4.g.getClass();
                    eventType2.getClass();
                    boolean z2 = aVar4.l;
                    ylr ylrVar2 = aVar4.a;
                    a aVar5 = (a) obj7;
                    if (z2) {
                        EventDefault h2 = a.h(aVar5, new bjb(n0lVar), event2, null, playerState2.getVideoType(), null, new PlayerAliveData(list), cjbVar2, 10);
                        ylrVar2.getClass();
                        ylrVar2.c(h2);
                    } else {
                        ylrVar2.b(a.h(aVar5, new bjb(n0lVar), event2, null, playerState2.getVideoType(), null, new PlayerAliveData(list), cjbVar2, 10));
                    }
                } catch (Throwable unused3) {
                    r7o r7oVar6 = z7o.b;
                }
                return Unit.a;
            default:
                Context context = (Context) obj6;
                q0 q0Var = (q0) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                if (q0Var instanceof l0) {
                    y1 y1Var = y1.a;
                    l0 l0Var = (l0) q0Var;
                    y1 I = b.I(l0Var.a);
                    z1 J = b.J(l0Var.b);
                    String str = l0Var.c;
                    str.getClass();
                    String str2 = l0Var.d;
                    str2.getClass();
                    String str3 = l0Var.e;
                    str3.getClass();
                    com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(J.a);
                    b.getClass();
                    ((s7h) obj2).a(new j(I, new z1(b, J.b), str, str2, str3));
                } else if (q0Var instanceof k0) {
                    ((s7h) obj7).a("android.permission.CAMERA");
                } else if (q0Var instanceof p0) {
                    ((s7h) obj5).a(new g(((p0) q0Var).a));
                } else if (q0Var instanceof o0) {
                    ((s7h) obj4).a(((o0) q0Var).a);
                } else if (q0Var instanceof n0) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                } else {
                    if (!Intrinsics.d(q0Var, m0.a)) {
                        b6e.s();
                        return null;
                    }
                    ((Function0) obj3).invoke();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjb(bjb bjbVar, Continuation continuation, a aVar, Object obj, PlayerState playerState, Object obj2, cjb cjbVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bjbVar;
        this.m = aVar;
        this.p = obj;
        this.n = playerState;
        this.q = obj2;
        this.o = cjbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjb(s7h s7hVar, s7h s7hVar2, s7h s7hVar3, s7h s7hVar4, Context context, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.l = s7hVar;
        this.m = s7hVar2;
        this.p = s7hVar3;
        this.n = s7hVar4;
        this.q = context;
        this.o = function0;
    }
}
