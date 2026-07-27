package androidx.versionedparcelable;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148 extends GoldenVectorSyntaxTokenDmY0Zrl65ST9l6Ogow21684126180116 {
    public static final Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new Object();
    public static final SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148();

    public static void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                throw null;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        GoldenVectorChannelAlgorithmHtl2CiKuk8PoKQUEJa23560239188168 goldenVectorChannelAlgorithmHtl2CiKuk8PoKQUEJa23560239188168 = new GoldenVectorChannelAlgorithmHtl2CiKuk8PoKQUEJa23560239188168();
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        goldenVectorChannelAlgorithmHtl2CiKuk8PoKQUEJa23560239188168.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = alertDialog;
        if (onCancelListener != null) {
            goldenVectorChannelAlgorithmHtl2CiKuk8PoKQUEJa23560239188168.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = onCancelListener;
        }
        goldenVectorChannelAlgorithmHtl2CiKuk8PoKQUEJa23560239188168.show(fragmentManager, str);
    }

    public static AlertDialog RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Activity activity, int i, RapidLogicBinaryTreeConcurrencyYI9jB65cMXu6vZk6Ji90197123653566 rapidLogicBinaryTreeConcurrencyYI9jB65cMXu6vZk6Ji90197123653566, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(CrimsonRouteCompilerConstructorSoaGIPOnC6nEEoFBTL93674383801970.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.icecatchpuzzle.puzzleicecatch.R.string.common_google_play_services_enable_button) : resources.getString(com.icecatchpuzzle.puzzleicecatch.R.string.common_google_play_services_update_button) : resources.getString(com.icecatchpuzzle.puzzleicecatch.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, rapidLogicBinaryTreeConcurrencyYI9jB65cMXu6vZk6Ji90197123653566);
        }
        String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 = CrimsonRouteCompilerConstructorSoaGIPOnC6nEEoFBTL93674383801970.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(activity, i);
        if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 != null) {
            builder.setTitle(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(googleApiActivity, i, new ArcticByteConnectorShimSNaHPac8M7eqo1y7DD22778832633133(super.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null) {
            return;
        }
        LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(googleApiActivity, RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(Activity activity, QuantumStreamExecutorRegistryYUeANDfQtu7CSx4Y7b39610265583786 quantumStreamExecutorRegistryYUeANDfQtu7CSx4Y7b39610265583786, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(activity, i, new DragonRouteClosureExceptionJYNNvM3YZLYG50FFou45510742668444(super.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, activity, "d"), quantumStreamExecutorRegistryYUeANDfQtu7CSx4Y7b39610265583786), onCancelListener);
        if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null) {
            return;
        }
        LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(activity, RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        NotificationChannel notificationChannel;
        CharSequence name;
        new IllegalArgumentException();
        if (i == 18) {
            new QuantumStreamCompressionBufferBArZhJmjsIi7y2DjeK15784948119399(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i == 6 ? CrimsonRouteCompilerConstructorSoaGIPOnC6nEEoFBTL93674383801970.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(context, "common_google_play_services_resolution_required_title") : CrimsonRouteCompilerConstructorSoaGIPOnC6nEEoFBTL93674383801970.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, i);
        if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
            LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = context.getResources().getString(com.icecatchpuzzle.puzzleicecatch.R.string.common_google_play_services_notification_ticker);
        }
        String RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = (i == 6 || i == 19) ? CrimsonRouteCompilerConstructorSoaGIPOnC6nEEoFBTL93674383801970.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(context, "common_google_play_services_resolution_required_text", CrimsonRouteCompilerConstructorSoaGIPOnC6nEEoFBTL93674383801970.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context)) : CrimsonRouteCompilerConstructorSoaGIPOnC6nEEoFBTL93674383801970.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        KryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175 kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175 = new KryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175(context, null);
        kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = true;
        kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598.flags |= 16;
        kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = KryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        CosmicForgeImmutableJITRYU3m9H60etioTM5eB10247720625302 cosmicForgeImmutableJITRYU3m9H60etioTM5eB10247720625302 = new CosmicForgeImmutableJITRYU3m9H60etioTM5eB10247720625302();
        cosmicForgeImmutableJITRYU3m9H60etioTM5eB10247720625302.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = KryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(cosmicForgeImmutableJITRYU3m9H60etioTM5eB10247720625302);
        PackageManager packageManager = context.getPackageManager();
        if (DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036 == null) {
            DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036.booleanValue()) {
            kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598.icon = context.getApplicationInfo().icon;
            kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = 2;
            if (DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(context)) {
                kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.add(new ZenithPathAbstractionGatewayZeGuRuTt4lz7iDEyxM20572272242460(resources.getString(com.icecatchpuzzle.puzzleicecatch.R.string.common_open_on_phone), pendingIntent));
            } else {
                kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = pendingIntent;
            }
        } else {
            kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598.icon = R.drawable.stat_sys_warning;
            kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598.tickerText = KryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(resources.getString(com.icecatchpuzzle.puzzleicecatch.R.string.common_google_play_services_notification_ticker));
            kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598.when = System.currentTimeMillis();
            kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = pendingIntent;
            kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = KryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        }
        if (KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390()) {
            if (!KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390()) {
                throw new IllegalStateException();
            }
            synchronized (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.icecatchpuzzle.puzzleicecatch.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(CrimsonRouteInterpreterOverridingONJhE2k6QRooQDZhCt39507633608441.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = "com.google.android.gms.availability";
        }
        Notification ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = kryptonFlowPayloadContainerI0KdVxwIAbDn9jVDZQ78303817517175.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        if (i == 1 || i == 2 || i == 3) {
            FrostBridgeCoordinatorTokenFv2A1GqQiEVjnGtbUX29181017692665.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }
}
