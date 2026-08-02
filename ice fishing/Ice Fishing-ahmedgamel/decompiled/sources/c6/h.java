package c6;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes2.dex */
public final class h extends IllegalArgumentException {

    /* renamed from: n, reason: collision with root package name */
    public final int f5765n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(int i, O7.c cVar) {
        super(r0.toString());
        String str;
        StringBuilder k9 = Wv.k(i, "Unknown enum tag ", " for ");
        if (cVar != null) {
            Class a9 = ((kotlin.jvm.internal.c) cVar).a();
            kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            str = a9.getName();
        } else {
            str = null;
        }
        k9.append(str);
        this.f5765n = i;
    }
}
