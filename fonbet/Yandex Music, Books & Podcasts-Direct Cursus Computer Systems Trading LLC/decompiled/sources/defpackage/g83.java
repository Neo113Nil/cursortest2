package defpackage;

import androidx.compose.foundation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class g83 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6g b;

    public /* synthetic */ g83(o6g o6gVar, tka tkaVar) {
        this.a = 0;
        this.b = o6gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                htd htdVar = (htd) obj;
                htdVar.getClass();
                ltd ltdVar = htdVar.s;
                jtd jtdVar = jtd.a;
                if (!jtdVar.equals(ltdVar)) {
                    htdVar.s = jtdVar;
                    htdVar.q |= 2;
                }
                o6g o6gVar = htdVar.D;
                o6g o6gVar2 = this.b;
                if (!o6gVar2.equals(o6gVar)) {
                    htdVar.q |= 128;
                    htdVar.D = o6gVar2;
                }
                float floatValue = Float.valueOf(0.88f).floatValue();
                if (floatValue != htdVar.H) {
                    htdVar.q |= 2048;
                    htdVar.H = floatValue;
                }
                return Unit.a;
            case 1:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                jpa.A0(opfVar, this.b, 0L, 0L, 0.0f, null, null, 6, 62);
                return Unit.a;
            case 2:
                yci yciVar = (yci) obj;
                yciVar.getClass();
                return a.a(yciVar, this.b);
            case 3:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                jpa.A0(opfVar2, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            case 4:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.A0(jpaVar, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            case 5:
                opf opfVar3 = (opf) obj;
                opfVar3.getClass();
                opfVar3.a();
                jpa.A0(opfVar3, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            case 6:
                opf opfVar4 = (opf) obj;
                opfVar4.getClass();
                opfVar4.a();
                jpa.A0(opfVar4, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            case 7:
                opf opfVar5 = (opf) obj;
                opfVar5.getClass();
                opfVar5.a();
                jpa.A0(opfVar5, this.b, 0L, opfVar5.a.e(), 0.0f, null, null, 6, 58);
                return Unit.a;
            case 8:
                opf opfVar6 = (opf) obj;
                opfVar6.getClass();
                opfVar6.a();
                jpa.A0(opfVar6, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            case 9:
                opf opfVar7 = (opf) obj;
                opfVar7.getClass();
                opfVar7.a();
                jpa.A0(opfVar7, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            case 10:
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                jpa.P(jpaVar2, this.b, 0L, 0L, 0L, null, 254);
                return Unit.a;
            case 11:
                jpa jpaVar3 = (jpa) obj;
                jpaVar3.getClass();
                jpa.q(jpaVar3, this.b, nmq.c(jpaVar3.e()) / 2, 0L, 0.0f, null, 124);
                return Unit.a;
            case 12:
                opf opfVar8 = (opf) obj;
                opfVar8.getClass();
                opfVar8.a();
                jpa.A0(opfVar8, this.b, 0L, 0L, 0.0f, null, null, 5, 62);
                return Unit.a;
            case 13:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                return np3Var.b(new g83(this.b, 12));
            default:
                jpa jpaVar4 = (jpa) obj;
                jpaVar4.getClass();
                jpa.A0(jpaVar4, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
        }
    }

    public /* synthetic */ g83(o6g o6gVar, int i) {
        this.a = i;
        this.b = o6gVar;
    }
}
