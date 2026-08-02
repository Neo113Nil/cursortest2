package flex.extension.divkit;

import defpackage.bnr0;
import defpackage.bvf0;
import defpackage.fnr0;
import defpackage.gtq0;
import defpackage.jse;
import defpackage.n5o;
import defpackage.nez;
import defpackage.qoi0;
import defpackage.sbx;
import defpackage.sjh;
import defpackage.tje;
import defpackage.utl;
import defpackage.uyj;
import defpackage.vtl;
import defpackage.xfz;
import defpackage.zjr;
import defpackage.zse;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class a extends fnr0 {
    public final boolean a;
    public final jse b;
    public final zjr c;
    public final boolean d;
    public final String e;
    public final String f;

    public a(boolean z, jse jseVar) {
        super(0);
        this.a = z;
        this.b = jseVar;
        this.c = new zjr(xfz.b(a.class.getSimpleName()));
        this.d = Runtime.getRuntime().availableProcessors() > 2;
        this.e = "divData";
        this.f = "DivkitDivDataSharedDataParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.e;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.util.Map] */
    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        sbx sbxVar2;
        Object failure;
        String str;
        c cVar = bVar instanceof c ? (c) bVar : null;
        if (cVar == null) {
            return null;
        }
        Map map = cVar.a;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        nez nezVar = (nez) bvf0.A(sbxVar).c(qoi0.a(nez.class));
        if (nezVar != null && (str = nezVar.a) != null) {
            this.c.f(str);
        }
        if (this.a && this.d) {
            sbxVar2 = sbxVar;
            tje.X(new DivkitDivDataSharedDataParser$tryParse$2(ref$ObjectRef, cVar, this, sbxVar2, null));
        } else {
            sbxVar2 = sbxVar;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                try {
                    failure = (n5o) sbxVar2.a(gtq0.B(sbxVar2.b, qoi0.a(n5o.class)), (b) entry.getValue());
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                arrayList.add(new Pair(str2, new Result(failure)));
            }
            ref$ObjectRef.element = kotlin.collections.b.s(arrayList);
        }
        bvf0.A(sbxVar2).e(new utl((Map) ref$ObjectRef.element));
        return new vtl((Map) ref$ObjectRef.element);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a() {
        this(true, (jse) zse.a.w);
        sjh sjhVar = uyj.a;
    }
}
