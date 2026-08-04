package kotlin.text;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m.d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f201a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f201a = eVar;
    }

    public final MatchGroup b(int i2) {
        return this.f201a.b(i2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
