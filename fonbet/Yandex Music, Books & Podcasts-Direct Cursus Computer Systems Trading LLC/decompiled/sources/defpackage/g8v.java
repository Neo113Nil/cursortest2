package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.wave.screen.wordsinwave.api.domain.WaveWordsAnalyticPayloadDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveScreenWordsInWaveApi;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsBigCardDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsBigCardsRequestBodyDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsCardActionDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsCardDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsCardSourceDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsCardWithMetaDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsEntityWithCardsDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsFeedbackDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsFeedbackRequestBodyDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsRequestBodyDto;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveWordsViewedBigCardDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class g8v {
    public final e0j a;
    public final jyr b;

    public g8v(e0j e0jVar) {
        e0jVar.getClass();
        this.a = e0jVar;
        this.b = btf.b(new jvu(12, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, cg6 cg6Var) {
        d8v d8vVar;
        int i;
        bii biiVar;
        String id;
        String text;
        if (cg6Var instanceof d8v) {
            d8vVar = (d8v) cg6Var;
            int i2 = d8vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d8vVar.l = i2 - Integer.MIN_VALUE;
                Object obj = d8vVar.j;
                nm6 nm6Var = nm6.a;
                i = d8vVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<List<WaveWordsBigCardDto>>> b = ((WaveScreenWordsInWaveApi) this.b.getValue()).b(new WaveWordsBigCardsRequestBodyDto(list));
                    d8vVar.l = 1;
                    obj = swf.N(b, d8vVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    List<WaveWordsBigCardDto> list2 = (List) ((aii) biiVar).a;
                    ArrayList arrayList = new ArrayList();
                    for (WaveWordsBigCardDto waveWordsBigCardDto : list2) {
                        l6v l6vVar = null;
                        if (waveWordsBigCardDto != null && (id = waveWordsBigCardDto.getId()) != null && (text = waveWordsBigCardDto.getText()) != null) {
                            l6vVar = new l6v(id, text);
                        }
                        if (l6vVar != null) {
                            arrayList.add(l6vVar);
                        }
                    }
                    return new qj6(arrayList);
                }
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
        }
        d8vVar = new d8v(this, cg6Var);
        Object obj2 = d8vVar.j;
        nm6 nm6Var2 = nm6.a;
        i = d8vVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0258, code lost:
    
        if (r1 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02c3, code lost:
    
        if (r0 != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017e, code lost:
    
        if (r11 == null) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x030e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, List list2, List list3, String str, cg6 cg6Var) {
        e8v e8vVar;
        int i;
        bii biiVar;
        Iterator it;
        Pair pair;
        String id;
        List cards;
        q7v q7vVar;
        Iterator it2;
        Iterator it3;
        q6v q6vVar;
        WaveWordsCardDto card;
        n6v n6vVar;
        List tags;
        String text;
        WaveWordsCardWithMetaDto waveWordsCardWithMetaDto;
        c5b c5bVar;
        g6v g6vVar;
        m6v m6vVar;
        String objectType;
        Iterator it4;
        Iterator it5;
        WaveWordsCardWithMetaDto waveWordsCardWithMetaDto2;
        p6v p6vVar;
        String title;
        String url;
        boolean z;
        String link;
        g6v g6vVar2;
        String objectType2;
        o6v o6vVar;
        q6v q6vVar2;
        if (cg6Var instanceof e8v) {
            e8vVar = (e8v) cg6Var;
            int i2 = e8vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e8vVar.l = i2 - Integer.MIN_VALUE;
                Object obj = e8vVar.j;
                nm6 nm6Var = nm6.a;
                i = e8vVar.l;
                boolean z2 = true;
                if (i != 0) {
                    qgg.h0(obj);
                    WaveScreenWordsInWaveApi waveScreenWordsInWaveApi = (WaveScreenWordsInWaveApi) this.b.getValue();
                    list3.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        c9v c9vVar = (c9v) it6.next();
                        String str2 = c9vVar.a;
                        Object obj2 = linkedHashMap.get(str2);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(str2, obj2);
                        }
                        ((List) obj2).add(c9vVar.b);
                    }
                    Set<Map.Entry> entrySet = linkedHashMap.entrySet();
                    ArrayList arrayList = new ArrayList(v75.o(entrySet, 10));
                    for (Map.Entry entry : entrySet) {
                        arrayList.add(new WaveWordsViewedBigCardDto((String) entry.getKey(), CollectionsKt.q0((List) entry.getValue(), 20)));
                    }
                    Call<MusicBackendResponse<List<WaveWordsEntityWithCardsDto>>> c = waveScreenWordsInWaveApi.c(new WaveWordsRequestBodyDto(list, list2, arrayList), str);
                    e8vVar.l = 1;
                    obj = swf.N(c, e8vVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
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
                List list4 = (List) ((aii) biiVar).a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it7 = list4.iterator();
                while (it7.hasNext()) {
                    WaveWordsEntityWithCardsDto waveWordsEntityWithCardsDto = (WaveWordsEntityWithCardsDto) it7.next();
                    if (waveWordsEntityWithCardsDto != null) {
                        String type = waveWordsEntityWithCardsDto.getType();
                        if (type == null || !type.equals("track") || (id = waveWordsEntityWithCardsDto.getId()) == null || (cards = waveWordsEntityWithCardsDto.getCards()) == null) {
                            it = it7;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it8 = cards.iterator();
                            while (it8.hasNext()) {
                                WaveWordsCardWithMetaDto waveWordsCardWithMetaDto3 = (WaveWordsCardWithMetaDto) it8.next();
                                if (waveWordsCardWithMetaDto3 == null || (card = waveWordsCardWithMetaDto3.getCard()) == null) {
                                    it2 = it7;
                                    it3 = it8;
                                } else {
                                    String id2 = card.getId();
                                    if (id2 != null) {
                                        WaveWordsCardActionDto action = card.getAction();
                                        if (action != null) {
                                            WaveWordsAnalyticPayloadDto analyticPayload = card.getAnalyticPayload();
                                            String title2 = action.getTitle();
                                            if (title2 != null && (link = action.getLink()) != null) {
                                                Boolean viewBrowser = action.getViewBrowser();
                                                boolean booleanValue = viewBrowser != null ? viewBrowser.booleanValue() : false;
                                                String deeplink = action.getDeeplink();
                                                if (analyticPayload != null) {
                                                    String objectId = analyticPayload.getObjectId();
                                                    g6vVar2 = (objectId == null || (objectType2 = analyticPayload.getObjectType()) == null) ? null : new g6v(objectId, objectType2);
                                                }
                                                g6vVar2 = new g6v(id2, "link");
                                                n6vVar = new n6v(title2, booleanValue, deeplink, link, g6vVar2);
                                                tags = card.getTags();
                                                if (tags != null) {
                                                    ArrayList O = CollectionsKt.O(tags);
                                                    if (O.isEmpty()) {
                                                        O = null;
                                                    }
                                                    if (O != null) {
                                                        if (((n6vVar != null && O.contains("DONATION")) ? t7a.a.e(n6vVar.d) : z2) && (text = card.getText()) != null) {
                                                            List<WaveWordsCardSourceDto> sources = card.getSources();
                                                            if (sources != null) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                for (WaveWordsCardSourceDto waveWordsCardSourceDto : sources) {
                                                                    if (waveWordsCardSourceDto == null || (title = waveWordsCardSourceDto.getTitle()) == null || (url = waveWordsCardSourceDto.getUrl()) == null) {
                                                                        it4 = it7;
                                                                        it5 = it8;
                                                                        waveWordsCardWithMetaDto2 = waveWordsCardWithMetaDto3;
                                                                        p6vVar = null;
                                                                    } else {
                                                                        it4 = it7;
                                                                        String faviconUrl = waveWordsCardSourceDto.getFaviconUrl();
                                                                        Boolean viewBrowser2 = waveWordsCardSourceDto.getViewBrowser();
                                                                        if (viewBrowser2 != null) {
                                                                            it5 = it8;
                                                                            z = viewBrowser2.booleanValue();
                                                                        } else {
                                                                            it5 = it8;
                                                                            z = true;
                                                                        }
                                                                        waveWordsCardWithMetaDto2 = waveWordsCardWithMetaDto3;
                                                                        p6vVar = new p6v(faviconUrl, title, url, z);
                                                                    }
                                                                    if (p6vVar != null) {
                                                                        arrayList4.add(p6vVar);
                                                                    }
                                                                    it7 = it4;
                                                                    it8 = it5;
                                                                    waveWordsCardWithMetaDto3 = waveWordsCardWithMetaDto2;
                                                                }
                                                                it2 = it7;
                                                                it3 = it8;
                                                                waveWordsCardWithMetaDto = waveWordsCardWithMetaDto3;
                                                                c5bVar = arrayList4;
                                                            } else {
                                                                it2 = it7;
                                                                it3 = it8;
                                                                waveWordsCardWithMetaDto = waveWordsCardWithMetaDto3;
                                                                c5bVar = c5b.a;
                                                            }
                                                            c5b c5bVar2 = c5bVar;
                                                            WaveWordsAnalyticPayloadDto analyticPayload2 = card.getAnalyticPayload();
                                                            if (analyticPayload2 != null) {
                                                                String objectId2 = analyticPayload2.getObjectId();
                                                                g6vVar = (objectId2 == null || (objectType = analyticPayload2.getObjectType()) == null) ? null : new g6v(objectId2, objectType);
                                                            }
                                                            g6vVar = new g6v(id2, "fact");
                                                            g6v g6vVar3 = g6vVar;
                                                            List bigCardIds = card.getBigCardIds();
                                                            List O2 = bigCardIds != null ? CollectionsKt.O(bigCardIds) : null;
                                                            if (O2 == null) {
                                                                O2 = c5b.a;
                                                            }
                                                            m6vVar = new m6v(id2, text, O, c5bVar2, n6vVar, g6vVar3, O2);
                                                            if (m6vVar != null) {
                                                                String feedbackState = waveWordsCardWithMetaDto.getFeedbackState();
                                                                if (feedbackState != null) {
                                                                    int hashCode = feedbackState.hashCode();
                                                                    if (hashCode == 3321751) {
                                                                        if (feedbackState.equals("like")) {
                                                                            o6vVar = o6v.a;
                                                                        }
                                                                        o6vVar = null;
                                                                    } else if (hashCode != 1671642405) {
                                                                        if (hashCode == 1844321735 && feedbackState.equals("neutral")) {
                                                                            o6vVar = o6v.b;
                                                                        }
                                                                        o6vVar = null;
                                                                    } else {
                                                                        if (feedbackState.equals("dislike")) {
                                                                            o6vVar = o6v.c;
                                                                        }
                                                                        o6vVar = null;
                                                                    }
                                                                }
                                                                o6vVar = o6v.b;
                                                                q6vVar = new q6v(m6vVar, o6vVar);
                                                                if (q6vVar == null) {
                                                                    arrayList3.add(q6vVar);
                                                                }
                                                                it7 = it2;
                                                                it8 = it3;
                                                                z2 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        n6vVar = null;
                                        tags = card.getTags();
                                        if (tags != null) {
                                        }
                                    }
                                    it2 = it7;
                                    it3 = it8;
                                    waveWordsCardWithMetaDto = waveWordsCardWithMetaDto3;
                                    m6vVar = null;
                                    if (m6vVar != null) {
                                    }
                                }
                                q6vVar = null;
                                if (q6vVar == null) {
                                }
                                it7 = it2;
                                it8 = it3;
                                z2 = true;
                            }
                            it = it7;
                            if (arrayList3.isEmpty()) {
                                arrayList3 = null;
                            }
                            if (arrayList3 != null) {
                                q7vVar = new q7v(id, arrayList3);
                                if (q7vVar != null && (q6vVar2 = (q6v) CollectionsKt.firstOrNull(q7vVar.b)) != null) {
                                    pair = new Pair(q7vVar.a, q6vVar2);
                                    if (pair != null) {
                                        arrayList2.add(pair);
                                    }
                                    it7 = it;
                                    z2 = true;
                                }
                            }
                        }
                        q7vVar = null;
                        if (q7vVar != null) {
                            pair = new Pair(q7vVar.a, q6vVar2);
                            if (pair != null) {
                            }
                            it7 = it;
                            z2 = true;
                        }
                    } else {
                        it = it7;
                    }
                    pair = null;
                    if (pair != null) {
                    }
                    it7 = it;
                    z2 = true;
                }
                Map n = uah.n(arrayList2);
                return n == null ? new nj6(null) : new qj6(n);
            }
        }
        e8vVar = new e8v(this, cg6Var);
        Object obj3 = e8vVar.j;
        nm6 nm6Var2 = nm6.a;
        i = e8vVar.l;
        boolean z22 = true;
        if (i != 0) {
        }
        biiVar = (bii) obj3;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(k7v k7vVar, cg6 cg6Var) {
        f8v f8vVar;
        int i;
        String str;
        bii biiVar;
        if (cg6Var instanceof f8v) {
            f8vVar = (f8v) cg6Var;
            int i2 = f8vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f8vVar.l = i2 - Integer.MIN_VALUE;
                Object obj = f8vVar.j;
                nm6 nm6Var = nm6.a;
                i = f8vVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    WaveScreenWordsInWaveApi waveScreenWordsInWaveApi = (WaveScreenWordsInWaveApi) this.b.getValue();
                    k7vVar.getClass();
                    String str2 = k7vVar.a;
                    String str3 = k7vVar.b;
                    int ordinal = k7vVar.c.ordinal();
                    if (ordinal == 0) {
                        str = "like";
                    } else if (ordinal == 1) {
                        str = "neutral";
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        str = "dislike";
                    }
                    Call<MusicBackendResponse<Unit>> a = waveScreenWordsInWaveApi.a(new WaveWordsFeedbackRequestBodyDto(t75.c(new WaveWordsFeedbackDto(str2, str3, str))));
                    f8vVar.l = 1;
                    obj = swf.N(a, f8vVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    return new qj6(Unit.a);
                }
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
        }
        f8vVar = new f8v(this, cg6Var);
        Object obj2 = f8vVar.j;
        nm6 nm6Var2 = nm6.a;
        i = f8vVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
