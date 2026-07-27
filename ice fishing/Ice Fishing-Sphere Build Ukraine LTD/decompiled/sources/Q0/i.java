package Q0;

import L0.AbstractC0064w;
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

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f887e;

    /* renamed from: f, reason: collision with root package name */
    public Object f888f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f889g;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f887e = i2;
        this.f889g = obj;
        this.f888f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        A.j jVar2;
        switch (this.f887e) {
            case 0:
                int i2 = 0;
                do {
                    try {
                        ((Runnable) this.f888f).run();
                    } catch (Throwable th) {
                        AbstractC0064w.d(th, v0.j.f3014e);
                    }
                    jVar = (j) this.f889g;
                    Runnable e2 = jVar.e();
                    if (e2 == null) {
                        break;
                    } else {
                        this.f888f = e2;
                        i2++;
                    }
                } while (i2 < 16);
                S0.l lVar = jVar.f891g;
                lVar.getClass();
                lVar.c(jVar, this);
                break;
            case 1:
                C0165i c0165i = (C0165i) this.f889g;
                g.j jVar3 = c0165i.f2197g;
                if (jVar3 != null && (jVar2 = jVar3.f1976e) != null) {
                    ((ActionMenuView) jVar2.f30f).getClass();
                }
                ActionMenuView actionMenuView = c0165i.f2201k;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0162f c0162f = (C0162f) this.f888f;
                    if (!c0162f.b()) {
                        if (c0162f.f2024e != null) {
                            c0162f.d(0, 0, false, false);
                        }
                    }
                    c0165i.f2211v = c0162f;
                }
                c0165i.f2213x = null;
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0175t c0175t = (C0175t) ((WeakReference) this.f888f).get();
                if (c0175t != null && c0175t.f2293m) {
                    TextView textView = c0175t.f2281a;
                    Typeface typeface = (Typeface) this.f889g;
                    textView.setTypeface(typeface);
                    c0175t.f2292l = typeface;
                    break;
                }
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                C0174s c0174s = (C0174s) ((C0200c) this.f888f).f2697f;
                if (c0174s != null) {
                    c0174s.b((Typeface) this.f889g);
                    break;
                }
                break;
            default:
                ((t.e) this.f888f).accept(this.f889g);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i2, boolean z2) {
        this.f887e = i2;
        this.f888f = obj;
        this.f889g = obj2;
    }
}
