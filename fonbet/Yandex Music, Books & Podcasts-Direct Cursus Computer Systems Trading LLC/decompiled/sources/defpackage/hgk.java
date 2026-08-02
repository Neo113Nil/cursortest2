package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class hgk extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jtc s;
    public final /* synthetic */ t9i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgk(jtc jtcVar, t9i t9iVar, int i) {
        super(0);
        this.r = i;
        this.s = jtcVar;
        this.t = t9iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                gek gekVar = (gek) this.s.a;
                va4 va4Var = (va4) this.t;
                Uri parse = Uri.parse(va4Var.b);
                parse.getClass();
                gekVar.a(parse, va4Var.c);
                break;
            default:
                gek gekVar2 = (gek) this.s.a;
                gekVar2.e();
                gekVar2.p(this.t);
                break;
        }
        return Unit.a;
    }
}
