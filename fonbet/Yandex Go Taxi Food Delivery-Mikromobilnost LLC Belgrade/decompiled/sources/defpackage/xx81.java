package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.zabh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public final class xx81 extends t150 {
    public final /* synthetic */ int c;
    public final /* synthetic */ yx81 w;
    public final Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx81(yx81 yx81Var, Object obj, int i) {
        super(1, yx81Var);
        this.c = i;
        this.w = yx81Var;
        this.x = obj;
    }

    @Override // defpackage.t150
    public final void b() {
        kz81 kz81Var;
        Set set;
        int i = this.c;
        int i2 = 0;
        Object obj = this.x;
        yx81 yx81Var = this.w;
        switch (i) {
            case 0:
                e eVar = yx81Var.a;
                Context context = yx81Var.c;
                yz81 yz81Var = new yz81(yx81Var.w);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) obj;
                for (om2 om2Var : hashMap.keySet()) {
                    if (!om2Var.requiresGooglePlayServices() || ((vx81) hashMap.get(om2Var)).c) {
                        arrayList2.add(om2Var);
                    } else {
                        arrayList.add(om2Var);
                    }
                }
                int i3 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i2 < size) {
                        i3 = yz81Var.a(context, (om2) arrayList2.get(i2));
                        i2++;
                        if (i3 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        i3 = yz81Var.a(context, (om2) arrayList.get(i2));
                        i2++;
                        if (i3 != 0) {
                        }
                    }
                }
                if (i3 != 0) {
                    wx81 wx81Var = new wx81(this, yx81Var, new ConnectionResult(i3, null));
                    zabh zabhVar = eVar.x;
                    zabhVar.sendMessage(zabhVar.obtainMessage(1, wx81Var));
                    break;
                } else {
                    if (yx81Var.F && (kz81Var = yx81Var.D) != null) {
                        kz81Var.zab();
                    }
                    for (om2 om2Var2 : hashMap.keySet()) {
                        b25 b25Var = (b25) hashMap.get(om2Var2);
                        if (!om2Var2.requiresGooglePlayServices() || yz81Var.a(context, om2Var2) == 0) {
                            om2Var2.connect(b25Var);
                        } else {
                            tx81 tx81Var = new tx81(yx81Var, b25Var);
                            zabh zabhVar2 = eVar.x;
                            zabhVar2.sendMessage(zabhVar2.obtainMessage(1, tx81Var));
                        }
                    }
                    break;
                }
                break;
            default:
                e eVar2 = yx81Var.a;
                d dVar = eVar2.F;
                y2c y2cVar = yx81Var.K;
                if (y2cVar == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet(y2cVar.a);
                    Map map = y2cVar.c;
                    for (zm2 zm2Var : map.keySet()) {
                        if (!eVar2.z.containsKey(zm2Var.b)) {
                            map.get(zm2Var).getClass();
                            ny61.u();
                            break;
                        }
                    }
                    set = hashSet;
                }
                dVar.I = set;
                ArrayList arrayList3 = (ArrayList) obj;
                int size3 = arrayList3.size();
                while (i2 < size3) {
                    ((om2) arrayList3.get(i2)).getRemoteService(yx81Var.H, eVar2.F.I);
                    i2++;
                }
                break;
        }
    }
}
