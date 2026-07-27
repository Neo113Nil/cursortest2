package kotlin.text;

import android.view.MenuItem;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CatchingFishGlideLifecycle implements MenuItem.OnMenuItemClickListener {
    public static final Class[] CatchingFishReduxKtor = {MenuItem.class};
    public Object CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB = 0;
    public Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishGlideLifecycle() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object obj = this.CatchingFishSnackbar;
                Method method = (Method) this.CatchingFishCoroutine;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.CatchingFishSnackbar).onMenuItemClick(((CatchingFishFABHilt) this.CatchingFishCoroutine).CatchingFishDaggerWebsocket(menuItem));
        }
    }

    public CatchingFishGlideLifecycle(CatchingFishFABHilt catchingFishFABHilt, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.CatchingFishCoroutine = catchingFishFABHilt;
        this.CatchingFishSnackbar = onMenuItemClickListener;
    }
}
