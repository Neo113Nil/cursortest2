package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwww0;", "Lj530;", "Landroidx/compose/ui/input/pointer/g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class www0 extends j530 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public www0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new g(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof www0)) {
            return false;
        }
        www0 www0Var = (www0) obj;
        return jl40.l(this.a, www0Var.a) && jl40.l(this.b, www0Var.b) && this.c == www0Var.c;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        g gVar = (g) e530Var;
        Object obj = gVar.a;
        Object obj2 = this.a;
        boolean z = !jl40.l(obj, obj2);
        gVar.a = obj2;
        Object obj3 = gVar.b;
        Object obj4 = this.b;
        if (!jl40.l(obj3, obj4)) {
            z = true;
        }
        gVar.b = obj4;
        Class<?> cls = gVar.c.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            gVar.G0();
        }
        gVar.c = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
