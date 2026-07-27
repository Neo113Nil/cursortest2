package kotlin.text;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishViewAsyncTask {
    public final String CatchingFishCoroutine;
    public final String CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final List CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;
    public final String CatchingFishViewModelScope;
    public final String CatchingFishWorkManager;

    public CatchingFishViewAsyncTask(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.CatchingFishParcelableFAB = str;
        str2.getClass();
        this.CatchingFishSnackbar = str2;
        this.CatchingFishCoroutine = str3;
        list.getClass();
        this.CatchingFishReduxKtor = list;
        this.CatchingFishDaggerWebsocket = str4;
        this.CatchingFishWorkManager = str5;
        this.CatchingFishViewModelScope = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.CatchingFishParcelableFAB + ", mProviderPackage: " + this.CatchingFishSnackbar + ", mQuery: " + this.CatchingFishCoroutine + ", mSystemFont: " + this.CatchingFishDaggerWebsocket + ", mVariationSettings: " + this.CatchingFishWorkManager + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.CatchingFishReduxKtor;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
