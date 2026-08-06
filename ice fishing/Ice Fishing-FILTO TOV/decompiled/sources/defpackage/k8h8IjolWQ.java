package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class k8h8IjolWQ implements hv {
    public final /* synthetic */ Collection EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ k8h8IjolWQ(int i, Collection collection) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = collection;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        boolean contains;
        int i = this.OOA6hdeuvCS;
        Collection<?> collection = this.EljAMC1QTz;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
