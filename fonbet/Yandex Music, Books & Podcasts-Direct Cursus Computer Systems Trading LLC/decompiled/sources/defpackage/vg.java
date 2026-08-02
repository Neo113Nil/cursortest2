package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class vg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5f b;

    public /* synthetic */ vg(v5f v5fVar, int i) {
        this.a = i;
        this.b = v5fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                g4f g4fVar = (g4f) obj;
                uhp uhpVar = this.b.a.b;
                mip mipVar = new mip();
                mipVar.l(ern.a(s7k.class), new s7k());
                uhp c = mipVar.c();
                uhpVar.getClass();
                mip mipVar2 = new mip();
                uhpVar.a(mipVar2);
                c.a(new f4m(9, mipVar2));
                uhp c2 = mipVar2.c();
                g4fVar.getClass();
                g4fVar.i = c2;
                break;
            default:
                g4f g4fVar2 = (g4f) obj;
                uhp uhpVar2 = this.b.a.b;
                mip mipVar3 = new mip();
                mipVar3.l(ern.a(s7k.class), new s7k());
                uhp c3 = mipVar3.c();
                uhpVar2.getClass();
                mip mipVar4 = new mip();
                uhpVar2.a(mipVar4);
                c3.a(new f4m(9, mipVar4));
                uhp c4 = mipVar4.c();
                g4fVar2.getClass();
                g4fVar2.i = c4;
                break;
        }
        return Unit.a;
    }
}
