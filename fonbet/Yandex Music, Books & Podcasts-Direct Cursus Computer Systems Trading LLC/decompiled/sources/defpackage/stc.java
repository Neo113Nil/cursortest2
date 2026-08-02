package defpackage;

import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class stc implements rh {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ stc(y yVar, int i) {
        this.a = i;
        this.b = yVar;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                y yVar = this.b;
                wtc wtcVar = (wtc) yVar.H.pollFirst();
                if (wtcVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = wtcVar.a;
                    int i2 = wtcVar.b;
                    o c = yVar.c.c(str);
                    if (c == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        c.onRequestPermissionsResult(i2, strArr, iArr);
                        break;
                    }
                }
            case 1:
                qh qhVar = (qh) obj;
                y yVar2 = this.b;
                wtc wtcVar2 = (wtc) yVar2.H.pollLast();
                if (wtcVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = wtcVar2.a;
                    int i3 = wtcVar2.b;
                    o c2 = yVar2.c.c(str2);
                    if (c2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        c2.onActivityResult(i3, qhVar.a, qhVar.b);
                        break;
                    }
                }
            default:
                qh qhVar2 = (qh) obj;
                y yVar3 = this.b;
                wtc wtcVar3 = (wtc) yVar3.H.pollFirst();
                if (wtcVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = wtcVar3.a;
                    int i4 = wtcVar3.b;
                    o c3 = yVar3.c.c(str3);
                    if (c3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        c3.onActivityResult(i4, qhVar2.a, qhVar2.b);
                        break;
                    }
                }
        }
    }
}
