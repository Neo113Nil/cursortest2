package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.text.selection.CrossStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class u8b1 {
    public static final ckq0 a(rkq0 rkq0Var, ci6 ci6Var) {
        boolean z = rkq0Var.c() == CrossStatus.CROSSED;
        return new ckq0(c(rkq0Var.f(), z, true, rkq0Var.g(), ci6Var), c(rkq0Var.e(), z, false, rkq0Var.k(), ci6Var), z);
    }

    public static final bkq0 b(rkq0 rkq0Var, dfq0 dfq0Var, bkq0 bkq0Var) {
        int i = rkq0Var.a() ? dfq0Var.c : dfq0Var.d;
        int g = rkq0Var.a() ? rkq0Var.g() : rkq0Var.k();
        int i2 = dfq0Var.b;
        dry0 dry0Var = dfq0Var.f;
        int i3 = dfq0Var.e;
        if (g != i2) {
            return dfq0Var.a(i);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        i3y b = a.b(lazyThreadSafetyMode, new ys0(dfq0Var, i, 14));
        i3y b2 = a.b(lazyThreadSafetyMode, new nhk0(dfq0Var, i, rkq0Var.a() ? dfq0Var.d : dfq0Var.c, rkq0Var, b));
        if (dfq0Var.a != bkq0Var.c) {
            return (bkq0) b2.getValue();
        }
        if (i == i3) {
            return bkq0Var;
        }
        if (((Number) b.getValue()).intValue() != dry0Var.b.d(i3)) {
            return (bkq0) b2.getValue();
        }
        int i4 = bkq0Var.b;
        long n = dry0Var.n(i4);
        boolean a = rkq0Var.a();
        if (i3 != -1) {
            if (i != i3) {
                if (!(a ^ (dfq0Var.b() == CrossStatus.CROSSED))) {
                }
            }
            return dfq0Var.a(i);
        }
        int i5 = asy0.c;
        return (i4 == ((int) (n >> 32)) || i4 == ((int) (n & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) ? (bkq0) b2.getValue() : dfq0Var.a(i);
    }

    public static final bkq0 c(dfq0 dfq0Var, boolean z, boolean z2, int i, ci6 ci6Var) {
        long j;
        int i2 = z2 ? dfq0Var.c : dfq0Var.d;
        if (i != dfq0Var.b) {
            return dfq0Var.a(i2);
        }
        long b = ci6Var.b(dfq0Var, i2);
        if (z ^ z2) {
            int i3 = asy0.c;
            j = b >> 32;
        } else {
            int i4 = asy0.c;
            j = _Gost_CryptoPro_PrivateKeyValues.maxDWORD & b;
        }
        return dfq0Var.a((int) j);
    }

    public static Intent d(Context context, Uri uri) {
        String g = qna1.g(uri.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, g);
        intent.addFlags(268435457);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return intent;
        }
        Toast.makeText(context, nxh0.no_app_found_error, 0).show();
        return null;
    }

    public static final bkq0 e(bkq0 bkq0Var, dfq0 dfq0Var, int i) {
        return new bkq0(dfq0Var.f.a(i), i, bkq0Var.c);
    }

    public static final Bitmap f(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap copy = bitmap.copy(config, false);
        if (copy != null) {
            return copy;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public static final Bitmap g(Drawable drawable) {
        Bitmap bitmap;
        if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
            return bitmap;
        }
        Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static final Bitmap h(int i, Context context) {
        Drawable t = vng.t(i, context);
        if (t == null) {
            ny61.g(oyr.i(i, "No drawable associated with "));
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(t.getIntrinsicWidth(), t.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        t.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        t.draw(canvas);
        return createBitmap;
    }
}
