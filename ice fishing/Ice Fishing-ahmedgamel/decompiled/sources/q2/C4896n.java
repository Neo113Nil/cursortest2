package q2;

import a4.C0436d;
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
import c4.InterfaceC0542a;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.C2504Ch;
import com.google.android.gms.internal.ads.C2545Eo;
import com.google.android.gms.internal.consent_sdk.C4316f;
import com.google.android.gms.internal.consent_sdk.C4320g;
import com.google.android.gms.internal.consent_sdk.C4336k;
import com.google.android.gms.internal.consent_sdk.C4386w2;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import com.icefishingapp.icefishing.AbstractC4404f;
import com.icefishingapp.icefishing.C5275R;
import d4.C4447a;
import d4.C4449c;
import d4.InterfaceC4450d;
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
import m.C4710s;
import n.ExecutorC4742a;
import u.AbstractC5049e;
import u7.C5089g;
import v2.C5110a;
import v7.AbstractC5130k;

/* renamed from: q2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4896n implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40191n;

    /* renamed from: u, reason: collision with root package name */
    public Object f40192u;

    /* renamed from: v, reason: collision with root package name */
    public Object f40193v;

    /* renamed from: w, reason: collision with root package name */
    public Object f40194w;

    /* renamed from: x, reason: collision with root package name */
    public Object f40195x;

    /* renamed from: y, reason: collision with root package name */
    public Object f40196y;

    /* renamed from: z, reason: collision with root package name */
    public Object f40197z;

    public /* synthetic */ C4896n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f40191n = i;
        this.f40192u = obj;
        this.f40193v = obj2;
        this.f40194w = obj3;
        this.f40195x = obj4;
        this.f40196y = obj5;
        this.f40197z = obj6;
    }

    public static boolean b(int[] iArr, int i) {
        for (int i6 : iArr) {
            if (i6 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int c9 = m.N0.c(context, C5275R.attr.colorControlHighlight);
        int b9 = m.N0.b(context, C5275R.attr.colorButtonNormal);
        int[] iArr = m.N0.f39038b;
        int[] iArr2 = m.N0.f39040d;
        int b10 = G.c.b(c9, i);
        return new ColorStateList(new int[][]{iArr, iArr2, m.N0.f39039c, m.N0.f39042f}, new int[]{b9, b10, G.c.b(c9, i), i});
    }

    public static LayerDrawable g(m.I0 i02, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c9 = i02.c(context, C5275R.drawable.abc_star_black_48dp);
        Drawable c10 = i02.c(context, C5275R.drawable.abc_star_half_black_48dp);
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
            mode = C4710s.f39221b;
        }
        mutate.setColorFilter(C4710s.c(i, mode));
    }

    public static void p(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(NativeAdvancedJsUtils.f17906p, "no_ads_fallback");
        bundle.putString("flow", str);
        C4900p c4900p = C4900p.f40199g;
        v2.d dVar = c4900p.f40200a;
        String str2 = c4900p.f40203d.f41391n;
        dVar.getClass();
        v2.d.a(context, str2, bundle, new m1.e(dVar, context));
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f40197z;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public Z1.h c() {
        String str = ((String) this.f40192u) == null ? " transportName" : "";
        if (((Z1.k) this.f40194w) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f40195x) == null) {
            str = AbstractC4404f.f(str, " eventMillis");
        }
        if (((Long) this.f40196y) == null) {
            str = AbstractC4404f.f(str, " uptimeMillis");
        }
        if (((HashMap) this.f40197z) == null) {
            str = AbstractC4404f.f(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new Z1.h((String) this.f40192u, (Integer) this.f40193v, (Z1.k) this.f40194w, ((Long) this.f40195x).longValue(), ((Long) this.f40196y).longValue(), (HashMap) this.f40197z);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public j3.m e(j3.m mVar) {
        return mVar.d(new ExecutorC4742a(1), new H3.l(10, this));
    }

    public ColorStateList h(Context context, int i) {
        if (i == C5275R.drawable.abc_edit_text_material) {
            return E.e.c(context, C5275R.color.abc_tint_edittext);
        }
        if (i == 2131230826) {
            return E.e.c(context, C5275R.color.abc_tint_switch_track);
        }
        if (i != C5275R.drawable.abc_switch_thumb_material) {
            if (i == C5275R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, m.N0.c(context, C5275R.attr.colorButtonNormal));
            }
            if (i == C5275R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == C5275R.drawable.abc_btn_colored_material) {
                return d(context, m.N0.c(context, C5275R.attr.colorAccent));
            }
            if (i == 2131230821 || i == C5275R.drawable.abc_spinner_textfield_background_material) {
                return E.e.c(context, C5275R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f40193v, i)) {
                return m.N0.d(context, C5275R.attr.colorControlNormal);
            }
            if (b((int[]) this.f40196y, i)) {
                return E.e.c(context, C5275R.color.abc_tint_default);
            }
            if (b((int[]) this.f40197z, i)) {
                return E.e.c(context, C5275R.color.abc_tint_btn_checkable);
            }
            if (i == C5275R.drawable.abc_seekbar_thumb_material) {
                return E.e.c(context, C5275R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d2 = m.N0.d(context, C5275R.attr.colorSwitchThumbNormal);
        if (d2 == null || !d2.isStateful()) {
            iArr[0] = m.N0.f39038b;
            iArr2[0] = m.N0.b(context, C5275R.attr.colorSwitchThumbNormal);
            iArr[1] = m.N0.f39041e;
            iArr2[1] = m.N0.c(context, C5275R.attr.colorControlActivated);
            iArr[2] = m.N0.f39042f;
            iArr2[2] = m.N0.c(context, C5275R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = m.N0.f39038b;
            iArr[0] = iArr3;
            iArr2[0] = d2.getColorForState(iArr3, 0);
            iArr[1] = m.N0.f39041e;
            iArr2[1] = m.N0.c(context, C5275R.attr.colorControlActivated);
            iArr[2] = m.N0.f39042f;
            iArr2[2] = d2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public y8.l i() {
        s8.f fVar = s8.f.f40500a;
        Object obj = s8.f.f40500a;
        s8.e eVar = obj instanceof s8.e ? (s8.e) obj : null;
        Context b9 = eVar != null ? eVar.b() : null;
        AssetManager assets = b9 != null ? b9.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream open = assets.open((String) this.f40197z);
        kotlin.jvm.internal.h.d(open, "open(...)");
        return y8.b.h(open);
    }

    public C2.N j() {
        C2.N n9 = new C2.N(false);
        Object obj = v7.q.f41443n;
        n9.f305y = obj;
        n9.f301u = (i8.n) this.f40192u;
        n9.f302v = (String) this.f40193v;
        n9.f304x = (i8.t) this.f40195x;
        Map map = (Map) this.f40196y;
        if (!map.isEmpty()) {
            obj = v7.t.V(map);
        }
        n9.f305y = obj;
        n9.f303w = ((i8.l) this.f40194w).d();
        return n9;
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
                    this.f40194w = A9;
                    kotlin.jvm.internal.h.b(A10);
                    this.f40195x = A10;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f40193v).countDown();
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
        a4.g gVar;
        boolean g4;
        int i6;
        PackageInfo c9;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        O3.g gVar2 = (O3.g) this.f40192u;
        gVar2.a();
        bundle.putString("gmp_app_id", gVar2.f2347c.f2359b);
        C2545Eo c2545Eo = (C2545Eo) this.f40193v;
        synchronized (c2545Eo) {
            try {
                if (c2545Eo.f24649n == 0 && (c9 = c2545Eo.c("com.google.android.gms")) != null) {
                    c2545Eo.f24649n = c9.versionCode;
                }
                i = c2545Eo.f24649n;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C2545Eo) this.f40193v).a());
        C2545Eo c2545Eo2 = (C2545Eo) this.f40193v;
        synchronized (c2545Eo2) {
            try {
                if (((String) c2545Eo2.f24652w) == null) {
                    c2545Eo2.f();
                }
                str3 = (String) c2545Eo2.f24652w;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        O3.g gVar3 = (O3.g) this.f40192u;
        gVar3.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar3.f2346b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((C4447a) S0.f.b(((C4449c) ((InterfaceC4450d) this.f40197z)).d())).f37046a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e9) {
            e = e9;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) S0.f.b(((C4449c) ((InterfaceC4450d) this.f40197z)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            gVar = (a4.g) ((InterfaceC0542a) this.f40196y).get();
            l4.b bVar = (l4.b) ((InterfaceC0542a) this.f40195x).get();
            if (gVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) S0.f.b(((C4449c) ((InterfaceC4450d) this.f40197z)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            gVar = (a4.g) ((InterfaceC0542a) this.f40196y).get();
            l4.b bVar2 = (l4.b) ((InterfaceC0542a) this.f40195x).get();
            if (gVar == null) {
            }
        }
        bundle.putString("appid", (String) S0.f.b(((C4449c) ((InterfaceC4450d) this.f40197z)).c()));
        bundle.putString("cliv", "fcm-24.0.0");
        gVar = (a4.g) ((InterfaceC0542a) this.f40196y).get();
        l4.b bVar22 = (l4.b) ((InterfaceC0542a) this.f40195x).get();
        if (gVar == null || bVar22 == null) {
            return;
        }
        C0436d c0436d = (C0436d) gVar;
        synchronized (c0436d) {
            long currentTimeMillis = System.currentTimeMillis();
            a4.h hVar = (a4.h) c0436d.f4342a.get();
            synchronized (hVar) {
                g4 = hVar.g(currentTimeMillis);
            }
            if (g4) {
                synchronized (hVar) {
                    String d2 = hVar.d(System.currentTimeMillis());
                    hVar.f4349a.edit().putString("last-used-date", d2).commit();
                    hVar.f(d2);
                }
                i6 = 3;
            } else {
                i6 = 1;
            }
        }
        if (i6 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC5049e.d(i6)));
            bundle.putString("Firebase-Client", bVar22.a());
        }
    }

    public j3.m n(String str, Bundle bundle, String str2) {
        int i;
        try {
            l(str, bundle, str2);
            L2.b bVar = (L2.b) this.f40194w;
            L2.o oVar = bVar.f1625c;
            int a9 = oVar.a();
            L2.h hVar = L2.h.f1638v;
            if (a9 < 12000000) {
                return oVar.b() != 0 ? bVar.a(bundle).e(hVar, new S0.s(3, bVar, bundle)) : S0.f.h(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            L2.n c9 = L2.n.c(bVar.f1624b);
            synchronized (c9) {
                i = c9.f1659a;
                c9.f1659a = i + 1;
            }
            return c9.d(new L2.l(i, 1, bundle, 1)).d(hVar, L2.d.f1631u);
        } catch (InterruptedException | ExecutionException e9) {
            return S0.f.h(e9);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C2504Ch f() {
        Application application = (Application) ((C4386w2) this.f40192u).f35781u;
        com.google.android.gms.internal.consent_sdk.r rVar = (com.google.android.gms.internal.consent_sdk.r) ((Z2) this.f40193v).f();
        Handler handler = com.google.android.gms.internal.consent_sdk.C.f35492a;
        com.google.android.gms.internal.consent_sdk.E.c(handler);
        com.google.android.gms.internal.consent_sdk.B b9 = com.google.android.gms.internal.consent_sdk.C.f35493b;
        com.google.android.gms.internal.consent_sdk.E.c(b9);
        return new C2504Ch(application, rVar, handler, b9, (com.google.android.gms.internal.consent_sdk.O) ((Z2) this.f40194w).f(), ((C4316f) this.f40195x).a(), (C4336k) ((C4386w2) this.f40196y).f(), (C4320g) ((Z2) this.f40197z).f());
    }

    public String toString() {
        switch (this.f40191n) {
            case 4:
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f40193v);
                sb.append(", url=");
                sb.append((i8.n) this.f40192u);
                i8.l lVar = (i8.l) this.f40194w;
                if (lVar.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : lVar) {
                        int i6 = i + 1;
                        if (i < 0) {
                            AbstractC5130k.x();
                            throw null;
                        }
                        C5089g c5089g = (C5089g) obj;
                        String str = (String) c5089g.f41332n;
                        String str2 = (String) c5089g.f41333u;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (j8.c.i(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i = i6;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f40196y;
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

    public C4896n(Context context, String str) {
        String concat;
        this.f40191n = 7;
        this.f40192u = context.getApplicationContext();
        this.f40193v = str;
        this.f40194w = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = V2.c.a(context).c(0, context.getPackageName()).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (PackageManager.NameNotFoundException e9) {
            int i = u2.z.f41322b;
            v2.i.d("Unable to get package version name for reporting", e9);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f40197z = concat;
    }

    public C4896n(Context context, C5110a c5110a, PackageInfo packageInfo, String str, B2.d dVar) {
        this.f40191n = 1;
        this.f40192u = context;
        this.f40193v = context.getPackageName();
        this.f40194w = c5110a.f41391n;
        this.f40195x = packageInfo;
        this.f40196y = str;
        this.f40197z = dVar;
    }

    public C4896n(int i) {
        this.f40191n = i;
        switch (i) {
            case 6:
                this.f40192u = new int[]{2131230836, 2131230834, 2131230760};
                this.f40193v = new int[]{2131230784, C5275R.drawable.abc_seekbar_tick_mark_material, C5275R.drawable.abc_ic_menu_share_mtrl_alpha, C5275R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C5275R.drawable.abc_ic_menu_cut_mtrl_alpha, C5275R.drawable.abc_ic_menu_selectall_mtrl_alpha, C5275R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f40194w = new int[]{2131230833, 2131230835, 2131230777, C5275R.drawable.abc_text_cursor_material, 2131230830, 2131230831, 2131230832};
                this.f40195x = new int[]{2131230809, C5275R.drawable.abc_cab_background_internal_bg, 2131230808};
                this.f40196y = new int[]{C5275R.drawable.abc_tab_indicator_material, C5275R.drawable.abc_textfield_search_material};
                this.f40197z = new int[]{C5275R.drawable.abc_btn_check_material, C5275R.drawable.abc_btn_radio_material, C5275R.drawable.abc_btn_check_material_anim, C5275R.drawable.abc_btn_radio_material_anim};
                break;
            case 8:
                this.f40191n = 8;
                this.f40192u = new AtomicBoolean(false);
                this.f40193v = new CountDownLatch(1);
                this.f40197z = "PublicSuffixDatabase.list";
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public C4896n(C2.N n9) {
        this.f40191n = 4;
        i8.n nVar = (i8.n) n9.f301u;
        if (nVar != null) {
            this.f40192u = nVar;
            this.f40193v = (String) n9.f302v;
            i8.l b9 = ((G1.e) n9.f303w).b();
            this.f40194w = b9;
            i8.t tVar = (i8.t) n9.f304x;
            this.f40195x = tVar;
            this.f40196y = v7.t.U(n9.f305y);
            if ("upgrade".equalsIgnoreCase(b9.a("Connection")) && tVar != null && tVar.a() != 0) {
                throw new IllegalArgumentException("expected a null or empty request body with 'Connection: upgrade'");
            }
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public C4896n(O3.g gVar, C2545Eo c2545Eo, InterfaceC0542a interfaceC0542a, InterfaceC0542a interfaceC0542a2, InterfaceC4450d interfaceC4450d) {
        this.f40191n = 5;
        gVar.a();
        L2.b bVar = new L2.b(gVar.f2345a);
        this.f40192u = gVar;
        this.f40193v = c2545Eo;
        this.f40194w = bVar;
        this.f40195x = interfaceC0542a;
        this.f40196y = interfaceC0542a2;
        this.f40197z = interfaceC4450d;
    }
}
