package defpackage;

import androidx.core.view.b;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class xa01 extends lys implements t7u {
    public static final /* synthetic */ int Z = 0;
    public final tls S;
    public final tls T;
    public eiy U;
    public eiy V;
    public final dpu W;

    public xa01(wi40 wi40Var, tls tlsVar, tls tlsVar2) {
        super(wi40Var);
        this.S = tlsVar;
        this.T = tlsVar2;
        aiy aiyVar = aiy.a;
        this.U = aiyVar;
        this.V = aiyVar;
        this.W = new dpu(wi40Var.b, null);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        final kd01 kd01Var = (kd01) obj;
        k911 k911Var = kd01Var.c;
        ee01 ee01Var = kd01Var.a;
        this.U = lob1.g(k911Var);
        this.V = lob1.g(kd01Var.d);
        wi40 wi40Var = (wi40) ((zo31) this.R);
        ButtonComponent buttonComponent = wi40Var.d;
        ButtonComponent buttonComponent2 = wi40Var.d;
        ButtonComponent buttonComponent3 = wi40Var.c;
        ge01 ge01Var = kd01Var.b;
        final int i = 0;
        buttonComponent.setVisibility(ge01Var != null ? 0 : 8);
        buttonComponent3.setVisibility(ee01Var != null ? 0 : 8);
        CharSequence charSequence3 = "";
        if (ee01Var == null || (charSequence = ee01Var.a) == null) {
            charSequence = "";
        }
        buttonComponent3.setText(charSequence);
        b.p(buttonComponent3, new ifq0(12, charSequence));
        if (ge01Var != null && (charSequence2 = ge01Var.a) != null) {
            charSequence3 = charSequence2;
        }
        buttonComponent2.setText(charSequence3);
        b.p(buttonComponent2, new ifq0(12, charSequence3));
        buttonComponent2.setDebounceClickListener(new Runnable() { // from class: wa01
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                xa01 xa01Var = this;
                kd01 kd01Var2 = kd01Var;
                switch (i2) {
                    case 0:
                        ge01 ge01Var2 = kd01Var2.b;
                        if (ge01Var2 != null) {
                            xa01Var.T.invoke(ge01Var2);
                            break;
                        }
                        break;
                    default:
                        ee01 ee01Var2 = kd01Var2.a;
                        if (ee01Var2 != null) {
                            xa01Var.S.invoke(ee01Var2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        buttonComponent3.setDebounceClickListener(new Runnable() { // from class: wa01
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                xa01 xa01Var = this;
                kd01 kd01Var2 = kd01Var;
                switch (i22) {
                    case 0:
                        ge01 ge01Var2 = kd01Var2.b;
                        if (ge01Var2 != null) {
                            xa01Var.T.invoke(ge01Var2);
                            break;
                        }
                        break;
                    default:
                        ee01 ee01Var2 = kd01Var2.a;
                        if (ee01Var2 != null) {
                            xa01Var.S.invoke(ee01Var2);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.t7u
    public final eiy g() {
        return this.U;
    }

    @Override // defpackage.t7u
    public final eiy k() {
        return this.V;
    }

    @Override // defpackage.t7u
    public final epu x() {
        return this.W;
    }
}
