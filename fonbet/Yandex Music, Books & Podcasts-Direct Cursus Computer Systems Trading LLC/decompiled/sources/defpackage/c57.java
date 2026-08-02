package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class c57 implements x7o {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ cno c;
    public final /* synthetic */ q27 d;

    public /* synthetic */ c57(List list, cno cnoVar, q27 q27Var, int i) {
        this.a = i;
        this.b = list;
        this.c = cnoVar;
        this.d = q27Var;
    }

    @Override // defpackage.x7o
    public final void onSuccess(Object obj) {
        Object obj2;
        Uri uri;
        String uri2;
        Object obj3;
        Uri uri3;
        String uri4;
        int i = this.a;
        q27 q27Var = this.d;
        cno cnoVar = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                List list2 = (List) obj;
                list2.getClass();
                List<p27> list3 = list;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                for (p27 p27Var : list3) {
                    String str = p27Var.a;
                    String str2 = p27Var.g;
                    okr[] okrVarArr = okr.a;
                    if (str.equals("sbp_token") && str2 != null) {
                        String str3 = p27Var.e;
                        em2 em2Var = em2.SBERBANK;
                        if (StringsKt.M(str3, "unknown", false)) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (StringsKt.M(((gl2) obj2).b, str2, false)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            gl2 gl2Var = (gl2) obj2;
                            if (gl2Var != null && (uri = gl2Var.g) != null && (uri2 = uri.toString()) != null) {
                                p27Var = p27.a(p27Var, uri2);
                            }
                        }
                    }
                    arrayList.add(p27Var);
                }
                r7o r7oVar = z7o.b;
                cnoVar.resumeWith(q27.a(q27Var, arrayList, null, 254));
                break;
            default:
                List list4 = (List) obj;
                list4.getClass();
                List<p27> list5 = list;
                ArrayList arrayList2 = new ArrayList(v75.o(list5, 10));
                for (p27 p27Var2 : list5) {
                    String str4 = p27Var2.a;
                    String str5 = p27Var2.g;
                    okr[] okrVarArr2 = okr.a;
                    if (str4.equals("sbp_token") && str5 != null) {
                        String str6 = p27Var2.e;
                        em2 em2Var2 = em2.SBERBANK;
                        if (StringsKt.M(str6, "unknown", false)) {
                            Iterator it2 = list4.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    if (StringsKt.M(((gl2) obj3).b, str5, false)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            gl2 gl2Var2 = (gl2) obj3;
                            if (gl2Var2 != null && (uri3 = gl2Var2.g) != null && (uri4 = uri3.toString()) != null) {
                                p27Var2 = p27.a(p27Var2, uri4);
                            }
                        }
                    }
                    arrayList2.add(p27Var2);
                }
                r7o r7oVar2 = z7o.b;
                cnoVar.resumeWith(q27.a(q27Var, arrayList2, null, 254));
                break;
        }
    }

    @Override // defpackage.x7o
    public final void x(Object obj) {
        int i = this.a;
        q27 q27Var = this.d;
        cno cnoVar = this.c;
        switch (i) {
            case 0:
                ((bfk) obj).getClass();
                r7o r7oVar = z7o.b;
                cnoVar.resumeWith(q27Var);
                break;
            default:
                ((bfk) obj).getClass();
                r7o r7oVar2 = z7o.b;
                cnoVar.resumeWith(q27Var);
                break;
        }
    }
}
