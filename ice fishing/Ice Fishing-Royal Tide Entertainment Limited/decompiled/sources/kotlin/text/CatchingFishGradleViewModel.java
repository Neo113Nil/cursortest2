package kotlin.text;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class CatchingFishGradleViewModel {
    public static final CatchingFishJUnitRealm CatchingFishCoroutine;
    public static final boolean CatchingFishDaggerWebsocket;
    public static final Unsafe CatchingFishParcelableFAB;
    public static final boolean CatchingFishReduxKtor;
    public static final Class CatchingFishSnackbar;
    public static final boolean CatchingFishViewModelScope;
    public static final long CatchingFishWorkManager;

    static {
        Unsafe CatchingFishLayout = CatchingFishLayout();
        CatchingFishParcelableFAB = CatchingFishLayout;
        CatchingFishSnackbar = CatchingFishStripeAPI.CatchingFishParcelableFAB;
        boolean CatchingFishViewModelFAB = CatchingFishViewModelFAB(Long.TYPE);
        boolean CatchingFishViewModelFAB2 = CatchingFishViewModelFAB(Integer.TYPE);
        CatchingFishJUnitRealm catchingFishJUnitRealm = null;
        if (CatchingFishLayout != null) {
            if (!CatchingFishStripeAPI.CatchingFishParcelableFAB()) {
                catchingFishJUnitRealm = new CatchingFishMVILayout(CatchingFishLayout);
            } else if (CatchingFishViewModelFAB) {
                catchingFishJUnitRealm = new CatchingFishBundleCardView(CatchingFishLayout, 1);
            } else if (CatchingFishViewModelFAB2) {
                catchingFishJUnitRealm = new CatchingFishBundleCardView(CatchingFishLayout, 0);
            }
        }
        CatchingFishCoroutine = catchingFishJUnitRealm;
        CatchingFishReduxKtor = catchingFishJUnitRealm == null ? false : catchingFishJUnitRealm.CatchingFishNavigation();
        CatchingFishDaggerWebsocket = catchingFishJUnitRealm == null ? false : catchingFishJUnitRealm.CatchingFishRoomDatabase();
        CatchingFishWorkManager = CatchingFishDaggerWebsocket(byte[].class);
        CatchingFishDaggerWebsocket(boolean[].class);
        CatchingFishWorkManager(boolean[].class);
        CatchingFishDaggerWebsocket(int[].class);
        CatchingFishWorkManager(int[].class);
        CatchingFishDaggerWebsocket(long[].class);
        CatchingFishWorkManager(long[].class);
        CatchingFishDaggerWebsocket(float[].class);
        CatchingFishWorkManager(float[].class);
        CatchingFishDaggerWebsocket(double[].class);
        CatchingFishWorkManager(double[].class);
        CatchingFishDaggerWebsocket(Object[].class);
        CatchingFishWorkManager(Object[].class);
        Field CatchingFishViewModelScope2 = CatchingFishViewModelScope();
        if (CatchingFishViewModelScope2 != null && catchingFishJUnitRealm != null) {
            catchingFishJUnitRealm.CatchingFishLayout(CatchingFishViewModelScope2);
        }
        CatchingFishViewModelScope = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void CatchingFishAnimationMockk(long j, Object obj, Object obj2) {
        CatchingFishCoroutine.CatchingFishStateLiveData(j, obj, obj2);
    }

    public static void CatchingFishCloudMessaging(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int CatchingFishWorkManager2 = CatchingFishCoroutine.CatchingFishWorkManager(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        CatchingFishOkHttp(obj, j2, ((255 & b) << i) | (CatchingFishWorkManager2 & (~(255 << i))));
    }

    public static boolean CatchingFishCoroutine(long j, Object obj) {
        return ((byte) ((CatchingFishCoroutine.CatchingFishWorkManager((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int CatchingFishDaggerWebsocket(Class cls) {
        if (CatchingFishDaggerWebsocket) {
            return CatchingFishCoroutine.CatchingFishParcelableFAB(cls);
        }
        return -1;
    }

    public static void CatchingFishEspressoTesting(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        CatchingFishOkHttp(obj, j2, ((255 & b) << i) | (CatchingFishCoroutine.CatchingFishWorkManager(j2, obj) & (~(255 << i))));
    }

    public static void CatchingFishFragmentHandler(byte[] bArr, long j, byte b) {
        CatchingFishCoroutine.CatchingFishCloudMessaging(bArr, CatchingFishWorkManager + j, b);
    }

    public static Unsafe CatchingFishLayout() {
        try {
            return (Unsafe) AccessController.doPrivileged(new CatchingFishIntentHiltView());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void CatchingFishOkHttp(Object obj, long j, int i) {
        CatchingFishCoroutine.CatchingFishUnitTesting(obj, j, i);
    }

    public static void CatchingFishParcelableFAB(Throwable th) {
        Logger.getLogger(CatchingFishGradleViewModel.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object CatchingFishReduxKtor(Class cls) {
        try {
            return CatchingFishParcelableFAB.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean CatchingFishSnackbar(long j, Object obj) {
        return ((byte) ((CatchingFishCoroutine.CatchingFishWorkManager((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static void CatchingFishUnitTesting(Object obj, long j, long j2) {
        CatchingFishCoroutine.CatchingFishAnimationMockk(obj, j, j2);
    }

    public static boolean CatchingFishViewModelFAB(Class cls) {
        if (!CatchingFishStripeAPI.CatchingFishParcelableFAB()) {
            return false;
        }
        try {
            Class cls2 = CatchingFishSnackbar;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field CatchingFishViewModelScope() {
        Field field;
        Field field2;
        if (CatchingFishStripeAPI.CatchingFishParcelableFAB()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void CatchingFishWorkManager(Class cls) {
        if (CatchingFishDaggerWebsocket) {
            CatchingFishCoroutine.CatchingFishSnackbar(cls);
        }
    }
}
