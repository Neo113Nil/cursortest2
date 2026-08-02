package defpackage;

import java.util.List;

/* loaded from: classes13.dex */
public final class zjn0 {
    public final Throwable a;
    public final List b;
    public final String c;

    public zjn0(String str, Throwable th, List list) {
        this.a = th;
        this.b = list;
        this.c = str;
    }

    public /* synthetic */ zjn0(Throwable th, List list, int i) {
        this((String) null, th, (i & 2) != 0 ? null : list);
    }
}
