package yads;

import defpackage.sls;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final class be extends Lambda implements sls {
    public static final be w = new be();

    public be() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new Regex("^\"(.*)\"\\s+(.+?)?\\s*prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)$");
    }
}
