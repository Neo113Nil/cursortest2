package L;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k0.j0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f413a = new j0(2);

    /* renamed from: b, reason: collision with root package name */
    public static final b f414b = new b();

    public static B0.g a(Context context, List list) {
        h0.f.b("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                e eVar = (e) list.get(i);
                ProviderInfo b2 = b(context.getPackageManager(), eVar, context.getResources());
                if (b2 == null) {
                    B0.g gVar = new B0.g();
                    Trace.endSection();
                    return gVar;
                }
                arrayList.add(c(context, eVar, b2.authority));
            }
            B0.g gVar2 = new B0.g(arrayList);
            Trace.endSection();
            return gVar2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        h0.f.b("FontProvider.getProvider");
        try {
            List list = eVar.f418d;
            String str = eVar.f415a;
            String str2 = eVar.f416b;
            if (list == null) {
                list = F.b.j(resources, 0);
            }
            c cVar = new c();
            cVar.f410a = str;
            cVar.f411b = str2;
            cVar.f412c = list;
            j0 j0Var = f413a;
            ProviderInfo providerInfo = (ProviderInfo) j0Var.f(cVar);
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
            b bVar = f414b;
            Collections.sort(arrayList, bVar);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, bVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    j0Var.j(cVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static j[] c(Context context, e eVar, String str) {
        h0.f.b("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                h0.f.b("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {eVar.f417c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
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
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new j(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (j[]) arrayList.toArray(new j[0]);
                } finally {
                    Trace.endSection();
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
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
