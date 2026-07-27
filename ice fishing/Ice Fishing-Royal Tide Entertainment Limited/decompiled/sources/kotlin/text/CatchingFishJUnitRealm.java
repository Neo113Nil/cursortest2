package kotlin.text;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class CatchingFishJUnitRealm {
    public final Unsafe CatchingFishParcelableFAB;

    public CatchingFishJUnitRealm(Unsafe unsafe) {
        this.CatchingFishParcelableFAB = unsafe;
    }

    public final void CatchingFishAnimationMockk(Object obj, long j, long j2) {
        this.CatchingFishParcelableFAB.putLong(obj, j, j2);
    }

    public abstract void CatchingFishCloudMessaging(Object obj, long j, byte b);

    public abstract boolean CatchingFishCoroutine(long j, Object obj);

    public abstract float CatchingFishDaggerWebsocket(long j, Object obj);

    public abstract void CatchingFishEspressoTesting(Object obj, long j, double d);

    public abstract void CatchingFishFragmentHandler(Object obj, long j, boolean z);

    public final long CatchingFishLayout(Field field) {
        return this.CatchingFishParcelableFAB.objectFieldOffset(field);
    }

    public abstract boolean CatchingFishNavigation();

    public abstract void CatchingFishOkHttp(Object obj, long j, float f);

    public final int CatchingFishParcelableFAB(Class cls) {
        return this.CatchingFishParcelableFAB.arrayBaseOffset(cls);
    }

    public abstract double CatchingFishReduxKtor(long j, Object obj);

    public boolean CatchingFishRoomDatabase() {
        Unsafe unsafe = this.CatchingFishParcelableFAB;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            CatchingFishGradleViewModel.CatchingFishParcelableFAB(th);
            return false;
        }
    }

    public final int CatchingFishSnackbar(Class cls) {
        return this.CatchingFishParcelableFAB.arrayIndexScale(cls);
    }

    public final void CatchingFishStateLiveData(long j, Object obj, Object obj2) {
        this.CatchingFishParcelableFAB.putObject(obj, j, obj2);
    }

    public final void CatchingFishUnitTesting(Object obj, long j, int i) {
        this.CatchingFishParcelableFAB.putInt(obj, j, i);
    }

    public final Object CatchingFishViewModelFAB(long j, Object obj) {
        return this.CatchingFishParcelableFAB.getObject(obj, j);
    }

    public final long CatchingFishViewModelScope(long j, Object obj) {
        return this.CatchingFishParcelableFAB.getLong(obj, j);
    }

    public final int CatchingFishWorkManager(long j, Object obj) {
        return this.CatchingFishParcelableFAB.getInt(obj, j);
    }
}
