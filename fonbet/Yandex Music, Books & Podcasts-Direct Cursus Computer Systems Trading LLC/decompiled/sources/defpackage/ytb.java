package defpackage;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes3.dex */
public final class ytb implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ kub b;

    public /* synthetic */ ytb(kub kubVar, int i) {
        this.a = i;
        this.b = kubVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        String str2;
        Object obj2;
        switch (this.a) {
            case 0:
                pbu pbuVar = (pbu) obj;
                boolean z = pbuVar instanceof obu;
                kub kubVar = this.b;
                if (z) {
                    p2b p2bVar = (p2b) kubVar.b.C.j;
                    nwh nwhVar = (nwh) p2bVar.d;
                    if (((mwk) p2bVar.b) != null && ((r9l) p2bVar.c) == r9l.a) {
                        p2bVar.c = r9l.b;
                        nmb nmbVar = (nmb) nwhVar.h;
                        nwk p = nwhVar.p();
                        String str3 = "";
                        if (p == null || (str = p.a) == null) {
                            str = "";
                        }
                        nwk p2 = nwhVar.p();
                        if (p2 != null && (str2 = p2.b) != null) {
                            str3 = str2;
                        }
                        nmbVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("page_type", "object");
                        linkedHashMap.put("track_id", str);
                        dfi.p(1, "track_name", str3, "_meta", linkedHashMap);
                        nmbVar.C("ExpandedPlayer.VideoLoaded", linkedHashMap);
                    }
                } else if (pbuVar instanceof mbu) {
                    PlaybackException playbackException = ((mbu) pbuVar).a;
                    kubVar.getClass();
                    kubVar.b.C.n(playbackException.getMessage());
                }
                return Unit.a;
            default:
                z3h z3hVar = (z3h) ((Pair) obj).b;
                kub kubVar2 = this.b;
                xdr xdrVar = kubVar2.m;
                if (z3hVar instanceof zfr) {
                    obj2 = new r3h((zfr) z3hVar);
                } else if (z3hVar instanceof zwr) {
                    obj2 = new s3h((zwr) z3hVar, a3h.b, false);
                } else {
                    if (z3hVar != null) {
                        b6e.s();
                        return null;
                    }
                    obj2 = q3h.a;
                }
                xdrVar.getClass();
                xdrVar.m(null, obj2);
                if (xdrVar.getValue() instanceof s3h) {
                    kubVar2.g();
                }
                return Unit.a;
        }
    }
}
