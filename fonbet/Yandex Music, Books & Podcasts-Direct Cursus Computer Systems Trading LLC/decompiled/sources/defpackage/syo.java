package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class syo implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tyo b;

    public /* synthetic */ syo(tyo tyoVar, int i) {
        this.a = i;
        this.b = tyoVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mm4 mm4Var = (mm4) obj;
        switch (this.a) {
            case 0:
                mm4Var.getClass();
                ff7.N(ekr.a);
                mm4.a(mm4Var, "type", tkr.b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
                tyo tyoVar = this.b;
                sb.append(tyoVar.a.h());
                sb.append('>');
                syo syoVar = new syo(tyoVar, 1);
                mm4.a(mm4Var, Constants.KEY_VALUE, avf.x(sb.toString(), shp.b, new mhp[0], syoVar));
                List list = tyoVar.b;
                list.getClass();
                mm4Var.b = list;
                break;
            default:
                mm4Var.getClass();
                for (Map.Entry entry : this.b.e.entrySet()) {
                    mm4.a(mm4Var, (String) entry.getKey(), ((t9f) entry.getValue()).getDescriptor());
                }
                break;
        }
        return Unit.a;
    }
}
