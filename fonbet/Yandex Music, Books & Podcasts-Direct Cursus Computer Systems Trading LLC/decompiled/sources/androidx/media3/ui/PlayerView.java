package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.b6e;
import defpackage.bbl;
import defpackage.bnd;
import defpackage.cql;
import defpackage.d3t;
import defpackage.dql;
import defpackage.dvt;
import defpackage.eql;
import defpackage.fql;
import defpackage.gen;
import defpackage.i8l;
import defpackage.l6r;
import defpackage.lbl;
import defpackage.mq1;
import defpackage.nbl;
import defpackage.sau;
import defpackage.sb;
import defpackage.sbl;
import defpackage.tcu;
import defpackage.vq1;
import defpackage.yde;
import defpackage.zfb;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int G = 0;
    public CharSequence A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final cql a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final fql f;
    public final ImageView g;
    public final ImageView h;
    public final SubtitleView i;
    public final View j;
    public final TextView k;
    public final nbl l;
    public final FrameLayout m;
    public final FrameLayout n;
    public final Handler o;
    public final Class p;
    public final Method q;
    public final Object r;
    public i8l s;
    public boolean t;
    public lbl u;
    public int v;
    public int w;
    public Drawable x;
    public int y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.view.ViewGroup, androidx.media3.ui.PlayerView] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Throwable th;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        Class<ExoPlayer> cls;
        Object obj;
        Method method;
        int i11;
        cql cqlVar = new cql(this);
        this.a = cqlVar;
        this.o = new Handler(Looper.getMainLooper());
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
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.p = null;
            this.q = null;
            this.r = null;
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
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, gen.d, i, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(42);
                int color = obtainStyledAttributes.getColor(42, 0);
                int resourceId = obtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = obtainStyledAttributes.getBoolean(49, true);
                int i12 = obtainStyledAttributes.getInt(3, 1);
                th = null;
                int resourceId2 = obtainStyledAttributes.getResourceId(9, 0);
                int i13 = obtainStyledAttributes.getInt(15, 0);
                boolean z9 = obtainStyledAttributes.getBoolean(50, true);
                int i14 = obtainStyledAttributes.getInt(45, 1);
                int i15 = obtainStyledAttributes.getInt(28, 0);
                z = z9;
                i2 = obtainStyledAttributes.getInt(38, ScreenMirroringConfig.Test.pcVideoUdpPort);
                boolean z10 = obtainStyledAttributes.getBoolean(14, true);
                boolean z11 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(35, 0);
                this.z = obtainStyledAttributes.getBoolean(16, this.z);
                boolean z12 = obtainStyledAttributes.getBoolean(13, true);
                obtainStyledAttributes.recycle();
                z4 = z12;
                z2 = z10;
                z6 = z8;
                i9 = color;
                i3 = resourceId;
                i5 = resourceId2;
                i7 = i15;
                z3 = z11;
                i4 = integer;
                i10 = i12;
                z5 = hasValue;
                i8 = i14;
                i6 = i13;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            th = null;
            i2 = 5000;
            i3 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 1;
            i9 = 0;
            z5 = false;
            z6 = true;
            i10 = 1;
        }
        LayoutInflater.from(context).inflate(i3, (ViewGroup) this);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i7);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.c = findViewById;
        if (findViewById != null && z5) {
            findViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout == null || i8 == 0) {
            this.d = th;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i8 == 2) {
                this.d = new TextureView(context);
            } else if (i8 == 3) {
                try {
                    int i16 = l6r.l;
                    this.d = (View) l6r.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(cqlVar);
                    this.d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.d, 0);
                } catch (Exception e) {
                    b6e.o("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    throw th;
                }
            } else if (i8 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (dvt.a >= 34) {
                    sb.z(surfaceView);
                }
                this.d = surfaceView;
            } else {
                try {
                    int i17 = sau.b;
                    this.d = (View) sau.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    b6e.o("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    throw th;
                }
            }
            z7 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(cqlVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
        }
        this.e = z7;
        this.f = dvt.a == 34 ? new fql() : null;
        this.m = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.n = (FrameLayout) findViewById(R.id.exo_overlay);
        this.g = (ImageView) findViewById(R.id.exo_image);
        this.w = i6;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: aql
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    int i18 = PlayerView.G;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = PlayerView.this;
                    playerView.o.post(new zvh(15, playerView, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.p = cls;
        this.q = method;
        this.r = obj;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.h = imageView2;
        this.v = (!z6 || i10 == 0 || imageView2 == null) ? 0 : i10;
        if (i5 != 0) {
            this.x = getContext().getDrawable(i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.i = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.j = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.y = i4;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        nbl nblVar = (nbl) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (nblVar != null) {
            this.l = nblVar;
            i11 = 0;
        } else if (findViewById3 != null) {
            i11 = 0;
            nbl nblVar2 = new nbl(context, null, 0, attributeSet);
            this.l = nblVar2;
            nblVar2.setId(R.id.exo_controller);
            nblVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(nblVar2, indexOfChild);
        } else {
            i11 = 0;
            this.l = null;
        }
        nbl nblVar3 = this.l;
        this.B = nblVar3 != null ? i2 : i11;
        this.E = z2;
        this.C = z3;
        this.D = z4;
        this.t = (!z || nblVar3 == null) ? i11 : 1;
        if (nblVar3 != null) {
            sbl sblVar = nblVar3.a;
            int i18 = sblVar.z;
            if (i18 != 3 && i18 != 2) {
                sblVar.f();
                sblVar.i(2);
            }
            nbl nblVar4 = this.l;
            cql cqlVar2 = this.a;
            nblVar4.getClass();
            cqlVar2.getClass();
            nblVar4.d.add(cqlVar2);
        }
        if (z) {
            setClickable(true);
        }
        l();
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        i8l i8lVar = playerView.s;
        if (i8lVar != null && i8lVar.V0(30) && i8lVar.O().a(2)) {
            return;
        }
        ImageView imageView = playerView.g;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.o();
        }
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(i8l i8lVar) {
        Class cls = this.p;
        if (cls == null || !cls.isAssignableFrom(i8lVar.getClass())) {
            return;
        }
        try {
            Method method = this.q;
            method.getClass();
            Object obj = this.r;
            obj.getClass();
            method.invoke(i8lVar, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            b6e.q(e);
        }
    }

    public final boolean b() {
        i8l i8lVar = this.s;
        return i8lVar != null && this.r != null && i8lVar.V0(30) && i8lVar.O().a(4);
    }

    public final void c() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean d() {
        i8l i8lVar = this.s;
        return i8lVar != null && i8lVar.V0(16) && this.s.i() && this.s.g0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fql fqlVar;
        super.dispatchDraw(canvas);
        if (dvt.a == 34 && (fqlVar = this.f) != null && this.F) {
            fqlVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        i8l i8lVar = this.s;
        if (i8lVar != null && i8lVar.V0(16) && this.s.i()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        nbl nblVar = this.l;
        if (z && p() && !nblVar.g()) {
            e(true);
            return true;
        }
        if ((p() && nblVar.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(d() && this.D) && p()) {
            nbl nblVar = this.l;
            boolean z2 = nblVar.g() && nblVar.getShowTimeoutMs() <= 0;
            boolean g = g();
            if (z || z2 || g) {
                h(g);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.h;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.v == 2) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        i8l i8lVar = this.s;
        if (i8lVar != null) {
            int c = i8lVar.c();
            if (!this.C) {
                return false;
            }
            if (this.s.V0(17) && this.s.V().p()) {
                return false;
            }
            if (c != 1 && c != 4) {
                i8l i8lVar2 = this.s;
                i8lVar2.getClass();
                if (i8lVar2.g0()) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<bnd> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            arrayList.add(new bnd(3, frameLayout));
        }
        nbl nblVar = this.l;
        if (nblVar != null) {
            arrayList.add(new bnd(3, nblVar));
        }
        return yde.v(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.m;
        vq1.C(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.v;
    }

    public boolean getControllerAutoShow() {
        return this.C;
    }

    public boolean getControllerHideOnTouch() {
        return this.E;
    }

    public int getControllerShowTimeoutMs() {
        return this.B;
    }

    public Drawable getDefaultArtwork() {
        return this.x;
    }

    public int getImageDisplayMode() {
        return this.w;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.n;
    }

    public i8l getPlayer() {
        return this.s;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        vq1.B(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.v != 0;
    }

    public boolean getUseController() {
        return this.t;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.B;
            nbl nblVar = this.l;
            nblVar.setShowTimeoutMs(i);
            sbl sblVar = nblVar.a;
            nbl nblVar2 = sblVar.a;
            if (!nblVar2.h()) {
                nblVar2.setVisibility(0);
                nblVar2.i();
                ImageView imageView = nblVar2.o;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            sblVar.k();
        }
    }

    public final void i() {
        if (!p() || this.s == null) {
            return;
        }
        nbl nblVar = this.l;
        if (!nblVar.g()) {
            e(true);
        } else if (this.E) {
            nblVar.f();
        }
    }

    public final void j() {
        i8l i8lVar = this.s;
        tcu l0 = i8lVar != null ? i8lVar.l0() : tcu.d;
        int i = l0.a;
        int i2 = l0.b;
        float f = this.e ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * l0.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public final void k() {
        int i;
        View view = this.j;
        if (view != null) {
            i8l i8lVar = this.s;
            view.setVisibility((i8lVar != null && i8lVar.c() == 2 && ((i = this.y) == 2 || (i == 1 && this.s.g0()))) ? 0 : 8);
        }
    }

    public final void l() {
        nbl nblVar = this.l;
        if (nblVar == null || !this.t) {
            setContentDescription(null);
        } else if (nblVar.g()) {
            setContentDescription(this.E ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.k;
        if (textView != null) {
            CharSequence charSequence = this.A;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                i8l i8lVar = this.s;
                if (i8lVar != null) {
                    i8lVar.k();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void n(boolean z) {
        byte[] bArr;
        Drawable drawable;
        i8l i8lVar = this.s;
        boolean z2 = false;
        boolean z3 = (i8lVar == null || !i8lVar.V0(30) || i8lVar.O().a.isEmpty()) ? false : true;
        boolean z4 = this.z;
        ImageView imageView = this.h;
        View view = this.c;
        if (!z4 && (!z3 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z3) {
            i8l i8lVar2 = this.s;
            boolean z5 = i8lVar2 != null && i8lVar2.V0(30) && i8lVar2.O().a(2);
            boolean b = b();
            if (!z5 && !b) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.g;
            boolean z6 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (b && !z5 && z6) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z5 && !b && z6) {
                c();
            }
            if (!z5 && !b && this.v != 0) {
                vq1.B(imageView);
                if (i8lVar != null && i8lVar.V0(18) && (bArr = i8lVar.H0().k) != null) {
                    z2 = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (z2 || f(this.x)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.w == 1) {
            f = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.s == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.t) {
            return false;
        }
        vq1.B(this.l);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        vq1.A(i == 0 || this.h != null);
        if (this.v != i) {
            this.v = i;
            n(false);
        }
    }

    public void setAspectRatioListener(mq1 mq1Var) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        vq1.B(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(mq1Var);
    }

    public void setControllerAnimationEnabled(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.C = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.D = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        vq1.B(this.l);
        this.E = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(bbl bblVar) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setOnFullScreenModeChangedListener(bblVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        this.B = i;
        if (nblVar.g()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(lbl lblVar) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        CopyOnWriteArrayList copyOnWriteArrayList = nblVar.d;
        lbl lblVar2 = this.u;
        if (lblVar2 == lblVar) {
            return;
        }
        if (lblVar2 != null) {
            copyOnWriteArrayList.remove(lblVar2);
        }
        this.u = lblVar;
        if (lblVar != null) {
            copyOnWriteArrayList.add(lblVar);
            setControllerVisibilityListener((dql) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        vq1.A(this.k != null);
        this.A = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.x != drawable) {
            this.x = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.F = z;
    }

    public void setErrorMessageProvider(zfb zfbVar) {
        if (zfbVar != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(eql eqlVar) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        String str = nblVar.O0;
        Drawable drawable = nblVar.M0;
        String str2 = nblVar.N0;
        Drawable drawable2 = nblVar.L0;
        if (nblVar.R0 == z) {
            return;
        }
        nblVar.R0 = z;
        ImageView imageView = nblVar.x;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = nblVar.y;
        if (imageView2 != null) {
            if (z) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        bbl bblVar = nblVar.Q0;
        if (bblVar != null) {
            bblVar.c();
        }
    }

    public void setImageDisplayMode(int i) {
        vq1.A(this.g != null);
        if (this.w != i) {
            this.w = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.z != z) {
            this.z = z;
            n(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e8, code lost:
    
        if (r3 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayer(i8l i8lVar) {
        vq1.A(Looper.myLooper() == Looper.getMainLooper());
        vq1.v(i8lVar == null || i8lVar.X() == Looper.getMainLooper());
        i8l i8lVar2 = this.s;
        if (i8lVar2 == i8lVar) {
            return;
        }
        View view = this.d;
        cql cqlVar = this.a;
        if (i8lVar2 != null) {
            i8lVar2.x0(cqlVar);
            if (i8lVar2.V0(27)) {
                if (view instanceof TextureView) {
                    i8lVar2.p((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    i8lVar2.v((SurfaceView) view);
                }
            }
            Class cls = this.p;
            if (cls != null && cls.isAssignableFrom(i8lVar2.getClass())) {
                try {
                    Method method = this.q;
                    method.getClass();
                    method.invoke(i8lVar2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    b6e.q(e);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.s = i8lVar;
        boolean p = p();
        nbl nblVar = this.l;
        if (p) {
            nblVar.setPlayer(i8lVar);
        }
        k();
        m();
        n(true);
        if (i8lVar == null) {
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
            if (i8lVar.V0(30)) {
                yde ydeVar = i8lVar.O().a;
                boolean z = false;
                int i = 0;
                loop0: while (true) {
                    if (i >= ydeVar.size()) {
                        break;
                    }
                    if (((d3t) ydeVar.get(i)).b.c == 2) {
                        d3t d3tVar = (d3t) ydeVar.get(i);
                        int i2 = 0;
                        while (true) {
                            int[] iArr = d3tVar.d;
                            if (i2 < iArr.length) {
                                if (iArr[i2] == 4) {
                                    z = true;
                                    break loop0;
                                }
                                i2++;
                            }
                        }
                    }
                    i++;
                }
            }
            j();
        }
        if (subtitleView != null && i8lVar.V0(28)) {
            subtitleView.setCues(i8lVar.l().a);
        }
        i8lVar.j0(cqlVar);
        setImageOutput(i8lVar);
        e(false);
    }

    public void setRepeatToggleModes(int i) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        vq1.B(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.y != i) {
            this.y = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        nbl nblVar = this.l;
        vq1.B(nblVar);
        nblVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        nbl nblVar = this.l;
        vq1.A((z && nblVar == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.t == z) {
            return;
        }
        this.t = z;
        if (p()) {
            nblVar.setPlayer(this.s);
        } else if (nblVar != null) {
            nblVar.f();
            nblVar.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(dql dqlVar) {
        if (dqlVar != null) {
            setControllerVisibilityListener((lbl) null);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
