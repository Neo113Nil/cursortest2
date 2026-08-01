package J1;

import Z.B;
import Z.M;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.InterfaceC0101s;
import androidx.lifecycle.L;
import androidx.lifecycle.O;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.navigation.fragment.DialogFragmentNavigator;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.NavHostFragment;
import com.lumenpath.harispro.hrnavigator.R;
import f0.C0132A;
import f0.C0141f;
import f0.C0142g;
import f0.C0143h;
import f0.s;
import f0.z;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import l0.C0233d;

/* loaded from: classes.dex */
public final class j extends D1.j implements C1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Object obj) {
        super(0);
        this.f369b = i;
        this.f370c = obj;
    }

    @Override // C1.a
    public final Object c() {
        C0103u d2;
        switch (this.f369b) {
            case 0:
                return this.f370c;
            case 1:
                return L.e((V) this.f370c);
            case 2:
                C0141f c0141f = (C0141f) this.f370c;
                Context applicationContext = c0141f.f2919a.getApplicationContext();
                return new O(applicationContext instanceof Application ? (Application) applicationContext : null, c0141f, c0141f.e());
            case 3:
                z zVar = (z) this.f370c;
                zVar.getClass();
                return new C0132A(zVar.f3005a, zVar.f3022u);
            case 4:
                String str = (String) this.f370c;
                D1.i.e(str, "uriPattern");
                return new s(str, null, null);
            case 5:
                NavHostFragment navHostFragment = (NavHostFragment) this.f370c;
                Context h2 = navHostFragment.h();
                if (h2 == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                z zVar2 = new z(h2);
                if (!navHostFragment.equals(zVar2.f3015n)) {
                    InterfaceC0101s interfaceC0101s = zVar2.f3015n;
                    C0143h c0143h = zVar2.f3019r;
                    if (interfaceC0101s != null && (d2 = interfaceC0101s.d()) != null) {
                        d2.f(c0143h);
                    }
                    zVar2.f3015n = navHostFragment;
                    navHostFragment.f1592O.a(c0143h);
                }
                U c2 = navHostFragment.c();
                if (!D1.i.a(zVar2.f3016o, R.j.B(c2))) {
                    if (!zVar2.f3010g.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                    zVar2.f3016o = R.j.B(c2);
                }
                Context H2 = navHostFragment.H();
                M g2 = navHostFragment.g();
                D1.i.d(g2, "childFragmentManager");
                DialogFragmentNavigator dialogFragmentNavigator = new DialogFragmentNavigator(H2, g2);
                f0.O o2 = zVar2.f3022u;
                o2.a(dialogFragmentNavigator);
                Context H3 = navHostFragment.H();
                M g3 = navHostFragment.g();
                D1.i.d(g3, "childFragmentManager");
                int i = navHostFragment.f1618w;
                if (i == 0 || i == -1) {
                    i = R.id.nav_host_fragment_container;
                }
                o2.a(new FragmentNavigator(H3, g3, i));
                Bundle c3 = ((C0233d) navHostFragment.f1595R.f2300c).c("android-support-nav:fragment:navControllerState");
                if (c3 != null) {
                    c3.setClassLoader(h2.getClassLoader());
                    zVar2.f3008d = c3.getBundle("android-support-nav:controller:navigatorState");
                    zVar2.e = c3.getParcelableArray("android-support-nav:controller:backStack");
                    LinkedHashMap linkedHashMap = zVar2.f3014m;
                    linkedHashMap.clear();
                    int[] intArray = c3.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = c3.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            zVar2.f3013l.put(Integer.valueOf(intArray[i2]), stringArrayList.get(i3));
                            i2++;
                            i3++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = c3.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        for (String str2 : stringArrayList2) {
                            Parcelable[] parcelableArray = c3.getParcelableArray("android-support-nav:controller:backStackStates:" + str2);
                            if (parcelableArray != null) {
                                D1.i.d(str2, "id");
                                u1.e eVar = new u1.e(parcelableArray.length);
                                int i4 = 0;
                                while (true) {
                                    if (i4 < parcelableArray.length) {
                                        int i5 = i4 + 1;
                                        try {
                                            Parcelable parcelable = parcelableArray[i4];
                                            D1.i.c(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                            eVar.addLast((C0142g) parcelable);
                                            i4 = i5;
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            throw new NoSuchElementException(e.getMessage());
                                        }
                                    } else {
                                        linkedHashMap.put(str2, eVar);
                                    }
                                }
                            }
                        }
                    }
                    zVar2.f3009f = c3.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                ((C0233d) navHostFragment.f1595R.f2300c).f("android-support-nav:fragment:navControllerState", new B(2, zVar2));
                Bundle c4 = ((C0233d) navHostFragment.f1595R.f2300c).c("android-support-nav:fragment:graphId");
                if (c4 != null) {
                    navHostFragment.f2084Y = c4.getInt("android-support-nav:fragment:graphId");
                }
                ((C0233d) navHostFragment.f1595R.f2300c).f("android-support-nav:fragment:graphId", new B(3, navHostFragment));
                int i6 = navHostFragment.f2084Y;
                t1.h hVar = zVar2.f3003B;
                if (i6 != 0) {
                    zVar2.u(((C0132A) hVar.getValue()).b(i6), null);
                } else {
                    Bundle bundle = navHostFragment.f1603f;
                    int i7 = bundle != null ? bundle.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle2 = bundle != null ? bundle.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i7 != 0) {
                        zVar2.u(((C0132A) hVar.getValue()).b(i7), bundle2);
                    }
                }
                return zVar2;
            default:
                t0.f fVar = (t0.f) this.f370c;
                return BigInteger.valueOf(fVar.f4372a).shiftLeft(32).or(BigInteger.valueOf(fVar.f4373b)).shiftLeft(32).or(BigInteger.valueOf(fVar.f4374c));
        }
    }
}
