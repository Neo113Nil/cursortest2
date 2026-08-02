package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.compose.animation.c;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.app.f;
import androidx.core.app.s;
import androidx.core.app.u0;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.gson.JsonObject;
import com.yandex.music.shared.relay.common.proto.a;
import com.yandex.music.shared.relay.common.proto.d;
import com.yandex.music.shared.relay.common.proto.j;
import com.yandex.music.shared.relay.common.proto.p;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public abstract class etn {
    public static volatile k3i a;
    public static volatile k3i b;
    public static volatile k3i c;
    public static volatile k3i d;
    public static volatile apo e;
    public static final wn5 f = new wn5(new bo5(9), 1412390480, false);
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static final wn5 j;
    public static final wn5 k;
    public static final wn5 l;
    public static final wn5 m;
    public static final wn5 n;
    public static final wn5 o;
    public static final q p;
    public static final wvo q;
    public static final e3s r;
    public static final ehv s;
    public static final StackTraceElement[] t;

    static {
        new wn5(new bo5(10), 845711552, false);
        g = new wn5(new bo5(11), 37194075, false);
        h = new wn5(new jo5(11), -193658383, false);
        i = new wn5(new jo5(12), 793644545, false);
        j = new wn5(new rz3(6), 161937006, false);
        k = new wn5(new jo5(13), 821276859, false);
        l = new wn5(new jo5(14), 1506798451, false);
        m = new wn5(new jo5(15), -1669291622, false);
        n = new wn5(new po5(18), 153082328, false);
        o = new wn5(new dp5(24), -698549532, false);
        p = new q(18);
        int i2 = 23;
        q = new wvo(i2);
        r = new e3s(i2);
        s = new ehv(i2);
        t = new StackTraceElement[0];
    }

    public static final IntRange A(int i2, int i3, m2k m2kVar) {
        int i4 = i2 - 1;
        int i5 = m2kVar.g;
        int i6 = (i4 + i5) - 1;
        int i7 = i3 - 1;
        if (i4 < 0) {
            return new IntRange(0, Math.min(i5 - 1, i3), 1);
        }
        if (i6 <= i7) {
            return new IntRange(i4, i6, 1);
        }
        int i8 = (i7 - i5) + 1;
        return new IntRange(i8 >= 0 ? i8 : 0, i7, 1);
    }

    public static final CoverPath B(String str, WebPath$Storage webPath$Storage) {
        webPath$Storage.getClass();
        if (str != null && str.length() != 0) {
            return new jcv(str, webPath$Storage);
        }
        CoverPath none = CoverPath.none();
        none.getClass();
        return none;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8 A[Catch: all -> 0x00fb, Exception -> 0x00ff, TRY_ENTER, TryCatch #9 {Exception -> 0x00ff, all -> 0x00fb, blocks: (B:43:0x00da, B:45:0x00e8, B:47:0x00ec, B:50:0x0104, B:52:0x011e, B:54:0x0129, B:56:0x0146, B:58:0x014c, B:60:0x0158, B:62:0x015c, B:64:0x0165, B:100:0x0133, B:102:0x013e, B:104:0x01c8, B:105:0x01cf), top: B:42:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8 A[Catch: all -> 0x00fb, Exception -> 0x00ff, TryCatch #9 {Exception -> 0x00ff, all -> 0x00fb, blocks: (B:43:0x00da, B:45:0x00e8, B:47:0x00ec, B:50:0x0104, B:52:0x011e, B:54:0x0129, B:56:0x0146, B:58:0x014c, B:60:0x0158, B:62:0x015c, B:64:0x0165, B:100:0x0133, B:102:0x013e, B:104:0x01c8, B:105:0x01cf), top: B:42:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c A[Catch: all -> 0x00fb, Exception -> 0x00ff, TryCatch #9 {Exception -> 0x00ff, all -> 0x00fb, blocks: (B:43:0x00da, B:45:0x00e8, B:47:0x00ec, B:50:0x0104, B:52:0x011e, B:54:0x0129, B:56:0x0146, B:58:0x014c, B:60:0x0158, B:62:0x015c, B:64:0x0165, B:100:0x0133, B:102:0x013e, B:104:0x01c8, B:105:0x01cf), top: B:42:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158 A[Catch: all -> 0x00fb, Exception -> 0x00ff, TryCatch #9 {Exception -> 0x00ff, all -> 0x00fb, blocks: (B:43:0x00da, B:45:0x00e8, B:47:0x00ec, B:50:0x0104, B:52:0x011e, B:54:0x0129, B:56:0x0146, B:58:0x014c, B:60:0x0158, B:62:0x015c, B:64:0x0165, B:100:0x0133, B:102:0x013e, B:104:0x01c8, B:105:0x01cf), top: B:42:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c A[Catch: all -> 0x00fb, Exception -> 0x00ff, TryCatch #9 {Exception -> 0x00ff, all -> 0x00fb, blocks: (B:43:0x00da, B:45:0x00e8, B:47:0x00ec, B:50:0x0104, B:52:0x011e, B:54:0x0129, B:56:0x0146, B:58:0x014c, B:60:0x0158, B:62:0x015c, B:64:0x0165, B:100:0x0133, B:102:0x013e, B:104:0x01c8, B:105:0x01cf), top: B:42:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165 A[Catch: all -> 0x00fb, Exception -> 0x00ff, TRY_LEAVE, TryCatch #9 {Exception -> 0x00ff, all -> 0x00fb, blocks: (B:43:0x00da, B:45:0x00e8, B:47:0x00ec, B:50:0x0104, B:52:0x011e, B:54:0x0129, B:56:0x0146, B:58:0x014c, B:60:0x0158, B:62:0x015c, B:64:0x0165, B:100:0x0133, B:102:0x013e, B:104:0x01c8, B:105:0x01cf), top: B:42:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static av1 C(Context context) {
        av1 av1Var;
        Exception exc;
        Cursor cursor;
        Throwable th;
        Uri uri;
        Uri parse;
        String installerPackageName;
        Method t2;
        Method t3;
        Object y;
        context.getClass();
        Cursor cursor2 = null;
        try {
            t2 = gvt.t("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        } catch (Exception unused) {
            HashSet hashSet = j3c.a;
        }
        try {
            if (t2 != null) {
                Object y2 = gvt.y(null, t2, context);
                if ((y2 instanceof Integer) && y2.equals(0) && (t3 = gvt.t("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) != null && (y = gvt.y(null, t3, context)) != null) {
                    Method s2 = gvt.s(y.getClass(), "getId", new Class[0]);
                    Method s3 = gvt.s(y.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (s2 != null && s3 != null) {
                        av1Var = new av1();
                        av1Var.a = (String) gvt.y(y, s2, new Object[0]);
                        Boolean bool = (Boolean) gvt.y(y, s3, new Object[0]);
                        av1Var.e = bool != null ? bool.booleanValue() : false;
                        if (av1Var == null) {
                            zu1 zu1Var = new zu1();
                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            try {
                                if (context.bindService(intent, zu1Var, 1)) {
                                    try {
                                        yu1 yu1Var = new yu1(zu1Var.a());
                                        av1 av1Var2 = new av1();
                                        av1Var2.a = yu1Var.R();
                                        av1Var2.e = yu1Var.X();
                                        context.unbindService(zu1Var);
                                        av1Var = av1Var2;
                                    } catch (Exception unused2) {
                                        HashSet hashSet2 = j3c.a;
                                        context.unbindService(zu1Var);
                                    }
                                    if (av1Var == null) {
                                        av1Var = new av1();
                                    }
                                }
                                av1Var = null;
                                if (av1Var == null) {
                                }
                            } catch (Throwable th2) {
                                context.unbindService(zu1Var);
                                throw th2;
                            }
                        }
                        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                            throw new c3c("getAttributionIdentifiers cannot be called on the main thread.");
                        }
                        av1 av1Var3 = av1.f;
                        if (av1Var3 != null && System.currentTimeMillis() - av1Var3.b < 3600000) {
                            return av1Var3;
                        }
                        String[] strArr = {"aid", "androidid", "limit_tracking"};
                        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                        ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                        if (resolveContentProvider != null) {
                            String str = resolveContentProvider.packageName;
                            str.getClass();
                            if (m3c.a(context, str)) {
                                parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                uri = parse;
                                PackageManager packageManager = context.getPackageManager();
                                installerPackageName = packageManager != null ? packageManager.getInstallerPackageName(context.getPackageName()) : null;
                                if (installerPackageName != null) {
                                    av1Var.d = installerPackageName;
                                }
                                if (uri == null) {
                                    av1Var.b = System.currentTimeMillis();
                                    av1.f = av1Var;
                                } else {
                                    Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                                    if (query != null) {
                                        try {
                                            if (query.moveToFirst()) {
                                                int columnIndex = query.getColumnIndex("aid");
                                                int columnIndex2 = query.getColumnIndex("androidid");
                                                int columnIndex3 = query.getColumnIndex("limit_tracking");
                                                av1Var.c = query.getString(columnIndex);
                                                if (columnIndex2 > 0 && columnIndex3 > 0 && av1Var.a() == null) {
                                                    av1Var.a = query.getString(columnIndex2);
                                                    av1Var.e = Boolean.parseBoolean(query.getString(columnIndex3));
                                                }
                                                query.close();
                                                av1Var.b = System.currentTimeMillis();
                                                av1.f = av1Var;
                                                return av1Var;
                                            }
                                        } catch (Exception e2) {
                                            cursor = query;
                                            exc = e2;
                                            try {
                                                exc.toString();
                                                HashSet hashSet3 = j3c.a;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                return null;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor2 = cursor;
                                                if (cursor2 != null) {
                                                    throw th;
                                                }
                                                cursor2.close();
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor2 = query;
                                            th = th;
                                            if (cursor2 != null) {
                                            }
                                        }
                                    }
                                    av1Var.b = System.currentTimeMillis();
                                    av1.f = av1Var;
                                    if (query != null) {
                                        query.close();
                                    }
                                }
                                return av1Var;
                            }
                        }
                        if (resolveContentProvider2 != null) {
                            String str2 = resolveContentProvider2.packageName;
                            str2.getClass();
                            if (m3c.a(context, str2)) {
                                parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                uri = parse;
                                PackageManager packageManager2 = context.getPackageManager();
                                if (packageManager2 != null) {
                                }
                                if (installerPackageName != null) {
                                }
                                if (uri == null) {
                                }
                                return av1Var;
                            }
                        }
                        uri = null;
                        PackageManager packageManager22 = context.getPackageManager();
                        if (packageManager22 != null) {
                        }
                        if (installerPackageName != null) {
                        }
                        if (uri == null) {
                        }
                        return av1Var;
                    }
                }
            }
            if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            }
        } catch (Exception e3) {
            exc = e3;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
        }
        av1Var = null;
        if (av1Var == null) {
        }
    }

    public static k3i D() {
        k3i k3iVar;
        k3i k3iVar2 = b;
        if (k3iVar2 != null) {
            return k3iVar2;
        }
        synchronized (etn.class) {
            try {
                k3iVar = b;
                if (k3iVar == null) {
                    yk3 b2 = k3i.b();
                    b2.d = j3i.a;
                    b2.e = k3i.a("relay.RelayGrpcService", "CheckAuthorization");
                    b2.a = true;
                    m4b f2 = m4b.f();
                    z0c z0cVar = tym.a;
                    b2.b = new sym(f2);
                    b2.c = new sym(a.d);
                    k3iVar = b2.n();
                    b = k3iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k3iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList E(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        c3o c3oVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        d3o d3oVar = new d3o(resources, theme);
        synchronized (e3o.c) {
            try {
                SparseArray sparseArray = (SparseArray) e3o.b.get(d3oVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (c3oVar = (c3o) sparseArray.get(i2)) != null) {
                    if (c3oVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (c3oVar.c != 0) {
                            }
                            colorStateList2 = c3oVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = e3o.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = o95.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (e3o.c) {
            try {
                WeakHashMap weakHashMap = e3o.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(d3oVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(d3oVar, sparseArray2);
                }
                sparseArray2.append(i2, new c3o(colorStateList, d3oVar.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static Set F() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static k3i G() {
        k3i k3iVar;
        k3i k3iVar2 = d;
        if (k3iVar2 != null) {
            return k3iVar2;
        }
        synchronized (etn.class) {
            try {
                k3iVar = d;
                if (k3iVar == null) {
                    yk3 b2 = k3i.b();
                    b2.d = j3i.a;
                    b2.e = k3i.a("relay.RelayGrpcService", "InvokeCommand");
                    b2.a = true;
                    d dVar = d.c;
                    z0c z0cVar = tym.a;
                    b2.b = new sym(dVar);
                    b2.c = new sym(m4b.f());
                    k3iVar = b2.n();
                    d = k3iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k3iVar;
    }

    public static final String H(lt ltVar) {
        Album$AlbumType album$AlbumType = ltVar.b;
        album$AlbumType.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        skr skrVar = (skr) qdcVar.C(I);
        return album$AlbumType == Album$AlbumType.SINGLE ? skrVar.c(R.string.album_type_single) : skrVar.c(R.string.new_release_album);
    }

    public static k3i I() {
        k3i k3iVar;
        k3i k3iVar2 = c;
        if (k3iVar2 != null) {
            return k3iVar2;
        }
        synchronized (etn.class) {
            try {
                k3iVar = c;
                if (k3iVar == null) {
                    yk3 b2 = k3i.b();
                    b2.d = j3i.c;
                    b2.e = k3i.a("relay.RelayGrpcService", "StreamStateUpdates");
                    b2.a = true;
                    m4b f2 = m4b.f();
                    z0c z0cVar = tym.a;
                    b2.b = new sym(f2);
                    b2.c = new sym(j.e);
                    k3iVar = b2.n();
                    c = k3iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k3iVar;
    }

    public static String J(Context context, int i2) {
        dqg a2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
            a2 = systemService != null ? dqg.d(s.a(systemService)) : dqg.b;
        } else {
            a2 = dqg.a(f.e(context));
        }
        if (i3 <= 32 && !a2.c()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocales(a2.a.a);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i2);
    }

    public static k3i K() {
        k3i k3iVar;
        k3i k3iVar2 = a;
        if (k3iVar2 != null) {
            return k3iVar2;
        }
        synchronized (etn.class) {
            try {
                k3iVar = a;
                if (k3iVar == null) {
                    yk3 b2 = k3i.b();
                    b2.d = j3i.a;
                    b2.e = k3i.a("relay.RelayGrpcService", "Version");
                    b2.a = true;
                    p pVar = p.d;
                    z0c z0cVar = tym.a;
                    b2.b = new sym(pVar);
                    b2.c = new sym(pVar);
                    k3iVar = b2.n();
                    a = k3iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k3iVar;
    }

    public static zvc L(awc awcVar, SQLiteDatabase sQLiteDatabase) {
        awcVar.getClass();
        sQLiteDatabase.getClass();
        zvc zvcVar = (zvc) awcVar.a;
        if (zvcVar != null && Intrinsics.d(zvcVar.a, sQLiteDatabase)) {
            return zvcVar;
        }
        zvc zvcVar2 = new zvc(sQLiteDatabase);
        awcVar.a = zvcVar2;
        return zvcVar2;
    }

    public static final void M(mib mibVar, String str, Function1 function1) {
        p3i p3iVar = new p3i(Integer.MAX_VALUE);
        function1.invoke(p3iVar);
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : p3iVar.b.entrySet()) {
            t3i t3iVar = (t3i) entry.getValue();
            if (t3iVar instanceof s3i) {
                jsonObject.u((String) entry.getKey(), ((s3i) t3iVar).a);
            } else if (t3iVar instanceof r3i) {
                jsonObject.s(((r3i) t3iVar).a, (String) entry.getKey());
            } else {
                if (!(t3iVar instanceof q3i)) {
                    b6e.s();
                    return;
                }
                jsonObject.t((String) entry.getKey(), Boolean.valueOf(((q3i) t3iVar).a));
            }
        }
        String jsonElement = jsonObject.toString();
        jsonElement.getClass();
        mibVar.a(str, jsonElement);
    }

    public static Object N(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt == JSONObject.NULL) {
            return null;
        }
        return opt;
    }

    public static Object O(t7k t7kVar, JSONObject jSONObject, String str, arf arfVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            throw a8k.g(str, jSONObject);
        }
        try {
            Object a2 = ((py7) arfVar.getValue()).a(t7kVar, optJSONObject);
            if (a2 != null) {
                return a2;
            }
            throw a8k.e(jSONObject, str, null);
        } catch (Exception e2) {
            throw a8k.b(jSONObject, str, e2);
        }
    }

    public static Object P(String str, JSONObject jSONObject) {
        Object N = N(str, jSONObject);
        if (N != null) {
            return N;
        }
        throw a8k.g(str, jSONObject);
    }

    public static Object Q(JSONObject jSONObject, String str, Function1 function1, ywt ywtVar) {
        Object N = N(str, jSONObject);
        if (N == null) {
            throw a8k.g(str, jSONObject);
        }
        try {
            Object invoke = function1.invoke(N);
            if (invoke == null) {
                throw a8k.e(jSONObject, str, N);
            }
            try {
                if (ywtVar.a(invoke)) {
                    return invoke;
                }
                throw a8k.e(jSONObject, str, invoke);
            } catch (ClassCastException unused) {
                throw a8k.l(jSONObject, str, invoke);
            }
        } catch (ClassCastException unused2) {
            throw a8k.l(jSONObject, str, N);
        } catch (Exception e2) {
            throw a8k.f(jSONObject, str, N, e2);
        }
    }

    public static Object R(String str, JSONObject jSONObject) {
        vv8 vv8Var = vv8.v;
        Object N = N(str, jSONObject);
        if (N == null) {
            throw a8k.g(str, jSONObject);
        }
        try {
            Object invoke = vv8Var.invoke(N);
            if (invoke != null) {
                return invoke;
            }
            throw a8k.e(jSONObject, str, N);
        } catch (ClassCastException unused) {
            throw a8k.l(jSONObject, str, N);
        } catch (Exception e2) {
            throw a8k.f(jSONObject, str, N, e2);
        }
    }

    public static List S(t7k t7kVar, JSONObject jSONObject, String str, arf arfVar, mag magVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw a8k.g(str, jSONObject);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List list = Collections.EMPTY_LIST;
            try {
                if (!magVar.b(list)) {
                    t7kVar.a().a(a8k.e(jSONObject, str, list));
                }
                return list;
            } catch (ClassCastException unused) {
                t7kVar.a().a(a8k.l(jSONObject, str, list));
                return list;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                optJSONObject = null;
            }
            if (optJSONObject != null) {
                try {
                    Object a2 = ((py7) arfVar.getValue()).a(t7kVar, optJSONObject);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (Exception e2) {
                    t7kVar.a().a(a8k.a(optJSONArray, str, i2, e2));
                }
            }
        }
        try {
            if (magVar.b(arrayList)) {
                return arrayList;
            }
            throw a8k.e(jSONObject, str, arrayList);
        } catch (ClassCastException unused2) {
            throw a8k.l(jSONObject, str, arrayList);
        }
    }

    public static List T(t7k t7kVar, JSONObject jSONObject, String str, jyr jyrVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            throw a8k.g(str, jSONObject);
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                optJSONObject = null;
            }
            if (optJSONObject != null) {
                try {
                    Object a2 = ((py7) jyrVar.getValue()).a(t7kVar, optJSONObject);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (Exception e2) {
                    t7kVar.a().a(a8k.a(optJSONArray, str, i2, e2));
                }
            }
        }
        return arrayList;
    }

    public static Object U(t7k t7kVar, JSONObject jSONObject, String str, arf arfVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return ((py7) arfVar.getValue()).a(t7kVar, optJSONObject);
        } catch (Exception e2) {
            t7kVar.a().a(a8k.b(jSONObject, str, e2));
            return null;
        }
    }

    public static Object V(t7k t7kVar, JSONObject jSONObject, String str, ywt ywtVar) {
        Object N = N(str, jSONObject);
        if (N == null) {
            return null;
        }
        try {
            if (ywtVar.a(N)) {
                return N;
            }
            t7kVar.a().a(a8k.e(jSONObject, str, N));
            return null;
        } catch (ClassCastException unused) {
            t7kVar.a().a(a8k.l(jSONObject, str, N));
            return null;
        }
    }

    public static Object W(t7k t7kVar, JSONObject jSONObject, String str, Function1 function1) {
        Object N = N(str, jSONObject);
        if (N == null) {
            return null;
        }
        try {
            Object invoke = function1.invoke(N);
            if (invoke != null) {
                return invoke;
            }
            t7kVar.a().a(a8k.e(jSONObject, str, N));
            return null;
        } catch (ClassCastException unused) {
            t7kVar.a().a(a8k.l(jSONObject, str, N));
            return null;
        } catch (Exception e2) {
            t7kVar.a().a(a8k.f(jSONObject, str, N, e2));
            return null;
        }
    }

    public static Object X(t7k t7kVar, JSONObject jSONObject, Function1 function1) {
        Object N = N("type", jSONObject);
        if (N != null) {
            try {
                Object invoke = function1.invoke(N);
                if (invoke != null) {
                    return invoke;
                }
                t7kVar.a().a(a8k.e(jSONObject, "type", N));
                return null;
            } catch (ClassCastException unused) {
                t7kVar.a().a(a8k.l(jSONObject, "type", N));
            } catch (Exception e2) {
                t7kVar.a().a(a8k.f(jSONObject, "type", N, e2));
            }
        }
        return null;
    }

    public static List Y(t7k t7kVar, JSONObject jSONObject, String str, arf arfVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                optJSONObject = null;
            }
            if (optJSONObject != null) {
                try {
                    Object a2 = ((py7) arfVar.getValue()).a(t7kVar, optJSONObject);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (Exception e2) {
                    t7kVar.a().a(a8k.a(optJSONArray, str, i2, e2));
                }
            }
        }
        return arrayList;
    }

    public static List Z(t7k t7kVar, JSONObject jSONObject, String str, arf arfVar, mag magVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                List list = Collections.EMPTY_LIST;
                try {
                    if (magVar.b(list)) {
                        return list;
                    }
                    t7kVar.a().a(a8k.e(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    t7kVar.a().a(a8k.l(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
                    optJSONObject = null;
                }
                if (optJSONObject != null) {
                    try {
                        Object a2 = ((py7) arfVar.getValue()).a(t7kVar, optJSONObject);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    } catch (Exception e2) {
                        t7kVar.a().a(a8k.a(optJSONArray, str, i2, e2));
                    }
                }
            }
            try {
                if (magVar.b(arrayList)) {
                    return arrayList;
                }
                t7kVar.a().a(a8k.e(jSONObject, str, arrayList));
            } catch (ClassCastException unused2) {
                t7kVar.a().a(a8k.l(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }

    public static final void a(t4 t4Var, hq5 hq5Var, int i2) {
        t4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(697403950);
        int i3 = 4;
        int i4 = (oq5Var.h(t4Var) ? 4 : 2) | i2;
        int i5 = 0;
        if (oq5Var.P(i4 & 1, (i4 & 3) != 2)) {
            s4 s4Var = (s4) t4Var.c.getValue();
            String M = rvf.M(R.string.about_app_text, oq5Var);
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            o0k A = ogp.A(oq5Var);
            boolean f2 = oq5Var.f(s4Var);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new z4(s4Var, i5);
                oq5Var.k0(K);
            }
            xp3.d(M, a2, null, A, (Function0) K, null, false, false, null, null, null, ild.C(976455736, new u2(i3, s4Var), oq5Var), oq5Var, 0, 48, 2020);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new q2(t4Var, i2, 1);
        }
    }

    public static List a0(t7k t7kVar, JSONObject jSONObject, String str, mag magVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            if (length == 0) {
                List list = Collections.EMPTY_LIST;
                try {
                    if (magVar.b(list)) {
                        return list;
                    }
                    t7kVar.a().a(a8k.e(jSONObject, str, list));
                    return null;
                } catch (ClassCastException unused) {
                    t7kVar.a().a(a8k.l(jSONObject, str, list));
                    return null;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                Object opt = optJSONArray.opt(i2);
                if (opt == JSONObject.NULL) {
                    opt = null;
                }
                if (opt != null) {
                    try {
                        String str2 = (String) opt;
                        nw9 nw9Var = nw9.DATA_CHANGE;
                        if (!Intrinsics.d(str2, "data_change")) {
                            nw9Var = nw9.STATE_CHANGE;
                            if (!Intrinsics.d(str2, "state_change")) {
                                nw9Var = nw9.VISIBILITY_CHANGE;
                                if (!Intrinsics.d(str2, "visibility_change")) {
                                    nw9Var = null;
                                }
                            }
                        }
                        if (nw9Var != null) {
                            arrayList.add(nw9Var);
                        }
                    } catch (ClassCastException unused2) {
                        t7kVar.a().a(a8k.k(optJSONArray, str, i2, opt));
                    } catch (Exception e2) {
                        t7kVar.a().a(a8k.d(optJSONArray, str, i2, opt, e2));
                    }
                }
            }
            try {
                if (magVar.b(arrayList)) {
                    return arrayList;
                }
                t7kVar.a().a(a8k.e(jSONObject, str, arrayList));
            } catch (ClassCastException unused3) {
                t7kVar.a().a(a8k.l(jSONObject, str, arrayList));
                return null;
            }
        }
        return null;
    }

    public static final void b(d8t d8tVar, Function1 function1, yci yciVar, e9b e9bVar, vpb vpbVar, Function2 function2, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-891967166);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(d8tVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(e9bVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(vpbVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(function2) ? io.requery.android.database.sqlite.SQLiteDatabase.OPEN_SHAREDCACHE : io.requery.android.database.sqlite.SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i4 = i3 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if ((12582912 & i2) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if (!oq5Var.P(i4 & 1, (4793491 & i4) != 4793490)) {
            oq5Var.S();
        } else if (((Boolean) function1.invoke(d8tVar.d.getValue())).booleanValue() || ((Boolean) function1.invoke(d8tVar.c())).booleanValue() || d8tVar.g() || d8tVar.d()) {
            oq5Var.Z(1788522886);
            int i5 = i4 & 14;
            int i6 = i5 | 48;
            int i7 = i6 & 14;
            boolean z2 = ((i7 ^ 6) > 4 && oq5Var.f(d8tVar)) || (i6 & 6) == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = d8tVar.c();
                oq5Var.k0(K);
            }
            if (d8tVar.g()) {
                K = d8tVar.c();
            }
            oq5Var.Z(-466616829);
            r8b i0 = i0(d8tVar, function1, K, oq5Var);
            oq5Var.p(false);
            Object value = d8tVar.d.getValue();
            oq5Var.Z(-466616829);
            r8b i02 = i0(d8tVar, function1, value, oq5Var);
            oq5Var.p(false);
            int i8 = i7 | 3072;
            int i9 = i8t.a;
            int i10 = (i8 & 14) ^ 6;
            int i11 = i4;
            boolean z3 = (i10 > 4 && oq5Var.f(d8tVar)) || (i8 & 6) == 4;
            Object K2 = oq5Var.K();
            if (z3 || K2 == kjnVar) {
                K2 = new d8t(new cqi(i0), d8tVar, su4.o(new StringBuilder(), d8tVar.c, " > EnterExitTransition"));
                oq5Var.k0(K2);
            }
            d8t d8tVar2 = (d8t) K2;
            boolean f2 = ((i10 > 4 && oq5Var.f(d8tVar)) || (i8 & 6) == 4) | oq5Var.f(d8tVar2);
            Object K3 = oq5Var.K();
            int i12 = 18;
            if (f2 || K3 == kjnVar) {
                K3 = new gcp(i12, d8tVar, d8tVar2);
                oq5Var.k0(K3);
            }
            gld.k(d8tVar2, (Function1) K3, oq5Var);
            if (d8tVar.g()) {
                d8tVar2.j(i0, i02);
            } else {
                d8tVar2.k(i02);
                d8tVar2.k.setValue(Boolean.FALSE);
            }
            aqi o0 = szf.o0(function2, oq5Var);
            Object c2 = d8tVar2.c();
            x6k x6kVar = d8tVar2.d;
            Object invoke = function2.invoke(c2, x6kVar.getValue());
            boolean f3 = oq5Var.f(d8tVar2) | oq5Var.f(o0);
            Object K4 = oq5Var.K();
            if (f3 || K4 == kjnVar) {
                K4 = new k3(d8tVar2, o0, null, 12);
                oq5Var.k0(K4);
            }
            aqi i03 = szf.i0(oq5Var, invoke, (Function2) K4);
            Object c3 = d8tVar2.c();
            r8b r8bVar = r8b.c;
            if (c3 == r8bVar && x6kVar.getValue() == r8bVar && ((Boolean) i03.getValue()).booleanValue()) {
                oq5Var.Z(1790688794);
                z = false;
                oq5Var.p(false);
            } else {
                oq5Var.Z(1789551931);
                boolean z4 = i5 == 4;
                Object K5 = oq5Var.K();
                if (z4 || K5 == kjnVar) {
                    K5 = new bm0(d8tVar2);
                    oq5Var.k0(K5);
                }
                bm0 bm0Var = (bm0) K5;
                int i13 = i11 >> 6;
                yci a2 = c.a(d8tVar2, e9bVar, vpbVar, "Built-in", oq5Var, (i13 & 112) | 24576 | (i13 & 896));
                oq5Var.Z(1581779440);
                oq5Var.p(false);
                yci f4 = yciVar.f(a2.f(vci.a));
                Object K6 = oq5Var.K();
                if (K6 == kjnVar) {
                    K6 = new il0(bm0Var);
                    oq5Var.k0(K6);
                }
                il0 il0Var = (il0) K6;
                int i14 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, f4);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, il0Var, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i14))) {
                    ouj.x(i14, oq5Var, i14, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                wn5Var.invoke(bm0Var, oq5Var, Integer.valueOf((i11 >> 18) & 112));
                oq5Var.p(true);
                z = false;
                oq5Var.p(false);
            }
            oq5Var.p(z);
        } else {
            oq5Var.Z(1790694746);
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new rl0(d8tVar, function1, yciVar, e9bVar, vpbVar, function2, wn5Var, i2);
        }
    }

    public static String b0(JSONObject jSONObject) {
        Object N = N("type", jSONObject);
        if (N == null) {
            throw a8k.g("type", jSONObject);
        }
        try {
            return (String) N;
        } catch (ClassCastException unused) {
            throw a8k.l(jSONObject, "type", N);
        } catch (Exception e2) {
            throw a8k.f(jSONObject, "type", N, e2);
        }
    }

    public static final void c(cqi cqiVar, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, hq5 hq5Var, int i2) {
        yci yciVar2;
        String str2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-222898426);
        int i3 = i2 | (oq5Var.f(cqiVar) ? 4 : 2) | 48 | (oq5Var.f(e9bVar) ? 256 : 128) | (oq5Var.f(vpbVar) ? 2048 : 1024) | 24576;
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 << 3;
            vci vciVar = vci.a;
            i(i8t.d(cqiVar, oq5Var, (i3 & 14) | 48), d5.w0, vciVar, e9bVar, vpbVar, wn5Var, oq5Var, (i4 & 57344) | (i4 & 7168) | 432 | 196608);
            str2 = "AnimatedVisibility";
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
            str2 = str;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ul0(cqiVar, yciVar2, e9bVar, vpbVar, str2, wn5Var, i2, 1);
        }
    }

    public static Intent c0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 33 ? woe.w(context, broadcastReceiver, intentFilter) : i2 >= 26 ? fx1.k(context, broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, null, null);
    }

    public static final void d(d8t d8tVar, Function1 function1, e9b e9bVar, vpb vpbVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        wn5 wn5Var2;
        vpb vpbVar2;
        e9b e9bVar2;
        Function1 function12;
        d8t d8tVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1031950689);
        int i3 = (oq5Var.f(d8tVar) ? 4 : 2) | i2;
        int i4 = i2 & 384;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i3 |= oq5Var.f(vciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(e9bVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(vpbVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(wn5Var) ? io.requery.android.database.sqlite.SQLiteDatabase.OPEN_SHAREDCACHE : io.requery.android.database.sqlite.SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            i(d8tVar, function1, vciVar, e9bVar, vpbVar, wn5Var, oq5Var, i3 & 524286);
            d8tVar2 = d8tVar;
            function12 = function1;
            e9bVar2 = e9bVar;
            vpbVar2 = vpbVar;
            wn5Var2 = wn5Var;
        } else {
            wn5Var2 = wn5Var;
            vpbVar2 = vpbVar;
            e9bVar2 = e9bVar;
            function12 = function1;
            d8tVar2 = d8tVar;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new vl0(d8tVar2, function12, e9bVar2, vpbVar2, wn5Var2, i2);
        }
    }

    public static final List d0(List list, nnq nnqVar, qnq qnqVar, hq5 hq5Var) {
        list.getClass();
        nnqVar.getClass();
        qnqVar.getClass();
        boolean f2 = ((oq5) hq5Var).f(list) | ((oq5) hq5Var).f(nnqVar);
        oq5 oq5Var = (oq5) hq5Var;
        boolean f3 = f2 | oq5Var.f(qnqVar);
        Object K = oq5Var.K();
        if (f3 || K == gq5.a) {
            K = j0(list, nnqVar, qnqVar);
            oq5Var.k0(K);
        }
        return (List) K;
    }

    public static final void e(boolean z, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        String str2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1741346906);
        if ((i2 & 48) == 0) {
            i3 = (oq5Var.g(z) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.f(e9bVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.f(vpbVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            i5 |= oq5Var.h(wn5Var) ? 1048576 : 524288;
        }
        if (oq5Var.P(i5 & 1, (599185 & i5) != 599184)) {
            int i6 = i5 >> 3;
            vci vciVar = vci.a;
            i(i8t.e(Boolean.valueOf(z), "AnimatedVisibility", oq5Var, (i6 & 14) | ((i5 >> 12) & 112), 0), d5.Z, vciVar, e9bVar, vpbVar, wn5Var, oq5Var, (i5 & 57344) | (i5 & 896) | 48 | (i5 & 7168) | (458752 & i6));
            str2 = "AnimatedVisibility";
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
            str2 = str;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new xl0(z, yciVar2, e9bVar, vpbVar, str2, wn5Var, i2);
        }
    }

    public static final f83 e0(oq5 oq5Var) {
        boolean booleanValue = ((Boolean) oq5Var.j((agr) jkg.d.c)).booleanValue();
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = booleanValue ? new h83(new cib(5)) : e83.a;
            oq5Var.k0(K);
        }
        return (f83) K;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(boolean z, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        vpb vpbVar2;
        int i6;
        String str2;
        yci yciVar3;
        vpb vpbVar3;
        String str3;
        xmn r2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2088733774);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i4 |= oq5Var.f(e9bVar) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                vpbVar2 = vpbVar;
                i4 |= oq5Var.f(vpbVar2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    str2 = str;
                    i4 |= oq5Var.f(str2) ? 16384 : RemoteCameraConfig.Notification.ID;
                    if ((196608 & i2) == 0) {
                        i4 |= oq5Var.h(wn5Var) ? io.requery.android.database.sqlite.SQLiteDatabase.OPEN_SHAREDCACHE : io.requery.android.database.sqlite.SQLiteDatabase.OPEN_FULLMUTEX;
                    }
                    if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
                        oq5Var.S();
                        yciVar3 = yciVar2;
                        vpbVar3 = vpbVar2;
                        str3 = str2;
                    } else {
                        yci yciVar4 = i7 != 0 ? vci.a : yciVar2;
                        vpb a2 = i5 != 0 ? c.i().a(c.f(null, 3)) : vpbVar2;
                        String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                        int i8 = i4 << 3;
                        vpb vpbVar4 = a2;
                        i(i8t.e(Boolean.valueOf(z), str4, oq5Var, (i4 & 14) | ((i4 >> 9) & 112), 0), d5.Y, yciVar4, e9bVar, vpbVar4, wn5Var, oq5Var, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i4 & 458752));
                        str3 = str4;
                        yciVar3 = yciVar4;
                        vpbVar3 = vpbVar4;
                    }
                    r2 = oq5Var.r();
                    if (r2 == null) {
                        r2.d = new wl0(z, yciVar3, e9bVar, vpbVar3, str3, wn5Var, i2, i3, 0);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((196608 & i2) == 0) {
                }
                if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
                }
                r2 = oq5Var.r();
                if (r2 == null) {
                }
            }
            vpbVar2 = vpbVar;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str2 = str;
            if ((196608 & i2) == 0) {
            }
            if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
            }
            r2 = oq5Var.r();
            if (r2 == null) {
            }
        }
        yciVar2 = yciVar;
        if ((i2 & 384) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        vpbVar2 = vpbVar;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str2 = str;
        if ((196608 & i2) == 0) {
        }
        if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
        }
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static final ivd f0(String str, fud fudVar, pjc pjcVar, hq5 hq5Var, int i2, int i3) {
        str.getClass();
        fudVar.getClass();
        pjcVar.getClass();
        boolean z = (i3 & 8) != 0;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new fs5(gld.R(dm6.b(), oq5Var));
            oq5Var.k0(K);
        }
        mm6 mm6Var = ((fs5) K).a;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        cce cceVar = (cce) oq5Var.j(tkg.a);
        Continuation continuation = null;
        fud fudVar2 = !fudVar.c().equals(cud.a) ? fudVar : null;
        if (fudVar2 == null) {
            oq5Var.Z(-1197288599);
            fudVar2 = vnj.O(fudVar.e(), new aud(str), oq5Var);
            oq5Var.p(false);
        } else {
            oq5Var.Z(-1197291544);
            oq5Var.p(false);
        }
        fud fudVar3 = fudVar2;
        boolean f2 = oq5Var.f(str) | oq5Var.f(mm6Var) | oq5Var.f(context) | oq5Var.f(fudVar3);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            ivd ivdVar = new ivd(str, mm6Var, d85.n, context, cceVar, z, fudVar3);
            oq5Var.k0(ivdVar);
            K2 = ivdVar;
        }
        ivd ivdVar2 = (ivd) K2;
        boolean h2 = oq5Var.h(pjcVar) | oq5Var.f(ivdVar2);
        Object K3 = oq5Var.K();
        if (h2 || K3 == kjnVar) {
            K3 = new ptd(pjcVar, ivdVar2, continuation, 1);
            oq5Var.k0(K3);
        }
        gld.y(ivdVar2, pjcVar, (Function2) K3, oq5Var);
        return ivdVar2;
    }

    public static final void g(cqi cqiVar, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, hq5 hq5Var, int i2) {
        String str2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(836509870);
        int i3 = i2 | (oq5Var.f(cqiVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | (oq5Var.f(vpbVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if (oq5Var.P(i3 & 1, (599185 & i3) != 599184)) {
            i(i8t.d(cqiVar, oq5Var, ((i3 >> 3) & 14) | 48), d5.x0, yciVar, e9bVar, vpbVar, wn5Var, oq5Var, (i3 & 57344) | (i3 & 896) | 3120 | 196608);
            str2 = "AnimatedVisibility";
        } else {
            oq5Var.S();
            str2 = str;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ul0(cqiVar, yciVar, e9bVar, vpbVar, str2, wn5Var, i2, 0);
        }
    }

    public static final void g0(s7e s7eVar, u7e u7eVar) {
        Iterator it = u7eVar.h().iterator();
        while (it.hasNext()) {
            s7eVar.l((String) it.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(boolean z, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        vpb vpbVar2;
        int i4;
        yci yciVar2;
        String str2;
        vpb vpbVar3;
        xmn r2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1766503102);
        int i5 = (oq5Var.g(z) ? 32 : 16) | i2;
        int i6 = i5 | 384;
        int i7 = i3 & 8;
        if (i7 != 0) {
            i6 = i5 | 24960;
        } else if ((i2 & 24576) == 0) {
            vpbVar2 = vpbVar;
            i6 |= oq5Var.f(vpbVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i6 | 196608;
            if (oq5Var.P(i4 & 1, (599185 & i4) == 599184)) {
                oq5Var.S();
                yciVar2 = yciVar;
                str2 = str;
                vpbVar3 = vpbVar2;
            } else {
                if (i7 != 0) {
                    vpbVar2 = c.f(null, 3).a(c.j());
                }
                vpb vpbVar4 = vpbVar2;
                vci vciVar = vci.a;
                i(i8t.e(Boolean.valueOf(z), "AnimatedVisibility", oq5Var, ((i4 >> 3) & 14) | 48, 0), d5.v0, vciVar, e9bVar, vpbVar4, wn5Var, oq5Var, (57344 & i4) | 200112);
                str2 = "AnimatedVisibility";
                yciVar2 = vciVar;
                vpbVar3 = vpbVar4;
            }
            r2 = oq5Var.r();
            if (r2 == null) {
                r2.d = new wl0(z, yciVar2, e9bVar, vpbVar3, str2, wn5Var, i2, i3, 1);
                return;
            }
            return;
        }
        vpbVar2 = vpbVar;
        i4 = i6 | 196608;
        if (oq5Var.P(i4 & 1, (599185 & i4) == 599184)) {
        }
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static void h0(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            fx1.o(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static final void i(d8t d8tVar, Function1 function1, yci yciVar, e9b e9bVar, vpb vpbVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        e9b e9bVar2;
        vpb vpbVar2;
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(429978603);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(d8tVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            e9bVar2 = e9bVar;
            i3 |= oq5Var.f(e9bVar2) ? 2048 : 1024;
        } else {
            e9bVar2 = e9bVar;
        }
        if ((i2 & 24576) == 0) {
            vpbVar2 = vpbVar;
            i3 |= oq5Var.f(vpbVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            vpbVar2 = vpbVar;
        }
        if ((i2 & 196608) == 0) {
            wn5Var2 = wn5Var;
            i3 |= oq5Var.h(wn5Var2) ? io.requery.android.database.sqlite.SQLiteDatabase.OPEN_SHAREDCACHE : io.requery.android.database.sqlite.SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            wn5Var2 = wn5Var;
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new yl0(0, function1, d8tVar);
                oq5Var.k0(K);
            }
            b(d8tVar, function1, androidx.compose.ui.layout.a.b(yciVar, (pyc) K), e9bVar2, vpbVar2, af0.H, wn5Var2, oq5Var, 196608 | i5 | i4 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128));
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new al0(d8tVar, function1, yciVar, e9bVar, vpbVar, wn5Var, i2);
        }
    }

    public static final r8b i0(d8t d8tVar, Function1 function1, Object obj, hq5 hq5Var) {
        r8b r8bVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.W(-902032957, d8tVar);
        if (d8tVar.g()) {
            oq5Var.Z(2101770115);
            oq5Var.p(false);
            r8bVar = ((Boolean) function1.invoke(obj)).booleanValue() ? r8b.b : ((Boolean) function1.invoke(d8tVar.c())).booleanValue() ? r8b.c : r8b.a;
        } else {
            oq5Var.Z(2102044248);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            if (((Boolean) function1.invoke(d8tVar.c())).booleanValue()) {
                aqiVar.setValue(Boolean.TRUE);
            }
            r8bVar = ((Boolean) function1.invoke(obj)).booleanValue() ? r8b.b : ((Boolean) aqiVar.getValue()).booleanValue() ? r8b.c : r8b.a;
            oq5Var.p(false);
        }
        oq5Var.p(false);
        return r8bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(o0k o0kVar, c81 c81Var, t71 t71Var, fvf fvfVar, yci yciVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        xmn r2;
        t71Var.getClass();
        fvfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2131071821);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(o0kVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(c81Var) ? 32 : 16;
        }
        int i5 = i4 | (oq5Var.f(t71Var) ? 256 : 128) | (oq5Var.f(fvfVar) ? 2048 : 1024);
        int i6 = i3 & 16;
        if (i6 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if (oq5Var.P(i5 & 1, (i5 & 9363) == 9362)) {
                oq5Var.S();
            } else {
                yci yciVar3 = i6 != 0 ? vci.a : yciVar2;
                tt0.g(c81Var, yciVar3, null, "familiarCollectionCrossfade", ild.C(966743385, new xk(7, o0kVar, fvfVar, t71Var), oq5Var), oq5Var, ((i5 >> 3) & 14) | 27648 | ((i5 >> 9) & 112), 4);
                yciVar2 = yciVar3;
            }
            r2 = oq5Var.r();
            if (r2 == null) {
                r2.d = new cj((Object) o0kVar, (Object) c81Var, (Object) t71Var, (Object) fvfVar, yciVar2, i2, i3, 1);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var.P(i5 & 1, (i5 & 9363) == 9362)) {
        }
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static final ArrayList j0(List list, nnq nnqVar, qnq qnqVar) {
        list.getClass();
        nnqVar.getClass();
        qnqVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rnq rnqVar = (rnq) it.next();
            rnqVar.getClass();
            prf a2 = nnqVar.a(rnqVar.a().a().b);
            rrf a3 = a2 != null ? a2.a().a(rnqVar, qnqVar) : null;
            rrf rrfVar = a3 != null ? a3 : null;
            if (rrfVar != null) {
                arrayList.add(rrfVar);
            }
        }
        return arrayList;
    }

    public static final void k(fvf fvfVar, j25 j25Var, tmb tmbVar, Function0 function0, hq5 hq5Var, int i2) {
        iz2 iz2Var = b2c.c;
        fvfVar.getClass();
        j25Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(701593257);
        int i3 = i2 | (oq5Var.f(fvfVar) ? 4 : 2) | (oq5Var.h(j25Var) ? 32 : 16) | (oq5Var.h(tmbVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            m25 m25Var = (m25) szf.Q(j25Var.c, oq5Var).getValue();
            boolean z = m25Var instanceof l25;
            vci vciVar = vci.a;
            kjn kjnVar = gq5.a;
            int i4 = 6;
            if (z) {
                oq5Var.Z(1854236207);
                l25 l25Var = (l25) m25Var;
                c3x.t(fvfVar, l25Var.b, oq5Var, i3 & 14);
                yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.d.c(vciVar, 1.0f), "playlist_list_content_tab");
                vm C = ghh.C(ghh.C(androidx.compose.foundation.layout.a.c(0.0f, 12, 0.0f, 0.0f, 13), zs4.g(oq5Var)), ogp.A(oq5Var));
                boolean f2 = oq5Var.f(m25Var) | oq5Var.h(j25Var);
                Object K = oq5Var.K();
                if (f2 || K == kjnVar) {
                    K = new ny2(5, l25Var, j25Var);
                    oq5Var.k0(K);
                }
                weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 << 3) & 112) | 6, 504);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else if (Intrinsics.d(m25Var, k25.a)) {
                oq5Var.Z(1855969882);
                yci a3 = androidx.compose.ui.platform.a.a(bfg.Q(androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), 1.0f), bfg.C(oq5Var), false, 14), "playlist_list_content_tab_liked_empty_screen");
                kfh d2 = ug3.d(b2c.b, false);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, a3);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                xv7.j(rvf.M(R.string.empty_you_liked_playlist_list_description, oq5Var), androidx.compose.foundation.layout.a.q(b.a.a(vciVar, iz2Var), 0.0f, 52, 0.0f, 0.0f, 13), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65272);
                oq5Var.p(true);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(m25Var, k25.b)) {
                    throw vz1.i(oq5Var, -78735192, false);
                }
                oq5Var.Z(1856822754);
                yci a4 = androidx.compose.ui.platform.a.a(bfg.Q(androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(zs4.g(oq5Var), ogp.A(oq5Var))), 1.0f), bfg.C(oq5Var), false, 14), "playlist_list_content_tab_offline_empty_screen");
                kfh d3 = ug3.d(iz2Var, false);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, a4);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, wp5.f);
                g0g.U(oq5Var, l3, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var2);
                }
                g0g.U(oq5Var, H2, wp5.d);
                boolean z2 = (i3 & 7168) == 2048;
                Object K2 = oq5Var.K();
                if (z2 || K2 == kjnVar) {
                    K2 = new ex(i4, function0);
                    oq5Var.k0(K2);
                }
                rvf.j((Function1) K2, tmbVar, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 48, 0.0f, 0.0f, 13), 0, false, null, oq5Var, 448 | ((i3 >> 3) & 112), 56);
                oq5Var.p(true);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wl(i2, 27, fvfVar, j25Var, tmbVar, function0);
        }
    }

    public static final void k0(fgp fgpVar, Object obj) {
        Object c2 = fgpVar.c(obj);
        if (!(c2 instanceof fd4)) {
            return;
        }
        Object obj2 = ((gd4) x97.D(g.a, new rc4(fgpVar, obj, null, 1))).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(qzm qzmVar, Function2 function2, hq5 hq5Var, int i2) {
        vwt vwtVar;
        boolean z;
        xmn r2;
        j4x u;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1350970552);
        iqe iqeVar = oq5Var.w;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        oq5Var.V(201, pq5.b);
        Object K = oq5Var.K();
        if (Intrinsics.d(K, gq5.a)) {
            vwtVar = null;
        } else {
            K.getClass();
            vwtVar = (vwt) K;
        }
        ozm ozmVar = qzmVar.a;
        Object c2 = ozmVar.c(qzmVar, vwtVar);
        boolean equals = c2.equals(vwtVar);
        if (!equals) {
            oq5Var.k0(c2);
        }
        if (oq5Var.O) {
            if ((qzmVar.f || !l2.containsKey(ozmVar)) && (u = l2.d.u(ozmVar.hashCode(), ozmVar, c2, 0)) != null) {
                l2 = new androidx.compose.runtime.internal.a((aat) u.c, l2.e + u.b);
            }
            oq5Var.I = true;
        } else {
            exq exqVar = oq5Var.F;
            Object b2 = exqVar.b(exqVar.b, exqVar.g);
            b2.getClass();
            androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) b2;
            if (!(oq5Var.z() && equals) && (qzmVar.f || !l2.containsKey(ozmVar))) {
                j4x u2 = l2.d.u(ozmVar.hashCode(), ozmVar, c2, 0);
                if (u2 != null) {
                    l2 = new androidx.compose.runtime.internal.a((aat) u2.c, l2.e + u2.b);
                }
            } else if ((equals && !oq5Var.v) || !oq5Var.v) {
                l2 = aVar;
            }
            if (oq5Var.x || aVar != l2) {
                z = true;
                if (z && !oq5Var.O) {
                    oq5Var.I(l2);
                }
                iqeVar.d(oq5Var.v ? 1 : 0);
                oq5Var.v = z;
                oq5Var.J = l2;
                oq5Var.T(202, pq5.c, l2, 0);
                function2.invoke(oq5Var, Integer.valueOf((i2 >> 3) & 14));
                oq5Var.p(false);
                oq5Var.p(false);
                oq5Var.v = iqeVar.c() != 0;
                oq5Var.J = null;
                r2 = oq5Var.r();
                if (r2 == null) {
                    r2.d = new kg0(qzmVar, function2, i2, 6);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            oq5Var.I(l2);
        }
        iqeVar.d(oq5Var.v ? 1 : 0);
        oq5Var.v = z;
        oq5Var.J = l2;
        oq5Var.T(202, pq5.c, l2, 0);
        function2.invoke(oq5Var, Integer.valueOf((i2 >> 3) & 14));
        oq5Var.p(false);
        oq5Var.p(false);
        oq5Var.v = iqeVar.c() != 0;
        oq5Var.J = null;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static void l0(t7k t7kVar, JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(qzm[] qzmVarArr, Function2 function2, hq5 hq5Var, int i2) {
        androidx.compose.runtime.internal.a j0;
        boolean z;
        xmn r2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1390796515);
        iqe iqeVar = oq5Var.w;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        oq5Var.V(201, pq5.b);
        if (oq5Var.O) {
            j0 = oq5Var.j0(l2, weo.T(qzmVarArr, l2, androidx.compose.runtime.internal.a.g));
            oq5Var.I = true;
        } else {
            exq exqVar = oq5Var.F;
            Object h2 = exqVar.h(exqVar.g, 0);
            h2.getClass();
            androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) h2;
            exq exqVar2 = oq5Var.F;
            Object h3 = exqVar2.h(exqVar2.g, 1);
            h3.getClass();
            androidx.compose.runtime.internal.a aVar2 = (androidx.compose.runtime.internal.a) h3;
            androidx.compose.runtime.internal.a T = weo.T(qzmVarArr, l2, aVar2);
            if (oq5Var.z() && !oq5Var.x && aVar2.equals(T)) {
                oq5Var.k = oq5Var.F.q() + oq5Var.k;
                j0 = aVar;
            } else {
                j0 = oq5Var.j0(l2, T);
                if (oq5Var.x || !Intrinsics.d(j0, aVar)) {
                    z = true;
                    if (z && !oq5Var.O) {
                        oq5Var.I(j0);
                    }
                    iqeVar.d(oq5Var.v ? 1 : 0);
                    oq5Var.v = z;
                    oq5Var.J = j0;
                    oq5Var.T(202, pq5.c, j0, 0);
                    function2.invoke(oq5Var, Integer.valueOf((i2 >> 3) & 14));
                    oq5Var.p(false);
                    oq5Var.p(false);
                    oq5Var.v = iqeVar.c() != 0;
                    oq5Var.J = null;
                    r2 = oq5Var.r();
                    if (r2 == null) {
                        r2.d = new kg0(qzmVarArr, function2, i2, 5);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            oq5Var.I(j0);
        }
        iqeVar.d(oq5Var.v ? 1 : 0);
        oq5Var.v = z;
        oq5Var.J = j0;
        oq5Var.T(202, pq5.c, j0, 0);
        function2.invoke(oq5Var, Integer.valueOf((i2 >> 3) & 14));
        oq5Var.p(false);
        oq5Var.p(false);
        oq5Var.v = iqeVar.c() != 0;
        oq5Var.J = null;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static void m0(t7k t7kVar, JSONObject jSONObject, String str, Object obj, arf arfVar) {
        if (obj != null) {
            try {
                jSONObject.put(str, ((gip) arfVar.getValue()).b(t7kVar, obj));
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
    }

    public static final void n(qw qwVar, yci yciVar, hq5 hq5Var, int i2) {
        long j2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2063978348);
        if ((((oq5Var.h(qwVar) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            u9b u9bVar = qwVar.c;
            Integer d2 = u9bVar.d();
            d85 d85Var = d2 != null ? new d85(d85.b(c3x.f(d2.intValue()), 0.33f, 0.0f, 0.0f, 0.0f, 14)) : null;
            if (d85Var == null) {
                oq5Var.Z(791706719);
                j2 = ((dq0) oq5Var.j(eq0.a)).c.c;
                oq5Var.p(false);
            } else {
                oq5Var.Z(791704394);
                oq5Var.p(false);
                j2 = d85Var.a;
            }
            zc4.m(j2, ild.C(1573328740, new sh1(28, yciVar, u9bVar, qwVar), oq5Var), oq5Var, 48, 0);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wi7(qwVar, yciVar, i2, 0);
        }
    }

    public static void n0(t7k t7kVar, JSONObject jSONObject, String str, List list, arf arfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < size; i2++) {
            jSONArray.put(((gip) arfVar.getValue()).b(t7kVar, list.get(i2)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e2) {
            t7kVar.a().a(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r9.K(), java.lang.Integer.valueOf(r4)) == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(iwm iwmVar, qw qwVar, float f2, yci yciVar, hq5 hq5Var, int i2) {
        vci vciVar;
        kx0 kx0Var;
        Object obj;
        Object obj2;
        kx0 kx0Var2;
        grb grbVar;
        int i3;
        Object obj3;
        Object K;
        qw qwVar2 = qwVar;
        iwmVar.getClass();
        qwVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(749427716);
        if (((i2 | (oq5Var.h(iwmVar) ? 4 : 2) | (oq5Var.h(qwVar2) ? 32 : 16) | (oq5Var.c(f2) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024)) & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K2 = oq5Var.K();
            Object obj4 = gq5.a;
            if (K2 == obj4) {
                K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K2).a;
            tw twVar = qwVar2.a;
            boolean f3 = oq5Var.f(twVar);
            Object K3 = oq5Var.K();
            if (f3 || K3 == obj4) {
                K3 = iwmVar.a(twVar, mm6Var);
                oq5Var.k0(K3);
            }
            bc5 bc5Var = (bc5) K3;
            ynn i4 = irv.i(oq5Var);
            oq5Var.Z(-1354416881);
            oq5Var.Z(-1354431738);
            oq5Var.Z(-1354446679);
            float f4 = 16;
            yci o2 = androidx.compose.foundation.layout.a.o(androidx.compose.ui.platform.a.a(yciVar, "album_promo_block"), f4, 0.0f, 2);
            boolean h2 = oq5Var.h(iwmVar) | oq5Var.h(qwVar2);
            Object K4 = oq5Var.K();
            if (h2 || K4 == obj4) {
                K4 = new xi7(iwmVar, qwVar2, 0);
                oq5Var.k0(K4);
            }
            yci b2 = com.yandex.music.core.ui.compose.a.b(o2, i4, 0L, 0.0f, null, (Function2) K4, 14);
            wzn wznVar = twVar.b;
            wzn wznVar2 = twVar.b;
            diu diuVar = wznVar != null ? wznVar.a : null;
            vci vciVar2 = vci.a;
            if (diuVar != null) {
                long j2 = diuVar.b;
                boolean h3 = oq5Var.h(iwmVar) | oq5Var.h(diuVar);
                Object K5 = oq5Var.K();
                if (h3 || K5 == obj4) {
                    K5 = new yi7(iwmVar, diuVar, 0);
                    oq5Var.k0(K5);
                }
                b2 = b2.f(com.yandex.music.core.ui.compose.a.b(vciVar2, i4, j2, Float.MIN_VALUE, null, (Function2) K5, 8));
            }
            boolean z = false;
            oq5Var.p(false);
            diu diuVar2 = wznVar2 != null ? wznVar2.b : null;
            if (diuVar2 != null) {
                long j3 = diuVar2.b;
                boolean h4 = oq5Var.h(iwmVar) | oq5Var.h(diuVar2);
                Object K6 = oq5Var.K();
                if (h4 || K6 == obj4) {
                    K6 = new yi7(iwmVar, diuVar2, 1);
                    oq5Var.k0(K6);
                }
                b2 = b2.f(com.yandex.music.core.ui.compose.a.b(vciVar2, i4, j3, 0.5f, null, (Function2) K6, 8));
                z = false;
            }
            oq5Var.p(z);
            diu diuVar3 = wznVar2 != null ? wznVar2.c : null;
            if (diuVar3 == null) {
                vciVar = vciVar2;
            } else {
                long j4 = diuVar3.b;
                boolean h5 = oq5Var.h(iwmVar) | oq5Var.h(diuVar3);
                Object K7 = oq5Var.K();
                if (h5 || K7 == obj4) {
                    K7 = new yi7(iwmVar, diuVar3, 2);
                    oq5Var.k0(K7);
                }
                vciVar = vciVar2;
                b2 = b2.f(com.yandex.music.core.ui.compose.a.b(vciVar2, i4, j4, Float.MIN_VALUE, null, (Function2) K7, 8));
            }
            oq5Var.p(false);
            kx0 kx0Var3 = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var3, gz2Var, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                kx0Var = kx0Var3;
            } else {
                kx0Var = kx0Var3;
            }
            ouj.x(i5, oq5Var, i5, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci u = xp3.u(vciVar, o5g.G(oq5Var));
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, u);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            jf0.a(new qzm[0], null, true, ild.C(-1311235848, new ti7(qwVar2, bc5Var, f2, iwmVar), oq5Var), oq5Var, 3072, 2);
            oq5Var.p(true);
            yci d3 = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
            boolean f5 = oq5Var.f(bc5Var);
            Object K8 = oq5Var.K();
            if (f5) {
                obj = obj4;
            } else {
                obj = obj4;
                if (K8 != obj) {
                    obj2 = K8;
                    grbVar = grbVar2;
                    kx0Var2 = kx0Var;
                    yci o3 = androidx.compose.foundation.layout.a.o(wyf.C(d3, (Function0) ((h9f) obj2), f4, 0.0f, 12), 0.0f, 8, 1);
                    ta5 a3 = sa5.a(kx0Var2, gz2Var, oq5Var, 0);
                    i3 = oq5Var.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, o3);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.n0();
                    } else {
                        oq5Var.k(grbVar);
                    }
                    g0g.U(oq5Var, a3, kb5Var);
                    g0g.U(oq5Var, l4, kb5Var2);
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var, i3, kb5Var3);
                    }
                    g0g.U(oq5Var, H3, kb5Var4);
                    qwVar2 = qwVar;
                    obj3 = obj;
                    bg3.a(null, null, false, ild.C(-633578810, new tt5(7, qwVar2), oq5Var), oq5Var, 3072, 7);
                    u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 2));
                    ArrayList arrayList = twVar.a.b;
                    K = oq5Var.K();
                    if (K == obj3) {
                        K = new wh7(2);
                        oq5Var.k0(K);
                    }
                    xcs.b(CollectionsKt.X(arrayList, null, null, null, (Function1) K, 31), androidx.compose.ui.platform.a.a(vciVar, "promo_album_artists"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
                    oq5Var = oq5Var;
                    oq5Var.p(true);
                    oq5Var.p(true);
                }
            }
            grbVar = grbVar2;
            kx0Var2 = kx0Var;
            obj2 = new ej6(0, bc5Var, bc5.class, "onClick", "onClick()V", 0, 21);
            oq5Var.k0(obj2);
            yci o32 = androidx.compose.foundation.layout.a.o(wyf.C(d3, (Function0) ((h9f) obj2), f4, 0.0f, 12), 0.0f, 8, 1);
            ta5 a32 = sa5.a(kx0Var2, gz2Var, oq5Var, 0);
            i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l42 = oq5Var.l();
            yci H32 = vnj.H(oq5Var, o32);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a32, kb5Var);
            g0g.U(oq5Var, l42, kb5Var2);
            if (!oq5Var.O) {
            }
            ouj.x(i3, oq5Var, i3, kb5Var3);
            g0g.U(oq5Var, H32, kb5Var4);
            qwVar2 = qwVar;
            obj3 = obj;
            bg3.a(null, null, false, ild.C(-633578810, new tt5(7, qwVar2), oq5Var), oq5Var, 3072, 7);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 2));
            ArrayList arrayList2 = twVar.a.b;
            K = oq5Var.K();
            if (K == obj3) {
            }
            xcs.b(CollectionsKt.X(arrayList2, null, null, null, (Function1) K, 31), androidx.compose.ui.platform.a.a(vciVar, "promo_album_artists"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ti7(iwmVar, qwVar2, f2, yciVar, i2);
        }
    }

    public static final String o0(oq oqVar) {
        oqVar.getClass();
        Album$AlbumType d2 = oqVar.d();
        String str = oqVar.i;
        switch (nw.a[d2.ordinal()]) {
            case 1:
                l18 l18Var = l18.b;
                bdt I = hag.I(skr.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return avf.M(str, ((skr) qdcVar.C(I)).c(R.string.album_type_single));
            case 2:
                return "";
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return str == null ? "" : str;
            default:
                b6e.s();
                return null;
        }
    }

    public static final void p(float f2, boolean z, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1666456633);
        if ((((oq5Var.c(f2) ? 4 : 2) | i2 | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(vci.a) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(null, ild.C(-60220592, new ui7(f2, 0, z), oq5Var), oq5Var, 48, 1);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ui7(f2, i2, 1, z);
        }
    }

    public static final void q(qw qwVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(263592666);
        if ((((oq5Var.h(qwVar) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            oq5Var.Z(1489051805);
            ug3.a(androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).d.c, vnj.i), oq5Var, 0);
            oq5Var.p(false);
        } else {
            oq5Var.Z(1489169016);
            u9b u9bVar = qwVar.b;
            p1g.a(u9bVar != null ? u9bVar.e(wct.t(), WebPath$Storage.AVATARS) : null, null, androidx.compose.ui.platform.a.a(yciVar, "album_cover"), null, null, null, hd6.a, 0.0f, null, 0, oq5Var, 1572912, 952);
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wi7(qwVar, yciVar, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(laa laaVar, Function0 function0, Function0 function02, boolean z, d85 d85Var, int i2, hq5 hq5Var, int i3, int i4) {
        boolean z2;
        int i5;
        d85 d85Var2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        xmn r2;
        laaVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(813961900);
        int i9 = (oq5Var.f(laaVar) ? 4 : 2) | i3 | (oq5Var.h(function0) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i9 |= oq5Var.h(function02) ? 256 : 128;
        }
        int i10 = i4 & 8;
        if (i10 != 0) {
            i5 = i9 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i5 = i9 | (oq5Var.g(z2) ? 2048 : 1024);
        }
        int i11 = i4 & 16;
        if (i11 != 0) {
            i6 = i5 | 24576;
            d85Var2 = d85Var;
        } else {
            d85Var2 = d85Var;
            i6 = i5 | (oq5Var.f(d85Var2) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        int i12 = i4 & 32;
        if (i12 != 0) {
            i6 |= 196608;
        } else if ((196608 & i3) == 0) {
            i7 = i2;
            i6 |= oq5Var.d(i7) ? io.requery.android.database.sqlite.SQLiteDatabase.OPEN_SHAREDCACHE : io.requery.android.database.sqlite.SQLiteDatabase.OPEN_FULLMUTEX;
            if ((74899 & i6) == 74898 || !oq5Var.z()) {
                if (i10 != 0) {
                    z2 = true;
                }
                d85 d85Var3 = i11 == 0 ? null : d85Var2;
                int i13 = i12 == 0 ? 1 : i7;
                boolean z4 = z2;
                s(laaVar, function0, ((Number) function02.invoke()).floatValue() > 0.5f, z4, d85Var3, i13, oq5Var, i6 & 523390);
                z3 = z4;
                d85Var2 = d85Var3;
                i8 = i13;
            } else {
                oq5Var.S();
                z3 = z2;
                i8 = i7;
            }
            r2 = oq5Var.r();
            if (r2 == null) {
                r2.d = new lba(laaVar, function0, function02, z3, d85Var2, i8, i3, i4);
                return;
            }
            return;
        }
        i7 = i2;
        if ((74899 & i6) == 74898) {
        }
        if (i10 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        boolean z42 = z2;
        s(laaVar, function0, ((Number) function02.invoke()).floatValue() > 0.5f, z42, d85Var3, i13, oq5Var, i6 & 523390);
        z3 = z42;
        d85Var2 = d85Var3;
        i8 = i13;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(final laa laaVar, final Function0 function0, final boolean z, final boolean z2, final d85 d85Var, final int i2, hq5 hq5Var, final int i3) {
        int i4;
        boolean z3;
        d85 d85Var2;
        boolean z4;
        int i5;
        String n2;
        int i6;
        int i7;
        String n3;
        boolean z5;
        boolean f2;
        Object K;
        laaVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-120534660);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(laaVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            z3 = z2;
            i4 |= oq5Var.g(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i3 & 24576) == 0) {
            d85Var2 = d85Var;
            i4 |= oq5Var.f(d85Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            d85Var2 = d85Var;
        }
        if ((196608 & i3) == 0) {
            i4 |= oq5Var.d(i2) ? io.requery.android.database.sqlite.SQLiteDatabase.OPEN_SHAREDCACHE : io.requery.android.database.sqlite.SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i8 = i4;
        if ((74899 & i8) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i9 = i8 & 14;
            boolean z6 = laaVar instanceof kaa;
            jaa jaaVar = jaa.a;
            haa haaVar = haa.a;
            if (z6) {
                oq5Var.Z(1429485510);
                StringBuilder sb = new StringBuilder();
                float f3 = ((kaa) laaVar).a;
                if (f3 > 0.0f) {
                    sb.append(eeh.b(f3 * 100) + " %");
                }
                sb.append(rvf.M(R.string.container_download, oq5Var));
                n2 = sb.toString();
                oq5Var.p(false);
                z4 = false;
            } else if (laaVar instanceof iaa) {
                oq5Var.Z(1429781064);
                iaa iaaVar = (iaa) laaVar;
                if (iaaVar.b) {
                    oq5Var.Z(323217705);
                    oq5Var.p(false);
                    n2 = eeh.b(iaaVar.a * 100) + " %";
                    z4 = false;
                } else {
                    z4 = false;
                    n2 = vz1.n(oq5Var, 323219228, R.string.menu_element_cancel_download, oq5Var, false);
                }
                oq5Var.p(z4);
            } else {
                z4 = false;
                if (laaVar.equals(haaVar)) {
                    n2 = vz1.n(oq5Var, 323222932, R.string.container_downloaded, oq5Var, false);
                } else {
                    if (!laaVar.equals(jaaVar)) {
                        throw vz1.i(oq5Var, 323205454, false);
                    }
                    i5 = R.string.container_download;
                    n2 = vz1.n(oq5Var, 323225970, R.string.container_download, oq5Var, false);
                    if (!z6) {
                        n3 = vz1.n(oq5Var, -1894312160, i5, oq5Var, z4);
                    } else if (laaVar instanceof iaa) {
                        oq5Var.Z(1405965626);
                        iaa iaaVar2 = (iaa) laaVar;
                        if (iaaVar2.b) {
                            oq5Var.Z(-1894307849);
                            oq5Var.p(z4);
                            n3 = eeh.b(iaaVar2.a * 100) + " %";
                            z5 = false;
                        } else {
                            z5 = false;
                            n3 = vz1.n(oq5Var, -1894306326, R.string.menu_element_cancel_download, oq5Var, false);
                        }
                        oq5Var.p(z5);
                    } else {
                        if (laaVar.equals(haaVar)) {
                            i6 = -1894302622;
                            i7 = R.string.container_downloaded;
                        } else {
                            if (!laaVar.equals(jaaVar)) {
                                throw vz1.i(oq5Var, -1894313805, false);
                            }
                            i6 = -1894299582;
                            i7 = R.string.play_list_empty_text;
                        }
                        n3 = vz1.n(oq5Var, i6, i7, oq5Var, z4);
                    }
                    String str = n3;
                    f2 = oq5Var.f(n2) | (i9 != 4);
                    K = oq5Var.K();
                    if (!f2 || K == gq5.a) {
                        K = new ny2(n2, laaVar);
                        oq5Var.k0(K);
                    }
                    g0g.m(ild.C(-61393948, new mba(laaVar, d85Var2, function0, z3, z), oq5Var), str, nfp.b(vci.a, true, (Function1) K), null, 0L, i2, oq5Var, (458752 & i8) | 6, 24);
                }
            }
            i5 = R.string.container_download;
            if (!z6) {
            }
            String str2 = n3;
            f2 = oq5Var.f(n2) | (i9 != 4);
            K = oq5Var.K();
            if (!f2) {
            }
            K = new ny2(n2, laaVar);
            oq5Var.k0(K);
            g0g.m(ild.C(-61393948, new mba(laaVar, d85Var2, function0, z3, z), oq5Var), str2, nfp.b(vci.a, true, (Function1) K), null, 0L, i2, oq5Var, (458752 & i8) | 6, 24);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: nba
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    etn.s(laa.this, function0, z, z2, d85Var, i2, (hq5) obj, rvf.R(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void t(fvf fvfVar, jic jicVar, hq5 hq5Var, int i2) {
        jicVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1873581111);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2 | (oq5Var.f(jicVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Unit unit = Unit.a;
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new fzb(fvfVar, jicVar, (Continuation) null, 8);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new t1b(fvfVar, jicVar, i2, 10);
        }
    }

    public static final void u(int i2, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var;
        str.getClass();
        yciVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(52329133);
        int i3 = (oq5Var2.f(str) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if (oq5Var2.P(i3 & 1, (i3 & 19) != 18)) {
            oq5Var = oq5Var2;
            xcs.b(str, androidx.compose.foundation.layout.d.d(yciVar, 1.0f), ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, i3 & 14, 0, 65016);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new a5(str, yciVar, i2, 0);
        }
    }

    public static final JSONArray v(JSONArray jSONArray, Function1 function1) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        function1.invoke(arrayList2);
        return new JSONArray((Collection) arrayList2);
    }

    public static final String w(oq oqVar) {
        oqVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(o8q.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return men.r(oqVar, (o8q) qdcVar.C(I));
    }

    public static final String x(oq oqVar) {
        oqVar.getClass();
        return xp3.L(oqVar.n, c5b.a);
    }

    public static final void y(qln qlnVar, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = n7w.c("Channel was consumed, consumer had failed", th);
        }
        qlnVar.g(cancellationException);
    }

    public static int z(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new u0(context).b.areNotificationsEnabled() ? 0 : -1;
        }
        jj4.j("permission must be non-null");
        return 0;
    }
}
