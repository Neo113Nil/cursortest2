package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class vi2 extends RecyclerView {
    public final pt0 s1;

    public /* synthetic */ vi2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        pt0 pt0Var = this.s1;
        vi2 vi2Var = (vi2) pt0Var.a;
        if (((xi2) pt0Var.b) != null && i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = vi2Var.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, pt0Var);
                    return true;
                }
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = vi2Var.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    xi2 xi2Var = (xi2) pt0Var.b;
                    xi2Var.getClass();
                    ob obVar = (ob) ((sld) xi2Var).b;
                    if (obVar.j) {
                        vi2 vi2Var2 = obVar.f;
                        vi2Var2.performAccessibilityAction(64, null);
                        vi2Var2.sendAccessibilityEvent(1);
                        obVar.k();
                        return true;
                    }
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        this.s1.H();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        pt0 pt0Var = this.s1;
        if (z) {
            pt0Var.H();
        } else {
            pt0Var.getClass();
        }
    }

    public void setOnBackClickListener(xi2 xi2Var) {
        setDescendantFocusability(xi2Var != null ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_PRIVATECACHE);
        pt0 pt0Var = this.s1;
        pt0Var.b = xi2Var;
        pt0Var.H();
    }

    public vi2(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pt0 pt0Var = new pt0();
        pt0Var.a = this;
        this.s1 = pt0Var;
    }
}
