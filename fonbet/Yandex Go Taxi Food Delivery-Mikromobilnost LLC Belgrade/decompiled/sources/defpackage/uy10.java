package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.os.RemoteException;
import android.text.Html;
import android.text.TextUtils;
import com.yandex.messaging.domain.user.UserNameType;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class uy10 {
    public final Context a;
    public final o1b0 b;
    public final k020 c;
    public final ij10 d;
    public final noy0 e;
    public final f3c f;
    public final rp21 g;
    public final dmt0 h;
    public final u7s i;
    public final DateFormat j;
    public final DateFormat k;

    public uy10(Context context, o1b0 o1b0Var, k020 k020Var, ij10 ij10Var, noy0 noy0Var, f3c f3cVar, rp21 rp21Var, dmt0 dmt0Var, u7s u7sVar) {
        this.a = context;
        this.b = o1b0Var;
        this.c = k020Var;
        this.d = ij10Var;
        this.e = noy0Var;
        this.f = f3cVar;
        this.g = rp21Var;
        this.h = dmt0Var;
        this.i = u7sVar;
        this.j = android.text.format.DateFormat.getDateFormat(context);
        this.k = android.text.format.DateFormat.getTimeFormat(context);
    }

    public final ArrayList a(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ty10 c = c((abz0) it.next());
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    public final void b(String str, String str2) {
        boolean a;
        boolean z = this.i.c;
        f3c f3cVar = this.f;
        if (!z || evu0.J(str2)) {
            a = f3cVar.a("", str);
        } else {
            f3cVar.getClass();
            try {
                f3cVar.b().setPrimaryClip(ClipData.newHtmlText("", str, str2));
                a = true;
            } catch (RemoteException unused) {
                a = false;
            }
        }
        if (a) {
            int i = oyh0.chat_share_copy_done_toast;
            Context context = this.a;
            vqb1.g(i, context);
            context.getResources().getString(i);
        }
    }

    public final ty10 c(abz0 abz0Var) {
        o1b0 o1b0Var = this.b;
        n1b0 a = o1b0Var.a();
        k020 k020Var = this.c;
        yab x = (a == null || abz0Var.a != a.b) ? k020Var.x(o1b0Var.a, abz0Var) : k020Var.x(a.a, abz0Var);
        try {
            if (!x.moveToFirst()) {
                x.close();
                return null;
            }
            ty10 ty10Var = new ty10(this, x);
            x.close();
            return ty10Var;
        } finally {
        }
    }

    public final void d(List list, StringBuilder sb, StringBuilder sb2, boolean z) {
        Iterator it;
        String str;
        int i;
        String str2;
        qp21 a;
        Iterator it2 = list.iterator();
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            ty10 ty10Var = (ty10) next;
            String str5 = ty10Var.b;
            String str6 = ty10Var.c;
            String str7 = ty10Var.x;
            if (!jl40.l(str5, str3)) {
                sb.append(str5);
                sb.append("\n\n");
                sb2.append("<b>");
                sb2.append(Html.escapeHtml(str5));
                sb2.append("</b><br><br>");
                str3 = str5;
                str4 = null;
            }
            if (jl40.l(str7, str4)) {
                it = it2;
                str = str3;
                i = i3;
            } else {
                rp21 rp21Var = this.g;
                i = i3;
                long c = rp21Var.b.c();
                it = it2;
                in21 a2 = rp21Var.a.a().a(str7);
                if (a2 == null) {
                    a = new qp21(null, UserNameType.NOT_FOUND);
                    str = str3;
                    str2 = null;
                } else {
                    str = str3;
                    str2 = null;
                    a = rp21Var.c.a(a2, c);
                }
                String g = h791.g(a, this.a.getResources(), str2);
                sb.append(g);
                sb.append(Extension.FIX_SPACE);
                sb2.append("<b>");
                sb2.append(Html.escapeHtml(g));
                sb2.append("</b>, ");
                sb.append(str6);
                sb.append(":");
                sb2.append(Html.escapeHtml(str6));
                sb2.append(":");
                sb.append("\n");
                sb2.append("<br>");
                str4 = str7;
            }
            sb.append(TextUtils.join("\n", ty10Var.b(z)));
            sb2.append(a.X(ty10Var.a(z), "<br>", null, null, new sy10(this, 0), 30));
            if (i2 != list.size() - 1) {
                sb.append("\n");
                sb2.append("<br>");
            }
            i2 = i;
            it2 = it;
            str3 = str;
        }
    }
}
