package q2;

import a.AbstractC0415a;
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
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.C2561Fo;
import com.google.android.gms.internal.ads.C4236yh;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.consent_sdk.C4329f;
import com.google.android.gms.internal.consent_sdk.C4333g;
import com.google.android.gms.internal.consent_sdk.C4349k;
import com.google.android.gms.internal.consent_sdk.C4399w2;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import com.icefishing.icefishingliveapp.C5284R;
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
import m.C4758s;
import n.ExecutorC4797a;
import q7.C4938g;
import r7.AbstractC4980k;
import u.AbstractC5088e;
import u2.C5107a;

/* renamed from: q2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4903n implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40100n;

    /* renamed from: u, reason: collision with root package name */
    public Object f40101u;

    /* renamed from: v, reason: collision with root package name */
    public Object f40102v;

    /* renamed from: w, reason: collision with root package name */
    public Object f40103w;

    /* renamed from: x, reason: collision with root package name */
    public Object f40104x;

    /* renamed from: y, reason: collision with root package name */
    public Object f40105y;

    /* renamed from: z, reason: collision with root package name */
    public Object f40106z;

    public /* synthetic */ C4903n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f40100n = i;
        this.f40101u = obj;
        this.f40102v = obj2;
        this.f40103w = obj3;
        this.f40104x = obj4;
        this.f40105y = obj5;
        this.f40106z = obj6;
    }

    public static boolean b(int[] iArr, int i) {
        for (int i4 : iArr) {
            if (i4 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i) {
        int c4 = m.N0.c(context, C5284R.attr.colorControlHighlight);
        int b9 = m.N0.b(context, C5284R.attr.colorButtonNormal);
        int[] iArr = m.N0.f39305b;
        int[] iArr2 = m.N0.f39307d;
        int b10 = G.c.b(c4, i);
        return new ColorStateList(new int[][]{iArr, iArr2, m.N0.f39306c, m.N0.f39309f}, new int[]{b9, b10, G.c.b(c4, i), i});
    }

    public static LayerDrawable g(m.I0 i02, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c4 = i02.c(context, C5284R.drawable.abc_star_black_48dp);
        Drawable c9 = i02.c(context, C5284R.drawable.abc_star_half_black_48dp);
        if ((c4 instanceof BitmapDrawable) && c4.getIntrinsicWidth() == dimensionPixelSize && c4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c4;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c4.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c9 instanceof BitmapDrawable) && c9.getIntrinsicWidth() == dimensionPixelSize && c9.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c9;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c9.draw(canvas2);
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
            mode = C4758s.f39492b;
        }
        mutate.setColorFilter(C4758s.c(i, mode));
    }

    public static void p(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(NativeAdvancedJsUtils.f18064p, "no_ads_fallback");
        bundle.putString("flow", str);
        C4907p c4907p = C4907p.f40108g;
        u2.d dVar = c4907p.f40109a;
        String str2 = c4907p.f40112d.f41217n;
        dVar.getClass();
        u2.d.a(context, str2, bundle, new S0.s(18, dVar, context));
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f40106z;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public Z1.h c() {
        String str = ((String) this.f40101u) == null ? " transportName" : "";
        if (((Z1.k) this.f40103w) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f40104x) == null) {
            str = CL.j(str, " eventMillis");
        }
        if (((Long) this.f40105y) == null) {
            str = CL.j(str, " uptimeMillis");
        }
        if (((HashMap) this.f40106z) == null) {
            str = CL.j(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new Z1.h((String) this.f40101u, (Integer) this.f40102v, (Z1.k) this.f40103w, ((Long) this.f40104x).longValue(), ((Long) this.f40105y).longValue(), (HashMap) this.f40106z);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public h3.n f(h3.n nVar) {
        return nVar.d(new ExecutorC4797a(1), new F3.l(10, this));
    }

    public ColorStateList h(Context context, int i) {
        if (i == C5284R.drawable.abc_edit_text_material) {
            return E.e.c(context, C5284R.color.abc_tint_edittext);
        }
        if (i == 2131230826) {
            return E.e.c(context, C5284R.color.abc_tint_switch_track);
        }
        if (i != C5284R.drawable.abc_switch_thumb_material) {
            if (i == C5284R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, m.N0.c(context, C5284R.attr.colorButtonNormal));
            }
            if (i == C5284R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i == C5284R.drawable.abc_btn_colored_material) {
                return e(context, m.N0.c(context, C5284R.attr.colorAccent));
            }
            if (i == 2131230821 || i == C5284R.drawable.abc_spinner_textfield_background_material) {
                return E.e.c(context, C5284R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f40102v, i)) {
                return m.N0.d(context, C5284R.attr.colorControlNormal);
            }
            if (b((int[]) this.f40105y, i)) {
                return E.e.c(context, C5284R.color.abc_tint_default);
            }
            if (b((int[]) this.f40106z, i)) {
                return E.e.c(context, C5284R.color.abc_tint_btn_checkable);
            }
            if (i == C5284R.drawable.abc_seekbar_thumb_material) {
                return E.e.c(context, C5284R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d2 = m.N0.d(context, C5284R.attr.colorSwitchThumbNormal);
        if (d2 == null || !d2.isStateful()) {
            iArr[0] = m.N0.f39305b;
            iArr2[0] = m.N0.b(context, C5284R.attr.colorSwitchThumbNormal);
            iArr[1] = m.N0.f39308e;
            iArr2[1] = m.N0.c(context, C5284R.attr.colorControlActivated);
            iArr[2] = m.N0.f39309f;
            iArr2[2] = m.N0.c(context, C5284R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = m.N0.f39305b;
            iArr[0] = iArr3;
            iArr2[0] = d2.getColorForState(iArr3, 0);
            iArr[1] = m.N0.f39308e;
            iArr2[1] = m.N0.c(context, C5284R.attr.colorControlActivated);
            iArr[2] = m.N0.f39309f;
            iArr2[2] = d2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public u8.l i() {
        o8.f fVar = o8.f.f39739a;
        Object obj = o8.f.f39739a;
        o8.e eVar = obj instanceof o8.e ? (o8.e) obj : null;
        Context b9 = eVar != null ? eVar.b() : null;
        AssetManager assets = b9 != null ? b9.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream open = assets.open((String) this.f40106z);
        kotlin.jvm.internal.h.d(open, "open(...)");
        return u8.b.h(open);
    }

    public B2.N j() {
        B2.N n9 = new B2.N(false);
        Object obj = r7.q.f40359n;
        n9.f200y = obj;
        n9.f196u = (e8.o) this.f40101u;
        n9.f197v = (String) this.f40102v;
        n9.f199x = (e8.u) this.f40104x;
        Map map = (Map) this.f40105y;
        if (!map.isEmpty()) {
            obj = r7.t.F(map);
        }
        n9.f200y = obj;
        n9.f198w = ((e8.m) this.f40103w).d();
        return n9;
    }

    public void k() {
        try {
            u8.r b9 = u8.b.b(i());
            try {
                u8.h k6 = b9.k(b9.z());
                u8.h k9 = b9.k(b9.z());
                b9.close();
                synchronized (this) {
                    kotlin.jvm.internal.h.b(k6);
                    this.f40103w = k6;
                    kotlin.jvm.internal.h.b(k9);
                    this.f40104x = k9;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f40102v).countDown();
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
        W3.g gVar;
        boolean g9;
        int i4;
        PackageInfo d2;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        K3.g gVar2 = (K3.g) this.f40101u;
        gVar2.a();
        bundle.putString("gmp_app_id", gVar2.f1625c.f1637b);
        C2561Fo c2561Fo = (C2561Fo) this.f40102v;
        synchronized (c2561Fo) {
            try {
                if (c2561Fo.f25017n == 0 && (d2 = c2561Fo.d("com.google.android.gms")) != null) {
                    c2561Fo.f25017n = d2.versionCode;
                }
                i = c2561Fo.f25017n;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C2561Fo) this.f40102v).b());
        C2561Fo c2561Fo2 = (C2561Fo) this.f40102v;
        synchronized (c2561Fo2) {
            try {
                if (((String) c2561Fo2.f25020w) == null) {
                    c2561Fo2.g();
                }
                str3 = (String) c2561Fo2.f25020w;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        K3.g gVar3 = (K3.g) this.f40101u;
        gVar3.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar3.f1624b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((Z3.a) AbstractC0415a.e(((Z3.c) ((Z3.d) this.f40106z)).d())).f4250a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e6) {
            e = e6;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) AbstractC0415a.e(((Z3.c) ((Z3.d) this.f40106z)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            gVar = (W3.g) ((Y3.a) this.f40105y).get();
            h4.b bVar = (h4.b) ((Y3.a) this.f40104x).get();
            if (gVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e9) {
            e = e9;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) AbstractC0415a.e(((Z3.c) ((Z3.d) this.f40106z)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            gVar = (W3.g) ((Y3.a) this.f40105y).get();
            h4.b bVar2 = (h4.b) ((Y3.a) this.f40104x).get();
            if (gVar == null) {
            }
        }
        bundle.putString("appid", (String) AbstractC0415a.e(((Z3.c) ((Z3.d) this.f40106z)).c()));
        bundle.putString("cliv", "fcm-24.0.0");
        gVar = (W3.g) ((Y3.a) this.f40105y).get();
        h4.b bVar22 = (h4.b) ((Y3.a) this.f40104x).get();
        if (gVar == null || bVar22 == null) {
            return;
        }
        W3.d dVar = (W3.d) gVar;
        synchronized (dVar) {
            long currentTimeMillis = System.currentTimeMillis();
            W3.h hVar = (W3.h) dVar.f3454a.get();
            synchronized (hVar) {
                g9 = hVar.g(currentTimeMillis);
            }
            if (g9) {
                synchronized (hVar) {
                    String d3 = hVar.d(System.currentTimeMillis());
                    hVar.f3460a.edit().putString("last-used-date", d3).commit();
                    hVar.f(d3);
                }
                i4 = 3;
            } else {
                i4 = 1;
            }
        }
        if (i4 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC5088e.d(i4)));
            bundle.putString("Firebase-Client", bVar22.a());
        }
    }

    public h3.n n(String str, Bundle bundle, String str2) {
        int i;
        try {
            l(str, bundle, str2);
            K2.b bVar = (K2.b) this.f40103w;
            K2.o oVar = bVar.f1570c;
            int a9 = oVar.a();
            K2.h hVar = K2.h.f1583v;
            if (a9 < 12000000) {
                return oVar.b() != 0 ? bVar.a(bundle).e(hVar, new S0.c(4, bVar, bundle)) : AbstractC0415a.q(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            K2.n c4 = K2.n.c(bVar.f1569b);
            synchronized (c4) {
                i = c4.f1604a;
                c4.f1604a = i + 1;
            }
            return c4.d(new K2.l(i, 1, bundle, 1)).d(hVar, K2.d.f1576u);
        } catch (InterruptedException | ExecutionException e6) {
            return AbstractC0415a.q(e6);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C4236yh d() {
        Application application = (Application) ((C4399w2) this.f40101u).f35944u;
        com.google.android.gms.internal.consent_sdk.r rVar = (com.google.android.gms.internal.consent_sdk.r) ((Z2) this.f40102v).d();
        Handler handler = com.google.android.gms.internal.consent_sdk.C.f35655a;
        com.google.android.gms.internal.consent_sdk.E.c(handler);
        com.google.android.gms.internal.consent_sdk.B b9 = com.google.android.gms.internal.consent_sdk.C.f35656b;
        com.google.android.gms.internal.consent_sdk.E.c(b9);
        return new C4236yh(application, rVar, handler, b9, (com.google.android.gms.internal.consent_sdk.O) ((Z2) this.f40103w).d(), ((C4329f) this.f40104x).a(), (C4349k) ((C4399w2) this.f40105y).d(), (C4333g) ((Z2) this.f40106z).d());
    }

    public String toString() {
        switch (this.f40100n) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f40102v);
                sb.append(", url=");
                sb.append((e8.o) this.f40101u);
                e8.m mVar = (e8.m) this.f40103w;
                if (mVar.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : mVar) {
                        int i4 = i + 1;
                        if (i < 0) {
                            AbstractC4980k.D();
                            throw null;
                        }
                        C4938g c4938g = (C4938g) obj;
                        String str = (String) c4938g.f40162n;
                        String str2 = (String) c4938g.f40163u;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (f8.c.i(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i = i4;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f40105y;
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

    public C4903n(Context context, String str) {
        String concat;
        this.f40100n = 7;
        this.f40101u = context.getApplicationContext();
        this.f40102v = str;
        this.f40103w = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = U2.c.a(context).e(0, context.getPackageName()).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (PackageManager.NameNotFoundException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Unable to get package version name for reporting", e6);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f40106z = concat;
    }

    public C4903n(Context context, C5107a c5107a, PackageInfo packageInfo, String str, A2.d dVar) {
        this.f40100n = 1;
        this.f40101u = context;
        this.f40102v = context.getPackageName();
        this.f40103w = c5107a.f41217n;
        this.f40104x = packageInfo;
        this.f40105y = str;
        this.f40106z = dVar;
    }

    public C4903n(int i) {
        this.f40100n = i;
        switch (i) {
            case 6:
                this.f40101u = new int[]{2131230836, 2131230834, 2131230760};
                this.f40102v = new int[]{2131230784, C5284R.drawable.abc_seekbar_tick_mark_material, C5284R.drawable.abc_ic_menu_share_mtrl_alpha, C5284R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C5284R.drawable.abc_ic_menu_cut_mtrl_alpha, C5284R.drawable.abc_ic_menu_selectall_mtrl_alpha, C5284R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f40103w = new int[]{2131230833, 2131230835, 2131230777, C5284R.drawable.abc_text_cursor_material, 2131230830, 2131230831, 2131230832};
                this.f40104x = new int[]{2131230809, C5284R.drawable.abc_cab_background_internal_bg, 2131230808};
                this.f40105y = new int[]{C5284R.drawable.abc_tab_indicator_material, C5284R.drawable.abc_textfield_search_material};
                this.f40106z = new int[]{C5284R.drawable.abc_btn_check_material, C5284R.drawable.abc_btn_radio_material, C5284R.drawable.abc_btn_check_material_anim, C5284R.drawable.abc_btn_radio_material_anim};
                break;
            case 8:
                this.f40100n = 8;
                this.f40101u = new AtomicBoolean(false);
                this.f40102v = new CountDownLatch(1);
                this.f40106z = "PublicSuffixDatabase.list";
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public C4903n(B2.N n9) {
        this.f40100n = 4;
        e8.o oVar = (e8.o) n9.f196u;
        if (oVar != null) {
            this.f40101u = oVar;
            this.f40102v = (String) n9.f197v;
            e8.m f6 = ((I1.b) n9.f198w).f();
            this.f40103w = f6;
            e8.u uVar = (e8.u) n9.f199x;
            this.f40104x = uVar;
            this.f40105y = r7.t.E(n9.f200y);
            if ("upgrade".equalsIgnoreCase(f6.a("Connection")) && uVar != null && uVar.a() != 0) {
                throw new IllegalArgumentException("expected a null or empty request body with 'Connection: upgrade'");
            }
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public C4903n(K3.g gVar, C2561Fo c2561Fo, Y3.a aVar, Y3.a aVar2, Z3.d dVar) {
        this.f40100n = 5;
        gVar.a();
        K2.b bVar = new K2.b(gVar.f1623a);
        this.f40101u = gVar;
        this.f40102v = c2561Fo;
        this.f40103w = bVar;
        this.f40104x = aVar;
        this.f40105y = aVar2;
        this.f40106z = dVar;
    }
}
