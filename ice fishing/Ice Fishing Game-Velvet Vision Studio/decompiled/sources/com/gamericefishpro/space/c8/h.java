package com.gamericefishpro.space.c8;

import android.content.Context;
import android.content.pm.PackageInfo;
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
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.n.p1;
import com.gamericefishpro.space.n.u1;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.y.r0;
import com.gamericefishpro.space.y.v0;
import com.gamericefishpro.space.z.k1;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k1 {
    public Object a;
    public Object b = new com.gamericefishpro.space.z.l(this);
    public Object c = new v0();
    public Object d;
    public Object e;
    public Object f;

    public h(Function1 function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = com.gamericefishpro.space.t0.i.v(bool);
        this.e = com.gamericefishpro.space.t0.i.v(bool);
        this.f = com.gamericefishpro.space.t0.i.v(bool);
    }

    public static boolean g(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList i(Context context, int i) {
        int iC = u1.c(context, R.attr.colorControlHighlight);
        int iB = u1.b(context, R.attr.colorButtonNormal);
        int[] iArr = u1.b;
        int[] iArr2 = u1.d;
        int iB2 = com.gamericefishpro.space.u3.a.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, u1.c, u1.f}, new int[]{iB, iB2, com.gamericefishpro.space.u3.a.b(iC, i), i});
    }

    public static LayerDrawable k(p1 p1Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = p1Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = p1Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void n(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = com.gamericefishpro.space.n.q.b;
        }
        drawableMutate.setColorFilter(com.gamericefishpro.space.n.q.b(i, mode));
    }

    @Override // com.gamericefishpro.space.z.k1
    public boolean b() {
        return ((Boolean) ((f1) this.d).getValue()).booleanValue();
    }

    @Override // com.gamericefishpro.space.z.k1
    public Object d(r0 r0Var, Function2 function2, com.gamericefishpro.space.vh.c cVar) {
        Object objH = a0.h(new com.gamericefishpro.space.db.d(this, r0Var, function2, null, 20), cVar);
        return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
    }

    @Override // com.gamericefishpro.space.z.k1
    public float e(float f) {
        return ((Number) ((Function1) this.a).invoke(Float.valueOf(f))).floatValue();
    }

    public void f(String str, String str2) {
        HashMap map = (HashMap) this.f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public i h() {
        String strH = ((String) this.a) == null ? " transportName" : "";
        if (((m) this.c) == null) {
            strH = strH.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            strH = com.gamericefishpro.space.m5.a.h(strH, " eventMillis");
        }
        if (((Long) this.e) == null) {
            strH = com.gamericefishpro.space.m5.a.h(strH, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            strH = com.gamericefishpro.space.m5.a.h(strH, " autoMetadata");
        }
        if (strH.isEmpty()) {
            return new i((String) this.a, (Integer) this.b, (m) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public Task j(Task task) {
        return task.f(new com.gamericefishpro.space.o.a(1), new com.gamericefishpro.space.tb.j(this));
    }

    public ColorStateList l(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return com.gamericefishpro.space.s3.a.c(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165290) {
            return com.gamericefishpro.space.s3.a.c(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return i(context, u1.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return i(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return i(context, u1.c(context, R.attr.colorAccent));
            }
            if (i == 2131165285 || i == R.drawable.abc_spinner_textfield_background_material) {
                return com.gamericefishpro.space.s3.a.c(context, R.color.abc_tint_spinner);
            }
            if (g((int[]) this.b, i)) {
                return u1.d(context, R.attr.colorControlNormal);
            }
            if (g((int[]) this.e, i)) {
                return com.gamericefishpro.space.s3.a.c(context, R.color.abc_tint_default);
            }
            if (g((int[]) this.f, i)) {
                return com.gamericefishpro.space.s3.a.c(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return com.gamericefishpro.space.s3.a.c(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = u1.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = u1.b;
            iArr2[0] = u1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = u1.e;
            iArr2[1] = u1.c(context, R.attr.colorControlActivated);
            iArr[2] = u1.f;
            iArr2[2] = u1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = u1.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = u1.e;
            iArr2[1] = u1.c(context, R.attr.colorControlActivated);
            iArr[2] = u1.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void m(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zE;
        int i2;
        PackageInfo packageInfoD;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        com.gamericefishpro.space.wa.g gVar = (com.gamericefishpro.space.wa.g) this.a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.c.b);
        com.gamericefishpro.space.f1.k kVar = (com.gamericefishpro.space.f1.k) this.b;
        synchronized (kVar) {
            try {
                if (kVar.a == 0 && (packageInfoD = kVar.d("com.google.android.gms")) != null) {
                    kVar.a = packageInfoD.versionCode;
                }
                i = kVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((com.gamericefishpro.space.f1.k) this.b).b());
        com.gamericefishpro.space.f1.k kVar2 = (com.gamericefishpro.space.f1.k) this.b;
        synchronized (kVar2) {
            try {
                if (((String) kVar2.e) == null) {
                    kVar2.f();
                }
                str3 = (String) kVar2.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        com.gamericefishpro.space.wa.g gVar2 = (com.gamericefishpro.space.wa.g) this.a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((com.gamericefishpro.space.ob.a) com.gamericefishpro.space.d9.h.j(((com.gamericefishpro.space.ob.c) ((com.gamericefishpro.space.ob.d) this.f)).d())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) com.gamericefishpro.space.d9.h.j(((com.gamericefishpro.space.ob.c) ((com.gamericefishpro.space.ob.d) this.f)).c()));
        bundle.putString("cliv", "fcm-25.0.1");
        com.gamericefishpro.space.lb.g gVar3 = (com.gamericefishpro.space.lb.g) ((com.gamericefishpro.space.nb.a) this.e).get();
        com.gamericefishpro.space.vb.b bVar = (com.gamericefishpro.space.vb.b) ((com.gamericefishpro.space.nb.a) this.d).get();
        if (gVar3 == null || bVar == null) {
            return;
        }
        com.gamericefishpro.space.lb.d dVar = (com.gamericefishpro.space.lb.d) gVar3;
        synchronized (dVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.gamericefishpro.space.lb.i iVar = (com.gamericefishpro.space.lb.i) dVar.a.get();
            synchronized (iVar) {
                zE = iVar.e(com.gamericefishpro.space.lb.i.b, jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (iVar) {
                    iVar.a.a(new q0(18, iVar, iVar.b(System.currentTimeMillis())));
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(com.gamericefishpro.space.i3.e.b(i2)));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public Task o(String str, String str2, Bundle bundle) {
        int i;
        try {
            m(str, str2, bundle);
            com.gamericefishpro.space.r8.b bVar = (com.gamericefishpro.space.r8.b) this.c;
            com.gamericefishpro.space.r8.h hVar = com.gamericefishpro.space.r8.h.i;
            com.gamericefishpro.space.n3.g gVar = bVar.c;
            if (gVar.p() < 12000000) {
                return gVar.q() != 0 ? bVar.a(bundle).g(hVar, new com.gamericefishpro.space.u6.c(bVar, bundle)) : com.gamericefishpro.space.d9.h.v(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            com.gamericefishpro.space.r8.m mVarF = com.gamericefishpro.space.r8.m.f(bVar.b);
            synchronized (mVarF) {
                i = mVarF.a;
                mVarF.a = i + 1;
            }
            return mVarF.g(new com.gamericefishpro.space.r8.l(i, 1, bundle, 1)).f(hVar, com.gamericefishpro.space.r8.d.e);
        } catch (InterruptedException | ExecutionException e) {
            return com.gamericefishpro.space.d9.h.v(e);
        }
    }
}
