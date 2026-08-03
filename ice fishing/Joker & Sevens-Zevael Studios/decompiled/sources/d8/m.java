package d8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import m.j1;
import m0.l1;
import org.fortheloss.st.R;
import w.p0;
import w.s0;
import x.t0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f1797a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1798b = new x.l(this);

    /* renamed from: c, reason: collision with root package name */
    public Object f1799c = new s0();

    /* renamed from: d, reason: collision with root package name */
    public Object f1800d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1801e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1802f;

    /* JADX WARN: Multi-variable type inference failed */
    public m(oc.c cVar) {
        this.f1797a = (pc.k) cVar;
        Boolean bool = Boolean.FALSE;
        this.f1800d = m0.z.s(bool);
        this.f1801e = m0.z.s(bool);
        this.f1802f = m0.z.s(bool);
    }

    public static boolean g(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList i(Context context, int i10) {
        int c3 = j1.c(context, R.attr.colorControlHighlight);
        int b2 = j1.b(context, R.attr.colorButtonNormal);
        int[] iArr = j1.f4363b;
        int[] iArr2 = j1.f4365d;
        int b10 = a3.a.b(c3, i10);
        return new ColorStateList(new int[][]{iArr, iArr2, j1.f4364c, j1.f4367f}, new int[]{b2, b10, a3.a.b(c3, i10), i10});
    }

    public static LayerDrawable k(m.t0 t0Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable c3 = t0Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c7 = t0Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c3 instanceof BitmapDrawable) && c3.getIntrinsicWidth() == dimensionPixelSize && c3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c3;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c3.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c7 instanceof BitmapDrawable) && c7.getIntrinsicWidth() == dimensionPixelSize && c7.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c7;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c7.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c7.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void n(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter e10;
        if (m.c0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = m.o.f4397b;
        }
        PorterDuff.Mode mode2 = m.o.f4397b;
        synchronized (m.o.class) {
            e10 = m.t0.e(i10, mode);
        }
        drawable.setColorFilter(e10);
    }

    @Override // x.t0
    public boolean b() {
        return ((Boolean) ((l1) this.f1800d).getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [oc.c, pc.k] */
    @Override // x.t0
    public float d(float f10) {
        return ((Number) ((pc.k) this.f1797a).invoke(Float.valueOf(f10))).floatValue();
    }

    @Override // x.t0
    public Object e(p0 p0Var, oc.e eVar, hc.c cVar) {
        Object e10 = yc.a0.e(new c0.c(this, p0Var, eVar, null, 10), cVar);
        return e10 == gc.a.f2559g ? e10 : ac.o.f277a;
    }

    public void f(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1802f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public w5.h h() {
        String str = ((String) this.f1797a) == null ? " transportName" : "";
        if (((w5.k) this.f1799c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1800d) == null) {
            str = a4.d.i(str, " eventMillis");
        }
        if (((Long) this.f1801e) == null) {
            str = a4.d.i(str, " uptimeMillis");
        }
        if (((HashMap) this.f1802f) == null) {
            str = a4.d.i(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new w5.h((String) this.f1797a, (Integer) this.f1798b, (w5.k) this.f1799c, ((Long) this.f1800d).longValue(), ((Long) this.f1801e).longValue(), (HashMap) this.f1802f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public g7.o j(g7.o oVar) {
        return oVar.d(new a4.e(0), new d6.f(this));
    }

    public ColorStateList l(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            Object obj = j.a.f3284a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i10 == 2131165263) {
            Object obj2 = j.a.f3284a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i10 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d10 = j1.d(context, R.attr.colorSwitchThumbNormal);
            if (d10 == null || !d10.isStateful()) {
                iArr[0] = j1.f4363b;
                iArr2[0] = j1.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = j1.f4366e;
                iArr2[1] = j1.c(context, R.attr.colorControlActivated);
                iArr[2] = j1.f4367f;
                iArr2[2] = j1.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = j1.f4363b;
                iArr[0] = iArr3;
                iArr2[0] = d10.getColorForState(iArr3, 0);
                iArr[1] = j1.f4366e;
                iArr2[1] = j1.c(context, R.attr.colorControlActivated);
                iArr[2] = j1.f4367f;
                iArr2[2] = d10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
            return i(context, j1.c(context, R.attr.colorButtonNormal));
        }
        if (i10 == R.drawable.abc_btn_borderless_material) {
            return i(context, 0);
        }
        if (i10 == R.drawable.abc_btn_colored_material) {
            return i(context, j1.c(context, R.attr.colorAccent));
        }
        if (i10 == 2131165258 || i10 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = j.a.f3284a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (g((int[]) this.f1798b, i10)) {
            return j1.d(context, R.attr.colorControlNormal);
        }
        if (g((int[]) this.f1801e, i10)) {
            Object obj4 = j.a.f3284a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (g((int[]) this.f1802f, i10)) {
            Object obj5 = j.a.f3284a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i10 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = j.a.f3284a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        String str4;
        u7.f fVar;
        boolean g8;
        int i11;
        PackageInfo d10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        i7.g gVar = (i7.g) this.f1797a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f3233c.f3246b);
        b0.s0 s0Var = (b0.s0) this.f1798b;
        synchronized (s0Var) {
            try {
                if (s0Var.f888a == 0 && (d10 = s0Var.d("com.google.android.gms")) != null) {
                    s0Var.f888a = d10.versionCode;
                }
                i10 = s0Var.f888a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((b0.s0) this.f1798b).b());
        b0.s0 s0Var2 = (b0.s0) this.f1798b;
        synchronized (s0Var2) {
            try {
                if (((String) s0Var2.f892e) == null) {
                    s0Var2.f();
                }
                str3 = (String) s0Var2.f892e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        i7.g gVar2 = (i7.g) this.f1797a;
        gVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f3232b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((x7.a) i7.b.l(((x7.c) ((x7.d) this.f1802f)).d())).f8372a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) i7.b.l(((x7.c) ((x7.d) this.f1802f)).c()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (u7.f) ((w7.a) this.f1801e).get();
            f8.b bVar = (f8.b) ((w7.a) this.f1800d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) i7.b.l(((x7.c) ((x7.d) this.f1802f)).c()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (u7.f) ((w7.a) this.f1801e).get();
            f8.b bVar2 = (f8.b) ((w7.a) this.f1800d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) i7.b.l(((x7.c) ((x7.d) this.f1802f)).c()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (u7.f) ((w7.a) this.f1801e).get();
        f8.b bVar22 = (f8.b) ((w7.a) this.f1800d).get();
        if (fVar == null || bVar22 == null) {
            return;
        }
        u7.c cVar = (u7.c) fVar;
        synchronized (cVar) {
            long currentTimeMillis = System.currentTimeMillis();
            v vVar = (v) cVar.f6718a.get();
            synchronized (vVar) {
                g8 = vVar.g(currentTimeMillis);
            }
            if (g8) {
                synchronized (vVar) {
                    String d11 = vVar.d(System.currentTimeMillis());
                    vVar.f1825a.edit().putString("last-used-date", d11).commit();
                    vVar.f(d11);
                }
                i11 = 3;
            } else {
                i11 = 1;
            }
        }
        if (i11 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(v.f.d(i11)));
            bundle.putString("Firebase-Client", bVar22.a());
        }
    }

    public g7.o o(String str, String str2, Bundle bundle) {
        int i10;
        try {
            m(str, str2, bundle);
            l6.a aVar = (l6.a) this.f1799c;
            l6.n nVar = l6.n.f4205g;
            l6.m mVar = aVar.f4169c;
            if (mVar.q() >= 12000000) {
                l6.l m10 = l6.l.m(aVar.f4168b);
                synchronized (m10) {
                    i10 = m10.f4198a;
                    m10.f4198a = i10 + 1;
                }
                return m10.n(new l6.k(i10, 1, bundle, 1)).d(nVar, l6.b.f4174g);
            }
            if (mVar.r() != 0) {
                return aVar.a(bundle).e(nVar, new x4.e(aVar, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            g7.o oVar = new g7.o();
            oVar.k(iOException);
            return oVar;
        } catch (InterruptedException | ExecutionException e10) {
            g7.o oVar2 = new g7.o();
            oVar2.k(e10);
            return oVar2;
        }
    }
}
