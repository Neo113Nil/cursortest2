package defpackage;

import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.ab.validation.AbValidationType;

@vhp
/* loaded from: classes6.dex */
public final class z1 extends m2 {

    @NotNull
    public static final y1 Companion = new y1();
    public static final t9f[] c = {AbValidationType.Companion.serializer()};
    public final AbValidationType b;

    public /* synthetic */ z1(int i, AbValidationType abValidationType) {
        if (1 == (i & 1)) {
            this.b = abValidationType;
        } else {
            u7g.V(i, 1, x1.a.getDescriptor());
            throw null;
        }
    }

    @Override // defpackage.m2
    public final AbValidationType a() {
        return this.b;
    }
}
