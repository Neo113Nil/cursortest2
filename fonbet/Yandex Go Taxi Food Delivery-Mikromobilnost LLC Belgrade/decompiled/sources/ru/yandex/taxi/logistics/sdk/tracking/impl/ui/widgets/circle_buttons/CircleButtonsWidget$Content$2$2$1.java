package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons;

import defpackage.bo;
import defpackage.go;
import defpackage.gri;
import defpackage.ktb;
import defpackage.ltb;
import defpackage.mn;
import defpackage.nr;
import defpackage.ptb;
import defpackage.t701;
import defpackage.tls;
import defpackage.un;
import defpackage.vn;
import defpackage.x701;
import defpackage.xn;
import defpackage.zn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.models.ActionPosition;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class CircleButtonsWidget$Content$2$2$1 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ActionPosition actionPosition;
        String str;
        ltb ltbVar = (ltb) obj;
        ptb ptbVar = (ptb) this.receiver;
        ptbVar.getClass();
        ktb ktbVar = ltbVar instanceof ktb ? (ktb) ltbVar : null;
        nr nrVar = ktbVar != null ? ktbVar.a : null;
        if (nrVar instanceof zn) {
            ptb.b(ptbVar, ((zn) nrVar).c);
        } else if (nrVar instanceof un) {
            ptb.b(ptbVar, ((un) nrVar).d);
        } else if (nrVar instanceof go) {
            go goVar = (go) nrVar;
            x701 x701Var = (x701) ptbVar.b.a.e.a.getValue();
            if (x701Var instanceof t701) {
                gri griVar = ((t701) x701Var).a;
                List list = griVar.d;
                List list2 = griVar.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof go) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof go) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        actionPosition = ActionPosition.SECONDARY;
                    }
                } else {
                    actionPosition = ActionPosition.PRIMARY;
                }
                String str2 = goVar.c;
                str = goVar.d;
                if (str != null) {
                    ptbVar.a.x(str.concat(".Shown"), ptb.a(null, actionPosition, str2));
                }
            }
            actionPosition = null;
            String str22 = goVar.c;
            str = goVar.d;
            if (str != null) {
            }
        } else if (nrVar instanceof vn) {
            ptb.b(ptbVar, ((vn) nrVar).k);
        } else if (nrVar instanceof bo) {
            ptb.b(ptbVar, ((bo) nrVar).c);
        } else if (nrVar instanceof mn) {
            ptb.b(ptbVar, ((mn) nrVar).c);
        } else if (nrVar instanceof xn) {
            ptb.b(ptbVar, ((xn) nrVar).f);
        }
        return zy11.a;
    }
}
