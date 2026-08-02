package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.yandex.music.shared.media.session.session.Media3SessionService;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class cnv {
    public final Context a;
    public final zfh b;
    public final jyr c;
    public final xdr d;
    public final bca e;
    public ykh f;
    public final Handler g;

    public cnv(Context context, zfh zfhVar, jyr jyrVar) {
        this.a = context;
        this.b = zfhVar;
        this.c = jyrVar;
        xdr a = ydr.a(null);
        this.d = a;
        this.e = new bca(a, 18);
        this.g = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
    
        if (r3 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0204, code lost:
    
        if (r5 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0103, code lost:
    
        if (r7.equalsIgnoreCase("BY") != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(cnv cnvVar, kkh kkhVar) {
        agh aghVar;
        llv llvVar;
        Object obj;
        llv llvVar2;
        hoh hohVar;
        String obj2;
        jzb jzbVar;
        String s;
        String str;
        String obj3;
        boolean z;
        j1g j1gVar;
        boolean z2;
        boolean z3;
        qlv qlvVar;
        Object obj4;
        String string;
        Object obj5;
        if (!kkhVar.c.isConnected() || kkhVar.M0() == null) {
            return;
        }
        zfh zfhVar = cnvVar.b;
        ssg.a(3, "Media3DataDecoder", hrg.q("decodeMedia3Data() from thread(", Thread.currentThread().getName(), ")"), null);
        onh M0 = kkhVar.M0();
        if (M0 != null && (hohVar = M0.d) != null) {
            Bundle bundle = hohVar.I;
            byte[] bArr = hohVar.k;
            if (bArr == null) {
                ssg.a(3, "Media3DataDecoder", "decodeMedia3Data skipped: no artwork", null);
                aghVar = null;
            } else {
                CharSequence charSequence = hohVar.a;
                if (charSequence == null || (obj2 = charSequence.toString()) == null) {
                    dfi.r("MediaMetadata must contain title", "Media3DataDecoder");
                } else {
                    if (bundle == null || (string = bundle.getString("com.yandex.music.media.metadata.explicit_type")) == null) {
                        jzbVar = null;
                    } else {
                        jzb.b.getClass();
                        Iterator it = jzb.g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj5 = null;
                                break;
                            } else {
                                obj5 = it.next();
                                if (((jzb) obj5).a.equals(string)) {
                                    break;
                                }
                            }
                        }
                        jzbVar = (jzb) obj5;
                    }
                    n8e.i0.getClass();
                    m8e.c.await();
                    String str2 = "🄴";
                    if (m8e.b.h()) {
                        if (jzbVar != null) {
                            StringBuilder sb = new StringBuilder();
                            int ordinal = jzbVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    str2 = "⑱";
                                } else {
                                    if (ordinal != 2) {
                                        b6e.s();
                                        return;
                                    }
                                    str2 = "ⓘ";
                                }
                            }
                            s = vz1.s(sb, str2, "  ", obj2);
                            str = s;
                        }
                        str = obj2;
                    } else {
                        if (bundle != null && bundle.getLong("android.media.IS_EXPLICIT", 0L) == 1) {
                            StringBuilder sb2 = new StringBuilder();
                            Bundle bundle2 = hohVar.I;
                            if (!(bundle2 != null ? bundle2.getBoolean("com.yandex.music.media.metadata.is_podcast", false) : false)) {
                                b6d b6dVar = (b6d) ((rrn) zfhVar.a).c.getValue();
                                b6dVar.getClass();
                                String str3 = b6dVar.a;
                                str3.getClass();
                            }
                            str2 = "⑱";
                            s = vz1.s(sb2, str2, "  ", obj2);
                            str = s;
                        }
                        str = obj2;
                    }
                    CharSequence charSequence2 = hohVar.f;
                    if (charSequence2 == null || (obj3 = charSequence2.toString()) == null) {
                        dfi.r("MediaMetadata must contain subtitle", "Media3DataDecoder");
                    } else {
                        int identityHashCode = System.identityHashCode(bArr);
                        Integer num = zfhVar.b;
                        if (num != null && num.intValue() == identityHashCode) {
                            z = false;
                        } else {
                            zfhVar.b = Integer.valueOf(identityHashCode);
                            zfhVar.c = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                            z = true;
                        }
                        boolean g0 = kkhVar.g0();
                        boolean z4 = kkhVar.V0(7) || kkhVar.V0(6);
                        boolean z5 = kkhVar.V0(9) || kkhVar.V0(8);
                        Bundle bundle3 = hohVar.I;
                        boolean z6 = bundle3 != null ? bundle3.getBoolean("com.yandex.music.media.metadata.is_podcast", false) : false;
                        if (bundle != null) {
                            String string2 = bundle.getString("com.yandex.music.media.metadata.like_state");
                            if (string2 != null) {
                                int hashCode = string2.hashCode();
                                if (hashCode != 102974381) {
                                    if (hashCode != 281307103) {
                                        if (hashCode == 1844321735 && string2.equals("neutral")) {
                                            j1gVar = j1g.b;
                                        }
                                    } else if (string2.equals("disliked")) {
                                        j1gVar = j1g.c;
                                    }
                                } else if (string2.equals("liked")) {
                                    j1gVar = j1g.a;
                                }
                            }
                            j1gVar = null;
                        }
                        j1gVar = j1g.b;
                        if (bundle != null) {
                            z2 = true;
                            z3 = bundle.getBoolean("com.yandex.music.media.metadata.like_support", true);
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        zkg zkgVar = new zkg(j1gVar, z3, bundle != null ? bundle.getBoolean("com.yandex.music.media.metadata.dislike_support", z2) : true);
                        if (bundle != null) {
                            String string3 = bundle.getString("com.yandex.music.media.metadata.widget_control_type");
                            if (string3 != null) {
                                Iterator it2 = qlv.f.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj4 = null;
                                        break;
                                    } else {
                                        obj4 = it2.next();
                                        if (Intrinsics.d(((qlv) obj4).name(), string3)) {
                                            break;
                                        }
                                    }
                                }
                                qlvVar = (qlv) obj4;
                            } else {
                                qlvVar = null;
                            }
                        }
                        qlvVar = qlv.a;
                        aghVar = new agh(str, obj2, obj3, z, zfhVar.c, g0, z5, z4, z6, zkgVar, qlvVar, jzbVar, bundle != null ? bundle.getString("com.yandex.music.media.metadata.color_palette") : null);
                    }
                }
            }
            if (aghVar == null) {
                flv flvVar = aghVar.f ? zkv.a : alv.a;
                zkg zkgVar2 = aghVar.j;
                j1g j1gVar2 = zkgVar2.a;
                xkv xkvVar = new xkv(j1gVar2 == j1g.a, zkgVar2.b);
                vkv vkvVar = new vkv(j1gVar2 == j1g.c, zkgVar2.c);
                elv elvVar = new elv(aghVar.g);
                blv blvVar = new blv(aghVar.h);
                dlv dlvVar = dlv.a;
                clv clvVar = clv.a;
                wkv wkvVar = wkv.a;
                int ordinal2 = aghVar.k.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        llvVar2 = new llv(new klv(u75.h(wkvVar, flvVar, wkvVar), 1), new klv(u75.h(wkvVar, flvVar, wkvVar), 1), new klv(u75.h(flvVar, wkvVar, wkvVar), 0));
                    } else if (ordinal2 == 2) {
                        llvVar2 = new llv(new klv(u75.h(xkvVar, flvVar, vkvVar), 1), new klv(u75.h(xkvVar, flvVar, vkvVar), 1), new klv(u75.h(flvVar, xkvVar, vkvVar), 0));
                    } else {
                        if (ordinal2 != 3) {
                            b6e.s();
                            return;
                        }
                        llvVar2 = new llv(new klv(u75.h(clvVar, flvVar, dlvVar), 1), new klv(u75.h(clvVar, flvVar, dlvVar, xkvVar), 1), new klv(u75.h(flvVar, clvVar, dlvVar), 0));
                    }
                    llvVar = llvVar2;
                } else {
                    llvVar = new llv(new klv(u75.h(xkvVar, flvVar, elvVar), 1), new klv(u75.h(blvVar, flvVar, elvVar, xkvVar), 1), new klv(u75.h(flvVar, xkvVar, elvVar), 0));
                }
                xdr xdrVar = cnvVar.d;
                Bitmap bitmap = aghVar.e;
                if (bitmap == null) {
                    Context context = cnvVar.a;
                    int s2 = wct.s();
                    Resources resources = context.getResources();
                    int a = to6.a(qo6.a, context);
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal threadLocal = e3o.a;
                    Drawable drawable = resources.getDrawable(a, theme);
                    Bitmap N = drawable != null ? vq2.N(drawable, s2, s2, 4) : null;
                    bitmap = Bitmap.createBitmap(s2, s2, Bitmap.Config.ARGB_8888);
                    bitmap.getClass();
                    N.getClass();
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float max = Math.max(width, height) / 10;
                    Canvas canvas = new Canvas(bitmap);
                    bitmap.eraseColor(0);
                    Path path = new Path();
                    path.moveTo(0.0f, max);
                    path.lineTo(0.0f, height);
                    path.lineTo(width, height);
                    path.lineTo(width, 0.0f);
                    path.lineTo(max, 0.0f);
                    float f = 2 * max;
                    path.addArc(new RectF(0.0f, 0.0f, f, f), -90.0f, -90.0f);
                    path.lineTo(0.0f, max);
                    path.close();
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setColor(-16777216);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawPath(path, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(N, 0.0f, 0.0f, paint);
                    obj = null;
                    canvas.setBitmap(null);
                } else {
                    obj = null;
                }
                slv slvVar = new slv(bitmap, aghVar.m, aghVar.b, aghVar.c, aghVar.l, llvVar);
                xdrVar.getClass();
                xdrVar.m(obj, slvVar);
                return;
            }
            return;
        }
        dfi.r("MediaItem must contain MediaMetadata", "Media3DataDecoder");
        aghVar = null;
        if (aghVar == null) {
        }
    }

    public static kkh c(lcg lcgVar) {
        try {
            return (kkh) lcgVar.get();
        } catch (ExecutionException e) {
            ssg.a(6, "WidgetMediaControllerHandler", "MediaController connection failed", e);
            return null;
        }
    }

    public final void b() {
        kkh c;
        ykh ykhVar = this.f;
        if (ykhVar != null && !ykhVar.isDone()) {
            ssg.a(3, "WidgetMediaControllerHandler", "bindToSession: connection in progress, skipping", null);
            return;
        }
        if (ykhVar != null && ykhVar.isDone() && (c = c(ykhVar)) != null && c.c.isConnected()) {
            ssg.a(3, "WidgetMediaControllerHandler", "bindToSession: already bound, skipping", null);
            return;
        }
        ssg.a(3, "WidgetMediaControllerHandler", "bindToSession", null);
        ((kbn) this.c.getValue()).d("widget", false);
        Context context = this.a;
        bnp bnpVar = new bnp(context, new ComponentName(context, (Class<?>) Media3SessionService.class));
        Bundle bundle = Bundle.EMPTY;
        Looper C = dvt.C();
        bnv bnvVar = new bnv(this);
        ykh ykhVar2 = new ykh(C);
        dvt.c0(new Handler(C), new hkh(ykhVar2, new kkh(context, bnpVar, bundle, bnvVar, C, ykhVar2, bnpVar.a.y() ? new qne(new gb7(context)) : null), 0));
        this.f = ykhVar2;
        ykhVar2.a(new xlr(22, this, ykhVar2), new dk7(this.g, 2));
    }

    public final void d(Function1 function1) {
        b();
        ykh ykhVar = this.f;
        if (ykhVar == null) {
            return;
        }
        ykhVar.a(new gtm(7, this, ykhVar, function1), new dk7(this.g, 1));
    }
}
