package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.exception.JsonDataException;

/* loaded from: classes10.dex */
public final class rk90 implements b70 {
    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        if (bfxVar instanceof ek00) {
            ((ek00) bfxVar).d(obj);
        } else {
            ny61.r("UnsafeAdapter only supports MapJsonWriter");
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        if (!(xdxVar instanceof zj00)) {
            ny61.r("UnsafeAdapter only supports MapJsonReader");
            return null;
        }
        zj00 zj00Var = (zj00) xdxVar;
        Object obj = zj00Var.w;
        if (obj == null) {
            throw new JsonDataException("Expected a non-null value at path ".concat(zj00Var.d()), 2);
        }
        zj00Var.a();
        return obj;
    }
}
