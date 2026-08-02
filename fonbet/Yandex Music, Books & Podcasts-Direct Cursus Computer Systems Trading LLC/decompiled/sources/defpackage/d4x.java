package defpackage;

import com.yandex.plus.pay.inapp.google.internal.a;
import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class d4x implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4x(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ((qtm) this.b).onProductDetailsResponse((uz2) obj, arrayList);
                break;
            default:
                ((a) this.b).a((uz2) obj);
                break;
        }
    }
}
