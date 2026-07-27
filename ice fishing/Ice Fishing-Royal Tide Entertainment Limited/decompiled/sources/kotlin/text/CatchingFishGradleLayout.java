package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishGradleLayout {
    public boolean CatchingFishCoroutine;
    public final CatchingFishWidgetGradle CatchingFishParcelableFAB;
    public int CatchingFishSnackbar = Integer.MAX_VALUE;
    public CatchingFishXMLLayoutFAB[] CatchingFishDaggerWebsocket = new CatchingFishXMLLayoutFAB[8];
    public int CatchingFishWorkManager = 7;
    public int CatchingFishViewModelScope = 0;
    public int CatchingFishViewModelFAB = 0;
    public int CatchingFishReduxKtor = 4096;

    public CatchingFishGradleLayout(CatchingFishWidgetGradle catchingFishWidgetGradle) {
        this.CatchingFishParcelableFAB = catchingFishWidgetGradle;
    }

    public final void CatchingFishCoroutine(CatchingFishWebSocketMockk catchingFishWebSocketMockk) {
        CatchingFishAnimationGradle.CatchingFishReduxKtor.getClass();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < catchingFishWebSocketMockk.CatchingFishReduxKtor(); i++) {
            j2 += CatchingFishAnimationGradle.CatchingFishCoroutine[catchingFishWebSocketMockk.CatchingFishViewModelScope(i) & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int CatchingFishReduxKtor = catchingFishWebSocketMockk.CatchingFishReduxKtor();
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishParcelableFAB;
        if (i2 >= CatchingFishReduxKtor) {
            CatchingFishDaggerWebsocket(catchingFishWebSocketMockk.CatchingFishReduxKtor(), 127, 0);
            catchingFishWidgetGradle.CatchingFishCoroutineFlow(catchingFishWebSocketMockk);
            return;
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle2 = new CatchingFishWidgetGradle();
        CatchingFishAnimationGradle.CatchingFishReduxKtor.getClass();
        int i3 = 0;
        for (int i4 = 0; i4 < catchingFishWebSocketMockk.CatchingFishReduxKtor(); i4++) {
            int CatchingFishViewModelScope = catchingFishWebSocketMockk.CatchingFishViewModelScope(i4) & 255;
            int i5 = CatchingFishAnimationGradle.CatchingFishSnackbar[CatchingFishViewModelScope];
            byte b = CatchingFishAnimationGradle.CatchingFishCoroutine[CatchingFishViewModelScope];
            j = (j << b) | i5;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                catchingFishWidgetGradle2.CatchingFishCardViewView((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            catchingFishWidgetGradle2.CatchingFishCardViewView((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        CatchingFishWebSocketMockk CatchingFishViewModelFAB = catchingFishWidgetGradle2.CatchingFishViewModelFAB(catchingFishWidgetGradle2.CatchingFishDaggerWebsocket);
        CatchingFishDaggerWebsocket(CatchingFishViewModelFAB.CatchingFishReduxKtor(), 127, 128);
        catchingFishWidgetGradle.CatchingFishCoroutineFlow(CatchingFishViewModelFAB);
    }

    public final void CatchingFishDaggerWebsocket(int i, int i2, int i3) {
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishParcelableFAB;
        if (i < i2) {
            catchingFishWidgetGradle.CatchingFishCardViewView(i | i3);
            return;
        }
        catchingFishWidgetGradle.CatchingFishCardViewView(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            catchingFishWidgetGradle.CatchingFishCardViewView(128 | (i4 & 127));
            i4 >>>= 7;
        }
        catchingFishWidgetGradle.CatchingFishCardViewView(i4);
    }

    public final void CatchingFishParcelableFAB(int i) {
        int i2;
        if (i > 0) {
            int length = this.CatchingFishDaggerWebsocket.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.CatchingFishWorkManager;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.CatchingFishDaggerWebsocket[length].CatchingFishCoroutine;
                i -= i4;
                this.CatchingFishViewModelFAB -= i4;
                this.CatchingFishViewModelScope--;
                i3++;
                length--;
            }
            CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr = this.CatchingFishDaggerWebsocket;
            int i5 = i2 + 1;
            System.arraycopy(catchingFishXMLLayoutFABArr, i5, catchingFishXMLLayoutFABArr, i5 + i3, this.CatchingFishViewModelScope);
            CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr2 = this.CatchingFishDaggerWebsocket;
            int i6 = this.CatchingFishWorkManager + 1;
            Arrays.fill(catchingFishXMLLayoutFABArr2, i6, i6 + i3, (Object) null);
            this.CatchingFishWorkManager += i3;
        }
    }

    public final void CatchingFishReduxKtor(ArrayList arrayList) {
        int i;
        int i2;
        if (this.CatchingFishCoroutine) {
            int i3 = this.CatchingFishSnackbar;
            if (i3 < this.CatchingFishReduxKtor) {
                CatchingFishDaggerWebsocket(i3, 31, 32);
            }
            this.CatchingFishCoroutine = false;
            this.CatchingFishSnackbar = Integer.MAX_VALUE;
            CatchingFishDaggerWebsocket(this.CatchingFishReduxKtor, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            CatchingFishXMLLayoutFAB catchingFishXMLLayoutFAB = (CatchingFishXMLLayoutFAB) arrayList.get(i4);
            CatchingFishWebSocketMockk CatchingFishCloudMessaging = catchingFishXMLLayoutFAB.CatchingFishParcelableFAB.CatchingFishCloudMessaging();
            CatchingFishWebSocketMockk catchingFishWebSocketMockk = catchingFishXMLLayoutFAB.CatchingFishSnackbar;
            Integer num = (Integer) CatchingFishHiltMockkRealm.CatchingFishSnackbar.get(CatchingFishCloudMessaging);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (i2 > 1 && i2 < 8) {
                    CatchingFishXMLLayoutFAB[] catchingFishXMLLayoutFABArr = CatchingFishHiltMockkRealm.CatchingFishParcelableFAB;
                    if (Objects.equals(catchingFishXMLLayoutFABArr[intValue].CatchingFishSnackbar, catchingFishWebSocketMockk)) {
                        i = i2;
                    } else if (Objects.equals(catchingFishXMLLayoutFABArr[i2].CatchingFishSnackbar, catchingFishWebSocketMockk)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.CatchingFishWorkManager + 1;
                int length = this.CatchingFishDaggerWebsocket.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (Objects.equals(this.CatchingFishDaggerWebsocket[i5].CatchingFishParcelableFAB, CatchingFishCloudMessaging)) {
                        if (Objects.equals(this.CatchingFishDaggerWebsocket[i5].CatchingFishSnackbar, catchingFishWebSocketMockk)) {
                            i2 = (i5 - this.CatchingFishWorkManager) + CatchingFishHiltMockkRealm.CatchingFishParcelableFAB.length;
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.CatchingFishWorkManager) + CatchingFishHiltMockkRealm.CatchingFishParcelableFAB.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                CatchingFishDaggerWebsocket(i2, 127, 128);
            } else if (i == -1) {
                this.CatchingFishParcelableFAB.CatchingFishCardViewView(64);
                CatchingFishCoroutine(CatchingFishCloudMessaging);
                CatchingFishCoroutine(catchingFishWebSocketMockk);
                CatchingFishSnackbar(catchingFishXMLLayoutFAB);
            } else {
                CatchingFishWebSocketMockk catchingFishWebSocketMockk2 = CatchingFishXMLLayoutFAB.CatchingFishReduxKtor;
                CatchingFishCloudMessaging.getClass();
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWebSocketMockk2, "prefix");
                if (!CatchingFishCloudMessaging.CatchingFishLayout(catchingFishWebSocketMockk2.CatchingFishReduxKtor(), catchingFishWebSocketMockk2) || CatchingFishXMLLayoutFAB.CatchingFishLayout.equals(CatchingFishCloudMessaging)) {
                    CatchingFishDaggerWebsocket(i, 63, 64);
                    CatchingFishCoroutine(catchingFishWebSocketMockk);
                    CatchingFishSnackbar(catchingFishXMLLayoutFAB);
                } else {
                    CatchingFishDaggerWebsocket(i, 15, 0);
                    CatchingFishCoroutine(catchingFishWebSocketMockk);
                }
            }
        }
    }

    public final void CatchingFishSnackbar(CatchingFishXMLLayoutFAB catchingFishXMLLayoutFAB) {
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
}
