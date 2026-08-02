package defpackage;

import com.google.common.collect.ImmutableSet;
import com.yandex.div.core.expression.variables.a;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class s800 implements hir {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s800(a aVar, Object obj, int i) {
        this.a = i;
        this.b = aVar;
        this.c = obj;
    }

    @Override // defpackage.hir
    public final void a(tjk tjkVar) {
        int i = this.a;
        Object obj = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                tjkVar.j = aVar;
                tjkVar.e = new xjd(kotlin.collections.a.J0((Set) obj));
                break;
            default:
                tjkVar.j = aVar;
                ImmutableSet i2 = ((c0g) ((i6r) obj)).i2();
                if (i2 != null) {
                    tjkVar.e = new xjd(kotlin.collections.a.J0(i2));
                    break;
                }
                break;
        }
    }
}
