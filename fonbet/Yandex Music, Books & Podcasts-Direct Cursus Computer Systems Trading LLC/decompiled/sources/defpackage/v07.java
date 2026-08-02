package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final /* synthetic */ class v07 implements y7k {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v07(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.y7k
    public final void a(Exception exc) {
        switch (this.b) {
            case 0:
                g0c g0cVar = ((z07) this.c).l;
                String message = exc.getMessage();
                if (message == null) {
                    message = exc.toString();
                }
                qne A = gut.A(message);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(A);
                break;
            case 1:
                g0c g0cVar2 = ((c27) this.c).l;
                String message2 = exc.getMessage();
                if (message2 == null) {
                    message2 = exc.toString();
                }
                qne A2 = gut.A(message2);
                x60 x60Var2 = (x60) g0cVar2;
                x60Var2.getClass();
                x60Var2.a(A2);
                break;
            case 2:
                ((gc8) this.c).I(exc);
                break;
            case 3:
                cfb cfbVar = (cfb) this.c;
                cfbVar.b.add(exc);
                cfbVar.a.a().a(exc);
                break;
            case 4:
                g0c g0cVar3 = ((upb) this.c).l;
                String message3 = exc.getMessage();
                if (message3 == null) {
                    message3 = exc.toString();
                }
                qne A3 = gut.A(message3);
                x60 x60Var3 = (x60) g0cVar3;
                x60Var3.getClass();
                x60Var3.a(A3);
                break;
            case 5:
                ((ArrayList) this.c).add(exc);
                break;
            default:
                g0c g0cVar4 = ((fyf) this.c).l;
                String message4 = exc.getMessage();
                if (message4 == null) {
                    message4 = exc.toString();
                }
                qne A4 = gut.A(message4);
                x60 x60Var4 = (x60) g0cVar4;
                x60Var4.getClass();
                x60Var4.a(A4);
                break;
        }
    }
}
