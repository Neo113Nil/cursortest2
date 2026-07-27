package kotlin.text;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishReduxRetrofit extends CatchingFishHiltBundle {
    public final CatchingFishFABBundleView CatchingFishCustomView;
    public CatchingFishDaggerHiltMockk CatchingFishFragmentFactory;
    public CatchingFishServiceHandler CatchingFishJobScheduler;
    public final View CatchingFishMVPRobolectric;
    public CatchingFishServiceHandler CatchingFishMutableLiveData;
    public CatchingFishServiceHandler CatchingFishPayPalService;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishReduxRetrofit(Context context, CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishBundlePicasso catchingFishBundlePicasso, CatchingFishFirebaseHilt catchingFishFirebaseHilt, int i, CatchingFishAdMobJUnit catchingFishAdMobJUnit) {
        super(context, catchingFishBundlePicasso, i, r4, r5, catchingFishAdMobJUnit);
        View view = (View) catchingFishServiceHandler.CatchingFishFragmentHandler(context);
        CatchingFishFABBundleView catchingFishFABBundleView = new CatchingFishFABBundleView();
        catchingFishFABBundleView.CatchingFishCoroutine = new CatchingFishViewPagerRedux(7, catchingFishFABBundleView);
        this.CatchingFishMVPRobolectric = view;
        this.CatchingFishCustomView = catchingFishFABBundleView;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        Object CatchingFishSnackbar = catchingFishFirebaseHilt != null ? catchingFishFirebaseHilt.CatchingFishSnackbar(valueOf) : null;
        SparseArray<Parcelable> sparseArray = CatchingFishSnackbar instanceof SparseArray ? (SparseArray) CatchingFishSnackbar : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (catchingFishFirebaseHilt != null) {
            setSavableRegistryEntry(catchingFishFirebaseHilt.CatchingFishParcelableFAB(valueOf, new CatchingFishAdMobService(this, 2)));
        }
        CatchingFishMVI catchingFishMVI = CatchingFishMVI.CatchingFishOkHttp;
        this.CatchingFishMutableLiveData = catchingFishMVI;
        this.CatchingFishJobScheduler = catchingFishMVI;
        this.CatchingFishPayPalService = catchingFishMVI;
    }

    public static final void CatchingFishOkHttp(CatchingFishReduxRetrofit catchingFishReduxRetrofit) {
        catchingFishReduxRetrofit.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(CatchingFishDaggerHiltMockk catchingFishDaggerHiltMockk) {
        CatchingFishDaggerHiltMockk catchingFishDaggerHiltMockk2 = this.CatchingFishFragmentFactory;
        if (catchingFishDaggerHiltMockk2 != null) {
            CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = (CatchingFishAsyncTaskDagger) catchingFishDaggerHiltMockk2;
            CatchingFishPayPalService catchingFishPayPalService = (CatchingFishPayPalService) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
            String str = (String) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
            List list = (List) catchingFishPayPalService.CatchingFishCloudMessaging(str);
            if (list != null) {
                list.remove((CatchingFishAdMobService) catchingFishAsyncTaskDagger.CatchingFishViewModelScope);
            }
            if (list != null && !list.isEmpty()) {
                catchingFishPayPalService.CatchingFishOkHttp(str, list);
            }
        }
        this.CatchingFishFragmentFactory = catchingFishDaggerHiltMockk;
    }

    public final CatchingFishFABBundleView getDispatcher() {
        return this.CatchingFishCustomView;
    }

    public final CatchingFishServiceHandler getReleaseBlock() {
        return this.CatchingFishPayPalService;
    }

    public final CatchingFishServiceHandler getResetBlock() {
        return this.CatchingFishJobScheduler;
    }

    public /* bridge */ /* synthetic */ CatchingFishSnackbar getSubCompositionView() {
        return null;
    }

    public final CatchingFishServiceHandler getUpdateBlock() {
        return this.CatchingFishMutableLiveData;
    }

    public final void setReleaseBlock(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishPayPalService = catchingFishServiceHandler;
        setRelease(new CatchingFishAdMobService(this, 3));
    }

    public final void setResetBlock(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishJobScheduler = catchingFishServiceHandler;
        setReset(new CatchingFishAdMobService(this, 4));
    }

    public final void setUpdateBlock(CatchingFishServiceHandler catchingFishServiceHandler) {
        this.CatchingFishMutableLiveData = catchingFishServiceHandler;
        setUpdate(new CatchingFishAdMobService(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
