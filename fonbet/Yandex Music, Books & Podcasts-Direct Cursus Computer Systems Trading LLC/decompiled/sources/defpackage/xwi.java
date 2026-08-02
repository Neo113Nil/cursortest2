package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.t;
import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xwi {
    public static final ArrayList a;
    public static final AtomicBoolean b;
    public static final Integer[] c;
    public static final xwi d;

    static {
        xwi xwiVar = new xwi();
        d = xwiVar;
        a = xwiVar.a();
        ArrayList arrayList = null;
        if (!bp6.a.contains(xwiVar)) {
            try {
                ArrayList d2 = u75.d(new wwi(0));
                d2.addAll(xwiVar.a());
                arrayList = d2;
            } catch (Throwable th) {
                bp6.a(xwiVar, th);
            }
        }
        if (!bp6.a.contains(xwiVar)) {
            try {
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new wwi(4));
                ArrayList arrayList3 = a;
                hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                hashMap.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th2) {
                bp6.a(xwiVar, th2);
            }
        }
        b = new AtomicBoolean(false);
        c = new Integer[]{20210906, 20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101};
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        return java.lang.Math.min(r4, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(TreeSet treeSet, int i, int[] iArr) {
        if (bp6.a.contains(xwi.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator descendingIterator = treeSet.descendingIterator();
                int i2 = -1;
                while (true) {
                    if (!descendingIterator.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) descendingIterator.next();
                    num.getClass();
                    i2 = Math.max(i2, num.intValue());
                    while (length >= 0 && iArr[length] > num.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (iArr[length] == num.intValue()) {
                        break;
                    }
                }
            } catch (Throwable th) {
                bp6.a(xwi.class, th);
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:7:0x0015->B:16:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent d(Context context) {
        ResolveInfo resolveService;
        if (!bp6.a.contains(xwi.class)) {
            try {
                context.getClass();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    Intent addCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((wwi) it.next()).b()).addCategory("android.intent.category.DEFAULT");
                    if (!bp6.a.contains(xwi.class) && addCategory != null) {
                        try {
                            resolveService = context.getPackageManager().resolveService(addCategory, 0);
                        } catch (Throwable th) {
                            bp6.a(xwi.class, th);
                        }
                        if (resolveService != null) {
                            String str = resolveService.serviceInfo.packageName;
                            str.getClass();
                            if (m3c.a(context, str)) {
                                if (addCategory == null) {
                                    return addCategory;
                                }
                            }
                        }
                    }
                    addCategory = null;
                    if (addCategory == null) {
                    }
                }
            } catch (Throwable th2) {
                bp6.a(xwi.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:6:0x000d, B:11:0x0048, B:13:0x0064, B:16:0x008f, B:23:0x008b, B:24:0x0095, B:26:0x009a, B:44:0x0042, B:30:0x001c, B:32:0x0026, B:34:0x002c, B:37:0x003d, B:41:0x0035, B:18:0x0070, B:20:0x0082), top: B:5:0x000d, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent e(Intent intent, Bundle bundle, c3c c3cVar) {
        String stringExtra;
        UUID fromString;
        Bundle bundle2;
        Set set = bp6.a;
        if (!set.contains(xwi.class)) {
            try {
                intent.getClass();
                if (!set.contains(xwi.class)) {
                    try {
                        if (k(j(intent))) {
                            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                        } else {
                            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                        }
                    } catch (Throwable th) {
                        bp6.a(xwi.class, th);
                    }
                    if (stringExtra != null) {
                        try {
                            fromString = UUID.fromString(stringExtra);
                        } catch (IllegalArgumentException unused) {
                        }
                        if (fromString != null) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", j(intent));
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("action_id", fromString.toString());
                            if (c3cVar != null) {
                                if (!bp6.a.contains(xwi.class)) {
                                    try {
                                        bundle2 = new Bundle();
                                        bundle2.putString("error_description", c3cVar.toString());
                                        if (c3cVar instanceof f3c) {
                                            bundle2.putString("error_type", "UserCanceled");
                                        }
                                    } catch (Throwable th2) {
                                        bp6.a(xwi.class, th2);
                                    }
                                    bundle3.putBundle("error", bundle2);
                                }
                                bundle2 = null;
                                bundle3.putBundle("error", bundle2);
                            }
                            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle3);
                            if (bundle != null) {
                                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                            }
                            return intent2;
                        }
                    }
                }
                fromString = null;
                if (fromString != null) {
                }
            } catch (Throwable th3) {
                bp6.a(xwi.class, th3);
                return null;
            }
        }
        return null;
    }

    public static final int h() {
        if (bp6.a.contains(xwi.class)) {
            return 0;
        }
        try {
            return c[0].intValue();
        } catch (Throwable th) {
            bp6.a(xwi.class, th);
            return 0;
        }
    }

    public static final Bundle i(Intent intent) {
        if (bp6.a.contains(xwi.class)) {
            return null;
        }
        try {
            intent.getClass();
            return !k(j(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            bp6.a(xwi.class, th);
            return null;
        }
    }

    public static final int j(Intent intent) {
        if (bp6.a.contains(xwi.class)) {
            return 0;
        }
        try {
            intent.getClass();
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            bp6.a(xwi.class, th);
            return 0;
        }
    }

    public static final boolean k(int i) {
        if (bp6.a.contains(xwi.class)) {
            return false;
        }
        try {
            return xz0.u(c, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            bp6.a(xwi.class, th);
            return false;
        }
    }

    public static final void l() {
        if (bp6.a.contains(xwi.class)) {
            return;
        }
        try {
            if (b.compareAndSet(false, true)) {
                j3c.d().execute(q.p);
            }
        } catch (Throwable th) {
            bp6.a(xwi.class, th);
        }
    }

    public static final Intent m(t tVar, Intent intent) {
        if (!bp6.a.contains(xwi.class) && intent != null) {
            try {
                ResolveInfo resolveActivity = tVar.getPackageManager().resolveActivity(intent, 0);
                if (resolveActivity != null) {
                    String str = resolveActivity.activityInfo.packageName;
                    str.getClass();
                    if (m3c.a(tVar, str)) {
                        return intent;
                    }
                }
            } catch (Throwable th) {
                bp6.a(xwi.class, th);
                return null;
            }
        }
        return null;
    }

    public final ArrayList a() {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            return u75.d(new wwi(3), new wwi(5));
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:6:0x000b, B:13:0x001c, B:15:0x003e, B:20:0x004e, B:21:0x005b, B:23:0x0061, B:24:0x0066, B:25:0x006f, B:27:0x0077, B:29:0x008a, B:30:0x0093, B:32:0x00a3, B:33:0x00a8, B:35:0x00b4, B:37:0x00bf), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:6:0x000b, B:13:0x001c, B:15:0x003e, B:20:0x004e, B:21:0x005b, B:23:0x0061, B:24:0x0066, B:25:0x006f, B:27:0x0077, B:29:0x008a, B:30:0x0093, B:32:0x00a3, B:33:0x00a8, B:35:0x00b4, B:37:0x00bf), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:6:0x000b, B:13:0x001c, B:15:0x003e, B:20:0x004e, B:21:0x005b, B:23:0x0061, B:24:0x0066, B:25:0x006f, B:27:0x0077, B:29:0x008a, B:30:0x0093, B:32:0x00a3, B:33:0x00a8, B:35:0x00b4, B:37:0x00bf), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:6:0x000b, B:13:0x001c, B:15:0x003e, B:20:0x004e, B:21:0x005b, B:23:0x0061, B:24:0x0066, B:25:0x006f, B:27:0x0077, B:29:0x008a, B:30:0x0093, B:32:0x00a3, B:33:0x00a8, B:35:0x00b4, B:37:0x00bf), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:6:0x000b, B:13:0x001c, B:15:0x003e, B:20:0x004e, B:21:0x005b, B:23:0x0061, B:24:0x0066, B:25:0x006f, B:27:0x0077, B:29:0x008a, B:30:0x0093, B:32:0x00a3, B:33:0x00a8, B:35:0x00b4, B:37:0x00bf), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0047, blocks: (B:6:0x000b, B:13:0x001c, B:15:0x003e, B:20:0x004e, B:21:0x005b, B:23:0x0061, B:24:0x0066, B:25:0x006f, B:27:0x0077, B:29:0x008a, B:30:0x0093, B:32:0x00a3, B:33:0x00a8, B:35:0x00b4, B:37:0x00bf), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent c(wwi wwiVar, String str, Collection collection, String str2, boolean z, int i, String str3, String str4, boolean z2, String str5, boolean z3, int i2, boolean z4, boolean z5, String str6) {
        boolean z6;
        String str7;
        if (!bp6.a.contains(this)) {
            try {
                String str8 = "com.facebook.katana.ProxyAuth";
                switch (wwiVar.b) {
                    case 0:
                    case 4:
                        str8 = null;
                        break;
                    case 1:
                        str8 = "com.facebook.lite.platform.LoginGDPDialogActivity";
                        break;
                    case 2:
                        str8 = "com.instagram.platform.AppAuthorizeActivity";
                        break;
                }
                if (str8 != null) {
                    Intent putExtra = new Intent().setClassName(wwiVar.b(), str8).putExtra("client_id", str);
                    putExtra.getClass();
                    HashSet hashSet = j3c.a;
                    putExtra.putExtra("facebook_sdk_version", "12.2.0");
                    if (collection != null && !collection.isEmpty()) {
                        z6 = false;
                        if (!z6) {
                            putExtra.putExtra("scope", TextUtils.join(StringUtils.COMMA, collection));
                        }
                        if (!gvt.D(str2)) {
                            putExtra.putExtra("e2e", str2);
                        }
                        putExtra.putExtra("state", str3);
                        switch (wwiVar.b) {
                            case 2:
                                str7 = "token,signed_request,graph_domain,granted_scopes";
                                break;
                            default:
                                str7 = "id_token,token,signed_request,graph_domain";
                                break;
                        }
                        putExtra.putExtra("response_type", str7);
                        putExtra.putExtra("nonce", str6);
                        putExtra.putExtra("return_scopes", PListParser.TAG_TRUE);
                        if (z) {
                            putExtra.putExtra("default_audience", su4.d(i));
                        }
                        putExtra.putExtra("legacy_override", j3c.e());
                        putExtra.putExtra("auth_type", str4);
                        if (z2) {
                            putExtra.putExtra("fail_on_logged_out", true);
                        }
                        putExtra.putExtra("messenger_page_id", str5);
                        putExtra.putExtra("reset_messenger_state", z3);
                        if (z4) {
                            putExtra.putExtra("fx_app", hrg.e(i2));
                        }
                        if (z5) {
                            putExtra.putExtra("skip_dedupe", true);
                        }
                        return putExtra;
                    }
                    z6 = true;
                    if (!z6) {
                    }
                    if (!gvt.D(str2)) {
                    }
                    putExtra.putExtra("state", str3);
                    switch (wwiVar.b) {
                    }
                    putExtra.putExtra("response_type", str7);
                    putExtra.putExtra("nonce", str6);
                    putExtra.putExtra("return_scopes", PListParser.TAG_TRUE);
                    if (z) {
                    }
                    putExtra.putExtra("legacy_override", j3c.e());
                    putExtra.putExtra("auth_type", str4);
                    if (z2) {
                    }
                    putExtra.putExtra("messenger_page_id", str5);
                    putExtra.putExtra("reset_messenger_state", z3);
                    if (z4) {
                    }
                    if (z5) {
                    }
                    return putExtra;
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|6|(11:45|46|47|9|10|11|12|13|(5:15|16|17|18|(2:(3:26|23|24)|27))(1:38)|(1:21)|22)|8|9|10|11|12|13|(0)(0)|(0)|22) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        android.util.Log.e("xwi", "Failed to query content resolver.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #2 {all -> 0x00a7, blocks: (B:6:0x0012, B:31:0x00ac, B:32:0x00af, B:21:0x00a3, B:50:0x004c, B:46:0x002d), top: B:5:0x0012, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[EXC_TOP_SPLITTER, LOOP:0: B:23:0x0088->B:26:0x008e, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeSet f(wwi wwiVar) {
        Uri uri;
        Cursor cursor;
        ProviderInfo providerInfo;
        Set set = bp6.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = j3c.b().getContentResolver();
            String[] strArr = {"version"};
            try {
                if (!set.contains(this)) {
                    try {
                        Uri parse = Uri.parse("content://" + wwiVar.b() + ".provider.PlatformProvider/versions");
                        parse.getClass();
                        uri = parse;
                    } catch (Throwable th) {
                        bp6.a(this, th);
                    }
                    providerInfo = j3c.b().getPackageManager().resolveContentProvider(wwiVar.b().concat(".provider.PlatformProvider"), 0);
                    if (providerInfo == null) {
                        try {
                            try {
                                cursor = contentResolver.query(uri, strArr, null, null, null);
                            } catch (IllegalArgumentException unused) {
                                Log.e("xwi", "Failed to query content resolver.");
                                cursor = null;
                                if (cursor != null) {
                                }
                                if (cursor != null) {
                                }
                                return treeSet;
                            }
                        } catch (NullPointerException unused2) {
                            Log.e("xwi", "Failed to query content resolver.");
                            cursor = null;
                            if (cursor != null) {
                            }
                            if (cursor != null) {
                            }
                            return treeSet;
                        } catch (SecurityException unused3) {
                            Log.e("xwi", "Failed to query content resolver.");
                            cursor = null;
                            if (cursor != null) {
                            }
                            if (cursor != null) {
                            }
                            return treeSet;
                        }
                        if (cursor != null) {
                            while (cursor.moveToNext()) {
                                try {
                                    treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("version"))));
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                    } else {
                        cursor = null;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return treeSet;
                }
                providerInfo = j3c.b().getPackageManager().resolveContentProvider(wwiVar.b().concat(".provider.PlatformProvider"), 0);
                if (providerInfo == null) {
                }
                if (cursor != null) {
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
            uri = null;
        } catch (Throwable th4) {
            bp6.a(this, th4);
            return null;
        }
    }

    public final jsg g(List list, int[] iArr) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            l();
            if (list == null) {
                jsg jsgVar = new jsg(9);
                jsgVar.b = -1;
                return jsgVar;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wwi wwiVar = (wwi) it.next();
                TreeSet treeSet = wwiVar.a;
                if (treeSet == null || treeSet.isEmpty()) {
                    wwiVar.a(false);
                }
                int b2 = b(wwiVar.a, h(), iArr);
                if (b2 != -1) {
                    jsg jsgVar2 = new jsg(9);
                    jsgVar2.b = b2;
                    return jsgVar2;
                }
            }
            jsg jsgVar3 = new jsg(9);
            jsgVar3.b = -1;
            return jsgVar3;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }
}
