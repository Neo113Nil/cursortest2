package defpackage;

import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Banner;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Deeplink;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Div$WithData;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Div$WithJson;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$DynamicOverlaySheet;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rk5 implements pk5 {
    public final ri5 a;

    public rk5(nk5 nk5Var, ri5 ri5Var) {
        this.a = ri5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap a(Map map) {
        Long showBefore;
        String uri;
        boolean a;
        String uri2;
        String uri3;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            List<mte> list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (mte mteVar : list) {
                Long showAfter = mteVar.getMeta().getShowAfter();
                boolean z = false;
                ri5 ri5Var = this.a;
                if ((showAfter == null || showAfter.longValue() < System.currentTimeMillis()) && ((showBefore = mteVar.getMeta().getShowBefore()) == null || showBefore.longValue() > System.currentTimeMillis())) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key2 = entry2.getKey();
                        List list2 = (List) entry2.getValue();
                        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((mte) it.next()).getScreenId());
                        }
                        linkedHashMap2.put(key2, arrayList2);
                    }
                    if (mteVar instanceof InternalCommunicationTrigger$Banner) {
                        InternalCommunicationTrigger$Banner.Data.Action action = ((InternalCommunicationTrigger$Banner) mteVar).getData().getAction();
                        if (action != null && (uri3 = action.getUri()) != null) {
                            a = nk5.a(uri3, linkedHashMap2);
                            if (a) {
                                z = true;
                            } else {
                                String screenId = mteVar.getScreenId();
                                str.getClass();
                                screenId.getClass();
                                ri5.c(ri5Var, "validation", "invalid_action_url", str, screenId, 8);
                            }
                        }
                        a = true;
                        if (a) {
                        }
                    } else {
                        if (mteVar instanceof InternalCommunicationTrigger$Deeplink) {
                            a = nk5.a(((InternalCommunicationTrigger$Deeplink) mteVar).getDeeplink(), linkedHashMap2);
                        } else if (mteVar instanceof InternalCommunicationTrigger$Div$WithData) {
                            Iterator it2 = wct.v(((InternalCommunicationTrigger$Div$WithData) mteVar).getDiv()).iterator();
                            while (it2.hasNext()) {
                                if (!nk5.a((String) it2.next(), linkedHashMap2)) {
                                    a = false;
                                    break;
                                }
                            }
                            a = true;
                        } else {
                            if (!(mteVar instanceof InternalCommunicationTrigger$Div$WithJson)) {
                                if (mteVar instanceof InternalCommunicationTrigger$DynamicOverlaySheet) {
                                    InternalCommunicationTrigger$DynamicOverlaySheet internalCommunicationTrigger$DynamicOverlaySheet = (InternalCommunicationTrigger$DynamicOverlaySheet) mteVar;
                                    if (nk5.a(internalCommunicationTrigger$DynamicOverlaySheet.getData().getFirstButtonAction().getUri(), linkedHashMap2)) {
                                        InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction secondButtonAction = internalCommunicationTrigger$DynamicOverlaySheet.getData().getSecondButtonAction();
                                        if (secondButtonAction != null && (uri2 = secondButtonAction.getUri()) != null) {
                                            a = nk5.a(uri2, linkedHashMap2);
                                        }
                                    }
                                    a = false;
                                    break;
                                }
                                if (!(mteVar instanceof InternalCommunicationTrigger$Toast)) {
                                    b6e.s();
                                    return null;
                                }
                                InternalCommunicationTrigger$Toast.Data.Action action2 = ((InternalCommunicationTrigger$Toast) mteVar).getData().getAction();
                                if (action2 != null && (uri = action2.getUri()) != null) {
                                    a = nk5.a(uri, linkedHashMap2);
                                }
                            }
                            a = true;
                        }
                        if (a) {
                        }
                    }
                } else {
                    Long showAfter2 = mteVar.getMeta().getShowAfter();
                    String str2 = !(showAfter2 == null || (showAfter2.longValue() > System.currentTimeMillis() ? 1 : (showAfter2.longValue() == System.currentTimeMillis() ? 0 : -1)) < 0) ? "show_after_in_future" : "show_before_in_past";
                    String screenId2 = mteVar.getScreenId();
                    str.getClass();
                    screenId2.getClass();
                    ri5.c(ri5Var, "validation", str2, str, screenId2, 8);
                }
                if (!z) {
                    mteVar = null;
                }
                if (mteVar != null) {
                    arrayList.add(mteVar);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            if (!((List) entry3.getValue()).isEmpty()) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        return linkedHashMap3;
    }
}
