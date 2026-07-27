package androidx.versionedparcelable;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class HeliosRuntimeProxyDataframeUc1MBaEUr34L4uK2Ia59416045704306 {
    public static Icon ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static Notification.Builder AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static float BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static final ColorSpace ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935 yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace2 = ColorSpace.get(named2);
                } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935, EmeraldStackJITKeyValueMUOOUj5JXITWGs26bJ75634097813965.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace2 = ColorSpace.get(named);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935 instanceof SolarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521) {
                String str = yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                SolarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521 solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521 = (SolarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521) yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935;
                float[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                BlazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086 blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086 = solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                ColorSpace.Rgb.TransferParameters transferParameters = blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086 != null ? new ColorSpace.Rgb.TransferParameters(blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) : null;
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, transferParameters);
                }
                float[] fArr = solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                final MysticCacheSchedulerVariableEXJimPolKk4houHoeC85962105440120 mysticCacheSchedulerVariableEXJimPolKk4houHoeC85962105440120 = solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
                final int i = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.versionedparcelable.ZenithPathInheritanceRuntimeOQyTUsr8JuVuv7heqU81243040027550
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i2 = i;
                        DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 dragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 = mysticCacheSchedulerVariableEXJimPolKk4houHoeC85962105440120;
                        switch (i2) {
                        }
                        return ((Number) dragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(Double.valueOf(d))).doubleValue();
                    }
                };
                final MysticCacheSchedulerVariableEXJimPolKk4houHoeC85962105440120 mysticCacheSchedulerVariableEXJimPolKk4houHoeC859621054401202 = solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
                final int i2 = 1;
                return new ColorSpace.Rgb(str, fArr, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.versionedparcelable.ZenithPathInheritanceRuntimeOQyTUsr8JuVuv7heqU81243040027550
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i22 = i2;
                        DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 dragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 = mysticCacheSchedulerVariableEXJimPolKk4houHoeC859621054401202;
                        switch (i22) {
                        }
                        return ((Number) dragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(Double.valueOf(d))).doubleValue();
                    }
                }, solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, solarMeshOverloadingDebuggerWopHfWYPxF2O1TZ3J674480582016521.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }

    public static void ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static AutofillId RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(View view) {
        return view.getAutofillId();
    }

    public static float TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static float YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(Notification.Builder builder) {
        builder.setShortcutId(null);
    }
}
