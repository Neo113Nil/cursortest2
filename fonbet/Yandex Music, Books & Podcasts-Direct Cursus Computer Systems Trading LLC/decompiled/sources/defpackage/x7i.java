package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class x7i implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;

    public /* synthetic */ x7i(ArrayList arrayList, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = arrayList;
        this.c = z;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bfg.d(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
            default:
                qgg.d(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
