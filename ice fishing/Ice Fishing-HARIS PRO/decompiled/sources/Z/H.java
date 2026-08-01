package Z;

import android.content.Intent;
import d.C0124a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class H extends R.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1413a;

    @Override // R.j
    public final Object e0(int i, Intent intent) {
        switch (this.f1413a) {
            case 0:
                return new C0124a(i, intent);
            case 1:
                u1.p pVar = u1.p.f4474a;
                if (i != -1 || intent == null) {
                    return pVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return pVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(u1.i.I(arrayList2, 10), u1.i.I(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new t1.d(it.next(), it2.next()));
                }
                return u1.s.F(arrayList3);
            default:
                return new C0124a(i, intent);
        }
    }
}
