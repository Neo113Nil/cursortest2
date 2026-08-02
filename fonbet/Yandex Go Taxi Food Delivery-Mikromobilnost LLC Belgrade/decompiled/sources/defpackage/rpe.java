package defpackage;

import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class rpe extends wtf0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpe(String str, int i) {
        super("Core.ModuleStarted", g8e.z("module_name", str));
        switch (i) {
            case 1:
                super("Core.Setup", b.i(new Pair("quark_version", "1.160.0-lite"), new Pair("platform", str)));
                break;
            default:
                break;
        }
    }
}
