package com.braze.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import bo.app.t7$$ExternalSyntheticLambda4;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/braze/support/IntentUtils;", "", "<init>", "()V", "", "getRequestCode", "()I", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "addComponentAndSendBroadcast", "(Landroid/content/Context;Landroid/content/Intent;)V", "getImmutablePendingIntentFlags", "Ljava/util/Random;", "random$delegate", "Lkotlin/Lazy;", "getRandom", "()Ljava/util/Random;", "random", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IntentUtils {
    public static final IntentUtils INSTANCE = new IntentUtils();

    /* renamed from: random$delegate, reason: from kotlin metadata */
    private static final Lazy random = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new b$$ExternalSyntheticLambda0(1));

    private IntentUtils() {
    }

    public static final void addComponentAndSendBroadcast(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        List<ResolveInfo> queryBroadcastReceivers = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryBroadcastReceivers(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryBroadcastReceivers(intent, 0);
        queryBroadcastReceivers.getClass();
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(17, componentName, intent2), 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addComponentAndSendBroadcast$lambda$0$0(ComponentName componentName, Intent intent) {
        return "Sent intent with component " + componentName + " and explicit intent " + intent;
    }

    public static final int getImmutablePendingIntentFlags() {
        return 67108864;
    }

    private final Random getRandom() {
        return (Random) random.getValue();
    }

    public static final int getRequestCode() {
        return INSTANCE.getRandom().nextInt(1073741823) + 100000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Random random_delegate$lambda$0() {
        return new Random();
    }
}
