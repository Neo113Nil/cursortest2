package androidx.glance.appwidget;

import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.action.Action;
import androidx.glance.action.ActionModifier;
import androidx.glance.action.LambdaAction;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.unit.Dimension;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class NormalizeCompositionTreeKt {
    public static final GlanceModifier collect(ArrayList arrayList) {
        GlanceModifier then;
        Iterator it = arrayList.iterator();
        GlanceModifier.Companion companion = GlanceModifier.Companion.$$INSTANCE;
        while (it.hasNext()) {
            GlanceModifier glanceModifier = (GlanceModifier) it.next();
            if (glanceModifier != null && (then = companion.then(glanceModifier)) != null) {
                companion = then;
            }
        }
        return companion;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ShareText.deepLinkSpecs;
    }

    public static final void normalizeCompositionTree(RemoteViewsRoot remoteViewsRoot) {
        ArrayList arrayList = remoteViewsRoot.children;
        if (!arrayList.isEmpty()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((Emittable) it.next()) instanceof EmittableSizeBox)) {
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Emittable emittable = (Emittable) it2.next();
                emittable.getClass();
                ArrayList arrayList2 = ((EmittableSizeBox) emittable).children;
                if (arrayList2.size() != 1) {
                    EmittableBox emittableBox = new EmittableBox();
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, emittableBox.children);
                    arrayList2.clear();
                    arrayList2.add(emittableBox);
                }
            }
            normalizeSizes(remoteViewsRoot);
            transformTree(remoteViewsRoot);
        }
        if (arrayList.size() != 1) {
            EmittableBox emittableBox2 = new EmittableBox();
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, emittableBox2.children);
            arrayList.clear();
            arrayList.add(emittableBox2);
        }
        normalizeSizes(remoteViewsRoot);
        transformTree(remoteViewsRoot);
    }

    public static final void normalizeSizes(EmittableWithChildren emittableWithChildren) {
        ArrayList arrayList = emittableWithChildren.children;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Emittable emittable = (Emittable) it.next();
            if (emittable instanceof EmittableWithChildren) {
                normalizeSizes((EmittableWithChildren) emittable);
            }
        }
        HeightModifier heightModifier = (HeightModifier) emittableWithChildren.getModifier().foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$12);
        Dimension dimension = Dimension.Wrap.INSTANCE;
        boolean z = (heightModifier != null ? heightModifier.height : dimension) instanceof Dimension.Wrap;
        Dimension dimension2 = Dimension.Fill.INSTANCE;
        if (z && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                HeightModifier heightModifier2 = (HeightModifier) ((Emittable) it2.next()).getModifier().foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$14);
                if ((heightModifier2 != null ? heightModifier2.height : null) instanceof Dimension.Fill) {
                    emittableWithChildren.setModifier(emittableWithChildren.getModifier().then(new HeightModifier(dimension2)));
                    break;
                }
            }
        }
        if (((WidthModifier) emittableWithChildren.getModifier().foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$13)) != null) {
            dimension = dimension2;
        }
        if (dimension instanceof Dimension.Wrap) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if ((((WidthModifier) ((Emittable) it3.next()).getModifier().foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$15)) != null ? dimension2 : null) != null) {
                        emittableWithChildren.setModifier(emittableWithChildren.getModifier().then(new WidthModifier()));
                        return;
                    }
                }
            }
        }
    }

    public static final void transformTree(EmittableWithChildren emittableWithChildren) {
        RadioButtonKt$isSelectableGroup$1 radioButtonKt$isSelectableGroup$1 = RadioButtonKt$isSelectableGroup$1.INSTANCE$3;
        Iterator it = emittableWithChildren.children.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Emittable emittable = (Emittable) radioButtonKt$isSelectableGroup$1.invoke((Emittable) next);
            emittableWithChildren.children.set(i, emittable);
            if (emittable instanceof EmittableWithChildren) {
                transformTree((EmittableWithChildren) emittable);
            }
            i = i2;
        }
    }

    public static final LinkedHashMap updateLambdaActionKeys(EmittableWithChildren emittableWithChildren) {
        ArrayList arrayList = emittableWithChildren.children;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Emittable emittable = (Emittable) next;
            GlanceModifier modifier = emittable.getModifier();
            Pair pair = modifier.any(RadioButtonKt$isSelectableGroup$1.INSTANCE$1) ? (Pair) modifier.foldIn(new Pair(null, GlanceModifier.Companion.$$INSTANCE), SizeBoxKt$SizeBox$1$2$1.INSTANCE$10) : new Pair(null, modifier);
            ActionModifier actionModifier = (ActionModifier) pair.first;
            GlanceModifier glanceModifier = (GlanceModifier) pair.second;
            Action action = actionModifier != null ? actionModifier.action : null;
            Pair pair2 = action instanceof LambdaAction ? new Pair(action, glanceModifier) : new Pair(null, glanceModifier);
            if (emittable instanceof EmittableWithChildren) {
                for (Map.Entry entry : updateLambdaActionKeys((EmittableWithChildren) emittable).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str, obj);
                    }
                    ((List) obj).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }
}
