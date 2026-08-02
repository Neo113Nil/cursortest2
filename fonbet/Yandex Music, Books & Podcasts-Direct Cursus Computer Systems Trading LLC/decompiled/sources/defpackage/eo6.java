package defpackage;

import java.io.File;
import java.io.FileInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class eo6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ eo6(File file, int i) {
        this.a = i;
        this.b = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.delete();
                return Unit.a;
            default:
                return new FileInputStream(this.b);
        }
    }
}
