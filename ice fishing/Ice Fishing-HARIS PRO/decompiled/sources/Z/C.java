package Z;

import android.util.Log;
import d.C0124a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f1407b;

    public /* synthetic */ C(M m2, int i) {
        this.f1406a = i;
        this.f1407b = m2;
    }

    public final void a(Object obj) {
        switch (this.f1406a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                M m2 = this.f1407b;
                I i2 = (I) m2.f1425D.pollFirst();
                if (i2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    B.k kVar = m2.f1437c;
                    String str = i2.f1414a;
                    if (kVar.f(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0124a c0124a = (C0124a) obj;
                M m3 = this.f1407b;
                I i3 = (I) m3.f1425D.pollLast();
                if (i3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    B.k kVar2 = m3.f1437c;
                    String str2 = i3.f1414a;
                    AbstractComponentCallbacksC0070s f2 = kVar2.f(str2);
                    if (f2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        f2.r(i3.f1415b, c0124a.f2827a, c0124a.f2828b);
                        break;
                    }
                }
            default:
                C0124a c0124a2 = (C0124a) obj;
                M m4 = this.f1407b;
                I i4 = (I) m4.f1425D.pollFirst();
                if (i4 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    B.k kVar3 = m4.f1437c;
                    String str3 = i4.f1414a;
                    AbstractComponentCallbacksC0070s f3 = kVar3.f(str3);
                    if (f3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        f3.r(i4.f1415b, c0124a2.f2827a, c0124a2.f2828b);
                        break;
                    }
                }
        }
    }
}
