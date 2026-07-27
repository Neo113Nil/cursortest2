package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishDaggerSnackbar {
    public final long CatchingFishCloudMessaging;
    public final long CatchingFishCoroutine;
    public final boolean CatchingFishDaggerWebsocket;
    public final long CatchingFishFragmentHandler;
    public final ArrayList CatchingFishLayout;
    public final long CatchingFishParcelableFAB;
    public final long CatchingFishReduxKtor;
    public final long CatchingFishSnackbar;
    public final boolean CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    public CatchingFishDaggerSnackbar(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = j2;
        this.CatchingFishCoroutine = j3;
        this.CatchingFishReduxKtor = j4;
        this.CatchingFishDaggerWebsocket = z;
        this.CatchingFishWorkManager = f;
        this.CatchingFishViewModelScope = i;
        this.CatchingFishViewModelFAB = z2;
        this.CatchingFishLayout = arrayList;
        this.CatchingFishFragmentHandler = j5;
        this.CatchingFishCloudMessaging = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishDaggerSnackbar) {
            CatchingFishDaggerSnackbar catchingFishDaggerSnackbar = (CatchingFishDaggerSnackbar) obj;
            if (this.CatchingFishParcelableFAB == catchingFishDaggerSnackbar.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishDaggerSnackbar.CatchingFishSnackbar && CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(this.CatchingFishCoroutine, catchingFishDaggerSnackbar.CatchingFishCoroutine) && CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, catchingFishDaggerSnackbar.CatchingFishReduxKtor) && this.CatchingFishDaggerWebsocket == catchingFishDaggerSnackbar.CatchingFishDaggerWebsocket && Float.compare(this.CatchingFishWorkManager, catchingFishDaggerSnackbar.CatchingFishWorkManager) == 0 && this.CatchingFishViewModelScope == catchingFishDaggerSnackbar.CatchingFishViewModelScope && this.CatchingFishViewModelFAB == catchingFishDaggerSnackbar.CatchingFishViewModelFAB && this.CatchingFishLayout.equals(catchingFishDaggerSnackbar.CatchingFishLayout) && CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(this.CatchingFishFragmentHandler, catchingFishDaggerSnackbar.CatchingFishFragmentHandler) && CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(this.CatchingFishCloudMessaging, catchingFishDaggerSnackbar.CatchingFishCloudMessaging)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.CatchingFishCloudMessaging) + CatchingFishMVPLiveData.CatchingFishViewModelFAB((this.CatchingFishLayout.hashCode() + ((Boolean.hashCode(this.CatchingFishViewModelFAB) + CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishViewModelScope, CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishWorkManager, (Boolean.hashCode(this.CatchingFishDaggerWebsocket) + CatchingFishMVPLiveData.CatchingFishViewModelFAB(CatchingFishMVPLiveData.CatchingFishViewModelFAB(CatchingFishMVPLiveData.CatchingFishViewModelFAB(Long.hashCode(this.CatchingFishParcelableFAB) * 31, 31, this.CatchingFishSnackbar), 31, this.CatchingFishCoroutine), 31, this.CatchingFishReduxKtor)) * 31, 31), 31)) * 31)) * 31, 31, this.CatchingFishFragmentHandler);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.CatchingFishParcelableFAB + ')'));
        sb.append(", uptime=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", positionOnScreen=");
        sb.append((Object) CatchingFishToolbarMVIMVVM.CatchingFishReduxKtor(this.CatchingFishCoroutine));
        sb.append(", position=");
        sb.append((Object) CatchingFishToolbarMVIMVVM.CatchingFishReduxKtor(this.CatchingFishReduxKtor));
        sb.append(", down=");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append(", pressure=");
        sb.append(this.CatchingFishWorkManager);
        sb.append(", type=");
        int i = this.CatchingFishViewModelScope;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.CatchingFishViewModelFAB);
        sb.append(", historical=");
        sb.append(this.CatchingFishLayout);
        sb.append(", scrollDelta=");
        sb.append((Object) CatchingFishToolbarMVIMVVM.CatchingFishReduxKtor(this.CatchingFishFragmentHandler));
        sb.append(", originalEventPosition=");
        sb.append((Object) CatchingFishToolbarMVIMVVM.CatchingFishReduxKtor(this.CatchingFishCloudMessaging));
        sb.append(')');
        return sb.toString();
    }
}
