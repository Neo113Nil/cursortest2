package Z;

import a.AbstractC0078a;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import f0.C0141f;
import f0.C0142g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l0.InterfaceC0232c;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements InterfaceC0232c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1405b;

    public /* synthetic */ B(int i, Object obj) {
        this.f1404a = i;
        this.f1405b = obj;
    }

    @Override // l0.InterfaceC0232c
    public final Bundle a() {
        Bundle bundle;
        switch (this.f1404a) {
            case 0:
                return ((M) this.f1405b).T();
            case 1:
                return androidx.lifecycle.I.a((androidx.lifecycle.I) this.f1405b);
            case 2:
                f0.z zVar = (f0.z) this.f1405b;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : u1.s.G(zVar.f3022u.f2895a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle h2 = ((f0.N) entry.getValue()).h();
                    if (h2 != null) {
                        arrayList.add(str);
                        bundle2.putBundle(str, h2);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                }
                u1.e eVar = zVar.f3010g;
                if (!eVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[eVar.f4471c];
                    Iterator<E> it = eVar.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        parcelableArr[i] = new C0142g((C0141f) it.next());
                        i++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                LinkedHashMap linkedHashMap = zVar.f3013l;
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i2 = 0;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i2] = intValue;
                        arrayList2.add(str2);
                        i2++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                LinkedHashMap linkedHashMap2 = zVar.f3014m;
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        u1.e eVar2 = (u1.e) entry3.getValue();
                        arrayList3.add(str3);
                        eVar2.getClass();
                        Parcelable[] parcelableArr2 = new Parcelable[eVar2.f4471c];
                        Iterator it2 = eVar2.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                u1.h.H();
                                throw null;
                            }
                            parcelableArr2[i3] = (C0142g) next;
                            i3 = i4;
                        }
                        bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str3, parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (zVar.f3009f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", zVar.f3009f);
                }
                if (bundle != null) {
                    return bundle;
                }
                Bundle bundle3 = Bundle.EMPTY;
                D1.i.d(bundle3, "EMPTY");
                return bundle3;
            default:
                NavHostFragment navHostFragment = (NavHostFragment) this.f1405b;
                D1.i.e(navHostFragment, "this$0");
                int i5 = navHostFragment.f2084Y;
                if (i5 != 0) {
                    return AbstractC0078a.d(new t1.d("android-support-nav:fragment:graphId", Integer.valueOf(i5)));
                }
                Bundle bundle4 = Bundle.EMPTY;
                D1.i.d(bundle4, "{\n                    Bu…e.EMPTY\n                }");
                return bundle4;
        }
    }
}
