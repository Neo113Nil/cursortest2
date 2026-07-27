package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class CatchingFishCoroutineFAB extends CatchingFishAccessibility {
    public static CatchingFishCoroutineFAB CatchingFishDaggerWebsocket;
    public static CatchingFishCoroutineFAB CatchingFishWorkManager;
    public final /* synthetic */ int CatchingFishCoroutine;
    public BreakIterator CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishCoroutineFAB(int i) {
        this.CatchingFishCoroutine = i;
    }

    public boolean CatchingFishCloudMessaging(int i) {
        if (i < 0 || i >= CatchingFishViewModelScope().length()) {
            return false;
        }
        return Character.isLetterOrDigit(CatchingFishViewModelScope().codePointAt(i));
    }

    public boolean CatchingFishFragmentHandler(int i) {
        if (i <= 0 || !CatchingFishCloudMessaging(i - 1)) {
            return false;
        }
        return i == CatchingFishViewModelScope().length() || !CatchingFishCloudMessaging(i);
    }

    public final void CatchingFishLayout(String str) {
        switch (this.CatchingFishCoroutine) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishParcelableFAB = str;
                BreakIterator breakIterator = this.CatchingFishReduxKtor;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                    throw null;
                }
            default:
                this.CatchingFishParcelableFAB = str;
                BreakIterator breakIterator2 = this.CatchingFishReduxKtor;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                    throw null;
                }
        }
    }

    @Override // kotlin.text.CatchingFishAccessibility
    public final int[] CatchingFishReduxKtor(int i) {
        switch (this.CatchingFishCoroutine) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = CatchingFishViewModelScope().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.CatchingFishReduxKtor;
                    if (breakIterator == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.CatchingFishReduxKtor;
                        if (breakIterator2 == null) {
                            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return CatchingFishWorkManager(i, following);
                    }
                    BreakIterator breakIterator3 = this.CatchingFishReduxKtor;
                    if (breakIterator3 == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                } while (i != -1);
                return null;
            default:
                if (CatchingFishViewModelScope().length() <= 0 || i >= CatchingFishViewModelScope().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!CatchingFishCloudMessaging(i) && (!CatchingFishCloudMessaging(i) || (i != 0 && CatchingFishCloudMessaging(i - 1)))) {
                    BreakIterator breakIterator4 = this.CatchingFishReduxKtor;
                    if (breakIterator4 == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                        throw null;
                    }
                    i = breakIterator4.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.CatchingFishReduxKtor;
                if (breakIterator5 == null) {
                    CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i);
                if (following2 == -1 || !CatchingFishFragmentHandler(following2)) {
                    return null;
                }
                return CatchingFishWorkManager(i, following2);
        }
    }

    @Override // kotlin.text.CatchingFishAccessibility
    public final int[] CatchingFishViewModelFAB(int i) {
        switch (this.CatchingFishCoroutine) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = CatchingFishViewModelScope().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.CatchingFishReduxKtor;
                    if (breakIterator == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.CatchingFishReduxKtor;
                        if (breakIterator2 == null) {
                            CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return CatchingFishWorkManager(preceding, i);
                    }
                    BreakIterator breakIterator3 = this.CatchingFishReduxKtor;
                    if (breakIterator3 == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = CatchingFishViewModelScope().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !CatchingFishCloudMessaging(i - 1) && !CatchingFishFragmentHandler(i)) {
                    BreakIterator breakIterator4 = this.CatchingFishReduxKtor;
                    if (breakIterator4 == null) {
                        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                        throw null;
                    }
                    i = breakIterator4.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.CatchingFishReduxKtor;
                if (breakIterator5 == null) {
                    CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i);
                if (preceding2 == -1 || !CatchingFishCloudMessaging(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !CatchingFishCloudMessaging(preceding2 - 1)) {
                    return CatchingFishWorkManager(preceding2, i);
                }
                return null;
        }
    }
}
