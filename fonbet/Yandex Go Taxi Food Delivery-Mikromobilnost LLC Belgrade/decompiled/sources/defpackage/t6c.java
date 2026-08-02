package defpackage;

import android.view.ViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class t6c implements y23, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y23
    public final void b(u1w u1wVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k6c k6cVar = (k6c) obj;
                ((ViewGroup) k6cVar.e.a(k6c.s[1])).setPadding(k6cVar.o + u1wVar.a, k6cVar.p + u1wVar.b, k6cVar.q + u1wVar.c, k6cVar.r + u1wVar.d);
                break;
            case 1:
                ((uze) obj).a.setPadding(u1wVar.a, u1wVar.b, u1wVar.c, u1wVar.d);
                break;
            case 2:
                r6o r6oVar = (r6o) obj;
                r6oVar.b().setPadding(r6oVar.n + u1wVar.a, r6oVar.o + u1wVar.b, r6oVar.p + u1wVar.c, r6oVar.q + u1wVar.d);
                break;
            default:
                ((ViewGroup) ((bue0) obj).c.a(bue0.m[0])).setPadding(u1wVar.a, u1wVar.b, u1wVar.c, u1wVar.d);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof y23) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof y23) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof y23) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof y23) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(1, (k6c) obj, k6c.class, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, (uze) obj, uze.class, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V", 0);
            case 2:
                return new FunctionReferenceImpl(1, (r6o) obj, r6o.class, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V", 0);
            default:
                return new FunctionReferenceImpl(1, (bue0) obj, bue0.class, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
