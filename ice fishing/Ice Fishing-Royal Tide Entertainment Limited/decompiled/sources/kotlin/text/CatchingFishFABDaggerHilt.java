package kotlin.text;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishFABDaggerHilt {
    public Object CatchingFishCoroutine;
    public boolean CatchingFishParcelableFAB;
    public Serializable CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;

    public CatchingFishFABDaggerHilt(boolean z) {
        this.CatchingFishParcelableFAB = z;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void CatchingFishCoroutine(String... strArr) {
        if (!this.CatchingFishParcelableFAB) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.CatchingFishReduxKtor = (String[]) strArr.clone();
    }

    public void CatchingFishParcelableFAB(String... strArr) {
        if (!this.CatchingFishParcelableFAB) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.CatchingFishCoroutine = (String[]) strArr.clone();
    }

    public void CatchingFishReduxKtor(CatchingFishGradleGradle... catchingFishGradleGradleArr) {
        if (!this.CatchingFishParcelableFAB) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[catchingFishGradleGradleArr.length];
        for (int i = 0; i < catchingFishGradleGradleArr.length; i++) {
            strArr[i] = catchingFishGradleGradleArr[i].CatchingFishReduxKtor;
        }
        CatchingFishCoroutine(strArr);
    }

    public void CatchingFishSnackbar(CatchingFishViewModelMoshi... catchingFishViewModelMoshiArr) {
        if (!this.CatchingFishParcelableFAB) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[catchingFishViewModelMoshiArr.length];
        for (int i = 0; i < catchingFishViewModelMoshiArr.length; i++) {
            strArr[i] = catchingFishViewModelMoshiArr[i].CatchingFishParcelableFAB;
        }
        CatchingFishParcelableFAB(strArr);
    }
}
