package androidx.versionedparcelable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.icecatchpuzzle.puzzleicecatch.R;
import java.util.Locale;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class CrimsonRouteCompilerConstructorSoaGIPOnC6nEEoFBTL93674383801970 {
    public static Locale AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public static final IronMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new IronMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868(0);

    public static String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_title);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_title);
        }
        if (i == 5) {
            return LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(context, "common_google_play_services_restricted_profile_title");
    }

    public static String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Context context, int i) {
        Resources resources = context.getResources();
        String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
        }
        if (i == 2) {
            return DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
        }
        if (i == 5) {
            return RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(context, "common_google_play_services_invalid_account_text", ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
        }
        if (i == 7) {
            return RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(context, "common_google_play_services_network_error_text", ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
        }
        if (i == 20) {
            return RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(context, "common_google_play_services_restricted_profile_text", ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
        }
        switch (i) {
            case 16:
                return RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(context, "common_google_play_services_api_unavailable_text", ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
            case 17:
                return RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(context, "common_google_play_services_sign_in_failed_text", ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB375741376928002);
        }
    }

    public static String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(Context context, String str) {
        Resources resources;
        IronMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868 ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        synchronized (ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365)) {
                    ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868.clear();
                    AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = locale;
                }
                String str2 = (String) ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = FrostBridgeCoordinatorTokenFv2A1GqQiEVjnGtbUX29181017692665.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier != 0) {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public static String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = CrimsonRouteExecutorAttributeMomQaj3H5PMvlUqGgR26107891851468.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(context).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(context, str);
        if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
            LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, str2);
    }
}
