package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.share.ShareException;

/* loaded from: classes6.dex */
public final class owp {
    public final Context a;
    public final rjp b;
    public final z66 c;

    public owp(Context context, rjp rjpVar) {
        this.a = context;
        this.b = rjpVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(z66.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.c = (z66) qdcVar.C(I);
    }

    public static File d(Bitmap bitmap, zwp zwpVar, File file) {
        int n;
        Bitmap createBitmap = Bitmap.createBitmap(ScreenMirroringConfig.Video.DEFAULT_HEIGHT, ScreenMirroringConfig.Video.DEFAULT_WIDTH, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        Integer num = zwpVar.b.c;
        if (num != null) {
            n = num.intValue();
        } else {
            jyr jyrVar = sht.a;
            bitmap.getClass();
            n = kg5.n(bitmap);
        }
        float[] fArr = new float[3];
        aa5.h(n, fArr);
        float f = fArr[1];
        if (f > 0.3f) {
            f = 0.3f;
        }
        fArr[1] = f;
        fArr[2] = 0.5f;
        canvas.drawColor(aa5.a(fArr));
        File file2 = new File(file, "average_bg.png");
        p6g.G(createBitmap, file2);
        createBitmap.recycle();
        return file2;
    }

    public static String l(String str, TextPaint textPaint, int i) {
        List<String> split$default;
        float f = i;
        if (textPaint.measureText(str) <= f) {
            return str;
        }
        split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtil.SPACE}, false, 0, 6, null);
        String str2 = "";
        for (String str3 : split$default) {
            if (str2.length() > 0) {
                str3 = ouj.o(str2, StringUtil.SPACE, str3);
            }
            if (textPaint.measureText(str3 + "…") > f) {
                break;
            }
            str2 = str3;
        }
        return ouj.n(str2, "…");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zwp zwpVar, File file, cg6 cg6Var) {
        ewp ewpVar;
        Object obj;
        Object obj2;
        int i;
        File file2;
        if (cg6Var instanceof ewp) {
            ewpVar = (ewp) cg6Var;
            int i2 = ewpVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ewpVar.o = i2 - Integer.MIN_VALUE;
                obj = ewpVar.m;
                obj2 = nm6.a;
                i = ewpVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ewpVar.j = zwpVar;
                    ewpVar.k = file;
                    ewpVar.o = 1;
                    obj = gld.Q(new lco(this, zwpVar, continuation, 8), ewpVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        file2 = ewpVar.l;
                        qgg.h0(obj);
                        return new pwp(new awp(file2), new awp((File) obj));
                    }
                    file = ewpVar.k;
                    zwpVar = ewpVar.j;
                    qgg.h0(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                File d = d(bitmap, zwpVar, file);
                ewpVar.j = null;
                ewpVar.k = null;
                ewpVar.l = d;
                ewpVar.o = 2;
                obj = c(bitmap, zwpVar, file, ewpVar);
                if (obj != obj2) {
                    file2 = d;
                    return new pwp(new awp(file2), new awp((File) obj));
                }
                return obj2;
            }
        }
        ewpVar = new ewp(this, cg6Var);
        obj = ewpVar.m;
        obj2 = nm6.a;
        i = ewpVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj;
        File d2 = d(bitmap2, zwpVar, file);
        ewpVar.j = null;
        ewpVar.k = null;
        ewpVar.l = d2;
        ewpVar.o = 2;
        obj = c(bitmap2, zwpVar, file, ewpVar);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zwp zwpVar, Bitmap bitmap, cg6 cg6Var) {
        fwp fwpVar;
        int i;
        View inflate;
        Object a;
        rj6 rj6Var;
        int n;
        int i2;
        if (cg6Var instanceof fwp) {
            fwpVar = (fwp) cg6Var;
            int i3 = fwpVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fwpVar.o = i3 - Integer.MIN_VALUE;
                Object obj = fwpVar.m;
                nm6 nm6Var = nm6.a;
                i = fwpVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    inflate = LayoutInflater.from(this.a).inflate(R.layout.share_album_sticker, (ViewGroup) null);
                    jxp jxpVar = zwpVar.a;
                    dxp dxpVar = jxpVar instanceof dxp ? (dxp) jxpVar : null;
                    if (dxpVar == null) {
                        ugb ugbVar = ugb.a;
                        throw new ShareException("Invalid share item");
                    }
                    String str = dxpVar.a;
                    fwpVar.j = zwpVar;
                    fwpVar.k = bitmap;
                    fwpVar.l = inflate;
                    fwpVar.o = 1;
                    a = ((yr) this.b.a).a(str, fwpVar);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    View view = fwpVar.l;
                    bitmap = fwpVar.k;
                    zwp zwpVar2 = fwpVar.j;
                    qgg.h0(obj);
                    inflate = view;
                    zwpVar = zwpVar2;
                    a = obj;
                }
                rj6Var = (rj6) a;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        ugb ugbVar2 = ugb.a;
                        throw new ShareException("Can't load album");
                    }
                    b6e.s();
                    return null;
                }
                oq oqVar = (oq) ((qj6) rj6Var).a;
                Integer num = zwpVar.b.c;
                if (num != null) {
                    n = num.intValue();
                } else {
                    jyr jyrVar = sht.a;
                    bitmap.getClass();
                    n = kg5.n(bitmap);
                }
                float[] fArr = new float[3];
                aa5.h(n, fArr);
                float f = fArr[1];
                if (f > 0.3f) {
                    f = 0.3f;
                }
                fArr[1] = f;
                fArr[2] = 0.5f;
                int a2 = aa5.a(fArr);
                inflate.findViewById(R.id.background).setBackgroundColor(a2);
                ((ImageView) inflate.findViewById(R.id.cover)).setImageBitmap(bitmap);
                ((TextView) inflate.findViewById(R.id.album_title)).setText(zwpVar.c);
                TextView textView = (TextView) inflate.findViewById(R.id.album_subtitle);
                String str2 = zwpVar.d;
                if (StringsKt.U(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    textView.setText(str2);
                } else {
                    textView.getClass();
                    textView.setVisibility(8);
                }
                TextView textView2 = (TextView) inflate.findViewById(R.id.album_year);
                String str3 = oqVar.i;
                if (str3 != null) {
                    if (StringsKt.U(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        textView2.setText(str3);
                        TextView textView3 = (TextView) inflate.findViewById(R.id.album_type);
                        switch (dwp.a[oqVar.d().ordinal()]) {
                            case 1:
                                i2 = R.string.album_type_single;
                                break;
                            case 2:
                                i2 = R.string.compilation;
                                break;
                            case 3:
                                i2 = R.string.podcast;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                i2 = R.string.album;
                                break;
                            default:
                                b6e.s();
                                return null;
                        }
                        textView3.setText(i2);
                        if (oqVar.d() == Album$AlbumType.COMPILATION) {
                            textView.getClass();
                            textView.setVisibility(8);
                        }
                        if (oqVar.d() != Album$AlbumType.SINGLE) {
                            View findViewById = inflate.findViewById(R.id.album_tracks);
                            findViewById.getClass();
                            findViewById.setVisibility(8);
                            return inflate;
                        }
                        ((ImageView) inflate.findViewById(R.id.cover1)).setImageBitmap(bitmap);
                        inflate.findViewById(R.id.background1).setBackgroundColor(a2);
                        ((ImageView) inflate.findViewById(R.id.cover2)).setImageBitmap(bitmap);
                        inflate.findViewById(R.id.background2).setBackgroundColor(a2);
                        return inflate;
                    }
                }
                textView2.getClass();
                textView2.setVisibility(8);
                TextView textView32 = (TextView) inflate.findViewById(R.id.album_type);
                switch (dwp.a[oqVar.d().ordinal()]) {
                }
                textView32.setText(i2);
                if (oqVar.d() == Album$AlbumType.COMPILATION) {
                }
                if (oqVar.d() != Album$AlbumType.SINGLE) {
                }
            }
        }
        fwpVar = new fwp(this, cg6Var);
        Object obj2 = fwpVar.m;
        nm6 nm6Var2 = nm6.a;
        i = fwpVar.o;
        if (i != 0) {
        }
        rj6Var = (rj6) a;
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Bitmap bitmap, zwp zwpVar, File file, cg6 cg6Var) {
        gwp gwpVar;
        int i;
        int i2;
        int i3;
        if (cg6Var instanceof gwp) {
            gwpVar = (gwp) cg6Var;
            int i4 = gwpVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gwpVar.o = i4 - Integer.MIN_VALUE;
                Object obj = gwpVar.m;
                Object obj2 = nm6.a;
                i = gwpVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    gwpVar.j = file;
                    gwpVar.k = 880;
                    gwpVar.l = 1320;
                    gwpVar.o = 1;
                    Object b = b(zwpVar, bitmap, gwpVar);
                    if (b == obj2) {
                        return obj2;
                    }
                    i2 = 880;
                    obj = b;
                    i3 = 1320;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = gwpVar.l;
                    i2 = gwpVar.k;
                    file = gwpVar.j;
                    qgg.h0(obj);
                }
                View view = (View) obj;
                view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                view.draw(new Canvas(createBitmap));
                File file2 = new File(file, "album_sticker.png");
                p6g.G(createBitmap, file2);
                createBitmap.recycle();
                return file2;
            }
        }
        gwpVar = new gwp(this, cg6Var);
        Object obj3 = gwpVar.m;
        Object obj22 = nm6.a;
        i = gwpVar.o;
        if (i != 0) {
        }
        View view2 = (View) obj3;
        view2.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        Bitmap createBitmap2 = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap2.getClass();
        view2.draw(new Canvas(createBitmap2));
        File file22 = new File(file, "album_sticker.png");
        p6g.G(createBitmap2, file22);
        createBitmap2.recycle();
        return file22;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|(1:(1:9)(2:24|25))(2:26|(1:28)(1:29))|10|11|(1:13)(1:23)|14|15|16|17|18))|30|6|(0)(0)|10|11|(0)(0)|14|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        defpackage.ssg.a(5, null, "blur()", r0);
        r12.g(r11, r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zwp zwpVar, File file, Continuation continuation) {
        hwp hwpVar;
        int i;
        File file2;
        Object obj;
        zwp zwpVar2;
        if (continuation instanceof hwp) {
            hwpVar = (hwp) continuation;
            int i2 = hwpVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hwpVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = hwpVar.l;
                nm6 nm6Var = nm6.a;
                i = hwpVar.n;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    hwpVar.j = zwpVar;
                    file2 = file;
                    hwpVar.k = file2;
                    hwpVar.n = 1;
                    Object Q = gld.Q(new lco(this, zwpVar, continuation2, 8), hwpVar);
                    if (Q == nm6Var) {
                        return nm6Var;
                    }
                    obj = Q;
                    zwpVar2 = zwpVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    File file3 = hwpVar.k;
                    zwpVar2 = hwpVar.j;
                    qgg.h0(obj2);
                    obj = obj2;
                    file2 = file3;
                }
                Bitmap bitmap = (Bitmap) obj;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(ScreenMirroringConfig.Video.DEFAULT_HEIGHT, ScreenMirroringConfig.Video.DEFAULT_WIDTH, config);
                createBitmap.getClass();
                Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth() / 4, bitmap.getHeight() / 4, config);
                createBitmap2.getClass();
                Canvas canvas = new Canvas(createBitmap2);
                float f = 1.0f / 4;
                canvas.scale(f, f);
                Paint paint = new Paint();
                paint.setFlags(2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                l48 l48Var = l48.d;
                float f2 = 25;
                createBitmap2 = (Build.VERSION.SDK_INT < 31 ? c83.a : l48Var).g(createBitmap2, f2);
                Canvas canvas2 = new Canvas(createBitmap);
                Paint paint2 = new Paint();
                float f3 = ScreenMirroringConfig.Video.DEFAULT_HEIGHT;
                float f4 = ScreenMirroringConfig.Video.DEFAULT_WIDTH;
                float max = Math.max(f3 / createBitmap2.getWidth(), f4 / createBitmap2.getHeight());
                Matrix matrix = new Matrix();
                matrix.postScale(max, max, 0.5f, 0.5f);
                float f5 = 2;
                matrix.postTranslate((f3 - (createBitmap2.getWidth() * max)) / f5, (f4 - (createBitmap2.getHeight() * max)) / f5);
                canvas2.drawBitmap(createBitmap2, matrix, paint2);
                createBitmap2.recycle();
                paint2.setColor(1275068416);
                canvas2.drawRect(0.0f, 0.0f, f3, f4, paint2);
                File file4 = new File(file2, "background.png");
                p6g.G(createBitmap, file4);
                createBitmap.recycle();
                Bitmap createBitmap3 = Bitmap.createBitmap(ScreenMirroringConfig.Video.DEFAULT_WIDTH, 3200, Bitmap.Config.ARGB_8888);
                createBitmap3.getClass();
                Canvas canvas3 = new Canvas(createBitmap3);
                Paint paint3 = new Paint();
                TextPaint textPaint = new TextPaint(1);
                textPaint.setAntiAlias(true);
                textPaint.setColor(-1);
                textPaint.setTextAlign(Paint.Align.CENTER);
                float f6 = 640;
                textPaint.setTextSize(0.25f * f6);
                Context context = this.a;
                textPaint.setTypeface(e3o.a(context, R.font.ya_logotype));
                String string = context.getString(R.string.service_yandex_music);
                string.getClass();
                float f7 = f4 / 2.0f;
                canvas3.drawText(string, f7, (f6 / 2.0f) - (45 / 2.0f), textPaint);
                float f8 = 3200;
                float min = Math.min(f4 / bitmap.getWidth(), f8 / bitmap.getHeight());
                float min2 = Math.min((f4 - (bitmap.getWidth() * min)) / f5, (f8 - (bitmap.getHeight() * min)) / f5);
                Matrix matrix2 = new Matrix();
                matrix2.postScale(min, min, 0.5f, 0.5f);
                matrix2.postTranslate(min2, f6 + min2);
                canvas3.drawBitmap(bitmap, matrix2, paint3);
                canvas3.drawRect(0.0f, 2560, f4, f8, textPaint);
                textPaint.setTextSize(0.04f * f8);
                textPaint.setTypeface(Typeface.create(e3o.a(context, R.font.ya_medium), 0));
                textPaint.setColor(-436207616);
                int i3 = (int) (f4 * 0.9f);
                float f9 = 2880;
                canvas3.drawText(l(zwpVar2.c, textPaint, i3), f7, f9 - textPaint.getFontMetrics().bottom, textPaint);
                textPaint.setTypeface(Typeface.create(e3o.a(context, R.font.ya_medium), 0));
                textPaint.setColor(Integer.MIN_VALUE);
                canvas3.drawText(l(zwpVar2.d, textPaint, i3), f7, f9 - textPaint.getFontMetrics().top, textPaint);
                File file5 = new File(file2, "cover.png");
                p6g.G(createBitmap3, file5);
                createBitmap3.recycle();
                return new pwp(new awp(file4), new awp(file5));
            }
        }
        hwpVar = new hwp(this, continuation);
        Object obj22 = hwpVar.l;
        nm6 nm6Var2 = nm6.a;
        i = hwpVar.n;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj;
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap4 = Bitmap.createBitmap(ScreenMirroringConfig.Video.DEFAULT_HEIGHT, ScreenMirroringConfig.Video.DEFAULT_WIDTH, config2);
        createBitmap4.getClass();
        Bitmap createBitmap22 = Bitmap.createBitmap(bitmap2.getWidth() / 4, bitmap2.getHeight() / 4, config2);
        createBitmap22.getClass();
        Canvas canvas4 = new Canvas(createBitmap22);
        float f10 = 1.0f / 4;
        canvas4.scale(f10, f10);
        Paint paint4 = new Paint();
        paint4.setFlags(2);
        canvas4.drawBitmap(bitmap2, 0.0f, 0.0f, paint4);
        l48 l48Var2 = l48.d;
        float f22 = 25;
        createBitmap22 = (Build.VERSION.SDK_INT < 31 ? c83.a : l48Var2).g(createBitmap22, f22);
        Canvas canvas22 = new Canvas(createBitmap4);
        Paint paint22 = new Paint();
        float f32 = ScreenMirroringConfig.Video.DEFAULT_HEIGHT;
        float f42 = ScreenMirroringConfig.Video.DEFAULT_WIDTH;
        float max2 = Math.max(f32 / createBitmap22.getWidth(), f42 / createBitmap22.getHeight());
        Matrix matrix3 = new Matrix();
        matrix3.postScale(max2, max2, 0.5f, 0.5f);
        float f52 = 2;
        matrix3.postTranslate((f32 - (createBitmap22.getWidth() * max2)) / f52, (f42 - (createBitmap22.getHeight() * max2)) / f52);
        canvas22.drawBitmap(createBitmap22, matrix3, paint22);
        createBitmap22.recycle();
        paint22.setColor(1275068416);
        canvas22.drawRect(0.0f, 0.0f, f32, f42, paint22);
        File file42 = new File(file2, "background.png");
        p6g.G(createBitmap4, file42);
        createBitmap4.recycle();
        Bitmap createBitmap32 = Bitmap.createBitmap(ScreenMirroringConfig.Video.DEFAULT_WIDTH, 3200, Bitmap.Config.ARGB_8888);
        createBitmap32.getClass();
        Canvas canvas32 = new Canvas(createBitmap32);
        Paint paint32 = new Paint();
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(-1);
        textPaint2.setTextAlign(Paint.Align.CENTER);
        float f62 = 640;
        textPaint2.setTextSize(0.25f * f62);
        Context context2 = this.a;
        textPaint2.setTypeface(e3o.a(context2, R.font.ya_logotype));
        String string2 = context2.getString(R.string.service_yandex_music);
        string2.getClass();
        float f72 = f42 / 2.0f;
        canvas32.drawText(string2, f72, (f62 / 2.0f) - (45 / 2.0f), textPaint2);
        float f82 = 3200;
        float min3 = Math.min(f42 / bitmap2.getWidth(), f82 / bitmap2.getHeight());
        float min22 = Math.min((f42 - (bitmap2.getWidth() * min3)) / f52, (f82 - (bitmap2.getHeight() * min3)) / f52);
        Matrix matrix22 = new Matrix();
        matrix22.postScale(min3, min3, 0.5f, 0.5f);
        matrix22.postTranslate(min22, f62 + min22);
        canvas32.drawBitmap(bitmap2, matrix22, paint32);
        canvas32.drawRect(0.0f, 2560, f42, f82, textPaint2);
        textPaint2.setTextSize(0.04f * f82);
        textPaint2.setTypeface(Typeface.create(e3o.a(context2, R.font.ya_medium), 0));
        textPaint2.setColor(-436207616);
        int i32 = (int) (f42 * 0.9f);
        float f92 = 2880;
        canvas32.drawText(l(zwpVar2.c, textPaint2, i32), f72, f92 - textPaint2.getFontMetrics().bottom, textPaint2);
        textPaint2.setTypeface(Typeface.create(e3o.a(context2, R.font.ya_medium), 0));
        textPaint2.setColor(Integer.MIN_VALUE);
        canvas32.drawText(l(zwpVar2.d, textPaint2, i32), f72, f92 - textPaint2.getFontMetrics().top, textPaint2);
        File file52 = new File(file2, "cover.png");
        p6g.G(createBitmap32, file52);
        createBitmap32.recycle();
        return new pwp(new awp(file42), new awp(file52));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(zwp zwpVar, File file, cg6 cg6Var) {
        iwp iwpVar;
        Object obj;
        Object obj2;
        int i;
        File file2;
        if (cg6Var instanceof iwp) {
            iwpVar = (iwp) cg6Var;
            int i2 = iwpVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iwpVar.o = i2 - Integer.MIN_VALUE;
                obj = iwpVar.m;
                obj2 = nm6.a;
                i = iwpVar.o;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    iwpVar.j = zwpVar;
                    iwpVar.k = file;
                    iwpVar.o = 1;
                    obj = gld.Q(new lco(this, zwpVar, continuation, 8), iwpVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        file2 = iwpVar.l;
                        qgg.h0(obj);
                        return new pwp(new awp(file2), new awp((File) obj));
                    }
                    file = iwpVar.k;
                    zwpVar = iwpVar.j;
                    qgg.h0(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                File d = d(bitmap, zwpVar, file);
                iwpVar.j = null;
                iwpVar.k = null;
                iwpVar.l = d;
                iwpVar.o = 2;
                obj = h(bitmap, zwpVar, file, iwpVar);
                if (obj != obj2) {
                    file2 = d;
                    return new pwp(new awp(file2), new awp((File) obj));
                }
                return obj2;
            }
        }
        iwpVar = new iwp(this, cg6Var);
        obj = iwpVar.m;
        obj2 = nm6.a;
        i = iwpVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj;
        File d2 = d(bitmap2, zwpVar, file);
        iwpVar.j = null;
        iwpVar.k = null;
        iwpVar.l = d2;
        iwpVar.o = 2;
        obj = h(bitmap2, zwpVar, file, iwpVar);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(zwp zwpVar, Bitmap bitmap, cg6 cg6Var) {
        jwp jwpVar;
        int i;
        LayoutInflater from;
        View inflate;
        Object i2;
        List list;
        int n;
        if (cg6Var instanceof jwp) {
            jwpVar = (jwp) cg6Var;
            int i3 = jwpVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jwpVar.p = i3 - Integer.MIN_VALUE;
                Object obj = jwpVar.n;
                Object obj2 = nm6.a;
                i = jwpVar.p;
                Context context = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    from = LayoutInflater.from(context);
                    inflate = from.inflate(R.layout.share_playlist_sticker, (ViewGroup) null);
                    jwpVar.j = zwpVar;
                    jwpVar.k = bitmap;
                    jwpVar.l = from;
                    jwpVar.m = inflate;
                    jwpVar.p = 1;
                    i2 = i(zwpVar, jwpVar);
                    if (i2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    View view = jwpVar.m;
                    LayoutInflater layoutInflater = jwpVar.l;
                    Bitmap bitmap2 = jwpVar.k;
                    zwp zwpVar2 = jwpVar.j;
                    qgg.h0(obj);
                    inflate = view;
                    zwpVar = zwpVar2;
                    i2 = obj;
                    from = layoutInflater;
                    bitmap = bitmap2;
                }
                list = (List) i2;
                if (list != null) {
                    ugb ugbVar = ugb.a;
                    throw new ShareException("Invalid share item");
                }
                Integer num = zwpVar.b.c;
                if (num != null) {
                    n = num.intValue();
                } else {
                    jyr jyrVar = sht.a;
                    bitmap.getClass();
                    n = kg5.n(bitmap);
                }
                float[] fArr = new float[3];
                aa5.h(n, fArr);
                float f = fArr[1];
                if (f > 0.3f) {
                    f = 0.3f;
                }
                fArr[1] = f;
                fArr[2] = 0.5f;
                int a = aa5.a(fArr);
                inflate.setBackgroundColor(a);
                ((ImageView) inflate.findViewById(R.id.cover)).setImageBitmap(bitmap);
                ((TextView) inflate.findViewById(R.id.playlist_title)).setText(zwpVar.c);
                int size = list.size() - 8;
                if (size < 0) {
                    size = 0;
                }
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.track_list);
                for (int i4 = 0; i4 < 8; i4++) {
                    View inflate2 = from.inflate(R.layout.share_playlist_sticker_track_item, (ViewGroup) linearLayout, false);
                    TextView textView = (TextView) inflate2.findViewById(R.id.track_num);
                    TextView textView2 = (TextView) inflate2.findViewById(R.id.track_title);
                    TextView textView3 = (TextView) inflate2.findViewById(R.id.track_subtitle);
                    if (i4 < list.size()) {
                        textView.setText(String.valueOf(i4 + 1));
                        textView2.setText(((d1t) list.get(i4)).a);
                        textView3.setText(((d1t) list.get(i4)).b);
                    }
                    linearLayout.addView(inflate2);
                }
                View inflate3 = from.inflate(R.layout.share_playlist_sticker_track_more, (ViewGroup) linearLayout, false);
                TextView textView4 = (TextView) inflate3.findViewById(R.id.text);
                textView4.setTextColor(a);
                textView4.setText(size > 0 ? context.getResources().getQuantityString(R.plurals.share_playlist_more, size, new Integer(size)) : context.getString(R.string.share_playlist_empty_more));
                linearLayout.addView(inflate3);
                return inflate;
            }
        }
        jwpVar = new jwp(this, cg6Var);
        Object obj3 = jwpVar.n;
        Object obj22 = nm6.a;
        i = jwpVar.p;
        Context context2 = this.a;
        if (i != 0) {
        }
        list = (List) i2;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Bitmap bitmap, zwp zwpVar, File file, cg6 cg6Var) {
        kwp kwpVar;
        int i;
        int i2;
        int i3;
        if (cg6Var instanceof kwp) {
            kwpVar = (kwp) cg6Var;
            int i4 = kwpVar.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kwpVar.o = i4 - Integer.MIN_VALUE;
                Object obj = kwpVar.m;
                Object obj2 = nm6.a;
                i = kwpVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    kwpVar.j = file;
                    kwpVar.k = 880;
                    kwpVar.l = 1400;
                    kwpVar.o = 1;
                    Object g = g(zwpVar, bitmap, kwpVar);
                    if (g == obj2) {
                        return obj2;
                    }
                    i2 = 880;
                    obj = g;
                    i3 = 1400;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = kwpVar.l;
                    i2 = kwpVar.k;
                    file = kwpVar.j;
                    qgg.h0(obj);
                }
                View view = (View) obj;
                view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                view.draw(new Canvas(createBitmap));
                File file2 = new File(file, "playlist_sticker.png");
                p6g.G(createBitmap, file2);
                createBitmap.recycle();
                return file2;
            }
        }
        kwpVar = new kwp(this, cg6Var);
        Object obj3 = kwpVar.m;
        Object obj22 = nm6.a;
        i = kwpVar.o;
        if (i != 0) {
        }
        View view2 = (View) obj3;
        view2.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        Bitmap createBitmap2 = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap2.getClass();
        view2.draw(new Canvas(createBitmap2));
        File file22 = new File(file, "playlist_sticker.png");
        p6g.G(createBitmap2, file22);
        createBitmap2.recycle();
        return file22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(zwp zwpVar, cg6 cg6Var) {
        lwp lwpVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof lwp) {
            lwpVar = (lwp) cg6Var;
            int i2 = lwpVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lwpVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lwpVar.j;
                Object obj2 = nm6.a;
                i = lwpVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    jxp jxpVar = zwpVar.a;
                    if (!(jxpVar instanceof gxp)) {
                        return null;
                    }
                    gxp gxpVar = (gxp) jxpVar;
                    String str = gxpVar.g;
                    if (str != null) {
                        lwpVar.l = 1;
                        obj = j(str, lwpVar);
                    } else {
                        String str2 = gxpVar.c;
                        String str3 = gxpVar.d;
                        lwpVar.l = 2;
                        obj = k(str2, str3, lwpVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                }
                if (!(rj6Var instanceof qj6)) {
                    return (List) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    ugb ugbVar = ugb.a;
                    throw new ShareException("Can't get playlist info");
                }
                b6e.s();
                return null;
            }
        }
        lwpVar = new lwp(this, cg6Var);
        Object obj3 = lwpVar.j;
        Object obj22 = nm6.a;
        i = lwpVar.l;
        if (i != 0) {
        }
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v10, types: [c5b] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, cg6 cg6Var) {
        mwp mwpVar;
        int i;
        rj6 rj6Var;
        Object obj;
        if (cg6Var instanceof mwp) {
            mwpVar = (mwp) cg6Var;
            int i2 = mwpVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mwpVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = mwpVar.j;
                nm6 nm6Var = nm6.a;
                i = mwpVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    mwpVar.l = 1;
                    obj2 = ((cut) this.b.b).g(str, true, mwpVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                rj6Var = (rj6) obj2;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof oj6) {
                        return new qj6(c5b.a);
                    }
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                List list = ((rrl) ((qj6) rj6Var).a).c;
                if (list != null) {
                    List<mqs> list2 = list;
                    obj = new ArrayList(v75.o(list2, 10));
                    for (mqs mqsVar : list2) {
                        obj.add(new d1t(mqsVar.c, fxf.W(mqsVar)));
                    }
                } else {
                    obj = c5b.a;
                }
                return new qj6(obj);
            }
        }
        mwpVar = new mwp(this, cg6Var);
        Object obj22 = mwpVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mwpVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj22;
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v2, types: [c5b] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, cg6 cg6Var) {
        nwp nwpVar;
        int i;
        rj6 rj6Var;
        Object obj;
        if (cg6Var instanceof nwp) {
            nwpVar = (nwp) cg6Var;
            int i2 = nwpVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nwpVar.l = i2 - Integer.MIN_VALUE;
                nwp nwpVar2 = nwpVar;
                Object obj2 = nwpVar2.j;
                nm6 nm6Var = nm6.a;
                i = nwpVar2.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    nwpVar2.l = 1;
                    obj2 = cut.h((cut) this.b.b, str, str2, true, false, nwpVar2, 120);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                rj6Var = (rj6) obj2;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof oj6) {
                        return new qj6(c5b.a);
                    }
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                List list = ((rrl) ((qj6) rj6Var).a).c;
                if (list != null) {
                    List<mqs> list2 = list;
                    obj = new ArrayList(v75.o(list2, 10));
                    for (mqs mqsVar : list2) {
                        obj.add(new d1t(mqsVar.c, fxf.W(mqsVar)));
                    }
                } else {
                    obj = c5b.a;
                }
                return new qj6(obj);
            }
        }
        nwpVar = new nwp(this, cg6Var);
        nwp nwpVar22 = nwpVar;
        Object obj22 = nwpVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = nwpVar22.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj22;
        if (rj6Var instanceof qj6) {
        }
    }
}
