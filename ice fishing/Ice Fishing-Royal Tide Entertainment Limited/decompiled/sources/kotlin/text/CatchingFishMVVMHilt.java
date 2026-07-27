package kotlin.text;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class CatchingFishMVVMHilt extends CatchingFishXMLLayoutGlide {
    public static void CatchingFishAndroidX(Object[] objArr, Comparator comparator, int i, int i2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(comparator, "comparator");
        Arrays.sort(objArr, i, i2, comparator);
    }

    public static void CatchingFishAnimation(Object[] objArr, int i, int i2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void CatchingFishAppCompat(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void CatchingFishDataStoreIntent(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        CatchingFishParcelable(i, 0, i2, iArr, iArr2);
    }

    public static Object[] CatchingFishJUnitRealm(Object[] objArr, int i, int i2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        CatchingFishXMLLayoutGlide.CatchingFishRoomDatabase(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void CatchingFishLayoutInflater(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void CatchingFishMVVMAppCompat(long[] jArr) {
        int length = jArr.length;
        CatchingFishFirebaseDagger.CatchingFishNavigation(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static int CatchingFishMoshiDaggerHilt(Object[] objArr, Object obj) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean CatchingFishMotionLayout(Object[] objArr, Object obj) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        return CatchingFishMoshiDaggerHilt(objArr, obj) >= 0;
    }

    public static void CatchingFishParcelable(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(iArr, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void CatchingFishRecyclerView(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(jArr, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void CatchingFishStateFlow(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        CatchingFishAppCompat(objArr, objArr2, 0, i, i2);
    }

    public static int CatchingFishStripeAPI(long[] jArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(jArr, "<this>");
        return jArr.length - 1;
    }
}
