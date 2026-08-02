package defpackage;

import java.util.List;

/* loaded from: classes15.dex */
public final class rc0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ List c;

    public /* synthetic */ rc0(List list, int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
        this.c = list;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        tls tlsVar = this.b;
        switch (i) {
        }
        return tlsVar.invoke(list.get(((Number) obj).intValue()));
    }
}
