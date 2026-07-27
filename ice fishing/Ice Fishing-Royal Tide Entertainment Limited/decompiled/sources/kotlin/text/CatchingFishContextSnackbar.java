package kotlin.text;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishContextSnackbar {
    public final float CatchingFishCoroutine;
    public final float CatchingFishDaggerWebsocket;
    public final ArrayList CatchingFishFragmentHandler;
    public final List CatchingFishLayout;
    public final String CatchingFishParcelableFAB;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishSnackbar;
    public final float CatchingFishViewModelFAB;
    public final float CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    public CatchingFishContextSnackbar(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = CatchingFishFragmentToast.CatchingFishParcelableFAB;
            list = CatchingFishViewPagerDagger.CatchingFishReduxKtor;
        }
        ArrayList arrayList = new ArrayList();
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = f;
        this.CatchingFishCoroutine = f2;
        this.CatchingFishReduxKtor = f3;
        this.CatchingFishDaggerWebsocket = f4;
        this.CatchingFishWorkManager = f5;
        this.CatchingFishViewModelScope = f6;
        this.CatchingFishViewModelFAB = f7;
        this.CatchingFishLayout = list;
        this.CatchingFishFragmentHandler = arrayList;
    }
}
