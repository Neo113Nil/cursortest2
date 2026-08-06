package Q1;

import h1.C0239i;
import java.io.IOException;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class l implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final u f1610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1611b;

    public l(q this$0, u uVar) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1611b = this$0;
        this.f1610a = uVar;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        EnumC0079b enumC0079b;
        q qVar = this.f1611b;
        u uVar = this.f1610a;
        EnumC0079b enumC0079b2 = EnumC0079b.INTERNAL_ERROR;
        IOException e2 = null;
        try {
            uVar.b(this);
            while (uVar.a(false, this)) {
            }
            enumC0079b = EnumC0079b.NO_ERROR;
            try {
                try {
                    qVar.a(enumC0079b, EnumC0079b.CANCEL, null);
                } catch (IOException e3) {
                    e2 = e3;
                    EnumC0079b enumC0079b3 = EnumC0079b.PROTOCOL_ERROR;
                    qVar.a(enumC0079b3, enumC0079b3, e2);
                    K1.b.d(uVar);
                    return C0239i.f3393a;
                }
            } catch (Throwable th) {
                th = th;
                qVar.a(enumC0079b, enumC0079b2, e2);
                K1.b.d(uVar);
                throw th;
            }
        } catch (IOException e4) {
            e2 = e4;
            enumC0079b = enumC0079b2;
        } catch (Throwable th2) {
            th = th2;
            enumC0079b = enumC0079b2;
            qVar.a(enumC0079b, enumC0079b2, e2);
            K1.b.d(uVar);
            throw th;
        }
        K1.b.d(uVar);
        return C0239i.f3393a;
    }
}
