package com.google.android.datatransport;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRouterModule {
    public static final boolean WinterFlowArrayNetwork;
    public static final WinterFlowPackageConsumer WinterFlowCacheManagerAgent;
    public static final Class WinterFlowHookDataSource;
    public static final Unsafe WinterFlowRouterStructure;
    public static final long WinterFlowTransactionManagerStrategy;
    public static final boolean WinterFlowUnitTestResponse;
    public static final boolean WinterFlowVariableVersionControl;

    static {
        Unsafe unsafe;
        WinterFlowControllerRepository winterFlowControllerRepository = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new WinterFlowDeployment());
        } catch (Throwable unused) {
            unsafe = null;
        }
        WinterFlowRouterStructure = unsafe;
        WinterFlowHookDataSource = WinterFlowSessionVersionControl.WinterFlowRouterStructure;
        boolean WinterFlowArrayNetwork2 = WinterFlowArrayNetwork(Long.TYPE);
        boolean WinterFlowArrayNetwork3 = WinterFlowArrayNetwork(Integer.TYPE);
        if (unsafe != null) {
            if (!WinterFlowSessionVersionControl.WinterFlowRouterStructure()) {
                winterFlowControllerRepository = new WinterFlowControllerRepository(unsafe, 2);
            } else if (WinterFlowArrayNetwork2) {
                winterFlowControllerRepository = new WinterFlowControllerRepository(unsafe, 1);
            } else if (WinterFlowArrayNetwork3) {
                winterFlowControllerRepository = new WinterFlowControllerRepository(unsafe, 0);
            }
        }
        WinterFlowCacheManagerAgent = winterFlowControllerRepository;
        WinterFlowArrayNetwork = winterFlowControllerRepository == null ? false : winterFlowControllerRepository.WinterFlowMapperProtocol();
        WinterFlowVariableVersionControl = winterFlowControllerRepository == null ? false : winterFlowControllerRepository.WinterFlowSerializerStructure();
        WinterFlowTransactionManagerStrategy = WinterFlowRouterStructure(byte[].class);
        WinterFlowRouterStructure(boolean[].class);
        WinterFlowHookDataSource(boolean[].class);
        WinterFlowRouterStructure(int[].class);
        WinterFlowHookDataSource(int[].class);
        WinterFlowRouterStructure(long[].class);
        WinterFlowHookDataSource(long[].class);
        WinterFlowRouterStructure(float[].class);
        WinterFlowHookDataSource(float[].class);
        WinterFlowRouterStructure(double[].class);
        WinterFlowHookDataSource(double[].class);
        WinterFlowRouterStructure(Object[].class);
        WinterFlowHookDataSource(Object[].class);
        Field WinterFlowCacheManagerAgent2 = WinterFlowCacheManagerAgent();
        if (WinterFlowCacheManagerAgent2 != null && winterFlowControllerRepository != null) {
            ((Unsafe) winterFlowControllerRepository.WinterFlowRouterStructure).objectFieldOffset(WinterFlowCacheManagerAgent2);
        }
        WinterFlowUnitTestResponse = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static boolean WinterFlowArrayNetwork(Class cls) {
        if (!WinterFlowSessionVersionControl.WinterFlowRouterStructure()) {
            return false;
        }
        try {
            Class cls2 = WinterFlowHookDataSource;
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

    public static void WinterFlowBandwidthObject(long j, Object obj, Object obj2) {
        ((Unsafe) WinterFlowCacheManagerAgent.WinterFlowRouterStructure).putObject(obj, j, obj2);
    }

    public static Field WinterFlowCacheManagerAgent() {
        Field field;
        Field field2;
        if (WinterFlowSessionVersionControl.WinterFlowRouterStructure()) {
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

    public static void WinterFlowHookDataSource(Class cls) {
        if (WinterFlowVariableVersionControl) {
            ((Unsafe) WinterFlowCacheManagerAgent.WinterFlowRouterStructure).arrayIndexScale(cls);
        }
    }

    public static void WinterFlowResponseEngine(byte[] bArr, long j, byte b) {
        WinterFlowCacheManagerAgent.WinterFlowOrchestrationSubsystem(bArr, WinterFlowTransactionManagerStrategy + j, b);
    }

    public static Object WinterFlowRouterRouter(long j, Object obj) {
        return ((Unsafe) WinterFlowCacheManagerAgent.WinterFlowRouterStructure).getObject(obj, j);
    }

    public static int WinterFlowRouterStructure(Class cls) {
        if (WinterFlowVariableVersionControl) {
            return ((Unsafe) WinterFlowCacheManagerAgent.WinterFlowRouterStructure).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void WinterFlowServerProtocol(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        WinterFlowThreadListener(obj, j2, ((255 & b) << i) | (WinterFlowTransactionManagerStrategy(j2, obj) & (~(255 << i))));
    }

    public static void WinterFlowServiceUtility(Object obj, long j, long j2) {
        ((Unsafe) WinterFlowCacheManagerAgent.WinterFlowRouterStructure).putLong(obj, j, j2);
    }

    public static void WinterFlowSyntax(Throwable th) {
        Logger.getLogger(WinterFlowRouterModule.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void WinterFlowThreadListener(Object obj, long j, int i) {
        ((Unsafe) WinterFlowCacheManagerAgent.WinterFlowRouterStructure).putInt(obj, j, i);
    }

    public static void WinterFlowTransactionAgent(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        WinterFlowThreadListener(obj, j2, ((255 & b) << i) | (WinterFlowTransactionManagerStrategy2 & (~(255 << i))));
    }

    public static int WinterFlowTransactionManagerStrategy(long j, Object obj) {
        return ((Unsafe) WinterFlowCacheManagerAgent.WinterFlowRouterStructure).getInt(obj, j);
    }

    public static long WinterFlowUnitTestResponse(long j, Object obj) {
        return ((Unsafe) WinterFlowCacheManagerAgent.WinterFlowRouterStructure).getLong(obj, j);
    }

    public static boolean WinterFlowVariableVersionControl(long j, Object obj) {
        return ((byte) ((WinterFlowTransactionManagerStrategy((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }
}
