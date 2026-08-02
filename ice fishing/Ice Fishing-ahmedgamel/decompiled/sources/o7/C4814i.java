package o7;

import com.anythink.core.common.d.j;
import g7.n;
import i7.AbstractC4599a;
import i7.InterfaceC4600b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: o7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4814i {

    /* renamed from: c, reason: collision with root package name */
    public static final C4806a f39758c;

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f39759d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39760a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39761b;

    static {
        F.d a9 = g7.d.a();
        f39758c = new C4806a(new g7.c(), new g7.d((g7.b) a9.f918c, (C4812g) a9.f919d, a9.f917b), C4812g.f39756a, 2000);
        f39759d = Logger.getLogger(C4814i.class.getName());
    }

    public C4814i(ArrayList arrayList) {
        n[] values = n.values();
        if (values.length <= 0) {
            this.f39761b = arrayList;
        } else {
            n nVar = values[0];
            g7.d.a();
            throw null;
        }
    }

    public final List a(k7.b bVar, Y6.a aVar) {
        String str;
        n nVar;
        Logger logger;
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f39761b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = bVar.f38621b;
            nVar = bVar.f38624e;
            logger = f39759d;
            if (!hasNext) {
                break;
            }
            C4806a c4806a = (C4806a) it.next();
            g7.c cVar = c4806a.f39745a;
            char charAt = "*".charAt(0);
            if (charAt == '*' || charAt == '?') {
                StringBuilder sb = new StringBuilder();
                char charAt2 = "*".charAt(0);
                if (charAt2 == '*' || charAt2 == '?') {
                    if (charAt2 == '*') {
                        sb.append(".*");
                    } else {
                        sb.append(j.f13164z);
                    }
                    i = -1;
                } else {
                    i = 0;
                }
                if (i != -1) {
                    sb.append(Pattern.quote("*".substring(i)));
                }
                Pattern.compile(sb.toString());
            }
            g7.b bVar2 = c4806a.f39746b.f37685a;
            if (((InterfaceC4600b) bVar2).a(bVar)) {
                arrayList.add(c4806a);
            } else {
                logger.log(Level.WARNING, "View aggregation " + AbstractC4599a.a(bVar2) + " is incompatible with instrument " + str + " of type " + nVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        C4806a c4806a2 = (C4806a) this.f39760a.get(nVar);
        Objects.requireNonNull(c4806a2);
        g7.b bVar3 = c4806a2.f39746b.f37685a;
        if (!((InterfaceC4600b) bVar3).a(bVar)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + AbstractC4599a.a(bVar3) + " is incompatible with instrument " + str + " of type " + nVar);
            c4806a2 = f39758c;
        }
        bVar.f38626g.getClass();
        return Collections.singletonList(c4806a2);
    }
}
