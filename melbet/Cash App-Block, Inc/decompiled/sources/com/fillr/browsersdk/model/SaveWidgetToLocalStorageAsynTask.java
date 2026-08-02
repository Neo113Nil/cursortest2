package com.fillr.browsersdk.model;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.apiclient.FillrWidgetResponse;
import com.fillr.browsersdk.model.AutofillPrompt;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.data.profile.ProfilesKt;
import com.squareup.wire.GrpcMethod;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes4.dex */
public final class SaveWidgetToLocalStorageAsynTask extends AsyncTask {
    public final /* synthetic */ int $r8$classId = 0;
    public Object callback;
    public final String localAssetName;
    public final Object widgetType;

    public SaveWidgetToLocalStorageAsynTask(FillrWidget fillrWidget, PopEncryptorV2_ popEncryptorV2_) {
        this.widgetType = fillrWidget;
        this.callback = popEncryptorV2_;
        this.localAssetName = (String) popEncryptorV2_.hmacKey;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Activity activity;
        FileOutputStream fileOutputStream;
        switch (this.$r8$classId) {
            case 0:
                String[] strArr = (String[]) objArr;
                if (strArr.length > 0) {
                    boolean z = false;
                    String str = strArr[0];
                    if (str != null && !str.isEmpty() && str.contains(((FillrWidget.WidgetType) this.widgetType).validator) && (activity = Fillr.getInstance().parentActivity) != null) {
                        String str2 = this.localAssetName;
                        GrpcMethod grpcMethod = null;
                        FileOutputStream fileOutputStream2 = null;
                        try {
                            if (activity.getFilesDir().getFreeSpace() < 2097152) {
                                SVG svg = Fillr.getInstance().fillrConfig;
                            } else {
                                File file = new File(activity.getFilesDir(), "widgets");
                                if (!file.exists()) {
                                    file.mkdir();
                                }
                                GrpcMethod grpcMethod2 = new GrpcMethod(new File(file, str2));
                                try {
                                    fileOutputStream2 = grpcMethod2.startWrite();
                                    fileOutputStream2.write(str.getBytes("UTF-8"));
                                    grpcMethod2.finishWrite(fileOutputStream2);
                                    z = true;
                                    SVG svg2 = Fillr.getInstance().fillrConfig;
                                } catch (Exception e) {
                                    FileOutputStream fileOutputStream3 = fileOutputStream2;
                                    grpcMethod = grpcMethod2;
                                    e = e;
                                    fileOutputStream = fileOutputStream3;
                                    e.printStackTrace();
                                    e.getMessage();
                                    SVG svg3 = Fillr.getInstance().fillrConfig;
                                    if (grpcMethod != null) {
                                        grpcMethod.failWrite(fileOutputStream);
                                    }
                                    return Boolean.valueOf(z);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = null;
                        }
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.FALSE;
            default:
                return doInBackground();
        }
    }

    public void handleWidgetDownloadFailure() {
        FillrWidget fillrWidget = (FillrWidget) this.widgetType;
        FillrWidget.WidgetType widgetType = (FillrWidget.WidgetType) fillrWidget.fillrWidgetParams.cryptor;
        widgetType.getClass();
        HashMap hashMap = FillrWidget.WidgetType.FAILED_DOWNLOAD_LISTENERS_BUILTIN;
        if (hashMap.containsKey(widgetType)) {
            new Handler(Looper.getMainLooper()).post(((FillrWidget$WidgetType$$ExternalSyntheticLambda0) hashMap.get(widgetType)).taskForWebview(null, widgetType));
        }
        Iterator it = widgetType.widgetLifeCycleListener.iterator();
        while (it.hasNext()) {
            ((AutofillPrompt.AnonymousClass1) it.next()).getClass();
        }
        if (((PopEncryptorV2_) this.callback).isInit) {
            fillrWidget.mWidgetSource = FillrWidget.WidgetSource.LOCAL;
            widgetType.isWidgetForceDisabled = false;
            fillrWidget.getWidgetFromLocalDirectory();
        }
    }

    public void onPostExecute(FillrWidgetResponse fillrWidgetResponse) {
        SharedPreferences defaultSharedPreferences;
        FillrWidget fillrWidget = (FillrWidget) this.widgetType;
        super.onPostExecute((SaveWidgetToLocalStorageAsynTask) fillrWidgetResponse);
        if (fillrWidgetResponse != null) {
            int i = fillrWidgetResponse.httpResponseCode;
            if (fillrWidget != null) {
                PopEncryptorV2_ popEncryptorV2_ = fillrWidget.fillrWidgetParams;
                FillrWidget.WidgetType widgetType = (FillrWidget.WidgetType) popEncryptorV2_.cryptor;
                String str = fillrWidgetResponse.widgetString;
                FillrWidget.WidgetSource widgetSource = FillrWidget.WidgetSource.REMOTE;
                FillrWidget.WidgetSource widgetSource2 = FillrWidget.WidgetSource.LOCAL;
                if (str == null) {
                    if (i == 304) {
                        Activity activity = Fillr.getInstance().parentActivity;
                        if (activity != null ? activity.getSharedPreferences("com.fillr.browsersdk", 0).getBoolean("com.fillr.browsersdk.download_widget", true) : false) {
                            SVG svg = Fillr.getInstance().fillrConfig;
                            fillrWidget.mWidgetSource = widgetSource;
                        } else {
                            fillrWidget.mWidgetSource = widgetSource2;
                        }
                        widgetType.isWidgetForceDisabled = false;
                        fillrWidget.getWidgetFromLocalDirectory();
                        return;
                    }
                    if (i != 401) {
                        SVG svg2 = Fillr.getInstance().fillrConfig;
                        handleWidgetDownloadFailure();
                        return;
                    }
                    SVG svg3 = Fillr.getInstance().fillrConfig;
                    widgetType.isWidgetForceDisabled = true;
                    Iterator it = widgetType.widgetLifeCycleListener.iterator();
                    while (it.hasNext()) {
                        ((AutofillPrompt.AnonymousClass1) it.next()).getClass();
                    }
                    return;
                }
                Activity activity2 = Fillr.getInstance().parentActivity;
                if (!(activity2 != null ? activity2.getSharedPreferences("com.fillr.browsersdk", 0).getBoolean("com.fillr.browsersdk.download_widget", true) : false)) {
                    fillrWidget.mWidgetSource = widgetSource2;
                    widgetType.isWidgetForceDisabled = false;
                    fillrWidget.getWidgetFromLocalDirectory();
                    return;
                }
                fillrWidget.mWidgetSource = widgetSource;
                fillrWidget.mWidgetJavaScript = str;
                widgetType.isWidgetForceDisabled = false;
                String str2 = fillrWidgetResponse.eTagString;
                Activity activity3 = Fillr.getInstance().parentActivity;
                if (activity3 != null && (defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity3)) != null) {
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putString(((String) popEncryptorV2_.encryptionKey).concat("-etag"), str2);
                    edit.apply();
                }
                FillrWidget.m1937$$Nest$mnotifyDownloadListeners(fillrWidget);
                SVG svg4 = Fillr.getInstance().fillrConfig;
                FillrWidget.WidgetType widgetType2 = (FillrWidget.WidgetType) popEncryptorV2_.cryptor;
                SaveWidgetToLocalStorageAsynTask saveWidgetToLocalStorageAsynTask = new SaveWidgetToLocalStorageAsynTask(widgetType2, (String) popEncryptorV2_.encryptionKey);
                if (!widgetType2.storageListeners.isEmpty()) {
                    saveWidgetToLocalStorageAsynTask.callback = new FillrWidget$PerformWidgetDownload$1(widgetType2);
                }
                saveWidgetToLocalStorageAsynTask.execute(str);
                return;
            }
        }
        SVG svg5 = Fillr.getInstance().fillrConfig;
        handleWidgetDownloadFailure();
    }

    public SaveWidgetToLocalStorageAsynTask(FillrWidget.WidgetType widgetType, String str) {
        this.widgetType = widgetType;
        this.localAssetName = str;
    }

    public FillrWidgetResponse doInBackground() {
        SharedPreferences defaultSharedPreferences;
        FillrWidget fillrWidget = (FillrWidget) this.widgetType;
        try {
            if (!fillrWidget.canDownload()) {
                return null;
            }
            String str = this.localAssetName;
            PopEncryptorV2_ popEncryptorV2_ = (PopEncryptorV2_) this.callback;
            Activity activity = Fillr.getInstance().parentActivity;
            return ProfilesKt.getWidgetResponse(str, popEncryptorV2_, (activity == null || (defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity)) == null) ? null : defaultSharedPreferences.getString(((String) fillrWidget.fillrWidgetParams.encryptionKey).concat("-etag"), null));
        } catch (Exception unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                super.onPostExecute((SaveWidgetToLocalStorageAsynTask) bool);
                if (((FillrWidget$PerformWidgetDownload$1) this.callback) != null) {
                    boolean booleanValue = bool.booleanValue();
                    FillrWidget$PerformWidgetDownload$1 fillrWidget$PerformWidgetDownload$1 = (FillrWidget$PerformWidgetDownload$1) this.callback;
                    if (booleanValue) {
                        fillrWidget$PerformWidgetDownload$1.onSuccess();
                        break;
                    } else {
                        fillrWidget$PerformWidgetDownload$1.onFailure();
                        break;
                    }
                }
                break;
            default:
                onPostExecute((FillrWidgetResponse) obj);
                break;
        }
    }
}
