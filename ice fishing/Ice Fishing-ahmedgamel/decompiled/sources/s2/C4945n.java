package s2;

import android.R;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c4.C0553d;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.C2524Ch;
import com.google.android.gms.internal.ads.C2582Fo;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.gms.internal.consent_sdk.C4339f;
import com.google.android.gms.internal.consent_sdk.C4343g;
import com.google.android.gms.internal.consent_sdk.C4359k;
import com.google.android.gms.internal.consent_sdk.C4409w2;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import e4.InterfaceC4481a;
import f4.C4519a;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import m.C4723s;
import n.ExecutorC4756a;
import u.AbstractC5050e;
import u7.C5081g;
import v7.AbstractC5120k;
import x2.C5189a;

/* renamed from: s2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4945n implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40490n;

    /* renamed from: u, reason: collision with root package name */
    public Object f40491u;

    /* renamed from: v, reason: collision with root package name */
    public Object f40492v;

    /* renamed from: w, reason: collision with root package name */
    public Object f40493w;

    /* renamed from: x, reason: collision with root package name */
    public Object f40494x;

    /* renamed from: y, reason: collision with root package name */
    public Object f40495y;

    /* renamed from: z, reason: collision with root package name */
    public Object f40496z;

    public /* synthetic */ C4945n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f40490n = i;
        this.f40491u = obj;
        this.f40492v = obj2;
        this.f40493w = obj3;
        this.f40494x = obj4;
        this.f40495y = obj5;
        this.f40496z = obj6;
    }

    public static boolean b(int[] iArr, int i) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int c9 = m.N0.c(context, C5248R.attr.colorControlHighlight);
        int b9 = m.N0.b(context, C5248R.attr.colorButtonNormal);
        int[] iArr = m.N0.f39106b;
        int[] iArr2 = m.N0.f39108d;
        int b10 = G.c.b(c9, i);
        return new ColorStateList(new int[][]{iArr, iArr2, m.N0.f39107c, m.N0.f39110f}, new int[]{b9, b10, G.c.b(c9, i), i});
    }

    public static LayerDrawable g(m.I0 i02, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c9 = i02.c(context, C5248R.drawable.abc_star_black_48dp);
        Drawable c10 = i02.c(context, C5248R.drawable.abc_star_half_black_48dp);
        if ((c9 instanceof BitmapDrawable) && c9.getIntrinsicWidth() == dimensionPixelSize && c9.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c9;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c9.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c10 instanceof BitmapDrawable) && c10.getIntrinsicWidth() == dimensionPixelSize && c10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void m(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C4723s.f39290b;
        }
        mutate.setColorFilter(C4723s.c(i, mode));
    }

    public static void p(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(NativeAdvancedJsUtils.f18693p, "no_ads_fallback");
        bundle.putString("flow", str);
        C4949p c4949p = C4949p.f40498g;
        x2.d dVar = c4949p.f40499a;
        String str2 = c4949p.f40502d.f41845n;
        dVar.getClass();
        x2.d.a(context, str2, bundle, new k8.b(dVar, context));
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f40496z;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public b2.h c() {
        String str = ((String) this.f40491u) == null ? " transportName" : "";
        if (((b2.j) this.f40493w) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f40494x) == null) {
            str = Wv.g(str, " eventMillis");
        }
        if (((Long) this.f40495y) == null) {
            str = Wv.g(str, " uptimeMillis");
        }
        if (((HashMap) this.f40496z) == null) {
            str = Wv.g(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new b2.h((String) this.f40491u, (Integer) this.f40492v, (b2.j) this.f40493w, ((Long) this.f40494x).longValue(), ((Long) this.f40495y).longValue(), (HashMap) this.f40496z);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public l3.m e(l3.m mVar) {
        return mVar.d(new ExecutorC4756a(1), new J3.l(10, this));
    }

    public ColorStateList h(Context context, int i) {
        if (i == C5248R.drawable.abc_edit_text_material) {
            return E.e.c(context, C5248R.color.abc_tint_edittext);
        }
        if (i == 2131230826) {
            return E.e.c(context, C5248R.color.abc_tint_switch_track);
        }
        if (i != C5248R.drawable.abc_switch_thumb_material) {
            if (i == C5248R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, m.N0.c(context, C5248R.attr.colorButtonNormal));
            }
            if (i == C5248R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == C5248R.drawable.abc_btn_colored_material) {
                return d(context, m.N0.c(context, C5248R.attr.colorAccent));
            }
            if (i == 2131230821 || i == C5248R.drawable.abc_spinner_textfield_background_material) {
                return E.e.c(context, C5248R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f40492v, i)) {
                return m.N0.d(context, C5248R.attr.colorControlNormal);
            }
            if (b((int[]) this.f40495y, i)) {
                return E.e.c(context, C5248R.color.abc_tint_default);
            }
            if (b((int[]) this.f40496z, i)) {
                return E.e.c(context, C5248R.color.abc_tint_btn_checkable);
            }
            if (i == C5248R.drawable.abc_seekbar_thumb_material) {
                return E.e.c(context, C5248R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d9 = m.N0.d(context, C5248R.attr.colorSwitchThumbNormal);
        if (d9 == null || !d9.isStateful()) {
            iArr[0] = m.N0.f39106b;
            iArr2[0] = m.N0.b(context, C5248R.attr.colorSwitchThumbNormal);
            iArr[1] = m.N0.f39109e;
            iArr2[1] = m.N0.c(context, C5248R.attr.colorControlActivated);
            iArr[2] = m.N0.f39110f;
            iArr2[2] = m.N0.c(context, C5248R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = m.N0.f39106b;
            iArr[0] = iArr3;
            iArr2[0] = d9.getColorForState(iArr3, 0);
            iArr[1] = m.N0.f39109e;
            iArr2[1] = m.N0.c(context, C5248R.attr.colorControlActivated);
            iArr[2] = m.N0.f39110f;
            iArr2[2] = d9.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public y8.l i() {
        s8.f fVar = s8.f.f40554a;
        Object obj = s8.f.f40554a;
        s8.e eVar = obj instanceof s8.e ? (s8.e) obj : null;
        Context b9 = eVar != null ? eVar.b() : null;
        AssetManager assets = b9 != null ? b9.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream open = assets.open((String) this.f40496z);
        kotlin.jvm.internal.h.d(open, "open(...)");
        return y8.b.h(open);
    }

    public E2.M j() {
        E2.M m9 = new E2.M(false);
        Object obj = v7.q.f41222n;
        m9.f765y = obj;
        m9.f761u = (i8.n) this.f40491u;
        m9.f762v = (String) this.f40492v;
        m9.f764x = (i8.t) this.f40494x;
        Map map = (Map) this.f40495y;
        if (!map.isEmpty()) {
            obj = v7.t.z(map);
        }
        m9.f765y = obj;
        m9.f763w = ((i8.l) this.f40493w).d();
        return m9;
    }

    public void k() {
        try {
            y8.r b9 = y8.b.b(i());
            try {
                y8.h A9 = b9.A(b9.B());
                y8.h A10 = b9.A(b9.B());
                b9.close();
                synchronized (this) {
                    kotlin.jvm.internal.h.b(A9);
                    this.f40493w = A9;
                    kotlin.jvm.internal.h.b(A10);
                    this.f40494x = A10;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f40492v).countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(String str, Bundle bundle, String str2) {
        int i;
        String str3;
        String str4;
        c4.g gVar;
        boolean g9;
        int i4;
        PackageInfo d9;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        Q3.g gVar2 = (Q3.g) this.f40491u;
        gVar2.a();
        bundle.putString("gmp_app_id", gVar2.f2663c.f2675b);
        C2582Fo c2582Fo = (C2582Fo) this.f40492v;
        synchronized (c2582Fo) {
            try {
                if (c2582Fo.f25634n == 0 && (d9 = c2582Fo.d("com.google.android.gms")) != null) {
                    c2582Fo.f25634n = d9.versionCode;
                }
                i = c2582Fo.f25634n;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C2582Fo) this.f40492v).a());
        C2582Fo c2582Fo2 = (C2582Fo) this.f40492v;
        synchronized (c2582Fo2) {
            try {
                if (((String) c2582Fo2.f25637w) == null) {
                    c2582Fo2.g();
                }
                str3 = (String) c2582Fo2.f25637w;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        Q3.g gVar3 = (Q3.g) this.f40491u;
        gVar3.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar3.f2662b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((C4519a) com.bumptech.glide.d.d(((f4.c) ((f4.d) this.f40496z)).d())).f37448a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e9) {
            e = e9;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) com.bumptech.glide.d.d(((f4.c) ((f4.d) this.f40496z)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            gVar = (c4.g) ((InterfaceC4481a) this.f40495y).get();
            n4.b bVar = (n4.b) ((InterfaceC4481a) this.f40494x).get();
            if (gVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) com.bumptech.glide.d.d(((f4.c) ((f4.d) this.f40496z)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            gVar = (c4.g) ((InterfaceC4481a) this.f40495y).get();
            n4.b bVar2 = (n4.b) ((InterfaceC4481a) this.f40494x).get();
            if (gVar == null) {
            }
        }
        bundle.putString("appid", (String) com.bumptech.glide.d.d(((f4.c) ((f4.d) this.f40496z)).c()));
        bundle.putString("cliv", "fcm-24.0.0");
        gVar = (c4.g) ((InterfaceC4481a) this.f40495y).get();
        n4.b bVar22 = (n4.b) ((InterfaceC4481a) this.f40494x).get();
        if (gVar == null || bVar22 == null) {
            return;
        }
        C0553d c0553d = (C0553d) gVar;
        synchronized (c0553d) {
            long currentTimeMillis = System.currentTimeMillis();
            c4.h hVar = (c4.h) c0553d.f5735a.get();
            synchronized (hVar) {
                g9 = hVar.g(currentTimeMillis);
            }
            if (g9) {
                synchronized (hVar) {
                    String d10 = hVar.d(System.currentTimeMillis());
                    hVar.f5741a.edit().putString("last-used-date", d10).commit();
                    hVar.f(d10);
                }
                i4 = 3;
            } else {
                i4 = 1;
            }
        }
        if (i4 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC5050e.d(i4)));
            bundle.putString("Firebase-Client", bVar22.a());
        }
    }

    public l3.m n(String str, Bundle bundle, String str2) {
        int i;
        try {
            l(str, bundle, str2);
            N2.b bVar = (N2.b) this.f40493w;
            N2.p pVar = bVar.f1914c;
            int a9 = pVar.a();
            N2.h hVar = N2.h.f1927v;
            if (a9 < 12000000) {
                return pVar.b() != 0 ? bVar.a(bundle).e(hVar, new C3067cm(3, bVar, bundle)) : com.bumptech.glide.d.q(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            N2.o c9 = N2.o.c(bVar.f1913b);
            synchronized (c9) {
                i = c9.f1949a;
                c9.f1949a = i + 1;
            }
            return c9.d(new N2.m(i, 1, bundle, 1)).d(hVar, N2.d.f1920u);
        } catch (InterruptedException | ExecutionException e9) {
            return com.bumptech.glide.d.q(e9);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C2524Ch f() {
        Application application = (Application) ((C4409w2) this.f40491u).f36550u;
        com.google.android.gms.internal.consent_sdk.r rVar = (com.google.android.gms.internal.consent_sdk.r) ((Z2) this.f40492v).f();
        Handler handler = com.google.android.gms.internal.consent_sdk.C.f36261a;
        com.google.android.gms.internal.consent_sdk.E.c(handler);
        com.google.android.gms.internal.consent_sdk.B b9 = com.google.android.gms.internal.consent_sdk.C.f36262b;
        com.google.android.gms.internal.consent_sdk.E.c(b9);
        return new C2524Ch(application, rVar, handler, b9, (com.google.android.gms.internal.consent_sdk.O) ((Z2) this.f40493w).f(), ((C4339f) this.f40494x).a(), (C4359k) ((C4409w2) this.f40495y).f(), (C4343g) ((Z2) this.f40496z).f());
    }

    public String toString() {
        switch (this.f40490n) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f40492v);
                sb.append(", url=");
                sb.append((i8.n) this.f40491u);
                i8.l lVar = (i8.l) this.f40493w;
                if (lVar.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : lVar) {
                        int i4 = i + 1;
                        if (i < 0) {
                            AbstractC5120k.v();
                            throw null;
                        }
                        C5081g c5081g = (C5081g) obj;
                        String str = (String) c5081g.f41052n;
                        String str2 = (String) c5081g.f41053u;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (j8.c.i(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i = i4;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f40495y;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C4945n(Context context, String str) {
        String concat;
        this.f40490n = 7;
        this.f40491u = context.getApplicationContext();
        this.f40492v = str;
        this.f40493w = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = X2.b.a(context).g(0, context.getPackageName()).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (PackageManager.NameNotFoundException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Unable to get package version name for reporting", e9);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f40496z = concat;
    }

    public C4945n(Context context, C5189a c5189a, PackageInfo packageInfo, String str, D2.d dVar) {
        this.f40490n = 1;
        this.f40491u = context;
        this.f40492v = context.getPackageName();
        this.f40493w = c5189a.f41845n;
        this.f40494x = packageInfo;
        this.f40495y = str;
        this.f40496z = dVar;
    }

    public C4945n(int i) {
        this.f40490n = i;
        switch (i) {
            case 6:
                this.f40491u = new int[]{2131230836, 2131230834, 2131230760};
                this.f40492v = new int[]{2131230784, C5248R.drawable.abc_seekbar_tick_mark_material, C5248R.drawable.abc_ic_menu_share_mtrl_alpha, C5248R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C5248R.drawable.abc_ic_menu_cut_mtrl_alpha, C5248R.drawable.abc_ic_menu_selectall_mtrl_alpha, C5248R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f40493w = new int[]{2131230833, 2131230835, 2131230777, C5248R.drawable.abc_text_cursor_material, 2131230830, 2131230831, 2131230832};
                this.f40494x = new int[]{2131230809, C5248R.drawable.abc_cab_background_internal_bg, 2131230808};
                this.f40495y = new int[]{C5248R.drawable.abc_tab_indicator_material, C5248R.drawable.abc_textfield_search_material};
                this.f40496z = new int[]{C5248R.drawable.abc_btn_check_material, C5248R.drawable.abc_btn_radio_material, C5248R.drawable.abc_btn_check_material_anim, C5248R.drawable.abc_btn_radio_material_anim};
                break;
            case 8:
                this.f40490n = 8;
                this.f40491u = new AtomicBoolean(false);
                this.f40492v = new CountDownLatch(1);
                this.f40496z = "PublicSuffixDatabase.list";
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public C4945n(E2.M m9) {
        this.f40490n = 4;
        i8.n nVar = (i8.n) m9.f761u;
        if (nVar != null) {
            this.f40491u = nVar;
            this.f40492v = (String) m9.f762v;
            i8.l e9 = ((I1.d) m9.f763w).e();
            this.f40493w = e9;
            i8.t tVar = (i8.t) m9.f764x;
            this.f40494x = tVar;
            this.f40495y = v7.t.y(m9.f765y);
            if ("upgrade".equalsIgnoreCase(e9.a("Connection")) && tVar != null && tVar.a() != 0) {
                throw new IllegalArgumentException("expected a null or empty request body with 'Connection: upgrade'");
            }
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public C4945n(Q3.g gVar, C2582Fo c2582Fo, InterfaceC4481a interfaceC4481a, InterfaceC4481a interfaceC4481a2, f4.d dVar) {
        this.f40490n = 5;
        gVar.a();
        N2.b bVar = new N2.b(gVar.f2661a);
        this.f40491u = gVar;
        this.f40492v = c2582Fo;
        this.f40493w = bVar;
        this.f40494x = interfaceC4481a;
        this.f40495y = interfaceC4481a2;
        this.f40496z = dVar;
    }
}
