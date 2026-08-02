package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.y;
import com.connectsdk.device.ConnectableDevice;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.catalog.universalentity.UniversalEntityActivity;
import ru.yandex.music.common.media.context.d;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class nsh implements p7q, y1r, kzc, e14, hkq {
    public static int e;
    public static volatile nsh f;
    public static volatile nsh k;
    public static nsh l;
    public static volatile nsh n;
    public static nsh p;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object g = new Object();
    public static final cp6 h = new cp6(0);
    public static final mj i = new mj(6);
    public static final l48 j = new l48(19);
    public static final y9w m = new y9w(22);
    public static final ybl o = new ybl();

    public nsh(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        this.d = new ArrayList();
        ComponentName componentName2 = null;
        if (context == null) {
            xq0.x("context must not be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            xq0.x("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i2 = g0s.b;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else if (queryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = componentName2;
            if (componentName == null) {
                Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            this.b = new hsh(context, str, bundle);
        } else if (i3 >= 28) {
            this.b = new fsh(context, str, bundle);
        } else {
            this.b = new dsh(context, str, bundle);
        }
        Looper myLooper = Looper.myLooper();
        ((dsh) this.b).c(new yrh(0), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
        ((dsh) this.b).a.setMediaButtonReceiver(pendingIntent);
        this.c = new iwe(context, ((dsh) this.b).c);
        if (e == 0) {
            e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void D(nsh nshVar, Function2 function2) {
        g gVar = g.a;
        nshVar.getClass();
        gVar.getClass();
        mm6 mm6Var = (mm6) nshVar.b;
        a aVar = (a) nshVar.c;
        aVar.getClass();
        x97.y(mm6Var, aVar, null, new ov(nshVar, function2, null), 2);
    }

    public static void H(jac jacVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            jacVar.k(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }

    public static void S(sr1 sr1Var) {
        if (sr1Var.f != null) {
            return;
        }
        try {
            List<Proxy> select = ProxySelector.getDefault().select(URI.create(sr1Var.b.toString()));
            if (select.isEmpty()) {
                return;
            }
            Proxy proxy = select.get(0);
            if (proxy.type() == Proxy.Type.HTTP && (proxy.address() instanceof InetSocketAddress)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                String hostString = inetSocketAddress.getHostString();
                int port = inetSocketAddress.getPort();
                sr1Var.f = hostString;
                sr1Var.g = port;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(nsh nshVar, j5g j5gVar, cg6 cg6Var) {
        k5g k5gVar;
        int i2;
        int i3;
        nu1 nu1Var;
        nshVar.getClass();
        if (cg6Var instanceof k5g) {
            k5gVar = (k5g) cg6Var;
            int i4 = k5gVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                k5gVar.n = i4 - Integer.MIN_VALUE;
                Object obj = k5gVar.l;
                nm6 nm6Var = nm6.a;
                i2 = k5gVar.n;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (j5gVar == null) {
                        return new m1g(j1g.b, 0);
                    }
                    i5g i5gVar = j5gVar.a;
                    boolean z = j5gVar.b;
                    nu1 nu1Var2 = i5gVar.a;
                    t3g t3gVar = (t3g) nshVar.c;
                    k5gVar.j = nu1Var2;
                    k5gVar.k = z;
                    k5gVar.n = 1;
                    Object h2 = t3gVar.h(nu1Var2, k5gVar);
                    if (h2 == nm6Var) {
                        return nm6Var;
                    }
                    obj = h2;
                    i3 = z;
                    nu1Var = nu1Var2;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z2 = k5gVar.k;
                    nu1Var = k5gVar.j;
                    qgg.h0(obj);
                    i3 = z2;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                j1g j1gVar = !booleanValue ? j1g.a : j1g.b;
                int r = e88.r(nu1Var) + ((booleanValue ? 1 : 0) - i3);
                return new m1g(j1gVar, r >= 0 ? r : 0);
            }
        }
        k5gVar = new k5g(nshVar, cg6Var);
        Object obj2 = k5gVar.l;
        nm6 nm6Var2 = nm6.a;
        i2 = k5gVar.n;
        if (i2 != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (!booleanValue2) {
        }
        int r2 = e88.r(nu1Var) + ((booleanValue2 ? 1 : 0) - i3);
        return new m1g(j1gVar, r2 >= 0 ? r2 : 0);
    }

    public static void g(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = nsh.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static nsh x() {
        if (p == null) {
            p = new nsh(ys1.f);
        }
        return p;
    }

    public static nsh z(Context context) {
        if (f == null) {
            synchronized (g) {
                try {
                    if (f == null) {
                        f = new nsh(context);
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public xof A() {
        return ((ou3) this.d).a.b;
    }

    public long B() {
        return ((ou3) this.d).a.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(db7 db7Var, Uri uri, Map map, long j2, long j3, uvm uvmVar) {
        gm7 gm7Var = new gm7(db7Var, j2, j3);
        this.d = gm7Var;
        if (((r2c) this.c) != null) {
            return;
        }
        r2c[] d = ((u2c) this.b).d(uri, map);
        int length = d.length;
        ude udeVar = yde.b;
        hld.w(length, "expectedSize");
        tde tdeVar = new tde(length);
        boolean z = true;
        if (d.length == 1) {
            this.c = d[0];
        } else {
            int length2 = d.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                r2c r2cVar = d[i2];
                try {
                } catch (EOFException unused) {
                    if (((r2c) this.c) == null) {
                    }
                } catch (Throwable th) {
                    if (((r2c) this.c) == null && gm7Var.d != j2) {
                        z = false;
                    }
                    vq1.A(z);
                    gm7Var.f = 0;
                    throw th;
                }
                if (r2cVar.d(gm7Var)) {
                    this.c = r2cVar;
                    gm7Var.f = 0;
                    break;
                }
                tdeVar.c(r2cVar.i());
                if (((r2c) this.c) == null) {
                }
                boolean z2 = true;
                vq1.A(z2);
                gm7Var.f = 0;
                i2++;
            }
            if (((r2c) this.c) == null) {
                String str = "None of the available extractors (" + new jpc(", ", 2).e(ldg.O(new xq0(), yde.w(d))) + ") could read the stream.";
                uri.getClass();
                qsn f2 = tdeVar.f();
                olt oltVar = new olt(str, null, false, 1);
                yde.v(f2);
                throw oltVar;
            }
        }
        ((r2c) this.c).l(uvmVar);
    }

    public boolean E(r3q r3qVar) {
        if (r3qVar instanceof j3q) {
            j3q j3qVar = (j3q) r3qVar;
            return Intrinsics.d(j3qVar.a.a, (String) this.b) && j3qVar.c == ((i3q) this.c);
        }
        if ((r3qVar instanceof p3q) || (r3qVar instanceof l3q) || (r3qVar instanceof m3q)) {
            return false;
        }
        b6e.s();
        return false;
    }

    public boolean F(r3q r3qVar) {
        if (r3qVar instanceof l3q) {
            l3q l3qVar = (l3q) r3qVar;
            return Intrinsics.d(l3qVar.a.a, (String) this.b) && l3qVar.c == ((k3q) this.c);
        }
        if ((r3qVar instanceof j3q) || (r3qVar instanceof p3q) || (r3qVar instanceof m3q)) {
            return false;
        }
        b6e.s();
        return false;
    }

    public boolean G(int i2, aa6 aa6Var, awm awmVar) {
        fv2 fv2Var = (fv2) this.b;
        z96[] z96VarArr = aa6Var.U;
        int[] iArr = aa6Var.t;
        fv2Var.a = z96VarArr[0];
        fv2Var.b = z96VarArr[1];
        fv2Var.c = aa6Var.r();
        fv2Var.d = aa6Var.l();
        fv2Var.i = false;
        fv2Var.j = i2;
        z96 z96Var = fv2Var.a;
        z96 z96Var2 = z96.c;
        boolean z = z96Var == z96Var2;
        boolean z2 = fv2Var.b == z96Var2;
        boolean z3 = z && aa6Var.Y > 0.0f;
        boolean z4 = z2 && aa6Var.Y > 0.0f;
        z96 z96Var3 = z96.a;
        if (z3 && iArr[0] == 4) {
            fv2Var.a = z96Var3;
        }
        if (z4 && iArr[1] == 4) {
            fv2Var.b = z96Var3;
        }
        awmVar.d(aa6Var, fv2Var);
        aa6Var.P(fv2Var.e);
        aa6Var.M(fv2Var.f);
        aa6Var.E = fv2Var.h;
        aa6Var.J(fv2Var.g);
        fv2Var.j = 0;
        return fv2Var.i;
    }

    public void I(Context context) {
        Object t7oVar;
        this.d = new l83(9, this);
        try {
            r7o r7oVar = z7o.b;
            t7oVar = etn.c0(context, (l83) this.d, new IntentFilter("updateListSdkDebugViewVisibilityFlag"));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            Log.e("DebugViewToggleManager", "[init] while registerReceiver failure has occurred: " + fob.b(a));
        }
    }

    public synchronized void J() {
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            c43 c43Var = (c43) this.c;
            zlq zlqVar = (zlq) entry.getValue();
            zlqVar.getClass();
            Timber.INSTANCE.tag("YP:BlckBaseUrlsManager").d("removeListener listener=" + zlqVar, new Object[0]);
            c43Var.b.remove(zlqVar);
        }
    }

    public void K(or1 or1Var, Exception exc, nr1 nr1Var, sr1 sr1Var, c6e c6eVar) {
        ((ys1) this.d).e(or1Var.i);
        if (exc != null ? or1Var.k(exc, null) : or1Var.k(null, nr1Var)) {
            c6eVar.c(exc, nr1Var);
        } else if (nr1Var != null) {
            nr1Var.c = new imp();
            nr1Var.close();
        }
    }

    public void L(String str) {
        if (str != null) {
            this.b = str;
        } else {
            jj4.j("Null backendName");
        }
    }

    public void M(mu3 mu3Var) {
        ((ou3) this.d).a.c = mu3Var;
    }

    public void N(rtm rtmVar, boolean z) {
        rtm rtmVar2 = (rtm) this.b;
        this.b = rtmVar;
        if (z) {
            SharedPreferences sharedPreferences = ((ttm) this.d).a;
            if (rtmVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ConnectableDevice.KEY_ID, rtmVar.a);
                    jSONObject.put("first_name", rtmVar.b);
                    jSONObject.put("middle_name", rtmVar.c);
                    jSONObject.put("last_name", rtmVar.d);
                    jSONObject.put("name", rtmVar.e);
                    Uri uri = rtmVar.f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = rtmVar.g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (rtmVar2 == null ? rtmVar == null : rtmVar2.equals(rtmVar)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", rtmVar2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", rtmVar);
        ((phg) this.c).c(intent);
    }

    public void O(jx7 jx7Var) {
        ((ou3) this.d).a.a = jx7Var;
    }

    public void P(xof xofVar) {
        ((ou3) this.d).a.b = xofVar;
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    public void Q(defpackage.i6l r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            dsh r0 = (defpackage.dsh) r0
            r0.g = r10
            java.lang.Object r1 = r0.d
            monitor-enter(r1)
            android.os.RemoteCallbackList r2 = r0.f     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L1f
            int r2 = r2 + (-1)
        L11:
            android.os.RemoteCallbackList r3 = r0.f
            if (r2 < 0) goto L25
            android.os.IInterface r3 = r3.getBroadcastItem(r2)     // Catch: java.lang.Throwable -> L1f
            x8e r3 = (defpackage.x8e) r3     // Catch: java.lang.Throwable -> L1f
            r3.f(r10)     // Catch: java.lang.Throwable -> L1f android.os.RemoteException -> L22
            goto L22
        L1f:
            r0 = move-exception
            r10 = r0
            goto L94
        L22:
            int r2 = r2 + (-1)
            goto L11
        L25:
            r3.finishBroadcast()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            android.media.session.MediaSession r0 = r0.a
            android.media.session.PlaybackState r1 = r10.l
            if (r1 != 0) goto L8e
            android.media.session.PlaybackState$Builder r2 = new android.media.session.PlaybackState$Builder
            r2.<init>()
            int r3 = r10.a
            long r4 = r10.b
            float r6 = r10.d
            long r7 = r10.h
            r2.setState(r3, r4, r6, r7)
            long r3 = r10.c
            r2.setBufferedPosition(r3)
            long r3 = r10.e
            r2.setActions(r3)
            java.lang.CharSequence r1 = r10.g
            r2.setErrorMessage(r1)
            java.util.AbstractCollection r1 = r10.i
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7e
            java.lang.Object r3 = r1.next()
            h6l r3 = (defpackage.h6l) r3
            android.media.session.PlaybackState$CustomAction r4 = r3.e
            if (r4 != 0) goto L78
            java.lang.String r4 = r3.a
            java.lang.CharSequence r5 = r3.b
            int r6 = r3.c
            android.media.session.PlaybackState$CustomAction$Builder r7 = new android.media.session.PlaybackState$CustomAction$Builder
            r7.<init>(r4, r5, r6)
            android.os.Bundle r3 = r3.d
            r7.setExtras(r3)
            android.media.session.PlaybackState$CustomAction r4 = r7.build()
        L78:
            if (r4 == 0) goto L54
            r2.addCustomAction(r4)
            goto L54
        L7e:
            long r3 = r10.j
            r2.setActiveQueueItemId(r3)
            android.os.Bundle r1 = r10.k
            r2.setExtras(r1)
            android.media.session.PlaybackState r1 = r2.build()
            r10.l = r1
        L8e:
            android.media.session.PlaybackState r10 = r10.l
            r0.setPlaybackState(r10)
            return
        L94:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsh.Q(i6l):void");
    }

    public void R(long j2) {
        ((ou3) this.d).a.d = j2;
    }

    public void T(mqs mqsVar) {
        mqsVar.getClass();
        sai saiVar = new sai(false);
        cvo cvoVar = cvo.i;
        e3s.X(o6m.b(wjb.BottomsheetScreen, null, 6), (y) this.d, "ADD_TO_PLAYLIST_BOTTOM_SHEET", saiVar, null, new wn5(new xk(0, this, mqsVar, saiVar), -1383449916, true), 48);
    }

    public void U(ba6 ba6Var, int i2, int i3, int i4) {
        ba6Var.getClass();
        int i5 = ba6Var.d0;
        int i6 = ba6Var.e0;
        ba6Var.d0 = 0;
        ba6Var.e0 = 0;
        ba6Var.P(i3);
        ba6Var.M(i4);
        if (i5 < 0) {
            ba6Var.d0 = 0;
        } else {
            ba6Var.d0 = i5;
        }
        if (i6 < 0) {
            ba6Var.e0 = 0;
        } else {
            ba6Var.e0 = i6;
        }
        ba6 ba6Var2 = (ba6) this.c;
        ba6Var2.x0 = i2;
        ba6Var2.V();
    }

    public void V(ba6 ba6Var) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.clear();
        int size = ba6Var.u0.size();
        for (int i2 = 0; i2 < size; i2++) {
            aa6 aa6Var = (aa6) ba6Var.u0.get(i2);
            z96[] z96VarArr = aa6Var.U;
            z96 z96Var = z96VarArr[0];
            z96 z96Var2 = z96.c;
            if (z96Var == z96Var2 || z96VarArr[1] == z96Var2) {
                arrayList.add(aa6Var);
            }
        }
        ba6Var.w0.b = true;
    }

    public dg0 W(SQLiteDatabase sQLiteDatabase) {
        synchronized (this.c) {
            if (((fg0) ((HashMap) this.d).get(sQLiteDatabase)) == null) {
                ((HashMap) this.d).put(sQLiteDatabase, new fg0());
            }
        }
        return new dg0(this, sQLiteDatabase);
    }

    @Override // defpackage.e14
    public void a(String str) {
        int i2 = UniversalEntityActivity.Y;
        boolean b = new lim(ekt.YANDEXMUSIC).b(str);
        Context context = (Context) this.b;
        if (b) {
            context.startActivity(wxf.A(context, str));
        } else {
            w1g.y(context, str, true);
        }
    }

    public de2 c() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((lsm) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new de2((String) this.b, (byte[]) this.c, (lsm) this.d);
        }
        xq0.q("Missing required properties:".concat(str));
        return null;
    }

    public r0o d() {
        return new r0o((xzi) this.b, (Set) this.c, Intrinsics.d((Boolean) this.d, Boolean.TRUE), 1);
    }

    public void e(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (lme.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new wp3(e2);
            }
        }
    }

    public Object f(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.b;
        if (y7g.H()) {
            try {
                Trace.beginSection(y7g.X(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                lme lmeVar = (lme) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = lmeVar.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            f(cls2, hashSet);
                        }
                    }
                }
                obj = lmeVar.create((Context) this.d);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new wp3(th2);
            }
        }
        Trace.endSection();
        return obj;
    }

    public void h(sr1 sr1Var, int i2, or1 or1Var, c6e c6eVar) {
        ys1 ys1Var = (ys1) this.d;
        if (ys1Var.e == Thread.currentThread()) {
            i(sr1Var, i2, or1Var, c6eVar);
        } else {
            ys1Var.c(new kr1(this, sr1Var, i2, or1Var, c6eVar));
        }
    }

    public void i(sr1 sr1Var, int i2, or1 or1Var, c6e c6eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.b;
        if (i2 > 15) {
            K(or1Var, new my1("too many redirects"), null, sr1Var, c6eVar);
            return;
        }
        qzc qzcVar = sr1Var.c;
        qr1 qr1Var = new qr1();
        hjp hjpVar = new hjp(9);
        hjpVar.b = new Hashtable();
        qr1Var.a = hjpVar;
        sr1Var.h = System.currentTimeMillis();
        qr1Var.b = sr1Var;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((cjq) it.next()).getClass();
        }
        int i3 = sr1Var.e;
        if (i3 > 0) {
            lr1 lr1Var = new lr1(this, qr1Var, or1Var, sr1Var, c6eVar, 0);
            or1Var.j = lr1Var;
            or1Var.i = ((ys1) this.d).d(lr1Var, i3);
        }
        qr1Var.c = new mr1(this, sr1Var, or1Var, c6eVar, qr1Var, i2);
        S(sr1Var);
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            piq b = ((cjq) it2.next()).b(qr1Var);
            if (b != null) {
                qr1Var.d = b;
                or1Var.l(b);
                return;
            }
        }
        K(or1Var, new IllegalArgumentException("invalid uri=" + sr1Var.b + " middlewares=" + copyOnWriteArrayList), null, sr1Var, c6eVar);
    }

    @Override // defpackage.e14
    public void j(aab aabVar) {
        Intent j2;
        Integer d;
        Context context = (Context) this.b;
        nrf nrfVar = (nrf) this.d;
        if (aabVar instanceof lt) {
            j2 = quj.V(context, (lt) aabVar, d.p(nrfVar));
        } else if (aabVar instanceof u51) {
            int i2 = ArtistScreenActivity.w0;
            j2 = l48.p(context, (u51) aabVar, d.p(nrfVar), null, 24);
        } else {
            if (!(aabVar instanceof eul)) {
                b6e.s();
                return;
            }
            eul eulVar = (eul) aabVar;
            u9b u9bVar = eulVar.d;
            dud budVar = (u9bVar == null || (d = u9bVar.d()) == null) ? cud.a : new bud(d.intValue());
            int i3 = PlaylistScreenActivity.B0;
            j2 = dxl.j((Context) this.b, new jxl(eulVar.a, eulVar.b), budVar, d.p(nrfVar), null, 112);
        }
        context.startActivity(j2);
    }

    public synchronized zlq k(int i2) {
        zlq zlqVar;
        zlqVar = (zlq) ((HashMap) this.d).get(Integer.valueOf(i2));
        if (zlqVar == null) {
            List list = (List) this.b;
            list.getClass();
            amq amqVar = new amq(list, this);
            ((HashMap) this.d).put(Integer.valueOf(i2), amqVar);
            c43 c43Var = (c43) this.c;
            Timber.INSTANCE.tag("YP:BlckBaseUrlsManager").d("addListener listener=" + amqVar, new Object[0]);
            c43Var.b.add(amqVar);
            zlqVar = amqVar;
        }
        return zlqVar;
    }

    @Override // defpackage.y1r
    public float l(float f2) {
        ja0 ja0Var = (ja0) this.b;
        float g2 = ja0Var.g();
        Object d = com.yandex.music.core.ui.compose.draggable.a.d(ja0Var.c(), g2, f2, (Function1) this.c, (oa0) this.d);
        if (!((Boolean) ja0Var.a.invoke(d)).booleanValue()) {
            d = ja0Var.h.getValue();
        }
        return ja0Var.c().d(d) - g2;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 9:
                iocVar.getClass();
                break;
            default:
                iocVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:0: B:28:0x0044->B:37:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[LOOP:1: B:72:0x00d4->B:81:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.p7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(szu szuVar) {
        boolean E;
        boolean z;
        int ordinal;
        boolean F;
        boolean z2;
        int ordinal2;
        switch (this.a) {
            case 9:
                szuVar.getClass();
                Function0 function0 = (Function0) this.d;
                boolean z3 = true;
                if (function0 == null || (ordinal = ((i3q) this.c).ordinal()) == 0) {
                    function0 = null;
                } else if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                List j2 = szuVar.j();
                if (!(j2 instanceof Collection) || !j2.isEmpty()) {
                    Iterator it = j2.iterator();
                    while (it.hasNext()) {
                        izs izsVar = ((jzs) it.next()).g;
                        if (!Intrinsics.d(izsVar, hzs.a)) {
                            if (izsVar instanceof e6v) {
                                e6v e6vVar = (e6v) izsVar;
                                if (e6vVar instanceof b6v) {
                                    E = E(((b6v) e6vVar).a);
                                    if (E) {
                                        z = false;
                                        if (z || (function0 != null && !rzf.G((List) function0.invoke(), szuVar.j()))) {
                                            z3 = false;
                                        }
                                        return Boolean.valueOf(z3);
                                    }
                                } else if (!(e6vVar instanceof d6v)) {
                                    b6e.s();
                                }
                            } else {
                                b6e.s();
                            }
                            return null;
                        }
                        E = false;
                        if (E) {
                        }
                    }
                }
                z = true;
                if (z) {
                }
                z3 = false;
                return Boolean.valueOf(z3);
            default:
                szuVar.getClass();
                Function0 function02 = (Function0) this.d;
                boolean z4 = true;
                if (function02 == null || (ordinal2 = ((k3q) this.c).ordinal()) == 0 || ordinal2 == 1 || ordinal2 == 2) {
                    function02 = null;
                } else if (ordinal2 != 3) {
                    b6e.s();
                    return null;
                }
                List j3 = szuVar.j();
                if (!(j3 instanceof Collection) || !j3.isEmpty()) {
                    Iterator it2 = j3.iterator();
                    while (it2.hasNext()) {
                        izs izsVar2 = ((jzs) it2.next()).g;
                        if (!Intrinsics.d(izsVar2, hzs.a)) {
                            if (izsVar2 instanceof e6v) {
                                e6v e6vVar2 = (e6v) izsVar2;
                                if (e6vVar2 instanceof b6v) {
                                    F = F(((b6v) e6vVar2).a);
                                    if (F) {
                                        z2 = false;
                                        if (z2 || (function02 != null && !rzf.G((List) function02.invoke(), szuVar.j()))) {
                                            z4 = false;
                                        }
                                        return Boolean.valueOf(z4);
                                    }
                                } else if (!(e6vVar2 instanceof d6v)) {
                                    b6e.s();
                                }
                            } else {
                                b6e.s();
                            }
                            return null;
                        }
                        F = false;
                        if (F) {
                        }
                    }
                }
                z2 = true;
                if (z2) {
                }
                z4 = false;
                return Boolean.valueOf(z4);
        }
    }

    @Override // defpackage.hkq
    public void o(Canvas canvas, float f2, float f3, weo weoVar, int i2, float f4, int i3) {
        weoVar.getClass();
        Paint paint = (Paint) this.c;
        paint.setColor(i2);
        RectF rectF = (RectF) this.d;
        float f5 = ((lje) weoVar).i;
        rectF.left = f2 - f5;
        rectF.top = f3 - f5;
        rectF.right = f2 + f5;
        rectF.bottom = f3 + f5;
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), f5, paint);
    }

    @Override // defpackage.kzc
    public void onFailure(Throwable th) {
        ((b23) this.d).c.remove((String) this.b, (lcg) this.c);
    }

    @Override // defpackage.kzc
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // defpackage.e14
    public void p(c24 c24Var) {
        lwg H;
        c24Var.getClass();
        if (c24Var instanceof t14) {
            t14 t14Var = (t14) c24Var;
            H = g0g.D(t14Var.b, t14Var.c, t14Var.a.g);
        } else if (c24Var instanceof v14) {
            v14 v14Var = (v14) c24Var;
            H = g0g.D(v14Var.d, null, v14Var.c);
        } else if (c24Var instanceof y14) {
            H = g0g.D(((y14) c24Var).b, null, false);
        } else if (c24Var instanceof w14) {
            w14 w14Var = (w14) c24Var;
            H = g0g.D(w14Var.d, null, w14Var.c);
        } else if (c24Var instanceof u14) {
            u14 u14Var = (u14) c24Var;
            H = g0g.F(u14Var.b, u14Var.a.c);
        } else if (c24Var instanceof x14) {
            x14 x14Var = (x14) c24Var;
            H = g0g.H(x14Var.d, x14Var.c);
        } else if (c24Var instanceof z14) {
            z14 z14Var = (z14) c24Var;
            H = g0g.H(z14Var.b.a, z14Var.a.d);
        } else {
            if (!(c24Var instanceof a24)) {
                if (c24Var instanceof b24) {
                    return;
                }
                b6e.s();
                return;
            }
            a24 a24Var = (a24) c24Var;
            H = g0g.H(a24Var.b, a24Var.a.g);
        }
        szf.R((y) this.c, new qvg(H), d.p((nrf) this.d));
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 9:
                y4dVar.getClass();
                break;
            default:
                y4dVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        boolean z;
        naq naqVar;
        uow uowVar;
        int ordinal;
        boolean z2;
        naq naqVar2;
        uow uowVar2;
        int ordinal2;
        switch (this.a) {
            case 9:
                maqVar.getClass();
                Function0 function0 = (Function0) this.d;
                boolean z3 = true;
                if (function0 == null || (ordinal = ((i3q) this.c).ordinal()) == 0) {
                    function0 = null;
                } else if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                if (maqVar instanceof jbq) {
                    jbq jbqVar = (jbq) maqVar;
                    Set o2 = jbqVar.o();
                    if ((o2.size() == 1 ? o2 : null) != null && (naqVar = (naq) CollectionsKt.firstOrNull(jbqVar.n())) != null && (uowVar = naqVar.d) != null) {
                        izs I = q7g.I(uowVar);
                        if (I instanceof e6v) {
                            e6v e6vVar = (e6v) I;
                            if (e6vVar instanceof b6v) {
                                z = E(((b6v) e6vVar).a);
                            } else if (!(e6vVar instanceof d6v)) {
                                b6e.s();
                                return null;
                            }
                        } else if (!I.equals(hzs.a)) {
                            b6e.s();
                            return null;
                        }
                    }
                    z = false;
                } else {
                    if (!(maqVar instanceof eaq) && !(maqVar instanceof raq) && !(maqVar instanceof vaq)) {
                        b6e.s();
                        return null;
                    }
                    z = false;
                }
                if (!z || (function0 != null && !rzf.G((List) function0.invoke(), maqVar.j()))) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                maqVar.getClass();
                Function0 function02 = (Function0) this.d;
                boolean z4 = true;
                if (function02 == null || (ordinal2 = ((k3q) this.c).ordinal()) == 0 || ordinal2 == 1 || ordinal2 == 2) {
                    function02 = null;
                } else if (ordinal2 != 3) {
                    b6e.s();
                    return null;
                }
                if (maqVar instanceof jbq) {
                    jbq jbqVar2 = (jbq) maqVar;
                    Set o3 = jbqVar2.o();
                    if ((o3.size() == 1 ? o3 : null) != null && (naqVar2 = (naq) CollectionsKt.firstOrNull(jbqVar2.n())) != null && (uowVar2 = naqVar2.d) != null) {
                        izs I2 = q7g.I(uowVar2);
                        if (I2 instanceof e6v) {
                            e6v e6vVar2 = (e6v) I2;
                            if (e6vVar2 instanceof b6v) {
                                z2 = F(((b6v) e6vVar2).a);
                            } else if (!(e6vVar2 instanceof d6v)) {
                                b6e.s();
                                return null;
                            }
                        } else if (!I2.equals(hzs.a)) {
                            b6e.s();
                            return null;
                        }
                    }
                    z2 = false;
                } else {
                    if (!(maqVar instanceof eaq) && !(maqVar instanceof raq) && !(maqVar instanceof vaq)) {
                        b6e.s();
                        return null;
                    }
                    z2 = false;
                }
                if (!z2 || (function02 != null && !rzf.G((List) function02.invoke(), maqVar.j()))) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
        }
    }

    @Override // defpackage.y1r
    public float r(float f2, float f3) {
        return 0.0f;
    }

    public mu3 s() {
        return ((ou3) this.d).a.c;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 9:
                i3q i3qVar = (i3q) this.c;
                t1qVar.getClass();
                z3q z3qVar = t1qVar.a;
                boolean z = false;
                if (z3qVar instanceof c1q) {
                    if (i3qVar != i3q.b) {
                        z = Intrinsics.d(((c1q) z3qVar).c.a, (String) this.b);
                    }
                } else if (z3qVar instanceof a2q) {
                    if (i3qVar == i3q.b) {
                        z = ((a2q) z3qVar).a.d().equals(null);
                    }
                } else if (!(z3qVar instanceof r1q) && !(z3qVar instanceof e1q) && !(z3qVar instanceof h1q) && !(z3qVar instanceof k1q) && !(z3qVar instanceof u1q)) {
                    b6e.s();
                    return null;
                }
                return Boolean.valueOf(z);
            default:
                k3q k3qVar = (k3q) this.c;
                t1qVar.getClass();
                z3q z3qVar2 = t1qVar.a;
                boolean z2 = false;
                if (z3qVar2 instanceof e1q) {
                    if (k3qVar != k3q.d) {
                        z2 = Intrinsics.d(((e1q) z3qVar2).c.a, (String) this.b);
                    }
                } else if (z3qVar2 instanceof a2q) {
                    if (k3qVar == k3q.d) {
                        z2 = ((a2q) z3qVar2).a.d().equals(null);
                    }
                } else if (!(z3qVar2 instanceof c1q) && !(z3qVar2 instanceof r1q) && !(z3qVar2 instanceof h1q) && !(z3qVar2 instanceof k1q) && !(z3qVar2 instanceof u1q)) {
                    b6e.s();
                    return null;
                }
                return Boolean.valueOf(z2);
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 9:
                u7uVar.getClass();
                break;
            default:
                u7uVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    public long v() {
        gm7 gm7Var = (gm7) this.d;
        if (gm7Var != null) {
            return gm7Var.d;
        }
        return -1L;
    }

    @Override // defpackage.hkq
    public void w(Canvas canvas, RectF rectF) {
        Paint paint = (Paint) this.c;
        paint.setColor(((pje) this.b).b.h0());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, paint);
    }

    public jx7 y() {
        return ((ou3) this.d).a.a;
    }

    public /* synthetic */ nsh(int i2, boolean z) {
        this.a = i2;
    }

    public nsh(String str, fnb fnbVar) {
        this.a = 14;
        str.getClass();
        fnbVar.getClass();
        this.b = str;
        this.c = fnbVar;
        this.d = qld.m();
    }

    public nsh(CopyOnWriteArrayList copyOnWriteArrayList, c43 c43Var, mhm mhmVar) {
        this.a = 18;
        copyOnWriteArrayList.getClass();
        this.b = copyOnWriteArrayList;
        this.c = c43Var;
        this.d = new HashMap();
    }

    public nsh(pje pjeVar) {
        this.a = 25;
        this.b = pjeVar;
        this.c = new Paint();
        this.d = new RectF();
    }

    public nsh(Context context, boolean z, boolean z2) {
        this.a = 3;
        xdr a = ydr.a(Boolean.valueOf(z));
        this.b = a;
        this.c = new fkn(a);
        if (z2) {
            I(context);
        }
    }

    public nsh(int i2) {
        this.a = i2;
        switch (i2) {
            case 16:
                this.b = new e0h(16);
                long[] jArr = vso.a;
                this.c = new tpi();
                this.d = new i5l();
                break;
            default:
                this.b = gld.e(dm6.b);
                l18 l18Var = l18.b;
                bdt I = hag.I(t3g.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                this.c = (t3g) qdcVar.C(I);
                this.d = ydr.a(null);
                break;
        }
    }

    public nsh(yk ykVar, pu0 pu0Var, y yVar) {
        this.a = 8;
        ykVar.getClass();
        yVar.getClass();
        this.b = ykVar;
        this.c = pu0Var;
        this.d = yVar;
    }

    public nsh(Activity activity, y yVar, jfu jfuVar) {
        this.a = 12;
        activity.getClass();
        yVar.getClass();
        jfuVar.getClass();
        this.b = activity;
        this.c = yVar;
        this.d = jfuVar;
    }

    public nsh(hn5 hn5Var, y yVar, kxi kxiVar) {
        this.a = 27;
        hn5Var.getClass();
        yVar.getClass();
        this.b = hn5Var;
        this.c = yVar;
        this.d = kxiVar;
    }

    public nsh(Context context, String str, bn9 bn9Var, cn9 cn9Var) {
        this.a = 11;
        this.c = new Object();
        this.d = new HashMap();
        cg0 cg0Var = new cg0(context, str, bn9Var, this, cn9Var);
        eg0 eg0Var = new eg0();
        eg0Var.c = cg0Var;
        eg0Var.d = new LinkedHashSet();
        eg0Var.e = new LinkedHashSet();
        this.b = eg0Var;
    }

    public nsh(mm6 mm6Var) {
        this.a = 29;
        this.b = mm6Var;
        dq7 dq7Var = ca8.a;
        mn7.d.getClass();
        this.c = wkt.d.I0(1);
        this.d = rqi.a();
    }

    public nsh(phg phgVar, ttm ttmVar) {
        this.a = 6;
        phgVar.getClass();
        this.c = phgVar;
        this.d = ttmVar;
    }

    public nsh(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, String str, String str2, String str3) {
        this.a = 4;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = hashMap3;
    }

    public nsh(String str, i3q i3qVar, Function0 function0) {
        this.a = 9;
        str.getClass();
        this.b = str;
        this.c = i3qVar;
        this.d = function0;
    }

    public nsh(String str, k3q k3qVar, Function0 function0) {
        this.a = 13;
        str.getClass();
        this.b = str;
        this.c = k3qVar;
        this.d = function0;
    }

    public nsh(jac jacVar) {
        this.a = 2;
        this.c = null;
        this.d = null;
        this.b = jacVar;
    }

    public nsh(Context context, y yVar, s63 s63Var) {
        this.a = 23;
        context.getClass();
        yVar.getClass();
        s63Var.getClass();
        this.b = context;
        this.c = yVar;
        this.d = ((r04) s63Var.a).a();
    }

    public nsh(u2c u2cVar) {
        this.a = 21;
        this.b = u2cVar;
    }

    public nsh(ou3 ou3Var) {
        this.a = 22;
        this.d = ou3Var;
        this.b = new xzi(this);
    }

    public nsh(ys1 ys1Var) {
        this.a = 15;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.b = copyOnWriteArrayList;
        this.d = ys1Var;
        copyOnWriteArrayList.add(0, new gt1(this, "http", 80));
        u4r u4rVar = new u4r(this, "https", 443);
        ArrayList arrayList = new ArrayList();
        u4rVar.h = arrayList;
        u4rVar.i = new Hashtable();
        arrayList.add(new s4r());
        this.c = u4rVar;
        copyOnWriteArrayList.add(0, u4rVar);
        copyOnWriteArrayList.add(0, new k7e());
        fko fkoVar = new fko();
        fkoVar.a = new Hashtable();
        arrayList.add(fkoVar);
    }

    public nsh(Context context) {
        this.a = 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public nsh(ba6 ba6Var) {
        this.a = 19;
        this.d = new ArrayList();
        this.b = new fv2();
        this.c = ba6Var;
    }

    public nsh(b23 b23Var, String str, lcg lcgVar) {
        this.a = 20;
        this.d = b23Var;
        this.b = str;
        this.c = lcgVar;
    }

    public /* synthetic */ nsh(int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
