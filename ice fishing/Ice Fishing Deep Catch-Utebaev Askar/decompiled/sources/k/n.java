package k;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m.d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f154a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ArrayList arrayList) {
        super(1);
        this.f154a = arrayList;
    }

    public final void b(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.f154a.add(it);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((String) obj);
        return Unit.f157a;
    }
}
