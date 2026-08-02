package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.core.net.entities.proto.message.Report;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class s2j0 extends ky4 {
    public x08 A;
    public final LocalMessageRef y;
    public final int z;

    public s2j0(ChatRequest chatRequest, LocalMessageRef localMessageRef, int i) {
        super(chatRequest);
        this.y = localMessageRef;
        this.z = i;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        x08 x08Var = this.A;
        if (x08Var != null) {
            x08Var.cancel();
            this.A = null;
        }
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        bc a = ((m8g) s020Var).a();
        oxe0 oxe0Var = new oxe0(25, this);
        vcz0 vcz0Var = (vcz0) a.c;
        LocalMessageRef localMessageRef = this.y;
        ServerMessageRef g = vcz0Var.g(localMessageRef);
        if (g == null) {
            w511.q();
            return;
        }
        long timestamp = g.getTimestamp();
        Report report = new Report();
        MessageRef messageRef = new MessageRef();
        messageRef.chatId = ((o1b0) a.a).b;
        messageRef.timestamp = timestamp;
        report.messageRef = messageRef;
        report.reason = this.z;
        this.A = ((n5t0) a.b).f(new i0b(a, report, oxe0Var, localMessageRef, timestamp));
    }
}
