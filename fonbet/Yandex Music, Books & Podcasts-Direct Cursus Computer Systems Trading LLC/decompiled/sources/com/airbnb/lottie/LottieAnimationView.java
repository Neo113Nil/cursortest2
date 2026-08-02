package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.abf;
import defpackage.ayg;
import defpackage.cas;
import defpackage.cyg;
import defpackage.czg;
import defpackage.dn9;
import defpackage.ds2;
import defpackage.dyg;
import defpackage.ebe;
import defpackage.etn;
import defpackage.f1d;
import defpackage.fb7;
import defpackage.fzg;
import defpackage.gyg;
import defpackage.hrg;
import defpackage.hzg;
import defpackage.izg;
import defpackage.kzg;
import defpackage.lzg;
import defpackage.mpc;
import defpackage.nzg;
import defpackage.okk;
import defpackage.osh;
import defpackage.psg;
import defpackage.pt1;
import defpackage.pzg;
import defpackage.qiq;
import defpackage.rzg;
import defpackage.sae;
import defpackage.sdn;
import defpackage.sr7;
import defpackage.szg;
import defpackage.uxg;
import defpackage.vxg;
import defpackage.wwn;
import defpackage.wxg;
import defpackage.xq0;
import defpackage.xr5;
import defpackage.xxg;
import defpackage.xyg;
import defpackage.y5i;
import defpackage.yxg;
import defpackage.ziq;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipInputStream;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final izg DEFAULT_FAILURE_LISTENER = new uxg();
    private static final String TAG = "LottieAnimationView";
    public static final /* synthetic */ int a = 0;
    private String animationName;
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;
    private pzg compositionTask;
    private izg failureListener;
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final izg loadedListener;
    private final czg lottieDrawable;
    private final Set<kzg> lottieOnCompositionLoadedListeners;
    private final Set<xxg> userActionsTaken;
    private final izg wrappedFailureListener;

    public LottieAnimationView(Context context) {
        super(context);
        this.loadedListener = new yxg(this, 1);
        this.wrappedFailureListener = new yxg(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new czg();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        p(null, R.attr.lottieAnimationViewStyle);
    }

    public static nzg c(LottieAnimationView lottieAnimationView, String str) {
        if (!lottieAnimationView.cacheComposition) {
            return gyg.b(lottieAnimationView.getContext(), str, null);
        }
        Context context = lottieAnimationView.getContext();
        HashMap hashMap = gyg.a;
        return gyg.b(context, str, "asset_" + str);
    }

    public static nzg n(LottieAnimationView lottieAnimationView, int i) {
        if (!lottieAnimationView.cacheComposition) {
            return gyg.g(lottieAnimationView.getContext(), null, i);
        }
        Context context = lottieAnimationView.getContext();
        return gyg.g(context, gyg.l(context, i), i);
    }

    private void setCompositionTask(pzg pzgVar) {
        nzg nzgVar = pzgVar.d;
        czg czgVar = this.lottieDrawable;
        if (nzgVar != null && czgVar == getDrawable() && czgVar.a == nzgVar.a) {
            return;
        }
        this.userActionsTaken.add(xxg.a);
        this.lottieDrawable.d();
        o();
        pzgVar.b(this.loadedListener);
        pzgVar.a(this.wrappedFailureListener);
        this.compositionTask = pzgVar;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.b.addListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.b.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.b.addUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull kzg kzgVar) {
        if (getComposition() != null) {
            kzgVar.a();
        }
        return this.lottieOnCompositionLoadedListeners.add(kzgVar);
    }

    public <T> void addValueCallback(abf abfVar, T t, ziq ziqVar) {
        this.lottieDrawable.a(abfVar, t, new vxg());
    }

    public void cancelAnimation() {
        this.autoPlay = false;
        this.userActionsTaken.add(xxg.f);
        czg czgVar = this.lottieDrawable;
        czgVar.f.clear();
        czgVar.b.cancel();
        if (czgVar.isVisible()) {
            return;
        }
        czgVar.y0 = 1;
    }

    public <T> void clearValueCallback(abf abfVar, T t) {
        this.lottieDrawable.a(abfVar, t, null);
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.getClass();
    }

    public void enableFeatureFlag(fzg fzgVar, boolean z) {
        boolean remove;
        czg czgVar = this.lottieDrawable;
        HashSet hashSet = (HashSet) czgVar.l.a;
        if (z) {
            fzgVar.getClass();
            remove = hashSet.add(fzgVar);
        } else {
            remove = hashSet.remove(fzgVar);
        }
        if (czgVar.a == null || !remove) {
            return;
        }
        czgVar.c();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        czg czgVar = this.lottieDrawable;
        HashSet hashSet = (HashSet) czgVar.l.a;
        fzg fzgVar = fzg.a;
        boolean add = z ? hashSet.add(fzgVar) : hashSet.remove(fzgVar);
        if (czgVar.a == null || !add) {
            return;
        }
        czgVar.c();
    }

    public pt1 getAsyncUpdates() {
        pt1 pt1Var = this.lottieDrawable.L;
        return pt1Var != null ? pt1Var : pt1.a;
    }

    public boolean getAsyncUpdatesEnabled() {
        pt1 pt1Var = this.lottieDrawable.L;
        if (pt1Var == null) {
            pt1Var = pt1.a;
        }
        return pt1Var == pt1.b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.lottieDrawable.u;
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.n;
    }

    public ayg getComposition() {
        Drawable drawable = getDrawable();
        czg czgVar = this.lottieDrawable;
        if (drawable == czgVar) {
            return czgVar.a;
        }
        return null;
    }

    public long getDuration() {
        ayg composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.lottieDrawable.b.h;
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.m;
    }

    public float getMaxFrame() {
        return this.lottieDrawable.b.f();
    }

    public float getMinFrame() {
        return this.lottieDrawable.b.g();
    }

    public okk getPerformanceTracker() {
        ayg aygVar = this.lottieDrawable.a;
        if (aygVar != null) {
            return aygVar.a;
        }
        return null;
    }

    public float getProgress() {
        return this.lottieDrawable.b.e();
    }

    public wwn getRenderMode() {
        return this.lottieDrawable.w ? wwn.c : wwn.b;
    }

    public int getRepeatCount() {
        return this.lottieDrawable.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.lottieDrawable.b.d;
    }

    public boolean hasMasks() {
        xr5 xr5Var = this.lottieDrawable.o;
        return xr5Var != null && xr5Var.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean hasMatte() {
        boolean booleanValue;
        xr5 xr5Var = this.lottieDrawable.o;
        if (xr5Var == null) {
            return false;
        }
        ArrayList arrayList = xr5Var.E;
        if (xr5Var.K == null) {
            if (xr5Var.s != null) {
                xr5Var.K = Boolean.TRUE;
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((ds2) arrayList.get(size)).s != null) {
                        xr5Var.K = Boolean.TRUE;
                    }
                }
                xr5Var.K = Boolean.FALSE;
            }
            booleanValue = true;
            return !booleanValue;
        }
        booleanValue = xr5Var.K.booleanValue();
        if (!booleanValue) {
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof czg) {
            boolean z = ((czg) drawable).w;
            wwn wwnVar = wwn.c;
            if ((z ? wwnVar : wwn.b) == wwnVar) {
                this.lottieDrawable.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        czg czgVar = this.lottieDrawable;
        if (drawable2 == czgVar) {
            super.invalidateDrawable(czgVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.k();
    }

    public boolean isFeatureFlagEnabled(fzg fzgVar) {
        return ((HashSet) this.lottieDrawable.l.a).contains(fzgVar);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return ((HashSet) this.lottieDrawable.l.a).contains(fzg.a);
    }

    @Deprecated
    public void loop(boolean z) {
        this.lottieDrawable.b.setRepeatCount(z ? -1 : 0);
    }

    public final void o() {
        pzg pzgVar = this.compositionTask;
        if (pzgVar != null) {
            izg izgVar = this.loadedListener;
            synchronized (pzgVar) {
                pzgVar.a.remove(izgVar);
            }
            pzg pzgVar2 = this.compositionTask;
            izg izgVar2 = this.wrappedFailureListener;
            synchronized (pzgVar2) {
                pzgVar2.b.remove(izgVar2);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.n();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof wxg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wxg wxgVar = (wxg) parcelable;
        super.onRestoreInstanceState(wxgVar.getSuperState());
        this.animationName = wxgVar.a;
        Set<xxg> set = this.userActionsTaken;
        xxg xxgVar = xxg.a;
        if (!set.contains(xxgVar) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = wxgVar.b;
        if (!this.userActionsTaken.contains(xxgVar) && (i = this.animationResId) != 0) {
            setAnimation(i);
        }
        if (!this.userActionsTaken.contains(xxg.b)) {
            this.lottieDrawable.B(wxgVar.c);
        }
        if (!this.userActionsTaken.contains(xxg.f) && wxgVar.d) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(xxg.e)) {
            setImageAssetsFolder(wxgVar.e);
        }
        if (!this.userActionsTaken.contains(xxg.c)) {
            setRepeatMode(wxgVar.f);
        }
        if (this.userActionsTaken.contains(xxg.d)) {
            return;
        }
        setRepeatCount(wxgVar.g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        wxg wxgVar = new wxg(super.onSaveInstanceState());
        wxgVar.a = this.animationName;
        wxgVar.b = this.animationResId;
        wxgVar.c = this.lottieDrawable.b.e();
        czg czgVar = this.lottieDrawable;
        if (czgVar.isVisible()) {
            z = czgVar.b.m;
        } else {
            int i = czgVar.y0;
            z = i == 2 || i == 3;
        }
        wxgVar.d = z;
        czg czgVar2 = this.lottieDrawable;
        wxgVar.e = czgVar2.h;
        wxgVar.f = czgVar2.b.getRepeatMode();
        wxgVar.g = this.lottieDrawable.b.getRepeatCount();
        return wxgVar;
    }

    public final void p(AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, sdn.a, i, 0);
        this.cacheComposition = obtainStyledAttributes.getBoolean(4, true);
        boolean hasValue = obtainStyledAttributes.hasValue(16);
        boolean hasValue2 = obtainStyledAttributes.hasValue(11);
        boolean hasValue3 = obtainStyledAttributes.hasValue(21);
        if (hasValue && hasValue2) {
            xq0.x("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            return;
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
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(14, false)) {
            this.lottieDrawable.b.setRepeatCount(-1);
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
        float f = obtainStyledAttributes.getFloat(15, 0.0f);
        if (hasValue4) {
            this.userActionsTaken.add(xxg.b);
        }
        this.lottieDrawable.B(f);
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(9, false));
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.hasValue(7)) {
            addValueCallback(new abf("**"), (abf) lzg.I, new szg(new qiq(etn.E(getContext(), obtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            int i2 = obtainStyledAttributes.getInt(17, 0);
            if (i2 >= wwn.values().length) {
                i2 = 0;
            }
            setRenderMode(wwn.values()[i2]);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int i3 = obtainStyledAttributes.getInt(2, 0);
            if (i3 >= wwn.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(pt1.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(12, false));
        if (obtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(22, false));
        }
        obtainStyledAttributes.recycle();
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.m();
    }

    public void playAnimation() {
        this.userActionsTaken.add(xxg.f);
        this.lottieDrawable.n();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.b.removeAllListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        czg czgVar = this.lottieDrawable;
        rzg rzgVar = czgVar.b;
        rzgVar.removeAllUpdateListeners();
        rzgVar.addUpdateListener(czgVar.X);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.b.removeListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.b.removePauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull kzg kzgVar) {
        return this.lottieOnCompositionLoadedListeners.remove(kzgVar);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.b.removeUpdateListener(animatorUpdateListener);
    }

    public List<abf> resolveKeyPath(abf abfVar) {
        return this.lottieDrawable.p(abfVar);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(xxg.f);
        this.lottieDrawable.q();
    }

    public void reverseAnimationSpeed() {
        rzg rzgVar = this.lottieDrawable.b;
        rzgVar.d = -rzgVar.d;
    }

    public void setAnimation(String str) {
        pzg a2;
        this.animationName = str;
        this.animationResId = 0;
        int i = 1;
        if (isInEditMode()) {
            a2 = new pzg(new fb7(3, this, str), true);
        } else {
            String str2 = null;
            if (this.cacheComposition) {
                Context context = getContext();
                HashMap hashMap = gyg.a;
                String g = f1d.g("asset_", str);
                a2 = gyg.a(g, new cyg(context.getApplicationContext(), str, g, i), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = gyg.a;
                a2 = gyg.a(null, new cyg(context2.getApplicationContext(), str, str2, i), null);
            }
        }
        setCompositionTask(a2);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        pzg a2;
        int i = 0;
        String str2 = null;
        if (this.cacheComposition) {
            Context context = getContext();
            HashMap hashMap = gyg.a;
            String g = f1d.g("url_", str);
            a2 = gyg.a(g, new cyg(context, str, g, i), null);
        } else {
            a2 = gyg.a(null, new cyg(getContext(), str, str2, i), null);
        }
        setCompositionTask(a2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.s = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.lottieDrawable.t = z;
    }

    public void setAsyncUpdates(pt1 pt1Var) {
        this.lottieDrawable.L = pt1Var;
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        czg czgVar = this.lottieDrawable;
        if (z != czgVar.u) {
            czgVar.u = z;
            czgVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        czg czgVar = this.lottieDrawable;
        if (z != czgVar.n) {
            czgVar.n = z;
            xr5 xr5Var = czgVar.o;
            if (xr5Var != null) {
                xr5Var.N = z;
            }
            czgVar.invalidateSelf();
        }
    }

    public void setComposition(@NonNull ayg aygVar) {
        this.lottieDrawable.setCallback(this);
        this.ignoreUnschedule = true;
        boolean r = this.lottieDrawable.r(aygVar);
        if (this.autoPlay) {
            this.lottieDrawable.n();
        }
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || r) {
            if (!r) {
                boolean isAnimating = isAnimating();
                setImageDrawable(null);
                setImageDrawable(this.lottieDrawable);
                if (isAnimating) {
                    this.lottieDrawable.q();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<kzg> it = this.lottieOnCompositionLoadedListeners.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        czg czgVar = this.lottieDrawable;
        czgVar.k = str;
        dn9 i = czgVar.i();
        if (i != null) {
            i.f = str;
        }
    }

    public void setFailureListener(izg izgVar) {
        this.failureListener = izgVar;
    }

    public void setFallbackResource(int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(mpc mpcVar) {
        dn9 dn9Var = this.lottieDrawable.i;
    }

    public void setFontMap(Map<String, Typeface> map) {
        czg czgVar = this.lottieDrawable;
        if (map == czgVar.j) {
            return;
        }
        czgVar.j = map;
        czgVar.invalidateSelf();
    }

    public void setFrame(int i) {
        this.lottieDrawable.s(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.lottieDrawable.d = z;
    }

    public void setImageAssetDelegate(ebe ebeVar) {
        osh oshVar = this.lottieDrawable.g;
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.h = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.animationResId = 0;
        this.animationName = null;
        o();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.animationResId = 0;
        this.animationName = null;
        o();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.animationResId = 0;
        this.animationName = null;
        o();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.lottieDrawable.m = z;
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.t(i);
    }

    public void setMaxProgress(float f) {
        czg czgVar = this.lottieDrawable;
        ayg aygVar = czgVar.a;
        if (aygVar == null) {
            czgVar.f.add(new xyg(czgVar, f, 0));
            return;
        }
        rzg rzgVar = czgVar.b;
        rzgVar.k(rzgVar.j, y5i.f(aygVar.l, aygVar.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.w(str);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.y(f, f2);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.z(i);
    }

    public void setMinProgress(float f) {
        czg czgVar = this.lottieDrawable;
        ayg aygVar = czgVar.a;
        if (aygVar == null) {
            czgVar.f.add(new xyg(czgVar, f, 1));
        } else {
            czgVar.z((int) y5i.f(aygVar.l, aygVar.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        czg czgVar = this.lottieDrawable;
        if (czgVar.r == z) {
            return;
        }
        czgVar.r = z;
        xr5 xr5Var = czgVar.o;
        if (xr5Var != null) {
            xr5Var.p(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        czg czgVar = this.lottieDrawable;
        czgVar.q = z;
        ayg aygVar = czgVar.a;
        if (aygVar != null) {
            aygVar.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.userActionsTaken.add(xxg.b);
        this.lottieDrawable.B(f);
    }

    public void setRenderMode(wwn wwnVar) {
        czg czgVar = this.lottieDrawable;
        czgVar.v = wwnVar;
        czgVar.e();
    }

    public void setRepeatCount(int i) {
        this.userActionsTaken.add(xxg.d);
        this.lottieDrawable.b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.userActionsTaken.add(xxg.c);
        this.lottieDrawable.b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.e = z;
    }

    public void setSpeed(float f) {
        this.lottieDrawable.b.d = f;
    }

    public void setTextDelegate(cas casVar) {
        this.lottieDrawable.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.lottieDrawable.b.n = z;
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        czg czgVar;
        if (!this.ignoreUnschedule && drawable == (czgVar = this.lottieDrawable) && czgVar.k()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof czg)) {
            czg czgVar2 = (czg) drawable;
            if (czgVar2.k()) {
                czgVar2.m();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        Bitmap bitmap2;
        czg czgVar = this.lottieDrawable;
        osh j = czgVar.j();
        if (j == null) {
            psg.b("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Map map = (Map) j.c;
        if (bitmap == null) {
            hzg hzgVar = (hzg) map.get(str);
            bitmap2 = hzgVar.f;
            hzgVar.f = null;
        } else {
            Bitmap bitmap3 = ((hzg) map.get(str)).f;
            j.O(str, bitmap);
            bitmap2 = bitmap3;
        }
        czgVar.invalidateSelf();
        return bitmap2;
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.u(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.x(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.A(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.v(i, i2);
    }

    public <T> void addValueCallback(abf abfVar, T t, szg szgVar) {
        this.lottieDrawable.a(abfVar, t, szgVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(gyg.a(str2, new cyg(getContext(), str, str2, 0), null));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new yxg(this, 1);
        this.wrappedFailureListener = new yxg(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new czg();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        p(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadedListener = new yxg(this, 1);
        this.wrappedFailureListener = new yxg(this, 0);
        this.fallbackResource = 0;
        this.lottieDrawable = new czg();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        p(attributeSet, i);
    }

    public void setAnimation(int i) {
        pzg f;
        this.animationResId = i;
        this.animationName = null;
        if (isInEditMode()) {
            f = new pzg(new sae(this, i, 1), true);
        } else if (this.cacheComposition) {
            Context context = getContext();
            f = gyg.f(context, gyg.l(context, i), i);
        } else {
            f = gyg.f(getContext(), null, i);
        }
        setCompositionTask(f);
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(gyg.a(str, new fb7(4, inputStream, str), new sr7(29, inputStream)));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(gyg.a(str, new fb7(5, zipInputStream, str), new dyg(0, zipInputStream)));
    }
}
