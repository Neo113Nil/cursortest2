package kotlin.text;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class CatchingFishMockkKtorGlide {
    public static final int CatchingFishCoroutine(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final int CatchingFishDaggerWebsocket(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((CatchingFishMockkPicasso) arrayList.get(i4)).CatchingFishParcelableFAB;
            if (i5 < 0) {
                i5 += i2;
            }
            int CatchingFishJetpackCompose = CatchingFishFirebaseDagger.CatchingFishJetpackCompose(i5, i);
            if (CatchingFishJetpackCompose < 0) {
                i3 = i4 + 1;
            } else {
                if (CatchingFishJetpackCompose <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int CatchingFishParcelableFAB(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final void CatchingFishReduxKtor(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int CatchingFishSnackbar(ArrayList arrayList, int i, int i2) {
        int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(arrayList, i, i2);
        return CatchingFishDaggerWebsocket >= 0 ? CatchingFishDaggerWebsocket : -(CatchingFishDaggerWebsocket + 1);
    }

    public static final void CatchingFishWorkManager() {
        throw new ConcurrentModificationException();
    }
}
