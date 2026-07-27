package kotlin.text;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class CatchingFishFABStateFlow {
    public static final CatchingFishGraphQLRealmFAB CatchingFishSnackbar = new CatchingFishGraphQLRealmFAB(0);
    public final /* synthetic */ CatchingFishToastSharedFlow CatchingFishParcelableFAB;

    public CatchingFishFABStateFlow(CatchingFishToastSharedFlow catchingFishToastSharedFlow) {
        this.CatchingFishParcelableFAB = catchingFishToastSharedFlow;
    }

    public static Class CatchingFishCoroutine(ClassLoader classLoader, String str) {
        try {
            return CatchingFishSnackbar(classLoader, str);
        } catch (ClassCastException e) {
            throw new CatchingFishBiometricView(CatchingFishMVPLiveData.CatchingFishOkHttp("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new CatchingFishBiometricView(CatchingFishMVPLiveData.CatchingFishOkHttp("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public static Class CatchingFishSnackbar(ClassLoader classLoader, String str) {
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = CatchingFishSnackbar;
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB2 = (CatchingFishGraphQLRealmFAB) catchingFishGraphQLRealmFAB.get(classLoader);
        if (catchingFishGraphQLRealmFAB2 == null) {
            catchingFishGraphQLRealmFAB2 = new CatchingFishGraphQLRealmFAB(0);
            catchingFishGraphQLRealmFAB.put(classLoader, catchingFishGraphQLRealmFAB2);
        }
        Class cls = (Class) catchingFishGraphQLRealmFAB2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        catchingFishGraphQLRealmFAB2.put(str, cls2);
        return cls2;
    }

    public final CatchingFishGoogleMapsMoshi CatchingFishParcelableFAB(String str) {
        try {
            return (CatchingFishGoogleMapsMoshi) CatchingFishCoroutine(this.CatchingFishParcelableFAB.CatchingFishJetpackCompose.CatchingFishCoroutineFlow.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new CatchingFishBiometricView(CatchingFishMVPLiveData.CatchingFishOkHttp("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new CatchingFishBiometricView(CatchingFishMVPLiveData.CatchingFishOkHttp("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new CatchingFishBiometricView(CatchingFishMVPLiveData.CatchingFishOkHttp("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new CatchingFishBiometricView(CatchingFishMVPLiveData.CatchingFishOkHttp("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
