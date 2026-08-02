package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class yzb implements ja8 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ uif c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ yzb(zzb zzbVar, String str, Function0 function0) {
        this.d = zzbVar;
        this.b = str;
        this.c = (uif) function0;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.a) {
            case 0:
                zzb zzbVar = (zzb) this.d;
                ckj ckjVar = (ckj) zzbVar.j.get((String) this.b);
                if (ckjVar != null) {
                    ckjVar.g(this.c);
                    break;
                }
                break;
            case 1:
                rxt rxtVar = (rxt) this.d;
                ckj ckjVar2 = (ckj) rxtVar.f.get((String) this.b);
                if (ckjVar2 != null) {
                    ckjVar2.g(this.c);
                    break;
                }
                break;
            default:
                List list = (List) this.d;
                rxt rxtVar2 = (rxt) this.b;
                nat natVar = (nat) this.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ckj ckjVar3 = (ckj) rxtVar2.g.get((String) it.next());
                    if (ckjVar3 != null) {
                        ckjVar3.g(natVar);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ yzb(rxt rxtVar, String str, Function1 function1) {
        this.d = rxtVar;
        this.b = str;
        this.c = (uif) function1;
    }

    public /* synthetic */ yzb(List list, rxt rxtVar, nat natVar) {
        this.d = list;
        this.b = rxtVar;
        this.c = natVar;
    }
}
