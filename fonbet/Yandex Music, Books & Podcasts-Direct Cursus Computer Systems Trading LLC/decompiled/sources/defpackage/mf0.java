package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mf0 implements na8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mf0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.na8
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((nf0) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((of0) obj);
                break;
            case 2:
                ((nyf) obj2).d((ru2) obj);
                break;
            case 3:
                ((nyf) obj2).d((ltb) obj);
                break;
            case 4:
                ((nyf) obj2).d((hud) obj);
                break;
            case 5:
                ((xje) obj2).a.l((wje) obj);
                break;
            case 6:
                ((qvf) obj2).c.l(obj);
                break;
            case 7:
                ((dzf) obj2).getLifecycle().d((an5) obj);
                break;
            case 8:
                if (((Boolean) ((aqi) obj).getValue()).booleanValue()) {
                    ((Function0) obj2).invoke();
                    break;
                }
                break;
            case 9:
                ((nyf) obj2).d((uyf) obj);
                break;
            case 10:
                pl0 pl0Var = (pl0) obj2;
                if (pl0Var != null) {
                    pl0Var.c((ekq) obj);
                    break;
                }
                break;
            case 11:
                aqi aqiVar = (aqi) obj2;
                rqm rqmVar = (rqm) aqiVar.getValue();
                if (rqmVar != null) {
                    qqm qqmVar = new qqm(rqmVar);
                    uoi uoiVar = (uoi) obj;
                    if (uoiVar != null) {
                        uoiVar.b(qqmVar);
                    }
                    aqiVar.setValue(null);
                    break;
                }
                break;
            case 12:
                ((gds) obj2).c.remove((Function1) obj);
                break;
            case 13:
                ((nyf) obj2).d((hud) obj);
                break;
            case 14:
                ((d8t) obj2).j.remove((d8t) obj);
                break;
            case 15:
                d8t d8tVar = (d8t) obj2;
                d8tVar.getClass();
                s7t s7tVar = (s7t) ((t7t) obj).b.getValue();
                if (s7tVar != null) {
                    d8tVar.i.remove(s7tVar.a);
                    break;
                }
                break;
            case 16:
                ((d8t) obj2).i.remove((z7t) obj);
                break;
            case 17:
                ((dzf) obj2).getLifecycle().d((an5) obj);
                break;
            case 18:
                rqv rqvVar = (rqv) obj2;
                View view = (View) obj;
                int i2 = rqvVar.u - 1;
                rqvVar.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = wdu.a;
                    ndu.n(view, null);
                    wdu.t(view, null);
                    view.removeOnAttachStateChangeListener(rqvVar.v);
                    break;
                }
                break;
            case 19:
                dzv dzvVar = (dzv) obj2;
                rxv rxvVar = (rxv) obj;
                dzvVar.getClass();
                rxvVar.getClass();
                dzvVar.b.remove(rxvVar);
                ezv ezvVar = dzvVar.a;
                ((y1f) ((w1f) ezvVar.a.c).c).f(!r0.isEmpty());
                ezvVar.a.F();
                break;
            case 20:
                bcg O = ((ccg) obj2).O();
                if (O != null) {
                    acg acgVar = ((nbg) obj).a;
                    ecg ecgVar = (ecg) O;
                    ecgVar.a.H(ecgVar.m, "returnPlayer", "returning player index " + Integer.valueOf(acgVar.c), new Object[0]);
                    ime imeVar = ecgVar.h;
                    acgVar.h((q9g) imeVar.d);
                    ((ArrayList) imeVar.b).remove(acgVar);
                    ecgVar.b.n(acgVar);
                    break;
                }
                break;
            default:
                ((nbg) obj2).a.h((e9w) obj);
                break;
        }
    }
}
