package com.airbnb.lottie;

import C2.N;
import D.RunnableC0282a;
import T0.f;
import X0.A;
import X0.AbstractC0415b;
import X0.C;
import X0.C0418e;
import X0.C0419f;
import X0.C0421h;
import X0.CallableC0417d;
import X0.D;
import X0.E;
import X0.EnumC0414a;
import X0.EnumC0420g;
import X0.F;
import X0.G;
import X0.H;
import X0.InterfaceC0416c;
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
import b1.C0513a;
import c1.e;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishing.icefishinglive2.C5275R;
import f1.C4499b;
import j1.AbstractC4603g;
import j1.ChoreographerFrameCallbackC4601e;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import m.C4720x;
import u1.h;

/* loaded from: classes.dex */
public class LottieAnimationView extends C4720x {
    public static final C0418e J = new C0418e();

    /* renamed from: A, reason: collision with root package name */
    public final v f5655A;

    /* renamed from: B, reason: collision with root package name */
    public String f5656B;

    /* renamed from: C, reason: collision with root package name */
    public int f5657C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5658D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f5659E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5660F;

    /* renamed from: G, reason: collision with root package name */
    public final HashSet f5661G;

    /* renamed from: H, reason: collision with root package name */
    public final HashSet f5662H;

    /* renamed from: I, reason: collision with root package name */
    public C f5663I;

    /* renamed from: w, reason: collision with root package name */
    public final C0421h f5664w;

    /* renamed from: x, reason: collision with root package name */
    public final C0421h f5665x;

    /* renamed from: y, reason: collision with root package name */
    public y f5666y;

    /* renamed from: z, reason: collision with root package name */
    public int f5667z;

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String string;
        this.f5664w = new C0421h(this, 1);
        this.f5665x = new C0421h(this, 0);
        this.f5667z = 0;
        v vVar = new v();
        this.f5655A = vVar;
        this.f5658D = false;
        this.f5659E = false;
        this.f5660F = true;
        HashSet hashSet = new HashSet();
        this.f5661G = hashSet;
        this.f5662H = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, E.f3586a, C5275R.attr.lottieAnimationViewStyle, 0);
        this.f5660F = obtainStyledAttributes.getBoolean(4, true);
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
            this.f5659E = true;
        }
        if (obtainStyledAttributes.getBoolean(14, false)) {
            vVar.f3698u.setRepeatCount(-1);
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
        float f3 = obtainStyledAttributes.getFloat(15, 0.0f);
        if (hasValue4) {
            hashSet.add(EnumC0420g.f3605u);
        }
        vVar.u(f3);
        boolean z3 = obtainStyledAttributes.getBoolean(9, false);
        w wVar = w.f3708n;
        HashSet hashSet2 = vVar.f3670E.f38919a;
        boolean add = z3 ? hashSet2.add(wVar) : hashSet2.remove(wVar);
        if (vVar.f3690n != null && add) {
            vVar.c();
        }
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.hasValue(7)) {
            vVar.a(new e("**"), z.f3724I, new C2991bm(new G(E.e.c(getContext(), obtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            int i = obtainStyledAttributes.getInt(17, 0);
            setRenderMode(F.values()[i >= F.values().length ? 0 : i]);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int i6 = obtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(EnumC0414a.values()[i6 >= F.values().length ? 0 : i6]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(12, false));
        if (obtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(22, false));
        }
        obtainStyledAttributes.recycle();
    }

    private void setCompositionTask(C c9) {
        A a9 = c9.f3582d;
        v vVar = this.f5655A;
        if (a9 != null && vVar == getDrawable() && vVar.f3690n == a9.f3575a) {
            return;
        }
        this.f5661G.add(EnumC0420g.f3604n);
        this.f5655A.d();
        b();
        c9.b(this.f5664w);
        c9.a(this.f5665x);
        this.f5663I = c9;
    }

    public final void b() {
        C c9 = this.f5663I;
        if (c9 != null) {
            C0421h c0421h = this.f5664w;
            synchronized (c9) {
                c9.f3579a.remove(c0421h);
            }
            C c10 = this.f5663I;
            C0421h c0421h2 = this.f5665x;
            synchronized (c10) {
                c10.f3580b.remove(c0421h2);
            }
        }
    }

    public EnumC0414a getAsyncUpdates() {
        EnumC0414a enumC0414a = this.f5655A.f3695r0;
        return enumC0414a != null ? enumC0414a : EnumC0414a.f3591n;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC0414a enumC0414a = this.f5655A.f3695r0;
        if (enumC0414a == null) {
            enumC0414a = EnumC0414a.f3591n;
        }
        return enumC0414a == EnumC0414a.f3592u;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f5655A.f3678N;
    }

    public boolean getClipToCompositionBounds() {
        return this.f5655A.f3672G;
    }

    public i getComposition() {
        Drawable drawable = getDrawable();
        v vVar = this.f5655A;
        if (drawable == vVar) {
            return vVar.f3690n;
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
        return (int) this.f5655A.f3698u.f38307A;
    }

    public String getImageAssetsFolder() {
        return this.f5655A.f3666A;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f5655A.f3671F;
    }

    public float getMaxFrame() {
        return this.f5655A.f3698u.i();
    }

    public float getMinFrame() {
        return this.f5655A.f3698u.j();
    }

    public D getPerformanceTracker() {
        i iVar = this.f5655A.f3690n;
        if (iVar != null) {
            return iVar.f3613a;
        }
        return null;
    }

    public float getProgress() {
        return this.f5655A.f3698u.h();
    }

    public F getRenderMode() {
        return this.f5655A.f3680P ? F.f3589v : F.f3588u;
    }

    public int getRepeatCount() {
        return this.f5655A.f3698u.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f5655A.f3698u.getRepeatMode();
    }

    public float getSpeed() {
        return this.f5655A.f3698u.f38317w;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof v) {
            boolean z3 = ((v) drawable).f3680P;
            F f3 = F.f3589v;
            if ((z3 ? f3 : F.f3588u) == f3) {
                this.f5655A.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        v vVar = this.f5655A;
        if (drawable2 == vVar) {
            super.invalidateDrawable(vVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f5659E) {
            return;
        }
        this.f5655A.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C0419f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0419f c0419f = (C0419f) parcelable;
        super.onRestoreInstanceState(c0419f.getSuperState());
        this.f5656B = c0419f.f3597n;
        HashSet hashSet = this.f5661G;
        EnumC0420g enumC0420g = EnumC0420g.f3604n;
        if (!hashSet.contains(enumC0420g) && !TextUtils.isEmpty(this.f5656B)) {
            setAnimation(this.f5656B);
        }
        this.f5657C = c0419f.f3598u;
        if (!hashSet.contains(enumC0420g) && (i = this.f5657C) != 0) {
            setAnimation(i);
        }
        boolean contains = hashSet.contains(EnumC0420g.f3605u);
        v vVar = this.f5655A;
        if (!contains) {
            vVar.u(c0419f.f3599v);
        }
        EnumC0420g enumC0420g2 = EnumC0420g.f3609y;
        if (!hashSet.contains(enumC0420g2) && c0419f.f3600w) {
            hashSet.add(enumC0420g2);
            vVar.l();
        }
        if (!hashSet.contains(EnumC0420g.f3608x)) {
            setImageAssetsFolder(c0419f.f3601x);
        }
        if (!hashSet.contains(EnumC0420g.f3606v)) {
            setRepeatMode(c0419f.f3602y);
        }
        if (hashSet.contains(EnumC0420g.f3607w)) {
            return;
        }
        setRepeatCount(c0419f.f3603z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        C0419f c0419f = new C0419f(super.onSaveInstanceState());
        c0419f.f3597n = this.f5656B;
        c0419f.f3598u = this.f5657C;
        v vVar = this.f5655A;
        c0419f.f3599v = vVar.f3698u.h();
        boolean isVisible = vVar.isVisible();
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = vVar.f3698u;
        if (isVisible) {
            z3 = choreographerFrameCallbackC4601e.f38312F;
        } else {
            int i = vVar.f3705x0;
            z3 = i == 2 || i == 3;
        }
        c0419f.f3600w = z3;
        c0419f.f3601x = vVar.f3666A;
        c0419f.f3602y = choreographerFrameCallbackC4601e.getRepeatMode();
        c0419f.f3603z = choreographerFrameCallbackC4601e.getRepeatCount();
        return c0419f;
    }

    public void setAnimation(final int i) {
        C a9;
        int i6 = 1;
        this.f5657C = i;
        final String str = null;
        this.f5656B = null;
        if (isInEditMode()) {
            a9 = new C(new f(this, i, i6), true);
        } else if (this.f5660F) {
            Context context = getContext();
            final String k9 = m.k(context, i);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            a9 = m.a(k9, new Callable() { // from class: X0.l
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
            HashMap hashMap = m.f3639a;
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
        setCompositionTask(m.a(null, new I0.f(2, byteArrayInputStream), new RunnableC0282a(7, byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) {
        C a9;
        int i = 0;
        String str2 = null;
        if (this.f5660F) {
            Context context = getContext();
            HashMap hashMap = m.f3639a;
            String f3 = h.f("url_", str);
            a9 = m.a(f3, new j(context, str, f3, i), null);
        } else {
            a9 = m.a(null, new j(getContext(), str, str2, i), null);
        }
        setCompositionTask(a9);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z3) {
        this.f5655A.f3676L = z3;
    }

    public void setApplyingShadowToLayersEnabled(boolean z3) {
        this.f5655A.f3677M = z3;
    }

    public void setAsyncUpdates(EnumC0414a enumC0414a) {
        this.f5655A.f3695r0 = enumC0414a;
    }

    public void setCacheComposition(boolean z3) {
        this.f5660F = z3;
    }

    public void setClipTextToBoundingBox(boolean z3) {
        v vVar = this.f5655A;
        if (z3 != vVar.f3678N) {
            vVar.f3678N = z3;
            vVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z3) {
        v vVar = this.f5655A;
        if (z3 != vVar.f3672G) {
            vVar.f3672G = z3;
            C4499b c4499b = vVar.f3673H;
            if (c4499b != null) {
                c4499b.f37383L = z3;
            }
            vVar.invalidateSelf();
        }
    }

    public void setComposition(i iVar) {
        v vVar = this.f5655A;
        vVar.setCallback(this);
        boolean z3 = true;
        this.f5658D = true;
        i iVar2 = vVar.f3690n;
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = vVar.f3698u;
        if (iVar2 == iVar) {
            z3 = false;
        } else {
            vVar.f3694q0 = true;
            vVar.d();
            vVar.f3690n = iVar;
            vVar.c();
            boolean z6 = choreographerFrameCallbackC4601e.f38311E == null;
            choreographerFrameCallbackC4601e.f38311E = iVar;
            if (z6) {
                choreographerFrameCallbackC4601e.p(Math.max(choreographerFrameCallbackC4601e.f38309C, iVar.f3623l), Math.min(choreographerFrameCallbackC4601e.f38310D, iVar.f3624m));
            } else {
                choreographerFrameCallbackC4601e.p((int) iVar.f3623l, (int) iVar.f3624m);
            }
            float f3 = choreographerFrameCallbackC4601e.f38307A;
            choreographerFrameCallbackC4601e.f38307A = 0.0f;
            choreographerFrameCallbackC4601e.f38320z = 0.0f;
            choreographerFrameCallbackC4601e.o((int) f3);
            choreographerFrameCallbackC4601e.m();
            vVar.u(choreographerFrameCallbackC4601e.getAnimatedFraction());
            ArrayList arrayList = vVar.f3706y;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                if (uVar != null) {
                    uVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            iVar.f3613a.f3583a = vVar.J;
            vVar.e();
            Drawable.Callback callback = vVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(vVar);
            }
        }
        if (this.f5659E) {
            vVar.l();
        }
        this.f5658D = false;
        if (getDrawable() != vVar || z3) {
            if (!z3) {
                boolean z9 = choreographerFrameCallbackC4601e != null ? choreographerFrameCallbackC4601e.f38312F : false;
                setImageDrawable(null);
                setImageDrawable(vVar);
                if (z9) {
                    vVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f5662H.iterator();
            if (it2.hasNext()) {
                throw D.y.j(it2);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        v vVar = this.f5655A;
        vVar.f3669D = str;
        N i = vVar.i();
        if (i != null) {
            i.f305y = str;
        }
    }

    public void setFailureListener(y yVar) {
        this.f5666y = yVar;
    }

    public void setFallbackResource(int i) {
        this.f5667z = i;
    }

    public void setFontAssetDelegate(AbstractC0415b abstractC0415b) {
        N n9 = this.f5655A.f3667B;
    }

    public void setFontMap(Map<String, Typeface> map) {
        v vVar = this.f5655A;
        if (map == vVar.f3668C) {
            return;
        }
        vVar.f3668C = map;
        vVar.invalidateSelf();
    }

    public void setFrame(int i) {
        this.f5655A.o(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z3) {
        this.f5655A.f3702w = z3;
    }

    public void setImageAssetDelegate(InterfaceC0416c interfaceC0416c) {
        C0513a c0513a = this.f5655A.f3707z;
    }

    public void setImageAssetsFolder(String str) {
        this.f5655A.f3666A = str;
    }

    @Override // m.C4720x, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f5657C = 0;
        this.f5656B = null;
        b();
        super.setImageBitmap(bitmap);
    }

    @Override // m.C4720x, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f5657C = 0;
        this.f5656B = null;
        b();
        super.setImageDrawable(drawable);
    }

    @Override // m.C4720x, android.widget.ImageView
    public void setImageResource(int i) {
        this.f5657C = 0;
        this.f5656B = null;
        b();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z3) {
        this.f5655A.f3671F = z3;
    }

    public void setMaxFrame(int i) {
        this.f5655A.p(i);
    }

    public void setMaxProgress(float f3) {
        v vVar = this.f5655A;
        i iVar = vVar.f3690n;
        if (iVar == null) {
            vVar.f3706y.add(new q(vVar, f3, 0));
            return;
        }
        float f9 = AbstractC4603g.f(iVar.f3623l, iVar.f3624m, f3);
        ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = vVar.f3698u;
        choreographerFrameCallbackC4601e.p(choreographerFrameCallbackC4601e.f38309C, f9);
    }

    public void setMinAndMaxFrame(String str) {
        this.f5655A.r(str);
    }

    public void setMinFrame(int i) {
        this.f5655A.s(i);
    }

    public void setMinProgress(float f3) {
        v vVar = this.f5655A;
        i iVar = vVar.f3690n;
        if (iVar == null) {
            vVar.f3706y.add(new q(vVar, f3, 1));
        } else {
            vVar.s((int) AbstractC4603g.f(iVar.f3623l, iVar.f3624m, f3));
        }
    }

    public void setOutlineMasksAndMattes(boolean z3) {
        v vVar = this.f5655A;
        if (vVar.f3675K == z3) {
            return;
        }
        vVar.f3675K = z3;
        C4499b c4499b = vVar.f3673H;
        if (c4499b != null) {
            c4499b.q(z3);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z3) {
        v vVar = this.f5655A;
        vVar.J = z3;
        i iVar = vVar.f3690n;
        if (iVar != null) {
            iVar.f3613a.f3583a = z3;
        }
    }

    public void setProgress(float f3) {
        this.f5661G.add(EnumC0420g.f3605u);
        this.f5655A.u(f3);
    }

    public void setRenderMode(F f3) {
        v vVar = this.f5655A;
        vVar.f3679O = f3;
        vVar.e();
    }

    public void setRepeatCount(int i) {
        this.f5661G.add(EnumC0420g.f3607w);
        this.f5655A.f3698u.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f5661G.add(EnumC0420g.f3606v);
        this.f5655A.f3698u.setRepeatMode(i);
    }

    public void setSafeMode(boolean z3) {
        this.f5655A.f3704x = z3;
    }

    public void setSpeed(float f3) {
        this.f5655A.f3698u.f38317w = f3;
    }

    public void setTextDelegate(H h9) {
        this.f5655A.getClass();
    }

    public void setUseCompositionFrameRate(boolean z3) {
        this.f5655A.f3698u.f38313G = z3;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        v vVar;
        boolean z3 = this.f5658D;
        if (!z3 && drawable == (vVar = this.f5655A)) {
            ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e = vVar.f3698u;
            if (choreographerFrameCallbackC4601e == null ? false : choreographerFrameCallbackC4601e.f38312F) {
                this.f5659E = false;
                vVar.k();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z3 && (drawable instanceof v)) {
            v vVar2 = (v) drawable;
            ChoreographerFrameCallbackC4601e choreographerFrameCallbackC4601e2 = vVar2.f3698u;
            if (choreographerFrameCallbackC4601e2 != null ? choreographerFrameCallbackC4601e2.f38312F : false) {
                vVar2.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f5655A.q(str);
    }

    public void setMinFrame(String str) {
        this.f5655A.t(str);
    }

    public void setAnimation(String str) {
        C a9;
        int i = 1;
        this.f5656B = str;
        this.f5657C = 0;
        if (isInEditMode()) {
            a9 = new C(new CallableC0417d(0, this, str), true);
        } else {
            String str2 = null;
            if (this.f5660F) {
                Context context = getContext();
                HashMap hashMap = m.f3639a;
                String f3 = h.f("asset_", str);
                a9 = m.a(f3, new j(context.getApplicationContext(), str, f3, i), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = m.f3639a;
                a9 = m.a(null, new j(context2.getApplicationContext(), str, str2, i), null);
            }
        }
        setCompositionTask(a9);
    }
}
