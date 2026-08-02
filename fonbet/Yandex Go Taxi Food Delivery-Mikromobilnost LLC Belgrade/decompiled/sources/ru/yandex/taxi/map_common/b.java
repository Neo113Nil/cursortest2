package ru.yandex.taxi.map_common;

import defpackage.jst;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tmx;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.ycc;
import defpackage.ysd0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.map_object.Type;

/* loaded from: classes9.dex */
public final class b implements ysd0 {
    public final HashMap a = new HashMap();
    public final tmx b = new tmx(Type.Companion.serializer());

    public final void a(Class cls, xsd0 xsd0Var) {
        HashMap hashMap = this.a;
        Object obj = hashMap.get(cls);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(cls, obj);
        }
        ((List) obj).add(xsd0Var);
    }

    public final void b(Class cls) {
        HashMap hashMap = this.a;
        List list = (List) hashMap.get(cls);
        if (list == null) {
            return;
        }
        ycc.A(list);
        if (list.isEmpty()) {
            hashMap.remove(cls);
        }
    }

    public final void c(Class cls, xsd0 xsd0Var) {
        int i;
        HashMap hashMap = this.a;
        List list = (List) hashMap.get(cls);
        if (list == null) {
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            } else if (((xsd0) listIterator.previous()) == xsd0Var) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            list.remove(i);
        }
        if (list.isEmpty()) {
            hashMap.remove(cls);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(wsd0 wsd0Var, Continuation continuation) {
        PointActionsHandler$handleAction$1 pointActionsHandler$handleAction$1;
        int i;
        zy11 zy11Var;
        try {
            if (continuation instanceof PointActionsHandler$handleAction$1) {
                pointActionsHandler$handleAction$1 = (PointActionsHandler$handleAction$1) continuation;
                int i2 = pointActionsHandler$handleAction$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pointActionsHandler$handleAction$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pointActionsHandler$handleAction$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pointActionsHandler$handleAction$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        pointActionsHandler$handleAction$1.L$0 = wsd0Var;
                        pointActionsHandler$handleAction$1.label = 1;
                        return e(wsd0Var, pointActionsHandler$handleAction$1) == obj2 ? obj2 : zy11Var;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, String.format("Failed to handle action %s", Arrays.copyOf(new Object[]{wsd0Var.getAction()}, 1)));
            return zy11Var;
        }
        pointActionsHandler$handleAction$1 = new PointActionsHandler$handleAction$1(this, continuation);
        Object obj3 = pointActionsHandler$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pointActionsHandler$handleAction$1.label;
        zy11Var = zy11.a;
    }

    public final Object e(wsd0 wsd0Var, Continuation continuation) {
        List list = (List) this.a.get(wsd0Var.getAction().getClass());
        xsd0 xsd0Var = list != null ? (xsd0) kotlin.collections.a.b0(list) : null;
        if (xsd0Var == null) {
            xsd0Var = null;
        }
        if (xsd0Var != null) {
            return xsd0Var.a(wsd0Var, continuation);
        }
        ny61.r(oyr.p("ActionRouter for ", this.b.a(wsd0Var.getAction().a()), " is not registered."));
        return null;
    }
}
