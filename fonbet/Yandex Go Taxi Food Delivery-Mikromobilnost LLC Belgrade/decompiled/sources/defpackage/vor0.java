package defpackage;

import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.y;

/* loaded from: classes13.dex */
public final class vor0 {
    public final /* synthetic */ y a;
    public final /* synthetic */ ynr0 b;

    public /* synthetic */ vor0(y yVar, ynr0 ynr0Var) {
        this.a = yVar;
        this.b = ynr0Var;
    }

    public void a(String str) {
        this.a.n(str, true);
    }

    public void b(il ilVar, boolean z) {
        MemberListMode memberListMode = MemberListMode.LIMITS;
        y yVar = this.a;
        yVar.getClass();
        ynr0 ynr0Var = this.b;
        ai10 ai10Var = new ai10(memberListMode, new hwo0(memberListMode, yVar, ilVar, ynr0Var, 10), ynr0Var.g, ynr0Var.h, ilVar);
        dpr0 dpr0Var = yVar.c;
        if (z) {
            dpr0Var.a().c.b(ai10Var, 1);
        } else {
            dpr0Var.a().c(ai10Var);
        }
    }
}
