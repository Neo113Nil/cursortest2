package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.load.resource.bitmap.i;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import defpackage.cz11;
import defpackage.fvu;
import defpackage.z67;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class rri0 {
    public static Registry a(Glide glide, List list, yt2 yt2Var) {
        rtj0 s67Var;
        rtj0 b06Var;
        String str;
        Class cls;
        b16 bitmapPool = glide.getBitmapPool();
        g63 arrayPool = glide.getArrayPool();
        Context applicationContext = glide.getGlideContext().getApplicationContext();
        zht experiments = glide.getGlideContext().getExperiments();
        Registry registry = new Registry();
        bdh bdhVar = new bdh();
        bav bavVar = registry.g;
        synchronized (bavVar) {
            bavVar.a.add(bdhVar);
        }
        rlo rloVar = new rlo();
        bav bavVar2 = registry.g;
        synchronized (bavVar2) {
            bavVar2.a.add(rloVar);
        }
        Resources resources = applicationContext.getResources();
        ArrayList e = registry.e();
        b77 b77Var = new b77(applicationContext, e, bitmapPool, arrayPool);
        rtj0 jVar = new j(bitmapPool, new vuz());
        g gVar = new g(registry.e(), resources.getDisplayMetrics(), bitmapPool, arrayPool);
        int i = 2;
        int i2 = 0;
        if (experiments.a.containsKey(nht.class)) {
            b06Var = new t0w();
            s67Var = new t67();
        } else {
            s67Var = new s67(gVar, i2);
            b06Var = new b06(i, gVar, arrayPool);
        }
        registry.d("Animation", InputStream.class, Drawable.class, new df2(1, new h0w(10, e, arrayPool)));
        registry.d("Animation", ByteBuffer.class, Drawable.class, new df2(0, new h0w(10, e, arrayPool)));
        rtj0 utj0Var = new utj0(applicationContext);
        vtj0 f06Var = new f06(arrayPool);
        puj0 zz5Var = new zz5();
        puj0 ngtVar = new ngt();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.a(ByteBuffer.class, new u67());
        registry.a(InputStream.class, new jhu0(arrayPool));
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, s67Var);
        registry.d("Bitmap", InputStream.class, Bitmap.class, b06Var);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = str2;
            cls = ParcelFileDescriptor.class;
        } else {
            str = str2;
            cls = ParcelFileDescriptor.class;
            registry.d("Bitmap", cls, Bitmap.class, new s67(gVar, 1));
        }
        registry.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new j(bitmapPool, new wdz()));
        registry.d("Bitmap", cls, Bitmap.class, jVar);
        r430 r430Var = cz11.a.a;
        registry.c(Bitmap.class, Bitmap.class, r430Var);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new az11());
        registry.b(Bitmap.class, f06Var);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new b06(resources, s67Var));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new b06(resources, b06Var));
        registry.d("BitmapDrawable", cls, BitmapDrawable.class, new b06(resources, jVar));
        registry.b(BitmapDrawable.class, new c06(bitmapPool, f06Var));
        registry.d("Animation", InputStream.class, GifDrawable.class, new dru0(e, b77Var, arrayPool));
        registry.d("Animation", ByteBuffer.class, GifDrawable.class, b77Var);
        registry.b(GifDrawable.class, new ogt());
        registry.c(lgt.class, lgt.class, r430Var);
        registry.d("Bitmap", lgt.class, Bitmap.class, new df2(2, bitmapPool));
        registry.d("legacy_append", Uri.class, Drawable.class, utj0Var);
        registry.d("legacy_append", Uri.class, Bitmap.class, new b06(1, utj0Var, bitmapPool));
        registry.h(new d77());
        registry.c(File.class, ByteBuffer.class, new z67.a());
        registry.c(File.class, InputStream.class, new i0r());
        registry.d("legacy_append", File.class, File.class, new lzq());
        registry.c(File.class, cls, new f0r());
        registry.c(File.class, File.class, r430Var);
        registry.h(new u0w(arrayPool));
        if (!"robolectric".equals(str)) {
            registry.h(new rd90());
        }
        r430 cljVar = new clj(applicationContext, 2);
        r430 cljVar2 = new clj(applicationContext, 0);
        r430 cljVar3 = new clj(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        registry.c(cls2, InputStream.class, cljVar);
        registry.c(Integer.class, InputStream.class, cljVar);
        registry.c(cls2, AssetFileDescriptor.class, cljVar2);
        registry.c(Integer.class, AssetFileDescriptor.class, cljVar2);
        registry.c(cls2, Drawable.class, cljVar3);
        registry.c(Integer.class, Drawable.class, cljVar3);
        registry.c(Uri.class, InputStream.class, new clj(applicationContext, 7));
        registry.c(Uri.class, AssetFileDescriptor.class, new clj(applicationContext, 6));
        r430 huj0Var = new huj0(resources, 2);
        r430 huj0Var2 = new huj0(resources, 0);
        r430 huj0Var3 = new huj0(resources, 1);
        registry.c(Integer.class, Uri.class, huj0Var);
        registry.c(cls2, Uri.class, huj0Var);
        registry.c(Integer.class, AssetFileDescriptor.class, huj0Var2);
        registry.c(cls2, AssetFileDescriptor.class, huj0Var2);
        registry.c(Integer.class, InputStream.class, huj0Var3);
        registry.c(cls2, InputStream.class, huj0Var3);
        registry.c(String.class, InputStream.class, new aqg());
        registry.c(Uri.class, InputStream.class, new aqg());
        registry.c(String.class, InputStream.class, new ttu0());
        registry.c(String.class, cls, new stu0());
        registry.c(String.class, AssetFileDescriptor.class, new rtu0());
        registry.c(Uri.class, InputStream.class, new r93(applicationContext.getAssets(), 1));
        registry.c(Uri.class, AssetFileDescriptor.class, new r93(applicationContext.getAssets(), 0));
        registry.c(Uri.class, InputStream.class, new clj(applicationContext, 4));
        registry.c(Uri.class, InputStream.class, new clj(applicationContext, 5));
        registry.c(Uri.class, InputStream.class, new n5g0(applicationContext, InputStream.class));
        registry.c(Uri.class, cls, new n5g0(applicationContext, cls));
        registry.c(Uri.class, InputStream.class, new ig21(contentResolver, 2));
        registry.c(Uri.class, cls, new ig21(contentResolver, 1));
        registry.c(Uri.class, AssetFileDescriptor.class, new ig21(contentResolver, 0));
        registry.c(Uri.class, InputStream.class, new zh21());
        registry.c(URL.class, InputStream.class, new dh21());
        registry.c(Uri.class, File.class, new clj(applicationContext, 3));
        registry.c(cit.class, InputStream.class, new fvu.a());
        registry.c(byte[].class, ByteBuffer.class, new h67());
        registry.c(byte[].class, InputStream.class, new j67());
        registry.c(Uri.class, Uri.class, r430Var);
        registry.c(Drawable.class, Drawable.class, r430Var);
        registry.d("legacy_append", Drawable.class, Drawable.class, new bz11());
        registry.i(Bitmap.class, BitmapDrawable.class, new d06(resources, 0));
        registry.i(Bitmap.class, byte[].class, zz5Var);
        registry.i(Drawable.class, byte[].class, new jdj(6, bitmapPool, zz5Var, ngtVar));
        registry.i(GifDrawable.class, byte[].class, ngtVar);
        rtj0 jVar2 = new j(bitmapPool, new i());
        registry.d("legacy_append", ByteBuffer.class, Bitmap.class, jVar2);
        registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new b06(resources, jVar2));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
            try {
                okHttpGlideModule.getClass();
                registry.j(new nw60());
            } catch (AbstractMethodError e2) {
                ny61.h("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(okHttpGlideModule.getClass().getName()), e2);
                return null;
            }
        }
        if (yt2Var != null) {
            yt2Var.a(applicationContext, glide, registry);
        }
        return registry;
    }
}
