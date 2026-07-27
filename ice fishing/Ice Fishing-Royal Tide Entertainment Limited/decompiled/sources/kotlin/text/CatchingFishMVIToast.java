package kotlin.text;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class CatchingFishMVIToast {
    public static final String CatchingFishCoroutine;
    public static final CatchingFishMVIToast CatchingFishDaggerWebsocket;
    public static final CatchingFishMVIToast CatchingFishReduxKtor;
    public static final String CatchingFishSnackbar;
    public final boolean CatchingFishParcelableFAB;

    static {
        CatchingFishStripeAPIRealm catchingFishStripeAPIRealm = CatchingFishLifecyclePayPal.CatchingFishCoroutine;
        CatchingFishSnackbar = Character.toString((char) 8206);
        CatchingFishCoroutine = Character.toString((char) 8207);
        CatchingFishReduxKtor = new CatchingFishMVIToast(false);
        CatchingFishDaggerWebsocket = new CatchingFishMVIToast(true);
    }

    public CatchingFishMVIToast(boolean z) {
        CatchingFishStripeAPIRealm catchingFishStripeAPIRealm = CatchingFishLifecyclePayPal.CatchingFishParcelableFAB;
        this.CatchingFishParcelableFAB = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.CatchingFishCoroutine <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.CatchingFishParcelableFAB()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int CatchingFishParcelableFAB(CharSequence charSequence) {
        byte directionality;
        CatchingFishMVPGsonOkHttp catchingFishMVPGsonOkHttp = new CatchingFishMVPGsonOkHttp(charSequence);
        catchingFishMVPGsonOkHttp.CatchingFishCoroutine = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = catchingFishMVPGsonOkHttp.CatchingFishCoroutine;
            if (i4 < catchingFishMVPGsonOkHttp.CatchingFishSnackbar && i == 0) {
                CharSequence charSequence2 = catchingFishMVPGsonOkHttp.CatchingFishParcelableFAB;
                char charAt = charSequence2.charAt(i4);
                catchingFishMVPGsonOkHttp.CatchingFishReduxKtor = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, catchingFishMVPGsonOkHttp.CatchingFishCoroutine);
                    catchingFishMVPGsonOkHttp.CatchingFishCoroutine = Character.charCount(codePointAt) + catchingFishMVPGsonOkHttp.CatchingFishCoroutine;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    catchingFishMVPGsonOkHttp.CatchingFishCoroutine++;
                    char c = catchingFishMVPGsonOkHttp.CatchingFishReduxKtor;
                    directionality = c < 1792 ? CatchingFishMVPGsonOkHttp.CatchingFishDaggerWebsocket[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int CatchingFishSnackbar(CharSequence charSequence) {
        CatchingFishMVPGsonOkHttp catchingFishMVPGsonOkHttp = new CatchingFishMVPGsonOkHttp(charSequence);
        catchingFishMVPGsonOkHttp.CatchingFishCoroutine = catchingFishMVPGsonOkHttp.CatchingFishSnackbar;
        int i = 0;
        while (true) {
            int i2 = i;
            while (catchingFishMVPGsonOkHttp.CatchingFishCoroutine > 0) {
                byte CatchingFishParcelableFAB = catchingFishMVPGsonOkHttp.CatchingFishParcelableFAB();
                if (CatchingFishParcelableFAB != 0) {
                    if (CatchingFishParcelableFAB == 1 || CatchingFishParcelableFAB == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (CatchingFishParcelableFAB != 9) {
                        switch (CatchingFishParcelableFAB) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder CatchingFishCoroutine(CharSequence charSequence) {
        CatchingFishStripeAPIRealm catchingFishStripeAPIRealm = CatchingFishLifecyclePayPal.CatchingFishCoroutine;
        if (charSequence == null) {
            return null;
        }
        boolean CatchingFishSnackbar2 = catchingFishStripeAPIRealm.CatchingFishSnackbar(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean CatchingFishSnackbar3 = (CatchingFishSnackbar2 ? CatchingFishLifecyclePayPal.CatchingFishSnackbar : CatchingFishLifecyclePayPal.CatchingFishParcelableFAB).CatchingFishSnackbar(charSequence, charSequence.length());
        String str = "";
        String str2 = CatchingFishCoroutine;
        String str3 = CatchingFishSnackbar;
        boolean z = this.CatchingFishParcelableFAB;
        spannableStringBuilder.append((CharSequence) ((z || !(CatchingFishSnackbar3 || CatchingFishParcelableFAB(charSequence) == 1)) ? (!z || (CatchingFishSnackbar3 && CatchingFishParcelableFAB(charSequence) != -1)) ? "" : str2 : str3));
        if (CatchingFishSnackbar2 != z) {
            spannableStringBuilder.append(CatchingFishSnackbar2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean CatchingFishSnackbar4 = (CatchingFishSnackbar2 ? CatchingFishLifecyclePayPal.CatchingFishSnackbar : CatchingFishLifecyclePayPal.CatchingFishParcelableFAB).CatchingFishSnackbar(charSequence, charSequence.length());
        if (!z && (CatchingFishSnackbar4 || CatchingFishSnackbar(charSequence) == 1)) {
            str = str3;
        } else if (z && (!CatchingFishSnackbar4 || CatchingFishSnackbar(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
