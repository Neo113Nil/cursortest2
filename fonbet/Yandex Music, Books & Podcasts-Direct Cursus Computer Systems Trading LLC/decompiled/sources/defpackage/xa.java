package defpackage;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xa extends b6 {
    public static xa f;
    public static xa g;
    public final /* synthetic */ int d;
    public BreakIterator e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xa(int i) {
        super(1, (byte) 0);
        this.d = i;
    }

    @Override // defpackage.b6
    public final int[] G(int i) {
        switch (this.d) {
            case 0:
                int length = t().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.e;
                    if (breakIterator == null) {
                        Intrinsics.j("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.e;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.j("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return s(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.j("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = t().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !Q(i - 1) && !P(i)) {
                    BreakIterator breakIterator3 = this.e;
                    if (breakIterator3 == null) {
                        Intrinsics.j("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.e;
                if (breakIterator4 == null) {
                    Intrinsics.j("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !Q(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !Q(preceding2 - 1)) {
                    return s(preceding2, i);
                }
                return null;
        }
    }

    public final void O(String str) {
        switch (this.d) {
            case 0:
                this.b = str;
                BreakIterator breakIterator = this.e;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.j("impl");
                    throw null;
                }
            default:
                this.b = str;
                BreakIterator breakIterator2 = this.e;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.j("impl");
                    throw null;
                }
        }
    }

    public boolean P(int i) {
        if (i <= 0 || !Q(i - 1)) {
            return false;
        }
        return i == t().length() || !Q(i);
    }

    public boolean Q(int i) {
        if (i < 0 || i >= t().length()) {
            return false;
        }
        return Character.isLetterOrDigit(t().codePointAt(i));
    }

    @Override // defpackage.b6
    public final int[] o(int i) {
        switch (this.d) {
            case 0:
                int length = t().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.e;
                    if (breakIterator == null) {
                        Intrinsics.j("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.e;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.j("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return s(i, following);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.j("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (t().length() <= 0 || i >= t().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!Q(i) && (!Q(i) || (i != 0 && Q(i - 1)))) {
                    BreakIterator breakIterator3 = this.e;
                    if (breakIterator3 == null) {
                        Intrinsics.j("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.e;
                if (breakIterator4 == null) {
                    Intrinsics.j("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !P(following2)) {
                    return null;
                }
                return s(i, following2);
        }
    }
}
