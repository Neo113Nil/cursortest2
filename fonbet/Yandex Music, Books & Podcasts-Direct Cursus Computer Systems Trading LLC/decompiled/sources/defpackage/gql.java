package defpackage;

import android.content.res.Resources;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class gql implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ grl b;

    public /* synthetic */ gql(grl grlVar, int i) {
        this.a = i;
        this.b = grlVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        igl iglVar;
        mqs a;
        mqs a2;
        hqs hqsVar;
        int i;
        Object emit;
        String str;
        int i2 = this.a;
        grl grlVar = this.b;
        switch (i2) {
            case 0:
                mwk mwkVar = (mwk) obj;
                nwh nwhVar = grlVar.C;
                nwhVar.k = mwkVar;
                p9l p9lVar = (p9l) nwhVar.i;
                p9lVar.b();
                if (mwkVar == null || (a2 = mwkVar.a()) == null || (hqsVar = a2.o) == null || !hqsVar.b) {
                    p9lVar.b = null;
                    p9lVar.c = null;
                } else {
                    p9lVar.b = mwkVar.a();
                    p9lVar.c = q9l.a;
                }
                p2b p2bVar = (p2b) nwhVar.j;
                p2bVar.b();
                if (mwkVar == null || (a = mwkVar.a()) == null || !a.o()) {
                    p2bVar.b = null;
                    p2bVar.c = null;
                } else {
                    p2bVar.b = mwkVar;
                    p2bVar.c = r9l.a;
                }
                dn9 dn9Var = grlVar.q;
                dn9Var.getClass();
                mwkVar.getClass();
                xdr xdrVar = (xdr) dn9Var.d;
                igl iglVar2 = (igl) xdrVar.getValue();
                if (!Intrinsics.d(iglVar2 != null ? iglVar2.a : null, mwkVar)) {
                    ((xdr) dn9Var.e).l(null);
                    igl iglVar3 = (igl) xdrVar.getValue();
                    if (iglVar3 != null) {
                        j1g j1gVar = iglVar3.b;
                        j1gVar.getClass();
                        iglVar = new igl(mwkVar, j1gVar);
                    } else {
                        iglVar = new igl(mwkVar, j1g.b);
                    }
                    xdrVar.m(null, iglVar);
                }
                break;
            case 1:
                Object a3 = grl.a(grlVar, (hql) obj, continuation);
                if (a3 != nm6.a) {
                    break;
                }
                break;
            case 2:
                yks yksVar = grlVar.u;
                yksVar.getClass();
                int ordinal = ((axe) obj).ordinal();
                if (ordinal == 0) {
                    i = R.string.chromecast_connection_error;
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    i = R.string.chromecast_connection_lost;
                }
                x0q x0qVar = (x0q) yksVar.d;
                String string = ((Resources) yksVar.b).getString(i);
                string.getClass();
                Object emit2 = x0qVar.emit(string, continuation);
                nm6 nm6Var = nm6.a;
                if (emit2 != nm6Var) {
                    emit2 = Unit.a;
                }
                Object obj2 = emit2;
                if (obj2 != nm6Var) {
                    break;
                }
                break;
            case 3:
                String str2 = (String) obj;
                yks yksVar2 = grlVar.u;
                yksVar2.getClass();
                if (str2.length() == 0) {
                    emit = Unit.a;
                } else {
                    x0q x0qVar2 = (x0q) yksVar2.d;
                    String string2 = ((Resources) yksVar2.b).getString(R.string.cast_state_changed_toast, str2);
                    string2.getClass();
                    emit = x0qVar2.emit(string2, continuation);
                    if (emit != nm6.a) {
                        emit = Unit.a;
                    }
                }
                if (emit != nm6.a) {
                    break;
                }
                break;
            default:
                o3h o3hVar = (o3h) obj;
                nwh nwhVar2 = grlVar.C;
                y5g y5gVar = o3hVar != null ? o3hVar.b : null;
                if (y5gVar instanceof e2h) {
                    p9l p9lVar2 = (p9l) nwhVar2.i;
                    mqs mqsVar = p9lVar2.b;
                    if (mqsVar != null) {
                        nwh nwhVar3 = p9lVar2.e;
                        if (p9lVar2.c == q9l.a) {
                            p9lVar2.c = q9l.b;
                            nmb nmbVar = (nmb) nwhVar3.h;
                            String str3 = mqsVar.a;
                            String str4 = mqsVar.c;
                            boolean o = mqsVar.o();
                            boolean booleanValue = ((Boolean) ((vdr) nwhVar3.b).getValue()).booleanValue();
                            boolean booleanValue2 = ((Boolean) ((vdr) nwhVar3.e).getValue()).booleanValue();
                            nmbVar.getClass();
                            str3.getClass();
                            str4.getClass();
                            LinkedHashMap m = dfi.m("page_type", "object", "track_id", str3);
                            eta.u(m, "track_name", str4, o, "with_videoshot");
                            m.put("with_animated_text", String.valueOf(true));
                            m.put("videoshot_on", String.valueOf(booleanValue));
                            m.put("animated_text_on", String.valueOf(booleanValue2));
                            m.put("_meta", nmb.u(1));
                            nmbVar.C("ExpandedPlayer.AnimatedText.Loaded", m);
                        }
                    }
                } else if ((y5gVar instanceof g2h) && (str = ((g2h) y5gVar).a) != null) {
                    p9l p9lVar3 = (p9l) nwhVar2.i;
                    if (p9lVar3.c == q9l.a) {
                        p9lVar3.e.n(str);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
