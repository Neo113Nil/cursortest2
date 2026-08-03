package y1;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public static c f8480e;

    /* renamed from: f, reason: collision with root package name */
    public static c f8481f;

    /* renamed from: g, reason: collision with root package name */
    public static c f8482g;

    /* renamed from: h, reason: collision with root package name */
    public static final r2.j f8483h = r2.j.f6029h;

    /* renamed from: i, reason: collision with root package name */
    public static final r2.j f8484i = r2.j.f6028g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8485c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8486d;

    @Override // y1.b
    public final int[] a(int i10) {
        int i11;
        switch (this.f8485c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f8486d;
                    if (breakIterator == null) {
                        pc.j.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f8486d;
                        if (breakIterator2 == null) {
                            pc.j.k("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i10);
                        if (following == -1) {
                            return null;
                        }
                        return b(i10, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f8486d;
                    if (breakIterator3 == null) {
                        pc.j.k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (c().length() <= 0 || i10 >= c().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!h(i10) && (!h(i10) || (i10 != 0 && h(i10 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f8486d;
                    if (breakIterator4 == null) {
                        pc.j.k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f8486d;
                if (breakIterator5 == null) {
                    pc.j.k("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i10);
                if (following2 == -1 || !g(following2)) {
                    return null;
                }
                return b(i10, following2);
            default:
                if (c().length() <= 0 || i10 >= c().length()) {
                    return null;
                }
                r2.j jVar = f8483h;
                if (i10 < 0) {
                    h2.e0 e0Var = (h2.e0) this.f8486d;
                    if (e0Var == null) {
                        pc.j.k("layoutResult");
                        throw null;
                    }
                    i11 = e0Var.a(0);
                } else {
                    h2.e0 e0Var2 = (h2.e0) this.f8486d;
                    if (e0Var2 == null) {
                        pc.j.k("layoutResult");
                        throw null;
                    }
                    int a6 = e0Var2.a(i10);
                    i11 = e(a6, jVar) == i10 ? a6 : a6 + 1;
                }
                h2.e0 e0Var3 = (h2.e0) this.f8486d;
                if (e0Var3 == null) {
                    pc.j.k("layoutResult");
                    throw null;
                }
                if (i11 >= e0Var3.f2652b.f889b) {
                    return null;
                }
                return b(e(i11, jVar), e(i11, f8484i) + 1);
        }
    }

    @Override // y1.b
    public final int[] d(int i10) {
        int i11;
        switch (this.f8485c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f8486d;
                    if (breakIterator == null) {
                        pc.j.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f8486d;
                        if (breakIterator2 == null) {
                            pc.j.k("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i10);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i10);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f8486d;
                    if (breakIterator3 == null) {
                        pc.j.k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int length2 = c().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !h(i10 - 1) && !g(i10)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f8486d;
                    if (breakIterator4 == null) {
                        pc.j.k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f8486d;
                if (breakIterator5 == null) {
                    pc.j.k("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i10);
                if (preceding2 == -1 || !h(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h(preceding2 - 1)) {
                    return b(preceding2, i10);
                }
                return null;
            default:
                if (c().length() <= 0 || i10 <= 0) {
                    return null;
                }
                int length3 = c().length();
                r2.j jVar = f8484i;
                if (i10 > length3) {
                    h2.e0 e0Var = (h2.e0) this.f8486d;
                    if (e0Var == null) {
                        pc.j.k("layoutResult");
                        throw null;
                    }
                    i11 = e0Var.a(c().length());
                } else {
                    h2.e0 e0Var2 = (h2.e0) this.f8486d;
                    if (e0Var2 == null) {
                        pc.j.k("layoutResult");
                        throw null;
                    }
                    int a6 = e0Var2.a(i10);
                    i11 = e(a6, jVar) + 1 == i10 ? a6 : a6 - 1;
                }
                if (i11 < 0) {
                    return null;
                }
                return b(e(i11, f8483h), e(i11, jVar) + 1);
        }
    }

    public int e(int i10, r2.j jVar) {
        h2.e0 e0Var = (h2.e0) this.f8486d;
        if (e0Var == null) {
            pc.j.k("layoutResult");
            throw null;
        }
        int c3 = e0Var.c(i10);
        h2.e0 e0Var2 = (h2.e0) this.f8486d;
        if (e0Var2 == null) {
            pc.j.k("layoutResult");
            throw null;
        }
        if (jVar != e0Var2.e(c3)) {
            h2.e0 e0Var3 = (h2.e0) this.f8486d;
            if (e0Var3 != null) {
                return e0Var3.c(i10);
            }
            pc.j.k("layoutResult");
            throw null;
        }
        h2.e0 e0Var4 = (h2.e0) this.f8486d;
        if (e0Var4 == null) {
            pc.j.k("layoutResult");
            throw null;
        }
        b0.s0 s0Var = e0Var4.f2652b;
        s0Var.g(i10);
        ArrayList arrayList = (ArrayList) s0Var.f892e;
        h2.a aVar = ((h2.n) arrayList.get(h2.z.d(i10, arrayList))).f2686a;
        return (aVar.f2609d.e(i10 - r6.f2689d) + r6.f2687b) - 1;
    }

    public void f(String str) {
        switch (this.f8485c) {
            case 0:
                this.f8473a = str;
                BreakIterator breakIterator = (BreakIterator) this.f8486d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    pc.j.k("impl");
                    throw null;
                }
            default:
                this.f8473a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f8486d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    pc.j.k("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i10) {
        if (i10 <= 0 || !h(i10 - 1)) {
            return false;
        }
        return i10 == c().length() || !h(i10);
    }

    public boolean h(int i10) {
        if (i10 < 0 || i10 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i10));
    }
}
