package bc;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t implements wc.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1065b;

    public /* synthetic */ t(int i10, Object obj) {
        this.f1064a = i10;
        this.f1065b = obj;
    }

    @Override // wc.e
    public final Iterator iterator() {
        switch (this.f1064a) {
            case 0:
                return ((Iterable) this.f1065b).iterator();
            default:
                return (Iterator) this.f1065b;
        }
    }
}
