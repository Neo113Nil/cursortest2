package defpackage;

import android.text.Editable;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public final class v46 extends res {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v46(int i, Object obj) {
        super(0);
        this.b = i;
        this.c = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        switch (this.b) {
            case 0:
                znk znkVar = ((x46) this.c).f;
                if (znkVar != null) {
                    u46 u46Var = (u46) znkVar.b;
                    x46 x46Var = u46Var.a;
                    x46Var.e.h0(new dy1(x46Var, u46.a(u46Var), 1));
                    break;
                }
                break;
            default:
                f4m f4mVar = ((i6w) this.c).f;
                if (f4mVar != null) {
                    g6w g6wVar = (g6w) f4mVar.b;
                    i6w i6wVar = g6wVar.c;
                    String trim = ((i6w) Preconditions.nonNull(i6wVar)).b.getText().toString().trim();
                    i6wVar.e.h0(new dy1(i6wVar, 10 <= trim.length() && trim.length() <= 10000 && ((str = g6wVar.j) == null || !trim.equals(str.trim())), 6));
                    break;
                }
                break;
        }
    }
}
