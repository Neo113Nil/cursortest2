package kotlin.text;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class CatchingFishMVPGraphQL extends CatchingFishMockkViewRoom {
    public static CatchingFishMVPGraphQL CatchingFishCoroutine;
    public static final CatchingFishViewMockkFlux CatchingFishReduxKtor = new CatchingFishViewMockkFlux();
    public final Application CatchingFishSnackbar;

    public CatchingFishMVPGraphQL(Application application) {
        this.CatchingFishSnackbar = application;
    }

    @Override // kotlin.text.CatchingFishMockkViewRoom, kotlin.text.CatchingFishManifestOkHttp
    public final CatchingFishLayoutGlide CatchingFishParcelableFAB(Class cls, CatchingFishViewParcelable catchingFishViewParcelable) {
        if (this.CatchingFishSnackbar != null) {
            return CatchingFishSnackbar(cls);
        }
        Application application = (Application) catchingFishViewParcelable.CatchingFishParcelableFAB.get(CatchingFishReduxKtor);
        if (application != null) {
            return CatchingFishWorkManager(cls, application);
        }
        if (CatchingFishGoogleMapsFlux.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return CatchingFishXMLLayoutGlide.CatchingFishNavigation(cls);
    }

    @Override // kotlin.text.CatchingFishMockkViewRoom, kotlin.text.CatchingFishManifestOkHttp
    public final CatchingFishLayoutGlide CatchingFishSnackbar(Class cls) {
        Application application = this.CatchingFishSnackbar;
        if (application != null) {
            return CatchingFishWorkManager(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final CatchingFishLayoutGlide CatchingFishWorkManager(Class cls, Application application) {
        if (!CatchingFishGoogleMapsFlux.class.isAssignableFrom(cls)) {
            return CatchingFishXMLLayoutGlide.CatchingFishNavigation(cls);
        }
        try {
            CatchingFishLayoutGlide catchingFishLayoutGlide = (CatchingFishLayoutGlide) cls.getConstructor(Application.class).newInstance(application);
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishLayoutGlide);
            return catchingFishLayoutGlide;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
