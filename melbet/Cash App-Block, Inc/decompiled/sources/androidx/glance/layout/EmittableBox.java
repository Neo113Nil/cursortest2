package androidx.glance.layout;

import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes3.dex */
public final class EmittableBox extends EmittableWithChildren {
    public Alignment contentAlignment;
    public GlanceModifier modifier;

    public EmittableBox() {
        super(0, 3);
        this.modifier = GlanceModifier.Companion.$$INSTANCE;
        this.contentAlignment = Alignment.TopStart;
    }

    @Override // androidx.glance.Emittable
    public final Emittable copy() {
        EmittableBox emittableBox = new EmittableBox();
        emittableBox.modifier = this.modifier;
        emittableBox.contentAlignment = this.contentAlignment;
        ArrayList arrayList = this.children;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Emittable) it.next()).copy());
        }
        emittableBox.children.addAll(arrayList2);
        return emittableBox;
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
        return "EmittableBox(modifier=" + this.modifier + ", contentAlignment=" + this.contentAlignment + "children=[\n" + childrenToString() + "\n])";
    }
}
