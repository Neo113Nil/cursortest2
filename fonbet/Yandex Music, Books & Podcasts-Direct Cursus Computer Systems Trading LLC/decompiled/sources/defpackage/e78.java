package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e78 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public z0j g;
    public int h;
    public final /* synthetic */ l78 i;

    public e78(l78 l78Var, String str) {
        this.i = l78Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.a.d(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.a.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final g78 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            l78 l78Var = this.i;
            if (i >= size) {
                this.h++;
                return new g78(l78Var, this);
            }
            if (!l78Var.p.f((cak) arrayList.get(i))) {
                try {
                    l78Var.P(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
