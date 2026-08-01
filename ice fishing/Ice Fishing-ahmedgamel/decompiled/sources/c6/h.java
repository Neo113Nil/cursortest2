package c6;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;

/* loaded from: classes2.dex */
public final class h extends IllegalArgumentException {

    /* renamed from: n, reason: collision with root package name */
    public final int f5589n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(int i, O7.c cVar) {
        super(r0.toString());
        String str;
        StringBuilder i6 = AbstractC4404f.i(i, "Unknown enum tag ", " for ");
        if (cVar != null) {
            Class a9 = ((kotlin.jvm.internal.c) cVar).a();
            kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            str = a9.getName();
        } else {
            str = null;
        }
        i6.append(str);
        this.f5589n = i;
    }
}
