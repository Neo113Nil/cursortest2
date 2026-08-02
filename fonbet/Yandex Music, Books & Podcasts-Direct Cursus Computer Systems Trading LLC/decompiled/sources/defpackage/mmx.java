package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.f;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class mmx {
    public static final msg v = new msg("MediaSessionManager", null);
    public final Context a;
    public final k74 b;
    public final l3x c;
    public final jmp d;
    public final mfj e;
    public final ComponentName f;
    public final ComponentName g;
    public final n3m h;
    public final n3m i;
    public final ehx j;
    public final fsn k;
    public final yyo l;
    public final gix m;
    public xun n;
    public CastDevice o;
    public osh p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public mmx(Context context, k74 k74Var, l3x l3xVar) {
        jmp jmpVar;
        mfj mfjVar;
        this.a = context;
        this.b = k74Var;
        this.c = l3xVar;
        msg msgVar = o64.j;
        y1g.B("Must be called from the main thread.");
        o64 o64Var = o64.l;
        ehx ehxVar = null;
        if (o64Var != null) {
            y1g.B("Must be called from the main thread.");
            jmpVar = o64Var.b;
        } else {
            jmpVar = null;
        }
        this.d = jmpVar;
        g74 g74Var = k74Var.f;
        this.e = g74Var == null ? null : g74Var.d;
        this.m = new gix(1, this);
        String str = g74Var == null ? null : g74Var.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = g74Var == null ? null : g74Var.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        n3m n3mVar = new n3m(context);
        this.h = n3mVar;
        n3mVar.f = new gao(this);
        n3m n3mVar2 = new n3m(context);
        this.i = n3mVar2;
        n3mVar2.f = new z6n(22, this);
        this.k = new fsn(Looper.getMainLooper(), 3);
        msg msgVar2 = ehx.u;
        g74 g74Var2 = k74Var.f;
        if (g74Var2 != null && (mfjVar = g74Var2.d) != null) {
            uax uaxVar = mfjVar.F;
            if (uaxVar != null) {
                List a = zmx.a(uaxVar);
                int[] b = zmx.b(uaxVar);
                int size = a == null ? 0 : a.size();
                if (a == null || a.isEmpty()) {
                    Log.e(msgVar2.a, msgVar2.d(bnd.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (a.size() > 5) {
                    Log.e(msgVar2.a, msgVar2.d(bnd.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (b == null || (b.length) == 0) {
                    Log.e(msgVar2.a, msgVar2.d(bnd.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i : b) {
                        if (i < 0 || i >= size) {
                            Log.e(msgVar2.a, msgVar2.d(bnd.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            ehxVar = new ehx(context);
        }
        this.j = ehxVar;
        this.l = new yyo(26, this);
    }

    public final void a(xun xunVar, CastDevice castDevice) {
        ComponentName componentName;
        k74 k74Var = this.b;
        g74 g74Var = k74Var == null ? null : k74Var.f;
        if (this.q || k74Var == null || g74Var == null || this.e == null || xunVar == null || castDevice == null || (componentName = this.g) == null) {
            v.b("skip attaching media session", new Object[0]);
            return;
        }
        this.n = xunVar;
        xunVar.p(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        if (g74Var.f) {
            osh oshVar = new osh();
            oshVar.c = new ArrayList();
            if (context == null) {
                xq0.x("context must not be null");
                throw null;
            }
            if (TextUtils.isEmpty("CastMediaSession")) {
                xq0.x("tag must not be null or empty");
                throw null;
            }
            if (componentName == null) {
                int i = swh.c;
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && broadcast == null) {
                Intent intent3 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent3.setComponent(componentName);
                broadcast = PendingIntent.getBroadcast(context, 0, intent3, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                oshVar.a = new ish(context);
            } else if (i2 >= 28) {
                oshVar.a = new gsh(context);
            } else {
                oshVar.a = new esh(context);
            }
            oshVar.U(new zrh(1), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            ((esh) oshVar.a).a.setMediaButtonReceiver(broadcast);
            oshVar.b = new aqd(context, ((esh) oshVar.a).c);
            if (osh.d == 0) {
                osh.d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
            this.p = oshVar;
            j(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.d);
                xy0 xy0Var = MediaMetadataCompat.d;
                if (xy0Var.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) xy0Var.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    xq0.x("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    return;
                } else {
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    oshVar.W(new MediaMetadataCompat(bundle));
                }
            }
            oshVar.U(new pkx(this), null);
            ((esh) oshVar.a).a.setActive(true);
            Iterator it = ((ArrayList) oshVar.c).iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
            this.c.S0(oshVar);
        }
        this.q = true;
        c();
    }

    public final void b(Bitmap bitmap, int i) {
        MediaMetadata metadata;
        osh oshVar = this.p;
        if (oshVar == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        osh oshVar2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (oshVar2 != null && (metadata = ((a) ((aqd) oshVar2.b).b).a.getMetadata()) != null) {
            xy0 xy0Var = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        Bundle bundle = (Bundle) (mediaMetadataCompat == null ? new awc(14) : new awc(mediaMetadataCompat)).a;
        String str = i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART";
        xy0 xy0Var2 = MediaMetadataCompat.d;
        if (xy0Var2.containsKey(str) && ((Integer) xy0Var2.get(str)).intValue() != 2) {
            xq0.x(hrg.q("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            bundle.putParcelable(str, bitmap);
            oshVar.W(new MediaMetadataCompat(bundle));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        MediaInfo d;
        goh gohVar;
        boolean z;
        boolean z2;
        xfx xfxVar;
        Uri uri;
        rjp rjpVar;
        cph c;
        MediaInfo mediaInfo;
        xun xunVar = this.n;
        if (xunVar == null) {
            return;
        }
        int s = xunVar.s();
        MediaInfo d2 = xunVar.d();
        if (xunVar.k() && (c = xunVar.c()) != null && (mediaInfo = c.a) != null) {
            d2 = mediaInfo;
        }
        j(s, d2);
        if (!xunVar.h()) {
            h();
            i();
            return;
        }
        if (s != 0) {
            ehx ehxVar = this.j;
            if (ehxVar != null) {
                v.b("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                xun xunVar2 = this.n;
                osh oshVar = this.p;
                if (castDevice != null && xunVar2 != null && oshVar != null && (d = xunVar2.d()) != null && (gohVar = d.d) != null) {
                    List list = gohVar.a;
                    owh e = xunVar2.e();
                    if (e != null) {
                        int i = e.p;
                        if (i == 1 || i == 2 || i == 3) {
                            z = true;
                            z2 = z;
                            boolean z3 = xunVar2.f() == 2;
                            int i2 = d.b;
                            goh.a("com.google.android.gms.cast.metadata.TITLE");
                            String string = gohVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                            String str = castDevice.d;
                            xfx xfxVar2 = new xfx(z3, i2, string, str, ((esh) oshVar.a).c, z, z2);
                            boolean z4 = z3;
                            boolean z5 = z;
                            boolean z6 = z2;
                            xfxVar = ehxVar.k;
                            if (xfxVar != null || z4 != xfxVar.b || i2 != xfxVar.c || !d94.d(string, xfxVar.d) || !d94.d(str, xfxVar.e) || z5 != xfxVar.f || z6 != xfxVar.g) {
                                ehxVar.k = xfxVar2;
                                ehxVar.b();
                            }
                            nbv nbvVar = (list != null || list.isEmpty()) ? null : (nbv) list.get(0);
                            rjp rjpVar2 = new rjp();
                            rjpVar2.a = nbvVar == null ? null : nbvVar.b;
                            uri = (Uri) rjpVar2.a;
                            rjpVar = ehxVar.l;
                            if (rjpVar != null || !d94.d(uri, (Uri) rjpVar.a)) {
                                n3m n3mVar = ehxVar.i;
                                n3mVar.f = new dxr(ehxVar, rjpVar2, false);
                                n3mVar.R0(uri);
                            }
                        } else {
                            Integer num = (Integer) e.x.get(e.c);
                            if (num != null) {
                                boolean z7 = num.intValue() > 0;
                                z = num.intValue() < e.q.size() + (-1);
                                z2 = z7;
                                if (xunVar2.f() == 2) {
                                }
                                int i22 = d.b;
                                goh.a("com.google.android.gms.cast.metadata.TITLE");
                                String string2 = gohVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                                String str2 = castDevice.d;
                                xfx xfxVar22 = new xfx(z3, i22, string2, str2, ((esh) oshVar.a).c, z, z2);
                                boolean z42 = z3;
                                boolean z52 = z;
                                boolean z62 = z2;
                                xfxVar = ehxVar.k;
                                if (xfxVar != null) {
                                }
                                ehxVar.k = xfxVar22;
                                ehxVar.b();
                                if (list != null) {
                                }
                                rjp rjpVar22 = new rjp();
                                rjpVar22.a = nbvVar == null ? null : nbvVar.b;
                                uri = (Uri) rjpVar22.a;
                                rjpVar = ehxVar.l;
                                if (rjpVar != null) {
                                }
                                n3m n3mVar2 = ehxVar.i;
                                n3mVar2.f = new dxr(ehxVar, rjpVar22, false);
                                n3mVar2.R0(uri);
                            }
                        }
                    }
                    z = false;
                    z2 = z;
                    if (xunVar2.f() == 2) {
                    }
                    int i222 = d.b;
                    goh.a("com.google.android.gms.cast.metadata.TITLE");
                    String string22 = gohVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
                    String str22 = castDevice.d;
                    xfx xfxVar222 = new xfx(z3, i222, string22, str22, ((esh) oshVar.a).c, z, z2);
                    boolean z422 = z3;
                    boolean z522 = z;
                    boolean z622 = z2;
                    xfxVar = ehxVar.k;
                    if (xfxVar != null) {
                    }
                    ehxVar.k = xfxVar222;
                    ehxVar.b();
                    if (list != null) {
                    }
                    rjp rjpVar222 = new rjp();
                    rjpVar222.a = nbvVar == null ? null : nbvVar.b;
                    uri = (Uri) rjpVar222.a;
                    rjpVar = ehxVar.l;
                    if (rjpVar != null) {
                    }
                    n3m n3mVar22 = ehxVar.i;
                    n3mVar22.f = new dxr(ehxVar, rjpVar222, false);
                    n3mVar22.R0(uri);
                }
            }
            if (xunVar.k()) {
                return;
            }
            g(true);
        }
    }

    public final long d(String str, int i, Bundle bundle) {
        long j;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i == 3) {
                        j = 514;
                        i = 3;
                    } else {
                        j = 512;
                    }
                    if (i != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                xun xunVar = this.n;
                if (xunVar != null && xunVar.h()) {
                    owh e = xunVar.e();
                    y1g.G(e);
                    if ((128 & e.h) != 0 || e.p != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) e.x.get(e.c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            xun xunVar2 = this.n;
            if (xunVar2 != null && xunVar2.h()) {
                owh e2 = xunVar2.e();
                y1g.G(e2);
                if ((64 & e2.h) != 0 || e2.p != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) e2.x.get(e2.c);
                if (num2 != null && num2.intValue() < e2.q.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri e(goh gohVar) {
        g74 g74Var = this.b.f;
        if (g74Var != null) {
            g74Var.d();
        }
        List list = gohVar.a;
        nbv nbvVar = (list == null || list.isEmpty()) ? null : (nbv) gohVar.a.get(0);
        if (nbvVar == null) {
            return null;
        }
        return nbvVar.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(f fVar, String str, zej zejVar) {
        int hashCode = str.hashCode();
        Context context = this.a;
        PlaybackStateCompat.CustomAction customAction = null;
        mfj mfjVar = this.e;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.s == null && mfjVar != null) {
                        long j = mfjVar.c;
                        msg msgVar = zmx.a;
                        int i = mfjVar.B;
                        if (j == 10000) {
                            i = mfjVar.C;
                        } else if (j == 30000) {
                            i = mfjVar.D;
                        }
                        int i2 = mfjVar.n;
                        if (j == 10000) {
                            i2 = mfjVar.o;
                        } else if (j == 30000) {
                            i2 = mfjVar.p;
                        }
                        String string = context.getResources().getString(i);
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                            if (!TextUtils.isEmpty(string)) {
                                if (i2 == 0) {
                                    xq0.x("You must specify an icon resource id to build a CustomAction");
                                    break;
                                } else {
                                    this.s = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i2, null);
                                }
                            } else {
                                xq0.x("You must specify a name to build a CustomAction");
                                break;
                            }
                        } else {
                            xq0.x("You must specify an action to build a CustomAction");
                            break;
                        }
                    }
                    customAction = this.s;
                    if (customAction != null) {
                        fVar.a.add(customAction);
                        break;
                    }
                }
                if (zejVar != null) {
                    String str2 = zejVar.c;
                    int i3 = zejVar.b;
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            if (i3 == 0) {
                                xq0.x("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction = new PlaybackStateCompat.CustomAction(str, str2, i3, null);
                            }
                        } else {
                            xq0.x("You must specify a name to build a CustomAction");
                            break;
                        }
                    } else {
                        xq0.x("You must specify an action to build a CustomAction");
                        break;
                    }
                }
                if (customAction != null) {
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null && mfjVar != null) {
                        String string2 = context.getResources().getString(mfjVar.E);
                        int i4 = mfjVar.q;
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            if (!TextUtils.isEmpty(string2)) {
                                if (i4 == 0) {
                                    xq0.x("You must specify an icon resource id to build a CustomAction");
                                    break;
                                } else {
                                    this.t = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i4, null);
                                }
                            } else {
                                xq0.x("You must specify a name to build a CustomAction");
                                break;
                            }
                        } else {
                            xq0.x("You must specify an action to build a CustomAction");
                            break;
                        }
                    }
                    customAction = this.t;
                    if (customAction != null) {
                    }
                }
                if (zejVar != null) {
                }
                if (customAction != null) {
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.u == null && mfjVar != null) {
                        String string3 = context.getResources().getString(mfjVar.E);
                        int i5 = mfjVar.q;
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            if (!TextUtils.isEmpty(string3)) {
                                if (i5 == 0) {
                                    xq0.x("You must specify an icon resource id to build a CustomAction");
                                    break;
                                } else {
                                    this.u = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i5, null);
                                }
                            } else {
                                xq0.x("You must specify a name to build a CustomAction");
                                break;
                            }
                        } else {
                            xq0.x("You must specify an action to build a CustomAction");
                            break;
                        }
                    }
                    customAction = this.u;
                    if (customAction != null) {
                    }
                }
                if (zejVar != null) {
                }
                if (customAction != null) {
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.r == null && mfjVar != null) {
                        long j2 = mfjVar.c;
                        msg msgVar2 = zmx.a;
                        int i6 = mfjVar.y;
                        if (j2 == 10000) {
                            i6 = mfjVar.z;
                        } else if (j2 == 30000) {
                            i6 = mfjVar.A;
                        }
                        int i7 = mfjVar.k;
                        if (j2 == 10000) {
                            i7 = mfjVar.l;
                        } else if (j2 == 30000) {
                            i7 = mfjVar.m;
                        }
                        String string4 = context.getResources().getString(i6);
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                            if (!TextUtils.isEmpty(string4)) {
                                if (i7 == 0) {
                                    xq0.x("You must specify an icon resource id to build a CustomAction");
                                    break;
                                } else {
                                    this.r = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i7, null);
                                }
                            } else {
                                xq0.x("You must specify a name to build a CustomAction");
                                break;
                            }
                        } else {
                            xq0.x("You must specify an action to build a CustomAction");
                            break;
                        }
                    }
                    customAction = this.r;
                    if (customAction != null) {
                    }
                }
                if (zejVar != null) {
                }
                if (customAction != null) {
                }
                break;
            default:
                if (zejVar != null) {
                }
                if (customAction != null) {
                }
                break;
        }
    }

    public final void g(boolean z) {
        if (this.b.g) {
            fsn fsnVar = this.k;
            yyo yyoVar = this.l;
            if (yyoVar != null) {
                fsnVar.removeCallbacks(yyoVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    fsnVar.postDelayed(yyoVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        ehx ehxVar = this.j;
        if (ehxVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            n3m n3mVar = ehxVar.i;
            n3mVar.S0();
            n3mVar.f = null;
            NotificationManager notificationManager = ehxVar.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (this.b.g) {
            this.k.removeCallbacks(this.l);
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final void j(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat a;
        RemoteCallbackList remoteCallbackList;
        osh oshVar;
        goh gohVar;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        PendingIntent activity;
        osh oshVar2 = this.p;
        if (oshVar2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        f fVar = new f();
        xun xunVar = this.n;
        if (xunVar == null || this.j == null) {
            a = fVar.a();
        } else {
            long a2 = (xunVar.s() == 0 || xunVar.j()) ? 0L : xunVar.a();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            fVar.b = i;
            fVar.c = a2;
            fVar.f = elapsedRealtime;
            fVar.d = 1.0f;
            if (i == 0) {
                a = fVar.a();
            } else {
                mfj mfjVar = this.e;
                uax uaxVar = mfjVar != null ? mfjVar.F : null;
                xun xunVar2 = this.n;
                long j = (xunVar2 == null || xunVar2.j() || this.n.n()) ? 0L : 256L;
                if (uaxVar != null) {
                    List<zej> a3 = zmx.a(uaxVar);
                    if (a3 != null) {
                        for (zej zejVar : a3) {
                            String str = zejVar.a;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j |= d(str, i, bundle);
                            } else {
                                f(fVar, str, zejVar);
                            }
                        }
                    }
                } else {
                    mfj mfjVar2 = this.e;
                    if (mfjVar2 != null) {
                        Iterator it = mfjVar2.a.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j |= d(str2, i, bundle);
                            } else {
                                f(fVar, str2, null);
                            }
                        }
                    }
                }
                fVar.e = j;
                a = fVar.a();
            }
        }
        esh eshVar = (esh) oshVar2.a;
        eshVar.f = a;
        synchronized (eshVar.d) {
            int beginBroadcast = eshVar.e.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = eshVar.e;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    ((y8e) remoteCallbackList.getBroadcastItem(beginBroadcast)).H0(a);
                } catch (RemoteException unused) {
                }
                beginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = eshVar.a;
        if (a.l == null) {
            PlaybackState.Builder d = f6l.d();
            f6l.x(d, a.a, a.b, a.d, a.h);
            f6l.u(d, a.c);
            f6l.s(d, a.e);
            f6l.v(d, a.g);
            for (PlaybackStateCompat.CustomAction customAction : a.i) {
                PlaybackState.CustomAction customAction2 = customAction.e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e = f6l.e(customAction.a, customAction.b, customAction.c);
                    f6l.w(e, customAction.d);
                    customAction2 = f6l.b(e);
                }
                f6l.a(d, customAction2);
            }
            f6l.t(d, a.j);
            g6l.b(d, a.k);
            a.l = f6l.c(d);
        }
        mediaSession.setPlaybackState(a.l);
        mfj mfjVar3 = this.e;
        if (mfjVar3 != null && mfjVar3.G) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        mfj mfjVar4 = this.e;
        if (mfjVar4 != null && mfjVar4.H) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            ((esh) oshVar2.a).a.setExtras(bundle);
        }
        if (i == 0) {
            oshVar2.W(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.n != null) {
            if (this.f == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.f);
                activity = PendingIntent.getActivity(this.a, 0, intent, 201326592);
            }
            if (activity != null) {
                ((esh) oshVar2.a).a.setSessionActivity(activity);
            }
        }
        xun xunVar3 = this.n;
        if (xunVar3 == null || (oshVar = this.p) == null || mediaInfo == null || (gohVar = mediaInfo.d) == null) {
            return;
        }
        long j2 = xunVar3.j() ? 0L : mediaInfo.e;
        goh.a("com.google.android.gms.cast.metadata.TITLE");
        String string = gohVar.b.getString("com.google.android.gms.cast.metadata.TITLE");
        goh.a("com.google.android.gms.cast.metadata.SUBTITLE");
        String string2 = gohVar.b.getString("com.google.android.gms.cast.metadata.SUBTITLE");
        osh oshVar3 = this.p;
        if (oshVar3 == null || (metadata = ((a) ((aqd) oshVar3.b).b).a.getMetadata()) == null) {
            createFromParcel = null;
        } else {
            xy0 xy0Var = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
        }
        awc awcVar = createFromParcel == null ? new awc(14) : new awc(createFromParcel);
        xy0 xy0Var2 = MediaMetadataCompat.d;
        if (xy0Var2.containsKey("android.media.metadata.DURATION") && ((Integer) xy0Var2.get("android.media.metadata.DURATION")).intValue() != 0) {
            xq0.x("The android.media.metadata.DURATION key cannot be used to put a long");
            return;
        }
        ((Bundle) awcVar.a).putLong("android.media.metadata.DURATION", j2);
        if (string != null) {
            awcVar.B("android.media.metadata.TITLE", string);
            awcVar.B("android.media.metadata.DISPLAY_TITLE", string);
        }
        if (string2 != null) {
            awcVar.B("android.media.metadata.DISPLAY_SUBTITLE", string2);
        }
        oshVar.W(new MediaMetadataCompat((Bundle) awcVar.a));
        Uri e2 = e(gohVar);
        if (e2 != null) {
            this.h.R0(e2);
        } else {
            b(null, 0);
        }
        Uri e3 = e(gohVar);
        if (e3 != null) {
            this.i.R0(e3);
        } else {
            b(null, 3);
        }
    }
}
