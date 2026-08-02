package defpackage;

import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.music.shared.playback.utils.api.commands.AwaitQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionCommand;

/* loaded from: classes3.dex */
public final class xan {
    public final j4l a;
    public final a9l b;
    public final fkn c;

    public xan(j4l j4lVar, a9l a9lVar) {
        a9lVar.getClass();
        this.a = j4lVar;
        this.b = a9lVar;
        this.c = j4lVar.n;
    }

    public final void a(int i) {
        j4l j4lVar = this.a;
        if (((g4q) j4lVar.k.b.c.getValue()) != null) {
            if (((ybn) j4lVar.n.a.getValue()).b == i) {
                j4lVar.l.a(new ToggleCommand(false), new b3t("core_toggle"));
            } else {
                j4lVar.m.b(new eyk(u75.h(new SetQueuePositionCommand(i), new AwaitQueuePositionCommand(i), new AwaitPlayerConvergedCommand(false), new PlayCommand(false))), new b3t("queue_set_queue_position"));
            }
        }
    }
}
