package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class s24 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6g b;
    public final /* synthetic */ o6g c;

    public /* synthetic */ s24(o6g o6gVar, o6g o6gVar2, int i) {
        this.a = i;
        this.b = o6gVar;
        this.c = o6gVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                jpa.A0(opfVar, this.b, 0L, 0L, 0.0f, null, null, 6, 62);
                jpa.A0(opfVar, this.c, 0L, 0L, 0.0f, null, null, 6, 62);
                break;
            case 1:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                ou3 ou3Var = opfVar2.a;
                jpa.A0(opfVar2, this.b, 0L, ou3Var.e(), 0.0f, null, null, 3, 58);
                jpa.A0(opfVar2, this.c, 0L, ou3Var.e(), 0.0f, null, null, 6, 58);
                break;
            case 2:
                opf opfVar3 = (opf) obj;
                opfVar3.getClass();
                opfVar3.a();
                jpa.A0(opfVar3, this.b, 0L, 0L, 0.0f, null, null, 6, 62);
                jpa.A0(opfVar3, this.c, 0L, 0L, 0.0f, null, null, 6, 62);
                break;
            default:
                opf opfVar4 = (opf) obj;
                opfVar4.getClass();
                opfVar4.a();
                jpa.A0(opfVar4, this.b, 0L, 0L, 0.0f, null, null, 6, 62);
                jpa.A0(opfVar4, this.c, 0L, 0L, 0.0f, null, null, 6, 62);
                break;
        }
        return Unit.a;
    }
}
