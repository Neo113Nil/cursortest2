package kotlin.text;

import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishSharedFlowMVP {
    public final /* synthetic */ Map CatchingFishCoroutine;
    public final /* synthetic */ CatchingFishViewWebsocket CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishServiceHandler CatchingFishReduxKtor;
    public final /* synthetic */ int CatchingFishSnackbar;
    public final /* synthetic */ CatchingFishWidgetXMLLayout CatchingFishWorkManager;

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishSharedFlowMVP(int i, int i2, Map map, CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishServiceHandler catchingFishServiceHandler2, CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = map;
        this.CatchingFishReduxKtor = catchingFishServiceHandler;
        this.CatchingFishDaggerWebsocket = (CatchingFishViewWebsocket) catchingFishServiceHandler2;
        this.CatchingFishWorkManager = catchingFishWidgetXMLLayout;
    }

    public final CatchingFishServiceHandler CatchingFishCoroutine() {
        return this.CatchingFishReduxKtor;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.text.CatchingFishServiceHandler, kotlin.text.CatchingFishViewWebsocket] */
    public final void CatchingFishDaggerWebsocket() {
        this.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler(this.CatchingFishWorkManager.CatchingFishUnitTesting);
    }

    public final Map CatchingFishParcelableFAB() {
        return this.CatchingFishCoroutine;
    }

    public final int CatchingFishReduxKtor() {
        return this.CatchingFishParcelableFAB;
    }

    public final int CatchingFishSnackbar() {
        return this.CatchingFishSnackbar;
    }
}
