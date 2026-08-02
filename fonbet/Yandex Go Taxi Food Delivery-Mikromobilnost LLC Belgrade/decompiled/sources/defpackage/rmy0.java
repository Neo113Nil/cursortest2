package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.text.g;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.draw.b;
import androidx.core.app.w0;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.go.superapp.orders.card.OrderCardView;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.h;
import com.yandex.messaging.internal.authorized.chat.notifications.c;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.ybsdk.core.transfer.utils.TransferCommentView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainState$Success$OpenScenario;
import com.ybsdk.widgets.common.CircleButtonsListView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.order.view.TopCircleButtonsView;

/* loaded from: classes10.dex */
public final /* synthetic */ class rmy0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rmy0(g gVar, ik2 ik2Var, ily ilyVar) {
        this.a = 4;
        this.c = ik2Var;
        this.b = ilyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0525  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        dry0 dry0Var;
        jb2 m;
        cry0 cry0Var;
        hry0 b;
        hry0 b2;
        hry0 b3;
        String str;
        boolean updateActions$lambda$1;
        Object value;
        zy11 commentValidator_delegate$lambda$2$lambda$0;
        zy11 renderInfo$lambda$66$lambda$65;
        int i = this.a;
        hb4 hb4Var = hb4.a;
        int i2 = 18;
        int i3 = 9;
        int i4 = 0;
        int i5 = 1;
        String str2 = "";
        String str3 = null;
        String str4 = null;
        r9 = null;
        bmt0 bmt0Var = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                return bVar.a(new rmy0(i5, ((ehr0) obj3).a(bVar.a.c(), bVar.a.getLayoutDirection(), bVar), (nmy0) obj2));
            case 1:
                jd00.e((qam) obj, (ix80) obj3, ((nmy0) obj2).a());
                return zy11Var;
            case 2:
                return new te4(i2, (oz40) obj3, (zx40) obj2);
            case 3:
                g gVar = (g) obj3;
                ik2 ik2Var = (ik2) obj2;
                m2k0 m2k0Var = (m2k0) obj;
                kk2 kk2Var = gVar.b;
                oz40 oz40Var = gVar.a;
                dry0 dry0Var2 = (dry0) oz40Var.getValue();
                if (jl40.l(kk2Var, (dry0Var2 == null || (cry0Var = dry0Var2.a) == null) ? null : cry0Var.a) && (dry0Var = (dry0) oz40Var.getValue()) != null) {
                    hm40 hm40Var = dry0Var.b;
                    ik2 c = g.c(ik2Var, dry0Var);
                    if (c != null) {
                        int i6 = c.c;
                        int i7 = c.b;
                        m = dry0Var.m(i7, i6);
                        zii0 b4 = dry0Var.b(i7);
                        m.r(((Float.floatToRawIntBits(hm40Var.d(i7) == hm40Var.d(i6 - 1) ? Math.min(dry0Var.b(r5).a, b4.a) : 0.0f) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(b4.b))) ^ (-9223372034707292160L));
                        r9 = m != null ? new gry0(m) : null;
                        if (r9 != null) {
                            m2k0Var.y(r9);
                            m2k0Var.g(true);
                        }
                        return zy11Var;
                    }
                }
                m = null;
                if (m != null) {
                }
                if (r9 != null) {
                }
                return zy11Var;
            case 4:
                ik2 ik2Var2 = (ik2) obj3;
                yx40 yx40Var = ((ily) obj2).b;
                aky0 aky0Var = (aky0) obj;
                kky kkyVar = (kky) ik2Var2.a;
                hry0 b5 = kkyVar.b();
                bmt0 bmt0Var2 = b5 != null ? b5.a : null;
                bmt0 bmt0Var3 = ((yx40Var.getIntValue() & 1) == 0 || (b3 = kkyVar.b()) == null) ? null : b3.b;
                if (bmt0Var2 != null) {
                    bmt0Var3 = bmt0Var2.d(bmt0Var3);
                }
                bmt0 bmt0Var4 = ((yx40Var.getIntValue() & 2) == 0 || (b2 = kkyVar.b()) == null) ? null : b2.c;
                if (bmt0Var3 != null) {
                    bmt0Var4 = bmt0Var3.d(bmt0Var4);
                }
                if ((yx40Var.getIntValue() & 4) != 0 && (b = kkyVar.b()) != null) {
                    bmt0Var = b.d;
                }
                if (bmt0Var4 != null) {
                    bmt0Var = bmt0Var4.d(bmt0Var);
                }
                aky0Var.getClass();
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                kk2 kk2Var2 = aky0Var.a;
                zjy0 zjy0Var = new zjy0(i4, ref$BooleanRef, ik2Var2, bmt0Var);
                kk2Var2.getClass();
                hk2 hk2Var = new hk2(kk2Var2);
                hk2Var.e(zjy0Var);
                aky0Var.b = hk2Var.i();
                return zy11Var;
            case 5:
                return q791.d((f530) obj, false, null, null, new i5y0(i3, (tls) obj3, (muy0) obj2), 15);
            case 6:
                com.yandex.messaging.internal.authorized.chat.notifications.builder.g gVar2 = (com.yandex.messaging.internal.authorized.chat.notifications.builder.g) obj2;
                ii60 ii60Var = (ii60) obj;
                String str5 = ii60Var.f;
                String str6 = ii60Var.e;
                Bitmap bitmap = (Bitmap) ((Map) obj3).get(str6);
                if (bitmap == null) {
                    c cVar = gVar2.w;
                    cVar.getClass();
                    String str7 = str5 == null ? "" : str5;
                    if (ChatNamespaces.b(cVar.b.b)) {
                        str2 = cVar.a.a();
                    } else if (str6 != null) {
                        str2 = str6;
                    }
                    String a = w2b1.a(str7);
                    ab4 ab4Var = cVar.e;
                    int i8 = cVar.f;
                    bitmap = ffx.c0(ab4Var.a.l(str2, a, null, hb4Var), i8, i8, Bitmap.Config.ARGB_8888);
                }
                w0 w0Var = new w0();
                if (str5 != null) {
                    gVar2.b.getClass();
                    str4 = str5;
                }
                w0Var.a = str4;
                w0Var.b = IconCompat.b(bitmap);
                return w0Var.a();
            case 7:
                h hVar = (h) obj2;
                ii60 ii60Var2 = (ii60) obj;
                String str8 = ii60Var2.f;
                String str9 = ii60Var2.e;
                Bitmap bitmap2 = (Bitmap) ((Map) obj3).get(str9);
                if (bitmap2 == null) {
                    c cVar2 = hVar.w;
                    cVar2.getClass();
                    String str10 = str8 == null ? "" : str8;
                    if (ChatNamespaces.b(cVar2.b.b)) {
                        str2 = cVar2.a.a();
                    } else if (str9 != null) {
                        str2 = str9;
                    }
                    String a2 = w2b1.a(str10);
                    ab4 ab4Var2 = cVar2.e;
                    int i9 = cVar2.f;
                    bitmap2 = ffx.c0(ab4Var2.a.l(str2, a2, null, hb4Var), i9, i9, Bitmap.Config.ARGB_8888);
                }
                w0 w0Var2 = new w0();
                if (str8 != null) {
                    hVar.b.getClass();
                    str3 = str8;
                }
                w0Var2.a = str3;
                w0Var2.b = IconCompat.b(bitmap2);
                return w0Var2.a();
            case 8:
                ((qzy0) obj3).b.d((oll0) obj, (fzy0) obj2);
                return zy11Var;
            case 9:
                ((qzy0) obj3).c.c((oll0) obj, (ArrayList) obj2);
                return zy11Var;
            case 10:
                ((tls) obj3).invoke(new k3z0((String) obj, ((r3z0) obj2).f));
                return zy11Var;
            case 11:
                ((tls) obj3).invoke(new m3z0((String) obj, ((t3z0) obj2).e));
                return zy11Var;
            case 12:
                String str11 = (String) obj3;
                rm5 rm5Var = (rm5) obj2;
                v3z0 v3z0Var = (v3z0) obj;
                u2z0 u2z0Var = v3z0Var.a;
                if (str11 == null) {
                    str11 = ((avj0) ((zuj0) rm5Var.d)).h(kyh0.benefits_center_promo_default_error);
                }
                return v3z0.a(v3z0Var, new u2z0(str11, u2z0Var.b), "", false, false);
            case 13:
                fqz0 fqz0Var = (fqz0) obj2;
                w3j0 w3j0Var = (w3j0) obj;
                ((moz0) obj3).getClass();
                if (fqz0Var instanceof tpz0) {
                    str = "show_map_tolls_routestats_loading";
                } else if (fqz0Var instanceof spz0) {
                    str = "show_map_tolls_routestats_confirmed";
                } else if (fqz0Var instanceof upz0) {
                    str = "show_routestats_has_tolls";
                } else if (fqz0Var instanceof vpz0) {
                    str = "show_use_toll_route_enabled";
                } else if (fqz0Var instanceof rpz0) {
                    str = "show_has_toll_and_free_routes";
                } else if (fqz0Var instanceof dqz0) {
                    str = "skip_toll_roads_v2_enabled";
                } else if (fqz0Var instanceof zpz0) {
                    str = "skip_tariff_toll_roads_disabled";
                } else if (fqz0Var instanceof cqz0) {
                    str = "skip_experiment_disabled";
                } else if (fqz0Var instanceof eqz0) {
                    str = "skip_user_already_selected_road";
                } else if (fqz0Var instanceof aqz0) {
                    str = "skip_time_threshold_exceeded";
                } else if (fqz0Var instanceof bqz0) {
                    str = "skip_toll_road_only_warning";
                } else if (fqz0Var instanceof ypz0) {
                    str = "skip_routestats_no_tolls";
                } else {
                    if (!(fqz0Var instanceof xpz0)) {
                        w511.b();
                        return null;
                    }
                    str = "skip_no_toll_route";
                }
                w3j0Var.a.put("showState", str);
                w3j0Var.g("shouldShow", fqz0Var instanceof wpz0);
                return w3j0Var;
            case 14:
                quz0 quz0Var = (quz0) obj3;
                tls tlsVar = (tls) obj2;
                tlsVar.invoke(quz0Var.e);
                return new te4(20, quz0Var, tlsVar);
            case 15:
                rzx rzxVar = (rzx) obj;
                ((oz40) obj3).setValue(new wu60(rzxVar.m(0L)));
                ((yx40) obj2).setValue((int) (rzxVar.e() >> 32));
                return zy11Var;
            case 16:
                l3t0 l3t0Var = ((ypv0) obj3).c;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                Object obj4 = ((zpv0) obj2).a;
                if (intValue == 0) {
                    l3t0Var.remove(obj4);
                } else {
                    l3t0Var.put(obj4, num);
                }
                return zy11Var;
            case 17:
                updateActions$lambda$1 = TopCircleButtonsView.updateActions$lambda$1((ArrayList) obj3, (TopCircleButtonsView) obj2, (cwz0) obj);
                return Boolean.valueOf(updateActions$lambda$1);
            case 18:
                v301 v301Var = (v301) obj2;
                OrderCardView orderCardView = (OrderCardView) ((View) obj);
                return new v501(orderCardView, v301Var.a, tn70.a, (f2z) v301Var.b.get(), orderCardView, (w301) obj3);
            case 19:
                return q791.d((f530) obj, false, null, null, new i5y0(i2, (tls) obj3, (wts0) obj2), 15);
            case 20:
                pvs0 pvs0Var = (pvs0) obj3;
                ((wls) obj2).invoke(((Boolean) obj).booleanValue() ? pvs0Var.b : pvs0Var.c, pvs0Var.d);
                return zy11Var;
            case 21:
                nc01 nc01Var = (nc01) obj3;
                List list = nc01Var.c;
                ((m6y) ((u6y) obj)).f(list.size(), null, new pcx0(list, 5), new a(2039820996, new yc0(15, list, nc01Var, (tls) obj2), true));
                return zy11Var;
            case 22:
                ((Boolean) obj).getClass();
                ((tls) obj3).invoke(((ed01) obj2).b);
                return zy11Var;
            case 23:
                uv6 uv6Var = (uv6) ((wpy0) obj2).b;
                bd01 bd01Var = (bd01) obj;
                jhu0 jhu0Var = (jhu0) ((uv6) obj3).I;
                jhu0Var.getClass();
                if (jl40.l(bd01Var, zc01.a)) {
                    uv6Var.r(new qu(i3));
                } else if (bd01Var instanceof ad01) {
                    r0 r0Var = ((hd01) jhu0Var.a).a;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new gd01(((gd01) value).a, "")));
                } else {
                    if (!(bd01Var instanceof yc01)) {
                        w511.b();
                        return null;
                    }
                    uv6Var.r(new f0z0(24, r9));
                }
                return zy11Var;
            case 24:
                commentValidator_delegate$lambda$2$lambda$0 = TransferCommentView.commentValidator_delegate$lambda$2$lambda$0((TransferCommentView) obj3, (Context) obj2, ((Integer) obj).intValue());
                return commentValidator_delegate$lambda$2$lambda$0;
            case 25:
                n70 n70Var = (n70) obj3;
                CircleButtonsListView circleButtonsListView = ((u961) n70Var.N).b;
                circleButtonsListView.render(((ytb) n70Var.Z()).a);
                circleButtonsListView.setOnButtonClickListener(new ej01((tj01) obj2, i4));
                return zy11Var;
            case 26:
                renderInfo$lambda$66$lambda$65 = TransferMainFragment.renderInfo$lambda$66$lambda$65((TransferMainFragment) obj3, (TextView) obj2, (String) obj);
                return renderInfo$lambda$66$lambda$65;
            case 27:
                ResultStatus resultStatus = (ResultStatus) obj3;
                nh01 nh01Var = (nh01) obj2;
                kk01 kk01Var = (kk01) obj;
                String str12 = nh01Var.b;
                Text.Constant i10 = str12 != null ? g8e.i(Text.Companion, str12) : null;
                String str13 = nh01Var.c;
                return kk01.a(kk01Var, null, resultStatus, null, null, i10, str13 != null ? g8e.i(Text.Companion, str13) : null, null, null, null, null, null, 8091);
            case 28:
                TransferResultPageEntity transferResultPageEntity = (TransferResultPageEntity) obj2;
                cqg cqgVar = (cqg) ((dqg) obj3);
                ResultStatus resultStatus2 = ((yr01) cqgVar.a).a;
                Text.Constant i11 = g8e.i(Text.Companion, transferResultPageEntity.getTitle());
                Text.Constant constant = new Text.Constant(transferResultPageEntity.getDescription());
                yr01 yr01Var = (yr01) cqgVar.a;
                return kk01.a((kk01) obj, transferResultPageEntity, resultStatus2, yr01Var.c, null, i11, constant, null, yr01Var.d, yr01Var.e, null, null, 6546);
            default:
                wjq0 wjq0Var = (wjq0) obj2;
                wk01 wk01Var = (wk01) obj;
                String transferId = ((SelectedPartner) obj3).getTransferId();
                boolean z = wjq0Var instanceof gjq0;
                return wk01.b(wk01Var, z ? ((gjq0) wjq0Var).d : wk01Var.c, z ? ((gjq0) wjq0Var).c : wk01Var.d, null, null, null, null, null, null, null, null, null, null, null, false, false, transferId, TransferMainState$Success$OpenScenario.NONE, false, null, false, null, null, null, null, null, null, null, -3145741, 15);
        }
    }

    public /* synthetic */ rmy0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
