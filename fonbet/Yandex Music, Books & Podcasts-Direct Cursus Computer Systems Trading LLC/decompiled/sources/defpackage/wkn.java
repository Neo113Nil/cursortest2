package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class wkn extends o3o {
    public final /* synthetic */ int b;
    public final long c;
    public final Object d;
    public final ij3 e;

    public /* synthetic */ wkn(Object obj, long j, ij3 ij3Var, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
        this.e = ij3Var;
    }

    @Override // defpackage.o3o
    public final long g() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // defpackage.o3o
    public final twh o() {
        int i = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = twh.e;
                try {
                    return q5g.C(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (twh) obj;
        }
    }

    @Override // defpackage.o3o
    public final ij3 z() {
        switch (this.b) {
            case 0:
                return (ikn) this.e;
            default:
                return this.e;
        }
    }
}
