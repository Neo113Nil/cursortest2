package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.b;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* loaded from: classes5.dex */
public final class l7 extends w5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ l7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public MatchGroup a(int i) {
        Matcher matcher = ((jch) this.b).a;
        IntRange m = yhn.m(matcher.start(i), matcher.end(i));
        if (m.a < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new MatchGroup(group, m);
    }

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((b) this.b).containsValue(obj);
            case 1:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            default:
                return ((vlk) this.b).containsValue(obj);
        }
    }

    @Override // defpackage.w5
    public final int f() {
        switch (this.a) {
            case 0:
                return ((b) this.b).f();
            case 1:
                return ((jch) this.b).a.groupCount() + 1;
            default:
                return ((vlk) this.b).e;
        }
    }

    @Override // defpackage.w5, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new j7(((bmk) ((b) this.b).a()).iterator(), 1);
            case 1:
                return new n7t(new o7t(new wz0(1, u75.f(this)), new lhd(22, this)));
            default:
                aat aatVar = ((vlk) this.b).d;
                bat[] batVarArr = new bat[8];
                for (int i = 0; i < 8; i++) {
                    batVarArr[i] = new cat(2);
                }
                return new cmk(aatVar, batVarArr);
        }
    }
}
