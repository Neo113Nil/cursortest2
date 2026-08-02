package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class hnv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ knv b;

    public /* synthetic */ hnv(knv knvVar, int i) {
        this.a = i;
        this.b = knvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                knv knvVar = this.b;
                return new zlv(knvVar.h, new inv(knvVar, 0), new hnv(knvVar, 3), new inv(knvVar, 1));
            case 1:
                return new aon(new hjp(15, this.b));
            case 2:
                return new f9r(new hjp(15, this.b));
            default:
                return Integer.valueOf(((ConcurrentHashMap) this.b.a().i.g).size());
        }
    }
}
