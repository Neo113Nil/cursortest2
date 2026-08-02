package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.LocationSourceInformation;
import androidx.compose.runtime.tooling.ParameterSourceInformation;
import androidx.compose.runtime.tooling.SourceInformation;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.unit.IntRect;
import androidx.viewpager.widget.ViewPager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class SlotTreeKt {
    public static final IntRect emptyBox = new IntRect(0, 0, 0, 0);
    public static final Regex indyLambdaRegex = new Regex("^f\\$\\d+$");
    public static final Regex legacyLambdaRegex = new Regex("^\\$([^$]+)$|\\$\\$.*?\\$-([^$]+)\\$\\d+$");

    public static final Field accessibleField(Class cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (Intrinsics.areEqual(field.getName(), str)) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    public static final ParameterInformation buildParameterInfo(Field field, Object obj, int i, int i2, int i3, ParameterSourceInformation parameterSourceInformation) {
        String substring;
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        boolean z = ((1 << i) & i2) != 0;
        int i4 = (i * 3) + 1;
        int i5 = (i3 & (7 << i4)) >> i4;
        int i6 = i5 & 3;
        boolean z2 = i6 == 3;
        boolean z3 = i6 == 0;
        boolean z4 = (i5 & 4) == 0;
        if (parameterSourceInformation == null || (substring = parameterSourceInformation.name) == null) {
            substring = field.getName().substring(1);
        }
        return new ParameterInformation(substring, obj2, z, z2, z3 && !z, parameterSourceInformation != null ? parameterSourceInformation.inlineClass : null, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList extractFromIndyLambdaFields(ArrayList arrayList, Object obj, List list) {
        boolean z;
        int intValue;
        int intValue2;
        ArrayList arrayList2;
        Iterator it;
        int i;
        Object obj2;
        List sortedWith = CollectionsKt.sortedWith(arrayList, new ViewPager.AnonymousClass1(3));
        int i2 = 0;
        if (!list.isEmpty()) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((ParameterSourceInformation) it2.next()).name != null) {
                    }
                }
            }
            z = false;
            List take = !z ? CollectionsKt.take(sortedWith, list.size()) : sortedWith;
            int size = !z ? list.size() : sortedWith.size();
            Field field = (Field) CollectionsKt.getOrNull(size, sortedWith);
            Object obj3 = field == null ? field.get(obj) : null;
            Integer num = !(obj3 instanceof Integer) ? (Integer) obj3 : null;
            intValue = num == null ? num.intValue() : 0;
            Field field2 = (Field) CollectionsKt.getOrNull(size + 1, sortedWith);
            Object obj4 = field2 == null ? field2.get(obj) : null;
            Integer num2 = !(obj4 instanceof Integer) ? (Integer) obj4 : null;
            intValue2 = num2 == null ? num2.intValue() : 0;
            List list3 = take;
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            it = list3.iterator();
            while (true) {
                i = i2;
                if (it.hasNext()) {
                    return arrayList2;
                }
                Object next = it.next();
                i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                Field field3 = (Field) next;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    if (((ParameterSourceInformation) obj2).sortedIndex == i) {
                        break;
                    }
                }
                Object obj5 = obj;
                arrayList2.add(buildParameterInfo(field3, obj5, i, intValue2, intValue, (ParameterSourceInformation) obj2));
                obj = obj5;
            }
        }
        z = true;
        if (!z) {
        }
        if (!z) {
        }
        Field field4 = (Field) CollectionsKt.getOrNull(size, sortedWith);
        if (field4 == null) {
        }
        if (!(obj3 instanceof Integer)) {
        }
        if (num == null) {
        }
        Field field22 = (Field) CollectionsKt.getOrNull(size + 1, sortedWith);
        if (field22 == null) {
        }
        if (!(obj4 instanceof Integer)) {
        }
        if (num2 == null) {
        }
        List list32 = take;
        arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10));
        it = list32.iterator();
        while (true) {
            i = i2;
            if (it.hasNext()) {
            }
            Object obj52 = obj;
            arrayList2.add(buildParameterInfo(field3, obj52, i, intValue2, intValue, (ParameterSourceInformation) obj2));
            obj = obj52;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.compose.ui.tooling.data.ParameterInformation] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    public static final ArrayList extractFromLegacyFields(ArrayList arrayList, Object obj, List list) {
        String str;
        Field field;
        int i;
        int i2;
        ParameterSourceInformation parameterSourceInformation;
        Object obj2;
        String str2;
        Object obj3 = obj;
        Class<?> cls = obj3.getClass();
        Field accessibleField = accessibleField(cls, "$$default");
        String str3 = null;
        Object obj4 = accessibleField != null ? accessibleField.get(obj3) : null;
        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
        int i3 = 0;
        int intValue = num != null ? num.intValue() : 0;
        Field accessibleField2 = accessibleField(cls, "$$changed");
        Object obj5 = accessibleField2 != null ? accessibleField2.get(obj3) : null;
        Integer num2 = obj5 instanceof Integer ? (Integer) obj5 : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        List sortedWith = CollectionsKt.sortedWith(arrayList, new ViewPager.AnonymousClass1(4));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                ?? r17 = str3;
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw r17;
            }
            ParameterSourceInformation parameterSourceInformation2 = (ParameterSourceInformation) CollectionsKt.getOrNull(i3, list);
            if (parameterSourceInformation2 == null) {
                parameterSourceInformation2 = new ParameterSourceInformation(i3, str3, 6);
            }
            String str4 = parameterSourceInformation2.name;
            int i5 = parameterSourceInformation2.sortedIndex;
            if (i5 >= arrayList.size()) {
                i = intValue;
                String str5 = str3;
                str = str5;
                str2 = str5;
            } else {
                if (str4 != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = str3;
                            obj2 = str;
                            break;
                        }
                        obj2 = it.next();
                        str = str3;
                        if (str4.equals(extractFromLegacyFields$extractedName((Field) obj2))) {
                            break;
                        }
                        str3 = str;
                    }
                    field = (Field) obj2;
                } else {
                    str = str3;
                    field = str;
                }
                if (field == 0) {
                    field = (Field) sortedWith.get(i5);
                }
                if (str4 == null) {
                    parameterSourceInformation = new ParameterSourceInformation(i5, extractFromLegacyFields$extractedName(field), parameterSourceInformation2.inlineClass);
                    int i6 = i3;
                    i = intValue;
                    i2 = i6;
                } else {
                    int i7 = i3;
                    i = intValue;
                    i2 = i7;
                    parameterSourceInformation = parameterSourceInformation2;
                }
                str2 = buildParameterInfo(field, obj3, i2, i, intValue2, parameterSourceInformation);
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            obj3 = obj;
            intValue = i;
            i3 = i4;
            str3 = str;
        }
        return arrayList2;
    }

    public static final String extractFromLegacyFields$extractedName(Field field) {
        MatchGroup matchGroup;
        MatcherMatchResult find = legacyLambdaRegex.find(field.getName());
        MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = find != null ? find.groups : null;
        if (matcherMatchResult$groups$1 == null || (matchGroup = matcherMatchResult$groups$1.get(1)) == null) {
            matchGroup = matcherMatchResult$groups$1 != null ? matcherMatchResult$groups$1.get(2) : null;
        }
        if (matchGroup != null) {
            return matchGroup.value;
        }
        return null;
    }

    public static final ArrayList filterParameterFields(Field[] fieldArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Field field : fieldArr) {
            String name = field.getName();
            if ((z ? indyLambdaRegex.matches(name) : legacyLambdaRegex.matches(name)) && !StringsKt__StringsJVMKt.startsWith(name, "$jacoco", false)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x00f1, code lost:
    
        if (r12.getCoordinator$ui() != r1.getCoordinator$ui()) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.unit.IntRect, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.ui.tooling.data.SourceLocation] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Group getGroup(CompositionGroup compositionGroup, SourceInformationContext sourceInformationContext) {
        SourceInformationContext sourceInformationContext2;
        Object obj;
        Object obj2;
        Group group;
        List list;
        IntRect intRect;
        ?? r4;
        Object obj3;
        List list2;
        Object obj4;
        int i;
        IntRect intRect2;
        Object obj5;
        SourceInformation parseSourceInformation;
        Integer valueOf;
        Iterator it;
        int i2;
        int i3;
        Object key = compositionGroup.getKey();
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo == null || (parseSourceInformation = SourceInformationKt.parseSourceInformation(sourceInfo)) == null) {
            sourceInformationContext2 = null;
        } else {
            String str = parseSourceInformation.functionName;
            String str2 = parseSourceInformation.sourceFile;
            String str3 = str2 == null ? sourceInformationContext != null ? sourceInformationContext.sourceFile : null : str2;
            if (str2 != null) {
                String str4 = parseSourceInformation.packageHash;
                if (str4 != null) {
                    valueOf = StringsKt.toIntOrNull(36, str4);
                    int intValue = valueOf == null ? valueOf.intValue() : -1;
                    List list3 = parseSourceInformation.locations;
                    it = list3.iterator();
                    i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (((LocationSourceInformation) it.next()).isRepeatable) {
                            i3 = i2;
                            break;
                        }
                        i2++;
                    }
                    sourceInformationContext2 = new SourceInformationContext(str, str3, intValue, list3, i3, parseSourceInformation.parameters, parseSourceInformation.isCall, parseSourceInformation.isInline);
                }
                valueOf = null;
                if (valueOf == null) {
                }
                List list32 = parseSourceInformation.locations;
                it = list32.iterator();
                i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                    }
                    i2++;
                }
                sourceInformationContext2 = new SourceInformationContext(str, str3, intValue, list32, i3, parseSourceInformation.parameters, parseSourceInformation.isCall, parseSourceInformation.isInline);
            } else {
                if (sourceInformationContext != null) {
                    valueOf = Integer.valueOf(sourceInformationContext.packageHash);
                    if (valueOf == null) {
                    }
                    List list322 = parseSourceInformation.locations;
                    it = list322.iterator();
                    i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                        }
                        i2++;
                    }
                    sourceInformationContext2 = new SourceInformationContext(str, str3, intValue, list322, i3, parseSourceInformation.parameters, parseSourceInformation.isCall, parseSourceInformation.isInline);
                }
                valueOf = null;
                if (valueOf == null) {
                }
                List list3222 = parseSourceInformation.locations;
                it = list3222.iterator();
                i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                    }
                    i2++;
                }
                sourceInformationContext2 = new SourceInformationContext(str, str3, intValue, list3222, i3, parseSourceInformation.parameters, parseSourceInformation.isCall, parseSourceInformation.isInline);
            }
        }
        Object node = compositionGroup.getNode();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(compositionGroup.getData(), arrayList);
        Iterator it2 = compositionGroup.getCompositionGroups().iterator();
        while (it2.hasNext()) {
            arrayList2.add(getGroup((CompositionGroup) it2.next(), sourceInformationContext2));
        }
        boolean z = node instanceof LayoutNode;
        if (z) {
            NodeChain nodeChain = ((LayoutNode) node).nodes;
            TailModifierNode tailModifierNode = (TailModifierNode) nodeChain.tail;
            MutableVector mutableVector = (MutableVector) nodeChain.current;
            if (mutableVector == null) {
                list = EmptyList.INSTANCE;
                obj = key;
                obj2 = node;
                group = null;
            } else {
                MutableVector mutableVector2 = new MutableVector(0, new ModifierInfo[mutableVector.size]);
                Modifier.Node node2 = (Modifier.Node) nodeChain.head;
                int i4 = 0;
                while (node2 != null && node2 != tailModifierNode) {
                    NodeCoordinator coordinator$ui = node2.getCoordinator$ui();
                    if (coordinator$ui == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("getModifierInfo called on node with no coordinator");
                        return null;
                    }
                    OwnedLayer ownedLayer = coordinator$ui.layer;
                    OwnedLayer ownedLayer2 = ((InnerNodeCoordinator) nodeChain.innerCoordinator).layer;
                    Object obj6 = key;
                    Modifier.Node child$ui = node2.getChild$ui();
                    if (child$ui == tailModifierNode) {
                        obj5 = node;
                    } else {
                        obj5 = node;
                    }
                    ownedLayer2 = null;
                    if (ownedLayer == null) {
                        ownedLayer = ownedLayer2;
                    }
                    mutableVector2.add(new ModifierInfo((Modifier) mutableVector.content[i4], coordinator$ui, ownedLayer));
                    node2 = node2.getChild$ui();
                    i4++;
                    key = obj6;
                    node = obj5;
                }
                obj = key;
                obj2 = node;
                group = null;
                list = mutableVector2.asMutableList();
            }
        } else {
            obj = key;
            obj2 = node;
            group = null;
            list = EmptyList.INSTANCE;
        }
        if (z) {
            LayoutNode layoutNode = (LayoutNode) obj2;
            InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) layoutNode.nodes.innerCoordinator;
            if (layoutNode.isAttached() && innerNodeCoordinator.isAttached()) {
                long mo843localToWindowMKHz9U = innerNodeCoordinator.mo843localToWindowMKHz9U(0L);
                if ((((9223372034707292159L & mo843localToWindowMKHz9U) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                    long j = innerNodeCoordinator.measuredSize;
                    int roundToInt = MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (mo843localToWindowMKHz9U >> 32)));
                    int roundToInt2 = MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (mo843localToWindowMKHz9U & BodyPartID.bodyIdMax)));
                    intRect = new IntRect(roundToInt, roundToInt2, ((int) (j >> 32)) + roundToInt, ((int) (j & BodyPartID.bodyIdMax)) + roundToInt2);
                } else {
                    intRect2 = new IntRect(0, 0, layoutNode.getWidth(), layoutNode.getHeight());
                }
            } else {
                intRect2 = new IntRect(0, 0, layoutNode.getWidth(), layoutNode.getHeight());
            }
            intRect = intRect2;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            intRect = emptyBox;
            if (!isEmpty) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Group) it3.next()).box);
                }
                Iterator it4 = arrayList3.iterator();
                if (!it4.hasNext()) {
                    a$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
                    return group;
                }
                IntRect next = it4.next();
                while (it4.hasNext()) {
                    IntRect intRect3 = (IntRect) it4.next();
                    next = next;
                    if (!Intrinsics.areEqual(intRect3, intRect)) {
                        if (!Intrinsics.areEqual((Object) next, intRect)) {
                            intRect3 = new IntRect(Math.min(intRect3.left, next.left), Math.min(intRect3.top, next.top), Math.max(intRect3.right, next.right), Math.max(intRect3.bottom, next.bottom));
                        }
                        next = intRect3;
                    }
                }
                intRect = next;
            }
        }
        IntRect intRect4 = intRect;
        if (sourceInformationContext2 == null || !sourceInformationContext2.isCall || sourceInformationContext == null) {
            r4 = group;
        } else {
            int i5 = sourceInformationContext.nextLocation;
            List list4 = sourceInformationContext.locations;
            if (i5 >= list4.size() && (i = sourceInformationContext.repeatOffset) >= 0) {
                sourceInformationContext.nextLocation = i;
            }
            if (sourceInformationContext.nextLocation < list4.size()) {
                int i6 = sourceInformationContext.nextLocation;
                sourceInformationContext.nextLocation = i6 + 1;
                LocationSourceInformation locationSourceInformation = (LocationSourceInformation) list4.get(i6);
                obj4 = new SourceLocation(locationSourceInformation.lineNumber, locationSourceInformation.offset, locationSourceInformation.length, sourceInformationContext.packageHash, sourceInformationContext.sourceFile);
            } else {
                obj4 = group;
            }
            r4 = obj4;
        }
        if (obj2 != null) {
            return new NodeGroup(obj, obj2, intRect4, arrayList, list, arrayList2);
        }
        ?? r2 = sourceInformationContext2 != null ? sourceInformationContext2.name : group;
        ?? r8 = sourceInformationContext2 != null ? sourceInformationContext2.name : group;
        Object identity = (r8 == null || r8.length() == 0 || (intRect4.bottom - intRect4.top <= 0 && intRect4.right - intRect4.left <= 0)) ? group : compositionGroup.getIdentity();
        Iterator it5 = arrayList.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj3 = group;
                break;
            }
            obj3 = it5.next();
            if (obj3 != null && StringsKt__StringsJVMKt.endsWith(obj3.getClass().getName(), ".RecomposeScopeImpl", false)) {
                break;
            }
        }
        if (obj3 == null) {
            list2 = EmptyList.INSTANCE;
        } else {
            Field accessibleField = accessibleField(obj3.getClass(), "block");
            if (accessibleField != null) {
                Object obj7 = accessibleField.get(obj3);
                ?? r16 = group;
                if (obj7 != null) {
                    if (sourceInformationContext2 != null) {
                        r16 = sourceInformationContext2.parameters;
                    }
                    if (r16 == 0) {
                        r16 = EmptyList.INSTANCE;
                    }
                    List list5 = r16;
                    Class<?> cls = obj7.getClass();
                    try {
                        ArrayList filterParameterFields = filterParameterFields(cls.getDeclaredFields(), true);
                        list2 = !filterParameterFields.isEmpty() ? extractFromIndyLambdaFields(filterParameterFields, obj7, list5) : extractFromLegacyFields(filterParameterFields(cls.getDeclaredFields(), false), obj7, list5);
                    } catch (Exception unused) {
                        list2 = EmptyList.INSTANCE;
                    }
                }
            }
            list2 = EmptyList.INSTANCE;
        }
        return new CallGroup(obj, r2, intRect4, r4, identity, list2, arrayList, arrayList2);
    }
}
