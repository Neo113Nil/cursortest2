package defpackage;

import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.ab.validation.AbValidationType;

@vhp
/* loaded from: classes6.dex */
public final class c2 extends m2 {

    @NotNull
    public static final b2 Companion = new b2();
    public static final t9f[] c = {AbValidationType.Companion.serializer()};
    public final AbValidationType b;

    public /* synthetic */ c2(int i, AbValidationType abValidationType) {
        if (1 == (i & 1)) {
            this.b = abValidationType;
        } else {
            u7g.V(i, 1, a2.a.getDescriptor());
            throw null;
        }
    }

    @Override // defpackage.m2
    public final AbValidationType a() {
        return this.b;
    }

    public c2(AbValidationType abValidationType) {
        abValidationType.getClass();
        this.b = abValidationType;
    }
}
