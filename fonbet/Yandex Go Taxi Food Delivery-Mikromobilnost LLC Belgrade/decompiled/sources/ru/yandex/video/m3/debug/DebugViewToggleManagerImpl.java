package ru.yandex.video.m3.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.ljo;
import defpackage.n4u0;
import defpackage.pz40;
import defpackage.qke;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/debug/DebugViewToggleManagerImpl;", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "", "enableDebugViewInListSdkFlag", "enableBroadcastReceiverForDebugViewInListSDK", "Landroid/content/Context;", "applicationContext", "<init>", "(ZZLandroid/content/Context;)V", "Lzy11;", "registerBroadcastReceiver", "(Landroid/content/Context;)V", "isEnabled", "enableDebugView", "(Z)V", "Lpz40;", "_isDebugViewEnabled", "Lpz40;", "Ln4u0;", "isDebugViewEnabled", "Ln4u0;", "()Ln4u0;", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "Companion", "DebugViewToggleManagerBroadCastReceiver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugViewToggleManagerImpl implements DebugViewToggleManager {
    private static final String INTENT_ACTION = "updateListSdkDebugViewVisibilityFlag";
    private static final String LIST_SDK_DEBUG_VIEW_VISIBILITY_FLAG = "listSdkDebugViewVisibilityFlag";
    private static final String TAG = "DebugViewToggleManager";
    private static volatile DebugViewToggleManagerImpl instance;
    private pz40 _isDebugViewEnabled;
    private BroadcastReceiver broadcastReceiver;
    private final n4u0 isDebugViewEnabled;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/debug/DebugViewToggleManagerImpl$DebugViewToggleManagerBroadCastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lru/yandex/video/m3/debug/DebugViewToggleManagerImpl;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DebugViewToggleManagerBroadCastReceiver extends BroadcastReceiver {
        public DebugViewToggleManagerBroadCastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                DebugViewToggleManagerImpl debugViewToggleManagerImpl = DebugViewToggleManagerImpl.this;
                if (jl40.l(intent.getAction(), DebugViewToggleManagerImpl.INTENT_ACTION)) {
                    boolean booleanExtra = intent.getBooleanExtra(DebugViewToggleManagerImpl.LIST_SDK_DEBUG_VIEW_VISIBILITY_FLAG, ((Boolean) ((r0) debugViewToggleManagerImpl._isDebugViewEnabled).getValue()).booleanValue());
                    pz40 pz40Var = debugViewToggleManagerImpl._isDebugViewEnabled;
                    Boolean valueOf = Boolean.valueOf(booleanExtra);
                    r0 r0Var = (r0) pz40Var;
                    r0Var.getClass();
                    r0Var.m(null, valueOf);
                }
            }
        }
    }

    private DebugViewToggleManagerImpl(boolean z, boolean z2, Context context) {
        r0 c = bvf0.c(Boolean.valueOf(z));
        this._isDebugViewEnabled = c;
        this.isDebugViewEnabled = e.d(c);
        if (z2) {
            registerBroadcastReceiver(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerBroadcastReceiver(Context applicationContext) {
        Object failure;
        this.broadcastReceiver = new DebugViewToggleManagerBroadCastReceiver();
        try {
            failure = qke.z(applicationContext, this.broadcastReceiver, new IntentFilter(INTENT_ACTION), 2);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Log.e(TAG, "[init] while registerReceiver failure has occurred: ".concat(ljo.b(a)));
        }
    }

    @Override // ru.yandex.video.m3.debug.DebugViewToggleManager
    public void enableDebugView(boolean isEnabled) {
        pz40 pz40Var = this._isDebugViewEnabled;
        Boolean valueOf = Boolean.valueOf(isEnabled);
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, valueOf);
    }

    @Override // ru.yandex.video.m3.debug.DebugViewToggleManager
    /* renamed from: isDebugViewEnabled, reason: from getter */
    public n4u0 getIsDebugViewEnabled() {
        return this.isDebugViewEnabled;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0011\u0010\u0010\u001a\u00020\f*\u00020\nH\u0000¢\u0006\u0002\b\u0011J\u0011\u0010\u0012\u001a\u00020\f*\u00020\nH\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/debug/DebugViewToggleManagerImpl$Companion;", "", "()V", "INTENT_ACTION", "", "LIST_SDK_DEBUG_VIEW_VISIBILITY_FLAG", "TAG", "instance", "Lru/yandex/video/m3/debug/DebugViewToggleManagerImpl;", "getInstance", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "enableDebugViewInListSdkFlag", "", "enableBroadcastReceiverForDebugViewInListSDK", "applicationContext", "Landroid/content/Context;", "isEnabled", "isEnabled$video_player_internalRelease", "isNotEnabled", "isNotEnabled$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DebugViewToggleManager getInstance(boolean enableDebugViewInListSdkFlag, boolean enableBroadcastReceiverForDebugViewInListSDK, Context applicationContext) {
            DebugViewToggleManagerImpl debugViewToggleManagerImpl;
            DebugViewToggleManagerImpl debugViewToggleManagerImpl2 = DebugViewToggleManagerImpl.instance;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (debugViewToggleManagerImpl2 == null) {
                synchronized (this) {
                    debugViewToggleManagerImpl = DebugViewToggleManagerImpl.instance;
                    if (debugViewToggleManagerImpl == null) {
                        debugViewToggleManagerImpl = new DebugViewToggleManagerImpl(enableDebugViewInListSdkFlag, enableBroadcastReceiverForDebugViewInListSDK, applicationContext, defaultConstructorMarker);
                        DebugViewToggleManagerImpl.instance = debugViewToggleManagerImpl;
                    }
                }
                return debugViewToggleManagerImpl;
            }
            pz40 pz40Var = debugViewToggleManagerImpl2._isDebugViewEnabled;
            Boolean valueOf = Boolean.valueOf(enableDebugViewInListSdkFlag);
            r0 r0Var = (r0) pz40Var;
            r0Var.getClass();
            r0Var.m(null, valueOf);
            if (enableBroadcastReceiverForDebugViewInListSDK) {
                debugViewToggleManagerImpl2.registerBroadcastReceiver(applicationContext);
            }
            return debugViewToggleManagerImpl2;
        }

        public final boolean isEnabled$video_player_internalRelease(DebugViewToggleManager debugViewToggleManager) {
            return ((Boolean) debugViewToggleManager.getIsDebugViewEnabled().getValue()).booleanValue();
        }

        public final boolean isNotEnabled$video_player_internalRelease(DebugViewToggleManager debugViewToggleManager) {
            return !isEnabled$video_player_internalRelease(debugViewToggleManager);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DebugViewToggleManagerImpl(boolean z, boolean z2, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, context);
    }
}
