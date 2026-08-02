package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack;

import defpackage.do6;
import defpackage.dx90;
import defpackage.et;
import defpackage.ex90;
import defpackage.hw0;
import defpackage.iw0;
import defpackage.j6s;
import defpackage.jru;
import defpackage.kru;
import defpackage.ksy0;
import defpackage.lru;
import defpackage.mru;
import defpackage.muy0;
import defpackage.mze;
import defpackage.ny61;
import defpackage.o690;
import defpackage.pru;
import defpackage.q0f;
import defpackage.w511;
import defpackage.x2s;
import defpackage.xs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.ActionButtonMapper$Container;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.a b;
    public final ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_button.b c;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a d;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field.a e;
    public final do6 f;

    public a(ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b bVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.a aVar, ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_button.b bVar2, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2, ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_input_field.a aVar3, do6 do6Var) {
        this.a = bVar;
        this.b = aVar;
        this.c = bVar2;
        this.d = aVar2;
        this.e = aVar3;
        this.f = do6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r16v0, types: [ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c6 -> B:10:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mru mruVar, FormLoadingStateRepository$State formLoadingStateRepository$State, j6s j6sVar, Set set, boolean z, ContinuationImpl continuationImpl) {
        HorizontalStackMapper$map$1 horizontalStackMapper$map$1;
        int i;
        Set set2;
        mru mruVar2;
        HorizontalStackMapper$map$1 horizontalStackMapper$map$12;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        FormLoadingStateRepository$State formLoadingStateRepository$State2;
        j6s j6sVar2;
        boolean z2;
        if (continuationImpl instanceof HorizontalStackMapper$map$1) {
            horizontalStackMapper$map$1 = (HorizontalStackMapper$map$1) continuationImpl;
            int i5 = horizontalStackMapper$map$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                horizontalStackMapper$map$1.label = i5 - Integer.MIN_VALUE;
                Object obj = horizontalStackMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = horizontalStackMapper$map$1.label;
                int i6 = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = mruVar.b;
                    ArrayList arrayList3 = new ArrayList();
                    set2 = set;
                    mruVar2 = mruVar;
                    horizontalStackMapper$map$12 = horizontalStackMapper$map$1;
                    it = arrayList2.iterator();
                    arrayList = arrayList3;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    formLoadingStateRepository$State2 = formLoadingStateRepository$State;
                    j6sVar2 = j6sVar;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = horizontalStackMapper$map$1.I$2;
                    int i8 = horizontalStackMapper$map$1.I$1;
                    int i9 = horizontalStackMapper$map$1.I$0;
                    boolean z3 = horizontalStackMapper$map$1.Z$0;
                    Iterator it2 = (Iterator) horizontalStackMapper$map$1.L$8;
                    ?? r12 = (Collection) horizontalStackMapper$map$1.L$6;
                    Set set3 = (Set) horizontalStackMapper$map$1.L$3;
                    j6s j6sVar3 = (j6s) horizontalStackMapper$map$1.L$2;
                    FormLoadingStateRepository$State formLoadingStateRepository$State3 = (FormLoadingStateRepository$State) horizontalStackMapper$map$1.L$1;
                    mruVar2 = (mru) horizontalStackMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    horizontalStackMapper$map$12 = horizontalStackMapper$map$1;
                    formLoadingStateRepository$State2 = formLoadingStateRepository$State3;
                    arrayList = r12;
                    i3 = i8;
                    j6sVar2 = j6sVar3;
                    it = it2;
                    i2 = i7;
                    z2 = z3;
                    i4 = i9;
                    set2 = set3;
                    jru jruVar = (jru) obj;
                    if (jruVar != null) {
                        arrayList.add(jruVar);
                    }
                    i6 = 0;
                    if (it.hasNext()) {
                        kru kruVar = (kru) it.next();
                        horizontalStackMapper$map$12.L$0 = mruVar2;
                        horizontalStackMapper$map$12.L$1 = formLoadingStateRepository$State2;
                        horizontalStackMapper$map$12.L$2 = j6sVar2;
                        horizontalStackMapper$map$12.L$3 = set2;
                        horizontalStackMapper$map$12.L$4 = null;
                        horizontalStackMapper$map$12.L$5 = null;
                        horizontalStackMapper$map$12.L$6 = arrayList;
                        horizontalStackMapper$map$12.L$7 = null;
                        horizontalStackMapper$map$12.L$8 = it;
                        horizontalStackMapper$map$12.L$9 = null;
                        horizontalStackMapper$map$12.L$10 = null;
                        horizontalStackMapper$map$12.L$11 = null;
                        horizontalStackMapper$map$12.Z$0 = z2;
                        horizontalStackMapper$map$12.I$0 = i4;
                        horizontalStackMapper$map$12.I$1 = i3;
                        horizontalStackMapper$map$12.I$2 = i2;
                        horizontalStackMapper$map$12.I$3 = i6;
                        horizontalStackMapper$map$12.I$4 = i6;
                        horizontalStackMapper$map$12.label = 1;
                        obj = b(kruVar, formLoadingStateRepository$State2, z2, j6sVar2, set2, horizontalStackMapper$map$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        jru jruVar2 = (jru) obj;
                        if (jruVar2 != null) {
                        }
                        i6 = 0;
                        if (it.hasNext()) {
                            o690 o690Var = mruVar2.c;
                            this.d.getClass();
                            return new lru(arrayList, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var), mruVar2.d, new x2s(mruVar2.e, mruVar2.f));
                        }
                    }
                }
            }
        }
        horizontalStackMapper$map$1 = new HorizontalStackMapper$map$1(this, continuationImpl);
        Object obj2 = horizontalStackMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = horizontalStackMapper$map$1.label;
        int i62 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r14 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (r14 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        if (r14 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
    
        if (r14 == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kru kruVar, FormLoadingStateRepository$State formLoadingStateRepository$State, boolean z, j6s j6sVar, Set set, ContinuationImpl continuationImpl) {
        HorizontalStackMapper$mapHorizontalStackWidget$1 horizontalStackMapper$mapHorizontalStackWidget$1;
        int i;
        if (continuationImpl instanceof HorizontalStackMapper$mapHorizontalStackWidget$1) {
            horizontalStackMapper$mapHorizontalStackWidget$1 = (HorizontalStackMapper$mapHorizontalStackWidget$1) continuationImpl;
            int i2 = horizontalStackMapper$mapHorizontalStackWidget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                horizontalStackMapper$mapHorizontalStackWidget$1.label = i2 - Integer.MIN_VALUE;
                HorizontalStackMapper$mapHorizontalStackWidget$1 horizontalStackMapper$mapHorizontalStackWidget$12 = horizontalStackMapper$mapHorizontalStackWidget$1;
                Object obj = horizontalStackMapper$mapHorizontalStackWidget$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = horizontalStackMapper$mapHorizontalStackWidget$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kruVar = (kru) horizontalStackMapper$mapHorizontalStackWidget$12.L$0;
                        kotlin.b.b(obj);
                        return new jru(kruVar.a, (xs) obj);
                    }
                    if (i == 2) {
                        kruVar = (kru) horizontalStackMapper$mapHorizontalStackWidget$12.L$0;
                        kotlin.b.b(obj);
                        return new jru(kruVar.a, (dx90) obj);
                    }
                    if (i == 3) {
                        kruVar = (kru) horizontalStackMapper$mapHorizontalStackWidget$12.L$0;
                        kotlin.b.b(obj);
                        return new jru(kruVar.a, (muy0) obj);
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kruVar = (kru) horizontalStackMapper$mapHorizontalStackWidget$12.L$0;
                    kotlin.b.b(obj);
                    return new jru(kruVar.a, (hw0) obj);
                }
                kotlin.b.b(obj);
                pru pruVar = kruVar.b;
                if (pruVar instanceof et) {
                    ActionButtonMapper$Container actionButtonMapper$Container = ActionButtonMapper$Container.HORIZONTAL_STACK;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$0 = kruVar;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$1 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$2 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$3 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.Z$0 = z;
                    horizontalStackMapper$mapHorizontalStackWidget$12.label = 1;
                    obj = this.b.a((et) pruVar, formLoadingStateRepository$State, z, actionButtonMapper$Container, horizontalStackMapper$mapHorizontalStackWidget$12);
                } else if (pruVar instanceof ex90) {
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$0 = kruVar;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$1 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$2 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$3 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.Z$0 = z;
                    horizontalStackMapper$mapHorizontalStackWidget$12.label = 2;
                    obj = this.c.a((ex90) pruVar, j6sVar, horizontalStackMapper$mapHorizontalStackWidget$12);
                } else if (pruVar instanceof ksy0) {
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$0 = kruVar;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$1 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$2 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$3 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.Z$0 = z;
                    horizontalStackMapper$mapHorizontalStackWidget$12.label = 3;
                    obj = this.a.a((ksy0) pruVar, j6sVar, horizontalStackMapper$mapHorizontalStackWidget$12);
                } else {
                    if (!(pruVar instanceof iw0)) {
                        if (!(pruVar instanceof q0f)) {
                            w511.b();
                            return null;
                        }
                        mze a = this.f.a((q0f) pruVar, j6sVar);
                        if (a != null) {
                            return new jru(kruVar.a, a);
                        }
                        return null;
                    }
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$0 = kruVar;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$1 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$2 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.L$3 = null;
                    horizontalStackMapper$mapHorizontalStackWidget$12.Z$0 = z;
                    horizontalStackMapper$mapHorizontalStackWidget$12.label = 4;
                    obj = this.e.a((iw0) pruVar, j6sVar, set, horizontalStackMapper$mapHorizontalStackWidget$12);
                }
                return coroutineSingletons;
            }
        }
        horizontalStackMapper$mapHorizontalStackWidget$1 = new HorizontalStackMapper$mapHorizontalStackWidget$1(this, continuationImpl);
        HorizontalStackMapper$mapHorizontalStackWidget$1 horizontalStackMapper$mapHorizontalStackWidget$122 = horizontalStackMapper$mapHorizontalStackWidget$1;
        Object obj2 = horizontalStackMapper$mapHorizontalStackWidget$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = horizontalStackMapper$mapHorizontalStackWidget$122.label;
        if (i == 0) {
        }
    }
}
