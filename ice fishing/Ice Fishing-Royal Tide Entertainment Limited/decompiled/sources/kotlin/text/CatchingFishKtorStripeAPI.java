package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CatchingFishKtorStripeAPI {
    public final String[] CatchingFishParcelableFAB;

    public CatchingFishKtorStripeAPI(CatchingFishViewPagerMockk catchingFishViewPagerMockk) {
        ArrayList arrayList = (ArrayList) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
        this.CatchingFishParcelableFAB = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void CatchingFishParcelableFAB(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str};
                byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
    }

    public static void CatchingFishSnackbar(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(CatchingFishMVPLiveData.CatchingFishOkHttp("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str2, str};
                byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
            }
        }
    }

    public final String CatchingFishCoroutine(String str) {
        String[] strArr = this.CatchingFishParcelableFAB;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final CatchingFishViewPagerMockk CatchingFishDaggerWebsocket() {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = new CatchingFishViewPagerMockk(12);
        Collections.addAll((ArrayList) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket, this.CatchingFishParcelableFAB);
        return catchingFishViewPagerMockk;
    }

    public final String CatchingFishReduxKtor(int i) {
        return this.CatchingFishParcelableFAB[i * 2];
    }

    public final String CatchingFishViewModelScope(int i) {
        return this.CatchingFishParcelableFAB[(i * 2) + 1];
    }

    public final int CatchingFishWorkManager() {
        return this.CatchingFishParcelableFAB.length / 2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CatchingFishKtorStripeAPI) && Arrays.equals(((CatchingFishKtorStripeAPI) obj).CatchingFishParcelableFAB, this.CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int CatchingFishWorkManager = CatchingFishWorkManager();
        for (int i = 0; i < CatchingFishWorkManager; i++) {
            sb.append(CatchingFishReduxKtor(i));
            sb.append(": ");
            sb.append(CatchingFishViewModelScope(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public CatchingFishKtorStripeAPI(String[] strArr) {
        this.CatchingFishParcelableFAB = strArr;
    }
}
