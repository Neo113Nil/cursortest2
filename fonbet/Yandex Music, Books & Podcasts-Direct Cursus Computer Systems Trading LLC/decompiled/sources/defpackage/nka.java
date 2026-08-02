package defpackage;

import com.yandex.music.shared.player.download2.InternalDownloadException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class nka {
    public final /* synthetic */ int a;
    public final qdc b;

    public /* synthetic */ nka(qdc qdcVar, int i) {
        this.a = i;
        this.b = qdcVar;
    }

    public void a(String str, be6 be6Var, InternalDownloadException internalDownloadException) {
        int i = this.a;
        str.getClass();
        be6Var.getClass();
        switch (i) {
            case 0:
                gzn V = saf.V(new ews(str, be6Var, null), null, internalDownloadException, null);
                qdc qdcVar = this.b;
                mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
                p3i p3iVar = new p3i(450);
                p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
                V.d(p3iVar);
                LinkedHashMap a = p3iVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a.size()));
                for (Map.Entry entry : a.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
                }
                mibVar.b("TRACK_ERROR_LOAD2", linkedHashMap);
                break;
            default:
                gzn V2 = saf.V(new ews(str, be6Var, null), null, internalDownloadException, null);
                qdc qdcVar2 = this.b;
                mib mibVar2 = (mib) ((jyr) qdcVar2.b).getValue();
                p3i p3iVar2 = new p3i(450);
                p3iVar2.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar2.c).a.a).booleanValue());
                V2.d(p3iVar2);
                LinkedHashMap a2 = p3iVar2.a();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(a2.size()));
                for (Map.Entry entry2 : a2.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), ((t3i) entry2.getValue()).getValue());
                }
                mibVar2.b("TRACK_ERROR_PRE_FETCH2", linkedHashMap2);
                break;
        }
    }
}
