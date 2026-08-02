package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaRouter2;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.Iterator;

/* loaded from: classes.dex */
public class mph extends View {
    public static final SparseArray p = new SparseArray(2);
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {R.attr.state_checkable};
    public final krh a;
    public final gk4 b;
    public crh c;
    public eqh d;
    public boolean e;
    public boolean f;
    public lph g;
    public Drawable h;
    public int i;
    public int j;
    public int k;
    public final ColorStateList l;
    public final int m;
    public final int n;
    public boolean o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mph(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(r8 != 0 ? new ContextThemeWrapper(r0, r8) : r0, attributeSet, i);
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, v3g.H(context));
        int K = v3g.K(contextThemeWrapper, ru.yandex.music.R.attr.mediaRouteTheme);
        this.c = crh.c;
        this.d = eqh.a;
        Context context2 = getContext();
        int[] iArr = hen.a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        wdu.p(this, context2, iArr, attributeSet, obtainStyledAttributes, i, 0);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.h = y2x.w(context2, obtainStyledAttributes.getResourceId(3, 0));
            return;
        }
        this.a = krh.d(context2);
        this.b = new gk4(1, this);
        irh g = krh.g();
        int i2 = !g.d() ? g.i : 0;
        this.k = i2;
        this.j = i2;
        this.l = obtainStyledAttributes.getColorStateList(4);
        this.m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        this.i = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        int i3 = this.i;
        SparseArray sparseArray = p;
        if (i3 != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i3)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.h == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    lph lphVar = new lph(this, resourceId, getContext());
                    this.g = lphVar;
                    lphVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        d();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private y getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof t) {
            return ((t) activity).getSupportFragmentManager();
        }
        return null;
    }

    public final void a() {
        if (this.i > 0) {
            lph lphVar = this.g;
            if (lphVar != null) {
                lphVar.cancel(false);
            }
            lph lphVar2 = new lph(this, this.i, getContext());
            this.g = lphVar2;
            this.i = 0;
            lphVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.a.getClass();
        irh g = krh.g();
        int i = !g.d() ? g.i : 0;
        if (this.k != i) {
            this.k = i;
            d();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
    }

    public final boolean c() {
        y fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            xq0.q("The activity must be a subclass of FragmentActivity");
            return false;
        }
        this.a.getClass();
        if (krh.g().d()) {
            if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            this.d.getClass();
            pph pphVar = new pph();
            crh crhVar = this.c;
            if (crhVar == null) {
                xq0.x("selector must not be null");
                return false;
            }
            pphVar.y();
            if (!pphVar.i.equals(crhVar)) {
                pphVar.i = crhVar;
                Bundle arguments = pphVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBundle("selector", crhVar.a);
                pphVar.setArguments(arguments);
                gr0 gr0Var = pphVar.h;
                if (gr0Var != null) {
                    if (pphVar.g) {
                        ((lqh) gr0Var).f(crhVar);
                    } else {
                        ((oph) gr0Var).g(crhVar);
                    }
                }
            }
            a aVar = new a(fragmentManager);
            aVar.d(0, pphVar, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
            aVar.k(true, true);
            return true;
        }
        if (fragmentManager.D("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
            return false;
        }
        this.d.getClass();
        bqh bqhVar = new bqh();
        crh crhVar2 = this.c;
        if (crhVar2 == null) {
            xq0.x("selector must not be null");
            return false;
        }
        if (bqhVar.i == null) {
            Bundle arguments2 = bqhVar.getArguments();
            if (arguments2 != null) {
                bqhVar.i = crh.b(arguments2.getBundle("selector"));
            }
            if (bqhVar.i == null) {
                bqhVar.i = crh.c;
            }
        }
        if (!bqhVar.i.equals(crhVar2)) {
            bqhVar.i = crhVar2;
            Bundle arguments3 = bqhVar.getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            arguments3.putBundle("selector", crhVar2.a);
            bqhVar.setArguments(arguments3);
            gr0 gr0Var2 = bqhVar.h;
            if (gr0Var2 != null && bqhVar.g) {
                ((wqh) gr0Var2).h(crhVar2);
            }
        }
        a aVar2 = new a(fragmentManager);
        aVar2.d(0, bqhVar, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
        aVar2.k(true, true);
        return true;
    }

    public final void d() {
        int i = this.k;
        String string = getContext().getString(i != 1 ? i != 2 ? ru.yandex.music.R.string.mr_cast_button_disconnected : ru.yandex.music.R.string.mr_cast_button_connected : ru.yandex.music.R.string.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.o || TextUtils.isEmpty(string)) {
            string = null;
        }
        s7g.C(this, string);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h != null) {
            this.h.setState(getDrawableState());
            if (this.h.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.h.getCurrent();
                int i = this.k;
                if (i == 1 || this.j != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.j = this.k;
    }

    @NonNull
    public eqh getDialogFactory() {
        return this.d;
    }

    @NonNull
    public crh getRouteSelector() {
        return this.c;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.e = true;
        if (!this.c.d()) {
            this.a.a(this.c, this.b, 0);
        }
        b();
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a != null && !this.f) {
            int i2 = this.k;
            if (i2 == 1) {
                View.mergeDrawableStates(onCreateDrawableState, r);
                return onCreateDrawableState;
            }
            if (i2 == 2) {
                View.mergeDrawableStates(onCreateDrawableState, q);
                return onCreateDrawableState;
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.e = false;
            if (!this.c.d()) {
                this.a.i(this.b);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.h.getIntrinsicWidth();
            int intrinsicHeight = this.h.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.h.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.h.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.h;
        int i4 = 0;
        if (drawable != null) {
            i3 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int max = Math.max(this.m, i3);
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            i4 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.n, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        if (r2 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a0, code lost:
    
        if (defpackage.dag.D(r2) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performClick() {
        boolean c;
        boolean D;
        ApplicationInfo applicationInfo;
        boolean z;
        boolean z2;
        ApplicationInfo applicationInfo2;
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        if (this.e) {
            this.a.getClass();
            krh.b();
            mrh mrhVar = krh.c().u;
            if (mrhVar != null) {
                if (mrhVar.b) {
                    if (krh.c == null ? false : krh.c().f()) {
                        Context context = getContext();
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 34) {
                            if (i >= 30) {
                                MediaRouter2 a = pzr.a(context);
                                if (i >= 34) {
                                    D = qzr.a(a);
                                    if (!D) {
                                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                            Intent putExtra = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                                            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    z2 = false;
                                                    break;
                                                }
                                                ActivityInfo activityInfo = it.next().activityInfo;
                                                if (activityInfo != null && (applicationInfo2 = activityInfo.applicationInfo) != null && (applicationInfo2.flags & 129) != 0) {
                                                    context.startActivity(putExtra);
                                                    z2 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                            c = true;
                                        }
                                    }
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            D = false;
                            if (!D) {
                            }
                            z = true;
                            if (z) {
                            }
                        } else if (i >= 31) {
                            Intent putExtra2 = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
                            Iterator<ResolveInfo> it2 = context.getPackageManager().queryBroadcastReceivers(putExtra2, 0).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    ActivityInfo activityInfo2 = it2.next().activityInfo;
                                    if (activityInfo2 != null && (applicationInfo = activityInfo2.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                                        context.sendBroadcast(putExtra2);
                                        break;
                                    }
                                }
                            }
                            D = true;
                            if (!D) {
                            }
                            z = true;
                            if (z) {
                            }
                        } else {
                            if (i == 30) {
                                D = dag.D(context);
                                if (!D) {
                                }
                                z = true;
                                if (z) {
                                }
                            }
                            D = false;
                            if (!D) {
                            }
                            z = true;
                            if (z) {
                            }
                        }
                    }
                }
                c = c();
            } else {
                c = c();
            }
        } else {
            c = false;
        }
        return c || performClick;
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            d();
        }
    }

    public void setDialogFactory(@NonNull eqh eqhVar) {
        if (eqhVar != null) {
            this.d = eqhVar;
        } else {
            xq0.x("factory must not be null");
        }
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.i = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        lph lphVar = this.g;
        if (lphVar != null) {
            lphVar.cancel(false);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.h);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.l;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.h = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(@NonNull crh crhVar) {
        if (crhVar == null) {
            xq0.x("selector must not be null");
            return;
        }
        if (this.c.equals(crhVar)) {
            return;
        }
        if (this.e) {
            boolean d = this.c.d();
            gk4 gk4Var = this.b;
            krh krhVar = this.a;
            if (!d) {
                krhVar.i(gk4Var);
            }
            if (!crhVar.d()) {
                krhVar.a(crhVar, gk4Var, 0);
            }
        }
        this.c = crhVar;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h;
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }

    public mph(@NonNull Context context) {
        this(context, null);
    }

    public mph(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.mediaRouteButtonStyle);
    }
}
