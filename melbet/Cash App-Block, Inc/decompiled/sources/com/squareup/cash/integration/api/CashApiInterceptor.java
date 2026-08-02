package com.squareup.cash.integration.api;

import android.accounts.Account;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zze;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.api.ResponseBodyKt;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NetworkWarningRate;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.localization.PsuedoLocalesKt;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import com.squareup.util.android.AndroidAccountManager;
import com.squareup.util.android.AndroidDeviceInfo;
import com.squareup.util.android.Emails;
import com.squareup.util.android.TelephonyManager$PhoneType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.JobKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealInterceptorChain;
import okio.BlackholeSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.HashingSink;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.RealBufferedSource$inputStream$1;
import okio.internal.DefaultSocket;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CashApiInterceptor implements Interceptor {
    public final zze ISO_8601 = new zze(6);
    public final AndroidAccountManager accountManager;
    public final AndroidClock clock;
    public final String deviceBuildInfo;
    public final String deviceFingerprint;
    public final ForcedLazyKt$forcedLazy$1 deviceId;
    public final AndroidDeviceInfo deviceInfo;
    public final String deviceName;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final DefaultSocket forcedLogoutNotifier;
    public final String installerPackage;
    public final RealLocaleManager localeManager;
    public final String mediaDrmId;
    public Float networkWarningRateAccumulator;
    public final Random random;
    public final SessionManager sessionManager;
    public final SignedInStateManager signedInStateManager;
    public final String simInfo;
    public static final LinkedHashSet appTokenOptionalPaths = SetsKt__SetsKt.linkedSetOf("/2.0/cash/initiate-session", "/2.0/cash/upgrade-app", "/2.0/cash/check-version");
    public static final Pattern NON_PRINTABLE_ASCII = Pattern.compile("[^\\x20-\\x7E]");
    public static final Pattern DIACRITICAL_MARK = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    public CashApiInterceptor(ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1, String str, String str2, String str3, SessionManager sessionManager, AndroidClock androidClock, AndroidAccountManager androidAccountManager, SignedInStateManager signedInStateManager, AndroidDeviceInfo androidDeviceInfo, String str4, String str5, RealRequestSigner realRequestSigner, String str6, FeatureFlagManager featureFlagManager, ErrorReporter errorReporter, Random random, RealLocaleManager realLocaleManager, DefaultSocket defaultSocket) {
        this.deviceId = forcedLazyKt$forcedLazy$1;
        this.deviceName = str;
        this.deviceFingerprint = str2;
        this.deviceBuildInfo = str3;
        this.sessionManager = sessionManager;
        this.clock = androidClock;
        this.accountManager = androidAccountManager;
        this.signedInStateManager = signedInStateManager;
        this.deviceInfo = androidDeviceInfo;
        this.simInfo = str5;
        this.mediaDrmId = str6;
        this.featureFlagManager = featureFlagManager;
        this.errorReporter = errorReporter;
        this.random = random;
        this.localeManager = realLocaleManager;
        this.forcedLogoutNotifier = defaultSocket;
        this.installerPackage = String.valueOf(str4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f8, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r4) == false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f3  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        String str;
        String str2;
        SessionManager sessionManager;
        String str3;
        String typeName;
        String str4;
        String str5;
        HttpUrl httpUrl;
        String str6;
        float f;
        float floatValue;
        BufferedSource source;
        TelephonyManager telephonyManager;
        SessionManager sessionManager2;
        String languageTag;
        AndroidDeviceInfo androidDeviceInfo = this.deviceInfo;
        OkHttpCall.AnonymousClass1 anonymousClass1 = androidDeviceInfo.telephonyManager;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request;
        Request.Builder newBuilder = request.newBuilder();
        String encodedPath = request.url.encodedPath();
        SessionManager sessionManager3 = this.sessionManager;
        String appTokenOrNull = PlatformKt.appTokenOrNull(sessionManager3);
        if (appTokenOrNull != null) {
            StringBuilder sb = new StringBuilder("App ");
            sb.append(appTokenOrNull);
            SessionState currentSessionState = PlatformKt.getCurrentSessionState(sessionManager3);
            if (currentSessionState instanceof SessionState.Initiated) {
                sb.append('-');
                sb.append(((SessionState.Initiated) currentSessionState).getSessionToken());
            } else if (!encodedPath.equals("/2.0/cash/initiate-session")) {
                throw new IOException(String.format("Session token cannot be null for path: %s", Arrays.copyOf(new Object[]{encodedPath}, 1)));
            }
            boolean z = currentSessionState instanceof SwitchingState;
            if (encodedPath.equals("/cash-app/security/1.0/switch-account") ^ z) {
                a$$ExternalSyntheticBUOutline0.m$4(CameraSelector$$ExternalSyntheticOutline0.m("Cannot invoke path ", z ? "while" : "while not", " switching accounts: ", encodedPath));
                return null;
            }
            str = currentSessionState instanceof SessionState.Authenticated ? ((AuthenticatedState) ((SessionState.Authenticated) currentSessionState)).getAccountToken() : null;
            newBuilder.header("Authorization", sb.toString());
        } else {
            if (!appTokenOptionalPaths.contains(encodedPath)) {
                throw new IOException(String.format("App token cannot be null for path: %s", Arrays.copyOf(new Object[]{encodedPath}, 1)));
            }
            str = null;
        }
        newBuilder.header("Square-Device-Info", this.deviceFingerprint);
        newBuilder.header("Device-Build-Info", this.deviceBuildInfo);
        newBuilder.header("X-Device-ID", (String) this.deviceId.$$delegate_0.getValue());
        try {
            String str7 = this.deviceName;
            if (str7 != null) {
                newBuilder.header("X-Device-Name", str7);
            }
        } catch (IllegalArgumentException unused) {
        }
        Date date = new Date(this.clock.millis());
        TimeZone timeZone = TimeZone.getDefault();
        Object obj = this.ISO_8601.get();
        obj.getClass();
        newBuilder.header("Time-Zone", ((DateFormat) obj).format(date) + ";;" + timeZone.getID());
        if (request.headers.get("Accept-Language") == null) {
            Locale systemLocale = RealLocaleManager.getSystemLocale();
            if (Intrinsics.areEqual(systemLocale, PsuedoLocalesKt.PSEUDO_LOCALE_EN) || Intrinsics.areEqual(systemLocale, PsuedoLocalesKt.PSEUDO_LOCALE_AR)) {
                languageTag = RealLocaleManager.getSystemLocale().toLanguageTag();
                languageTag.getClass();
            } else {
                languageTag = ((Locale) this.localeManager.resolvedLocale.$$delegate_0.getValue()).toLanguageTag();
                languageTag.getClass();
            }
            newBuilder.header("Accept-Language", languageTag);
        }
        newBuilder.header("Installer-Package", this.installerPackage);
        newBuilder.header("SIM-Info", this.simInfo);
        Account[] accountsByType = this.accountManager.accountManager.getAccountsByType("com.google");
        accountsByType.getClass();
        String str8 = null;
        boolean z2 = false;
        for (Account account : accountsByType) {
            String normalize = Emails.normalize(account.name);
            if (normalize != null && normalize.length() != 0) {
                boolean endsWith = StringsKt__StringsJVMKt.endsWith(normalize, "@gmail.com", false);
                if (str8 != null) {
                    if (z2 != endsWith) {
                        if (!z2) {
                            str8 = normalize;
                            z2 = true;
                        }
                    } else if (str8.compareTo(normalize) <= 0) {
                    }
                }
                z2 = endsWith;
                str8 = normalize;
            }
        }
        if (str8 != null) {
            ByteString.Companion companion = ByteString.Companion;
            newBuilder.header("X-Square-Device-Account", ByteString.Companion.encodeUtf8(str8).digest$okio("SHA-256").hex());
        }
        TelephonyManager telephonyManager2 = (TelephonyManager) anonymousClass1.val$callback;
        Integer valueOf = telephonyManager2 != null ? Integer.valueOf(telephonyManager2.getPhoneType()) : null;
        if (((valueOf != null && valueOf.intValue() == 1) ? TelephonyManager$PhoneType.GSM : (valueOf != null && valueOf.intValue() == 2) ? TelephonyManager$PhoneType.CDMA : (valueOf != null && valueOf.intValue() == 3) ? TelephonyManager$PhoneType.SIP : TelephonyManager$PhoneType.NONE) != TelephonyManager$PhoneType.CDMA) {
            TelephonyManager telephonyManager3 = (TelephonyManager) anonymousClass1.val$callback;
            str2 = telephonyManager3 != null ? telephonyManager3.getNetworkOperatorName() : null;
            if (str2 != null) {
            }
        }
        str2 = null;
        String replaceAll = str2 == null ? null : NON_PRINTABLE_ASCII.matcher(DIACRITICAL_MARK.matcher(Normalizer.normalize(str2, Normalizer.Form.NFD)).replaceAll("")).replaceAll("?");
        if (replaceAll != null) {
            newBuilder.header("Network-Operator", replaceAll);
        }
        if (Build.VERSION.SDK_INT == 29) {
            anonymousClass1.getClass();
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                a$$ExternalSyntheticBUOutline0.m$1((Object) "Must be on background thread");
                return null;
            }
            if (((SparseArrayCompat) anonymousClass1.this$0) == null) {
                SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(16);
                Field[] declaredFields = TelephonyManager.class.getDeclaredFields();
                declaredFields.getClass();
                int length = declaredFields.length;
                int i = 0;
                while (i < length) {
                    Field field = declaredFields[i];
                    String name = field.getName();
                    if (Modifier.isStatic(field.getModifiers()) && Modifier.isPublic(field.getModifiers())) {
                        sessionManager2 = sessionManager3;
                        if (Intrinsics.areEqual(field.getType(), Integer.TYPE)) {
                            name.getClass();
                            if (StringsKt__StringsJVMKt.startsWith(name, "NETWORK_TYPE_", false)) {
                                sparseArrayCompat.put(field.getInt(null), name.substring(13));
                            }
                        }
                    } else {
                        sessionManager2 = sessionManager3;
                    }
                    i++;
                    sessionManager3 = sessionManager2;
                }
                sessionManager = sessionManager3;
                anonymousClass1.this$0 = sparseArrayCompat;
            } else {
                sessionManager = sessionManager3;
            }
            try {
            } catch (SecurityException e) {
                Timber.Forest.e("Exception trying to retrieve network type", new Object[0], e);
            }
            if (Build.VERSION.SDK_INT == 29 && (telephonyManager = (TelephonyManager) anonymousClass1.val$callback) != null) {
                int networkType = telephonyManager.getNetworkType();
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) anonymousClass1.this$0;
                sparseArrayCompat2.getClass();
                str3 = (String) SieveCacheKt.commonGet(sparseArrayCompat2, networkType);
                if (str3 != null) {
                    newBuilder.header("Network-Type", str3);
                }
                NetworkInfo activeNetworkInfo = androidDeviceInfo.connectivityManager.connectivityManager.getActiveNetworkInfo();
                typeName = activeNetworkInfo == null ? activeNetworkInfo.getTypeName() : null;
                if (typeName == null) {
                    Locale locale = Locale.US;
                    str4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, typeName, locale);
                } else {
                    str4 = null;
                }
                if (str4 != null) {
                    newBuilder.header("Connectivity", str4);
                }
                str5 = this.mediaDrmId;
                if (str5 != null) {
                    newBuilder.header("DRM-ID", str5);
                }
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                newBuilder.header("X-Request-UUID", uuid);
                httpUrl = newBuilder.url;
                if (httpUrl != null) {
                    a$$ExternalSyntheticBUOutline0.m$1("url == null");
                    return null;
                }
                Headers build = newBuilder.headers.build();
                RequestBody requestBody = newBuilder.body;
                ByteString.Companion companion2 = ByteString.Companion;
                HashingSink hashingSink = new HashingSink(new BlackholeSink(), ByteString.Companion.encodeUtf8(uuid));
                RealBufferedSink realBufferedSink = new RealBufferedSink(hashingSink);
                String str9 = build.get("X-Request-UUID");
                if (str9 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("X-Request-UUID Header must be set");
                    return null;
                }
                realBufferedSink.writeUtf8("v0:");
                String str10 = build.get("Authorization");
                realBufferedSink.writeUtf8(str10 != null ? str10 : "");
                realBufferedSink.writeUtf8(str9);
                realBufferedSink.writeUtf8(httpUrl.encodedPath());
                if (requestBody != null) {
                    requestBody.writeTo(realBufferedSink);
                }
                if (!realBufferedSink.bufferField.exhausted()) {
                    realBufferedSink.emit();
                }
                Mac mac = hashingSink.mac;
                mac.getClass();
                byte[] doFinal = mac.doFinal();
                doFinal.getClass();
                newBuilder.header("X-Request-Signature", "v0=" + new ByteString(doFinal).base64());
                newBuilder.header("X-Speleo-Trace-Id", "AND-" + UUID.randomUUID());
                Response proceed = realInterceptorChain.proceed(new Request(newBuilder));
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager);
                if (str != null && !str.equals(activeAccountTokenOrNull)) {
                    proceed.close();
                    a$$ExternalSyntheticBUOutline0.m$4("Account token has changed between request and response.");
                    return null;
                }
                Continuation continuation = null;
                int i2 = proceed.code;
                ResponseBody responseBody = proceed.body;
                Request request2 = proceed.request;
                if (i2 == 401) {
                    JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new RealKeyStoreProvider$load$2(this, continuation, 14));
                    Timber.Forest.e("Received 401 in response to %s, signing out", request2.url.url);
                    this.signedInStateManager.update(SignedInState.SIGNED_OUT);
                } else if (i2 != 403 && 400 <= i2 && i2 < 500) {
                    HttpUrl httpUrl2 = request2.url;
                    if (responseBody != null && (source = responseBody.source()) != null) {
                        ProtoReader protoReader = new ProtoReader(new RealBufferedSource(Okio.source(new RealBufferedSource$inputStream$1(source.peek()))));
                        try {
                            protoReader.beginMessage();
                            while (protoReader.nextTag() != -1) {
                                if (protoReader.nextFieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
                                    str6 = StringsKt.substringBefore$default((String) ProtoAdapter.STRING.decode(protoReader), '\n');
                                    break;
                                }
                                protoReader.skip();
                            }
                        } catch (IOException unused2) {
                        }
                    }
                    str6 = null;
                    if (str6 == null) {
                        str6 = ResponseBodyKt.peekString(responseBody);
                    }
                    ClientError clientError = new ClientError(i2, httpUrl2, str6);
                    clientError.fillInStackTrace();
                    Timber.Forest.w(clientError);
                    FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = (FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$NetworkWarningRate.INSTANCE);
                    featureFlag$StringFeatureFlag$Value.getClass();
                    String str11 = featureFlag$StringFeatureFlag$Value.value;
                    switch (str11.hashCode()) {
                        case -559631401:
                            if (str11.equals("TWENTY_PERCENT")) {
                                f = 0.2f;
                                Float f2 = this.networkWarningRateAccumulator;
                                floatValue = (f2 != null ? f2.floatValue() : this.random.nextFloat()) + f;
                                Float valueOf2 = Float.valueOf(floatValue);
                                this.networkWarningRateAccumulator = valueOf2;
                                if (floatValue >= 1.0f) {
                                    this.networkWarningRateAccumulator = Float.valueOf(valueOf2.floatValue() - 1.0f);
                                    this.errorReporter.report(clientError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                    break;
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Unknown NetworkWarningRate value: ".concat(str11));
                            return null;
                        case 2169487:
                            if (str11.equals("FULL")) {
                                f = 1.0f;
                                Float f22 = this.networkWarningRateAccumulator;
                                floatValue = (f22 != null ? f22.floatValue() : this.random.nextFloat()) + f;
                                Float valueOf22 = Float.valueOf(floatValue);
                                this.networkWarningRateAccumulator = valueOf22;
                                if (floatValue >= 1.0f) {
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Unknown NetworkWarningRate value: ".concat(str11));
                            return null;
                        case 2750120:
                            if (str11.equals("ZERO")) {
                                f = RecyclerView.DECELERATION_RATE;
                                Float f222 = this.networkWarningRateAccumulator;
                                floatValue = (f222 != null ? f222.floatValue() : this.random.nextFloat()) + f;
                                Float valueOf222 = Float.valueOf(floatValue);
                                this.networkWarningRateAccumulator = valueOf222;
                                if (floatValue >= 1.0f) {
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Unknown NetworkWarningRate value: ".concat(str11));
                            return null;
                        case 634106776:
                            if (str11.equals("FIVE_PERCENT")) {
                                f = 0.05f;
                                Float f2222 = this.networkWarningRateAccumulator;
                                floatValue = (f2222 != null ? f2222.floatValue() : this.random.nextFloat()) + f;
                                Float valueOf2222 = Float.valueOf(floatValue);
                                this.networkWarningRateAccumulator = valueOf2222;
                                if (floatValue >= 1.0f) {
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Unknown NetworkWarningRate value: ".concat(str11));
                            return null;
                        case 805433618:
                            if (str11.equals("TWO_PERCENT")) {
                                f = 0.02f;
                                Float f22222 = this.networkWarningRateAccumulator;
                                floatValue = (f22222 != null ? f22222.floatValue() : this.random.nextFloat()) + f;
                                Float valueOf22222 = Float.valueOf(floatValue);
                                this.networkWarningRateAccumulator = valueOf22222;
                                if (floatValue >= 1.0f) {
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Unknown NetworkWarningRate value: ".concat(str11));
                            return null;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$3("Unknown NetworkWarningRate value: ".concat(str11));
                            return null;
                    }
                }
                return proceed;
            }
        } else {
            sessionManager = sessionManager3;
        }
        str3 = null;
        if (str3 != null) {
        }
        NetworkInfo activeNetworkInfo2 = androidDeviceInfo.connectivityManager.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo2 == null) {
        }
        if (typeName == null) {
        }
        if (str4 != null) {
        }
        str5 = this.mediaDrmId;
        if (str5 != null) {
        }
        String uuid2 = UUID.randomUUID().toString();
        uuid2.getClass();
        newBuilder.header("X-Request-UUID", uuid2);
        httpUrl = newBuilder.url;
        if (httpUrl != null) {
        }
    }
}
