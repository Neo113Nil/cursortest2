package defpackage;

import android.content.res.Resources;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

/* loaded from: classes3.dex */
public final class q8k implements Choreographer.FrameCallback {
    public final d89 a;
    public final Choreographer b = Choreographer.getInstance();
    public final LinkedHashSet c = new LinkedHashSet();
    public boolean d;
    public long e;

    public q8k(d89 d89Var) {
        this.a = d89Var;
    }

    public final void a() {
        if (this.d || this.c.isEmpty() || !this.a.isShown()) {
            return;
        }
        this.d = true;
        this.e = 0L;
        this.b.postFrameCallback(this);
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            this.b.removeFrameCallback(this);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        LinkedHashSet linkedHashSet;
        Resources resources;
        DisplayMetrics displayMetrics;
        Iterator it;
        LinkedHashSet linkedHashSet2;
        float f;
        d89 d89Var;
        if (this.d) {
            LinkedHashSet linkedHashSet3 = this.c;
            if (!linkedHashSet3.isEmpty()) {
                d89 d89Var2 = this.a;
                if (d89Var2.isShown()) {
                    float f2 = 0.0f;
                    float c = this.e == 0 ? 0.0f : yhn.c((j - r5) * 1.0E-9f, 0.0f, 0.05f);
                    this.e = j;
                    Iterator it2 = linkedHashSet3.iterator();
                    boolean z = false;
                    while (it2.hasNext()) {
                        ubh ubhVar = (ubh) it2.next();
                        d89 d89Var3 = ubhVar.b;
                        CharSequence text = d89Var3 != null ? d89Var3.getText() : null;
                        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                        if (spanned == null || spanned.getSpanStart(ubhVar) == -1) {
                            it = it2;
                            linkedHashSet2 = linkedHashSet3;
                            f = f2;
                            d89Var = d89Var2;
                            it.remove();
                        } else {
                            zdg zdgVar = ubhVar.a;
                            rbh rbhVar = zdgVar instanceof rbh ? (rbh) zdgVar : null;
                            if (rbhVar != null && ubhVar.g && rbhVar.e && rbhVar.d) {
                                if (c > f2) {
                                    float f3 = ubhVar.e;
                                    float f4 = ubhVar.f;
                                    Iterator it3 = ubhVar.c.iterator();
                                    while (it3.hasNext()) {
                                        tbh tbhVar = (tbh) it3.next();
                                        float f5 = tbhVar.f * c;
                                        if (f5 == f2) {
                                            linkedHashSet = linkedHashSet3;
                                        } else {
                                            double d = f5;
                                            linkedHashSet = linkedHashSet3;
                                            float cos = (float) Math.cos(d);
                                            float sin = (float) Math.sin(d);
                                            float f6 = tbhVar.d;
                                            float f7 = tbhVar.e;
                                            tbhVar.d = (f6 * cos) - (f7 * sin);
                                            tbhVar.e = (f7 * cos) + (f6 * sin);
                                        }
                                        float f8 = (tbhVar.d * c) + tbhVar.a;
                                        tbhVar.a = f8;
                                        float f9 = (tbhVar.e * c) + tbhVar.b;
                                        tbhVar.b = f9;
                                        float f10 = tbhVar.c;
                                        float f11 = -f10;
                                        if (f8 < f11) {
                                            tbhVar.a = (f10 * 2.0f) + f3 + f8;
                                        }
                                        float f12 = tbhVar.a;
                                        if (f12 > f3 + f10) {
                                            tbhVar.a = f12 - ((f10 * 2.0f) + f3);
                                        }
                                        if (f9 < f11) {
                                            tbhVar.b = (f10 * 2.0f) + f4 + f9;
                                        }
                                        float f13 = tbhVar.b;
                                        if (f13 > f4 + f10) {
                                            tbhVar.b = f13 - ((f10 * 2.0f) + f4);
                                        }
                                        float f14 = (1000.0f * c) + tbhVar.h;
                                        tbhVar.h = f14;
                                        if (f14 >= tbhVar.g) {
                                            d89 d89Var4 = d89Var2;
                                            Random random = new Random(ubhVar.h + tbhVar.hashCode());
                                            float f15 = 1.0f;
                                            tbhVar.c = ((random.nextFloat() * 0.8f) + 0.7f) * Math.max(1.0f, rbhVar.f);
                                            tbhVar.a = random.nextFloat() * f3;
                                            tbhVar.b = random.nextFloat() * f4;
                                            d89 d89Var5 = ubhVar.b;
                                            if (d89Var5 != null && (resources = d89Var5.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                                                f15 = displayMetrics.density;
                                            }
                                            float f16 = 2.0f * f15;
                                            float nextFloat = (random.nextFloat() * ((f15 * 9.0f) - f16)) + f16;
                                            double nextFloat2 = ((float) (random.nextFloat() * 6.283185307179586d)) - 3.1415927f;
                                            tbhVar.d = ((float) Math.cos(nextFloat2)) * nextFloat;
                                            tbhVar.e = ((float) Math.sin(nextFloat2)) * nextFloat;
                                            tbhVar.f = (random.nextFloat() - 0.5f) * 0.5f;
                                            tbhVar.g = (random.nextFloat() * 6000.0f) + 6000.0f;
                                            tbhVar.h = 0.0f;
                                            d89Var2 = d89Var4;
                                            linkedHashSet3 = linkedHashSet;
                                            f2 = 0.0f;
                                            it2 = it2;
                                        } else {
                                            linkedHashSet3 = linkedHashSet;
                                            f2 = 0.0f;
                                        }
                                    }
                                }
                                it = it2;
                                linkedHashSet2 = linkedHashSet3;
                                f = f2;
                                d89Var = d89Var2;
                            } else {
                                it = it2;
                                linkedHashSet2 = linkedHashSet3;
                                f = f2;
                                d89Var = d89Var2;
                                if (!z) {
                                    z = false;
                                }
                            }
                            z = true;
                        }
                        d89Var2 = d89Var;
                        linkedHashSet3 = linkedHashSet2;
                        f2 = f;
                        it2 = it;
                    }
                    d89 d89Var6 = d89Var2;
                    if (linkedHashSet3.isEmpty() || !z) {
                        b();
                        return;
                    } else {
                        d89Var6.postInvalidateOnAnimation();
                        this.b.postFrameCallback(this);
                        return;
                    }
                }
            }
            b();
        }
    }
}
