package com.google.android.datatransport;

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

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowUIDecorator {
    public static final WinterFlowThreadNode WinterFlowRouterStructure = new WinterFlowThreadNode(2);
    public static final WinterFlowVariableEntity WinterFlowHookDataSource = new WinterFlowVariableEntity(1);

    public static WinterFlowLibraryEntity[] WinterFlowCacheManagerAgent(Context context, WinterFlowXMLHelper winterFlowXMLHelper, String str) {
        String[] strArr;
        WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("ContentQueryWrapper.query");
                try {
                    String str2 = winterFlowXMLHelper.WinterFlowTransactionManagerStrategy;
                    String str3 = winterFlowXMLHelper.WinterFlowCacheManagerAgent;
                    if (str2 != null) {
                        int length = str2.length();
                        int i = 0;
                        while (i < length) {
                            int codePointAt = str2.codePointAt(i);
                            if (!Character.isWhitespace(codePointAt)) {
                                strArr = new String[]{str3, "VF"};
                                break;
                            }
                            i += Character.charCount(codePointAt);
                        }
                    }
                    strArr = new String[]{str3};
                    String[] strArr3 = strArr;
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr2, "query = ?", strArr3, null, null);
                        } catch (RemoteException unused) {
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new WinterFlowLibraryEntity(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : Constants.MINIMAL_ERROR_STATUS_CODE, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, winterFlowXMLHelper.WinterFlowTransactionManagerStrategy, i2));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (WinterFlowLibraryEntity[]) arrayList.toArray(new WinterFlowLibraryEntity[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }

    public static ProviderInfo WinterFlowHookDataSource(PackageManager packageManager, WinterFlowXMLHelper winterFlowXMLHelper, Resources resources) {
        WinterFlowVariableEntity winterFlowVariableEntity = WinterFlowHookDataSource;
        WinterFlowThreadNode winterFlowThreadNode = WinterFlowRouterStructure;
        WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("FontProvider.getProvider");
        try {
            List list = winterFlowXMLHelper.WinterFlowArrayNetwork;
            String str = winterFlowXMLHelper.WinterFlowRouterStructure;
            String str2 = winterFlowXMLHelper.WinterFlowHookDataSource;
            if (list == null) {
                list = WinterFlowUnitTestLibrary.WinterFlowCompilerHandler(resources, 0);
            }
            WinterFlowVersionAgent winterFlowVersionAgent = new WinterFlowVersionAgent();
            winterFlowVersionAgent.WinterFlowRouterStructure = str;
            winterFlowVersionAgent.WinterFlowHookDataSource = str2;
            winterFlowVersionAgent.WinterFlowCacheManagerAgent = list;
            ProviderInfo providerInfo = (ProviderInfo) winterFlowThreadNode.WinterFlowCacheManagerAgent(winterFlowVersionAgent);
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
            Collections.sort(arrayList, winterFlowVariableEntity);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, winterFlowVariableEntity);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    winterFlowThreadNode.WinterFlowArrayNetwork(winterFlowVersionAgent, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static WinterFlowSyntax WinterFlowRouterStructure(Context context, List list) {
        String str;
        Typeface WinterFlowCacheManagerAgent;
        WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                WinterFlowXMLHelper winterFlowXMLHelper = (WinterFlowXMLHelper) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (WinterFlowCacheManagerAgent = WinterFlowAlgorithmProxy.WinterFlowCacheManagerAgent((str = winterFlowXMLHelper.WinterFlowVariableVersionControl))) == null || WinterFlowAlgorithmProxy.WinterFlowArrayNetwork(WinterFlowCacheManagerAgent) == null) {
                    ProviderInfo WinterFlowHookDataSource2 = WinterFlowHookDataSource(context.getPackageManager(), winterFlowXMLHelper, context.getResources());
                    if (WinterFlowHookDataSource2 == null) {
                        WinterFlowSyntax winterFlowSyntax = new WinterFlowSyntax();
                        winterFlowSyntax.WinterFlowRouterStructure = 1;
                        winterFlowSyntax.WinterFlowHookDataSource = Collections.singletonList(null);
                        return winterFlowSyntax;
                    }
                    arrayList.add(WinterFlowCacheManagerAgent(context, winterFlowXMLHelper, WinterFlowHookDataSource2.authority));
                } else {
                    arrayList.add(new WinterFlowLibraryEntity[]{new WinterFlowLibraryEntity(str, winterFlowXMLHelper.WinterFlowTransactionManagerStrategy)});
                }
            }
            WinterFlowSyntax winterFlowSyntax2 = new WinterFlowSyntax();
            winterFlowSyntax2.WinterFlowRouterStructure = 0;
            winterFlowSyntax2.WinterFlowHookDataSource = arrayList;
            return winterFlowSyntax2;
        } finally {
            Trace.endSection();
        }
    }
}
