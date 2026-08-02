package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class rir implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ uir b;

    public /* synthetic */ rir(uir uirVar, int i) {
        this.a = i;
        this.b = uirVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        uir uirVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                uirVar.n.i(new z131(DivkitThemeChangeListener.THEME_VARIABLE_NAME, str));
                uirVar.o.a(str);
                break;
            default:
                e0m e0mVar = (e0m) obj;
                a4q0 a4q0Var = new a4q0();
                sjh sjhVar = uyj.a;
                jb7 jb7Var = zse.a;
                jse jseVar = (jse) jb7Var.w;
                e0mVar.b(new fzp0(a4q0Var, (uyg) null, jseVar, (seu) null));
                gzp0 gzp0Var = new gzp0(a4q0Var, null, jseVar, null);
                LinkedHashMap linkedHashMap = e0mVar.a;
                linkedHashMap.put("section", gzp0Var);
                e0mVar.c(new q6q0());
                e0mVar.c(new u1q0());
                linkedHashMap.put("skeleton", jks0.a);
                KSerializer serializer = ojh.Companion.serializer();
                LinkedHashMap linkedHashMap2 = e0mVar.b;
                linkedHashMap2.put("DefaultScaffold", serializer);
                e0mVar.a(uoh.j, uoh.k);
                e0mVar.c(new n6x());
                e0mVar.b(new f6x());
                e0mVar.c(new pbs0());
                e0mVar.c(new bf11());
                e0mVar.b(new mui0());
                e0mVar.b(new hwi0(a.m0(Collections.singletonList(new qzl()), EmptyList.a)));
                e0mVar.c(new lwi0());
                e0mVar.a(new qid(Arrays.asList(uoh.c, uoh.l, uoh.f, uoh.g, uoh.i, uoh.n, uoh.b, uoh.e)));
                linkedHashMap.put("divkit", qtl.a);
                linkedHashMap2.put("DivkitScaffold", wul.Companion.serializer());
                e0mVar.c(new fwl(new sul(kotlin.a.a(new acj(19)))), new flex.extension.divkit.a(false, (jse) jb7Var.w));
                e0mVar.b(new fzp0(new a4q0(), new qir(0), (uyg) null, (seu) null));
                e0mVar.b(new ph2(hxk.b.m(uirVar.a), null));
                e0mVar.a(uoh.d);
                e0mVar.c(new uf21());
                e0mVar.a(uoh.m);
                e0mVar.a(uoh.h);
                break;
        }
        return zy11Var;
    }
}
