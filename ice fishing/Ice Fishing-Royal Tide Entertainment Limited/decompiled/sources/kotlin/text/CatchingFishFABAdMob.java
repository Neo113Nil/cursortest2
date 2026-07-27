package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishFABAdMob {
    public CatchingFishFABAdMob CatchingFishAnimationMockk;
    public final ArrayList CatchingFishCloudMessaging;
    public final long CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final long CatchingFishEspressoTesting;
    public final long CatchingFishFragmentHandler;
    public final int CatchingFishLayout;
    public final long CatchingFishParcelableFAB;
    public final boolean CatchingFishReduxKtor;
    public final long CatchingFishSnackbar;
    public final boolean CatchingFishViewModelFAB;
    public final long CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;
    public boolean CatchingFishOkHttp = false;
    public boolean CatchingFishUnitTesting = false;

    public CatchingFishFABAdMob(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, long j7) {
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = j2;
        this.CatchingFishCoroutine = j3;
        this.CatchingFishReduxKtor = z;
        this.CatchingFishDaggerWebsocket = f;
        this.CatchingFishWorkManager = j4;
        this.CatchingFishViewModelScope = j5;
        this.CatchingFishViewModelFAB = z2;
        this.CatchingFishLayout = i;
        this.CatchingFishFragmentHandler = j6;
        this.CatchingFishCloudMessaging = arrayList;
        this.CatchingFishEspressoTesting = j7;
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishFABAdMob catchingFishFABAdMob = this.CatchingFishAnimationMockk;
        if (catchingFishFABAdMob == null) {
            this.CatchingFishOkHttp = true;
            this.CatchingFishUnitTesting = true;
        } else if (catchingFishFABAdMob != null) {
            catchingFishFABAdMob.CatchingFishParcelableFAB();
        }
    }

    public final boolean CatchingFishSnackbar() {
        CatchingFishFABAdMob catchingFishFABAdMob = this.CatchingFishAnimationMockk;
        return catchingFishFABAdMob != null ? catchingFishFABAdMob.CatchingFishSnackbar() : this.CatchingFishOkHttp || this.CatchingFishUnitTesting;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.CatchingFishParcelableFAB + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", position=");
        sb.append((Object) CatchingFishToolbarMVIMVVM.CatchingFishReduxKtor(this.CatchingFishCoroutine));
        sb.append(", pressed=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", pressure=");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append(", previousUptimeMillis=");
        sb.append(this.CatchingFishWorkManager);
        sb.append(", previousPosition=");
        sb.append((Object) CatchingFishToolbarMVIMVVM.CatchingFishReduxKtor(this.CatchingFishViewModelScope));
        sb.append(", previousPressed=");
        sb.append(this.CatchingFishViewModelFAB);
        sb.append(", isConsumed=");
        sb.append(CatchingFishSnackbar());
        sb.append(", type=");
        int i = this.CatchingFishLayout;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        sb.append(this.CatchingFishCloudMessaging);
        sb.append(",scrollDelta=");
        sb.append((Object) CatchingFishToolbarMVIMVVM.CatchingFishReduxKtor(this.CatchingFishFragmentHandler));
        sb.append(')');
        return sb.toString();
    }
}
