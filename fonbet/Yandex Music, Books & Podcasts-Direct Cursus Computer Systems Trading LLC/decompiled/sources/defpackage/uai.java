package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
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
public final class uai extends ln5 {
    public Function0 d;
    public tbi e;
    public final View f;
    public final rai g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uai(Function0 function0, tbi tbiVar, View view, xof xofVar, jx7 jx7Var, UUID uuid, fk0 fk0Var, mm6 mm6Var, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        int i = 0;
        this.d = function0;
        this.e = tbiVar;
        this.f = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            xq0.q("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        q5g.I(window, false);
        rai raiVar = new rai(getContext(), window, this.e.b, this.d, fk0Var, mm6Var);
        raiVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        raiVar.setClipChildren(false);
        raiVar.setElevation(jx7Var.n0(f));
        raiVar.setOutlineProvider(new c28(1));
        this.g = raiVar;
        setContentView(raiVar);
        raiVar.setTag(R.id.view_tree_lifecycle_owner, swf.E(view));
        raiVar.setTag(R.id.view_tree_view_model_store_owner, zwf.D(view));
        raiVar.setTag(R.id.view_tree_saved_state_registry_owner, ywf.y(view));
        c(this.d, this.e, xofVar);
        knn knnVar = new knn(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        y5g oqvVar = i2 >= 35 ? new oqv(window, knnVar) : i2 >= 30 ? new nqv(window, knnVar) : i2 >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar);
        boolean z2 = !z;
        oqvVar.k0(z2);
        oqvVar.j0(z2);
        wxf.k(this.c, this, new tai(this, i));
    }

    public final void c(Function0 function0, tbi tbiVar, xof xofVar) {
        this.d = function0;
        this.e = tbiVar;
        a9p a9pVar = tbiVar.a;
        ViewGroup.LayoutParams layoutParams = this.f.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & RemoteCameraConfig.Notification.ID) == 0) ? false : true;
        int ordinal = a9pVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = true;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, RemoteCameraConfig.Notification.ID);
        int ordinal2 = xofVar.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else if (ordinal2 != 1) {
            b6e.s();
            return;
        }
        this.g.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.d.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
