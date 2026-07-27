package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class CatchingFishMVPFAB {
    public static final CatchingFishMVPFAB CatchingFishDaggerWebsocket;
    public static final CatchingFishMVPFAB CatchingFishWorkManager;
    public final String[] CatchingFishCoroutine;
    public final boolean CatchingFishParcelableFAB;
    public final String[] CatchingFishReduxKtor;
    public final boolean CatchingFishSnackbar;

    static {
        CatchingFishViewModelMoshi catchingFishViewModelMoshi = CatchingFishViewModelMoshi.CatchingFishRoomDatabase;
        CatchingFishViewModelMoshi catchingFishViewModelMoshi2 = CatchingFishViewModelMoshi.CatchingFishNavigation;
        CatchingFishViewModelMoshi catchingFishViewModelMoshi3 = CatchingFishViewModelMoshi.CatchingFish;
        CatchingFishViewModelMoshi catchingFishViewModelMoshi4 = CatchingFishViewModelMoshi.CatchingFishCloudMessaging;
        CatchingFishViewModelMoshi catchingFishViewModelMoshi5 = CatchingFishViewModelMoshi.CatchingFishOkHttp;
        CatchingFishViewModelMoshi catchingFishViewModelMoshi6 = CatchingFishViewModelMoshi.CatchingFishEspressoTesting;
        CatchingFishViewModelMoshi catchingFishViewModelMoshi7 = CatchingFishViewModelMoshi.CatchingFishUnitTesting;
        CatchingFishViewModelMoshi catchingFishViewModelMoshi8 = CatchingFishViewModelMoshi.CatchingFishStateLiveData;
        CatchingFishViewModelMoshi catchingFishViewModelMoshi9 = CatchingFishViewModelMoshi.CatchingFishAnimationMockk;
        CatchingFishViewModelMoshi[] catchingFishViewModelMoshiArr = {catchingFishViewModelMoshi, catchingFishViewModelMoshi2, catchingFishViewModelMoshi3, catchingFishViewModelMoshi4, catchingFishViewModelMoshi5, catchingFishViewModelMoshi6, catchingFishViewModelMoshi7, catchingFishViewModelMoshi8, catchingFishViewModelMoshi9};
        CatchingFishViewModelMoshi[] catchingFishViewModelMoshiArr2 = {catchingFishViewModelMoshi, catchingFishViewModelMoshi2, catchingFishViewModelMoshi3, catchingFishViewModelMoshi4, catchingFishViewModelMoshi5, catchingFishViewModelMoshi6, catchingFishViewModelMoshi7, catchingFishViewModelMoshi8, catchingFishViewModelMoshi9, CatchingFishViewModelMoshi.CatchingFishLayout, CatchingFishViewModelMoshi.CatchingFishFragmentHandler, CatchingFishViewModelMoshi.CatchingFishViewModelScope, CatchingFishViewModelMoshi.CatchingFishViewModelFAB, CatchingFishViewModelMoshi.CatchingFishDaggerWebsocket, CatchingFishViewModelMoshi.CatchingFishWorkManager, CatchingFishViewModelMoshi.CatchingFishReduxKtor};
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = new CatchingFishFABDaggerHilt(true);
        catchingFishFABDaggerHilt.CatchingFishSnackbar(catchingFishViewModelMoshiArr);
        CatchingFishGradleGradle catchingFishGradleGradle = CatchingFishGradleGradle.TLS_1_3;
        CatchingFishGradleGradle catchingFishGradleGradle2 = CatchingFishGradleGradle.TLS_1_2;
        catchingFishFABDaggerHilt.CatchingFishReduxKtor(catchingFishGradleGradle, catchingFishGradleGradle2);
        if (!catchingFishFABDaggerHilt.CatchingFishParcelableFAB) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        catchingFishFABDaggerHilt.CatchingFishSnackbar = true;
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt2 = new CatchingFishFABDaggerHilt(true);
        catchingFishFABDaggerHilt2.CatchingFishSnackbar(catchingFishViewModelMoshiArr2);
        catchingFishFABDaggerHilt2.CatchingFishReduxKtor(catchingFishGradleGradle, catchingFishGradleGradle2);
        if (!catchingFishFABDaggerHilt2.CatchingFishParcelableFAB) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        catchingFishFABDaggerHilt2.CatchingFishSnackbar = true;
        CatchingFishDaggerWebsocket = new CatchingFishMVPFAB(catchingFishFABDaggerHilt2);
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt3 = new CatchingFishFABDaggerHilt(true);
        catchingFishFABDaggerHilt3.CatchingFishSnackbar(catchingFishViewModelMoshiArr2);
        catchingFishFABDaggerHilt3.CatchingFishReduxKtor(catchingFishGradleGradle, catchingFishGradleGradle2, CatchingFishGradleGradle.TLS_1_1, CatchingFishGradleGradle.TLS_1_0);
        if (!catchingFishFABDaggerHilt3.CatchingFishParcelableFAB) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        catchingFishFABDaggerHilt3.CatchingFishSnackbar = true;
        CatchingFishWorkManager = new CatchingFishMVPFAB(new CatchingFishFABDaggerHilt(false));
    }

    public CatchingFishMVPFAB(CatchingFishFABDaggerHilt catchingFishFABDaggerHilt) {
        this.CatchingFishParcelableFAB = catchingFishFABDaggerHilt.CatchingFishParcelableFAB;
        this.CatchingFishCoroutine = (String[]) catchingFishFABDaggerHilt.CatchingFishCoroutine;
        this.CatchingFishReduxKtor = (String[]) catchingFishFABDaggerHilt.CatchingFishReduxKtor;
        this.CatchingFishSnackbar = catchingFishFABDaggerHilt.CatchingFishSnackbar;
    }

    public final boolean CatchingFishParcelableFAB(SSLSocket sSLSocket) {
        if (!this.CatchingFishParcelableFAB) {
            return false;
        }
        String[] strArr = this.CatchingFishReduxKtor;
        if (strArr != null && !CatchingFishEspressoDagger.CatchingFishEspressoTesting(CatchingFishEspressoDagger.CatchingFishWorkManager, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.CatchingFishCoroutine;
        return strArr2 == null || CatchingFishEspressoDagger.CatchingFishEspressoTesting(CatchingFishViewModelMoshi.CatchingFishSnackbar, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishMVPFAB)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        CatchingFishMVPFAB catchingFishMVPFAB = (CatchingFishMVPFAB) obj;
        boolean z = catchingFishMVPFAB.CatchingFishParcelableFAB;
        boolean z2 = this.CatchingFishParcelableFAB;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.CatchingFishCoroutine, catchingFishMVPFAB.CatchingFishCoroutine) && Arrays.equals(this.CatchingFishReduxKtor, catchingFishMVPFAB.CatchingFishReduxKtor) && this.CatchingFishSnackbar == catchingFishMVPFAB.CatchingFishSnackbar;
        }
        return true;
    }

    public final int hashCode() {
        if (this.CatchingFishParcelableFAB) {
            return ((((527 + Arrays.hashCode(this.CatchingFishCoroutine)) * 31) + Arrays.hashCode(this.CatchingFishReduxKtor)) * 31) + (!this.CatchingFishSnackbar ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        if (!this.CatchingFishParcelableFAB) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        List list2 = null;
        String[] strArr = this.CatchingFishCoroutine;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(CatchingFishViewModelMoshi.CatchingFishParcelableFAB(str));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        sb.append(Objects.toString(list, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.CatchingFishReduxKtor;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(CatchingFishGradleGradle.CatchingFishParcelableFAB(str2));
            }
            list2 = Collections.unmodifiableList(arrayList2);
        }
        sb.append(Objects.toString(list2, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(")");
        return sb.toString();
    }
}
