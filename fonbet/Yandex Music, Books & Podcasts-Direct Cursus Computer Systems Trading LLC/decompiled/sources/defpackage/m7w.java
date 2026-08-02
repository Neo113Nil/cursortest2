package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class m7w extends ze3 {
    public final lhd r;
    public ObjectAnimator s;
    public final AtomicBoolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7w(Context context, int i, lhd lhdVar) {
        super(context, i);
        context.getClass();
        this.r = lhdVar;
        this.t = new AtomicBoolean(true);
        setOnShowListener(new l7w(0, this));
    }

    @Override // defpackage.ze3, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 35) {
            View findViewById = findViewById(R.id.coordinator);
            if (findViewById != null) {
                findViewById.setFitsSystemWindows(false);
            }
            View findViewById2 = findViewById(R.id.container);
            if (findViewById2 != null) {
                findViewById2.setFitsSystemWindows(false);
            }
        }
    }

    @Override // defpackage.ze3, defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.windowAnimations = R.style.BottomSheetDialogNoEnterAnimation;
    }

    @Override // defpackage.ze3, defpackage.ln5, android.app.Dialog
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (!this.t.getAndSet(false) || (window = getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(decorView, PropertyValuesHolder.ofFloat("translationY", Resources.getSystem().getDisplayMetrics().heightPixels * 0.2f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        ofPropertyValuesHolder.setDuration(150L);
        ofPropertyValuesHolder.setInterpolator(new k5c(0));
        this.s = ofPropertyValuesHolder;
        ofPropertyValuesHolder.start();
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void onStop() {
        super.onStop();
        ObjectAnimator objectAnimator = this.s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.s = null;
    }
}
