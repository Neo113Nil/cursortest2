package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final /* synthetic */ class m2e implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        switch (this.a) {
            case 0:
                pv9 pv9Var = (pv9) this.b;
                e6d e6dVar = (e6d) this.c;
                if (motionEvent.getAction() == 1) {
                    pv9Var.A(motionEvent);
                }
                break;
            case 1:
                pkf pkfVar = (pkf) this.b;
                okf okfVar = pkfVar.v;
                cgr cgrVar = (cgr) this.c;
                int action = motionEvent.getAction();
                if (action == 0) {
                    okfVar.b();
                    break;
                } else if (action == 1) {
                    okfVar.getClass();
                    okfVar.b = kkf.b;
                    okfVar.c(true);
                    qec qecVar = pkfVar.u;
                    qecVar.getClass();
                    cgrVar.getClass();
                    h4b h4bVar = ((zkf) qecVar.b).m;
                    if (h4bVar != null) {
                        elf elfVar = (elf) h4bVar.a;
                        if (!((j5v) elfVar.l.getValue()).a()) {
                            xdr xdrVar = elfVar.v;
                            Boolean bool = Boolean.TRUE;
                            xdrVar.getClass();
                            xdrVar.m(null, bool);
                            qdc qdcVar = elfVar.m;
                            xdr xdrVar2 = (xdr) qdcVar.b;
                            StationId stationId = cgrVar.a;
                            ssg.a(3, "RadioBlocksManager", "select(" + stationId + ")", null);
                            Iterator it = ((Iterable) ((xdr) qdcVar.c).getValue()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((nfn) obj).b) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            nfn nfnVar = (nfn) obj;
                            boolean d = Intrinsics.d(nfnVar != null ? nfnVar.a : null, cgrVar);
                            Iterable iterable = (Iterable) xdrVar2.getValue();
                            ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                            Iterator it2 = iterable.iterator();
                            while (it2.hasNext()) {
                                cgr cgrVar2 = ((nfn) it2.next()).a;
                                arrayList.add(new nfn(cgrVar2, !d && cgrVar2.a.equals(stationId)));
                            }
                            xdrVar2.m(null, arrayList);
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj2 = it3.next();
                                    if (((nfn) obj2).b) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            ssg.a(3, "RadioBlocksManager", "New selection state: " + ((nfn) obj2) + " is selected", null);
                            elfVar.G();
                            break;
                        } else {
                            elfVar.H();
                            break;
                        }
                    }
                } else if (action == 3) {
                    okfVar.getClass();
                    okfVar.b = kkf.c;
                    okfVar.c(false);
                    break;
                }
                break;
            case 2:
                vkf vkfVar = (vkf) this.b;
                ukf ukfVar = vkfVar.v;
                xgn xgnVar = (xgn) this.c;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    ukfVar.b();
                    break;
                } else if (action2 == 1) {
                    ukfVar.getClass();
                    ukfVar.b = kkf.b;
                    ukfVar.c(true);
                    cib cibVar = vkfVar.u;
                    cibVar.getClass();
                    xgnVar.getClass();
                    h4b h4bVar2 = ((zkf) cibVar.b).m;
                    if (h4bVar2 != null) {
                        h4bVar2.U("language", xgnVar);
                        break;
                    }
                } else if (action2 == 3) {
                    ukfVar.getClass();
                    ukfVar.b = kkf.c;
                    ukfVar.c(false);
                    break;
                }
                break;
            default:
                rt5 rt5Var = (rt5) this.b;
                c cVar = (c) this.c;
                int action3 = motionEvent.getAction();
                if (action3 == 0) {
                    rt5Var.invoke(cVar);
                    break;
                } else if (action3 == 1) {
                    view.performClick();
                    break;
                }
                break;
        }
        return true;
    }
}
