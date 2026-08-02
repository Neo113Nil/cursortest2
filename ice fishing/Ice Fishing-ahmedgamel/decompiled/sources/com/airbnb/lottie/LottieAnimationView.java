package com.airbnb.lottie;

import A3.p;
import D.x;
import E2.M;
import T0.f;
import Z0.A;
import Z0.AbstractC0419b;
import Z0.C;
import Z0.C0422e;
import Z0.C0423f;
import Z0.C0425h;
import Z0.CallableC0421d;
import Z0.D;
import Z0.E;
import Z0.EnumC0418a;
import Z0.EnumC0424g;
import Z0.F;
import Z0.G;
import Z0.H;
import Z0.InterfaceC0420c;
import Z0.i;
import Z0.j;
import Z0.m;
import Z0.q;
import Z0.u;
import Z0.v;
import Z0.w;
import Z0.y;
import Z0.z;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.LP;
import d1.C4458a;
import e1.e;
import h1.C4564b;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import l1.AbstractC4672g;
import l1.ChoreographerFrameCallbackC4670e;
import m.C4733x;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public class LottieAnimationView extends C4733x {
    public static final C0422e J = new C0422e();

    /* renamed from: A, reason: collision with root package name */
    public final v f6441A;

    /* renamed from: B, reason: collision with root package name */
    public String f6442B;

    /* renamed from: C, reason: collision with root package name */
    public int f6443C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f6444D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6445E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6446F;

    /* renamed from: G, reason: collision with root package name */
    public final HashSet f6447G;

    /* renamed from: H, reason: collision with root package name */
    public final HashSet f6448H;

    /* renamed from: I, reason: collision with root package name */
    public C f6449I;

    /* renamed from: w, reason: collision with root package name */
    public final C0425h f6450w;

    /* renamed from: x, reason: collision with root package name */
    public final C0425h f6451x;

    /* renamed from: y, reason: collision with root package name */
    public y f6452y;

    /* renamed from: z, reason: collision with root package name */
    public int f6453z;

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String string;
        this.f6450w = new C0425h(this, 1);
        this.f6451x = new C0425h(this, 0);
        this.f6453z = 0;
        v vVar = new v();
        this.f6441A = vVar;
        this.f6444D = false;
        this.f6445E = false;
        this.f6446F = true;
        HashSet hashSet = new HashSet();
        this.f6447G = hashSet;
        this.f6448H = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, E.f3938a, C5248R.attr.lottieAnimationViewStyle, 0);
        this.f6446F = obtainStyledAttributes.getBoolean(4, true);
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
            this.f6445E = true;
        }
        if (obtainStyledAttributes.getBoolean(14, false)) {
            vVar.f4053u.setRepeatCount(-1);
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
        float f2 = obtainStyledAttributes.getFloat(15, 0.0f);
        if (hasValue4) {
            hashSet.add(EnumC0424g.f3957u);
        }
        vVar.u(f2);
        boolean z6 = obtainStyledAttributes.getBoolean(9, false);
        w wVar = w.f4059n;
        HashSet hashSet2 = (HashSet) vVar.f4022E.f38152u;
        boolean add = z6 ? hashSet2.add(wVar) : hashSet2.remove(wVar);
        if (vVar.f4046n != null && add) {
            vVar.c();
        }
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.hasValue(7)) {
            vVar.a(new e("**"), z.f4075I, new LP(new G(E.e.c(getContext(), obtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            int i = obtainStyledAttributes.getInt(17, 0);
            setRenderMode(F.values()[i >= F.values().length ? 0 : i]);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int i4 = obtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(EnumC0418a.values()[i4 >= F.values().length ? 0 : i4]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(12, false));
        if (obtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(22, false));
        }
        obtainStyledAttributes.recycle();
    }

    private void setCompositionTask(C c9) {
        A a9 = c9.f3934d;
        v vVar = this.f6441A;
        if (a9 != null && vVar == getDrawable() && vVar.f4046n == a9.f3927a) {
            return;
        }
        this.f6447G.add(EnumC0424g.f3956n);
        this.f6441A.d();
        b();
        c9.b(this.f6450w);
        c9.a(this.f6451x);
        this.f6449I = c9;
    }

    public final void b() {
        C c9 = this.f6449I;
        if (c9 != null) {
            C0425h c0425h = this.f6450w;
            synchronized (c9) {
                c9.f3931a.remove(c0425h);
            }
            C c10 = this.f6449I;
            C0425h c0425h2 = this.f6451x;
            synchronized (c10) {
                c10.f3932b.remove(c0425h2);
            }
        }
    }

    public EnumC0418a getAsyncUpdates() {
        EnumC0418a enumC0418a = this.f6441A.m0;
        return enumC0418a != null ? enumC0418a : EnumC0418a.f3943n;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC0418a enumC0418a = this.f6441A.m0;
        if (enumC0418a == null) {
            enumC0418a = EnumC0418a.f3943n;
        }
        return enumC0418a == EnumC0418a.f3944u;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f6441A.f4030N;
    }

    public boolean getClipToCompositionBounds() {
        return this.f6441A.f4024G;
    }

    public i getComposition() {
        Drawable drawable = getDrawable();
        v vVar = this.f6441A;
        if (drawable == vVar) {
            return vVar.f4046n;
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
        return (int) this.f6441A.f4053u.f38819A;
    }

    public String getImageAssetsFolder() {
        return this.f6441A.f4018A;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f6441A.f4023F;
    }

    public float getMaxFrame() {
        return this.f6441A.f4053u.i();
    }

    public float getMinFrame() {
        return this.f6441A.f4053u.j();
    }

    public D getPerformanceTracker() {
        i iVar = this.f6441A.f4046n;
        if (iVar != null) {
            return iVar.f3965a;
        }
        return null;
    }

    public float getProgress() {
        return this.f6441A.f4053u.h();
    }

    public F getRenderMode() {
        return this.f6441A.f4032P ? F.f3941v : F.f3940u;
    }

    public int getRepeatCount() {
        return this.f6441A.f4053u.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f6441A.f4053u.getRepeatMode();
    }

    public float getSpeed() {
        return this.f6441A.f4053u.f38829w;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof v) {
            boolean z6 = ((v) drawable).f4032P;
            F f2 = F.f3941v;
            if ((z6 ? f2 : F.f3940u) == f2) {
                this.f6441A.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        v vVar = this.f6441A;
        if (drawable2 == vVar) {
            super.invalidateDrawable(vVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f6445E) {
            return;
        }
        this.f6441A.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C0423f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0423f c0423f = (C0423f) parcelable;
        super.onRestoreInstanceState(c0423f.getSuperState());
        this.f6442B = c0423f.f3949n;
        HashSet hashSet = this.f6447G;
        EnumC0424g enumC0424g = EnumC0424g.f3956n;
        if (!hashSet.contains(enumC0424g) && !TextUtils.isEmpty(this.f6442B)) {
            setAnimation(this.f6442B);
        }
        this.f6443C = c0423f.f3950u;
        if (!hashSet.contains(enumC0424g) && (i = this.f6443C) != 0) {
            setAnimation(i);
        }
        boolean contains = hashSet.contains(EnumC0424g.f3957u);
        v vVar = this.f6441A;
        if (!contains) {
            vVar.u(c0423f.f3951v);
        }
        EnumC0424g enumC0424g2 = EnumC0424g.f3961y;
        if (!hashSet.contains(enumC0424g2) && c0423f.f3952w) {
            hashSet.add(enumC0424g2);
            vVar.l();
        }
        if (!hashSet.contains(EnumC0424g.f3960x)) {
            setImageAssetsFolder(c0423f.f3953x);
        }
        if (!hashSet.contains(EnumC0424g.f3958v)) {
            setRepeatMode(c0423f.f3954y);
        }
        if (hashSet.contains(EnumC0424g.f3959w)) {
            return;
        }
        setRepeatCount(c0423f.f3955z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z6;
        C0423f c0423f = new C0423f(super.onSaveInstanceState());
        c0423f.f3949n = this.f6442B;
        c0423f.f3950u = this.f6443C;
        v vVar = this.f6441A;
        c0423f.f3951v = vVar.f4053u.h();
        boolean isVisible = vVar.isVisible();
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = vVar.f4053u;
        if (isVisible) {
            z6 = choreographerFrameCallbackC4670e.f38824F;
        } else {
            int i = vVar.f4052s0;
            z6 = i == 2 || i == 3;
        }
        c0423f.f3952w = z6;
        c0423f.f3953x = vVar.f4018A;
        c0423f.f3954y = choreographerFrameCallbackC4670e.getRepeatMode();
        c0423f.f3955z = choreographerFrameCallbackC4670e.getRepeatCount();
        return c0423f;
    }

    public void setAnimation(final int i) {
        C a9;
        int i4 = 1;
        this.f6443C = i;
        final String str = null;
        this.f6442B = null;
        if (isInEditMode()) {
            a9 = new C(new f(this, i, i4), true);
        } else if (this.f6446F) {
            Context context = getContext();
            final String k9 = m.k(context, i);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            a9 = m.a(k9, new Callable() { // from class: Z0.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return m.f(context2, k9, i);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap hashMap = m.f3991a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            a9 = m.a(null, new Callable() { // from class: Z0.l
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
        setCompositionTask(m.a(null, new I0.f(2, byteArrayInputStream), new p(9, byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) {
        C a9;
        int i = 0;
        String str2 = null;
        if (this.f6446F) {
            Context context = getContext();
            HashMap hashMap = m.f3991a;
            String f2 = AbstractC5128c.f("url_", str);
            a9 = m.a(f2, new j(context, str, f2, i), null);
        } else {
            a9 = m.a(null, new j(getContext(), str, str2, i), null);
        }
        setCompositionTask(a9);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z6) {
        this.f6441A.f4028L = z6;
    }

    public void setApplyingShadowToLayersEnabled(boolean z6) {
        this.f6441A.f4029M = z6;
    }

    public void setAsyncUpdates(EnumC0418a enumC0418a) {
        this.f6441A.m0 = enumC0418a;
    }

    public void setCacheComposition(boolean z6) {
        this.f6446F = z6;
    }

    public void setClipTextToBoundingBox(boolean z6) {
        v vVar = this.f6441A;
        if (z6 != vVar.f4030N) {
            vVar.f4030N = z6;
            vVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z6) {
        v vVar = this.f6441A;
        if (z6 != vVar.f4024G) {
            vVar.f4024G = z6;
            C4564b c4564b = vVar.f4025H;
            if (c4564b != null) {
                c4564b.f38007L = z6;
            }
            vVar.invalidateSelf();
        }
    }

    public void setComposition(i iVar) {
        v vVar = this.f6441A;
        vVar.setCallback(this);
        boolean z6 = true;
        this.f6444D = true;
        i iVar2 = vVar.f4046n;
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = vVar.f4053u;
        if (iVar2 == iVar) {
            z6 = false;
        } else {
            vVar.f4045l0 = true;
            vVar.d();
            vVar.f4046n = iVar;
            vVar.c();
            boolean z9 = choreographerFrameCallbackC4670e.f38823E == null;
            choreographerFrameCallbackC4670e.f38823E = iVar;
            if (z9) {
                choreographerFrameCallbackC4670e.p(Math.max(choreographerFrameCallbackC4670e.f38821C, iVar.f3975l), Math.min(choreographerFrameCallbackC4670e.f38822D, iVar.f3976m));
            } else {
                choreographerFrameCallbackC4670e.p((int) iVar.f3975l, (int) iVar.f3976m);
            }
            float f2 = choreographerFrameCallbackC4670e.f38819A;
            choreographerFrameCallbackC4670e.f38819A = 0.0f;
            choreographerFrameCallbackC4670e.f38832z = 0.0f;
            choreographerFrameCallbackC4670e.o((int) f2);
            choreographerFrameCallbackC4670e.m();
            vVar.u(choreographerFrameCallbackC4670e.getAnimatedFraction());
            ArrayList arrayList = vVar.f4057y;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar != null) {
                    uVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            iVar.f3965a.f3935a = vVar.J;
            vVar.e();
            Drawable.Callback callback = vVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(vVar);
            }
        }
        if (this.f6445E) {
            vVar.l();
        }
        this.f6444D = false;
        if (getDrawable() != vVar || z6) {
            if (!z6) {
                boolean z10 = choreographerFrameCallbackC4670e != null ? choreographerFrameCallbackC4670e.f38824F : false;
                setImageDrawable(null);
                setImageDrawable(vVar);
                if (z10) {
                    vVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f6448H.iterator();
            if (it2.hasNext()) {
                throw x.i(it2);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        v vVar = this.f6441A;
        vVar.f4021D = str;
        M i = vVar.i();
        if (i != null) {
            i.f765y = str;
        }
    }

    public void setFailureListener(y yVar) {
        this.f6452y = yVar;
    }

    public void setFallbackResource(int i) {
        this.f6453z = i;
    }

    public void setFontAssetDelegate(AbstractC0419b abstractC0419b) {
        M m9 = this.f6441A.f4019B;
    }

    public void setFontMap(Map<String, Typeface> map) {
        v vVar = this.f6441A;
        if (map == vVar.f4020C) {
            return;
        }
        vVar.f4020C = map;
        vVar.invalidateSelf();
    }

    public void setFrame(int i) {
        this.f6441A.o(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z6) {
        this.f6441A.f4055w = z6;
    }

    public void setImageAssetDelegate(InterfaceC0420c interfaceC0420c) {
        C4458a c4458a = this.f6441A.f4058z;
    }

    public void setImageAssetsFolder(String str) {
        this.f6441A.f4018A = str;
    }

    @Override // m.C4733x, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f6443C = 0;
        this.f6442B = null;
        b();
        super.setImageBitmap(bitmap);
    }

    @Override // m.C4733x, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f6443C = 0;
        this.f6442B = null;
        b();
        super.setImageDrawable(drawable);
    }

    @Override // m.C4733x, android.widget.ImageView
    public void setImageResource(int i) {
        this.f6443C = 0;
        this.f6442B = null;
        b();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z6) {
        this.f6441A.f4023F = z6;
    }

    public void setMaxFrame(int i) {
        this.f6441A.p(i);
    }

    public void setMaxProgress(float f2) {
        v vVar = this.f6441A;
        i iVar = vVar.f4046n;
        if (iVar == null) {
            vVar.f4057y.add(new q(vVar, f2, 0));
            return;
        }
        float f9 = AbstractC4672g.f(iVar.f3975l, iVar.f3976m, f2);
        ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = vVar.f4053u;
        choreographerFrameCallbackC4670e.p(choreographerFrameCallbackC4670e.f38821C, f9);
    }

    public void setMinAndMaxFrame(String str) {
        this.f6441A.r(str);
    }

    public void setMinFrame(int i) {
        this.f6441A.s(i);
    }

    public void setMinProgress(float f2) {
        v vVar = this.f6441A;
        i iVar = vVar.f4046n;
        if (iVar == null) {
            vVar.f4057y.add(new q(vVar, f2, 1));
        } else {
            vVar.s((int) AbstractC4672g.f(iVar.f3975l, iVar.f3976m, f2));
        }
    }

    public void setOutlineMasksAndMattes(boolean z6) {
        v vVar = this.f6441A;
        if (vVar.f4027K == z6) {
            return;
        }
        vVar.f4027K = z6;
        C4564b c4564b = vVar.f4025H;
        if (c4564b != null) {
            c4564b.q(z6);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z6) {
        v vVar = this.f6441A;
        vVar.J = z6;
        i iVar = vVar.f4046n;
        if (iVar != null) {
            iVar.f3965a.f3935a = z6;
        }
    }

    public void setProgress(float f2) {
        this.f6447G.add(EnumC0424g.f3957u);
        this.f6441A.u(f2);
    }

    public void setRenderMode(F f2) {
        v vVar = this.f6441A;
        vVar.f4031O = f2;
        vVar.e();
    }

    public void setRepeatCount(int i) {
        this.f6447G.add(EnumC0424g.f3959w);
        this.f6441A.f4053u.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f6447G.add(EnumC0424g.f3958v);
        this.f6441A.f4053u.setRepeatMode(i);
    }

    public void setSafeMode(boolean z6) {
        this.f6441A.f4056x = z6;
    }

    public void setSpeed(float f2) {
        this.f6441A.f4053u.f38829w = f2;
    }

    public void setTextDelegate(H h3) {
        this.f6441A.getClass();
    }

    public void setUseCompositionFrameRate(boolean z6) {
        this.f6441A.f4053u.f38825G = z6;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        v vVar;
        boolean z6 = this.f6444D;
        if (!z6 && drawable == (vVar = this.f6441A)) {
            ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e = vVar.f4053u;
            if (choreographerFrameCallbackC4670e == null ? false : choreographerFrameCallbackC4670e.f38824F) {
                this.f6445E = false;
                vVar.k();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z6 && (drawable instanceof v)) {
            v vVar2 = (v) drawable;
            ChoreographerFrameCallbackC4670e choreographerFrameCallbackC4670e2 = vVar2.f4053u;
            if (choreographerFrameCallbackC4670e2 != null ? choreographerFrameCallbackC4670e2.f38824F : false) {
                vVar2.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f6441A.q(str);
    }

    public void setMinFrame(String str) {
        this.f6441A.t(str);
    }

    public void setAnimation(String str) {
        C a9;
        int i = 1;
        this.f6442B = str;
        this.f6443C = 0;
        if (isInEditMode()) {
            a9 = new C(new CallableC0421d(0, this, str), true);
        } else {
            String str2 = null;
            if (this.f6446F) {
                Context context = getContext();
                HashMap hashMap = m.f3991a;
                String f2 = AbstractC5128c.f("asset_", str);
                a9 = m.a(f2, new j(context.getApplicationContext(), str, f2, i), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = m.f3991a;
                a9 = m.a(null, new j(context2.getApplicationContext(), str, str2, i), null);
            }
        }
        setCompositionTask(a9);
    }
}
