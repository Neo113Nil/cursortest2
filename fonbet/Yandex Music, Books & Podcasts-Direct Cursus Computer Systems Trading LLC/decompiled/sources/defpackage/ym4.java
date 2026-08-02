package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ym4 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ym4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        switch (this.a) {
            case 0:
                l18 l18Var = l18.b;
                bdt I = hag.I(qqp.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                break;
            case 2:
                SharedPreferences sharedPreferences = ((Context) l18.b.c(hag.I(Context.class))).getSharedPreferences("Yandex_Music", 0);
                String string = sharedPreferences.getString("KEY_CLID", null);
                if (string == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("KEY_CLID", "google-play");
                    edit.apply();
                    break;
                }
                break;
            case 4:
                jyr jyrVar = tn4.a;
                Iterator it = rn4.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((rn4) obj).a.equals((String) tn4.a.getValue())) {
                        }
                    } else {
                        obj = null;
                    }
                }
                rn4 rn4Var = (rn4) obj;
                if (rn4Var == null) {
                    rn4 rn4Var2 = rn4.b;
                    su4.s(2, null, f1d.g("Unknown CLID: ", (String) tn4.a.getValue()), null);
                    break;
                }
                break;
            case 15:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(upq.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                break;
            case 18:
                jyr jyrVar2 = k3j.e;
                if (ixf.x()) {
                    oi5 oi5Var = (oi5) ti5.b.getValue();
                    Parcelable.Creator<zh5> creator = zh5.CREATOR;
                    ArrayList l = l48.l();
                    ArrayList arrayList = new ArrayList(v75.o(l, 10));
                    Iterator it2 = l.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((zh5) it2.next()).a);
                    }
                    oi5.f(oi5Var, arrayList);
                } else {
                    jk5 jk5Var = (jk5) ((pi5) ti5.a.getValue()).a;
                    jk5Var.k.d(jk5.n[0], x97.y(jk5Var.h, null, null, new ek5(30000L, jk5Var, (Continuation) null), 3));
                }
                break;
        }
        return Unit.a;
    }
}
