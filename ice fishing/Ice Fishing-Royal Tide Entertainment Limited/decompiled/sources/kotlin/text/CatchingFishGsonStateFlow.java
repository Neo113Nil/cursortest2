package kotlin.text;

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

/* loaded from: classes.dex */
public abstract class CatchingFishGsonStateFlow {
    public static final CatchingFishGsonIntent CatchingFishParcelableFAB = new CatchingFishGsonIntent(2);
    public static final CatchingFishToolbarRedux CatchingFishSnackbar = new CatchingFishToolbarRedux(4);

    public static CatchingFishRetrofitHiltFAB[] CatchingFishCoroutine(Context context, CatchingFishViewAsyncTask catchingFishViewAsyncTask, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        ContentProviderClient contentProviderClient3;
        Uri withAppendedId;
        CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("ContentQueryWrapper.query");
                try {
                    try {
                        String[] strArr2 = {catchingFishViewAsyncTask.CatchingFishCoroutine};
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
                                arrayList2.add(new CatchingFishRetrofitHiltFAB(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : Constants.MINIMAL_ERROR_STATUS_CODE, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, catchingFishViewAsyncTask.CatchingFishWorkManager, i));
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
                        return (CatchingFishRetrofitHiltFAB[]) arrayList.toArray(new CatchingFishRetrofitHiltFAB[0]);
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

    public static CatchingFishRoomManifest CatchingFishParcelableFAB(Context context, List list) {
        String str;
        Typeface CatchingFishCoroutine;
        CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                CatchingFishViewAsyncTask catchingFishViewAsyncTask = (CatchingFishViewAsyncTask) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (CatchingFishCoroutine = CatchingFishGraphQLAdMob.CatchingFishCoroutine((str = catchingFishViewAsyncTask.CatchingFishDaggerWebsocket))) == null || CatchingFishGraphQLAdMob.CatchingFishReduxKtor(CatchingFishCoroutine) == null) {
                    ProviderInfo CatchingFishSnackbar2 = CatchingFishSnackbar(context.getPackageManager(), catchingFishViewAsyncTask, context.getResources());
                    if (CatchingFishSnackbar2 == null) {
                        CatchingFishRoomManifest catchingFishRoomManifest = new CatchingFishRoomManifest();
                        catchingFishRoomManifest.CatchingFishReduxKtor = 1;
                        catchingFishRoomManifest.CatchingFishDaggerWebsocket = Collections.singletonList(null);
                        return catchingFishRoomManifest;
                    }
                    arrayList.add(CatchingFishCoroutine(context, catchingFishViewAsyncTask, CatchingFishSnackbar2.authority));
                } else {
                    arrayList.add(new CatchingFishRetrofitHiltFAB[]{new CatchingFishRetrofitHiltFAB(str, catchingFishViewAsyncTask.CatchingFishWorkManager)});
                }
            }
            return new CatchingFishRoomManifest(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo CatchingFishSnackbar(PackageManager packageManager, CatchingFishViewAsyncTask catchingFishViewAsyncTask, Resources resources) {
        CatchingFishToolbarRedux catchingFishToolbarRedux = CatchingFishSnackbar;
        CatchingFishGsonIntent catchingFishGsonIntent = CatchingFishParcelableFAB;
        CatchingFishDaggerBiometric.CatchingFishDaggerWebsocket("FontProvider.getProvider");
        try {
            List list = catchingFishViewAsyncTask.CatchingFishReduxKtor;
            String str = catchingFishViewAsyncTask.CatchingFishParcelableFAB;
            String str2 = catchingFishViewAsyncTask.CatchingFishSnackbar;
            if (list == null) {
                list = CatchingFishLayoutRoomFAB.CatchingFishGradleManifest(resources, 0);
            }
            CatchingFishGraphQLCameraX catchingFishGraphQLCameraX = new CatchingFishGraphQLCameraX();
            catchingFishGraphQLCameraX.CatchingFishParcelableFAB = str;
            catchingFishGraphQLCameraX.CatchingFishSnackbar = str2;
            catchingFishGraphQLCameraX.CatchingFishCoroutine = list;
            ProviderInfo providerInfo = (ProviderInfo) catchingFishGsonIntent.CatchingFishWorkManager(catchingFishGraphQLCameraX);
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
            Collections.sort(arrayList, catchingFishToolbarRedux);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, catchingFishToolbarRedux);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    catchingFishGsonIntent.CatchingFishFragmentHandler(catchingFishGraphQLCameraX, resolveContentProvider);
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
