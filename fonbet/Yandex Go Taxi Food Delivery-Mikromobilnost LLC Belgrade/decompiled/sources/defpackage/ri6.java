package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public final /* synthetic */ class ri6 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ri6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                o[] oVarArr = (o[]) obj7;
                List list = (List) obj6;
                k kVar = (k) obj5;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj3;
                si6 si6Var = (si6) obj2;
                o.a aVar = (o.a) obj;
                int length = oVarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3;
                    pi6.b(aVar, oVarArr[i2], (x910) list.get(i4), kVar.getLayoutDirection(), ref$IntRef.element, ref$IntRef2.element, si6Var.a);
                    i2++;
                    i3 = i4 + 1;
                }
                return zy11.a;
            default:
                final jn11 jn11Var = (jn11) obj7;
                final b3k b3kVar = (b3k) obj6;
                final a851 a851Var = (a851) obj5;
                final jul julVar = (jul) obj4;
                final vol volVar = (vol) obj3;
                final eul eulVar = (eul) obj2;
                final l1o l1oVar = (l1o) obj;
                return new okx() { // from class: wqq
                    @Override // defpackage.okx
                    public final v0x a(Object obj8) {
                        jn11 jn11Var2 = jn11.this;
                        boolean booleanValue = ((Boolean) jn11Var2.a.invoke()).booleanValue();
                        b3k b3kVar2 = b3kVar;
                        l1o l1oVar2 = l1oVar;
                        a851 a851Var2 = a851Var;
                        vol volVar2 = volVar;
                        if (!booleanValue) {
                            return new ful(b3kVar2, l1oVar2.c, l1oVar2.d, eulVar, volVar2, l1oVar2.g, a851Var2);
                        }
                        cyl cylVar = l1oVar2.c;
                        w0j w0jVar = l1oVar2.d;
                        return new lul(new j3k(b3kVar2, new l3k(cylVar, a851Var2), w0jVar, ((Number) jn11Var2.b.invoke()).intValue(), ((Number) jn11Var2.c.invoke()).intValue()), w0jVar, julVar, volVar2, l1oVar2.g);
                    }
                };
        }
    }
}
