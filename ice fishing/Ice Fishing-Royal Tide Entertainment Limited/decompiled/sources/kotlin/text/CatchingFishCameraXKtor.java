package kotlin.text;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class CatchingFishCameraXKtor extends CatchingFishFragmentLayout {
    public float CatchingFishCloudMessaging;
    public float CatchingFishDaggerWebsocket;
    public Paint.Cap CatchingFishEspressoTesting;
    public float CatchingFishFragmentHandler;
    public float CatchingFishLayout;
    public Paint.Join CatchingFishOkHttp;
    public CatchingFishGsonWebSocket CatchingFishReduxKtor;
    public float CatchingFishUnitTesting;
    public float CatchingFishViewModelFAB;
    public float CatchingFishViewModelScope;
    public CatchingFishGsonWebSocket CatchingFishWorkManager;

    @Override // kotlin.text.CatchingFishGsonGoogleMaps
    public final boolean CatchingFishParcelableFAB() {
        return this.CatchingFishWorkManager.CatchingFishDaggerWebsocket() || this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // kotlin.text.CatchingFishGsonGoogleMaps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishSnackbar(int[] iArr) {
        boolean z;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket;
        CatchingFishGsonWebSocket catchingFishGsonWebSocket2 = this.CatchingFishWorkManager;
        boolean z2 = true;
        if (catchingFishGsonWebSocket2.CatchingFishDaggerWebsocket()) {
            ColorStateList colorStateList = (ColorStateList) catchingFishGsonWebSocket2.CatchingFishReduxKtor;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != catchingFishGsonWebSocket2.CatchingFishSnackbar) {
                catchingFishGsonWebSocket2.CatchingFishSnackbar = colorForState;
                z = true;
                catchingFishGsonWebSocket = this.CatchingFishReduxKtor;
                if (catchingFishGsonWebSocket.CatchingFishDaggerWebsocket()) {
                    ColorStateList colorStateList2 = (ColorStateList) catchingFishGsonWebSocket.CatchingFishReduxKtor;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != catchingFishGsonWebSocket.CatchingFishSnackbar) {
                        catchingFishGsonWebSocket.CatchingFishSnackbar = colorForState2;
                        return z | z2;
                    }
                }
                z2 = false;
                return z | z2;
            }
        }
        z = false;
        catchingFishGsonWebSocket = this.CatchingFishReduxKtor;
        if (catchingFishGsonWebSocket.CatchingFishDaggerWebsocket()) {
        }
        z2 = false;
        return z | z2;
    }

    public float getFillAlpha() {
        return this.CatchingFishViewModelFAB;
    }

    public int getFillColor() {
        return this.CatchingFishWorkManager.CatchingFishSnackbar;
    }

    public float getStrokeAlpha() {
        return this.CatchingFishViewModelScope;
    }

    public int getStrokeColor() {
        return this.CatchingFishReduxKtor.CatchingFishSnackbar;
    }

    public float getStrokeWidth() {
        return this.CatchingFishDaggerWebsocket;
    }

    public float getTrimPathEnd() {
        return this.CatchingFishFragmentHandler;
    }

    public float getTrimPathOffset() {
        return this.CatchingFishCloudMessaging;
    }

    public float getTrimPathStart() {
        return this.CatchingFishLayout;
    }

    public void setFillAlpha(float f) {
        this.CatchingFishViewModelFAB = f;
    }

    public void setFillColor(int i) {
        this.CatchingFishWorkManager.CatchingFishSnackbar = i;
    }

    public void setStrokeAlpha(float f) {
        this.CatchingFishViewModelScope = f;
    }

    public void setStrokeColor(int i) {
        this.CatchingFishReduxKtor.CatchingFishSnackbar = i;
    }

    public void setStrokeWidth(float f) {
        this.CatchingFishDaggerWebsocket = f;
    }

    public void setTrimPathEnd(float f) {
        this.CatchingFishFragmentHandler = f;
    }

    public void setTrimPathOffset(float f) {
        this.CatchingFishCloudMessaging = f;
    }

    public void setTrimPathStart(float f) {
        this.CatchingFishLayout = f;
    }
}
