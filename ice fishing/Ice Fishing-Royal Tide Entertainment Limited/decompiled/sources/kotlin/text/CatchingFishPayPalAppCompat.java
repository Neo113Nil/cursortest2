package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishPayPalAppCompat {
    public int CatchingFishCoroutine;
    public final CatchingFishLayoutGsonRoom CatchingFishDaggerWebsocket;
    public final ArrayList CatchingFishParcelableFAB;
    public final ArrayList CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;
    public final CatchingFishKtorHiltIntent CatchingFishWorkManager;

    public CatchingFishPayPalAppCompat(int i, ArrayList arrayList) {
        this.CatchingFishParcelableFAB = arrayList;
        this.CatchingFishSnackbar = i;
        if (i < 0) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("Invalid start index");
        }
        this.CatchingFishReduxKtor = new ArrayList();
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = new CatchingFishLayoutGsonRoom();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            CatchingFishAdMobIntent catchingFishAdMobIntent = (CatchingFishAdMobIntent) this.CatchingFishParcelableFAB.get(i3);
            int i4 = catchingFishAdMobIntent.CatchingFishCoroutine;
            int i5 = catchingFishAdMobIntent.CatchingFishReduxKtor;
            catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(i4, new CatchingFishViewModelAdMob(i3, i2, i5));
            i2 += i5;
        }
        this.CatchingFishDaggerWebsocket = catchingFishLayoutGsonRoom;
        this.CatchingFishWorkManager = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishUnitTesting(1, this));
    }

    public final boolean CatchingFishParcelableFAB(int i, int i2) {
        int i3;
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = this.CatchingFishDaggerWebsocket;
        CatchingFishViewModelAdMob catchingFishViewModelAdMob = (CatchingFishViewModelAdMob) catchingFishLayoutGsonRoom.CatchingFishSnackbar(i);
        if (catchingFishViewModelAdMob == null) {
            return false;
        }
        int i4 = catchingFishViewModelAdMob.CatchingFishSnackbar;
        int i5 = i2 - catchingFishViewModelAdMob.CatchingFishCoroutine;
        catchingFishViewModelAdMob.CatchingFishCoroutine = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = catchingFishLayoutGsonRoom.CatchingFishCoroutine;
        long[] jArr = catchingFishLayoutGsonRoom.CatchingFishParcelableFAB;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        CatchingFishViewModelAdMob catchingFishViewModelAdMob2 = (CatchingFishViewModelAdMob) objArr[(i6 << 3) + i8];
                        if (catchingFishViewModelAdMob2.CatchingFishSnackbar >= i4 && !catchingFishViewModelAdMob2.equals(catchingFishViewModelAdMob) && (i3 = catchingFishViewModelAdMob2.CatchingFishSnackbar + i5) >= 0) {
                            catchingFishViewModelAdMob2.CatchingFishSnackbar = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
