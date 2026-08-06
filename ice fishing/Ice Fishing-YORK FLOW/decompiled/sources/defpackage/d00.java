package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class d00 {
    public static final defpackage.rj0 ZpBGe2uQfcn8 = new defpackage.rj0(2);
    public static final defpackage.i3 giKS3J6vZuNy = new defpackage.i3(1);

    public static defpackage.wg ZpBGe2uQfcn8(android.content.Context context, java.util.List list) {
        java.lang.String str;
        android.graphics.Typeface fWTAfUmVKrZq;
        defpackage.v70.Ns0WNyEWdPsk("FontProvider.getFontFamilyResult");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < list.size(); i++) {
                defpackage.e00 e00Var = (defpackage.e00) list.get(i);
                if (android.os.Build.VERSION.SDK_INT < 31 || (fWTAfUmVKrZq = defpackage.rq1.fWTAfUmVKrZq((str = e00Var.WDYagTQQm9ns))) == null || defpackage.rq1.JhCgjQRTAOCT(fWTAfUmVKrZq) == null) {
                    android.content.pm.ProviderInfo giKS3J6vZuNy2 = giKS3J6vZuNy(context.getPackageManager(), e00Var, context.getResources());
                    if (giKS3J6vZuNy2 == null) {
                        defpackage.wg wgVar = new defpackage.wg();
                        wgVar.ZpBGe2uQfcn8 = 1;
                        wgVar.giKS3J6vZuNy = java.util.Collections.singletonList(null);
                        return wgVar;
                    }
                    arrayList.add(fWTAfUmVKrZq(context, e00Var, giKS3J6vZuNy2.authority));
                } else {
                    arrayList.add(new defpackage.y00[]{new defpackage.y00(str, e00Var.oh71FJcDz6S2)});
                }
            }
            defpackage.wg wgVar2 = new defpackage.wg();
            wgVar2.ZpBGe2uQfcn8 = 0;
            wgVar2.giKS3J6vZuNy = arrayList;
            return wgVar2;
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static defpackage.y00[] fWTAfUmVKrZq(android.content.Context context, defpackage.e00 e00Var, java.lang.String str) {
        java.lang.String[] strArr;
        defpackage.v70.Ns0WNyEWdPsk("FontProvider.query");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority(str).build();
            android.net.Uri build2 = new android.net.Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            android.database.Cursor cursor = null;
            try {
                java.lang.String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                defpackage.v70.Ns0WNyEWdPsk("ContentQueryWrapper.query");
                try {
                    java.lang.String str2 = e00Var.oh71FJcDz6S2;
                    java.lang.String str3 = e00Var.fWTAfUmVKrZq;
                    if (str2 != null) {
                        int length = str2.length();
                        int i = 0;
                        while (i < length) {
                            int codePointAt = str2.codePointAt(i);
                            if (!java.lang.Character.isWhitespace(codePointAt)) {
                                strArr = new java.lang.String[]{str3, "VF"};
                                break;
                            }
                            i += java.lang.Character.charCount(codePointAt);
                        }
                    }
                    strArr = new java.lang.String[]{str3};
                    java.lang.String[] strArr3 = strArr;
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr2, "query = ?", strArr3, null, null);
                        } catch (android.os.RemoteException e) {
                            android.util.Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    android.os.Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList = new java.util.ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList.add(new defpackage.y00(columnIndex3 == -1 ? android.content.ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : android.content.ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, e00Var.oh71FJcDz6S2, i2));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (defpackage.y00[]) arrayList.toArray(new defpackage.y00[0]);
                } finally {
                }
            } catch (java.lang.Throwable th) {
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

    public static android.content.pm.ProviderInfo giKS3J6vZuNy(android.content.pm.PackageManager packageManager, defpackage.e00 e00Var, android.content.res.Resources resources) {
        defpackage.i3 i3Var = giKS3J6vZuNy;
        defpackage.rj0 rj0Var = ZpBGe2uQfcn8;
        defpackage.v70.Ns0WNyEWdPsk("FontProvider.getProvider");
        try {
            java.util.List list = e00Var.JhCgjQRTAOCT;
            java.lang.String str = e00Var.ZpBGe2uQfcn8;
            java.lang.String str2 = e00Var.giKS3J6vZuNy;
            if (list == null) {
                list = defpackage.la0.VFeft99leXEK(resources, 0);
            }
            defpackage.c00 c00Var = new defpackage.c00();
            c00Var.ZpBGe2uQfcn8 = str;
            c00Var.giKS3J6vZuNy = str2;
            c00Var.fWTAfUmVKrZq = list;
            android.content.pm.ProviderInfo providerInfo = (android.content.pm.ProviderInfo) rj0Var.fWTAfUmVKrZq(c00Var);
            if (providerInfo != null) {
                return providerInfo;
            }
            android.content.pm.ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.content.pm.Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            java.util.Collections.sort(arrayList, i3Var);
            for (int i = 0; i < list.size(); i++) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) list.get(i));
                java.util.Collections.sort(arrayList2, i3Var);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!java.util.Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    rj0Var.JhCgjQRTAOCT(c00Var, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            android.os.Trace.endSection();
            return null;
        } finally {
            android.os.Trace.endSection();
        }
    }
}
