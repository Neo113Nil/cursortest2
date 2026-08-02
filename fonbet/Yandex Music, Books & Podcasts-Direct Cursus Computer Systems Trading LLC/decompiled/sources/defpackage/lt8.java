package defpackage;

import android.view.ViewGroup;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes3.dex */
public final class lt8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt8(lp9 lp9Var, cp9 cp9Var, e23 e23Var, vo9 vo9Var, hp8 hp8Var, pm9 pm9Var, ArrayList arrayList) {
        super(1);
        this.r = 2;
        this.t = lp9Var;
        this.v = cp9Var;
        this.u = e23Var;
        this.w = vo9Var;
        this.x = hp8Var;
        this.y = pm9Var;
        this.s = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pwt pwtVar;
        int i = this.r;
        Object obj2 = this.s;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.u;
        Object obj6 = this.t;
        Object obj7 = this.w;
        Object obj8 = this.v;
        switch (i) {
            case 0:
                rt8 rt8Var = (rt8) obj7;
                e23 e23Var = (e23) obj5;
                List w = qwp.w((pr8) obj6, e23Var.b);
                ViewGroup viewGroup = (ViewGroup) obj8;
                viewGroup.getClass();
                List items = ((mr8) viewGroup).getItems();
                if (items == null) {
                    items = c5b.a;
                }
                List list = items;
                rt8Var.Q(viewGroup, e23Var.a, list, w);
                jt8 jt8Var = (jt8) obj4;
                rt8Var.J((ViewGroup) obj8, e23Var, jt8Var, jt8Var, w, list, (pm9) obj3, (dfb) obj2);
                return Unit.a;
            case 1:
                ArrayList arrayList = (ArrayList) obj6;
                arrayList.clear();
                List<k69> list2 = ((l49) obj5).b0;
                if (list2 != null) {
                    xzb xzbVar = (xzb) obj7;
                    dfb dfbVar = (dfb) obj2;
                    for (k69 k69Var : list2) {
                        if (k69Var instanceof j69) {
                            z69 z69Var = ((j69) k69Var).b;
                            try {
                                pwtVar = new pwt(new c0c(new Regex((String) z69Var.c.a(xzbVar)), ((Boolean) z69Var.a.a(xzbVar)).booleanValue()), z69Var.d, (String) z69Var.b.a(xzbVar));
                            } catch (PatternSyntaxException e) {
                                dfbVar.d(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + '\'', e));
                                pwtVar = null;
                            }
                        } else {
                            if (!(k69Var instanceof i69)) {
                                b6e.s();
                                return null;
                            }
                            q69 q69Var = ((i69) k69Var).b;
                            pwtVar = new pwt(new c0c(((Boolean) q69Var.a.a(xzbVar)).booleanValue(), new qs6(23, q69Var, xzbVar)), q69Var.d, (String) q69Var.c.a(xzbVar));
                        }
                        if (pwtVar != null) {
                            arrayList.add(pwtVar);
                        }
                    }
                    rt8 rt8Var2 = (rt8) obj8;
                    j79 j79Var = (j79) obj4;
                    gc8 gc8Var = (gc8) obj3;
                    xzb xzbVar2 = (xzb) obj7;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        rt8.H(rt8Var2, (pwt) it.next(), String.valueOf(j79Var.getText()), j79Var, gc8Var, xzbVar2);
                    }
                }
                return Unit.a;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                lp9 lp9Var = (lp9) obj6;
                xo9 divTabsAdapter = lp9Var.getDivTabsAdapter();
                if (divTabsAdapter == null || divTabsAdapter.p != booleanValue) {
                    cp9 cp9Var = (cp9) obj8;
                    e23 e23Var2 = (e23) obj5;
                    vo9 vo9Var = (vo9) obj7;
                    hp8 hp8Var = (hp8) obj4;
                    pm9 pm9Var = (pm9) obj3;
                    ArrayList arrayList2 = (ArrayList) obj2;
                    xo9 divTabsAdapter2 = lp9Var.getDivTabsAdapter();
                    cp9Var.J(lp9Var, e23Var2, vo9Var, hp8Var, pm9Var, arrayList2, divTabsAdapter2 != null ? Integer.valueOf(divTabsAdapter2.d.getCurrentItem()) : null);
                }
                return Unit.a;
            case 3:
                jom jomVar = (jom) obj;
                jomVar.getClass();
                jomVar.e = (String) obj6;
                jomVar.f = (String) obj5;
                jomVar.g = (VideoData) obj8;
                jomVar.h = (Long) obj7;
                jomVar.i = (String) obj3;
                Map o = ((avj) obj4).h.o();
                jomVar.j = o != null ? uah.o(o) : null;
                PlaybackParameters playbackParameters = (PlaybackParameters) obj2;
                jomVar.k = Boolean.valueOf(playbackParameters.getPrepareWithoutInitCodecs());
                jomVar.l = Boolean.valueOf(playbackParameters.getPreferredH264());
                jomVar.m = Boolean.valueOf(playbackParameters.getIsOffline());
                jomVar.n = playbackParameters.getManifestDataSourceParameters();
                jomVar.o = playbackParameters.getChunkDataSourceParameters();
                return Unit.a;
            case 4:
                ((wle) obj).getClass();
                j03 j03Var = ((ogk) obj6).a;
                String str = (String) obj5;
                String str2 = (String) obj8;
                String str3 = (String) obj7;
                String str4 = (String) obj4;
                oxa oxaVar = (oxa) obj3;
                jtc jtcVar = (jtc) obj2;
                str.getClass();
                str2.getClass();
                g0c g0cVar = j03Var.g;
                boolean z = j03Var.p;
                String r = hrg.r("Оплата привязанной картой ", str, StringUtil.SPACE, z ? "через PSP" : "через Trust");
                String str5 = z ? "existing_card_payment_v2" : "existing_card_payment";
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("card_id", new jkr(str));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(r));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(vtmVar, "event_name", str5, str5, vtmVar);
                yop a = mif.a(j03Var.d(str3), new a03(j03Var, str2, str, str4, oxaVar, jtcVar, 0), null, 5);
                ((x60) g0cVar).b(j, a);
                return a;
            default:
                jom jomVar2 = (jom) obj;
                jomVar2.getClass();
                jomVar2.e = (String) obj6;
                jomVar2.f = (String) obj5;
                jomVar2.g = (VideoData) obj8;
                jomVar2.h = (Long) obj7;
                jomVar2.i = (String) obj3;
                Map o2 = ((cbw) obj4).h.o();
                jomVar2.j = o2 != null ? uah.o(o2) : null;
                PlaybackParameters playbackParameters2 = (PlaybackParameters) obj2;
                jomVar2.k = Boolean.valueOf(playbackParameters2.getPrepareWithoutInitCodecs());
                jomVar2.l = Boolean.valueOf(playbackParameters2.getPreferredH264());
                jomVar2.m = Boolean.valueOf(playbackParameters2.getIsOffline());
                jomVar2.n = playbackParameters2.getManifestDataSourceParameters();
                jomVar2.o = playbackParameters2.getChunkDataSourceParameters();
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        super(1);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
        this.x = obj5;
        this.y = obj6;
        this.s = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt8(ArrayList arrayList, l49 l49Var, rt8 rt8Var, xzb xzbVar, dfb dfbVar, j79 j79Var, gc8 gc8Var) {
        super(1);
        this.r = 1;
        this.t = arrayList;
        this.u = l49Var;
        this.v = rt8Var;
        this.w = xzbVar;
        this.s = dfbVar;
        this.x = j79Var;
        this.y = gc8Var;
    }
}
