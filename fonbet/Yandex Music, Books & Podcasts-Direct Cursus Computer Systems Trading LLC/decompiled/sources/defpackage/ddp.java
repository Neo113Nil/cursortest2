package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class ddp extends x2b {
    public static final /* synthetic */ int z = 0;
    public Function1 w;
    public one x;
    public final cdp y;

    public ddp(@NotNull Context context) {
        super(context, null, 0, 6, null);
        setOnClickListener(new xal(8, this));
        final cdp cdpVar = new cdp(context);
        cdpVar.y = true;
        cdpVar.z.setFocusable(true);
        cdpVar.o = this;
        cdpVar.p = new AdapterView.OnItemClickListener() { // from class: adp
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                int i2 = ddp.z;
                ddp ddpVar = ddp.this;
                ddpVar.sendAccessibilityEvent(4);
                Function1 function1 = ddpVar.w;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i));
                }
                cdpVar.dismiss();
            }
        };
        cdpVar.k = true;
        cdpVar.j = true;
        cdpVar.q(new ColorDrawable(-1));
        cdpVar.o(cdpVar.D);
        this.y = cdpVar;
    }

    public final one getFocusTracker() {
        return this.x;
    }

    public final Function1<Integer, Unit> getOnItemSelectedListener() {
        return this.w;
    }

    @Override // defpackage.x2b, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cdp cdpVar = this.y;
        if (cdpVar.z.isShowing()) {
            cdpVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCanOpenPopup(true);
        accessibilityNodeInfo.setText(getText());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            cdp cdpVar = this.y;
            if (cdpVar.z.isShowing()) {
                cdpVar.f();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            cdp cdpVar = this.y;
            if (cdpVar.z.isShowing()) {
                cdpVar.dismiss();
            }
        }
    }

    public final void setFocusTracker(one oneVar) {
        this.x = oneVar;
    }

    public final void setItems(@NotNull List<String> list) {
        bdp bdpVar = this.y.D;
        bdpVar.a = list;
        bdpVar.notifyDataSetChanged();
    }

    public final void setOnItemSelectedListener(Function1<? super Integer, Unit> function1) {
        this.w = function1;
    }

    @Override // android.widget.TextView, android.view.View
    @NotNull
    public String getAccessibilityClassName() {
        return "android.widget.Spinner";
    }
}
