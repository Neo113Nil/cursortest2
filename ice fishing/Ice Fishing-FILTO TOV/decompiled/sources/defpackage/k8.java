package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class k8 extends WdrkLMV3xh {
    public final /* synthetic */ int AvO7iQsrTN = 1;
    public final Object encWxUiV2;

    public k8(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.encWxUiV2 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.AvO7iQsrTN;
        Object obj = this.encWxUiV2;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    int i2 = this.OOA6hdeuvCS;
                    this.OOA6hdeuvCS = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    this.OOA6hdeuvCS++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.AvO7iQsrTN;
        Object obj = this.encWxUiV2;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    int i2 = this.OOA6hdeuvCS - 1;
                    this.OOA6hdeuvCS = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    o4.E7jCp8Ls();
                    break;
                } else {
                    this.OOA6hdeuvCS--;
                    break;
                }
        }
        return null;
    }

    public k8(int i, Object obj) {
        super(i, 1);
        this.encWxUiV2 = obj;
    }
}
