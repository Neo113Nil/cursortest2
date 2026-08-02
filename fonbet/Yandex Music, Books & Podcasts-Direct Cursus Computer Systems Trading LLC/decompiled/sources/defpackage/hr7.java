package defpackage;

import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Next;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class hr7 implements rjc {
    public final /* synthetic */ kr7 a;

    public hr7(kr7 kr7Var) {
        this.a = kr7Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        rcl rclVar = (rcl) obj;
        boolean z = rclVar.c;
        kr7 kr7Var = this.a;
        if (z != kr7Var.g.d) {
            return Unit.a;
        }
        kr7Var.k.a(new WaveQueueCommandsFactory$Next(rclVar.b ? v5j.a : v5j.b, z), a3t.a);
        return Unit.a;
    }
}
