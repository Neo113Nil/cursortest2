package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class gyu implements d3l {
    public final Function1 a;
    public final aur b;

    /* JADX WARN: Multi-variable type inference failed */
    public gyu(pyc pycVar, Function1 function1) {
        this.a = function1;
        this.b = (aur) pycVar;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [aur, pyc] */
    @Override // defpackage.d3l
    public final Object a(PlaybackCommand$QueueBound.Basic basic, vx6 vx6Var, Continuation continuation) {
        ssg.a(3, "WaveQueueBasicCommandsExecutor", (String) this.a.invoke(basic), null);
        g4q g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
        if (g4qVar == null) {
            return Boolean.FALSE;
        }
        kr7 kr7Var = g4qVar instanceof kr7 ? (kr7) g4qVar : null;
        return kr7Var == null ? Boolean.FALSE : this.b.invoke(kr7Var, basic, continuation);
    }
}
