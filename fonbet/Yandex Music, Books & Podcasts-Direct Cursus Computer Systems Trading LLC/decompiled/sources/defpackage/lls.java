package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llls;", "Lhr0;", "<init>", "()V", "hls", "shared-design"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class lls extends hr0 {
    public wn5 g;
    public qxa h;
    public qxa i;
    public int j;
    public ValueAnimator k;
    public rar l;
    public hls m;
    public int n;
    public int o;
    public final jyr p = btf.b(new gls(this, 0));
    public final jyr q = btf.b(new gls(this, 1));
    public final jyr r = btf.b(new gls(this, 2));
    public final jyr s = btf.b(new gls(this, 3));

    public final mls A() {
        mls mlsVar;
        Bundle arguments = getArguments();
        return (arguments == null || (mlsVar = (mls) arguments.getParcelable("GRAVITY")) == null) ? mls.a : mlsVar;
    }

    public final void B() {
        rar rarVar = this.l;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.l = x97.y(wyf.F(getLifecycle()), null, null, new glp(this, continuation, 27), 3);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
            return;
        }
        int ordinal = A().ordinal();
        if (ordinal == 0) {
            i = R.style.ToastDialog_Top;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            i = R.style.ToastDialog_Bottom;
        }
        setStyle(2, i);
        qxa qxaVar = this.h;
        if (qxaVar != null) {
            qxaVar.invoke();
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new els(this, 0), -1861185657, true));
        return composeView;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.k = null;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        qxa qxaVar = this.i;
        if (qxaVar != null) {
            qxaVar.invoke();
        }
        getParentFragmentManager().e0(cxb.J(), "ToastDialog.RESULT_DISMISSED");
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        B();
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        int i;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        int ordinal = A().ordinal();
        if (ordinal == 0) {
            i = 48;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            i = 80;
        }
        window.setGravity(i | 1);
        window.setBackgroundDrawable(window.getContext().getDrawable(android.R.color.transparent));
        WindowManager.LayoutParams attributes = window.getAttributes();
        float f = window.getContext().getResources().getDisplayMetrics().density;
        Bundle arguments = getArguments();
        if ((arguments != null ? Integer.valueOf(arguments.getInt("Y_MARGIN_DP")) : null) == null) {
            xq0.x("Required value was null.");
            return;
        }
        int intValue = (int) (r1.intValue() * f);
        attributes.y = intValue;
        this.j = intValue;
        attributes.height = -2;
        attributes.width = -1;
        attributes.flags |= 800;
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.i
    public final void show(y yVar, String str) {
        yVar.getClass();
        yVar.getClass();
        a aVar = new a(yVar);
        aVar.d(0, this, str, 1);
        aVar.k(true, true);
    }

    public final void y() {
        final Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        final WindowManager.LayoutParams attributes = window.getAttributes();
        View view = getView();
        final float translationX = view != null ? view.getTranslationX() : 0.0f;
        final int i = attributes.y;
        B();
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fls
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                valueAnimator2.getClass();
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                View view2 = lls.this.getView();
                if (view2 != null) {
                    float f = translationX;
                    view2.setTranslationX(((0 - f) * animatedFraction) + f);
                }
                int i2 = (int) (((r0.j - r1) * animatedFraction) + i);
                WindowManager.LayoutParams layoutParams = attributes;
                layoutParams.y = i2;
                window.setAttributes(layoutParams);
            }
        });
        ofFloat.start();
        this.k = ofFloat;
    }

    public final void z() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            dismissAllowingStateLoss();
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.y;
        View view = getView();
        int i2 = -(view != null ? view.getHeight() : getResources().getDisplayMetrics().heightPixels);
        rar rarVar = this.l;
        if (rarVar != null) {
            rarVar.g(null);
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        tqn tqnVar = new tqn();
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new up0(3, attributes, window));
        ofInt.addListener(new jls(tqnVar, 1));
        ofInt.addListener(new kls(tqnVar, this, 1));
        ofInt.start();
        this.k = ofInt;
    }
}
