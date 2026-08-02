package defpackage;

import com.arkivanov.mvikotlin.extensions.coroutines.StoreExtKt$special$$inlined$toFlow$2;

/* loaded from: classes.dex */
public final class rq60 implements oq60 {
    public final sls a;
    public final tls b;

    public rq60(StoreExtKt$special$$inlined$toFlow$2.AnonymousClass1 anonymousClass1, tls tlsVar) {
        this.a = anonymousClass1;
        this.b = tlsVar;
    }

    @Override // defpackage.oq60
    public final void a(Object obj) {
        tls tlsVar = this.b;
        if (tlsVar != null) {
            tlsVar.invoke(obj);
        }
    }

    @Override // defpackage.oq60
    public final void onComplete() {
        sls slsVar = this.a;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public rq60() {
        this(null, null);
    }
}
