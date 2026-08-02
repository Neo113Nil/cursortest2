package defpackage;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class ppe {
    public int a;
    public final HashMap b;
    public final HashMap c;

    public ppe(int i) {
        switch (i) {
            case 1:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.a = 1;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }
}
