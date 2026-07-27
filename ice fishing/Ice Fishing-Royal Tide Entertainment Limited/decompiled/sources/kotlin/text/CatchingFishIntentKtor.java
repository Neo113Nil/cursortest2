package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class CatchingFishIntentKtor {
    public final CatchingFishCameraXRetrofit CatchingFishCoroutine;
    public final CatchingFishCameraXRetrofit CatchingFishParcelableFAB;
    public final CatchingFishCameraXRetrofit CatchingFishSnackbar;

    public CatchingFishIntentKtor(CatchingFishCameraXRetrofit catchingFishCameraXRetrofit, CatchingFishCameraXRetrofit catchingFishCameraXRetrofit2, CatchingFishCameraXRetrofit catchingFishCameraXRetrofit3) {
        this.CatchingFishParcelableFAB = catchingFishCameraXRetrofit;
        this.CatchingFishSnackbar = catchingFishCameraXRetrofit2;
        this.CatchingFishCoroutine = catchingFishCameraXRetrofit3;
    }

    public final Method CatchingFishCoroutine(String str) {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishParcelableFAB;
        Method method = (Method) catchingFishCameraXRetrofit.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, CatchingFishIntentKtor.class.getClassLoader()).getDeclaredMethod("read", CatchingFishIntentKtor.class);
        catchingFishCameraXRetrofit.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract boolean CatchingFishDaggerWebsocket(int i);

    public final void CatchingFishLayout(CatchingFishParcelableToast catchingFishParcelableToast) {
        if (catchingFishParcelableToast == null) {
            ((CatchingFishParcelableMVP) this).CatchingFishDaggerWebsocket.writeString(null);
            return;
        }
        try {
            ((CatchingFishParcelableMVP) this).CatchingFishDaggerWebsocket.writeString(CatchingFishSnackbar(catchingFishParcelableToast.getClass()).getName());
            CatchingFishParcelableMVP CatchingFishParcelableFAB = CatchingFishParcelableFAB();
            try {
                CatchingFishReduxKtor(catchingFishParcelableToast.getClass()).invoke(null, catchingFishParcelableToast, CatchingFishParcelableFAB);
                Parcel parcel = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
                int i = CatchingFishParcelableFAB.CatchingFishLayout;
                if (i >= 0) {
                    int i2 = CatchingFishParcelableFAB.CatchingFishReduxKtor.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(catchingFishParcelableToast.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract CatchingFishParcelableMVP CatchingFishParcelableFAB();

    public final Method CatchingFishReduxKtor(Class cls) {
        String name = cls.getName();
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishSnackbar;
        Method method = (Method) catchingFishCameraXRetrofit.get(name);
        if (method != null) {
            return method;
        }
        Class CatchingFishSnackbar = CatchingFishSnackbar(cls);
        System.currentTimeMillis();
        Method declaredMethod = CatchingFishSnackbar.getDeclaredMethod("write", cls, CatchingFishIntentKtor.class);
        catchingFishCameraXRetrofit.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Class CatchingFishSnackbar(Class cls) {
        String name = cls.getName();
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishCoroutine;
        Class cls2 = (Class) catchingFishCameraXRetrofit.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        catchingFishCameraXRetrofit.put(cls.getName(), cls3);
        return cls3;
    }

    public abstract void CatchingFishViewModelFAB(int i);

    public final CatchingFishParcelableToast CatchingFishViewModelScope() {
        String readString = ((CatchingFishParcelableMVP) this).CatchingFishDaggerWebsocket.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (CatchingFishParcelableToast) CatchingFishCoroutine(readString).invoke(null, CatchingFishParcelableFAB());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Parcelable CatchingFishWorkManager(Parcelable parcelable, int i) {
        if (!CatchingFishDaggerWebsocket(i)) {
            return parcelable;
        }
        return ((CatchingFishParcelableMVP) this).CatchingFishDaggerWebsocket.readParcelable(CatchingFishParcelableMVP.class.getClassLoader());
    }
}
