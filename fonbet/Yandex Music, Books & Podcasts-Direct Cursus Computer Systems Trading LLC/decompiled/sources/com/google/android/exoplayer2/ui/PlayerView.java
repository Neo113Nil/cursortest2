package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
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
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.b6e;
import defpackage.bql;
import defpackage.h8l;
import defpackage.k6r;
import defpackage.kbl;
import defpackage.lq1;
import defpackage.mbl;
import defpackage.oq1;
import defpackage.rau;
import defpackage.scu;
import defpackage.sld;
import defpackage.udn;
import defpackage.vnj;
import defpackage.xq0;
import defpackage.yde;
import defpackage.yfb;
import defpackage.ypr;
import defpackage.yut;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int u = 0;
    public final oq1 a;
    public final View b;
    public final View c;
    public final ImageView d;
    public final ypr e;
    public final View f;
    public final TextView g;
    public final mbl h;
    public final FrameLayout i;
    public final FrameLayout j;
    public boolean k;
    public kbl l;
    public boolean m;
    public Drawable n;
    public int o;
    public boolean p;
    public CharSequence q;
    public int r;
    public boolean s;
    public boolean t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, android.view.ViewGroup, com.google.android.exoplayer2.ui.PlayerView] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Throwable th;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        bql bqlVar = new bql(this);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            ImageView imageView = new ImageView(context);
            if (yut.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(yut.b(context, resources, 2131231165));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(yut.b(context, resources2, 2131231165));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i8 = R.layout.exo_player_view;
        int i9 = ScreenMirroringConfig.Test.pcVideoUdpPort;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, udn.d, i, 0);
            try {
                z3 = obtainStyledAttributes.hasValue(42);
                i5 = obtainStyledAttributes.getColor(42, 0);
                i8 = obtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                z4 = obtainStyledAttributes.getBoolean(49, true);
                i6 = obtainStyledAttributes.getResourceId(9, 0);
                z5 = obtainStyledAttributes.getBoolean(50, true);
                th = null;
                i3 = obtainStyledAttributes.getInt(45, 1);
                int i10 = obtainStyledAttributes.getInt(28, 0);
                i9 = obtainStyledAttributes.getInt(38, ScreenMirroringConfig.Test.pcVideoUdpPort);
                z = obtainStyledAttributes.getBoolean(14, true);
                boolean z6 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(35, 0);
                this.p = obtainStyledAttributes.getBoolean(16, this.p);
                obtainStyledAttributes.getBoolean(13, true);
                obtainStyledAttributes.recycle();
                i2 = i10;
                z2 = z6;
                i4 = integer;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            th = null;
            i2 = 0;
            i3 = 1;
            i4 = 0;
            z = true;
            z2 = true;
            i5 = 0;
            z3 = false;
            z4 = true;
            i6 = 0;
            z5 = true;
        }
        int i11 = i9;
        LayoutInflater.from(context).inflate(i8, (ViewGroup) this);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        oq1 oq1Var = (oq1) findViewById(R.id.exo_content_frame);
        this.a = oq1Var;
        if (oq1Var != null) {
            oq1Var.setResizeMode(i2);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.b = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i5);
        }
        if (oq1Var == null || i3 == 0) {
            this.c = th;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.c = new TextureView(context);
            } else if (i3 == 3) {
                try {
                    int i12 = k6r.l;
                    this.c = (View) k6r.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e) {
                    b6e.o("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    throw th;
                }
            } else if (i3 != 4) {
                this.c = new SurfaceView(context);
            } else {
                try {
                    int i13 = rau.b;
                    this.c = (View) rau.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    b6e.o("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    throw th;
                }
            }
            this.c.setLayoutParams(layoutParams);
            this.c.setOnClickListener(bqlVar);
            this.c.setClickable(false);
            oq1Var.addView(this.c, 0);
        }
        this.i = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.j = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.d = imageView2;
        this.m = z4 && imageView2 != null;
        if (i6 != 0) {
            this.n = getContext().getDrawable(i6);
        }
        ypr yprVar = (ypr) findViewById(R.id.exo_subtitles);
        this.e = yprVar;
        if (yprVar != null) {
            yprVar.a();
            yprVar.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.o = i4;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.g = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        mbl mblVar = (mbl) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (mblVar != null) {
            this.h = mblVar;
            i7 = 0;
        } else if (findViewById3 != null) {
            i7 = 0;
            mbl mblVar2 = new mbl(context, null, 0, attributeSet);
            this.h = mblVar2;
            mblVar2.setId(R.id.exo_controller);
            mblVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(mblVar2, indexOfChild);
        } else {
            i7 = 0;
            this.h = null;
        }
        mbl mblVar3 = this.h;
        this.r = mblVar3 != null ? i11 : i7;
        this.t = z;
        this.s = z2;
        this.k = (!z5 || mblVar3 == null) ? i7 : 1;
        if (mblVar3 != null) {
            mblVar3.a();
            this.h.a.add(bqlVar);
        }
        if (z5) {
            setClickable(true);
        }
        d();
    }

    public static void a(TextureView textureView) {
        Matrix matrix = new Matrix();
        textureView.getWidth();
        textureView.getHeight();
        textureView.setTransform(matrix);
    }

    public final void b() {
        if (g()) {
            mbl mblVar = this.h;
            if (mblVar.c()) {
                mblVar.getShowTimeoutMs();
            }
            c();
        }
    }

    public final void c() {
        if (g()) {
            mbl mblVar = this.h;
            mblVar.setShowTimeoutMs(0);
            View view = mblVar.d;
            if (!mblVar.c()) {
                mblVar.setVisibility(0);
                Iterator it = mblVar.a.iterator();
                while (it.hasNext()) {
                    kbl kblVar = (kbl) it.next();
                    mblVar.getVisibility();
                    ((bql) kblVar).a.d();
                }
                mblVar.d();
                if (view != null) {
                    view.requestFocus();
                }
                if (view != null) {
                    view.sendAccessibilityEvent(8);
                }
            }
            mblVar.b();
        }
    }

    public final void d() {
        mbl mblVar = this.h;
        if (mblVar == null || !this.k) {
            setContentDescription(null);
        } else if (mblVar.getVisibility() == 0) {
            setContentDescription(this.t ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        mbl mblVar = this.h;
        if (z && g() && !mblVar.c()) {
            b();
            return true;
        }
        if (g()) {
            mblVar.getClass();
            keyEvent.getKeyCode();
        }
        if (super.dispatchKeyEvent(keyEvent)) {
            b();
            return true;
        }
        if (z && g()) {
            b();
        }
        return false;
    }

    public final void e() {
        TextView textView = this.g;
        if (textView != null) {
            CharSequence charSequence = this.q;
            if (charSequence == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
            }
        }
    }

    public final void f() {
        if (this.p) {
            return;
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final boolean g() {
        if (!this.k) {
            return false;
        }
        vnj.p(this.h);
        return true;
    }

    public List<sld> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            arrayList.add(new sld(4, frameLayout));
        }
        mbl mblVar = this.h;
        if (mblVar != null) {
            arrayList.add(new sld(4, mblVar));
        }
        return yde.v(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            return frameLayout;
        }
        xq0.q("exo_ad_overlay must be present for ad playback");
        return null;
    }

    public boolean getControllerAutoShow() {
        return this.s;
    }

    public boolean getControllerHideOnTouch() {
        return this.t;
    }

    public int getControllerShowTimeoutMs() {
        return this.r;
    }

    public Drawable getDefaultArtwork() {
        return this.n;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.j;
    }

    public h8l getPlayer() {
        return null;
    }

    public int getResizeMode() {
        oq1 oq1Var = this.a;
        vnj.p(oq1Var);
        return oq1Var.getResizeMode();
    }

    public ypr getSubtitleView() {
        return this.e;
    }

    public boolean getUseArtwork() {
        return this.m;
    }

    public boolean getUseController() {
        return this.k;
    }

    public View getVideoSurfaceView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        g();
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setAspectRatioListener(lq1 lq1Var) {
        oq1 oq1Var = this.a;
        vnj.p(oq1Var);
        oq1Var.setAspectRatioListener(lq1Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.s = z;
    }

    public void setControllerHideDuringAds(boolean z) {
    }

    public void setControllerHideOnTouch(boolean z) {
        vnj.p(this.h);
        this.t = z;
        d();
    }

    public void setControllerShowTimeoutMs(int i) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        this.r = i;
        if (mblVar.c()) {
            c();
        }
    }

    public void setControllerVisibilityListener(kbl kblVar) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        CopyOnWriteArrayList copyOnWriteArrayList = mblVar.a;
        kbl kblVar2 = this.l;
        if (kblVar2 == kblVar) {
            return;
        }
        if (kblVar2 != null) {
            copyOnWriteArrayList.remove(kblVar2);
        }
        this.l = kblVar;
        if (kblVar != null) {
            copyOnWriteArrayList.add(kblVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        vnj.o(this.g != null);
        this.q = charSequence;
        e();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.n != drawable) {
            this.n = drawable;
            f();
        }
    }

    public void setErrorMessageProvider(yfb yfbVar) {
        if (yfbVar != null) {
            e();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.p != z) {
            this.p = z;
            f();
        }
    }

    public void setPlayer(h8l h8lVar) {
        boolean z = true;
        vnj.o(Looper.myLooper() == Looper.getMainLooper());
        if (h8lVar != null && h8lVar.X() != Looper.getMainLooper()) {
            z = false;
        }
        vnj.n(z);
        if (h8lVar == null) {
            return;
        }
        ypr yprVar = this.e;
        if (yprVar != null) {
            yprVar.setCues(null);
        }
        if (g()) {
            this.h.setPlayer(h8lVar);
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
        e();
        f();
        if (h8lVar.Y()) {
            View view2 = this.c;
            boolean z2 = view2 instanceof TextureView;
            if (z2) {
                h8lVar.b0();
            } else if (view2 instanceof SurfaceView) {
                h8lVar.Z();
            }
            int i = scu.a;
            if (z2) {
                a((TextureView) view2);
            }
            oq1 oq1Var = this.a;
            if (oq1Var != null) {
                oq1Var.setAspectRatio(0.0f);
            }
        }
        if (yprVar != null && h8lVar.Y()) {
            h8lVar.l();
            throw null;
        }
        h8lVar.a0();
        b();
    }

    public void setRepeatToggleModes(int i) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        mblVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        oq1 oq1Var = this.a;
        vnj.p(oq1Var);
        oq1Var.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.o != i) {
            this.o = i;
            View view = this.f;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public void setShowFastForwardButton(boolean z) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        mblVar.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        mblVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        mblVar.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        mblVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        mblVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        mbl mblVar = this.h;
        vnj.p(mblVar);
        mblVar.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        vnj.o((z && this.d == null) ? false : true);
        if (this.m != z) {
            this.m = z;
            f();
        }
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        mbl mblVar = this.h;
        vnj.o((z && mblVar == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.k == z) {
            return;
        }
        this.k = z;
        if (g()) {
            mblVar.setPlayer(null);
        } else if (mblVar != null) {
            mblVar.a();
            mblVar.setPlayer(null);
        }
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.c;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
