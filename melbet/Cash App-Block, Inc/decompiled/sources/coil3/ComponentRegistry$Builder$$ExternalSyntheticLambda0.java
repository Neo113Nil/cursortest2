package coil3;

import coil3.decode.Decoder;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ComponentRegistry$Builder$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Decoder.Factory f$0;

    public /* synthetic */ ComponentRegistry$Builder$$ExternalSyntheticLambda0(Decoder.Factory factory, int i) {
        this.$r8$classId = i;
        this.f$0 = factory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Decoder.Factory factory = this.f$0;
        switch (i) {
        }
        return CollectionsKt__CollectionsJVMKt.listOf(factory);
    }
}
