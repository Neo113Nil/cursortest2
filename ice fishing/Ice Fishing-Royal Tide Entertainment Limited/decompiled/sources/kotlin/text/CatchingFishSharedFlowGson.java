package kotlin.text;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CatchingFishSharedFlowGson {
    public final long CatchingFishCoroutine;
    public final String CatchingFishDaggerWebsocket;
    public final boolean CatchingFishLayout;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;
    public final boolean CatchingFishViewModelFAB;
    public final boolean CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;
    public static final Pattern CatchingFishFragmentHandler = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern CatchingFishCloudMessaging = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern CatchingFishEspressoTesting = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern CatchingFishOkHttp = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public CatchingFishSharedFlowGson(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = str2;
        this.CatchingFishCoroutine = j;
        this.CatchingFishReduxKtor = str3;
        this.CatchingFishDaggerWebsocket = str4;
        this.CatchingFishWorkManager = z;
        this.CatchingFishViewModelScope = z2;
        this.CatchingFishLayout = z3;
        this.CatchingFishViewModelFAB = z4;
    }

    public static int CatchingFishParcelableFAB(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static long CatchingFishSnackbar(String str, int i) {
        int CatchingFishParcelableFAB = CatchingFishParcelableFAB(str, 0, i, false);
        Pattern pattern = CatchingFishOkHttp;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (CatchingFishParcelableFAB < i) {
            int CatchingFishParcelableFAB2 = CatchingFishParcelableFAB(str, CatchingFishParcelableFAB + 1, i, true);
            matcher.region(CatchingFishParcelableFAB, CatchingFishParcelableFAB2);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(CatchingFishEspressoTesting).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else {
                if (i5 == -1) {
                    Pattern pattern2 = CatchingFishCloudMessaging;
                    if (matcher.usePattern(pattern2).matches()) {
                        i5 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(CatchingFishFragmentHandler).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            CatchingFishParcelableFAB = CatchingFishParcelableFAB(str, CatchingFishParcelableFAB2 + 1, i, false);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i5 == -1) {
            throw new IllegalArgumentException();
        }
        if (i4 < 1 || i4 > 31) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(CatchingFishEspressoDagger.CatchingFishDaggerWebsocket);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishSharedFlowGson)) {
            return false;
        }
        CatchingFishSharedFlowGson catchingFishSharedFlowGson = (CatchingFishSharedFlowGson) obj;
        return catchingFishSharedFlowGson.CatchingFishParcelableFAB.equals(this.CatchingFishParcelableFAB) && catchingFishSharedFlowGson.CatchingFishSnackbar.equals(this.CatchingFishSnackbar) && catchingFishSharedFlowGson.CatchingFishReduxKtor.equals(this.CatchingFishReduxKtor) && catchingFishSharedFlowGson.CatchingFishDaggerWebsocket.equals(this.CatchingFishDaggerWebsocket) && catchingFishSharedFlowGson.CatchingFishCoroutine == this.CatchingFishCoroutine && catchingFishSharedFlowGson.CatchingFishWorkManager == this.CatchingFishWorkManager && catchingFishSharedFlowGson.CatchingFishViewModelScope == this.CatchingFishViewModelScope && catchingFishSharedFlowGson.CatchingFishViewModelFAB == this.CatchingFishViewModelFAB && catchingFishSharedFlowGson.CatchingFishLayout == this.CatchingFishLayout;
    }

    public final int hashCode() {
        int hashCode = (this.CatchingFishDaggerWebsocket.hashCode() + ((this.CatchingFishReduxKtor.hashCode() + ((this.CatchingFishSnackbar.hashCode() + ((this.CatchingFishParcelableFAB.hashCode() + 527) * 31)) * 31)) * 31)) * 31;
        long j = this.CatchingFishCoroutine;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.CatchingFishWorkManager ? 1 : 0)) * 31) + (!this.CatchingFishViewModelScope ? 1 : 0)) * 31) + (!this.CatchingFishViewModelFAB ? 1 : 0)) * 31) + (!this.CatchingFishLayout ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.CatchingFishParcelableFAB);
        sb.append('=');
        sb.append(this.CatchingFishSnackbar);
        if (this.CatchingFishViewModelFAB) {
            long j = this.CatchingFishCoroutine;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) CatchingFishMockkPayPal.CatchingFishParcelableFAB.get()).format(new Date(j)));
            }
        }
        if (!this.CatchingFishLayout) {
            sb.append("; domain=");
            sb.append(this.CatchingFishReduxKtor);
        }
        sb.append("; path=");
        sb.append(this.CatchingFishDaggerWebsocket);
        if (this.CatchingFishWorkManager) {
            sb.append("; secure");
        }
        if (this.CatchingFishViewModelScope) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
