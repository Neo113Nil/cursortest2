package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.proto.message.Report;

/* loaded from: classes15.dex */
public final class v1j0 extends ky4 {
    public final int y;
    public sxj0 z;

    public v1j0(ChatRequest chatRequest, int i) {
        super(chatRequest);
        this.y = i;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        sxj0 sxj0Var = this.z;
        if (sxj0Var != null) {
            sxj0Var.d.cancel();
        }
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        String str = j3bVar.e;
        int i = 0;
        if (str != null) {
            sxj0 sxj0Var = (sxj0) ((m8g) s020Var).d.C0.get();
            this.z = sxj0Var;
            sxj0Var.c.add(new rxj0(0, str));
            sxj0Var.c();
        }
        bc a = ((m8g) s020Var).a();
        oxe0 oxe0Var = new oxe0(24, this);
        o1b0 o1b0Var = (o1b0) a.a;
        z83.c(null, o1b0Var.e);
        Report report = new Report();
        report.reason = this.y;
        String str2 = o1b0Var.c;
        if (str2 != null) {
            report.userId = str2;
        } else {
            report.chatId = o1b0Var.b;
        }
        ((n5t0) a.b).f(new j0b(i, a, report, oxe0Var));
    }
}
