package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.emoji2.emojipicker.EmojiPickerPopupView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.div.json.expressions.Expression;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.divkit.internal.ui.DivActionsView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView;

/* loaded from: classes10.dex */
public final /* synthetic */ class run implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ run(View view, j5s0 j5s0Var, List list) {
        this.a = 2;
        this.c = view;
        this.b = list;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean _init_$lambda$1;
        Object b;
        int i = this.a;
        int i2 = 2;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                sun sunVar = (sun) obj2;
                Context context = (Context) obj;
                tun tunVar = sunVar.S;
                EmojiPickerPopupView emojiPickerPopupView = new EmojiPickerPopupView(context, null, 0, view, tunVar == null ? null : tunVar, new vsn(i2, sunVar, view), 4, null);
                zrm zrmVar = new zrm(context, emojiPickerPopupView, view);
                sunVar.T = zrmVar;
                PopupWindow popupWindow = (PopupWindow) zrmVar.c;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                float width = ((view.getWidth() / 2.0f) + iArr[0]) - (emojiPickerPopupView.getPopupViewWidth() / 2.0f);
                int popupViewHeight = iArr[1] - emojiPickerPopupView.getPopupViewHeight();
                popupWindow.setBackgroundDrawable(context.getDrawable(l3h0.popup_view_rounded_background));
                popupWindow.setOutsideTouchable(true);
                popupWindow.setTouchable(true);
                popupWindow.setAnimationStyle(c2i0.VariantPopupAnimation);
                popupWindow.setElevation(view.getContext().getResources().getDimensionPixelSize(yug0.emoji_picker_popup_view_elevation));
                try {
                    popupWindow.showAtLocation(view, 0, m810.b(width), popupViewHeight);
                    break;
                } catch (WindowManager.BadTokenException unused) {
                    Toast.makeText(context, "Don't use EmojiPickerView inside a Popup", 1).show();
                    break;
                }
            case 1:
                _init_$lambda$1 = ListYandexPlayerManagerDebugView._init_$lambda$1((ListYandexPlayerManagerDebugView) obj2, (Context) obj, view);
                break;
            case 2:
                View view2 = (View) obj2;
                List list = (List) obj;
                Fragment u = b.u(view2, true);
                FragmentActivity activity = u != null ? u.getActivity() : null;
                if (activity != null) {
                    Context context2 = view2.getContext();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Expression expression = ((v3k) it.next()).k;
                        String obj3 = (expression == null || (b = expression.b()) == null) ? null : b.toString();
                        if (obj3 != null) {
                            arrayList.add(obj3);
                        }
                    }
                    DivActionsView divActionsView = new DivActionsView(context2, null, 0, 6, null);
                    divActionsView.render(new kdk(arrayList));
                    BottomSheetDialogView.State state = new BottomSheetDialogView.State((d) new e(null, null, new b7p0(27, divActionsView), 3), (YbButtonViewGroup.b) null, (h) null, true, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65526);
                    BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(context2, null, 0, 6, null);
                    bottomSheetDialogView.render(state);
                    BottomSheetDialogView.show$default(bottomSheetDialogView, activity, null, 2, null);
                    break;
                }
                break;
            default:
                ((ru.yandex.taxi.preorder.suggested.selection.c) obj2).P.L6((x9v0) obj);
                break;
        }
        return true;
        return true;
    }

    public /* synthetic */ run(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
