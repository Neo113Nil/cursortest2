package X2;

import H6.j;
import I7.p;
import O.InterfaceC0335j;
import O.W;
import O.X;
import Q7.q;
import S7.AbstractC0406y;
import S7.C0398p;
import X7.s;
import Z1.n;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import b8.C0531c;
import b8.InterfaceC0529a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.icefishing.icefishinglive2.C5275R;
import d1.C4445c;
import d4.C4449c;
import d4.InterfaceC4450d;
import e8.L;
import f6.C4512a;
import g1.C4522b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public abstract class e implements d8.b, d8.a {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f3786a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f3787b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Context f3788c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3789d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Method f3790e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3791f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Field f3792g;

    public static void A(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean B(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean C8 = C(file, inputStream);
                A(inputStream);
                return C8;
            } catch (Throwable th) {
                th = th;
                A(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean C(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    A(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            A(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            A(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean F() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            O3.g.c();
            O3.g c9 = O3.g.c();
            c9.a();
            Context context = c9.f2345a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean G(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = X.f2054a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = W.f2050d;
        W w6 = (W) view.getTag(C5275R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (w6 == null) {
            w6 = new W();
            w6.f2051a = null;
            w6.f2052b = null;
            w6.f2053c = null;
            view.setTag(C5275R.id.tag_unhandled_key_event_manager, w6);
        }
        WeakReference weakReference2 = w6.f2053c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        w6.f2053c = new WeakReference(keyEvent);
        if (w6.f2052b == null) {
            w6.f2052b = new SparseArray();
        }
        SparseArray sparseArray = w6.f2052b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(C5275R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H(InterfaceC0335j interfaceC0335j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z3 = false;
        if (interfaceC0335j != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0335j.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f3789d) {
                            try {
                                f3790e = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f3789d = true;
                        }
                        Method method = f3790e;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z3 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z3) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (X.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f3791f) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f3792g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f3791f = true;
                }
                Field field = f3792g;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (X.c(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && X.c(view, keyEvent)) || interfaceC0335j.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static File I(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final boolean J(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.h.d(className, "getClassName(...)");
            if (q.R(className, "com.onesignal")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(Intent intent) {
        long parseLong;
        if (O(intent)) {
            L("_nr", intent.getExtras());
        }
        int i = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : F()) {
            W1.e eVar = (W1.e) FirebaseMessaging.f36191l.get();
            if (eVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            k4.d dVar = null;
            r4 = null;
            String str = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    i = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        i = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i6 = i;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        O3.g c9 = O3.g.c();
                        try {
                            Object obj2 = C4449c.f37051m;
                            string = (String) S0.f.b(((C4449c) c9.b(InterfaceC4450d.class)).c());
                        } catch (InterruptedException e9) {
                            e = e9;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e10) {
                        e = e10;
                    }
                }
                String str2 = string;
                O3.g c10 = O3.g.c();
                c10.a();
                String packageName = c10.f2345a.getPackageName();
                k4.b bVar = C4522b.K(extras) ? k4.b.DISPLAY_NOTIFICATION : k4.b.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str3 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str = string3;
                }
                String str4 = str != null ? str : "";
                String string4 = extras.getString("collapse_key");
                String str5 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str6 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str7 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e11) {
                        Log.w("FirebaseMessaging", "error parsing project number", e11);
                    }
                    dVar = new k4.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i6, str4, str6, str7);
                }
                O3.g c11 = O3.g.c();
                c11.a();
                O3.i iVar = c11.f2347c;
                String str8 = iVar.f2362e;
                if (str8 != null) {
                    try {
                        parseLong = Long.parseLong(str8);
                    } catch (NumberFormatException e12) {
                        Log.w("FirebaseMessaging", "error parsing sender ID", e12);
                    }
                    dVar = new k4.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i6, str4, str6, str7);
                }
                c11.a();
                String str9 = iVar.f2359b;
                if (str9.startsWith("1:")) {
                    String[] split = str9.split(":");
                    if (split.length >= 2) {
                        String str10 = split[1];
                        if (!str10.isEmpty()) {
                            try {
                                parseLong = Long.parseLong(str10);
                            } catch (NumberFormatException e13) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e13);
                            }
                        }
                    }
                    parseLong = 0;
                } else {
                    try {
                        parseLong = Long.parseLong(str9);
                    } catch (NumberFormatException e14) {
                        Log.w("FirebaseMessaging", "error parsing app ID", e14);
                    }
                }
                dVar = new k4.d(parseLong > 0 ? parseLong : 0L, str3, str2, bVar, packageName, str5, i6, str4, str6, str7);
            }
            if (dVar == null) {
                return;
            }
            try {
                W1.b bVar2 = new W1.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                W1.c cVar = new W1.c("proto");
                d4.f fVar = new d4.f(11);
                n nVar = (n) eVar;
                Set set = nVar.f4157a;
                if (!set.contains(cVar)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
                }
                new Z2.e(nVar.f4158b, cVar, fVar, nVar.f4159c).G(new W1.a(new k4.e(dVar), bVar2));
            } catch (RuntimeException e15) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e15);
            }
        }
    }

    public static void L(String str, Bundle bundle) {
        try {
            O3.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e9);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String str2 = C4522b.K(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (O3.g.c().b(P3.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static MappedByteBuffer M(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, com.anythink.expressad.foundation.d.d.bv, null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static C4512a N(List list) {
        C4445c c4445c = new C4445c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            String str = jVar.f1247v;
            H6.b bVar = jVar.f1248w;
            String str2 = bVar.f1229v;
            f6.b bVar2 = f6.b.f37516n;
            if (str2 != null) {
                c4445c.f(k6.e.a(bVar2, str), bVar.f1229v);
            } else {
                Boolean bool = bVar.f1230w;
                if (bool != null) {
                    c4445c.f(k6.e.a(f6.b.f37517u, str), bool);
                } else {
                    Long l9 = bVar.f1231x;
                    if (l9 != null) {
                        c4445c.f(k6.e.a(f6.b.f37518v, str), l9);
                    } else {
                        Double d2 = bVar.f1232y;
                        if (d2 != null) {
                            c4445c.f(k6.e.a(f6.b.f37519w, str), d2);
                        } else {
                            H6.d dVar = bVar.f1233z;
                            if (dVar != null) {
                                List list2 = dVar.f1235v;
                                H6.b bVar3 = (H6.b) list2.get(0);
                                if (bVar3.f1229v != null) {
                                    k6.e a9 = k6.e.a(f6.b.f37520x, str);
                                    ArrayList arrayList = new ArrayList(list2.size());
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((H6.b) it2.next()).f1229v);
                                    }
                                    c4445c.f(a9, arrayList);
                                } else if (bVar3.f1230w != null) {
                                    k6.e a10 = k6.e.a(f6.b.f37521y, str);
                                    ArrayList arrayList2 = new ArrayList(list2.size());
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(((H6.b) it3.next()).f1230w);
                                    }
                                    c4445c.f(a10, arrayList2);
                                } else if (bVar3.f1231x != null) {
                                    k6.e a11 = k6.e.a(f6.b.f37522z, str);
                                    ArrayList arrayList3 = new ArrayList(list2.size());
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        arrayList3.add(((H6.b) it4.next()).f1231x);
                                    }
                                    c4445c.f(a11, arrayList3);
                                } else {
                                    if (bVar3.f1232y == null) {
                                        throw new UnsupportedOperationException();
                                    }
                                    k6.e a12 = k6.e.a(f6.b.f37514A, str);
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    Iterator it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        arrayList4.add(((H6.b) it5.next()).f1232y);
                                    }
                                    c4445c.f(a12, arrayList4);
                                }
                            } else {
                                c4445c.f(k6.e.a(bVar2, str), "");
                            }
                        }
                    }
                }
            }
        }
        return c4445c.d();
    }

    public static boolean O(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static String P(Throwable th) {
        kotlin.jvm.internal.h.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.h.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static final Object Q(s sVar, s sVar2, p pVar) {
        Object c0398p;
        Object K7;
        try {
            if (pVar instanceof B7.a) {
                u.b(2, pVar);
                c0398p = pVar.invoke(sVar2, sVar);
            } else {
                c0398p = A8.b.u(pVar, sVar2, sVar);
            }
        } catch (Throwable th) {
            c0398p = new C0398p(th, false);
        }
        A7.a aVar = A7.a.f58n;
        if (c0398p == aVar || (K7 = sVar.K(c0398p)) == AbstractC0406y.f3011e) {
            return aVar;
        }
        if (K7 instanceof C0398p) {
            throw ((C0398p) K7).f2983a;
        }
        return AbstractC0406y.w(K7);
    }

    public static void R(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader S() {
        ClassLoader classLoader;
        SecurityException e9;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (e.class) {
            if (f3786a == null) {
                Thread thread2 = f3787b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i = 0;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i6];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i6++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (thread == null) {
                                        try {
                                            d dVar = new d(threadGroup, "GmsDynamite");
                                            try {
                                                dVar.setContextClassLoader(null);
                                                dVar.start();
                                                thread = dVar;
                                            } catch (SecurityException e10) {
                                                e9 = e10;
                                                thread = dVar;
                                                String message = e9.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb.append("Failed to enumerate thread/threadgroup ");
                                                sb.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb.toString());
                                                thread2 = thread;
                                                f3787b = thread2;
                                            }
                                        } catch (SecurityException e11) {
                                            e9 = e11;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e12) {
                                e9 = e12;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    f3787b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f3787b.getContextClassLoader();
                    } catch (SecurityException e13) {
                        String message2 = e13.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                f3786a = classLoader2;
            }
            classLoader = f3786a;
        }
        return classLoader;
    }

    public static void y(Throwable th, Throwable exception) {
        kotlin.jvm.internal.h.e(th, "<this>");
        kotlin.jvm.internal.h.e(exception, "exception");
        if (th != exception) {
            Integer num = E7.a.f838a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = D7.a.f649a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static void z(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public Object D(InterfaceC0529a deserializer) {
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        return deserializer.b(this);
    }

    public void E() {
        throw new C0531c(kotlin.jvm.internal.s.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // d8.b
    public boolean a() {
        E();
        throw null;
    }

    @Override // d8.b
    public char b() {
        E();
        throw null;
    }

    @Override // d8.b
    public d8.b d(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return this;
    }

    @Override // d8.b
    public abstract int e();

    @Override // d8.a
    public int f(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return e();
    }

    @Override // d8.b
    public String g() {
        E();
        throw null;
    }

    @Override // d8.b
    public d8.a h(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return this;
    }

    @Override // d8.a
    public Object i(c8.e descriptor, int i, InterfaceC0529a deserializer, Object obj) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        return D(deserializer);
    }

    @Override // d8.b
    public abstract long j();

    @Override // d8.a
    public void k(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
    }

    @Override // d8.a
    public d8.b l(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return d(descriptor.i(i));
    }

    @Override // d8.b
    public boolean m() {
        return true;
    }

    @Override // d8.a
    public boolean n(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return a();
    }

    @Override // d8.a
    public short o(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return t();
    }

    @Override // d8.a
    public byte p(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return r();
    }

    @Override // d8.a
    public float q(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return u();
    }

    @Override // d8.b
    public abstract byte r();

    @Override // d8.a
    public double s(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return v();
    }

    @Override // d8.b
    public abstract short t();

    @Override // d8.b
    public float u() {
        E();
        throw null;
    }

    @Override // d8.b
    public double v() {
        E();
        throw null;
    }

    @Override // d8.a
    public long w(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return j();
    }

    @Override // d8.a
    public char x(L descriptor, int i) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return b();
    }
}
