package d4;

import P2.w;

/* renamed from: d4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4451e extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4451e(String str) {
        super(str);
        w.f(str, "Detail message must not be empty");
    }
}
