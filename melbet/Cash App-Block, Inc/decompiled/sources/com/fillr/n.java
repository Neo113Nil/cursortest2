package com.fillr;

import android.R;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.Toast;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.AutoValue_Recorder_RecordingRecord;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda12;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.collection.SimpleArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.core.util.Pools$SimplePool;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.fragment.app.FragmentActivity;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.viewpager2.widget.ViewPager2;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.redwood.treehouse.EventListener;
import app.cash.zipline.internal.GuestService$Companion$Adapter$GeneratedOutboundService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ViewTargetDisposable;
import com.bugsnag.android.ErrorType;
import com.bugsnag.android.Logger;
import com.bugsnag.android.Stackframe;
import com.bugsnag.android.Stacktrace;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.bugsnag.android.internal.DateUtils;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.UriLoader;
import com.bumptech.glide.util.pool.FactoryPools;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.datadog.trace.core.DDSpan;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.analytics.metrics.MPDbAdapter$MPDatabaseHelper;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.FillrContentType;
import com.fillr.browsersdk.utilities.FillrUtils;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.fillr.e0;
import com.fillr.embedded.profile.FEMainActivity;
import com.fillr.home.HomeFragment;
import com.fillr.profile.ProfileDetailedViewFragment;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.cloudmessaging.zzm;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.api.internal.zaba;
import com.google.android.gms.common.api.internal.zabd;
import com.google.android.gms.common.api.internal.zabu;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.api.internal.zax;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialService;
import com.google.android.gms.identitycredentials.internal.IdentityCredentialClientImpl;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$getCredential$1$callback$1;
import com.google.android.gms.internal.identity_credentials.zzc;
import com.google.android.gms.internal.location.zzdv;
import com.google.android.gms.internal.measurement.zzqa;
import com.google.android.gms.internal.measurement.zzua;
import com.google.android.gms.internal.measurement.zzuc;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzxa;
import com.google.android.gms.internal.mlkit_vision_face.zzdu;
import com.google.android.gms.internal.p000authapi.zbam;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.internal.p000authapi.zbar;
import com.google.android.gms.internal.p000authapi.zbc;
import com.google.android.gms.internal.p000authapi.zbw;
import com.google.android.gms.internal.time.zzag;
import com.google.android.gms.internal.time.zzah;
import com.google.android.gms.internal.time.zzcw;
import com.google.android.gms.internal.time.zzdg;
import com.google.android.gms.internal.time.zzhk;
import com.google.android.gms.internal.time.zzq;
import com.google.android.gms.internal.time.zzu;
import com.google.android.gms.measurement.internal.zzam;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.time.zzb;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarManager$SnackbarRecord;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.presenters.autoinvest.BitcoinAutoInvestProvider;
import com.squareup.cash.bitcoin.presenters.autoinvest.RealBitcoinAutoInvestProvider;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.autoinvest.BitcoinHomeAutoInvestWidgetViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioViewEvent;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvest;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo$special$$inlined$map$1;
import com.squareup.cash.crypto.scenarioplans.models.RefreshLightningInvoiceScenarioPlanInput;
import com.squareup.cash.crypto.scenarioplans.plans.RefreshLightningInvoiceScenarioPlan$produceResponseContext$1;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreference;
import com.squareup.cash.family.familyhub.backend.real.RealDependentRecurringPreferenceStore;
import com.squareup.cash.google.pay.FranklinGooglePayProvisioningGateway$WhenMappings;
import com.squareup.cash.google.pay.FranklinGooglePayProvisioningGateway$complete$1;
import com.squareup.cash.google.pay.FranklinGooglePayProvisioningGateway$provision$1;
import com.squareup.cash.google.pay.GooglePayProvisioningCompletion;
import com.squareup.cash.google.pay.GooglePayProvisioningGateway;
import com.squareup.cash.google.pay.GooglePayProvisioningPayload;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investingcrypto.presenters.autoinvest.InvestingCryptoRecurringPreferences;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsManager;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.protos.cash.cryptosparky.api.deposits.RefreshInvoice$Request;
import com.squareup.protos.cash.cryptosparky.api.deposits.RefreshInvoice$Response;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningResponse;
import com.squareup.protos.franklin.app.ProvisionDigitalWalletTokenResponse;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.workflow1.Workflows__WorkflowActionKt$action$1;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import javax.xml.namespace.QName;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.internal.ContextScope;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final class n implements EncoderCallback, AsyncCallable, BitcoinHomeWidgetPresenter, StampMovingListener, ScenarioPlan, GooglePayProvisioningGateway {
    public static n snackbarManager;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public class a implements o {
        public String b;

        public a(String str, int i) {
            switch (i) {
                case 1:
                    str.getClass();
                    this.b = str;
                    break;
                case 2:
                default:
                    this.b = str;
                    break;
                case 3:
                    this.b = Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
                    break;
            }
        }

        public static String zze(String str, String str2, Object... objArr) {
            if (objArr.length > 0) {
                try {
                    str2 = String.format(Locale.US, str2, objArr);
                } catch (IllegalFormatException e) {
                    Log.e("PlayCore", "Unable to format ".concat(str2), e);
                    str2 = Boxes$$ExternalSyntheticOutline1.m(str2, " [", TextUtils.join(", ", objArr), "]");
                }
            }
            return Recorder$$ExternalSyntheticOutline2.m(str, " : ", str2);
        }

        @Override // com.fillr.o
        public void a(t tVar) {
            boolean z;
            String str = this.b;
            if (str == null || "".equals(str)) {
                String str2 = tVar.t;
                z = str2 == null || "".equals(str2);
            } else {
                z = str.equals(tVar.t);
            }
            if (z) {
                return;
            }
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("An imported schema was announced to have the namespace ", str, ", but has the namespace ");
            m3m.append(tVar.t);
            throw new q0(m3m.toString());
        }

        public void configure(HttpURLConnection httpURLConnection, WebResourceRequest webResourceRequest) {
            httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
            if (webResourceRequest.getRequestHeaders() != null) {
                for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
        }

        public String getHrp() {
            return this.b;
        }

        public String getMimeFromHeaders(HttpURLConnection httpURLConnection, WebResourceRequest webResourceRequest, String str) {
            String headerField = httpURLConnection.getHeaderField("content-type");
            if (headerField != null) {
                headerField = headerField.split(":")[0];
            }
            if (headerField != null) {
                return headerField;
            }
            FillrContentType fillrContentType = FillrContentType.HTML_CONTENT;
            return "text/html";
        }

        public String intercept(WebResourceRequest webResourceRequest) {
            HttpURLConnection httpURLConnection;
            String str;
            URLConnection openConnection;
            String str2;
            InputStream inputStream = null;
            String str3 = null;
            r1 = null;
            inputStream = null;
            inputStream = null;
            InputStream inputStream2 = null;
            inputStream = null;
            if (!shouldIntercept(webResourceRequest)) {
                return null;
            }
            String uri = webResourceRequest.getUrl().toString();
            try {
                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                URL url = new URL(uri);
                if (shouldBypassProxy()) {
                    openConnection = url.openConnection(Proxy.NO_PROXY);
                    SVG svg = Fillr.getInstance().fillrConfig;
                } else {
                    openConnection = url.openConnection();
                    SVG svg2 = Fillr.getInstance().fillrConfig;
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    try {
                        try {
                            httpURLConnection.setConnectTimeout(10000);
                            httpURLConnection.setReadTimeout(10000);
                            configure(httpURLConnection, webResourceRequest);
                            if (httpURLConnection.getResponseCode() == 200) {
                                InputStream inputStream3 = httpURLConnection.getInputStream();
                                try {
                                    str3 = FillrUtils.streamToString(inputStream3);
                                    this.b = getMimeFromHeaders(httpURLConnection, webResourceRequest, str3);
                                    str2 = str3;
                                    inputStream2 = inputStream3;
                                } catch (Exception e) {
                                    e = e;
                                    str = str3;
                                    inputStream = inputStream3;
                                    e.printStackTrace();
                                    SVG svg3 = Fillr.getInstance().fillrConfig;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                            SVG svg4 = Fillr.getInstance().fillrConfig;
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    return str;
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = inputStream3;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                            SVG svg5 = Fillr.getInstance().fillrConfig;
                                        }
                                    }
                                    if (httpURLConnection == null) {
                                        throw th;
                                    }
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            } else {
                                str2 = null;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    str2 = null;
                    httpURLConnection = null;
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        SVG svg6 = Fillr.getInstance().fillrConfig;
                    }
                }
                if (httpURLConnection == null) {
                    return str2;
                }
                httpURLConnection.disconnect();
                return str2;
            } catch (Exception e6) {
                e = e6;
                str = null;
                httpURLConnection = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
            }
        }

        public boolean shouldBypassProxy() {
            SVG svg = Fillr.getInstance().fillrConfig;
            return false;
        }

        public boolean shouldIntercept(WebResourceRequest webResourceRequest) {
            return (webResourceRequest == null || webResourceRequest.getUrl() == null || !"GET".equalsIgnoreCase(webResourceRequest.getMethod())) ? false : true;
        }

        public WebResourceResponse wrapResponse(String str, String str2) {
            if (str2 == null || str2.isEmpty()) {
                str2 = this.b;
            }
            if (str == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            return new WebResourceResponse(str2, charset.name(), new ByteArrayInputStream(str.getBytes(charset)));
        }

        public void zzc(String str, Object... objArr) {
            if (Log.isLoggable("PlayCore", 4)) {
                Log.i("PlayCore", zze(this.b, str, objArr));
            }
        }

        public void zzd(String str, Object... objArr) {
            if (Log.isLoggable("PlayCore", 5)) {
                Log.w("PlayCore", zze(this.b, str, objArr));
            }
        }
    }

    public n(int i) {
        switch (i) {
            case 7:
                this.a = new Mp4OrientationData(0);
                this.c = new HashSet();
                long currentTimeMillis = (System.currentTimeMillis() / 1000) + 2082844800;
                this.d = new Mp4TimestampData(currentTimeMillis, currentTimeMillis);
                break;
            case 11:
                AtomicInteger atomicInteger = new AtomicInteger(0);
                AtomicInteger atomicInteger2 = new AtomicInteger(0);
                AtomicInteger atomicInteger3 = new AtomicInteger(0);
                AtomicInteger atomicInteger4 = new AtomicInteger(0);
                this.a = atomicInteger;
                this.b = atomicInteger2;
                this.c = atomicInteger3;
                this.d = atomicInteger4;
                break;
            case 15:
                this.a = new Object();
                this.b = new Handler(Looper.getMainLooper(), new zzm(this, 2));
                break;
            default:
                this.a = new Pools$SimplePool(10);
                this.b = new SimpleArrayMap(0);
                this.c = new ArrayList();
                this.d = new HashSet();
                break;
        }
    }

    public static void c$1(Element element) {
        try {
            if (element.getAttributeNode("minOccurs") != null) {
                String attribute = element.getAttribute("minOccurs");
                if (attribute.equals("unbounded")) {
                    return;
                }
                Long.parseLong(attribute);
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: durationInMsFromStart-BwNAW2A, reason: not valid java name */
    public static Map m1943durationInMsFromStartBwNAW2A(Duration duration) {
        Map mapOf;
        if (duration != null && (mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("duration", Float.valueOf((float) Duration.m4175toDoubleimpl(duration.rawValue, DurationUnit.MILLISECONDS))))) != null) {
            return mapOf;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public static n getInstance() {
        if (snackbarManager == null) {
            snackbarManager = new n(15);
        }
        return snackbarManager;
    }

    public t a(Document document, String str) {
        e0 e0Var;
        n1 n1Var;
        Object obj;
        String str2;
        m1 m1Var;
        Element documentElement = document.getDocumentElement();
        e0 e0Var2 = (e0) this.b;
        t tVar = (t) this.a;
        List list = l.b;
        new n1(new HashMap()).a(documentElement);
        tVar.getClass();
        n1 n1Var2 = tVar.l;
        m1 m1Var2 = tVar.r;
        m1 m1Var3 = tVar.s;
        Object obj2 = "";
        if (documentElement.getAttributeNode("targetNamespace") != null) {
            String attribute = documentElement.getAttribute("targetNamespace");
            if (!attribute.equals("")) {
                tVar.u = attribute;
                tVar.t = attribute;
            }
        }
        o oVar = (o) this.c;
        if (oVar != null) {
            oVar.a(tVar);
        }
        e0.b bVar = new e0.b(tVar.u, str);
        if (((HashMap) e0Var2.c).containsKey(bVar)) {
            throw new q0("Schema name conflict in collection. Namespace: " + tVar.u);
        }
        e0Var2.a(bVar, tVar);
        tVar.x = e0Var2;
        tVar.i = documentElement.getAttributeNode("elementFormDefault") != null ? new c2(documentElement.getAttribute("elementFormDefault"), 3) : new c2("unqualified", 3);
        tVar.h = documentElement.getAttributeNode("attributeFormDefault") != null ? new c2(documentElement.getAttribute("attributeFormDefault"), 3) : new c2("unqualified", 3);
        Class<?>[] clsArr = null;
        tVar.v = documentElement.getAttributeNode("version") != null ? documentElement.getAttribute("version") : null;
        b("blockDefault", documentElement);
        b("finalDefault", documentElement);
        String str3 = "id";
        if (documentElement.hasAttribute("id")) {
            tVar.f = documentElement.getAttribute("id");
        }
        tVar.c = str;
        Element b2 = s.b(documentElement, "http://www.w3.org/2001/XMLSchema");
        if (b2 == null && s.b(documentElement, "http://www.w3.org/1999/XMLSchema") != null) {
            throw new q0("Schema defined using \"http://www.w3.org/1999/XMLSchema\" is not supported. Please update the schema to the \"http://www.w3.org/2001/XMLSchema\" namespace");
        }
        while (b2 != null) {
            if (b2.getLocalName().equals("simpleType")) {
                b2 t = t(tVar, b2);
                tVar.b(t);
                m1Var3.a(t);
                e0Var2.a(t.e(), t);
            } else if (b2.getLocalName().equals("complexType")) {
                b2 j = j(tVar, b2, documentElement);
                tVar.b(j);
                m1Var3.a(j);
                e0Var2.a(j.e(), j);
            } else if (b2.getLocalName().equals("element")) {
                o0 b3 = b(tVar, b2, documentElement, true);
                QName qName = b3.s;
                if (qName != null) {
                    n1Var2.a.put(qName, b3);
                } else {
                    QName qName2 = b3.t;
                    if (qName2 != null) {
                        n1Var2.a.put(qName2, b3);
                    }
                }
                m1Var3.a(b3);
            } else {
                e0Var = e0Var2;
                if (b2.getLocalName().equals("include")) {
                    a1 a1Var = new a1();
                    Element a2 = s.a(b2, "annotation");
                    if (a2 != null) {
                        a1Var.e = d(a2);
                    }
                    String attribute2 = b2.getAttribute("schemaLocation");
                    a1Var.i = attribute2;
                    o bVar2 = new b(tVar, 0);
                    String str4 = tVar.c;
                    String str5 = tVar.u;
                    if (str4 != null) {
                        a1Var.h = a(str5, attribute2, str4, bVar2);
                    } else {
                        a1Var.h = a(str5, attribute2, null, bVar2);
                    }
                    a(a1Var, b2);
                    m1Var2.a(a1Var);
                    m1Var3.a(a1Var);
                    String str6 = str3;
                    m1Var = m1Var3;
                    str2 = str6;
                    n1Var = n1Var2;
                    obj = obj2;
                    b2 = s.c(b2);
                    m1 m1Var4 = m1Var;
                    str3 = str2;
                    m1Var3 = m1Var4;
                    e0Var2 = e0Var;
                    n1Var2 = n1Var;
                    obj2 = obj;
                    clsArr = null;
                } else {
                    n1Var = n1Var2;
                    if (b2.getLocalName().equals("import")) {
                        z0 z0Var = new z0();
                        Element a3 = s.a(b2, "annotation");
                        if (a3 != null) {
                            z0Var.e = d(a3);
                        }
                        String attribute3 = b2.getAttribute("namespace");
                        z0Var.j = attribute3;
                        String attribute4 = b2.getAttribute("schemaLocation");
                        z0Var.i = attribute4;
                        o aVar = new a(attribute3, 0);
                        if (attribute4 != null && !attribute4.equals(obj2)) {
                            String str7 = tVar.c;
                            if (str7 != null) {
                                z0Var.h = a(attribute3, z0Var.i, str7, aVar);
                            } else {
                                z0Var.h = a(z0Var.j, z0Var.i, null, aVar);
                            }
                        }
                        m1Var2.a(z0Var);
                        m1Var3.a(z0Var);
                    } else if (b2.getLocalName().equals("group")) {
                        j1 k = k(tVar, b2, documentElement);
                        tVar.m.a.put((QName) k.h, k);
                        m1Var3.a(k);
                    } else {
                        obj = obj2;
                        if (b2.getLocalName().equals("attributeGroup")) {
                            a0 e = e(tVar, b2);
                            tVar.j.a.put(e.n, e);
                            m1Var3.a(e);
                        } else if (b2.getLocalName().equals("attribute")) {
                            a0 a4 = a(tVar, b2, true);
                            tVar.k.a.put(a4.n, a4);
                            m1Var3.a(a4);
                        } else {
                            if (b2.getLocalName().equals("redefine")) {
                                q1 q1Var = new q1();
                                m1 m1Var5 = m1Var3;
                                q1Var.m = new m1(0);
                                q1Var.l = new n1(0);
                                q1Var.k = new n1(0);
                                q1Var.j = new n1(0);
                                String attribute5 = b2.getAttribute("schemaLocation");
                                q1Var.i = attribute5;
                                o bVar3 = new b(tVar, 0);
                                String str8 = tVar.c;
                                String str9 = str3;
                                String str10 = tVar.u;
                                if (str8 != null) {
                                    q1Var.h = a(str10, attribute5, str8, bVar3);
                                } else {
                                    q1Var.h = a(str10, attribute5, null, bVar3);
                                }
                                for (Element b4 = s.b(b2, "http://www.w3.org/2001/XMLSchema"); b4 != null; b4 = s.c(b4)) {
                                    if (b4.getLocalName().equals("simpleType")) {
                                        v1 t2 = t(tVar, b4);
                                        q1Var.l.a.put(t2.e(), t2);
                                        q1Var.m.a(t2);
                                    } else if (b4.getLocalName().equals("complexType")) {
                                        i0 j2 = j(tVar, b4, documentElement);
                                        q1Var.l.a.put(j2.e(), j2);
                                        q1Var.m.a(j2);
                                    } else if (b4.getLocalName().equals("group")) {
                                        j1 k2 = k(tVar, b4, documentElement);
                                        q1Var.k.a.put((QName) k2.h, k2);
                                        q1Var.m.a(k2);
                                    } else if (b4.getLocalName().equals("attributeGroup")) {
                                        a0 e2 = e(tVar, b4);
                                        q1Var.j.a.put(e2.n, e2);
                                        q1Var.m.a(e2);
                                    } else if (b4.getLocalName().equals("annotation")) {
                                        q1Var.e = d(b4);
                                    }
                                }
                                m1Var2.a(q1Var);
                                str2 = str9;
                                m1Var = m1Var5;
                            } else {
                                m1 m1Var6 = m1Var3;
                                String str11 = str3;
                                if (b2.getLocalName().equals("notation")) {
                                    j1 j1Var = new j1();
                                    str2 = str11;
                                    if (b2.hasAttribute(str2)) {
                                        j1Var.f = b2.getAttribute(str2);
                                    }
                                    if (b2.hasAttribute("name")) {
                                        j1Var.h = b2.getAttribute("name");
                                    }
                                    if (b2.hasAttribute("public")) {
                                        b2.getAttribute("public");
                                    }
                                    if (b2.hasAttribute("system")) {
                                        b2.getAttribute("system");
                                    }
                                    Element a5 = s.a(b2, "annotation");
                                    if (a5 != null) {
                                        j1Var.e = d(a5);
                                    }
                                    tVar.n.a.put(new QName(tVar.t, (String) j1Var.h), j1Var);
                                    m1Var = m1Var6;
                                    m1Var.a(j1Var);
                                } else {
                                    str2 = str11;
                                    m1Var = m1Var6;
                                    if (b2.getLocalName().equals("annotation")) {
                                        tVar.e = d(b2);
                                    }
                                }
                            }
                            b2 = s.c(b2);
                            m1 m1Var42 = m1Var;
                            str3 = str2;
                            m1Var3 = m1Var42;
                            e0Var2 = e0Var;
                            n1Var2 = n1Var;
                            obj2 = obj;
                            clsArr = null;
                        }
                        String str12 = str3;
                        m1Var = m1Var3;
                        str2 = str12;
                        b2 = s.c(b2);
                        m1 m1Var422 = m1Var;
                        str3 = str2;
                        m1Var3 = m1Var422;
                        e0Var2 = e0Var;
                        n1Var2 = n1Var;
                        obj2 = obj;
                        clsArr = null;
                    }
                    String str13 = str3;
                    m1Var = m1Var3;
                    str2 = str13;
                    obj = obj2;
                    b2 = s.c(b2);
                    m1 m1Var4222 = m1Var;
                    str3 = str2;
                    m1Var3 = m1Var4222;
                    e0Var2 = e0Var;
                    n1Var2 = n1Var;
                    obj2 = obj;
                    clsArr = null;
                }
            }
            String str14 = str3;
            m1Var = m1Var3;
            str2 = str14;
            e0Var = e0Var2;
            n1Var = n1Var2;
            obj = obj2;
            b2 = s.c(b2);
            m1 m1Var42222 = m1Var;
            str3 = str2;
            m1Var3 = m1Var42222;
            e0Var2 = e0Var;
            n1Var2 = n1Var;
            obj2 = obj;
            clsArr = null;
        }
        a(tVar, documentElement);
        try {
        } catch (Throwable unused) {
        }
        return tVar;
    }

    public void addMetadata(Metadata.Entry entry) {
        if (entry instanceof Mp4OrientationData) {
            this.a = (Mp4OrientationData) entry;
            return;
        }
        if (entry instanceof Mp4LocationData) {
            this.b = (Mp4LocationData) entry;
            return;
        }
        if (entry instanceof Mp4TimestampData) {
            this.d = (Mp4TimestampData) entry;
        } else if (entry instanceof MdtaMetadataEntry) {
            ((HashSet) this.c).add((MdtaMetadataEntry) entry);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Unsupported metadata");
        }
    }

    public o0 b(t tVar, Element element, Element element2, boolean z) {
        b2 b2Var;
        QName qName;
        e0 e0Var = (e0) this.b;
        o0 o0Var = new o0();
        o0Var.k = new m1(0);
        new c2("none", 3);
        new c2("none", 2);
        new c2("none", 2);
        if (element.getAttributeNode("name") != null) {
            o0Var.r = element.getAttribute("name");
        }
        boolean equals = tVar.i.a.equals("qualified");
        if (element.hasAttribute("form")) {
            String attribute = element.getAttribute("form");
            new c2(attribute, 3);
            equals = attribute.equals("qualified");
        }
        String str = o0Var.r;
        if (str != null) {
            if (equals || z) {
                String str2 = ((t) this.a).u;
                qName = new QName(str2 != null ? str2 : "", str);
            } else {
                qName = new QName("", str);
            }
            o0Var.s = qName;
        }
        Element a2 = s.a(element, "annotation");
        if (a2 != null) {
            o0Var.e = d(a2);
        }
        if (element.getAttributeNode("type") != null) {
            QName a3 = a(element.getAttribute("type"), element);
            String namespaceURI = a3.getNamespaceURI();
            Iterator it = ((HashMap) e0Var.c).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    b2Var = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((e0.b) entry.getKey()).a.equals(namespaceURI) && (b2Var = ((t) entry.getValue()).b(a3, null)) != null) {
                    break;
                }
            }
            if (b2Var == null) {
                HashMap hashMap = (HashMap) e0Var.i;
                ArrayList arrayList = (ArrayList) hashMap.get(a3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(a3, arrayList);
                }
                arrayList.add(o0Var);
            }
            o0Var.u = b2Var;
        } else if (element.getAttributeNode("ref") != null) {
            QName a4 = a(element.getAttribute("ref"), element);
            o0Var.t = a4;
            o0Var.r = a4.getLocalPart();
        }
        Element a5 = s.a(element, "simpleType");
        if (a5 != null) {
            v1 t = t(tVar, a5);
            o0Var.u = t;
            t.e();
        } else {
            Element a6 = s.a(element, "complexType");
            if (a6 != null) {
                o0Var.u = j(tVar, a6, element2);
            }
        }
        Element a7 = s.a(element, "key");
        if (a7 != null) {
            while (a7 != null) {
                m1 m1Var = o0Var.k;
                f("Key", a7);
                m1Var.a(null);
                a7 = s.a("key", a7);
            }
        }
        Element a8 = s.a(element, "keyref");
        if (a8 != null) {
            while (a8 != null) {
                f("Keyref", a8);
                if (a8.hasAttribute("refer")) {
                    a(a8.getAttribute("refer"), element);
                    throw null;
                }
                o0Var.k.a(null);
                a8 = s.a("keyref", a8);
            }
        }
        Element a9 = s.a(element, "unique");
        if (a9 != null) {
            while (a9 != null) {
                m1 m1Var2 = o0Var.k;
                f("Unique", a9);
                m1Var2.a(null);
                a9 = s.a("unique", a9);
            }
        }
        if (element.hasAttribute("abstract")) {
            Boolean.valueOf(element.getAttribute("abstract")).getClass();
        }
        if (element.hasAttribute("block")) {
            b("block", element);
        }
        if (element.hasAttribute("default")) {
            element.getAttribute("default");
        }
        if (element.hasAttribute("final")) {
            b("final", element);
        }
        if (element.hasAttribute("fixed")) {
            element.getAttribute("fixed");
        }
        if (element.hasAttribute("id")) {
            o0Var.f = element.getAttribute("id");
        }
        if (element.hasAttribute("nillable")) {
            Boolean.valueOf(element.getAttribute("nillable")).getClass();
        }
        if (element.hasAttribute("substitutionGroup")) {
            a(element.getAttribute("substitutionGroup"), element);
        }
        c$1(element);
        o0Var.h = b(element);
        a(o0Var, element);
        return o0Var;
    }

    public void c(Element element) {
        new c2("none", 1);
        if (element.hasAttribute("namespace")) {
            element.getAttribute("namespace");
        }
        if (element.hasAttribute("processContents")) {
            new c2(c("processContents", element), 1);
        }
        if (element.hasAttribute("id")) {
            element.getAttribute("id");
        }
        Element a2 = s.a(element, "annotation");
        if (a2 != null) {
            d(a2);
        }
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public ListenableFuture call() {
        StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) this.a;
        int i = 0;
        zzua zzuaVar = new zzua(stuckPlayerDetector, i);
        ListenableFuture listenableFuture = (ListenableFuture) this.b;
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(listenableFuture, zzuaVar, directExecutor);
        AbstractTransformFuture.AsyncTransformFuture transformAsync2 = Futures.transformAsync(transformAsync, (zzqa) this.c, (Executor) this.d);
        zzuc zzucVar = new zzuc(i, stuckPlayerDetector, transformAsync, transformAsync2);
        int i2 = zzxa.$r8$clinit;
        return Futures.transformAsync(transformAsync2, new zzqa(4, zzvy.zzb(), zzucVar), directExecutor);
    }

    public boolean cancelSnackbarLocked(SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord, int i) {
        BaseTransientBottomBar.AnonymousClass5 anonymousClass5 = (BaseTransientBottomBar.AnonymousClass5) snackbarManager$SnackbarRecord.callback.get();
        if (anonymousClass5 == null) {
            return false;
        }
        ((Handler) this.b).removeCallbacksAndMessages(snackbarManager$SnackbarRecord);
        Handler handler = BaseTransientBottomBar.handler;
        handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.squareup.cash.google.pay.GooglePayProvisioningGateway
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object complete(BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen, DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult, ContinuationImpl continuationImpl) {
        FranklinGooglePayProvisioningGateway$complete$1 franklinGooglePayProvisioningGateway$complete$1;
        int i;
        BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen2;
        DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult2;
        ApiResult apiResult;
        BlockersData updateFromResponseContext;
        if (continuationImpl instanceof FranklinGooglePayProvisioningGateway$complete$1) {
            franklinGooglePayProvisioningGateway$complete$1 = (FranklinGooglePayProvisioningGateway$complete$1) continuationImpl;
            int i2 = franklinGooglePayProvisioningGateway$complete$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                franklinGooglePayProvisioningGateway$complete$1.label = i2 - PKIFailureInfo.systemUnavail;
                FranklinGooglePayProvisioningGateway$complete$1 franklinGooglePayProvisioningGateway$complete$12 = franklinGooglePayProvisioningGateway$complete$1;
                Object obj = franklinGooglePayProvisioningGateway$complete$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = franklinGooglePayProvisioningGateway$complete$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = (Analytics) this.c;
                    BlockersData blockersData = provisionGooglePayScreen.blockersData;
                    AndroidStringManager androidStringManager = (AndroidStringManager) this.a;
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, provisionGooglePayScreen, provisioningResult, null, 18);
                    franklinGooglePayProvisioningGateway$complete$12.L$0 = provisionGooglePayScreen;
                    franklinGooglePayProvisioningGateway$complete$12.L$1 = provisioningResult;
                    franklinGooglePayProvisioningGateway$complete$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, franklinGooglePayProvisioningGateway$complete$12, null, sessionWorker$doWork$2$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    provisionGooglePayScreen2 = provisionGooglePayScreen;
                    provisioningResult2 = provisioningResult;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    provisioningResult2 = franklinGooglePayProvisioningGateway$complete$12.L$1;
                    provisionGooglePayScreen2 = franklinGooglePayProvisioningGateway$complete$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (provisioningResult2 == DigitalWalletTokenProvisioningCompletionData.ProvisioningResult.USER_CANCELED) {
                        updateFromResponseContext = provisionGooglePayScreen2.blockersData;
                    } else {
                        ResponseContext responseContext = ((CompleteDigitalWalletTokenProvisioningResponse) ((ApiResult.Success) apiResult).response).response_context;
                        if (responseContext != null) {
                            BlockersData blockersData2 = provisionGooglePayScreen2.blockersData;
                            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                            updateFromResponseContext = blockersData2.updateFromResponseContext(responseContext, false);
                        }
                    }
                    return new GooglePayProvisioningCompletion.Success(updateFromResponseContext);
                }
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return GooglePayProvisioningCompletion.Failure.INSTANCE;
            }
        }
        franklinGooglePayProvisioningGateway$complete$1 = new FranklinGooglePayProvisioningGateway$complete$1(this, continuationImpl);
        FranklinGooglePayProvisioningGateway$complete$1 franklinGooglePayProvisioningGateway$complete$122 = franklinGooglePayProvisioningGateway$complete$1;
        Object obj2 = franklinGooglePayProvisioningGateway$complete$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = franklinGooglePayProvisioningGateway$complete$122.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return GooglePayProvisioningCompletion.Failure.INSTANCE;
    }

    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    public BlockersData createBlockersData() {
        return FlowStarter.startFlow$default((FlowStarter) this.b, BlockersData.Flow.CLIENT_SCENARIO, (Screen) this.c, null, ClientScenario.PLASMA, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
    }

    public w d(Element element) {
        m1 m1Var = new m1(0);
        Element a2 = s.a(element, "appinfo");
        while (true) {
            z zVar = null;
            if (a2 == null) {
                break;
            }
            z zVar2 = new z();
            f fVar = new f(a2);
            if (a2.hasAttribute("source") || fVar.a.size() != 0) {
                if (a2.hasAttribute("source")) {
                    a2.getAttribute("source");
                }
                zVar2.f = fVar;
                zVar = zVar2;
            }
            if (zVar != null) {
                m1Var.a(zVar);
            }
            a2 = s.b("appinfo", a2);
        }
        for (Element a3 = s.a(element, "documentation"); a3 != null; a3 = s.b("documentation", a3)) {
            n0 n0Var = new n0();
            ArrayList arrayList = new ArrayList();
            for (Node firstChild = a3.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                arrayList.add(firstChild);
            }
            if (arrayList.size() == 0) {
                arrayList = null;
            }
            if (a3.hasAttribute("source") || a3.hasAttribute("xml:lang") || arrayList != null) {
                if (a3.hasAttribute("source")) {
                    a3.getAttribute("source");
                }
                if (a3.hasAttribute("xml:lang")) {
                    a3.getAttribute("xml:lang");
                }
                n0Var.g = new f(a3);
            } else {
                n0Var = null;
            }
            if (n0Var != null) {
                m1Var.a(n0Var);
            }
        }
        w wVar = new w();
        new Vector();
        wVar.e = m1Var;
        a(wVar, element);
        return wVar;
    }

    public void dfs(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((SimpleArrayMap) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                dfs(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public a0 e(t tVar, Element element) {
        a0 a0Var = new a0();
        a0Var.j = new m1(0);
        if (element.hasAttribute("name")) {
            a0Var.n = new QName(tVar.t, element.getAttribute("name"));
        }
        if (element.hasAttribute("id")) {
            a0Var.f = element.getAttribute("id");
        }
        for (Element b2 = s.b(element, "http://www.w3.org/2001/XMLSchema"); b2 != null; b2 = s.c(b2)) {
            if (b2.getLocalName().equals("attribute")) {
                ((m1) a0Var.j).a(a(tVar, b2, false));
            } else if (b2.getLocalName().equals("attributeGroup")) {
                ((m1) a0Var.j).a(f(b2));
            } else if (b2.getLocalName().equals("anyAttribute")) {
                c(b2);
            } else if (b2.getLocalName().equals("annotation")) {
                a0Var.e = d(b2);
            }
        }
        return a0Var;
    }

    public u f(t tVar, Element element, Element element2) {
        u uVar = new u();
        if (element.hasAttribute("id")) {
            uVar.f = element.getAttribute("id");
        }
        c$1(element);
        uVar.h = b(element);
        for (Element b2 = s.b(element, "http://www.w3.org/2001/XMLSchema"); b2 != null; b2 = s.c(b2)) {
            boolean equals = b2.getLocalName().equals("sequence");
            m1 m1Var = uVar.j;
            if (equals) {
                m1Var.a(p(tVar, b2, element2));
            } else if (b2.getLocalName().equals("element")) {
                m1Var.a(b(tVar, b2, element2, false));
            } else if (b2.getLocalName().equals("group")) {
                m1Var.a(l(tVar, b2, element2));
            } else if (b2.getLocalName().equals("choice")) {
                m1Var.a(f(tVar, b2, element2));
            } else if (b2.getLocalName().equals("any")) {
                m1Var.a(m1944b(b2));
            } else if (b2.getLocalName().equals("annotation")) {
                uVar.e = d(b2);
            }
        }
        return uVar;
    }

    public void fireEvent(CaptchaAnalyticsEvent captchaAnalyticsEvent, Map map) {
        ((DefaultAnalyticsRequestExecutor) this.a).executeAsync(((PaymentAnalyticsRequestFactory) this.b).createRequest(captchaAnalyticsEvent, MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(Thread$State$EnumUnboxingLocalUtility.m("site_key", captchaAnalyticsEvent.getSiteKey()), captchaAnalyticsEvent.getAdditionalParams()), map)));
    }

    public String getPlaceholder() {
        return (String) ((Lazy) this.d).getValue();
    }

    public boolean isCurrentSnackbarLocked(BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
        SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord = (SnackbarManager$SnackbarRecord) this.c;
        return (snackbarManager$SnackbarRecord == null || anonymousClass5 == null || snackbarManager$SnackbarRecord.callback.get() != anonymousClass5) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.fillr.n] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.fillr.w0] */
    public i0 j(t tVar, Element element, Element element2) {
        Element element3;
        String str;
        boolean z;
        i0 i0Var;
        Element element4;
        Object obj;
        Object obj2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Element element5;
        String str8;
        Object obj3;
        String str9;
        Object obj4;
        String str10;
        i0 i0Var2;
        i0 i0Var3;
        Element element6 = element;
        Element element7 = element2;
        i0 i0Var4 = new i0(tVar);
        boolean z2 = false;
        i0Var4.l = new m1(0);
        int i = 2;
        new c2("none", 2);
        if (element6.hasAttribute("name")) {
            i0Var4.i = element6.getAttribute("name");
        }
        String str11 = "http://www.w3.org/2001/XMLSchema";
        Element b2 = s.b(element6, "http://www.w3.org/2001/XMLSchema");
        while (true) {
            String str12 = "mixed";
            String str13 = "true";
            if (b2 == null) {
                break;
            }
            String str14 = "sequence";
            if (b2.getLocalName().equals("sequence")) {
                i0Var4.o = p(tVar, b2, element7);
            } else if (b2.getLocalName().equals("choice")) {
                i0Var4.o = f(tVar, b2, element7);
            } else if (b2.getLocalName().equals("all")) {
                i0Var4.o = a(tVar, b2, element7);
            } else {
                String str15 = "attribute";
                if (b2.getLocalName().equals("attribute")) {
                    i0Var4.l.a(a(tVar, b2, z2));
                } else if (b2.getLocalName().equals("attributeGroup")) {
                    i0Var4.l.a(f(b2));
                } else {
                    if (b2.getLocalName().equals("group")) {
                        x0 l = l(tVar, b2, element7);
                        ?? r8 = l.j;
                        if (r8 != 0) {
                            l = r8;
                        }
                        i0Var4.o = l;
                    } else {
                        String str16 = "restriction";
                        Object obj5 = "group";
                        String str17 = "base";
                        Object obj6 = "all";
                        Object obj7 = "choice";
                        if (b2.getLocalName().equals("simpleContent")) {
                            f0 f0Var = new f0(1);
                            Element b3 = s.b(b2, str11);
                            while (b3 != null) {
                                if (b3.getLocalName().equals(str16)) {
                                    u1 u1Var = new u1();
                                    str10 = str16;
                                    u1Var.l = new m1(0);
                                    u1Var.i = new m1(0);
                                    if (b3.hasAttribute("base")) {
                                        a(b3.getAttribute("base"), b3);
                                    }
                                    if (b3.hasAttribute("id")) {
                                        u1Var.f = b3.getAttribute("id");
                                    }
                                    Element b4 = s.b(b3, str11);
                                    while (b4 != null) {
                                        if (b4.getLocalName().equals("attribute")) {
                                            i0Var3 = i0Var4;
                                            u1Var.i.a(a(tVar, b4, false));
                                        } else {
                                            i0Var3 = i0Var4;
                                            if (b4.getLocalName().equals("attributeGroup")) {
                                                u1Var.i.a(f(b4));
                                            } else if (b4.getLocalName().equals("simpleType")) {
                                                t(tVar, b4);
                                            } else if (b4.getLocalName().equals("anyAttribute")) {
                                                c(b4);
                                            } else if (b4.getLocalName().equals("annotation")) {
                                                u1Var.e = d(b4);
                                            } else {
                                                s0 a2 = s0.a(b4);
                                                Element b5 = s.b(b4, str11);
                                                while (true) {
                                                    if (b5 == null) {
                                                        break;
                                                    }
                                                    Element element8 = b5;
                                                    if (element8.getLocalName().equals("annotation") && element8.getNamespaceURI().equals(str11)) {
                                                        a2.e = d(b4);
                                                        break;
                                                    }
                                                    b5 = s.c(element8);
                                                }
                                                u1Var.l.a(a2);
                                            }
                                        }
                                        b4 = s.c(b4);
                                        i0Var4 = i0Var3;
                                    }
                                    f0Var.h = u1Var;
                                    i0Var2 = i0Var4;
                                } else {
                                    str10 = str16;
                                    i0Var2 = i0Var4;
                                    if (b3.getLocalName().equals("extension")) {
                                        h0 h0Var = new h0();
                                        h0Var.i = new m1(0);
                                        if (b3.hasAttribute("base")) {
                                            a(b3.getAttribute("base"), b3);
                                        }
                                        for (Element b6 = s.b(b3, str11); b6 != null; b6 = s.c(b6)) {
                                            if (b6.getLocalName().equals("attribute")) {
                                                h0Var.i.a(a(tVar, b6, false));
                                            } else if (b6.getLocalName().equals("attributeGroup")) {
                                                h0Var.i.a(f(b6));
                                            } else if (b6.getLocalName().equals("anyAttribute")) {
                                                c(b6);
                                            } else if (b6.getLocalName().equals("annotation")) {
                                                h0Var.e = d(b6);
                                            }
                                        }
                                        f0Var.h = h0Var;
                                    } else if (b3.getLocalName().equals("annotation")) {
                                        f0Var.e = d(b3);
                                    }
                                }
                                b3 = s.c(b3);
                                element7 = element2;
                                str16 = str10;
                                i0Var4 = i0Var2;
                            }
                            i0Var4.n = f0Var;
                        } else {
                            Object obj8 = "restriction";
                            i0 i0Var5 = i0Var4;
                            if (b2.getLocalName().equals("complexContent")) {
                                f0 f0Var2 = new f0(0);
                                Element b7 = s.b(b2, str11);
                                while (b7 != null) {
                                    i0 i0Var6 = i0Var5;
                                    String str18 = str12;
                                    String str19 = str13;
                                    Object obj9 = obj8;
                                    if (b7.getLocalName().equals(obj9)) {
                                        h0 h0Var2 = new h0();
                                        obj8 = obj9;
                                        i0Var = i0Var6;
                                        h0Var2.i = new m1(0);
                                        if (b7.hasAttribute(str17)) {
                                            a(b7.getAttribute(str17), b7);
                                        }
                                        Element b8 = s.b(b7, str11);
                                        while (b8 != null) {
                                            if (b8.getLocalName().equals(str14)) {
                                                p(tVar, b8, element2);
                                                element5 = b2;
                                                str8 = str14;
                                            } else {
                                                element5 = b2;
                                                str8 = str14;
                                                Object obj10 = obj7;
                                                if (b8.getLocalName().equals(obj10)) {
                                                    f(tVar, b8, element2);
                                                    obj7 = obj10;
                                                } else {
                                                    obj7 = obj10;
                                                    Object obj11 = obj6;
                                                    if (b8.getLocalName().equals(obj11)) {
                                                        a(tVar, b8, element2);
                                                        obj3 = obj11;
                                                        str9 = str15;
                                                    } else if (b8.getLocalName().equals(str15)) {
                                                        obj3 = obj11;
                                                        str9 = str15;
                                                        h0Var2.i.a(a(tVar, b8, false));
                                                    } else {
                                                        obj3 = obj11;
                                                        str9 = str15;
                                                        if (b8.getLocalName().equals("attributeGroup")) {
                                                            h0Var2.i.a(f(b8));
                                                        } else {
                                                            obj4 = obj5;
                                                            if (b8.getLocalName().equals(obj4)) {
                                                                l(tVar, b8, element2);
                                                            } else if (b8.getLocalName().equals("anyAttribute")) {
                                                                c(b8);
                                                            } else if (b8.getLocalName().equals("annotation")) {
                                                                h0Var2.e = d(b8);
                                                            }
                                                            b8 = s.c(b8);
                                                            obj5 = obj4;
                                                            str15 = str9;
                                                            b2 = element5;
                                                            str14 = str8;
                                                            obj6 = obj3;
                                                        }
                                                    }
                                                    obj4 = obj5;
                                                    b8 = s.c(b8);
                                                    obj5 = obj4;
                                                    str15 = str9;
                                                    b2 = element5;
                                                    str14 = str8;
                                                    obj6 = obj3;
                                                }
                                            }
                                            obj4 = obj5;
                                            obj3 = obj6;
                                            str9 = str15;
                                            b8 = s.c(b8);
                                            obj5 = obj4;
                                            str15 = str9;
                                            b2 = element5;
                                            str14 = str8;
                                            obj6 = obj3;
                                        }
                                        f0Var2.h = h0Var2;
                                        str4 = str17;
                                        element4 = b2;
                                        obj2 = obj6;
                                        str2 = str15;
                                        str5 = str14;
                                        obj = obj5;
                                        str3 = str11;
                                    } else {
                                        i0Var = i0Var6;
                                        element4 = b2;
                                        obj8 = obj9;
                                        String str20 = str14;
                                        obj = obj5;
                                        obj2 = obj6;
                                        str2 = str15;
                                        if (b7.getLocalName().equals("extension")) {
                                            g0 g0Var = new g0();
                                            g0Var.i = new m1(0);
                                            if (b7.hasAttribute(str17)) {
                                                g0Var.j = a(b7.getAttribute(str17), b7);
                                            }
                                            Element b9 = s.b(b7, str11);
                                            while (b9 != null) {
                                                String str21 = str20;
                                                if (b9.getLocalName().equals(str21)) {
                                                    g0Var.k = p(tVar, b9, element2);
                                                    str6 = str11;
                                                } else {
                                                    str6 = str11;
                                                    Object obj12 = obj7;
                                                    if (b9.getLocalName().equals(obj12)) {
                                                        g0Var.k = f(tVar, b9, element2);
                                                        obj7 = obj12;
                                                    } else {
                                                        obj7 = obj12;
                                                        Object obj13 = obj2;
                                                        if (b9.getLocalName().equals(obj13)) {
                                                            g0Var.k = a(tVar, b9, element2);
                                                            obj2 = obj13;
                                                        } else {
                                                            obj2 = obj13;
                                                            String str22 = str2;
                                                            if (b9.getLocalName().equals(str22)) {
                                                                str2 = str22;
                                                                str7 = str17;
                                                                g0Var.i.a(a(tVar, b9, false));
                                                            } else {
                                                                str2 = str22;
                                                                str7 = str17;
                                                                if (b9.getLocalName().equals("attributeGroup")) {
                                                                    g0Var.i.a(f(b9));
                                                                } else if (b9.getLocalName().equals(obj)) {
                                                                    g0Var.k = l(tVar, b9, element2);
                                                                } else if (b9.getLocalName().equals("anyAttribute")) {
                                                                    c(b9);
                                                                } else if (b9.getLocalName().equals("annotation")) {
                                                                    g0Var.e = d(b9);
                                                                }
                                                            }
                                                            b9 = s.c(b9);
                                                            str20 = str21;
                                                            str17 = str7;
                                                            str11 = str6;
                                                        }
                                                    }
                                                }
                                                str7 = str17;
                                                b9 = s.c(b9);
                                                str20 = str21;
                                                str17 = str7;
                                                str11 = str6;
                                            }
                                            f0Var2.h = g0Var;
                                            str3 = str11;
                                            str4 = str17;
                                            str5 = str20;
                                        } else {
                                            str3 = str11;
                                            str4 = str17;
                                            str5 = str20;
                                            if (b7.getLocalName().equals("annotation")) {
                                                f0Var2.e = d(b7);
                                            }
                                            b7 = s.c(b7);
                                            str17 = str4;
                                            str11 = str3;
                                            str12 = str18;
                                            str13 = str19;
                                            i0Var5 = i0Var;
                                            b2 = element4;
                                            obj5 = obj;
                                            str14 = str5;
                                            str15 = str2;
                                            obj6 = obj2;
                                        }
                                    }
                                    b7 = s.c(b7);
                                    str17 = str4;
                                    str11 = str3;
                                    str12 = str18;
                                    str13 = str19;
                                    i0Var5 = i0Var;
                                    b2 = element4;
                                    obj5 = obj;
                                    str14 = str5;
                                    str15 = str2;
                                    obj6 = obj2;
                                }
                                if (b2.hasAttribute(str12)) {
                                    b2.getAttribute(str12).equalsIgnoreCase(str13);
                                }
                                i0Var4 = i0Var5;
                                i0Var4.n = f0Var2;
                                element3 = element2;
                                str = str11;
                                z = false;
                                b2 = s.c(b2);
                                element6 = element;
                                z2 = z;
                                element7 = element3;
                                str11 = str;
                                i = 2;
                            } else {
                                element3 = element2;
                                str = str11;
                                Element element9 = b2;
                                z = false;
                                if (element9.getLocalName().equals("annotation")) {
                                    b2 = element9;
                                    i0Var4 = i0Var5;
                                    i0Var4.e = d(b2);
                                } else {
                                    i0Var4 = i0Var5;
                                    b2 = element9;
                                    if (b2.getLocalName().equals("anyAttribute")) {
                                        c(b2);
                                    }
                                }
                                b2 = s.c(b2);
                                element6 = element;
                                z2 = z;
                                element7 = element3;
                                str11 = str;
                                i = 2;
                            }
                        }
                    }
                    element3 = element7;
                    str = str11;
                    z = false;
                    b2 = s.c(b2);
                    element6 = element;
                    z2 = z;
                    element7 = element3;
                    str11 = str;
                    i = 2;
                }
            }
            element3 = element7;
            str = str11;
            z = z2;
            b2 = s.c(b2);
            element6 = element;
            z2 = z;
            element7 = element3;
            str11 = str;
            i = 2;
        }
        if (element6.hasAttribute("block")) {
            String attribute = element6.getAttribute("block");
            if (attribute.equalsIgnoreCase("all") || attribute.equalsIgnoreCase("#all")) {
                new c2("all", i);
            } else {
                new c2(attribute, i);
            }
        }
        if (element6.hasAttribute("final")) {
            String attribute2 = element6.getAttribute("final");
            if (attribute2.equalsIgnoreCase("all") || attribute2.equalsIgnoreCase("#all")) {
                new c2("all", i);
            } else {
                new c2(attribute2, i);
            }
        }
        if (element6.hasAttribute("abstract")) {
            element6.getAttribute("abstract").equalsIgnoreCase("true");
        }
        if (element6.hasAttribute("mixed")) {
            element6.getAttribute("mixed").equalsIgnoreCase("true");
        }
        a(i0Var4, element6);
        return i0Var4;
    }

    public j1 k(t tVar, Element element, Element element2) {
        j1 j1Var = new j1();
        j1Var.h = new QName(tVar.t, element.getAttribute("name"));
        for (Element b2 = s.b(element, "http://www.w3.org/2001/XMLSchema"); b2 != null; b2 = s.c(b2)) {
            if (b2.getLocalName().equals("all")) {
                a(tVar, b2, element2);
            } else if (b2.getLocalName().equals("sequence")) {
                p(tVar, b2, element2);
            } else if (b2.getLocalName().equals("choice")) {
                f(tVar, b2, element2);
            } else if (b2.getLocalName().equals("annotation")) {
                j1Var.e = d(b2);
            }
        }
        return j1Var;
    }

    public x0 l(t tVar, Element element, Element element2) {
        x0 x0Var = new x0();
        x0Var.h = b(element);
        c$1(element);
        Element a2 = s.a(element, "annotation");
        if (a2 != null) {
            x0Var.e = d(a2);
        }
        if (element.hasAttribute("ref")) {
            a(element.getAttribute("ref"), element);
            return x0Var;
        }
        Element b2 = s.b(element, "http://www.w3.org/2001/XMLSchema");
        while (b2 != null) {
            if (b2.getLocalName().equals("sequence")) {
                x0Var.j = p(tVar, b2, element2);
            } else if (b2.getLocalName().equals("all")) {
                x0Var.j = a(tVar, b2, element2);
            } else if (b2.getLocalName().equals("choice")) {
                x0Var.j = f(tVar, b2, element2);
            }
            Node nextSibling = b2.getNextSibling();
            while (true) {
                if (nextSibling == null) {
                    b2 = null;
                    break;
                }
                if (nextSibling.getNodeType() == 1) {
                    b2 = (Element) nextSibling;
                    break;
                }
                nextSibling = nextSibling.getNextSibling();
            }
        }
        return x0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter
    public BitcoinHomeWidgetViewModel models(BetterNavigator.ScreenNavigator screenNavigator, Flow flow, GapComposer gapComposer, int i) {
        CryptoAutoInvest cryptoAutoInvest;
        ScheduledTransactionPreference scheduledTransactionPreference;
        gapComposer.startReplaceGroup(1884734077);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 19);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Flow flow2 = (Flow) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow2, new BenefitsHubPresenter$models$1$1(flow2, (Continuation) null, this, screenNavigator, 23));
        RealBitcoinAutoInvestProvider realBitcoinAutoInvestProvider = (RealBitcoinAutoInvestProvider) ((BitcoinAutoInvestProvider) this.d);
        gapComposer.startReplaceGroup(342439980);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = realBitcoinAutoInvestProvider.dependentCustomerTokenRepository.getCustomerToken();
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        String str = (String) rememberedValue2;
        RealCryptoAutoInvestRepo realCryptoAutoInvestRepo = (RealCryptoAutoInvestRepo) realBitcoinAutoInvestProvider.cryptoAutoInvestRepo;
        MutableState collectAsState = Updater.collectAsState(new RealCryptoAutoInvestRepo$special$$inlined$map$1(realCryptoAutoInvestRepo.getPreferenceQuery(), realCryptoAutoInvestRepo, 1), null, null, gapComposer, 48, 2);
        if (str != null) {
            gapComposer.startReplaceGroup(1082452160);
            int i2 = 6;
            DependentRecurringPreference bitcoinRecurringPreference = ((RealDependentRecurringPreferenceStore) realBitcoinAutoInvestProvider.dependentRecurringPreferenceStore).bitcoinRecurringPreference(str, gapComposer, 6);
            if (!bitcoinRecurringPreference.equals(DependentRecurringPreference.RecurringPreferenceFailedToLoad.INSTANCE) && !bitcoinRecurringPreference.equals(DependentRecurringPreference.RecurringPreferenceLoading.INSTANCE)) {
                if (!(bitcoinRecurringPreference instanceof DependentRecurringPreference.RecurringPreferenceLoaded)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SyncRecurringPreference syncRecurringPreference = ((DependentRecurringPreference.RecurringPreferenceLoaded) bitcoinRecurringPreference).syncRecurringPreference;
                if (syncRecurringPreference != null && (scheduledTransactionPreference = syncRecurringPreference.preference) != null) {
                    if (!Intrinsics.areEqual(scheduledTransactionPreference.enabled, Boolean.TRUE)) {
                        scheduledTransactionPreference = null;
                    }
                    if (scheduledTransactionPreference != null) {
                        String str2 = scheduledTransactionPreference.investment_entity_token;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        Money money = scheduledTransactionPreference.amount;
                        if (money == null) {
                            money = new Money((Long) 0L, (CurrencyCode) (null == true ? 1 : 0), i2);
                        }
                        Money money2 = money;
                        RecurringSchedule recurringSchedule = scheduledTransactionPreference.recurring_schedule;
                        RecurringSchedule recurringSchedule2 = recurringSchedule == null ? new RecurringSchedule((RecurringSchedule.Frequency) null, (List) null, (String) null, (Integer) null, 31) : recurringSchedule;
                        Long l = scheduledTransactionPreference.next_reload_at;
                        cryptoAutoInvest = new CryptoAutoInvest(str3, money2, l != null ? l.longValue() : 0L, recurringSchedule2);
                        gapComposer.end(false);
                    }
                }
            }
            cryptoAutoInvest = null;
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1083348928);
            gapComposer.end(false);
            cryptoAutoInvest = null;
        }
        if (cryptoAutoInvest == null) {
            cryptoAutoInvest = (CryptoAutoInvest) collectAsState.getValue();
        }
        gapComposer.end(false);
        BitcoinHomeAutoInvestWidgetViewModel bitcoinHomeAutoInvestWidgetViewModel = cryptoAutoInvest == null ? null : new BitcoinHomeAutoInvestWidgetViewModel(InvestingCryptoRecurringPreferences.m3586toTileViewModel_kfyX8k(cryptoAutoInvest.nextReloadAt, cryptoAutoInvest.schedule, cryptoAutoInvest.recurringId, cryptoAutoInvest.amount, (AndroidDateFormatManager) this.a, (AndroidStringManager) this.b, (LocalizedMoneyFormatter.Factory) this.c, new InvestingCryptoAvatarContentModel$Icon(InvestingCryptoImage.BITCOIN), ColorModel.Bitcoin.INSTANCE));
        gapComposer.end(false);
        return bitcoinHomeAutoInvestWidgetViewModel;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onEncodeError(EncodeException encodeException) {
        if (((Recorder) this.d).mAudioErrorCause == null) {
            ((Recorder$$ExternalSyntheticLambda12) this.b).accept(encodeException);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onEncodeStop() {
        ((CallbackToFutureAdapter$Completer) this.a).set(null);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onEncodedData(EncodedData encodedData) {
        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = (AutoValue_Recorder_RecordingRecord) this.c;
        Recorder recorder = (Recorder) this.d;
        if (recorder.mAudioState == 3) {
            encodedData.close();
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Audio is not enabled but audio encoded data is being produced.");
            return;
        }
        if (recorder.mMuxer != null) {
            try {
                recorder.writeAudioData(encodedData, autoValue_Recorder_RecordingRecord);
                encodedData.close();
                return;
            } catch (Throwable th) {
                try {
                    encodedData.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (recorder.mInProgressRecordingStopping) {
            StringUtilsKt.d("Recorder", "Drop audio data since recording is stopping.");
        } else {
            recorder.mPendingAudioRingBuffer.enqueue(new BufferCopiedEncodedData(encodedData));
            if (recorder.mPendingFirstVideoData != null) {
                StringUtilsKt.d("Recorder", "Received audio data. Starting muxer...");
                recorder.setupAndStartMuxer(autoValue_Recorder_RecordingRecord);
            } else {
                StringUtilsKt.d("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
            }
        }
        encodedData.close();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderCallback
    public void onOutputConfigUpdate(StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1) {
        ((Recorder) this.d).mAudioOutputConfig = streamSharing$$ExternalSyntheticLambda1;
    }

    @Override // com.squareup.cardcustomizations.stampview.StampMovingListener
    public void onStampMovedOffCard() {
        ((MutableState) this.d).setValue(Boolean.FALSE);
    }

    @Override // com.squareup.cardcustomizations.stampview.StampMovingListener
    public void onStampMovedOntoCard() {
        ((MutableState) this.d).setValue(Boolean.TRUE);
    }

    @Override // com.squareup.cardcustomizations.stampview.StampMovingListener
    public void onStampStartMoving() {
        ((Function1) this.a).invoke(new CardStudioViewEvent.ToggleScaleBar(true));
        ((MutableState) this.b).setValue(Boolean.TRUE);
        ((MutableState) this.c).setValue(Boolean.FALSE);
    }

    @Override // com.squareup.cardcustomizations.stampview.StampMovingListener
    public void onStampStopMoving() {
        ((MutableState) this.b).setValue(Boolean.FALSE);
        MutableState mutableState = (MutableState) this.c;
        Boolean bool = Boolean.TRUE;
        mutableState.setValue(bool);
        ((MutableState) this.d).setValue(bool);
    }

    public r1 p(t tVar, Element element, Element element2) {
        r1 r1Var = new r1();
        r1Var.k = false;
        c$1(element);
        r1Var.h = b(element);
        try {
            if (element.getAttributeNodeNS("http://letspop.com/schema", "mutableKey") != null) {
                if ("true".equals(element.getAttributeNodeNS("http://letspop.com/schema", "mutableKey").getValue())) {
                    r1Var.k = true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        for (Element b2 = s.b(element, "http://www.w3.org/2001/XMLSchema"); b2 != null; b2 = s.c(b2)) {
            boolean equals = b2.getLocalName().equals("sequence");
            m1 m1Var = r1Var.j;
            if (equals) {
                m1Var.a(p(tVar, b2, element2));
            } else if (b2.getLocalName().equals("element")) {
                m1Var.a(b(tVar, b2, element2, false));
            } else if (b2.getLocalName().equals("group")) {
                m1Var.a(l(tVar, b2, element2));
            } else if (b2.getLocalName().equals("choice")) {
                m1Var.a(f(tVar, b2, element2));
            } else if (b2.getLocalName().equals("any")) {
                m1Var.a(m1944b(b2));
            } else if (b2.getLocalName().equals("annotation")) {
                r1Var.e = d(b2);
            }
        }
        return r1Var;
    }

    public void pauseTimeout(BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
        synchronized (this.a) {
            try {
                if (isCurrentSnackbarLocked(anonymousClass5)) {
                    SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord = (SnackbarManager$SnackbarRecord) this.c;
                    if (!snackbarManager$SnackbarRecord.paused) {
                        snackbarManager$SnackbarRecord.paused = true;
                        ((Handler) this.b).removeCallbacksAndMessages(snackbarManager$SnackbarRecord);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object processActions(Screen screen, BetterNavigator.ScreenNavigator screenNavigator, SuspendLambda suspendLambda) {
        Object withContext = JobKt.withContext((CoroutineContext) this.d, new TaxWebAppBridge.AnonymousClass4(this, screen, screenNavigator, null, 26), suspendLambda);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.blockers.scenarioplan.api.ScenarioPlan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl) {
        RefreshLightningInvoiceScenarioPlan$produceResponseContext$1 refreshLightningInvoiceScenarioPlan$produceResponseContext$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RefreshLightningInvoiceScenarioPlan$produceResponseContext$1) {
            refreshLightningInvoiceScenarioPlan$produceResponseContext$1 = (RefreshLightningInvoiceScenarioPlan$produceResponseContext$1) continuationImpl;
            int i2 = refreshLightningInvoiceScenarioPlan$produceResponseContext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                refreshLightningInvoiceScenarioPlan$produceResponseContext$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = refreshLightningInvoiceScenarioPlan$produceResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = refreshLightningInvoiceScenarioPlan$produceResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CryptoService cryptoService = (CryptoService) this.a;
                    ClientScenario clientScenario = ClientScenario.PLASMA;
                    String str = blockersData.flowToken;
                    RefreshInvoice$Request refreshInvoice$Request = new RefreshInvoice$Request(null, (String) this.d, ByteString.EMPTY);
                    refreshLightningInvoiceScenarioPlan$produceResponseContext$1.label = 1;
                    obj = cryptoService.refreshInvoice(clientScenario, str, refreshInvoice$Request, refreshLightningInvoiceScenarioPlan$produceResponseContext$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((RefreshInvoice$Response) ((ApiResult.Success) apiResult).response).response_context;
                    return Matcher$$ExternalSyntheticOutline0.m(responseContext, responseContext);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        refreshLightningInvoiceScenarioPlan$produceResponseContext$1 = new RefreshLightningInvoiceScenarioPlan$produceResponseContext$1(this, continuationImpl);
        Object obj2 = refreshLightningInvoiceScenarioPlan$produceResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = refreshLightningInvoiceScenarioPlan$produceResponseContext$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.squareup.cash.google.pay.GooglePayProvisioningGateway
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object provision(BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen, String str, String str2, Continuation continuation) {
        FranklinGooglePayProvisioningGateway$provision$1 franklinGooglePayProvisioningGateway$provision$1;
        int i;
        boolean z;
        if (continuation instanceof FranklinGooglePayProvisioningGateway$provision$1) {
            franklinGooglePayProvisioningGateway$provision$1 = (FranklinGooglePayProvisioningGateway$provision$1) continuation;
            int i2 = franklinGooglePayProvisioningGateway$provision$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                franklinGooglePayProvisioningGateway$provision$1.label = i2 - PKIFailureInfo.systemUnavail;
                FranklinGooglePayProvisioningGateway$provision$1 franklinGooglePayProvisioningGateway$provision$12 = franklinGooglePayProvisioningGateway$provision$1;
                Object obj = franklinGooglePayProvisioningGateway$provision$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = franklinGooglePayProvisioningGateway$provision$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = (Analytics) this.c;
                    BlockersData blockersData = provisionGooglePayScreen.blockersData;
                    AndroidStringManager androidStringManager = (AndroidStringManager) this.a;
                    GpsConfigQueries$$ExternalSyntheticLambda1 gpsConfigQueries$$ExternalSyntheticLambda1 = new GpsConfigQueries$$ExternalSyntheticLambda1(27);
                    DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(this, provisionGooglePayScreen, str, str2, null, 13);
                    franklinGooglePayProvisioningGateway$provision$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, analytics, androidStringManager, franklinGooglePayProvisioningGateway$provision$12, gpsConfigQueries$$ExternalSyntheticLambda1, dataStoreImpl$readDataOrHandleCorruption$3);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                int i3 = 19;
                GooglePayProvisioningPayload.Error error = GooglePayProvisioningPayload.Error.INSTANCE;
                if (z) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return new AppLockMonitor$special$$inlined$map$2(error, i3);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = ((ProvisionDigitalWalletTokenResponse) ((ApiResult.Success) apiResult).response).provisioning_response;
                digitalWalletTokenProvisioningResponseData.getClass();
                DigitalWalletTokenProvisioningResponseData.Status status = digitalWalletTokenProvisioningResponseData.status;
                if (status == null) {
                    status = ProtoDefaults.PROVISION_DIGITAL_TOKEN_STATUS;
                }
                if (FranklinGooglePayProvisioningGateway$WhenMappings.$EnumSwitchMapping$0[status.ordinal()] != 1) {
                    return new AppLockMonitor$special$$inlined$map$2(error, i3);
                }
                zzdu zzduVar = digitalWalletTokenProvisioningResponseData.provider_response;
                zzduVar.getClass();
                String str3 = ((DigitalWalletTokenProvisioningResponseData$ProviderResponse$GooglePayResponse) zzduVar).value.opaque_payment_card;
                str3.getClass();
                return new Transform$special$$inlined$map$1(FlowKt.take(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealIssuedCardManager) ((IssuedCardManager) this.d)).getIssuedCardOrNull(), 24), 1), str3, 12);
            }
        }
        franklinGooglePayProvisioningGateway$provision$1 = new FranklinGooglePayProvisioningGateway$provision$1(this, (ContinuationImpl) continuation);
        FranklinGooglePayProvisioningGateway$provision$1 franklinGooglePayProvisioningGateway$provision$122 = franklinGooglePayProvisioningGateway$provision$1;
        Object obj2 = franklinGooglePayProvisioningGateway$provision$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = franklinGooglePayProvisioningGateway$provision$122.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        int i32 = 19;
        GooglePayProvisioningPayload.Error error2 = GooglePayProvisioningPayload.Error.INSTANCE;
        if (z) {
        }
    }

    public void restoreTimeoutIfPaused(BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
        synchronized (this.a) {
            try {
                if (isCurrentSnackbarLocked(anonymousClass5)) {
                    SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord = (SnackbarManager$SnackbarRecord) this.c;
                    if (snackbarManager$SnackbarRecord.paused) {
                        snackbarManager$SnackbarRecord.paused = false;
                        scheduleTimeoutLocked(snackbarManager$SnackbarRecord);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void scheduleTimeoutLocked(SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord) {
        Handler handler = (Handler) this.b;
        int i = snackbarManager$SnackbarRecord.duration;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(snackbarManager$SnackbarRecord);
        handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarManager$SnackbarRecord), i);
    }

    public void setBackground(Drawable drawable) {
        ViewGroup viewGroup = (ViewGroup) this.b;
        viewGroup.setBackgroundDrawable(drawable);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        viewGroup.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void showMoneybotChat() {
        ((Navigator) this.a).goTo(new MoneybotChatScreen((ChatKickoffParams) null, MoneybotChatEntryPoint.MONEY, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 60));
    }

    public void showNextSnackbarLocked() {
        SnackbarManager$SnackbarRecord snackbarManager$SnackbarRecord = (SnackbarManager$SnackbarRecord) this.d;
        if (snackbarManager$SnackbarRecord != null) {
            this.c = snackbarManager$SnackbarRecord;
            this.d = null;
            BaseTransientBottomBar.AnonymousClass5 anonymousClass5 = (BaseTransientBottomBar.AnonymousClass5) snackbarManager$SnackbarRecord.callback.get();
            if (anonymousClass5 == null) {
                this.c = null;
            } else {
                Handler handler = BaseTransientBottomBar.handler;
                handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
            }
        }
    }

    public v1 t(t tVar, Element element) {
        v1 v1Var = new v1(tVar);
        if (element.hasAttribute("name")) {
            v1Var.i = element.getAttribute("name");
        }
        if (element.hasAttribute("final")) {
            String attribute = element.getAttribute("final");
            if (attribute.equalsIgnoreCase("all") || attribute.equalsIgnoreCase("#all")) {
                new c2("all", 2);
            } else {
                new c2(attribute, 2);
            }
        }
        Element a2 = s.a(element, "annotation");
        if (a2 != null) {
            v1Var.e = d(a2);
        }
        Element a3 = s.a(element, "restriction");
        if (a3 != null) {
            y1 y1Var = new y1();
            y1Var.j = new m1(0);
            Element a4 = s.a(a3, "annotation");
            if (a4 != null) {
                y1Var.e = d(a4);
            }
            Element a5 = s.a(a3, "simpleType");
            if (a3.hasAttribute("base")) {
                a(a3.getAttribute("base"), a3);
            } else if (a5 != null) {
                t(tVar, a5);
            }
            for (Element b2 = s.b(a3, "http://www.w3.org/2001/XMLSchema"); b2 != null; b2 = s.c(b2)) {
                if (!b2.getLocalName().equals("annotation") && !b2.getLocalName().equals("simpleType")) {
                    s0 a6 = s0.a(b2);
                    Element a7 = s.a(b2, "annotation");
                    if (a7 != null) {
                        a6.e = d(a7);
                    }
                    a(a6, b2);
                    y1Var.j.a(a6);
                }
            }
            v1Var.k = y1Var;
        } else {
            Element a8 = s.a(element, "list");
            if (a8 != null) {
                x1 x1Var = new x1();
                if (a8.hasAttribute("itemType")) {
                    a(a8.getAttribute("itemType"), a8);
                } else {
                    Element a9 = s.a(a8, "simpleType");
                    if (a9 != null) {
                        t(tVar, a9);
                    }
                }
                Element a10 = s.a(a8, "annotation");
                if (a10 != null) {
                    x1Var.e = d(a10);
                }
                v1Var.k = x1Var;
            } else {
                Element a11 = s.a(element, "union");
                if (a11 != null) {
                    z1 z1Var = new z1();
                    z1Var.h = new m1(0);
                    if (a11.hasAttribute("memberTypes")) {
                        String attribute2 = a11.getAttribute("memberTypes");
                        z1Var.i = attribute2;
                        Vector vector = new Vector();
                        StringTokenizer stringTokenizer = new StringTokenizer(attribute2, " ");
                        while (stringTokenizer.hasMoreTokens()) {
                            vector.add(a(stringTokenizer.nextToken(), a11));
                        }
                        vector.copyInto(new QName[vector.size()]);
                    }
                    for (Element a12 = s.a(a11, "simpleType"); a12 != null; a12 = s.b("simpleType", a12)) {
                        v1 t = t(tVar, a12);
                        z1Var.h.a(t);
                        if (t.i != null) {
                            z1Var.i = String.valueOf(z1Var.i) + " " + t.i;
                        }
                    }
                    Element a13 = s.a(a11, "annotation");
                    if (a13 != null) {
                        z1Var.e = d(a13);
                    }
                    v1Var.k = z1Var;
                }
            }
        }
        a(v1Var, element);
        return v1Var;
    }

    public void updatePageAccessibilityActions() {
        int itemCount;
        m1 m1Var = (m1) this.b;
        Recorder.AnonymousClass6 anonymousClass6 = (Recorder.AnonymousClass6) this.a;
        ViewPager2 viewPager2 = (ViewPager2) this.d;
        int i = R.id.accessibilityActionPageLeft;
        ViewCompat.removeActionWithId(viewPager2, R.id.accessibilityActionPageLeft);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(viewPager2, 0);
        ViewCompat.removeActionWithId(viewPager2, R.id.accessibilityActionPageRight);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(viewPager2, 0);
        ViewCompat.removeActionWithId(viewPager2, R.id.accessibilityActionPageUp);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(viewPager2, 0);
        ViewCompat.removeActionWithId(viewPager2, R.id.accessibilityActionPageDown);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(viewPager2, 0);
        RecyclerView.Adapter adapter = viewPager2.mRecyclerView.mAdapter;
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !viewPager2.mUserInputEnabled) {
            return;
        }
        ViewPager2.LinearLayoutManagerImpl linearLayoutManagerImpl = viewPager2.mLayoutManager;
        if (linearLayoutManagerImpl.mOrientation == 1) {
            if (viewPager2.mCurrentItem < itemCount - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, (String) null), null, anonymousClass6);
            }
            if (viewPager2.mCurrentItem > 0) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, (String) null), null, m1Var);
                return;
            }
            return;
        }
        boolean z = linearLayoutManagerImpl.mRecyclerView.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.mCurrentItem < itemCount - 1) {
            ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, (String) null), null, anonymousClass6);
        }
        if (viewPager2.mCurrentItem > 0) {
            ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, (String) null), null, m1Var);
        }
    }

    public class b implements FactoryPools.Factory, ModelLoaderFactory, AssetUriLoader.AssetFetcherFactory, UriLoader.LocalUriFetcherFactory, o, zaba, zabu, RemoteCall, ListenerHolder.Notifier, com.google.android.gms.tasks.Continuation, zzgw, OnTokenCanceledListener {
        public final /* synthetic */ int $r8$classId;
        public Object b;

        public b(EnumMap enumMap) {
            this.$r8$classId = 27;
            EnumMap enumMap2 = new EnumMap(zzjk.class);
            this.b = enumMap2;
            enumMap2.putAll(enumMap);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void access$extractRumContextInternal(b bVar, Object obj, boolean z) {
            Future future;
            Object obj2;
            DatadogContext datadogContext;
            Object obj3;
            bVar.getClass();
            if (obj instanceof DDSpan) {
                Object tag = ((DDSpan) obj).getTag("_dd.datadog_initial_context");
                if (!(tag instanceof Future)) {
                    tag = null;
                }
                future = (Future) tag;
            } else if (obj instanceof DatadogSpan) {
                Object tag2 = ((DatadogSpan) obj).getTag("_dd.datadog_initial_context");
                if (!(tag2 instanceof Future)) {
                    tag2 = null;
                }
                future = (Future) tag2;
            } else {
                future = null;
            }
            if (future != null) {
                if (z) {
                    try {
                        obj3 = future.get(1L, TimeUnit.SECONDS);
                    } catch (TimeoutException unused) {
                        bVar.logError("Datadog context resolution timeout exceeded.");
                        obj3 = null;
                        datadogContext = (DatadogContext) obj3;
                        if (datadogContext != null) {
                        }
                        setTag("_dd.datadog_initial_context", obj, null);
                    } catch (Exception unused2) {
                        bVar.logError("Unable to get datadog context.");
                        obj3 = null;
                        datadogContext = (DatadogContext) obj3;
                        if (datadogContext != null) {
                        }
                        setTag("_dd.datadog_initial_context", obj, null);
                    }
                    datadogContext = (DatadogContext) obj3;
                } else if (future.isDone()) {
                    try {
                        obj2 = future.get();
                    } catch (Exception unused3) {
                        bVar.logError("Unable to get datadog context.");
                        obj2 = null;
                    }
                    datadogContext = (DatadogContext) obj2;
                } else {
                    bVar.logError("Initial span creation Datadog context is not available at the write time.");
                    datadogContext = null;
                }
                if (datadogContext != null) {
                    Map map = (Map) datadogContext.featuresContext.get("rum");
                    if (map == null) {
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                    }
                    setTag("application_id", obj, map.get("application_id"));
                    setTag("session_id", obj, map.get("session_id"));
                    setTag("view.id", obj, map.get("view_id"));
                    setTag("user_action.id", obj, map.get("action_id"));
                    setTag("user_id", obj, datadogContext.userInfo.id);
                    setTag("account_id", obj, null);
                }
                setTag("_dd.datadog_initial_context", obj, null);
            }
        }

        public static void appendIfMappingDoesNotExist(HashMap hashMap, String str, String str2) {
            if (hashMap.containsKey(str)) {
                return;
            }
            hashMap.put(str, str2);
        }

        public static Stacktrace convertStacktrace$bugsnag_android_core_release(List list) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                Stackframe stackframe = new Stackframe();
                Object obj = map.get("method");
                ErrorType errorType = null;
                stackframe.method = obj instanceof String ? (String) obj : null;
                Object obj2 = map.get("file");
                stackframe.file = obj2 instanceof String ? (String) obj2 : null;
                stackframe.lineNumber = Room.jsonToLong(map.get("lineNumber"));
                Object obj3 = map.get("inProject");
                stackframe.inProject = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                Object obj4 = map.get("columnNumber");
                stackframe.columnNumber = obj4 instanceof Number ? (Number) obj4 : null;
                stackframe.frameAddress = Room.jsonToLong(map.get("frameAddress"));
                stackframe.symbolAddress = Room.jsonToLong(map.get("symbolAddress"));
                stackframe.loadAddress = Room.jsonToLong(map.get("loadAddress"));
                Object obj5 = map.get("codeIdentifier");
                stackframe.codeIdentifier = obj5 instanceof String ? (String) obj5 : null;
                Object obj6 = map.get("isPC");
                stackframe.isPC = obj6 instanceof Boolean ? (Boolean) obj6 : null;
                Object obj7 = map.get("code");
                stackframe.code = obj7 instanceof Map ? (Map) obj7 : null;
                Object obj8 = map.get("type");
                String str = obj8 instanceof String ? (String) obj8 : null;
                if (str != null) {
                    ErrorType.INSTANCE.getClass();
                    errorType = ErrorType.Companion.fromDescriptor(str);
                }
                stackframe.f943type = errorType;
                arrayList.add(stackframe);
            }
            return new Stacktrace(arrayList);
        }

        public static Long parseUnsignedLong(String str) {
            if (str.length() != 16) {
                return null;
            }
            try {
                return Long.valueOf(Long.parseLong(str.substring(2), CharsKt.checkRadix(16)) | (Long.parseLong(str.substring(0, 2), CharsKt.checkRadix(16)) << 56));
            } catch (NumberFormatException unused) {
                return null;
            }
        }

        public static void setTag(String str, Object obj, Object obj2) {
            if (obj instanceof DDSpan) {
                ((DDSpan) obj).context.setTag(obj2, str);
            } else if (obj instanceof DatadogSpan) {
                ((DatadogSpan) obj).setTag(obj2, str);
            }
        }

        public static b zzd(String str) {
            zzam zzamVar;
            EnumMap enumMap = new EnumMap(zzjk.class);
            if (str.length() < zzjk.values().length || str.charAt(0) != '1') {
                return new b();
            }
            zzjk[] values = zzjk.values();
            int length = values.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                zzjk zzjkVar = values[i2];
                int i3 = i + 1;
                char charAt = str.charAt(i);
                zzam[] values2 = zzam.values();
                int length2 = values2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        zzamVar = zzam.UNSET;
                        break;
                    }
                    zzamVar = values2[i4];
                    if (zzamVar.zzk == charAt) {
                        break;
                    }
                    i4++;
                }
                enumMap.put((EnumMap) zzjkVar, (zzjk) zzamVar);
                i2++;
                i = i3;
            }
            return new b(enumMap);
        }

        @Override // com.fillr.o
        public void a(t tVar) {
            String str;
            t tVar2 = (t) this.b;
            String str2 = tVar.t;
            if (str2 == null || "".equals(str2)) {
                tVar.u = tVar2.u;
                return;
            }
            if (tVar.t.equals(tVar2.u)) {
                return;
            }
            String str3 = tVar2.u;
            if (str3 == null || "".equals(str3)) {
                str = "An included schema was announced to have the default target namespace";
            } else {
                str = "An included schema was announced to have the default target namespace or the target namespace " + tVar2.u;
            }
            throw new q0(str + ", but has the target namespace " + tVar.u);
        }

        @Override // com.google.android.gms.common.api.internal.RemoteCall
        public void accept(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 20:
                    CreateCredentialRequest createCredentialRequest = (CreateCredentialRequest) this.b;
                    InternalIdentityCredentialClient$getCredential$1$callback$1 internalIdentityCredentialClient$getCredential$1$callback$1 = new InternalIdentityCredentialClient$getCredential$1$callback$1(1, (TaskCompletionSource) obj2);
                    IIdentityCredentialService iIdentityCredentialService = (IIdentityCredentialService) ((IdentityCredentialClientImpl) obj).getService();
                    ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, true, 0), false);
                    apiMetadata.zze = false;
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                    int i = zzc.$r8$clinit;
                    obtain.writeStrongBinder(internalIdentityCredentialClient$getCredential$1$callback$1);
                    zzc.zzb(obtain, createCredentialRequest);
                    zzc.zzb(obtain, apiMetadata);
                    ((IIdentityCredentialService.Stub.Proxy) iIdentityCredentialService).transactAndReadExceptionReturnVoid(obtain, 6);
                    break;
                default:
                    zbam zbamVar = new zbam((TaskCompletionSource) obj2);
                    zbw zbwVar = (zbw) ((zbar) obj).getService();
                    BeginSignInRequest beginSignInRequest = (BeginSignInRequest) this.b;
                    Parcel zba = zbwVar.zba();
                    int i2 = zbc.$r8$clinit;
                    zba.writeStrongBinder(zbamVar);
                    zbc.zbc(zba, beginSignInRequest);
                    zbwVar.zbb(zba, 1);
                    break;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int addJSON(JSONObject jSONObject, int i) {
            Cursor cursor;
            MPDbAdapter$MPDatabaseHelper mPDbAdapter$MPDatabaseHelper = (MPDbAdapter$MPDatabaseHelper) this.b;
            File file = mPDbAdapter$MPDatabaseHelper.mDatabaseFile;
            if (file.exists() && Math.max(file.getUsableSpace(), mPDbAdapter$MPDatabaseHelper.mConfig.mMinimumDatabaseLimit) < file.length()) {
                return -2;
            }
            String mTableName = FillrEnv$EnumUnboxingLocalUtility.getMTableName(i);
            Cursor cursor2 = null;
            try {
                SQLiteDatabase writableDatabase = mPDbAdapter$MPDatabaseHelper.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("data", jSONObject.toString());
                contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                writableDatabase.insert(mTableName, null, contentValues);
                cursor = writableDatabase.rawQuery("SELECT COUNT(*) FROM ".concat(mTableName), null);
                try {
                    try {
                        cursor.moveToFirst();
                        int i2 = cursor.getInt(0);
                        cursor.close();
                        mPDbAdapter$MPDatabaseHelper.close();
                        return i2;
                    } catch (SQLiteException unused) {
                        if (cursor != null) {
                            cursor.close();
                        } else {
                            cursor2 = cursor;
                        }
                        try {
                            mPDbAdapter$MPDatabaseHelper.close();
                            mPDbAdapter$MPDatabaseHelper.mDatabaseFile.delete();
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            mPDbAdapter$MPDatabaseHelper.close();
                            return -1;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor2 != null) {
                            }
                            mPDbAdapter$MPDatabaseHelper.close();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    mPDbAdapter$MPDatabaseHelper.close();
                    throw th;
                }
            } catch (SQLiteException unused2) {
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor2 != null) {
                }
                mPDbAdapter$MPDatabaseHelper.close();
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            switch (this.$r8$classId) {
                case 7:
                    return new AssetUriLoader(0, (AssetManager) this.b, this);
                default:
                    return new UriLoader(this);
            }
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        public DataFetcher buildFetcher(AssetManager assetManager, String str) {
            return new StreamAssetPathFetcher(assetManager, str, 0);
        }

        public void cleanupEvents(int i, long j) {
            MPDbAdapter$MPDatabaseHelper mPDbAdapter$MPDatabaseHelper = (MPDbAdapter$MPDatabaseHelper) this.b;
            String mTableName = FillrEnv$EnumUnboxingLocalUtility.getMTableName(i);
            try {
                mPDbAdapter$MPDatabaseHelper.getWritableDatabase().delete(mTableName, "created_at <= " + j, null);
            } catch (SQLiteException unused) {
                mPDbAdapter$MPDatabaseHelper.close();
                mPDbAdapter$MPDatabaseHelper.mDatabaseFile.delete();
            } finally {
                mPDbAdapter$MPDatabaseHelper.close();
            }
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public Object create() {
            HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) this.b;
            return new DecodeJob((ViewTargetDisposable) huffmanTreeGroup.codes, (SVG) huffmanTreeGroup.trees);
        }

        public String[] generateDataString(int i) {
            Cursor cursor;
            String str;
            Cursor cursor2;
            String str2;
            String str3;
            String mTableName = FillrEnv$EnumUnboxingLocalUtility.getMTableName(i);
            MPDbAdapter$MPDatabaseHelper mPDbAdapter$MPDatabaseHelper = (MPDbAdapter$MPDatabaseHelper) this.b;
            SQLiteDatabase readableDatabase = mPDbAdapter$MPDatabaseHelper.getReadableDatabase();
            Cursor cursor3 = null;
            try {
                cursor2 = readableDatabase.rawQuery("SELECT * FROM " + mTableName + " ORDER BY created_at ASC LIMIT 50", null);
                try {
                    cursor = readableDatabase.rawQuery("SELECT COUNT(*) FROM ".concat(mTableName), null);
                    try {
                        try {
                            cursor.moveToFirst();
                            str = String.valueOf(cursor.getInt(0));
                        } catch (SQLiteException unused) {
                            str = null;
                        }
                        try {
                            JSONArray jSONArray = new JSONArray();
                            str3 = null;
                            while (cursor2.moveToNext()) {
                                if (cursor2.isLast()) {
                                    str3 = cursor2.getString(cursor2.getColumnIndex("_id"));
                                }
                                try {
                                    jSONArray.put(new JSONObject(cursor2.getString(cursor2.getColumnIndex("data"))));
                                } catch (JSONException unused2) {
                                }
                            }
                            str2 = jSONArray.length() > 0 ? jSONArray.toString() : null;
                            mPDbAdapter$MPDatabaseHelper.close();
                            cursor2.close();
                            cursor.close();
                        } catch (SQLiteException unused3) {
                            mPDbAdapter$MPDatabaseHelper.close();
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            str2 = null;
                            str3 = null;
                            if (str3 != null) {
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor2;
                        mPDbAdapter$MPDatabaseHelper.close();
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException unused4) {
                    cursor = null;
                    str = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
            } catch (SQLiteException unused5) {
                cursor = null;
                str = null;
                cursor2 = null;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
            if (str3 != null || str2 == null) {
                return null;
            }
            return new String[]{str3, str2, str};
        }

        public void logError(String str) {
            InternalSdkCore internalSdkCore = (InternalSdkCore) ((Function0) this.b).invoke();
            InternalLogger internalLogger = internalSdkCore != null ? internalSdkCore.getInternalLogger() : null;
            if (internalLogger != null) {
                DBUtil.log$default(internalLogger, 5, InternalLogger.Target.MAINTAINER, new Workflows__WorkflowActionKt$action$1(str, 9), null, false, 56);
            }
        }

        @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
        public void notifyListener(Object obj) {
            ((TaskCompletionSource) ((zzdv) this.b).zza.mHalfExtent).trySetResult(null);
        }

        @Override // com.google.android.gms.tasks.OnTokenCanceledListener
        public void onCanceled() {
            ((TaskCompletionSource) this.b).zza.zze();
        }

        public void onItemClicked(View view, int i) {
            HomeFragment homeFragment = (HomeFragment) this.b;
            if (view.getId() == com.squareup.cash.R.id.btnOne) {
                HomeFragment.m1942$$Nest$mhideFeedbackView(homeFragment);
                return;
            }
            if (view.getId() == com.squareup.cash.R.id.btnTwo) {
                HomeFragment.m1942$$Nest$mhideFeedbackView(homeFragment);
                return;
            }
            if (view.getId() == com.squareup.cash.R.id.btn_feedback_skip) {
                HomeFragment.m1942$$Nest$mhideFeedbackView(homeFragment);
                return;
            }
            if (view.getId() == com.squareup.cash.R.id.btn_feedback_rateus) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + homeFragment.getActivity().getPackageName()));
                try {
                    homeFragment.adapter.getClass();
                    homeFragment.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(homeFragment.getActivity(), "Sorry, could not launch market", 0).show();
                }
                HomeFragment.m1942$$Nest$mhideFeedbackView(homeFragment);
                return;
            }
            if (view.getId() == com.squareup.cash.R.id.btn_feedback_share) {
                HomeFragment.m1942$$Nest$mhideFeedbackView(homeFragment);
                return;
            }
            net.oneformapp.schema.Element element = homeFragment.adapter.getElement(i);
            FragmentActivity activity = homeFragment.getActivity();
            if (activity instanceof FEMainActivity) {
                FEMainActivity fEMainActivity = (FEMainActivity) activity;
                String str = element.actingElement().pathKey;
                boolean z = element.actingElement().isArrayType || element.isAddress();
                ProfileDetailedViewFragment profileDetailedViewFragment = new ProfileDetailedViewFragment();
                Bundle bundle = new Bundle();
                bundle.putString("elementpath", str);
                bundle.putBoolean("is_parent_array", z);
                profileDetailedViewFragment.setArguments(bundle);
                fEMainActivity.pushFragmentOntoStack(profileDetailedViewFragment, "profile_detailed_view_2");
            }
            AnalyticsEvent analyticsEvent = new AnalyticsEvent();
            analyticsEvent.action = "SELECT";
            String str2 = element.actingElement().pathKey;
            homeFragment.profileStore.getProfileCompletePercentage(homeFragment.schema);
            SharedPreferences sharedPreferences = homeFragment.mPreferenceStore.mPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.getInt("F_NUMBER_OF_FORMS_FILLED", 0);
            }
            FillrAnalyticsServiceBuilder.build().sendEvent(homeFragment.getActivity(), analyticsEvent);
        }

        /* renamed from: onUnknownChildren-iETOA3M, reason: not valid java name */
        public void m1945onUnknownChildreniETOA3M(int i, int i2) {
            EventListener eventListener = (EventListener) ((SVG) this.b).rootElement;
            eventListener.getClass();
            eventListener.mo1391unknownChildreniETOA3M(i, i2);
        }

        /* renamed from: onUnknownProperty-LKUuuww, reason: not valid java name */
        public void m1946onUnknownPropertyLKUuuww(int i, int i2) {
            EventListener eventListener = (EventListener) ((SVG) this.b).rootElement;
            eventListener.getClass();
            eventListener.mo1395unknownPropertyLKUuuww(i, i2);
        }

        /* renamed from: onUnknownWidget-WCEpcRY, reason: not valid java name */
        public void m1947onUnknownWidgetWCEpcRY(int i) {
            EventListener eventListener = (EventListener) ((SVG) this.b).rootElement;
            eventListener.getClass();
            eventListener.mo1396unknownWidgetWCEpcRY(i);
        }

        public void setForceDarkStrategy() {
            ((WebSettingsBoundaryInterface) this.b).setForceDarkBehavior(1);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task task) {
            Task continueWithTask;
            switch (this.$r8$classId) {
                case 25:
                    zzag zzagVar = (zzag) this.b;
                    if (!task.isSuccessful()) {
                        zzagVar.zza();
                        return zzcw.zza(task);
                    }
                    zzu zzuVar = zzagVar.zzb;
                    if (zzuVar == null) {
                        zzagVar.zza();
                        return Room.forException(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                    }
                    zzq zzqVar = (zzq) task.getResult();
                    if (zzqVar != null) {
                        zzuVar.zzc(zzqVar);
                    }
                    return Room.forResult(zzagVar);
                default:
                    zzah zzahVar = (zzah) this.b;
                    zzhk zzhkVar = zzhk.zza;
                    if (!task.isSuccessful()) {
                        return zzcw.zza(task);
                    }
                    zzag zzagVar2 = (zzag) task.getResult();
                    synchronized (zzahVar.zze) {
                        try {
                            if (zzahVar.zzg) {
                                zzagVar2.zza();
                                continueWithTask = Room.forException(new IllegalStateException("dispose() called"));
                            } else {
                                zacn builder = zacn.builder();
                                builder.zaa$1 = new Feature[]{zzb.zza};
                                builder.zac = 29822;
                                builder.zaa = new zzdg(zzahVar, 2);
                                continueWithTask = zzahVar.zae(0, builder.build()).continueWithTask(zzhkVar, new b(zzagVar2, 25));
                            }
                        } finally {
                        }
                    }
                    return continueWithTask;
            }
        }

        public Date toDate(String str) {
            Long longOrNull;
            if (str.length() > 0 && str.charAt(0) == 't' && (longOrNull = StringsKt.toLongOrNull(10, str.substring(1))) != null) {
                return new Date(longOrNull.longValue());
            }
            try {
                return DateUtils.fromIso8601(str);
            } catch (IllegalArgumentException unused) {
                Object obj = ((Exif.AnonymousClass1) this.b).get();
                obj.getClass();
                Date parse = ((DateFormat) obj).parse(str);
                if (parse != null) {
                    return parse;
                }
                a$$ExternalSyntheticBUOutline0.m$3("cannot parse date ".concat(str));
                return null;
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 27:
                    StringBuilder sb = new StringBuilder("1");
                    for (zzjk zzjkVar : zzjk.values()) {
                        zzam zzamVar = (zzam) ((EnumMap) this.b).get(zzjkVar);
                        if (zzamVar == null) {
                            zzamVar = zzam.UNSET;
                        }
                        sb.append(zzamVar.zzk);
                    }
                    return sb.toString();
                default:
                    return super.toString();
            }
        }

        @Override // com.google.android.gms.common.api.internal.zaba
        public void zaa() {
            zabd zabdVar = (zabd) this.b;
            Iterator it = zabdVar.zaa.values().iterator();
            while (it.hasNext()) {
                ((GmsClient) it.next()).disconnect();
            }
            zabdVar.zag.zad = Collections.EMPTY_SET;
        }

        @Override // com.google.android.gms.common.api.internal.zabu
        public void zab(ConnectionResult connectionResult) {
            zax zaxVar = (zax) this.b;
            zaxVar.zam.lock();
            try {
                zaxVar.zak = connectionResult;
                zaxVar.zao();
            } finally {
                zaxVar.zam.unlock();
            }
        }

        @Override // com.google.android.gms.common.api.internal.zabu
        public void zac(int i) {
            zax zaxVar = (zax) this.b;
            Lock lock = zaxVar.zam;
            Lock lock2 = zaxVar.zam;
            lock.lock();
            try {
                if (zaxVar.zal) {
                    zaxVar.zal = false;
                    zaxVar.zab.zac(i);
                    zaxVar.zak = null;
                    zaxVar.zaj = null;
                } else {
                    zaxVar.zal = true;
                    zaxVar.zad.onConnectionSuspended(i);
                }
                lock2.unlock();
            } catch (Throwable th) {
                lock2.unlock();
                throw th;
            }
        }

        @Override // com.google.android.gms.common.api.internal.zaba
        public boolean zad() {
            return true;
        }

        @Override // com.google.android.gms.common.api.internal.zaba
        public void zae() {
            zabd zabdVar = (zabd) this.b;
            Lock lock = zabdVar.zai;
            lock.lock();
            try {
                zabdVar.zan = new zaar(zabdVar, zabdVar.zac, zabdVar.zad, zabdVar.zal, zabdVar.zae, lock, zabdVar.zak);
                zabdVar.zan.zaa();
                zabdVar.zaj.signalAll();
            } finally {
                zabdVar.zai.unlock();
            }
        }

        @Override // com.google.android.gms.common.api.internal.zaba
        public void zaf(Bundle bundle) {
        }

        @Override // com.google.android.gms.common.api.internal.zaba
        public void zag(ConnectionResult connectionResult, Api api, boolean z) {
        }

        @Override // com.google.android.gms.common.api.internal.zaba
        public void zah(int i) {
        }

        public zzam zza() {
            zzam zzamVar = (zzam) ((EnumMap) this.b).get(zzjk.AD_PERSONALIZATION);
            return zzamVar == null ? zzam.UNSET : zzamVar;
        }

        public void zzb(zzjk zzjkVar, int i) {
            zzam zzamVar;
            if (i != -30) {
                if (i != -20) {
                    if (i == -10) {
                        zzamVar = zzam.MANIFEST;
                    } else if (i != 0) {
                        zzamVar = i != 30 ? zzam.UNSET : zzam.INITIALIZATION;
                    }
                }
                zzamVar = zzam.API;
            } else {
                zzamVar = zzam.TCF;
            }
            ((EnumMap) this.b).put((EnumMap) zzjkVar, (zzjk) zzamVar);
        }

        public void zzc(zzjk zzjkVar, zzam zzamVar) {
            ((EnumMap) this.b).put((EnumMap) zzjkVar, (zzjk) zzamVar);
        }

        @Override // com.google.android.gms.measurement.internal.zzgw
        public /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
            ((zzpg) this.b).zzY(str, i, th, bArr, map);
        }

        public /* synthetic */ b(zbaq zbaqVar, BeginSignInRequest beginSignInRequest) {
            this.$r8$classId = 21;
            this.b = beginSignInRequest;
        }

        public /* synthetic */ b(Object obj, int i) {
            this.$r8$classId = i;
            this.b = obj;
        }

        public b() {
            this.$r8$classId = 27;
            this.b = new EnumMap(zzjk.class);
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public DataFetcher build(Uri uri) {
            return new StreamLocalUriFetcher(0, uri, (ContentResolver) this.b);
        }

        public /* synthetic */ b(int i) {
            this.$r8$classId = i;
        }

        public b(InternalLogger internalLogger) {
            this.$r8$classId = 9;
            internalLogger.getClass();
            this.b = internalLogger;
        }

        public b(Logger logger) {
            this.$r8$classId = 5;
            this.b = new Exif.AnonymousClass1(4);
        }

        public b(Context context) {
            this.$r8$classId = 14;
            this.b = new MPDbAdapter$MPDatabaseHelper(context);
        }

        @Override // com.google.android.gms.common.api.internal.zabu
        public void zaa(Bundle bundle) {
            zax zaxVar = (zax) this.b;
            zaxVar.zam.lock();
            try {
                zaxVar.zak = ConnectionResult.RESULT_SUCCESS;
                zaxVar.zao();
            } finally {
                zaxVar.zam.unlock();
            }
        }

        @Override // com.google.android.gms.common.api.internal.zaba
        public zbi zac(zbi zbiVar) {
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        }
    }

    public static String c(String str, Element element) {
        if (element.hasAttribute(str)) {
            return element.getAttribute(str).trim();
        }
        return "none";
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.d = obj;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public n(e0 e0Var, o oVar) {
        this.d = null;
        this.b = e0Var;
        this.c = oVar;
        i iVar = (i) e0Var.a;
        if (iVar != null) {
            this.d = iVar;
        }
        this.a = new t(null, null, null);
    }

    public n(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, DurationProvider durationProvider, RealErrorReporter realErrorReporter) {
        durationProvider.getClass();
        this.a = defaultAnalyticsRequestExecutor;
        this.b = paymentAnalyticsRequestFactory;
        this.c = durationProvider;
        this.d = realErrorReporter;
    }

    public n(CryptoService cryptoService, FlowStarter flowStarter, ScenarioPlanInput scenarioPlanInput, Screen screen) {
        screen.getClass();
        this.a = cryptoService;
        this.b = flowStarter;
        this.c = screen;
        if (scenarioPlanInput instanceof RefreshLightningInvoiceScenarioPlanInput) {
            this.d = ((RefreshLightningInvoiceScenarioPlanInput) scenarioPlanInput).invoiceId;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$3(Reflection.factory.getOrCreateKotlinClass(RefreshLightningInvoiceScenarioPlanInput.class), "Invalid input. Input is not of type ");
            throw null;
        }
    }

    public n(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, ScheduledReloadsManager scheduledReloadsManager, RealInstrumentManager realInstrumentManager) {
        this.a = androidStringManager;
        this.b = scheduledReloadsManager;
        this.c = realInstrumentManager;
        this.d = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public c0 f(Element element) {
        c0 c0Var = new c0();
        if (element.hasAttribute("ref")) {
            a(element.getAttribute("ref"), element);
        }
        if (element.hasAttribute("id")) {
            c0Var.f = element.getAttribute("id");
        }
        Element a2 = s.a(element, "annotation");
        if (a2 != null) {
            c0Var.e = d(a2);
        }
        return c0Var;
    }

    public n(AndroidStringManager androidStringManager, RealShiftTimeFormatter realShiftTimeFormatter, LocalizedMoneyFormatter.Factory factory) {
        this.a = androidStringManager;
        this.b = realShiftTimeFormatter;
        this.c = factory.create(MoneyFormatterConfig.STANDARD);
        this.d = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 26));
    }

    public n(Navigator navigator, MoneybotFlagsHelper moneybotFlagsHelper, RealMoneybotAnalyticsService realMoneybotAnalyticsService, CoroutineScope coroutineScope) {
        navigator.getClass();
        this.a = navigator;
        this.b = moneybotFlagsHelper;
        this.c = realMoneybotAnalyticsService;
        this.d = coroutineScope;
    }

    public void f(String str, Element element) {
        try {
            if (Class.forName("org.apache.ws.commons.schema.XmlSchema".concat(str)).newInstance() == null) {
                if (!element.hasAttribute("name")) {
                    if (!element.hasAttribute("refer")) {
                        for (Element b2 = s.b(element, "http://www.w3.org/2001/XMLSchema"); b2 != null; b2 = s.c(b2)) {
                            if (b2.getLocalName().equals("selector")) {
                                b2.getAttribute("xpath");
                                Element a2 = s.a(b2, "annotation");
                                if (a2 != null) {
                                    d(a2);
                                    throw null;
                                }
                                throw null;
                            }
                            if (!b2.getLocalName().equals("field")) {
                                if (b2.getLocalName().equals("annotation")) {
                                    d(b2);
                                    throw null;
                                }
                            } else {
                                b2.getAttribute("xpath");
                                throw null;
                            }
                        }
                        return;
                    }
                    a(element.getAttribute("refer"), element);
                    throw null;
                }
                element.getAttribute("name");
                throw null;
            }
            throw new ClassCastException();
        } catch (ClassNotFoundException e) {
            throw new q0(e.getMessage());
        } catch (IllegalAccessException e2) {
            throw new q0(e2.getMessage());
        } catch (InstantiationException e3) {
            throw new q0(e3.getMessage());
        }
    }

    public n(CoroutineDispatcher coroutineDispatcher, ContextScope contextScope, GuestService$Companion$Adapter$GeneratedOutboundService guestService$Companion$Adapter$GeneratedOutboundService) {
        coroutineDispatcher.getClass();
        this.a = coroutineDispatcher;
        this.b = contextScope;
        this.c = guestService$Companion$Adapter$GeneratedOutboundService;
        this.d = new LinkedHashMap();
    }

    public n(Context context, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.a = context;
        this.b = coroutineContext;
        Object systemService = context.getSystemService("download");
        systemService.getClass();
        this.c = (DownloadManager) systemService;
        this.d = FlowKt.shareIn(FlowKt.channelFlow(new RealAppConfigManager$update$2$2(this, null, 19)), JobKt.plus(new CoroutineName(n.class.getName()), JobKt.plus(coroutineContext, coroutineScope)), SharingStarted.Companion.Lazily, 0);
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public n(CameraRepository cameraRepository, CameraCoordinatorAdapter cameraCoordinatorAdapter, CameraUseCaseAdapter cameraUseCaseAdapter, Recorder.AnonymousClass1 anonymousClass1) {
        cameraRepository.getClass();
        cameraCoordinatorAdapter.getClass();
        cameraUseCaseAdapter.getClass();
        anonymousClass1.getClass();
        this.a = cameraRepository;
        this.b = cameraCoordinatorAdapter;
        this.c = cameraUseCaseAdapter;
        this.d = anonymousClass1;
    }

    /* renamed from: b, reason: collision with other method in class */
    public x m1944b(Element element) {
        x xVar = new x();
        new c2("none", 1);
        if (element.hasAttribute("namespace")) {
            element.getAttribute("namespace");
        }
        if (element.hasAttribute("processContents")) {
            new c2(c("processContents", element), 1);
        }
        Element a2 = s.a(element, "annotation");
        if (a2 != null) {
            xVar.e = d(a2);
        }
        c$1(element);
        xVar.h = b(element);
        return xVar;
    }

    public static long b(Element element) {
        try {
            if (element.getAttributeNode("maxOccurs") == null) {
                return 1L;
            }
            String attribute = element.getAttribute("maxOccurs");
            if (attribute.equals("unbounded")) {
                return Long.MAX_VALUE;
            }
            return Long.parseLong(attribute);
        } catch (NumberFormatException unused) {
            return 1L;
        }
    }

    public static void b(String str, Element element) {
        if (element.hasAttribute(str) && !element.getAttribute(str).equals("")) {
            String trim = element.getAttribute(str).trim();
            if (trim.equals("#all")) {
                new c2("all", 2);
                return;
            } else {
                new c2(trim, 2);
                return;
            }
        }
        new c2("none", 2);
    }

    public QName a(String str, Element element) {
        String str2;
        int indexOf = str.indexOf(58);
        String str3 = "";
        if (indexOf == -1) {
            str2 = l.a("", element);
            if ("".equals(str2)) {
                return new QName("", str);
            }
        } else {
            String substring = str.substring(0, indexOf);
            String a2 = l.a(substring, element);
            if (a2 == null || "".equals(a2)) {
                e0 e0Var = ((t) this.a).x;
            }
            if (a2 != null && !"".equals(a2)) {
                str = str.substring(indexOf + 1);
                str2 = a2;
                str3 = substring;
            } else {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The prefix ", substring, " is not bound."));
                return null;
            }
        }
        return new QName(str2, str, str3);
    }

    public u a(t tVar, Element element, Element element2) {
        u uVar = new u();
        c$1(element);
        uVar.h = b(element);
        for (Element b2 = s.b(element, "http://www.w3.org/2001/XMLSchema"); b2 != null; b2 = s.c(b2)) {
            if (b2.getLocalName().equals("element")) {
                uVar.j.a(b(tVar, b2, element2, false));
            } else if (b2.getLocalName().equals("annotation")) {
                uVar.e = d(b2);
            }
        }
        return uVar;
    }

    public a0 a(t tVar, Element element, boolean z) {
        NamedNodeMap namedNodeMap;
        String str;
        QName qName;
        n nVar = this;
        t tVar2 = (t) nVar.a;
        a0 a0Var = new a0();
        new c2("none", 3);
        new c2("none", 0);
        if (element.hasAttribute("name")) {
            a0Var.j = element.getAttribute("name");
        }
        boolean equals = tVar.h.a.equals("qualified");
        String str2 = (String) a0Var.j;
        if (str2 != null) {
            if (z) {
                String str3 = tVar2.u;
                if (str3 == null) {
                    str3 = "";
                }
                a0Var.n = new QName(str3, str2);
            } else {
                if (equals) {
                    String str4 = tVar2.u;
                    if (str4 == null) {
                        str4 = "";
                    }
                    qName = new QName(str4, str2);
                } else {
                    qName = new QName(str2);
                }
                a0Var.n = qName;
            }
        }
        String str5 = "type";
        if (element.hasAttribute("type")) {
            nVar.a(element.getAttribute("type"), element);
        }
        if (element.hasAttribute("default")) {
            element.getAttribute("default");
        }
        if (element.hasAttribute("fixed")) {
            element.getAttribute("fixed");
        }
        if (element.hasAttribute("form")) {
            new c2(c("form", element), 3);
        }
        if (element.hasAttribute("id")) {
            a0Var.f = element.getAttribute("id");
        }
        if (element.hasAttribute("use")) {
            new c2(c("use", element), 0);
        }
        if (element.hasAttribute("ref")) {
            String attribute = element.getAttribute("ref");
            nVar.a(attribute, element);
            a0Var.j = attribute;
        }
        Element a2 = s.a(element, "simpleType");
        if (a2 != null) {
            nVar.t(tVar, a2);
        }
        Element a3 = s.a(element, "annotation");
        if (a3 != null) {
            a0Var.e = nVar.d(a3);
        }
        NamedNodeMap attributes = element.getAttributes();
        Vector vector = new Vector();
        int i = 0;
        while (i < attributes.getLength()) {
            Attr attr = (Attr) attributes.item(i);
            String name = attr.getName();
            if (name.equals("name") || name.equals(str5) || name.equals("default") || name.equals("fixed") || name.equals("form") || name.equals("id") || name.equals("use") || name.equals("ref")) {
                namedNodeMap = attributes;
                str = str5;
            } else {
                vector.add(attr);
                String value = attr.getValue();
                namedNodeMap = attributes;
                str = str5;
                if (value.indexOf(":") > -1) {
                    String substring = value.substring(0, value.indexOf(":"));
                    String a4 = l.a(substring, element);
                    if (!"".equals(a4)) {
                        Attr createAttribute = element.getOwnerDocument().createAttribute("xmlns:".concat(substring));
                        createAttribute.setValue(a4);
                        vector.add(createAttribute);
                    }
                }
            }
            i++;
            nVar = this;
            attributes = namedNodeMap;
            str5 = str;
        }
        if (vector.size() > 0) {
        }
        nVar.a(a0Var, element);
        return a0Var;
    }

    public t a(String str, String str2, String str3, o oVar) {
        InputSource inputSource;
        e0 e0Var = (e0) this.b;
        Stack stack = (Stack) e0Var.h;
        if (str2 != null && !"".equals(str2)) {
            ((e) e0Var.f).getClass();
            if (str3 != null) {
                try {
                    File file = new File(str3);
                    if (file.exists()) {
                        str3 = file.toURI().toString();
                    }
                    inputSource = new InputSource(new URI(str3).resolve(new URI(str2.replace(" ", "%20"))).toString());
                } catch (URISyntaxException e) {
                    a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                    return null;
                }
            } else {
                inputSource = new InputSource(str2);
            }
            if (inputSource.getSystemId() != null) {
                str2 = inputSource.getSystemId();
            }
            inputSource.setSystemId(str2);
            e0.b bVar = new e0.b(str, str2);
            t tVar = (t) ((HashMap) e0Var.c).get(bVar);
            if (tVar != null) {
                return tVar;
            }
            if (stack.indexOf(bVar) == -1) {
                stack.push(bVar);
                try {
                    try {
                        return e0Var.a(inputSource, oVar);
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                } finally {
                    stack.pop();
                }
            }
        } else {
            t tVar2 = (t) ((HashMap) e0Var.b).get(str);
            if (tVar2 != null) {
                return tVar2;
            }
        }
        return null;
    }

    public void a(l1 l1Var, Element element) {
        i iVar = (i) this.d;
        if (iVar != null) {
            c cVar = iVar.d;
            HashMap hashMap = iVar.b;
            NamedNodeMap attributes = element.getAttributes();
            for (int i = 0; i < attributes.getLength(); i++) {
                Attr attr = (Attr) attributes.item(i);
                String namespaceURI = attr.getNamespaceURI();
                String localName = attr.getLocalName();
                if (namespaceURI != null && !"".equals(namespaceURI) && !namespaceURI.startsWith("http://www.w3.org/2000/xmlns/") && !"http://www.w3.org/2001/XMLSchema".equals(namespaceURI)) {
                    QName qName = new QName(namespaceURI, localName);
                    Object obj = hashMap.get(qName);
                    if (obj != null) {
                        c.a(l1Var, qName, attr);
                    } else if (cVar != null) {
                        c.a(l1Var, qName, attr);
                    }
                }
            }
            for (Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                if (firstChild.getNodeType() == 1) {
                    Element element2 = (Element) firstChild;
                    String namespaceURI2 = element2.getNamespaceURI();
                    String localName2 = element2.getLocalName();
                    if (namespaceURI2 != null && !"http://www.w3.org/2001/XMLSchema".equals(namespaceURI2)) {
                        QName qName2 = new QName(namespaceURI2, localName2);
                        Object obj2 = hashMap.get(qName2);
                        if (obj2 != null) {
                            c.a(l1Var, qName2, element2);
                        } else if (cVar != null) {
                            c.a(l1Var, qName2, element2);
                        }
                    }
                }
            }
        }
    }
}
