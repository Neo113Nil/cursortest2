package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ns0 {
    public static final java.lang.Object[] ZpBGe2uQfcn8 = new java.lang.Object[0];
    public static final defpackage.sn0 giKS3J6vZuNy = new defpackage.sn0(0);

    public static final void ZpBGe2uQfcn8(int i, java.util.List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new java.lang.IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void giKS3J6vZuNy(java.util.List list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new java.lang.IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        }
        if (i2 <= size) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
