package defpackage;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class r20 extends orn {
    public final Enum d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r20(int i) {
        this(q20.YANDEXMUSIC);
        switch (i) {
            case 1:
                this(a8p.YANDEXMUSIC);
                break;
            default:
                break;
        }
    }

    public e2t c(String str) {
        str.getClass();
        return (e2t) a(String.format(((d2t) this.d).b, Arrays.copyOf(new Object[]{str}, 1)), true);
    }

    public r20(a8p a8pVar) {
        super(a8pVar.a, new vmk(10));
        this.d = a8pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r20(d2t d2tVar) {
        super(d2tVar.a, new vmk(18));
        d2tVar.getClass();
        this.d = d2tVar;
    }

    public r20(q20 q20Var) {
        super(q20Var.a, new p20(0));
        this.d = q20Var;
    }
}
