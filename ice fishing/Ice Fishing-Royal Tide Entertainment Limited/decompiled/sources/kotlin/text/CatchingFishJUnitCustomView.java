package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishJUnitCustomView {
    public final CatchingFishFABAndroidX CatchingFishCoroutine;
    public final CatchingFishFABAndroidX CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final CatchingFishFABAndroidX CatchingFishReduxKtor;
    public final CatchingFishFABAndroidX CatchingFishSnackbar;
    public final Serializable CatchingFishWorkManager;

    public CatchingFishJUnitCustomView(String str) {
        this.CatchingFishParcelableFAB = 1;
        this.CatchingFishWorkManager = str;
        this.CatchingFishSnackbar = new CatchingFishFABAndroidX(null, 1);
        this.CatchingFishCoroutine = new CatchingFishFABAndroidX(null, 0);
        this.CatchingFishReduxKtor = new CatchingFishFABAndroidX(null, 1);
        this.CatchingFishDaggerWebsocket = new CatchingFishFABAndroidX(null, 0);
    }

    public final CatchingFishFABAndroidX CatchingFishCoroutine() {
        switch (this.CatchingFishParcelableFAB) {
        }
        return this.CatchingFishReduxKtor;
    }

    public final CatchingFishFABAndroidX CatchingFishParcelableFAB() {
        switch (this.CatchingFishParcelableFAB) {
        }
        return this.CatchingFishDaggerWebsocket;
    }

    public final CatchingFishFABAndroidX CatchingFishReduxKtor() {
        switch (this.CatchingFishParcelableFAB) {
        }
        return this.CatchingFishCoroutine;
    }

    public final CatchingFishFABAndroidX CatchingFishSnackbar() {
        switch (this.CatchingFishParcelableFAB) {
        }
        return this.CatchingFishSnackbar;
    }

    public final String toString() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishJUnitCustomView[] catchingFishJUnitCustomViewArr = (CatchingFishJUnitCustomView[]) this.CatchingFishWorkManager;
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishJUnitCustomViewArr, "<this>");
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i = 0;
                for (CatchingFishJUnitCustomView catchingFishJUnitCustomView : catchingFishJUnitCustomViewArr) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    CatchingFishToastHiltBundle.CatchingFishViewModelFAB(sb, catchingFishJUnitCustomView, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                String str = (String) this.CatchingFishWorkManager;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishJUnitCustomView(CatchingFishJUnitCustomView[] catchingFishJUnitCustomViewArr) {
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishWorkManager = catchingFishJUnitCustomViewArr;
        int length = catchingFishJUnitCustomViewArr.length;
        CatchingFishFABAndroidX[] catchingFishFABAndroidXArr = new CatchingFishFABAndroidX[length];
        for (int i = 0; i < length; i++) {
            catchingFishFABAndroidXArr[i] = ((CatchingFishJUnitCustomView[]) this.CatchingFishWorkManager)[i].CatchingFishSnackbar();
        }
        this.CatchingFishSnackbar = new CatchingFishFABAndroidX(new CatchingFishStateFlowMVP(catchingFishFABAndroidXArr, 0), 1);
        int length2 = ((CatchingFishJUnitCustomView[]) this.CatchingFishWorkManager).length;
        CatchingFishFABAndroidX[] catchingFishFABAndroidXArr2 = new CatchingFishFABAndroidX[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            catchingFishFABAndroidXArr2[i2] = ((CatchingFishJUnitCustomView[]) this.CatchingFishWorkManager)[i2].CatchingFishReduxKtor();
        }
        this.CatchingFishCoroutine = new CatchingFishFABAndroidX(new CatchingFishRoomGraphQL(catchingFishFABAndroidXArr2, 0), 0);
        int length3 = ((CatchingFishJUnitCustomView[]) this.CatchingFishWorkManager).length;
        CatchingFishFABAndroidX[] catchingFishFABAndroidXArr3 = new CatchingFishFABAndroidX[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            catchingFishFABAndroidXArr3[i3] = ((CatchingFishJUnitCustomView[]) this.CatchingFishWorkManager)[i3].CatchingFishCoroutine();
        }
        this.CatchingFishReduxKtor = new CatchingFishFABAndroidX(new CatchingFishStateFlowMVP(catchingFishFABAndroidXArr3, 1), 1);
        int length4 = ((CatchingFishJUnitCustomView[]) this.CatchingFishWorkManager).length;
        CatchingFishFABAndroidX[] catchingFishFABAndroidXArr4 = new CatchingFishFABAndroidX[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            catchingFishFABAndroidXArr4[i4] = ((CatchingFishJUnitCustomView[]) this.CatchingFishWorkManager)[i4].CatchingFishParcelableFAB();
        }
        this.CatchingFishDaggerWebsocket = new CatchingFishFABAndroidX(new CatchingFishRoomGraphQL(catchingFishFABAndroidXArr4, 1), 0);
    }
}
