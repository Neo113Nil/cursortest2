package kotlin.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class CatchingFishFirebaseFABGson {
    public static final ThreadLocal CatchingFishReduxKtor = new ThreadLocal();
    public volatile int CatchingFishCoroutine = 0;
    public final int CatchingFishParcelableFAB;
    public final CatchingFishFluxFluxBundle CatchingFishSnackbar;

    public CatchingFishFirebaseFABGson(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, int i) {
        this.CatchingFishSnackbar = catchingFishFluxFluxBundle;
        this.CatchingFishParcelableFAB = i;
    }

    public final int CatchingFishParcelableFAB(int i) {
        CatchingFishManifestGson CatchingFishSnackbar = CatchingFishSnackbar();
        int CatchingFishParcelableFAB = CatchingFishSnackbar.CatchingFishParcelableFAB(16);
        if (CatchingFishParcelableFAB == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) CatchingFishSnackbar.CatchingFishViewModelScope;
        int i2 = CatchingFishParcelableFAB + CatchingFishSnackbar.CatchingFishReduxKtor;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final CatchingFishManifestGson CatchingFishSnackbar() {
        ThreadLocal threadLocal = CatchingFishReduxKtor;
        CatchingFishManifestGson catchingFishManifestGson = (CatchingFishManifestGson) threadLocal.get();
        if (catchingFishManifestGson == null) {
            catchingFishManifestGson = new CatchingFishManifestGson();
            threadLocal.set(catchingFishManifestGson);
        }
        CatchingFishBundleRoom catchingFishBundleRoom = (CatchingFishBundleRoom) this.CatchingFishSnackbar.CatchingFishReduxKtor;
        int CatchingFishParcelableFAB = catchingFishBundleRoom.CatchingFishParcelableFAB(6);
        if (CatchingFishParcelableFAB != 0) {
            int i = CatchingFishParcelableFAB + catchingFishBundleRoom.CatchingFishReduxKtor;
            int i2 = (this.CatchingFishParcelableFAB * 4) + ((ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) catchingFishBundleRoom.CatchingFishViewModelScope;
            catchingFishManifestGson.CatchingFishViewModelScope = byteBuffer;
            if (byteBuffer != null) {
                catchingFishManifestGson.CatchingFishReduxKtor = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                catchingFishManifestGson.CatchingFishDaggerWebsocket = i4;
                catchingFishManifestGson.CatchingFishWorkManager = ((ByteBuffer) catchingFishManifestGson.CatchingFishViewModelScope).getShort(i4);
                return catchingFishManifestGson;
            }
            catchingFishManifestGson.CatchingFishReduxKtor = 0;
            catchingFishManifestGson.CatchingFishDaggerWebsocket = 0;
            catchingFishManifestGson.CatchingFishWorkManager = 0;
        }
        return catchingFishManifestGson;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        CatchingFishManifestGson CatchingFishSnackbar = CatchingFishSnackbar();
        int CatchingFishParcelableFAB = CatchingFishSnackbar.CatchingFishParcelableFAB(4);
        sb.append(Integer.toHexString(CatchingFishParcelableFAB != 0 ? ((ByteBuffer) CatchingFishSnackbar.CatchingFishViewModelScope).getInt(CatchingFishParcelableFAB + CatchingFishSnackbar.CatchingFishReduxKtor) : 0));
        sb.append(", codepoints:");
        CatchingFishManifestGson CatchingFishSnackbar2 = CatchingFishSnackbar();
        int CatchingFishParcelableFAB2 = CatchingFishSnackbar2.CatchingFishParcelableFAB(16);
        if (CatchingFishParcelableFAB2 != 0) {
            int i2 = CatchingFishParcelableFAB2 + CatchingFishSnackbar2.CatchingFishReduxKtor;
            i = ((ByteBuffer) CatchingFishSnackbar2.CatchingFishViewModelScope).getInt(((ByteBuffer) CatchingFishSnackbar2.CatchingFishViewModelScope).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(CatchingFishParcelableFAB(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
