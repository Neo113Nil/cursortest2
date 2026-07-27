package kotlin.text;

import android.util.StateSet;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishViewHilt {
    public Object CatchingFishCoroutine;
    public Serializable CatchingFishDaggerWebsocket;
    public Object CatchingFishLayout;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public Serializable CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public Object CatchingFishViewModelFAB;
    public Object CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public CatchingFishViewHilt(CatchingFishFragmentMVVM catchingFishFragmentMVVM) {
        this.CatchingFishParcelableFAB = 1;
        CatchingFishCoroutine();
        CatchingFishParcelableFAB(StateSet.WILD_CARD, catchingFishFragmentMVVM);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, kotlin.text.CatchingFishFragmentMVVM[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void CatchingFishCoroutine() {
        this.CatchingFishCoroutine = new CatchingFishFragmentMVVM();
        this.CatchingFishReduxKtor = new int[10][];
        this.CatchingFishDaggerWebsocket = new CatchingFishFragmentMVVM[10];
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, kotlin.text.CatchingFishFragmentMVVM[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void CatchingFishParcelableFAB(int[] iArr, CatchingFishFragmentMVVM catchingFishFragmentMVVM) {
        int i = this.CatchingFishSnackbar;
        if (i == 0 || iArr.length == 0) {
            this.CatchingFishCoroutine = catchingFishFragmentMVVM;
        }
        int[][] iArr2 = (int[][]) this.CatchingFishReduxKtor;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.CatchingFishReduxKtor = r3;
            ?? r1 = new CatchingFishFragmentMVVM[i2];
            System.arraycopy((CatchingFishFragmentMVVM[]) this.CatchingFishDaggerWebsocket, 0, r1, 0, i);
            this.CatchingFishDaggerWebsocket = r1;
        }
        int[][] iArr3 = (int[][]) this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishSnackbar;
        iArr3[i3] = iArr;
        ((CatchingFishFragmentMVVM[]) this.CatchingFishDaggerWebsocket)[i3] = catchingFishFragmentMVVM;
        this.CatchingFishSnackbar = i3 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0222, code lost:
    
        if (r4 <= 65535) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void CatchingFishReduxKtor(CatchingFishBundleView catchingFishBundleView, String str) {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        int i4;
        int CatchingFishWorkManager;
        char charAt;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str3;
        char c5;
        char charAt2;
        String str4 = str;
        ArrayList arrayList = (ArrayList) this.CatchingFishViewModelFAB;
        int CatchingFishAnimationMockk = CatchingFishEspressoDagger.CatchingFishAnimationMockk(str4, 0, str4.length());
        int CatchingFishStateLiveData = CatchingFishEspressoDagger.CatchingFishStateLiveData(str4, CatchingFishAnimationMockk, str4.length());
        if (CatchingFishStateLiveData - CatchingFishAnimationMockk >= 2) {
            char charAt3 = str4.charAt(CatchingFishAnimationMockk);
            char c6 = 'Z';
            if ((charAt3 >= 'a' && charAt3 <= 'z') || (charAt3 >= 'A' && charAt3 <= 'Z')) {
                int i10 = CatchingFishAnimationMockk + 1;
                while (true) {
                    if (i10 >= CatchingFishStateLiveData) {
                        break;
                    }
                    char charAt4 = str4.charAt(i10);
                    if ((charAt4 >= 'a' && charAt4 <= 'z') || ((charAt4 >= 'A' && charAt4 <= c6) || ((charAt4 >= '0' && charAt4 <= '9') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i10++;
                        c6 = 'Z';
                    } else if (charAt4 == ':') {
                        i = i10;
                    }
                }
                if (i == -1) {
                    if (str4.regionMatches(true, CatchingFishAnimationMockk, "https:", 0, 6)) {
                        this.CatchingFishCoroutine = Constants.SCHEME;
                        CatchingFishAnimationMockk += 6;
                        str4 = str;
                    } else {
                        str4 = str;
                        if (!str4.regionMatches(true, CatchingFishAnimationMockk, "http:", 0, 5)) {
                            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, i) + "'");
                        }
                        this.CatchingFishCoroutine = "http";
                        CatchingFishAnimationMockk += 5;
                    }
                } else {
                    if (catchingFishBundleView == null) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                    }
                    this.CatchingFishCoroutine = catchingFishBundleView.CatchingFishParcelableFAB;
                }
                i2 = CatchingFishAnimationMockk;
                i3 = 0;
                while (true) {
                    c = '/';
                    c2 = '\\';
                    if (i2 >= CatchingFishStateLiveData || !((charAt2 = str4.charAt(i2)) == '\\' || charAt2 == '/')) {
                        break;
                    }
                    i3++;
                    i2++;
                }
                c3 = '?';
                c4 = '#';
                if (i3 < 2 || catchingFishBundleView == null || !catchingFishBundleView.CatchingFishParcelableFAB.equals((String) this.CatchingFishCoroutine)) {
                    i4 = CatchingFishAnimationMockk + i3;
                    boolean z = false;
                    boolean z2 = false;
                    while (true) {
                        CatchingFishWorkManager = CatchingFishEspressoDagger.CatchingFishWorkManager(i4, CatchingFishStateLiveData, str4, "@/\\?#");
                        charAt = CatchingFishWorkManager == CatchingFishStateLiveData ? str4.charAt(CatchingFishWorkManager) : (char) 65535;
                        if (charAt == 65535 || charAt == c4 || charAt == c || charAt == c2 || charAt == c3) {
                            break;
                        }
                        if (charAt != '@') {
                            str3 = str4;
                        } else {
                            if (z) {
                                i9 = CatchingFishWorkManager;
                                StringBuilder sb = new StringBuilder();
                                sb.append((String) this.CatchingFishDaggerWebsocket);
                                sb.append("%40");
                                str3 = str;
                                sb.append(CatchingFishBundleView.CatchingFishParcelableFAB(str3, i4, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true));
                                this.CatchingFishDaggerWebsocket = sb.toString();
                            } else {
                                int CatchingFishViewModelScope = CatchingFishEspressoDagger.CatchingFishViewModelScope(str4, i4, CatchingFishWorkManager, ':');
                                String CatchingFishParcelableFAB = CatchingFishBundleView.CatchingFishParcelableFAB(str, i4, CatchingFishViewModelScope, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                if (z2) {
                                    CatchingFishParcelableFAB = ((String) this.CatchingFishReduxKtor) + "%40" + CatchingFishParcelableFAB;
                                }
                                this.CatchingFishReduxKtor = CatchingFishParcelableFAB;
                                if (CatchingFishViewModelScope != CatchingFishWorkManager) {
                                    int i11 = CatchingFishViewModelScope + 1;
                                    i9 = CatchingFishWorkManager;
                                    this.CatchingFishDaggerWebsocket = CatchingFishBundleView.CatchingFishParcelableFAB(str, i11, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                    z = true;
                                } else {
                                    i9 = CatchingFishWorkManager;
                                }
                                str3 = str;
                                z2 = true;
                            }
                            i4 = i9 + 1;
                        }
                        str4 = str3;
                        c3 = '?';
                        c4 = '#';
                        c = '/';
                        c2 = '\\';
                    }
                    str2 = str4;
                    int i12 = i4;
                    i5 = i12;
                    while (true) {
                        if (i5 < CatchingFishWorkManager) {
                            char charAt5 = str2.charAt(i5);
                            if (charAt5 == ':') {
                                i6 = i5;
                                break;
                            }
                            if (charAt5 == '[') {
                                do {
                                    i5++;
                                    if (i5 < CatchingFishWorkManager) {
                                    }
                                } while (str2.charAt(i5) != ']');
                            }
                            i5++;
                        } else {
                            i6 = CatchingFishWorkManager;
                            break;
                        }
                    }
                    i7 = i6 + 1;
                    if (i7 >= CatchingFishWorkManager) {
                        this.CatchingFishWorkManager = CatchingFishEspressoDagger.CatchingFishParcelableFAB(CatchingFishBundleView.CatchingFishViewModelScope(str2, i12, i6, false));
                        try {
                            i8 = Integer.parseInt(CatchingFishBundleView.CatchingFishParcelableFAB(str2, i7, CatchingFishWorkManager, "", false, false, false, true));
                            if (i8 > 0) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i8 = -1;
                        this.CatchingFishSnackbar = i8;
                        if (i8 == -1) {
                            throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i7, CatchingFishWorkManager) + '\"');
                        }
                    } else {
                        this.CatchingFishWorkManager = CatchingFishEspressoDagger.CatchingFishParcelableFAB(CatchingFishBundleView.CatchingFishViewModelScope(str2, i12, i6, false));
                        this.CatchingFishSnackbar = CatchingFishBundleView.CatchingFishSnackbar((String) this.CatchingFishCoroutine);
                    }
                    if (((String) this.CatchingFishWorkManager) != null) {
                        throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i12, i6) + '\"');
                    }
                    CatchingFishAnimationMockk = CatchingFishWorkManager;
                } else {
                    this.CatchingFishReduxKtor = catchingFishBundleView.CatchingFishWorkManager();
                    this.CatchingFishDaggerWebsocket = catchingFishBundleView.CatchingFishCoroutine();
                    this.CatchingFishWorkManager = catchingFishBundleView.CatchingFishReduxKtor;
                    this.CatchingFishSnackbar = catchingFishBundleView.CatchingFishDaggerWebsocket;
                    arrayList.clear();
                    arrayList.addAll(catchingFishBundleView.CatchingFishReduxKtor());
                    if (CatchingFishAnimationMockk == CatchingFishStateLiveData || str4.charAt(CatchingFishAnimationMockk) == '#') {
                        String CatchingFishDaggerWebsocket = catchingFishBundleView.CatchingFishDaggerWebsocket();
                        this.CatchingFishLayout = CatchingFishDaggerWebsocket != null ? CatchingFishBundleView.CatchingFishFragmentHandler(CatchingFishBundleView.CatchingFishParcelableFAB(CatchingFishDaggerWebsocket, 0, CatchingFishDaggerWebsocket.length(), " \"'<>#", true, false, true, true)) : null;
                    }
                    str2 = str4;
                }
                int CatchingFishWorkManager2 = CatchingFishEspressoDagger.CatchingFishWorkManager(CatchingFishAnimationMockk, CatchingFishStateLiveData, str2, "?#");
                if (CatchingFishAnimationMockk != CatchingFishWorkManager2) {
                    char charAt6 = str2.charAt(CatchingFishAnimationMockk);
                    if (charAt6 == '/' || charAt6 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        CatchingFishAnimationMockk++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    int i13 = CatchingFishAnimationMockk;
                    while (i13 < CatchingFishWorkManager2) {
                        int CatchingFishWorkManager3 = CatchingFishEspressoDagger.CatchingFishWorkManager(i13, CatchingFishWorkManager2, str2, "/\\");
                        boolean z3 = CatchingFishWorkManager3 < CatchingFishWorkManager2;
                        String CatchingFishParcelableFAB2 = CatchingFishBundleView.CatchingFishParcelableFAB(str2, i13, CatchingFishWorkManager3, " \"<>^`{}|/\\?#", true, false, false, true);
                        if (!CatchingFishParcelableFAB2.equals(".") && !CatchingFishParcelableFAB2.equalsIgnoreCase("%2e")) {
                            if (!CatchingFishParcelableFAB2.equals("..") && !CatchingFishParcelableFAB2.equalsIgnoreCase("%2e.") && !CatchingFishParcelableFAB2.equalsIgnoreCase(".%2e") && !CatchingFishParcelableFAB2.equalsIgnoreCase("%2e%2e")) {
                                if (((String) arrayList.get(arrayList.size() - 1)).isEmpty()) {
                                    arrayList.set(arrayList.size() - 1, CatchingFishParcelableFAB2);
                                } else {
                                    arrayList.add(CatchingFishParcelableFAB2);
                                }
                                if (z3) {
                                    arrayList.add("");
                                }
                            } else if (!((String) arrayList.remove(arrayList.size() - 1)).isEmpty() || arrayList.isEmpty()) {
                                arrayList.add("");
                            } else {
                                arrayList.set(arrayList.size() - 1, "");
                            }
                        }
                        if (z3) {
                            CatchingFishWorkManager3++;
                        }
                        i13 = CatchingFishWorkManager3;
                    }
                }
                if (CatchingFishWorkManager2 >= CatchingFishStateLiveData || str2.charAt(CatchingFishWorkManager2) != '?') {
                    c5 = '#';
                } else {
                    c5 = '#';
                    int CatchingFishViewModelScope2 = CatchingFishEspressoDagger.CatchingFishViewModelScope(str2, CatchingFishWorkManager2, CatchingFishStateLiveData, '#');
                    this.CatchingFishLayout = CatchingFishBundleView.CatchingFishFragmentHandler(CatchingFishBundleView.CatchingFishParcelableFAB(str2, CatchingFishWorkManager2 + 1, CatchingFishViewModelScope2, " \"'<>#", true, false, true, true));
                    CatchingFishWorkManager2 = CatchingFishViewModelScope2;
                }
                if (CatchingFishWorkManager2 >= CatchingFishStateLiveData || str2.charAt(CatchingFishWorkManager2) != c5) {
                    return;
                }
                this.CatchingFishViewModelScope = CatchingFishBundleView.CatchingFishParcelableFAB(str2, CatchingFishWorkManager2 + 1, CatchingFishStateLiveData, "", true, false, false, false);
                return;
            }
        }
        i = -1;
        if (i == -1) {
        }
        i2 = CatchingFishAnimationMockk;
        i3 = 0;
        while (true) {
            c = '/';
            c2 = '\\';
            if (i2 >= CatchingFishStateLiveData) {
                break;
            } else {
                break;
            }
            i3++;
            i2++;
        }
        c3 = '?';
        c4 = '#';
        if (i3 < 2) {
        }
        i4 = CatchingFishAnimationMockk + i3;
        boolean z4 = false;
        boolean z22 = false;
        while (true) {
            CatchingFishWorkManager = CatchingFishEspressoDagger.CatchingFishWorkManager(i4, CatchingFishStateLiveData, str4, "@/\\?#");
            if (CatchingFishWorkManager == CatchingFishStateLiveData) {
            }
            if (charAt == 65535) {
                break;
            } else {
                break;
            }
            str4 = str3;
            c3 = '?';
            c4 = '#';
            c = '/';
            c2 = '\\';
        }
        str2 = str4;
        int i122 = i4;
        i5 = i122;
        while (true) {
            if (i5 < CatchingFishWorkManager) {
            }
            i5++;
        }
        i7 = i6 + 1;
        if (i7 >= CatchingFishWorkManager) {
        }
        if (((String) this.CatchingFishWorkManager) != null) {
        }
    }

    public CatchingFishBundleView CatchingFishSnackbar() {
        if (((String) this.CatchingFishCoroutine) == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (((String) this.CatchingFishWorkManager) != null) {
            return new CatchingFishBundleView(this);
        }
        throw new IllegalStateException("host == null");
    }

    public String toString() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.CatchingFishCoroutine;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (!((String) this.CatchingFishReduxKtor).isEmpty() || !((String) this.CatchingFishDaggerWebsocket).isEmpty()) {
                    sb.append((String) this.CatchingFishReduxKtor);
                    if (!((String) this.CatchingFishDaggerWebsocket).isEmpty()) {
                        sb.append(':');
                        sb.append((String) this.CatchingFishDaggerWebsocket);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.CatchingFishWorkManager;
                if (str2 != null) {
                    if (str2.indexOf(58) != -1) {
                        sb.append('[');
                        sb.append((String) this.CatchingFishWorkManager);
                        sb.append(']');
                    } else {
                        sb.append((String) this.CatchingFishWorkManager);
                    }
                }
                int i = this.CatchingFishSnackbar;
                if (i != -1 || ((String) this.CatchingFishCoroutine) != null) {
                    if (i == -1) {
                        i = CatchingFishBundleView.CatchingFishSnackbar((String) this.CatchingFishCoroutine);
                    }
                    String str3 = (String) this.CatchingFishCoroutine;
                    if (str3 == null || i != CatchingFishBundleView.CatchingFishSnackbar(str3)) {
                        sb.append(':');
                        sb.append(i);
                    }
                }
                ArrayList arrayList = (ArrayList) this.CatchingFishViewModelFAB;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.CatchingFishLayout) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.CatchingFishLayout;
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3 += 2) {
                        String str4 = (String) arrayList2.get(i3);
                        String str5 = (String) arrayList2.get(i3 + 1);
                        if (i3 > 0) {
                            sb.append('&');
                        }
                        sb.append(str4);
                        if (str5 != null) {
                            sb.append('=');
                            sb.append(str5);
                        }
                    }
                }
                if (((String) this.CatchingFishViewModelScope) != null) {
                    sb.append('#');
                    sb.append((String) this.CatchingFishViewModelScope);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public CatchingFishViewHilt(int i) {
        this.CatchingFishParcelableFAB = i;
        switch (i) {
            case 1:
                break;
            default:
                this.CatchingFishReduxKtor = "";
                this.CatchingFishDaggerWebsocket = "";
                this.CatchingFishSnackbar = -1;
                ArrayList arrayList = new ArrayList();
                this.CatchingFishViewModelFAB = arrayList;
                arrayList.add("");
                break;
        }
    }
}
