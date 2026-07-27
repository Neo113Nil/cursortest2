package com.airbnb.lottie;

import B2.N;
import D.RunnableC0281a;
import S0.s;
import T0.f;
import X0.A;
import X0.AbstractC0408b;
import X0.C;
import X0.C0411e;
import X0.C0412f;
import X0.C0414h;
import X0.CallableC0410d;
import X0.D;
import X0.E;
import X0.EnumC0407a;
import X0.EnumC0413g;
import X0.F;
import X0.G;
import X0.H;
import X0.InterfaceC0409c;
import X0.i;
import X0.j;
import X0.m;
import X0.q;
import X0.u;
import X0.v;
import X0.w;
import X0.y;
import X0.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import b1.C0523a;
import c1.e;
import com.icefishing.icefishingliveapp.C5284R;
import f1.C4491b;
import j1.ChoreographerFrameCallbackC4593f;
import j1.h;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import m.C4768x;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class LottieAnimationView extends C4768x {
    public static final C0411e J = new C0411e();

    /* renamed from: A, reason: collision with root package name */
    public final v f5812A;

    /* renamed from: B, reason: collision with root package name */
    public String f5813B;

    /* renamed from: C, reason: collision with root package name */
    public int f5814C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5815D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5816E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5817F;

    /* renamed from: G, reason: collision with root package name */
    public final HashSet f5818G;

    /* renamed from: H, reason: collision with root package name */
    public final HashSet f5819H;

    /* renamed from: I, reason: collision with root package name */
    public C f5820I;

    /* renamed from: w, reason: collision with root package name */
    public final C0414h f5821w;

    /* renamed from: x, reason: collision with root package name */
    public final C0414h f5822x;

    /* renamed from: y, reason: collision with root package name */
    public y f5823y;

    /* renamed from: z, reason: collision with root package name */
    public int f5824z;

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String string;
        this.f5821w = new C0414h(this, 1);
        this.f5822x = new C0414h(this, 0);
        this.f5824z = 0;
        v vVar = new v();
        this.f5812A = vVar;
        this.f5815D = false;
        this.f5816E = false;
        this.f5817F = true;
        HashSet hashSet = new HashSet();
        this.f5818G = hashSet;
        this.f5819H = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, E.f3642a, C5284R.attr.lottieAnimationViewStyle, 0);
        this.f5817F = obtainStyledAttributes.getBoolean(4, true);
        boolean hasValue = obtainStyledAttributes.hasValue(16);
        boolean hasValue2 = obtainStyledAttributes.hasValue(11);
        boolean hasValue3 = obtainStyledAttributes.hasValue(21);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(10, 0));
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.f5816E = true;
        }
        if (obtainStyledAttributes.getBoolean(14, false)) {
            vVar.f3754u.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(19)) {
            setRepeatMode(obtainStyledAttributes.getInt(19, 1));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            setRepeatCount(obtainStyledAttributes.getInt(18, -1));
        }
        if (obtainStyledAttributes.hasValue(20)) {
            setSpeed(obtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(6, true));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(5, false));
        }
        if (obtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(13));
        boolean hasValue4 = obtainStyledAttributes.hasValue(15);
        float f6 = obtainStyledAttributes.getFloat(15, 0.0f);
        if (hasValue4) {
            hashSet.add(EnumC0413g.f3661u);
        }
        vVar.u(f6);
        boolean z8 = obtainStyledAttributes.getBoolean(9, false);
        w wVar = w.f3764n;
        HashSet hashSet2 = (HashSet) vVar.f3726E.f37858u;
        boolean add = z8 ? hashSet2.add(wVar) : hashSet2.remove(wVar);
        if (vVar.f3746n != null && add) {
            vVar.c();
        }
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.hasValue(7)) {
            vVar.a(new e("**"), z.f3780I, new s(new G(E.e.c(getContext(), obtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            int i = obtainStyledAttributes.getInt(17, 0);
            setRenderMode(F.values()[i >= F.values().length ? 0 : i]);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int i4 = obtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(EnumC0407a.values()[i4 >= F.values().length ? 0 : i4]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(12, false));
        if (obtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(22, false));
        }
        obtainStyledAttributes.recycle();
    }

    private void setCompositionTask(C c4) {
        A a9 = c4.f3638d;
        v vVar = this.f5812A;
        if (a9 != null && vVar == getDrawable() && vVar.f3746n == a9.f3631a) {
            return;
        }
        this.f5818G.add(EnumC0413g.f3660n);
        this.f5812A.d();
        b();
        c4.b(this.f5821w);
        c4.a(this.f5822x);
        this.f5820I = c4;
    }

    public final void b() {
        C c4 = this.f5820I;
        if (c4 != null) {
            C0414h c0414h = this.f5821w;
            synchronized (c4) {
                c4.f3635a.remove(c0414h);
            }
            C c9 = this.f5820I;
            C0414h c0414h2 = this.f5822x;
            synchronized (c9) {
                c9.f3636b.remove(c0414h2);
            }
        }
    }

    public EnumC0407a getAsyncUpdates() {
        EnumC0407a enumC0407a = this.f5812A.f3751r0;
        return enumC0407a != null ? enumC0407a : EnumC0407a.f3647n;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC0407a enumC0407a = this.f5812A.f3751r0;
        if (enumC0407a == null) {
            enumC0407a = EnumC0407a.f3647n;
        }
        return enumC0407a == EnumC0407a.f3648u;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f5812A.f3734N;
    }

    public boolean getClipToCompositionBounds() {
        return this.f5812A.f3728G;
    }

    public i getComposition() {
        Drawable drawable = getDrawable();
        v vVar = this.f5812A;
        if (drawable == vVar) {
            return vVar.f3746n;
        }
        return null;
    }

    public long getDuration() {
        i composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f5812A.f3754u.f38490A;
    }

    public String getImageAssetsFolder() {
        return this.f5812A.f3722A;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f5812A.f3727F;
    }

    public float getMaxFrame() {
        return this.f5812A.f3754u.i();
    }

    public float getMinFrame() {
        return this.f5812A.f3754u.j();
    }

    public D getPerformanceTracker() {
        i iVar = this.f5812A.f3746n;
        if (iVar != null) {
            return iVar.f3669a;
        }
        return null;
    }

    public float getProgress() {
        return this.f5812A.f3754u.h();
    }

    public F getRenderMode() {
        return this.f5812A.f3736P ? F.f3645v : F.f3644u;
    }

    public int getRepeatCount() {
        return this.f5812A.f3754u.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f5812A.f3754u.getRepeatMode();
    }

    public float getSpeed() {
        return this.f5812A.f3754u.f38500w;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof v) {
            boolean z8 = ((v) drawable).f3736P;
            F f6 = F.f3645v;
            if ((z8 ? f6 : F.f3644u) == f6) {
                this.f5812A.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        v vVar = this.f5812A;
        if (drawable2 == vVar) {
            super.invalidateDrawable(vVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f5816E) {
            return;
        }
        this.f5812A.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C0412f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0412f c0412f = (C0412f) parcelable;
        super.onRestoreInstanceState(c0412f.getSuperState());
        this.f5813B = c0412f.f3653n;
        HashSet hashSet = this.f5818G;
        EnumC0413g enumC0413g = EnumC0413g.f3660n;
        if (!hashSet.contains(enumC0413g) && !TextUtils.isEmpty(this.f5813B)) {
            setAnimation(this.f5813B);
        }
        this.f5814C = c0412f.f3654u;
        if (!hashSet.contains(enumC0413g) && (i = this.f5814C) != 0) {
            setAnimation(i);
        }
        boolean contains = hashSet.contains(EnumC0413g.f3661u);
        v vVar = this.f5812A;
        if (!contains) {
            vVar.u(c0412f.f3655v);
        }
        EnumC0413g enumC0413g2 = EnumC0413g.f3665y;
        if (!hashSet.contains(enumC0413g2) && c0412f.f3656w) {
            hashSet.add(enumC0413g2);
            vVar.l();
        }
        if (!hashSet.contains(EnumC0413g.f3664x)) {
            setImageAssetsFolder(c0412f.f3657x);
        }
        if (!hashSet.contains(EnumC0413g.f3662v)) {
            setRepeatMode(c0412f.f3658y);
        }
        if (hashSet.contains(EnumC0413g.f3663w)) {
            return;
        }
        setRepeatCount(c0412f.f3659z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z8;
        C0412f c0412f = new C0412f(super.onSaveInstanceState());
        c0412f.f3653n = this.f5813B;
        c0412f.f3654u = this.f5814C;
        v vVar = this.f5812A;
        c0412f.f3655v = vVar.f3754u.h();
        boolean isVisible = vVar.isVisible();
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = vVar.f3754u;
        if (isVisible) {
            z8 = choreographerFrameCallbackC4593f.f38495F;
        } else {
            int i = vVar.f3761x0;
            z8 = i == 2 || i == 3;
        }
        c0412f.f3656w = z8;
        c0412f.f3657x = vVar.f3722A;
        c0412f.f3658y = choreographerFrameCallbackC4593f.getRepeatMode();
        c0412f.f3659z = choreographerFrameCallbackC4593f.getRepeatCount();
        return c0412f;
    }

    public void setAnimation(final int i) {
        C a9;
        int i4 = 1;
        this.f5814C = i;
        final String str = null;
        this.f5813B = null;
        if (isInEditMode()) {
            a9 = new C(new f(this, i, i4), true);
        } else if (this.f5817F) {
            Context context = getContext();
            final String k6 = m.k(context, i);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            a9 = m.a(k6, new Callable() { // from class: X0.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return m.f(context2, k6, i);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap hashMap = m.f3695a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            a9 = m.a(null, new Callable() { // from class: X0.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return m.f(context22, str, i);
                }
            }, null);
        }
        setCompositionTask(a9);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(m.a(null, new I0.f(2, byteArrayInputStream), new RunnableC0281a(8, byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) {
        C a9;
        int i = 0;
        String str2 = null;
        if (this.f5817F) {
            Context context = getContext();
            HashMap hashMap = m.f3695a;
            String f6 = AbstractC5051n.f("url_", str);
            a9 = m.a(f6, new j(context, str, f6, i), null);
        } else {
            a9 = m.a(null, new j(getContext(), str, str2, i), null);
        }
        setCompositionTask(a9);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z8) {
        this.f5812A.f3732L = z8;
    }

    public void setApplyingShadowToLayersEnabled(boolean z8) {
        this.f5812A.f3733M = z8;
    }

    public void setAsyncUpdates(EnumC0407a enumC0407a) {
        this.f5812A.f3751r0 = enumC0407a;
    }

    public void setCacheComposition(boolean z8) {
        this.f5817F = z8;
    }

    public void setClipTextToBoundingBox(boolean z8) {
        v vVar = this.f5812A;
        if (z8 != vVar.f3734N) {
            vVar.f3734N = z8;
            vVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z8) {
        v vVar = this.f5812A;
        if (z8 != vVar.f3728G) {
            vVar.f3728G = z8;
            C4491b c4491b = vVar.f3729H;
            if (c4491b != null) {
                c4491b.f37587L = z8;
            }
            vVar.invalidateSelf();
        }
    }

    public void setComposition(i iVar) {
        v vVar = this.f5812A;
        vVar.setCallback(this);
        boolean z8 = true;
        this.f5815D = true;
        i iVar2 = vVar.f3746n;
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = vVar.f3754u;
        if (iVar2 == iVar) {
            z8 = false;
        } else {
            vVar.f3750q0 = true;
            vVar.d();
            vVar.f3746n = iVar;
            vVar.c();
            boolean z9 = choreographerFrameCallbackC4593f.f38494E == null;
            choreographerFrameCallbackC4593f.f38494E = iVar;
            if (z9) {
                choreographerFrameCallbackC4593f.p(Math.max(choreographerFrameCallbackC4593f.f38492C, iVar.f3679l), Math.min(choreographerFrameCallbackC4593f.f38493D, iVar.f3680m));
            } else {
                choreographerFrameCallbackC4593f.p((int) iVar.f3679l, (int) iVar.f3680m);
            }
            float f6 = choreographerFrameCallbackC4593f.f38490A;
            choreographerFrameCallbackC4593f.f38490A = 0.0f;
            choreographerFrameCallbackC4593f.f38503z = 0.0f;
            choreographerFrameCallbackC4593f.o((int) f6);
            choreographerFrameCallbackC4593f.m();
            vVar.u(choreographerFrameCallbackC4593f.getAnimatedFraction());
            ArrayList arrayList = vVar.f3762y;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar != null) {
                    uVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            iVar.f3669a.f3639a = vVar.J;
            vVar.e();
            Drawable.Callback callback = vVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(vVar);
            }
        }
        if (this.f5816E) {
            vVar.l();
        }
        this.f5815D = false;
        if (getDrawable() != vVar || z8) {
            if (!z8) {
                boolean z10 = choreographerFrameCallbackC4593f != null ? choreographerFrameCallbackC4593f.f38495F : false;
                setImageDrawable(null);
                setImageDrawable(vVar);
                if (z10) {
                    vVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f5819H.iterator();
            if (it2.hasNext()) {
                throw D.y.h(it2);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        v vVar = this.f5812A;
        vVar.f3725D = str;
        N i = vVar.i();
        if (i != null) {
            i.f200y = str;
        }
    }

    public void setFailureListener(y yVar) {
        this.f5823y = yVar;
    }

    public void setFallbackResource(int i) {
        this.f5824z = i;
    }

    public void setFontAssetDelegate(AbstractC0408b abstractC0408b) {
        N n9 = this.f5812A.f3723B;
    }

    public void setFontMap(Map<String, Typeface> map) {
        v vVar = this.f5812A;
        if (map == vVar.f3724C) {
            return;
        }
        vVar.f3724C = map;
        vVar.invalidateSelf();
    }

    public void setFrame(int i) {
        this.f5812A.o(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z8) {
        this.f5812A.f3758w = z8;
    }

    public void setImageAssetDelegate(InterfaceC0409c interfaceC0409c) {
        C0523a c0523a = this.f5812A.f3763z;
    }

    public void setImageAssetsFolder(String str) {
        this.f5812A.f3722A = str;
    }

    @Override // m.C4768x, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f5814C = 0;
        this.f5813B = null;
        b();
        super.setImageBitmap(bitmap);
    }

    @Override // m.C4768x, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f5814C = 0;
        this.f5813B = null;
        b();
        super.setImageDrawable(drawable);
    }

    @Override // m.C4768x, android.widget.ImageView
    public void setImageResource(int i) {
        this.f5814C = 0;
        this.f5813B = null;
        b();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z8) {
        this.f5812A.f3727F = z8;
    }

    public void setMaxFrame(int i) {
        this.f5812A.p(i);
    }

    public void setMaxProgress(float f6) {
        v vVar = this.f5812A;
        i iVar = vVar.f3746n;
        if (iVar == null) {
            vVar.f3762y.add(new q(vVar, f6, 0));
            return;
        }
        float f9 = h.f(iVar.f3679l, iVar.f3680m, f6);
        ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = vVar.f3754u;
        choreographerFrameCallbackC4593f.p(choreographerFrameCallbackC4593f.f38492C, f9);
    }

    public void setMinAndMaxFrame(String str) {
        this.f5812A.r(str);
    }

    public void setMinFrame(int i) {
        this.f5812A.s(i);
    }

    public void setMinProgress(float f6) {
        v vVar = this.f5812A;
        i iVar = vVar.f3746n;
        if (iVar == null) {
            vVar.f3762y.add(new q(vVar, f6, 1));
        } else {
            vVar.s((int) h.f(iVar.f3679l, iVar.f3680m, f6));
        }
    }

    public void setOutlineMasksAndMattes(boolean z8) {
        v vVar = this.f5812A;
        if (vVar.f3731K == z8) {
            return;
        }
        vVar.f3731K = z8;
        C4491b c4491b = vVar.f3729H;
        if (c4491b != null) {
            c4491b.q(z8);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        v vVar = this.f5812A;
        vVar.J = z8;
        i iVar = vVar.f3746n;
        if (iVar != null) {
            iVar.f3669a.f3639a = z8;
        }
    }

    public void setProgress(float f6) {
        this.f5818G.add(EnumC0413g.f3661u);
        this.f5812A.u(f6);
    }

    public void setRenderMode(F f6) {
        v vVar = this.f5812A;
        vVar.f3735O = f6;
        vVar.e();
    }

    public void setRepeatCount(int i) {
        this.f5818G.add(EnumC0413g.f3663w);
        this.f5812A.f3754u.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f5818G.add(EnumC0413g.f3662v);
        this.f5812A.f3754u.setRepeatMode(i);
    }

    public void setSafeMode(boolean z8) {
        this.f5812A.f3760x = z8;
    }

    public void setSpeed(float f6) {
        this.f5812A.f3754u.f38500w = f6;
    }

    public void setTextDelegate(H h9) {
        this.f5812A.getClass();
    }

    public void setUseCompositionFrameRate(boolean z8) {
        this.f5812A.f3754u.f38496G = z8;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        v vVar;
        boolean z8 = this.f5815D;
        if (!z8 && drawable == (vVar = this.f5812A)) {
            ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f = vVar.f3754u;
            if (choreographerFrameCallbackC4593f == null ? false : choreographerFrameCallbackC4593f.f38495F) {
                this.f5816E = false;
                vVar.k();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z8 && (drawable instanceof v)) {
            v vVar2 = (v) drawable;
            ChoreographerFrameCallbackC4593f choreographerFrameCallbackC4593f2 = vVar2.f3754u;
            if (choreographerFrameCallbackC4593f2 != null ? choreographerFrameCallbackC4593f2.f38495F : false) {
                vVar2.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f5812A.q(str);
    }

    public void setMinFrame(String str) {
        this.f5812A.t(str);
    }

    public void setAnimation(String str) {
        C a9;
        int i = 1;
        this.f5813B = str;
        int i4 = 0;
        this.f5814C = 0;
        if (isInEditMode()) {
            a9 = new C(new CallableC0410d(i4, this, str), true);
        } else {
            String str2 = null;
            if (this.f5817F) {
                Context context = getContext();
                HashMap hashMap = m.f3695a;
                String f6 = AbstractC5051n.f("asset_", str);
                a9 = m.a(f6, new j(context.getApplicationContext(), str, f6, i), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = m.f3695a;
                a9 = m.a(null, new j(context2.getApplicationContext(), str, str2, i), null);
            }
        }
        setCompositionTask(a9);
    }
}
