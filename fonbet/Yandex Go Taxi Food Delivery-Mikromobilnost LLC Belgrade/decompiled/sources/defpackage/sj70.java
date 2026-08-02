package defpackage;

import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class sj70 extends zij {
    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return jl40.l((ol70) obj, (ol70) obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        return jl40.l(((ol70) obj).c, ((ol70) obj2).c);
    }

    @Override // defpackage.zij
    public final Object c(Object obj, Object obj2) {
        ol70 ol70Var = (ol70) obj2;
        if (((ol70) obj) == ol70Var) {
            return null;
        }
        UiStateDrawableWrapper uiStateDrawableWrapper = ol70Var.a;
        return new rj70(uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null, ol70Var.b, ol70Var.d);
    }
}
