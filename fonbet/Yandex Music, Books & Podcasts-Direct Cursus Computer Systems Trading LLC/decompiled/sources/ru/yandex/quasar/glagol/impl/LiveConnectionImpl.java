package ru.yandex.quasar.glagol.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.gj6;
import defpackage.h08;
import defpackage.hj6;
import defpackage.i08;
import defpackage.mdg;
import defpackage.mdk;
import defpackage.shd;
import defpackage.t3o;
import defpackage.tzh;
import defpackage.u3o;
import defpackage.v68;
import defpackage.weo;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.quasar.glagol.DeviceConnectionListener$State;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002EFB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u00060=R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lru/yandex/quasar/glagol/impl/LiveConnectionImpl;", "Lmdg;", "Li08;", "deviceId", "Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ReconnectionDelegate;", "reconnectionDelegate", "<init>", "(Li08;Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ReconnectionDelegate;)V", "", "close", "()V", "Lv68;", "getDiscoveredDevice", "()Lv68;", "Lmdk;", "payload", "", "send", "(Lmdk;)Ljava/lang/String;", "Lt3o;", "callback", "(Lmdk;Lt3o;)Ljava/lang/String;", "", "timeOut", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lu3o;", "sendSync", "(Lmdk;JLjava/util/concurrent/TimeUnit;)Lu3o;", "Ltzh;", "listener", "addListener", "(Ltzh;)V", "removeListener", "", "getSupportedFeatures", "()Ljava/util/List;", "Lhj6;", "conversation", "replaceConversation$glagol_sdk_release", "(Lhj6;)V", "replaceConversation", "toString", "()Ljava/lang/String;", "Li08;", "getDeviceId", "()Li08;", "Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ReconnectionDelegate;", "getReconnectionDelegate", "()Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ReconnectionDelegate;", "discoveredDevice", "Lv68;", "activeConversation", "Lhj6;", "pendingPayload", "Lmdk;", "pendingCallback", "Lt3o;", "", "messageListeners", "Ljava/util/Set;", "Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ConnectionListenerImpl;", "connectionListener", "Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ConnectionListenerImpl;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "terminatedStatus", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TAG", "Ljava/lang/String;", "ConnectionListenerImpl", "ReconnectionDelegate", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class LiveConnectionImpl implements mdg {

    @NotNull
    private final String TAG;
    private hj6 activeConversation;

    @NotNull
    private final ConnectionListenerImpl connectionListener;

    @NotNull
    private final i08 deviceId;
    private v68 discoveredDevice;

    @NotNull
    private final Set<tzh> messageListeners;
    private t3o pendingCallback;
    private mdk pendingPayload;

    @NotNull
    private final ReconnectionDelegate reconnectionDelegate;

    @NotNull
    private final AtomicBoolean terminatedStatus;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ConnectionListenerImpl;", "Lh08;", "<init>", "(Lru/yandex/quasar/glagol/impl/LiveConnectionImpl;)V", "Li08;", "deviceId", "Lgj6;", "conversation", "Lru/yandex/quasar/glagol/DeviceConnectionListener$State;", "state", "", "onConnectionStateChanged", "(Li08;Lgj6;Lru/yandex/quasar/glagol/DeviceConnectionListener$State;)V", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public final class ConnectionListenerImpl implements h08 {
        public ConnectionListenerImpl() {
        }

        @Override // defpackage.h08
        public void onConnectionStateChanged(@NotNull i08 deviceId, @NotNull gj6 conversation, @NotNull DeviceConnectionListener$State state) {
            deviceId.getClass();
            conversation.getClass();
            state.getClass();
            weo.p(LiveConnectionImpl.this.TAG, "Changed conversation state=" + state, new Object[0]);
            if (state == DeviceConnectionListener$State.CLOSED && Intrinsics.d(conversation, LiveConnectionImpl.this.activeConversation) && !LiveConnectionImpl.this.terminatedStatus.get()) {
                LiveConnectionImpl.this.getReconnectionDelegate().requestReconnect();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/yandex/quasar/glagol/impl/LiveConnectionImpl$ReconnectionDelegate;", "", "requestReconnect", "", "glagol-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public interface ReconnectionDelegate {
        void requestReconnect();
    }

    public LiveConnectionImpl(@NotNull i08 i08Var, @NotNull ReconnectionDelegate reconnectionDelegate) {
        i08Var.getClass();
        reconnectionDelegate.getClass();
        this.deviceId = i08Var;
        this.reconnectionDelegate = reconnectionDelegate;
        this.messageListeners = new LinkedHashSet();
        this.connectionListener = new ConnectionListenerImpl();
        this.terminatedStatus = new AtomicBoolean(false);
        this.TAG = "LiveConn:" + getDeviceId();
    }

    @Override // defpackage.gj6
    public synchronized void addListener(@NotNull tzh listener) {
        listener.getClass();
        this.messageListeners.add(listener);
        hj6 hj6Var = this.activeConversation;
        if (hj6Var != null) {
            hj6Var.addListener(listener);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        weo.p(this.TAG, "Explicitly terminate connection.", new Object[0]);
        this.terminatedStatus.set(true);
        this.messageListeners.clear();
        hj6 hj6Var = this.activeConversation;
        if (hj6Var != null) {
            hj6Var.close();
        }
        this.activeConversation = null;
        this.pendingCallback = null;
        this.pendingPayload = null;
    }

    @Override // defpackage.mdg
    @NotNull
    public i08 getDeviceId() {
        return this.deviceId;
    }

    @Override // defpackage.gj6
    @NotNull
    public synchronized v68 getDiscoveredDevice() {
        v68 v68Var;
        v68Var = this.discoveredDevice;
        if (v68Var == null) {
            v68Var = DiscoveryResultFactory.toDiscoveryResultItemDummy(getDeviceId());
            v68Var.getClass();
        }
        return v68Var;
    }

    @NotNull
    public final ReconnectionDelegate getReconnectionDelegate() {
        return this.reconnectionDelegate;
    }

    @Override // defpackage.gj6
    public synchronized List<String> getSupportedFeatures() {
        hj6 hj6Var;
        hj6Var = this.activeConversation;
        return hj6Var != null ? hj6Var.getSupportedFeatures() : null;
    }

    @Override // defpackage.gj6
    public synchronized void removeListener(@NotNull tzh listener) {
        listener.getClass();
        this.messageListeners.remove(listener);
        hj6 hj6Var = this.activeConversation;
        if (hj6Var != null) {
            hj6Var.removeListener(listener);
        }
    }

    public final synchronized void replaceConversation$glagol_sdk_release(@NotNull hj6 conversation) {
        try {
            conversation.getClass();
            if (this.terminatedStatus.get()) {
                conversation.close();
            } else {
                weo.p(this.TAG, "Replace conversation " + this.activeConversation + " -> " + conversation, new Object[0]);
                hj6 hj6Var = this.activeConversation;
                if (hj6Var != null) {
                    hj6Var.removeConnectionListener(this.connectionListener);
                }
                conversation.addConnectionListener(this.connectionListener);
                this.activeConversation = conversation;
                this.discoveredDevice = conversation.getDiscoveredDevice();
                for (tzh tzhVar : this.messageListeners) {
                    if (hj6Var != null) {
                        hj6Var.removeListener(tzhVar);
                    }
                    hj6 hj6Var2 = this.activeConversation;
                    if (hj6Var2 != null) {
                        hj6Var2.addListener(tzhVar);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gj6
    @NotNull
    public synchronized String send(@NotNull mdk payload, t3o callback) {
        try {
            payload.getClass();
            hj6 hj6Var = this.activeConversation;
            String send = hj6Var != null ? hj6Var.send(payload, callback) : null;
            if (send != null) {
                return send;
            }
            this.pendingPayload = payload;
            this.pendingCallback = callback;
            return "";
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.gj6
    @NotNull
    public u3o sendSync(@NotNull mdk payload, long timeOut, @NotNull TimeUnit timeUnit) {
        payload.getClass();
        timeUnit.getClass();
        hj6 hj6Var = this.activeConversation;
        u3o sendSync = hj6Var != null ? hj6Var.sendSync(payload, timeOut, timeUnit) : null;
        if (sendSync != null) {
            return sendSync;
        }
        throw new shd("Conversation inactive");
    }

    @NotNull
    public String toString() {
        v68 discoveredDevice;
        i08 deviceId = getDeviceId();
        hj6 hj6Var = this.activeConversation;
        return "Device=" + deviceId + ". Url=" + ((hj6Var == null || (discoveredDevice = hj6Var.getDiscoveredDevice()) == null) ? null : discoveredDevice.getURI());
    }

    @NotNull
    public synchronized String send(@NotNull mdk payload) {
        payload.getClass();
        return send(payload, null);
    }
}
