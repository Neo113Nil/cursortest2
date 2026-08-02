package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class vh0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh0(List list, qg8 qg8Var, e23 e23Var, View view, String str) {
        super(0);
        this.r = 1;
        this.t = list;
        this.u = qg8Var;
        this.v = e23Var;
        this.w = view;
        this.s = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gc8 gc8Var;
        xzb xzbVar;
        bd8 bd8Var;
        View view;
        String str;
        Uri uri;
        int i;
        Uri uri2;
        int i2 = this.r;
        Object obj = this.w;
        Object obj2 = this.s;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        switch (i2) {
            case 0:
                ((jhm) obj5).t((Function0) obj4, (phm) obj3, (String) obj2, (xof) obj);
                break;
            case 1:
                String uuid = UUID.randomUUID().toString();
                qg8 qg8Var = (qg8) obj4;
                e23 e23Var = (e23) obj3;
                View view2 = (View) obj;
                String str2 = (String) obj2;
                for (bd8 bd8Var2 : (List) obj5) {
                    gc8 gc8Var2 = e23Var.a;
                    xzb xzbVar2 = e23Var.b;
                    if (((Boolean) bd8Var2.b.a(xzbVar2)).booleanValue()) {
                        switch (str2.hashCode()) {
                            case -338877947:
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                bd8Var = bd8Var2;
                                if (str2.equals("long_click")) {
                                    xzbVar2 = xzbVar;
                                    view = view2;
                                    bd8Var2 = bd8Var;
                                    qg8Var.b.r(gc8Var, xzbVar2, view, bd8Var2, uuid);
                                    break;
                                }
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case -287575485:
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                bd8Var = bd8Var2;
                                if (str2.equals("unhover")) {
                                    qg8Var.b.h(gc8Var, xzbVar, view2, bd8Var, false);
                                }
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case 3027047:
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                bd8Var = bd8Var2;
                                if (str2.equals("blur")) {
                                    qg8Var.b.s(gc8Var, xzbVar, view2, bd8Var, false);
                                }
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case 94750088:
                                view = view2;
                                if (str2.equals("click")) {
                                    qg8Var.b.a(gc8Var2, xzbVar2, view, bd8Var2, uuid);
                                    gc8Var = gc8Var2;
                                    break;
                                }
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                view2 = view;
                                bd8Var = bd8Var2;
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case 96667352:
                                view = view2;
                                if (str2.equals("enter")) {
                                    qg8Var.b.e(gc8Var2, xzbVar2, view, bd8Var2);
                                    gc8Var = gc8Var2;
                                    break;
                                }
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                view2 = view;
                                bd8Var = bd8Var2;
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case 97604824:
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                bd8Var = bd8Var2;
                                if (str2.equals("focus")) {
                                    qg8Var.b.s(gc8Var, xzbVar, view2, bd8Var, true);
                                }
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case 99469628:
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                bd8Var = bd8Var2;
                                if (str2.equals("hover")) {
                                    qg8Var.b.h(gc8Var, xzbVar, view2, bd8Var, true);
                                }
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case 106931267:
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                bd8Var = bd8Var2;
                                if (str2.equals("press")) {
                                    qg8Var.b.m(gc8Var, xzbVar, view2, bd8Var, true);
                                }
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case 1090594823:
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                bd8Var = bd8Var2;
                                if (str2.equals("release")) {
                                    qg8Var.b.m(gc8Var, xzbVar, view2, bd8Var, false);
                                }
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                            case 1374143386:
                                if (str2.equals("double_click")) {
                                    view = view2;
                                    qg8Var.b.t(gc8Var2, xzbVar2, view, bd8Var2, uuid);
                                    gc8Var = gc8Var2;
                                    break;
                                }
                            default:
                                gc8Var = gc8Var2;
                                xzbVar = xzbVar2;
                                bd8Var = bd8Var2;
                                xzbVar2 = xzbVar;
                                view = view2;
                                bd8Var2 = bd8Var;
                                break;
                        }
                        qg8Var.c.b(bd8Var2, xzbVar2);
                        str = str2;
                        qg8Var.b(gc8Var, xzbVar2, bd8Var2, str, gc8Var.getActionHandler());
                    } else {
                        view = view2;
                        str = str2;
                    }
                    str2 = str;
                    view2 = view;
                }
                break;
            case 2:
                List<bd8> list = (List) obj5;
                if (list != null) {
                    xzb xzbVar3 = (xzb) obj4;
                    qg8 qg8Var2 = (qg8) obj3;
                    gc8 gc8Var3 = (gc8) obj2;
                    View view3 = (View) obj;
                    for (bd8 bd8Var3 : list) {
                        if (((Boolean) bd8Var3.b.a(xzbVar3)).booleanValue()) {
                            qg8Var2.b(gc8Var3, xzbVar3, bd8Var3, "state_swipe_out", gc8Var3.getActionHandler());
                            qg8Var2.b.n(gc8Var3, xzbVar3, view3, bd8Var3);
                            ce8 ce8Var = qg8Var2.c;
                            ce8Var.getClass();
                            szb szbVar = bd8Var3.d;
                            if (szbVar != null && (uri = (Uri) szbVar.a(xzbVar3)) != null) {
                                if (ce8.a(uri.getScheme())) {
                                    if (ce8Var.d && ce8Var.a.get() != null) {
                                        l1j.f();
                                        break;
                                    }
                                } else {
                                    int i3 = i9f.a;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                break;
            case 4:
                vqn vqnVar = (vqn) obj5;
                int i4 = vqnVar.a + 1;
                vqnVar.a = i4;
                Object S = CollectionsKt.S((ArrayList) obj3, i4);
                ((xqn) obj4).a = S;
                mzg mzgVar = (mzg) S;
                if (mzgVar != null) {
                    ((r89) obj2).invoke(mzgVar);
                }
                ((pyg) obj).e();
                break;
            case 5:
                qg8 qg8Var3 = ((gm9) obj5).f;
                gc8 gc8Var4 = ((e23) obj4).a;
                qg8Var3.getClass();
                gc8Var4.v(new vh0((List) obj, (xzb) obj3, qg8Var3, gc8Var4, (mm9) obj2, 2));
                break;
            case 6:
                wj9[] wj9VarArr = (wj9[]) obj5;
                m1a m1aVar = (m1a) obj4;
                gc8 gc8Var5 = (gc8) obj3;
                xzb xzbVar4 = (xzb) obj2;
                View view4 = (View) obj;
                int length = wj9VarArr.length;
                int i5 = 0;
                while (i5 < length) {
                    wj9 wj9Var = wj9VarArr[i5];
                    eg8 eg8Var = m1aVar.c;
                    xy0 xy0Var = m1aVar.f;
                    xy0 xy0Var2 = m1aVar.e;
                    br5 br5Var = new br5(gc8Var5.getDataTag().a, gc8Var5.getLogId(), (String) wj9Var.a().a(xzbVar4));
                    boolean z = wj9Var instanceof l1a;
                    xy0 xy0Var3 = z ? xy0Var2 : xy0Var;
                    Object obj6 = xy0Var3.get(br5Var);
                    if (obj6 == null) {
                        obj6 = 0;
                        xy0Var3.put(br5Var, obj6);
                    }
                    int intValue = ((Number) obj6).intValue();
                    int i6 = i9f.a;
                    long longValue = ((Number) wj9Var.e().a(xzbVar4)).longValue();
                    if (longValue != 0) {
                        i = length;
                        if (intValue >= longValue) {
                            continue;
                            i5++;
                            length = i;
                        }
                    } else {
                        i = length;
                    }
                    eg8Var.getClass();
                    eg8 actionHandler = gc8Var5.getActionHandler();
                    if (!(actionHandler != null ? actionHandler.b(wj9Var, gc8Var5, xzbVar4) : false) && !eg8Var.b(wj9Var, gc8Var5, xzbVar4)) {
                        yb8 yb8Var = m1aVar.a;
                        if (z) {
                            yb8Var.v(gc8Var5, xzbVar4, view4, (l1a) wj9Var);
                        } else {
                            yb8Var.p(gc8Var5, xzbVar4, view4, (tw8) wj9Var);
                        }
                        ce8 ce8Var2 = m1aVar.d;
                        ce8Var2.getClass();
                        szb url = wj9Var.getUrl();
                        if (url != null && (uri2 = (Uri) url.a(xzbVar4)) != null && ce8.a(uri2.getScheme()) && ce8Var2.c && ce8Var2.a.get() != null) {
                            l1j.f();
                            break;
                        }
                    }
                    if (z) {
                        xy0Var = xy0Var2;
                    }
                    xy0Var.put(br5Var, Integer.valueOf(intValue + 1));
                    i5++;
                    length = i;
                }
                break;
            default:
                vq5 vq5Var = (vq5) obj5;
                pzb pzbVar = (pzb) obj4;
                xzb xzbVar5 = (xzb) obj2;
                t03 t03Var = (t03) obj;
                String h = pzbVar.h((jhb) obj3, xzbVar5);
                vq5Var.a(h == null ? ja8.b0 : xzbVar5.d(pzbVar.b, t75.c(h), t03Var));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(0);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.s = obj4;
        this.w = obj5;
    }
}
