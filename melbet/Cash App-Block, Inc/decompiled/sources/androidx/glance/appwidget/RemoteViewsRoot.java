package androidx.glance.appwidget;

import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes3.dex */
public final class RemoteViewsRoot extends EmittableWithChildren {
    public final int maxDepth;
    public GlanceModifier modifier;

    public RemoteViewsRoot(int i) {
        super(i, 2);
        this.maxDepth = i;
        this.modifier = GlanceModifier.Companion.$$INSTANCE;
    }

    @Override // androidx.glance.Emittable
    public final Emittable copy() {
        RemoteViewsRoot remoteViewsRoot = new RemoteViewsRoot(this.maxDepth);
        remoteViewsRoot.modifier = this.modifier;
        ArrayList arrayList = this.children;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Emittable) it.next()).copy());
        }
        remoteViewsRoot.children.addAll(arrayList2);
        return remoteViewsRoot;
    }

    @Override // androidx.glance.Emittable
    public final GlanceModifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.glance.Emittable
    public final void setModifier(GlanceModifier glanceModifier) {
        this.modifier = glanceModifier;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.modifier + ", children=[\n" + childrenToString() + "\n])";
    }
}
