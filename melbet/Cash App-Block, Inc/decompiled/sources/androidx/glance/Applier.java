package androidx.glance;

import androidx.compose.runtime.AbstractApplier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Applier extends AbstractApplier {
    public final ArrayList getCurrentChildren() {
        Emittable emittable = (Emittable) this.current;
        if (emittable instanceof EmittableWithChildren) {
            return ((EmittableWithChildren) emittable).children;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Current node cannot accept children");
        return null;
    }

    @Override // androidx.compose.runtime.Applier
    public final /* bridge */ /* synthetic */ void insertBottomUp(int i, Object obj) {
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int i, Object obj) {
        Emittable emittable = (Emittable) obj;
        Object obj2 = this.current;
        obj2.getClass();
        int i2 = ((EmittableWithChildren) obj2).maxDepth;
        if (i2 > 0) {
            if (emittable instanceof EmittableWithChildren) {
                ((EmittableWithChildren) emittable).maxDepth = i2 - 1;
            }
            getCurrentChildren().add(i, emittable);
            return;
        }
        Object obj3 = this.root;
        obj3.getClass();
        throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((EmittableWithChildren) obj3).maxDepth).toString());
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int i, int i2, int i3) {
        AbstractApplier.move(i, i2, i3, getCurrentChildren());
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
        Object obj = this.root;
        obj.getClass();
        ((EmittableWithChildren) obj).children.clear();
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int i, int i2) {
        ArrayList currentChildren = getCurrentChildren();
        if (i2 == 1) {
            currentChildren.remove(i);
        } else {
            currentChildren.subList(i, i2 + i).clear();
        }
    }
}
