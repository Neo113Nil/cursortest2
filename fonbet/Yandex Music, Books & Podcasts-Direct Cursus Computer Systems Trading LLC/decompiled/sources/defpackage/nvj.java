package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nvj implements dv8 {
    public final /* synthetic */ int b = 1;
    public final Context c;
    public final Object d;

    public nvj(Context context, rvj rvjVar) {
        context.getClass();
        this.c = context;
        this.d = rvjVar;
    }

    @Override // defpackage.dv8
    public final boolean b(String str) {
        int i = this.b;
        str.getClass();
        switch (i) {
            case 0:
                return Intrinsics.d(str, "paywall_button") || Intrinsics.d(str, "progress");
            default:
                int hashCode = str.hashCode();
                return hashCode == -1001078227 ? str.equals("progress") : !(hashCode == -839482377 ? !str.equals("purchase_bottom_block") : !(hashCode == 1894492111 && str.equals("purchase_block")));
        }
    }

    @Override // defpackage.dv8
    public final View c(yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        int i = this.b;
        xzbVar.getClass();
        switch (i) {
            case 0:
                ComposeView composeView = new ComposeView(this.c, null, 0, 6, null);
                String str = yu8Var.j;
                if (Intrinsics.d(str, "paywall_button")) {
                    composeView.setContent(new wn5(new ykf(16, this), -743699535, true));
                } else if (Intrinsics.d(str, "progress")) {
                    composeView.setContent(sk3.d);
                }
                return composeView;
            default:
                ComposeView composeView2 = new ComposeView(this.c, null, 0, 6, null);
                JSONObject jSONObject = yu8Var.i;
                final l3n l3nVar = new l3n(jSONObject != null ? wct.C("button_color", jSONObject) : null, jSONObject != null ? wct.C("button_text_color", jSONObject) : null, jSONObject != null ? wct.C("button_color_additional", jSONObject) : null, jSONObject != null ? wct.C("button_text_color_additional", jSONObject) : null, jSONObject != null ? fgq.z("is_dark_theme", jSONObject) : null);
                String str2 = yu8Var.j;
                int hashCode = str2.hashCode();
                if (hashCode != -1001078227) {
                    if (hashCode != -839482377) {
                        if (hashCode == 1894492111 && str2.equals("purchase_block")) {
                            final int i2 = 0;
                            composeView2.setContent(new wn5(new Function2(this) { // from class: r7s
                                public final /* synthetic */ nvj b;

                                {
                                    this.b = this;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i3 = i2;
                                    hq5 hq5Var = (hq5) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    switch (i3) {
                                        case 0:
                                            oq5 oq5Var = (oq5) hq5Var;
                                            if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                                                x2i.i.R((p7s) this.b.d, l3nVar, oq5Var, 0);
                                            } else {
                                                oq5Var.S();
                                            }
                                            break;
                                        default:
                                            oq5 oq5Var2 = (oq5) hq5Var;
                                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                                x2i.i.Q((p7s) this.b.d, l3nVar, oq5Var2, 0);
                                            } else {
                                                oq5Var2.S();
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, -1154546950, true));
                        }
                    } else if (str2.equals("purchase_bottom_block")) {
                        final int i3 = 1;
                        composeView2.setContent(new wn5(new Function2(this) { // from class: r7s
                            public final /* synthetic */ nvj b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i32 = i3;
                                hq5 hq5Var = (hq5) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i32) {
                                    case 0:
                                        oq5 oq5Var = (oq5) hq5Var;
                                        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                                            x2i.i.R((p7s) this.b.d, l3nVar, oq5Var, 0);
                                        } else {
                                            oq5Var.S();
                                        }
                                        break;
                                    default:
                                        oq5 oq5Var2 = (oq5) hq5Var;
                                        if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                            x2i.i.Q((p7s) this.b.d, l3nVar, oq5Var2, 0);
                                        } else {
                                            oq5Var2.S();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        }, -103424605, true));
                    }
                } else if (str2.equals("progress")) {
                    composeView2.setContent(pd.g);
                }
                return composeView2;
        }
    }

    @Override // defpackage.dv8
    public final void d(View view, yu8 yu8Var) {
        int i = this.b;
    }

    @Override // defpackage.dv8
    public final void e(View view, yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        int i = this.b;
        view.getClass();
        xzbVar.getClass();
    }

    public nvj(Context context, p7s p7sVar) {
        context.getClass();
        this.c = context;
        this.d = p7sVar;
    }

    private final void f(View view, yu8 yu8Var) {
    }

    private final void g(View view, yu8 yu8Var) {
    }
}
