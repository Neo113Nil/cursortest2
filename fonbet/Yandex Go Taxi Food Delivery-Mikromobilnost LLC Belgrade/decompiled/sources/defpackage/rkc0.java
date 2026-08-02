package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class rkc0 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final r0 e;

    public rkc0() {
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        this.a = synchronizedSet;
        Set synchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        this.b = synchronizedSet2;
        Set synchronizedSet3 = Collections.synchronizedSet(new LinkedHashSet());
        this.c = synchronizedSet3;
        Set synchronizedSet4 = Collections.synchronizedSet(new LinkedHashSet());
        this.d = synchronizedSet4;
        this.e = bvf0.c(new boc0(b.i(new Pair("PlaquesShown", a.N0(synchronizedSet)), new Pair("PlaquesInteracted", a.N0(synchronizedSet2)), new Pair("PerformActionsSucceed", a.N0(synchronizedSet3)), new Pair("PerformActionsFailed", a.N0(synchronizedSet4))), b.f(), b.f(), false));
    }
}
