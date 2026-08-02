package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.s;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.h;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.RadioButtonView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final /* synthetic */ class rh2 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rh2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i iVar;
        jhu0 jhu0Var;
        boolean addFirstInteractionOverlay$lambda$18;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj2;
                sls slsVar = (sls) obj;
                int action = motionEvent.getAction();
                if (action == 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((yo31) it.next()).b();
                    }
                    return true;
                }
                if (action != 1 && action != 3) {
                    return false;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((yo31) it2.next()).a();
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                slsVar.invoke();
                return true;
            case 1:
                jw10 jw10Var = (jw10) obj2;
                i iVar2 = (i) obj;
                h hVar = jw10Var.d;
                ServerMessageRef serverMessageRef = jw10Var.g;
                if (serverMessageRef != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
                    jw10Var.i = true;
                    jw10Var.g = null;
                    if (jw10Var.j && (jhu0Var = (iVar = hVar.a).c0) != null) {
                        jbz0 jbz0Var = (jbz0) jhu0Var.a;
                        j3b j3bVar = iVar.U;
                        if (j3bVar != null) {
                            ycz0 ycz0Var = jbz0Var.v.d;
                            if (ycz0Var.i) {
                                ycz0Var.a();
                            }
                            jbz0Var.w.a(j3bVar.b, serverMessageRef, d620.d);
                        }
                    }
                }
                ServerMessageRef serverMessageRef2 = jw10Var.h;
                if (serverMessageRef2 != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
                    jw10Var.i = true;
                    jw10Var.h = null;
                    if (jw10Var.k) {
                        hVar.a.a.v(serverMessageRef2);
                    }
                }
                if (iVar2.L.getScrollState() == 0) {
                    iVar2.N.a.onTouchEvent(motionEvent);
                }
                return false;
            case 2:
                addFirstInteractionOverlay$lambda$18 = FlexRouteHandlerImpl.addFirstInteractionOverlay$lambda$18((FlexRouteHandlerImpl) obj2, (String) obj, view, motionEvent);
                return addFirstInteractionOverlay$lambda$18;
            case 3:
                mt0 mt0Var = (mt0) obj2;
                RadioButtonView radioButtonView = (RadioButtonView) obj;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    mt0Var.invoke(radioButtonView);
                } else if (action2 == 1) {
                    view.performClick();
                }
                return true;
            case 4:
                s sVar = (s) obj2;
                lcl0 lcl0Var = (lcl0) obj;
                if (motionEvent.getActionMasked() == 0) {
                    sVar.p(lcl0Var);
                }
                return false;
            default:
                int[] iArr = (int[]) obj2;
                motionEvent.setLocation(motionEvent.getX() + iArr[0], motionEvent.getY() + iArr[1]);
                return ((Activity) obj).dispatchTouchEvent(motionEvent);
        }
    }
}
