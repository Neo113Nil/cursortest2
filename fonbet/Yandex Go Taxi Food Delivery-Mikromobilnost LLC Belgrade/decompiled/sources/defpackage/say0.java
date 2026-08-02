package defpackage;

import kotlin.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes10.dex */
public final class say0 implements pwy0 {
    public static final /* synthetic */ kgx[] c = {new MutablePropertyReference1Impl("localField", 0, "getLocalField()I", say0.class)};
    public final qdx a;
    public final i3y b = a.a(new oay0(1, this));

    public say0(dne0 dne0Var) {
        this.a = bvf0.C(dne0Var.b(), "LAST_THEME_TYPE");
    }

    @Override // defpackage.pwy0
    public final tpr a() {
        return (pz40) this.b.getValue();
    }

    @Override // defpackage.pwy0
    public final ThemeType getThemeType() {
        return (ThemeType) ((r0) ((pz40) this.b.getValue())).getValue();
    }
}
