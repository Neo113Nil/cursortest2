package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class qnt0 implements Iterable, xfx {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qnt0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new rnt0((pnt0) obj, 0);
            default:
                return new dvu0((CharSequence) obj);
        }
    }
}
