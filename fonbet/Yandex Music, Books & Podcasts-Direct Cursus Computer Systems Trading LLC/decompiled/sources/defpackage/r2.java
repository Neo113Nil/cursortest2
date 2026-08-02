package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class r2 implements c9j {
    public final lt a;
    public final ArrayList b;
    public final String c;

    public r2(lt ltVar, String str, ArrayList arrayList) {
        this.a = ltVar;
        this.b = arrayList;
        this.c = str;
    }

    @Override // defpackage.c9j
    public final lt a() {
        return this.a;
    }

    @Override // defpackage.c9j
    public final String getDescription() {
        return this.c;
    }
}
