package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.masstransit.design.snippet.MtSnippetView;
import java.util.ArrayList;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class y57 extends lys {
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public final /* synthetic */ int S = 1;
    public final Object T;
    public Object U;

    public y57(vw30 vw30Var, tls tlsVar) {
        super(vw30Var);
        this.T = new piq0(this.a.getContext());
        c.z(new ve30(8, this, tlsVar), this.a);
        b.p(this.a, new mg(23, this));
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 0:
                return false;
            case 1:
            default:
                return super.X();
            case 2:
                return false;
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        switch (this.S) {
            case 2:
                super.applyTheme(themeType);
                c040 c040Var = (c040) this.U;
                if (c040Var != null && c040Var.f) {
                    ((vw30) ((zo31) this.R)).c.updateBackground(new eg4(((piq0) this.T).a(themeType)));
                    break;
                }
                break;
            default:
                super.applyTheme(themeType);
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        final int i2 = 1;
        Object obj2 = this.R;
        final int i3 = 0;
        switch (i) {
            case 0:
                br70 br70Var = (br70) obj;
                c57 c57Var = (c57) this.U;
                int i4 = 2;
                ButtonOrientation buttonOrientation = br70Var.a.size() == 2 ? ButtonOrientation.HORIZONTAL : ButtonOrientation.VERTICAL;
                ArrayList<ar70> arrayList = br70Var.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (ar70 ar70Var : arrayList) {
                    String str = ar70Var.a;
                    boolean z = ar70Var.b;
                    bdc bdcVar = new bdc(z ? xng0.controlMain : xng0.controlMinor);
                    TextStyle textStyle = z ? TextStyle.ACCENT : TextStyle.DEFAULT;
                    arrayList2.add(new my6(str, new bdc(z ? xng0.textOnControl : xng0.textOnControlMinor), bdcVar, textStyle, new x57(ar70Var), null, new bdc(z ? xng0.textOnControl : xng0.textMinor), false, false, 16036));
                }
                pm5 pm5Var = (pm5) c57Var;
                pm5Var.d(new q47(buttonOrientation, arrayList2));
                pm5Var.f(new s57(i4, this));
                break;
            case 1:
                twh twhVar = (twh) obj;
                mrj mrjVar = twhVar.a;
                zo31 zo31Var = (zo31) obj2;
                if (mrjVar != null) {
                    ListItemComponent listItemComponent = ((e1x) zo31Var).b;
                    listItemComponent.setTitle((String) mrjVar.b);
                    String str2 = (String) mrjVar.w;
                    if (str2 != null) {
                        listItemComponent.setSubtitle(str2);
                    }
                    listItemComponent.setLeadImage((Drawable) mrjVar.c);
                    listItemComponent.setVisibility(0);
                    listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: uwh
                        public final /* synthetic */ y57 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i5 = i3;
                            y57 y57Var = this.b;
                            switch (i5) {
                                case 0:
                                    ((mai) y57Var.T).a(io.a);
                                    break;
                                default:
                                    ((mai) y57Var.T).a(io.b);
                                    break;
                            }
                        }
                    });
                } else {
                    ((e1x) zo31Var).b.setVisibility(8);
                }
                mrj mrjVar2 = twhVar.b;
                if (mrjVar2 != null) {
                    ListItemComponent listItemComponent2 = ((e1x) zo31Var).c;
                    listItemComponent2.setTitle((String) mrjVar2.b);
                    String str3 = (String) mrjVar2.w;
                    if (str3 != null) {
                        listItemComponent2.setSubtitle(str3);
                    }
                    listItemComponent2.setLeadImage((Drawable) mrjVar2.c);
                    listItemComponent2.setVisibility(0);
                    listItemComponent2.setDebounceClickListener(new Runnable(this) { // from class: uwh
                        public final /* synthetic */ y57 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i5 = i2;
                            y57 y57Var = this.b;
                            switch (i5) {
                                case 0:
                                    ((mai) y57Var.T).a(io.a);
                                    break;
                                default:
                                    ((mai) y57Var.T).a(io.b);
                                    break;
                            }
                        }
                    });
                } else {
                    ((e1x) zo31Var).c.setVisibility(8);
                }
                ((qnh) this.U).e(((e1x) zo31Var).d, F(), false);
                break;
            default:
                c040 c040Var = (c040) obj;
                this.U = c040Var;
                vw30 vw30Var = (vw30) ((zo31) obj2);
                GoConstraintLayout goConstraintLayout = vw30Var.a;
                GoImageView goImageView = vw30Var.c;
                int i5 = otg0.mt_route_max_width;
                View view = this.a;
                goConstraintLayout.setMaxWidth(c.d(i5, view));
                view.setSelected(c040Var.f);
                RobotoTextView robotoTextView = vw30Var.b;
                robotoTextView.setText(c040Var.c);
                MtSnippetView mtSnippetView = vw30Var.d;
                mtSnippetView.render(c040Var.b);
                boolean z2 = c040Var.f;
                mtSnippetView.setSelected(z2);
                OneShotPreDrawListener.add(mtSnippetView, new ii30(3, this));
                view.setContentDescription(c040Var.g);
                GoConstraintLayout goConstraintLayout2 = vw30Var.a;
                if (z2) {
                    goConstraintLayout2.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(16, view.getContext())));
                    goConstraintLayout2.setClipToOutline(true);
                    goConstraintLayout2.setBackgroundAttr(xng0.controlMinor);
                    robotoTextView.setTextTypeface(3);
                    robotoTextView.setTextColor(new bdc(xng0.textOnControlMinor));
                    goImageView.updateBackground(new eg4(((piq0) this.T).a(qje.X(view.getContext()))));
                    break;
                } else {
                    goConstraintLayout2.setOutlineProvider(null);
                    goConstraintLayout2.setBackground(null);
                    robotoTextView.setTextTypeface(0);
                    robotoTextView.setTextColor(new bdc(xng0.textMain));
                    goImageView.updateBackground(new fg4(q2h0.mt_route_end_fade));
                    break;
                }
        }
    }

    public y57(e1x e1xVar, mai maiVar, qnh qnhVar) {
        super(e1xVar);
        this.T = maiVar;
        this.U = qnhVar;
    }

    public y57(jy20 jy20Var, txc txcVar) {
        super(jy20Var);
        this.T = txcVar;
        this.U = jy20Var.b.buttonsContract();
    }
}
