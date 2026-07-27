package kotlin.text;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishToastToolbar {
    public final boolean CatchingFishCloudMessaging;
    public final int CatchingFishCoroutine;
    public final boolean CatchingFishDaggerWebsocket;
    public final boolean CatchingFishEspressoTesting;
    public final boolean CatchingFishFragmentHandler;
    public final int CatchingFishLayout;
    public String CatchingFishOkHttp;
    public final boolean CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final boolean CatchingFishSnackbar;
    public final int CatchingFishViewModelFAB;
    public final boolean CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;

    static {
        TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
    }

    public CatchingFishToastToolbar(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.CatchingFishParcelableFAB = z;
        this.CatchingFishSnackbar = z2;
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishDaggerWebsocket = z3;
        this.CatchingFishWorkManager = z4;
        this.CatchingFishViewModelScope = z5;
        this.CatchingFishViewModelFAB = i3;
        this.CatchingFishLayout = i4;
        this.CatchingFishFragmentHandler = z6;
        this.CatchingFishCloudMessaging = z7;
        this.CatchingFishEspressoTesting = z8;
        this.CatchingFishOkHttp = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishToastToolbar CatchingFishParcelableFAB(CatchingFishKtorStripeAPI catchingFishKtorStripeAPI) {
        int i;
        int i2;
        String str;
        char charAt;
        CatchingFishKtorStripeAPI catchingFishKtorStripeAPI2 = catchingFishKtorStripeAPI;
        int CatchingFishWorkManager = catchingFishKtorStripeAPI2.CatchingFishWorkManager();
        int i3 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = -1;
        int i5 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < CatchingFishWorkManager) {
            String CatchingFishReduxKtor = catchingFishKtorStripeAPI2.CatchingFishReduxKtor(i3);
            String CatchingFishViewModelScope = catchingFishKtorStripeAPI2.CatchingFishViewModelScope(i3);
            if (CatchingFishReduxKtor.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = CatchingFishViewModelScope;
                    for (i = 0; i < CatchingFishViewModelScope.length(); i = i2) {
                        int CatchingFishDaggerWebsocket = CatchingFishWidgetEspresso.CatchingFishDaggerWebsocket(CatchingFishViewModelScope, i, "=,;");
                        String trim = CatchingFishViewModelScope.substring(i, CatchingFishDaggerWebsocket).trim();
                        if (CatchingFishDaggerWebsocket == CatchingFishViewModelScope.length() || CatchingFishViewModelScope.charAt(CatchingFishDaggerWebsocket) == ',' || CatchingFishViewModelScope.charAt(CatchingFishDaggerWebsocket) == ';') {
                            i2 = CatchingFishDaggerWebsocket + 1;
                            str = null;
                        } else {
                            while (true) {
                                CatchingFishDaggerWebsocket++;
                                if (CatchingFishDaggerWebsocket >= CatchingFishViewModelScope.length() || ((charAt = CatchingFishViewModelScope.charAt(CatchingFishDaggerWebsocket)) != ' ' && charAt != '\t')) {
                                    break;
                                }
                            }
                            if (CatchingFishDaggerWebsocket >= CatchingFishViewModelScope.length() || CatchingFishViewModelScope.charAt(CatchingFishDaggerWebsocket) != '\"') {
                                i2 = CatchingFishWidgetEspresso.CatchingFishDaggerWebsocket(CatchingFishViewModelScope, CatchingFishDaggerWebsocket, ",;");
                                str = CatchingFishViewModelScope.substring(CatchingFishDaggerWebsocket, i2).trim();
                            } else {
                                int i8 = CatchingFishDaggerWebsocket + 1;
                                int CatchingFishDaggerWebsocket2 = CatchingFishWidgetEspresso.CatchingFishDaggerWebsocket(CatchingFishViewModelScope, i8, "\"");
                                str = CatchingFishViewModelScope.substring(i8, CatchingFishDaggerWebsocket2);
                                i2 = CatchingFishDaggerWebsocket2 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(trim)) {
                                i4 = CatchingFishWidgetEspresso.CatchingFishCoroutine(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(trim)) {
                                i5 = CatchingFishWidgetEspresso.CatchingFishCoroutine(str, -1);
                            } else if ("private".equalsIgnoreCase(trim)) {
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(trim)) {
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(trim)) {
                                i6 = CatchingFishWidgetEspresso.CatchingFishCoroutine(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(trim)) {
                                i7 = CatchingFishWidgetEspresso.CatchingFishCoroutine(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(trim)) {
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(trim)) {
                                z9 = true;
                            }
                        }
                    }
                    i3++;
                    catchingFishKtorStripeAPI2 = catchingFishKtorStripeAPI;
                }
            } else if (!CatchingFishReduxKtor.equalsIgnoreCase("Pragma")) {
                i3++;
                catchingFishKtorStripeAPI2 = catchingFishKtorStripeAPI;
            }
            z = false;
            while (i < CatchingFishViewModelScope.length()) {
            }
            i3++;
            catchingFishKtorStripeAPI2 = catchingFishKtorStripeAPI;
        }
        return new CatchingFishToastToolbar(z2, z3, i4, i5, z4, z5, z6, i6, i7, z7, z8, z9, !z ? null : str2);
    }

    public final String toString() {
        String sb;
        String str = this.CatchingFishOkHttp;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.CatchingFishParcelableFAB) {
            sb2.append("no-cache, ");
        }
        if (this.CatchingFishSnackbar) {
            sb2.append("no-store, ");
        }
        int i = this.CatchingFishCoroutine;
        if (i != -1) {
            sb2.append("max-age=");
            sb2.append(i);
            sb2.append(", ");
        }
        int i2 = this.CatchingFishReduxKtor;
        if (i2 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i2);
            sb2.append(", ");
        }
        if (this.CatchingFishDaggerWebsocket) {
            sb2.append("private, ");
        }
        if (this.CatchingFishWorkManager) {
            sb2.append("public, ");
        }
        if (this.CatchingFishViewModelScope) {
            sb2.append("must-revalidate, ");
        }
        int i3 = this.CatchingFishViewModelFAB;
        if (i3 != -1) {
            sb2.append("max-stale=");
            sb2.append(i3);
            sb2.append(", ");
        }
        int i4 = this.CatchingFishLayout;
        if (i4 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i4);
            sb2.append(", ");
        }
        if (this.CatchingFishFragmentHandler) {
            sb2.append("only-if-cached, ");
        }
        if (this.CatchingFishCloudMessaging) {
            sb2.append("no-transform, ");
        }
        if (this.CatchingFishEspressoTesting) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.CatchingFishOkHttp = sb;
        return sb;
    }
}
