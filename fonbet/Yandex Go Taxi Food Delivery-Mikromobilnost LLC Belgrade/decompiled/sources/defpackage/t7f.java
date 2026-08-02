package defpackage;

import android.app.Activity;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.yandex.messaging.internal.chat.info.settings.domain.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class t7f {
    public final Activity a;
    public final ChatRequest b;
    public final a c;
    public final h3y d;
    public final ike e;
    public int f;
    public boolean g;
    public String h = "";
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final ArrayList m;
    public final r0 n;
    public final r0 o;

    public t7f(Activity activity, ChatRequest chatRequest, a aVar, h3y h3yVar, vse vseVar) {
        this.a = activity;
        this.b = chatRequest;
        this.c = aVar;
        this.d = h3yVar;
        this.e = vseVar.c(true);
        ArrayList arrayList = new ArrayList();
        int i = this.f + 1;
        this.f = i;
        arrayList.add(new o7f(i));
        int i2 = this.f + 1;
        this.f = i2;
        arrayList.add(new o7f(i2));
        this.m = arrayList;
        this.n = bvf0.c(c());
        this.o = bvf0.c(b());
    }

    public static boolean a(t7f t7fVar) {
        ArrayList arrayList = t7fVar.m;
        if (arrayList.size() == 10) {
            return false;
        }
        int i = t7fVar.f + 1;
        t7fVar.f = i;
        arrayList.add(new o7f(i, ""));
        t7fVar.d();
        return true;
    }

    public final ArrayList b() {
        String string;
        ArrayList arrayList = new ArrayList();
        arrayList.add(r7f.a);
        ArrayList arrayList2 = this.m;
        arrayList.addAll(arrayList2);
        if (arrayList2.size() < 10) {
            arrayList.add(n7f.a);
        }
        int size = arrayList2.size();
        if (size < 5) {
            string = null;
        } else {
            Activity activity = this.a;
            if (5 > size || size >= 10) {
                string = activity.getResources().getString(oyh0.messenger_create_poll_max_answers_exceeded);
            } else {
                int i = 10 - size;
                string = activity.getResources().getQuantityString(ewh0.messenger_create_poll_max_answers_warn, i, Integer.valueOf(i));
            }
        }
        arrayList.add(new p7f(string));
        boolean z = this.i;
        boolean z2 = this.j;
        Boolean valueOf = Boolean.valueOf(this.k);
        if (!this.g) {
            valueOf = null;
        }
        arrayList.add(new q7f(z, z2, valueOf, ((tqq0) this.d.get()).c ? Boolean.valueOf(this.l) : null));
        return arrayList;
    }

    public final PollMessageDraft c() {
        String str = this.h;
        ArrayList arrayList = this.m;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o7f) it.next()).b);
        }
        return new PollMessageDraft(str, arrayList2, this.i, this.j, this.k, this.l);
    }

    public final void d() {
        ArrayList b = b();
        r0 r0Var = this.o;
        r0Var.getClass();
        r0Var.m(null, b);
        e();
    }

    public final void e() {
        PollMessageDraft c = c();
        r0 r0Var = this.n;
        r0Var.getClass();
        r0Var.m(null, c);
    }
}
