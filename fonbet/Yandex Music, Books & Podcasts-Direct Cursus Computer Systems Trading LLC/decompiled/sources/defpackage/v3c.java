package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class v3c extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ b9t s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3c(b9t b9tVar, int i) {
        super(1);
        this.r = i;
        this.s = b9tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.a.put("yandex:fade:screenPosition", (int[]) obj);
                break;
            case 1:
                this.s.a.put("yandex:fade:screenPosition", (int[]) obj);
                break;
            case 2:
                this.s.a.put("yandex:scale:screenPosition", (int[]) obj);
                break;
            case 3:
                this.s.a.put("yandex:scale:screenPosition", (int[]) obj);
                break;
            case 4:
                this.s.a.put("yandex:slide:screenPosition", (int[]) obj);
                break;
            case 5:
                this.s.a.put("yandex:slide:screenPosition", (int[]) obj);
                break;
            case 6:
                this.s.a.put("yandex:verticalTranslation:screenPosition", (int[]) obj);
                break;
            default:
                this.s.a.put("yandex:verticalTranslation:screenPosition", (int[]) obj);
                break;
        }
        return Unit.a;
    }
}
