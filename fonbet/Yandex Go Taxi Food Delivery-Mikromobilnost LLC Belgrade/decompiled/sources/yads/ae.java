package yads;

import defpackage.sls;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final class ae extends Lambda implements sls {
    public static final ae w = new ae();

    public ae() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new Regex("at\\s+([^\\(]+)\\(([^:]+):(\\d+)\\)");
    }
}
