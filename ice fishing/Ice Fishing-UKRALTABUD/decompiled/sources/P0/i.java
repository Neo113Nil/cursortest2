package P0;

import K0.AbstractC0046w;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import h.C0162f;
import h.C0165i;
import h.C0174s;
import h.C0175t;
import java.lang.ref.WeakReference;
import l0.C0200c;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f878f;

    /* renamed from: g, reason: collision with root package name */
    public Object f879g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f880h;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f878f = i2;
        this.f880h = obj;
        this.f879g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        A.j jVar2;
        switch (this.f878f) {
            case 0:
                int i2 = 0;
                do {
                    try {
                        ((Runnable) this.f879g).run();
                    } catch (Throwable th) {
                        AbstractC0046w.d(th, v0.j.f3009f);
                    }
                    jVar = (j) this.f880h;
                    Runnable e2 = jVar.e();
                    if (e2 == null) {
                        break;
                    } else {
                        this.f879g = e2;
                        i2++;
                    }
                } while (i2 < 16);
                R0.l lVar = jVar.f882h;
                lVar.getClass();
                lVar.c(jVar, this);
                break;
            case 1:
                C0165i c0165i = (C0165i) this.f880h;
                g.j jVar3 = c0165i.f2190h;
                if (jVar3 != null && (jVar2 = jVar3.f1968e) != null) {
                    ((ActionMenuView) jVar2.f30g).getClass();
                }
                ActionMenuView actionMenuView = c0165i.f2194l;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0162f c0162f = (C0162f) this.f879g;
                    if (!c0162f.b()) {
                        if (c0162f.f2016e != null) {
                            c0162f.d(0, 0, false, false);
                        }
                    }
                    c0165i.f2204w = c0162f;
                }
                c0165i.f2206y = null;
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0175t c0175t = (C0175t) ((WeakReference) this.f879g).get();
                if (c0175t != null && c0175t.f2285m) {
                    TextView textView = c0175t.f2273a;
                    Typeface typeface = (Typeface) this.f880h;
                    textView.setTypeface(typeface);
                    c0175t.f2284l = typeface;
                    break;
                }
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                C0174s c0174s = (C0174s) ((C0200c) this.f879g).f2689g;
                if (c0174s != null) {
                    c0174s.b((Typeface) this.f880h);
                    break;
                }
                break;
            default:
                ((t.e) this.f879g).accept(this.f880h);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i2, boolean z2) {
        this.f878f = i2;
        this.f879g = obj;
        this.f880h = obj2;
    }
}
