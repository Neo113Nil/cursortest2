package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class xzi implements nwu, lci, er1, pm5, ppb, l07, i37, ydk, x5j, r9i, zfv, gvs, s03, in7, q3c {
    public static final huj b = new huj(1);
    public static final huj c = new huj(0);
    public final Object a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r6 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[LOOP:1: B:14:0x0042->B:15:0x0044, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xzi(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        int length2 = fArr.length - 1;
        fx0[][] fx0VarArr = new fx0[length2][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length2) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            i7 = 4;
                            if (i6 != 4) {
                                i7 = 5;
                                if (i6 != 5) {
                                    i = i4;
                                    float[] fArr3 = fArr2[i5];
                                    int i8 = i5 + 1;
                                    float[] fArr4 = fArr2[i8];
                                    float f = fArr[i5];
                                    float f2 = fArr[i8];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    fx0[] fx0VarArr2 = new fx0[length];
                                    i2 = 0;
                                    while (i2 < length) {
                                        int i9 = i2 * 2;
                                        fx0[] fx0VarArr3 = fx0VarArr2;
                                        int i10 = i2;
                                        int i11 = i9 + 1;
                                        fx0VarArr3[i10] = new fx0(i, f, f2, fArr3[i9], fArr3[i11], fArr4[i9], fArr4[i11]);
                                        i2 = i10 + 1;
                                        fx0VarArr2 = fx0VarArr3;
                                    }
                                    fx0VarArr[i5] = fx0VarArr2;
                                    i5 = i8;
                                    i4 = i;
                                }
                            }
                        }
                    }
                    i3 = 2;
                    i = i3;
                    float[] fArr32 = fArr2[i5];
                    int i82 = i5 + 1;
                    float[] fArr42 = fArr2[i82];
                    float f3 = fArr[i5];
                    float f22 = fArr[i82];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    fx0[] fx0VarArr22 = new fx0[length];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    fx0VarArr[i5] = fx0VarArr22;
                    i5 = i82;
                    i4 = i;
                }
                i3 = 1;
                i = i3;
                float[] fArr322 = fArr2[i5];
                int i822 = i5 + 1;
                float[] fArr422 = fArr2[i822];
                float f32 = fArr[i5];
                float f222 = fArr[i822];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                fx0[] fx0VarArr222 = new fx0[length];
                i2 = 0;
                while (i2 < length) {
                }
                fx0VarArr[i5] = fx0VarArr222;
                i5 = i822;
                i4 = i;
            }
            i = i7;
            float[] fArr3222 = fArr2[i5];
            int i8222 = i5 + 1;
            float[] fArr4222 = fArr2[i8222];
            float f322 = fArr[i5];
            float f2222 = fArr[i8222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            fx0[] fx0VarArr2222 = new fx0[length];
            i2 = 0;
            while (i2 < length) {
            }
            fx0VarArr[i5] = fx0VarArr2222;
            i5 = i8222;
            i4 = i;
        }
        this.a = fx0VarArr;
    }

    public static void P(List list, xzb xzbVar, a0c a0cVar, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo8 mo8Var = (mo8) it.next();
            if (mo8Var != null) {
                if (mo8Var instanceof lo8) {
                    a0cVar.i(((lo8) mo8Var).b.a.c(xzbVar, function1));
                } else if (mo8Var instanceof ho8) {
                    k29 k29Var = ((ho8) mo8Var).b;
                    a0cVar.i(k29Var.a.c(xzbVar, function1));
                    a0cVar.i(k29Var.e.c(xzbVar, function1));
                    a0cVar.i(k29Var.b.c(xzbVar, function1));
                    a0cVar.i(k29Var.c.c(xzbVar, function1));
                    a0cVar.i(k29Var.f.c(xzbVar, function1));
                    a0cVar.i(k29Var.g.c(xzbVar, function1));
                    List<hy8> list2 = k29Var.d;
                    if (list2 != null) {
                        for (hy8 hy8Var : list2) {
                            if (hy8Var != null && !(hy8Var instanceof gy8) && (hy8Var instanceof fy8)) {
                                a0cVar.i(((fy8) hy8Var).b.a.c(xzbVar, function1));
                            }
                        }
                    }
                } else if (mo8Var instanceof io8) {
                    g89 g89Var = ((io8) mo8Var).b;
                    a0cVar.i(g89Var.a.c(xzbVar, function1));
                    vzb vzbVar = g89Var.c;
                    a0cVar.i(vzbVar != null ? vzbVar.b(xzbVar, function1) : null);
                    List<f89> list3 = g89Var.b;
                    if (list3 != null) {
                        for (f89 f89Var : list3) {
                            if (f89Var != null) {
                                a0cVar.i(f89Var.a.c(xzbVar, function1));
                                a0cVar.i(f89Var.b.c(xzbVar, function1));
                            }
                        }
                    }
                } else if (mo8Var instanceof ko8) {
                    of9 of9Var = ((ko8) mo8Var).b;
                    vzb vzbVar2 = of9Var.d;
                    a0cVar.i(vzbVar2 != null ? vzbVar2.b(xzbVar, function1) : null);
                    sk3.N(a0cVar, of9Var.a, xzbVar, function1);
                    sk3.N(a0cVar, of9Var.b, xzbVar, function1);
                    mg9 mg9Var = of9Var.e;
                    if (mg9Var != null) {
                        if (mg9Var instanceof kg9) {
                            jz8 jz8Var = ((kg9) mg9Var).b;
                            a0cVar.i(jz8Var.a.c(xzbVar, function1));
                            a0cVar.i(jz8Var.b.c(xzbVar, function1));
                        } else if (mg9Var instanceof lg9) {
                            a0cVar.i(((lg9) mg9Var).b.a.c(xzbVar, function1));
                        }
                    }
                    List<nf9> list4 = of9Var.c;
                    if (list4 != null) {
                        for (nf9 nf9Var : list4) {
                            if (nf9Var != null) {
                                a0cVar.i(nf9Var.a.c(xzbVar, function1));
                                a0cVar.i(nf9Var.b.c(xzbVar, function1));
                            }
                        }
                    }
                } else if (mo8Var instanceof jo8) {
                    l99 l99Var = ((jo8) mo8Var).b;
                    a0cVar.i(l99Var.a.c(xzbVar, function1));
                    kc8 kc8Var = l99Var.b;
                    if (kc8Var != null) {
                        a0cVar.i(kc8Var.b.c(xzbVar, function1));
                        a0cVar.i(kc8Var.d.c(xzbVar, function1));
                        a0cVar.i(kc8Var.c.c(xzbVar, function1));
                        a0cVar.i(kc8Var.a.c(xzbVar, function1));
                    }
                }
            }
        }
    }

    public static Drawable Z(View view) {
        Object tag = view.getTag(R.id.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    public static wo8 k0(mo8 mo8Var, gc8 gc8Var, DisplayMetrics displayMetrics, xzb xzbVar) {
        int i = Integer.MIN_VALUE;
        if (mo8Var instanceof io8) {
            g89 g89Var = ((io8) mo8Var).b;
            long longValue = ((Number) g89Var.a.a(xzbVar)).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else if (longValue > 0) {
                i = Integer.MAX_VALUE;
            }
            la5 V = i4w.V(g89Var, xzbVar);
            xv.D(V, gc8Var);
            return new so8(i, V);
        }
        if (mo8Var instanceof ko8) {
            of9 of9Var = ((ko8) mo8Var).b;
            hag Y = i4w.Y(of9Var.a, displayMetrics, xzbVar);
            hag Y2 = i4w.Y(of9Var.b, displayMetrics, xzbVar);
            la5 W = i4w.W(of9Var, xzbVar);
            xv.D(W, gc8Var);
            return new uo8(Y, Y2, W, i4w.Z(of9Var.e, displayMetrics, xzbVar));
        }
        if (mo8Var instanceof ho8) {
            k29 k29Var = ((ho8) mo8Var).b;
            double doubleValue = ((Number) k29Var.a.a(xzbVar)).doubleValue();
            om8 om8Var = (om8) k29Var.b.a(xzbVar);
            pm8 pm8Var = (pm8) k29Var.c.a(xzbVar);
            Uri uri = (Uri) k29Var.e.a(xzbVar);
            boolean booleanValue = ((Boolean) k29Var.f.a(xzbVar)).booleanValue();
            g39 g39Var = (g39) k29Var.g.a(xzbVar);
            List list = k29Var.d;
            return new ro8(doubleValue, om8Var, pm8Var, uri, booleanValue, g39Var, list != null ? vq1.h0(list, xzbVar) : null);
        }
        if (mo8Var instanceof lo8) {
            return new vo8(((Number) ((lo8) mo8Var).b.a.a(xzbVar)).intValue());
        }
        if (!(mo8Var instanceof jo8)) {
            b6e.s();
            return null;
        }
        l99 l99Var = ((jo8) mo8Var).b;
        kc8 kc8Var = l99Var.b;
        Uri uri2 = (Uri) l99Var.a.a(xzbVar);
        long longValue2 = ((Number) kc8Var.b.a(xzbVar)).longValue();
        long j2 = longValue2 >> 31;
        int i2 = (j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue3 = ((Number) kc8Var.d.a(xzbVar)).longValue();
        long j3 = longValue3 >> 31;
        int i3 = (j3 == 0 || j3 == -1) ? (int) longValue3 : longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue4 = ((Number) kc8Var.c.a(xzbVar)).longValue();
        long j4 = longValue4 >> 31;
        int i4 = (j4 == 0 || j4 == -1) ? (int) longValue4 : longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue5 = ((Number) kc8Var.a.a(xzbVar)).longValue();
        long j5 = longValue5 >> 31;
        if (j5 == 0 || j5 == -1) {
            i = (int) longValue5;
        } else if (longValue5 > 0) {
            i = Integer.MAX_VALUE;
        }
        return new to8(uri2, new Rect(i2, i3, i4, i));
    }

    public static void n0(View view, Drawable drawable) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.drawable.native_animation_background) : null) != null) {
            Drawable drawable2 = view.getContext().getDrawable(R.drawable.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z = true;
        } else {
            z = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z) {
            Drawable background2 = view.getBackground();
            background2.getClass();
            Drawable background3 = view.getBackground();
            background3.getClass();
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, R.drawable.native_animation_background);
        }
    }

    @Override // defpackage.s03
    public void A(x7o x7oVar) {
        ((tdk) ((z07) this.a).m).h.a(x7oVar);
    }

    @Override // defpackage.vbk
    public void B(bfk bfkVar) {
        bfkVar.getClass();
    }

    @Override // defpackage.a17
    public sdk C() {
        return ((BindCardActivity) this.a).l().f();
    }

    @Override // defpackage.i37
    public m37 D() {
        return ((BindCardActivity) this.a).c;
    }

    @Override // defpackage.gvs
    public void E(zvs zvsVar) {
        zvsVar.getClass();
        gvs[] gvsVarArr = (gvs[]) this.a;
        for (int i = 0; i < 2; i++) {
            gvsVarArr[i].E(zvsVar);
        }
    }

    @Override // defpackage.l07
    public void F(fg3 fg3Var) {
        fg3Var.getClass();
        Object obj = kib.a;
        BindCardActivity bindCardActivity = (BindCardActivity) this.a;
        a a = kib.a(bindCardActivity.l().b());
        if (a != null) {
            a.a(x2i.h);
        }
        bindCardActivity.x(fg3Var);
        j8o j8oVar = bindCardActivity.l().a().e;
        if (j8oVar.c || j8oVar.d() || bindCardActivity.getIntent().getBooleanExtra("EXTRA_IS_TRANSPORT_CARDS_FLOW", false)) {
            bindCardActivity.k();
            return;
        }
        uds udsVar = new uds(R.string.paymentsdk_bind_success_title);
        uds udsVar2 = j8oVar.a ? new uds(R.string.paymentsdk_login_done) : null;
        long j = j8oVar.b;
        l37 l37Var = new l37();
        l37Var.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new t9o("success", false, false, udsVar, null, udsVar2, null, null, j, m8o.a))));
        o oVar = (n7w.R(q6c.e) && n7w.R(q6c.m)) ? l37Var : null;
        if (oVar == null) {
            oVar = new g8o();
            oVar.setArguments(cxb.K(new Pair("ARG_RESULT", e8o.a), new Pair("ARG_TEXT", Integer.valueOf(R.string.paymentsdk_bind_success_title)), new Pair("ARG_IS_LOGGED_IN", Boolean.TRUE), new Pair("ARG_CLOSING", j8oVar)));
        }
        y supportFragmentManager = bindCardActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.e(R.id.fragment_container, oVar, null);
        aVar.k(true, true);
    }

    @Override // defpackage.ydk
    public void H(boolean z) {
        ((mhk) ((BindCardActivity) this.a).D()).a.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.a17
    public xx3 I() {
        return ((BindCardActivity) this.a).l().a().a;
    }

    @Override // defpackage.in7
    public short J() {
        int read = ((InputStream) this.a).read();
        if (read != -1) {
            return (short) read;
        }
        throw new hn7();
    }

    @Override // defpackage.er1
    public ca7 K(AssetManager assetManager, String str) {
        return new p9c(assetManager, str, 0);
    }

    @Override // defpackage.a17
    public boolean M() {
        return ((BindCardActivity) this.a).m();
    }

    @Override // defpackage.a17
    public hek N() {
        return ((BindCardActivity) this.a).l().g();
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
        ((hr) this.a).d.z();
    }

    public void Q(Handler handler, xk2 xk2Var) {
        handler.getClass();
        xk2Var.getClass();
        c0(xk2Var);
        ((CopyOnWriteArrayList) this.a).add(new wk2(handler, xk2Var));
    }

    public void R(View view, e23 e23Var, Drawable drawable, List list) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        xzb xzbVar = e23Var.b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(k0((mo8) it.next(), e23Var.a, displayMetrics, xzbVar));
        }
        Object tag = view.getTag(R.id.div_default_background_list_tag);
        List list3 = tag instanceof List ? (List) tag : null;
        Drawable Z = Z(view);
        if (Intrinsics.d(list3, arrayList) && Intrinsics.d(Z, drawable)) {
            return;
        }
        n0(view, l0(arrayList, e23Var, view, drawable));
        view.setTag(R.id.div_default_background_list_tag, arrayList);
        view.setTag(R.id.div_focused_background_list_tag, null);
        view.setTag(R.id.div_additional_background_layer_tag, drawable);
    }

    public void S(View view, e23 e23Var, Drawable drawable, List list, List list2) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        gc8 gc8Var = e23Var.a;
        xzb xzbVar = e23Var.b;
        List list3 = list;
        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(k0((mo8) it.next(), gc8Var, displayMetrics, xzbVar));
        }
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(k0((mo8) it2.next(), gc8Var, displayMetrics, xzbVar));
        }
        Object tag = view.getTag(R.id.div_default_background_list_tag);
        List list5 = tag instanceof List ? (List) tag : null;
        Object tag2 = view.getTag(R.id.div_focused_background_list_tag);
        List list6 = tag2 instanceof List ? (List) tag2 : null;
        Drawable Z = Z(view);
        if (Intrinsics.d(list5, arrayList) && Intrinsics.d(list6, arrayList2) && Intrinsics.d(Z, drawable)) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_focused}, l0(arrayList2, e23Var, view, drawable));
        if (!list.isEmpty() || drawable != null) {
            stateListDrawable.addState(StateSet.WILD_CARD, l0(arrayList, e23Var, view, drawable));
        }
        n0(view, stateListDrawable);
        view.setTag(R.id.div_default_background_list_tag, arrayList);
        view.setTag(R.id.div_focused_background_list_tag, arrayList2);
        view.setTag(R.id.div_additional_background_layer_tag, drawable);
    }

    public void T(int i, long j, long j2) {
        int i2;
        long j3;
        long j4;
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        while (it.hasNext()) {
            wk2 wk2Var = (wk2) it.next();
            if (wk2Var.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                wk2Var.a.post(new zx1(wk2Var, i2, j3, j4, 1));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    public ev1 U() {
        return new ev1(((AudioAttributes.Builder) this.a).build(), 0);
    }

    public void V(CancellationException cancellationException) {
        eqi eqiVar = (eqi) this.a;
        int i = eqiVar.c;
        yt3[] yt3VarArr = new yt3[i];
        for (int i2 = 0; i2 < i; i2++) {
            yt3VarArr[i2] = ((cc6) eqiVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            yt3VarArr[i3].h(cancellationException);
        }
        if (eqiVar.c == 0) {
            return;
        }
        vme.c("uncancelled requests present");
    }

    public void W(float f, float f2, float f3, float f4, int i) {
        ((nsh) this.a).s().i(f, f2, f3, f4, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if ((r0.getResponseCode() / 100) == 2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nzg X(Context context, String str, String str2) {
        ayg aygVar;
        fo7 y;
        HttpURLConnection httpURLConnection;
        nzg nzgVar;
        android.util.Pair pair;
        nzg h;
        File s;
        boolean z = true;
        AutoCloseable autoCloseable = null;
        if (str2 != null) {
            try {
                s = ((jzi) this.a).s(str);
            } catch (FileNotFoundException unused) {
            }
            if (s != null) {
                FileInputStream fileInputStream = new FileInputStream(s);
                t9c t9cVar = s.getAbsolutePath().endsWith(".zip") ? t9c.ZIP : s.getAbsolutePath().endsWith(".gz") ? t9c.GZIP : t9c.JSON;
                s.getAbsolutePath();
                psg.a();
                pair = new android.util.Pair(t9cVar, fileInputStream);
                if (pair != null) {
                    t9c t9cVar2 = (t9c) pair.first;
                    InputStream inputStream = (InputStream) pair.second;
                    int ordinal = t9cVar2.ordinal();
                    if (ordinal == 1) {
                        h = gyg.h(context, new ZipInputStream(inputStream), str2);
                    } else if (ordinal != 2) {
                        h = gyg.d(inputStream, str2);
                    } else {
                        try {
                            h = gyg.d(new GZIPInputStream(inputStream), str2);
                        } catch (IOException e) {
                            h = new nzg(e);
                        }
                    }
                    aygVar = h.a;
                }
            }
            pair = null;
            if (pair != null) {
            }
        }
        aygVar = null;
        if (aygVar != null) {
            return new nzg(aygVar);
        }
        psg.a();
        psg.a();
        try {
            try {
                y = hs4.y(str);
                httpURLConnection = (HttpURLConnection) y.b;
            } catch (Exception e2) {
                nzg nzgVar2 = new nzg(e2);
                if (0 != 0) {
                    try {
                        autoCloseable.close();
                    } catch (IOException e3) {
                        psg.c("LottieFetchResult close failed ", e3);
                    }
                }
                return nzgVar2;
            }
        } finally {
        }
        z = false;
        if (z) {
            nzgVar = Y(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
            ayg aygVar2 = nzgVar.a;
            psg.a();
        } else {
            nzgVar = new nzg(new IllegalArgumentException(y.a()));
        }
        try {
            y.close();
            return nzgVar;
        } catch (IOException e4) {
            psg.c("LottieFetchResult close failed ", e4);
            return nzgVar;
        }
    }

    public nzg Y(Context context, String str, InputStream inputStream, String str2, String str3) {
        nzg h;
        t9c t9cVar;
        jzi jziVar = (jzi) this.a;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            psg.a();
            t9c t9cVar2 = t9c.ZIP;
            h = str3 != null ? gyg.h(context, new ZipInputStream(new FileInputStream(jziVar.L(str, inputStream, t9cVar2))), str) : gyg.h(context, new ZipInputStream(inputStream), null);
            t9cVar = t9cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            psg.a();
            t9cVar = t9c.GZIP;
            h = str3 != null ? gyg.d(new GZIPInputStream(new FileInputStream(jziVar.L(str, inputStream, t9cVar))), str) : gyg.d(new GZIPInputStream(inputStream), null);
        } else {
            psg.a();
            t9cVar = t9c.JSON;
            h = str3 != null ? gyg.d(new FileInputStream(jziVar.L(str, inputStream, t9cVar).getAbsolutePath()), str) : gyg.d(inputStream, null);
        }
        if (str3 != null && h.a != null) {
            File file = new File(jziVar.w(), jzi.p(str, t9cVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            psg.a();
            if (!renameTo) {
                psg.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return h;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [arf, java.lang.Object] */
    @Override // defpackage.ppb
    public u8q a() {
        return (u8q) ((BindCardActivity) this.a).p.getValue();
    }

    public void a0(float f, float f2, float f3, float f4) {
        nsh nshVar = (nsh) this.a;
        mu3 s = nshVar.s();
        float intBitsToFloat = Float.intBitsToFloat((int) (nshVar.B() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (nshVar.B() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            rme.a("Width and height must be greater than or equal to zero");
        }
        nshVar.R(floatToRawIntBits);
        s.j(f, f2);
    }

    @Override // defpackage.ppb
    public Object b(o oVar, Class cls) {
        return ((rsd) qld.y(oVar)).a().b(s79.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b0(cg6 cg6Var, String str, List list) {
        fu7 fu7Var;
        int i;
        gln d;
        kd4 kd4Var;
        if (cg6Var instanceof fu7) {
            fu7Var = (fu7) cg6Var;
            int i2 = fu7Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fu7Var.n = i2 - Integer.MIN_VALUE;
                Object obj = fu7Var.l;
                nm6 nm6Var = nm6.a;
                i = fu7Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    kd4 kd4Var2 = new kd4(men.g(Integer.MAX_VALUE, 6, null));
                    gm5 j = hld.j();
                    b0o b0oVar = new b0o();
                    b0oVar.g(str);
                    b0oVar.c = ywf.J(list).m();
                    d = ((OkHttpClient) this.a).d(b0oVar.b(), new hu7(j, kd4Var2));
                    fu7Var.j = kd4Var2;
                    fu7Var.k = d;
                    fu7Var.n = 1;
                    if (j.s(fu7Var) == nm6Var) {
                        return nm6Var;
                    }
                    kd4Var = kd4Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d = fu7Var.k;
                    kd4Var = fu7Var.j;
                    qgg.h0(obj);
                }
                az6 az6Var = new az6(13, d);
                kd4Var.getClass();
                kd4Var.b = az6Var;
                return new gu7(kd4Var, d);
            }
        }
        fu7Var = new fu7(this, cg6Var);
        Object obj2 = fu7Var.l;
        nm6 nm6Var2 = nm6.a;
        i = fu7Var.n;
        if (i != 0) {
        }
        az6 az6Var2 = new az6(13, d);
        kd4Var.getClass();
        kd4Var.b = az6Var2;
        return new gu7(kd4Var, d);
    }

    @Override // defpackage.a17
    public boolean c() {
        mgk H;
        if (n7w.R(q6c.w)) {
            rdk rdkVar = avf.t(((BindCardActivity) this.a).l().f()).g;
            if ((rdkVar == null || (H = rdkVar.H()) == null) ? false : H.f.p) {
                return true;
            }
        }
        return false;
    }

    public void c0(xk2 xk2Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            wk2 wk2Var = (wk2) it.next();
            if (wk2Var.b == xk2Var) {
                wk2Var.c = true;
                copyOnWriteArrayList.remove(wk2Var);
            }
        }
    }

    public void d0() {
        eqi eqiVar = (eqi) this.a;
        IntRange m = yhn.m(0, eqiVar.c);
        int i = m.a;
        int i2 = m.b;
        if (i <= i2) {
            while (true) {
                zt3 zt3Var = ((cc6) eqiVar.a[i]).b;
                Unit unit = Unit.a;
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eqiVar.i();
    }

    @Override // defpackage.zfv
    public void e() {
        ((SslErrorHandler) this.a).cancel();
    }

    public void e0(float f, long j) {
        mu3 s = ((nsh) this.a).s();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        s.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        s.o(f);
        s.j(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // defpackage.q3c
    public Object f() {
        x0 x0Var = (x0) this.a;
        return new xf7((u76) x0Var.c, (vx6) x0Var.d);
    }

    public void f0(float f, float f2, long j) {
        mu3 s = ((nsh) this.a).s();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        s.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        s.b(f, f2);
        s.j(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // defpackage.i37
    public void finish() {
        ((BindCardActivity) this.a).k();
    }

    @Override // defpackage.l07
    public void g(bfk bfkVar) {
        bfkVar.getClass();
        Object obj = kib.a;
        BindCardActivity bindCardActivity = (BindCardActivity) this.a;
        a a = kib.a(bindCardActivity.l().b());
        if (a != null) {
            a.a(new qek(bfkVar));
        }
        bindCardActivity.w(bfkVar);
        j8o j8oVar = bindCardActivity.l().a().e;
        if (j8oVar.d()) {
            bindCardActivity.k();
            return;
        }
        uds udsVar = new uds(qgg.Y(bfkVar, R.string.paymentsdk_error_title));
        uds udsVar2 = j8oVar.a ? new uds(R.string.paymentsdk_login_done) : null;
        Integer S = qgg.S(bfkVar);
        uds udsVar3 = S != null ? new uds(S.intValue()) : null;
        long j = j8oVar.b;
        k8o k8oVar = new k8o(bfkVar);
        l37 l37Var = new l37();
        l37Var.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new r9o("failure", false, false, udsVar, udsVar3, udsVar2, null, null, j, null, k8oVar))));
        o oVar = (n7w.R(q6c.e) && n7w.R(q6c.m)) ? l37Var : null;
        if (oVar == null) {
            int Y = qgg.Y(bfkVar, R.string.paymentsdk_error_title);
            Integer S2 = qgg.S(bfkVar);
            oVar = new g8o();
            oVar.setArguments(cxb.K(new Pair("ARG_RESULT", e8o.b), new Pair("ARG_TEXT", Integer.valueOf(Y)), new Pair("ARG_SUBTITLE", S2), new Pair("ARG_CLOSING", j8oVar)));
        }
        y supportFragmentManager = bindCardActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.e(R.id.fragment_container, oVar, null);
        aVar.k(true, true);
    }

    public void g0(fek fekVar) {
        BindCardActivity bindCardActivity = (BindCardActivity) this.a;
        fek currentState = ((mhk) bindCardActivity.D()).a.getCurrentState();
        if (!Intrinsics.d(currentState != null ? currentState.getClass() : null, fekVar.getClass())) {
            if (fekVar.equals(cek.a)) {
                bindCardActivity.u(gut.j0());
            } else if (fekVar instanceof dek) {
                bindCardActivity.u(gut.k0());
            } else {
                fekVar.equals(eek.a);
            }
        }
        ((mhk) bindCardActivity.D()).a.setState(fekVar);
    }

    @Override // defpackage.x5j
    public g0c getEventReporter() {
        return ((BindCardActivity) this.a).l().c();
    }

    @Override // defpackage.in7
    public int h() {
        return (J() << 8) | J();
    }

    public void h0(String str, String str2, String str3) {
        str.getClass();
        ((mhk) ((BindCardActivity) this.a).D()).a.t(str, str2, null);
    }

    @Override // defpackage.ppb
    public d51 i() {
        return new d51(22);
    }

    public xzi i0(int i) {
        if (i == 16) {
            i = 12;
        }
        ((AudioAttributes.Builder) this.a).setUsage(i);
        return this;
    }

    @Override // defpackage.a17
    public e88 j() {
        return new e88(15);
    }

    public /* bridge */ xzi j0(int i) {
        return i0(i);
    }

    @Override // defpackage.vbk
    public void k(String str, List list) {
        str.getClass();
        list.getClass();
        BindCardActivity bindCardActivity = (BindCardActivity) this.a;
        y supportFragmentManager = bindCardActivity.getSupportFragmentManager();
        androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
        qxp qxpVar = new qxp((Object) bindCardActivity);
        ugk ugkVar = ((pxf) bindCardActivity.g.getValue()).a;
        zdv zdvVar = new zdv();
        zdvVar.l = qxpVar;
        zdvVar.setArguments(zwf.y(str, ugkVar, list, true));
        l.e(R.id.challenge_fragment, zdvVar, null);
        l.k(true, true);
    }

    @Override // defpackage.r9i
    public void l(String str) {
        str.getClass();
        qdq.A(new k5(14, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r9 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r9 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LayerDrawable l0(ArrayList arrayList, e23 e23Var, View view, Drawable drawable) {
        View view2;
        Drawable gfnVar;
        int i;
        if (drawable != null) {
            drawable.mutate();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wo8 wo8Var = (wo8) it.next();
            a39 a39Var = (a39) this.a;
            wo8Var.getClass();
            if (wo8Var instanceof ro8) {
                ro8 ro8Var = (ro8) wo8Var;
                uso usoVar = new uso();
                usoVar.setAlpha((int) (ro8Var.a * KotlinVersion.MAX_COMPONENT_VALUE));
                int ordinal = ro8Var.f.ordinal();
                usoVar.a = ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? 1 : 4 : 2 : 3;
                om8 om8Var = ro8Var.b;
                boolean N = wyf.N(view);
                int ordinal2 = om8Var.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    b6e.s();
                                    return null;
                                }
                            }
                        }
                        i = 3;
                    } else {
                        i = 2;
                    }
                    usoVar.b = i;
                    int ordinal3 = ro8Var.c.ordinal();
                    usoVar.c = ordinal3 != 1 ? ordinal3 != 2 ? 1 : 3 : 2;
                    float f = view.getResources().getDisplayMetrics().density;
                    usoVar.d = f;
                    String uri = ro8Var.d.toString();
                    gc8 gc8Var = e23Var.a;
                    view2 = view;
                    gc8Var.p(a39Var.b(uri, new qo8(gc8Var, ro8Var, usoVar, view2, f)));
                    gfnVar = usoVar;
                }
                i = 1;
                usoVar.b = i;
                int ordinal32 = ro8Var.c.ordinal();
                usoVar.c = ordinal32 != 1 ? ordinal32 != 2 ? 1 : 3 : 2;
                float f2 = view.getResources().getDisplayMetrics().density;
                usoVar.d = f2;
                String uri2 = ro8Var.d.toString();
                gc8 gc8Var2 = e23Var.a;
                view2 = view;
                gc8Var2.p(a39Var.b(uri2, new qo8(gc8Var2, ro8Var, usoVar, view2, f2)));
                gfnVar = usoVar;
            } else {
                view2 = view;
                if (wo8Var instanceof to8) {
                    to8 to8Var = (to8) wo8Var;
                    gc8 gc8Var3 = e23Var.a;
                    l6j l6jVar = new l6j();
                    gc8Var3.p(a39Var.b(to8Var.a.toString(), new m19(gc8Var3, l6jVar, to8Var)));
                    gfnVar = l6jVar;
                } else if (wo8Var instanceof vo8) {
                    gfnVar = new ColorDrawable(((vo8) wo8Var).a);
                } else if (wo8Var instanceof so8) {
                    gfnVar = new q6g(r1.a, ((so8) wo8Var).b);
                } else {
                    if (!(wo8Var instanceof uo8)) {
                        b6e.s();
                        return null;
                    }
                    uo8 uo8Var = (uo8) wo8Var;
                    pcg pcgVar = uo8Var.d;
                    hag hagVar = uo8Var.a;
                    hag hagVar2 = uo8Var.b;
                    la5 la5Var = uo8Var.c;
                    gfnVar = new gfn(pcgVar, hagVar, hagVar2, la5Var.a, la5Var.b);
                }
            }
            Drawable mutate = gfnVar.mutate();
            if (mutate != null) {
                arrayList2.add(mutate);
            }
            view = view2;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (drawable != null) {
            arrayList3.add(drawable);
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        return new LayerDrawable((Drawable[]) arrayList3.toArray(new Drawable[0]));
    }

    @Override // defpackage.a17
    public boolean m() {
        return n7w.R(q6c.x) && n7w.R(q6c.f);
    }

    public void m0(float f, float f2) {
        ((nsh) this.a).s().j(f, f2);
    }

    @Override // defpackage.gvs
    public void n(zvs zvsVar, float f) {
        zvsVar.getClass();
        gvs[] gvsVarArr = (gvs[]) this.a;
        for (int i = 0; i < 2; i++) {
            gvsVarArr[i].n(zvsVar, f);
        }
    }

    @Override // defpackage.a17
    public int o() {
        ues uesVar = hmd.a;
        return hmd.a((BindCardActivity) this.a);
    }

    @Override // defpackage.r9i
    public void p(t9i t9iVar) {
        t9iVar.getClass();
        qdq.A(new ha0(18, this, t9iVar));
    }

    @Override // defpackage.a17
    public void q(wds wdsVar) {
        BindCardActivity bindCardActivity = (BindCardActivity) this.a;
        String str = ((vds) wdsVar).a;
        int i = BindCardActivity.u;
        ((TextView) bindCardActivity.P().d).setText(str);
        ((ImageView) bindCardActivity.P().b).setVisibility(8);
        qdq.g((TextView) bindCardActivity.P().c, null);
        ((View) bindCardActivity.P().a).announceForAccessibility(str + StringUtil.SPACE + "");
        ConstraintLayout constraintLayout = ((mhk) bindCardActivity.D()).e;
        constraintLayout.getClass();
        ddu.L(bindCardActivity, true, constraintLayout);
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        le3 le3Var = (le3) this.a;
        dt1 dt1Var = (dt1) le3Var.a;
        if (!dt1Var.isOpen() && exc == null) {
            exc = new IOException("socket closed before proxy connect response");
        }
        ((m56) ((ps1) le3Var.b).c).g(exc, dt1Var);
    }

    @Override // defpackage.in7
    public int s(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.a).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new hn7();
        }
        return i2;
    }

    @Override // defpackage.in7
    public long skip(long j) {
        InputStream inputStream = (InputStream) this.a;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j - j2;
    }

    @Override // defpackage.vbk
    public void t() {
        BindCardActivity bindCardActivity = (BindCardActivity) this.a;
        o C = bindCardActivity.getSupportFragmentManager().C(R.id.challenge_fragment);
        if (C != null) {
            y supportFragmentManager = bindCardActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.m(C);
            aVar.k(true, true);
        }
    }

    @Override // defpackage.a17
    public mgk u() {
        return null;
    }

    @Override // defpackage.gvs
    public void v(zvs zvsVar) {
        zvsVar.getClass();
        gvs[] gvsVarArr = (gvs[]) this.a;
        for (int i = 0; i < 2; i++) {
            gvsVarArr[i].v(zvsVar);
        }
    }

    @Override // defpackage.a17
    public void w() {
        mhk mhkVar = (mhk) ((BindCardActivity) this.a).D();
        mhkVar.a.setVisibility(8);
        mhkVar.g.setVisibility(8);
        mhkVar.c.setVisibility(8);
    }

    @Override // defpackage.vbk
    public void x(String str) {
        str.getClass();
        k(str, c5b.a);
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new fr1(0, (AssetManager) this.a, this);
    }

    @Override // defpackage.zfv
    public void z() {
        ((SslErrorHandler) this.a).proceed();
    }

    @Override // defpackage.vbk
    public void G() {
    }

    @Override // defpackage.nwu
    public void d() {
    }

    @Override // defpackage.vbk
    public void L(int i) {
    }

    public xzi(String str, fnb fnbVar) {
        str.getClass();
        fnbVar.getClass();
        str.getClass();
        fnbVar.getClass();
        osh oshVar = new osh();
        oshVar.a = str;
        oshVar.b = fnbVar;
        oshVar.c = qld.m();
        this.a = oshVar;
    }

    public xzi(iz7 iz7Var) {
        iz7Var.getClass();
        this.a = iz7Var;
    }

    public xzi(jzi jziVar, hs4 hs4Var) {
        this.a = jziVar;
    }

    public /* synthetic */ xzi(Object obj) {
        this.a = obj;
    }

    public xzi(voi voiVar, ys3 ys3Var) {
        this.a = ys3Var;
    }

    public xzi(at2[] at2VarArr) {
        this.a = (at2[]) Arrays.copyOf(at2VarArr, at2VarArr.length);
        for (int i = 0; i < at2VarArr.length; i++) {
            at2 at2Var = ((at2[]) this.a)[i];
            ndl ndlVar = ndl.d;
            at2Var.e = i;
            at2Var.f = ndlVar;
            at2Var.g = dzr.a;
        }
    }

    public xzi(int i) {
        switch (i) {
            case 9:
                this.a = new CopyOnWriteArrayList();
                break;
            case 12:
                this.a = new eqi(new cc6[16]);
                break;
            case 23:
                this.a = new OkHttpClient();
                break;
            default:
                this.a = new AudioAttributes.Builder();
                break;
        }
    }
}
