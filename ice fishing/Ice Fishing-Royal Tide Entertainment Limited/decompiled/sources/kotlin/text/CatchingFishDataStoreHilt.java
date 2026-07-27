package kotlin.text;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishDataStoreHilt implements CatchingFishHandlerJUnit, CatchingFishReduxIntent, CatchingFishRealmXMLLayout {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishDataStoreHilt(Object obj, Object obj2, Object obj3, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
        this.CatchingFishViewModelScope = obj3;
    }

    @Override // kotlin.text.CatchingFishReduxIntent
    public CatchingFishWorkManagerMVP CatchingFishDaggerWebsocket(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.CatchingFishDaggerWebsocket;
        String str2 = (String) this.CatchingFishWorkManager;
        CatchingFishMVPRecyclerView catchingFishMVPRecyclerView = (CatchingFishMVPRecyclerView) this.CatchingFishViewModelScope;
        String str3 = (String) obj;
        CatchingFishMVPMVPViewModel CatchingFishCoroutine = FirebaseMessaging.CatchingFishCoroutine(firebaseMessaging.CatchingFishSnackbar);
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = firebaseMessaging.CatchingFishParcelableFAB;
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        String CatchingFishCoroutine2 = "[DEFAULT]".equals(catchingFishPagingLibrary.CatchingFishSnackbar) ? "" : catchingFishPagingLibrary.CatchingFishCoroutine();
        String CatchingFishSnackbar = firebaseMessaging.CatchingFishViewModelFAB.CatchingFishSnackbar();
        synchronized (CatchingFishCoroutine) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = CatchingFishMVPRecyclerView.CatchingFishDaggerWebsocket;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str3);
                jSONObject.put("appVersion", CatchingFishSnackbar);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = CatchingFishCoroutine.CatchingFishParcelableFAB.edit();
                edit.putString(CatchingFishCoroutine2 + "|T|" + str2 + "|*", str);
                edit.commit();
            }
        }
        if (catchingFishMVPRecyclerView == null || !str3.equals(catchingFishMVPRecyclerView.CatchingFishParcelableFAB)) {
            com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary2 = firebaseMessaging.CatchingFishParcelableFAB;
            catchingFishPagingLibrary2.CatchingFishParcelableFAB();
            if ("[DEFAULT]".equals(catchingFishPagingLibrary2.CatchingFishSnackbar)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    catchingFishPagingLibrary2.CatchingFishParcelableFAB();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str3);
                new CatchingFishBundleGlide(firebaseMessaging.CatchingFishSnackbar, 1).CatchingFishCustomView(intent);
            }
        }
        return CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(str3);
    }

    @Override // kotlin.text.CatchingFishHandlerJUnit
    public Object CatchingFishParcelableFAB() {
        CatchingFishMVIMockk catchingFishMVIMockk = (CatchingFishMVIMockk) this.CatchingFishDaggerWebsocket;
        CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = (CatchingFishBundleMVIHilt) this.CatchingFishWorkManager;
        CatchingFishSpannableView catchingFishSpannableView = (CatchingFishSpannableView) this.CatchingFishViewModelScope;
        CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) catchingFishMVIMockk.CatchingFishReduxKtor;
        catchingFishMVIView.getClass();
        CatchingFishContextMVI catchingFishContextMVI = catchingFishBundleMVIHilt.CatchingFishCoroutine;
        if (Log.isLoggable(CatchingFishToastHiltBundle.CatchingFishSpannableWidget("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(catchingFishContextMVI);
        }
        ((Long) catchingFishMVIView.CatchingFishReduxKtor(new CatchingFishDataStoreHilt(catchingFishMVIView, (Object) catchingFishSpannableView, catchingFishBundleMVIHilt, 3))).getClass();
        catchingFishMVIMockk.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishBundleMVIHilt, 1, false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[SYNTHETIC] */
    @Override // kotlin.text.CatchingFishRealmXMLLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        Cursor cursor;
        String str;
        long insert;
        CatchingFishGsonService catchingFishGsonService;
        int i = this.CatchingFishReduxKtor;
        String str2 = "bytes";
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        CatchingFishGsonService catchingFishGsonService2 = CatchingFishGsonService.CACHE_FULL;
        int i6 = 2;
        Object obj2 = this.CatchingFishViewModelScope;
        Object obj3 = this.CatchingFishWorkManager;
        int i7 = 0;
        CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) this.CatchingFishDaggerWebsocket;
        switch (i) {
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = (CatchingFishBundleMVIHilt) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    boolean z = cursor2.getInt(7) != 0;
                    CatchingFishViewWorkManager catchingFishViewWorkManager = new CatchingFishViewWorkManager();
                    catchingFishViewWorkManager.CatchingFishLayout = new HashMap();
                    String string = cursor2.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    catchingFishViewWorkManager.CatchingFishReduxKtor = string;
                    catchingFishViewWorkManager.CatchingFishViewModelScope = Long.valueOf(cursor2.getLong(i6));
                    catchingFishViewWorkManager.CatchingFishViewModelFAB = Long.valueOf(cursor2.getLong(i5));
                    if (z) {
                        String string2 = cursor2.getString(4);
                        catchingFishViewWorkManager.CatchingFishWorkManager = new CatchingFishManifestBundle(string2 == null ? CatchingFishMVIView.CatchingFishLayout : new CatchingFishBiometricIntent(string2), cursor2.getBlob(5));
                        str = str2;
                    } else {
                        String string3 = cursor2.getString(4);
                        CatchingFishBiometricIntent catchingFishBiometricIntent = string3 == null ? CatchingFishMVIView.CatchingFishLayout : new CatchingFishBiometricIntent(string3);
                        Cursor query = catchingFishMVIView.CatchingFishSnackbar().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i8 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i8 += blob.length;
                            }
                            byte[] bArr = new byte[i8];
                            int i9 = 0;
                            int i10 = 0;
                            while (i9 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i9);
                                String str3 = str2;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                                    i10 += bArr2.length;
                                    i9++;
                                    query = cursor;
                                    str2 = str3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            str = str2;
                            query.close();
                            catchingFishViewWorkManager.CatchingFishWorkManager = new CatchingFishManifestBundle(catchingFishBiometricIntent, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        catchingFishViewWorkManager.CatchingFishDaggerWebsocket = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new CatchingFishHiltIntent(j, catchingFishBundleMVIHilt, catchingFishViewWorkManager.CatchingFishCloudMessaging()));
                    str2 = str;
                    i5 = 3;
                    i6 = 2;
                }
                return null;
            case 3:
                CatchingFishSpannableView catchingFishSpannableView = (CatchingFishSpannableView) obj2;
                CatchingFishManifestBundle catchingFishManifestBundle = catchingFishSpannableView.CatchingFishCoroutine;
                String str4 = catchingFishSpannableView.CatchingFishParcelableFAB;
                CatchingFishBundleMVIHilt catchingFishBundleMVIHilt2 = (CatchingFishBundleMVIHilt) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = catchingFishMVIView.CatchingFishSnackbar().compileStatement("PRAGMA page_size").simpleQueryForLong() * catchingFishMVIView.CatchingFishSnackbar().compileStatement("PRAGMA page_count").simpleQueryForLong();
                CatchingFishViewEspresso catchingFishViewEspresso = catchingFishMVIView.CatchingFishViewModelScope;
                if (simpleQueryForLong >= catchingFishViewEspresso.CatchingFishParcelableFAB) {
                    catchingFishMVIView.CatchingFishLayout(1L, catchingFishGsonService2, str4);
                    return -1L;
                }
                Long CatchingFishCoroutine = CatchingFishMVIView.CatchingFishCoroutine(sQLiteDatabase, catchingFishBundleMVIHilt2);
                if (CatchingFishCoroutine != null) {
                    insert = CatchingFishCoroutine.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", catchingFishBundleMVIHilt2.CatchingFishParcelableFAB);
                    contentValues.put("priority", Integer.valueOf(CatchingFishRoomGlide.CatchingFishParcelableFAB(catchingFishBundleMVIHilt2.CatchingFishCoroutine)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = catchingFishBundleMVIHilt2.CatchingFishSnackbar;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i11 = catchingFishViewEspresso.CatchingFishDaggerWebsocket;
                byte[] bArr4 = catchingFishManifestBundle.CatchingFishSnackbar;
                boolean z2 = bArr4.length <= i11;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(catchingFishSpannableView.CatchingFishReduxKtor));
                contentValues2.put("uptime_ms", Long.valueOf(catchingFishSpannableView.CatchingFishDaggerWebsocket));
                contentValues2.put("payload_encoding", catchingFishManifestBundle.CatchingFishParcelableFAB.CatchingFishParcelableFAB);
                contentValues2.put("code", catchingFishSpannableView.CatchingFishSnackbar);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr4 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int ceil = (int) Math.ceil(bArr4.length / i11);
                    for (int i12 = 1; i12 <= ceil; i12++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr4, (i12 - 1) * i11, Math.min(i12 * i11, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i12));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(catchingFishSpannableView.CatchingFishWorkManager).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            default:
                HashMap hashMap = (HashMap) obj3;
                CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = (CatchingFishFluxFluxBundle) obj2;
                Cursor cursor3 = (Cursor) obj;
                catchingFishMVIView.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i13 = cursor3.getInt(1);
                    CatchingFishGsonService catchingFishGsonService3 = CatchingFishGsonService.REASON_UNKNOWN;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            catchingFishGsonService3 = CatchingFishGsonService.MESSAGE_TOO_OLD;
                        } else if (i13 == 2) {
                            catchingFishGsonService = catchingFishGsonService2;
                            long j2 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new CatchingFishGlideLayout(j2, catchingFishGsonService));
                            i7 = 0;
                            i2 = 6;
                            i3 = 5;
                            i4 = 4;
                        } else if (i13 == 3) {
                            catchingFishGsonService3 = CatchingFishGsonService.PAYLOAD_TOO_BIG;
                        } else if (i13 == i4) {
                            catchingFishGsonService3 = CatchingFishGsonService.MAX_RETRIES_REACHED;
                        } else if (i13 == i3) {
                            catchingFishGsonService3 = CatchingFishGsonService.INVALID_PAYLOD;
                        } else if (i13 == i2) {
                            catchingFishGsonService3 = CatchingFishGsonService.SERVER_ERROR;
                        } else {
                            CatchingFishToastHiltBundle.CatchingFishNavigation("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                    }
                    catchingFishGsonService = catchingFishGsonService3;
                    long j22 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new CatchingFishGlideLayout(j22, catchingFishGsonService));
                    i7 = 0;
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i14 = CatchingFishManifestMoshi.CatchingFishCoroutine;
                    new ArrayList();
                    ((ArrayList) catchingFishFluxFluxBundle.CatchingFishWorkManager).add(new CatchingFishManifestMoshi((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long CatchingFishParcelableFAB = catchingFishMVIView.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                SQLiteDatabase CatchingFishSnackbar = catchingFishMVIView.CatchingFishSnackbar();
                CatchingFishSnackbar.beginTransaction();
                try {
                    Cursor rawQuery = CatchingFishSnackbar.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        CatchingFishContextManifest catchingFishContextManifest = new CatchingFishContextManifest(rawQuery.getLong(0), CatchingFishParcelableFAB);
                        rawQuery.close();
                        CatchingFishSnackbar.setTransactionSuccessful();
                        CatchingFishSnackbar.endTransaction();
                        catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = catchingFishContextManifest;
                        catchingFishFluxFluxBundle.CatchingFishViewModelScope = new CatchingFishCameraXWidget(new CatchingFishDaggerMVVM(catchingFishMVIView.CatchingFishSnackbar().compileStatement("PRAGMA page_size").simpleQueryForLong() * catchingFishMVIView.CatchingFishSnackbar().compileStatement("PRAGMA page_count").simpleQueryForLong(), CatchingFishViewEspresso.CatchingFishWorkManager.CatchingFishParcelableFAB));
                        catchingFishFluxFluxBundle.CatchingFishReduxKtor = (String) catchingFishMVIView.CatchingFishViewModelFAB.get();
                        return new CatchingFishEspressoOkHttp((CatchingFishContextManifest) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket, Collections.unmodifiableList((ArrayList) catchingFishFluxFluxBundle.CatchingFishWorkManager), (CatchingFishCameraXWidget) catchingFishFluxFluxBundle.CatchingFishViewModelScope, (String) catchingFishFluxFluxBundle.CatchingFishReduxKtor);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    CatchingFishSnackbar.endTransaction();
                    throw th4;
                }
        }
    }

    public /* synthetic */ CatchingFishDataStoreHilt(CatchingFishMVIView catchingFishMVIView, Object obj, CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishMVIView;
        this.CatchingFishViewModelScope = obj;
        this.CatchingFishWorkManager = catchingFishBundleMVIHilt;
    }
}
