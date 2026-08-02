package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.bugsnag.android.Client;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes.dex */
public final class Rpc {
    public static int zza;
    public static PendingIntent zzb;
    public static final Pattern zzd = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final SimpleArrayMap zze = new SimpleArrayMap(0);
    public final Context zzf;
    public final Huffman.Node zzg;
    public final ScheduledThreadPoolExecutor zzh;
    public final Messenger zzi;
    public Messenger zzj;
    public zzd zzk;

    public Rpc(Context context) {
        this.zzf = context;
        Huffman.Node node = new Huffman.Node();
        node.terminalBitCount = 0;
        node.children = context;
        this.zzg = node;
        this.zzi = new Messenger(new zzae(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzh = scheduledThreadPoolExecutor;
    }

    public final zzw zze(Bundle bundle) {
        String num;
        synchronized (Rpc.class) {
            int i = zza;
            zza = i + 1;
            num = Integer.toString(i);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.zze) {
            this.zze.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.zzg.zzb() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.zzf;
        synchronized (Rpc.class) {
            try {
                if (zzb == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    zzb = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
                }
                intent.putExtra("app", zzb);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.zzi);
        if (this.zzj != null || this.zzk != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.zzj;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.zzk.zzb(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.zza.addOnCompleteListener(zzy.zza, new SVG(this, num, this.zzh.schedule(new Client.AnonymousClass7(taskCompletionSource, 21), 30L, TimeUnit.SECONDS), false, 28));
            return taskCompletionSource.zza;
        }
        int zzb2 = this.zzg.zzb();
        Context context2 = this.zzf;
        if (zzb2 == 2) {
            context2.sendBroadcast(intent);
        } else {
            context2.startService(intent);
        }
        taskCompletionSource.zza.addOnCompleteListener(zzy.zza, new SVG(this, num, this.zzh.schedule(new Client.AnonymousClass7(taskCompletionSource, 21), 30L, TimeUnit.SECONDS), false, 28));
        return taskCompletionSource.zza;
    }

    public final void zzh(Bundle bundle, String str) {
        synchronized (this.zze) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zze.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
