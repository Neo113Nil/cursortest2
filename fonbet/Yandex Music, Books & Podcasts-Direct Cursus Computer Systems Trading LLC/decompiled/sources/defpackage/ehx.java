package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.f;
import androidx.core.app.f0;
import androidx.core.app.z;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ehx {
    public static final msg u = new msg("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final mfj c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final n3m i;
    public final Resources j;
    public xfx k;
    public rjp l;
    public z m;
    public z n;
    public z o;
    public z p;
    public z q;
    public z r;
    public z s;
    public z t;

    public ehx(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        msg msgVar = o64.j;
        y1g.B("Must be called from the main thread.");
        o64 o64Var = o64.l;
        y1g.G(o64Var);
        y1g.B("Must be called from the main thread.");
        k74 k74Var = o64Var.d;
        y1g.G(k74Var);
        g74 g74Var = k74Var.f;
        y1g.G(g74Var);
        mfj mfjVar = g74Var.d;
        y1g.G(mfjVar);
        this.c = mfjVar;
        g74Var.d();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), g74Var.a);
        String str = mfjVar.d;
        if (TextUtils.isEmpty(str)) {
            this.e = null;
        } else {
            this.e = new ComponentName(context.getApplicationContext(), str);
        }
        this.h = mfjVar.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(mfjVar.r);
        this.i = new n3m(context.getApplicationContext(), new sbe(1, dimensionPixelSize, dimensionPixelSize));
        if (fxf.F() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        zix.a(rgx.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final z a(String str) {
        int i;
        int i2;
        int hashCode = str.hashCode();
        long j = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        mfj mfjVar = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.r == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent.setComponent(componentName);
                        intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        msg msgVar = zmx.a;
                        int i3 = mfjVar.n;
                        if (j == 10000) {
                            i3 = mfjVar.o;
                        } else if (j == 30000) {
                            i3 = mfjVar.p;
                        }
                        int i4 = mfjVar.B;
                        if (j == 10000) {
                            i4 = mfjVar.C;
                        } else if (j == 30000) {
                            i4 = mfjVar.D;
                        }
                        this.r = new xgd(i3, resources.getString(i4), broadcast).c();
                    }
                    return this.r;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.k.f;
                    if (this.o == null) {
                        if (z) {
                            Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.o = new xgd(mfjVar.i, resources.getString(mfjVar.w), pendingIntent).c();
                    }
                    return this.o;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.k.g;
                    if (this.p == null) {
                        if (z2) {
                            Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.p = new xgd(mfjVar.j, resources.getString(mfjVar.x), pendingIntent).c();
                    }
                    return this.p;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                        intent4.setComponent(componentName);
                        this.t = new xgd(mfjVar.q, resources.getString(mfjVar.E), PendingIntent.getBroadcast(context, 0, intent4, 67108864)).c();
                    }
                    return this.t;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.s == null) {
                        Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                        intent5.setComponent(componentName);
                        this.s = new xgd(mfjVar.q, resources.getString(mfjVar.E, ""), PendingIntent.getBroadcast(context, 0, intent5, 67108864)).c();
                    }
                    return this.s;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    xfx xfxVar = this.k;
                    int i5 = xfxVar.c;
                    if (!xfxVar.b) {
                        if (this.m == null) {
                            Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                            intent6.setComponent(componentName);
                            this.m = new xgd(mfjVar.h, resources.getString(mfjVar.v), PendingIntent.getBroadcast(context, 0, intent6, 67108864)).c();
                        }
                        return this.m;
                    }
                    if (this.n == null) {
                        if (i5 == 2) {
                            i = mfjVar.f;
                            i2 = mfjVar.t;
                        } else {
                            i = mfjVar.g;
                            i2 = mfjVar.u;
                        }
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(componentName);
                        this.n = new xgd(i, resources.getString(i2), PendingIntent.getBroadcast(context, 0, intent7, 67108864)).c();
                    }
                    return this.n;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.q == null) {
                        Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                        intent8.setComponent(componentName);
                        intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        msg msgVar2 = zmx.a;
                        int i6 = mfjVar.k;
                        if (j == 10000) {
                            i6 = mfjVar.l;
                        } else if (j == 30000) {
                            i6 = mfjVar.m;
                        }
                        int i7 = mfjVar.y;
                        if (j == 10000) {
                            i7 = mfjVar.z;
                        } else if (j == 30000) {
                            i7 = mfjVar.A;
                        }
                        this.q = new xgd(i6, resources.getString(i7), broadcast2).c();
                    }
                    return this.q;
                }
                break;
        }
        msg msgVar3 = u;
        Log.e(msgVar3.a, msgVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        z a;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.k == null) {
            return;
        }
        rjp rjpVar = this.l;
        if (rjpVar == null || (bitmap = (Bitmap) rjpVar.b) == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = null;
        }
        Context context = this.a;
        f0 f0Var = new f0(context, "cast_media_notification");
        f0Var.h(bitmap);
        mfj mfjVar = this.c;
        f0Var.K.icon = mfjVar.e;
        f0Var.e = f0.c(this.k.d);
        f0Var.f = f0.c(this.j.getString(mfjVar.s, this.k.e));
        f0Var.g(2, true);
        f0Var.l = false;
        f0Var.B = 1;
        ComponentName componentName = this.e;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent b = f.b(context, component); b != null; b = f.b(context, b.getComponent())) {
                        arrayList.add(size, b);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    xq0.t(e);
                    return;
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                xq0.q("No intents added to TaskStackBuilder; cannot getPendingIntent");
                return;
            } else {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
            }
        }
        if (activities != null) {
            f0Var.g = activities;
        }
        uax uaxVar = mfjVar.F;
        msg msgVar = u;
        if (uaxVar != null) {
            msgVar.b("actionsProvider != null", new Object[0]);
            int[] b2 = zmx.b(uaxVar);
            this.g = b2 == null ? null : (int[]) b2.clone();
            List<zej> a2 = zmx.a(uaxVar);
            this.f = new ArrayList();
            if (a2 != null) {
                for (zej zejVar : a2) {
                    String str = zejVar.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        a = a(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.d);
                        a = new xgd(zejVar.b, zejVar.c, PendingIntent.getBroadcast(context, 0, intent2, 67108864)).c();
                    }
                    if (a != null) {
                        this.f.add(a);
                    }
                }
            }
        } else {
            msgVar.b("actionsProvider == null", new Object[0]);
            this.f = new ArrayList();
            Iterator it = mfjVar.a.iterator();
            while (it.hasNext()) {
                z a3 = a((String) it.next());
                if (a3 != null) {
                    this.f.add(a3);
                }
            }
            int[] iArr = mfjVar.b;
            this.g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            z zVar = (z) it2.next();
            if (zVar != null) {
                f0Var.b.add(zVar);
            }
        }
        rwh rwhVar = new rwh();
        rwhVar.c = null;
        int[] iArr2 = this.g;
        if (iArr2 != null) {
            rwhVar.c = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = this.k.a;
        if (mediaSessionCompat$Token != null) {
            rwhVar.d = mediaSessionCompat$Token;
        }
        f0Var.k(rwhVar);
        notificationManager.notify("castMediaNotification", 1, f0Var.b());
    }
}
