package io.appmetrica.analytics.push.coreutils.internal;

import android.content.Context;
import android.os.Bundle;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.push.coreutils.internal.commands.Commands;
import io.appmetrica.analytics.push.coreutils.internal.commands.PushTokenCommandInfo;
import io.appmetrica.analytics.push.coreutils.internal.commands.SystemInfoCommandInfo;
import io.appmetrica.analytics.push.coreutils.internal.model.ServiceType;
import io.appmetrica.analytics.push.coreutils.internal.model.TransportPushMessage;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\rJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/PushServiceFacade;", "", "Landroid/content/Context;", "context", "Lzy11;", "initPushService", "(Landroid/content/Context;)V", "", "provider", "initToken", "(Landroid/content/Context;Ljava/lang/String;)V", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "sendToken", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "sendTokenOnRefresh", "sendTokenManually", "Landroid/os/Bundle;", Constants.KEY_DATA, "transport", "processPush", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;)V", "", "statusChangeTime", "sendSystemInfo", "(Landroid/content/Context;Ljava/lang/Long;)V", "Lio/appmetrica/analytics/push/coreutils/internal/CommandServiceWrapper;", "commandServiceWrapper", "setJobIntentServiceWrapper", "(Lio/appmetrica/analytics/push/coreutils/internal/CommandServiceWrapper;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes9.dex */
public final class PushServiceFacade {
    public static final PushServiceFacade INSTANCE = new PushServiceFacade();
    private static CommandServiceWrapper a = new CommandServiceWrapper();

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceType.values().length];
            iArr[ServiceType.PROVIDER_SERVICE.ordinal()] = 1;
            iArr[ServiceType.APPMETRICA_PUSH_SERVICE.ordinal()] = 2;
            iArr[ServiceType.UNKNOWN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PushServiceFacade() {
    }

    public static final void initPushService(Context context) {
        Bundle bundle = new Bundle();
        INSTANCE.getClass();
        bundle.putString(Commands.EXTRA_COMMAND, Commands.InitPushService.COMMAND_ACTION);
        bundle.putLong(Commands.EXTRA_COMMAND_RECEIVED_TIME, System.currentTimeMillis());
        CommandServiceWrapper.startCommand$default(a, context, bundle, false, 4, null);
    }

    public static final void initToken(Context context, String provider) {
        Bundle bundle = new Bundle();
        INSTANCE.getClass();
        bundle.putString(Commands.EXTRA_COMMAND, Commands.SendPushToken.INIT_PUSH_TOKEN_COMMAND_ACTION);
        bundle.putLong(Commands.EXTRA_COMMAND_RECEIVED_TIME, System.currentTimeMillis());
        bundle.putBundle("io.appmetrica.analytics.push.extra.EXTRA_INFO", new PushTokenCommandInfo.Builder(provider).build().toBundle());
        CommandServiceWrapper.startCommand$default(a, context, bundle, false, 4, null);
    }

    public static final void processPush(Context context, Bundle data, String transport) {
        Bundle bundle = new Bundle();
        INSTANCE.getClass();
        bundle.putString(Commands.EXTRA_COMMAND, Commands.ProcessPush.COMMAND_ACTION);
        bundle.putLong(Commands.EXTRA_COMMAND_RECEIVED_TIME, System.currentTimeMillis());
        bundle.putAll(data);
        bundle.putString(CoreConstants.EXTRA_TRANSPORT, transport);
        TransportPushMessage transportPushMessage = new TransportPushMessage(bundle);
        Long processingMinTime = transportPushMessage.getProcessingMinTime();
        if (processingMinTime != null) {
            bundle.putLong(CoreConstants.MIN_PROCESSING_DELAY, processingMinTime.longValue());
        }
        if (transportPushMessage.getIsOwnPush()) {
            a.startCommand(context, bundle, WhenMappings.$EnumSwitchMapping$0[transportPushMessage.getServiceType().ordinal()] != 1);
        }
    }

    public static final void sendSystemInfo(Context context, Long statusChangeTime) {
        Bundle bundle = new Bundle();
        INSTANCE.getClass();
        bundle.putString(Commands.EXTRA_COMMAND, Commands.UpdateSystemInfo.COMMAND_ACTION);
        bundle.putLong(Commands.EXTRA_COMMAND_RECEIVED_TIME, System.currentTimeMillis());
        bundle.putBundle("io.appmetrica.analytics.push.extra.EXTRA_INFO", new SystemInfoCommandInfo.Builder().withStatusChangeTime(statusChangeTime).build().toBundle());
        CommandServiceWrapper.startCommand$default(a, context, bundle, false, 4, null);
    }

    public static final void sendToken(Context context, String provider, String token) {
        Bundle bundle = new Bundle();
        INSTANCE.getClass();
        bundle.putString(Commands.EXTRA_COMMAND, Commands.SendPushToken.UPDATE_PUSH_TOKEN_COMMAND_ACTION);
        bundle.putLong(Commands.EXTRA_COMMAND_RECEIVED_TIME, System.currentTimeMillis());
        bundle.putBundle("io.appmetrica.analytics.push.extra.EXTRA_INFO", new PushTokenCommandInfo.Builder(provider).withToken(token).build().toBundle());
        a.startCommand(context, bundle, false);
    }

    public static final void sendTokenManually(Context context, String provider, String token) {
        Bundle bundle = new Bundle();
        INSTANCE.getClass();
        bundle.putString(Commands.EXTRA_COMMAND, Commands.SendPushToken.SEND_PUSH_TOKEN_MANUALLY_COMMAND_ACTION);
        bundle.putLong(Commands.EXTRA_COMMAND_RECEIVED_TIME, System.currentTimeMillis());
        bundle.putBundle("io.appmetrica.analytics.push.extra.EXTRA_INFO", new PushTokenCommandInfo.Builder(provider).withToken(token).build().toBundle());
        a.startCommand(context, bundle, false);
    }

    public static final void sendTokenOnRefresh(Context context, String provider, String token) {
        Bundle bundle = new Bundle();
        INSTANCE.getClass();
        bundle.putString(Commands.EXTRA_COMMAND, Commands.SendPushToken.SEND_PUSH_TOKEN_ON_REFRESH_COMMAND_ACTION);
        bundle.putLong(Commands.EXTRA_COMMAND_RECEIVED_TIME, System.currentTimeMillis());
        bundle.putBundle("io.appmetrica.analytics.push.extra.EXTRA_INFO", new PushTokenCommandInfo.Builder(provider).withToken(token).build().toBundle());
        a.startCommand(context, bundle, false);
    }

    public static final void setJobIntentServiceWrapper(CommandServiceWrapper commandServiceWrapper) {
        a = commandServiceWrapper;
    }
}
