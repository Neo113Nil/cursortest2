package defpackage;

import android.util.Log;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class x3k extends uif implements Function0 {
    public final /* synthetic */ kvf r;
    public final /* synthetic */ c2k s;
    public final /* synthetic */ tqn t;
    public final /* synthetic */ gyd u;
    public final /* synthetic */ ofg v;
    public final /* synthetic */ List w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ ofg z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3k(kvf kvfVar, c2k c2kVar, tqn tqnVar, gyd gydVar, ofg ofgVar, List list, int i, int i2, ofg ofgVar2) {
        super(0);
        this.r = kvfVar;
        this.s = c2kVar;
        this.t = tqnVar;
        this.u = gydVar;
        this.v = ofgVar;
        this.w = list;
        this.x = i;
        this.y = i2;
        this.z = ofgVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        List list2;
        c2k c2kVar = this.s;
        kvf kvfVar = this.r;
        kvfVar.e = c2kVar;
        this.t.a = true;
        gyd gydVar = this.u;
        kvfVar.c = gydVar;
        if (hyf.a != null && Log.isLoggable("Paging", 3)) {
            StringBuilder sb = new StringBuilder("Presenting data:\n                            |   first item: ");
            List list3 = this.w;
            c7t c7tVar = (c7t) CollectionsKt.firstOrNull(list3);
            Object obj = null;
            sb.append((c7tVar == null || (list2 = c7tVar.b) == null) ? null : CollectionsKt.firstOrNull(list2));
            sb.append("\n                            |   last item: ");
            c7t c7tVar2 = (c7t) CollectionsKt.Z(list3);
            if (c7tVar2 != null && (list = c7tVar2.b) != null) {
                obj = CollectionsKt.Z(list);
            }
            sb.append(obj);
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(this.x);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(this.y);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(gydVar);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(this.z);
            sb.append("\n                        ");
            String sb2 = sb.toString();
            ofg ofgVar = this.v;
            if (ofgVar != null) {
                sb2 = sb2 + "|   mediatorLoadStates: " + ofgVar + '\n';
            }
            Log.d("Paging", hlr.e(sb2.concat("|)")));
        }
        return Unit.a;
    }
}
