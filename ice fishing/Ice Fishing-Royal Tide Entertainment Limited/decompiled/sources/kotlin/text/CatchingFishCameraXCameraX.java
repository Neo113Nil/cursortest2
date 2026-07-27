package kotlin.text;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class CatchingFishCameraXCameraX extends CatchingFishMVVMStateFlow {
    public static void CatchingFishAndroidX(ArrayList arrayList, CatchingFishMoshiXMLLayout catchingFishMoshiXMLLayout) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(arrayList, "<this>");
        for (int CatchingFishMotionLayout = CatchingFishToastCustomView.CatchingFishMotionLayout(arrayList); CatchingFishMotionLayout > 0; CatchingFishMotionLayout--) {
            int CatchingFishCoroutine = catchingFishMoshiXMLLayout.CatchingFishCoroutine(CatchingFishMotionLayout + 1);
            arrayList.set(CatchingFishCoroutine, arrayList.set(CatchingFishMotionLayout, arrayList.get(CatchingFishCoroutine)));
        }
    }

    public static final void CatchingFishAnimation(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CatchingFishServiceHandler catchingFishServiceHandler) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            CatchingFishToastHiltBundle.CatchingFishViewModelFAB(sb, obj, catchingFishServiceHandler);
        }
        sb.append(charSequence3);
    }

    public static Set CatchingFishCustomViewJUnit(Iterable iterable) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(CatchingFishPicassoGlide.CatchingFishStateFlow(collection.size()));
                    CatchingFishNavigationGson(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            CatchingFishNavigationGson(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return CatchingFishHandlerRealm.CatchingFishReduxKtor;
    }

    public static boolean CatchingFishDataStoreIntent(Iterable iterable, Object obj) {
        int i;
        CatchingFishFirebaseDagger.CatchingFishNavigation(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static Object CatchingFishJUnitRealm(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String CatchingFishMVVMAppCompat(Iterable iterable, String str, String str2, String str3, CatchingFishServiceHandler catchingFishServiceHandler, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            catchingFishServiceHandler = null;
        }
        CatchingFishFirebaseDagger.CatchingFishNavigation(iterable, "<this>");
        StringBuilder sb = new StringBuilder();
        CatchingFishAnimation(iterable, sb, str4, str5, str6, "...", catchingFishServiceHandler);
        return sb.toString();
    }

    public static ArrayList CatchingFishMoshiDaggerHilt(Collection collection, List list) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static final void CatchingFishNavigationGson(Iterable iterable, AbstractCollection abstractCollection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List CatchingFishRedux(Iterable iterable) {
        ArrayList arrayList;
        CatchingFishFirebaseDagger.CatchingFishNavigation(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        CatchingFishViewPagerDagger catchingFishViewPagerDagger = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
        if (!z) {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                CatchingFishNavigationGson(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : CatchingFishGsonCardView.CatchingFishFragmentFactory(arrayList.get(0)) : catchingFishViewPagerDagger;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return catchingFishViewPagerDagger;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return CatchingFishGsonCardView.CatchingFishFragmentFactory(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static Object CatchingFishStateFlow(List list) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static ArrayList CatchingFishStripeAPI(Collection collection, Object obj) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }
}
