package androidx.wear.remote.interactions;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteInteractionsUtil.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/wear/remote/interactions/RemoteInteractionsUtil;", "", "<init>", "()V", "SYSTEM_FEATURE_WATCH", "", "isCurrentDeviceAWatch", "", "context", "Landroid/content/Context;", "isCurrentDeviceAWatch$wear_remote_interactions", "logDOrNotUser", "", "tag", "message", "logDOrNotUser$wear_remote_interactions", "Api24Impl", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RemoteInteractionsUtil {
    public static final RemoteInteractionsUtil INSTANCE = new RemoteInteractionsUtil();
    public static final String SYSTEM_FEATURE_WATCH = "android.hardware.type.watch";

    private RemoteInteractionsUtil() {
    }

    public final boolean isCurrentDeviceAWatch$wear_remote_interactions(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Api24Impl.hasSystemFeature(context);
    }

    /* compiled from: RemoteInteractionsUtil.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/wear/remote/interactions/RemoteInteractionsUtil$Api24Impl;", "", "<init>", "()V", "hasSystemFeature", "", "context", "Landroid/content/Context;", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final boolean hasSystemFeature(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().hasSystemFeature(RemoteInteractionsUtil.SYSTEM_FEATURE_WATCH);
        }
    }

    public final void logDOrNotUser$wear_remote_interactions(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (Log.isLoggable(tag, 3) || !Build.TYPE.equals("user")) {
            Log.d(tag, message);
        }
    }
}
