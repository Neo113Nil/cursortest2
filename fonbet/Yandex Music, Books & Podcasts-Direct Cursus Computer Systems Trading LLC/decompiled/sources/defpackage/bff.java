package defpackage;

import android.content.Context;
import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.yandex.pulse.metrics.o;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class bff implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ bff(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        switch (this.a) {
            case 0:
                return new gff();
            case 1:
                return new hff();
            case 2:
                return new fhf();
            case 3:
                return new ghf();
            case 4:
                return new lhf();
            case 5:
                return new mhf();
            case 6:
                return qld.m();
            case 7:
                return new zqj();
            case 8:
                return Unit.a;
            case 9:
                return new chn();
            case 10:
                jyr jyrVar = o5j.e;
                return Boolean.valueOf(tyf.v());
            case 11:
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Context context = (Context) qdcVar.C(I);
                bdt I2 = hag.I(frt.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                frt frtVar = (frt) qdcVar2.C(I2);
                bdt I3 = hag.I(wst.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                return new i1v(context, frtVar, (wst) qdcVar3.C(I3));
            case 12:
                return new hkf();
            case 13:
                l18 l18Var2 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var2.a;
                qdcVar4.getClass();
                etr etrVar = (etr) ((byb) qdcVar4.C(I4)).b(etr.class);
                if (Intrinsics.d(etrVar.b(), "on")) {
                    return fow.n;
                }
                JsonArray c = etrVar.a().c(DefaultConnectableDeviceStore.KEY_DEVICES);
                if (c == null) {
                    return c5b.a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = c.a.iterator();
                while (it.hasNext()) {
                    JsonElement jsonElement = (JsonElement) it.next();
                    jsonElement.getClass();
                    String I5 = cxb.I(jsonElement);
                    if (I5 != null) {
                        arrayList.add(I5);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    Iterator it3 = fow.n.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            if (((fow) obj).a.equals(str)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fow fowVar = (fow) obj;
                    if (fowVar != null) {
                        arrayList2.add(fowVar);
                    }
                }
                return arrayList2;
            case 14:
                l18 l18Var3 = l18.b;
                bdt I6 = hag.I(huu.class);
                qdc qdcVar5 = l18Var3.a;
                qdcVar5.getClass();
                return (yxu) ((huu) qdcVar5.C(I6)).c.getValue();
            case 15:
                return (odd) l18.b.c(hag.I(odd.class));
            case 16:
                return (dan) l18.b.c(hag.I(dan.class));
            case 17:
                return (odd) l18.b.c(hag.I(odd.class));
            case 18:
                jyr jyrVar2 = jxf.e;
                return y0q.b(1, 0, oi3.b, 2);
            case 19:
                return y0q.b(1, 0, oi3.b, 2);
            case 20:
                l18 l18Var4 = l18.b;
                bdt I7 = hag.I(b4g.class);
                qdc qdcVar6 = l18Var4.a;
                qdcVar6.getClass();
                return (g4g) ((b4g) qdcVar6.C(I7)).b.getValue();
            case 21:
                l18 l18Var5 = l18.b;
                bdt I8 = hag.I(y3d.class);
                qdc qdcVar7 = l18Var5.a;
                qdcVar7.getClass();
                return (f4d) ((y3d) qdcVar7.C(I8)).a.getValue();
            case 22:
                DecimalFormat decimalFormat = new DecimalFormat();
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator(' ');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                return decimalFormat;
            case 23:
                return new p4g();
            case 24:
                l18 l18Var6 = l18.b;
                bdt I9 = hag.I(y18.class);
                qdc qdcVar8 = l18Var6.a;
                qdcVar8.getClass();
                b9s[] b9sVarArr = d9s.a;
                return Boolean.valueOf(d9s.a(b9s.d));
            case 25:
                return Unit.a;
            case 26:
                return Unit.a;
            case 27:
                return new zf6(ern.a(t5a.class), (t9f) null, new t9f[0]);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new zf6(ern.a(q2a.class), (t9f) null, new t9f[0]);
            default:
                l18 l18Var7 = l18.b;
                return Boolean.valueOf(((ng5) ((byb) l18Var7.c(hag.I(byb.class))).b(ng5.class)).h());
        }
    }
}
