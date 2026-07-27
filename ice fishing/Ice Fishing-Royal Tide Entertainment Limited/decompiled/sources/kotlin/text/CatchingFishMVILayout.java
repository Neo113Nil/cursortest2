package kotlin.text;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class CatchingFishMVILayout extends CatchingFishJUnitRealm {
    @Override // kotlin.text.CatchingFishJUnitRealm
    public final void CatchingFishCloudMessaging(Object obj, long j, byte b) {
        this.CatchingFishParcelableFAB.putByte(obj, j, b);
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final boolean CatchingFishCoroutine(long j, Object obj) {
        return this.CatchingFishParcelableFAB.getBoolean(obj, j);
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final float CatchingFishDaggerWebsocket(long j, Object obj) {
        return this.CatchingFishParcelableFAB.getFloat(obj, j);
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final void CatchingFishEspressoTesting(Object obj, long j, double d) {
        this.CatchingFishParcelableFAB.putDouble(obj, j, d);
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final void CatchingFishFragmentHandler(Object obj, long j, boolean z) {
        this.CatchingFishParcelableFAB.putBoolean(obj, j, z);
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final boolean CatchingFishNavigation() {
        Unsafe unsafe = this.CatchingFishParcelableFAB;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (CatchingFishGradleViewModel.CatchingFishViewModelScope() != null) {
                    try {
                        Class<?> cls3 = this.CatchingFishParcelableFAB.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        CatchingFishGradleViewModel.CatchingFishParcelableFAB(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                CatchingFishGradleViewModel.CatchingFishParcelableFAB(th2);
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final void CatchingFishOkHttp(Object obj, long j, float f) {
        this.CatchingFishParcelableFAB.putFloat(obj, j, f);
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final double CatchingFishReduxKtor(long j, Object obj) {
        return this.CatchingFishParcelableFAB.getDouble(obj, j);
    }

    @Override // kotlin.text.CatchingFishJUnitRealm
    public final boolean CatchingFishRoomDatabase() {
        if (!super.CatchingFishRoomDatabase()) {
            return false;
        }
        try {
            Class<?> cls = this.CatchingFishParcelableFAB.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            CatchingFishGradleViewModel.CatchingFishParcelableFAB(th);
            return false;
        }
    }
}
