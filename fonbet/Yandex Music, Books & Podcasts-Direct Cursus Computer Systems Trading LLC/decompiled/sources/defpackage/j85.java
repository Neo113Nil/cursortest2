package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class j85 extends oyc {
    public final /* synthetic */ int a;
    public final uif b;
    public final List c;
    public final mhb d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public j85(Function2 function2) {
        this.a = 1;
        this.b = (uif) function2;
        mhb mhbVar = mhb.COLOR;
        this.c = u75.h(new azc(mhbVar), new azc(mhb.NUMBER));
        this.d = mhbVar;
        this.e = true;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.functions.Function2, uif] */
    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        switch (this.a) {
            case 0:
                list.getClass();
                Object Q = CollectionsKt.Q(list);
                Q.getClass();
                int intValue = ((Number) this.b.invoke((c85) Q)).intValue();
                if (intValue >= 0 && intValue < 256) {
                    return Double.valueOf(intValue / 255.0f);
                }
                xq0.x("Value out of channel range 0..255");
                return null;
            default:
                int i = ((c85) ouj.i(list, 0)).a;
                Object obj = list.get(1);
                obj.getClass();
                Double d = (Double) obj;
                try {
                    return new c85(((c85) this.b.invoke(new c85(i), d)).a);
                } catch (IllegalArgumentException unused) {
                    ghh.J(c(), u75.h(c85.a(i), d), "Value out of range 0..1.", null);
                    throw null;
                }
        }
    }

    @Override // defpackage.oyc
    public final List b() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.oyc
    public final mhb d() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        switch (this.a) {
        }
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j85(Function1 function1) {
        this.a = 0;
        this.b = (uif) function1;
        this.c = t75.c(new azc(mhb.COLOR));
        this.d = mhb.NUMBER;
        this.e = true;
    }
}
