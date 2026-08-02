package defpackage;

import com.yandex.go.intentprocessor.i;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class thj0 extends hfj0 {
    public final i b;

    public thj0(i iVar) {
        this.b = iVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        q7z q7zVar = new q7z((gfj0) obj);
        i iVar = this.b;
        iVar.d(q7zVar, iVar.m);
        return zy11.a;
    }
}
