package defpackage;

import com.yandex.go.preorder.mode.SourcePointMode;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.preorder.source.j;
import ru.yandex.taxi.utils.c;

/* loaded from: classes6.dex */
public final class zgt0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ zgt0(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                dot0 dot0Var = (dot0) obj;
                c cVar = jVar.b;
                if (!dot0Var.equals(dot0.k)) {
                    String str = dot0Var.b;
                    String str2 = dot0Var.c;
                    if (str != null) {
                        cVar.a(str);
                    }
                    if (str2 != null) {
                        cVar.a(str2);
                    }
                }
                jVar.c(false);
                break;
            default:
                SourcePointMode sourcePointMode = (SourcePointMode) obj;
                jVar.getClass();
                jVar.c(sourcePointMode != SourcePointMode.POINT);
                break;
        }
        return zy11Var;
    }
}
