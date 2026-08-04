package p;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends m.d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f232a = new f();

    public f() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj == null);
    }
}
