package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class omr extends FrameLayout {
    public final nmr a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final AppCompatImageView f;
    public final SubtitleView g;
    public final ProgressBar h;
    public final AppCompatTextView i;
    public final nbl j;
    public i8l k;
    public final boolean l;
    public final Handler m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final Drawable q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.view.View, android.view.ViewGroup, omr] */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.widget.ProgressBar] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.appcompat.widget.AppCompatImageView] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.media3.ui.SubtitleView] */
    /* JADX WARN: Type inference failed for: r6v17, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v38 */
    public omr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Throwable th;
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        View view;
        ?? r6;
        ?? r3;
        ?? r32;
        AppCompatTextView appCompatTextView;
        this.m = new Handler(Looper.getMainLooper());
        this.n = 0;
        this.o = false;
        nmr nmrVar = new nmr(this);
        this.a = nmrVar;
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            ImageView imageView = new ImageView(context);
            if (dvt.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231165, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231165, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ben.a, 0, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(28);
                i5 = obtainStyledAttributes.getColor(28, 0);
                this.n = obtainStyledAttributes.getInt(29, 0);
                this.o = obtainStyledAttributes.getBoolean(11, false);
                z5 = obtainStyledAttributes.getBoolean(34, false);
                z6 = obtainStyledAttributes.getBoolean(38, false);
                th = null;
                boolean z10 = obtainStyledAttributes.getBoolean(39, false);
                boolean z11 = obtainStyledAttributes.getBoolean(37, false);
                z2 = obtainStyledAttributes.getBoolean(35, false);
                int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                z = obtainStyledAttributes.getBoolean(36, false);
                int i6 = obtainStyledAttributes.getInt(30, 1);
                int i7 = obtainStyledAttributes.getInt(17, 0);
                obtainStyledAttributes.getInt(26, ScreenMirroringConfig.Test.pcVideoUdpPort);
                boolean z12 = obtainStyledAttributes.getBoolean(10, true);
                obtainStyledAttributes.getBoolean(3, true);
                int integer = obtainStyledAttributes.getInteger(23, 0);
                this.s = obtainStyledAttributes.getBoolean(12, this.s);
                boolean z13 = obtainStyledAttributes.getBoolean(9, true);
                obtainStyledAttributes.recycle();
                z4 = z12;
                i4 = resourceId;
                z3 = z13;
                z8 = z10;
                i3 = integer;
                i = i6;
                z7 = z11;
                i2 = i7;
                z9 = hasValue;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            th = null;
            i = 1;
            z = false;
            i2 = 0;
            i3 = 0;
            z2 = false;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
            z9 = false;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
        boolean z14 = z5;
        aspectRatioFrameLayout.setId(R.id.exo_content_frame);
        boolean z15 = z6;
        addView(aspectRatioFrameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b = aspectRatioFrameLayout;
        aspectRatioFrameLayout.setResizeMode(i2);
        View view2 = new View(context);
        view2.setId(R.id.exo_shutter);
        aspectRatioFrameLayout.addView(view2, new FrameLayout.LayoutParams(-1, -1));
        this.c = view2;
        if (z9) {
            view2.setBackgroundColor(i5);
        }
        if (i == 0) {
            r6 = th;
        } else {
            if (i == 2) {
                view = new TextureView(context);
            } else if (i == 3) {
                try {
                    int i8 = k6r.l;
                    view = (View) k6r.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e) {
                    b6e.o("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    throw th;
                }
            } else if (i != 4) {
                view = new SurfaceView(context);
            } else {
                try {
                    int i9 = rau.b;
                    view = (View) rau.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    b6e.o("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    throw th;
                }
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            view.setOnClickListener(nmrVar);
            view.setClickable(false);
            aspectRatioFrameLayout.addView(view, 0, layoutParams);
            r6 = view;
        }
        this.d = r6;
        this.e = i == 3;
        if (z14) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.exo_ad_overlay);
            addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        if (z15) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(R.id.exo_overlay);
            addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        }
        this.p = z2;
        if (z2) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setId(R.id.exo_artwork);
            appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            aspectRatioFrameLayout.addView(appCompatImageView, new FrameLayout.LayoutParams(-1, -1));
            r3 = appCompatImageView;
        } else {
            r3 = th;
        }
        this.f = r3;
        if (i4 != 0) {
            this.q = getContext().getDrawable(i4);
        }
        if (z8) {
            SubtitleView subtitleView = new SubtitleView(context);
            subtitleView.setId(R.id.exo_subtitles);
            aspectRatioFrameLayout.addView(subtitleView, new FrameLayout.LayoutParams(-1, -1));
            r32 = subtitleView;
        } else {
            r32 = th;
        }
        this.g = r32;
        if (r32 != 0) {
            r32.a();
            r32.b();
        }
        this.r = i3;
        if (i3 == 0) {
            this.h = th;
        } else {
            ProgressBar progressBar = new ProgressBar(context);
            progressBar.setId(R.id.exo_buffering);
            progressBar.setIndeterminate(true);
            aspectRatioFrameLayout.addView(progressBar, new FrameLayout.LayoutParams(-1, -1, 17));
            this.h = progressBar;
            progressBar.setVisibility(8);
        }
        if (z7) {
            Resources resources3 = context.getResources();
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
            appCompatTextView2.setId(R.id.exo_error_message);
            appCompatTextView2.setTextColor(context.getColor(R.color.exo_white));
            appCompatTextView2.setTextSize(2, 14.0f);
            appCompatTextView2.setBackgroundResource(R.drawable.exo_rounded_rectangle);
            int dimensionPixelSize = resources3.getDimensionPixelSize(R.dimen.exo_error_message_text_padding_horizontal);
            int dimensionPixelSize2 = resources3.getDimensionPixelSize(R.dimen.exo_error_message_text_padding_vertical);
            appCompatTextView2.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 17);
            layoutParams2.setMargins(0, 0, 0, resources3.getDimensionPixelSize(R.dimen.exo_error_message_margin_bottom));
            aspectRatioFrameLayout.addView(appCompatTextView2, layoutParams2);
            appCompatTextView = appCompatTextView2;
        } else {
            appCompatTextView = null;
        }
        this.i = appCompatTextView;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
        this.l = z;
        this.u = z4;
        this.t = z3;
        if (z) {
            nbl nblVar = new nbl(context, null, 0, attributeSet);
            nblVar.setId(R.id.exo_controller);
            nblVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(nblVar);
            this.j = nblVar;
            sbl sblVar = nblVar.a;
            int i10 = sblVar.z;
            if (i10 != 3 && i10 != 2) {
                sblVar.f();
                sblVar.i(2);
            }
            nblVar.d.add(nmrVar);
            setClickable(true);
        } else {
            this.j = null;
        }
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        i();
    }

    public static void a(TextureView textureView) {
        Matrix matrix = new Matrix();
        textureView.getWidth();
        textureView.getHeight();
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        i8l i8lVar = this.k;
        return i8lVar != null && i8lVar.V0(16) && this.k.i() && this.k.g0();
    }

    public final boolean c(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                AppCompatImageView appCompatImageView = this.f;
                appCompatImageView.setImageDrawable(drawable);
                appCompatImageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final void d(i8l i8lVar) {
        vq1.A(Looper.myLooper() == Looper.getMainLooper());
        vq1.v(i8lVar == null || i8lVar.X() == Looper.getMainLooper());
        i8l i8lVar2 = this.k;
        if (i8lVar2 == i8lVar) {
            return;
        }
        View view = this.d;
        nmr nmrVar = this.a;
        if (i8lVar2 != null) {
            i8lVar2.x0(nmrVar);
            if (i8lVar2.V0(27)) {
                if (view instanceof TextureView) {
                    i8lVar2.p((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    i8lVar2.v((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.k = i8lVar;
        h();
        AppCompatTextView appCompatTextView = this.i;
        if (appCompatTextView != null) {
            i8l i8lVar3 = this.k;
            if (i8lVar3 != null) {
                i8lVar3.k();
            }
            appCompatTextView.setVisibility(8);
        }
        j(true);
        if (i8lVar == null) {
            nbl nblVar = this.j;
            if (nblVar != null) {
                nblVar.f();
                return;
            }
            return;
        }
        if (i8lVar.V0(27)) {
            if (view instanceof TextureView) {
                i8lVar.n((TextureView) view);
            } else if (view instanceof SurfaceView) {
                i8lVar.j((SurfaceView) view);
            }
            g();
        }
        if (subtitleView != null && i8lVar.V0(28)) {
            subtitleView.setCues(i8lVar.l().a);
        }
        i8lVar.j0(nmrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        i8l i8lVar = this.k;
        if (i8lVar != null && i8lVar.V0(16) && this.k.i()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode != 268) {
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(boolean z) {
        int i = this.n;
        if (i <= 0) {
            f(z);
            return;
        }
        Handler handler = this.m;
        handler.removeCallbacksAndMessages(null);
        View view = this.c;
        if (view != null) {
            if ((z ? 0 : 4) == view.getVisibility()) {
                return;
            }
        }
        if (z) {
            f(true);
        } else {
            handler.postDelayed(new bhp(8, this), i);
        }
    }

    public final void f(boolean z) {
        View view = this.c;
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
    }

    public final void g() {
        i8l i8lVar = this.k;
        tcu l0 = i8lVar != null ? i8lVar.l0() : tcu.d;
        int i = l0.a;
        int i2 = l0.b;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * l0.c) / i2;
        View view = this.d;
        if (view instanceof TextureView) {
            a((TextureView) view);
        }
        float f2 = this.e ? 0.0f : f;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public final void h() {
        int i;
        ProgressBar progressBar = this.h;
        if (progressBar != null) {
            i8l i8lVar = this.k;
            progressBar.setVisibility((i8lVar != null && i8lVar.c() == 2 && ((i = this.r) == 2 || (i == 1 && this.k.g0()))) ? 0 : 8);
        }
    }

    public final void i() {
        nbl nblVar = this.j;
        if (nblVar == null || !this.l) {
            setContentDescription(null);
        } else if (nblVar.g()) {
            setContentDescription(this.u ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void j(boolean z) {
        byte[] bArr;
        i8l i8lVar = this.k;
        AppCompatImageView appCompatImageView = this.f;
        boolean z2 = this.s;
        if (i8lVar == null || !i8lVar.V0(30) || i8lVar.O().a.isEmpty()) {
            if (z2) {
                return;
            }
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(android.R.color.transparent);
                appCompatImageView.setVisibility(4);
            }
            e(true);
            return;
        }
        if (z && !z2) {
            e(true);
        }
        if (i8lVar.O().a(2)) {
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(android.R.color.transparent);
                appCompatImageView.setVisibility(4);
                return;
            }
            return;
        }
        e(true);
        if (this.p) {
            vq1.B(appCompatImageView);
            boolean z3 = false;
            if (i8lVar.V0(18) && (bArr = i8lVar.H0().k) != null) {
                z3 = c(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (z3 || c(this.q)) {
                return;
            }
        }
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(android.R.color.transparent);
            appCompatImageView.setVisibility(4);
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
