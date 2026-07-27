package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public abstract class CatchingFishBundleMockk {
    private static final void CatchingFishCoroutine(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    private static final void CatchingFishDaggerWebsocket(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    public static final void CatchingFishParcelableFAB(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            CatchingFishCoroutine(i, size);
        }
    }

    private static final void CatchingFishReduxKtor(int i) {
        throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
    }

    public static final void CatchingFishSnackbar(List list, int i, int i2) {
        if (i > i2) {
            CatchingFishWorkManager(i, i2);
        }
        if (i < 0) {
            CatchingFishReduxKtor(i);
        }
        if (i2 > list.size()) {
            CatchingFishDaggerWebsocket(i2, list.size());
        }
    }

    private static final void CatchingFishWorkManager(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }
}
