package kotlin.text;

import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class CatchingFishEspressoMVVM {
    public static final BitSet CatchingFishSnackbar;
    public final String CatchingFishParcelableFAB;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        CatchingFishSnackbar = bitSet;
    }

    public CatchingFishEspressoMVVM(String str, CatchingFishMVPExoPlayer catchingFishMVPExoPlayer) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase == null) {
            throw new NullPointerException("name");
        }
        if (lowerCase.isEmpty()) {
            throw new IllegalArgumentException("token must have at least 1 tchar");
        }
        if (lowerCase.equals("connection")) {
            CatchingFishNavigationHilt.CatchingFishParcelableFAB.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char charAt = lowerCase.charAt(i);
            if (!CatchingFishSnackbar.get(charAt)) {
                throw new IllegalArgumentException(CatchingFishKtorViewModel.CatchingFish("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.CatchingFishParcelableFAB = lowerCase;
        lowerCase.getBytes(CatchingFishAdMobRealm.CatchingFishParcelableFAB);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(CatchingFishKtorViewModel.CatchingFish("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        if (catchingFishMVPExoPlayer == null) {
            throw new NullPointerException("marshaller");
        }
    }

    public static void CatchingFishParcelableFAB(String str, CatchingFishMVPExoPlayer catchingFishMVPExoPlayer) {
        new CatchingFishEspressoMVVM(str, catchingFishMVPExoPlayer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CatchingFishEspressoMVVM.class != obj.getClass()) {
            return false;
        }
        return this.CatchingFishParcelableFAB.equals(((CatchingFishEspressoMVVM) obj).CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }

    public final String toString() {
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder("Key{name='"), this.CatchingFishParcelableFAB, "'}");
    }
}
