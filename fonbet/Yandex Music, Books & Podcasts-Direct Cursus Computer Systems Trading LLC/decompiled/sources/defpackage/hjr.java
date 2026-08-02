package defpackage;

import com.yandex.music.shared.fmradio.domain.commands.AwaitNetworkConnectedCommand;
import com.yandex.music.shared.generative.domain.commands.c;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.player.api.download.PlayerPlaybackException;
import com.yandex.music.shared.player.api.download.a;
import com.yandex.music.shared.player.api.download.h;
import com.yandex.music.shared.player.api.download.l;
import com.yandex.music.shared.player.api.download.m;
import com.yandex.music.shared.player.api.download.n;
import com.yandex.music.shared.player.api.download.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hjr extends b6 {
    public final q7l d;
    public final k1l e;
    public final sml f;
    public a0q g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjr(o oVar, k1l k1lVar, q7l q7lVar, k1l k1lVar2, sml smlVar) {
        super(k1lVar, oVar);
        k1lVar.getClass();
        q7lVar.getClass();
        k1lVar2.getClass();
        this.d = q7lVar;
        this.e = k1lVar2;
        this.f = smlVar;
    }

    public final void O(hzk hzkVar, n7q n7qVar) {
        hzkVar.getClass();
        n7qVar.getClass();
        Throwable cause = hzkVar.getCause();
        PlayerPlaybackException playerPlaybackException = cause instanceof PlayerPlaybackException ? (PlayerPlaybackException) cause : null;
        if (playerPlaybackException instanceof m) {
            ssg.a(6, "StreamErrorHandler", "Behind live window in stream - restarting", playerPlaybackException);
            P(n7qVar);
            return;
        }
        if (playerPlaybackException instanceof n) {
            ssg.a(6, "StreamErrorHandler", "Renderer error in stream  " + hzkVar, playerPlaybackException);
            P(n7qVar);
            return;
        }
        if (playerPlaybackException instanceof o) {
            ssg.a(6, "StreamErrorHandler", "Renderer error in stream", playerPlaybackException);
            P(n7qVar);
            return;
        }
        if (playerPlaybackException instanceof a) {
            ssg.a(6, "StreamErrorHandler", "CorruptedFile error in stream", playerPlaybackException);
            P(n7qVar);
            return;
        }
        if (playerPlaybackException instanceof h) {
            ssg.a(6, "StreamErrorHandler", "Network error in stream", playerPlaybackException);
            P(n7qVar);
            return;
        }
        boolean z = playerPlaybackException instanceof l;
        q7l q7lVar = this.d;
        if (z) {
            ssg.a(6, "StreamErrorHandler", "Unexpected error in stream", playerPlaybackException);
            q7lVar.a();
        } else if (playerPlaybackException != null) {
            b6e.s();
        } else {
            ssg.a(6, "StreamErrorHandler", "Unknown error in stream:", hzkVar);
            q7lVar.a();
        }
    }

    public final void P(n7q n7qVar) {
        o oVar = (o) this.c;
        a0q id = n7qVar.g().getId();
        if (!((u5q) this.f.a).b.b.g() || Intrinsics.d(this.g, id)) {
            this.g = null;
            F();
            return;
        }
        this.g = id;
        boolean z = n7qVar instanceof ioc;
        a3t a3tVar = a3t.a;
        if (z) {
            a1q.a.getClass();
            this.e.b(new eyk(u75.h(PauseCommand.INSTANCE, AwaitNetworkConnectedCommand.INSTANCE, new PlayCommand(false))), a3tVar);
            oVar.b();
        } else if (n7qVar instanceof y4d) {
            k1l k1lVar = (k1l) this.b;
            b1q.b.getClass();
            k1lVar.a(c.a.b(), a3tVar);
            oVar.b();
        } else {
            F();
        }
        oVar.b();
    }
}
