package kotlin.text;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class CatchingFishMoshiCameraX implements CatchingFishWebsocketGradle, CatchingFishSpannableRedux, Serializable {
    public final CatchingFishWebsocketGradle CatchingFishReduxKtor;

    public CatchingFishMoshiCameraX(CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        this.CatchingFishReduxKtor = catchingFishWebsocketGradle;
    }

    public CatchingFishWebsocketGradle CatchingFishCloudMessaging(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement CatchingFishEspressoTesting() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        CatchingFishRecyclerViewMVI catchingFishRecyclerViewMVI = (CatchingFishRecyclerViewMVI) getClass().getAnnotation(CatchingFishRecyclerViewMVI.class);
        String str2 = null;
        if (catchingFishRecyclerViewMVI == null) {
            return null;
        }
        int v = catchingFishRecyclerViewMVI.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? catchingFishRecyclerViewMVI.l()[i] : -1;
        CatchingFishGlideJUnitFAB catchingFishGlideJUnitFAB = CatchingFishFirebaseDagger.CatchingFishLayout;
        CatchingFishGlideJUnitFAB catchingFishGlideJUnitFAB2 = CatchingFishFirebaseDagger.CatchingFishFragmentHandler;
        if (catchingFishGlideJUnitFAB2 == null) {
            try {
                CatchingFishGlideJUnitFAB catchingFishGlideJUnitFAB3 = new CatchingFishGlideJUnitFAB(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                CatchingFishFirebaseDagger.CatchingFishFragmentHandler = catchingFishGlideJUnitFAB3;
                catchingFishGlideJUnitFAB2 = catchingFishGlideJUnitFAB3;
            } catch (Exception unused2) {
                CatchingFishFirebaseDagger.CatchingFishFragmentHandler = catchingFishGlideJUnitFAB;
                catchingFishGlideJUnitFAB2 = catchingFishGlideJUnitFAB;
            }
        }
        if (catchingFishGlideJUnitFAB2 != catchingFishGlideJUnitFAB && (method = catchingFishGlideJUnitFAB2.CatchingFishParcelableFAB) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = catchingFishGlideJUnitFAB2.CatchingFishSnackbar) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = catchingFishGlideJUnitFAB2.CatchingFishCoroutine;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = catchingFishRecyclerViewMVI.c();
        } else {
            str = str2 + '/' + catchingFishRecyclerViewMVI.c();
        }
        return new StackTraceElement(str, catchingFishRecyclerViewMVI.m(), catchingFishRecyclerViewMVI.f(), i2);
    }

    public abstract Object CatchingFishOkHttp(Object obj);

    @Override // kotlin.text.CatchingFishWebsocketGradle
    public final void CatchingFishViewModelFAB(Object obj) {
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this;
        while (true) {
            CatchingFishMoshiCameraX catchingFishMoshiCameraX = (CatchingFishMoshiCameraX) catchingFishWebsocketGradle;
            CatchingFishWebsocketGradle catchingFishWebsocketGradle2 = catchingFishMoshiCameraX.CatchingFishReduxKtor;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishWebsocketGradle2);
            try {
                obj = catchingFishMoshiCameraX.CatchingFishOkHttp(obj);
                if (obj == CatchingFishXMLLayoutMockk.CatchingFishReduxKtor) {
                    return;
                }
            } catch (Throwable th) {
                obj = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
            }
            catchingFishMoshiCameraX.CatchingFishUnitTesting();
            if (!(catchingFishWebsocketGradle2 instanceof CatchingFishMoshiCameraX)) {
                catchingFishWebsocketGradle2.CatchingFishViewModelFAB(obj);
                return;
            }
            catchingFishWebsocketGradle = catchingFishWebsocketGradle2;
        }
    }

    public CatchingFishSpannableRedux CatchingFishViewModelScope() {
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = this.CatchingFishReduxKtor;
        if (catchingFishWebsocketGradle instanceof CatchingFishSpannableRedux) {
            return (CatchingFishSpannableRedux) catchingFishWebsocketGradle;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object CatchingFishEspressoTesting = CatchingFishEspressoTesting();
        if (CatchingFishEspressoTesting == null) {
            CatchingFishEspressoTesting = getClass().getName();
        }
        sb.append(CatchingFishEspressoTesting);
        return sb.toString();
    }

    public void CatchingFishUnitTesting() {
    }
}
