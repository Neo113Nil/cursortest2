package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class puq extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ quq s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ puq(quq quqVar, int i) {
        super(1);
        this.r = i;
        this.s = quqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                quq quqVar = this.s;
                quqVar.c = null;
                if (!booleanValue) {
                    float f = quqVar.d;
                    float thumbValue = quqVar.getThumbValue();
                    if (f != thumbValue) {
                        ckj ckjVar = quqVar.b;
                        ckjVar.getClass();
                        akj akjVar = new akj(ckjVar);
                        while (akjVar.hasNext()) {
                            ((nuq) akjVar.next()).b(thumbValue);
                        }
                    }
                }
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                quq quqVar2 = this.s;
                quqVar2.e = null;
                if (!booleanValue2) {
                    Float f2 = quqVar2.f;
                    Float thumbSecondaryValue = quqVar2.getThumbSecondaryValue();
                    if (!Intrinsics.c(f2, thumbSecondaryValue)) {
                        ckj ckjVar2 = quqVar2.b;
                        ckjVar2.getClass();
                        akj akjVar2 = new akj(ckjVar2);
                        while (akjVar2.hasNext()) {
                            ((nuq) akjVar2.next()).a(thumbSecondaryValue);
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
