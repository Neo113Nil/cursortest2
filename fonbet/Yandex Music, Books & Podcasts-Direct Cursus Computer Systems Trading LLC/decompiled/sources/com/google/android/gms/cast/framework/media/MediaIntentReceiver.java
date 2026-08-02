package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import defpackage.f2x;
import defpackage.jmp;
import defpackage.msg;
import defpackage.n2x;
import defpackage.nkp;
import defpackage.o64;
import defpackage.p84;
import defpackage.rrh;
import defpackage.xun;
import defpackage.y1g;
import defpackage.y4x;
import defpackage.z0x;

@Keep
/* loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {

    @NonNull
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";

    @NonNull
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";

    @NonNull
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";

    @NonNull
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";

    @NonNull
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";

    @NonNull
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";

    @NonNull
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";

    @NonNull
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final msg log = new msg(TAG, null);

    private static xun getRemoteMediaClient(p84 p84Var) {
        if (p84Var == null) {
            return null;
        }
        y1g.B("Must be called from the main thread.");
        n2x n2xVar = p84Var.a;
        boolean z = false;
        if (n2xVar != null) {
            try {
                f2x f2xVar = (f2x) n2xVar;
                Parcel N0 = f2xVar.N0(f2xVar.M0(), 5);
                int i = y4x.a;
                boolean z2 = N0.readInt() != 0;
                N0.recycle();
                z = z2;
            } catch (RemoteException e) {
                nkp.b.a(e, "Unable to call %s on %s.", "isConnected", n2x.class.getSimpleName());
            }
        }
        if (!z) {
            return null;
        }
        y1g.B("Must be called from the main thread.");
        return p84Var.j;
    }

    private void seek(p84 p84Var, long j) {
        xun remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(p84Var)) == null || remoteMediaClient.j() || remoteMediaClient.n()) {
            return;
        }
        remoteMediaClient.q(new rrh(remoteMediaClient.a() + j));
    }

    private void togglePlayback(p84 p84Var) {
        xun remoteMediaClient = getRemoteMediaClient(p84Var);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.r();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        String action = intent.getAction();
        log.b("onReceive action: %s", action);
        if (action == null) {
            return;
        }
        o64 a = o64.a(context);
        a.getClass();
        y1g.B("Must be called from the main thread.");
        jmp jmpVar = a.b;
        nkp c = jmpVar.c();
        if (c != null) {
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals(ACTION_REWIND)) {
                        onReceiveActionRewind(c, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                        return;
                    }
                    break;
                case -945151566:
                    if (action.equals(ACTION_SKIP_NEXT)) {
                        onReceiveActionSkipNext(c);
                        return;
                    }
                    break;
                case -945080078:
                    if (action.equals(ACTION_SKIP_PREV)) {
                        onReceiveActionSkipPrev(c);
                        return;
                    }
                    break;
                case -668151673:
                    if (action.equals(ACTION_STOP_CASTING)) {
                        jmpVar.b(true);
                        return;
                    }
                    break;
                case -124479363:
                    if (action.equals(ACTION_DISCONNECT)) {
                        jmpVar.b(false);
                        return;
                    }
                    break;
                case 235550565:
                    if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                        onReceiveActionTogglePlayback(c);
                        return;
                    }
                    break;
                case 1362116196:
                    if (action.equals(ACTION_FORWARD)) {
                        onReceiveActionForward(c, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                        return;
                    }
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        onReceiveActionMediaButton(c, intent);
                        return;
                    }
                    break;
            }
            onReceiveOtherAction(context, action, intent);
        }
    }

    public void onReceiveActionForward(@NonNull nkp nkpVar, long j) {
        if (nkpVar instanceof p84) {
            seek((p84) nkpVar, j);
        }
    }

    public void onReceiveActionMediaButton(@NonNull nkp nkpVar, @NonNull Intent intent) {
        if ((nkpVar instanceof p84) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            y1g.G(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((p84) nkpVar);
            }
        }
    }

    public void onReceiveActionRewind(@NonNull nkp nkpVar, long j) {
        if (nkpVar instanceof p84) {
            seek((p84) nkpVar, -j);
        }
    }

    public void onReceiveActionSkipNext(@NonNull nkp nkpVar) {
        xun remoteMediaClient;
        if (!(nkpVar instanceof p84) || (remoteMediaClient = getRemoteMediaClient((p84) nkpVar)) == null || remoteMediaClient.n()) {
            return;
        }
        y1g.B("Must be called from the main thread.");
        if (remoteMediaClient.y()) {
            xun.z(new z0x(remoteMediaClient, 1));
        } else {
            xun.t();
        }
    }

    public void onReceiveActionSkipPrev(@NonNull nkp nkpVar) {
        xun remoteMediaClient;
        if (!(nkpVar instanceof p84) || (remoteMediaClient = getRemoteMediaClient((p84) nkpVar)) == null || remoteMediaClient.n()) {
            return;
        }
        y1g.B("Must be called from the main thread.");
        if (remoteMediaClient.y()) {
            xun.z(new z0x(remoteMediaClient, 0));
        } else {
            xun.t();
        }
    }

    public void onReceiveActionTogglePlayback(@NonNull nkp nkpVar) {
        if (nkpVar instanceof p84) {
            togglePlayback((p84) nkpVar);
        }
    }

    @Deprecated
    public void onReceiveOtherAction(@NonNull String str, @NonNull Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public void onReceiveOtherAction(Context context, @NonNull String str, @NonNull Intent intent) {
    }
}
