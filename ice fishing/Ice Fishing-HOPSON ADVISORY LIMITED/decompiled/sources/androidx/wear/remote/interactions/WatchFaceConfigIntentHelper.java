package androidx.wear.remote.interactions;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchFaceConfigIntentHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/wear/remote/interactions/WatchFaceConfigIntentHelper;", "", "<init>", "()V", "Companion", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WatchFaceConfigIntentHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_PEER_ID = "android.support.wearable.watchface.extra.PEER_ID";
    private static final String EXTRA_WATCH_FACE_COMPONENT = "android.support.wearable.watchface.extra.WATCH_FACE_COMPONENT";

    @JvmStatic
    public static final String getPeerIdExtra(Intent intent) {
        return INSTANCE.getPeerIdExtra(intent);
    }

    @JvmStatic
    public static final ComponentName getWatchFaceComponentExtra(Intent intent) {
        return INSTANCE.getWatchFaceComponentExtra(intent);
    }

    @JvmStatic
    public static final Intent putPeerIdExtra(Intent intent, String str) {
        return INSTANCE.putPeerIdExtra(intent, str);
    }

    @JvmStatic
    public static final Intent putWatchFaceComponentExtra(Intent intent, ComponentName componentName) {
        return INSTANCE.putWatchFaceComponentExtra(intent, componentName);
    }

    /* compiled from: WatchFaceConfigIntentHelper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/wear/remote/interactions/WatchFaceConfigIntentHelper$Companion;", "", "<init>", "()V", "EXTRA_WATCH_FACE_COMPONENT", "", "EXTRA_PEER_ID", "getWatchFaceComponentExtra", "Landroid/content/ComponentName;", "watchFaceIntent", "Landroid/content/Intent;", "putWatchFaceComponentExtra", "componentName", "getPeerIdExtra", "putPeerIdExtra", "peerId", "wear-remote-interactions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ComponentName getWatchFaceComponentExtra(Intent watchFaceIntent) {
            Intrinsics.checkNotNullParameter(watchFaceIntent, "watchFaceIntent");
            return (ComponentName) watchFaceIntent.getParcelableExtra(WatchFaceConfigIntentHelper.EXTRA_WATCH_FACE_COMPONENT);
        }

        @JvmStatic
        public final Intent putWatchFaceComponentExtra(Intent watchFaceIntent, ComponentName componentName) {
            Intrinsics.checkNotNullParameter(watchFaceIntent, "watchFaceIntent");
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intent putExtra = watchFaceIntent.putExtra(WatchFaceConfigIntentHelper.EXTRA_WATCH_FACE_COMPONENT, componentName);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }

        @JvmStatic
        public final String getPeerIdExtra(Intent watchFaceIntent) {
            Intrinsics.checkNotNullParameter(watchFaceIntent, "watchFaceIntent");
            return watchFaceIntent.getStringExtra(WatchFaceConfigIntentHelper.EXTRA_PEER_ID);
        }

        @JvmStatic
        public final Intent putPeerIdExtra(Intent watchFaceIntent, String peerId) {
            Intrinsics.checkNotNullParameter(watchFaceIntent, "watchFaceIntent");
            Intrinsics.checkNotNullParameter(peerId, "peerId");
            Intent putExtra = watchFaceIntent.putExtra(WatchFaceConfigIntentHelper.EXTRA_PEER_ID, peerId);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    private WatchFaceConfigIntentHelper() {
    }
}
