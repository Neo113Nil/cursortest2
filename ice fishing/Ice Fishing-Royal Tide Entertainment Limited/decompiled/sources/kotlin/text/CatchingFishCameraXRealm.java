package kotlin.text;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class CatchingFishCameraXRealm implements Iterable, Serializable {
    public static final CatchingFishFluxToolbar CatchingFishViewModelScope;
    public static final CatchingFishCameraXRealm CatchingFishWorkManager = new CatchingFishCameraXRealm(CatchingFishFirebaseBundle.CatchingFishSnackbar);
    public final byte[] CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor = 0;

    static {
        CatchingFishViewModelScope = CatchingFishStripeAPI.CatchingFishParcelableFAB() ? new CatchingFishMoshiFluxMoshi(15) : new CatchingFishGradleMVVM(15);
    }

    public CatchingFishCameraXRealm(byte[] bArr) {
        bArr.getClass();
        this.CatchingFishDaggerWebsocket = bArr;
    }

    public static CatchingFishCameraXRealm CatchingFishCoroutine(byte[] bArr, int i, int i2) {
        CatchingFishSnackbar(i, i + i2, bArr.length);
        return new CatchingFishCameraXRealm(CatchingFishViewModelScope.CatchingFishParcelableFAB(bArr, i, i2));
    }

    public static int CatchingFishSnackbar(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i >= 0) {
            if (i2 < i) {
                throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i2, i3, "End index: ", " >= "));
        }
        throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
    }

    public void CatchingFishDaggerWebsocket(byte[] bArr, int i) {
        System.arraycopy(this.CatchingFishDaggerWebsocket, 0, bArr, 0, i);
    }

    public byte CatchingFishParcelableFAB(int i) {
        return this.CatchingFishDaggerWebsocket[i];
    }

    public byte CatchingFishViewModelScope(int i) {
        return this.CatchingFishDaggerWebsocket[i];
    }

    public int CatchingFishWorkManager() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishCameraXRealm) || size() != ((CatchingFishCameraXRealm) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof CatchingFishCameraXRealm)) {
            return obj.equals(this);
        }
        CatchingFishCameraXRealm catchingFishCameraXRealm = (CatchingFishCameraXRealm) obj;
        int i = this.CatchingFishReduxKtor;
        int i2 = catchingFishCameraXRealm.CatchingFishReduxKtor;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > catchingFishCameraXRealm.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > catchingFishCameraXRealm.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + catchingFishCameraXRealm.size());
        }
        byte[] bArr = catchingFishCameraXRealm.CatchingFishDaggerWebsocket;
        int CatchingFishWorkManager2 = CatchingFishWorkManager() + size;
        int CatchingFishWorkManager3 = CatchingFishWorkManager();
        int CatchingFishWorkManager4 = catchingFishCameraXRealm.CatchingFishWorkManager();
        while (CatchingFishWorkManager3 < CatchingFishWorkManager2) {
            if (this.CatchingFishDaggerWebsocket[CatchingFishWorkManager3] != bArr[CatchingFishWorkManager4]) {
                return false;
            }
            CatchingFishWorkManager3++;
            CatchingFishWorkManager4++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.CatchingFishReduxKtor;
        if (i != 0) {
            return i;
        }
        int size = size();
        int CatchingFishWorkManager2 = CatchingFishWorkManager();
        int i2 = size;
        for (int i3 = CatchingFishWorkManager2; i3 < CatchingFishWorkManager2 + size; i3++) {
            i2 = (i2 * 31) + this.CatchingFishDaggerWebsocket[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.CatchingFishReduxKtor = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishAppCompatFlux(this);
    }

    public int size() {
        return this.CatchingFishDaggerWebsocket.length;
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = CatchingFishKtorViewModel.CatchingFishCloudMessaging(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int CatchingFishSnackbar = CatchingFishSnackbar(0, 47, size());
            sb2.append(CatchingFishKtorViewModel.CatchingFishCloudMessaging(CatchingFishSnackbar == 0 ? CatchingFishWorkManager : new CatchingFishFluxStateFlow(this.CatchingFishDaggerWebsocket, CatchingFishWorkManager(), CatchingFishSnackbar)));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb3, sb, "\">");
    }
}
