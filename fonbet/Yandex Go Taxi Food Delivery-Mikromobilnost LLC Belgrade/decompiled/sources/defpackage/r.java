package defpackage;

import androidx.compose.ui.semantics.f;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.a;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderFeedbackQuestionInfoState;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.router.g;

/* loaded from: classes13.dex */
public final /* synthetic */ class r implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ r(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        boolean z = false;
        Object obj2 = null;
        int i = 2;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ((v) obj).a.r(new r(this.b, this.c, i2));
                return zy11.a;
            case 1:
                ((y) obj).g1(this.b, this.c);
                return zy11.a;
            case 2:
                String str = this.b;
                String str2 = this.c;
                ip70 ip70Var = (ip70) obj;
                if (str == null) {
                    str = null;
                }
                List h = scc.h(str);
                if (str2 == null) {
                    str2 = "";
                }
                ip70Var.n1(str2, h, null, null);
                return zy11.a;
            case 3:
                ((mx7) obj).a.r(new r(this.b, this.c, i));
                return zy11.a;
            case 4:
                ((OrderChangesDto.a) obj).a(this.b, this.c);
                return zy11.a;
            case 5:
                String str3 = this.b;
                String str4 = this.c;
                c9a c9aVar = (c9a) obj;
                f9a f9aVar = c9aVar.a;
                b9a b9aVar = c9aVar.b;
                tsa tsaVar = b9aVar.a;
                f9aVar.A((m950) ((g6) f9aVar.J).get(), new dja(str3, str4), new d9a(f9aVar, b9aVar));
                return zy11.a;
            case 6:
                String str5 = this.b;
                String str6 = this.c;
                c9a c9aVar2 = (c9a) obj;
                f9a f9aVar2 = c9aVar2.a;
                b9a b9aVar2 = c9aVar2.b;
                tsa tsaVar2 = b9aVar2.a;
                f9aVar2.A((m950) ((g6) f9aVar2.J).get(), new dja(str5, str6), new d9a(f9aVar2, b9aVar2));
                return zy11.a;
            case 7:
                ((jga) obj).E(this.b, this.c);
                return zy11.a;
            case 8:
                String str7 = this.b;
                String str8 = this.c;
                mnq0 mnq0Var = (mnq0) obj;
                if (str8 == null) {
                    str8 = "";
                }
                f.l(mnq0Var, str7 + " " + str8);
                return zy11.a;
            case 9:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.a.put("button_name", g8e.p(this.b, "_", this.c));
                return w3j0Var;
            case 10:
                String str9 = this.b;
                String str10 = this.c;
                w3j0 w3j0Var2 = (w3j0) obj;
                w3j0Var2.d("type", str9);
                w3j0Var2.d("search_query", str10.toString());
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("type", "back");
                w3j0Var2.f("action", mapBuilder.j());
                return zy11.a;
            case 11:
                String str11 = this.b;
                String str12 = this.c;
                w3j0 w3j0Var3 = (w3j0) obj;
                w3j0Var3.d("type", str11);
                w3j0Var3.d("search_query", str12.toString());
                MapBuilder mapBuilder2 = new MapBuilder();
                mapBuilder2.put("type", "search");
                w3j0Var3.f("action", mapBuilder2.j());
                return zy11.a;
            case 12:
                String str13 = this.b;
                String str14 = this.c;
                mnq0 mnq0Var2 = (mnq0) obj;
                if (str14 == null) {
                    str14 = "";
                }
                f.l(mnq0Var2, str13 + " " + str14);
                return zy11.a;
            case 13:
                ((q1n) obj).a.r(new r(this.b, this.c, 14));
                return zy11.a;
            case 14:
                String str15 = this.b;
                String str16 = this.c;
                ovm ovmVar = (ovm) obj;
                switch (ovmVar.a) {
                    case 0:
                        ((pvm) ovmVar.b).r(new qu(9));
                        break;
                    default:
                        ((e) ovmVar.b).r(new a(str16, str15));
                        break;
                }
                return zy11.a;
            case 15:
                String str17 = this.b;
                String str18 = this.c;
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                taxiOrder.getClass();
                synchronized (taxiOrder) {
                    TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                    TaxiOrderFeedback taxiOrderFeedback = taxiOrderLocalData.W;
                    taxiOrderFeedback.getClass();
                    taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, null, null, null, Collections.singletonList(new TaxiOrderFeedbackQuestionInfoState(str17, str18)), HProv.PP_VERSION_TIMESTAMP), false, null, false, null, null, null, -1, 16711679);
                }
                return zy11.a;
            case 16:
                String str19 = this.b;
                String str20 = this.c;
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("UPDATE local_contacts SET locals_dirty=0, locals_uploaded=1, locals_phone_id=?  WHERE locals_upload_id=?");
                try {
                    if (str19 == null) {
                        T0.p(1);
                    } else {
                        T0.g1(1, str19);
                    }
                    T0.g1(2, str20);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 17:
                ep30 ep30Var = (ep30) obj;
                d4l0 d4l0Var = new d4l0(this.b, this.c);
                b2w b2wVar = ep30Var.a.G;
                if (b2wVar != null) {
                    b2wVar.a.l(new j140(ep30Var.b, d4l0Var));
                }
                return zy11.a;
            case 18:
                g gVar = (g) obj;
                d4l0 d4l0Var2 = new d4l0(this.b, this.c);
                b2w b2wVar2 = gVar.a.G;
                if (b2wVar2 != null) {
                    b2wVar2.a.l(new j140(gVar.b, d4l0Var2));
                }
                return zy11.a;
            case 19:
                ((OrderChangesDto.a) obj).a(this.b, this.c);
                return zy11.a;
            case 20:
                String str21 = this.b;
                String str22 = this.c;
                T0 = ((oll0) obj).T0("SELECT COUNT(*) FROM persistent_queue WHERE prefix = ? AND key = ?");
                try {
                    T0.g1(1, str21);
                    T0.g1(2, str22);
                    if (T0.q()) {
                        if (((int) T0.getLong(0)) != 0) {
                            z = true;
                        }
                    }
                    T0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 21:
                String str23 = this.b;
                String str24 = this.c;
                T0 = ((oll0) obj).T0("SELECT value FROM persistent_queue WHERE prefix = ? AND key = ?");
                try {
                    T0.g1(1, str23);
                    T0.g1(2, str24);
                    if (T0.q() && !T0.isNull(0)) {
                        obj2 = T0.getBlob(0);
                    }
                    return obj2;
                } finally {
                }
            case 22:
                String str25 = this.b;
                String str26 = this.c;
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("DELETE FROM persistent_queue WHERE prefix = ? AND key = ?");
                try {
                    T0.g1(1, str25);
                    T0.g1(2, str26);
                    T0.q();
                    int x2 = jx81.x(oll0Var2);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 23:
                bp70 bp70Var = (bp70) obj;
                bp70Var.a.d0(bp70Var.b).a(this.b, this.c);
                return zy11.a;
            case 24:
                String str27 = this.b;
                String str28 = this.c;
                T0 = ((oll0) obj).T0("SELECT remotes_phone_id FROM remote_contacts WHERE remotes_user_id = ? AND remotes_phone_id != ?");
                try {
                    T0.g1(1, str27);
                    T0.g1(2, str28);
                    if (T0.q() && !T0.isNull(0)) {
                        obj2 = T0.Y1(0);
                    }
                    return obj2;
                } finally {
                }
            case 25:
                return d9s.b(this.b, this.c, (FormattedText) obj);
            case 26:
                String str29 = this.b;
                String str30 = this.c;
                T0 = ((oll0) obj).T0("SELECT sticker_text FROM sticker_list WHERE sticker_id=? AND sticker_pack_id=?");
                try {
                    T0.g1(1, str29);
                    T0.g1(2, str30);
                    if (T0.q() && !T0.isNull(0)) {
                        obj2 = T0.Y1(0);
                    }
                    return obj2;
                } finally {
                }
            case 27:
                v3z0 v3z0Var = (v3z0) obj;
                return new t3z0(new u2z0(this.b, v3z0Var.a.b), v3z0Var.e, true, this.c, EmptyList.a);
            default:
                ((jc01) obj).y(this.b, this.c);
                return zy11.a;
        }
    }
}
