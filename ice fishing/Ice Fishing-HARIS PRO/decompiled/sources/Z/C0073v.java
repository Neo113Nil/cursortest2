package Z;

import android.os.Bundle;
import b.C0108d;
import h.AbstractActivityC0168i;
import java.util.ArrayList;
import java.util.HashMap;
import l0.C0233d;

/* renamed from: Z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0073v implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0168i f1627b;

    public /* synthetic */ C0073v(AbstractActivityC0168i abstractActivityC0168i, int i) {
        this.f1626a = i;
        this.f1627b = abstractActivityC0168i;
    }

    @Override // c.b
    public final void a() {
        switch (this.f1626a) {
            case 0:
                C0074w c0074w = (C0074w) this.f1627b.f3211r.f10b;
                c0074w.f1631d.b(c0074w, c0074w, null);
                break;
            default:
                AbstractActivityC0168i abstractActivityC0168i = this.f1627b;
                Bundle c2 = ((C0233d) abstractActivityC0168i.e.f2300c).c("android:support:activity-result");
                if (c2 != null) {
                    C0108d c0108d = abstractActivityC0168i.j;
                    c0108d.getClass();
                    ArrayList<Integer> integerArrayList = c2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0108d.f2271d = c2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = c2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c0108d.f2273g;
                        bundle2.putAll(bundle);
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            HashMap hashMap = c0108d.f2269b;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = c0108d.f2268a;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.intValue();
                            String str2 = stringArrayList.get(i);
                            hashMap2.put(num2, str2);
                            hashMap.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
