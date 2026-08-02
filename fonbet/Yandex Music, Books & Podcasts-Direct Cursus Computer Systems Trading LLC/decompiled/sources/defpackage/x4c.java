package defpackage;

import java.util.Random;

/* loaded from: classes5.dex */
public final class x4c extends n8 {
    public final a c = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // defpackage.n8
    public final Random h() {
        Object obj = this.c.get();
        obj.getClass();
        return (Random) obj;
    }
}
