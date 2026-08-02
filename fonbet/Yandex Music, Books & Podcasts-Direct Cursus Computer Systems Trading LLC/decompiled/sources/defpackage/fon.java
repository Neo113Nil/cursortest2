package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class fon implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vov b;
    public final /* synthetic */ Context c;

    public /* synthetic */ fon(vov vovVar, Context context, int i) {
        this.a = i;
        this.b = vovVar;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Context context = this.c;
        vov vovVar = this.b;
        ifp ifpVar = (ifp) obj;
        ifpVar.getClass();
        switch (i) {
            case 0:
                ifpVar.a.put(wdp.j, "loaded_cover");
                context.getClass();
                String o = ouj.o(vovVar.b, ". ", vovVar.c);
                if (vovVar.d != null) {
                    String string = context.getResources().getString(R.string.explicit_element_content_description);
                    string.getClass();
                    o = ouj.o(string, ". ", o);
                }
                ngg.G(ifpVar, o);
                break;
            default:
                ifpVar.a.put(wdp.j, "loaded_cover");
                context.getClass();
                String o2 = ouj.o(vovVar.b, ". ", vovVar.c);
                if (vovVar.d != null) {
                    String string2 = context.getResources().getString(R.string.explicit_element_content_description);
                    string2.getClass();
                    o2 = ouj.o(string2, ". ", o2);
                }
                ngg.G(ifpVar, o2);
                break;
        }
        return Unit.a;
    }
}
