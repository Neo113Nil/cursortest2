package android.content.Context;

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

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterLayerNebulaNebulaEclipse5699 {
    public static final FrostHunterVectorDrawablePulseMaxStorm8774 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterVectorDrawablePulseMaxStorm8774(2);
    public static final FrostHunterTextInputLayoutPhantomPhantom6564 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterTextInputLayoutPhantomPhantom6564(13);

    public static FrostHunterNestedScrollViewMaxEpicEpic6844 FrostHunterAlphaAnimationNeoCosmos5761(Context context, List list) {
        String str;
        Typeface FrostHunterBundlePulseFusionHero2475;
        FrostHunterLooperThreadStormCyberElite6638.FrostHunterBundlePulseFusionHero2475("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                FrostHunterHandlerThreadFusionOmegaHero7374 frostHunterHandlerThreadFusionOmegaHero7374 = (FrostHunterHandlerThreadFusionOmegaHero7374) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (FrostHunterBundlePulseFusionHero2475 = FrostHunterConstraintLayoutHyperDelta1865.FrostHunterBundlePulseFusionHero2475((str = frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterLifecycleBlazeGammaElite2889))) == null || FrostHunterConstraintLayoutHyperDelta1865.FrostHunterServiceEliteCelestialThunder1757(FrostHunterBundlePulseFusionHero2475) == null) {
                    ProviderInfo FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterConstraintSetCloneMasterUltraRogue2633(context.getPackageManager(), frostHunterHandlerThreadFusionOmegaHero7374, context.getResources());
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26332 == null) {
                        return new FrostHunterNestedScrollViewMaxEpicEpic6844(1);
                    }
                    arrayList.add(FrostHunterBundlePulseFusionHero2475(context, frostHunterHandlerThreadFusionOmegaHero7374, FrostHunterConstraintSetCloneMasterUltraRogue26332.authority));
                } else {
                    arrayList.add(new FrostHunterPreviewHyperionMegaInferno5813[]{new FrostHunterPreviewHyperionMegaInferno5813(str, frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterLevelListDrawableFusionDragonHero2232)});
                }
            }
            return new FrostHunterNestedScrollViewMaxEpicEpic6844(1, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static FrostHunterPreviewHyperionMegaInferno5813[] FrostHunterBundlePulseFusionHero2475(Context context, FrostHunterHandlerThreadFusionOmegaHero7374 frostHunterHandlerThreadFusionOmegaHero7374, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        ContentProviderClient contentProviderClient3;
        Uri withAppendedId;
        FrostHunterLooperThreadStormCyberElite6638.FrostHunterBundlePulseFusionHero2475("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                FrostHunterLooperThreadStormCyberElite6638.FrostHunterBundlePulseFusionHero2475("ContentQueryWrapper.query");
                try {
                    try {
                        String[] strArr2 = {frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterBundlePulseFusionHero2475};
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
                                arrayList2.add(new FrostHunterPreviewHyperionMegaInferno5813(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : Constants.MINIMAL_ERROR_STATUS_CODE, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterLevelListDrawableFusionDragonHero2232, i));
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
                        return (FrostHunterPreviewHyperionMegaInferno5813[]) arrayList.toArray(new FrostHunterPreviewHyperionMegaInferno5813[0]);
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

    public static ProviderInfo FrostHunterConstraintSetCloneMasterUltraRogue2633(PackageManager packageManager, FrostHunterHandlerThreadFusionOmegaHero7374 frostHunterHandlerThreadFusionOmegaHero7374, Resources resources) {
        FrostHunterTextInputLayoutPhantomPhantom6564 frostHunterTextInputLayoutPhantomPhantom6564 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterVectorDrawablePulseMaxStorm8774 frostHunterVectorDrawablePulseMaxStorm8774 = FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLooperThreadStormCyberElite6638.FrostHunterBundlePulseFusionHero2475("FontProvider.getProvider");
        try {
            List list = frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterServiceEliteCelestialThunder1757;
            String str = frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterAlphaAnimationNeoCosmos5761;
            String str2 = frostHunterHandlerThreadFusionOmegaHero7374.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (list == null) {
                list = FrostHunterCanvasInfernoVortex4700.FrostHunterRemoteConfigThunderShadow4435(resources, 0);
            }
            FrostHunterDragEventOlympianGamma6840 frostHunterDragEventOlympianGamma6840 = new FrostHunterDragEventOlympianGamma6840();
            frostHunterDragEventOlympianGamma6840.FrostHunterAlphaAnimationNeoCosmos5761 = str;
            frostHunterDragEventOlympianGamma6840.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str2;
            frostHunterDragEventOlympianGamma6840.FrostHunterBundlePulseFusionHero2475 = list;
            ProviderInfo providerInfo = (ProviderInfo) frostHunterVectorDrawablePulseMaxStorm8774.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterDragEventOlympianGamma6840);
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
            Collections.sort(arrayList, frostHunterTextInputLayoutPhantomPhantom6564);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, frostHunterTextInputLayoutPhantomPhantom6564);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    frostHunterVectorDrawablePulseMaxStorm8774.FrostHunterServiceEliteCelestialThunder1757(frostHunterDragEventOlympianGamma6840, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }
}
