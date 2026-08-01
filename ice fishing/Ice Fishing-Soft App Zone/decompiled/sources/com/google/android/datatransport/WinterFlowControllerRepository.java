package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerRepository extends WinterFlowPackageConsumer {
    public final /* synthetic */ int WinterFlowHookDataSource;

    public WinterFlowControllerRepository(Unsafe unsafe, int i) {
        this.WinterFlowHookDataSource = i;
        this.WinterFlowRouterStructure = unsafe;
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowBandwidthObject(Object obj, long j, boolean z) {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!WinterFlowRouterModule.WinterFlowUnitTestResponse) {
                    WinterFlowRouterModule.WinterFlowServerProtocol(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    WinterFlowRouterModule.WinterFlowTransactionAgent(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            case 1:
                if (!WinterFlowRouterModule.WinterFlowUnitTestResponse) {
                    WinterFlowRouterModule.WinterFlowServerProtocol(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    WinterFlowRouterModule.WinterFlowTransactionAgent(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                ((Unsafe) this.WinterFlowRouterStructure).putBoolean(obj, j, z);
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowConcurrencyThread(Object obj, long j, double d) {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Unsafe) this.WinterFlowRouterStructure).putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                ((Unsafe) this.WinterFlowRouterStructure).putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                ((Unsafe) this.WinterFlowRouterStructure).putDouble(obj, j, d);
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final boolean WinterFlowMapperProtocol() {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            case 1:
                break;
            default:
                Unsafe unsafe = (Unsafe) this.WinterFlowRouterStructure;
                if (unsafe != null) {
                    try {
                        Class<?> cls = unsafe.getClass();
                        cls.getMethod("objectFieldOffset", Field.class);
                        Class cls2 = Long.TYPE;
                        cls.getMethod("getLong", Object.class, cls2);
                        if (WinterFlowRouterModule.WinterFlowCacheManagerAgent() != null) {
                            try {
                                Class<?> cls3 = unsafe.getClass();
                                cls3.getMethod("getByte", cls2);
                                cls3.getMethod("putByte", cls2, Byte.TYPE);
                                cls3.getMethod("getInt", cls2);
                                cls3.getMethod("putInt", cls2, Integer.TYPE);
                                cls3.getMethod("getLong", cls2);
                                cls3.getMethod("putLong", cls2, cls2);
                                cls3.getMethod("copyMemory", cls2, cls2, cls2);
                                cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                                break;
                            } catch (Throwable th) {
                                WinterFlowRouterModule.WinterFlowSyntax(th);
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        WinterFlowRouterModule.WinterFlowSyntax(th2);
                        return false;
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowOrchestrationSubsystem(Object obj, long j, byte b) {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!WinterFlowRouterModule.WinterFlowUnitTestResponse) {
                    WinterFlowRouterModule.WinterFlowServerProtocol(obj, j, b);
                    break;
                } else {
                    WinterFlowRouterModule.WinterFlowTransactionAgent(obj, j, b);
                    break;
                }
            case 1:
                if (!WinterFlowRouterModule.WinterFlowUnitTestResponse) {
                    WinterFlowRouterModule.WinterFlowServerProtocol(obj, j, b);
                    break;
                } else {
                    WinterFlowRouterModule.WinterFlowTransactionAgent(obj, j, b);
                    break;
                }
            default:
                ((Unsafe) this.WinterFlowRouterStructure).putByte(obj, j, b);
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final double WinterFlowResponseEngine(long j, Object obj) {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Double.longBitsToDouble(((Unsafe) this.WinterFlowRouterStructure).getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(((Unsafe) this.WinterFlowRouterStructure).getLong(obj, j));
            default:
                return ((Unsafe) this.WinterFlowRouterStructure).getDouble(obj, j);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public boolean WinterFlowSerializerStructure() {
        switch (this.WinterFlowHookDataSource) {
            case 2:
                if (!super.WinterFlowSerializerStructure()) {
                    return false;
                }
                try {
                    Class<?> cls = ((Unsafe) this.WinterFlowRouterStructure).getClass();
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
                    WinterFlowRouterModule.WinterFlowSyntax(th);
                    return false;
                }
            default:
                return super.WinterFlowSerializerStructure();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final float WinterFlowServerProtocol(long j, Object obj) {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Float.intBitsToFloat(((Unsafe) this.WinterFlowRouterStructure).getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(((Unsafe) this.WinterFlowRouterStructure).getInt(obj, j));
            default:
                return ((Unsafe) this.WinterFlowRouterStructure).getFloat(obj, j);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowSingletonPlatform(Object obj, long j, float f) {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Unsafe) this.WinterFlowRouterStructure).putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                ((Unsafe) this.WinterFlowRouterStructure).putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                ((Unsafe) this.WinterFlowRouterStructure).putFloat(obj, j, f);
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final boolean WinterFlowUnitTestResponse(long j, Object obj) {
        switch (this.WinterFlowHookDataSource) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return WinterFlowRouterModule.WinterFlowUnitTestResponse ? WinterFlowRouterModule.WinterFlowVariableVersionControl(j, obj) : ((byte) ((WinterFlowRouterModule.WinterFlowTransactionManagerStrategy((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            case 1:
                return WinterFlowRouterModule.WinterFlowUnitTestResponse ? WinterFlowRouterModule.WinterFlowVariableVersionControl(j, obj) : ((byte) ((WinterFlowRouterModule.WinterFlowTransactionManagerStrategy((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return ((Unsafe) this.WinterFlowRouterStructure).getBoolean(obj, j);
        }
    }
}
