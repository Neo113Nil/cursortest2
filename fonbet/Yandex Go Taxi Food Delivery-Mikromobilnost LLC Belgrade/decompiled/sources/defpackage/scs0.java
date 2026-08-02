package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.widget.ImageView;
import androidx.compose.runtime.snapshots.SnapshotStateList$Companion$CREATOR$1;
import com.lightside.slab.SlotView;
import com.lightside.slab.c;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.StopSelectorButtonAction;
import com.yandex.go.preorder.navigation.n;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.ThreadAtStop;
import com.yandex.messaging.core.net.entities.StickerPacksBucket;
import com.yandex.messaging.core.net.entities.StickerPacksData;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.b;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.PartnerSelectionSavingState;
import com.ybsdk.feature.stories.api.StoriesScreensParams;
import com.ybsdk.feature.stories.internal.screens.stories.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.h;

/* loaded from: classes15.dex */
public final /* synthetic */ class scs0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ scs0(ImageView imageView, bzs0 bzs0Var, czs0 czs0Var) {
        this.a = 9;
        this.b = imageView;
        this.c = czs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        Object createFromParcel$lambda$0;
        Object value2;
        Object value3;
        Integer num;
        zy11 secondaryMediaInfo$lambda$0;
        int i = this.a;
        int i2 = 0;
        Object[] objArr = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj3;
                PlusTarifficatorPurchase plusTarifficatorPurchase = ((ind0) obj2).b;
                String str = ((spd0) obj).a;
                bVar.D.a(plusTarifficatorPurchase.getOffer(), str);
                r0 r0Var = bVar.E;
                ocs0 ocs0Var = new ocs0(str, false, bVar.W(plusTarifficatorPurchase));
                r0Var.getClass();
                r0Var.m(null, ocs0Var);
                return zy11Var;
            case 1:
                g641 g641Var = (g641) obj2;
                r0 r0Var2 = ((ru.yandex.taxi.logistics.ndd_map.walkroute.b) obj3).c.a;
                do {
                    value = r0Var2.getValue();
                    ((Boolean) value).getClass();
                } while (!r0Var2.k(value, Boolean.FALSE));
                g641Var.detach();
                return zy11Var;
            case 2:
                c cVar = (c) obj3;
                cVar.a(((SlotView) obj).insert((ins0) obj2));
                cVar.d = null;
                return zy11Var;
            case 3:
                SlideableModalView slideableModalView = (SlideableModalView) obj2;
                t1w t1wVar = (t1w) obj;
                if (((h) obj3).d.get_cardMode() == SlideableModalView.CardMode.FULLSCREEN) {
                    slideableModalView.setTopSystemWindowInset(t1wVar.b);
                } else {
                    slideableModalView.setPadding(slideableModalView.getPaddingLeft(), t1wVar.b, slideableModalView.getPaddingRight(), slideableModalView.getPaddingBottom());
                }
                return zy11Var;
            case 4:
                ((Boolean) obj).booleanValue();
                ((tls) obj3).invoke(((fvs0) obj2).c);
                return zy11Var;
            case 5:
                ((Boolean) obj).booleanValue();
                ((tls) obj3).invoke(((wus0) obj2).c);
                return zy11Var;
            case 6:
                ((Boolean) obj).booleanValue();
                ((tls) obj3).invoke(((cvs0) obj2).c);
                return zy11Var;
            case 7:
                ((Boolean) obj).booleanValue();
                ((tls) obj3).invoke(((dvs0) obj2).d);
                return zy11Var;
            case 8:
                return new te4(15, (ExecutorService) obj3, (Context) obj2);
            case 9:
                czs0 czs0Var = (czs0) obj2;
                float width = r0.getWidth() / czs0Var.d;
                float height = r0.getHeight() / czs0Var.e;
                Matrix matrix = new Matrix();
                matrix.setScale(width, height);
                matrix.postTranslate((-czs0Var.b) * width, (-czs0Var.c) * height);
                ((ImageView) obj3).setImageMatrix(matrix);
                return zy11Var;
            case 10:
                createFromParcel$lambda$0 = SnapshotStateList$Companion$CREATOR$1.createFromParcel$lambda$0((Parcel) obj3, (ClassLoader) obj2, ((Integer) obj).intValue());
                return createFromParcel$lambda$0;
            case 11:
                ((com.yandex.go.preorder.map.b) obj3).a((zzs) obj2, (gmb0) obj);
                return zy11Var;
            case 12:
                n nVar = (n) obj3;
                xse0 xse0Var = (xse0) obj2;
                Result result = (Result) obj;
                Object value4 = result.getValue();
                if (!(value4 instanceof Result.Failure)) {
                    nVar.Y(xse0Var);
                }
                Throwable a = Result.a(result.getValue());
                if (a != null) {
                    jst.e.k(new IllegalStateException(a), "Failed to authorize user after direct auth command");
                    nVar.Z();
                }
                return zy11Var;
            case 13:
                sst0 sst0Var = (sst0) obj;
                PartnerSelectionSavingState partnerSelectionSavingState = PartnerSelectionSavingState.Success;
                List list = sst0Var.d;
                List A = j73.A(new c5z[]{(c5z) obj3, (c5z) obj2});
                ArrayList arrayList = new ArrayList(tcc.n(A, 10));
                Iterator it = A.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c5z) it.next()).a);
                }
                Set N0 = a.N0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (!N0.contains(((c5z) obj4).a)) {
                        arrayList2.add(obj4);
                    }
                }
                return sst0.a(sst0Var, partnerSelectionSavingState, a.m0(A, arrayList2), 22);
            case 14:
                com.ybsdk.utils.b bVar2 = (com.ybsdk.utils.b) obj3;
                ((Boolean) obj).getClass();
                if (((Ref$BooleanRef) obj2).element) {
                    ew2 ew2Var = bVar2.f.d;
                    kgx kgxVar = com.ybsdk.persistence.b.l[1];
                    ew2Var.d(false);
                    r0 r0Var3 = ((vvt0) bVar2.d).d;
                    Boolean bool = Boolean.FALSE;
                    r0Var3.getClass();
                    r0Var3.m(null, bool);
                } else {
                    bVar2.getClass();
                }
                bVar2.g = false;
                return zy11Var;
            case 15:
                return new te4(17, (dhd) obj3, obj2);
            case 16:
                ((lbu0) obj).n1();
                ((abu0) obj3).G.a((Uri) obj2, DeeplinkSource.TOTW_COMMUNICATIONS);
                return zy11Var;
            case 17:
                ((dcu0) obj3).b.c((oll0) obj, (List) obj2);
                return zy11Var;
            case 18:
                String[] strArr = (String[]) obj3;
                StickerPacksBucket stickerPacksBucket = (StickerPacksBucket) obj2;
                at2 at2Var = (at2) obj;
                ccu0 r = at2Var.r();
                r.a();
                ArrayList arrayList3 = new ArrayList(strArr.length);
                int length = strArr.length;
                int i3 = 0;
                while (i2 < length) {
                    arrayList3.add(new ecu0(i3, strArr[i2]));
                    i2++;
                    i3++;
                }
                r.d(a.J0(arrayList3));
                at2Var.S().b(stickerPacksBucket.version, "sticker_packs");
                return null;
            case 19:
                ((idu0) obj3).b.d((oll0) obj, (gcu0) obj2);
                return zy11Var;
            case 20:
                ((idu0) obj3).c.d((oll0) obj, (ubu0) obj2);
                return zy11Var;
            case 21:
                return ((xen) obj3).mo104apply((odu0) obj2);
            case 22:
                odu0 odu0Var = (odu0) obj2;
                for (StickerPacksData.PackData packData : (StickerPacksData.PackData[]) obj3) {
                    odu0Var.getClass();
                    StickerPacksData.StickerData[] stickerDataArr = packData.stickers;
                    if (packData.coverId == null) {
                        if (stickerDataArr != null && stickerDataArr.length != 0) {
                            packData.coverId = stickerDataArr[0].stickerId;
                        }
                    }
                    odu0Var.b().a(packData.packId);
                    odu0Var.b().b(packData.packId);
                    odu0Var.b().j(new gcu0(null, packData.packId, packData.coverId, packData.title, packData.description, false));
                    if (stickerDataArr != null) {
                        irv irvVar = new irv(new h8(1, stickerDataArr));
                        while (irvVar.c.hasNext()) {
                            hrv hrvVar = (hrv) irvVar.next();
                            int i4 = hrvVar.a;
                            StickerPacksData.StickerData stickerData = (StickerPacksData.StickerData) hrvVar.b;
                            gdu0 b = odu0Var.b();
                            String str2 = stickerData.stickerId;
                            String str3 = stickerData.text;
                            String str4 = packData.packId;
                            b.i(new ubu0(i4, null, str2, str4, str4, str3));
                        }
                    }
                }
                return zy11Var;
            case 23:
                odu0 odu0Var2 = (odu0) obj3;
                zfi0 zfi0Var = (zfi0) obj2;
                odu0Var2.getClass();
                List list2 = zfi0Var.e;
                gdu0 b2 = odu0Var2.b();
                String str5 = zfi0Var.c;
                b2.a(str5);
                odu0Var2.b().b(str5);
                odu0Var2.b().j(new gcu0(null, zfi0Var.c, zfi0Var.b, zfi0Var.d, "", true));
                Iterator it2 = list2.iterator();
                while (true) {
                    int i5 = i2;
                    if (!it2.hasNext()) {
                        return zy11Var;
                    }
                    i2 = i5 + 1;
                    yfi0 yfi0Var = (yfi0) it2.next();
                    odu0Var2.b().i(new ubu0(i5, Long.valueOf(yfi0Var.d), yfi0Var.a, zfi0Var.c, yfi0Var.b, yfi0Var.c));
                }
            case 24:
                sdu0.j((sdu0) obj3, (String[]) obj2);
                return zy11Var;
            case 25:
                ru.yandex.taxi.masstransit.stopbubble.interactor.a aVar = (ru.yandex.taxi.masstransit.stopbubble.interactor.a) obj3;
                return aVar.b.b((LineAtStop) obj2, (ThreadAtStop) obj, aVar.c.d());
            case 26:
                ss9 ss9Var = (ss9) obj3;
                ss9 ss9Var2 = (ss9) ((l7s0) obj2).a;
                ihu0 ihu0Var = (ihu0) obj;
                w310 w310Var = (w310) ss9Var.K;
                clq0 clq0Var = (clq0) ss9Var.L;
                ehu0 ehu0Var = ehu0.a;
                ghu0 ghu0Var = ghu0.a;
                if (clq0Var != null) {
                    String str6 = clq0Var.d;
                    String str7 = clq0Var.c;
                    String str8 = clq0Var.a;
                    if (jl40.l(ihu0Var, ghu0Var)) {
                        w310Var.c(str8, StopSelectorButtonAction.Back, str7, str6);
                    } else if (ihu0Var instanceof hhu0) {
                        w310Var.c(str8, StopSelectorButtonAction.Stop, str7, str6);
                    } else if (!jl40.l(ihu0Var, ehu0Var) && !jl40.l(ihu0Var, fhu0.a)) {
                        w511.b();
                        return null;
                    }
                }
                r0 r0Var4 = ((qhu0) ((jhu0) ss9Var.J).a).a;
                if (jl40.l(ihu0Var, ghu0Var)) {
                    ss9Var2.r(new qu(9));
                } else if (ihu0Var instanceof hhu0) {
                    ss9Var2.r(new p9t0(13, ((hhu0) ihu0Var).a));
                } else if (ihu0Var instanceof fhu0) {
                    do {
                        value3 = r0Var4.getValue();
                    } while (!r0Var4.k(value3, new phu0(((phu0) value3).a, true)));
                } else {
                    if (!jl40.l(ihu0Var, ehu0Var)) {
                        w511.b();
                        return null;
                    }
                    do {
                        value2 = r0Var4.getValue();
                    } while (!r0Var4.k(value2, new phu0(((phu0) value2).a, false)));
                }
                return zy11Var;
            case 27:
                ArrayList arrayList4 = (ArrayList) obj2;
                oll0 oll0Var = (oll0) obj;
                jku0 jku0Var = ((kku0) obj3).c;
                jku0Var.getClass();
                ull0 T0 = oll0Var.T0("UPDATE OR ABORT `stored_experiments` SET `source` = ?,`name` = ?,`version` = ?,`last_update` = ? WHERE `source` = ? AND `name` = ?");
                try {
                    for (Object obj5 : arrayList4) {
                        if (obj5 != null) {
                            jku0Var.a(T0, obj5);
                            T0.q();
                            T0.reset();
                            i2 += jx81.x(oll0Var);
                        }
                    }
                    gwk0.m(T0, null);
                    return Integer.valueOf(i2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        gwk0.m(T0, th);
                        throw th2;
                    }
                }
            case 28:
                hmu0 hmu0Var = (hmu0) obj3;
                com.ybsdk.feature.stories.internal.screens.stories.c cVar2 = (com.ybsdk.feature.stories.internal.screens.stories.c) obj;
                r8j0 r8j0Var = new r8j0(hmu0Var, objArr == true ? 1 : 0, 14);
                List list3 = hmu0Var.a;
                StoriesScreensParams storiesScreensParams = ((d) obj2).B;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            i2 = -1;
                        } else if (!jl40.l(((wou0) it3.next()).a, storiesScreensParams.getStartStoryId())) {
                            i2++;
                        }
                    }
                    num = Integer.valueOf(i2);
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == -1 && storiesScreensParams.getStartStoryId() != null) {
                    x4c.g("start_story_id not found in storyIdList", null, null, null, 14);
                }
                Integer num2 = (num == null || num.intValue() != -1) ? num : null;
                return com.ybsdk.feature.stories.internal.screens.stories.c.a(cVar2, r8j0Var, num2 != null ? num2.intValue() : cVar2.b, false, false, null, 28);
            default:
                secondaryMediaInfo$lambda$0 = StoryModalView.setSecondaryMediaInfo$lambda$0((StoryModalView) obj3, (xou0) obj2, (Drawable) obj);
                return secondaryMediaInfo$lambda$0;
        }
    }

    public /* synthetic */ scs0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ scs0(com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.a aVar, c5z c5zVar, c5z c5zVar2) {
        this.a = 13;
        this.b = c5zVar;
        this.c = c5zVar2;
    }

    public /* synthetic */ scs0(h hVar, SlideableModalView slideableModalView, d230 d230Var) {
        this.a = 3;
        this.b = hVar;
        this.c = slideableModalView;
    }
}
