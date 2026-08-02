package defpackage;

import android.view.View;
import androidx.compose.foundation.gestures.y;
import androidx.compose.ui.semantics.f;
import com.yandex.go.places.impl.ui.search.data.repositories.d;
import com.yandex.go.scooters.subscription.data.b;
import com.yandex.go.tariffcard.ui.view.MarginCardDivider;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorListView;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import java.util.Iterator;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.Anchor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.preorder.summary.tariffpage.router.TariffPageCloseReason;
import ru.yandex.taxi.sdc.router.e;

/* loaded from: classes13.dex */
public final /* synthetic */ class uyo0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uyo0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.CharSequence] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r14;
        kup0 kup0Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        FormattedText formattedText;
        rl2 rl2Var;
        zsp0 b;
        zy11 onAttachedToWindow$lambda$4;
        zy11 selectPaymentAdapter$lambda$0;
        zy11 selectorsAdapterDelegate$lambda$7;
        int i = this.a;
        int i2 = 2;
        r3 = null;
        r3 = null;
        r3 = null;
        dvp0 dvp0Var = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                vyo0 vyo0Var = (vyo0) obj2;
                if (((Result) obj).getValue() instanceof Result.Failure) {
                    r0 r0Var = ((b) vyo0Var).b;
                    r0Var.getClass();
                    r0Var.m(null, jyo0.a);
                }
                return zy11Var;
            case 1:
                ((ej1) obj2).r(new uyo0(i2, (k7n0) obj));
                return zy11Var;
            case 2:
                ((f0p0) obj).d0((k7n0) obj2);
                return zy11Var;
            case 3:
                t tVar = (t) obj2;
                if (jl40.l((f7p0) obj, f7p0.a)) {
                    tVar.r(new qu(9));
                }
                return zy11Var;
            case 4:
                ((hbp0) obj2).b();
                return zy11Var;
            case 5:
                ((vep0) obj2).b.b((TariffPageCloseReason) obj);
                return zy11Var;
            case 6:
                f.l((mnq0) obj, ((hhp0) obj2).a);
                return zy11Var;
            case 7:
                oip0 oip0Var = (oip0) obj2;
                float floatValue = ((Float) obj).floatValue();
                yx40 yx40Var = oip0Var.a;
                float intValue = yx40Var.getIntValue() + floatValue + oip0Var.f;
                float c = y6i0.c(intValue, 0.0f, oip0Var.e.getIntValue());
                r2 = intValue != c ? 0 : 1;
                float intValue2 = c - yx40Var.getIntValue();
                int round = Math.round(intValue2);
                yx40Var.setIntValue(yx40Var.getIntValue() + round);
                oip0Var.f = intValue2 - round;
                if (r2 == 0) {
                    floatValue = intValue2;
                }
                return Float.valueOf(floatValue);
            case 8:
                Anchor anchor = (Anchor) obj2;
                int intValue3 = ((Integer) obj).intValue();
                if (anchor == Anchor.TOP) {
                    intValue3 = -intValue3;
                }
                return Integer.valueOf(intValue3);
            case 9:
                zjp0 zjp0Var = (zjp0) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                CharSequence charSequence = zjp0Var.a;
                CharSequence charSequence2 = zjp0Var.b;
                String str9 = "";
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                yjp0 yjp0Var = zjp0Var.g;
                if (yjp0Var != null && (r14 = yjp0Var.a) != null) {
                    str9 = r14;
                }
                f.l(mnq0Var, ((Object) charSequence) + " " + ((Object) charSequence2) + " " + ((Object) str9));
                return zy11Var;
            case 10:
                lmt0 lmt0Var = (lmt0) obj;
                Iterator it = ((qkp0) obj2).a.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    mkp0 mkp0Var = (mkp0) it.next();
                    lmt0Var.a(i3, 0, mkp0Var.a, mkp0Var.b, mkp0Var.c);
                    i3 += mkp0Var.a;
                }
                return zy11Var;
            case 11:
                y yVar = (y) obj2;
                return new wu60(yVar.c(yVar.k, ((wu60) obj).a, yVar.j));
            case 12:
                ((ru.yandex.taxi.sdc.route.presentation.f) obj2).b();
                return zy11Var;
            case 13:
                pzt0 pzt0Var = ((e) obj2).p;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                return zy11Var;
            case 14:
                d dVar = (d) obj2;
                w8v0 w8v0Var = (w8v0) obj;
                if (w8v0Var instanceof f9v0) {
                    f9v0 f9v0Var = (f9v0) w8v0Var;
                    FormattedText formattedText2 = f9v0Var.a;
                    FormattedText formattedText3 = f9v0Var.b;
                    n7v n7vVar = f9v0Var.c;
                    if (n7vVar == null || (str8 = n7vVar.b) == null) {
                        str8 = n7vVar != null ? n7vVar.c : null;
                    }
                    u8v0 u8v0Var = f9v0Var.f;
                    if (u8v0Var != null && (formattedText = u8v0Var.b) != null && (rl2Var = u8v0Var.a) != null && (b = d.b(rl2Var, null)) != null) {
                        dvp0Var = new dvp0(formattedText, u8v0Var.c, b);
                    }
                    return new evp0(formattedText2, formattedText3, str8, dvp0Var);
                }
                if (w8v0Var instanceof z8v0) {
                    z8v0 z8v0Var = (z8v0) w8v0Var;
                    FormattedText formattedText4 = z8v0Var.a;
                    FormattedText formattedText5 = z8v0Var.b;
                    n7v n7vVar2 = z8v0Var.c;
                    if (n7vVar2 == null || (str7 = n7vVar2.b) == null) {
                        if (n7vVar2 != null) {
                            str7 = n7vVar2.c;
                        } else {
                            str6 = null;
                            zsp0 b2 = d.b(z8v0Var.d, w8v0Var);
                            t1k t1kVar = z8v0Var.f;
                            kup0Var = new kup0(formattedText4, formattedText5, str6, b2, t1kVar != null ? t1kVar.a : null, 16);
                        }
                    }
                    str6 = str7;
                    zsp0 b22 = d.b(z8v0Var.d, w8v0Var);
                    t1k t1kVar2 = z8v0Var.f;
                    kup0Var = new kup0(formattedText4, formattedText5, str6, b22, t1kVar2 != null ? t1kVar2.a : null, 16);
                } else if (w8v0Var instanceof i9v0) {
                    i9v0 i9v0Var = (i9v0) w8v0Var;
                    FormattedText formattedText6 = i9v0Var.a;
                    FormattedText formattedText7 = i9v0Var.b;
                    n7v n7vVar3 = i9v0Var.c;
                    if (n7vVar3 == null || (str4 = n7vVar3.b) == null) {
                        if (n7vVar3 != null) {
                            str4 = n7vVar3.c;
                        } else {
                            str3 = null;
                            zsp0 b3 = d.b(i9v0Var.d, w8v0Var);
                            t1k t1kVar3 = i9v0Var.f;
                            kup0Var = new kup0(formattedText6, formattedText7, str3, b3, (t1kVar3 == null && (str5 = t1kVar3.a) != null && (dVar.e instanceof dg80)) ? str5 : null, 16);
                        }
                    }
                    str3 = str4;
                    zsp0 b32 = d.b(i9v0Var.d, w8v0Var);
                    t1k t1kVar32 = i9v0Var.f;
                    kup0Var = new kup0(formattedText6, formattedText7, str3, b32, (t1kVar32 == null && (str5 = t1kVar32.a) != null && (dVar.e instanceof dg80)) ? str5 : null, 16);
                } else {
                    if (!(w8v0Var instanceof o9v0) && !(w8v0Var instanceof c9v0) && !(w8v0Var instanceof l9v0)) {
                        return null;
                    }
                    FormattedText a = w8v0Var.getA();
                    FormattedText b4 = w8v0Var.getB();
                    n7v c2 = w8v0Var.getC();
                    if (c2 == null || (str2 = c2.b) == null) {
                        str = c2 != null ? c2.c : null;
                    } else {
                        str = str2;
                    }
                    kup0Var = new kup0(a, b4, str, d.b(w8v0Var.getD(), w8v0Var), null, 48);
                }
                return kup0Var;
            case 15:
                ((vxp0) obj2).f.invoke(Float.valueOf(-((Float) obj).floatValue()));
                return zy11Var;
            case 16:
                return new v3q0((MarginCardDivider) obj, (nhx0) obj2);
            case 17:
                return q791.d((f530) obj, false, null, null, new c9q0((jls) obj2, r2), 15);
            case 18:
                onAttachedToWindow$lambda$4 = SelectContactView.onAttachedToWindow$lambda$4((SelectContactView) obj2, ((Boolean) obj).booleanValue());
                return onAttachedToWindow$lambda$4;
            case 19:
                ((y22) ((xcq0) obj2).x).a(sv90.A0(qv90.a, TextFieldNameForAnalytics.CVN, ((Boolean) obj).booleanValue()));
                return zy11Var;
            case 20:
                n70 n70Var = (n70) obj;
                m261 m261Var = (m261) n70Var.N;
                m261Var.b.setClipToOutline(true);
                xty0.b(m261Var.e);
                n70Var.W(new a5p0(8, n70Var, (uyo0) obj2));
                return zy11Var;
            case 21:
                selectPaymentAdapter$lambda$0 = SelectPaymentMethodView.selectPaymentAdapter$lambda$0((SelectPaymentMethodView) obj2, (ldq0) obj);
                return selectPaymentAdapter$lambda$0;
            case 22:
                zvd0 zvd0Var = (zvd0) obj;
                if (((fb30) obj2).d(zvd0Var.c)) {
                    zvd0Var.a();
                }
                return zy11Var;
            case 23:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                if (((dfq0) obj).f.a.a.b.length() > 0) {
                    ref$BooleanRef.element = false;
                }
                return zy11Var;
            case 24:
                jlq0 jlq0Var = (jlq0) obj2;
                f.l((mnq0) obj, a.X(j73.A(new CharSequence[]{jlq0Var.d, jlq0Var.e, jlq0Var.f, jlq0Var.g}), " ", null, null, null, 62));
                return zy11Var;
            case 25:
                selectorsAdapterDelegate$lambda$7 = SelectorListView.selectorsAdapterDelegate$lambda$7((SelectorListView) obj2, (n70) obj);
                return selectorsAdapterDelegate$lambda$7;
            case 26:
                ((bkv) obj2).r(new dcc0((String) obj, 28));
                return zy11Var;
            case 27:
                com.yandex.messaging.input.f fVar = (com.yandex.messaging.input.f) obj2;
                View view = (View) obj;
                fVar.d();
                fVar.e.get().getClass();
                if (view.equals(fVar.b) || view.equals(null)) {
                    view.performClick();
                }
                return zy11Var;
            case 28:
                return Boolean.valueOf(((Class) obj2).isInstance(obj));
            default:
                ((qz10) obj2).invoke(obj);
                return obj;
        }
    }
}
