package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class mbl extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public long G;
    public long H;
    public final CopyOnWriteArrayList a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final ImageView h;
    public final ImageView i;
    public final View j;
    public final TextView k;
    public final ghs l;
    public final StringBuilder m;
    public final Formatter n;
    public final val o;
    public final val p;
    public final Drawable q;
    public final String r;
    public final Drawable s;
    public final float t;
    public final float u;
    public final String v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    static {
        HashSet hashSet = gsb.a;
        synchronized (gsb.class) {
            if (gsb.a.add("goog.exo.ui")) {
                gsb.b += ", goog.exo.ui";
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [val] */
    /* JADX WARN: Type inference failed for: r4v2, types: [val] */
    public mbl(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        this.y = ScreenMirroringConfig.Test.pcVideoUdpPort;
        final int i2 = 0;
        this.A = 0;
        this.z = 200;
        this.G = -9223372036854775807L;
        final int i3 = 1;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = false;
        int i4 = R.layout.exo_player_control_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, udn.c, i, 0);
            try {
                this.y = obtainStyledAttributes.getInt(32, this.y);
                i4 = obtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                this.A = obtainStyledAttributes.getInt(19, this.A);
                this.B = obtainStyledAttributes.getBoolean(29, this.B);
                this.C = obtainStyledAttributes.getBoolean(26, this.C);
                this.D = obtainStyledAttributes.getBoolean(28, this.D);
                this.E = obtainStyledAttributes.getBoolean(27, this.E);
                this.F = obtainStyledAttributes.getBoolean(30, this.F);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(38, this.z));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.a = new CopyOnWriteArrayList();
        new nis();
        Object obj = qis.a;
        Object obj2 = qis.a;
        StringBuilder sb = new StringBuilder();
        this.m = sb;
        this.n = new Formatter(sb, Locale.getDefault());
        zal zalVar = new zal(this);
        this.o = new Runnable(this) { // from class: val
            public final /* synthetic */ mbl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i2;
                mbl mblVar = this.b;
                switch (i5) {
                    case 0:
                        int i6 = mbl.I;
                        ghs ghsVar = mblVar.l;
                        if (mblVar.c() && mblVar.w) {
                            boolean z = 0 != mblVar.H;
                            mblVar.H = 0L;
                            TextView textView = mblVar.k;
                            if (textView != null && !mblVar.x && z) {
                                textView.setText(yut.c(mblVar.m, mblVar.n, 0L));
                            }
                            if (ghsVar != null) {
                                ghsVar.setPosition(0L);
                                ghsVar.setBufferedPosition(0L);
                            }
                            mblVar.removeCallbacks(mblVar.o);
                            break;
                        }
                        break;
                    default:
                        mblVar.a();
                        break;
                }
            }
        };
        this.p = new Runnable(this) { // from class: val
            public final /* synthetic */ mbl b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i3;
                mbl mblVar = this.b;
                switch (i5) {
                    case 0:
                        int i6 = mbl.I;
                        ghs ghsVar = mblVar.l;
                        if (mblVar.c() && mblVar.w) {
                            boolean z = 0 != mblVar.H;
                            mblVar.H = 0L;
                            TextView textView = mblVar.k;
                            if (textView != null && !mblVar.x && z) {
                                textView.setText(yut.c(mblVar.m, mblVar.n, 0L));
                            }
                            if (ghsVar != null) {
                                ghsVar.setPosition(0L);
                                ghsVar.setBufferedPosition(0L);
                            }
                            mblVar.removeCallbacks(mblVar.o);
                            break;
                        }
                        break;
                    default:
                        mblVar.a();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(i4, this);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        ghs ghsVar = (ghs) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (ghsVar != null) {
            this.l = ghsVar;
        } else if (findViewById != null) {
            ms7 ms7Var = new ms7(context, null, 0, attributeSet2);
            ms7Var.setId(R.id.exo_progress);
            ms7Var.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(ms7Var, indexOfChild);
            this.l = ms7Var;
        } else {
            this.l = null;
        }
        this.k = (TextView) findViewById(R.id.exo_position);
        ghs ghsVar2 = this.l;
        if (ghsVar2 != null) {
            ((ms7) ghsVar2).w.add(zalVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.d = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(zalVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.e = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(zalVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.b = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(zalVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.c = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(zalVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.g = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(zalVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(zalVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.h = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(zalVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.i = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(zalVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.j = findViewById8;
        setShowVrButton(false);
        e(findViewById8, false, false);
        Resources resources = context.getResources();
        this.t = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.u = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.q = yut.b(context, resources, R.drawable.exo_controls_repeat_off);
        yut.b(context, resources, R.drawable.exo_controls_repeat_one);
        yut.b(context, resources, R.drawable.exo_controls_repeat_all);
        yut.b(context, resources, R.drawable.exo_controls_shuffle_on);
        this.s = yut.b(context, resources, R.drawable.exo_controls_shuffle_off);
        this.r = resources.getString(R.string.exo_controls_repeat_off_description);
        resources.getString(R.string.exo_controls_repeat_one_description);
        resources.getString(R.string.exo_controls_repeat_all_description);
        resources.getString(R.string.exo_controls_shuffle_on_description);
        this.v = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.H = -9223372036854775807L;
    }

    public final void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                kbl kblVar = (kbl) it.next();
                getVisibility();
                ((bql) kblVar).a.d();
            }
            removeCallbacks(this.o);
            removeCallbacks(this.p);
            this.G = -9223372036854775807L;
        }
    }

    public final void b() {
        val valVar = this.p;
        removeCallbacks(valVar);
        if (this.y <= 0) {
            this.G = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.y;
        this.G = uptimeMillis + j;
        if (this.w) {
            postDelayed(valVar, j);
        }
    }

    public final boolean c() {
        return getVisibility() == 0;
    }

    public final void d() {
        boolean z;
        if (c() && this.w) {
            View view = this.d;
            boolean z2 = false;
            if (view != null) {
                int i = yut.a;
                view.setVisibility(0);
            }
            View view2 = this.e;
            if (view2 != null) {
                boolean isFocused = view2.isFocused();
                if (yut.a < 21) {
                    z2 = isFocused;
                } else if (wal.a(view2)) {
                    z2 = true;
                }
                view2.setVisibility(8);
                z = z2;
                z2 = isFocused;
            } else {
                z = false;
            }
            if (z2 && view != null) {
                view.requestFocus();
            }
            if (z && view != null) {
                view.sendAccessibilityEvent(8);
            }
        }
        f();
        g();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.p);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.t : this.u);
        view.setVisibility(z ? 0 : 8);
    }

    public final void f() {
        if (c() && this.w) {
            e(this.b, this.D, false);
            e(this.g, this.B, false);
            e(this.f, this.C, false);
            e(this.c, this.E, false);
            ghs ghsVar = this.l;
            if (ghsVar != null) {
                ghsVar.setEnabled(false);
            }
        }
    }

    public final void g() {
        ImageView imageView;
        if (c() && this.w && (imageView = this.h) != null) {
            if (this.A == 0) {
                e(imageView, false, false);
                return;
            }
            e(imageView, true, false);
            imageView.setImageDrawable(this.q);
            imageView.setContentDescription(this.r);
        }
    }

    public h8l getPlayer() {
        return null;
    }

    public int getRepeatToggleModes() {
        return this.A;
    }

    public boolean getShowShuffleButton() {
        return this.F;
    }

    public int getShowTimeoutMs() {
        return this.y;
    }

    public boolean getShowVrButton() {
        View view = this.j;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        ImageView imageView;
        if (c() && this.w && (imageView = this.i) != null) {
            if (!this.F) {
                e(imageView, false, false);
                return;
            }
            e(imageView, true, false);
            imageView.setImageDrawable(this.s);
            imageView.setContentDescription(this.v);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
        long j = this.G;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.p, uptimeMillis);
            }
        } else if (c()) {
            b();
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w = false;
        removeCallbacks(this.o);
        removeCallbacks(this.p);
    }

    public void setPlayer(h8l h8lVar) {
        vnj.o(Looper.myLooper() == Looper.getMainLooper());
        vnj.n(h8lVar == null || h8lVar.X() == Looper.getMainLooper());
        if (h8lVar == null) {
            return;
        }
        h8lVar.a0();
        d();
    }

    public void setRepeatToggleModes(int i) {
        this.A = i;
        g();
    }

    public void setShowFastForwardButton(boolean z) {
        this.C = z;
        f();
    }

    public void setShowNextButton(boolean z) {
        this.E = z;
        f();
    }

    public void setShowPreviousButton(boolean z) {
        this.D = z;
        f();
    }

    public void setShowRewindButton(boolean z) {
        this.B = z;
        f();
    }

    public void setShowShuffleButton(boolean z) {
        this.F = z;
        h();
    }

    public void setShowTimeoutMs(int i) {
        this.y = i;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.j;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        int i2 = yut.a;
        this.z = Math.max(16, Math.min(i, 1000));
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            e(view, getShowVrButton(), onClickListener != null);
        }
    }

    public void setProgressUpdateListener(ebl eblVar) {
    }

    public void setShowMultiWindowTimeBar(boolean z) {
    }

    public mbl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mbl(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public mbl(Context context) {
        this(context, null);
    }
}
