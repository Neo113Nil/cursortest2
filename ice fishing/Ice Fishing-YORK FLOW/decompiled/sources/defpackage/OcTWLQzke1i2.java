package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class OcTWLQzke1i2 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.util.Collection oh71FJcDz6S2;

    public /* synthetic */ OcTWLQzke1i2(int i, java.util.Collection collection) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = collection;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        boolean contains;
        int i = this.WDYagTQQm9ns;
        java.util.Collection<?> collection = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((java.util.List) obj).retainAll(collection);
                break;
        }
        return java.lang.Boolean.valueOf(contains);
    }
}
