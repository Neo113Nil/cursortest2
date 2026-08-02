package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class n9h extends k4f {
    public final /* synthetic */ int d;
    public final ohp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9h(t9f t9fVar, t9f t9fVar2, int i) {
        super(t9fVar, t9fVar2);
        this.d = i;
        t9fVar.getClass();
        t9fVar2.getClass();
        switch (i) {
            case 1:
                super(t9fVar, t9fVar2);
                mhp[] mhpVarArr = new mhp[0];
                if (StringsKt.U("kotlin.Pair")) {
                    xq0.x("Blank serial names are prohibited");
                    throw null;
                }
                mm4 mm4Var = new mm4("kotlin.Pair");
                mm4.a(mm4Var, "first", t9fVar.getDescriptor());
                mm4.a(mm4Var, "second", t9fVar2.getDescriptor());
                this.e = new ohp("kotlin.Pair", emr.b, mm4Var.c.size(), xz0.X(mhpVarArr), mm4Var);
                return;
            default:
                this.e = avf.x("kotlin.collections.Map.Entry", emr.d, new mhp[0], new dae(19, t9fVar, t9fVar2));
                return;
        }
    }

    @Override // defpackage.k4f
    public final Object a(Object obj) {
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey();
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                return pair.a;
        }
    }

    @Override // defpackage.k4f
    public final Object b(Object obj) {
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getValue();
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                return pair.b;
        }
    }

    @Override // defpackage.k4f
    public final Object d(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return new m9h(obj, obj2);
            default:
                return new Pair(obj, obj2);
        }
    }

    @Override // defpackage.k4f, defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.d) {
        }
        return this.e;
    }
}
