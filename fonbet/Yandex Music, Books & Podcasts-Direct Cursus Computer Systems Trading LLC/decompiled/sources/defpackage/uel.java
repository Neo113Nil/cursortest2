package defpackage;

import android.util.LruCache;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.concert.ConcertShortDto;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersAnalyticsPayloadDto;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersApi;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersBatchRequestDto;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersDonationGoalDto;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersItemDto;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersItemInBatchDto;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersResponseDto;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersTrackDto;
import com.yandex.music.shared.player.informer.data.network.a;
import com.yandex.music.shared.player.informer.data.network.dto.PlayerInformersCommonDto;
import com.yandex.music.shared.player.informer.data.network.dto.PlayerInformersCommonImageDto;
import com.yandex.music.shared.player.informer.data.network.dto.PlayerInformersConcertDto;
import com.yandex.music.shared.player.informer.data.network.dto.PlayerInformersDonationDto;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class uel {
    public final rfl a;
    public final PlayerInformersApi b;
    public final rw5 c;
    public final mm6 d;
    public final jyr e;
    public final qzc f;
    public final jyr g;

    public uel(rfl rflVar, PlayerInformersApi playerInformersApi, rw5 rw5Var) {
        mn7 mn7Var = dm6.b;
        g.a.getClass();
        mn7Var.getClass();
        tf6 tf6Var = new tf6(mn7Var);
        rflVar.getClass();
        playerInformersApi.getClass();
        rw5Var.getClass();
        this.a = rflVar;
        this.b = playerInformersApi;
        this.c = rw5Var;
        this.d = tf6Var;
        final int i = 0;
        jyr b = btf.b(new Function0(this) { // from class: pel
            public final /* synthetic */ uel b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        this.b.a.getClass();
                        return oel.a;
                    default:
                        return new a(this.b.a);
                }
            }
        });
        this.e = b;
        ((oel) b.getValue()).getClass();
        this.f = new qzc(21, (byte) 0);
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: pel
            public final /* synthetic */ uel b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        this.b.a.getClass();
                        return oel.a;
                    default:
                        return new a(this.b.a);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01bb, code lost:
    
        if (r12 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b0, code lost:
    
        if (r12 == null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, wdl] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, cg6 cg6Var) {
        rel relVar;
        int i;
        bii biiVar;
        f9h b;
        ?? r12;
        PlayerInformersDonationGoalDto goal;
        String title;
        h06 C;
        Object tdlVar;
        ?? r5;
        Boolean isTintable;
        vdl a;
        Object obj;
        ArrayList<mqs> arrayList2 = arrayList;
        if (cg6Var instanceof rel) {
            relVar = (rel) cg6Var;
            int i2 = relVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                relVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = relVar.k;
                nm6 nm6Var = nm6.a;
                i = relVar.m;
                jyr jyrVar = this.g;
                Throwable th = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    ((a) jyrVar.getValue()).getClass();
                    arrayList2.getClass();
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                    for (mqs mqsVar : arrayList2) {
                        String str = mqsVar.a;
                        List list = mqsVar.f;
                        ArrayList arrayList4 = new ArrayList(v75.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((zp2) it.next()).a);
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList4 = null;
                        }
                        String str2 = mqsVar.d.a;
                        if (StringsKt.toIntOrNull(str2) == null || Intrinsics.d(str2, CommonUrlParts.Values.FALSE_INTEGER)) {
                            str2 = null;
                        }
                        arrayList3.add(new PlayerInformersTrackDto(str, arrayList4, str2));
                    }
                    PlayerInformersBatchRequestDto playerInformersBatchRequestDto = new PlayerInformersBatchRequestDto(arrayList3);
                    Long a2 = this.c.a();
                    Call<MusicBackendResponse<PlayerInformersResponseDto>> a3 = this.b.a(playerInformersBatchRequestDto, a2 != null ? String.valueOf(a2.longValue()) : null);
                    relVar.j = arrayList2;
                    relVar.m = 1;
                    obj2 = swf.N(a3, relVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList2 = relVar.j;
                    qgg.h0(obj2);
                }
                biiVar = (bii) obj2;
                if (biiVar instanceof aii) {
                    if (!(biiVar instanceof xhi)) {
                        if (biiVar instanceof yhi) {
                            yhi yhiVar = (yhi) biiVar;
                            return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                        }
                        if (biiVar instanceof zhi) {
                            return uwf.J((zhi) biiVar);
                        }
                        b6e.s();
                        return null;
                    }
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                }
                List<PlayerInformersItemInBatchDto> informers = ((PlayerInformersResponseDto) ((aii) biiVar).a).getInformers();
                if (informers == null) {
                    b = null;
                } else {
                    int size = informers.size();
                    ArrayList arrayList5 = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(((mqs) it2.next()).c);
                    }
                    ssg.a(3, "PlayerInformersBatchLoader", "fetch " + size + " informers for " + arrayList5 + " tracks", null);
                    f9h f9hVar = new f9h();
                    for (PlayerInformersItemInBatchDto playerInformersItemInBatchDto : informers) {
                        a aVar = (a) jyrVar.getValue();
                        if (playerInformersItemInBatchDto != null) {
                            aVar.getClass();
                            arrayList2.getClass();
                            Integer indexInBatch = playerInformersItemInBatchDto.getIndexInBatch();
                            mqs mqsVar2 = (mqs) CollectionsKt.S(arrayList2, indexInBatch != null ? indexInBatch.intValue() : -1);
                            if (mqsVar2 != null) {
                                rr5 d = mqsVar2.d();
                                vdl vdlVar = new vdl(d);
                                String error = playerInformersItemInBatchDto.getError();
                                if (error == null || StringsKt.U(error)) {
                                    PlayerInformersItemDto informer = playerInformersItemInBatchDto.getInformer();
                                    if (informer instanceof PlayerInformersItemDto.Concert) {
                                        String artistId = playerInformersItemInBatchDto.getArtistId();
                                        r12 = artistId;
                                    } else {
                                        if (informer instanceof PlayerInformersItemDto.Donation) {
                                            String artistId2 = playerInformersItemInBatchDto.getArtistId();
                                            r12 = artistId2;
                                        } else {
                                            r12 = th;
                                        }
                                        if (r12 != 0) {
                                            List list2 = mqsVar2.f;
                                            ?? arrayList6 = new ArrayList(v75.o(list2, 10));
                                            Iterator it3 = list2.iterator();
                                            while (it3.hasNext()) {
                                                arrayList6.add(((zp2) it3.next()).a);
                                            }
                                            if (!arrayList6.contains(r12)) {
                                                ?? m = f1d.m("server responded with artist_id=", r12, " which is not found in track=", mqsVar2.a, " artists=");
                                                m.append(arrayList6);
                                                ssg.a(6, "PlayerInformersNetworkConverter", m.toString(), null);
                                                r5 = 0;
                                            }
                                        }
                                        PlayerInformersItemDto informer2 = playerInformersItemInBatchDto.getInformer();
                                        if (informer2 instanceof PlayerInformersItemDto.Common) {
                                            PlayerInformersCommonDto commonInformer = ((PlayerInformersItemDto.Common) playerInformersItemInBatchDto.getInformer()).getCommonInformer();
                                            if (commonInformer != null) {
                                                PlayerInformersAnalyticsPayloadDto analyticsPayload = playerInformersItemInBatchDto.getAnalyticsPayload();
                                                String segment = analyticsPayload != null ? analyticsPayload.getSegment() : null;
                                                String linkUrl = commonInformer.getLinkUrl();
                                                if (linkUrl != null) {
                                                    PlayerInformersCommonImageDto image = commonInformer.getImage();
                                                    String url = image != null ? image.getUrl() : null;
                                                    PlayerInformersCommonImageDto image2 = commonInformer.getImage();
                                                    boolean booleanValue = (image2 == null || (isTintable = image2.getIsTintable()) == null) ? true : isTintable.booleanValue();
                                                    String text = commonInformer.getText();
                                                    if (text != null) {
                                                        tdlVar = new sdl(new ydl(linkUrl, url, text, booleanValue), vdlVar, segment);
                                                        r5 = tdlVar;
                                                    }
                                                }
                                            }
                                            r5 = 0;
                                        } else {
                                            if (informer2 instanceof PlayerInformersItemDto.Concert) {
                                                PlayerInformersConcertDto concertInformer = ((PlayerInformersItemDto.Concert) playerInformersItemInBatchDto.getInformer()).getConcertInformer();
                                                if (concertInformer != null && r12 != 0) {
                                                    PlayerInformersAnalyticsPayloadDto analyticsPayload2 = playerInformersItemInBatchDto.getAnalyticsPayload();
                                                    String segment2 = analyticsPayload2 != null ? analyticsPayload2.getSegment() : null;
                                                    ConcertShortDto concert = concertInformer.getConcert();
                                                    if (concert != null && (C = hag.C(concert, aVar.a.a)) != null) {
                                                        tdlVar = new tdl(C, r12, vdlVar, segment2);
                                                        r5 = tdlVar;
                                                    }
                                                }
                                            } else if (informer2 instanceof PlayerInformersItemDto.Donation) {
                                                PlayerInformersDonationDto donationInformer = ((PlayerInformersItemDto.Donation) playerInformersItemInBatchDto.getInformer()).getDonationInformer();
                                                if (donationInformer != null && r12 != 0) {
                                                    PlayerInformersAnalyticsPayloadDto analyticsPayload3 = playerInformersItemInBatchDto.getAnalyticsPayload();
                                                    String segment3 = analyticsPayload3 != null ? analyticsPayload3.getSegment() : null;
                                                    String tipUrl = donationInformer.getTipUrl();
                                                    if (tipUrl != null && (goal = donationInformer.getGoal()) != null && (title = goal.getTitle()) != null) {
                                                        if (StringsKt.U(title)) {
                                                            title = null;
                                                        }
                                                        if (title != null) {
                                                            r5 = new udl(new zdl(tipUrl, title), r12, vdlVar, segment3);
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (informer2 != null) {
                                                    b6e.s();
                                                    return null;
                                                }
                                                v3w.l("unknown player informer type: ", playerInformersItemInBatchDto.getError(), 6, "PlayerInformersNetworkConverter", null);
                                            }
                                            r5 = 0;
                                        }
                                    }
                                    if (r5 != 0 && (a = r5.a()) != null) {
                                        obj = f9hVar.get(a);
                                        if (obj == null) {
                                            obj = new ArrayList();
                                            f9hVar.put(a, obj);
                                        }
                                        ((List) obj).add(r5);
                                    }
                                } else {
                                    ssg.a(6, "PlayerInformersNetworkConverter", "can't get informer for track_id=" + d + " cause=" + playerInformersItemInBatchDto.getError(), th);
                                }
                            }
                            r5 = th;
                            if (r5 != 0) {
                                obj = f9hVar.get(a);
                                if (obj == null) {
                                }
                                ((List) obj).add(r5);
                            }
                        }
                        th = null;
                    }
                    b = f9hVar.b();
                }
                return b == null ? new nj6(null) : new qj6(b);
            }
        }
        relVar = new rel(this, cg6Var);
        Object obj22 = relVar.k;
        nm6 nm6Var2 = nm6.a;
        i = relVar.m;
        jyr jyrVar2 = this.g;
        Throwable th2 = null;
        if (i != 0) {
        }
        biiVar = (bii) obj22;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, cg6 cg6Var) {
        sel selVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof sel) {
            selVar = (sel) cg6Var;
            int i2 = selVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selVar.m = i2 - Integer.MIN_VALUE;
                Object obj = selVar.k;
                Object obj2 = nm6.a;
                i = selVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((wbn) it.next()).b);
                    }
                    selVar.j = arrayList;
                    selVar.m = 1;
                    obj = a(arrayList2, selVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = selVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    Map map = (Map) ((qj6) rj6Var).a;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        vdl vdlVar = new vdl(((wbn) it2.next()).b.d());
                        List list = (List) map.get(vdlVar);
                        if (list == null) {
                            list = c5b.a;
                        }
                        xel velVar = list.isEmpty() ? new vel(vdlVar) : new wel(vdlVar, list);
                        qzc qzcVar = this.f;
                        qzcVar.getClass();
                        ((LruCache) qzcVar.b).put(velVar.a(), velVar);
                    }
                } else if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                return rj6Var;
            }
        }
        selVar = new sel(this, cg6Var);
        Object obj3 = selVar.k;
        Object obj22 = nm6.a;
        i = selVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof qj6)) {
        }
        return rj6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(vbn vbnVar, cg6 cg6Var) {
        tel telVar;
        int i;
        List list;
        qel qelVar;
        boolean z;
        if (cg6Var instanceof tel) {
            telVar = (tel) cg6Var;
            int i2 = telVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                telVar.n = i2 - Integer.MIN_VALUE;
                Object obj = telVar.l;
                Object obj2 = nm6.a;
                i = telVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    wbn wbnVar = vbnVar.b;
                    ArrayList arrayList = vbnVar.c;
                    mqs mqsVar = wbnVar.b;
                    qzc qzcVar = this.f;
                    qzcVar.getClass();
                    xel xelVar = (xel) ((LruCache) qzcVar.b).get(new vdl(mqsVar.d()));
                    jyr jyrVar = this.e;
                    ((oel) jyrVar.getValue()).getClass();
                    list = (List) o5g.N(arrayList, vbnVar.a, null, 3).a;
                    if (xelVar != null) {
                        if (xelVar instanceof vel) {
                            List list2 = list;
                            ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((wbn) it.next()).b);
                            }
                            e5b e5bVar = e5b.a;
                            e5bVar.getClass();
                            qj6 qj6Var = new qj6(e5bVar);
                            boolean e = qzcVar.e(arrayList2);
                            boolean z2 = !e;
                            if (!e) {
                                ((oel) jyrVar.getValue()).getClass();
                                ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((wbn) it2.next()).b.c);
                                }
                                ssg.a(4, "PlayerInformersBatchLoader", "slice of 1 surrounding tracks not found in cache: " + arrayList3, null);
                            }
                            qelVar = new qel(z2, qj6Var);
                        } else {
                            if (!(xelVar instanceof wel)) {
                                b6e.s();
                                return null;
                            }
                            List list3 = list;
                            ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(((wbn) it3.next()).b);
                            }
                            wel welVar = (wel) xelVar;
                            qj6 qj6Var2 = new qj6(tah.b(new Pair(welVar.a, welVar.b)));
                            boolean e2 = qzcVar.e(arrayList4);
                            boolean z3 = !e2;
                            if (!e2) {
                                ((oel) jyrVar.getValue()).getClass();
                                ArrayList arrayList5 = new ArrayList(v75.o(list3, 10));
                                Iterator it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    arrayList5.add(((wbn) it4.next()).b.c);
                                }
                                ssg.a(4, "PlayerInformersBatchLoader", "slice of 1 surrounding tracks not found in cache: " + arrayList5, null);
                            }
                            qelVar = new qel(z3, qj6Var2);
                        }
                        z = qelVar.a;
                        rj6 rj6Var = qelVar.b;
                        if (z) {
                            List list4 = list;
                            ArrayList arrayList6 = new ArrayList(v75.o(list4, 10));
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                arrayList6.add(((wbn) it5.next()).b.c);
                            }
                            ssg.a(3, "PlayerInformersBatchLoader", f1d.h("async informer loading (slice of ", " tracks not found in cache)", arrayList6), null);
                            x97.y(this.d, null, null, new b5l(this, vbnVar, continuation, 8), 3);
                        }
                        return rj6Var;
                    }
                    ssg.a(3, "PlayerInformersBatchLoader", "await for informer loading (not found in cache)", null);
                    telVar.j = vbnVar;
                    telVar.k = list;
                    telVar.n = 1;
                    obj = b(arrayList, telVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list5 = telVar.k;
                    vbn vbnVar2 = telVar.j;
                    qgg.h0(obj);
                    list = list5;
                    vbnVar = vbnVar2;
                }
                qelVar = new qel(false, (rj6) obj);
                z = qelVar.a;
                rj6 rj6Var2 = qelVar.b;
                if (z) {
                }
                return rj6Var2;
            }
        }
        telVar = new tel(this, cg6Var);
        Object obj3 = telVar.l;
        Object obj22 = nm6.a;
        i = telVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        qelVar = new qel(false, (rj6) obj3);
        z = qelVar.a;
        rj6 rj6Var22 = qelVar.b;
        if (z) {
        }
        return rj6Var22;
    }
}
