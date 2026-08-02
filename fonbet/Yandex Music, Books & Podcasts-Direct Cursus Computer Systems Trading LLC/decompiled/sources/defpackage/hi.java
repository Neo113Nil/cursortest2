package defpackage;

import android.hardware.SensorManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class hi implements na8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.na8
    public final void a() {
        int i = this.a;
        Unit unit = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ei eiVar = ((ai) obj).a;
                if (eiVar != null) {
                    eiVar.b();
                    unit = Unit.a;
                }
                if (unit == null) {
                    xq0.q("Launcher has not been initialized");
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = ((e4t) ((am) obj).a.c.a.getValue()).e;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    qxr.a();
                    neg.A(dyr.e, null);
                    break;
                }
                break;
            case 2:
                ((ta8) obj).a.invoke();
                break;
            case 3:
                d28 d28Var = (d28) obj;
                d28Var.dismiss();
                d28Var.g.m();
                break;
            case 4:
                jhm jhmVar = (jhm) obj;
                jhmVar.m();
                jhmVar.setTag(R.id.view_tree_lifecycle_owner, null);
                jhmVar.n.removeViewImmediate(jhmVar);
                break;
            case 5:
                ((ui2) obj).remove();
                break;
            case 6:
                ((st4) obj).g();
                break;
            case 7:
                ((qbs) obj).l();
                break;
            case 8:
                ((rhp) obj).a();
                break;
            case 9:
                ((rtf) obj).d = null;
                break;
            case 10:
                ((euf) obj).c = null;
                break;
            case 11:
                ((auf) obj).f = true;
                break;
            case 12:
                uai uaiVar = (uai) obj;
                uaiVar.dismiss();
                uaiVar.g.m();
                break;
            case 13:
                ((slm) obj).remove();
                break;
            case 14:
                ((vp5) obj).a.F();
                break;
            case 15:
                xep xepVar = (xep) obj;
                xepVar.i();
                xepVar.i.setValue(Boolean.FALSE);
                break;
            case 16:
                wtp wtpVar = (wtp) obj;
                SensorManager sensorManager = wtpVar.b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(wtpVar);
                }
                wtpVar.b = null;
                break;
            case 17:
                xdr xdrVar = ((iyq) obj).b().g;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 18:
                ((Function0) obj).invoke();
                break;
            case 19:
                ((obu) ((pbu) obj)).a.b();
                break;
            default:
                ((paw) obj).a();
                break;
        }
    }
}
