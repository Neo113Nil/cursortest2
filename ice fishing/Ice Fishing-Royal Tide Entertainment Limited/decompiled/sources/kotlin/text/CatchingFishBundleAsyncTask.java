package kotlin.text;

/* loaded from: classes.dex */
public class CatchingFishBundleAsyncTask {
    public final Object[] CatchingFishParcelableFAB;
    public int CatchingFishSnackbar;

    public CatchingFishBundleAsyncTask(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.CatchingFishParcelableFAB = new Object[i];
    }

    public boolean CatchingFishCoroutine(Object obj) {
        Object[] objArr;
        boolean z;
        CatchingFishFirebaseDagger.CatchingFishNavigation(obj, "instance");
        int i = this.CatchingFishSnackbar;
        int i2 = 0;
        while (true) {
            objArr = this.CatchingFishParcelableFAB;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.CatchingFishSnackbar;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.CatchingFishSnackbar = i3 + 1;
        return true;
    }

    public Object CatchingFishParcelableFAB() {
        int i = this.CatchingFishSnackbar;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.CatchingFishParcelableFAB;
        Object obj = objArr[i2];
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.CatchingFishSnackbar--;
        return obj;
    }

    public void CatchingFishSnackbar(CatchingFishLayoutExoPlayer catchingFishLayoutExoPlayer) {
        int i = this.CatchingFishSnackbar;
        Object[] objArr = this.CatchingFishParcelableFAB;
        if (i < objArr.length) {
            objArr[i] = catchingFishLayoutExoPlayer;
            this.CatchingFishSnackbar = i + 1;
        }
    }

    public CatchingFishBundleAsyncTask() {
        this.CatchingFishParcelableFAB = new Object[256];
    }
}
