package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class wqh extends gr0 {
    public static final /* synthetic */ int z0 = 0;
    public boolean A;
    public ImageButton B;
    public Button C;
    public ImageView D;
    public View E;
    public ImageView F;
    public TextView G;
    public TextView H;
    public String I;
    public aqd J;
    public final xph K;
    public MediaDescriptionCompat L;
    public nqh X;
    public Bitmap Y;
    public Uri Z;
    public final krh f;
    public final gk4 g;
    public crh h;
    public irh i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final Context n;
    public boolean o;
    public boolean p;
    public long q;
    public final tt1 r;
    public RecyclerView s;
    public uqh t;
    public vqh u;
    public HashMap v;
    public boolean v0;
    public irh w;
    public Bitmap w0;
    public HashMap x;
    public int x0;
    public boolean y;
    public final boolean y0;
    public boolean z;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wqh(Context context) {
        super(r2, r0 == 0 ? v3g.H(r2) : r0);
        ContextThemeWrapper y = v3g.y(context, false);
        int K = v3g.K(y, R.attr.mediaRouteTheme);
        this.h = crh.c;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.r = new tt1(10, this);
        Context context2 = getContext();
        this.n = context2;
        this.f = krh.d(context2);
        this.y0 = krh.h();
        this.g = new gk4(5, this);
        this.i = krh.g();
        this.K = new xph(this, 1);
        g(krh.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            irh irhVar = (irh) list.get(size);
            if (irhVar.d() || !irhVar.g || !irhVar.h(this.h) || this.i == irhVar) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.L;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        nqh nqhVar = this.X;
        Bitmap bitmap2 = nqhVar == null ? this.Y : nqhVar.a;
        Uri uri2 = nqhVar == null ? this.Z : nqhVar.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            nqh nqhVar2 = this.X;
            if (nqhVar2 != null) {
                nqhVar2.cancel(true);
            }
            nqh nqhVar3 = new nqh(this);
            this.X = nqhVar3;
            nqhVar3.execute(new Void[0]);
        }
    }

    public final void g(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        aqd aqdVar = this.J;
        xph xphVar = this.K;
        if (aqdVar != null) {
            aqdVar.t(xphVar);
            this.J = null;
        }
        if (mediaSessionCompat$Token != null && this.p) {
            aqd aqdVar2 = new aqd(this.n, mediaSessionCompat$Token);
            this.J = aqdVar2;
            aqdVar2.r(xphVar);
            MediaMetadata metadata = ((a) this.J.b).a.getMetadata();
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
            this.L = mediaMetadataCompat != null ? mediaMetadataCompat.d() : null;
            f();
            j();
        }
    }

    public final void h(crh crhVar) {
        if (crhVar == null) {
            xq0.x("selector must not be null");
            return;
        }
        if (this.h.equals(crhVar)) {
            return;
        }
        this.h = crhVar;
        if (this.p) {
            krh krhVar = this.f;
            gk4 gk4Var = this.g;
            krhVar.i(gk4Var);
            krhVar.a(crhVar, gk4Var, 1);
            k();
        }
    }

    public final void i() {
        Context context = this.n;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : o2g.a0(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.Y = null;
        this.Z = null;
        f();
        j();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean isEmpty;
        boolean isEmpty2;
        if ((this.w != null || this.y) ? true : !this.o) {
            this.A = true;
            return;
        }
        this.A = false;
        if (!this.i.g() || this.i.d()) {
            dismiss();
        }
        if (this.v0) {
            Bitmap bitmap = this.w0;
            if (!(bitmap != null && bitmap.isRecycled()) && this.w0 != null) {
                this.F.setVisibility(0);
                this.F.setImageBitmap(this.w0);
                this.F.setBackgroundColor(this.x0);
                this.E.setVisibility(0);
                Bitmap bitmap2 = this.w0;
                RenderScript create = RenderScript.create(this.n);
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
                Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                create2.setRadius(10.0f);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                Bitmap copy = bitmap2.copy(bitmap2.getConfig(), true);
                createTyped.copyTo(copy);
                createFromBitmap.destroy();
                createTyped.destroy();
                create2.destroy();
                create.destroy();
                this.D.setImageBitmap(copy);
                this.v0 = false;
                this.w0 = null;
                this.x0 = 0;
                MediaDescriptionCompat mediaDescriptionCompat = this.L;
                CharSequence charSequence = mediaDescriptionCompat != null ? null : mediaDescriptionCompat.b;
                isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.L;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                isEmpty2 = TextUtils.isEmpty(charSequence2);
                TextView textView = this.G;
                if (isEmpty) {
                    textView.setText(charSequence);
                } else {
                    textView.setText(this.I);
                }
                TextView textView2 = this.H;
                if (!isEmpty2) {
                    textView2.setVisibility(8);
                    return;
                } else {
                    textView2.setText(charSequence2);
                    this.H.setVisibility(0);
                    return;
                }
            }
        }
        Bitmap bitmap3 = this.w0;
        if (bitmap3 != null && bitmap3.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.w0);
        }
        this.F.setVisibility(8);
        this.E.setVisibility(8);
        this.D.setImageBitmap(null);
        this.v0 = false;
        this.w0 = null;
        this.x0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat3 = this.L;
        if (mediaDescriptionCompat3 != null) {
        }
        isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat22 = this.L;
        if (mediaDescriptionCompat22 != null) {
        }
        isEmpty2 = TextUtils.isEmpty(charSequence2);
        TextView textView3 = this.G;
        if (isEmpty) {
        }
        TextView textView22 = this.H;
        if (!isEmpty2) {
        }
    }

    public final void k() {
        ArrayList arrayList = this.j;
        arrayList.clear();
        ArrayList arrayList2 = this.k;
        arrayList2.clear();
        ArrayList arrayList3 = this.l;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.i.v));
        hrh hrhVar = this.i.a;
        hrhVar.getClass();
        krh.b();
        for (irh irhVar : Collections.unmodifiableList(hrhVar.b)) {
            g8c b = this.i.b(irhVar);
            if (b != null) {
                xqh xqhVar = (xqh) b.a;
                if (xqhVar != null && xqhVar.d) {
                    arrayList2.add(irhVar);
                }
                if (xqhVar != null && xqhVar.e) {
                    arrayList3.add(irhVar);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        C1318t c1318t = C1318t.k;
        Collections.sort(arrayList, c1318t);
        Collections.sort(arrayList2, c1318t);
        Collections.sort(arrayList3, c1318t);
        this.t.x();
    }

    public final void l() {
        if (this.p) {
            if (SystemClock.uptimeMillis() - this.q < 300) {
                tt1 tt1Var = this.r;
                tt1Var.removeMessages(1);
                tt1Var.sendEmptyMessageAtTime(1, this.q + 300);
                return;
            }
            if ((this.w != null || this.y) ? true : !this.o) {
                this.z = true;
                return;
            }
            this.z = false;
            if (!this.i.g() || this.i.d()) {
                dismiss();
            }
            this.q = SystemClock.uptimeMillis();
            this.t.w();
        }
    }

    public final void m() {
        if (this.z) {
            l();
        }
        if (this.A) {
            j();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = true;
        this.f.a(this.h, this.g, 1);
        k();
        g(krh.e());
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.n;
        decorView.setBackgroundColor(context.getColor(v3g.M(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.B = imageButton;
        imageButton.setColorFilter(-1);
        this.B.setOnClickListener(new mqh(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.C = button;
        button.setTextColor(-1);
        this.C.setOnClickListener(new mqh(this, 1));
        this.t = new uqh(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.s = recyclerView;
        recyclerView.setAdapter(this.t);
        this.s.setLayoutManager(new LinearLayoutManager(context));
        this.u = new vqh(this);
        this.v = new HashMap();
        this.x = new HashMap();
        this.D = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.E = findViewById(R.id.mr_cast_meta_black_scrim);
        this.F = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.G = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.H = textView2;
        textView2.setTextColor(-1);
        this.I = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.o = true;
        i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p = false;
        this.f.i(this.g);
        this.r.removeCallbacksAndMessages(null);
        g(null);
    }
}
