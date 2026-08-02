package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.editable_route_widget;

import defpackage.c0k0;
import defpackage.c71;
import defpackage.con;
import defpackage.e8l0;
import defpackage.f8l0;
import defpackage.g8l0;
import defpackage.hon;
import defpackage.ion;
import defpackage.j6s;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wnn;
import defpackage.x61;
import defpackage.yk40;
import defpackage.yzj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address.b a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector.b b;

    public a(ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address.b bVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r14v11, types: [T, g8l0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, g8l0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, g8l0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x018d -> B:11:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x019a -> B:12:0x019d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wnn wnnVar, j6s j6sVar, boolean z, ContinuationImpl continuationImpl) {
        EditableRouteMapper$map$1 editableRouteMapper$map$1;
        int i;
        Object obj;
        wnn wnnVar2;
        boolean z2;
        Ref$ObjectRef ref$ObjectRef;
        Iterator it;
        int i2;
        int i3;
        Collection collection;
        Ref$FloatRef ref$FloatRef;
        j6s j6sVar2;
        wnn wnnVar3;
        j6s j6sVar3;
        Ref$FloatRef ref$FloatRef2;
        Ref$ObjectRef ref$ObjectRef2;
        Iterator it2;
        e8l0 e8l0Var;
        Collection collection2;
        boolean z3;
        int i4;
        e8l0 e8l0Var2;
        Collection collection3;
        Object obj2;
        if (continuationImpl instanceof EditableRouteMapper$map$1) {
            editableRouteMapper$map$1 = (EditableRouteMapper$map$1) continuationImpl;
            int i5 = editableRouteMapper$map$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                editableRouteMapper$map$1.label = i5 - Integer.MIN_VALUE;
                Object obj3 = editableRouteMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = editableRouteMapper$map$1.label;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj3);
                    Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                    ref$FloatRef3.element = 0.0f;
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef3.element = new g8l0(0, 0);
                    wnnVar2 = wnnVar;
                    ArrayList arrayList = wnnVar2.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    z2 = z;
                    ref$ObjectRef = ref$ObjectRef3;
                    it = arrayList.iterator();
                    i2 = 0;
                    i3 = 0;
                    collection = arrayList2;
                    ref$FloatRef = ref$FloatRef3;
                    j6sVar2 = j6sVar;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    i2 = editableRouteMapper$map$1.I$1;
                    i4 = editableRouteMapper$map$1.I$0;
                    z3 = editableRouteMapper$map$1.Z$0;
                    collection2 = (Collection) editableRouteMapper$map$1.L$10;
                    e8l0Var = (e8l0) editableRouteMapper$map$1.L$9;
                    it2 = (Iterator) editableRouteMapper$map$1.L$7;
                    collection = (Collection) editableRouteMapper$map$1.L$6;
                    ref$ObjectRef2 = (Ref$ObjectRef) editableRouteMapper$map$1.L$3;
                    ref$FloatRef2 = (Ref$FloatRef) editableRouteMapper$map$1.L$2;
                    j6sVar3 = (j6s) editableRouteMapper$map$1.L$1;
                    wnnVar3 = (wnn) editableRouteMapper$map$1.L$0;
                    kotlin.b.b(obj3);
                    e8l0 e8l0Var3 = e8l0Var;
                    i3 = i4;
                    wnnVar2 = wnnVar3;
                    ref$ObjectRef = ref$ObjectRef2;
                    e8l0Var2 = e8l0Var3;
                    Iterator it3 = it2;
                    z2 = z3;
                    ref$FloatRef = ref$FloatRef2;
                    it = it3;
                    collection3 = collection;
                    collection = collection2;
                    obj2 = (x61) obj3;
                    j6sVar2 = j6sVar3;
                    if (obj2 != null) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = editableRouteMapper$map$1.I$1;
                    i3 = editableRouteMapper$map$1.I$0;
                    z2 = editableRouteMapper$map$1.Z$0;
                    collection = (Collection) editableRouteMapper$map$1.L$10;
                    e8l0Var2 = (e8l0) editableRouteMapper$map$1.L$9;
                    it = (Iterator) editableRouteMapper$map$1.L$7;
                    Collection collection4 = (Collection) editableRouteMapper$map$1.L$6;
                    ref$ObjectRef = (Ref$ObjectRef) editableRouteMapper$map$1.L$3;
                    Ref$FloatRef ref$FloatRef4 = (Ref$FloatRef) editableRouteMapper$map$1.L$2;
                    j6s j6sVar4 = (j6s) editableRouteMapper$map$1.L$1;
                    wnn wnnVar4 = (wnn) editableRouteMapper$map$1.L$0;
                    kotlin.b.b(obj3);
                    collection3 = collection4;
                    wnn wnnVar5 = wnnVar4;
                    obj2 = obj3;
                    j6sVar2 = j6sVar4;
                    ref$FloatRef = ref$FloatRef4;
                    wnnVar2 = wnnVar5;
                    if (obj2 != null) {
                        return null;
                    }
                    obj = null;
                    collection.add(new f8l0((g8l0) ref$ObjectRef.element, ref$FloatRef.element, (ion) obj2, e8l0Var2.b, e8l0Var2.c));
                    collection = collection3;
                    if (it.hasNext()) {
                        e8l0Var2 = (e8l0) it.next();
                        hon honVar = e8l0Var2.a;
                        if (honVar instanceof c71) {
                            c71 c71Var = (c71) honVar;
                            c0k0 c0k0Var = c71Var.b;
                            if (c0k0Var instanceof yzj0) {
                                int i6 = ((yzj0) c0k0Var).a;
                                ref$FloatRef.element = 56.0f;
                                ref$ObjectRef.element = new g8l0(i6, i6);
                                editableRouteMapper$map$1.L$0 = wnnVar2;
                                editableRouteMapper$map$1.L$1 = j6sVar2;
                                editableRouteMapper$map$1.L$2 = ref$FloatRef;
                                editableRouteMapper$map$1.L$3 = ref$ObjectRef;
                                Object obj4 = obj;
                                editableRouteMapper$map$1.L$4 = obj4;
                                editableRouteMapper$map$1.L$5 = obj4;
                                editableRouteMapper$map$1.L$6 = collection;
                                editableRouteMapper$map$1.L$7 = it;
                                editableRouteMapper$map$1.L$8 = obj4;
                                editableRouteMapper$map$1.L$9 = e8l0Var2;
                                editableRouteMapper$map$1.L$10 = collection;
                                editableRouteMapper$map$1.Z$0 = z2;
                                editableRouteMapper$map$1.I$0 = i3;
                                editableRouteMapper$map$1.I$1 = i2;
                                editableRouteMapper$map$1.I$2 = 0;
                                editableRouteMapper$map$1.I$3 = i6;
                                editableRouteMapper$map$1.label = 1;
                                Object a = this.b.a(c71Var, j6sVar2, null, editableRouteMapper$map$1);
                                if (a != coroutineSingletons) {
                                    Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                                    wnnVar3 = wnnVar2;
                                    i4 = i3;
                                    e8l0Var = e8l0Var2;
                                    ref$ObjectRef2 = ref$ObjectRef4;
                                    Iterator it4 = it;
                                    ref$FloatRef2 = ref$FloatRef;
                                    z3 = z2;
                                    it2 = it4;
                                    j6sVar3 = j6sVar2;
                                    obj3 = a;
                                    collection2 = collection;
                                    e8l0 e8l0Var32 = e8l0Var;
                                    i3 = i4;
                                    wnnVar2 = wnnVar3;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    e8l0Var2 = e8l0Var32;
                                    Iterator it32 = it2;
                                    z2 = z3;
                                    ref$FloatRef = ref$FloatRef2;
                                    it = it32;
                                    collection3 = collection;
                                    collection = collection2;
                                    obj2 = (x61) obj3;
                                    j6sVar2 = j6sVar3;
                                    if (obj2 != null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            collection3 = collection;
                            obj2 = null;
                            if (obj2 != null) {
                            }
                        } else {
                            if (honVar instanceof yk40) {
                                ref$FloatRef.element = 56.0f;
                                yk40 yk40Var = (yk40) honVar;
                                ref$ObjectRef.element = yk40Var.b;
                                editableRouteMapper$map$1.L$0 = wnnVar2;
                                editableRouteMapper$map$1.L$1 = j6sVar2;
                                editableRouteMapper$map$1.L$2 = ref$FloatRef;
                                editableRouteMapper$map$1.L$3 = ref$ObjectRef;
                                editableRouteMapper$map$1.L$4 = null;
                                editableRouteMapper$map$1.L$5 = null;
                                editableRouteMapper$map$1.L$6 = collection;
                                editableRouteMapper$map$1.L$7 = it;
                                editableRouteMapper$map$1.L$8 = null;
                                editableRouteMapper$map$1.L$9 = e8l0Var2;
                                editableRouteMapper$map$1.L$10 = collection;
                                editableRouteMapper$map$1.Z$0 = z2;
                                editableRouteMapper$map$1.I$0 = i3;
                                editableRouteMapper$map$1.I$1 = i2;
                                editableRouteMapper$map$1.I$2 = 0;
                                editableRouteMapper$map$1.label = 2;
                                Object a2 = this.a.a(yk40Var, j6sVar2, editableRouteMapper$map$1);
                                if (a2 != coroutineSingletons) {
                                    wnnVar4 = wnnVar2;
                                    ref$FloatRef4 = ref$FloatRef;
                                    j6sVar4 = j6sVar2;
                                    obj3 = a2;
                                    collection3 = collection;
                                    wnn wnnVar52 = wnnVar4;
                                    obj2 = obj3;
                                    j6sVar2 = j6sVar4;
                                    ref$FloatRef = ref$FloatRef4;
                                    wnnVar2 = wnnVar52;
                                    if (obj2 != null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            collection3 = collection;
                            obj2 = null;
                            if (obj2 != null) {
                            }
                        }
                        if (it.hasNext()) {
                            return new con((List) collection, z2, wnnVar2.c, wnnVar2.d, wnnVar2.a);
                        }
                    }
                }
            }
        }
        editableRouteMapper$map$1 = new EditableRouteMapper$map$1(this, continuationImpl);
        Object obj32 = editableRouteMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = editableRouteMapper$map$1.label;
        if (i != 0) {
        }
    }
}
