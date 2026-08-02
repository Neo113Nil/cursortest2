package ru.yandex.taxi.logistics.sdk.mission_details.ui.confetti.xml;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.WindowManager;
import defpackage.ajs0;
import defpackage.b070;
import defpackage.bd90;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.dzd;
import defpackage.fce0;
import defpackage.nbm;
import defpackage.r1s;
import defpackage.sj90;
import defpackage.sk7;
import defpackage.ssn;
import defpackage.t431;
import defpackage.tcc;
import defpackage.tj90;
import defpackage.uj90;
import defpackage.vwk0;
import defpackage.xg90;
import defpackage.ycc;
import defpackage.yfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/yandex/taxi/logistics/sdk/mission_details/ui/confetti/xml/ConfettiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lxg90;", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "display", "(Lxg90;Landroid/graphics/Canvas;)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Lsj90;", "party", "start", "(Lsj90;)V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "", "Luj90;", "systems", "Ljava/util/List;", "Lru/yandex/taxi/logistics/sdk/mission_details/ui/confetti/xml/ConfettiView$a;", "timer", "Lru/yandex/taxi/logistics/sdk/mission_details/ui/confetti/xml/ConfettiView$a;", "Landroid/graphics/RectF;", "drawArea", "Landroid/graphics/RectF;", "Lb070;", "onParticleSystemUpdateListener", "Lb070;", "getOnParticleSystemUpdateListener", "()Lb070;", "setOnParticleSystemUpdateListener", "(Lb070;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "a", "sdk-delivery-screen-mission-details"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfettiView extends View {
    public static final int $stable = 8;
    private RectF drawArea;
    private b070 onParticleSystemUpdateListener;
    private final Paint paint;
    private final List<uj90> systems;
    private a timer;

    public static final class a {
        public long a = -1;
    }

    public ConfettiView(Context context) {
        super(context);
        this.systems = new ArrayList();
        this.timer = new a();
        this.drawArea = new RectF();
        this.paint = new Paint();
    }

    private final void display(xg90 xg90Var, Canvas canvas) {
        this.paint.setColor(xg90Var.e);
        float f = xg90Var.g;
        float f2 = xg90Var.c;
        float f3 = (f * f2) / 2.0f;
        int save = canvas.save();
        canvas.translate(xg90Var.a - f3, xg90Var.b);
        canvas.rotate(xg90Var.f, f3, f2 / 2.0f);
        canvas.scale(f, 1.0f);
        nbm nbmVar = xg90Var.h;
        BitmapDrawable bitmapDrawable = nbmVar.a.a;
        int i = (int) (nbmVar.b * f2);
        int i2 = (int) ((f2 - i) / 2.0f);
        bitmapDrawable.setBounds(0, i2, (int) f2, i + i2);
        bitmapDrawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final b070 getOnParticleSystemUpdateListener() {
        return this.onParticleSystemUpdateListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        List<uj90> list;
        float f;
        float f2;
        long j;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        EmptyList emptyList;
        long j2;
        boolean z;
        double nextDouble;
        super.onDraw(canvas);
        a aVar = this.timer;
        if (aVar.a == -1) {
            aVar.a = System.nanoTime();
        }
        float f7 = (r2 - aVar.a) / 1000000.0f;
        aVar.a = System.nanoTime();
        float f8 = 1000.0f;
        float f9 = f7 / 1000.0f;
        int i2 = 1;
        int size = this.systems.size() - 1;
        while (true) {
            list = this.systems;
            if (-1 >= size) {
                break;
            }
            uj90 uj90Var = list.get(size);
            a aVar2 = this.timer;
            long j3 = uj90Var.b;
            tj90 tj90Var = uj90Var.d;
            boolean z2 = uj90Var.c;
            ArrayList arrayList = uj90Var.e;
            aVar2.getClass();
            long currentTimeMillis = System.currentTimeMillis() - j3;
            sj90 sj90Var = uj90Var.a;
            if (currentTimeMillis >= sj90Var.l) {
                RectF rectF = this.drawArea;
                f = f8;
                if (z2) {
                    tj90Var.e += f9;
                    ssn ssnVar = tj90Var.a;
                    j = 0;
                    long j4 = ssnVar.a;
                    float f10 = j4;
                    float f11 = f10 / f;
                    f4 = 0.0f;
                    float f12 = tj90Var.d;
                    if (f12 == 0.0f && f9 > f11) {
                        tj90Var.e = f11;
                    }
                    float f13 = tj90Var.e;
                    float f14 = ssnVar.b;
                    if (f13 < f14 || (j4 != 0 && f12 >= f10)) {
                        f3 = f9;
                        emptyList = EmptyList.a;
                    } else {
                        d6w d6wVar = new d6w(i2, (int) (f13 / f14), i2);
                        ArrayList arrayList2 = new ArrayList(tcc.n(d6wVar, 10));
                        c6w it = d6wVar.iterator();
                        while (it.c) {
                            it.nextInt();
                            List list2 = sj90Var.f;
                            vwk0 vwk0Var = sj90Var.m;
                            Random random = tj90Var.c;
                            ajs0 ajs0Var = (ajs0) list2.get(random.nextInt(list2.size()));
                            fce0 a2 = tj90Var.a(sj90Var.k, rectF);
                            c6w c6wVar = it;
                            t431 t431Var = new t431(a2.b, a2.c);
                            float f15 = ajs0Var.a * tj90Var.b;
                            float f16 = ajs0Var.b;
                            float nextFloat = (random.nextFloat() * 0.2f * f16) + f16;
                            List list3 = sj90Var.h;
                            nbm nbmVar = (nbm) list3.get(random.nextInt(list3.size()));
                            List list4 = sj90Var.g;
                            int intValue = ((Number) list4.get(random.nextInt(list4.size()))).intValue();
                            float f17 = f9;
                            long j5 = sj90Var.i;
                            boolean z3 = sj90Var.j;
                            float f18 = sj90Var.d;
                            float f19 = sj90Var.c;
                            if (f18 != -1.0f) {
                                f19 = (random.nextFloat() * (f18 - f19)) + f19;
                            }
                            float f20 = f19;
                            int i3 = sj90Var.b;
                            int i4 = sj90Var.a;
                            if (i3 == 0) {
                                j2 = j5;
                                nextDouble = i4;
                                z = z3;
                            } else {
                                j2 = j5;
                                int i5 = i3 / 2;
                                int i6 = i4 - i5;
                                int i7 = (i5 + i4) - i6;
                                z = z3;
                                nextDouble = (random.nextDouble() * i7) + i6;
                            }
                            double radians = Math.toRadians(nextDouble);
                            arrayList2.add(new dzd(t431Var, intValue, f15, nextFloat, nbmVar, j2, z, new t431(((float) Math.cos(radians)) * f20, ((float) Math.sin(radians)) * f20), sj90Var.e, tj90Var.b(vwk0Var) * vwk0Var.e, tj90Var.b(vwk0Var) * vwk0Var.d, tj90Var.b));
                            f9 = f17;
                            it = c6wVar;
                        }
                        f3 = f9;
                        tj90Var.e %= ssnVar.b;
                        emptyList = arrayList2;
                    }
                    tj90Var.d = (f3 * f) + tj90Var.d;
                    arrayList.addAll(emptyList);
                } else {
                    f3 = f9;
                    j = 0;
                    f4 = 0.0f;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    dzd dzdVar = (dzd) it2.next();
                    t431 t431Var2 = dzdVar.q;
                    t431 t431Var3 = dzdVar.h;
                    float f21 = 1.0f / dzdVar.d;
                    t431Var3.a = (t431Var2.a * f21) + t431Var3.a;
                    t431Var3.b = (t431Var2.b * f21) + t431Var3.b;
                    float f22 = dzdVar.c;
                    t431 t431Var4 = dzdVar.a;
                    dzdVar.p = f3 > f4 ? 1.0f / f3 : 60.0f;
                    if (t431Var4.b > rectF.height()) {
                        dzdVar.r = 0;
                        f5 = f3;
                        f6 = f4;
                    } else {
                        t431 t431Var5 = dzdVar.i;
                        float f23 = t431Var5.a + t431Var3.a;
                        float f24 = t431Var5.b + t431Var3.b;
                        float f25 = dzdVar.j;
                        float f26 = f23 * f25;
                        t431Var5.a = f26;
                        float f27 = f24 * f25;
                        t431Var5.b = f27;
                        float f28 = dzdVar.p;
                        float f29 = f3 * f28 * dzdVar.m;
                        t431Var4.a = (f26 * f29) + t431Var4.a;
                        t431Var4.b = (f27 * f29) + t431Var4.b;
                        f5 = f3;
                        long j6 = dzdVar.f - ((long) (f3 * f));
                        dzdVar.f = j6;
                        if (j6 <= j) {
                            dzdVar.r = (!dzdVar.g || (i = dzdVar.r - ((int) ((5.0f * f5) * f28))) < 0) ? 0 : i;
                        }
                        float f30 = (dzdVar.l * f5 * f28) + dzdVar.n;
                        dzdVar.n = f30;
                        if (f30 >= 360.0f) {
                            f6 = f4;
                            dzdVar.n = f6;
                        } else {
                            f6 = f4;
                        }
                        float abs = dzdVar.o - ((Math.abs(dzdVar.k) * f5) * dzdVar.p);
                        dzdVar.o = abs;
                        if (abs < f6) {
                            dzdVar.o = f22;
                        }
                        dzdVar.s = Math.abs((dzdVar.o / f22) - 0.5f) * 2.0f;
                        dzdVar.t = (dzdVar.r << 24) | (dzdVar.b & 16777215);
                        dzdVar.u = rectF.contains(t431Var4.a, t431Var4.b);
                    }
                    f4 = f6;
                    f3 = f5;
                }
                f2 = f3;
                i2 = 1;
                ycc.w(arrayList, new bd90(5), true);
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (((dzd) next).u) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    dzd dzdVar2 = (dzd) it4.next();
                    t431 t431Var6 = dzdVar2.a;
                    float f31 = t431Var6.a;
                    float f32 = t431Var6.b;
                    float f33 = dzdVar2.c;
                    arrayList4.add(new xg90(f31, f32, f33, f33, dzdVar2.t, dzdVar2.n, dzdVar2.s, dzdVar2.e, dzdVar2.r));
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    display((xg90) it5.next(), canvas);
                }
            } else {
                f = f8;
                f2 = f9;
                j = 0;
            }
            long j7 = tj90Var.a.a;
            if ((j7 > j && tj90Var.d >= j7 && arrayList.size() == 0) || (!z2 && arrayList.size() == 0)) {
                this.systems.remove(size);
                b070 b070Var = this.onParticleSystemUpdateListener;
                if (b070Var != null) {
                    this.systems.size();
                    sk7 sk7Var = (sk7) ((yfa) b070Var).a;
                    r1s r1sVar = (r1s) sk7Var.w;
                    if (r1sVar != null) {
                        ((WindowManager) r1sVar.c).removeViewImmediate((ConfettiView) r1sVar.b);
                    }
                    sk7Var.w = null;
                }
            }
            size--;
            f8 = f;
            f9 = f2;
        }
        if (list.size() != 0) {
            invalidate();
        } else {
            this.timer.a = -1L;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.drawArea = new RectF(0.0f, 0.0f, w, h);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        this.timer.a = -1L;
    }

    public final void setOnParticleSystemUpdateListener(b070 b070Var) {
        this.onParticleSystemUpdateListener = b070Var;
    }

    public final void start(sj90 party) {
        this.systems.add(new uj90(party, Resources.getSystem().getDisplayMetrics().density));
        invalidate();
    }
}
