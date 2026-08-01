package com.google.android.datatransport;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class WinterFlowSerializerUtility extends WinterFlowEventEmitterNode {
    public static List WinterFlowArrayFramework(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        if (size == 1) {
            return WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(WinterFlowThreadPoolEventEmitter(list));
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

    public static final void WinterFlowClassConsumer(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static Set WinterFlowDatabaseSchemaUtility(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(WinterFlowDataSourceUtility.WinterFlowFrameworkTransaction(collection.size()));
                    WinterFlowClassConsumer(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                singleton.getClass();
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            WinterFlowClassConsumer(iterable, linkedHashSet2);
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
        return WinterFlowCacheTool.WinterFlowVariableVersionControl;
    }

    public static ArrayList WinterFlowFrameworkCacheManager(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static ArrayList WinterFlowFunctionPipeline(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final void WinterFlowHandlerJSON(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, WinterFlowObjectSession winterFlowObjectSession) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            WinterFlowProviderRouter.WinterFlowHookDataSource(sb, obj, winterFlowObjectSession);
        }
        sb.append(charSequence3);
    }

    public static String WinterFlowHookQuery(Iterable iterable, String str, String str2, String str3, WinterFlowObjectSession winterFlowObjectSession, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            winterFlowObjectSession = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        WinterFlowHandlerJSON(iterable, sb, str4, str5, str6, "...", winterFlowObjectSession);
        return sb.toString();
    }

    public static Object WinterFlowModuleService(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static int WinterFlowParserPipeline(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                throw null;
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Object WinterFlowPipelineSoftware(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static List WinterFlowProtocolConsumer(Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        WinterFlowDataSourceEngine winterFlowDataSourceEngine = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        if (!z) {
            List WinterFlowXMLFramework = WinterFlowXMLFramework(iterable);
            int size = WinterFlowXMLFramework.size();
            return size != 0 ? size != 1 ? WinterFlowXMLFramework : WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(WinterFlowXMLFramework.get(0)) : winterFlowDataSourceEngine;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return winterFlowDataSourceEngine;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static Comparable WinterFlowRefactoringThreadPool(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList WinterFlowResolverListener(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List WinterFlowSingletonWidget(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return WinterFlowProtocolConsumer(iterable);
        }
        List WinterFlowXMLFramework = WinterFlowXMLFramework(iterable);
        Collections.reverse(WinterFlowXMLFramework);
        return WinterFlowXMLFramework;
    }

    public static Object WinterFlowStrategyHook(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        WinterFlowCompilerMechanism.WinterFlowSyntax("List is empty.");
        return null;
    }

    public static List WinterFlowTestingTransactionManager(AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.size() <= 1) {
            return WinterFlowProtocolConsumer(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static Object WinterFlowThreadPoolEventEmitter(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        WinterFlowCompilerMechanism.WinterFlowSyntax("List is empty.");
        return null;
    }

    public static List WinterFlowUIThreadPool(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List WinterFlowXMLFramework = WinterFlowXMLFramework(iterable);
            WinterFlowObjectHelper.WinterFlowSessionManagerInterface(WinterFlowXMLFramework, comparator);
            return WinterFlowXMLFramework;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return WinterFlowProtocolConsumer(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static boolean WinterFlowVersionControlModule(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : WinterFlowParserPipeline(iterable, obj) >= 0;
    }

    public static final List WinterFlowXMLFramework(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        WinterFlowClassConsumer(iterable, arrayList);
        return arrayList;
    }
}
