package com.fillr.browsersdk.model;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.webkit.WebResourceResponse;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.FillrContentType;
import com.fillr.browsersdk.apiclient.FillrMappingServiceClient;
import com.fillr.browsersdk.utilities.FillrUtils;
import com.fillr.n1;
import com.google.android.filament.Box;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AutofillPrompt {
    public String lastFieldClicked;
    public FillrMappingServiceClient mClient;
    public final Fillr mFillr;
    public final n1 mWebViewMapper;
    public boolean isNewPage = false;
    public final WeakHashMap currentUrlCache = new WeakHashMap();
    public boolean fieldFocusedListenerFlag = false;
    public final AnonymousClass1 widgetListener = new AnonymousClass1();
    public final WeakHashMap viewCache = new WeakHashMap();
    public final Map clickCache = Collections.synchronizedMap(new WeakHashMap());
    public final Map urlCache = Collections.synchronizedMap(new WeakHashMap());
    public final Map lastNotifiedMapping = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.fillr.browsersdk.model.AutofillPrompt$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public AnonymousClass1() {
        }
    }

    /* renamed from: com.fillr.browsersdk.model.AutofillPrompt$3, reason: invalid class name */
    public final class AnonymousClass3 extends ResultReceiver {
        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
        }
    }

    public AutofillPrompt(Fillr fillr, n1 n1Var) {
        this.mWebViewMapper = n1Var;
        this.mFillr = fillr;
        this.mClient = new FillrMappingServiceClient(this.mFillr);
    }

    public final void dispatchPageEvent(JSONObject jSONObject) {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(new Handler(Looper.getMainLooper()));
        if (this.mClient == null) {
            this.mClient = new FillrMappingServiceClient(this.mFillr);
        }
        FillrMappingServiceClient fillrMappingServiceClient = this.mClient;
        fillrMappingServiceClient.getClass();
        try {
            String string2 = jSONObject.getString("type");
            if (string2 != null) {
                FillrWidgetPageEvent fillrWidgetPageEvent = FillrWidgetPageEvent.LOAD;
                if (string2.startsWith("page-")) {
                    string2 = string2.replace("page-", "");
                }
            }
            if (((FillrWidgetPageEvent) FillrWidgetPageEvent.VALUES.get(string2)) != null) {
                if (jSONObject.getString("url").trim().length() > 1) {
                    if (fillrMappingServiceClient.mFillr == null) {
                        fillrMappingServiceClient.mFillr = Fillr.getInstance();
                    }
                    try {
                        Intent intent = new Intent("com.fillr.service.PageEventService");
                        Box intentBuilder = fillrMappingServiceClient.mFillr.getIntentBuilder();
                        intent.setPackage((String) intentBuilder.mCenter);
                        intent.putExtra("receiver", anonymousClass3);
                        intent.putExtra("com.fillr.page.event", jSONObject.toString());
                        intent.putExtra("com.fillr.devkey", fillrMappingServiceClient.mFillr.getDeveloperKey());
                        SVG svg = fillrMappingServiceClient.mFillr.fillrConfig;
                        intent.putExtra("com.fillr.secretkey", svg == null ? null : (String) svg.cssRules);
                        intent.putExtra("com.fillr.sdkversion", "11.2.0");
                        intentBuilder.setIntentExtras(intent);
                        fillrMappingServiceClient.startFillrService(intent);
                    } catch (Exception unused) {
                        SVG svg2 = Fillr.getInstance().fillrConfig;
                    }
                }
            }
        } catch (Exception unused2) {
            SVG svg3 = Fillr.getInstance().fillrConfig;
        }
    }

    public final void handlePageEventForView(Object obj, WebResourceResponse webResourceResponse) {
        JSONObject jSONObject;
        if (obj == null || webResourceResponse == null) {
            return;
        }
        FillrContentType fillrContentType = FillrContentType.HTML_CONTENT;
        if ("fillr/json".equalsIgnoreCase(webResourceResponse.getMimeType())) {
            try {
                try {
                    jSONObject = new JSONObject(FillrUtils.streamToString(webResourceResponse.getData()));
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    dispatchPageEvent(jSONObject);
                    this.urlCache.remove(obj);
                    this.clickCache.remove(obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        r3 = !r5.getString("param").equals("ignore");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void notifyListener(String str, String str2) {
        boolean z;
        Map map;
        FillrCachedMapping fillrCachedMapping;
        if (this.fieldFocusedListenerFlag) {
            return;
        }
        int i = 1;
        if (this.mFillr == null || (map = this.lastNotifiedMapping) == null || this.lastFieldClicked == null || (fillrCachedMapping = (FillrCachedMapping) map.get(str)) == null) {
            z = true;
        } else {
            FillrMapping fillrMapping = fillrCachedMapping.fillrMapping;
            String str3 = this.lastFieldClicked;
            z = false;
            if (str3 != null) {
                try {
                    String optString = new JSONObject(str3).optString("pop_id");
                    if (optString != null) {
                        try {
                            JSONArray jSONArray = new JSONObject(fillrMapping.formMetaData.toString()).getJSONArray("fields");
                            int i2 = 0;
                            while (true) {
                                if (i2 < jSONArray.length()) {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                                    if (String.valueOf(jSONObject.optInt("pop_id")).equals(optString)) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                            SVG svg = Fillr.getInstance().fillrConfig;
                        }
                    }
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (z) {
            this.fieldFocusedListenerFlag = true;
            new Handler(Looper.getMainLooper()).postDelayed(new AutofillPrompt$$ExternalSyntheticLambda0(this, str2, i), 500L);
        }
    }
}
