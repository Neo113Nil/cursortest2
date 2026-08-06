package defpackage;

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
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class fu {
    public static final bc0 GWasM1elztuh = new bc0(2);
    public static final l1 Yi7zF1RB1 = new l1(1);

    public static qu GWasM1elztuh(Context context, List list) {
        Typeface typeface;
        l60.encWxUiV2("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                gu guVar = (gu) list.get(i);
                if (Build.VERSION.SDK_INT >= 31) {
                    String str = guVar.OOA6hdeuvCS;
                    q70 q70Var = jb1.GWasM1elztuh;
                    if (str != null && !str.isEmpty()) {
                        typeface = Typeface.create(str, 0);
                        Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                        if (typeface != null && !typeface.equals(create)) {
                            if (typeface != null && jb1.GWasM1elztuh(typeface) != null) {
                                arrayList.add(new ru[]{new ru(str, guVar.EljAMC1QTz)});
                            }
                        }
                    }
                    typeface = null;
                    if (typeface != null) {
                        arrayList.add(new ru[]{new ru(str, guVar.EljAMC1QTz)});
                    }
                }
                ProviderInfo Yi7zF1RB12 = Yi7zF1RB1(context.getPackageManager(), guVar, context.getResources());
                if (Yi7zF1RB12 == null) {
                    qu quVar = new qu();
                    quVar.GWasM1elztuh = 1;
                    quVar.Yi7zF1RB1 = Collections.singletonList(null);
                    return quVar;
                }
                arrayList.add(X1lG3V04pd(context, guVar, Yi7zF1RB12.authority));
            }
            qu quVar2 = new qu();
            quVar2.GWasM1elztuh = 0;
            quVar2.Yi7zF1RB1 = arrayList;
            return quVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static ru[] X1lG3V04pd(Context context, gu guVar, String str) {
        String[] strArr;
        l60.encWxUiV2("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                l60.encWxUiV2("ContentQueryWrapper.query");
                try {
                    String str2 = guVar.EljAMC1QTz;
                    String str3 = guVar.X1lG3V04pd;
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
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList.add(new ru(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, guVar.EljAMC1QTz, i2));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (ru[]) arrayList.toArray(new ru[0]);
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

    public static ProviderInfo Yi7zF1RB1(PackageManager packageManager, gu guVar, Resources resources) {
        l1 l1Var = Yi7zF1RB1;
        bc0 bc0Var = GWasM1elztuh;
        l60.encWxUiV2("FontProvider.getProvider");
        try {
            List list = guVar.xqGvceK5x;
            String str = guVar.GWasM1elztuh;
            String str2 = guVar.Yi7zF1RB1;
            if (list == null) {
                list = o30.HFYAaqMd6(resources, 0);
            }
            eu euVar = new eu();
            euVar.GWasM1elztuh = str;
            euVar.Yi7zF1RB1 = str2;
            euVar.X1lG3V04pd = list;
            ProviderInfo providerInfo = (ProviderInfo) bc0Var.GWasM1elztuh(euVar);
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
            Collections.sort(arrayList, l1Var);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, l1Var);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    bc0Var.Yi7zF1RB1(euVar, resolveContentProvider);
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
