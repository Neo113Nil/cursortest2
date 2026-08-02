package com.braze.ui.actions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.t7$$ExternalSyntheticLambda4;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.appsflyer.AppsFlyerProperties;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.c$$ExternalSyntheticLambda2;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import com.braze.ui.support.UriUtils$$ExternalSyntheticLambda2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0012J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\u0019\u0010\u0018J7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/braze/ui/actions/UriAction;", "Lcom/braze/ui/actions/IAction;", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "extras", "", "useWebView", "Lcom/braze/enums/Channel;", AppsFlyerProperties.CHANNEL, "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/braze/enums/Channel;)V", "Landroid/content/Context;", "context", "", "execute", "(Landroid/content/Context;)V", "openUriWithWebViewActivity", "(Landroid/content/Context;Landroid/net/Uri;Landroid/os/Bundle;)V", "openUriWithActionView", "openUriWithWebViewActivityFromPush", "openUriWithActionViewFromPush", "Landroid/content/Intent;", "getWebViewActivityIntent", "(Landroid/content/Context;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/Intent;", "getActionViewIntent", "targetIntent", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getIntentArrayWithConfiguredBackStack", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;Lcom/braze/configuration/BrazeConfigurationProvider;)[Landroid/content/Intent;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Lcom/braze/enums/Channel;", "getChannel", "()Lcom/braze/enums/Channel;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "Z", "getUseWebView", "()Z", "setUseWebView", "(Z)V", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class UriAction implements IAction {
    private final Channel channel;
    private final Bundle extras;
    private Uri uri;
    private boolean useWebView;

    public UriAction(Uri uri, Bundle bundle, boolean z, Channel channel) {
        uri.getClass();
        channel.getClass();
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z;
        this.channel = channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(UriAction uriAction) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(uriAction.uri, "Not executing local Uri: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1(UriAction uriAction) {
        return "Executing BrazeActions uri:\n'" + uriAction.uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(UriAction uriAction) {
        return "Executing Uri action from channel " + uriAction.channel + ": " + uriAction.uri + ". UseWebView: " + uriAction.useWebView + ". Extras: " + uriAction.extras;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionViewIntent$lambda$0(ResolveInfo resolveInfo) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Setting deep link intent package to ", resolveInfo.activityInfo.packageName, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$0() {
        return "Adding main activity intent to back stack while opening uri from push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Adding custom back stack activity while opening uri from push: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Not adding unregistered activity to the back stack while opening uri from push: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$4() {
        return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWebViewActivityIntent$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Launching custom WebView Activity with class name: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionView$lambda$0(Uri uri, Bundle bundle) {
        return "Failed to handle uri " + uri + " with extras: " + bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionViewFromPush$lambda$0(Uri uri) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Could not find appropriate activity to open for deep link ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivity$lambda$0() {
        return "BrazeWebViewActivity not opened successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivityFromPush$lambda$0() {
        return "Braze WebView Activity not opened successfully.";
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(Context context) {
        context.getClass();
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            final int i = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0(this) { // from class: com.braze.ui.actions.UriAction$$ExternalSyntheticLambda0
                public final /* synthetic */ UriAction f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$0;
                    String execute$lambda$1;
                    String execute$lambda$2;
                    int i2 = i;
                    UriAction uriAction = this.f$0;
                    switch (i2) {
                        case 0:
                            execute$lambda$0 = UriAction.execute$lambda$0(uriAction);
                            return execute$lambda$0;
                        case 1:
                            execute$lambda$1 = UriAction.execute$lambda$1(uriAction);
                            return execute$lambda$1;
                        default:
                            execute$lambda$2 = UriAction.execute$lambda$2(uriAction);
                            return execute$lambda$2;
                    }
                }
            }, 7, (Object) null);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.INSTANCE;
        if (brazeActionParser.isBrazeActionUri(this.uri)) {
            final int i2 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0(this) { // from class: com.braze.ui.actions.UriAction$$ExternalSyntheticLambda0
                public final /* synthetic */ UriAction f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$0;
                    String execute$lambda$1;
                    String execute$lambda$2;
                    int i22 = i2;
                    UriAction uriAction = this.f$0;
                    switch (i22) {
                        case 0:
                            execute$lambda$0 = UriAction.execute$lambda$0(uriAction);
                            return execute$lambda$0;
                        case 1:
                            execute$lambda$1 = UriAction.execute$lambda$1(uriAction);
                            return execute$lambda$1;
                        default:
                            execute$lambda$2 = UriAction.execute$lambda$2(uriAction);
                            return execute$lambda$2;
                    }
                }
            }, 6, (Object) null);
            brazeActionParser.execute(context, this.uri, this.channel);
            return;
        }
        final int i3 = 2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0(this) { // from class: com.braze.ui.actions.UriAction$$ExternalSyntheticLambda0
            public final /* synthetic */ UriAction f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String execute$lambda$0;
                String execute$lambda$1;
                String execute$lambda$2;
                int i22 = i3;
                UriAction uriAction = this.f$0;
                switch (i22) {
                    case 0:
                        execute$lambda$0 = UriAction.execute$lambda$0(uriAction);
                        return execute$lambda$0;
                    case 1:
                        execute$lambda$1 = UriAction.execute$lambda$1(uriAction);
                        return execute$lambda$1;
                    default:
                        execute$lambda$2 = UriAction.execute$lambda$2(uriAction);
                        return execute$lambda$2;
                }
            }
        }, 7, (Object) null);
        if (this.useWebView && CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            Channel channel = this.channel;
            Channel channel2 = Channel.PUSH;
            Uri uri = this.uri;
            Bundle bundle = this.extras;
            if (channel == channel2) {
                openUriWithWebViewActivityFromPush(context, uri, bundle);
                return;
            } else {
                openUriWithWebViewActivity(context, uri, bundle);
                return;
            }
        }
        Channel channel3 = this.channel;
        Channel channel4 = Channel.PUSH;
        Uri uri2 = this.uri;
        Bundle bundle2 = this.extras;
        if (channel3 == channel4) {
            openUriWithActionViewFromPush(context, uri2, bundle2);
        } else {
            openUriWithActionView(context, uri2, bundle2);
        }
    }

    public final Intent getActionViewIntent(Context context, Uri uri, Bundle extras) {
        context.getClass();
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (extras != null) {
            intent.putExtras(extras);
        }
        List<ResolveInfo> queryIntentActivities = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentActivities(intent, 0);
        queryIntentActivities.getClass();
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (Intrinsics.areEqual(next.activityInfo.packageName, context.getPackageName())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yf$$ExternalSyntheticLambda2(next, 8), 7, (Object) null);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    public final Intent[] getIntentArrayWithConfiguredBackStack(Context context, Bundle extras, Intent targetIntent, BrazeConfigurationProvider configurationProvider) {
        context.getClass();
        targetIntent.getClass();
        configurationProvider.getClass();
        Intent intent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName == null || StringsKt.isBlank(pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(19), 6, (Object) null);
                intent = UriUtils.getMainActivityIntent(context, extras);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(pushDeepLinkBackStackActivityClassName, 14), 6, (Object) null);
                if (extras != null) {
                    intent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(extras);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(pushDeepLinkBackStackActivityClassName, 15), 6, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(16), 6, (Object) null);
        }
        if (intent != null) {
            return new Intent[]{intent, targetIntent};
        }
        targetIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
        return new Intent[]{targetIntent};
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final Intent getWebViewActivityIntent(Context context, Uri uri, Bundle extras) {
        Intent intent;
        context.getClass();
        uri.getClass();
        String customHtmlWebViewActivityClassName = BrazeInternal.INSTANCE.getConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName == null || StringsKt.isBlank(customHtmlWebViewActivityClassName) || !UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(customHtmlWebViewActivityClassName, 16), 7, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            intent.getClass();
        }
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("url", uri.toString());
        return intent;
    }

    public void openUriWithActionView(Context context, Uri uri, Bundle extras) {
        context.getClass();
        uri.getClass();
        Intent actionViewIntent = getActionViewIntent(context, uri, extras);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new t7$$ExternalSyntheticLambda4(19, uri, extras), 4, (Object) null);
        }
    }

    public void openUriWithActionViewFromPush(Context context, Uri uri, Bundle extras) {
        context.getClass();
        uri.getClass();
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getActionViewIntent(context, uri, extras), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (ActivityNotFoundException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new UriAction$$ExternalSyntheticLambda4(uri, 0), 4, (Object) null);
        }
    }

    public void openUriWithWebViewActivity(Context context, Uri uri, Bundle extras) {
        context.getClass();
        uri.getClass();
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, extras);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new c$$ExternalSyntheticLambda2(17), 4, (Object) null);
        }
    }

    public void openUriWithWebViewActivityFromPush(Context context, Uri uri, Bundle extras) {
        context.getClass();
        uri.getClass();
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getWebViewActivityIntent(context, uri, extras), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new c$$ExternalSyntheticLambda2(18), 4, (Object) null);
        }
    }
}
