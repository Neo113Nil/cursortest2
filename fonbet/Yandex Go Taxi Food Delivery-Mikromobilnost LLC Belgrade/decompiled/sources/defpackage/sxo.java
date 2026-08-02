package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.semantics.f;
import androidx.core.app.w0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.room.RoomDatabase;
import com.yandex.go.address.models.PlaceType;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.d;
import com.yandex.messaging.internal.authorized.chat.notifications.c;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import com.yandex.xplat.common.Encoding;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Ref$IntRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes15.dex */
public final /* synthetic */ class sxo implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sxo(tls tlsVar, mfz0 mfz0Var) {
        this.a = 5;
        this.c = tlsVar;
        this.b = mfz0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 addSuggestedAddress$lambda$1;
        zy11 searchAddress$lambda$0;
        nas nasVar;
        zy11 onPeriodSelected$lambda$7;
        zy11 initProperties$lambda$1;
        int i = this.a;
        String str = "";
        int i2 = 2;
        int i3 = 0;
        String str2 = null;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = ((xxo) obj3).a;
                ((m6y) ((u6y) obj)).f(arrayList.size(), null, new oob(2, txo.a, arrayList), new a(802480018, new pob(i2, (tls) obj2, arrayList), true));
                return zy11Var;
            case 1:
                ((kdn) ((zsa) obj3).E).getClass();
                ((n2p) obj).a.invoke(kdn.c((hfa0) obj2));
                return zy11Var;
            case 2:
                return new ru.yandex.taxi.favorites.list.ui.adapter.holder.a((ListItemComponent) obj, (e) obj3, (o1c) obj2);
            case 3:
                addSuggestedAddress$lambda$1 = FavoritesFragment.addSuggestedAddress$lambda$1((FavoritesFragment) obj3, (PlaceType) obj2, (pv0) obj);
                return addSuggestedAddress$lambda$1;
            case 4:
                searchAddress$lambda$0 = FavoritesFragment.searchAddress$lambda$0((FavoritesFragment) obj3, (tls) obj2, (pv0) obj);
                return searchAddress$lambda$0;
            case 5:
                ((Boolean) obj).booleanValue();
                ((tls) obj2).invoke((mfz0) obj3);
                return zy11Var;
            case 6:
                cgz0 cgz0Var = (cgz0) obj3;
                tls tlsVar = (tls) obj2;
                u6y u6yVar = (u6y) obj;
                ArrayList arrayList2 = cgz0Var.a;
                l0o l0oVar = cgz0Var.b ? new l0o(29) : null;
                ((m6y) u6yVar).f(arrayList2.size(), l0oVar != null ? new ly7(l0oVar, arrayList2) : null, new oob(3, etq.a, arrayList2), new a(802480018, new pob(3, tlsVar, arrayList2), true));
                return zy11Var;
            case 7:
                jln jlnVar = (jln) obj3;
                String str3 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return zmx.d(zy11Var);
                }
                wwf wwfVar = (wwf) jlnVar.b;
                return w0b1.a((wh6) wwfVar.b, (xh6) wwfVar.c, new xc8(wwfVar, str3, new hay(i4)));
            case 8:
                t1r t1rVar = (t1r) obj3;
                jln jlnVar2 = t1rVar.a;
                String str4 = t1rVar.b.b;
                Encoding encoding = Encoding.Utf8;
                wwf wwfVar2 = (wwf) jlnVar2.b;
                return w0b1.a((wh6) wwfVar2.b, (xh6) wwfVar2.c, new sb0(wwfVar2, str4, (String) obj2, new aj31(13, encoding), 27));
            case 9:
                v1r v1rVar = (v1r) obj3;
                String str5 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return zmx.d(new qfr(new ArrayList(), new LinkedHashMap()));
                }
                jln jlnVar3 = v1rVar.a;
                Encoding encoding2 = Encoding.Utf8;
                wwf wwfVar3 = (wwf) jlnVar3.b;
                md51 j = ymx.j(w0b1.a((wh6) wwfVar3.b, (xh6) wwfVar3.c, new jhd(wwfVar3, str5, new aye0(9, encoding2))), new u1r(v1rVar, i2), null, 5);
                xvq xvqVar = new xvq(i4);
                ymx ymxVar = (ymx) j;
                ymxVar.getClass();
                return ymx.j(ymxVar, xvqVar, null, 5);
            case 10:
                return new te4(7, (wg6) obj3, (fer) obj2);
            case 11:
                com.yandex.urbanads.internal.flex.a aVar = (com.yandex.urbanads.internal.flex.a) obj3;
                uir uirVar = (uir) obj2;
                jyl jylVar = (jyl) obj;
                aVar.invoke(jylVar);
                v3a1.b(jylVar, uirVar.h, aVar, uirVar.y);
                return zy11Var;
            case 12:
                ((ay40) ((zx40) obj3)).b((g8w) obj2);
                return zy11Var;
            case 13:
                Set set = (Set) obj2;
                ull0 T0 = ((oll0) obj).T0((String) obj3);
                try {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        T0.b(i4, ((Number) it.next()).longValue());
                        i4++;
                    }
                    T0.q();
                    T0.close();
                    return zy11Var;
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            case 14:
                ((gwr) obj3).d.c((oll0) obj, (HashSet) obj2);
                return zy11Var;
            case 15:
                ((gwr) obj3).e.c((oll0) obj, (ArrayList) obj2);
                return zy11Var;
            case 16:
                gwr gwrVar = (gwr) obj3;
                SetBuilder setBuilder = (SetBuilder) obj2;
                ArrayList arrayList3 = new ArrayList(tcc.n(setBuilder, 10));
                Iterator<E> it2 = setBuilder.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ywr) it2.next()).c);
                }
                androidx.room.util.a.b(gwrVar.a, false, true, new awr(gwrVar, kotlin.collections.a.N0(arrayList3), i4));
                RoomDatabase roomDatabase = gwrVar.a;
                ArrayList arrayList4 = new ArrayList(tcc.n(setBuilder, 10));
                Iterator<E> it3 = setBuilder.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((ywr) it3.next()).a);
                }
                androidx.room.util.a.b(roomDatabase, false, true, new awr(gwrVar, kotlin.collections.a.N0(arrayList4), i3));
                ArrayList arrayList5 = new ArrayList();
                Iterator<E> it4 = setBuilder.iterator();
                while (it4.hasNext()) {
                    ycc.r(((ywr) it4.next()).b, arrayList5);
                }
                androidx.room.util.a.b(roomDatabase, false, true, new sxo(15, gwrVar, arrayList5));
                return zy11Var;
            case 17:
                ArrayList arrayList6 = (ArrayList) obj2;
                l020 l020Var = (l020) obj;
                g4r g4rVar = (g4r) ((i3y) ((jdj) obj3).w).getValue();
                androidx.room.util.a.b(g4rVar.a, false, true, new f4r(g4rVar, arrayList6, i3));
                jdj jdjVar = l020Var.x;
                ph9 ph9Var = l020Var.z;
                Iterator it5 = ((List) androidx.room.util.a.b(((at2) jdjVar.c).c().a, true, false, new teb(i3))).iterator();
                while (it5.hasNext()) {
                    jdjVar.r((udb) it5.next(), arrayList6, ph9Var);
                }
                return zy11Var;
            case 18:
                com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.a aVar2 = (com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.a) obj2;
                was wasVar = (was) obj;
                fl1 fl1Var = ((was) obj3).b;
                if (fl1Var != null) {
                    String str6 = fl1Var.a;
                    String str7 = fl1Var.b;
                    String str8 = fl1Var.c;
                    AgreementImageEntity agreementImageEntity = fl1Var.d;
                    nas nasVar2 = new nas(new sl(str6, str7, str8, com.ybsdk.feature.transfer.version2.api.mappers.a.j(agreementImageEntity != null ? agreementImageEntity.getBottomSheetImage() : null), null, null, null));
                    aVar2.H.b.l.a.a("card.main_screen.sbpay.connecting_account.click", null);
                    nasVar = nasVar2;
                } else {
                    nasVar = null;
                }
                return was.a(wasVar, null, nasVar, null, false, HProv.PP_PASSWD_TERM);
            case 19:
                ygs ygsVar = (ygs) obj3;
                ghs ghsVar = (ghs) obj2;
                if (ghsVar instanceof ahs) {
                    ygsVar.T(ghsVar, "shown");
                } else if (ghsVar instanceof bhs) {
                    ygsVar.T(ghsVar, "shown");
                } else if (ghsVar instanceof dhs) {
                    dfm0 dfm0Var = (dfm0) ygsVar.K;
                    String str9 = ((dhs) ghsVar).c.d;
                    i d = ((j) dfm0Var.a).d("DeleteSBP.Modal.Shown");
                    d.d("choosen_bank", str9);
                    d.m();
                } else if (ghsVar instanceof fhs) {
                    ygsVar.T(ghsVar, "shown");
                } else if (ghsVar instanceof chs) {
                    ygsVar.T(ghsVar, "shown");
                } else if (ghsVar instanceof ehs) {
                    ygsVar.T(ghsVar, "shown");
                } else {
                    if (!(ghsVar instanceof zgs)) {
                        w511.b();
                        return null;
                    }
                    String name = ((zgs) ghsVar).d.getName();
                    u8w u8wVar = (u8w) ((c1x0) ygsVar.N).a;
                    u8wVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("loyalty_program", name);
                    u8wVar.a.a("LoyaltyProgram.ExitConfirmationScreen.Shown", hashMap, 1, new HashMap());
                }
                return zy11Var;
            case 20:
                onPeriodSelected$lambda$7 = FundIncomeWidgetView.onPeriodSelected$lambda$7((ArrayList) obj3, (FundIncomeWidgetView) obj2, ((Float) obj).floatValue());
                return onPeriodSelected$lambda$7;
            case 21:
                CompletableFuture completableFuture = (CompletableFuture) obj3;
                try {
                    completableFuture.complete(((noh) obj2).c());
                } catch (Throwable th2) {
                    completableFuture.completeExceptionally(th2);
                }
                return zy11Var;
            case 22:
                initProperties$lambda$1 = GiftProgressView.initProperties$lambda$1((GiftProgressView) obj3, (ght) obj2, ((Float) obj).floatValue());
                return initProperties$lambda$1;
            case 23:
                dya0 dya0Var = (dya0) obj2;
                List list = (List) obj;
                List list2 = (List) obj3;
                ArrayList arrayList7 = new ArrayList(tcc.n(list2, 10));
                int i5 = 0;
                for (Object obj4 : list2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        scc.m();
                        throw null;
                    }
                    cya0 cya0Var = (cya0) obj4;
                    Boolean bool = (Boolean) kotlin.collections.a.S(i5, list);
                    arrayList7.add(new mya0(cya0Var, bool != null ? bool.booleanValue() : false, i2));
                    i5 = i6;
                }
                dya0Var.a(arrayList7);
                return zy11Var;
            case 24:
                d dVar = (d) obj2;
                ii60 ii60Var = (ii60) obj;
                String str10 = ii60Var.f;
                String str11 = ii60Var.e;
                Bitmap bitmap = (Bitmap) ((Map) obj3).get(str11);
                if (bitmap == null) {
                    c cVar = dVar.w;
                    cVar.getClass();
                    String str12 = str10 == null ? "" : str10;
                    if (ChatNamespaces.b(cVar.b.b)) {
                        str = cVar.a.a();
                    } else if (str11 != null) {
                        str = str11;
                    }
                    String a = w2b1.a(str12);
                    ab4 ab4Var = cVar.e;
                    int i7 = cVar.f;
                    bitmap = ffx.c0(ab4Var.a.l(str, a, null, hb4.a), i7, i7, Bitmap.Config.ARGB_8888);
                }
                w0 w0Var = new w0();
                if (str10 != null) {
                    dVar.b.getClass();
                    str2 = str10;
                }
                w0Var.a = str2;
                w0Var.b = IconCompat.b(bitmap);
                return w0Var.a();
            case 25:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj2;
                w610 w610Var = (w610) obj;
                if (ref$IntRef.element == -1) {
                    ref$IntRef.element = w610Var.b().a;
                }
                ref$IntRef2.element = w610Var.b().b + 1;
                return "";
            case 26:
                yex0 yex0Var = (yex0) obj3;
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.l(mnq0Var, yex0Var.c);
                f.f(mnq0Var, yex0Var.d, new azd(28, (tls) obj2));
                return zy11Var;
            case 27:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.l(mnq0Var2, (String) obj3);
                f.m(mnq0Var2, scc.h((nif) obj2));
                return zy11Var;
            case 28:
                ((View) obj3).setVisibility(0);
                ((sls) obj2).invoke();
                return zy11Var;
            default:
                String str13 = (String) obj2;
                ez40 ez40Var = (ez40) obj;
                ez40Var.g(xeu.d, str13);
                ((xeu) obj3).d(ez40Var, str13);
                return null;
        }
    }

    public /* synthetic */ sxo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
