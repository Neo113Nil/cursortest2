package o7;

import com.anythink.core.common.d.j;
import g7.n;
import i7.AbstractC4590a;
import i7.InterfaceC4591b;
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
public final class C4810i {

    /* renamed from: c, reason: collision with root package name */
    public static final C4802a f39647c;

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f39648d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39649a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39650b;

    static {
        F.d a9 = g7.d.a();
        f39647c = new C4802a(new g7.c(), new g7.d((g7.b) a9.f855c, (C4808g) a9.f856d, a9.f854b), C4808g.f39645a, 2000);
        f39648d = Logger.getLogger(C4810i.class.getName());
    }

    public C4810i(ArrayList arrayList) {
        n[] values = n.values();
        if (values.length <= 0) {
            this.f39650b = arrayList;
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
        Iterator it = this.f39650b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = bVar.f38694b;
            nVar = bVar.f38697e;
            logger = f39648d;
            if (!hasNext) {
                break;
            }
            C4802a c4802a = (C4802a) it.next();
            g7.c cVar = c4802a.f39634a;
            char charAt = "*".charAt(0);
            if (charAt == '*' || charAt == '?') {
                StringBuilder sb = new StringBuilder();
                char charAt2 = "*".charAt(0);
                if (charAt2 == '*' || charAt2 == '?') {
                    if (charAt2 == '*') {
                        sb.append(".*");
                    } else {
                        sb.append(j.f12378z);
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
            g7.b bVar2 = c4802a.f39635b.f37660a;
            if (((InterfaceC4591b) bVar2).a(bVar)) {
                arrayList.add(c4802a);
            } else {
                logger.log(Level.WARNING, "View aggregation " + AbstractC4590a.a(bVar2) + " is incompatible with instrument " + str + " of type " + nVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        C4802a c4802a2 = (C4802a) this.f39649a.get(nVar);
        Objects.requireNonNull(c4802a2);
        g7.b bVar3 = c4802a2.f39635b.f37660a;
        if (!((InterfaceC4591b) bVar3).a(bVar)) {
            logger.log(Level.WARNING, "Instrument default aggregation " + AbstractC4590a.a(bVar3) + " is incompatible with instrument " + str + " of type " + nVar);
            c4802a2 = f39647c;
        }
        bVar.f38699g.getClass();
        return Collections.singletonList(c4802a2);
    }
}
