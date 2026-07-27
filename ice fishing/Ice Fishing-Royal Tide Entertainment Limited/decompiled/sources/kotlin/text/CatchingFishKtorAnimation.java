package kotlin.text;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class CatchingFishKtorAnimation extends CatchingFishWebSocketMockk {
    public final transient int[] CatchingFishLayout;
    public final transient byte[][] CatchingFishViewModelFAB;

    public CatchingFishKtorAnimation(byte[][] bArr, int[] iArr) {
        super(CatchingFishWebSocketMockk.CatchingFishViewModelScope.CatchingFishReduxKtor);
        this.CatchingFishViewModelFAB = bArr;
        this.CatchingFishLayout = iArr;
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final CatchingFishWebSocketMockk CatchingFishCloudMessaging() {
        return new CatchingFishWebSocketMockk(CatchingFishUnitTesting()).CatchingFishCloudMessaging();
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final CatchingFishWebSocketMockk CatchingFishCoroutine(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.CatchingFishViewModelFAB;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.CatchingFishLayout;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(digest, "digestBytes");
        return new CatchingFishWebSocketMockk(digest);
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final String CatchingFishDaggerWebsocket() {
        return new CatchingFishWebSocketMockk(CatchingFishUnitTesting()).CatchingFishDaggerWebsocket();
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final boolean CatchingFishFragmentHandler(int i, byte[] bArr, int i2, int i3) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "other");
        if (i < 0 || i > CatchingFishReduxKtor() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int CatchingFishParcelable = CatchingFishFirebaseDagger.CatchingFishParcelable(this, i);
        while (i < i4) {
            int[] iArr = this.CatchingFishLayout;
            int i5 = CatchingFishParcelable == 0 ? 0 : iArr[CatchingFishParcelable - 1];
            int i6 = iArr[CatchingFishParcelable] - i5;
            byte[][] bArr2 = this.CatchingFishViewModelFAB;
            int i7 = iArr[bArr2.length + CatchingFishParcelable];
            int min = Math.min(i4, i6 + i5) - i;
            if (!CatchingFishXMLLayoutGlide.CatchingFishCloudMessaging((i - i5) + i7, i2, min, bArr2[CatchingFishParcelable], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            CatchingFishParcelable++;
        }
        return true;
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final boolean CatchingFishLayout(int i, CatchingFishWebSocketMockk catchingFishWebSocketMockk) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWebSocketMockk, "other");
        if (CatchingFishReduxKtor() - i >= 0) {
            int CatchingFishParcelable = CatchingFishFirebaseDagger.CatchingFishParcelable(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.CatchingFishLayout;
                int i4 = CatchingFishParcelable == 0 ? 0 : iArr[CatchingFishParcelable - 1];
                int i5 = iArr[CatchingFishParcelable] - i4;
                byte[][] bArr = this.CatchingFishViewModelFAB;
                int i6 = iArr[bArr.length + CatchingFishParcelable];
                int min = Math.min(i, i5 + i4) - i2;
                if (catchingFishWebSocketMockk.CatchingFishFragmentHandler(i3, bArr[CatchingFishParcelable], (i2 - i4) + i6, min)) {
                    i3 += min;
                    i2 += min;
                    CatchingFishParcelable++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final void CatchingFishOkHttp(CatchingFishWidgetGradle catchingFishWidgetGradle, int i) {
        int CatchingFishParcelable = CatchingFishFirebaseDagger.CatchingFishParcelable(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.CatchingFishLayout;
            int i3 = CatchingFishParcelable == 0 ? 0 : iArr[CatchingFishParcelable - 1];
            int i4 = iArr[CatchingFishParcelable] - i3;
            byte[][] bArr = this.CatchingFishViewModelFAB;
            int i5 = iArr[bArr.length + CatchingFishParcelable];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP = new CatchingFishMoshiDaggerMVP(bArr[CatchingFishParcelable], i6, i6 + min, true, false);
            CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP2 = catchingFishWidgetGradle.CatchingFishReduxKtor;
            if (catchingFishMoshiDaggerMVP2 == null) {
                catchingFishMoshiDaggerMVP.CatchingFishViewModelScope = catchingFishMoshiDaggerMVP;
                catchingFishMoshiDaggerMVP.CatchingFishWorkManager = catchingFishMoshiDaggerMVP;
                catchingFishWidgetGradle.CatchingFishReduxKtor = catchingFishMoshiDaggerMVP;
            } else {
                CatchingFishMoshiDaggerMVP catchingFishMoshiDaggerMVP3 = catchingFishMoshiDaggerMVP2.CatchingFishViewModelScope;
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishMoshiDaggerMVP3);
                catchingFishMoshiDaggerMVP3.CatchingFishSnackbar(catchingFishMoshiDaggerMVP);
            }
            i2 += min;
            CatchingFishParcelable++;
        }
        catchingFishWidgetGradle.CatchingFishDaggerWebsocket += i;
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final String CatchingFishParcelableFAB() {
        throw null;
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final int CatchingFishReduxKtor() {
        return this.CatchingFishLayout[this.CatchingFishViewModelFAB.length - 1];
    }

    public final byte[] CatchingFishUnitTesting() {
        byte[] bArr = new byte[CatchingFishReduxKtor()];
        byte[][] bArr2 = this.CatchingFishViewModelFAB;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.CatchingFishLayout;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            CatchingFishMVVMHilt.CatchingFishLayoutInflater(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final byte CatchingFishViewModelScope(int i) {
        byte[][] bArr = this.CatchingFishViewModelFAB;
        int length = bArr.length - 1;
        int[] iArr = this.CatchingFishLayout;
        CatchingFishXMLLayoutGlide.CatchingFishAnimationMockk(iArr[length], i, 1L);
        int CatchingFishParcelable = CatchingFishFirebaseDagger.CatchingFishParcelable(this, i);
        return bArr[CatchingFishParcelable][(i - (CatchingFishParcelable == 0 ? 0 : iArr[CatchingFishParcelable - 1])) + iArr[bArr.length + CatchingFishParcelable]];
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final byte[] CatchingFishWorkManager() {
        return CatchingFishUnitTesting();
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishWebSocketMockk)) {
            return false;
        }
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = (CatchingFishWebSocketMockk) obj;
        return catchingFishWebSocketMockk.CatchingFishReduxKtor() == CatchingFishReduxKtor() && CatchingFishLayout(CatchingFishReduxKtor(), catchingFishWebSocketMockk);
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final int hashCode() {
        int i = this.CatchingFishDaggerWebsocket;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.CatchingFishViewModelFAB;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.CatchingFishLayout;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.CatchingFishDaggerWebsocket = i3;
        return i3;
    }

    @Override // kotlin.text.CatchingFishWebSocketMockk
    public final String toString() {
        return new CatchingFishWebSocketMockk(CatchingFishUnitTesting()).toString();
    }
}
