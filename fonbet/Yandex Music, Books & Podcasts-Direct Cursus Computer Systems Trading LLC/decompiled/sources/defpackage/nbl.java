package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class nbl extends FrameLayout {
    public static final float[] g1;
    public final View A;
    public final String A0;
    public final View B;
    public final Drawable B0;
    public final TextView C;
    public final Drawable C0;
    public final TextView D;
    public final float D0;
    public final hhs E;
    public final float E0;
    public final StringBuilder F;
    public final String F0;
    public final Formatter G;
    public final String G0;
    public final ois H;
    public final Drawable H0;
    public final ris I;
    public final Drawable I0;
    public final dyg J;
    public final String J0;
    public final Drawable K;
    public final String K0;
    public final Drawable L;
    public final Drawable L0;
    public final Drawable M0;
    public final String N0;
    public final String O0;
    public i8l P0;
    public bbl Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public int X0;
    public int Y0;
    public int Z0;
    public final sbl a;
    public long[] a1;
    public final Resources b;
    public boolean[] b1;
    public final abl c;
    public final long[] c1;
    public final CopyOnWriteArrayList d;
    public final boolean[] d1;
    public final RecyclerView e;
    public long e1;
    public final s7f f;
    public boolean f1;
    public final dbl g;
    public final yal h;
    public final yal i;
    public final bnd j;
    public final PopupWindow k;
    public final int l;
    public final ImageView m;
    public final ImageView n;
    public final ImageView o;
    public final View p;
    public final View q;
    public final TextView r;
    public final TextView s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final Drawable v0;
    public final ImageView w;
    public final Drawable w0;
    public final ImageView x;
    public final Drawable x0;
    public final ImageView y;
    public final String y0;
    public final View z;
    public final String z0;

    static {
        ynh.a("media3.ui");
        g1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public nbl(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i17;
        ImageView imageView;
        int i18;
        int i19;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i20;
        boolean z15;
        int i21;
        int i22;
        int i23;
        abl ablVar;
        TextView textView;
        this.U0 = true;
        this.X0 = ScreenMirroringConfig.Test.pcVideoUdpPort;
        this.Z0 = 0;
        this.Y0 = 200;
        int i24 = R.layout.exo_player_control_view;
        int i25 = R.drawable.exo_styled_controls_play;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, gen.c, i, 0);
            try {
                i24 = obtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                i25 = obtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId = obtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId2 = obtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId3 = obtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId4 = obtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId5 = obtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId6 = obtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId7 = obtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId8 = obtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId9 = obtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId10 = obtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId11 = obtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId12 = obtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId13 = obtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId14 = obtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId15 = obtainStyledAttributes.getResourceId(41, R.drawable.exo_styled_controls_vr);
                this.X0 = obtainStyledAttributes.getInt(32, this.X0);
                this.Z0 = obtainStyledAttributes.getInt(19, this.Z0);
                z2 = obtainStyledAttributes.getBoolean(29, true);
                z3 = obtainStyledAttributes.getBoolean(26, true);
                z4 = obtainStyledAttributes.getBoolean(28, true);
                z5 = obtainStyledAttributes.getBoolean(27, true);
                z7 = obtainStyledAttributes.getBoolean(30, false);
                boolean z16 = obtainStyledAttributes.getBoolean(31, false);
                boolean z17 = obtainStyledAttributes.getBoolean(33, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(38, this.Y0));
                boolean z18 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                i13 = resourceId8;
                i14 = resourceId9;
                i16 = resourceId7;
                i2 = resourceId;
                i3 = resourceId2;
                i4 = resourceId3;
                i5 = resourceId4;
                i6 = resourceId5;
                i7 = resourceId6;
                i8 = resourceId11;
                i9 = resourceId12;
                i10 = resourceId13;
                i11 = resourceId14;
                i12 = resourceId15;
                i15 = resourceId10;
                z8 = z16;
                z = z17;
                z6 = z18;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = R.drawable.exo_styled_controls_pause;
            i3 = R.drawable.exo_styled_controls_next;
            i4 = R.drawable.exo_styled_controls_simple_fastforward;
            i5 = R.drawable.exo_styled_controls_previous;
            i6 = R.drawable.exo_styled_controls_simple_rewind;
            i7 = R.drawable.exo_styled_controls_fullscreen_exit;
            i8 = R.drawable.exo_styled_controls_shuffle_on;
            i9 = R.drawable.exo_styled_controls_shuffle_off;
            i10 = R.drawable.exo_styled_controls_subtitle_on;
            i11 = R.drawable.exo_styled_controls_subtitle_off;
            z = false;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = true;
            z6 = true;
            i12 = R.drawable.exo_styled_controls_vr;
            i13 = R.drawable.exo_styled_controls_repeat_off;
            i14 = R.drawable.exo_styled_controls_repeat_one;
            i15 = R.drawable.exo_styled_controls_repeat_all;
            i16 = R.drawable.exo_styled_controls_fullscreen_enter;
            z7 = false;
            z8 = false;
        }
        LayoutInflater.from(context).inflate(i24, this);
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        abl ablVar2 = new abl(this);
        this.c = ablVar2;
        this.d = new CopyOnWriteArrayList();
        this.H = new ois();
        this.I = new ris();
        StringBuilder sb = new StringBuilder();
        this.F = sb;
        int i26 = i14;
        int i27 = i16;
        this.G = new Formatter(sb, Locale.getDefault());
        this.a1 = new long[0];
        this.b1 = new boolean[0];
        this.c1 = new long[0];
        this.d1 = new boolean[0];
        this.J = new dyg(18, this);
        this.C = (TextView) findViewById(R.id.exo_duration);
        this.D = (TextView) findViewById(R.id.exo_position);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_subtitle);
        this.w = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(ablVar2);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.x = imageView3;
        ol olVar = new ol(29, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(olVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.y = imageView4;
        ol olVar2 = new ol(29, this);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
            imageView4.setOnClickListener(olVar2);
        }
        View findViewById = findViewById(R.id.exo_settings);
        this.z = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(ablVar2);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.A = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(ablVar2);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(ablVar2);
        }
        hhs hhsVar = (hhs) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (hhsVar != null) {
            this.E = hhsVar;
            z9 = z8;
            z10 = z;
            i17 = i15;
            imageView = imageView2;
            i18 = i26;
            i19 = i27;
            z11 = z2;
            z12 = z3;
            z13 = z4;
            z14 = z5;
            i20 = i25;
            z15 = z7;
            i21 = i8;
            i22 = i9;
            i23 = i11;
            ablVar = ablVar2;
            textView = null;
        } else if (findViewById4 != null) {
            z10 = z;
            imageView = imageView2;
            i20 = i25;
            z11 = z2;
            z12 = z3;
            z13 = z4;
            z14 = z5;
            z15 = z7;
            i18 = i26;
            textView = null;
            i17 = i15;
            i22 = i9;
            i23 = i11;
            z9 = z8;
            i19 = i27;
            i21 = i8;
            ablVar = ablVar2;
            ns7 ns7Var = new ns7(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            ns7Var.setId(R.id.exo_progress);
            ns7Var.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(ns7Var, indexOfChild);
            this.E = ns7Var;
        } else {
            z9 = z8;
            z10 = z;
            i17 = i15;
            imageView = imageView2;
            i18 = i26;
            i19 = i27;
            z11 = z2;
            z12 = z3;
            z13 = z4;
            z14 = z5;
            i20 = i25;
            z15 = z7;
            i21 = i8;
            i22 = i9;
            i23 = i11;
            ablVar = ablVar2;
            textView = null;
            this.E = null;
        }
        hhs hhsVar2 = this.E;
        if (hhsVar2 != null) {
            ((ns7) hhsVar2).x.add(ablVar);
        }
        Resources resources = context.getResources();
        this.b = resources;
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_play_pause);
        this.o = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(ablVar);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_prev);
        this.m = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i5, context.getTheme()));
            imageView6.setOnClickListener(ablVar);
        }
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_next);
        this.n = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i3, context.getTheme()));
            imageView7.setOnClickListener(ablVar);
        }
        Typeface a = e3o.a(context, R.font.roboto_medium_numbers);
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView2 = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i6, context.getTheme()));
            this.q = imageView8;
            this.s = null;
        } else if (textView2 != null) {
            textView2.setTypeface(a);
            this.s = textView2;
            this.q = textView2;
        } else {
            this.s = textView;
            this.q = textView;
        }
        View view = this.q;
        if (view != null) {
            view.setOnClickListener(ablVar);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView3 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView9 != null) {
            imageView9.setImageDrawable(resources.getDrawable(i4, context.getTheme()));
            this.p = imageView9;
            this.r = null;
        } else if (textView3 != null) {
            textView3.setTypeface(a);
            this.r = textView3;
            this.p = textView3;
        } else {
            this.r = null;
            this.p = null;
        }
        View view2 = this.p;
        if (view2 != null) {
            view2.setOnClickListener(ablVar);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.t = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(ablVar);
        }
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_shuffle);
        this.u = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(ablVar);
        }
        this.D0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.E0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView12 = (ImageView) findViewById(R.id.exo_vr);
        this.v = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(resources.getDrawable(i12, context.getTheme()));
            j(imageView12, false);
        }
        sbl sblVar = new sbl(this);
        this.a = sblVar;
        sblVar.C = z6;
        s7f s7fVar = new s7f(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f = s7fVar;
        this.l = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.e = recyclerView;
        recyclerView.setAdapter(s7fVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.k = popupWindow;
        if (dvt.a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(ablVar);
        this.f1 = true;
        this.j = new bnd(getResources());
        this.H0 = resources.getDrawable(i10, context.getTheme());
        this.I0 = resources.getDrawable(i23, context.getTheme());
        this.J0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.K0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.h = new yal(this, 1);
        this.i = new yal(this, 0);
        this.g = new dbl(this, resources.getStringArray(R.array.exo_controls_playback_speeds), g1);
        this.K = resources.getDrawable(i20, context.getTheme());
        this.L = resources.getDrawable(i2, context.getTheme());
        this.L0 = resources.getDrawable(i7, context.getTheme());
        this.M0 = resources.getDrawable(i19, context.getTheme());
        this.v0 = resources.getDrawable(i13, context.getTheme());
        this.w0 = resources.getDrawable(i18, context.getTheme());
        this.x0 = resources.getDrawable(i17, context.getTheme());
        this.B0 = resources.getDrawable(i21, context.getTheme());
        this.C0 = resources.getDrawable(i22, context.getTheme());
        this.N0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.O0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.y0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.z0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.A0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.F0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.G0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        sblVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        sblVar.h(this.p, z12);
        sblVar.h(this.q, z11);
        sblVar.h(imageView6, z13);
        sblVar.h(imageView7, z14);
        sblVar.h(imageView11, z15);
        sblVar.h(imageView, z9);
        sblVar.h(imageView12, z10);
        sblVar.h(imageView10, this.Z0 != 0);
        addOnLayoutChangeListener(new c34(2, this));
    }

    public static boolean b(i8l i8lVar, ris risVar) {
        sis V;
        int o;
        if (i8lVar.V0(17) && (o = (V = i8lVar.V()).o()) > 1 && o <= 100) {
            for (int i = 0; i < o; i++) {
                if (V.m(i, risVar, 0L).m != -9223372036854775807L) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        i8l i8lVar = this.P0;
        if (i8lVar == null || !i8lVar.V0(13)) {
            return;
        }
        i8l i8lVar2 = this.P0;
        i8lVar2.r(i8lVar2.m().a(f));
    }

    public final boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i8l i8lVar = this.P0;
        if (i8lVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (i8lVar.c() != 4 && i8lVar.V0(12)) {
                    i8lVar.F0();
                }
            } else if (keyCode == 89 && i8lVar.V0(11)) {
                i8lVar.G0();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (dvt.i0(i8lVar, this.U0)) {
                        dvt.P(i8lVar);
                    } else if (i8lVar.V0(1)) {
                        i8lVar.b();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            dvt.P(i8lVar);
                        } else if (keyCode == 127) {
                            int i = dvt.a;
                            if (i8lVar.V0(1)) {
                                i8lVar.b();
                            }
                        }
                    } else if (i8lVar.V0(7)) {
                        i8lVar.K();
                    }
                } else if (i8lVar.V0(9)) {
                    i8lVar.b0();
                }
            }
        }
        return true;
    }

    public final void d(qon qonVar, View view) {
        this.e.setAdapter(qonVar);
        p();
        this.f1 = false;
        PopupWindow popupWindow = this.k;
        popupWindow.dismiss();
        this.f1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.l;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final qsn e(e3t e3tVar, int i) {
        yde ydeVar;
        d3t d3tVar;
        String b;
        int i2 = 4;
        hld.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        yde ydeVar2 = e3tVar.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < ydeVar2.size()) {
            d3t d3tVar2 = (d3t) ydeVar2.get(i3);
            if (d3tVar2.b.c == i) {
                int i5 = 0;
                while (i5 < d3tVar2.a) {
                    if (d3tVar2.d[i5] == i2) {
                        dsc a = d3tVar2.a(i5);
                        int i6 = a.e;
                        int i7 = a.j;
                        if ((i6 & 2) == 0) {
                            bnd bndVar = this.j;
                            Resources resources = (Resources) bndVar.b;
                            Resources resources2 = (Resources) bndVar.b;
                            String str = a.n;
                            int i8 = a.D;
                            ydeVar = ydeVar2;
                            int i9 = a.v;
                            int i10 = a.u;
                            int i11 = i4;
                            String str2 = a.k;
                            int i12 = l5i.i(str);
                            d3tVar = d3tVar2;
                            if (i12 == -1) {
                                if (l5i.j(str2) == null) {
                                    if (l5i.b(str2) == null) {
                                        if (i10 == -1 && i9 == -1) {
                                            if (i8 == -1 && a.E == -1) {
                                                i12 = -1;
                                            }
                                        }
                                    }
                                    i12 = 1;
                                }
                                i12 = 2;
                            }
                            if (i12 == 2) {
                                b = bndVar.o(bndVar.e(a), (i10 == -1 || i9 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i9)), i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else if (i12 == 1) {
                                b = bndVar.o(bndVar.b(a), (i8 == -1 || i8 < 1) ? "" : i8 != 1 ? i8 != 2 ? (i8 == 6 || i8 == 7) ? resources.getString(R.string.exo_track_surround_5_point_1) : i8 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1) : resources.getString(R.string.exo_track_stereo) : resources.getString(R.string.exo_track_mono), i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else {
                                b = bndVar.b(a);
                            }
                            if (b.length() == 0) {
                                String str3 = a.d;
                                b = (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
                            }
                            ibl iblVar = new ibl(e3tVar, i3, i5, b);
                            i4 = i11 + 1;
                            int e = pde.e(objArr.length, i4);
                            if (e > objArr.length) {
                                objArr = Arrays.copyOf(objArr, e);
                            }
                            objArr[i11] = iblVar;
                            i5++;
                            ydeVar2 = ydeVar;
                            d3tVar2 = d3tVar;
                            i2 = 4;
                        }
                    }
                    ydeVar = ydeVar2;
                    d3tVar = d3tVar2;
                    i5++;
                    ydeVar2 = ydeVar;
                    d3tVar2 = d3tVar;
                    i2 = 4;
                }
            }
            i3++;
            ydeVar2 = ydeVar2;
            i2 = 4;
        }
        return yde.t(i4, objArr);
    }

    public final void f() {
        sbl sblVar = this.a;
        int i = sblVar.z;
        if (i == 3 || i == 2) {
            return;
        }
        sblVar.f();
        if (!sblVar.C) {
            sblVar.i(2);
        } else if (sblVar.z == 1) {
            sblVar.m.start();
        } else {
            sblVar.n.start();
        }
    }

    public final boolean g() {
        sbl sblVar = this.a;
        return sblVar.z == 0 && sblVar.a.h();
    }

    public i8l getPlayer() {
        return this.P0;
    }

    public int getRepeatToggleModes() {
        return this.Z0;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.u);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.w);
    }

    public int getShowTimeoutMs() {
        return this.X0;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.v);
    }

    public final boolean h() {
        return getVisibility() == 0;
    }

    public final void i() {
        l();
        k();
        o();
        q();
        s();
        m();
        r();
    }

    public final void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.D0 : this.E0);
    }

    public final void k() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (h() && this.S0) {
            i8l i8lVar = this.P0;
            if (i8lVar != null) {
                z = (this.T0 && b(i8lVar, this.I)) ? i8lVar.V0(10) : i8lVar.V0(5);
                z3 = i8lVar.V0(7);
                z4 = i8lVar.V0(11);
                z5 = i8lVar.V0(12);
                z2 = i8lVar.V0(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            Resources resources = this.b;
            View view = this.q;
            if (z4) {
                i8l i8lVar2 = this.P0;
                int L0 = (int) ((i8lVar2 != null ? i8lVar2.L0() : 5000L) / 1000);
                TextView textView = this.s;
                if (textView != null) {
                    textView.setText(String.valueOf(L0));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, L0, Integer.valueOf(L0)));
                }
            }
            View view2 = this.p;
            if (z5) {
                i8l i8lVar3 = this.P0;
                int r0 = (int) ((i8lVar3 != null ? i8lVar3.r0() : 15000L) / 1000);
                TextView textView2 = this.r;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(r0));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, r0, Integer.valueOf(r0)));
                }
            }
            j(this.m, z3);
            j(view, z4);
            j(view2, z5);
            j(this.n, z2);
            hhs hhsVar = this.E;
            if (hhsVar != null) {
                hhsVar.setEnabled(z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r1.V().p() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        ImageView imageView;
        boolean z;
        if (h() && this.S0 && (imageView = this.o) != null) {
            boolean i0 = dvt.i0(this.P0, this.U0);
            Drawable drawable = i0 ? this.K : this.L;
            int i = i0 ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.b.getString(i));
            i8l i8lVar = this.P0;
            if (i8lVar != null) {
                z = true;
                if (i8lVar.V0(1)) {
                    if (i8lVar.V0(17)) {
                    }
                    j(imageView, z);
                }
            }
            z = false;
            j(imageView, z);
        }
    }

    public final void m() {
        dbl dblVar;
        i8l i8lVar = this.P0;
        if (i8lVar == null) {
            return;
        }
        float f = i8lVar.m().a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            dblVar = this.g;
            float[] fArr = dblVar.e;
            if (i >= fArr.length) {
                break;
            }
            float abs = Math.abs(f - fArr[i]);
            if (abs < f2) {
                i2 = i;
                f2 = abs;
            }
            i++;
        }
        dblVar.f = i2;
        String str = dblVar.d[i2];
        s7f s7fVar = this.f;
        ((String[]) s7fVar.f)[0] = str;
        j(this.z, s7fVar.u(1) || s7fVar.u(0));
    }

    public final void n() {
        long j;
        long j2;
        if (h() && this.S0) {
            i8l i8lVar = this.P0;
            if (i8lVar == null || !i8lVar.V0(16)) {
                j = 0;
                j2 = 0;
            } else {
                j = i8lVar.s0() + this.e1;
                j2 = i8lVar.D0() + this.e1;
            }
            TextView textView = this.D;
            if (textView != null && !this.W0) {
                textView.setText(dvt.L(this.F, this.G, j));
            }
            hhs hhsVar = this.E;
            if (hhsVar != null) {
                hhsVar.setPosition(j);
                hhsVar.setBufferedPosition(j2);
            }
            dyg dygVar = this.J;
            removeCallbacks(dygVar);
            int c = i8lVar == null ? 1 : i8lVar.c();
            if (i8lVar != null && i8lVar.e()) {
                long min = Math.min(hhsVar != null ? hhsVar.getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
                float f = i8lVar.m().a;
                postDelayed(dygVar, dvt.j(f > 0.0f ? (long) (min / f) : 1000L, this.Y0, 1000L));
            } else {
                if (c == 4 || c == 1) {
                    return;
                }
                postDelayed(dygVar, 1000L);
            }
        }
    }

    public final void o() {
        ImageView imageView;
        if (h() && this.S0 && (imageView = this.t) != null) {
            if (this.Z0 == 0) {
                j(imageView, false);
                return;
            }
            i8l i8lVar = this.P0;
            String str = this.y0;
            Drawable drawable = this.v0;
            if (i8lVar == null || !i8lVar.V0(15)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            int g = i8lVar.g();
            if (g == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (g == 1) {
                imageView.setImageDrawable(this.w0);
                imageView.setContentDescription(this.z0);
            } else {
                if (g != 2) {
                    return;
                }
                imageView.setImageDrawable(this.x0);
                imageView.setContentDescription(this.A0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sbl sblVar = this.a;
        sblVar.a.addOnLayoutChangeListener(sblVar.x);
        this.S0 = true;
        if (g()) {
            sblVar.g();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sbl sblVar = this.a;
        sblVar.a.removeOnLayoutChangeListener(sblVar.x);
        this.S0 = false;
        removeCallbacks(this.J);
        sblVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        RecyclerView recyclerView = this.e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.l;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.k;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void q() {
        ImageView imageView;
        if (h() && this.S0 && (imageView = this.u) != null) {
            i8l i8lVar = this.P0;
            if (!this.a.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.G0;
            Drawable drawable = this.C0;
            if (i8lVar == null || !i8lVar.V0(14)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            if (i8lVar.C0()) {
                drawable = this.B0;
            }
            imageView.setImageDrawable(drawable);
            if (i8lVar.C0()) {
                str = this.F0;
            }
            imageView.setContentDescription(str);
        }
    }

    public final void r() {
        boolean z;
        long j;
        int i;
        int i2;
        sis sisVar;
        boolean z2;
        boolean z3;
        i8l i8lVar = this.P0;
        if (i8lVar == null) {
            return;
        }
        boolean z4 = this.T0;
        ris risVar = this.I;
        boolean z5 = false;
        boolean z6 = true;
        this.V0 = z4 && b(i8lVar, risVar);
        long j2 = 0;
        this.e1 = 0L;
        sis V = i8lVar.V0(17) ? i8lVar.V() : sis.a;
        long j3 = -9223372036854775807L;
        if (V.p()) {
            z = true;
            if (i8lVar.V0(16)) {
                long o = i8lVar.o();
                if (o != -9223372036854775807L) {
                    j = dvt.Y(o);
                    i = 0;
                }
            }
            j = 0;
            i = 0;
        } else {
            int v0 = i8lVar.v0();
            boolean z7 = this.V0;
            int i3 = z7 ? 0 : v0;
            int o2 = z7 ? V.o() - 1 : v0;
            i = 0;
            long j4 = 0;
            while (true) {
                if (i3 > o2) {
                    break;
                }
                long j5 = j2;
                if (i3 == v0) {
                    this.e1 = dvt.m0(j4);
                }
                V.n(i3, risVar);
                if (risVar.m == j3) {
                    vq1.A(this.V0 ^ z6);
                    break;
                }
                int i4 = risVar.n;
                while (i4 <= risVar.o) {
                    ois oisVar = this.H;
                    V.f(i4, oisVar, z5);
                    long j6 = j3;
                    lj ljVar = oisVar.g;
                    int i5 = ljVar.d;
                    int i6 = ljVar.a;
                    while (i5 < i6) {
                        long d = oisVar.d(i5);
                        if (d == Long.MIN_VALUE) {
                            long j7 = oisVar.d;
                            if (j7 != j6) {
                                d = j7;
                            }
                            i2 = v0;
                            sisVar = V;
                            z2 = true;
                            i5++;
                            z6 = z2;
                            v0 = i2;
                            V = sisVar;
                            j5 = 0;
                        }
                        long j8 = d + oisVar.e;
                        if (j8 >= j5) {
                            long[] jArr = this.a1;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.a1 = Arrays.copyOf(jArr, length);
                                this.b1 = Arrays.copyOf(this.b1, length);
                            }
                            this.a1[i] = dvt.m0(j4 + j8);
                            boolean[] zArr = this.b1;
                            jj a = oisVar.g.a(i5);
                            int i7 = a.b;
                            i2 = v0;
                            if (i7 == -1) {
                                sisVar = V;
                                z2 = true;
                                z3 = true;
                            } else {
                                int i8 = 0;
                                while (i8 < i7) {
                                    int i9 = i8;
                                    int i10 = a.f[i9];
                                    sisVar = V;
                                    z2 = true;
                                    if (i10 == 0 || i10 == 1) {
                                        z3 = true;
                                        break;
                                    } else {
                                        i8 = i9 + 1;
                                        V = sisVar;
                                    }
                                }
                                sisVar = V;
                                z2 = true;
                                z3 = false;
                            }
                            zArr[i] = !z3;
                            i++;
                            i5++;
                            z6 = z2;
                            v0 = i2;
                            V = sisVar;
                            j5 = 0;
                        }
                        i2 = v0;
                        sisVar = V;
                        z2 = true;
                        i5++;
                        z6 = z2;
                        v0 = i2;
                        V = sisVar;
                        j5 = 0;
                    }
                    i4++;
                    j3 = j6;
                    V = V;
                    z5 = false;
                    j5 = 0;
                }
                j4 += risVar.m;
                i3++;
                z6 = z6;
                V = V;
                z5 = false;
                j2 = 0;
            }
            z = z6;
            j = j4;
        }
        long m0 = dvt.m0(j);
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(dvt.L(this.F, this.G, m0));
        }
        hhs hhsVar = this.E;
        if (hhsVar != null) {
            hhsVar.setDuration(m0);
            long[] jArr2 = this.c1;
            int length2 = jArr2.length;
            int i11 = i + length2;
            long[] jArr3 = this.a1;
            if (i11 > jArr3.length) {
                this.a1 = Arrays.copyOf(jArr3, i11);
                this.b1 = Arrays.copyOf(this.b1, i11);
            }
            System.arraycopy(jArr2, 0, this.a1, i, length2);
            System.arraycopy(this.d1, 0, this.b1, i, length2);
            long[] jArr4 = this.a1;
            boolean[] zArr2 = this.b1;
            ns7 ns7Var = (ns7) hhsVar;
            if (i11 != 0 && (jArr4 == null || zArr2 == null)) {
                z = false;
            }
            vq1.v(z);
            ns7Var.v0 = i11;
            ns7Var.w0 = jArr4;
            ns7Var.x0 = zArr2;
            ns7Var.e();
        }
        n();
    }

    public final void s() {
        yal yalVar = this.h;
        yalVar.getClass();
        List list = Collections.EMPTY_LIST;
        yalVar.d = list;
        yal yalVar2 = this.i;
        yalVar2.getClass();
        yalVar2.d = list;
        i8l i8lVar = this.P0;
        ImageView imageView = this.w;
        if (i8lVar != null && i8lVar.V0(30) && this.P0.V0(29)) {
            e3t O = this.P0.O();
            qsn e = e(O, 1);
            yalVar2.d = e;
            nbl nblVar = yalVar2.g;
            i8l i8lVar2 = nblVar.P0;
            s7f s7fVar = nblVar.f;
            i8lVar2.getClass();
            w0t Z = i8lVar2.Z();
            if (!e.isEmpty()) {
                if (yalVar2.u(Z)) {
                    int i = 0;
                    while (true) {
                        if (i >= e.d) {
                            break;
                        }
                        ibl iblVar = (ibl) e.get(i);
                        if (iblVar.a.e[iblVar.b]) {
                            ((String[]) s7fVar.f)[1] = iblVar.c;
                            break;
                        }
                        i++;
                    }
                } else {
                    ((String[]) s7fVar.f)[1] = nblVar.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                ((String[]) s7fVar.f)[1] = nblVar.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.a.b(imageView)) {
                yalVar.v(e(O, 3));
            } else {
                yalVar.v(qsn.e);
            }
        }
        j(imageView, yalVar.c() > 0);
        s7f s7fVar2 = this.f;
        j(this.z, s7fVar2.u(1) || s7fVar2.u(0));
    }

    public void setAnimationEnabled(boolean z) {
        this.a.C = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(bbl bblVar) {
        this.Q0 = bblVar;
        boolean z = bblVar != null;
        ImageView imageView = this.x;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = bblVar != null;
        ImageView imageView2 = this.y;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(i8l i8lVar) {
        vq1.A(Looper.myLooper() == Looper.getMainLooper());
        vq1.v(i8lVar == null || i8lVar.X() == Looper.getMainLooper());
        i8l i8lVar2 = this.P0;
        if (i8lVar2 == i8lVar) {
            return;
        }
        abl ablVar = this.c;
        if (i8lVar2 != null) {
            i8lVar2.x0(ablVar);
        }
        this.P0 = i8lVar;
        if (i8lVar != null) {
            i8lVar.j0(ablVar);
        }
        i();
    }

    public void setRepeatToggleModes(int i) {
        this.Z0 = i;
        i8l i8lVar = this.P0;
        if (i8lVar != null && i8lVar.V0(15)) {
            int g = this.P0.g();
            if (i == 0 && g != 0) {
                this.P0.w0(0);
            } else if (i == 1 && g == 2) {
                this.P0.w0(1);
            } else if (i == 2 && g == 1) {
                this.P0.w0(2);
            }
        }
        this.a.h(this.t, i != 0);
        o();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.p, z);
        k();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.T0 = z;
        r();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.n, z);
        k();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.U0 = z;
        l();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.m, z);
        k();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.q, z);
        k();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.u, z);
        q();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.w, z);
    }

    public void setShowTimeoutMs(int i) {
        this.X0 = i;
        if (g()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.v, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.Y0 = dvt.i(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            j(imageView, onClickListener != null);
        }
    }

    public void setProgressUpdateListener(fbl fblVar) {
    }

    public nbl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nbl(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public nbl(Context context) {
        this(context, null);
    }
}
