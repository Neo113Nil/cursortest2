package defpackage;

import android.content.Context;
import com.yandex.plus.metrica.a;
import com.yandex.plus.metrica.utils.g;
import com.yandex.plus.metrica.utils.l;
import com.yandex.plus.metrica.utils.x;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class hgh implements Function0 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hgh(a aVar, l lVar, String str, String str2, String str3, String str4, com.yandex.plus.core.config.a aVar2, Function0 function0, Function0 function02) {
        this.c = aVar;
        this.b = lVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = aVar2;
        this.i = function0;
        this.j = (ezc) function02;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                uol uolVar = (uol) this.c;
                jyr jyrVar = (jyr) this.b;
                jyr jyrVar2 = (jyr) this.d;
                jyr jyrVar3 = (jyr) this.e;
                jgh jghVar = (jgh) this.h;
                jyr jyrVar4 = (jyr) this.f;
                o8q o8qVar = (o8q) this.i;
                g3i g3iVar = (g3i) this.j;
                jyr jyrVar5 = (jyr) this.g;
                wnh wnhVar = (wnh) jyrVar.getValue();
                gal galVar = (gal) jyrVar2.getValue();
                clp clpVar = (clp) jyrVar3.getValue();
                z08 z08Var = (z08) jghVar.e.getValue();
                wgh wghVar = (wgh) jyrVar4.getValue();
                ((zsh) jyrVar5.getValue()).getClass();
                return new ngh(uolVar, wnhVar, galVar, clpVar, z08Var, wghVar, o8qVar, g3iVar);
            case 1:
                return new rzu((arf) this.c, (arf) this.d, (arf) this.e, (arf) this.f, (jyr) this.b, (y3l) this.g, (List) this.h, (kan) this.i, (pr3) this.j);
            default:
                a aVar = (a) this.c;
                g gVar = (g) this.b;
                String str = (String) this.d;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.g;
                com.yandex.plus.core.config.a aVar2 = (com.yandex.plus.core.config.a) this.h;
                Function0 function0 = (Function0) this.i;
                ?? r11 = (ezc) this.j;
                Context context = aVar.a;
                context.getClass();
                gVar.getClass();
                aVar2.getClass();
                return new x(context, gVar, str, str2, str3, str4, aVar2, function0, r11);
        }
    }

    public /* synthetic */ hgh(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, y3l y3lVar, c5b c5bVar, kan kanVar, pr3 pr3Var) {
        this.c = jyrVar;
        this.d = jyrVar2;
        this.e = jyrVar3;
        this.f = jyrVar4;
        this.b = jyrVar5;
        this.g = y3lVar;
        this.h = c5bVar;
        this.i = kanVar;
        this.j = pr3Var;
    }

    public /* synthetic */ hgh(uol uolVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jgh jghVar, jyr jyrVar4, o8q o8qVar, g3i g3iVar, jyr jyrVar5) {
        this.c = uolVar;
        this.b = jyrVar;
        this.d = jyrVar2;
        this.e = jyrVar3;
        this.h = jghVar;
        this.f = jyrVar4;
        this.i = o8qVar;
        this.j = g3iVar;
        this.g = jyrVar5;
    }
}
