package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class h25 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h25(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        plb plbVar;
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                if (booleanValue) {
                    j25 j25Var = (j25) this.c;
                    cvl cvlVar = ((dwl) this.d).b;
                    j25Var.getClass();
                    yk3 yk3Var = ((v25) j25Var.b.b).d;
                    yk3Var.getClass();
                    t0s t0sVar = (t0s) yk3Var.e;
                    if (t0sVar != null) {
                        pwl pwlVar = (pwl) yk3Var.d;
                        String e = cvlVar.e();
                        int i = this.b + 1;
                        int ordinal = t0sVar.a.ordinal();
                        if (ordinal == 0) {
                            plbVar = plb.Own;
                        } else if (ordinal != 1) {
                            b6e.s();
                            break;
                        } else {
                            plbVar = plb.Liked;
                        }
                        int i2 = t0sVar.b + 1;
                        boolean z = yk3Var.a;
                        qlb x = yk3.x(cvlVar, (frt) ((jyr) yk3Var.c).getValue());
                        pwlVar.getClass();
                        nmb nmbVar = pwlVar.b;
                        String G = pwlVar.a.G();
                        nmbVar.getClass();
                        G.getClass();
                        LinkedHashMap m = dfi.m("page_type", "listing", "hash", G);
                        m.put("view_uuid", str);
                        m.put("page_id", "playlist_list_screen");
                        m.put("object_type", "playlist");
                        eta.m(i, "object_id", e, "object_pos", m);
                        eta.m(i2, "tab_id", plbVar.a, "tab_pos", m);
                        m.put("is_tab_selected_by_default", String.valueOf(z));
                        dfi.p(2, "playlist_type", x.a, "_meta", m);
                        nmbVar.C("PlaylistList.Playlist.Showed", m);
                    }
                }
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                ((nru) this.c).h((hsu) this.d, booleanValue2, str2, this.b);
                break;
        }
        return Unit.a;
    }
}
