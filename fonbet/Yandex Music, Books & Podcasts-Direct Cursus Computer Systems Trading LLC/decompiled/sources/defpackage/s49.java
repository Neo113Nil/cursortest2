package defpackage;

import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s49 extends uif implements Function1 {
    public final /* synthetic */ l49 r;
    public final /* synthetic */ xqn s;
    public final /* synthetic */ j79 t;
    public final /* synthetic */ KeyListener u;
    public final /* synthetic */ xzb v;
    public final /* synthetic */ t49 w;
    public final /* synthetic */ y5 x;
    public final /* synthetic */ dfb y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s49(l49 l49Var, xqn xqnVar, j79 j79Var, KeyListener keyListener, xzb xzbVar, t49 t49Var, y5 y5Var, dfb dfbVar) {
        super(1);
        this.r = l49Var;
        this.s = xqnVar;
        this.t = j79Var;
        this.u = keyListener;
        this.v = xzbVar;
        this.w = t49Var;
        this.x = y5Var;
        this.y = dfbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Locale locale;
        v59 v59Var = this.r.H;
        xr2 xr2Var = null;
        w59 a = v59Var != null ? v59Var.a() : null;
        boolean z = a instanceof zy8;
        KeyListener keyListener = this.u;
        y5 y5Var = this.x;
        j79 j79Var = this.t;
        xzb xzbVar = this.v;
        xqn xqnVar = this.s;
        if (z) {
            j79Var.setKeyListener(keyListener);
            zy8 zy8Var = (zy8) a;
            String str = (String) zy8Var.b.a(xzbVar);
            List<yy8> list = zy8Var.c;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            for (yy8 yy8Var : list) {
                char G = mlr.G((CharSequence) yy8Var.a.a(xzbVar));
                szb szbVar = yy8Var.c;
                String str2 = szbVar != null ? (String) szbVar.a(xzbVar) : null;
                Character H = mlr.H((CharSequence) yy8Var.b.a(xzbVar));
                arrayList.add(new wr2(G, H != null ? H.charValue() : (char) 0, str2));
            }
            vr2 vr2Var = new vr2(str, arrayList, ((Boolean) zy8Var.a.a(xzbVar)).booleanValue());
            xr2 xr2Var2 = (xr2) xqnVar.a;
            if (xr2Var2 != null) {
                xr2Var2.n(vr2Var, true);
            } else {
                xr2Var2 = new xfc(vr2Var, new r49(y5Var, 0));
            }
            xr2Var = xr2Var2;
        } else if (a instanceof tu8) {
            szb szbVar2 = ((tu8) a).a;
            String str3 = szbVar2 != null ? (String) szbVar2.a(xzbVar) : null;
            if (str3 != null) {
                locale = Locale.forLanguageTag(str3);
                String languageTag = locale.toLanguageTag();
                if (!Intrinsics.d(languageTag, str3)) {
                    this.y.e(new IllegalArgumentException("Original locale tag '" + str3 + "' is not equals to final one '" + languageTag + '\''));
                }
            } else {
                locale = Locale.getDefault();
            }
            j79Var.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
            Object obj2 = xqnVar.a;
            xr2 xr2Var3 = (xr2) obj2;
            if (xr2Var3 != null) {
                obj2.getClass();
                zv6 zv6Var = (zv6) obj2;
                String replace = zv6Var.h().replace(zv6Var.p().getDecimalSeparator(), '.');
                replace.getClass();
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
                zv6Var.o(currencyInstance);
                zv6Var.h = currencyInstance;
                String replace2 = replace.replace('.', zv6Var.p().getDecimalSeparator());
                replace2.getClass();
                zv6Var.a(replace2, null);
                xr2Var = xr2Var3;
            } else {
                xr2Var = new zv6(locale, new r49(y5Var, 1));
            }
        } else if (a instanceof qd9) {
            j79Var.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
            xr2Var = (xr2) xqnVar.a;
            if (xr2Var != null) {
                xr2Var.n(bnk.b, true);
            } else {
                xr2Var = new xfc(new r49(y5Var, 2));
            }
        } else {
            j79Var.setKeyListener(keyListener);
        }
        xqnVar.a = xr2Var;
        this.w.invoke(xr2Var);
        return Unit.a;
    }
}
