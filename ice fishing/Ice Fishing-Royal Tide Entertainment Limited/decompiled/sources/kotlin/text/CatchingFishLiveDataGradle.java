package kotlin.text;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataGradle {
    public boolean CatchingFishCoroutine;
    public final List CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public int CatchingFishSnackbar = 0;

    public CatchingFishLiveDataGradle(List list) {
        this.CatchingFishParcelableFAB = list;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.String[]] */
    public final CatchingFishMVPFAB CatchingFishParcelableFAB(SSLSocket sSLSocket) {
        boolean z;
        CatchingFishMVPFAB catchingFishMVPFAB;
        int i = this.CatchingFishSnackbar;
        List list = this.CatchingFishParcelableFAB;
        int size = list.size();
        while (true) {
            z = true;
            if (i >= size) {
                catchingFishMVPFAB = null;
                break;
            }
            catchingFishMVPFAB = (CatchingFishMVPFAB) list.get(i);
            if (catchingFishMVPFAB.CatchingFishParcelableFAB(sSLSocket)) {
                this.CatchingFishSnackbar = i + 1;
                break;
            }
            i++;
        }
        if (catchingFishMVPFAB == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.CatchingFishReduxKtor + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i2 = this.CatchingFishSnackbar;
        while (true) {
            if (i2 >= list.size()) {
                z = false;
                break;
            }
            if (((CatchingFishMVPFAB) list.get(i2)).CatchingFishParcelableFAB(sSLSocket)) {
                break;
            }
            i2++;
        }
        this.CatchingFishCoroutine = z;
        CatchingFishWidgetContext catchingFishWidgetContext = CatchingFishWidgetContext.CatchingFishUnitTesting;
        boolean z2 = this.CatchingFishReduxKtor;
        catchingFishWidgetContext.getClass();
        ?? r0 = catchingFishMVPFAB.CatchingFishReduxKtor;
        String[] strArr = catchingFishMVPFAB.CatchingFishCoroutine;
        String[] CatchingFishFragmentHandler = strArr != null ? CatchingFishEspressoDagger.CatchingFishFragmentHandler(CatchingFishViewModelMoshi.CatchingFishSnackbar, sSLSocket.getEnabledCipherSuites(), strArr) : sSLSocket.getEnabledCipherSuites();
        String[] CatchingFishFragmentHandler2 = r0 != 0 ? CatchingFishEspressoDagger.CatchingFishFragmentHandler(CatchingFishEspressoDagger.CatchingFishWorkManager, sSLSocket.getEnabledProtocols(), r0) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        CatchingFishToolbarRedux catchingFishToolbarRedux = CatchingFishViewModelMoshi.CatchingFishSnackbar;
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        int length = supportedCipherSuites.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (catchingFishToolbarRedux.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z2 && i3 != -1) {
            String str = supportedCipherSuites[i3];
            int length2 = CatchingFishFragmentHandler.length;
            String[] strArr2 = new String[length2 + 1];
            System.arraycopy(CatchingFishFragmentHandler, 0, strArr2, 0, CatchingFishFragmentHandler.length);
            strArr2[length2] = str;
            CatchingFishFragmentHandler = strArr2;
        }
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt = new CatchingFishFABDaggerHilt();
        catchingFishFABDaggerHilt.CatchingFishParcelableFAB = catchingFishMVPFAB.CatchingFishParcelableFAB;
        catchingFishFABDaggerHilt.CatchingFishCoroutine = strArr;
        catchingFishFABDaggerHilt.CatchingFishReduxKtor = r0;
        catchingFishFABDaggerHilt.CatchingFishSnackbar = catchingFishMVPFAB.CatchingFishSnackbar;
        catchingFishFABDaggerHilt.CatchingFishParcelableFAB(CatchingFishFragmentHandler);
        catchingFishFABDaggerHilt.CatchingFishCoroutine(CatchingFishFragmentHandler2);
        CatchingFishMVPFAB catchingFishMVPFAB2 = new CatchingFishMVPFAB(catchingFishFABDaggerHilt);
        String[] strArr3 = catchingFishMVPFAB2.CatchingFishReduxKtor;
        if (strArr3 != null) {
            sSLSocket.setEnabledProtocols(strArr3);
        }
        String[] strArr4 = catchingFishMVPFAB2.CatchingFishCoroutine;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        return catchingFishMVPFAB;
    }
}
