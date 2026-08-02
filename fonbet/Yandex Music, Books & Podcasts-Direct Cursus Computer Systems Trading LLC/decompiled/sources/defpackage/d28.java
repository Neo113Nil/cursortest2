package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class d28 extends ln5 {
    public Function0 d;
    public z18 e;
    public final View f;
    public final x18 g;

    public d28(Function0 function0, z18 z18Var, View view, xof xofVar, jx7 jx7Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), z18Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.d = function0;
        this.e = z18Var;
        this.f = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            xq0.q("Dialog has no window");
            throw null;
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        q5g.I(window, this.e.e);
        window.setGravity(17);
        x18 x18Var = new x18(getContext(), window);
        x18Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        x18Var.setClipChildren(false);
        x18Var.setElevation(jx7Var.n0(f));
        x18Var.setOutlineProvider(new c28(0));
        this.g = x18Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(x18Var);
        x18Var.setTag(R.id.view_tree_lifecycle_owner, swf.E(view));
        x18Var.setTag(R.id.view_tree_view_model_store_owner, zwf.D(view));
        x18Var.setTag(R.id.view_tree_saved_state_registry_owner, ywf.y(view));
        d(this.d, this.e, xofVar);
        wxf.k(this.c, this, new hg0(this, i));
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof x18) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    public final void d(Function0 function0, z18 z18Var, xof xofVar) {
        int i;
        this.d = function0;
        this.e = z18Var;
        a9p a9pVar = z18Var.c;
        boolean b = bi0.b(this.f);
        int ordinal = a9pVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                b = true;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                b = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(b ? 8192 : -8193, RemoteCameraConfig.Notification.ID);
        int ordinal2 = xofVar.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                b6e.s();
                return;
            }
            i = 1;
        }
        x18 x18Var = this.g;
        x18Var.setLayoutDirection(i);
        boolean z = z18Var.e;
        boolean z2 = z18Var.d;
        Window window2 = x18Var.i;
        boolean z3 = (x18Var.m && z2 == x18Var.k && z == x18Var.l) ? false : true;
        x18Var.k = z2;
        x18Var.l = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !x18Var.m) {
                window2.setLayout(i2, -2);
                x18Var.m = true;
            }
        }
        setCanceledOnTouchOutside(z18Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.e.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.d.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int b;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.e.b) {
            return onTouchEvent;
        }
        x18 x18Var = this.g;
        x18Var.getClass();
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = x18Var.getChildAt(0)) != null) {
                int left = childAt.getLeft() + x18Var.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + x18Var.getTop();
                int height = childAt.getHeight() + top;
                int b2 = eeh.b(motionEvent.getX());
                if (left <= b2 && b2 <= width && top <= (b = eeh.b(motionEvent.getY())) && b <= height) {
                    return onTouchEvent;
                }
            }
        }
        this.d.invoke();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
