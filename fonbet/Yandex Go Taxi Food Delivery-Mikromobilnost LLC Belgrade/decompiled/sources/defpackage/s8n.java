package defpackage;

import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.j;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class s8n extends b3u {
    public static final /* synthetic */ int c = 0;
    public final q8n a = q8n.e;
    public final FeatureTypeInternal b = FeatureTypeInternal.DYNAMIC_RANGE;

    @Override // defpackage.b3u
    public final FeatureTypeInternal a() {
        return this.b;
    }

    @Override // defpackage.b3u
    public final boolean b(ar7 ar7Var, pbj pbjVar) {
        Set b = ar7Var.b();
        b.toString();
        toString();
        sgb1.g(3, "DynamicRangeFeature");
        q8n q8nVar = this.a;
        if (!b.contains(q8nVar)) {
            return false;
        }
        for (j jVar : (List) pbjVar.A) {
            Set l = jVar.l(ar7Var);
            Objects.toString(l);
            toString();
            jVar.toString();
            sgb1.g(3, "DynamicRangeFeature");
            if (l != null && !l.contains(q8nVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.a + ')';
    }
}
