package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXContext {
    public final Object[] CatchingFishCoroutine;
    public final CatchingFishGlideWebsocket CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;

    public CatchingFishAndroidXContext(CatchingFishJUnitSharedFlow catchingFishJUnitSharedFlow, String str, Object[] objArr) {
        this.CatchingFishParcelableFAB = catchingFishJUnitSharedFlow;
        this.CatchingFishSnackbar = str;
        this.CatchingFishCoroutine = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.CatchingFishReduxKtor = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.CatchingFishReduxKtor = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int CatchingFishParcelableFAB() {
        int i = this.CatchingFishReduxKtor;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
