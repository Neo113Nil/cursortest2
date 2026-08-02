package com.fillr.browsersdk;

import android.app.Activity;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.ProxyInfo;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.camera.core.processing.Edge;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.OffsetApplier;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.LocaleListCompat;
import androidx.core.provider.FontRequestWorker;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.tracing.Trace;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.memory.RealStrongMemoryCache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.bugsnag.android.Client;
import com.caverock.androidsvg.SVG;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.analytics.util.HttpService;
import com.fillr.browsersdk.analytics.FillrAnalyticsEvents;
import com.fillr.browsersdk.apiclient.FillrMappingServiceClient;
import com.fillr.browsersdk.interactors.AffiliateInteractor;
import com.fillr.browsersdk.model.AffiliateState;
import com.fillr.browsersdk.model.AutofillPrompt;
import com.fillr.browsersdk.model.FillrCachedMapping;
import com.fillr.browsersdk.model.FillrInterceptRequest;
import com.fillr.browsersdk.model.FillrJNIBinding;
import com.fillr.browsersdk.model.FillrMapping;
import com.fillr.browsersdk.model.FillrWebView;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.fillr.browsersdk.model.JSNativeInterface;
import com.fillr.browsersdk.model.SaveWidgetToLocalStorageAsynTask;
import com.fillr.browsersdk.model.WebviewProxy;
import com.fillr.browsersdk.tls.CertificateRegistry;
import com.fillr.browsersdk.tls.asn1.complextypes.SSLCertificate;
import com.fillr.browsersdk.utilities.FillrUtils;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.fillr.e0;
import com.fillr.featuretoggle.DefaultUnleash;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.featuretoggle.strategy.DevKeyStrategy;
import com.fillr.m1;
import com.fillr.n;
import com.fillr.n1;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zze;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zap;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.measurement.zzvk;
import com.google.android.gms.internal.mlkit_vision_common.zziv;
import com.google.android.gms.internal.mlkit_vision_common.zzla;
import com.google.android.gms.internal.mlkit_vision_common.zzmj;
import com.google.android.gms.internal.mlkit_vision_common.zzn;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.android.gms.internal.mlkit_vision_common.zzu;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzpe;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpk;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.internal.zzaza;
import com.google.android.libraries.places.internal.zzaze;
import com.google.android.libraries.places.internal.zzazr;
import com.google.android.libraries.places.internal.zzboq;
import com.google.android.libraries.places.internal.zzbpa;
import com.google.android.libraries.places.internal.zzbpq;
import com.google.android.libraries.places.internal.zzbpr;
import com.google.android.libraries.places.internal.zzbqd;
import com.google.android.libraries.places.internal.zzbsn;
import com.google.android.libraries.places.internal.zzbtf;
import com.google.android.libraries.places.internal.zzbtq;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzbud;
import com.google.android.libraries.places.internal.zzbuf;
import com.google.android.libraries.places.internal.zzbwy;
import com.google.android.libraries.places.internal.zzbxz;
import com.google.android.libraries.places.internal.zzbyl;
import com.google.android.libraries.places.internal.zzbzp;
import com.google.android.libraries.places.internal.zzbzz;
import com.google.android.libraries.places.internal.zzcaf;
import com.google.android.libraries.places.internal.zzcah;
import com.google.android.libraries.places.internal.zzcax;
import com.google.android.libraries.places.internal.zzcfj;
import com.google.android.libraries.places.internal.zzcgl;
import com.google.android.libraries.places.internal.zzfv;
import com.google.android.libraries.places.internal.zzie;
import com.google.android.libraries.places.internal.zzjn;
import com.google.android.libraries.places.internal.zzli;
import com.google.android.libraries.places.internal.zznv;
import com.google.android.libraries.places.internal.zzuh;
import com.google.android.libraries.places.internal.zzur;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.HeaderBehavior;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.zza;
import com.google.android.play.core.splitinstall.zzx;
import com.google.common.base.Joiner;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.zzb;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.mlkit.vision.text.zzd;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.autofillweb.api.AutofillWebField;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.cash.fillr.real.RealFillrWebManager$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.SharedFlowImpl;
import net.oneformapp.PopEncryptorV2_;
import org.brotli.dec.HuffmanTreeGroup;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Fillr {
    public static Fillr fillrInstance;
    public AffiliateInteractor affiliateInteractor;
    public int browserType;
    public int currentState;
    public zzd featureToggleManager;
    public SVG fillrConfig;
    public zzr formEventListener;
    public boolean globalTlsProxyEnabled;
    public Box intentBuilder;
    public Date lastActiveTime;
    public SVG mAnalyticsManager;
    public AutofillPrompt mAutofillPrompt;
    public RealFillrWebManager$$ExternalSyntheticLambda0 mCaptureValueListener;
    public String mDomain;
    public int mEmbeddedBrowser;
    public int mFillMode;
    public e0 mFillrCartInformationExtraction;
    public FillrInterceptRequest mInterceptRequest;
    public RealFillrWebManager$$ExternalSyntheticLambda0 mProfileListener;
    public FillrWebView mWebView;
    public n1 mWebViewMapper;
    public Activity parentActivity;
    public JWECryptoParts widgetManager;

    static {
        Collections.synchronizedMap(new HashMap());
        fillrInstance = null;
    }

    public static String getAutofillWidgetVersion() {
        return FillrWidgetVersion.mobileWidgetVersion;
    }

    public static Fillr getInstance() {
        if (fillrInstance == null) {
            Fillr fillr = new Fillr();
            fillr.fillrConfig = null;
            fillr.globalTlsProxyEnabled = false;
            fillr.mInterceptRequest = null;
            fillr.mWebView = null;
            fillr.parentActivity = null;
            fillr.browserType = 0;
            fillr.mEmbeddedBrowser = 0;
            fillr.mAnalyticsManager = null;
            fillr.mAutofillPrompt = null;
            fillr.mFillMode = 2;
            fillr.widgetManager = null;
            fillr.currentState = 1;
            fillr.featureToggleManager = zzd.getInstance();
            fillrInstance = fillr;
        }
        return fillrInstance;
    }

    public final void captureValueListener(RealFillrWebManager$$ExternalSyntheticLambda0 realFillrWebManager$$ExternalSyntheticLambda0) {
        this.mCaptureValueListener = realFillrWebManager$$ExternalSyntheticLambda0;
    }

    public final String getDeveloperKey() {
        SVG svg = this.fillrConfig;
        if (svg == null) {
            return null;
        }
        return (String) svg.rootElement;
    }

    public final zzd getFeatureToggleManager() {
        zzd zzdVar = this.featureToggleManager;
        return zzdVar != null ? zzdVar : zzd.getInstance();
    }

    public final FillrWebView getFillrWebView() {
        return this.mWebView;
    }

    public final Box getIntentBuilder() {
        if (this.intentBuilder == null) {
            Box box = new Box(this.parentActivity);
            this.intentBuilder = box;
            box.mHalfExtent = this.mAnalyticsManager;
        }
        return this.intentBuilder;
    }

    public final JWECryptoParts getWidgetManager() {
        if (this.widgetManager == null) {
            SVG svg = this.fillrConfig;
            if (svg == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Please initialize the Fillr SDK first by calling initialise()");
                return null;
            }
            this.widgetManager = new JWECryptoParts(svg, (Joiner) svg.idToElementMap);
        }
        return this.widgetManager;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:7|(1:9)(1:87)|10|(10:12|13|59|66|67|68|69|(1:71)|72|(4:74|75|76|77)(2:82|83))|86|66|67|68|69|(0)|72|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013e, code lost:
    
        r4 = getInstance().fillrConfig;
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialise(SVG svg, Activity activity) {
        int i;
        URI create;
        if (TextUtils.isEmpty((String) svg.rootElement) || TextUtils.isEmpty((String) svg.cssRules) || !((Joiner) svg.idToElementMap).isValid()) {
            a$$ExternalSyntheticBUOutline0.m$3("Please provide a valid activity, developer key and browser type");
            return;
        }
        this.parentActivity = activity;
        if (this.fillrConfig == null) {
            this.fillrConfig = svg;
        } else {
            SVG svg2 = getInstance().fillrConfig;
        }
        this.fillrConfig.getClass();
        this.browserType = 1;
        String developerKey = getDeveloperKey();
        if (developerKey != null) {
            i = 8;
            switch (developerKey) {
                case "acae64b94b204cafb5f62e09e7e32c6a":
                case "c0613c1c3417e7fdfc80b1991f737f11":
                    i = 6;
                    break;
                case "1ed4e880b0600a65bfbe8f001cf026a0":
                case "f401eb0b18d9ca5c20ad6e16574b0e27":
                case "4b2aea97188bc5ca920a47bdc81f52fd":
                case "caa4bd5f8250724734e6699e7d2172e5":
                    i = 3;
                    break;
                case "d10809284ec93c296f1834f6a4bfcec7":
                case "1d468ff17eb439c70c356763d4a23242":
                    i = 7;
                    break;
                case "3338ae760e05d70c7d67fa12bfb713b8":
                case "468d45f8bcb32b50075b121f41895c14":
                    i = 4;
                    break;
                case "91302c3c627f6901d97ddfca923cd20c":
                case "3cc62452cf0b9e8eab5978a90eacf75d":
                    i = 5;
                    break;
                case "NzIwOGQ2YTU3ODBlM2NiMGQ0Y2Y4YTE=":
                    i = 2;
                    break;
            }
            this.mEmbeddedBrowser = i;
            this.mAnalyticsManager = new SVG(this.parentActivity.getApplicationContext(), getDeveloperKey());
            getFeatureToggleManager().getClass();
            Object obj = null;
            String str = Settings.Secure.getString(activity.getContentResolver(), "android_id");
            zzd.userId = str;
            HashMap hashMap = new HashMap();
            Math.round(Math.random() * 1000000.0d);
            new UnleashContext(obj, obj, obj, new HashMap());
            if (getInstance() != null) {
                getInstance().getClass();
            }
            create = URI.create("https://api.fillr.com");
            System.getProperty("java.io.tmpdir");
            char c = File.separatorChar;
            PopEncryptorV2_ popEncryptorV2_ = new PopEncryptorV2_();
            if (create != null) {
                a$$ExternalSyntheticBUOutline0.m$1("You are required to specify the unleashAPI url");
                throw null;
            }
            popEncryptorV2_.hmacKey = hashMap;
            popEncryptorV2_.encryptionKey = new Box(create);
            popEncryptorV2_.cryptor = "fillr-android-feature-toggle";
            popEncryptorV2_.authStore = "fillr-instance ";
            popEncryptorV2_.isInit = true;
            zzd.unleash = new DefaultUnleash(activity, popEncryptorV2_, new DevKeyStrategy(0), new DevKeyStrategy(1), new DevKeyStrategy(4), new DevKeyStrategy(2));
            this.mWebViewMapper = n1.getInstance();
            SVG svg3 = this.fillrConfig;
            JWECryptoParts jWECryptoParts = new JWECryptoParts(svg3, (Joiner) svg3.idToElementMap);
            this.widgetManager = jWECryptoParts;
            this.mFillrCartInformationExtraction = new e0(this.mAnalyticsManager, (FillrWidget) jWECryptoParts.cipherText, this.mWebViewMapper);
            Box box = new Box(activity);
            this.intentBuilder = box;
            box.mHalfExtent = this.mAnalyticsManager;
            this.mAutofillPrompt = new AutofillPrompt(this, this.mWebViewMapper);
            this.mInterceptRequest = new FillrInterceptRequest();
            new FillrMappingServiceClient(this).runFeatureTogglesUpdateIfStopped();
            this.affiliateInteractor = new AffiliateInteractor(0);
            trackEvent(FillrAnalyticsEvents.FillrSDK_INIT, new String[0]);
            try {
                Intent intent = new Intent("com.fillr.service.DownloadSchemaService");
                intent.setPackage((String) this.intentBuilder.mCenter);
                this.parentActivity.startService(intent);
                return;
            } catch (Exception unused) {
                SVG svg4 = getInstance().fillrConfig;
                SVG svg5 = getInstance().fillrConfig;
                return;
            }
        }
        i = 1;
        this.mEmbeddedBrowser = i;
        this.mAnalyticsManager = new SVG(this.parentActivity.getApplicationContext(), getDeveloperKey());
        getFeatureToggleManager().getClass();
        Object obj2 = null;
        String str2 = Settings.Secure.getString(activity.getContentResolver(), "android_id");
        zzd.userId = str2;
        HashMap hashMap2 = new HashMap();
        Math.round(Math.random() * 1000000.0d);
        new UnleashContext(obj2, obj2, obj2, new HashMap());
        if (getInstance() != null) {
        }
        create = URI.create("https://api.fillr.com");
        System.getProperty("java.io.tmpdir");
        char c2 = File.separatorChar;
        PopEncryptorV2_ popEncryptorV2_2 = new PopEncryptorV2_();
        if (create != null) {
        }
    }

    public final boolean isCaptureValueEnabled() {
        boolean z;
        FillrWebView fillrWebView = this.mWebView;
        if (fillrWebView != null) {
            URL url = fillrWebView.getUrl();
            z = isEnabled(url == null ? null : url.toString());
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        getFeatureToggleManager().getClass();
        return true;
    }

    public final boolean isEnabled(String str) {
        boolean isEnabled = (str == null || str.matches(FillrUtils.EXCLUDED_DOMAINS[0])) ? false : FillrAuthenticationStore.isEnabled(this.parentActivity);
        getFeatureToggleManager().getClass();
        return isEnabled && ((str == null || str.length() <= 0) ? false : zzd.isFeatureEnabledForUrl("DisableURL", str) ^ true);
    }

    public final void notifyCaptureValueListener(String str, HashMap hashMap) {
        if (hashMap == null || hashMap.size() <= 0 || this.mCaptureValueListener == null) {
            return;
        }
        this.mWebViewMapper.getWebViewForId(str);
        RealFillrWebManager realFillrWebManager = this.mCaptureValueListener.f$0;
        Set set = ArraysKt___ArraysKt.toSet(new String[]{"Passwords.Password.Password", "PersonalDetails.SocialSecurityNumber"});
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!set.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        StateFlowKt.emitOrThrow(realFillrWebManager.lastCapturedValueInfo, new HashMap(linkedHashMap));
        trackEvent(FillrAnalyticsEvents.FillrSDK_CAPTURE_VALUES_LISTENER, new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r13.hasFillableFields() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        r2.numRefills++;
        r2.lastMappingTimestamp = java.lang.System.currentTimeMillis();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void notifyProfileListener(FillrMapping fillrMapping, String str) {
        FillrCachedMapping fillrCachedMapping;
        boolean z;
        JSONObject jSONObject = fillrMapping.formMetaData;
        List list = fillrMapping.fields;
        if (this.mProfileListener != null && list != null && list.size() > 0) {
            AutofillPrompt autofillPrompt = this.mAutofillPrompt;
            zzd zzdVar = this.featureToggleManager;
            JSONObject optJSONObject = jSONObject.optJSONObject("location");
            String str2 = "";
            if (optJSONObject != null) {
                try {
                    str2 = optJSONObject.getString("domain");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (str2 == null || zzdVar == null) {
                z = false;
            } else {
                zzd.isRefillEnabled(fillrMapping.domainWithPath());
                SVG svg = getInstance().fillrConfig;
                z = zzd.isRefillEnabled(fillrMapping.domainWithPath());
            }
            FillrCachedMapping fillrCachedMapping2 = (FillrCachedMapping) autofillPrompt.lastNotifiedMapping.get(str);
            boolean z2 = true;
            if (fillrCachedMapping2 != null) {
                FillrMapping fillrMapping2 = fillrCachedMapping2.fillrMapping;
                if (fillrMapping2.equals(fillrMapping) && (!fillrMapping.hasFillableFields() || fillrMapping.countVisibleFields() <= fillrMapping2.countVisibleFields())) {
                    if (z) {
                    }
                }
            }
            this.mWebViewMapper.getWebViewForId(str);
            RealFillrWebManager realFillrWebManager = this.mProfileListener.f$0;
            zzd zzdVar2 = AutofillWebField.Companion;
            list.getClass();
            zzdVar2.getClass();
            StateFlowKt.emitOrThrow(realFillrWebManager.cardFieldDetected, Boolean.valueOf(!CollectionsKt.intersect(zzd.toAutofillFields(list), AutofillWebField.cardFields).isEmpty()));
            list.getClass();
            LinkedHashSet intersect = CollectionsKt.intersect(zzd.toAutofillFields(list), AutofillWebField.infoFields);
            ArrayList arrayList = new ArrayList();
            Iterator it = intersect.iterator();
            while (true) {
                String str3 = null;
                if (!it.hasNext()) {
                    break;
                }
                int ordinal = ((AutofillWebField) it.next()).ordinal();
                if (ordinal == 1) {
                    str3 = "sms";
                } else if (ordinal == 2) {
                    str3 = "email";
                }
                if (str3 != null) {
                    arrayList.add(str3);
                }
            }
            StateFlowKt.emitOrThrow(realFillrWebManager.infoFieldsDetected, CollectionsKt.toSet(arrayList));
            AutofillWebField.Companion.getClass();
            Set set = AutofillWebField.address1Fields;
            list.getClass();
            ArrayList autofillFields = zzd.toAutofillFields(list);
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (autofillFields.contains((AutofillWebField) it2.next())) {
                        break;
                    }
                }
            }
            z2 = false;
            StateFlowKt.emitOrThrow(realFillrWebManager.address1FieldDetected, Boolean.valueOf(z2));
            SharedFlowImpl sharedFlowImpl = realFillrWebManager.loggingFieldsDetected;
            list.getClass();
            StateFlowKt.emitOrThrow(sharedFlowImpl, CollectionsKt.toSet(list));
            list.getClass();
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                arrayList2.add(new Pair(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Field "), (String) obj));
                i = i2;
            }
            MapsKt__MapsKt.toMap(arrayList2);
            realFillrWebManager.mapping = fillrMapping;
            AutofillPrompt autofillPrompt2 = this.mAutofillPrompt;
            autofillPrompt2.getClass();
            FillrCachedMapping fillrCachedMapping3 = new FillrCachedMapping(fillrMapping);
            Map map = autofillPrompt2.lastNotifiedMapping;
            if (!fillrCachedMapping3.equals(map.get(str))) {
                map.put(str, fillrCachedMapping3);
            }
            trackEvent(FillrAnalyticsEvents.FillrSDK_ON_FORM_DETECTED, new String[0]);
            return;
        }
        if (list == null || list.size() <= 0 || (fillrCachedMapping = (FillrCachedMapping) this.mAutofillPrompt.lastNotifiedMapping.get(str)) == null) {
            return;
        }
        JSONObject jSONObject2 = fillrCachedMapping.fillrMapping.formMetaData;
        if (jSONObject.has("fields")) {
            try {
                JSONArray jSONArray = new JSONObject(jSONObject2.toString()).getJSONArray("fields");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                    linkedHashMap.put(jSONObject3.get("pop_id"), jSONObject3);
                }
                JSONArray jSONArray2 = jSONObject.getJSONArray("fields");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i4);
                    linkedHashMap2.put(jSONObject4.get("pop_id"), jSONObject4);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    JSONObject jSONObject5 = (JSONObject) entry.getValue();
                    JSONObject jSONObject6 = (JSONObject) linkedHashMap2.get(entry.getKey());
                    if (jSONObject6 != null) {
                        String[] strArr = FillrMapping.MUTABLE_FLAGS;
                        for (int i5 = 0; i5 < 5; i5++) {
                            String str4 = strArr[i5];
                            if (jSONObject6.has(str4)) {
                                jSONObject5.put(str4, jSONObject6.get(str4));
                            }
                        }
                    }
                }
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    jSONArray3.put((JSONObject) it3.next());
                }
                jSONObject2.put("fields", jSONArray3);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void onDestroy() {
        this.parentActivity = null;
        this.mFillrCartInformationExtraction = null;
        this.mProfileListener = null;
        this.mCaptureValueListener = null;
        this.widgetManager = null;
    }

    public final void onPageFinished(WebView webView) {
        boolean z;
        if (FillrAuthenticationStore.isEnabled(this.parentActivity)) {
            if (webView != null) {
                n1 n1Var = this.mWebViewMapper;
                if (n1Var == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Please initialize the Fillr SDK first");
                    return;
                }
                if (n1Var.getTrackedWebView(webView) != null) {
                    FillrWebView trackedWebView = this.mWebViewMapper.getTrackedWebView(webView);
                    AutofillPrompt autofillPrompt = this.mAutofillPrompt;
                    autofillPrompt.getClass();
                    Fillr fillr = getInstance();
                    fillr.getClass();
                    String str = null;
                    if (trackedWebView != null) {
                        URL url = trackedWebView.getUrl();
                        z = fillr.isEnabled(url == null ? null : url.toString());
                    } else {
                        z = false;
                    }
                    if (z) {
                        Fillr fillr2 = getInstance();
                        fillr2.getClass();
                        if (trackedWebView != null) {
                            URL url2 = trackedWebView.getUrl();
                            String url3 = url2 == null ? null : url2.toString();
                            fillr2.getFeatureToggleManager().getClass();
                            if (!zzd.isPropertyDisabledForDevKeyUrl("DisableAutofillDevKeyDomain", url3) && !((FillrWidget.WidgetType) ((FillrWidget) fillr2.getWidgetManager().iv).fillrWidgetParams.cryptor).isWidgetForceDisabled) {
                                autofillPrompt.isNewPage = true;
                            }
                        }
                    }
                    this.widgetManager.injectEnabledWidgets(trackedWebView);
                    URL url4 = trackedWebView.getUrl();
                    String host = url4 == null ? null : url4.getHost();
                    if (host != null) {
                        try {
                            str = host.startsWith("www.") ? host.substring(4) : host;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    String str2 = this.mDomain;
                    if (str2 == null) {
                        this.mDomain = str;
                    } else if (!str2.equals(str) || (host != null && host.isEmpty())) {
                        this.mAutofillPrompt.getClass();
                        this.mDomain = str;
                    }
                    this.lastActiveTime = new Date();
                    new FillrMappingServiceClient(this).runFeatureTogglesUpdateIfStopped();
                    AffiliateInteractor affiliateInteractor = this.affiliateInteractor;
                    if (affiliateInteractor != null) {
                        affiliateInteractor.urlRequestMethodsMap.clear();
                        HashMap hashMap = affiliateInteractor.affiliateStatesMap;
                        if (((AffiliateState) hashMap.get(trackedWebView)) == null) {
                            AffiliateState affiliateState = new AffiliateState();
                            new ArrayList();
                            hashMap.put(trackedWebView, affiliateState);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            SVG svg = getInstance().fillrConfig;
        }
    }

    public final boolean onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null && sslError != null) {
            trackEvent(FillrAnalyticsEvents.FillrSDK_ON_SSL_ERROR, new String[0]);
            SslCertificate certificate = sslError.getCertificate();
            String str = null;
            String cName = (certificate == null || certificate.getIssuedBy() == null) ? null : certificate.getIssuedBy().getCName();
            SslCertificate certificate2 = sslError.getCertificate();
            if (certificate2 != null && certificate2.getIssuedBy() != null) {
                str = certificate2.getIssuedBy().getUName();
            }
            SSLCertificate whitelistedCertificate = CertificateRegistry.getWhitelistedCertificate(cName);
            if (whitelistedCertificate != null && ((BigInteger) whitelistedCertificate.tbsCert.serialNumber.date).toString(16).equals(str) && !TextUtils.isEmpty(cName) && sslError.getPrimaryError() == 3) {
                SVG svg = getInstance().fillrConfig;
                sslErrorHandler.proceed();
                return true;
            }
        }
        return false;
    }

    public final synchronized void performAutofillOnWebView(FillrWebView fillrWebView, FillrMapping fillrMapping) {
        try {
            if (fillrMapping != null) {
                String profileData = fillrMapping.getProfileData();
                boolean z = true;
                JSONObject formMappings = fillrMapping.getFormMappings(this.mFillMode == 2);
                if (fillrWebView != null && profileData != null && profileData.length() > 0 && formMappings.toString().length() > 0) {
                    populateWebviewFields(profileData, formMappings.toString(), fillrWebView);
                }
                List list = fillrMapping.fields;
                if (list == null || list.size() <= 0) {
                    z = false;
                }
                if (z) {
                    new FillrMappingServiceClient(this).sendPerformanceForHeadlessFill(fillrMapping);
                    SVG svg = getInstance().fillrConfig;
                }
            } else {
                SVG svg2 = getInstance().fillrConfig;
            }
        } finally {
        }
    }

    public final void populateWebviewFields(String str, String str2, FillrWebView fillrWebView) {
        if (fillrWebView == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return;
        }
        AutofillPrompt autofillPrompt = this.mAutofillPrompt;
        autofillPrompt.fieldFocusedListenerFlag = true;
        new Handler(Looper.getMainLooper()).postDelayed(new Client.AnonymousClass7(autofillPrompt, 18), 1500L);
        String sanitiseJsonString = FillrUtils.sanitiseJsonString(str2);
        String sanitiseJsonString2 = FillrUtils.sanitiseJsonString(str);
        if (sanitiseJsonString2 != null && sanitiseJsonString != null) {
            fillrWebView.loadJavascript(Boxes$$ExternalSyntheticOutline1.m("PopWidgetInterface.populateWithMappings(JSON.parse('", sanitiseJsonString, "'), JSON.parse('", sanitiseJsonString2, "'));"));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass3(this, str2, str), 500L);
    }

    public final void profileDataListener(RealFillrWebManager$$ExternalSyntheticLambda0 realFillrWebManager$$ExternalSyntheticLambda0) {
        this.mProfileListener = realFillrWebManager$$ExternalSyntheticLambda0;
    }

    public final void setCartInformationExtractionListener(RealFillrWebManager$$ExternalSyntheticLambda0 realFillrWebManager$$ExternalSyntheticLambda0) {
        e0 e0Var = this.mFillrCartInformationExtraction;
        if (e0Var != null) {
            e0Var.c = realFillrWebManager$$ExternalSyntheticLambda0;
            trackEvent(FillrAnalyticsEvents.FillrSDK_ON_CART_EXTRACTION_LISTENER, new String[0]);
        }
    }

    public final void setFillMode() {
        this.mFillMode = 2;
    }

    public final void setFormEventListener(zzr zzrVar) {
        this.formEventListener = zzrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b3, code lost:
    
        if (com.google.mlkit.vision.text.zzd.isFeatureEnabledForProperties("EnableProxyRequestInterception", r4) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163 A[Catch: all -> 0x00ee, TRY_LEAVE, TryCatch #4 {all -> 0x00ee, blocks: (B:31:0x00b4, B:33:0x00ba, B:35:0x00c8, B:37:0x00d4, B:38:0x00e7, B:39:0x00f1, B:120:0x00fd, B:122:0x010c, B:126:0x011a, B:41:0x0123, B:44:0x012a, B:46:0x0133, B:47:0x014e, B:49:0x0153, B:51:0x0159, B:53:0x0163, B:96:0x0170, B:99:0x0178, B:101:0x017d, B:102:0x0183, B:104:0x0191, B:108:0x01b7, B:109:0x01c6, B:111:0x01bc, B:112:0x019d, B:118:0x0140), top: B:30:0x00b4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        String str2;
        String str3;
        WebResourceResponse webResourceResponse;
        FillrContentType fillrContentType;
        AutofillPrompt autofillPrompt;
        Object obj;
        String str4;
        WebResourceResponse defaultInterceptionStrategy;
        String[] split;
        if (FillrAuthenticationStore.isEnabled(this.parentActivity) && this.currentState == 1 && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            getInstance().getClass();
            zzd featureToggleManager = getFeatureToggleManager();
            AutofillPrompt autofillPrompt2 = this.mAutofillPrompt;
            if (autofillPrompt2 != null) {
                str = (String) autofillPrompt2.urlCache.get(webView);
                str2 = (String) this.mAutofillPrompt.clickCache.get(webView);
                if (webResourceRequest.isForMainFrame()) {
                    str3 = webResourceRequest.getUrl().toString();
                    WeakHashMap weakHashMap = this.mAutofillPrompt.currentUrlCache;
                    if (weakHashMap != null && webView != null && str3 != null) {
                        weakHashMap.put(webView, str3);
                    }
                } else {
                    AutofillPrompt autofillPrompt3 = this.mAutofillPrompt;
                    if (webView != null) {
                        WeakHashMap weakHashMap2 = autofillPrompt3.currentUrlCache;
                        if (weakHashMap2 != null) {
                            str3 = (String) weakHashMap2.get(webView);
                        }
                    } else {
                        autofillPrompt3.getClass();
                    }
                    str3 = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if (getInstance().isEnabled(str3)) {
                featureToggleManager.getClass();
                if (!zzd.isFeatureEnabledForUrl("DisableIframeAutofilling", str3)) {
                    Fillr fillr = getInstance();
                    fillr.getFeatureToggleManager().getClass();
                    if (!zzd.isPropertyDisabledForDevKeyUrl("DisableAutofillDevKeyDomain", str3) && !((FillrWidget.WidgetType) ((FillrWidget) fillr.getWidgetManager().iv).fillrWidgetParams.cryptor).isWidgetForceDisabled) {
                        if (this.mInterceptRequest == null) {
                            this.mInterceptRequest = new FillrInterceptRequest();
                        }
                        FillrInterceptRequest fillrInterceptRequest = this.mInterceptRequest;
                        synchronized (fillrInterceptRequest) {
                            try {
                                if (webResourceRequest.getUrl() != null) {
                                    String uri = webResourceRequest.getUrl().toString();
                                    if (webResourceRequest.isForMainFrame()) {
                                        webResourceRequest.getMethod();
                                        FillrInterceptRequest.isHtml(webResourceRequest);
                                        if (webResourceRequest.getRequestHeaders() != null) {
                                            "xmlhttprequest".equalsIgnoreCase(webResourceRequest.getRequestHeaders().get("HTTP_X_REQUESTED_WITH"));
                                        }
                                        SVG svg = getInstance().fillrConfig;
                                    }
                                    if (uri.toLowerCase().endsWith("fillr.local/widget.js")) {
                                        try {
                                            webResourceResponse = fillrInterceptRequest.wrapResponse(FillrInterceptRequest.appendWidget("", FillrContentType.JS_CONTENT, uri), "text/javascript");
                                            try {
                                                webResourceResponse.setMimeType("text/javascript");
                                                SVG svg2 = getInstance().fillrConfig;
                                            } catch (Exception unused) {
                                                SVG svg3 = getInstance().fillrConfig;
                                                if (webResourceResponse != null) {
                                                }
                                                return null;
                                            }
                                        } catch (Exception unused2) {
                                            webResourceResponse = null;
                                        }
                                    } else {
                                        Fillr fillr2 = getInstance();
                                        zzd zzdVar = FillrInterceptRequest.FEATURE_MANAGER;
                                        boolean z = false;
                                        try {
                                            split = uri.split("\\?");
                                        } catch (Exception e) {
                                            e.getMessage().getClass();
                                            SVG svg4 = getInstance().fillrConfig;
                                        }
                                        if (split.length > 0) {
                                            str4 = new URI(split[0]).getHost();
                                            zzdVar.getClass();
                                            if (str4 != null && str4.length() > 0) {
                                                z = !zzd.isFeatureEnabledForUrl("DisableURL", str4);
                                            }
                                            if (z) {
                                                SVG svg5 = getInstance().fillrConfig;
                                            } else {
                                                String processPageEvent = (str == null || str2 == null || !webResourceRequest.isForMainFrame() || fillr2 == null || fillr2.mEmbeddedBrowser != 3) ? null : FillrInterceptRequest.processPageEvent(webResourceRequest, str, str2);
                                                boolean isRunningProxyForView = FillrWebView.isRunningProxyForView(webView);
                                                Integer num = (Integer) FillrWebView.VIEW_OPTIONS.get(webView);
                                                if (num == null || !FillrWebView.isOptionSet(num.intValue(), 2)) {
                                                    FillrInterceptRequest.FEATURE_MANAGER.getClass();
                                                    HashMap hashMap = new HashMap();
                                                    hashMap.put("url", str3);
                                                }
                                                if (isRunningProxyForView) {
                                                    defaultInterceptionStrategy = fillrInterceptRequest.proxiedRequestStrategy(webView, uri, webResourceRequest);
                                                    webResourceResponse = FillrInterceptRequest.mergeResults(defaultInterceptionStrategy, processPageEvent);
                                                }
                                                SVG svg6 = getInstance().fillrConfig;
                                                defaultInterceptionStrategy = fillrInterceptRequest.defaultInterceptionStrategy(uri, webResourceRequest);
                                                webResourceResponse = FillrInterceptRequest.mergeResults(defaultInterceptionStrategy, processPageEvent);
                                            }
                                        }
                                        str4 = null;
                                        zzdVar.getClass();
                                        if (str4 != null) {
                                            z = !zzd.isFeatureEnabledForUrl("DisableURL", str4);
                                        }
                                        if (z) {
                                        }
                                    }
                                }
                                webResourceResponse = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (webResourceResponse != null) {
                            String mimeType = webResourceResponse.getMimeType();
                            FillrContentType fillrContentType2 = FillrContentType.HTML_CONTENT;
                            if (FillrContentType.MIXED_CONTENT == (TextUtils.isEmpty(mimeType) ? null : (FillrContentType) FillrContentType.VALUES.get(mimeType.toLowerCase()))) {
                                FillrInterceptRequest fillrInterceptRequest2 = this.mInterceptRequest;
                                AutofillPrompt autofillPrompt4 = this.mAutofillPrompt;
                                fillrInterceptRequest2.getClass();
                                try {
                                    JSONObject jSONObject = new JSONObject(FillrUtils.streamToString(webResourceResponse.getData()));
                                    if (autofillPrompt4 != null && jSONObject.has("fillr/json") && (obj = jSONObject.get("fillr/json")) != null) {
                                        String obj2 = obj.toString();
                                        Charset charset = StandardCharsets.UTF_8;
                                        autofillPrompt4.handlePageEventForView(webView, new WebResourceResponse("fillr/json", charset.toString(), new ByteArrayInputStream(obj2.getBytes(charset.toString()))));
                                    }
                                    if (jSONObject.has("text/html")) {
                                        Object obj3 = jSONObject.get("text/html");
                                        if (obj3 != null) {
                                            String obj4 = obj3.toString();
                                            Charset charset2 = StandardCharsets.UTF_8;
                                            webResourceResponse = new WebResourceResponse("text/html", charset2.toString(), new ByteArrayInputStream(obj4.getBytes(charset2.toString())));
                                        }
                                    }
                                } catch (Exception unused3) {
                                    SVG svg7 = getInstance().fillrConfig;
                                }
                                webResourceResponse = null;
                            }
                            if (webResourceResponse != null) {
                                String mimeType2 = webResourceResponse.getMimeType();
                                if (!TextUtils.isEmpty(mimeType2)) {
                                    fillrContentType = (FillrContentType) FillrContentType.VALUES.get(mimeType2.toLowerCase());
                                    autofillPrompt = this.mAutofillPrompt;
                                    if (autofillPrompt != null || FillrContentType.EVENT_CONTENT != fillrContentType) {
                                        return webResourceResponse;
                                    }
                                    autofillPrompt.handlePageEventForView(webView, webResourceResponse);
                                    return null;
                                }
                            }
                            fillrContentType = null;
                            autofillPrompt = this.mAutofillPrompt;
                            if (autofillPrompt != null) {
                            }
                            return webResourceResponse;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void trackEvent(FillrAnalyticsEvents fillrAnalyticsEvents, String... strArr) {
        String str;
        SVG svg = this.mAnalyticsManager;
        if (svg != null) {
            if (fillrAnalyticsEvents.ordinal() == 8) {
                if (strArr.length > 0) {
                    m1 m1Var = new m1(svg, 14);
                    try {
                        JSONObject jSONObject = new JSONObject(strArr[0]);
                        JSONArray jSONArray = jSONObject.getJSONArray("fields");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            jSONObject.optString("fill_id");
                            jSONObject.optString("widget_version");
                            m1Var.createEvent(jSONObject2);
                        }
                        return;
                    } catch (JSONException unused) {
                        SVG svg2 = getInstance().fillrConfig;
                        return;
                    }
                }
                return;
            }
            AnalyticsEvent createEvent = svg.createEvent();
            int i2 = fillrAnalyticsEvents.action;
            String str2 = null;
            if (i2 != 0) {
                switch (i2) {
                    case 1:
                        str = "ABANDONMENT_REPORT";
                        break;
                    case 2:
                        str = "Autofill Service Enabled";
                        break;
                    case 3:
                        str = "Autofill Service Disabled";
                        break;
                    case 4:
                        str = "Fillr Turned On";
                        break;
                    case 5:
                        str = "Fillr Turned Off";
                        break;
                    case 6:
                        str = "In-app Save Button Displayed";
                        break;
                    case 7:
                        str = "In-app Save Button Tapped";
                        break;
                    case 8:
                        str = "In-app No Thanks Tapped";
                        break;
                    case 9:
                        str = "In-field Button Tapped";
                        break;
                    case 10:
                        str = "In-field Button Shown";
                        break;
                    case 11:
                        str = "In-field Button Dismissed";
                        break;
                    case 12:
                        str = "Fillr Bar Shown";
                        break;
                    case 13:
                        str = "Secure Autofill Button";
                        break;
                    case 14:
                        str = "Fillr Keyboard Dismissed";
                        break;
                    case 15:
                        str = "Web Form Filled";
                        break;
                    case 16:
                        str = "Web Form Filled Headless Mode";
                        break;
                    case 17:
                        str = "Affiliate Link Generated";
                        break;
                    case 18:
                        str = "SDK Initialise";
                        break;
                    case 19:
                        str = "Track WebView";
                        break;
                    case 20:
                        str = "On SSL Error";
                        break;
                    case 21:
                        str = "On Form Detected Listener";
                        break;
                    case 22:
                        str = "On Trigger Fill";
                        break;
                    case 23:
                        str = "On Page Intercept";
                        break;
                    case 24:
                        str = "On Page Finished";
                        break;
                    case 25:
                        str = "On Field Focused";
                        break;
                    case 26:
                        str = "Capture Values Listener";
                        break;
                    case 27:
                        str = "on Capture Values Trigger";
                        break;
                    case 28:
                        str = "Cart Extraction Listener";
                        break;
                    case 29:
                        str = "Process URL for Affiliates";
                        break;
                    case 30:
                        str = "Affiliates Enabled";
                        break;
                    case 31:
                        str = "Process Affiliate Redirection Request";
                        break;
                    default:
                        throw null;
                }
                str2 = str;
            }
            createEvent.action = str2;
            if (strArr.length > 3 && fillrAnalyticsEvents == FillrAnalyticsEvents.FillrFillHeadlessMode) {
                try {
                    createEvent.setExtraInfo(strArr[0]);
                    String str3 = strArr[1];
                    Integer.valueOf(strArr[2]);
                    String str4 = strArr[3];
                } catch (NumberFormatException unused2) {
                    SVG svg3 = getInstance().fillrConfig;
                }
            } else if (strArr.length > 0 && fillrAnalyticsEvents == FillrAnalyticsEvents.FillrGenerateAffiliateLink) {
                String str5 = strArr[0];
            }
            ((Box) svg.idToElementMap).sendEvent((Context) svg.cssRules, createEvent);
        }
    }

    public final void trackWebView(WebView webView) {
        if (webView == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid WebView, your WebView instance is null");
            return;
        }
        if (this.mWebViewMapper == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Please initialize the Fillr SDK first");
            return;
        }
        this.mWebView = new FillrWebView(webView, this.browserType, 1);
        this.globalTlsProxyEnabled = false;
        if (FillrAuthenticationStore.isEnabled(this.parentActivity)) {
            AutofillPrompt autofillPrompt = this.mAutofillPrompt;
            FillrWebView fillrWebView = this.mWebView;
            JWECryptoParts widgetManager = autofillPrompt.mFillr.getWidgetManager();
            FillrWidget fillrWidget = (FillrWidget) autofillPrompt.mFillr.getWidgetManager().iv;
            int i = 3;
            if (fillrWidget != null) {
                PopEncryptorV2_ popEncryptorV2_ = fillrWidget.fillrWidgetParams;
                if (widgetManager != null) {
                    AutofillPrompt.AnonymousClass1 anonymousClass1 = autofillPrompt.widgetListener;
                    ArrayList arrayList = new FillrWidget.WidgetType[]{(FillrWidget.WidgetType) popEncryptorV2_.cryptor}[0].widgetLifeCycleListener;
                    if (anonymousClass1 != null && !arrayList.contains(anonymousClass1)) {
                        arrayList.add(anonymousClass1);
                    }
                    SVG svg = getInstance().fillrConfig;
                    if (fillrWidget.canDownload()) {
                        new SimpleDecoder.AnonymousClass1(new SaveWidgetToLocalStorageAsynTask(fillrWidget, popEncryptorV2_), i).start();
                    }
                }
            }
            JSNativeInterface jSNativeInterface = new JSNativeInterface(autofillPrompt);
            fillrWebView.setJSInterface(jSNativeInterface, "androidInterface");
            autofillPrompt.viewCache.put(jSNativeInterface, fillrWebView);
            FillrJNIBinding[] fillrJNIBindingArr = {(FillrWidget) getWidgetManager().iv, (FillrWidget) getWidgetManager().cipherText, this.mFillrCartInformationExtraction};
            for (int i2 = 0; i2 < 3; i2++) {
                FillrJNIBinding fillrJNIBinding = fillrJNIBindingArr[i2];
                if (fillrJNIBinding != null) {
                    FillrWebView fillrWebView2 = this.mWebView;
                    fillrWebView2.setJSInterface(fillrJNIBinding.newJNIInstance(fillrWebView2), fillrJNIBinding.getWidgetInjectionJNI());
                }
            }
            this.lastActiveTime = new Date();
            new FillrMappingServiceClient(this).runFeatureTogglesUpdateIfStopped();
            trackEvent(FillrAnalyticsEvents.FillrSDK_TRACK_WEBVIEW, new String[0]);
        }
        this.mWebViewMapper.getWebviewReference(this.mWebView);
    }

    public final void triggerFill(FillrWebView fillrWebView) {
        FillrWebView fillrWebView2;
        String str;
        Map map;
        if (fillrWebView == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid webView, your webView instance is null");
            return;
        }
        FillrWebView fillrWebView3 = new FillrWebView(fillrWebView, this.browserType, 0);
        if (this.mAutofillPrompt != null) {
            HashMap hashMap = this.mWebViewMapper.a;
            if (hashMap.size() > 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    FillrWebView fillrWebView4 = (FillrWebView) entry.getValue();
                    if (fillrWebView4 != null && fillrWebView4.equals(fillrWebView3)) {
                        fillrWebView2 = (FillrWebView) entry.getValue();
                        break;
                    }
                }
            }
            fillrWebView2 = null;
            if (fillrWebView2 != null && (str = fillrWebView2.viewId) != null && (map = this.mAutofillPrompt.lastNotifiedMapping) != null) {
                map.remove(str);
            }
        }
        URL url = fillrWebView3.getUrl();
        if (isEnabled(url != null ? url.toString() : null)) {
            if (!fillrWebView3.widgetInjected) {
                getWidgetManager().injectEnabledWidgets(fillrWebView3);
            }
            fillrWebView3.loadJavascript("var __scrape = function() { if (!window['PopWidgetInterface']) { setTimeout(__scrape, 250); return; } PopWidgetInterface.getFields('options=forceRescrape,suppressFillView'); }; __scrape();");
        } else {
            SVG svg = getInstance().fillrConfig;
        }
        trackEvent(FillrAnalyticsEvents.FillrSDK_ON_TRIGGER_FILL, new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0254 A[LOOP:3: B:63:0x024e->B:65:0x0254, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void untrackWebView(WebView webView) {
        FillrWebView fillrWebView;
        Iterator it;
        Method method;
        FillrWebView fillrWebView2;
        boolean z;
        boolean z2;
        String str;
        JSNativeInterface jSNativeInterface;
        WebView webView2 = webView;
        if (webView2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid WebView, your WebView instance is null");
            return;
        }
        n1 n1Var = this.mWebViewMapper;
        if (n1Var == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Please initialize the Fillr SDK first");
            return;
        }
        FillrWebView trackedWebView = n1Var.getTrackedWebView(webView2);
        if (trackedWebView == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Unrecognized WebView, your WebView instance isn't being tracked");
            return;
        }
        if (FillrAuthenticationStore.isEnabled(this.parentActivity)) {
            WeakHashMap weakHashMap = this.mAutofillPrompt.viewCache;
            Iterator it2 = weakHashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    jSNativeInterface = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (entry.getValue() == trackedWebView) {
                    jSNativeInterface = (JSNativeInterface) entry.getKey();
                    break;
                }
            }
            weakHashMap.remove(jSNativeInterface);
        }
        if (webView2 == trackedWebView.mWebView.get()) {
            FillrWebView.VIEW_OPTIONS.remove(webView2);
            WebviewProxy webviewProxy = trackedWebView.proxy;
            if (webviewProxy != null) {
                Set set = webviewProxy.webviews;
                if (!WebviewProxy.proxySettingApplied || WebviewProxy.proxy == null) {
                    fillrWebView2 = trackedWebView;
                    z = true;
                } else if (set.contains(webView2)) {
                    set.remove(webView2);
                    if (WebViewFeature.isFeatureSupported("PROXY_OVERRIDE")) {
                        SVG svg = getInstance().fillrConfig;
                        try {
                            ProxySelector.setDefault(ProxySelector.getDefault());
                        } catch (Exception e) {
                            e.getMessage();
                            SVG svg2 = getInstance().fillrConfig;
                            z = false;
                        }
                        if (!WebViewFeature.isFeatureSupported("PROXY_OVERRIDE")) {
                            throw new UnsupportedOperationException("Proxy override not supported");
                        }
                        PreviewView.AnonymousClass1 anonymousClass1 = WebViewFeature.INSTANCE;
                        WebviewProxy.AnonymousClass1 anonymousClass12 = WebviewProxy.PROXY_CHANGE_EXECUTOR;
                        AnonymousClass3 anonymousClass3 = WebviewProxy.PROXY_CHANGE_LISTENER;
                        if (!WebViewFeatureInternal.PROXY_OVERRIDE.isSupportedByWebView()) {
                            throw WebViewFeatureInternal.getUnsupportedOperationException();
                        }
                        if (((ProxyControllerBoundaryInterface) anonymousClass1.this$0) == null) {
                            anonymousClass1.this$0 = WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.INSTANCE.getProxyController();
                        }
                        ((ProxyControllerBoundaryInterface) anonymousClass1.this$0).clearProxyOverride(anonymousClass3, anonymousClass12);
                        z = true;
                        fillrWebView2 = trackedWebView;
                    } else {
                        if (set.isEmpty()) {
                            SVG svg3 = getInstance().fillrConfig;
                            String property = System.getProperty("http.proxyHost");
                            String property2 = System.getProperty("http.proxyPort");
                            String property3 = System.getProperty("https.proxyHost");
                            String str2 = "https.proxyPort";
                            String property4 = System.getProperty("https.proxyPort");
                            try {
                                Context applicationContextFromWebview = WebviewProxy.getApplicationContextFromWebview(webView2);
                                String name = applicationContextFromWebview.getClass().getName();
                                System.clearProperty("http.proxyHost");
                                System.clearProperty("http.proxyPort");
                                System.clearProperty("https.proxyHost");
                                System.clearProperty("https.proxyPort");
                                Iterator it3 = WebviewProxy.getProxyChangeListeners(applicationContextFromWebview, name).values().iterator();
                                while (it3.hasNext()) {
                                    for (Object obj : ((ArrayMap) it3.next()).keySet()) {
                                        Class<?> cls = obj.getClass();
                                        Iterator it4 = it3;
                                        if (cls.getName().contains("ProxyChangeListener")) {
                                            Method declaredMethod = cls.getDeclaredMethod("onReceive", Context.class, Intent.class);
                                            Intent intent = new Intent("android.intent.action.PROXY_CHANGE");
                                            Bundle bundle = new Bundle();
                                            fillrWebView2 = trackedWebView;
                                            str = str2;
                                            z2 = false;
                                            try {
                                                bundle.putParcelable("android.intent.extra.PROXY_INFO", ProxyInfo.buildDirectProxy(null, 0));
                                                intent.putExtras(bundle);
                                                declaredMethod.invoke(obj, applicationContextFromWebview, intent);
                                            } catch (Exception e2) {
                                                e = e2;
                                                System.setProperty("http.proxyHost", property);
                                                System.setProperty("http.proxyPort", property2);
                                                System.setProperty("https.proxyHost", property3);
                                                System.setProperty(str, property4);
                                                e.getLocalizedMessage();
                                                SVG svg4 = getInstance().fillrConfig;
                                                z = z2;
                                                WebviewProxy.proxySettingApplied = !z;
                                                webView2 = webView;
                                                FillrWebView.VIEW_PROXIES.remove(webView2);
                                                fillrWebView = fillrWebView2;
                                                fillrWebView.proxy = null;
                                                if (z) {
                                                }
                                                HashSet hashSet = fillrWebView.injectedInterfaces;
                                                method = webView2.getClass().getMethod("removeJavascriptInterface", String.class);
                                                if (method != null) {
                                                }
                                                n1 n1Var2 = this.mWebViewMapper;
                                                n1Var2.getClass();
                                                HashSet hashSet2 = new HashSet();
                                                HashMap hashMap = n1Var2.a;
                                                while (r4.hasNext()) {
                                                }
                                                it = hashSet2.iterator();
                                                while (it.hasNext()) {
                                                }
                                                if (fillrWebView != this.mWebView) {
                                                }
                                            }
                                        } else {
                                            fillrWebView2 = trackedWebView;
                                            str = str2;
                                        }
                                        str2 = str;
                                        it3 = it4;
                                        trackedWebView = fillrWebView2;
                                    }
                                }
                                fillrWebView2 = trackedWebView;
                                str = str2;
                                z2 = false;
                                SVG svg5 = getInstance().fillrConfig;
                                z = true;
                            } catch (Exception e3) {
                                e = e3;
                                fillrWebView2 = trackedWebView;
                                str = str2;
                                z2 = false;
                            }
                        } else {
                            fillrWebView2 = trackedWebView;
                            z2 = false;
                        }
                        z = z2;
                    }
                    WebviewProxy.proxySettingApplied = !z;
                } else {
                    fillrWebView2 = trackedWebView;
                    z = false;
                }
                webView2 = webView;
                FillrWebView.VIEW_PROXIES.remove(webView2);
                fillrWebView = fillrWebView2;
                fillrWebView.proxy = null;
                if (z) {
                    System.clearProperty("com.fillr.tls.proxy.enabled");
                }
            } else {
                fillrWebView = trackedWebView;
            }
            HashSet hashSet3 = fillrWebView.injectedInterfaces;
            try {
                method = webView2.getClass().getMethod("removeJavascriptInterface", String.class);
            } catch (Exception e4) {
                e4.printStackTrace();
                method = null;
            }
            if (method != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    try {
                        method.invoke(webView2, (String) it5.next());
                    } catch (Exception unused) {
                    }
                }
                hashSet3.clear();
            }
        } else {
            fillrWebView = trackedWebView;
        }
        n1 n1Var22 = this.mWebViewMapper;
        n1Var22.getClass();
        HashSet hashSet22 = new HashSet();
        HashMap hashMap2 = n1Var22.a;
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (((FillrWebView) entry2.getValue()).equals(fillrWebView)) {
                hashSet22.add((UUID) entry2.getKey());
            }
        }
        it = hashSet22.iterator();
        while (it.hasNext()) {
            hashMap2.remove((UUID) it.next());
        }
        if (fillrWebView != this.mWebView) {
            this.mWebView = null;
        }
    }

    /* renamed from: com.fillr.browsersdk.Fillr$3, reason: invalid class name */
    public final class AnonymousClass3 implements Runnable {
        public static final /* synthetic */ AnonymousClass3 zaa = new AnonymousClass3(4);
        public final /* synthetic */ int $r8$classId;

        public AnonymousClass3(Fillr fillr, String str, String str2) {
            this.$r8$classId = 0;
        }

        private final void run$com$datadog$android$core$internal$persistence$file$advanced$NoOpDataMigrationOperation() {
        }

        private final void run$com$fillr$browsersdk$Fillr$3() {
        }

        private final /* synthetic */ void run$com$google$android$gms$common$api$internal$zacg() {
        }

        private final void run$com$google$mlkit$common$sdkinternal$zza() {
        }

        private final void run$io$reactivex$rxjava3$internal$functions$Functions$EmptyRunnable() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:8:0x000d, B:10:0x001f, B:12:0x0025, B:14:0x002b, B:18:0x0035, B:20:0x0039), top: B:7:0x000d }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean z;
            switch (this.$r8$classId) {
                case 2:
                    try {
                        InetAddress byName = InetAddress.getByName("api.fillr.com");
                        InetAddress byName2 = InetAddress.getByName("rest.fillr.com");
                        if (!byName.isLoopbackAddress() && !byName.isAnyLocalAddress() && !byName2.isLoopbackAddress() && !byName2.isAnyLocalAddress()) {
                            z = false;
                            HttpService.sIsMixpanelBlocked = z;
                            if (!z) {
                                Log.v("FillrEvents.Message", "AdBlocker is enabled. Won't be able to use Mixpanel services.");
                                break;
                            }
                        }
                        z = true;
                        HttpService.sIsMixpanelBlocked = z;
                        if (!z) {
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                case 3:
                    SVG svg = Fillr.getInstance().fillrConfig;
                    break;
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 6:
                    return "EmptyRunnable";
                default:
                    return super.toString();
            }
        }

        public /* synthetic */ AnonymousClass3(int i) {
            this.$r8$classId = i;
        }
    }

    /* renamed from: com.fillr.browsersdk.Fillr$2, reason: invalid class name */
    public final class AnonymousClass2 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public Object this$0;
        public Object val$fillrWebView;
        public Object val$mapping;

        public AnonymousClass2(zznl zznlVar, AtomicReference atomicReference, com.google.android.gms.measurement.internal.zzr zzrVar) {
            this.$r8$classId = 15;
            this.val$mapping = atomicReference;
            this.val$fillrWebView = zzrVar;
            Objects.requireNonNull(zznlVar);
            this.this$0 = zznlVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0288  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void run$com$google$android$gms$measurement$internal$zzja() {
            zzpg zzpgVar;
            zzaf zzafVar;
            int i;
            long j;
            int i2;
            int i3;
            Cursor cursor;
            zzpj zzpjVar;
            Cursor cursor2;
            String string2;
            zzjd zzjdVar = (zzjd) this.val$mapping;
            com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) this.val$fillrWebView;
            zzaf zzafVar2 = (zzaf) this.this$0;
            zzpg zzpgVar2 = zzjdVar.zza;
            zzpgVar2.zzaa$1();
            String str = zzrVar.zza;
            zzae.checkNotNull(str);
            HashMap hashMap = zzpgVar2.zzF;
            zzpgVar2.zzaX().zzg();
            zzpgVar2.zzu$3();
            zzaw zzawVar = zzpgVar2.zze;
            zzpg.zzaT(zzawVar);
            long j2 = zzafVar2.zza;
            long j3 = zzafVar2.zzc;
            int i4 = zzafVar2.zzb;
            zzawVar.zzg();
            zzawVar.zzay();
            Cursor cursor3 = null;
            r20 = null;
            zzpj zzpjVar2 = null;
            try {
                cursor = zzawVar.zze().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                try {
                    try {
                    } catch (SQLiteException e) {
                        e = e;
                        zzpgVar = zzpgVar2;
                        zzafVar = zzafVar2;
                        i = i4;
                        j = j3;
                        i2 = 4;
                        i3 = 1;
                        cursor2 = cursor;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                }
            } catch (SQLiteException e2) {
                e = e2;
                zzpgVar = zzpgVar2;
                zzafVar = zzafVar2;
                i = i4;
                j = j3;
                i2 = 4;
                i3 = 1;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (!cursor.moveToFirst()) {
                zzpgVar = zzpgVar2;
                zzafVar = zzafVar2;
                i = i4;
                j = j3;
                i2 = 4;
                i3 = 1;
                if (cursor != null) {
                    cursor.close();
                }
                zzpjVar = zzpjVar2;
                if (zzpjVar == null) {
                    zzpgVar.zzaW().zzg.zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j2));
                    return;
                }
                String str2 = zzpjVar.zzc;
                if (i != i3) {
                    zzpg zzpgVar3 = zzpgVar;
                    if (i == 3) {
                        zzpe zzpeVar = (zzpe) hashMap.get(str2);
                        if (zzpeVar == null) {
                            zzpeVar = new zzpe(zzpgVar3);
                            hashMap.put(str2, zzpeVar);
                        } else {
                            zzpeVar.zzb += i3;
                            zzpeVar.zzc = zzpeVar.zzd();
                        }
                        zzpgVar3.zzba().getClass();
                        zzpgVar3.zzaW().zzl.zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, str2, Long.valueOf((zzpeVar.zzc - System.currentTimeMillis()) / 1000));
                    }
                    zzaw zzawVar2 = zzpgVar3.zze;
                    zzpg.zzaT(zzawVar2);
                    Long valueOf = Long.valueOf(zzafVar.zza);
                    zzawVar2.zzK(valueOf);
                    zzpgVar3.zzaW().zzl.zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
                    return;
                }
                if (hashMap.containsKey(str2)) {
                    hashMap.remove(str2);
                }
                zzpg zzpgVar4 = zzpgVar;
                zzaw zzawVar3 = zzpgVar4.zze;
                zzpg.zzaT(zzawVar3);
                Long valueOf2 = Long.valueOf(j2);
                zzawVar3.zzE(valueOf2);
                zzpgVar4.zzaW().zzl.zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
                if (j > 0) {
                    zzaw zzawVar4 = zzpgVar4.zze;
                    zzpg.zzaT(zzawVar4);
                    zzic zzicVar = (zzic) zzawVar4.$$delegate_0;
                    zzawVar4.zzg();
                    zzawVar4.zzay();
                    Long valueOf3 = Long.valueOf(j);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(i3));
                    DefaultClock defaultClock = zzicVar.zzn;
                    zzgu zzguVar = zzicVar.zzi;
                    defaultClock.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    try {
                        if (zzawVar4.zze().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str, String.valueOf(i2)}) != 1) {
                            zzic.zzP(zzguVar);
                            zzguVar.zzg.zzc("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                        }
                        zzpgVar4.zzaW().zzl.zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(j));
                        zzpgVar4.zzP(str);
                        return;
                    } catch (SQLiteException e3) {
                        zzic.zzP(zzguVar);
                        zzguVar.zzd.zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j), e3);
                        throw e3;
                    }
                }
                return;
            }
            try {
                string2 = cursor.getString(1);
                zzae.checkNotNull(string2);
                try {
                    try {
                        try {
                        } catch (SQLiteException e4) {
                            e = e4;
                            zzpgVar = zzpgVar2;
                            zzafVar = zzafVar2;
                            i3 = 1;
                            cursor2 = cursor;
                            i = i4;
                            j = j3;
                        }
                        try {
                            zzafVar = zzafVar2;
                            i = i4;
                            zzpgVar = zzpgVar2;
                            i3 = 1;
                            cursor2 = cursor;
                            i2 = 4;
                            j = j3;
                        } catch (SQLiteException e5) {
                            e = e5;
                            zzpgVar = zzpgVar2;
                            zzafVar = zzafVar2;
                            cursor2 = cursor;
                            i = i4;
                            j = j3;
                            i3 = 1;
                            i2 = 4;
                            cursor = cursor2;
                            try {
                                zzgu zzguVar2 = ((zzic) zzawVar.$$delegate_0).zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzd.zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                if (cursor != null) {
                                }
                                zzpjVar = zzpjVar2;
                                if (zzpjVar == null) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor3 = cursor;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        zzpgVar = zzpgVar2;
                        zzafVar = zzafVar2;
                        i2 = 4;
                        i3 = 1;
                        cursor2 = cursor;
                        i = i4;
                        j = j3;
                        cursor = cursor2;
                        zzgu zzguVar22 = ((zzic) zzawVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar22);
                        zzguVar22.zzd.zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                        if (cursor != null) {
                        }
                        zzpjVar = zzpjVar2;
                        if (zzpjVar == null) {
                        }
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    zzpgVar = zzpgVar2;
                    zzafVar = zzafVar2;
                    i2 = 4;
                }
            } catch (SQLiteException e8) {
                e = e8;
                zzpgVar = zzpgVar2;
                zzafVar = zzafVar2;
                j = j3;
                i2 = 4;
                i3 = 1;
                cursor2 = cursor;
                i = i4;
            }
            try {
                zzpjVar2 = zzawVar.zzaH(string2, j2, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                cursor2.close();
            } catch (SQLiteException e9) {
                e = e9;
                cursor = cursor2;
                zzgu zzguVar222 = ((zzic) zzawVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar222);
                zzguVar222.zzd.zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                if (cursor != null) {
                }
                zzpjVar = zzpjVar2;
                if (zzpjVar == null) {
                }
            } catch (Throwable th4) {
                th = th4;
                cursor3 = cursor2;
                if (cursor3 != null) {
                }
                throw th;
            }
            zzpjVar = zzpjVar2;
            if (zzpjVar == null) {
            }
        }

        private final void run$com$google$android$gms$measurement$internal$zzmi() {
            AtomicReference atomicReference;
            zznl zznlVar;
            zzic zzicVar;
            zzhh zzhhVar;
            AtomicReference atomicReference2 = (AtomicReference) this.val$mapping;
            synchronized (atomicReference2) {
                try {
                    try {
                        zznlVar = (zznl) this.this$0;
                        zzicVar = (zzic) zznlVar.$$delegate_0;
                        zzhhVar = zzicVar.zzh;
                        zzic.zzN(zzhhVar);
                    } catch (RemoteException e) {
                        zzgu zzguVar = ((zzic) ((zznl) this.this$0).$$delegate_0).zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzd.zzb(e, "Failed to get app instance id");
                        atomicReference = (AtomicReference) this.val$mapping;
                    }
                    if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                        zzgb zzgbVar = zznlVar.zzb;
                        if (zzgbVar != null) {
                            atomicReference2.set(zzgbVar.zzm((com.google.android.gms.measurement.internal.zzr) this.val$fillrWebView));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                zzlj zzljVar = ((zzic) zznlVar.$$delegate_0).zzp;
                                zzic.zzO(zzljVar);
                                zzljVar.zzg.set(str);
                                zzhh zzhhVar2 = zzicVar.zzh;
                                zzic.zzN(zzhhVar2);
                                zzhhVar2.zze.zzb(str);
                            }
                            zznlVar.zzae();
                            atomicReference = (AtomicReference) this.val$mapping;
                            atomicReference.notify();
                            return;
                        }
                        zzgu zzguVar2 = zzicVar.zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzd.zza("Failed to get app instance id");
                    } else {
                        zzgu zzguVar3 = zzicVar.zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzi.zza("Analytics storage consent denied; will not get app instance id");
                        zzlj zzljVar2 = ((zzic) zznlVar.$$delegate_0).zzp;
                        zzic.zzO(zzljVar2);
                        zzljVar2.zzg.set(null);
                        zzhh zzhhVar3 = zzicVar.zzh;
                        zzic.zzN(zzhhVar3);
                        zzhhVar3.zze.zzb(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (Throwable th) {
                    ((AtomicReference) this.val$mapping).notify();
                    throw th;
                }
            }
        }

        private final void run$com$google$android$libraries$places$internal$zzayx() {
            zzaza zzazaVar = (zzaza) this.val$mapping;
            zzbtx zzbtxVar = (zzbtx) this.val$fillrWebView;
            zzbsn zzbsnVar = (zzbsn) this.this$0;
            DirectExecutor directExecutor = DirectExecutor.INSTANCE;
            if (zzazaVar.zza) {
                return;
            }
            try {
                ((zzazr) zzazaVar.zzc).zzc(zzbtxVar, zzbsnVar);
            } finally {
                zzazaVar.zza = true;
                ((zzaze) zzazaVar.zzb).zzr.zza = directExecutor;
            }
        }

        private final void run$com$google$android$libraries$places$internal$zzbuc() {
            zzbuf zzbufVar = (zzbuf) this.this$0;
            zzbufVar.zzb((zzbud) this.val$mapping);
            zzbufVar.zza();
        }

        private final void run$com$google$android$libraries$places$internal$zzbww() {
            ((zzbwy) this.this$0).zza.zzc((zzbtx) this.val$mapping, (zzbsn) this.val$fillrWebView);
        }

        private final void run$com$google$android$libraries$places$internal$zzcad() {
            long j;
            zzboq zzboqVar = zzbqd.zzb;
            zzboq zzboqVar2 = zzbtf.zza;
            zzcaf zzcafVar = (zzcaf) this.this$0;
            zzcah zzcahVar = (zzcah) zzcafVar.zzc;
            if (zzcahVar.zzw.zza == zzbpq.zze) {
                return;
            }
            zzbzz zzbzzVar = (zzbzz) zzcafVar.zza;
            if (zzcahVar.zzv == zzbzzVar) {
                zzcahVar.zzv = null;
                zzcahVar.zzm.zzd();
                zzcahVar.zzh(zzbpq.zzd);
                String zzg = zzcaf.zzg(zzcahVar.zzm.zzf(), zzboqVar2);
                String zzg2 = zzcaf.zzg(zzcahVar.zzm.zzf(), zzboqVar);
                zzbxz zzbxzVar = (zzbxz) this.val$mapping;
                OffsetApplier offsetApplier = zzcahVar.zzm;
                String zza = zzbxzVar.zza();
                String zzf = zzcaf.zzf((zzbtq) offsetApplier.zzf().zzb.get(zzjn.zza));
                String str = zzcahVar.zzA;
                zzfv zzfvVar = zzcahVar.zzz.zze;
                zzfvVar.zza(zzcgl.zza, ImmutableList.of((Object) str), ImmutableList.of((Object) zzg, (Object) zzg2, (Object) zza));
                zzfvVar.zzb(zzcgl.zzd, ImmutableList.of((Object) str), ImmutableList.of((Object) zzf, (Object) zzg, (Object) zzg2));
                return;
            }
            if (zzcahVar.zzu == zzbzzVar) {
                zzcahVar.zzz.zze.zza(zzcgl.zzc, ImmutableList.of((Object) zzcahVar.zzA), ImmutableList.of((Object) zzcaf.zzg(zzcahVar.zzm.zzf(), zzboqVar2), (Object) zzcaf.zzg(zzcahVar.zzm.zzf(), zzboqVar)));
                Trace.checkState("Expected state is CONNECTING, actual state is %s", zzcahVar.zzw.zza, zzcahVar.zzw.zza == zzbpq.zza);
                OffsetApplier offsetApplier2 = zzcahVar.zzm;
                zzbqd zzbqdVar = (zzbqd) ((List) offsetApplier2.applier).get(offsetApplier2.offset);
                int i = offsetApplier2.nesting + 1;
                offsetApplier2.nesting = i;
                if (i >= zzbqdVar.zzd.size()) {
                    offsetApplier2.offset++;
                    offsetApplier2.nesting = 0;
                }
                OffsetApplier offsetApplier3 = zzcahVar.zzm;
                if (offsetApplier3.offset < ((List) offsetApplier3.applier).size()) {
                    zzcahVar.zzf();
                    return;
                }
                zzcahVar.zzu = null;
                zzcahVar.zzm.zzd();
                zzbtx zzbtxVar = (zzbtx) this.val$fillrWebView;
                zzbuf zzbufVar = zzcahVar.zzl;
                zzbufVar.zzc();
                Trace.checkArgument("The error status must not be OK", !zzbtxVar.zzj());
                zzcahVar.zzM(new zzbpr(zzbpq.zzc, zzbtxVar));
                if (zzcahVar.zzj) {
                    return;
                }
                if (zzcahVar.zzB == null) {
                    zzcahVar.zzB = new zzbyl();
                }
                long zza2 = zzcahVar.zzB.zza();
                Stopwatch stopwatch = zzcahVar.zzo;
                if (stopwatch.isRunning) {
                    stopwatch.ticker.getClass();
                    j = System.nanoTime() - stopwatch.startTick;
                } else {
                    j = 0;
                }
                long j2 = zza2 - j;
                zzcahVar.zzi.zzb("TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", 2, zzcah.zzO(zzbtxVar), Long.valueOf(j2));
                Trace.checkState("previous reconnectTask is not done", zzcahVar.zzp == null);
                zzcahVar.zzp = zzbufVar.zzd(zzcahVar.zzf, new zzbzp(zzcahVar), j2, TimeUnit.NANOSECONDS);
            }
        }

        private final void run$com$google$android$libraries$places$internal$zzcfd() {
            zzcaf zzcafVar = (zzcaf) this.val$mapping;
            synchronized (zzcafVar.zza) {
                if (zzcafVar.zzb) {
                    return;
                }
                zzcafVar.zzb = true;
                Box box = (Box) this.this$0;
                ((zzcax) box.mHalfExtent).zzc$1.execute(new zzb(9, this, (zzcfj) this.val$fillrWebView));
            }
        }

        private final void run$com$google$android$libraries$places$internal$zzvl() {
            if (((Ref$ObjectRef) this.val$mapping).element != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            zzuh zzuhVar = (zzuh) this.val$fillrWebView;
            Runnable runnable = (Runnable) this.this$0;
            zzuh zzc = zzur.zzc(zzur.zzd(), zzuhVar);
            try {
                runnable.run();
            } finally {
            }
        }

        private final void run$com$google$android$material$appbar$HeaderBehavior$FlingRunnable() {
            OverScroller overScroller;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.val$mapping;
            HeaderBehavior headerBehavior = (HeaderBehavior) this.this$0;
            View view = (View) this.val$fillrWebView;
            if (view == null || (overScroller = headerBehavior.scroller) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                headerBehavior.setHeaderTopBottomOffset(coordinatorLayout, view, headerBehavior.scroller.getCurrY());
                view.postOnAnimation(this);
                return;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            ((AppBarLayout.BaseBehavior) headerBehavior).snapToChildIfNeeded(coordinatorLayout, appBarLayout);
            if (appBarLayout.liftOnScroll) {
                appBarLayout.setLiftedState(appBarLayout.shouldLift(AppBarLayout.BaseBehavior.findFirstScrollingChild(coordinatorLayout)));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:92:0x00e9, code lost:
        
            if (r0.exists() == false) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0211 A[Catch: Exception -> 0x020c, TRY_LEAVE, TryCatch #2 {Exception -> 0x020c, blocks: (B:14:0x006f, B:20:0x0211, B:140:0x020e, B:146:0x0208, B:17:0x007e, B:38:0x008a, B:39:0x0093, B:42:0x009c, B:66:0x0153, B:102:0x016b, B:101:0x0168, B:105:0x016c, B:107:0x0173, B:110:0x0183, B:112:0x0189, B:115:0x018f, B:116:0x01a3, B:118:0x01a7, B:120:0x01cd, B:121:0x01f9, B:124:0x01d4, B:127:0x01de, B:131:0x01e6, B:133:0x01ed, B:135:0x01f3, B:142:0x0203), top: B:13:0x006f, inners: #1, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0153 A[Catch: all -> 0x0083, Exception -> 0x015e, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x015e, blocks: (B:38:0x008a, B:39:0x0093, B:42:0x009c, B:66:0x0153, B:102:0x016b, B:101:0x0168, B:105:0x016c), top: B:37:0x008a, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0156 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void run$com$google$android$play$core$splitinstall$internal$zzaj() {
            int i;
            Integer valueOf;
            FileLock fileLock;
            int i2;
            RealStrongMemoryCache realStrongMemoryCache;
            File[] listFiles;
            String str;
            String str2;
            String str3 = ".apk";
            String str4 = "split_id";
            List<Intent> list = (List) this.val$mapping;
            zzak zzakVar = (zzak) this.this$0;
            Context context = zzakVar.zza;
            UnleashContext unleashContext = zzakVar.zzc;
            n nVar = (n) this.val$fillrWebView;
            zza zzaVar = (zza) nVar.a;
            zzx zzxVar = (zzx) nVar.d;
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String stringExtra = ((Intent) it.next()).getStringExtra("split_id");
                    RealStrongMemoryCache realStrongMemoryCache2 = (RealStrongMemoryCache) unleashContext.userId;
                    realStrongMemoryCache2.getClass();
                    File file = new File(realStrongMemoryCache2.zzw(), "verified-splits");
                    RealStrongMemoryCache.zzu(file);
                    if (!RealStrongMemoryCache.zzq(file, String.valueOf(stringExtra).concat(".apk")).exists()) {
                        RealStrongMemoryCache realStrongMemoryCache3 = zzakVar.zzb;
                        try {
                            realStrongMemoryCache3.getClass();
                            i = -13;
                            try {
                                FileChannel channel = new RandomAccessFile(new File(realStrongMemoryCache3.zzw(), "lock.tmp"), "rw").getChannel();
                                valueOf = null;
                                try {
                                    try {
                                        fileLock = channel.tryLock();
                                    } catch (Throwable th) {
                                        if (channel == null) {
                                            throw th;
                                        }
                                        try {
                                            channel.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            throw th;
                                        }
                                    }
                                } catch (OverlappingFileLockException unused) {
                                    fileLock = null;
                                }
                                if (fileLock != null) {
                                    try {
                                        Log.i("SplitCompat", "Copying splits.");
                                        for (Intent intent : list) {
                                            String stringExtra2 = intent.getStringExtra(str4);
                                            RealStrongMemoryCache realStrongMemoryCache4 = realStrongMemoryCache3;
                                            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                                            try {
                                                File file2 = new File(realStrongMemoryCache4.zzw(), "unverified-splits");
                                                RealStrongMemoryCache.zzu(file2);
                                                File zzq = RealStrongMemoryCache.zzq(file2, String.valueOf(stringExtra2).concat(str3));
                                                if (zzq.exists()) {
                                                    if (zzq.length() != openAssetFileDescriptor.getLength()) {
                                                        File file3 = new File(realStrongMemoryCache4.zzw(), "verified-splits");
                                                        RealStrongMemoryCache.zzu(file3);
                                                        if (!RealStrongMemoryCache.zzq(file3, String.valueOf(stringExtra2).concat(str3)).exists()) {
                                                            BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                                                            try {
                                                                FileOutputStream fileOutputStream = new FileOutputStream(zzq);
                                                                try {
                                                                    byte[] bArr = new byte[4096];
                                                                    str = str3;
                                                                    while (true) {
                                                                        int read = bufferedInputStream.read(bArr);
                                                                        if (read <= 0) {
                                                                            break;
                                                                        }
                                                                        String str5 = str4;
                                                                        fileOutputStream.write(bArr, 0, read);
                                                                        str4 = str5;
                                                                    }
                                                                    str2 = str4;
                                                                    fileOutputStream.close();
                                                                    bufferedInputStream.close();
                                                                    if (openAssetFileDescriptor == null) {
                                                                        openAssetFileDescriptor.close();
                                                                    }
                                                                    str3 = str;
                                                                    realStrongMemoryCache3 = realStrongMemoryCache4;
                                                                    str4 = str2;
                                                                } catch (Throwable th3) {
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th3;
                                                                    } catch (Throwable th4) {
                                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        str = str3;
                                                        str2 = str4;
                                                        if (openAssetFileDescriptor == null) {
                                                        }
                                                        str3 = str;
                                                        realStrongMemoryCache3 = realStrongMemoryCache4;
                                                        str4 = str2;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        realStrongMemoryCache = realStrongMemoryCache3;
                                        Log.i("SplitCompat", "Splits copied.");
                                        try {
                                            File file4 = new File(realStrongMemoryCache.zzw(), "unverified-splits");
                                            RealStrongMemoryCache.zzu(file4);
                                            listFiles = file4.listFiles();
                                            try {
                                            } catch (Exception e) {
                                                Log.e("SplitCompat", "Error verifying splits.", e);
                                            }
                                        } catch (IOException e2) {
                                            Log.e("SplitCompat", "Cannot access directory for unverified splits.", e2);
                                        }
                                    } catch (Exception e3) {
                                        Log.e("SplitCompat", "Error copying splits.", e3);
                                    }
                                    if (unleashContext.zzc(listFiles)) {
                                        if (unleashContext.zza(listFiles)) {
                                            try {
                                                File file5 = new File(realStrongMemoryCache.zzw(), "unverified-splits");
                                                RealStrongMemoryCache.zzu(file5);
                                                File[] listFiles2 = file5.listFiles();
                                                Arrays.sort(listFiles2);
                                                int length = listFiles2.length;
                                                while (true) {
                                                    length--;
                                                    if (length < 0) {
                                                        break;
                                                    }
                                                    File file6 = listFiles2[length];
                                                    file6.setWritable(false, true);
                                                    file6.setWritable(false, false);
                                                    File file7 = listFiles2[length];
                                                    File file8 = new File(realStrongMemoryCache.zzw(), "verified-splits");
                                                    RealStrongMemoryCache.zzu(file8);
                                                    file7.renameTo(RealStrongMemoryCache.zzq(file8, file7.getName()));
                                                }
                                                Log.i("SplitCompat", "Splits verified.");
                                                i2 = 0;
                                            } catch (IOException e4) {
                                                Log.e("SplitCompat", "Cannot write verified split.", e4);
                                                i2 = -13;
                                                valueOf = Integer.valueOf(i2);
                                                fileLock.release();
                                                if (channel != null) {
                                                }
                                                if (valueOf == null) {
                                                }
                                            }
                                            valueOf = Integer.valueOf(i2);
                                            fileLock.release();
                                        }
                                    }
                                    Log.e("SplitCompat", "Split verification failed.");
                                    i2 = -11;
                                    valueOf = Integer.valueOf(i2);
                                    fileLock.release();
                                }
                                if (channel != null) {
                                    channel.close();
                                }
                            } catch (Exception e5) {
                                e = e5;
                                Log.e("SplitCompat", "Error locking files.", e);
                                valueOf = Integer.valueOf(i);
                                if (valueOf == null) {
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                            i = -13;
                        }
                        if (valueOf == null) {
                            return;
                        }
                        if (valueOf.intValue() != 0) {
                            zzxVar.zzd.post(new com.google.android.gms.stats.zza(zzxVar, zzaVar, 6, valueOf.intValue()));
                            return;
                        }
                        Intent intent2 = (Intent) nVar.b;
                        if (!intent2.getBooleanExtra("triggered_from_app_after_verification", false)) {
                            intent2.putExtra("triggered_from_app_after_verification", true);
                            ((Context) nVar.c).sendBroadcast(intent2);
                            return;
                        }
                        Obfuscator obfuscator = zzxVar.zza;
                        Object[] objArr = new Object[0];
                        obfuscator.getClass();
                        if (Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", Obfuscator.zzf$1(obfuscator.salt, "Splits copied and verified more than once.", objArr));
                            return;
                        }
                        return;
                    }
                }
                try {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (SplitCompat.zzi(context, true)) {
                        Log.i("SplitCompat", "Splits installed.");
                        zzxVar.zzd.post(new com.google.android.gms.stats.zza(zzxVar, zzaVar, 5, 0));
                    } else {
                        Log.e("SplitCompat", "Emulating splits failed.");
                        zzxVar.zzd.post(new com.google.android.gms.stats.zza(zzxVar, zzaVar, 6, -12));
                    }
                } catch (Exception e7) {
                    Log.e("SplitCompat", "Error emulating splits.", e7);
                    zzxVar.zzd.post(new com.google.android.gms.stats.zza(zzxVar, zzaVar, 6, -12));
                }
            } catch (Exception e8) {
                Log.e("SplitCompat", "Error checking verified files.", e8);
                zzxVar.zzd.post(new com.google.android.gms.stats.zza(zzxVar, zzaVar, 6, -11));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:135:0x032f, code lost:
        
            if (r4.isEmpty() == false) goto L126;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            View currentFocus;
            zzli zzliVar;
            ApiException zza;
            Object obj;
            zzw zzc;
            String str;
            zzu zzuVar;
            zzbf zzbfVar;
            zzpp zzppVar;
            zzic zzicVar;
            zzhh zzhhVar;
            zzgu zzguVar;
            String str2 = null;
            Object obj2 = null;
            r4 = null;
            String str3 = null;
            int i = 1;
            switch (this.$r8$classId) {
                case 0:
                    Fillr fillr = (Fillr) this.this$0;
                    if (fillr.mFillMode != 2) {
                        Activity activity = fillr.parentActivity;
                        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
                            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                        }
                        Box box = ((Fillr) this.this$0).intentBuilder;
                        String str4 = (String) this.val$mapping;
                        box.getClass();
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName((String) box.mCenter, "com.fillr.embedded.browsersdk.activity.FESDKMainActivity"));
                        intent.putExtra("com.fillr.jsonfields", str4);
                        box.setIntentExtras(intent);
                        ((Fillr) this.this$0).parentActivity.startActivityForResult(intent, 101);
                        return;
                    }
                    FillrMappingServiceClient fillrMappingServiceClient = new FillrMappingServiceClient((Fillr) this.this$0);
                    String str5 = (String) this.val$mapping;
                    FillrWebView fillrWebView = (FillrWebView) this.val$fillrWebView;
                    synchronized (fillrMappingServiceClient) {
                        if (!fillrMappingServiceClient.delayHeadlessFillMappingRequestService && str5 != null) {
                            try {
                                if (new JSONObject(str5).getJSONArray("fields").length() > 0 && fillrWebView != null && fillrWebView.viewId != null) {
                                    try {
                                        fillrMappingServiceClient.delayHeadlessFillMappingRequestService = true;
                                        Intent intent2 = new Intent("com.fillr.service.HeadlessFillMappingService");
                                        Box intentBuilder = fillrMappingServiceClient.mFillr.getIntentBuilder();
                                        intent2.setPackage((String) intentBuilder.mCenter);
                                        intent2.putExtra("receiver", new FillrMappingServiceClient.AnonymousClass1(fillrMappingServiceClient, new Handler(), i));
                                        intent2.putExtra("com.fillr.jsonfields", str5);
                                        intent2.putExtra("com.fillr.viewid", fillrWebView.viewId);
                                        intent2.putExtra("com.fillr.headless.mode", true);
                                        intent2.putExtra("com.fillr.autofillwidgetsource", ((FillrWidget) fillrMappingServiceClient.mFillr.getWidgetManager().iv).mWidgetSource);
                                        intent2.putExtra("com.fillr.cartscraperwidgetsource", ((FillrWidget) fillrMappingServiceClient.mFillr.getWidgetManager().cipherText).mWidgetSource);
                                        intentBuilder.setIntentExtras(intent2);
                                        fillrMappingServiceClient.startFillrService(intent2);
                                        new Handler().postDelayed(new FillrMappingServiceClient.AnonymousClass2(fillrMappingServiceClient, i), 2000L);
                                        return;
                                    } catch (Exception e) {
                                        e.getMessage();
                                        SVG svg = Fillr.getInstance().fillrConfig;
                                    }
                                }
                            } catch (JSONException unused) {
                                SVG svg2 = Fillr.getInstance().fillrConfig;
                            }
                        }
                        return;
                    }
                case 1:
                    try {
                        obj2 = ((FontRequestWorker.AnonymousClass1) this.val$mapping).call();
                    } catch (Exception unused2) {
                    }
                    ((Handler) this.this$0).post(new Client.AnonymousClass4(5, (Edge) this.val$fillrWebView, obj2));
                    return;
                case 2:
                    if (((Request) this.val$mapping).isCanceled()) {
                        ((Request) this.val$mapping).finish("canceled-at-delivery");
                        return;
                    }
                    Response response = (Response) this.val$fillrWebView;
                    VolleyError volleyError = (VolleyError) response.error;
                    r2 = volleyError == null ? 1 : 0;
                    Request request = (Request) this.val$mapping;
                    if (r2 != 0) {
                        request.deliverResponse(response.result);
                    } else {
                        synchronized (request.mLock) {
                            zzliVar = request.mErrorListener;
                        }
                        if (zzliVar != null) {
                            int i2 = zzliVar.$r8$classId;
                            TaskCompletionSource taskCompletionSource = zzliVar.zza;
                            switch (i2) {
                                case 0:
                                    try {
                                        taskCompletionSource.trySetException(zzie.zza(volleyError));
                                        break;
                                    } catch (Error | RuntimeException e2) {
                                        zznv.zzb(e2);
                                        throw e2;
                                    }
                                default:
                                    try {
                                        NetworkResponse networkResponse = volleyError.networkResponse;
                                        if (networkResponse != null) {
                                            int i3 = networkResponse.statusCode;
                                            if (i3 == 400) {
                                                zza = new ApiException(new Status(9012, "The provided parameters are invalid (did you include a max width or height?).", null, null));
                                            } else if (i3 == 403) {
                                                zza = new ApiException(new Status(9011, "The provided API key is invalid.", null, null));
                                            }
                                            taskCompletionSource.trySetException(zza);
                                            break;
                                        }
                                        zza = zzie.zza(volleyError);
                                        taskCompletionSource.trySetException(zza);
                                    } catch (Error | RuntimeException e3) {
                                        zznv.zzb(e3);
                                        throw e3;
                                    }
                            }
                        }
                    }
                    boolean z = ((Response) this.val$fillrWebView).intermediate;
                    Request request2 = (Request) this.val$mapping;
                    if (z) {
                        request2.addMarker("intermediate-response");
                    } else {
                        request2.finish("done");
                    }
                    Runnable runnable = (Runnable) this.this$0;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                case 3:
                    try {
                        FillrWebView.m1935$$Nest$mloadOrEvaluateJavascript((FillrWebView) this.val$fillrWebView, this.this$0, (String) this.val$mapping);
                        return;
                    } catch (Exception unused3) {
                        SVG svg3 = Fillr.getInstance().fillrConfig;
                        return;
                    }
                case 4:
                    synchronized (((StringBuffer) this.val$mapping)) {
                        try {
                            try {
                                URL url = FillrWebView.getUrl(this.val$fillrWebView);
                                if (url != null) {
                                    ((StringBuffer) this.val$mapping).append(url.toString());
                                }
                                ((AtomicBoolean) this.this$0).set(true);
                                obj = this.val$mapping;
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                ((AtomicBoolean) this.this$0).set(true);
                                obj = this.val$mapping;
                            }
                            ((StringBuffer) obj).notify();
                        } catch (Throwable th) {
                            ((AtomicBoolean) this.this$0).set(true);
                            ((StringBuffer) this.val$mapping).notify();
                            throw th;
                        }
                    }
                    return;
                case 5:
                    AutofillPrompt autofillPrompt = ((JSNativeInterface) this.this$0).mPrompt;
                    String str6 = (String) this.val$mapping;
                    String str7 = (String) this.val$fillrWebView;
                    autofillPrompt.lastFieldClicked = str7;
                    if (str7 != null) {
                        try {
                            FillrCachedMapping fillrCachedMapping = (FillrCachedMapping) autofillPrompt.lastNotifiedMapping.get(new JSONObject(str6).optString("view_id"));
                            if (fillrCachedMapping != null) {
                                FillrMapping fillrMapping = fillrCachedMapping.fillrMapping;
                                try {
                                    String optString = new JSONObject(str7).optString("pop_id");
                                    if (fillrMapping.popIdFieldMapping == null) {
                                        fillrMapping.updatePopIdFieldMapping();
                                    }
                                    str2 = (String) fillrMapping.popIdFieldMapping.get(optString);
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                                if (str2 != null) {
                                    autofillPrompt.notifyListener(str6, str2);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (JSONException unused4) {
                            SVG svg4 = Fillr.getInstance().fillrConfig;
                            return;
                        }
                    }
                    return;
                case 6:
                    CloudMessage cloudMessage = (CloudMessage) this.val$fillrWebView;
                    if (TextUtils.isEmpty(cloudMessage.getMessageId())) {
                        zzc = Room.forResult(null);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("google.message_id", cloudMessage.getMessageId());
                        Integer zza2 = cloudMessage.zza();
                        if (zza2 != null) {
                            bundle.putInt("google.product_id", zza2.intValue());
                        }
                        Context context = (Context) this.val$mapping;
                        bundle.putBoolean("supports_message_handled", true);
                        zzc = zzv.zzb(context).zzc(2, bundle);
                    }
                    zzc.addOnCompleteListener(zze.zza, new m1((CountDownLatch) this.this$0, 18));
                    return;
                case 7:
                    zap zapVar = (zap) this.val$fillrWebView;
                    HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) this.this$0;
                    if (huffmanTreeGroup.alphabetSize > 0) {
                        Bundle bundle2 = (Bundle) huffmanTreeGroup.trees;
                        zapVar.onCreate(bundle2 != null ? bundle2.getBundle((String) this.val$mapping) : null);
                    }
                    if (huffmanTreeGroup.alphabetSize >= 2) {
                        zapVar.onStart();
                    }
                    if (huffmanTreeGroup.alphabetSize >= 3) {
                        zapVar.onResume();
                    }
                    if (huffmanTreeGroup.alphabetSize >= 4) {
                        zapVar.onStop();
                        return;
                    }
                    return;
                case 8:
                    e0 e0Var = (e0) this.val$mapping;
                    ListenableFuture listenableFuture = (SettableFuture) this.val$fillrWebView;
                    zzvk zzvkVar = (zzvk) this.this$0;
                    try {
                        Object done = Futures.getDone(listenableFuture);
                        SettableFuture settableFuture = (SettableFuture) e0Var.h;
                        settableFuture.set(done);
                        zzvkVar.setFuture(settableFuture);
                        return;
                    } catch (Throwable unused5) {
                        zzvkVar.setFuture(listenableFuture);
                        return;
                    }
                case 9:
                    zzmj zzmjVar = (zzmj) this.val$fillrWebView;
                    zbc zbcVar = (zbc) this.this$0;
                    zziv zzivVar = zziv.INPUT_IMAGE_CONSTRUCTION;
                    String str8 = (String) this.val$mapping;
                    zzah zzahVar = (zzah) zbcVar.zba;
                    zzahVar.zzb = zzivVar;
                    zzla zzlaVar = (zzla) zzahVar.f68zza;
                    if (zzlaVar != null) {
                        str = zzlaVar.zzd;
                        int i4 = com.google.android.gms.internal.mlkit_vision_common.zze.$r8$clinit;
                        if (str != null) {
                            break;
                        }
                    }
                    str = "NA";
                    RequestQueue requestQueue = new RequestQueue();
                    requestQueue.mSequenceGenerator = zzmjVar.zzc;
                    requestQueue.mCurrentRequests = zzmjVar.zzd;
                    synchronized (zzmj.class) {
                        try {
                            zzuVar = zzmj.zza;
                            if (zzuVar == null) {
                                LocaleListCompat locales = PlatformKt.getLocales(Resources.getSystem().getConfiguration());
                                Object[] objArr = new Object[4];
                                int i5 = 0;
                                while (r2 < locales.size()) {
                                    Locale locale = locales.get(r2);
                                    PatternRedaction patternRedaction = CommonUtils.zza;
                                    String languageTag = locale.toLanguageTag();
                                    languageTag.getClass();
                                    int i6 = i5 + 1;
                                    int length = objArr.length;
                                    if (length < i6) {
                                        int i7 = length + (length >> 1) + 1;
                                        if (i7 < i6) {
                                            int highestOneBit = Integer.highestOneBit(i5);
                                            i7 = highestOneBit + highestOneBit;
                                        }
                                        if (i7 < 0) {
                                            i7 = Integer.MAX_VALUE;
                                        }
                                        objArr = Arrays.copyOf(objArr, i7);
                                    }
                                    objArr[i5] = languageTag;
                                    r2++;
                                    i5 = i6;
                                }
                                zzn zznVar = zzp.zza;
                                zzuVar = i5 == 0 ? zzu.zza : new zzu(i5, objArr);
                                zzmj.zza = zzuVar;
                            }
                        } finally {
                        }
                    }
                    requestQueue.mCache = zzuVar;
                    requestQueue.mDispatchers = Boolean.TRUE;
                    requestQueue.mNetworkQueue = str;
                    requestQueue.mCacheQueue = str8;
                    requestQueue.mNetwork = zzmjVar.zzh.isSuccessful() ? (String) zzmjVar.zzh.getResult() : zzmjVar.zzf.getMlSdkInstanceId();
                    requestQueue.mFinishedListeners = 10;
                    requestQueue.mEventListeners = Integer.valueOf(zzmjVar.zzj);
                    zbcVar.zbb = requestQueue;
                    zzmjVar.zze.zza(zbcVar);
                    return;
                case 10:
                    zzpg zzpgVar = ((zzjd) this.this$0).zza;
                    zzpgVar.zzaa$1();
                    com.google.android.gms.measurement.internal.zzah zzahVar2 = (com.google.android.gms.measurement.internal.zzah) this.val$mapping;
                    Object zza3 = zzahVar2.zzc.zza();
                    com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) this.val$fillrWebView;
                    if (zza3 == null) {
                        zzpgVar.zzan(zzahVar2, zzrVar);
                        return;
                    } else {
                        zzpgVar.zzal(zzahVar2, zzrVar);
                        return;
                    }
                case 11:
                    zzbh zzbhVar = (zzbh) this.val$mapping;
                    com.google.android.gms.measurement.internal.zzr zzrVar2 = (com.google.android.gms.measurement.internal.zzr) this.val$fillrWebView;
                    zzjd zzjdVar = (zzjd) this.this$0;
                    zzjdVar.getClass();
                    zzpg zzpgVar2 = zzjdVar.zza;
                    if ("_cmp".equals(zzbhVar.zza) && (zzbfVar = zzbhVar.zzb) != null) {
                        Bundle bundle3 = zzbfVar.zza;
                        if (bundle3.size() != 0) {
                            String string2 = bundle3.getString("_cis");
                            if ("referrer broadcast".equals(string2) || "referrer API".equals(string2)) {
                                zzpgVar2.zzaW().zzj.zzb(zzbhVar.toString(), "Event has been filtered ");
                                zzbhVar = new zzbh("_cmpx", zzbfVar, zzbhVar.zzc, zzbhVar.zzd, zzbhVar.zze);
                            }
                        }
                    }
                    String str9 = zzbhVar.zza;
                    zzht zzhtVar = zzpgVar2.zzc;
                    zzpk zzpkVar = zzpgVar2.zzi;
                    zzpg.zzaT(zzhtVar);
                    String str10 = zzrVar2.zza;
                    zzc zzcVar = TextUtils.isEmpty(str10) ? null : (zzc) zzhtVar.zze.get(str10);
                    if (zzcVar == null) {
                        zzpgVar2.zzaW().zzl.zzb(zzrVar2.zza, "EES not loaded for");
                        zzpgVar2.zzaa$1();
                        zzpgVar2.zzF(zzbhVar, zzrVar2);
                        return;
                    }
                    try {
                        zzah zzahVar3 = zzcVar.zzc;
                        zzpg.zzaT(zzpkVar);
                        HashMap zzz = zzpk.zzz(zzbhVar.zzb.zzf(), true);
                        String zza4 = zzjm.zza(str9);
                        if (zza4 == null) {
                            zza4 = str9;
                        }
                        if (zzcVar.zzb(new zzaa(zza4, zzbhVar.zzd, zzz))) {
                            if (zzcVar.zzc()) {
                                zzpgVar2.zzaW().zzl.zzb(str9, "EES edited event");
                                zzpg.zzaT(zzpkVar);
                                zzbh zzA = zzpk.zzA((zzaa) zzahVar3.zzb);
                                zzpgVar2.zzaa$1();
                                zzpgVar2.zzF(zzA, zzrVar2);
                            } else {
                                zzpgVar2.zzaa$1();
                                zzpgVar2.zzF(zzbhVar, zzrVar2);
                            }
                            if (zzcVar.zzd()) {
                                Iterator it = ((ArrayList) zzahVar3.zzc).iterator();
                                while (it.hasNext()) {
                                    zzaa zzaaVar = (zzaa) it.next();
                                    zzpgVar2.zzaW().zzl.zzb(zzaaVar.zzb, "EES logging created event");
                                    zzpg.zzaT(zzpkVar);
                                    zzbh zzA2 = zzpk.zzA(zzaaVar);
                                    zzpgVar2.zzaa$1();
                                    zzpgVar2.zzF(zzA2, zzrVar2);
                                }
                                return;
                            }
                            return;
                        }
                    } catch (com.google.android.gms.internal.measurement.zzd unused6) {
                        zzpgVar2.zzaW().zzd.zzc("EES error. appId, eventName", zzrVar2.zzb, str9);
                    }
                    zzpgVar2.zzaW().zzl.zzb(str9, "EES was not applied to event");
                    zzpgVar2.zzaa$1();
                    zzpgVar2.zzF(zzbhVar, zzrVar2);
                    return;
                case 12:
                    zzjd zzjdVar2 = (zzjd) this.this$0;
                    zzjdVar2.zza.zzaa$1();
                    zzjdVar2.zza.zzD((zzbh) this.val$fillrWebView, (String) this.val$mapping);
                    return;
                case 13:
                    zzpg zzpgVar3 = ((zzjd) this.this$0).zza;
                    zzpgVar3.zzaa$1();
                    zzpl zzplVar = (zzpl) this.val$mapping;
                    Object zza5 = zzplVar.zza();
                    com.google.android.gms.measurement.internal.zzr zzrVar3 = (com.google.android.gms.measurement.internal.zzr) this.val$fillrWebView;
                    if (zza5 == null) {
                        zzpgVar3.zzae(zzplVar.zzb, zzrVar3);
                        return;
                    } else {
                        zzpgVar3.zzad(zzplVar, zzrVar3);
                        return;
                    }
                case 14:
                    run$com$google$android$gms$measurement$internal$zzja();
                    return;
                case 15:
                    run$com$google$android$gms$measurement$internal$zzmi();
                    return;
                case 16:
                    zzcs zzcsVar = (zzcs) this.val$fillrWebView;
                    zznl zznlVar = (zznl) this.this$0;
                    try {
                        try {
                            zzicVar = (zzic) zznlVar.$$delegate_0;
                            zzhhVar = zzicVar.zzh;
                            zzguVar = zzicVar.zzi;
                            zzic.zzN(zzhhVar);
                        } catch (RemoteException e6) {
                            zzgu zzguVar2 = ((zzic) zznlVar.$$delegate_0).zzi;
                            zzic.zzP(zzguVar2);
                            zzguVar2.zzd.zzb(e6, "Failed to get app instance id");
                        }
                        if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                            zzgb zzgbVar = zznlVar.zzb;
                            if (zzgbVar != null) {
                                str3 = zzgbVar.zzm((com.google.android.gms.measurement.internal.zzr) this.val$mapping);
                                if (str3 != null) {
                                    zzlj zzljVar = zzicVar.zzp;
                                    zzic.zzO(zzljVar);
                                    zzljVar.zzg.set(str3);
                                    zzic.zzN(zzhhVar);
                                    zzhhVar.zze.zzb(str3);
                                }
                                zznlVar.zzae();
                                zzppVar = ((zzic) zznlVar.$$delegate_0).zzl;
                                zzic.zzN(zzppVar);
                                zzppVar.zzao(str3, zzcsVar);
                                return;
                            }
                            zzic.zzP(zzguVar);
                            zzguVar.zzd.zza("Failed to get app instance id");
                        } else {
                            zzic.zzP(zzguVar);
                            zzguVar.zzi.zza("Analytics storage consent denied; will not get app instance id");
                            zzlj zzljVar2 = zzicVar.zzp;
                            zzic.zzO(zzljVar2);
                            zzljVar2.zzg.set(null);
                            zzic.zzN(zzhhVar);
                            zzhhVar.zze.zzb(null);
                        }
                        zzppVar = zzicVar.zzl;
                        zzic.zzN(zzppVar);
                        zzppVar.zzao(str3, zzcsVar);
                        return;
                    } finally {
                        zzpp zzppVar2 = ((zzic) zznlVar.$$delegate_0).zzl;
                        zzic.zzN(zzppVar2);
                        zzppVar2.zzao(null, zzcsVar);
                    }
                case 17:
                    zznl zznlVar2 = (zznl) this.val$mapping;
                    com.google.android.gms.measurement.internal.zzr zzrVar4 = (com.google.android.gms.measurement.internal.zzr) this.val$fillrWebView;
                    zzaf zzafVar = (zzaf) this.this$0;
                    zzic zzicVar2 = (zzic) zznlVar2.$$delegate_0;
                    zzgb zzgbVar2 = zznlVar2.zzb;
                    if (zzgbVar2 == null) {
                        zzgu zzguVar3 = zzicVar2.zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzd.zza("[sgtm] Discarding data. Failed to update batch upload status.");
                        return;
                    }
                    try {
                        zzgbVar2.zzC(zzrVar4, zzafVar);
                        zznlVar2.zzae();
                        return;
                    } catch (RemoteException e7) {
                        zzgu zzguVar4 = zzicVar2.zzi;
                        zzic.zzP(zzguVar4);
                        zzguVar4.zzd.zzc("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.zza), e7);
                        return;
                    }
                case 18:
                    Extras.Key key = (Extras.Key) this.val$mapping;
                    zzgu zzguVar5 = (zzgu) this.val$fillrWebView;
                    JobParameters jobParameters = (JobParameters) this.this$0;
                    zzguVar5.zzl.zza("AppMeasurementJobService processed last upload request.");
                    ((zznp) ((Service) key.f61default)).zzb(jobParameters);
                    return;
                case 19:
                    zzaze zzazeVar = (zzaze) this.val$fillrWebView;
                    String str11 = (String) this.val$mapping;
                    Throwable th2 = (Throwable) this.this$0;
                    Iterator it2 = zzazeVar.zze.iterator();
                    while (it2.hasNext()) {
                        ((ListenableFuture) it2.next()).cancel(true);
                    }
                    zzbpa zzbpaVar = zzazeVar.zzt;
                    if (zzbpaVar != null) {
                        zzbpaVar.zze(str11, th2);
                        return;
                    }
                    return;
                case 20:
                    run$com$google$android$libraries$places$internal$zzayx();
                    return;
                case 21:
                    ((zzazr) this.val$mapping).zza.zzc((zzbtx) this.val$fillrWebView, (zzbsn) this.this$0);
                    return;
                case 22:
                    run$com$google$android$libraries$places$internal$zzbuc();
                    return;
                case 23:
                    run$com$google$android$libraries$places$internal$zzbww();
                    return;
                case 24:
                    run$com$google$android$libraries$places$internal$zzcad();
                    return;
                case 25:
                    run$com$google$android$libraries$places$internal$zzcfd();
                    return;
                case 26:
                    run$com$google$android$libraries$places$internal$zzvl();
                    return;
                case 27:
                    run$com$google$android$material$appbar$HeaderBehavior$FlingRunnable();
                    return;
                case 28:
                    run$com$google$android$play$core$splitinstall$internal$zzaj();
                    return;
                default:
                    ((MooncakeFlatRowItemView) this.val$fillrWebView).bindSubtext((DirectoryListItem.ItemViewModel) this.this$0);
                    ((TextView) this.val$mapping).animate().setDuration(300L).alpha(1.0f);
                    return;
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 22:
                    return String.valueOf(((Runnable) this.val$fillrWebView).toString()).concat("(scheduled in SynchronizationContext)");
                case 26:
                    Runnable runnable = (Runnable) this.this$0;
                    StringBuilder sb = new StringBuilder(runnable.toString().length() + 14);
                    sb.append("propagating=[");
                    sb.append(runnable);
                    sb.append("]");
                    return sb.toString();
                default:
                    return super.toString();
            }
        }

        public /* synthetic */ AnonymousClass2(int i, Object obj, Object obj2, Object obj3) {
            this.$r8$classId = i;
            this.val$mapping = obj;
            this.val$fillrWebView = obj2;
            this.this$0 = obj3;
        }

        public /* synthetic */ AnonymousClass2(zzmj zzmjVar, zbc zbcVar, String str) {
            this.$r8$classId = 9;
            this.val$fillrWebView = zzmjVar;
            this.this$0 = zbcVar;
            this.val$mapping = str;
        }

        public /* synthetic */ AnonymousClass2(zzaze zzazeVar, String str, Throwable th) {
            this.$r8$classId = 19;
            this.val$fillrWebView = zzazeVar;
            this.val$mapping = str;
            this.this$0 = th;
        }

        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$mapping = obj2;
            this.val$fillrWebView = obj3;
        }

        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, String str, int i) {
            this.$r8$classId = i;
            this.val$fillrWebView = obj2;
            this.val$mapping = str;
            this.this$0 = obj;
        }

        public /* synthetic */ AnonymousClass2() {
            this.$r8$classId = 1;
        }

        public AnonymousClass2(FillrWebView fillrWebView, Object obj, String str) {
            this.$r8$classId = 3;
            this.val$fillrWebView = fillrWebView;
            this.this$0 = obj;
            this.val$mapping = str;
        }

        public AnonymousClass2(FillrWebView fillrWebView, StringBuffer stringBuffer, Object obj, AtomicBoolean atomicBoolean) {
            this.$r8$classId = 4;
            this.val$mapping = stringBuffer;
            this.val$fillrWebView = obj;
            this.this$0 = atomicBoolean;
        }
    }
}
