package android.content.Context;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class FrostHunterStrictModeNebulaTitanPrime4338 extends FrostHunterBroadcastReceiverBlazeNebula5271 {
    public static Object FrostHunterAlphaAnimationNovaGamma6326(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return FrostHunterNavigationViewMasterVortexBeta1295((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final void FrostHunterAnimatorSetEliteQuantum4520(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterConstraintSetCloneMasterUltraRogue2633(sb, obj, frostHunterCombineLegendMegaPrime5473);
        }
        sb.append(charSequence3);
    }

    public static Object FrostHunterBindingAdapterInfernoFusionForce2284(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList FrostHunterCamera2NeoMax8666(List list, Object obj) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList FrostHunterCoordinatorLayoutDragonHyperionSolar9277(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static ArrayList FrostHunterCoordinatorLayoutGammaTurboSpark2420(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static final void FrostHunterDrawableCompatHeroMasterSpectra7412(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static Set FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(FrostHunterBroadcastHeroSpectra7879.FrostHunterSoundPoolNovaTitanTitan5784(collection.size()));
                    FrostHunterDrawableCompatHeroMasterSpectra7412(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                singleton.getClass();
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            FrostHunterDrawableCompatHeroMasterSpectra7412(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                singleton2.getClass();
                return singleton2;
            }
        }
        return FrostHunterLayoutInflaterNovaPhantom4865.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public static List FrostHunterGyroscopeOmegaEclipseOlympian7225(Iterable iterable) {
        ArrayList arrayList;
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        if (!z) {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                FrostHunterDrawableCompatHeroMasterSpectra7412(iterable, arrayList);
            }
            return FrostHunterCardViewHyperionAurora3829.FrostHunterRemoteConfigThunderShadow4435(arrayList);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static void FrostHunterInAppPurchaseLegendEpicDragon4579(Iterable iterable, AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List FrostHunterItemDecorationPhoenixAlphaVortex8006(List list, Comparator comparator) {
        list.getClass();
        if (list.size() <= 1) {
            return FrostHunterGyroscopeOmegaEclipseOlympian7225(list);
        }
        Object[] array = list.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static Object FrostHunterNavigationViewMasterVortexBeta1295(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static List FrostHunterPlaceholderLegendForceNebula9869(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
        }
        if (size == 1) {
            return FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247(FrostHunterViewModelScopeTitanRogue1970(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object FrostHunterSharedElementPixelTitan2806(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String FrostHunterTransformNovaBetaNovaX5251(Iterable iterable, CharSequence charSequence, String str, String str2, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            frostHunterCombineLegendMegaPrime5473 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        FrostHunterAnimatorSetEliteQuantum4520(iterable, sb, charSequence2, str3, str4, "...", frostHunterCombineLegendMegaPrime5473);
        return sb.toString();
    }

    public static Object FrostHunterViewModelScopeTitanRogue1970(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static boolean FrostHunterViewPager2StrikePulse8790(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
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
                    FrostHunterCardViewHyperionAurora3829.FrostHunterNestedScrollViewThunderNovaX6772();
                    throw null;
                }
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, next)) {
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
}
