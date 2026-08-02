package defpackage;

import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.ab.validation.AbValidationType;

@vhp
/* loaded from: classes6.dex */
public final class f2 extends m2 {

    @NotNull
    public static final e2 Companion = new e2();
    public static final t9f[] c = {AbValidationType.Companion.serializer()};
    public final AbValidationType b;

    public /* synthetic */ f2(int i, AbValidationType abValidationType) {
        if (1 == (i & 1)) {
            this.b = abValidationType;
        } else {
            u7g.V(i, 1, d2.a.getDescriptor());
            throw null;
        }
    }

    @Override // defpackage.m2
    public final AbValidationType a() {
        return this.b;
    }

    public f2(AbValidationType abValidationType) {
        abValidationType.getClass();
        this.b = abValidationType;
    }
}
