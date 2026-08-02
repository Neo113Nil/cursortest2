package com.squareup.cash.session.backend;

import android.net.Uri;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.WebLoginConfig;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.WebLoginConfigQueries$select$2;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.util.clock.AndroidClock;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealUrlAuthenticator {
    public final AppConfigManager appConfig;
    public final List cashDomainHosts;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public final CoroutineScope scope;
    public final AppLockMonitor$special$$inlined$map$2 webLoginConfigSource;

    public RealUrlAuthenticator(AndroidClock androidClock, AppConfigManager appConfigManager, List list, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.clock = androidClock;
        this.appConfig = appConfigManager;
        this.cashDomainHosts = list;
        this.ioDispatcher = coroutineContext;
        this.scope = coroutineScope;
        RealAppConfigManager realAppConfigManager = (RealAppConfigManager) appConfigManager;
        SessionQueries sessionQueries = realAppConfigManager.webLoginConfigQueries;
        sessionQueries.getClass();
        WebLoginConfigQueries$select$2 webLoginConfigQueries$select$2 = WebLoginConfigQueries$select$2.INSTANCE;
        SqlDriver sqlDriver = sessionQueries.driver;
        WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0 = new WebLoginConfigQueries$$ExternalSyntheticLambda0(0);
        sqlDriver.getClass();
        this.webLoginConfigSource = new AppLockMonitor$special$$inlined$map$2(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(424325465, new String[]{"webLoginConfig"}, sqlDriver, "WebLoginConfig.sq", "select", "SELECT webLoginConfig.token, webLoginConfig.expires_at\nFROM webLoginConfig", webLoginConfigQueries$$ExternalSyntheticLambda0)), realAppConfigManager.ioDispatcher), 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object authenticate(String str, ContinuationImpl continuationImpl) {
        RealUrlAuthenticator$authenticate$1 realUrlAuthenticator$authenticate$1;
        int i;
        String str2;
        Uri uri;
        List list;
        String str3;
        String query;
        String str4;
        if (continuationImpl instanceof RealUrlAuthenticator$authenticate$1) {
            realUrlAuthenticator$authenticate$1 = (RealUrlAuthenticator$authenticate$1) continuationImpl;
            int i2 = realUrlAuthenticator$authenticate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realUrlAuthenticator$authenticate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realUrlAuthenticator$authenticate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUrlAuthenticator$authenticate$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Uri parse = Uri.parse(str);
                    ChatInputView$Content$1$1$1 chatInputView$Content$1$1$1 = new ChatInputView$Content$1$1$1(str, continuation, 5);
                    realUrlAuthenticator$authenticate$1.L$0 = str;
                    realUrlAuthenticator$authenticate$1.L$1 = parse;
                    realUrlAuthenticator$authenticate$1.label = 1;
                    Object withContext = JobKt.withContext(this.ioDispatcher, chatInputView$Content$1$1$1, realUrlAuthenticator$authenticate$1);
                    if (withContext != obj2) {
                        str2 = str;
                        uri = parse;
                        obj = withContext;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = realUrlAuthenticator$authenticate$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    WebLoginConfig webLoginConfig = (WebLoginConfig) obj;
                    str4 = webLoginConfig == null ? webLoginConfig.token : null;
                    if (str4 != null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Web login config token is null. Check if `authenticate` is called before appConfig is ready.");
                        return null;
                    }
                    str3.getClass();
                    String replace$default = StringsKt__StringsJVMKt.replace$default(str3, "{{token}}", str4);
                    JobKt.launch$default(this.scope, null, null, new ShoppingWebBridge.AnonymousClass1(this, continuation, 19), 3);
                    return replace$default;
                }
                uri = realUrlAuthenticator$authenticate$1.L$1;
                str2 = realUrlAuthenticator$authenticate$1.L$0;
                SafeTrace.throwOnFailure(obj);
                String str5 = (String) obj;
                list = this.cashDomainHosts;
                str5.getClass();
                boolean contains = CollectionsKt.contains(list, Uri.parse(str5).getHost());
                if (CollectionsKt.contains(list, uri.getHost()) || !contains || (!StringsKt.contains((CharSequence) str5, (CharSequence) "{{token}}", false) && ((query = uri.getQuery()) == null || !StringsKt.contains((CharSequence) query, (CharSequence) "{{token}}", false)))) {
                    return str2;
                }
                realUrlAuthenticator$authenticate$1.L$0 = null;
                realUrlAuthenticator$authenticate$1.L$1 = null;
                realUrlAuthenticator$authenticate$1.L$2 = str5;
                realUrlAuthenticator$authenticate$1.label = 2;
                Object webLoginConfig2 = getWebLoginConfig(realUrlAuthenticator$authenticate$1);
                if (webLoginConfig2 != obj2) {
                    obj = webLoginConfig2;
                    str3 = str5;
                    WebLoginConfig webLoginConfig3 = (WebLoginConfig) obj;
                    if (webLoginConfig3 == null) {
                    }
                    if (str4 != null) {
                    }
                }
                return obj2;
            }
        }
        realUrlAuthenticator$authenticate$1 = new RealUrlAuthenticator$authenticate$1(this, continuationImpl);
        Object obj3 = realUrlAuthenticator$authenticate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUrlAuthenticator$authenticate$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        String str52 = (String) obj3;
        list = this.cashDomainHosts;
        str52.getClass();
        boolean contains2 = CollectionsKt.contains(list, Uri.parse(str52).getHost());
        if (CollectionsKt.contains(list, uri.getHost())) {
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (r13 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0049, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getWebLoginConfig(ContinuationImpl continuationImpl) {
        RealUrlAuthenticator$getWebLoginConfig$1 realUrlAuthenticator$getWebLoginConfig$1;
        int i;
        WebLoginConfig webLoginConfig;
        int i2;
        if (continuationImpl instanceof RealUrlAuthenticator$getWebLoginConfig$1) {
            realUrlAuthenticator$getWebLoginConfig$1 = (RealUrlAuthenticator$getWebLoginConfig$1) continuationImpl;
            int i3 = realUrlAuthenticator$getWebLoginConfig$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realUrlAuthenticator$getWebLoginConfig$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realUrlAuthenticator$getWebLoginConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUrlAuthenticator$getWebLoginConfig$1.label;
                AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = this.webLoginConfigSource;
                int i4 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realUrlAuthenticator$getWebLoginConfig$1.label = 1;
                    obj = FlowKt.firstOrNull(appLockMonitor$special$$inlined$map$2, realUrlAuthenticator$getWebLoginConfig$1);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return (WebLoginConfig) obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = realUrlAuthenticator$getWebLoginConfig$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                    realUrlAuthenticator$getWebLoginConfig$1.I$0 = i2;
                    realUrlAuthenticator$getWebLoginConfig$1.label = 3;
                    obj = FlowKt.firstOrNull(appLockMonitor$special$$inlined$map$2, realUrlAuthenticator$getWebLoginConfig$1);
                }
                webLoginConfig = (WebLoginConfig) obj;
                if (webLoginConfig != null) {
                    return null;
                }
                Long l = webLoginConfig.expires_at;
                if (l == null || this.clock.millis() <= l.longValue()) {
                    return webLoginConfig;
                }
                realUrlAuthenticator$getWebLoginConfig$1.I$0 = 0;
                realUrlAuthenticator$getWebLoginConfig$1.label = 2;
                RealAppConfigManager realAppConfigManager = (RealAppConfigManager) this.appConfig;
                Object withContext = JobKt.withContext(realAppConfigManager.ioDispatcher, new RealAppConfigManager$update$2$1(realAppConfigManager, continuation, i4), realUrlAuthenticator$getWebLoginConfig$1);
                if (withContext != coroutineSingletons) {
                    withContext = Unit.INSTANCE;
                }
                if (withContext != coroutineSingletons) {
                    i2 = 0;
                    realUrlAuthenticator$getWebLoginConfig$1.I$0 = i2;
                    realUrlAuthenticator$getWebLoginConfig$1.label = 3;
                    obj = FlowKt.firstOrNull(appLockMonitor$special$$inlined$map$2, realUrlAuthenticator$getWebLoginConfig$1);
                }
                return coroutineSingletons;
            }
        }
        realUrlAuthenticator$getWebLoginConfig$1 = new RealUrlAuthenticator$getWebLoginConfig$1(this, continuationImpl);
        Object obj2 = realUrlAuthenticator$getWebLoginConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUrlAuthenticator$getWebLoginConfig$1.label;
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22 = this.webLoginConfigSource;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        webLoginConfig = (WebLoginConfig) obj2;
        if (webLoginConfig != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object token(ContinuationImpl continuationImpl) {
        RealUrlAuthenticator$token$1 realUrlAuthenticator$token$1;
        int i;
        String str;
        if (continuationImpl instanceof RealUrlAuthenticator$token$1) {
            realUrlAuthenticator$token$1 = (RealUrlAuthenticator$token$1) continuationImpl;
            int i2 = realUrlAuthenticator$token$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realUrlAuthenticator$token$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realUrlAuthenticator$token$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realUrlAuthenticator$token$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realUrlAuthenticator$token$1.label = 1;
                    obj = getWebLoginConfig(realUrlAuthenticator$token$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                WebLoginConfig webLoginConfig = (WebLoginConfig) obj;
                str = webLoginConfig == null ? webLoginConfig.token : null;
                if (str == null) {
                    return str;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Web login config token is null. Check if `token` is called before appConfig is ready.");
                return null;
            }
        }
        realUrlAuthenticator$token$1 = new RealUrlAuthenticator$token$1(this, continuationImpl);
        Object obj3 = realUrlAuthenticator$token$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realUrlAuthenticator$token$1.label;
        if (i != 0) {
        }
        WebLoginConfig webLoginConfig2 = (WebLoginConfig) obj3;
        if (webLoginConfig2 == null) {
        }
        if (str == null) {
        }
    }
}
