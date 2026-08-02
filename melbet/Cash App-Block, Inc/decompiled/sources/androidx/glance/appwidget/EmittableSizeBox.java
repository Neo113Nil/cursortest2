package androidx.glance.appwidget;

import androidx.compose.ui.unit.DpSize;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.layout.SizeModifiersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes3.dex */
public final class EmittableSizeBox extends EmittableWithChildren {
    public long size;
    public SizeMode sizeMode;

    public EmittableSizeBox() {
        super(0, 3);
        this.size = 9205357640488583168L;
        this.sizeMode = SizeMode.Single.INSTANCE;
    }

    @Override // androidx.glance.Emittable
    public final Emittable copy() {
        EmittableSizeBox emittableSizeBox = new EmittableSizeBox();
        emittableSizeBox.size = this.size;
        emittableSizeBox.sizeMode = this.sizeMode;
        ArrayList arrayList = this.children;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Emittable) it.next()).copy());
        }
        emittableSizeBox.children.addAll(arrayList2);
        return emittableSizeBox;
    }

    @Override // androidx.glance.Emittable
    public final GlanceModifier getModifier() {
        GlanceModifier modifier;
        Emittable emittable = (Emittable) CollectionsKt.singleOrNull((List) this.children);
        return (emittable == null || (modifier = emittable.getModifier()) == null) ? SizeModifiersKt.fillMaxSize(GlanceModifier.Companion.$$INSTANCE) : modifier;
    }

    @Override // androidx.glance.Emittable
    public final void setModifier(GlanceModifier glanceModifier) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) DpSize.m1045toStringimpl(this.size)) + ", sizeMode=" + this.sizeMode + ", children=[\n" + childrenToString() + "\n])";
    }
}
