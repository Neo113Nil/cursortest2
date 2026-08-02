package defpackage;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class uqm implements ux8 {
    public final /* synthetic */ int a;

    public /* synthetic */ uqm(int i) {
        this.a = i;
    }

    @Override // defpackage.ux8
    public final void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        List<rx8> list;
        int i = this.a;
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        switch (i) {
            case 0:
                if ((view instanceof ViewGroup) && (dp8Var instanceof jt8) && (list = ((jt8) dp8Var).s) != null) {
                    for (rx8 rx8Var : list) {
                        if (Intrinsics.d(rx8Var.a, "pressed_color")) {
                            JSONObject jSONObject = rx8Var.b;
                            String string = jSONObject != null ? jSONObject.getString(Constants.KEY_VALUE) : null;
                            if (string == null) {
                                string = "#EDEFF2";
                            }
                            try {
                                int parseColor = Color.parseColor((String) new pzb("pressed_color_key", string, hhm.u, new ns9(22), new gy2(5), vct.c, null).a(gc8Var.getExpressionResolver()));
                                StateListDrawable stateListDrawable = new StateListDrawable();
                                stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(parseColor));
                                stateListDrawable.addState(new int[0], new ColorDrawable(0));
                                ((ViewGroup) view).setBackground(stateListDrawable);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                List n = dp8Var.n();
                if (n != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : n) {
                        if (Intrinsics.d(((rx8) obj).a, "weight_ext")) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        view.setLayoutParams(new u79((ViewGroup.MarginLayoutParams) new LinearLayout.LayoutParams(0, 0, 1.0f)));
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        Boolean bool;
        Boolean bool2;
        int i = this.a;
        dp8Var.getClass();
        switch (i) {
            case 0:
                List n = dp8Var.n();
                if (n != null) {
                    List list = n;
                    boolean z = false;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.d(((rx8) it.next()).a, "pressed_color")) {
                                    z = true;
                                }
                            }
                        }
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                return qdq.B(bool);
            default:
                List n2 = dp8Var.n();
                if (n2 != null) {
                    List list2 = n2;
                    boolean z2 = false;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (Intrinsics.d(((rx8) it2.next()).a, "weight_ext")) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    bool2 = Boolean.valueOf(z2);
                } else {
                    bool2 = null;
                }
                return qdq.B(bool2);
        }
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        int i = this.a;
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
    }
}
