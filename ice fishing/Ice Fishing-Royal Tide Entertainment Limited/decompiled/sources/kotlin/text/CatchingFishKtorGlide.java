package kotlin.text;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishKtorGlide {
    public final CatchingFishAdMobMVVM CatchingFishSnackbar;
    public final ArrayList CatchingFishParcelableFAB = new ArrayList();
    public CatchingFishXMLLayoutFAB[] CatchingFishDaggerWebsocket = new CatchingFishXMLLayoutFAB[8];
    public int CatchingFishWorkManager = 7;
    public int CatchingFishViewModelScope = 0;
    public int CatchingFishViewModelFAB = 0;
    public final int CatchingFishCoroutine = 4096;
    public int CatchingFishReduxKtor = 4096;

    public CatchingFishKtorGlide(CatchingFishXMLLayoutMVI catchingFishXMLLayoutMVI) {
        this.CatchingFishSnackbar = new CatchingFishAdMobMVVM(catchingFishXMLLayoutMVI);
    }

    public final void CatchingFishCoroutine(CatchingFishXMLLayoutFAB catchingFishXMLLayoutFAB) {
        this.CatchingFishParcelableFAB.add(catchingFishXMLLayoutFAB);
        int i = catchingFishXMLLayoutFAB.CatchingFishCoroutine;
        int i2 = this.CatchingFishReduxKtor;
        if (i > i2) {
            Arrays.fill(this.CatchingFishDaggerWebsocket, (Object) null);
            this.CatchingFishWorkManager = this.CatchingFishDaggerWebsocket.length - 1;
            this.CatchingFishViewModelScope = 0;
            this.CatchingFishViewModelFAB = 0;
            return;
        }
        CatchingFishParcelableFAB((this.CatchingFishViewModelFAB + i) - i2);
        int i3 = this.CatchingFishViewModelScope + 1;
        CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr = this.CatchingFishDaggerWebsocket;
        if (i3 > catchingFishXMLLayoutFABArr.length) {
            CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr2 = new CatchingFishXMLLayoutFAB[catchingFishXMLLayoutFABArr.length * 2];
            System.arraycopy(catchingFishXMLLayoutFABArr, 0, catchingFishXMLLayoutFABArr2, catchingFishXMLLayoutFABArr.length, catchingFishXMLLayoutFABArr.length);
            this.CatchingFishWorkManager = this.CatchingFishDaggerWebsocket.length - 1;
            this.CatchingFishDaggerWebsocket = catchingFishXMLLayoutFABArr2;
        }
        int i4 = this.CatchingFishWorkManager;
        this.CatchingFishWorkManager = i4 - 1;
        this.CatchingFishDaggerWebsocket[i4] = catchingFishXMLLayoutFAB;
        this.CatchingFishViewModelScope++;
        this.CatchingFishViewModelFAB += i;
    }

    public final int CatchingFishDaggerWebsocket(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.CatchingFishSnackbar.readByte();
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }

    public final int CatchingFishParcelableFAB(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.CatchingFishDaggerWebsocket.length;
            while (true) {
                length--;
                i2 = this.CatchingFishWorkManager;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.CatchingFishDaggerWebsocket[length].CatchingFishCoroutine;
                i -= i4;
                this.CatchingFishViewModelFAB -= i4;
                this.CatchingFishViewModelScope--;
                i3++;
            }
            CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr = this.CatchingFishDaggerWebsocket;
            System.arraycopy(catchingFishXMLLayoutFABArr, i2 + 1, catchingFishXMLLayoutFABArr, i2 + 1 + i3, this.CatchingFishViewModelScope);
            this.CatchingFishWorkManager += i3;
        }
        return i3;
    }

    public final CatchingFishWebSocketMockk CatchingFishReduxKtor() {
        CatchingFishAdMobMVVM catchingFishAdMobMVVM = this.CatchingFishSnackbar;
        byte readByte = catchingFishAdMobMVVM.readByte();
        int i = readByte & 255;
        boolean z = (readByte & 128) == 128;
        int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(i, 127);
        if (!z) {
            return catchingFishAdMobMVVM.CatchingFishViewModelFAB(CatchingFishDaggerWebsocket);
        }
        CatchingFishAnimationGradle catchingFishAnimationGradle = CatchingFishAnimationGradle.CatchingFishReduxKtor;
        long j = CatchingFishDaggerWebsocket;
        catchingFishAdMobMVVM.CatchingFishJetpackCompose(j);
        byte[] CatchingFishOkHttp = catchingFishAdMobMVVM.CatchingFishDaggerWebsocket.CatchingFishOkHttp(j);
        catchingFishAnimationGradle.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CatchingFishMVIContext catchingFishMVIContext = catchingFishAnimationGradle.CatchingFishParcelableFAB;
        CatchingFishMVIContext catchingFishMVIContext2 = catchingFishMVIContext;
        int i2 = 0;
        int i3 = 0;
        for (byte b : CatchingFishOkHttp) {
            i2 = (i2 << 8) | (b & 255);
            i3 += 8;
            while (i3 >= 8) {
                catchingFishMVIContext2 = ((CatchingFishMVIContext[]) catchingFishMVIContext2.CatchingFishWorkManager)[(i2 >>> (i3 - 8)) & 255];
                if (((CatchingFishMVIContext[]) catchingFishMVIContext2.CatchingFishWorkManager) == null) {
                    byteArrayOutputStream.write(catchingFishMVIContext2.CatchingFishReduxKtor);
                    i3 -= catchingFishMVIContext2.CatchingFishDaggerWebsocket;
                    catchingFishMVIContext2 = catchingFishMVIContext;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            CatchingFishMVIContext catchingFishMVIContext3 = ((CatchingFishMVIContext[]) catchingFishMVIContext2.CatchingFishWorkManager)[(i2 << (8 - i3)) & 255];
            CatchingFishMVIContext[] catchingFishMVIContextArr = (CatchingFishMVIContext[]) catchingFishMVIContext3.CatchingFishWorkManager;
            int i4 = catchingFishMVIContext3.CatchingFishDaggerWebsocket;
            if (catchingFishMVIContextArr != null || i4 > i3) {
                break;
            }
            byteArrayOutputStream.write(catchingFishMVIContext3.CatchingFishReduxKtor);
            i3 -= i4;
            catchingFishMVIContext2 = catchingFishMVIContext;
        }
        return CatchingFishWebSocketMockk.CatchingFishViewModelFAB(byteArrayOutputStream.toByteArray());
    }

    public final CatchingFishWebSocketMockk CatchingFishSnackbar(int i) {
        if (i >= 0) {
            CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr = CatchingFishHiltMockkRealm.CatchingFishParcelableFAB;
            if (i <= catchingFishXMLLayoutFABArr.length - 1) {
                return catchingFishXMLLayoutFABArr[i].CatchingFishParcelableFAB;
            }
        }
        int length = this.CatchingFishWorkManager + 1 + (i - CatchingFishHiltMockkRealm.CatchingFishParcelableFAB.length);
        if (length >= 0) {
            CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr2 = this.CatchingFishDaggerWebsocket;
            if (length < catchingFishXMLLayoutFABArr2.length) {
                return catchingFishXMLLayoutFABArr2[length].CatchingFishParcelableFAB;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }
}
