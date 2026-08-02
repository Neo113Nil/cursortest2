package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class SemanticsModifierKt {
    public static final AtomicInteger lastIdentifier = new AtomicInteger(0);

    public static final void access$addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        LinesSequence properties = inspectorInfo.getProperties();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(semanticsConfiguration, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((SemanticsPropertyKey) entry.getKey()).name, entry.getValue());
        }
        properties.set(linkedHashMap, "properties");
    }

    public static final Modifier clearAndSetSemantics(Modifier modifier, Function1 function1) {
        return modifier.then(new ClearAndSetSemanticsElement(function1));
    }

    public static final Modifier semantics(Modifier modifier, boolean z, Function1 function1) {
        return modifier.then(new AppendedSemanticsElement(z, function1));
    }
}
