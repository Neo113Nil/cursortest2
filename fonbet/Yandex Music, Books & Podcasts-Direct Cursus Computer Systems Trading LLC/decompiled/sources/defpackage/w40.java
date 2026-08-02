package defpackage;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yandex.plus.bdui.content.d;
import com.yandex.plus.bdui.flex.ui.t;
import com.yandex.plus.bdui.plus.scaffold.controller.e;
import com.yandex.plus.bdui.query.c;
import com.yandex.plus.bdui.scaffold.b;
import com.yandex.plus.bdui.ui.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class w40 extends ezc implements pyc {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w40(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return y40.a((y40) this.receiver, (List) obj, (List) obj2, (Continuation) obj3);
            case 1:
                if (obj != null) {
                    l1j.f();
                    return null;
                }
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.j1;
                Resources resources = androidComposeView.getContext().getResources();
                return Boolean.valueOf(ef0.a.a(androidComposeView, null, new jp5(new kx7(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((nmq) obj2).a, (Function1) obj3)));
            case 2:
                return fdf.a((fdf) this.receiver, (List) obj, (List) obj2, (Continuation) obj3);
            case 3:
                return gdf.a((gdf) this.receiver, (List) obj, (List) obj2, (Continuation) obj3);
            case 4:
                thj thjVar = (thj) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                String str = (String) obj3;
                thjVar.getClass();
                str.getClass();
                ydf ydfVar = (ydf) this.receiver;
                ydfVar.getClass();
                weo.H(ydfVar.a.b, thjVar, booleanValue, str, null);
                return Unit.a;
            case 5:
                thj thjVar2 = (thj) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                String str2 = (String) obj3;
                thjVar2.getClass();
                str2.getClass();
                ydf ydfVar2 = (ydf) this.receiver;
                ydfVar2.getClass();
                weo.H(ydfVar2.a.b, thjVar2, booleanValue2, str2, null);
                return Unit.a;
            case 6:
                return fhf.a((fhf) this.receiver, (List) obj, (List) obj2, (Continuation) obj3);
            case 7:
                return ghf.a((ghf) this.receiver, (List) obj, (List) obj2, (Continuation) obj3);
            case 8:
                return uem.a((uem) this.receiver, (List) obj, (List) obj2, (Continuation) obj3);
            case 9:
                orq orqVar = (orq) obj;
                View view = (View) obj2;
                bxq bxqVar = (bxq) obj3;
                orqVar.getClass();
                view.getClass();
                bxqVar.getClass();
                trq trqVar = (trq) this.receiver;
                trqVar.c = orqVar;
                trqVar.b = bxqVar;
                trqVar.a = view;
                return Unit.a;
            case 10:
                String str3 = (String) obj;
                String str4 = (String) obj3;
                uxt uxtVar = (uxt) this.receiver;
                kxt kxtVar = (kxt) uxtVar.b.get(new Pair((String) obj2, str3));
                if (!String.valueOf(kxtVar != null ? kxtVar.d() : null).equals(str4) && kxtVar != null) {
                    try {
                        kxtVar.g(str4);
                    } catch (Exception unused) {
                        uxtVar.a.invoke(new wxt(2, null, hrg.s("Unable to set '", str4, "' value to variable '", str3, "'.")));
                    }
                }
                return Unit.a;
            case 11:
                x1w x1wVar = (x1w) obj;
                int intValue = ((Number) obj2).intValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                x1wVar.getClass();
                z1w z1wVar = (z1w) this.receiver;
                z1wVar.getClass();
                x1wVar.getClass();
                if (booleanValue3) {
                    p0w p0wVar = z1wVar.c;
                    String str5 = x1wVar.b;
                    String str6 = x1wVar.c;
                    String str7 = z1wVar.d;
                    p0wVar.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    nmb a = p0wVar.a();
                    String j = k5r.j(p0wVar, a);
                    LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
                    m.put("hash", j);
                    m.put("genre_tab", str7);
                    m.put("artist_id", str5);
                    eta.m(intValue, "artist_name", str6, "artist_pos", m);
                    m.put("_meta", nmb.u(1));
                    a.C("Wizard.SearchResultItem.Showed", m);
                }
                return Unit.a;
            case 12:
                return ((a) this.receiver).c((d) obj, (t) obj2, (Continuation) obj3);
            case 13:
                return ((e) this.receiver).e((b) obj, (t) obj2, (Continuation) obj3);
            case 14:
                String str8 = (String) obj;
                Map map = (Map) obj2;
                Map map2 = (Map) obj3;
                str8.getClass();
                map.getClass();
                switch (((c) this.receiver).a) {
                    case 0:
                        str8.getClass();
                        map.getClass();
                        return new com.yandex.plus.bdui.query.b(str8, map, map2);
                    default:
                        str8.getClass();
                        map.getClass();
                        return new com.yandex.plus.bdui.query.e(str8, map, map2);
                }
            default:
                String str9 = (String) obj;
                boolean booleanValue4 = ((Boolean) obj3).booleanValue();
                str9.getClass();
                ((com.yandex.plus.webview.internal.b) this.receiver).a(str9, (String) obj2, booleanValue4);
                return Unit.a;
        }
    }
}
