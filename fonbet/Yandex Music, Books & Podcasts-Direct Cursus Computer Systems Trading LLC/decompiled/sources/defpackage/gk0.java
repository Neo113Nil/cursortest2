package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class gk0 extends pp2 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk0(List list, int i) {
        super(list, 0);
        this.c = i;
    }

    @Override // defpackage.ok0
    public final cs2 a() {
        switch (this.c) {
            case 0:
                return new s85(this.b, 0);
            case 1:
                return new bod(this.b, 0);
            case 2:
                return new s85(this.b, 1);
            case 3:
                return new bod(this.b, 1);
            case 4:
                return new bod(this.b, 2);
            case 5:
                return new oup(this.b);
            default:
                return new s85(this.b, 2);
        }
    }
}
