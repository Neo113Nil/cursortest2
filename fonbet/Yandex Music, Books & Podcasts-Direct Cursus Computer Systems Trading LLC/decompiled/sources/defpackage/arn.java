package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class arn extends zz4 {
    public final f9f c;
    public final ux0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arn(f9f f9fVar, t9f t9fVar) {
        super(t9fVar);
        t9fVar.getClass();
        this.c = f9fVar;
        mhp descriptor = t9fVar.getDescriptor();
        descriptor.getClass();
        this.d = new ux0(descriptor, 0);
    }

    @Override // defpackage.x5
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.x5
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.x5
    public final void c(int i, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.ensureCapacity(i);
    }

    @Override // defpackage.x5
    public final Iterator d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new c7(objArr);
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.d;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        throw null;
    }

    @Override // defpackage.x5
    public final Object k(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object newInstance = Array.newInstance((Class<?>) leu.P(this.c), arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.zz4
    public final void l(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
