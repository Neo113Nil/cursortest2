package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import yads.bb3;
import yads.f5;

/* loaded from: classes7.dex */
public final class tpq0 {
    public final Context a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public tpq0(View view) {
        Context context = view.getContext();
        this.a = context;
        this.c = (ImageView) view.findViewById(e9h0.message_sending_status);
        this.d = (AnimatedVectorDrawableCompat) vqb1.c(wwg0.msg_anim_clock_animation, context).mutate();
        this.e = (AnimatedVectorDrawableCompat) vqb1.c(wwg0.msg_anim_clock_other_animation, context).mutate();
        this.f = vqb1.e(wwg0.msg_ic_message_status_read_own, context).mutate();
        this.g = vqb1.e(wwg0.msg_ic_message_status_sent, context).mutate();
        this.b = kjs0.b(14);
    }

    public void a(Context context, List list, mj31 mj31Var, Object obj) {
        Map map;
        Context context2 = context;
        int i = this.b + 1;
        this.b = i;
        int i2 = 5;
        if (i > 5) {
            mj31Var.mo492a();
            return;
        }
        fe81 fe81Var = (fe81) this.c;
        v981 v981Var = (v981) this.d;
        s1n s1nVar = new s1n(this.a, (e971) this.g, (i971) this.f, (wo71) this.e, v981Var, fe81Var);
        if (list.isEmpty()) {
            mj31Var.z((ArrayList) s1nVar.w);
            return;
        }
        s1nVar.x = mj31Var;
        ((e971) s1nVar.b).b(f5.x, list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bs81 bs81Var = (bs81) it.next();
            s1nVar.a++;
            hlx0 hlx0Var = (hlx0) s1nVar.c;
            cf71 cf71Var = new cf71(i2, s1nVar, list);
            hlx0Var.getClass();
            a441 a441Var = new a441(context2, bs81Var, cf71Var);
            ddf ddfVar = (ddf) hlx0Var.y;
            v981 v981Var2 = (v981) hlx0Var.c;
            fe81 fe81Var2 = (fe81) hlx0Var.b;
            wo71 wo71Var = (wo71) hlx0Var.w;
            i971 i971Var = (i971) hlx0Var.x;
            ddfVar.getClass();
            dp61 dp61Var = new dp61();
            String str = bs81Var.B;
            if (str == null) {
                str = "";
            }
            Uri parse = Uri.parse(str);
            if (a.G((List) gy71.a.getValue(), parse.getHost())) {
                bb3 bb3Var = new bb3(dp61Var, wo71Var, fe81Var2, context2);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null) {
                    int d = gw00.d(tcc.n(queryParameterNames, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    map = new LinkedHashMap(d);
                    for (String str2 : queryParameterNames) {
                        Pair pair = new Pair(str2, parse.getQueryParameter(str2));
                        map.put(pair.c(), pair.f());
                    }
                } else {
                    map = null;
                }
                if (map == null) {
                    map = b.f();
                }
                a981 a981Var = (a981) bb3Var.invoke(new a981(map));
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                for (Map.Entry entry : a981Var.a.entrySet()) {
                    clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                str = clearQuery.build().toString();
            }
            i971 i971Var2 = new i971(7, i971Var);
            nr41 nr41Var = new nr41(27, a441Var);
            Context context3 = ((n291) v981Var2).a;
            s971 s971Var = new s971(context, fe81Var2, wha1.c(context3, context3), str, nr41Var, bs81Var, i971Var2);
            s971Var.setTag(obj);
            ((dy61) ddfVar.b).b(s971Var);
            context2 = context;
            i2 = 5;
        }
    }

    public tpq0(Context context, e971 e971Var, i971 i971Var, wo71 wo71Var, v981 v981Var, fe81 fe81Var) {
        this.c = fe81Var;
        this.d = v981Var;
        this.e = wo71Var;
        this.f = i971Var;
        this.g = e971Var;
        this.a = context.getApplicationContext();
    }
}
