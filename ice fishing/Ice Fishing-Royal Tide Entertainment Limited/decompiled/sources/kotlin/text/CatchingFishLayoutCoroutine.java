package kotlin.text;

import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishLayoutCoroutine implements CatchingFishMockkAsyncTask, CatchingFishHandlerJUnit, CatchingFishFragmentFAB {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishLayoutCoroutine(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void CatchingFishCoroutine() {
        CatchingFishMockkView catchingFishMockkView = (CatchingFishMockkView) this.CatchingFishDaggerWebsocket;
        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
            ?? r2 = CatchingFishIntentBundle.CatchingFishViewModelFAB;
            CatchingFishFirebaseDagger.CatchingFishNavigation(r2, "<this>");
            ArrayList arrayList = new ArrayList(CatchingFishLayoutToast.CatchingFishParcelable(r2));
            boolean z = false;
            for (Object obj : r2) {
                boolean z2 = true;
                if (!z && CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, catchingFishMockkView)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            CatchingFishIntentBundle.CatchingFishViewModelFAB = arrayList;
        }
    }

    @Override // kotlin.text.CatchingFishHandlerJUnit
    public Object CatchingFishParcelableFAB() {
        SQLiteDatabase CatchingFishSnackbar;
        int i = this.CatchingFishReduxKtor;
        Object obj = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishMVIView catchingFishMVIView = (CatchingFishMVIView) ((CatchingFishEspressoAdMob) obj);
                catchingFishMVIView.getClass();
                int i2 = CatchingFishEspressoOkHttp.CatchingFishDaggerWebsocket;
                CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle();
                catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = null;
                catchingFishFluxFluxBundle.CatchingFishWorkManager = new ArrayList();
                catchingFishFluxFluxBundle.CatchingFishViewModelScope = null;
                catchingFishFluxFluxBundle.CatchingFishReduxKtor = "";
                HashMap hashMap = new HashMap();
                CatchingFishSnackbar = catchingFishMVIView.CatchingFishSnackbar();
                CatchingFishSnackbar.beginTransaction();
                try {
                    CatchingFishEspressoOkHttp catchingFishEspressoOkHttp = (CatchingFishEspressoOkHttp) CatchingFishMVIView.CatchingFishAnimationMockk(CatchingFishSnackbar.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new CatchingFishDataStoreHilt(catchingFishMVIView, hashMap, catchingFishFluxFluxBundle, 4));
                    CatchingFishSnackbar.setTransactionSuccessful();
                    return catchingFishEspressoOkHttp;
                } finally {
                }
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishMVIView catchingFishMVIView2 = (CatchingFishMVIView) ((CatchingFishOkHttpFirebase) obj);
                long CatchingFishParcelableFAB = catchingFishMVIView2.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB() - catchingFishMVIView2.CatchingFishViewModelScope.CatchingFishReduxKtor;
                CatchingFishSnackbar = catchingFishMVIView2.CatchingFishSnackbar();
                CatchingFishSnackbar.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(CatchingFishParcelableFAB)};
                    Cursor rawQuery = CatchingFishSnackbar.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            catchingFishMVIView2.CatchingFishLayout(rawQuery.getInt(0), CatchingFishGsonService.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = CatchingFishSnackbar.delete("events", "timestamp_ms < ?", strArr);
                    CatchingFishSnackbar.setTransactionSuccessful();
                    CatchingFishSnackbar.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 9:
                CatchingFishMVIView catchingFishMVIView3 = (CatchingFishMVIView) ((CatchingFishGsonRetrofit) obj).CatchingFishLayout;
                CatchingFishSnackbar = catchingFishMVIView3.CatchingFishSnackbar();
                CatchingFishSnackbar.beginTransaction();
                try {
                    CatchingFishSnackbar.compileStatement("DELETE FROM log_event_dropped").execute();
                    CatchingFishSnackbar.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + catchingFishMVIView3.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB()).execute();
                    CatchingFishSnackbar.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                CatchingFishMVIAppCompat catchingFishMVIAppCompat = (CatchingFishMVIAppCompat) obj;
                Iterator it = ((Iterable) ((CatchingFishMVIView) catchingFishMVIAppCompat.CatchingFishSnackbar).CatchingFishReduxKtor(new CatchingFishAsyncTaskWidget(2))).iterator();
                while (it.hasNext()) {
                    catchingFishMVIAppCompat.CatchingFishCoroutine.CatchingFishParcelableFAB((CatchingFishBundleMVIHilt) it.next(), 1, false);
                }
                return null;
        }
    }

    public boolean CatchingFishReduxKtor(CatchingFishViewPagerMockk catchingFishViewPagerMockk, int i, Bundle bundle) {
        CatchingFishGsonBundleMoshi catchingFishGsonBundleMoshi;
        CatchingFishAdMobGlide catchingFishAdMobGlide = (CatchingFishAdMobGlide) this.CatchingFishDaggerWebsocket;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((CatchingFishFABFluxHilt) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).CatchingFishOkHttp();
                Parcelable parcelable = (Parcelable) ((CatchingFishFABFluxHilt) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).CatchingFishCloudMessaging();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        CatchingFishFABFluxHilt catchingFishFABFluxHilt = (CatchingFishFABFluxHilt) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
        ClipData clipData = new ClipData(catchingFishFABFluxHilt.CatchingFishWorkManager(), new ClipData.Item(catchingFishFABFluxHilt.CatchingFishEspressoTesting()));
        if (i2 >= 31) {
            catchingFishGsonBundleMoshi = new CatchingFishServiceHilt(clipData, 2);
        } else {
            CatchingFishStripeAPIKtor catchingFishStripeAPIKtor = new CatchingFishStripeAPIKtor();
            catchingFishStripeAPIKtor.CatchingFishDaggerWebsocket = clipData;
            catchingFishStripeAPIKtor.CatchingFishWorkManager = 2;
            catchingFishGsonBundleMoshi = catchingFishStripeAPIKtor;
        }
        catchingFishGsonBundleMoshi.CatchingFishOkHttp(catchingFishFABFluxHilt.CatchingFishUnitTesting());
        catchingFishGsonBundleMoshi.setExtras(bundle);
        return CatchingFishFABCameraX.CatchingFishLayout(catchingFishAdMobGlide, catchingFishGsonBundleMoshi.build()) == null;
    }

    @Override // kotlin.text.CatchingFishFragmentFAB
    public void CatchingFishRoomDatabase(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        switch (this.CatchingFishReduxKtor) {
            case 10:
                CatchingFishJUnitJUnitKtor.CatchingFishSnackbar((Intent) this.CatchingFishDaggerWebsocket);
                break;
            case 11:
                ((CatchingFishBundleKtorFlux) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar.CatchingFishCoroutine(null);
                break;
            default:
                ((ScheduledFuture) this.CatchingFishDaggerWebsocket).cancel(false);
                break;
        }
    }

    public CatchingFishJobSchedulerMVI CatchingFishSnackbar(CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger) {
        CatchingFishGsonPicasso catchingFishGsonPicasso = (CatchingFishGsonPicasso) this.CatchingFishDaggerWebsocket;
        URL url = (URL) catchingFishAsyncTaskDagger.CatchingFishDaggerWebsocket;
        if (Log.isLoggable(CatchingFishToastHiltBundle.CatchingFishSpannableWidget("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
        httpURLConnection.setReadTimeout(catchingFishGsonPicasso.CatchingFishViewModelScope);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) catchingFishAsyncTaskDagger.CatchingFishViewModelScope;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    CatchingFishViewPagerMockk catchingFishViewPagerMockk = catchingFishGsonPicasso.CatchingFishParcelableFAB;
                    CatchingFishToastPayPal catchingFishToastPayPal = (CatchingFishToastPayPal) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    CatchingFishFABDatabinding catchingFishFABDatabinding = (CatchingFishFABDatabinding) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
                    CatchingFishMVIRoomView catchingFishMVIRoomView = new CatchingFishMVIRoomView(bufferedWriter, catchingFishFABDatabinding.CatchingFishReduxKtor, catchingFishFABDatabinding.CatchingFishDaggerWebsocket, catchingFishFABDatabinding.CatchingFishWorkManager, catchingFishFABDatabinding.CatchingFishViewModelScope);
                    catchingFishMVIRoomView.CatchingFishWorkManager(catchingFishToastPayPal);
                    catchingFishMVIRoomView.CatchingFishViewModelFAB();
                    catchingFishMVIRoomView.CatchingFishSnackbar.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(CatchingFishToastHiltBundle.CatchingFishSpannableWidget("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", valueOf);
                    }
                    CatchingFishToastHiltBundle.CatchingFishNavigation("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    CatchingFishToastHiltBundle.CatchingFishNavigation("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new CatchingFishJobSchedulerMVI(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new CatchingFishJobSchedulerMVI(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            CatchingFishJobSchedulerMVI catchingFishJobSchedulerMVI = new CatchingFishJobSchedulerMVI(responseCode, null, CatchingFishIntent.CatchingFishParcelableFAB(new BufferedReader(new InputStreamReader(gZIPInputStream))).CatchingFishParcelableFAB);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return catchingFishJobSchedulerMVI;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException | UnknownHostException unused) {
            CatchingFishToastHiltBundle.CatchingFishSpannableWidget("CctTransportBackend");
            return new CatchingFishJobSchedulerMVI(500, null, 0L);
        } catch (IOException | CatchingFishStripeAPIWidget unused2) {
            CatchingFishToastHiltBundle.CatchingFishSpannableWidget("CctTransportBackend");
            return new CatchingFishJobSchedulerMVI(Constants.MINIMAL_ERROR_STATUS_CODE, null, 0L);
        }
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        return this.CatchingFishDaggerWebsocket;
    }
}
