package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class jnv implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ knv b;

    public /* synthetic */ jnv(knv knvVar, int i) {
        this.a = i;
        this.b = knvVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        knv knvVar = this.b;
        switch (i) {
            case 0:
                Object S = vq2.S(knvVar.a, (aon) knvVar.k.getValue(), (f9r) knvVar.l.getValue(), continuation);
                if (S != nm6.a) {
                    break;
                }
                break;
            default:
                rkd rkdVar = (rkd) obj;
                zlv zlvVar = (zlv) knvVar.i.getValue();
                zlvVar.getClass();
                rkdVar.getClass();
                long j = ((fma) zlvVar.b.invoke(rkdVar)).a;
                nmb nmbVar = zlvVar.e;
                String G = zlvVar.a.G();
                wjb wjbVar = wjb.AboutArtistScreen;
                int c = (int) fma.c(j);
                int b = (int) fma.b(j);
                int intValue = ((Number) zlvVar.c.invoke()).intValue();
                lmb a = zlv.a((qov) zlvVar.d.invoke(rkdVar));
                pkb pkbVar = pkb.Audiobook;
                nmbVar.getClass();
                G.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("hash", G);
                linkedHashMap.put("page_id", "widget");
                linkedHashMap.put("skeleton_id", "");
                linkedHashMap.put("main_object_type", "non_applicable");
                eta.m(c, "main_object_id", "", "size_horizontal", linkedHashMap);
                ouj.y(b, linkedHashMap, "size_vertical", intValue, "widgets_amt");
                dfi.p(2, "widget_type", a.a, "_meta", linkedHashMap);
                nmbVar.C("Widget.Installed", linkedHashMap);
                break;
        }
        return Unit.a;
    }
}
