package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionGateway implements WinterFlowServerSyntax {
    public static final Unsafe WinterFlowBandwidthObject;
    public static final int[] WinterFlowServiceUtility = new int[0];
    public final int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final Object[] WinterFlowHookDataSource;
    public final WinterFlowAdapterQueue WinterFlowResponseEngine;
    public final int WinterFlowRouterRouter;
    public final int[] WinterFlowRouterStructure;
    public final WinterFlowServerDeserialization WinterFlowServerProtocol;
    public final int WinterFlowSyntax;
    public final WinterFlowSyntaxValidator WinterFlowThreadListener;
    public final WinterFlowSerializerUI WinterFlowTransactionAgent;
    public final boolean WinterFlowTransactionManagerStrategy;
    public final int[] WinterFlowUnitTestResponse;
    public final WinterFlowHookBackend WinterFlowVariableVersionControl;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new WinterFlowDeployment());
        } catch (Throwable unused) {
            unsafe = null;
        }
        WinterFlowBandwidthObject = unsafe;
    }

    public WinterFlowSessionGateway(int[] iArr, Object[] objArr, int i, int i2, WinterFlowHookBackend winterFlowHookBackend, int[] iArr2, int i3, int i4, WinterFlowAdapterQueue winterFlowAdapterQueue, WinterFlowSerializerUI winterFlowSerializerUI, WinterFlowServerDeserialization winterFlowServerDeserialization, WinterFlowStrategySystem winterFlowStrategySystem, WinterFlowSyntaxValidator winterFlowSyntaxValidator) {
        this.WinterFlowRouterStructure = iArr;
        this.WinterFlowHookDataSource = objArr;
        this.WinterFlowCacheManagerAgent = i;
        this.WinterFlowArrayNetwork = i2;
        this.WinterFlowTransactionManagerStrategy = winterFlowHookBackend instanceof WinterFlowDecoratorResponse;
        this.WinterFlowUnitTestResponse = iArr2;
        this.WinterFlowRouterRouter = i3;
        this.WinterFlowSyntax = i4;
        this.WinterFlowResponseEngine = winterFlowAdapterQueue;
        this.WinterFlowTransactionAgent = winterFlowSerializerUI;
        this.WinterFlowServerProtocol = winterFlowServerDeserialization;
        this.WinterFlowVariableVersionControl = winterFlowHookBackend;
        this.WinterFlowThreadListener = winterFlowSyntaxValidator;
    }

    public static long WinterFlowBackendCacheManager(long j, Object obj) {
        return ((Long) WinterFlowRouterModule.WinterFlowRouterRouter(j, obj)).longValue();
    }

    public static Field WinterFlowCacheManagerListener(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int WinterFlowConsumerUserManager(long j, Object obj) {
        return ((Integer) WinterFlowRouterModule.WinterFlowRouterRouter(j, obj)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WinterFlowSessionGateway WinterFlowMapperProtocol(WinterFlowAdapterManager winterFlowAdapterManager, WinterFlowAdapterQueue winterFlowAdapterQueue, WinterFlowSerializerUI winterFlowSerializerUI, WinterFlowServerDeserialization winterFlowServerDeserialization, WinterFlowStrategySystem winterFlowStrategySystem, WinterFlowSyntaxValidator winterFlowSyntaxValidator) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        int[] iArr2;
        int i19;
        int i20;
        Object[] objArr;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Field WinterFlowCacheManagerListener;
        char charAt10;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field WinterFlowCacheManagerListener2;
        Object obj2;
        Field WinterFlowCacheManagerListener3;
        int i30;
        char charAt11;
        int i31;
        int i32;
        char charAt12;
        int i33;
        char charAt13;
        int i34;
        char charAt14;
        if (!(winterFlowAdapterManager instanceof WinterFlowAdapterManager)) {
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return null;
        }
        String str = winterFlowAdapterManager.WinterFlowHookDataSource;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (str.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i37 = charAt15 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                charAt14 = str.charAt(i36);
                if (charAt14 < 55296) {
                    break;
                }
                i37 |= (charAt14 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            charAt15 = i37 | (charAt14 << i38);
            i36 = i34;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = WinterFlowServiceUtility;
            i4 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt16 = str.charAt(i36);
            if (charAt16 >= 55296) {
                int i40 = charAt16 & 8191;
                int i41 = 13;
                while (true) {
                    i15 = i39 + 1;
                    charAt9 = str.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i15;
                }
                charAt16 = i40 | (charAt9 << i41);
                i39 = i15;
            }
            int i42 = i39 + 1;
            int charAt17 = str.charAt(i39);
            if (charAt17 >= 55296) {
                int i43 = charAt17 & 8191;
                int i44 = 13;
                while (true) {
                    i14 = i42 + 1;
                    charAt8 = str.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i14;
                }
                charAt17 = i43 | (charAt8 << i44);
                i42 = i14;
            }
            int i45 = i42 + 1;
            int charAt18 = str.charAt(i42);
            if (charAt18 >= 55296) {
                int i46 = charAt18 & 8191;
                int i47 = 13;
                while (true) {
                    i13 = i45 + 1;
                    charAt7 = str.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i13;
                }
                charAt18 = i46 | (charAt7 << i47);
                i45 = i13;
            }
            int i48 = i45 + 1;
            int charAt19 = str.charAt(i45);
            if (charAt19 >= 55296) {
                int i49 = charAt19 & 8191;
                int i50 = 13;
                while (true) {
                    i12 = i48 + 1;
                    charAt6 = str.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i12;
                }
                charAt19 = i49 | (charAt6 << i50);
                i48 = i12;
            }
            int i51 = i48 + 1;
            charAt = str.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i11 = i51 + 1;
                    charAt5 = str.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i11;
                }
                charAt = i52 | (charAt5 << i53);
                i51 = i11;
            }
            int i54 = i51 + 1;
            int charAt20 = str.charAt(i51);
            if (charAt20 >= 55296) {
                int i55 = charAt20 & 8191;
                int i56 = 13;
                while (true) {
                    i10 = i54 + 1;
                    charAt4 = str.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i10;
                }
                charAt20 = i55 | (charAt4 << i56);
                i54 = i10;
            }
            int i57 = i54 + 1;
            int charAt21 = str.charAt(i54);
            if (charAt21 >= 55296) {
                int i58 = charAt21 & 8191;
                int i59 = 13;
                while (true) {
                    i9 = i57 + 1;
                    charAt3 = str.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i9;
                }
                charAt21 = i58 | (charAt3 << i59);
                i57 = i9;
            }
            int i60 = i57 + 1;
            int charAt22 = str.charAt(i57);
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                while (true) {
                    i8 = i60 + 1;
                    charAt2 = str.charAt(i60);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i61 |= (charAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i8;
                }
                charAt22 = i61 | (charAt2 << i62);
                i60 = i8;
            }
            int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
            int i63 = (charAt16 * 2) + charAt17;
            int i64 = charAt20;
            i2 = charAt18;
            i3 = i64;
            i4 = charAt16;
            i36 = i60;
            iArr = iArr3;
            i5 = charAt19;
            i6 = i63;
            i7 = charAt22;
        }
        Object[] objArr2 = winterFlowAdapterManager.WinterFlowCacheManagerAgent;
        Class<?> cls = winterFlowAdapterManager.WinterFlowRouterStructure.getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr3 = new Object[charAt * 2];
        int i65 = i7 + i3;
        int i66 = i65;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i36 < length) {
            int i70 = i36 + 1;
            int charAt23 = str.charAt(i36);
            if (charAt23 >= c) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    charAt13 = str.charAt(i72);
                    if (charAt13 < c) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                }
                charAt23 = i71 | (charAt13 << i73);
                i16 = i33;
            } else {
                i16 = i70;
            }
            int i74 = i16 + 1;
            int charAt24 = str.charAt(i16);
            if (charAt24 >= c) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i32 = i76 + 1;
                    charAt12 = str.charAt(i76);
                    i17 = length;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i32;
                    length = i17;
                }
                charAt24 = i75 | (charAt12 << i77);
                i18 = i32;
            } else {
                i17 = length;
                i18 = i74;
            }
            int i78 = charAt24 & 255;
            int i79 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i80 = i4;
            Unsafe unsafe = WinterFlowBandwidthObject;
            if (i78 >= 51) {
                int i81 = i18 + 1;
                int charAt25 = str.charAt(i18);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i30 = i83 + 1;
                        charAt11 = str.charAt(i83);
                        i31 = i82;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i82 = i31 | ((charAt11 & 8191) << i84);
                        i84 += 13;
                        i83 = i30;
                    }
                    charAt25 = i31 | (charAt11 << i84);
                    i28 = i30;
                } else {
                    i28 = i81;
                }
                int i85 = charAt25;
                int i86 = i78 - 51;
                int i87 = i28;
                if (i86 == 9 || i86 == 17) {
                    i29 = i6 + 1;
                    objArr3[((i69 / 3) * 2) + 1] = objArr2[i6];
                } else {
                    if (i86 == 12 && (WinterFlowResolverBackend.WinterFlowRouterStructure(winterFlowAdapterManager.WinterFlowRouterStructure(), 1) || (charAt24 & 2048) != 0)) {
                        i29 = i6 + 1;
                        objArr3[((i69 / 3) * 2) + 1] = objArr2[i6];
                    }
                    int i88 = i85 * 2;
                    obj = objArr2[i88];
                    if (obj instanceof Field) {
                        WinterFlowCacheManagerListener2 = WinterFlowCacheManagerListener(cls, (String) obj);
                        objArr2[i88] = WinterFlowCacheManagerListener2;
                    } else {
                        WinterFlowCacheManagerListener2 = (Field) obj;
                    }
                    iArr2 = iArr4;
                    i19 = i65;
                    i25 = (int) unsafe.objectFieldOffset(WinterFlowCacheManagerListener2);
                    int i89 = i88 + 1;
                    obj2 = objArr2[i89];
                    if (obj2 instanceof Field) {
                        WinterFlowCacheManagerListener3 = WinterFlowCacheManagerListener(cls, (String) obj2);
                        objArr2[i89] = WinterFlowCacheManagerListener3;
                    } else {
                        WinterFlowCacheManagerListener3 = (Field) obj2;
                    }
                    i26 = (int) unsafe.objectFieldOffset(WinterFlowCacheManagerListener3);
                    objArr = objArr3;
                    i22 = i87;
                    i24 = 0;
                }
                i6 = i29;
                int i882 = i85 * 2;
                obj = objArr2[i882];
                if (obj instanceof Field) {
                }
                iArr2 = iArr4;
                i19 = i65;
                i25 = (int) unsafe.objectFieldOffset(WinterFlowCacheManagerListener2);
                int i892 = i882 + 1;
                obj2 = objArr2[i892];
                if (obj2 instanceof Field) {
                }
                i26 = (int) unsafe.objectFieldOffset(WinterFlowCacheManagerListener3);
                objArr = objArr3;
                i22 = i87;
                i24 = 0;
            } else {
                iArr2 = iArr4;
                i19 = i65;
                int i90 = i6 + 1;
                Field WinterFlowCacheManagerListener4 = WinterFlowCacheManagerListener(cls, (String) objArr2[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i90;
                    objArr3[((i69 / 3) * 2) + 1] = WinterFlowCacheManagerListener4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i27 = i6 + 2;
                        objArr3[((i69 / 3) * 2) + 1] = objArr2[i90];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i20 = i90;
                        if (winterFlowAdapterManager.WinterFlowRouterStructure() == 1 || (charAt24 & 2048) != 0) {
                            i27 = i6 + 2;
                            objArr3[((i69 / 3) * 2) + 1] = objArr2[i20];
                        }
                    } else if (i78 == 50) {
                        int i91 = i67 + 1;
                        iArr[i67] = i69;
                        int i92 = (i69 / 3) * 2;
                        i20 = i6 + 2;
                        objArr3[i92] = objArr2[i90];
                        if ((charAt24 & 2048) != 0) {
                            objArr3[i92 + 1] = objArr2[i20];
                            i20 = i6 + 3;
                        }
                        i67 = i91;
                    } else {
                        i20 = i90;
                    }
                    i20 = i27;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(WinterFlowCacheManagerListener4);
                if ((charAt24 & 4096) == 0 || i78 > 17) {
                    objArr = objArr3;
                    i21 = 1048575;
                    i22 = i18;
                    i23 = 0;
                } else {
                    int i93 = i18 + 1;
                    int charAt26 = str.charAt(i18);
                    if (charAt26 >= 55296) {
                        int i94 = charAt26 & 8191;
                        int i95 = 13;
                        while (true) {
                            i22 = i93 + 1;
                            charAt10 = str.charAt(i93);
                            if (charAt10 < 55296) {
                                break;
                            }
                            i94 |= (charAt10 & 8191) << i95;
                            i95 += 13;
                            i93 = i22;
                        }
                        charAt26 = i94 | (charAt10 << i95);
                    } else {
                        i22 = i93;
                    }
                    int i96 = (charAt26 / 32) + (i80 * 2);
                    Object obj3 = objArr2[i96];
                    if (obj3 instanceof Field) {
                        WinterFlowCacheManagerListener = (Field) obj3;
                    } else {
                        WinterFlowCacheManagerListener = WinterFlowCacheManagerListener(cls, (String) obj3);
                        objArr2[i96] = WinterFlowCacheManagerListener;
                    }
                    objArr = objArr3;
                    i21 = (int) unsafe.objectFieldOffset(WinterFlowCacheManagerListener);
                    i23 = charAt26 % 32;
                }
                if (i78 < 18 || i78 > 49) {
                    int i97 = i21;
                    i24 = i23;
                    i25 = objectFieldOffset;
                    i26 = i97;
                } else {
                    iArr[i66] = objectFieldOffset;
                    int i98 = i21;
                    i24 = i23;
                    i25 = objectFieldOffset;
                    i26 = i98;
                    i66++;
                }
                i6 = i20;
            }
            int i99 = i69 + 1;
            iArr2[i69] = i79;
            int i100 = i69 + 2;
            String str2 = str;
            iArr2[i99] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | i25;
            i69 += 3;
            iArr2[i100] = (i24 << 20) | i26;
            objArr3 = objArr;
            str = str2;
            i36 = i22;
            length = i17;
            i4 = i80;
            iArr4 = iArr2;
            i65 = i19;
            c = 55296;
        }
        return new WinterFlowSessionGateway(iArr4, objArr3, i2, i5, winterFlowAdapterManager.WinterFlowRouterStructure, iArr, i7, i65, winterFlowAdapterQueue, winterFlowSerializerUI, winterFlowServerDeserialization, winterFlowStrategySystem, winterFlowSyntaxValidator);
    }

    public static boolean WinterFlowOrchestrationSubsystem(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof WinterFlowDecoratorResponse) {
            return ((WinterFlowDecoratorResponse) obj).WinterFlowUnitTestResponse();
        }
        return true;
    }

    public static long WinterFlowResolverController(int i) {
        return i & 1048575;
    }

    public static int WinterFlowUserManagerUserManager(int i) {
        return (i & 267386880) >>> 20;
    }

    public final void WinterFlowArrayHelper(Object obj, long j, WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowServerSyntax winterFlowServerSyntax, WinterFlowExceptionProtocol winterFlowExceptionProtocol) {
        int WinterFlowBackendCacheManager;
        this.WinterFlowTransactionAgent.getClass();
        WinterFlowXMLDecorator WinterFlowRouterStructure = WinterFlowSerializerUI.WinterFlowRouterStructure(j, obj);
        WinterFlowWorkerCompiler winterFlowWorkerCompiler = (WinterFlowWorkerCompiler) winterFlowProviderEntity.WinterFlowArrayNetwork;
        int i = winterFlowProviderEntity.WinterFlowRouterStructure;
        if ((i & 7) != 3) {
            throw WinterFlowRouterAgent.WinterFlowHookDataSource();
        }
        do {
            WinterFlowDecoratorResponse WinterFlowRouterRouter = winterFlowServerSyntax.WinterFlowRouterRouter();
            winterFlowProviderEntity.WinterFlowArrayNetwork(WinterFlowRouterRouter, winterFlowServerSyntax, winterFlowExceptionProtocol);
            winterFlowServerSyntax.WinterFlowArrayNetwork(WinterFlowRouterRouter);
            ((WinterFlowSerializerValidator) WinterFlowRouterStructure).add(WinterFlowRouterRouter);
            if (winterFlowWorkerCompiler.WinterFlowArrayNetwork() || winterFlowProviderEntity.WinterFlowCacheManagerAgent != 0) {
                return;
            } else {
                WinterFlowBackendCacheManager = winterFlowWorkerCompiler.WinterFlowBackendCacheManager();
            }
        } while (WinterFlowBackendCacheManager == i);
        winterFlowProviderEntity.WinterFlowCacheManagerAgent = WinterFlowBackendCacheManager;
    }

    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    public final void WinterFlowArrayNetwork(Object obj) {
        if (WinterFlowOrchestrationSubsystem(obj)) {
            if (obj instanceof WinterFlowDecoratorResponse) {
                WinterFlowDecoratorResponse winterFlowDecoratorResponse = (WinterFlowDecoratorResponse) obj;
                winterFlowDecoratorResponse.WinterFlowTransactionAgent(Integer.MAX_VALUE);
                winterFlowDecoratorResponse.memoizedHashCode = 0;
                winterFlowDecoratorResponse.WinterFlowRouterRouter();
            }
            int[] iArr = this.WinterFlowRouterStructure;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i);
                long j = 1048575 & WinterFlowSoftwareEngine;
                int WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine);
                Unsafe unsafe = WinterFlowBandwidthObject;
                if (WinterFlowUserManagerUserManager != 9) {
                    if (WinterFlowUserManagerUserManager != 60 && WinterFlowUserManagerUserManager != 68) {
                        switch (WinterFlowUserManagerUserManager) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.WinterFlowTransactionAgent.getClass();
                                WinterFlowSerializerValidator winterFlowSerializerValidator = (WinterFlowSerializerValidator) ((WinterFlowXMLDecorator) WinterFlowRouterModule.WinterFlowRouterRouter(j, obj));
                                if (winterFlowSerializerValidator.WinterFlowVariableVersionControl) {
                                    winterFlowSerializerValidator.WinterFlowVariableVersionControl = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.WinterFlowThreadListener.getClass();
                                    ((WinterFlowAlgorithmManager) object).WinterFlowVariableVersionControl = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (WinterFlowConcurrencyThread(iArr[i], i, obj)) {
                        WinterFlowThreadListener(i).WinterFlowArrayNetwork(unsafe.getObject(obj, j));
                    }
                }
                if (WinterFlowServiceUtility(i, obj)) {
                    WinterFlowThreadListener(i).WinterFlowArrayNetwork(unsafe.getObject(obj, j));
                }
            }
            this.WinterFlowServerProtocol.getClass();
            WinterFlowFrameworkRenderer winterFlowFrameworkRenderer = ((WinterFlowDecoratorResponse) obj).unknownFields;
            if (winterFlowFrameworkRenderer.WinterFlowVariableVersionControl) {
                winterFlowFrameworkRenderer.WinterFlowVariableVersionControl = false;
            }
        }
    }

    public final boolean WinterFlowBandwidthObject(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? WinterFlowServiceUtility(i, obj) : (i3 & i4) != 0;
    }

    public final void WinterFlowBatchUI(int i, Object obj, Object obj2) {
        int[] iArr = this.WinterFlowRouterStructure;
        int i2 = iArr[i];
        if (WinterFlowConcurrencyThread(i2, i, obj2)) {
            long WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i) & 1048575;
            Unsafe unsafe = WinterFlowBandwidthObject;
            Object object = unsafe.getObject(obj2, WinterFlowSoftwareEngine);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            WinterFlowServerSyntax WinterFlowThreadListener = WinterFlowThreadListener(i);
            if (!WinterFlowConcurrencyThread(i2, i, obj)) {
                if (WinterFlowOrchestrationSubsystem(object)) {
                    WinterFlowDecoratorResponse WinterFlowRouterRouter = WinterFlowThreadListener.WinterFlowRouterRouter();
                    WinterFlowThreadListener.WinterFlowRouterStructure(WinterFlowRouterRouter, object);
                    unsafe.putObject(obj, WinterFlowSoftwareEngine, WinterFlowRouterRouter);
                } else {
                    unsafe.putObject(obj, WinterFlowSoftwareEngine, object);
                }
                WinterFlowSoftwareProtocol(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, WinterFlowSoftwareEngine);
            if (!WinterFlowOrchestrationSubsystem(object2)) {
                WinterFlowDecoratorResponse WinterFlowRouterRouter2 = WinterFlowThreadListener.WinterFlowRouterRouter();
                WinterFlowThreadListener.WinterFlowRouterStructure(WinterFlowRouterRouter2, object2);
                unsafe.putObject(obj, WinterFlowSoftwareEngine, WinterFlowRouterRouter2);
                object2 = WinterFlowRouterRouter2;
            }
            WinterFlowThreadListener.WinterFlowRouterStructure(object2, object);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (com.google.android.datatransport.WinterFlowVariableObject.WinterFlowServerProtocol(com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r12), com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (com.google.android.datatransport.WinterFlowVariableObject.WinterFlowServerProtocol(com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r12), com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (com.google.android.datatransport.WinterFlowVariableObject.WinterFlowServerProtocol(com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r12), com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (com.google.android.datatransport.WinterFlowVariableObject.WinterFlowServerProtocol(com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r12), com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.WinterFlowUnitTestResponse(r7, r12) == r5.WinterFlowUnitTestResponse(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r12) == com.google.android.datatransport.WinterFlowRouterModule.WinterFlowUnitTestResponse(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.WinterFlowServerProtocol(r7, r12)) == java.lang.Float.floatToIntBits(r5.WinterFlowServerProtocol(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.WinterFlowResponseEngine(r7, r12)) == java.lang.Double.doubleToLongBits(r5.WinterFlowResponseEngine(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (com.google.android.datatransport.WinterFlowVariableObject.WinterFlowServerProtocol(com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r12), com.google.android.datatransport.WinterFlowRouterModule.WinterFlowRouterRouter(r7, r13)) != false) goto L105;
     */
    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WinterFlowCacheManagerAgent(WinterFlowDecoratorResponse winterFlowDecoratorResponse, WinterFlowDecoratorResponse winterFlowDecoratorResponse2) {
        int[] iArr = this.WinterFlowRouterStructure;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i);
                long j = WinterFlowSoftwareEngine & 1048575;
                switch (WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine)) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            WinterFlowPackageConsumer winterFlowPackageConsumer = WinterFlowRouterModule.WinterFlowCacheManagerAgent;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            WinterFlowPackageConsumer winterFlowPackageConsumer2 = WinterFlowRouterModule.WinterFlowCacheManagerAgent;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            WinterFlowPackageConsumer winterFlowPackageConsumer3 = WinterFlowRouterModule.WinterFlowCacheManagerAgent;
                            break;
                        }
                        z = false;
                        break;
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (WinterFlowResponseEngine(winterFlowDecoratorResponse, winterFlowDecoratorResponse2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = WinterFlowVariableObject.WinterFlowServerProtocol(WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse), WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse2));
                        break;
                    case 50:
                        z = WinterFlowVariableObject.WinterFlowServerProtocol(WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse), WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j2, winterFlowDecoratorResponse) == WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j2, winterFlowDecoratorResponse2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.WinterFlowServerProtocol.getClass();
                if (winterFlowDecoratorResponse.unknownFields.equals(winterFlowDecoratorResponse2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void WinterFlowCompilerVariable(Object obj, int i, WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowServerSyntax winterFlowServerSyntax, WinterFlowExceptionProtocol winterFlowExceptionProtocol) {
        int WinterFlowBackendCacheManager;
        this.WinterFlowTransactionAgent.getClass();
        WinterFlowXMLDecorator WinterFlowRouterStructure = WinterFlowSerializerUI.WinterFlowRouterStructure(i & 1048575, obj);
        WinterFlowWorkerCompiler winterFlowWorkerCompiler = (WinterFlowWorkerCompiler) winterFlowProviderEntity.WinterFlowArrayNetwork;
        int i2 = winterFlowProviderEntity.WinterFlowRouterStructure;
        if ((i2 & 7) != 2) {
            throw WinterFlowRouterAgent.WinterFlowHookDataSource();
        }
        do {
            WinterFlowDecoratorResponse WinterFlowRouterRouter = winterFlowServerSyntax.WinterFlowRouterRouter();
            winterFlowProviderEntity.WinterFlowVariableVersionControl(WinterFlowRouterRouter, winterFlowServerSyntax, winterFlowExceptionProtocol);
            winterFlowServerSyntax.WinterFlowArrayNetwork(WinterFlowRouterRouter);
            ((WinterFlowSerializerValidator) WinterFlowRouterStructure).add(WinterFlowRouterRouter);
            if (winterFlowWorkerCompiler.WinterFlowArrayNetwork() || winterFlowProviderEntity.WinterFlowCacheManagerAgent != 0) {
                return;
            } else {
                WinterFlowBackendCacheManager = winterFlowWorkerCompiler.WinterFlowBackendCacheManager();
            }
        } while (WinterFlowBackendCacheManager == i2);
        winterFlowProviderEntity.WinterFlowCacheManagerAgent = WinterFlowBackendCacheManager;
    }

    public final boolean WinterFlowConcurrencyThread(int i, int i2, Object obj) {
        return WinterFlowRouterModule.WinterFlowTransactionManagerStrategy((long) (this.WinterFlowRouterStructure[i2 + 2] & 1048575), obj) == i;
    }

    public final void WinterFlowConfigurationSubsystem(int i, WinterFlowProviderEntity winterFlowProviderEntity, Object obj) {
        WinterFlowWorkerCompiler winterFlowWorkerCompiler = (WinterFlowWorkerCompiler) winterFlowProviderEntity.WinterFlowArrayNetwork;
        if ((536870912 & i) != 0) {
            winterFlowProviderEntity.WinterFlowConsumerUserManager(2);
            WinterFlowRouterModule.WinterFlowBandwidthObject(i & 1048575, obj, winterFlowWorkerCompiler.WinterFlowConsumerUserManager());
        } else if (!this.WinterFlowTransactionManagerStrategy) {
            WinterFlowRouterModule.WinterFlowBandwidthObject(i & 1048575, obj, winterFlowProviderEntity.WinterFlowUnitTestResponse());
        } else {
            winterFlowProviderEntity.WinterFlowConsumerUserManager(2);
            WinterFlowRouterModule.WinterFlowBandwidthObject(i & 1048575, obj, winterFlowWorkerCompiler.WinterFlowResolverController());
        }
    }

    public final int WinterFlowEventEmitterController(int i) {
        if (i < this.WinterFlowCacheManagerAgent || i > this.WinterFlowArrayNetwork) {
            return -1;
        }
        int[] iArr = this.WinterFlowRouterStructure;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    public final void WinterFlowHookDataSource(Object obj, WinterFlowJSONDecorator winterFlowJSONDecorator) {
        int i;
        int i2;
        int i3;
        boolean z;
        WinterFlowSessionGateway winterFlowSessionGateway = this;
        winterFlowJSONDecorator.getClass();
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        int[] iArr = winterFlowSessionGateway.WinterFlowRouterStructure;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int WinterFlowSoftwareEngine = winterFlowSessionGateway.WinterFlowSoftwareEngine(i6);
            int i8 = iArr[i6];
            int WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine);
            Unsafe unsafe = WinterFlowBandwidthObject;
            if (WinterFlowUserManagerUserManager <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = WinterFlowSoftwareEngine;
                i3 = i11;
            } else {
                i = 1;
                i2 = WinterFlowSoftwareEngine;
                i3 = 0;
            }
            long j = i2 & i4;
            switch (WinterFlowUserManagerUserManager) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowBatchUI(i8, Double.doubleToRawLongBits(WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowResponseEngine(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i8, Float.floatToRawIntBits(WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowServerProtocol(j, obj)));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 2:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i8, unsafe.getLong(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 3:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i8, unsafe.getLong(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 4:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowSerializerStructure(i8, unsafe.getInt(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowBatchUI(i8, unsafe.getLong(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i8, unsafe.getInt(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowBandwidthObject(i8, WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse(j, obj));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            winterFlowSessionManagerSingleton.WinterFlowBackendCacheManager((String) object, i8);
                        } else {
                            winterFlowSessionManagerSingleton.WinterFlowOrchestrationSubsystem(i8, (WinterFlowMicroserviceCloud) object);
                        }
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 9:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowConsumerUserManager(i8, (WinterFlowHookBackend) unsafe.getObject(obj, j), winterFlowSessionGateway.WinterFlowThreadListener(i6));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowOrchestrationSubsystem(i8, (WinterFlowMicroserviceCloud) unsafe.getObject(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 11:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowCompilerVariable(i8, unsafe.getInt(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 12:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowSerializerStructure(i8, unsafe.getInt(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 13:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i8, unsafe.getInt(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 14:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowSessionManagerSingleton.WinterFlowBatchUI(i8, unsafe.getLong(obj, j));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 15:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j);
                        winterFlowSessionManagerSingleton.WinterFlowCompilerVariable(i8, (i12 >> 31) ^ (i12 << 1));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 16:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i8, (j2 >> 63) ^ (j2 << 1));
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 17:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(obj, i6, i5, i7, i3)) {
                        winterFlowJSONDecorator.WinterFlowSerializerStructure(i8, unsafe.getObject(obj, j), winterFlowSessionGateway.WinterFlowThreadListener(i6));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    WinterFlowVariableObject.WinterFlowServiceUtility(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 19:
                    WinterFlowVariableObject.WinterFlowSingletonPlatform(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 20:
                    WinterFlowVariableObject.WinterFlowBatchUI(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 21:
                    WinterFlowVariableObject.WinterFlowBackendCacheManager(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 22:
                    WinterFlowVariableObject.WinterFlowVariableBandwidth(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 23:
                    WinterFlowVariableObject.WinterFlowConcurrencyThread(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 24:
                    WinterFlowVariableObject.WinterFlowOrchestrationSubsystem(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 25:
                    WinterFlowVariableObject.WinterFlowThreadListener(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = WinterFlowVariableObject.WinterFlowRouterStructure;
                    if (list != null && !list.isEmpty()) {
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            winterFlowSessionManagerSingleton.WinterFlowBackendCacheManager((String) list.get(i14), i13);
                        }
                    }
                    break;
                case 27:
                    int i15 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    WinterFlowServerSyntax WinterFlowThreadListener = winterFlowSessionGateway.WinterFlowThreadListener(i6);
                    Class cls2 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            winterFlowSessionManagerSingleton.WinterFlowConsumerUserManager(i15, (WinterFlowHookBackend) list2.get(i16), WinterFlowThreadListener);
                        }
                    }
                    break;
                case 28:
                    int i17 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            winterFlowSessionManagerSingleton.WinterFlowOrchestrationSubsystem(i17, (WinterFlowMicroserviceCloud) list3.get(i18));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    WinterFlowVariableObject.WinterFlowConsumerUserManager(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 30:
                    z = false;
                    WinterFlowVariableObject.WinterFlowBandwidthObject(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 31:
                    z = false;
                    WinterFlowVariableObject.WinterFlowRouterAdapter(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 32:
                    z = false;
                    WinterFlowVariableObject.WinterFlowSerializerStructure(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 33:
                    z = false;
                    WinterFlowVariableObject.WinterFlowMapperProtocol(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 34:
                    z = false;
                    WinterFlowVariableObject.WinterFlowResolverController(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, false);
                    break;
                case 35:
                    WinterFlowVariableObject.WinterFlowServiceUtility(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 36:
                    WinterFlowVariableObject.WinterFlowSingletonPlatform(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 37:
                    WinterFlowVariableObject.WinterFlowBatchUI(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 38:
                    WinterFlowVariableObject.WinterFlowBackendCacheManager(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 39:
                    WinterFlowVariableObject.WinterFlowVariableBandwidth(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 40:
                    WinterFlowVariableObject.WinterFlowConcurrencyThread(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 41:
                    WinterFlowVariableObject.WinterFlowOrchestrationSubsystem(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 42:
                    WinterFlowVariableObject.WinterFlowThreadListener(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 43:
                    WinterFlowVariableObject.WinterFlowConsumerUserManager(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 44:
                    WinterFlowVariableObject.WinterFlowBandwidthObject(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 45:
                    WinterFlowVariableObject.WinterFlowRouterAdapter(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 46:
                    WinterFlowVariableObject.WinterFlowSerializerStructure(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 47:
                    WinterFlowVariableObject.WinterFlowMapperProtocol(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, i == true ? 1 : 0);
                    break;
                case 48:
                    WinterFlowVariableObject.WinterFlowResolverController(iArr[i6], (List) unsafe.getObject(obj, j), winterFlowJSONDecorator, true);
                    break;
                case 49:
                    int i19 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    WinterFlowServerSyntax WinterFlowThreadListener2 = winterFlowSessionGateway.WinterFlowThreadListener(i6);
                    Class cls4 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            winterFlowJSONDecorator.WinterFlowSerializerStructure(i19, list4.get(i20), WinterFlowThreadListener2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i21 = 2;
                        Object obj2 = winterFlowSessionGateway.WinterFlowHookDataSource[(i6 / 3) * 2];
                        winterFlowSessionGateway.WinterFlowThreadListener.getClass();
                        WinterFlowObjectPackage winterFlowObjectPackage = ((WinterFlowTransactionModule) obj2).WinterFlowRouterStructure;
                        for (Map.Entry entry : ((WinterFlowAlgorithmManager) object2).entrySet()) {
                            winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i8, i21);
                            winterFlowSessionManagerSingleton.WinterFlowConfigurationSubsystem(WinterFlowTransactionModule.WinterFlowRouterStructure(winterFlowObjectPackage, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            WinterFlowWorkerSystem.WinterFlowHookDataSource(winterFlowSessionManagerSingleton, (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy, i, key);
                            i21 = 2;
                            WinterFlowWorkerSystem.WinterFlowHookDataSource(winterFlowSessionManagerSingleton, (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse, 2, value);
                            i = 1;
                        }
                    }
                    break;
                case 51:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowBatchUI(i8, Double.doubleToRawLongBits(((Double) WinterFlowRouterModule.WinterFlowRouterRouter(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i8, Float.floatToRawIntBits(((Float) WinterFlowRouterModule.WinterFlowRouterRouter(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i8, WinterFlowBackendCacheManager(j, obj));
                    }
                    break;
                case 54:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i8, WinterFlowBackendCacheManager(j, obj));
                    }
                    break;
                case 55:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowSerializerStructure(i8, WinterFlowConsumerUserManager(j, obj));
                    }
                    break;
                case 56:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowBatchUI(i8, WinterFlowBackendCacheManager(j, obj));
                    }
                    break;
                case 57:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i8, WinterFlowConsumerUserManager(j, obj));
                    }
                    break;
                case 58:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowBandwidthObject(i8, ((Boolean) WinterFlowRouterModule.WinterFlowRouterRouter(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            winterFlowSessionManagerSingleton.WinterFlowBackendCacheManager((String) object3, i8);
                        } else {
                            winterFlowSessionManagerSingleton.WinterFlowOrchestrationSubsystem(i8, (WinterFlowMicroserviceCloud) object3);
                        }
                    }
                    break;
                case 60:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowConsumerUserManager(i8, (WinterFlowHookBackend) unsafe.getObject(obj, j), winterFlowSessionGateway.WinterFlowThreadListener(i6));
                    }
                    break;
                case 61:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowOrchestrationSubsystem(i8, (WinterFlowMicroserviceCloud) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowCompilerVariable(i8, WinterFlowConsumerUserManager(j, obj));
                    }
                    break;
                case 63:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowSerializerStructure(i8, WinterFlowConsumerUserManager(j, obj));
                    }
                    break;
                case 64:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i8, WinterFlowConsumerUserManager(j, obj));
                    }
                    break;
                case 65:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowSessionManagerSingleton.WinterFlowBatchUI(i8, WinterFlowBackendCacheManager(j, obj));
                    }
                    break;
                case 66:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        int WinterFlowConsumerUserManager = WinterFlowConsumerUserManager(j, obj);
                        winterFlowSessionManagerSingleton.WinterFlowCompilerVariable(i8, (WinterFlowConsumerUserManager >> 31) ^ (WinterFlowConsumerUserManager << 1));
                    }
                    break;
                case 67:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        long WinterFlowBackendCacheManager = WinterFlowBackendCacheManager(j, obj);
                        winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i8, (WinterFlowBackendCacheManager << (i == true ? 1L : 0L)) ^ (WinterFlowBackendCacheManager >> 63));
                    }
                    break;
                case 68:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i6, obj)) {
                        winterFlowJSONDecorator.WinterFlowSerializerStructure(i8, unsafe.getObject(obj, j), winterFlowSessionGateway.WinterFlowThreadListener(i6));
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        winterFlowSessionGateway.WinterFlowServerProtocol.getClass();
        ((WinterFlowDecoratorResponse) obj).unknownFields.WinterFlowArrayNetwork(winterFlowJSONDecorator);
    }

    public final void WinterFlowPackageIDE(int i, Object obj) {
        int i2 = this.WinterFlowRouterStructure[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        WinterFlowRouterModule.WinterFlowThreadListener(obj, j, (1 << (i2 >>> 20)) | WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, obj));
    }

    public final boolean WinterFlowResponseEngine(WinterFlowDecoratorResponse winterFlowDecoratorResponse, WinterFlowDecoratorResponse winterFlowDecoratorResponse2, int i) {
        return WinterFlowServiceUtility(i, winterFlowDecoratorResponse) == WinterFlowServiceUtility(i, winterFlowDecoratorResponse2);
    }

    public final Object WinterFlowRouterAdapter(int i, Object obj) {
        WinterFlowServerSyntax WinterFlowThreadListener = WinterFlowThreadListener(i);
        long WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i) & 1048575;
        if (!WinterFlowServiceUtility(i, obj)) {
            return WinterFlowThreadListener.WinterFlowRouterRouter();
        }
        Object object = WinterFlowBandwidthObject.getObject(obj, WinterFlowSoftwareEngine);
        if (WinterFlowOrchestrationSubsystem(object)) {
            return object;
        }
        WinterFlowDecoratorResponse WinterFlowRouterRouter = WinterFlowThreadListener.WinterFlowRouterRouter();
        if (object != null) {
            WinterFlowThreadListener.WinterFlowRouterStructure(WinterFlowRouterRouter, object);
        }
        return WinterFlowRouterRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    public final WinterFlowDecoratorResponse WinterFlowRouterRouter() {
        this.WinterFlowResponseEngine.getClass();
        return ((WinterFlowDecoratorResponse) this.WinterFlowVariableVersionControl).WinterFlowSyntax();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    public final void WinterFlowRouterStructure(Object obj, Object obj2) {
        Object obj3;
        if (!WinterFlowOrchestrationSubsystem(obj)) {
            WinterFlowEventEmitterOrchestration.WinterFlowTransactionManagerStrategy(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.WinterFlowRouterStructure;
            if (i >= iArr.length) {
                WinterFlowVariableObject.WinterFlowTransactionAgent(this.WinterFlowServerProtocol, obj, obj2);
                return;
            }
            int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i);
            long j = 1048575 & WinterFlowSoftwareEngine;
            int i2 = iArr[i];
            switch (WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowPackageConsumer winterFlowPackageConsumer = WinterFlowRouterModule.WinterFlowCacheManagerAgent;
                        obj3 = obj;
                        winterFlowPackageConsumer.WinterFlowConcurrencyThread(obj3, j, winterFlowPackageConsumer.WinterFlowResponseEngine(j, obj2));
                        WinterFlowPackageIDE(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowPackageConsumer winterFlowPackageConsumer2 = WinterFlowRouterModule.WinterFlowCacheManagerAgent;
                        winterFlowPackageConsumer2.WinterFlowSingletonPlatform(obj, j, winterFlowPackageConsumer2.WinterFlowServerProtocol(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowServiceUtility(obj, j, WinterFlowRouterModule.WinterFlowUnitTestResponse(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowServiceUtility(obj, j, WinterFlowRouterModule.WinterFlowUnitTestResponse(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowThreadListener(obj, j, WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowServiceUtility(obj, j, WinterFlowRouterModule.WinterFlowUnitTestResponse(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowThreadListener(obj, j, WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowPackageConsumer winterFlowPackageConsumer3 = WinterFlowRouterModule.WinterFlowCacheManagerAgent;
                        winterFlowPackageConsumer3.WinterFlowBandwidthObject(obj, j, winterFlowPackageConsumer3.WinterFlowUnitTestResponse(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowBandwidthObject(j, obj, WinterFlowRouterModule.WinterFlowRouterRouter(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    WinterFlowVariableBandwidth(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowBandwidthObject(j, obj, WinterFlowRouterModule.WinterFlowRouterRouter(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowThreadListener(obj, j, WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowThreadListener(obj, j, WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowThreadListener(obj, j, WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowServiceUtility(obj, j, WinterFlowRouterModule.WinterFlowUnitTestResponse(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowThreadListener(obj, j, WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (WinterFlowServiceUtility(i, obj2)) {
                        WinterFlowRouterModule.WinterFlowServiceUtility(obj, j, WinterFlowRouterModule.WinterFlowUnitTestResponse(j, obj2));
                        WinterFlowPackageIDE(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    WinterFlowVariableBandwidth(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.WinterFlowTransactionAgent.getClass();
                    WinterFlowXMLDecorator winterFlowXMLDecorator = (WinterFlowXMLDecorator) WinterFlowRouterModule.WinterFlowRouterRouter(j, obj);
                    WinterFlowXMLDecorator winterFlowXMLDecorator2 = (WinterFlowXMLDecorator) WinterFlowRouterModule.WinterFlowRouterRouter(j, obj2);
                    int i3 = ((WinterFlowSerializerValidator) winterFlowXMLDecorator).WinterFlowUnitTestResponse;
                    int i4 = ((WinterFlowSerializerValidator) winterFlowXMLDecorator2).WinterFlowUnitTestResponse;
                    if (i3 > 0 && i4 > 0) {
                        if (!((WinterFlowSerializerValidator) winterFlowXMLDecorator).WinterFlowVariableVersionControl) {
                            winterFlowXMLDecorator = ((WinterFlowSerializerValidator) winterFlowXMLDecorator).WinterFlowArrayNetwork(i4 + i3);
                        }
                        ((WinterFlowSerializerValidator) winterFlowXMLDecorator).addAll(winterFlowXMLDecorator2);
                    }
                    if (i3 > 0) {
                        winterFlowXMLDecorator2 = winterFlowXMLDecorator;
                    }
                    WinterFlowRouterModule.WinterFlowBandwidthObject(j, obj, winterFlowXMLDecorator2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = WinterFlowVariableObject.WinterFlowRouterStructure;
                    Object WinterFlowRouterRouter = WinterFlowRouterModule.WinterFlowRouterRouter(j, obj);
                    Object WinterFlowRouterRouter2 = WinterFlowRouterModule.WinterFlowRouterRouter(j, obj2);
                    this.WinterFlowThreadListener.getClass();
                    WinterFlowRouterModule.WinterFlowBandwidthObject(j, obj, WinterFlowSyntaxValidator.WinterFlowRouterStructure(WinterFlowRouterRouter, WinterFlowRouterRouter2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (WinterFlowConcurrencyThread(i2, i, obj2)) {
                        WinterFlowRouterModule.WinterFlowBandwidthObject(j, obj, WinterFlowRouterModule.WinterFlowRouterRouter(j, obj2));
                        WinterFlowSoftwareProtocol(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    WinterFlowBatchUI(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (WinterFlowConcurrencyThread(i2, i, obj2)) {
                        WinterFlowRouterModule.WinterFlowBandwidthObject(j, obj, WinterFlowRouterModule.WinterFlowRouterRouter(j, obj2));
                        WinterFlowSoftwareProtocol(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    WinterFlowBatchUI(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    public final Object WinterFlowSerializerStructure(int i, int i2, Object obj) {
        WinterFlowServerSyntax WinterFlowThreadListener = WinterFlowThreadListener(i2);
        if (!WinterFlowConcurrencyThread(i, i2, obj)) {
            return WinterFlowThreadListener.WinterFlowRouterRouter();
        }
        Object object = WinterFlowBandwidthObject.getObject(obj, WinterFlowSoftwareEngine(i2) & 1048575);
        if (WinterFlowOrchestrationSubsystem(object)) {
            return object;
        }
        WinterFlowDecoratorResponse WinterFlowRouterRouter = WinterFlowThreadListener.WinterFlowRouterRouter();
        if (object != null) {
            WinterFlowThreadListener.WinterFlowRouterStructure(WinterFlowRouterRouter, object);
        }
        return WinterFlowRouterRouter;
    }

    public final void WinterFlowServerProtocol(int i) {
        if (this.WinterFlowHookDataSource[((i / 3) * 2) + 1] == null) {
            return;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
    }

    public final boolean WinterFlowServiceUtility(int i, Object obj) {
        int i2 = this.WinterFlowRouterStructure[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i);
            long j2 = WinterFlowSoftwareEngine & 1048575;
            switch (WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (Double.doubleToRawLongBits(WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowResponseEngine(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowServerProtocol(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (WinterFlowRouterModule.WinterFlowUnitTestResponse(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (WinterFlowRouterModule.WinterFlowUnitTestResponse(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    if (WinterFlowRouterModule.WinterFlowUnitTestResponse(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                    return WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse(j2, obj);
                case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                    Object WinterFlowRouterRouter = WinterFlowRouterModule.WinterFlowRouterRouter(j2, obj);
                    if (WinterFlowRouterRouter instanceof String) {
                        return !((String) WinterFlowRouterRouter).isEmpty();
                    }
                    if (WinterFlowRouterRouter instanceof WinterFlowMicroserviceCloud) {
                        return !WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse.equals(WinterFlowRouterRouter);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (WinterFlowRouterModule.WinterFlowRouterRouter(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse.equals(WinterFlowRouterModule.WinterFlowRouterRouter(j2, obj));
                case 11:
                    if (WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (WinterFlowRouterModule.WinterFlowUnitTestResponse(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (WinterFlowRouterModule.WinterFlowUnitTestResponse(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (WinterFlowRouterModule.WinterFlowRouterRouter(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r10.WinterFlowSyntax(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowSingletonPlatform(Object obj, int i, Object obj2, WinterFlowExceptionProtocol winterFlowExceptionProtocol, WinterFlowProviderEntity winterFlowProviderEntity) {
        long WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i) & 1048575;
        Object WinterFlowRouterRouter = WinterFlowRouterModule.WinterFlowRouterRouter(WinterFlowSoftwareEngine, obj);
        WinterFlowSyntaxValidator winterFlowSyntaxValidator = this.WinterFlowThreadListener;
        if (WinterFlowRouterRouter == null) {
            winterFlowSyntaxValidator.getClass();
            WinterFlowRouterRouter = WinterFlowAlgorithmManager.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource();
            WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowSoftwareEngine, obj, WinterFlowRouterRouter);
        } else {
            winterFlowSyntaxValidator.getClass();
            if (!((WinterFlowAlgorithmManager) WinterFlowRouterRouter).WinterFlowVariableVersionControl) {
                Object WinterFlowHookDataSource = WinterFlowAlgorithmManager.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource();
                WinterFlowSyntaxValidator.WinterFlowRouterStructure(WinterFlowHookDataSource, WinterFlowRouterRouter);
                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowSoftwareEngine, obj, WinterFlowHookDataSource);
                WinterFlowRouterRouter = WinterFlowHookDataSource;
            }
        }
        winterFlowSyntaxValidator.getClass();
        WinterFlowAlgorithmManager winterFlowAlgorithmManager = (WinterFlowAlgorithmManager) WinterFlowRouterRouter;
        WinterFlowObjectPackage winterFlowObjectPackage = ((WinterFlowTransactionModule) obj2).WinterFlowRouterStructure;
        winterFlowProviderEntity.WinterFlowConsumerUserManager(2);
        WinterFlowWorkerCompiler winterFlowWorkerCompiler = (WinterFlowWorkerCompiler) winterFlowProviderEntity.WinterFlowArrayNetwork;
        int WinterFlowResponseEngine = winterFlowWorkerCompiler.WinterFlowResponseEngine(winterFlowWorkerCompiler.WinterFlowEventEmitterController());
        Object obj3 = winterFlowObjectPackage.WinterFlowRouterRouter;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int WinterFlowRouterStructure = winterFlowProviderEntity.WinterFlowRouterStructure();
                if (WinterFlowRouterStructure == Integer.MAX_VALUE || winterFlowWorkerCompiler.WinterFlowArrayNetwork()) {
                    break;
                }
                if (WinterFlowRouterStructure == 1) {
                    obj4 = winterFlowProviderEntity.WinterFlowTransactionAgent((WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy, null, null);
                } else if (WinterFlowRouterStructure != 2) {
                    try {
                        if (!winterFlowProviderEntity.WinterFlowBackendCacheManager()) {
                            throw new WinterFlowRouterAgent("Unable to parse map entry.");
                        }
                    } catch (WinterFlowSingletonJava unused) {
                        if (!winterFlowProviderEntity.WinterFlowBackendCacheManager()) {
                            throw new WinterFlowRouterAgent("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = winterFlowProviderEntity.WinterFlowTransactionAgent((WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse, obj3.getClass(), winterFlowExceptionProtocol);
                }
            } catch (Throwable th) {
                winterFlowWorkerCompiler.WinterFlowSyntax(WinterFlowResponseEngine);
                throw th;
            }
        }
    }

    public final int WinterFlowSoftwareEngine(int i) {
        return this.WinterFlowRouterStructure[i + 1];
    }

    public final void WinterFlowSoftwareProtocol(int i, int i2, Object obj) {
        WinterFlowRouterModule.WinterFlowThreadListener(obj, this.WinterFlowRouterStructure[i2 + 2] & 1048575, i);
    }

    public final void WinterFlowStrategyTool(int i, WinterFlowProviderEntity winterFlowProviderEntity, Object obj) {
        boolean z = (536870912 & i) != 0;
        WinterFlowSerializerUI winterFlowSerializerUI = this.WinterFlowTransactionAgent;
        if (z) {
            winterFlowSerializerUI.getClass();
            winterFlowProviderEntity.WinterFlowRouterAdapter(WinterFlowSerializerUI.WinterFlowRouterStructure(i & 1048575, obj), true);
        } else {
            winterFlowSerializerUI.getClass();
            winterFlowProviderEntity.WinterFlowRouterAdapter(WinterFlowSerializerUI.WinterFlowRouterStructure(i & 1048575, obj), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x082a A[Catch: all -> 0x0500, TryCatch #0 {all -> 0x0500, blocks: (B:58:0x0825, B:60:0x082a, B:61:0x082f, B:126:0x04fb, B:129:0x0503, B:130:0x051b, B:131:0x0533, B:132:0x054b, B:133:0x0563, B:134:0x057b, B:135:0x0593, B:136:0x05ab, B:137:0x05c3, B:138:0x05eb, B:139:0x060b, B:140:0x062b, B:141:0x064c, B:142:0x066d, B:143:0x0690, B:144:0x06b0, B:145:0x06c9, B:146:0x06f1, B:147:0x0702, B:148:0x0724, B:149:0x0745, B:150:0x0766, B:151:0x0786, B:152:0x07a6, B:153:0x07c5, B:154:0x07e7, B:162:0x0809), top: B:57:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0850 A[LOOP:3: B:75:0x084e->B:76:0x0850, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x085a  */
    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowSyntax(Object obj, WinterFlowProviderEntity winterFlowProviderEntity, WinterFlowExceptionProtocol winterFlowExceptionProtocol) {
        WinterFlowSessionGateway winterFlowSessionGateway;
        int[] iArr;
        int i;
        int i2;
        WinterFlowProviderEntity winterFlowProviderEntity2;
        WinterFlowExceptionProtocol winterFlowExceptionProtocol2;
        int WinterFlowUserManagerUserManager;
        Unsafe unsafe;
        WinterFlowSerializerUI winterFlowSerializerUI;
        WinterFlowSessionGateway winterFlowSessionGateway2 = this;
        Object obj2 = obj;
        WinterFlowProviderEntity winterFlowProviderEntity3 = winterFlowProviderEntity;
        WinterFlowExceptionProtocol winterFlowExceptionProtocol3 = winterFlowExceptionProtocol;
        winterFlowExceptionProtocol3.getClass();
        if (!WinterFlowOrchestrationSubsystem(obj2)) {
            WinterFlowEventEmitterOrchestration.WinterFlowTransactionManagerStrategy(obj2, "Mutating immutable message: ");
            return;
        }
        WinterFlowServerDeserialization winterFlowServerDeserialization = winterFlowSessionGateway2.WinterFlowServerProtocol;
        int[] iArr2 = winterFlowSessionGateway2.WinterFlowUnitTestResponse;
        int i3 = winterFlowSessionGateway2.WinterFlowSyntax;
        int i4 = winterFlowSessionGateway2.WinterFlowRouterRouter;
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer = null;
        while (true) {
            try {
                int WinterFlowRouterStructure = winterFlowProviderEntity3.WinterFlowRouterStructure();
                int WinterFlowEventEmitterController = winterFlowSessionGateway2.WinterFlowEventEmitterController(WinterFlowRouterStructure);
                if (WinterFlowEventEmitterController >= 0) {
                    int WinterFlowSoftwareEngine = winterFlowSessionGateway2.WinterFlowSoftwareEngine(WinterFlowEventEmitterController);
                    try {
                        try {
                            WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine);
                            unsafe = WinterFlowBandwidthObject;
                            winterFlowSerializerUI = winterFlowSessionGateway2.WinterFlowTransactionAgent;
                        } catch (WinterFlowSingletonJava unused) {
                            winterFlowSessionGateway = winterFlowSessionGateway2;
                            iArr = iArr2;
                            i2 = i3;
                        }
                        switch (WinterFlowUserManagerUserManager) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(1);
                                try {
                                    try {
                                        WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread(obj, WinterFlowResolverController, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowThreadListener());
                                        obj2 = obj;
                                        winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                    } catch (WinterFlowSingletonJava unused2) {
                                        obj2 = obj;
                                        try {
                                            winterFlowServerDeserialization.getClass();
                                            if (winterFlowFrameworkRenderer == null) {
                                            }
                                            if (!WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity2, winterFlowFrameworkRenderer)) {
                                            }
                                            winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                            winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                            iArr2 = iArr;
                                            i3 = i2;
                                            winterFlowSessionGateway2 = winterFlowSessionGateway;
                                        } catch (Throwable th) {
                                            th = th;
                                            i = i2;
                                            while (i4 < i) {
                                                winterFlowSessionGateway.WinterFlowTransactionAgent(iArr[i4], obj2, winterFlowFrameworkRenderer);
                                                i4++;
                                            }
                                            if (winterFlowFrameworkRenderer != null) {
                                                winterFlowServerDeserialization.getClass();
                                                ((WinterFlowDecoratorResponse) obj2).unknownFields = winterFlowFrameworkRenderer;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj;
                                        i = i2;
                                        while (i4 < i) {
                                        }
                                        if (winterFlowFrameworkRenderer != null) {
                                        }
                                        throw th;
                                    }
                                } catch (WinterFlowSingletonJava unused3) {
                                    obj2 = obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                }
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                                break;
                            case 1:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController2 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(5);
                                WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowSingletonPlatform(obj2, WinterFlowResolverController2, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowConcurrencyThread());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 2:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController3 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowServiceUtility(obj2, WinterFlowResolverController3, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowVariableBandwidth());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 3:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController4 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowServiceUtility(obj2, WinterFlowResolverController4, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowArrayHelper());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 4:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController5 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowThreadListener(obj2, WinterFlowResolverController5, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowSingletonPlatform());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController6 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(1);
                                WinterFlowRouterModule.WinterFlowServiceUtility(obj2, WinterFlowResolverController6, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowOrchestrationSubsystem());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController7 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(5);
                                WinterFlowRouterModule.WinterFlowThreadListener(obj2, WinterFlowResolverController7, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowBandwidthObject());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController8 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowBandwidthObject(obj2, WinterFlowResolverController8, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowTransactionAgent());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowSessionGateway.WinterFlowConfigurationSubsystem(WinterFlowSoftwareEngine, winterFlowProviderEntity2, obj2);
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 9:
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                WinterFlowHookBackend winterFlowHookBackend = (WinterFlowHookBackend) winterFlowSessionGateway.WinterFlowRouterAdapter(WinterFlowEventEmitterController, obj2);
                                WinterFlowServerSyntax WinterFlowThreadListener = winterFlowSessionGateway.WinterFlowThreadListener(WinterFlowEventEmitterController);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(2);
                                winterFlowProviderEntity2.WinterFlowVariableVersionControl(winterFlowHookBackend, WinterFlowThreadListener, winterFlowExceptionProtocol2);
                                unsafe.putObject(obj2, winterFlowSessionGateway.WinterFlowSoftwareEngine(WinterFlowEventEmitterController) & 1048575, winterFlowHookBackend);
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 10:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController(WinterFlowSoftwareEngine), obj2, winterFlowProviderEntity2.WinterFlowUnitTestResponse());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 11:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController9 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowThreadListener(obj2, WinterFlowResolverController9, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowEventEmitterController());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 12:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(0);
                                int WinterFlowServiceUtility2 = ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowServiceUtility();
                                winterFlowSessionGateway.WinterFlowServerProtocol(WinterFlowEventEmitterController);
                                WinterFlowRouterModule.WinterFlowThreadListener(obj2, WinterFlowResolverController(WinterFlowSoftwareEngine), WinterFlowServiceUtility2);
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 13:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController10 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(5);
                                WinterFlowRouterModule.WinterFlowThreadListener(obj2, WinterFlowResolverController10, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowBatchUI());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 14:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController11 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(1);
                                WinterFlowRouterModule.WinterFlowServiceUtility(obj2, WinterFlowResolverController11, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowRouterAdapter());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 15:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController12 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowThreadListener(obj2, WinterFlowResolverController12, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowSerializerStructure());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 16:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController13 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowServiceUtility(obj2, WinterFlowResolverController13, ((WinterFlowWorkerCompiler) winterFlowProviderEntity2.WinterFlowArrayNetwork).WinterFlowMapperProtocol());
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 17:
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                WinterFlowHookBackend winterFlowHookBackend2 = (WinterFlowHookBackend) winterFlowSessionGateway.WinterFlowRouterAdapter(WinterFlowEventEmitterController, obj2);
                                WinterFlowServerSyntax WinterFlowThreadListener2 = winterFlowSessionGateway.WinterFlowThreadListener(WinterFlowEventEmitterController);
                                winterFlowProviderEntity2.WinterFlowConsumerUserManager(3);
                                winterFlowProviderEntity2.WinterFlowArrayNetwork(winterFlowHookBackend2, WinterFlowThreadListener2, winterFlowExceptionProtocol2);
                                unsafe.putObject(obj2, winterFlowSessionGateway.WinterFlowSoftwareEngine(WinterFlowEventEmitterController) & 1048575, winterFlowHookBackend2);
                                winterFlowSessionGateway.WinterFlowPackageIDE(WinterFlowEventEmitterController, obj2);
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 18:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController14 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity2.WinterFlowSyntax(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController14, obj2));
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 19:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController15 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity2.WinterFlowServiceUtility(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController15, obj2));
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 20:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController16 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity2.WinterFlowOrchestrationSubsystem(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController16, obj2));
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 21:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController17 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity2.WinterFlowMapperProtocol(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController17, obj2));
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 22:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController18 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity2.WinterFlowBandwidthObject(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController18, obj2));
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 23:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController19 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity2.WinterFlowThreadListener(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController19, obj2));
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 24:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController20 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity2.WinterFlowServerProtocol(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController20, obj2));
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 25:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                long WinterFlowResolverController21 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity2.WinterFlowTransactionManagerStrategy(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController21, obj2));
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 26:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                try {
                                    winterFlowSessionGateway.WinterFlowStrategyTool(WinterFlowSoftwareEngine, winterFlowProviderEntity2, obj2);
                                } catch (WinterFlowSingletonJava unused4) {
                                    winterFlowServerDeserialization.getClass();
                                    if (winterFlowFrameworkRenderer == null) {
                                    }
                                    if (!WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity2, winterFlowFrameworkRenderer)) {
                                    }
                                    winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                    winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    winterFlowSessionGateway2 = winterFlowSessionGateway;
                                }
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                                break;
                            case 27:
                                iArr = iArr2;
                                i2 = i3;
                                try {
                                    winterFlowSessionGateway2.WinterFlowCompilerVariable(obj2, WinterFlowSoftwareEngine, winterFlowProviderEntity3, winterFlowSessionGateway2.WinterFlowThreadListener(WinterFlowEventEmitterController), winterFlowExceptionProtocol);
                                    winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                } catch (WinterFlowSingletonJava unused5) {
                                    winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                    winterFlowServerDeserialization.getClass();
                                    if (winterFlowFrameworkRenderer == null) {
                                        winterFlowFrameworkRenderer = WinterFlowServerDeserialization.WinterFlowRouterStructure(obj2);
                                    }
                                    if (!WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity2, winterFlowFrameworkRenderer)) {
                                        int i5 = i2;
                                        while (i4 < i5) {
                                            winterFlowSessionGateway.WinterFlowTransactionAgent(iArr[i4], obj2, winterFlowFrameworkRenderer);
                                            i4++;
                                        }
                                        if (winterFlowFrameworkRenderer == null) {
                                            return;
                                        }
                                        ((WinterFlowDecoratorResponse) obj2).unknownFields = winterFlowFrameworkRenderer;
                                        return;
                                    }
                                    winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                    winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    winterFlowSessionGateway2 = winterFlowSessionGateway;
                                }
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 28:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController22 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowRouterRouter(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController22, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 29:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController23 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowSerializerStructure(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController23, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 30:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController24 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                WinterFlowXMLDecorator WinterFlowRouterStructure2 = WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController24, obj2);
                                winterFlowProviderEntity3.WinterFlowResponseEngine(WinterFlowRouterStructure2);
                                winterFlowSessionGateway2.WinterFlowServerProtocol(WinterFlowEventEmitterController);
                                WinterFlowVariableObject.WinterFlowResponseEngine(obj2, WinterFlowRouterStructure, WinterFlowRouterStructure2, winterFlowFrameworkRenderer, winterFlowServerDeserialization);
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 31:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController25 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowConcurrencyThread(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController25, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 32:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController26 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowSingletonPlatform(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController26, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 33:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController27 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowVariableBandwidth(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController27, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 34:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController28 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowBatchUI(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController28, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 35:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController29 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowSyntax(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController29, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 36:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController30 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowServiceUtility(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController30, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 37:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController31 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowOrchestrationSubsystem(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController31, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 38:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController32 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowMapperProtocol(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController32, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 39:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController33 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowBandwidthObject(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController33, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 40:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController34 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowThreadListener(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController34, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 41:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController35 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowServerProtocol(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController35, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 42:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController36 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowTransactionManagerStrategy(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController36, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 43:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController37 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowSerializerStructure(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController37, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 44:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController38 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                WinterFlowXMLDecorator WinterFlowRouterStructure3 = WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController38, obj2);
                                winterFlowProviderEntity3.WinterFlowResponseEngine(WinterFlowRouterStructure3);
                                winterFlowSessionGateway2.WinterFlowServerProtocol(WinterFlowEventEmitterController);
                                WinterFlowVariableObject.WinterFlowResponseEngine(obj2, WinterFlowRouterStructure, WinterFlowRouterStructure3, winterFlowFrameworkRenderer, winterFlowServerDeserialization);
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 45:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController39 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowConcurrencyThread(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController39, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 46:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController40 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowSingletonPlatform(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController40, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 47:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController41 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowSerializerUI.getClass();
                                winterFlowProviderEntity3.WinterFlowVariableBandwidth(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController41, obj2));
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 48:
                                iArr = iArr2;
                                i2 = i3;
                                try {
                                    long WinterFlowResolverController42 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                    winterFlowSerializerUI.getClass();
                                    winterFlowProviderEntity3.WinterFlowBatchUI(WinterFlowSerializerUI.WinterFlowRouterStructure(WinterFlowResolverController42, obj2));
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                    winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                } catch (WinterFlowSingletonJava unused6) {
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                    winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                    winterFlowServerDeserialization.getClass();
                                    if (winterFlowFrameworkRenderer == null) {
                                    }
                                    if (!WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity2, winterFlowFrameworkRenderer)) {
                                    }
                                    winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                    winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    winterFlowSessionGateway2 = winterFlowSessionGateway;
                                }
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                                break;
                            case 49:
                                iArr = iArr2;
                                i2 = i3;
                                obj2 = obj;
                                try {
                                    winterFlowSessionGateway2.WinterFlowArrayHelper(obj2, WinterFlowResolverController(WinterFlowSoftwareEngine), winterFlowProviderEntity, winterFlowSessionGateway2.WinterFlowThreadListener(WinterFlowEventEmitterController), winterFlowExceptionProtocol);
                                    winterFlowProviderEntity3 = winterFlowProviderEntity;
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                    winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                } catch (WinterFlowSingletonJava unused7) {
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                    winterFlowProviderEntity2 = winterFlowProviderEntity;
                                    winterFlowServerDeserialization.getClass();
                                    if (winterFlowFrameworkRenderer == null) {
                                    }
                                    if (!WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity2, winterFlowFrameworkRenderer)) {
                                    }
                                    winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                    winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    winterFlowSessionGateway2 = winterFlowSessionGateway;
                                }
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                                break;
                            case 50:
                                iArr = iArr2;
                                i2 = i3;
                                try {
                                    winterFlowSessionGateway2.WinterFlowSingletonPlatform(obj2, WinterFlowEventEmitterController, winterFlowSessionGateway2.WinterFlowHookDataSource[(WinterFlowEventEmitterController / 3) * 2], winterFlowExceptionProtocol3, winterFlowProviderEntity3);
                                    obj2 = obj;
                                    winterFlowProviderEntity2 = winterFlowProviderEntity;
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                } catch (WinterFlowSingletonJava unused8) {
                                    obj2 = obj;
                                    winterFlowProviderEntity2 = winterFlowProviderEntity;
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                    winterFlowServerDeserialization.getClass();
                                    if (winterFlowFrameworkRenderer == null) {
                                    }
                                    if (!WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity2, winterFlowFrameworkRenderer)) {
                                    }
                                    winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                    winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    winterFlowSessionGateway2 = winterFlowSessionGateway;
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj2 = obj;
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                    i = i2;
                                    while (i4 < i) {
                                    }
                                    if (winterFlowFrameworkRenderer != null) {
                                    }
                                    throw th;
                                }
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                                break;
                            case 51:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController43 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(1);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController43, obj2, Double.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowThreadListener()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 52:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController44 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(5);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController44, obj2, Float.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowConcurrencyThread()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 53:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController45 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController45, obj2, Long.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowVariableBandwidth()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 54:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController46 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController46, obj2, Long.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowArrayHelper()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 55:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController47 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController47, obj2, Integer.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowSingletonPlatform()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 56:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController48 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(1);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController48, obj2, Long.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowOrchestrationSubsystem()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 57:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController49 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(5);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController49, obj2, Integer.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowBandwidthObject()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 58:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController50 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController50, obj2, Boolean.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowTransactionAgent()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 59:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowSessionGateway2.WinterFlowConfigurationSubsystem(WinterFlowSoftwareEngine, winterFlowProviderEntity3, obj2);
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 60:
                                iArr = iArr2;
                                i2 = i3;
                                WinterFlowHookBackend winterFlowHookBackend3 = (WinterFlowHookBackend) winterFlowSessionGateway2.WinterFlowSerializerStructure(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                WinterFlowServerSyntax WinterFlowThreadListener3 = winterFlowSessionGateway2.WinterFlowThreadListener(WinterFlowEventEmitterController);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(2);
                                winterFlowProviderEntity3.WinterFlowVariableVersionControl(winterFlowHookBackend3, WinterFlowThreadListener3, winterFlowExceptionProtocol3);
                                unsafe.putObject(obj2, winterFlowSessionGateway2.WinterFlowSoftwareEngine(WinterFlowEventEmitterController) & 1048575, winterFlowHookBackend3);
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 61:
                                iArr = iArr2;
                                i2 = i3;
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController(WinterFlowSoftwareEngine), obj2, winterFlowProviderEntity3.WinterFlowUnitTestResponse());
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 62:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController51 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController51, obj2, Integer.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowEventEmitterController()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 63:
                                iArr = iArr2;
                                i2 = i3;
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(0);
                                int WinterFlowServiceUtility3 = ((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowServiceUtility();
                                winterFlowSessionGateway2.WinterFlowServerProtocol(WinterFlowEventEmitterController);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController(WinterFlowSoftwareEngine), obj2, Integer.valueOf(WinterFlowServiceUtility3));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 64:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController52 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(5);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController52, obj2, Integer.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowBatchUI()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 65:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController53 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(1);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController53, obj2, Long.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowRouterAdapter()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 66:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController54 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController54, obj2, Integer.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowSerializerStructure()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 67:
                                iArr = iArr2;
                                i2 = i3;
                                long WinterFlowResolverController55 = WinterFlowResolverController(WinterFlowSoftwareEngine);
                                winterFlowProviderEntity3.WinterFlowConsumerUserManager(0);
                                WinterFlowRouterModule.WinterFlowBandwidthObject(WinterFlowResolverController55, obj2, Long.valueOf(((WinterFlowWorkerCompiler) winterFlowProviderEntity3.WinterFlowArrayNetwork).WinterFlowMapperProtocol()));
                                winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                winterFlowSessionGateway = winterFlowSessionGateway2;
                                winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                            case 68:
                                try {
                                    WinterFlowHookBackend winterFlowHookBackend4 = (WinterFlowHookBackend) winterFlowSessionGateway2.WinterFlowSerializerStructure(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                    WinterFlowServerSyntax WinterFlowThreadListener4 = winterFlowSessionGateway2.WinterFlowThreadListener(WinterFlowEventEmitterController);
                                    winterFlowProviderEntity3.WinterFlowConsumerUserManager(3);
                                    winterFlowProviderEntity3.WinterFlowArrayNetwork(winterFlowHookBackend4, WinterFlowThreadListener4, winterFlowExceptionProtocol3);
                                    iArr = iArr2;
                                    i2 = i3;
                                    try {
                                        try {
                                            unsafe.putObject(obj2, winterFlowSessionGateway2.WinterFlowSoftwareEngine(WinterFlowEventEmitterController) & 1048575, winterFlowHookBackend4);
                                            winterFlowSessionGateway2.WinterFlowSoftwareProtocol(WinterFlowRouterStructure, WinterFlowEventEmitterController, obj2);
                                            winterFlowSessionGateway = winterFlowSessionGateway2;
                                            winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                            winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            winterFlowSessionGateway = winterFlowSessionGateway2;
                                            i = i2;
                                            while (i4 < i) {
                                            }
                                            if (winterFlowFrameworkRenderer != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (WinterFlowSingletonJava unused9) {
                                        winterFlowSessionGateway = winterFlowSessionGateway2;
                                        winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                        winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                        winterFlowServerDeserialization.getClass();
                                        if (winterFlowFrameworkRenderer == null) {
                                        }
                                        if (!WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity2, winterFlowFrameworkRenderer)) {
                                        }
                                        winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                        winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                        iArr2 = iArr;
                                        i3 = i2;
                                        winterFlowSessionGateway2 = winterFlowSessionGateway;
                                    }
                                } catch (WinterFlowSingletonJava unused10) {
                                    iArr = iArr2;
                                    i2 = i3;
                                } catch (Throwable th6) {
                                    th = th6;
                                    iArr = iArr2;
                                    i2 = i3;
                                }
                                winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                iArr2 = iArr;
                                i3 = i2;
                                winterFlowSessionGateway2 = winterFlowSessionGateway;
                                break;
                            default:
                                if (winterFlowFrameworkRenderer == null) {
                                    winterFlowServerDeserialization.getClass();
                                    winterFlowFrameworkRenderer = WinterFlowServerDeserialization.WinterFlowRouterStructure(obj2);
                                }
                                winterFlowServerDeserialization.getClass();
                                if (WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity3, winterFlowFrameworkRenderer)) {
                                    winterFlowSessionGateway = winterFlowSessionGateway2;
                                    iArr = iArr2;
                                    i2 = i3;
                                    winterFlowProviderEntity2 = winterFlowProviderEntity3;
                                    winterFlowExceptionProtocol2 = winterFlowExceptionProtocol3;
                                    winterFlowProviderEntity3 = winterFlowProviderEntity2;
                                    winterFlowExceptionProtocol3 = winterFlowExceptionProtocol2;
                                    iArr2 = iArr;
                                    i3 = i2;
                                    winterFlowSessionGateway2 = winterFlowSessionGateway;
                                } else {
                                    while (i4 < i3) {
                                        winterFlowSessionGateway2.WinterFlowTransactionAgent(iArr2[i4], obj2, winterFlowFrameworkRenderer);
                                        i4++;
                                    }
                                    if (winterFlowFrameworkRenderer == null) {
                                        return;
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        winterFlowSessionGateway = winterFlowSessionGateway2;
                        iArr = iArr2;
                        i2 = i3;
                    }
                } else if (WinterFlowRouterStructure == Integer.MAX_VALUE) {
                    while (i4 < i3) {
                        winterFlowSessionGateway2.WinterFlowTransactionAgent(iArr2[i4], obj2, winterFlowFrameworkRenderer);
                        i4++;
                    }
                    if (winterFlowFrameworkRenderer == null) {
                        return;
                    } else {
                        winterFlowServerDeserialization.getClass();
                    }
                } else {
                    winterFlowServerDeserialization.getClass();
                    if (winterFlowFrameworkRenderer == null) {
                        winterFlowFrameworkRenderer = WinterFlowServerDeserialization.WinterFlowRouterStructure(obj2);
                    }
                    if (!WinterFlowServerDeserialization.WinterFlowHookDataSource(0, winterFlowProviderEntity3, winterFlowFrameworkRenderer)) {
                        while (i4 < i3) {
                            winterFlowSessionGateway2.WinterFlowTransactionAgent(iArr2[i4], obj2, winterFlowFrameworkRenderer);
                            i4++;
                        }
                        if (winterFlowFrameworkRenderer == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                winterFlowSessionGateway = winterFlowSessionGateway2;
                iArr = iArr2;
                i = i3;
            }
        }
    }

    public final WinterFlowServerSyntax WinterFlowThreadListener(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.WinterFlowHookDataSource;
        WinterFlowServerSyntax winterFlowServerSyntax = (WinterFlowServerSyntax) objArr[i2];
        if (winterFlowServerSyntax != null) {
            return winterFlowServerSyntax;
        }
        WinterFlowServerSyntax WinterFlowRouterStructure = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent.WinterFlowRouterStructure((Class) objArr[i2 + 1]);
        objArr[i2] = WinterFlowRouterStructure;
        return WinterFlowRouterStructure;
    }

    public final void WinterFlowTransactionAgent(int i, Object obj, Object obj2) {
        int i2 = this.WinterFlowRouterStructure[i];
        if (WinterFlowRouterModule.WinterFlowRouterRouter(WinterFlowSoftwareEngine(i) & 1048575, obj) == null) {
            return;
        }
        WinterFlowServerProtocol(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f0, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        r3 = r8 + r3;
     */
    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int WinterFlowTransactionManagerStrategy(WinterFlowDecoratorResponse winterFlowDecoratorResponse) {
        int i;
        int WinterFlowHookDataSource;
        int i2;
        int[] iArr = this.WinterFlowRouterStructure;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i4);
            int i5 = iArr[i4];
            long j = 1048575 & WinterFlowSoftwareEngine;
            int i6 = 1237;
            int i7 = 37;
            switch (WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(Double.doubleToLongBits(WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowResponseEngine(j, winterFlowDecoratorResponse)));
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 1:
                    i = i3 * 53;
                    WinterFlowHookDataSource = Float.floatToIntBits(WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowServerProtocol(j, winterFlowDecoratorResponse));
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 2:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowRouterModule.WinterFlowUnitTestResponse(j, winterFlowDecoratorResponse));
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 3:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowRouterModule.WinterFlowUnitTestResponse(j, winterFlowDecoratorResponse));
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 4:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, winterFlowDecoratorResponse);
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowRouterModule.WinterFlowUnitTestResponse(j, winterFlowDecoratorResponse));
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, winterFlowDecoratorResponse);
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean WinterFlowUnitTestResponse = WinterFlowRouterModule.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse(j, winterFlowDecoratorResponse);
                    Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
                    break;
                case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                    i = i3 * 53;
                    WinterFlowHookDataSource = ((String) WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse)).hashCode();
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 9:
                    Object WinterFlowRouterRouter = WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse);
                    if (WinterFlowRouterRouter != null) {
                        i7 = WinterFlowRouterRouter.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse).hashCode();
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 11:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, winterFlowDecoratorResponse);
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 12:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, winterFlowDecoratorResponse);
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 13:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, winterFlowDecoratorResponse);
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 14:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowRouterModule.WinterFlowUnitTestResponse(j, winterFlowDecoratorResponse));
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 15:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowTransactionManagerStrategy(j, winterFlowDecoratorResponse);
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 16:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowRouterModule.WinterFlowUnitTestResponse(j, winterFlowDecoratorResponse));
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 17:
                    Object WinterFlowRouterRouter2 = WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse);
                    if (WinterFlowRouterRouter2 != null) {
                        i7 = WinterFlowRouterRouter2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse).hashCode();
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 50:
                    i = i3 * 53;
                    WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse).hashCode();
                    i3 = WinterFlowHookDataSource + i;
                    break;
                case 51:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(Double.doubleToLongBits(((Double) WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse)).doubleValue()));
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = Float.floatToIntBits(((Float) WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse)).floatValue());
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowBackendCacheManager(j, winterFlowDecoratorResponse));
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowBackendCacheManager(j, winterFlowDecoratorResponse));
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse);
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowBackendCacheManager(j, winterFlowDecoratorResponse));
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse);
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse)).booleanValue();
                        Charset charset2 = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = ((String) WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse)).hashCode();
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse).hashCode();
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse).hashCode();
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse);
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse);
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse);
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowBackendCacheManager(j, winterFlowDecoratorResponse));
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse);
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowMapperConcurrency.WinterFlowHookDataSource(WinterFlowBackendCacheManager(j, winterFlowDecoratorResponse));
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (WinterFlowConcurrencyThread(i5, i4, winterFlowDecoratorResponse)) {
                        i = i3 * 53;
                        WinterFlowHookDataSource = WinterFlowRouterModule.WinterFlowRouterRouter(j, winterFlowDecoratorResponse).hashCode();
                        i3 = WinterFlowHookDataSource + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.WinterFlowServerProtocol.getClass();
        return winterFlowDecoratorResponse.unknownFields.hashCode() + (i3 * 53);
    }

    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    public final int WinterFlowUnitTestResponse(WinterFlowDecoratorResponse winterFlowDecoratorResponse) {
        int i;
        int WinterFlowRouterRouter;
        int WinterFlowRouterRouter2;
        int WinterFlowRouterRouter3;
        int WinterFlowResponseEngine;
        int WinterFlowRouterRouter4;
        int WinterFlowResponseEngine2;
        int WinterFlowRouterRouter5;
        int WinterFlowRouterRouter6;
        int WinterFlowRouterRouter7;
        int WinterFlowRouterStructure;
        int WinterFlowSyntax;
        int WinterFlowTransactionManagerStrategy;
        int WinterFlowRouterRouter8;
        int WinterFlowRouterStructure2;
        int WinterFlowCacheManagerAgent;
        int WinterFlowRouterRouter9;
        int size;
        int WinterFlowSyntax2;
        int WinterFlowRouterRouter10;
        int WinterFlowRouterRouter11;
        int size2;
        int WinterFlowRouterRouter12;
        int WinterFlowSyntax3;
        int i2;
        int WinterFlowRouterRouter13;
        int WinterFlowRouterRouter14;
        int WinterFlowResponseEngine3;
        int WinterFlowRouterRouter15;
        int WinterFlowResponseEngine4;
        int i3;
        WinterFlowSessionGateway winterFlowSessionGateway = this;
        WinterFlowDecoratorResponse winterFlowDecoratorResponse2 = winterFlowDecoratorResponse;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = winterFlowSessionGateway.WinterFlowRouterStructure;
            if (i4 >= iArr.length) {
                winterFlowSessionGateway.WinterFlowServerProtocol.getClass();
                return winterFlowDecoratorResponse2.unknownFields.WinterFlowHookDataSource() + i6;
            }
            int WinterFlowSoftwareEngine = winterFlowSessionGateway.WinterFlowSoftwareEngine(i4);
            int WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine);
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & 1048575;
            Unsafe unsafe = WinterFlowBandwidthObject;
            if (WinterFlowUserManagerUserManager <= 17) {
                if (i10 != i7) {
                    i5 = i10 == 1048575 ? 0 : unsafe.getInt(winterFlowDecoratorResponse2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = WinterFlowSoftwareEngine & 1048575;
            if (WinterFlowUserManagerUserManager >= WinterFlowRuntimeHelper.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl) {
                int i11 = WinterFlowRuntimeHelper.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl;
            }
            switch (WinterFlowUserManagerUserManager) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowRouterRouter = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowCacheManagerAgent = WinterFlowRouterRouter + 8;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowRouterRouter2 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter6 = WinterFlowRouterRouter2 + 4;
                        i6 += WinterFlowRouterRouter6;
                    }
                    winterFlowSessionGateway = this;
                    winterFlowDecoratorResponse2 = winterFlowDecoratorResponse;
                    break;
                case 2:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(winterFlowDecoratorResponse2, j);
                        WinterFlowRouterRouter3 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(j2);
                        i6 += WinterFlowResponseEngine + WinterFlowRouterRouter3;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 3:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(winterFlowDecoratorResponse2, j);
                        WinterFlowRouterRouter3 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(j3);
                        i6 += WinterFlowResponseEngine + WinterFlowRouterRouter3;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 4:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        int i12 = unsafe.getInt(winterFlowDecoratorResponse2, j);
                        WinterFlowRouterRouter4 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine2 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(i12);
                        WinterFlowTransactionManagerStrategy = WinterFlowResponseEngine2 + WinterFlowRouterRouter4;
                        i6 += WinterFlowTransactionManagerStrategy;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowRouterRouter5 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter6 = WinterFlowRouterRouter5 + 8;
                        i6 += WinterFlowRouterRouter6;
                    }
                    winterFlowSessionGateway = this;
                    winterFlowDecoratorResponse2 = winterFlowDecoratorResponse;
                    break;
                case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowRouterRouter2 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter6 = WinterFlowRouterRouter2 + 4;
                        i6 += WinterFlowRouterRouter6;
                    }
                    winterFlowSessionGateway = this;
                    winterFlowDecoratorResponse2 = winterFlowDecoratorResponse;
                    break;
                case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowRouterRouter6 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) + 1;
                        i6 += WinterFlowRouterRouter6;
                    }
                    winterFlowSessionGateway = this;
                    winterFlowDecoratorResponse2 = winterFlowDecoratorResponse;
                    break;
                case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(winterFlowDecoratorResponse2, j);
                        i6 = (object instanceof WinterFlowMicroserviceCloud ? WinterFlowSessionManagerSingleton.WinterFlowTransactionManagerStrategy(i8, (WinterFlowMicroserviceCloud) object) : WinterFlowSessionManagerSingleton.WinterFlowUnitTestResponse((String) object) + WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8)) + i6;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 9:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        Object object2 = unsafe.getObject(winterFlowDecoratorResponse2, j);
                        WinterFlowServerSyntax WinterFlowThreadListener = winterFlowSessionGateway.WinterFlowThreadListener(i4);
                        Class cls = WinterFlowVariableObject.WinterFlowRouterStructure;
                        WinterFlowRouterRouter7 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterStructure = ((WinterFlowHookBackend) object2).WinterFlowRouterStructure(WinterFlowThreadListener);
                        WinterFlowSyntax = WinterFlowSessionManagerSingleton.WinterFlowSyntax(WinterFlowRouterStructure);
                        i3 = WinterFlowSyntax + WinterFlowRouterStructure + WinterFlowRouterRouter7;
                        i6 += i3;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowTransactionManagerStrategy = WinterFlowSessionManagerSingleton.WinterFlowTransactionManagerStrategy(i8, (WinterFlowMicroserviceCloud) unsafe.getObject(winterFlowDecoratorResponse2, j));
                        i6 += WinterFlowTransactionManagerStrategy;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 11:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        int i13 = unsafe.getInt(winterFlowDecoratorResponse2, j);
                        WinterFlowRouterRouter4 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine2 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(i13);
                        WinterFlowTransactionManagerStrategy = WinterFlowResponseEngine2 + WinterFlowRouterRouter4;
                        i6 += WinterFlowTransactionManagerStrategy;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 12:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(winterFlowDecoratorResponse2, j);
                        WinterFlowRouterRouter4 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine2 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(i14);
                        WinterFlowTransactionManagerStrategy = WinterFlowResponseEngine2 + WinterFlowRouterRouter4;
                        i6 += WinterFlowTransactionManagerStrategy;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 13:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowRouterRouter2 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter6 = WinterFlowRouterRouter2 + 4;
                        i6 += WinterFlowRouterRouter6;
                    }
                    winterFlowSessionGateway = this;
                    winterFlowDecoratorResponse2 = winterFlowDecoratorResponse;
                    break;
                case 14:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowRouterRouter5 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter6 = WinterFlowRouterRouter5 + 8;
                        i6 += WinterFlowRouterRouter6;
                    }
                    winterFlowSessionGateway = this;
                    winterFlowDecoratorResponse2 = winterFlowDecoratorResponse;
                    break;
                case 15:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(winterFlowDecoratorResponse2, j);
                        WinterFlowRouterRouter4 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine2 = WinterFlowSessionManagerSingleton.WinterFlowSyntax((i15 >> 31) ^ (i15 << 1));
                        WinterFlowTransactionManagerStrategy = WinterFlowResponseEngine2 + WinterFlowRouterRouter4;
                        i6 += WinterFlowTransactionManagerStrategy;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 16:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        long j4 = unsafe.getLong(winterFlowDecoratorResponse2, j);
                        WinterFlowRouterRouter3 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine((j4 << 1) ^ (j4 >> 63));
                        i6 += WinterFlowResponseEngine + WinterFlowRouterRouter3;
                    }
                    winterFlowSessionGateway = this;
                    break;
                case 17:
                    if (winterFlowSessionGateway.WinterFlowBandwidthObject(winterFlowDecoratorResponse2, i4, i7, i5, i)) {
                        WinterFlowHookBackend winterFlowHookBackend = (WinterFlowHookBackend) unsafe.getObject(winterFlowDecoratorResponse2, j);
                        WinterFlowServerSyntax WinterFlowThreadListener2 = winterFlowSessionGateway.WinterFlowThreadListener(i4);
                        WinterFlowRouterRouter8 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) * 2;
                        WinterFlowRouterStructure2 = winterFlowHookBackend.WinterFlowRouterStructure(WinterFlowThreadListener2);
                        WinterFlowCacheManagerAgent = WinterFlowRouterStructure2 + WinterFlowRouterRouter8;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    WinterFlowCacheManagerAgent = WinterFlowVariableObject.WinterFlowCacheManagerAgent(i8, (List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    i6 += WinterFlowCacheManagerAgent;
                    break;
                case 19:
                    WinterFlowCacheManagerAgent = WinterFlowVariableObject.WinterFlowHookDataSource(i8, (List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    i6 += WinterFlowCacheManagerAgent;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls2 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    if (list.size() != 0) {
                        WinterFlowRouterRouter9 = (WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) * list.size()) + WinterFlowVariableObject.WinterFlowVariableVersionControl(list);
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 21:
                    List list2 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls3 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size = list2.size();
                    if (size != 0) {
                        WinterFlowSyntax2 = WinterFlowVariableObject.WinterFlowSyntax(list2);
                        WinterFlowRouterRouter10 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter9 = (WinterFlowRouterRouter10 * size) + WinterFlowSyntax2;
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 22:
                    List list3 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls4 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size = list3.size();
                    if (size != 0) {
                        WinterFlowSyntax2 = WinterFlowVariableObject.WinterFlowArrayNetwork(list3);
                        WinterFlowRouterRouter10 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter9 = (WinterFlowRouterRouter10 * size) + WinterFlowSyntax2;
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 23:
                    WinterFlowCacheManagerAgent = WinterFlowVariableObject.WinterFlowCacheManagerAgent(i8, (List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    i6 += WinterFlowCacheManagerAgent;
                    break;
                case 24:
                    WinterFlowCacheManagerAgent = WinterFlowVariableObject.WinterFlowHookDataSource(i8, (List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    i6 += WinterFlowCacheManagerAgent;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls5 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    int size3 = list4.size();
                    i6 += size3 == 0 ? 0 : (WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls6 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        WinterFlowRouterRouter9 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof WinterFlowMicroserviceCloud) {
                                int size5 = ((WinterFlowMicroserviceCloud) obj).size();
                                WinterFlowRouterRouter9 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size5) + size5 + WinterFlowRouterRouter9;
                            } else {
                                WinterFlowRouterRouter9 = WinterFlowSessionManagerSingleton.WinterFlowUnitTestResponse((String) obj) + WinterFlowRouterRouter9;
                            }
                        }
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 27:
                    List list6 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    WinterFlowServerSyntax WinterFlowThreadListener3 = winterFlowSessionGateway.WinterFlowThreadListener(i4);
                    Class cls7 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        WinterFlowRouterRouter11 = 0;
                    } else {
                        WinterFlowRouterRouter11 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int WinterFlowRouterStructure3 = ((WinterFlowHookBackend) list6.get(i17)).WinterFlowRouterStructure(WinterFlowThreadListener3);
                            WinterFlowRouterRouter11 += WinterFlowSessionManagerSingleton.WinterFlowSyntax(WinterFlowRouterStructure3) + WinterFlowRouterStructure3;
                        }
                    }
                    i6 += WinterFlowRouterRouter11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls8 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        WinterFlowRouterRouter9 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((WinterFlowMicroserviceCloud) list7.get(i18)).size();
                            WinterFlowRouterRouter9 += WinterFlowSessionManagerSingleton.WinterFlowSyntax(size8) + size8;
                        }
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 29:
                    List list8 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls9 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size = list8.size();
                    if (size != 0) {
                        WinterFlowSyntax2 = WinterFlowVariableObject.WinterFlowRouterRouter(list8);
                        WinterFlowRouterRouter10 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter9 = (WinterFlowRouterRouter10 * size) + WinterFlowSyntax2;
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 30:
                    List list9 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls10 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size = list9.size();
                    if (size != 0) {
                        WinterFlowSyntax2 = WinterFlowVariableObject.WinterFlowRouterStructure(list9);
                        WinterFlowRouterRouter10 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter9 = (WinterFlowRouterRouter10 * size) + WinterFlowSyntax2;
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 31:
                    WinterFlowCacheManagerAgent = WinterFlowVariableObject.WinterFlowHookDataSource(i8, (List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    i6 += WinterFlowCacheManagerAgent;
                    break;
                case 32:
                    WinterFlowCacheManagerAgent = WinterFlowVariableObject.WinterFlowCacheManagerAgent(i8, (List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    i6 += WinterFlowCacheManagerAgent;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls11 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size = list10.size();
                    if (size != 0) {
                        WinterFlowSyntax2 = WinterFlowVariableObject.WinterFlowTransactionManagerStrategy(list10);
                        WinterFlowRouterRouter10 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter9 = (WinterFlowRouterRouter10 * size) + WinterFlowSyntax2;
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 34:
                    List list11 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls12 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size = list11.size();
                    if (size != 0) {
                        WinterFlowSyntax2 = WinterFlowVariableObject.WinterFlowUnitTestResponse(list11);
                        WinterFlowRouterRouter10 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterRouter9 = (WinterFlowRouterRouter10 * size) + WinterFlowSyntax2;
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 35:
                    List list12 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls13 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls14 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = WinterFlowVariableObject.WinterFlowVariableVersionControl((List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = WinterFlowVariableObject.WinterFlowSyntax((List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = WinterFlowVariableObject.WinterFlowArrayNetwork((List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls15 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls16 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls17 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size2 = list16.size();
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = WinterFlowVariableObject.WinterFlowRouterRouter((List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = WinterFlowVariableObject.WinterFlowRouterStructure((List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls18 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Class cls19 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = WinterFlowVariableObject.WinterFlowTransactionManagerStrategy((List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = WinterFlowVariableObject.WinterFlowUnitTestResponse((List) unsafe.getObject(winterFlowDecoratorResponse2, j));
                    if (size2 > 0) {
                        WinterFlowRouterRouter12 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowSyntax3 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i6 += WinterFlowSyntax3 + WinterFlowRouterRouter12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(winterFlowDecoratorResponse2, j);
                    WinterFlowServerSyntax WinterFlowThreadListener4 = winterFlowSessionGateway.WinterFlowThreadListener(i4);
                    Class cls20 = WinterFlowVariableObject.WinterFlowRouterStructure;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            i2 += ((WinterFlowHookBackend) list19.get(i19)).WinterFlowRouterStructure(WinterFlowThreadListener4) + (WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) * 2);
                        }
                    }
                    i6 += i2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(winterFlowDecoratorResponse2, j);
                    Object obj2 = winterFlowSessionGateway.WinterFlowHookDataSource[(i4 / 3) * 2];
                    winterFlowSessionGateway.WinterFlowThreadListener.getClass();
                    WinterFlowAlgorithmManager winterFlowAlgorithmManager = (WinterFlowAlgorithmManager) object3;
                    WinterFlowTransactionModule winterFlowTransactionModule = (WinterFlowTransactionModule) obj2;
                    if (!winterFlowAlgorithmManager.isEmpty()) {
                        WinterFlowRouterRouter9 = 0;
                        for (Map.Entry entry : winterFlowAlgorithmManager.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            winterFlowTransactionModule.getClass();
                            int WinterFlowRouterRouter16 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                            int WinterFlowRouterStructure4 = WinterFlowTransactionModule.WinterFlowRouterStructure(winterFlowTransactionModule.WinterFlowRouterStructure, key, value);
                            WinterFlowRouterRouter9 += WinterFlowSessionManagerSingleton.WinterFlowSyntax(WinterFlowRouterStructure4) + WinterFlowRouterStructure4 + WinterFlowRouterRouter16;
                        }
                        i6 += WinterFlowRouterRouter9;
                        break;
                    }
                    WinterFlowRouterRouter9 = 0;
                    i6 += WinterFlowRouterRouter9;
                case 51:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowRouterRouter = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowCacheManagerAgent = WinterFlowRouterRouter + 8;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowRouterRouter13 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowCacheManagerAgent = WinterFlowRouterRouter13 + 4;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        long WinterFlowBackendCacheManager = WinterFlowBackendCacheManager(j, winterFlowDecoratorResponse2);
                        WinterFlowRouterRouter14 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine3 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(WinterFlowBackendCacheManager);
                        i3 = WinterFlowResponseEngine3 + WinterFlowRouterRouter14;
                        i6 += i3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        long WinterFlowBackendCacheManager2 = WinterFlowBackendCacheManager(j, winterFlowDecoratorResponse2);
                        WinterFlowRouterRouter14 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine3 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(WinterFlowBackendCacheManager2);
                        i3 = WinterFlowResponseEngine3 + WinterFlowRouterRouter14;
                        i6 += i3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        int WinterFlowConsumerUserManager = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse2);
                        WinterFlowRouterRouter15 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine4 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(WinterFlowConsumerUserManager);
                        WinterFlowCacheManagerAgent = WinterFlowResponseEngine4 + WinterFlowRouterRouter15;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowRouterRouter = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowCacheManagerAgent = WinterFlowRouterRouter + 8;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowRouterRouter13 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowCacheManagerAgent = WinterFlowRouterRouter13 + 4;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowCacheManagerAgent = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) + 1;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        Object object4 = unsafe.getObject(winterFlowDecoratorResponse2, j);
                        i6 = (object4 instanceof WinterFlowMicroserviceCloud ? WinterFlowSessionManagerSingleton.WinterFlowTransactionManagerStrategy(i8, (WinterFlowMicroserviceCloud) object4) : WinterFlowSessionManagerSingleton.WinterFlowUnitTestResponse((String) object4) + WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8)) + i6;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        Object object5 = unsafe.getObject(winterFlowDecoratorResponse2, j);
                        WinterFlowServerSyntax WinterFlowThreadListener5 = winterFlowSessionGateway.WinterFlowThreadListener(i4);
                        Class cls21 = WinterFlowVariableObject.WinterFlowRouterStructure;
                        WinterFlowRouterRouter7 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowRouterStructure = ((WinterFlowHookBackend) object5).WinterFlowRouterStructure(WinterFlowThreadListener5);
                        WinterFlowSyntax = WinterFlowSessionManagerSingleton.WinterFlowSyntax(WinterFlowRouterStructure);
                        i3 = WinterFlowSyntax + WinterFlowRouterStructure + WinterFlowRouterRouter7;
                        i6 += i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowCacheManagerAgent = WinterFlowSessionManagerSingleton.WinterFlowTransactionManagerStrategy(i8, (WinterFlowMicroserviceCloud) unsafe.getObject(winterFlowDecoratorResponse2, j));
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        int WinterFlowConsumerUserManager2 = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse2);
                        WinterFlowRouterRouter15 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine4 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(WinterFlowConsumerUserManager2);
                        WinterFlowCacheManagerAgent = WinterFlowResponseEngine4 + WinterFlowRouterRouter15;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        int WinterFlowConsumerUserManager3 = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse2);
                        WinterFlowRouterRouter15 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine4 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(WinterFlowConsumerUserManager3);
                        WinterFlowCacheManagerAgent = WinterFlowResponseEngine4 + WinterFlowRouterRouter15;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowRouterRouter13 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowCacheManagerAgent = WinterFlowRouterRouter13 + 4;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowRouterRouter = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowCacheManagerAgent = WinterFlowRouterRouter + 8;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        int WinterFlowConsumerUserManager4 = WinterFlowConsumerUserManager(j, winterFlowDecoratorResponse2);
                        WinterFlowRouterRouter15 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine4 = WinterFlowSessionManagerSingleton.WinterFlowSyntax((WinterFlowConsumerUserManager4 >> 31) ^ (WinterFlowConsumerUserManager4 << 1));
                        WinterFlowCacheManagerAgent = WinterFlowResponseEngine4 + WinterFlowRouterRouter15;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        long WinterFlowBackendCacheManager3 = WinterFlowBackendCacheManager(j, winterFlowDecoratorResponse2);
                        WinterFlowRouterRouter14 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8);
                        WinterFlowResponseEngine3 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine((WinterFlowBackendCacheManager3 << 1) ^ (WinterFlowBackendCacheManager3 >> 63));
                        i3 = WinterFlowResponseEngine3 + WinterFlowRouterRouter14;
                        i6 += i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (winterFlowSessionGateway.WinterFlowConcurrencyThread(i8, i4, winterFlowDecoratorResponse2)) {
                        WinterFlowHookBackend winterFlowHookBackend2 = (WinterFlowHookBackend) unsafe.getObject(winterFlowDecoratorResponse2, j);
                        WinterFlowServerSyntax WinterFlowThreadListener6 = winterFlowSessionGateway.WinterFlowThreadListener(i4);
                        WinterFlowRouterRouter8 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i8) * 2;
                        WinterFlowRouterStructure2 = winterFlowHookBackend2.WinterFlowRouterStructure(WinterFlowThreadListener6);
                        WinterFlowCacheManagerAgent = WinterFlowRouterStructure2 + WinterFlowRouterRouter8;
                        i6 += WinterFlowCacheManagerAgent;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
        }
    }

    public final void WinterFlowVariableBandwidth(int i, Object obj, Object obj2) {
        if (WinterFlowServiceUtility(i, obj2)) {
            long WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i) & 1048575;
            Unsafe unsafe = WinterFlowBandwidthObject;
            Object object = unsafe.getObject(obj2, WinterFlowSoftwareEngine);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.WinterFlowRouterStructure[i] + " is present but null: " + obj2);
            }
            WinterFlowServerSyntax WinterFlowThreadListener = WinterFlowThreadListener(i);
            if (!WinterFlowServiceUtility(i, obj)) {
                if (WinterFlowOrchestrationSubsystem(object)) {
                    WinterFlowDecoratorResponse WinterFlowRouterRouter = WinterFlowThreadListener.WinterFlowRouterRouter();
                    WinterFlowThreadListener.WinterFlowRouterStructure(WinterFlowRouterRouter, object);
                    unsafe.putObject(obj, WinterFlowSoftwareEngine, WinterFlowRouterRouter);
                } else {
                    unsafe.putObject(obj, WinterFlowSoftwareEngine, object);
                }
                WinterFlowPackageIDE(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, WinterFlowSoftwareEngine);
            if (!WinterFlowOrchestrationSubsystem(object2)) {
                WinterFlowDecoratorResponse WinterFlowRouterRouter2 = WinterFlowThreadListener.WinterFlowRouterRouter();
                WinterFlowThreadListener.WinterFlowRouterStructure(WinterFlowRouterRouter2, object2);
                unsafe.putObject(obj, WinterFlowSoftwareEngine, WinterFlowRouterRouter2);
                object2 = WinterFlowRouterRouter2;
            }
            WinterFlowThreadListener.WinterFlowRouterStructure(object2, object);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowServerSyntax
    public final boolean WinterFlowVariableVersionControl(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.WinterFlowRouterRouter) {
            int i7 = this.WinterFlowUnitTestResponse[i6];
            int[] iArr = this.WinterFlowRouterStructure;
            int i8 = iArr[i7];
            int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = WinterFlowBandwidthObject.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & WinterFlowSoftwareEngine) == 0 || WinterFlowBandwidthObject(obj, i2, i, i3, i11)) {
                int WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager(WinterFlowSoftwareEngine);
                if (WinterFlowUserManagerUserManager == 9 || WinterFlowUserManagerUserManager == 17) {
                    if (WinterFlowBandwidthObject(obj, i2, i, i3, i11) && !WinterFlowThreadListener(i2).WinterFlowVariableVersionControl(WinterFlowRouterModule.WinterFlowRouterRouter(WinterFlowSoftwareEngine & 1048575, obj))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (WinterFlowUserManagerUserManager != 27) {
                        if (WinterFlowUserManagerUserManager == 60 || WinterFlowUserManagerUserManager == 68) {
                            if (WinterFlowConcurrencyThread(i8, i2, obj) && !WinterFlowThreadListener(i2).WinterFlowVariableVersionControl(WinterFlowRouterModule.WinterFlowRouterRouter(WinterFlowSoftwareEngine & 1048575, obj))) {
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (WinterFlowUserManagerUserManager != 49) {
                            if (WinterFlowUserManagerUserManager != 50) {
                                continue;
                            } else {
                                Object WinterFlowRouterRouter = WinterFlowRouterModule.WinterFlowRouterRouter(WinterFlowSoftwareEngine & 1048575, obj);
                                this.WinterFlowThreadListener.getClass();
                                WinterFlowAlgorithmManager winterFlowAlgorithmManager = (WinterFlowAlgorithmManager) WinterFlowRouterRouter;
                                if (winterFlowAlgorithmManager.isEmpty()) {
                                    continue;
                                } else {
                                    if (((WinterFlowAlgorithmCloud) ((WinterFlowTransactionModule) this.WinterFlowHookDataSource[(i2 / 3) * 2]).WinterFlowRouterStructure.WinterFlowUnitTestResponse).WinterFlowVariableVersionControl != WinterFlowJavaStructure.WinterFlowThreadListener) {
                                        continue;
                                    } else {
                                        WinterFlowServerSyntax winterFlowServerSyntax = null;
                                        for (Object obj2 : winterFlowAlgorithmManager.values()) {
                                            if (winterFlowServerSyntax == null) {
                                                winterFlowServerSyntax = WinterFlowRequestCompiler.WinterFlowCacheManagerAgent.WinterFlowRouterStructure(obj2.getClass());
                                            }
                                            if (!winterFlowServerSyntax.WinterFlowVariableVersionControl(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) WinterFlowRouterModule.WinterFlowRouterRouter(WinterFlowSoftwareEngine & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        WinterFlowServerSyntax WinterFlowThreadListener = WinterFlowThreadListener(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (WinterFlowThreadListener.WinterFlowVariableVersionControl(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }
}
