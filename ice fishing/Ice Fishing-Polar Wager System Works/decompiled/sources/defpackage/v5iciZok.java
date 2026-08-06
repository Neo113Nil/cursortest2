package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class v5iciZok implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.util.Collection xiZrDbcSW0;

    public /* synthetic */ v5iciZok(int i, java.util.Collection collection) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = collection;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        boolean contains;
        int i = this.adDC3e2L;
        java.util.Collection<?> collection = this.xiZrDbcSW0;
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
