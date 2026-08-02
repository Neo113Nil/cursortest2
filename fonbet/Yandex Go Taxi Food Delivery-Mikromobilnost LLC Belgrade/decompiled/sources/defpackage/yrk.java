package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.h;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import defpackage.bd7;
import defpackage.g3r;
import defpackage.ny61;
import defpackage.wfx;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class yrk extends osk {
    public final /* synthetic */ Div2View c;
    public final /* synthetic */ DivGifImageView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrk(Div2View div2View, h hVar, DivGifImageView divGifImageView) {
        super(div2View);
        this.c = div2View;
        this.d = divGifImageView;
    }

    @Override // defpackage.osk, defpackage.btk
    public final void d(Throwable th) {
        super.d(th);
        this.d.setGifUrl$div_release(null);
    }

    @Override // defpackage.k25, defpackage.btk
    public final void g(final bd7 bd7Var) {
        final WeakReference weakReference = new WeakReference(this.d);
        new AsyncTask<Void, Void, Drawable>(weakReference, bd7Var) { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$LoadDrawableOnPostPTask
            private final bd7 cachedBitmap;
            private final WeakReference<DivGifImageView> view;

            {
                this.view = weakReference;
                this.cachedBitmap = bd7Var;
            }

            private final Drawable createDrawableFromBytes() throws IOException, IllegalStateException {
                Context context;
                byte[] bArr = this.cachedBitmap.c;
                if (bArr == null) {
                    ny61.r("no bytes stored in cached bitmap");
                    return null;
                }
                DivGifImageView divGifImageView = this.view.get();
                if (divGifImageView == null || (context = divGifImageView.getContext()) == null) {
                    ny61.r("failed retrieve context");
                    return null;
                }
                File createTempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
                try {
                    g3r.f(createTempFile, bArr);
                    return ImageDecoder.decodeDrawable(ImageDecoder.createSource(createTempFile));
                } finally {
                    createTempFile.delete();
                }
            }

            private final ImageDecoder.Source createSourceFromUri() {
                Uri uri = this.cachedBitmap.b;
                String path = uri != null ? uri.getPath() : null;
                if (path == null) {
                    int i = wfx.a;
                    return null;
                }
                try {
                    return ImageDecoder.createSource(new File(path));
                } catch (IOException unused) {
                    int i2 = wfx.a;
                    return null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.os.AsyncTask
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Drawable doInBackground(Void... params) {
                ImageDecoder.Source createSourceFromUri;
                try {
                    return createDrawableFromBytes();
                } catch (IOException unused) {
                    int i = wfx.a;
                    createSourceFromUri = this.createSourceFromUri();
                    if (createSourceFromUri != null) {
                        return null;
                    }
                    try {
                        return ImageDecoder.decodeDrawable(createSourceFromUri);
                    } catch (IOException unused2) {
                        int i2 = wfx.a;
                        return null;
                    }
                } catch (IllegalStateException unused3) {
                    int i3 = wfx.a;
                    createSourceFromUri = this.createSourceFromUri();
                    if (createSourceFromUri != null) {
                    }
                }
            }

            public final bd7 getCachedBitmap() {
                return this.cachedBitmap;
            }

            public final WeakReference<DivGifImageView> getView() {
                return this.view;
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Drawable result) {
                super.onPostExecute((DivGifImageBinder$LoadDrawableOnPostPTask) result);
                if (result == null || !(result instanceof AnimatedImageDrawable)) {
                    DivGifImageView divGifImageView = this.view.get();
                    if (divGifImageView != null) {
                        divGifImageView.setImage(this.cachedBitmap.a);
                    }
                } else {
                    DivGifImageView divGifImageView2 = this.view.get();
                    if (divGifImageView2 != null) {
                        divGifImageView2.setImage(result);
                    }
                }
                DivGifImageView divGifImageView3 = this.view.get();
                if (divGifImageView3 != null) {
                    divGifImageView3.imageLoaded();
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // defpackage.k25
    public final void i(final Bitmap bitmap, BitmapSource bitmapSource) {
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        boolean a = fu11Var.a();
        final DivGifImageView divGifImageView = this.d;
        if (!a) {
            a g = unr0.g(this.c, ngd0Var);
            if (!fu11Var.a()) {
                g.c(new sls() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$Companion$setImage$$inlined$runMainThreadAction$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        DivGifImageView.this.setImage(bitmap);
                        return zy11.a;
                    }
                });
                divGifImageView.imageLoaded();
            }
        }
        divGifImageView.setImage(bitmap);
        divGifImageView.imageLoaded();
    }

    @Override // defpackage.k25
    public final void j(final Drawable drawable, BitmapSource bitmapSource) {
        ngd0 ngd0Var = ngd0.G;
        ngd0Var.p();
        fu11 fu11Var = fu11.a;
        boolean a = fu11Var.a();
        final DivGifImageView divGifImageView = this.d;
        if (!a) {
            a g = unr0.g(this.c, ngd0Var);
            if (!fu11Var.a()) {
                g.c(new sls() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$Companion$setImage$$inlined$runMainThreadAction$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        DivGifImageView.this.setImage(drawable);
                        return zy11.a;
                    }
                });
                divGifImageView.imageLoaded();
            }
        }
        divGifImageView.setImage(drawable);
        divGifImageView.imageLoaded();
    }
}
