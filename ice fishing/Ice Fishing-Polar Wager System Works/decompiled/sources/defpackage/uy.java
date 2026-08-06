package defpackage;

/* loaded from: classes.dex */
public abstract class uy {
    public static final defpackage.gg0 IHQe1A4L2xu = new defpackage.gg0(2);
    public static final defpackage.b3 oh6vYeIP = new defpackage.b3(1);

    public static defpackage.fz IHQe1A4L2xu(android.content.Context context, java.util.List list) {
        android.graphics.Typeface typeface;
        defpackage.l80.AARZUJiTa("FontProvider.getFontFamilyResult");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < list.size(); i++) {
                defpackage.vy vyVar = (defpackage.vy) list.get(i);
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    java.lang.String str = vyVar.adDC3e2L;
                    defpackage.c80 c80Var = defpackage.pj1.IHQe1A4L2xu;
                    if (str != null && !str.isEmpty()) {
                        typeface = android.graphics.Typeface.create(str, 0);
                        android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
                        if (typeface != null && !typeface.equals(create)) {
                            if (typeface != null && defpackage.pj1.IHQe1A4L2xu(typeface) != null) {
                                arrayList.add(new defpackage.gz[]{new defpackage.gz(str, vyVar.xiZrDbcSW0)});
                            }
                        }
                    }
                    typeface = null;
                    if (typeface != null) {
                        arrayList.add(new defpackage.gz[]{new defpackage.gz(str, vyVar.xiZrDbcSW0)});
                    }
                }
                android.content.pm.ProviderInfo oh6vYeIP2 = oh6vYeIP(context.getPackageManager(), vyVar, context.getResources());
                if (oh6vYeIP2 == null) {
                    defpackage.fz fzVar = new defpackage.fz();
                    fzVar.IHQe1A4L2xu = 1;
                    fzVar.oh6vYeIP = java.util.Collections.singletonList(null);
                    return fzVar;
                }
                arrayList.add(r1MBDhnF(context, vyVar, oh6vYeIP2.authority));
            }
            defpackage.fz fzVar2 = new defpackage.fz();
            fzVar2.IHQe1A4L2xu = 0;
            fzVar2.oh6vYeIP = arrayList;
            return fzVar2;
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static android.content.pm.ProviderInfo oh6vYeIP(android.content.pm.PackageManager packageManager, defpackage.vy vyVar, android.content.res.Resources resources) {
        defpackage.b3 b3Var = oh6vYeIP;
        defpackage.gg0 gg0Var = IHQe1A4L2xu;
        defpackage.l80.AARZUJiTa("FontProvider.getProvider");
        try {
            java.util.List list = vyVar.F7NU4MC0GW;
            java.lang.String str = vyVar.IHQe1A4L2xu;
            java.lang.String str2 = vyVar.oh6vYeIP;
            if (list == null) {
                list = defpackage.h1.wll2JLbTBC2(resources, 0);
            }
            defpackage.ty tyVar = new defpackage.ty();
            tyVar.IHQe1A4L2xu = str;
            tyVar.oh6vYeIP = str2;
            tyVar.r1MBDhnF = list;
            android.content.pm.ProviderInfo providerInfo = (android.content.pm.ProviderInfo) gg0Var.r1MBDhnF(tyVar);
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
            java.util.Collections.sort(arrayList, b3Var);
            for (int i = 0; i < list.size(); i++) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) list.get(i));
                java.util.Collections.sort(arrayList2, b3Var);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!java.util.Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    gg0Var.F7NU4MC0GW(tyVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            android.os.Trace.endSection();
            return null;
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static defpackage.gz[] r1MBDhnF(android.content.Context context, defpackage.vy vyVar, java.lang.String str) {
        java.lang.String[] strArr;
        defpackage.l80.AARZUJiTa("FontProvider.query");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority(str).build();
            android.net.Uri build2 = new android.net.Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            android.database.Cursor cursor = null;
            try {
                java.lang.String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                defpackage.l80.AARZUJiTa("ContentQueryWrapper.query");
                try {
                    java.lang.String str2 = vyVar.xiZrDbcSW0;
                    java.lang.String str3 = vyVar.r1MBDhnF;
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
                            arrayList.add(new defpackage.gz(columnIndex3 == -1 ? android.content.ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : android.content.ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, vyVar.xiZrDbcSW0, i2));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (defpackage.gz[]) arrayList.toArray(new defpackage.gz[0]);
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
}
