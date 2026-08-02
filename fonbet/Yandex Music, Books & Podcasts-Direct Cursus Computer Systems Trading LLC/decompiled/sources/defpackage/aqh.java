package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class aqh extends p30 {
    public static final int V0;
    public LinearLayout A;
    public PlaybackStateCompat A0;
    public RelativeLayout B;
    public MediaDescriptionCompat B0;
    public LinearLayout C;
    public wph C0;
    public View D;
    public Bitmap D0;
    public OverlayListView E;
    public Uri E0;
    public zph F;
    public boolean F0;
    public ArrayList G;
    public Bitmap G0;
    public HashSet H;
    public int H0;
    public HashSet I;
    public boolean I0;
    public HashSet J;
    public boolean J0;
    public SeekBar K;
    public boolean K0;
    public yph L;
    public boolean L0;
    public boolean M0;
    public int N0;
    public int O0;
    public int P0;
    public Interpolator Q0;
    public final Interpolator R0;
    public final Interpolator S0;
    public final AccessibilityManager T0;
    public final dsd U0;
    public irh X;
    public int Y;
    public int Z;
    public final krh g;
    public final gk4 h;
    public final irh i;
    public final Context j;
    public boolean k;
    public boolean l;
    public int m;
    public Button n;
    public Button o;
    public ImageButton p;
    public MediaRouteExpandCollapseButton q;
    public FrameLayout r;
    public LinearLayout s;
    public FrameLayout t;
    public ImageView u;
    public TextView v;
    public int v0;
    public TextView w;
    public final int w0;
    public TextView x;
    public HashMap x0;
    public final boolean y;
    public aqd y0;
    public final boolean z;
    public final xph z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        V0 = (int) 30000;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aqh(Context context) {
        super(r4, r1 == 0 ? v3g.H(r4) : r1);
        ContextThemeWrapper y = v3g.y(context, true);
        int K = v3g.K(y, R.attr.mediaRouteTheme);
        this.y = true;
        this.U0 = new dsd(14, this);
        Context context2 = getContext();
        this.j = context2;
        this.z0 = new xph(this, 0);
        this.g = krh.d(context2);
        this.z = krh.h();
        this.h = new gk4(3, this);
        this.i = krh.g();
        n(krh.e());
        this.w0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.T0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.R0 = AnimationUtils.loadInterpolator(y, R.interpolator.mr_linear_out_slow_in);
        this.S0 = AnimationUtils.loadInterpolator(y, R.interpolator.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void m(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i, View view) {
        tph tphVar = new tph(view.getLayoutParams().height, i, 0, view);
        tphVar.setDuration(this.N0);
        tphVar.setInterpolator(this.Q0);
        view.startAnimation(tphVar);
    }

    public final boolean g() {
        return (this.B0 == null && this.A0 == null) ? false : true;
    }

    public final void h(boolean z) {
        OverlayListView overlayListView;
        HashSet hashSet;
        int firstVisiblePosition = this.E.getFirstVisiblePosition();
        int i = 0;
        while (true) {
            int childCount = this.E.getChildCount();
            overlayListView = this.E;
            if (i >= childCount) {
                break;
            }
            View childAt = overlayListView.getChildAt(i);
            irh irhVar = (irh) this.F.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.H) == null || !hashSet.contains(irhVar)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
            i++;
        }
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            fzj fzjVar = (fzj) it.next();
            fzjVar.j = true;
            fzjVar.k = true;
            qdc qdcVar = fzjVar.l;
            if (qdcVar != null) {
                aqh aqhVar = (aqh) qdcVar.c;
                aqhVar.J.remove((irh) qdcVar.b);
                aqhVar.F.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        i(false);
    }

    public final void i(boolean z) {
        this.H = null;
        this.I = null;
        this.L0 = false;
        if (this.M0) {
            this.M0 = false;
            r(z);
        }
        this.E.setEnabled(true);
    }

    public final int j(int i, int i2) {
        int i3 = this.m;
        return i >= i2 ? (int) (((i3 * i2) / i) + 0.5f) : (int) (((i3 * 9.0f) / 16.0f) + 0.5f);
    }

    public final int k(boolean z) {
        if (!z && this.C.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.A.getPaddingBottom() + this.A.getPaddingTop();
        if (z) {
            paddingBottom += this.B.getMeasuredHeight();
        }
        if (this.C.getVisibility() == 0) {
            paddingBottom += this.C.getMeasuredHeight();
        }
        return (z && this.C.getVisibility() == 0) ? this.D.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean l() {
        irh irhVar = this.i;
        return irhVar.e() && Collections.unmodifiableList(irhVar.v).size() > 1;
    }

    public final void n(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        PlaybackStateCompat c;
        aqd aqdVar = this.y0;
        xph xphVar = this.z0;
        if (aqdVar != null) {
            aqdVar.t(xphVar);
            this.y0 = null;
        }
        if (mediaSessionCompat$Token != null && this.l) {
            aqd aqdVar2 = new aqd(this.j, mediaSessionCompat$Token);
            this.y0 = aqdVar2;
            aqdVar2.r(xphVar);
            MediaMetadata metadata = ((a) this.y0.b).a.getMetadata();
            if (metadata != null) {
                xy0 xy0Var = MediaMetadataCompat.d;
                Parcel obtain = Parcel.obtain();
                metadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = metadata;
            } else {
                mediaMetadataCompat = null;
            }
            this.B0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.d();
            a aVar = (a) this.y0.b;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
            if (mediaSessionCompat$Token2.d() != null) {
                try {
                    c = mediaSessionCompat$Token2.d().c();
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                }
                this.A0 = c;
                p();
                o(false);
            }
            PlaybackState playbackState = aVar.a.getPlaybackState();
            c = playbackState != null ? PlaybackStateCompat.a(playbackState) : null;
            this.A0 = c;
            p();
            o(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        PlaybackStateCompat playbackStateCompat;
        int i;
        int i2;
        boolean z5 = true;
        if (this.X != null) {
            this.I0 = true;
            this.J0 = z | this.J0;
            return;
        }
        this.I0 = false;
        this.J0 = false;
        irh irhVar = this.i;
        if (!irhVar.g() || irhVar.d()) {
            dismiss();
            return;
        }
        if (this.k) {
            this.x.setText(irhVar.d);
            this.n.setVisibility(irhVar.j ? 0 : 8);
            if (this.F0) {
                Bitmap bitmap = this.G0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.u.setImageBitmap(this.G0);
                    this.u.setBackgroundColor(this.H0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.G0);
                }
                this.F0 = false;
                this.G0 = null;
                this.H0 = 0;
            }
            boolean z6 = this.z;
            if (z6 || !l()) {
                if (!this.K0 || z6) {
                    if (this.y) {
                        if (((!irhVar.e() || krh.h()) ? irhVar.o : 0) == 1) {
                            z2 = true;
                            if (z2) {
                                if (this.C.getVisibility() == 8) {
                                    this.C.setVisibility(0);
                                    this.K.setMax(irhVar.q);
                                    this.K.setProgress(irhVar.p);
                                    this.q.setVisibility(l() ? 0 : 8);
                                }
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                this.C.setVisibility(8);
            } else {
                this.C.setVisibility(8);
                this.K0 = true;
                this.E.setVisibility(0);
                this.Q0 = this.K0 ? this.R0 : this.S0;
                r(false);
            }
            if (g()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.B0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
                boolean isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.B0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (irhVar.r != -1) {
                    this.v.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.A0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.a == 0) {
                        this.v.setText(R.string.mr_controller_no_media_selected);
                    } else if (isEmpty && isEmpty2) {
                        this.v.setText(R.string.mr_controller_no_info_available);
                    } else {
                        if (isEmpty) {
                            z3 = false;
                        } else {
                            this.v.setText(charSequence);
                            z3 = true;
                        }
                        if (isEmpty2) {
                            z4 = false;
                        } else {
                            this.w.setText(charSequence2);
                            z4 = true;
                        }
                        this.v.setVisibility(!z3 ? 0 : 8);
                        this.w.setVisibility(!z4 ? 0 : 8);
                        playbackStateCompat = this.A0;
                        if (playbackStateCompat != null) {
                            int i3 = playbackStateCompat.a;
                            boolean z7 = i3 == 6 || i3 == 3;
                            Context context = this.p.getContext();
                            if (z7) {
                                if ((this.A0.e & 514) != 0) {
                                    i = R.attr.mediaRoutePauseDrawable;
                                    i2 = R.string.mr_controller_pause;
                                    this.p.setVisibility(z5 ? 0 : 8);
                                    if (z5) {
                                        this.p.setImageResource(v3g.K(context, i));
                                        this.p.setContentDescription(context.getResources().getText(i2));
                                    }
                                }
                            }
                            if (z7) {
                                if ((this.A0.e & 1) != 0) {
                                    i = R.attr.mediaRouteStopDrawable;
                                    i2 = R.string.mr_controller_stop;
                                    this.p.setVisibility(z5 ? 0 : 8);
                                    if (z5) {
                                    }
                                }
                            }
                            if (!z7) {
                                if ((this.A0.e & 516) != 0) {
                                    i = R.attr.mediaRoutePlayDrawable;
                                    i2 = R.string.mr_controller_play;
                                    this.p.setVisibility(z5 ? 0 : 8);
                                    if (z5) {
                                    }
                                }
                            }
                            z5 = false;
                            i = 0;
                            i2 = 0;
                            this.p.setVisibility(z5 ? 0 : 8);
                            if (z5) {
                            }
                        }
                    }
                }
                z4 = false;
                z3 = true;
                this.v.setVisibility(!z3 ? 0 : 8);
                this.w.setVisibility(!z4 ? 0 : 8);
                playbackStateCompat = this.A0;
                if (playbackStateCompat != null) {
                }
            }
            r(z);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
        this.g.a(crh.c, this.h, 2);
        n(krh.e());
    }

    @Override // defpackage.p30, defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        vph vphVar = new vph(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.r = frameLayout;
        frameLayout.setOnClickListener(new vph(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.s = linearLayout;
        linearLayout.setOnClickListener(new rph());
        Context context = this.j;
        int J = v3g.J(context, 0, R.attr.colorPrimary);
        if (aa5.e(J, v3g.J(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            J = v3g.J(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.n = button;
        button.setText(R.string.mr_controller_disconnect);
        this.n.setTextColor(J);
        this.n.setOnClickListener(vphVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.o = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.o.setTextColor(J);
        this.o.setOnClickListener(vphVar);
        this.x = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(vphVar);
        this.t = (FrameLayout) findViewById(R.id.mr_default_control);
        vph vphVar2 = new vph(this, 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.u = imageView;
        imageView.setOnClickListener(vphVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(vphVar2);
        this.A = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.D = findViewById(R.id.mr_control_divider);
        this.B = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.v = (TextView) findViewById(R.id.mr_control_title);
        this.w = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.p = imageButton;
        imageButton.setOnClickListener(vphVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.C = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.K = seekBar;
        irh irhVar = this.i;
        seekBar.setTag(irhVar);
        yph yphVar = new yph(this);
        this.L = yphVar;
        this.K.setOnSeekBarChangeListener(yphVar);
        this.E = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.G = new ArrayList();
        zph zphVar = new zph(this, this.E.getContext(), this.G);
        this.F = zphVar;
        this.E.setAdapter((ListAdapter) zphVar);
        this.J = new HashSet();
        LinearLayout linearLayout3 = this.A;
        OverlayListView overlayListView = this.E;
        boolean l = l();
        int J2 = v3g.J(context, 0, R.attr.colorPrimary);
        int J3 = v3g.J(context, 0, R.attr.colorPrimaryDark);
        if (l && v3g.B(context, 0) == -570425344) {
            J3 = J2;
            J2 = -1;
        }
        linearLayout3.setBackgroundColor(J2);
        overlayListView.setBackgroundColor(J3);
        linearLayout3.setTag(Integer.valueOf(J2));
        overlayListView.setTag(Integer.valueOf(J3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.K;
        LinearLayout linearLayout4 = this.A;
        int B = v3g.B(context, 0);
        if (Color.alpha(B) != 255) {
            B = aa5.i(B, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(B, B);
        HashMap hashMap = new HashMap();
        this.x0 = hashMap;
        hashMap.put(irhVar, this.K);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.q = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.i = new vph(this, 3);
        this.Q0 = this.K0 ? this.R0 : this.S0;
        this.N0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.O0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.P0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.k = true;
        q();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.g.i(this.h);
        n(null);
        this.l = false;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.p30, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.z || !this.K0) {
            this.i.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // defpackage.p30, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void p() {
        MediaDescriptionCompat mediaDescriptionCompat = this.B0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        wph wphVar = this.C0;
        Bitmap bitmap2 = wphVar == null ? this.D0 : wphVar.a;
        Uri uri2 = wphVar == null ? this.E0 : wphVar.b;
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!l() || this.z) {
            wph wphVar2 = this.C0;
            if (wphVar2 != null) {
                wphVar2.cancel(true);
            }
            wph wphVar3 = new wph(this);
            this.C0 = wphVar3;
            wphVar3.execute(new Void[0]);
        }
    }

    public final void q() {
        Context context = this.j;
        int a0 = o2g.a0(context);
        getWindow().setLayout(a0, -2);
        View decorView = getWindow().getDecorView();
        this.m = (a0 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.Y = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.Z = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.v0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.D0 = null;
        this.E0 = null;
        p();
        o(false);
    }

    public final void r(boolean z) {
        this.t.requestLayout();
        this.t.getViewTreeObserver().addOnGlobalLayoutListener(new sph(this, z));
    }

    public final void s(boolean z) {
        int i = 0;
        this.D.setVisibility((this.C.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.A;
        if (this.C.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
