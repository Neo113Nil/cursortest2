package kotlin.text;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CatchingFishWidgetMVVM implements CatchingFishReduxToast {
    public static final String CatchingFishCoroutine;
    public static final CatchingFishWidgetMVVM CatchingFishDaggerWebsocket;
    public static final Set CatchingFishReduxKtor;
    public static final CatchingFishWidgetMVVM CatchingFishWorkManager;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishSnackbar;

    static {
        String CatchingFishMVPRobolectric = CatchingFishDaggerBiometric.CatchingFishMVPRobolectric("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        CatchingFishCoroutine = CatchingFishMVPRobolectric;
        String CatchingFishMVPRobolectric2 = CatchingFishDaggerBiometric.CatchingFishMVPRobolectric("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String CatchingFishMVPRobolectric3 = CatchingFishDaggerBiometric.CatchingFishMVPRobolectric("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        CatchingFishReduxKtor = Collections.unmodifiableSet(new HashSet(Arrays.asList(new CatchingFishBiometricIntent("proto"), new CatchingFishBiometricIntent("json"))));
        CatchingFishDaggerWebsocket = new CatchingFishWidgetMVVM(CatchingFishMVPRobolectric, null);
        CatchingFishWorkManager = new CatchingFishWidgetMVVM(CatchingFishMVPRobolectric2, CatchingFishMVPRobolectric3);
    }

    public CatchingFishWidgetMVVM(String str, String str2) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = str2;
    }

    public static CatchingFishWidgetMVVM CatchingFishParcelableFAB(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new CatchingFishWidgetMVVM(str2, str3);
    }
}
