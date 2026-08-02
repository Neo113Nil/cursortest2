package defpackage;

import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.internal.core.a;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public final class znl {
    public final rol a;

    public znl(rol rolVar) {
        this.a = rolVar;
    }

    public static ynl a(egk egkVar, String str, rvo rvoVar) {
        egk d;
        ynl a;
        if (egkVar instanceof ynl) {
            ynl ynlVar = (ynl) egkVar;
            if (jl40.l(ynlVar.t, str)) {
                return ynlVar;
            }
            return null;
        }
        if (egkVar instanceof DivGallery) {
            DivGallery divGallery = (DivGallery) egkVar;
            for (cxk cxkVar : a.c(divGallery.u, divGallery.s, rvoVar)) {
                ynl a2 = a(cxkVar.a.d(), str, cxkVar.b);
                if (a2 != null) {
                    return a2;
                }
            }
            return null;
        }
        if (egkVar instanceof DivContainer) {
            DivContainer divContainer = (DivContainer) egkVar;
            for (cxk cxkVar2 : a.c(divContainer.B, divContainer.z, rvoVar)) {
                ynl a3 = a(cxkVar2.a.d(), str, cxkVar2.b);
                if (a3 != null) {
                    return a3;
                }
            }
            return null;
        }
        if (egkVar instanceof hsk) {
            Iterable iterable = ((hsk) egkVar).y;
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ynl a4 = a(((m3k) it.next()).d(), str, rvoVar);
                if (a4 != null) {
                    return a4;
                }
            }
            return null;
        }
        if (egkVar instanceof t1l) {
            t1l t1lVar = (t1l) egkVar;
            for (cxk cxkVar3 : a.c(t1lVar.t, t1lVar.r, rvoVar)) {
                ynl a5 = a(cxkVar3.a.d(), str, cxkVar3.b);
                if (a5 != null) {
                    return a5;
                }
            }
            return null;
        }
        if (egkVar instanceof mdl) {
            Iterator it2 = ((mdl) egkVar).q.iterator();
            while (it2.hasNext()) {
                ynl a6 = a(((kdl) it2.next()).a.d(), str, rvoVar);
                if (a6 != null) {
                    return a6;
                }
            }
            return null;
        }
        if (egkVar instanceof clk) {
            List list = ((clk) egkVar).q;
            if (list == null) {
                return null;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ynl a7 = a(((m3k) it3.next()).d(), str, rvoVar);
                if (a7 != null) {
                    return a7;
                }
            }
            return null;
        }
        if (!(egkVar instanceof dbl)) {
            return null;
        }
        Iterator it4 = ((dbl) egkVar).I.iterator();
        while (it4.hasNext()) {
            m3k m3kVar = ((cbl) it4.next()).c;
            if (m3kVar != null && (d = m3kVar.d()) != null && (a = a(d, str, rvoVar)) != null) {
                return a;
            }
        }
        return null;
    }

    public final boolean b(Div2View div2View, String str, String str2, rvo rvoVar) {
        ynl ynlVar;
        omk omkVar = div2View.get_divData();
        if (omkVar != null) {
            Iterator it = omkVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ynlVar = null;
                    break;
                }
                ynlVar = a(((mmk) it.next()).a.d(), str, rvoVar);
                if (ynlVar != null) {
                    break;
                }
            }
            if (ynlVar != null) {
                Set entrySet = this.a.a.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : entrySet) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (jl40.l(entry.getValue(), ynlVar) || jl40.l(((ynl) entry.getValue()).t, ynlVar.t)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    DivPlayerView playerView = ((DivVideoView) ((Map.Entry) it2.next()).getKey()).getPlayerView();
                    r4l attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
                    if (attachedPlayer != null) {
                        arrayList2.add(attachedPlayer);
                    }
                }
                r4l r4lVar = (r4l) kotlin.collections.a.R(arrayList2);
                if (r4lVar != null) {
                    if (jl40.l(str2, "start")) {
                        r4lVar.play();
                        return true;
                    }
                    if (!jl40.l(str2, "pause")) {
                        return false;
                    }
                    r4lVar.pause();
                    return true;
                }
            }
        }
        return false;
    }
}
