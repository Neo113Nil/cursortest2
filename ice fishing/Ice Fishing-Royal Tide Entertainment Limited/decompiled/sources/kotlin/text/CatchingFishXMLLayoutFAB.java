package kotlin.text;

import java.util.Locale;

/* loaded from: classes.dex */
public final class CatchingFishXMLLayoutFAB {
    public static final CatchingFishWebSocketMockk CatchingFishDaggerWebsocket;
    public static final CatchingFishWebSocketMockk CatchingFishLayout;
    public static final CatchingFishWebSocketMockk CatchingFishReduxKtor;
    public static final CatchingFishWebSocketMockk CatchingFishViewModelFAB;
    public static final CatchingFishWebSocketMockk CatchingFishViewModelScope;
    public static final CatchingFishWebSocketMockk CatchingFishWorkManager;
    public final int CatchingFishCoroutine;
    public final CatchingFishWebSocketMockk CatchingFishParcelableFAB;
    public final CatchingFishWebSocketMockk CatchingFishSnackbar;

    static {
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = CatchingFishWebSocketMockk.CatchingFishViewModelScope;
        CatchingFishReduxKtor = CatchingFishAdMobFAB.CatchingFishJetpackCompose(":");
        CatchingFishDaggerWebsocket = CatchingFishAdMobFAB.CatchingFishJetpackCompose(":status");
        CatchingFishWorkManager = CatchingFishAdMobFAB.CatchingFishJetpackCompose(":method");
        CatchingFishViewModelScope = CatchingFishAdMobFAB.CatchingFishJetpackCompose(":path");
        CatchingFishViewModelFAB = CatchingFishAdMobFAB.CatchingFishJetpackCompose(":scheme");
        CatchingFishLayout = CatchingFishAdMobFAB.CatchingFishJetpackCompose(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatchingFishXMLLayoutFAB(String str, String str2) {
        this(CatchingFishAdMobFAB.CatchingFishJetpackCompose(str), CatchingFishAdMobFAB.CatchingFishJetpackCompose(str2));
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = CatchingFishWebSocketMockk.CatchingFishViewModelScope;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishXMLLayoutFAB) {
            CatchingFishXMLLayoutFAB catchingFishXMLLayoutFAB = (CatchingFishXMLLayoutFAB) obj;
            if (this.CatchingFishParcelableFAB.equals(catchingFishXMLLayoutFAB.CatchingFishParcelableFAB) && this.CatchingFishSnackbar.equals(catchingFishXMLLayoutFAB.CatchingFishSnackbar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishSnackbar.hashCode() + ((this.CatchingFishParcelableFAB.hashCode() + 527) * 31);
    }

    public final String toString() {
        String CatchingFishEspressoTesting = this.CatchingFishParcelableFAB.CatchingFishEspressoTesting();
        String CatchingFishEspressoTesting2 = this.CatchingFishSnackbar.CatchingFishEspressoTesting();
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        Locale locale = Locale.US;
        return CatchingFishEspressoTesting + ": " + CatchingFishEspressoTesting2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatchingFishXMLLayoutFAB(CatchingFishWebSocketMockk catchingFishWebSocketMockk, String str) {
        this(catchingFishWebSocketMockk, CatchingFishAdMobFAB.CatchingFishJetpackCompose(str));
        CatchingFishWebSocketMockk catchingFishWebSocketMockk2 = CatchingFishWebSocketMockk.CatchingFishViewModelScope;
    }

    public CatchingFishXMLLayoutFAB(CatchingFishWebSocketMockk catchingFishWebSocketMockk, CatchingFishWebSocketMockk catchingFishWebSocketMockk2) {
        this.CatchingFishParcelableFAB = catchingFishWebSocketMockk;
        this.CatchingFishSnackbar = catchingFishWebSocketMockk2;
        this.CatchingFishCoroutine = catchingFishWebSocketMockk2.CatchingFishReduxKtor() + catchingFishWebSocketMockk.CatchingFishReduxKtor() + 32;
    }
}
