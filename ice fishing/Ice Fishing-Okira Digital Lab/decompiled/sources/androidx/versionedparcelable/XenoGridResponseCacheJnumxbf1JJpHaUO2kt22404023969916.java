package androidx.versionedparcelable;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class XenoGridResponseCacheJnumxbf1JJpHaUO2kt22404023969916 {
    public static final CosmicForgeAbstractionHeuristicHYVTK3tBj8M45QjcbQ56959411051283 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new CosmicForgeAbstractionHeuristicHYVTK3tBj8M45QjcbQ56959411051283(2);
    public static final YellowLoopRouterGatewayX9KDdmXLKIznEB7XMr82691421508617 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new YellowLoopRouterGatewayX9KDdmXLKIznEB7XMr82691421508617(2);

    public static BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[] ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Context context, DeltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295 deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        ContentProviderClient contentProviderClient3;
        Uri withAppendedId;
        ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("ContentQueryWrapper.query");
                try {
                    try {
                        String[] strArr2 = {deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495};
                        if (acquireUnstableContentProviderClient != null) {
                            try {
                                cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        if (cursor == null || cursor.getCount() <= 0) {
                            contentProviderClient2 = acquireUnstableContentProviderClient;
                        } else {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
                            while (cursor.moveToNext()) {
                                int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    contentProviderClient3 = acquireUnstableContentProviderClient;
                                    withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                } else {
                                    contentProviderClient3 = acquireUnstableContentProviderClient;
                                    withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                }
                                arrayList2.add(new BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : Constants.MINIMAL_ERROR_STATUS_CODE, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                                acquireUnstableContentProviderClient = contentProviderClient3;
                            }
                            contentProviderClient2 = acquireUnstableContentProviderClient;
                            arrayList = arrayList2;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient2 != null) {
                            contentProviderClient2.close();
                        }
                        return (BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[]) arrayList.toArray(new BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[0]);
                    } catch (Throwable th) {
                        th = th;
                        contentProviderClient = context;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClient = acquireUnstableContentProviderClient;
            }
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(PackageManager packageManager, DeltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295 deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295, Resources resources) {
        YellowLoopRouterGatewayX9KDdmXLKIznEB7XMr82691421508617 yellowLoopRouterGatewayX9KDdmXLKIznEB7XMr82691421508617 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        CosmicForgeAbstractionHeuristicHYVTK3tBj8M45QjcbQ56959411051283 cosmicForgeAbstractionHeuristicHYVTK3tBj8M45QjcbQ56959411051283 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("FontProvider.getProvider");
        try {
            List list = deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            String str = deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            String str2 = deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            if (list == null) {
                list = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(resources, 0);
            }
            TitanCloudBinaryRuntimeJc4rytRRtFKX4DkUDc26815905926022 titanCloudBinaryRuntimeJc4rytRRtFKX4DkUDc26815905926022 = new TitanCloudBinaryRuntimeJc4rytRRtFKX4DkUDc26815905926022();
            titanCloudBinaryRuntimeJc4rytRRtFKX4DkUDc26815905926022.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = str;
            titanCloudBinaryRuntimeJc4rytRRtFKX4DkUDc26815905926022.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str2;
            titanCloudBinaryRuntimeJc4rytRRtFKX4DkUDc26815905926022.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = list;
            ProviderInfo providerInfo = (ProviderInfo) cosmicForgeAbstractionHeuristicHYVTK3tBj8M45QjcbQ56959411051283.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(titanCloudBinaryRuntimeJc4rytRRtFKX4DkUDc26815905926022);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, yellowLoopRouterGatewayX9KDdmXLKIznEB7XMr82691421508617);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, yellowLoopRouterGatewayX9KDdmXLKIznEB7XMr82691421508617);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    cosmicForgeAbstractionHeuristicHYVTK3tBj8M45QjcbQ56959411051283.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(titanCloudBinaryRuntimeJc4rytRRtFKX4DkUDc26815905926022, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (androidx.versionedparcelable.UltraBufferModuleContextMlhwMKPCmlLPCCyRVv91224359513707.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(r5) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r0.add(new androidx.versionedparcelable.BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673[]{new androidx.versionedparcelable.BlueKernelRouterUnificationAsLC4vrnj424apXKE983727207980673(r4, r3.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170)});
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context, List list) {
        ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                DeltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295 deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295 = (DeltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295) list.get(i);
                if (Build.VERSION.SDK_INT >= 31) {
                    String str = deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071 mysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071 = UltraBufferModuleContextMlhwMKPCmlLPCCyRVv91224359513707.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    Typeface typeface = null;
                    if (str != null && !str.isEmpty()) {
                        Typeface create = Typeface.create(str, 0);
                        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                        if (create != null && !create.equals(create2)) {
                            typeface = create;
                        }
                    }
                }
                ProviderInfo AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(context.getPackageManager(), deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295, context.getResources());
                if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 == null) {
                    return new CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562(1);
                }
                arrayList.add(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(context, deltaSignalFrameworkShimOBkbmSegDN7M1FNOJa87172695530295, AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652.authority));
            }
            CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562 crimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562 = new CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562();
            crimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
            crimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = arrayList;
            return crimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562;
        } finally {
            Trace.endSection();
        }
    }
}
