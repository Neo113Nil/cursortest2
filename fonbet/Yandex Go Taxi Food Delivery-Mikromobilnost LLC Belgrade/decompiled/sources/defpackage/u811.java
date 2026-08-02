package defpackage;

import com.yandex.go.intentprocessor.i;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class u811 extends t811 {
    public final i b;

    public u811(i iVar) {
        this.b = iVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        s7z s7zVar = new s7z((s811) obj);
        i iVar = this.b;
        iVar.d(s7zVar, iVar.m);
        return zy11.a;
    }
}
