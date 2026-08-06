package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class io0 {
    private static final void JhCgjQRTAOCT(int i) {
        throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
    }

    private static final void WDYagTQQm9ns(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    public static final void ZpBGe2uQfcn8(int i, java.util.List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            fWTAfUmVKrZq(i, size);
        }
    }

    private static final void fWTAfUmVKrZq(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    public static final void giKS3J6vZuNy(java.util.List list, int i, int i2) {
        if (i > i2) {
            oh71FJcDz6S2(i, i2);
        }
        if (i < 0) {
            JhCgjQRTAOCT(i);
        }
        if (i2 > list.size()) {
            WDYagTQQm9ns(i2, list.size());
        }
    }

    private static final void oh71FJcDz6S2(int i, int i2) {
        throw new java.lang.IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }
}
