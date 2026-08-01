package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowPackageProcess {
    public static final boolean WinterFlowArrayNetwork(long j, long j2) {
        return j == j2;
    }

    public static final void WinterFlowCacheManagerAgent(WinterFlowParserUserManager winterFlowParserUserManager, long j, float f, float f2) {
        float f3 = f / 2.0f;
        float intBitsToFloat = (Float.intBitsToFloat((int) (winterFlowParserUserManager.WinterFlowArrayNetwork() >> 32)) - f3) - f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (winterFlowParserUserManager.WinterFlowArrayNetwork() & 4294967295L)) / 2.0f;
        WinterFlowParserUserManager.WinterFlowRouterAdapter(winterFlowParserUserManager, j, f3, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 120);
    }

    public static final WinterFlowDecoratorTool WinterFlowHookDataSource(Throwable th) {
        th.getClass();
        return new WinterFlowDecoratorTool(th);
    }

    public static final Object[] WinterFlowResponseEngine(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, objArr2, 0, i, 6);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static String WinterFlowRouterRouter(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void WinterFlowServerProtocol(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            WinterFlowDebugPlatform.WinterFlowUnitTestResponse(window, z);
        } else {
            if (i >= 30) {
                WinterFlowDebugPlatform.WinterFlowTransactionManagerStrategy(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final WinterFlowDecoratorPlatform WinterFlowSyntax(WinterFlowResolverLibrary winterFlowResolverLibrary) {
        winterFlowResolverLibrary.WinterFlowCompilerDataSource(1967007413);
        Object[] objArr = new Object[0];
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
            WinterFlowSyntaxSubsystem = new WinterFlowArrayHelper(2);
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
        }
        WinterFlowDecoratorPlatform winterFlowDecoratorPlatform = (WinterFlowDecoratorPlatform) WinterFlowWorkerVersionControl.WinterFlowThreadListener(objArr, WinterFlowDecoratorPlatform.WinterFlowSyntax, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 384);
        winterFlowDecoratorPlatform.WinterFlowUnitTestResponse = (WinterFlowEncryptionComponent) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowModuleEngine.WinterFlowRouterStructure);
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        return winterFlowDecoratorPlatform;
    }

    public static final void WinterFlowThreadListener(Object obj) {
        if (obj instanceof WinterFlowDecoratorTool) {
            throw ((WinterFlowDecoratorTool) obj).WinterFlowVariableVersionControl;
        }
    }

    public static final Object[] WinterFlowTransactionAgent(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, objArr2, 0, i, 6);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final int WinterFlowTransactionManagerStrategy(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] WinterFlowUnitTestResponse(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, objArr2, 0, i, 6);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static String WinterFlowVariableVersionControl(WinterFlowMicroserviceCloud winterFlowMicroserviceCloud) {
        StringBuilder sb = new StringBuilder(winterFlowMicroserviceCloud.size());
        for (int i = 0; i < winterFlowMicroserviceCloud.size(); i++) {
            byte WinterFlowRouterStructure = winterFlowMicroserviceCloud.WinterFlowRouterStructure(i);
            if (WinterFlowRouterStructure == 34) {
                sb.append("\\\"");
            } else if (WinterFlowRouterStructure == 39) {
                sb.append("\\'");
            } else if (WinterFlowRouterStructure != 92) {
                switch (WinterFlowRouterStructure) {
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (WinterFlowRouterStructure < 32 || WinterFlowRouterStructure > 126) {
                            sb.append('\\');
                            sb.append((char) (((WinterFlowRouterStructure >>> 6) & 3) + 48));
                            sb.append((char) (((WinterFlowRouterStructure >>> 3) & 7) + 48));
                            sb.append((char) ((WinterFlowRouterStructure & 7) + 48));
                            break;
                        } else {
                            sb.append((char) WinterFlowRouterStructure);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public abstract void WinterFlowRouterStructure();
}
