package ru.yandex.taxi.logistics.sdk.mission_details;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import defpackage.ajs0;
import defpackage.bbm;
import defpackage.dl51;
import defpackage.ffx;
import defpackage.gce0;
import defpackage.hrb1;
import defpackage.jce0;
import defpackage.ldc;
import defpackage.me0;
import defpackage.nbm;
import defpackage.r1s;
import defpackage.rzo;
import defpackage.scc;
import defpackage.sj90;
import defpackage.sk7;
import defpackage.ssn;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tzg0;
import defpackage.vwk0;
import defpackage.yfa;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.mission_details.ui.confetti.xml.ConfettiView;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class MissionDetailsScreen$getView$1$1$1$1$1$3$1 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v17 */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Drawable drawable;
        List list;
        int intValue = ((Number) obj).intValue();
        sk7 sk7Var = ((b) this.receiver).x;
        Activity b = hrb1.b((Context) sk7Var.b);
        if (b != null) {
            ConfettiView confettiView = new ConfettiView(b);
            confettiView.setOnParticleSystemUpdateListener(new yfa(sk7Var));
            r1s r1sVar = new r1s(b, confettiView);
            sk7Var.w = r1sVar;
            ((WindowManager) r1sVar.c).addView(confettiView, (WindowManager.LayoutParams) r1sVar.w);
            me0 me0Var = (me0) sk7Var.c;
            me0Var.getClass();
            List g = scc.g(new ajs0(0.0f, 53, 6), new ajs0(0.0f, 24, 6));
            Context context = me0Var.a;
            Drawable drawable2 = context.getDrawable(tzg0.ic_coupon);
            ?? r4 = EmptyList.a;
            if (drawable2 == null || (drawable = context.getDrawable(tzg0.ic_percent)) == null) {
                list = g;
            } else {
                list = g;
                List<Pair> g2 = scc.g(new Pair(new ldc(dl51.y), new ldc(dl51.w)), new Pair(new ldc(dl51.L), new ldc(dl51.M)), new Pair(new ldc(dl51.J), new ldc(dl51.K)), new Pair(new ldc(dl51.E), new ldc(dl51.F)), new Pair(new ldc(rzo.f(4294947030L)), new ldc(rzo.f(4294901882L))), new Pair(new ldc(dl51.G), new ldc(dl51.H)), new Pair(new ldc(dl51.z), new ldc(dl51.A)), new Pair(new ldc(dl51.C), new ldc(dl51.D)));
                ArrayList arrayList = new ArrayList();
                for (Pair pair : g2) {
                    int X = rzo.X(((ldc) pair.c()).a);
                    BlendMode blendMode = BlendMode.SRC_IN;
                    drawable2.setColorFilter(new BlendModeColorFilter(X, blendMode));
                    drawable.setColorFilter(new BlendModeColorFilter(rzo.X(((ldc) pair.f()).a), blendMode));
                    Bitmap d0 = ffx.d0(drawable2, 0, 0, 7);
                    Bitmap d02 = ffx.d0(drawable, 0, 0, 7);
                    int max = Math.max(d0.getWidth(), d02.getWidth());
                    int max2 = Math.max(d0.getHeight(), d02.getHeight());
                    Bitmap.Config config = d0.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(max, max2, config);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawBitmap(d0, 0.0f, 0.0f, (Paint) null);
                    canvas.drawBitmap(d02, 0.0f, 0.0f, (Paint) null);
                    arrayList.add(new bbm(new BitmapDrawable(context.getResources(), createBitmap)));
                }
                r4 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r4.add(new nbm((bbm) it.next()));
                }
            }
            List list2 = r4;
            ssn ssnVar = new ssn();
            ssnVar.a = 2000L;
            ssnVar.b = 0.01f;
            confettiView.start(new sj90(list, list2, new gce0(new jce0(0.0d, 0.0d), new jce0(1.0d, 0.0d)), intValue, new vwk0(5), ssnVar));
        }
        return zy11.a;
    }
}
