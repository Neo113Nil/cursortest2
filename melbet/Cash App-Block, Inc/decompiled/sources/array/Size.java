package array;

import array.SortOrder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import operation.StandardLogicOperation;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes3.dex */
public final class Size implements StandardLogicOperation {
    public final /* synthetic */ int $r8$classId;
    public static final Size INSTANCE$1 = new Size(1);
    public static final Size INSTANCE$2 = new Size(2);
    public static final Size INSTANCE = new Size(0);
    public static final Size INSTANCE$3 = new Size(3);

    public /* synthetic */ Size(int i) {
        this.$r8$classId = i;
    }

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        Object failure;
        switch (this.$r8$classId) {
            case 0:
                List list = obj instanceof List ? (List) obj : null;
                if (list != null) {
                    return Integer.valueOf(list.size());
                }
                return null;
            case 1:
                List list2 = obj instanceof List ? (List) obj : null;
                if (list2 != null) {
                    return CollectionsKt.toList(CollectionsKt.toMutableSet(list2));
                }
                return null;
            case 2:
                List list3 = AnyUtilsKt.getAsList(obj).items;
                try {
                    Result.Companion companion = Result.Companion;
                    Object obj3 = list3.get(4);
                    obj3.getClass();
                    Number number = (Number) obj3;
                    if (number.doubleValue() != number.intValue()) {
                        number = null;
                    }
                    Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        JsonLogicList asList = AnyUtilsKt.getAsList(list3.get(0));
                        Object obj4 = list3.get(1);
                        obj4.getClass();
                        String str = (String) obj4;
                        Object obj5 = list3.get(2);
                        obj5.getClass();
                        String str2 = (String) obj5;
                        Object obj6 = list3.get(3);
                        obj6.getClass();
                        Object obj7 = list3.get(5);
                        obj7.getClass();
                        failure = new JoinToStringArguments(asList, str, str2, (String) obj6, intValue, (String) obj7);
                    } else {
                        failure = null;
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                JoinToStringArguments joinToStringArguments = Result.m4120exceptionOrNullimpl(failure) == null ? (JoinToStringArguments) failure : null;
                if (joinToStringArguments != null) {
                    return CollectionsKt.joinToString$default(joinToStringArguments.elementsToJoin, joinToStringArguments.separator, joinToStringArguments.prefix, joinToStringArguments.postfix, joinToStringArguments.limit, joinToStringArguments.truncated, null, 32);
                }
                return null;
            default:
                Object obj8 = SortOrder.Unknown.INSTANCE;
                SortOrder.Unknown unknown = SortOrder.Unknown.INSTANCE$1;
                SortOrder.Unknown unknown2 = SortOrder.Unknown.INSTANCE$2;
                JsonLogicList asList2 = AnyUtilsKt.getAsList(obj);
                Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) asList2);
                List list4 = firstOrNull instanceof List ? (List) firstOrNull : null;
                if (list4 == null) {
                    return null;
                }
                Object orNull = CollectionsKt.getOrNull(1, asList2);
                String str3 = orNull instanceof String ? (String) orNull : null;
                SortOrder.Unknown unknown3 = Intrinsics.areEqual(str3, "desc") ? unknown2 : Intrinsics.areEqual(str3, "asc") ? unknown : obj8;
                List list5 = list4;
                ArrayList arrayList = new ArrayList();
                for (Object obj9 : list5) {
                    if (obj9 instanceof String) {
                        arrayList.add(obj9);
                    }
                }
                if (Integer.valueOf(arrayList.size()).equals(Integer.valueOf(list4.size()))) {
                    if (!(list4 instanceof List)) {
                        list4 = null;
                    }
                    if (list4 == null) {
                        return null;
                    }
                    if (unknown3.equals(unknown2)) {
                        return CollectionsKt.sortedDescending(list4);
                    }
                    if (unknown3.equals(unknown)) {
                        return CollectionsKt.sorted(list4);
                    }
                    if (unknown3.equals(obj8)) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj10 : list5) {
                    if (obj10 instanceof Boolean) {
                        arrayList2.add(obj10);
                    }
                }
                if (Integer.valueOf(arrayList2.size()).equals(Integer.valueOf(list4.size()))) {
                    if (!(list4 instanceof List)) {
                        list4 = null;
                    }
                    if (list4 == null) {
                        return null;
                    }
                    if (unknown3.equals(unknown2)) {
                        return CollectionsKt.sortedDescending(list4);
                    }
                    if (unknown3.equals(unknown)) {
                        return CollectionsKt.sorted(list4);
                    }
                    if (unknown3.equals(obj8)) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj11 : list5) {
                    if (obj11 instanceof Number) {
                        arrayList3.add(obj11);
                    }
                }
                if (!Integer.valueOf(arrayList3.size()).equals(Integer.valueOf(list4.size()))) {
                    return null;
                }
                ArrayList filterNotNull = CollectionsKt.filterNotNull(AnyUtilsKt.getAsDoubleList(list4));
                if (unknown3.equals(unknown2)) {
                    return CollectionsKt.sortedDescending(filterNotNull);
                }
                if (unknown3.equals(unknown)) {
                    return CollectionsKt.sorted(filterNotNull);
                }
                if (unknown3.equals(obj8)) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
