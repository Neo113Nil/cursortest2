package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public final class ShuffleOrder$DefaultShuffleOrder {
    public final int[] indexInShuffled;
    public final Random random;
    public final int[] shuffled;

    public ShuffleOrder$DefaultShuffleOrder(int[] iArr, Random random) {
        this.shuffled = iArr;
        this.random = random;
        this.indexInShuffled = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.indexInShuffled[iArr[i]] = i;
        }
    }

    public final ShuffleOrder$DefaultShuffleOrder cloneAndInsert(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            iArr = this.shuffled;
            random = this.random;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int nextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[nextInt];
            iArr3[nextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 >= i || i5 != iArr2[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr3[i4];
                i4++;
            }
        }
        return new ShuffleOrder$DefaultShuffleOrder(iArr4, new Random(random.nextLong()));
    }

    public ShuffleOrder$DefaultShuffleOrder() {
        this(new Random());
    }

    public ShuffleOrder$DefaultShuffleOrder(Random random) {
        this(new int[0], random);
    }
}
