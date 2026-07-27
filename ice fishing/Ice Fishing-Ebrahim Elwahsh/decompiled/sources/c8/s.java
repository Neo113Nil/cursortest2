package c8;

import a8.W;
import a8.Z;
import a8.c0;
import a8.f0;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5801a = K3.b.A(Z.f4462b, c0.f4468b, W.f4457b, f0.f4478b);

    public static final boolean a(Y7.e eVar) {
        kotlin.jvm.internal.h.e(eVar, "<this>");
        return eVar.g() && f5801a.contains(eVar);
    }
}
