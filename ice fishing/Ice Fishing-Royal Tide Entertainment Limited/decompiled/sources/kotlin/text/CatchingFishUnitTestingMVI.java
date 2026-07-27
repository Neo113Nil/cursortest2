package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class CatchingFishUnitTestingMVI implements CatchingFishGlideRedux {
    public final CatchingFishDataStorePayPal CatchingFishReduxKtor;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;
    public CatchingFishDataStorePayPal CatchingFishParcelableFAB = null;
    public boolean CatchingFishSnackbar = false;
    public boolean CatchingFishCoroutine = false;
    public int CatchingFishDaggerWebsocket = 1;
    public int CatchingFishViewModelFAB = 1;
    public CatchingFishAndroidXKtor CatchingFishLayout = null;
    public boolean CatchingFishFragmentHandler = false;
    public final ArrayList CatchingFishCloudMessaging = new ArrayList();
    public final ArrayList CatchingFishEspressoTesting = new ArrayList();

    public CatchingFishUnitTestingMVI(CatchingFishDataStorePayPal catchingFishDataStorePayPal) {
        this.CatchingFishReduxKtor = catchingFishDataStorePayPal;
    }

    public final void CatchingFishCoroutine() {
        this.CatchingFishEspressoTesting.clear();
        this.CatchingFishCloudMessaging.clear();
        this.CatchingFishFragmentHandler = false;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishCoroutine = false;
        this.CatchingFishSnackbar = false;
    }

    @Override // kotlin.text.CatchingFishGlideRedux
    public final void CatchingFishParcelableFAB(CatchingFishGlideRedux catchingFishGlideRedux) {
        ArrayList arrayList = this.CatchingFishEspressoTesting;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((CatchingFishUnitTestingMVI) obj).CatchingFishFragmentHandler) {
                return;
            }
        }
        this.CatchingFishCoroutine = true;
        CatchingFishDataStorePayPal catchingFishDataStorePayPal = this.CatchingFishParcelableFAB;
        if (catchingFishDataStorePayPal != null) {
            catchingFishDataStorePayPal.CatchingFishParcelableFAB(this);
        }
        if (this.CatchingFishSnackbar) {
            this.CatchingFishReduxKtor.CatchingFishParcelableFAB(this);
            return;
        }
        int size2 = arrayList.size();
        CatchingFishUnitTestingMVI catchingFishUnitTestingMVI = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            CatchingFishUnitTestingMVI catchingFishUnitTestingMVI2 = (CatchingFishUnitTestingMVI) obj2;
            if (!(catchingFishUnitTestingMVI2 instanceof CatchingFishAndroidXKtor)) {
                i++;
                catchingFishUnitTestingMVI = catchingFishUnitTestingMVI2;
            }
        }
        if (catchingFishUnitTestingMVI != null && i == 1 && catchingFishUnitTestingMVI.CatchingFishFragmentHandler) {
            CatchingFishAndroidXKtor catchingFishAndroidXKtor = this.CatchingFishLayout;
            if (catchingFishAndroidXKtor != null) {
                if (!catchingFishAndroidXKtor.CatchingFishFragmentHandler) {
                    return;
                } else {
                    this.CatchingFishWorkManager = this.CatchingFishViewModelFAB * catchingFishAndroidXKtor.CatchingFishViewModelScope;
                }
            }
            CatchingFishReduxKtor(catchingFishUnitTestingMVI.CatchingFishViewModelScope + this.CatchingFishWorkManager);
        }
        CatchingFishDataStorePayPal catchingFishDataStorePayPal2 = this.CatchingFishParcelableFAB;
        if (catchingFishDataStorePayPal2 != null) {
            catchingFishDataStorePayPal2.CatchingFishParcelableFAB(this);
        }
    }

    public void CatchingFishReduxKtor(int i) {
        if (this.CatchingFishFragmentHandler) {
            return;
        }
        this.CatchingFishFragmentHandler = true;
        this.CatchingFishViewModelScope = i;
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            CatchingFishGlideRedux catchingFishGlideRedux = (CatchingFishGlideRedux) obj;
            catchingFishGlideRedux.CatchingFishParcelableFAB(catchingFishGlideRedux);
        }
    }

    public final void CatchingFishSnackbar(CatchingFishDataStorePayPal catchingFishDataStorePayPal) {
        this.CatchingFishCloudMessaging.add(catchingFishDataStorePayPal);
        if (this.CatchingFishFragmentHandler) {
            catchingFishDataStorePayPal.CatchingFishParcelableFAB(catchingFishDataStorePayPal);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.CatchingFishReduxKtor.CatchingFishSnackbar.CatchingFishReduxMoshi);
        sb.append(":");
        switch (this.CatchingFishDaggerWebsocket) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                str = "RIGHT";
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "TOP";
                break;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "BOTTOM";
                break;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.CatchingFishFragmentHandler ? Integer.valueOf(this.CatchingFishViewModelScope) : "unresolved");
        sb.append(") <t=");
        sb.append(this.CatchingFishEspressoTesting.size());
        sb.append(":d=");
        sb.append(this.CatchingFishCloudMessaging.size());
        sb.append(">");
        return sb.toString();
    }
}
