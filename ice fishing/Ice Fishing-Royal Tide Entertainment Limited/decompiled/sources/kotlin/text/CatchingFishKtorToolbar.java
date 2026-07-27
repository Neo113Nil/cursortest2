package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishKtorToolbar extends CatchingFishLayoutViewAdMob implements CatchingFishKtorNavigation {
    public static final CatchingFishKtorToolbar CatchingFishViewModelScope = new CatchingFishKtorToolbar(CatchingFishOkHttpIntent.CatchingFishDaggerWebsocket, 0);

    public final CatchingFishKtorToolbar CatchingFishSnackbar(CatchingFishStripeAPILayout catchingFishStripeAPILayout, CatchingFishPayPalView catchingFishPayPalView) {
        CatchingFishRoomManifest CatchingFishCoroutineFlow = this.CatchingFishReduxKtor.CatchingFishCoroutineFlow(catchingFishStripeAPILayout.hashCode(), 0, catchingFishStripeAPILayout, catchingFishPayPalView);
        return CatchingFishCoroutineFlow == null ? this : new CatchingFishKtorToolbar((CatchingFishOkHttpIntent) CatchingFishCoroutineFlow.CatchingFishDaggerWebsocket, this.CatchingFishDaggerWebsocket + CatchingFishCoroutineFlow.CatchingFishReduxKtor);
    }

    @Override // kotlin.text.CatchingFishLayoutViewAdMob, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof CatchingFishStripeAPILayout) {
            return super.containsKey((CatchingFishStripeAPILayout) obj);
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishWidget, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof CatchingFishPayPalView) {
            return super.containsValue((CatchingFishPayPalView) obj);
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishLayoutViewAdMob, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof CatchingFishStripeAPILayout) {
            return (CatchingFishPayPalView) super.get((CatchingFishStripeAPILayout) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof CatchingFishStripeAPILayout) ? obj2 : (CatchingFishPayPalView) super.getOrDefault((CatchingFishStripeAPILayout) obj, (CatchingFishPayPalView) obj2);
    }
}
