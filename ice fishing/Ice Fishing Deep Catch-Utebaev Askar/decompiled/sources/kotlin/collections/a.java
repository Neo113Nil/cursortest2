package kotlin.collections;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m.d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f158a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f158a = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(Object obj) {
        return obj == this.f158a ? "(this Collection)" : String.valueOf(obj);
    }
}
