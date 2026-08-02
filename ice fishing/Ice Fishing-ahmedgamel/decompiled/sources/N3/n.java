package N3;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import h.C4548d;
import h.C4551g;
import java.util.Objects;
import k.AbstractC4625b;
import m.T0;
import v2.BinderC5100d;

/* loaded from: classes2.dex */
public final class n implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2002n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2003u;

    public /* synthetic */ n(int i, Object obj) {
        this.f2002n = i;
        this.f2003u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2002n) {
            case 0:
                ((b3.e) this.f2003u).L();
                break;
            case 1:
                Y0.p.g((Context) ((Y0.b) this.f2003u).f3827u);
                break;
            case 2:
                Y0.p.g(((Y0.j) this.f2003u).f3841n);
                break;
            case 3:
                Y0.p.g(((Y0.k) this.f2003u).f3844n);
                break;
            case 4:
                Y0.p.g((Context) ((Y0.m) this.f2003u).f3851w);
                break;
            case 5:
                Y0.p.g(((Y0.n) this.f2003u).f3852n);
                break;
            case 6:
                Y0.p.g((Context) ((S0.s) this.f2003u).f2970v);
                break;
            case 7:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            case 8:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f2003u;
                int i = jVar.f36734y0;
                if (i != 2) {
                    if (i == 1) {
                        jVar.D(2);
                        break;
                    }
                } else {
                    jVar.D(1);
                    break;
                }
                break;
            case 9:
                C4548d c4548d = (C4548d) this.f2003u;
                c4548d.getClass();
                DrawerLayout drawerLayout = c4548d.f37892b;
                int h3 = drawerLayout.h(8388611);
                View e9 = drawerLayout.e(8388611);
                if ((e9 != null ? DrawerLayout.p(e9) : false) && h3 != 2) {
                    drawerLayout.c();
                    break;
                } else if (h3 != 1) {
                    drawerLayout.r();
                    break;
                }
                break;
            case 10:
                C4551g c4551g = (C4551g) this.f2003u;
                Button button = c4551g.f37904f;
                c4551g.f37919v.obtainMessage(1, c4551g.f37900b).sendToTarget();
                break;
            case 11:
                ((AbstractC4625b) this.f2003u).a();
                break;
            case 12:
                T0 t02 = ((Toolbar) this.f2003u).f4583q0;
                l.o oVar = t02 == null ? null : t02.f39129u;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            default:
                BinderC5100d binderC5100d = (BinderC5100d) this.f2003u;
                binderC5100d.f41112Q = 2;
                binderC5100d.f41114u.finish();
                break;
        }
    }

    public n(b3.e eVar) {
        this.f2002n = 0;
        Objects.requireNonNull(eVar);
        this.f2003u = eVar;
    }

    public n(BinderC5100d binderC5100d) {
        this.f2002n = 13;
        Objects.requireNonNull(binderC5100d);
        this.f2003u = binderC5100d;
    }
}
