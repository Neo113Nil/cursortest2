package ru.yandex.taxi.plus.repository.mappers;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import defpackage.ae20;
import defpackage.avu0;
import defpackage.bg20;
import defpackage.d0k;
import defpackage.d29;
import defpackage.dkd0;
import defpackage.e29;
import defpackage.g0k;
import defpackage.g8e;
import defpackage.gf20;
import defpackage.gzt;
import defpackage.hf20;
import defpackage.hld0;
import defpackage.kyh0;
import defpackage.m151;
import defpackage.moc0;
import defpackage.n0d0;
import defpackage.n0h0;
import defpackage.nf20;
import defpackage.ny61;
import defpackage.o151;
import defpackage.ofe;
import defpackage.omy0;
import defpackage.ooc0;
import defpackage.pe20;
import defpackage.pf20;
import defpackage.poc0;
import defpackage.rcc;
import defpackage.scc;
import defpackage.te20;
import defpackage.tje;
import defpackage.uf20;
import defpackage.vng;
import defpackage.y1d0;
import defpackage.zl4;
import java.util.Arrays;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.plaque.api.models.PlaqueModel$TabletPlaqueModel$Notification$Position;
import ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

/* loaded from: classes6.dex */
public final class c {
    public final hld0 a;
    public final ru.yandex.taxi.widget.c b;
    public final b c;
    public final d29 d;
    public final uf20 e;
    public final nf20 f;

    public c(hld0 hld0Var, ru.yandex.taxi.widget.c cVar, b bVar, d29 d29Var) {
        this.a = hld0Var;
        this.b = cVar;
        this.c = bVar;
        this.d = d29Var;
        g0k g0kVar = g0k.c;
        this.e = new uf20("widget:client:tablet:space", new o151(g0kVar, new m151(tje.x(hld0Var.a, 4.0f)), 4));
        o151 o151Var = new o151(g0kVar, (m151) null, 6);
        Drawable t = vng.t(n0h0.ic_plus_glyph_badge_small, hld0Var.a);
        this.f = new nf20("widget:client:tablet:glyph", null, o151Var, ofe.e, new pf20("ic_plus_glyph_badge_small", t == null ? new FormattedTextConverter$EmptyDrawable() : t));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(dkd0 dkd0Var, y1d0 y1d0Var, String str, ContinuationImpl continuationImpl) {
        TabletBadgeMapper$mapTablet$1 tabletBadgeMapper$mapTablet$1;
        int i;
        zl4 a;
        String str2;
        d0k d0kVar;
        String str3;
        String str4;
        gf20 gf20Var;
        d0k d0kVar2;
        Double i2;
        ooc0 ooc0Var;
        String str5;
        int[] iArr;
        float[] fArr;
        if (continuationImpl instanceof TabletBadgeMapper$mapTablet$1) {
            tabletBadgeMapper$mapTablet$1 = (TabletBadgeMapper$mapTablet$1) continuationImpl;
            int i3 = tabletBadgeMapper$mapTablet$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tabletBadgeMapper$mapTablet$1.label = i3 - Integer.MIN_VALUE;
                Object obj = tabletBadgeMapper$mapTablet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tabletBadgeMapper$mapTablet$1.label;
                hld0 hld0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str6 = dkd0Var.a;
                    String str7 = (((str6 == null || (i2 = avu0.i(str6)) == null) ? 0.0d : i2.doubleValue()) != 0.0d || (dkd0Var.b == SubscriptionStatusDto.ACTIVE)) ? dkd0Var.a : null;
                    a = ((e29) this.d).a();
                    String str8 = str7 == null ? a.b : str7;
                    float x = str7 == null ? tje.x(hld0Var.a, 2.0f) : tje.x(hld0Var.a, 1.0f);
                    float x2 = str7 == null ? 0.0f : tje.x(hld0Var.a, 1.0f);
                    if (str7 != null) {
                        int i4 = kyh0.plus_sdk_badge_content_description;
                        Context context = hld0Var.a;
                        Object[] copyOf = Arrays.copyOf(new Object[]{str7}, 1);
                        str2 = context.getString(i4, Arrays.copyOf(copyOf, copyOf.length));
                    } else {
                        str2 = str8;
                    }
                    float f = x;
                    String str9 = str2;
                    FormattedText b = ru.yandex.taxi.common_models.net.b.b(FormattedText.Companion, str8, new Integer(16), null, null, FormattedText.FontWeight.MEDIUM, 28);
                    hf20 hf20Var = new hf20("widget:client:tablet:balance", null, ofe.e, new o151(new g0k(new d0k(0.0f, x2, 0.0f, f), te20.e), omy0.c, 21), new bg20(ru.yandex.taxi.widget.c.f(this.b, b, false, null, 14), b), null, null);
                    int i5 = str7 == null ? 1 : 0;
                    uf20 uf20Var = this.e;
                    nf20 nf20Var = this.f;
                    gf20 gf20Var2 = new gf20("level:client:tablet", i5 != 0 ? scc.g(nf20Var, uf20Var, hf20Var) : scc.g(hf20Var, uf20Var, nf20Var), g0k.c, null, true, 16);
                    if (i5 != 0) {
                        Context context2 = hld0Var.a;
                        Context context3 = hld0Var.a;
                        d0kVar = new d0k(tje.x(context2, 4.0f), tje.x(context3, 3.0f), tje.x(context3, 8.0f), tje.x(context3, 3.0f));
                    } else {
                        Context context4 = hld0Var.a;
                        Context context5 = hld0Var.a;
                        d0kVar = new d0k(tje.x(context4, 8.0f), tje.x(context5, 3.0f), tje.x(context5, 4.0f), tje.x(context5, 3.0f));
                    }
                    PlaqueModel$TabletPlaqueModel$Notification$Position plaqueModel$TabletPlaqueModel$Notification$Position = i5 != 0 ? PlaqueModel$TabletPlaqueModel$Notification$Position.RIGHT : PlaqueModel$TabletPlaqueModel$Notification$Position.LEFT;
                    tabletBadgeMapper$mapTablet$1.L$0 = null;
                    tabletBadgeMapper$mapTablet$1.L$1 = null;
                    str3 = str;
                    tabletBadgeMapper$mapTablet$1.L$2 = str3;
                    tabletBadgeMapper$mapTablet$1.L$3 = null;
                    tabletBadgeMapper$mapTablet$1.L$4 = a;
                    tabletBadgeMapper$mapTablet$1.L$5 = null;
                    str4 = str9;
                    tabletBadgeMapper$mapTablet$1.L$6 = str4;
                    tabletBadgeMapper$mapTablet$1.L$7 = null;
                    tabletBadgeMapper$mapTablet$1.L$8 = null;
                    tabletBadgeMapper$mapTablet$1.L$9 = null;
                    tabletBadgeMapper$mapTablet$1.L$10 = gf20Var2;
                    tabletBadgeMapper$mapTablet$1.L$11 = d0kVar;
                    tabletBadgeMapper$mapTablet$1.L$12 = null;
                    tabletBadgeMapper$mapTablet$1.F$0 = f;
                    tabletBadgeMapper$mapTablet$1.F$1 = x2;
                    tabletBadgeMapper$mapTablet$1.I$0 = i5;
                    tabletBadgeMapper$mapTablet$1.label = 1;
                    obj = this.c.b(y1d0Var, plaqueModel$TabletPlaqueModel$Notification$Position, tabletBadgeMapper$mapTablet$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gf20Var = gf20Var2;
                    d0kVar2 = d0kVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d0kVar2 = (d0k) tabletBadgeMapper$mapTablet$1.L$11;
                    gf20 gf20Var3 = (gf20) tabletBadgeMapper$mapTablet$1.L$10;
                    String str10 = (String) tabletBadgeMapper$mapTablet$1.L$6;
                    a = (zl4) tabletBadgeMapper$mapTablet$1.L$4;
                    String str11 = (String) tabletBadgeMapper$mapTablet$1.L$2;
                    kotlin.b.b(obj);
                    str4 = str10;
                    str3 = str11;
                    gf20Var = gf20Var3;
                }
                ooc0Var = (ooc0) obj;
                if (ooc0Var instanceof moc0) {
                    str5 = "";
                } else {
                    int i6 = kyh0.plus_sdk_badge_tag_counter_content_description;
                    Object[] objArr = {new Integer(((moc0) ooc0Var).a)};
                    Context context6 = hld0Var.a;
                    Object[] copyOf2 = Arrays.copyOf(objArr, 1);
                    str5 = context6.getString(i6, Arrays.copyOf(copyOf2, copyOf2.length));
                }
                gzt gztVar = a.a;
                iArr = gztVar.a;
                fArr = gztVar.b;
                if (iArr.length == fArr.length) {
                    ny61.g("Colors size must be equivalent positions size");
                    return null;
                }
                ListBuilder a2 = rcc.a();
                int length = iArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    a2.add(new pe20(iArr[i7], fArr[i8]));
                    i7++;
                    gf20Var = gf20Var;
                    ooc0Var = ooc0Var;
                    i8++;
                }
                return new poc0(new g0k(d0kVar2, new te20(new ae20(a2.j(), gztVar.d, gztVar.e), te20.d, false)), new n0d0(str3), gf20Var, new ofe(1, g8e.p(str4, Extension.FIX_SPACE, str5), "", Button.class.getName()), ooc0Var);
            }
        }
        tabletBadgeMapper$mapTablet$1 = new TabletBadgeMapper$mapTablet$1(this, continuationImpl);
        Object obj2 = tabletBadgeMapper$mapTablet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tabletBadgeMapper$mapTablet$1.label;
        hld0 hld0Var2 = this.a;
        if (i != 0) {
        }
        ooc0Var = (ooc0) obj2;
        if (ooc0Var instanceof moc0) {
        }
        gzt gztVar2 = a.a;
        iArr = gztVar2.a;
        fArr = gztVar2.b;
        if (iArr.length == fArr.length) {
        }
    }
}
