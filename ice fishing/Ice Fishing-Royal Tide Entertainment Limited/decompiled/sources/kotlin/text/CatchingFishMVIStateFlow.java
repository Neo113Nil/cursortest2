package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMVIStateFlow implements CatchingFishLiveDataHandler {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishMVIStateFlow(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // kotlin.text.CatchingFishLiveDataHandler
    public final Object get() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) this.CatchingFishSnackbar;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new CatchingFishBundleCameraX("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new CatchingFishBundleCameraX(CatchingFishMVPLiveData.CatchingFishOkHttp("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new CatchingFishBundleCameraX(CatchingFishMVPLiveData.CatchingFishOkHttp("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new CatchingFishBundleCameraX("Could not instantiate " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new CatchingFishBundleCameraX("Could not instantiate " + str, e4);
                }
            case 1:
                return (ComponentRegistrar) this.CatchingFishSnackbar;
            default:
                return new CatchingFishOkHttpFragment((com.google.firebase.CatchingFishPagingLibrary) this.CatchingFishSnackbar);
        }
    }
}
