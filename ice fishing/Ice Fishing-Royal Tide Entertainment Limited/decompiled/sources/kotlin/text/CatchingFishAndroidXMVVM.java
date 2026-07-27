package kotlin.text;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXMVVM {
    public final byte[] CatchingFishCoroutine;
    public final String CatchingFishDaggerWebsocket;
    public final Executor CatchingFishParcelableFAB;
    public final File CatchingFishReduxKtor;
    public final CatchingFishEspressoToast CatchingFishSnackbar;
    public byte[] CatchingFishViewModelFAB;
    public CatchingFishGlideGraphQL[] CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager = false;

    public CatchingFishAndroidXMVVM(AssetManager assetManager, Executor executor, CatchingFishEspressoToast catchingFishEspressoToast, String str, File file) {
        byte[] bArr;
        this.CatchingFishParcelableFAB = executor;
        this.CatchingFishSnackbar = catchingFishEspressoToast;
        this.CatchingFishDaggerWebsocket = str;
        this.CatchingFishReduxKtor = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = CatchingFishAdMobFAB.CatchingFishEspressoTesting;
                    break;
                case 26:
                    bArr = CatchingFishAdMobFAB.CatchingFishCloudMessaging;
                    break;
                case 27:
                    bArr = CatchingFishAdMobFAB.CatchingFishFragmentHandler;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = CatchingFishAdMobFAB.CatchingFishLayout;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = CatchingFishAdMobFAB.CatchingFishViewModelFAB;
        }
        this.CatchingFishCoroutine = bArr;
    }

    public final FileInputStream CatchingFishParcelableFAB(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void CatchingFishSnackbar(int i, Serializable serializable) {
        this.CatchingFishParcelableFAB.execute(new CatchingFishHiltViewPager(i, 2, this, serializable));
    }
}
