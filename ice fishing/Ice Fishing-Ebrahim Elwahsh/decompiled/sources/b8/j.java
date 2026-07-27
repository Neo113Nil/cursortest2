package b8;

import O.X;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.internal.ads.C2837Wb;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2520Dh;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC3480kg;
import g.AbstractC4518a;
import java.lang.ref.WeakReference;
import m.AbstractC4742j0;
import m.Q0;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5599a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5600b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5601c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5602d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5603e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5604f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5605g;

    public j(Activity activity, ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh, ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh2) {
        this.f5599a = 3;
        this.f5604f = activity;
        this.f5603e = viewTreeObserverOnGlobalLayoutListenerC2520Dh;
        this.f5605g = viewTreeObserverOnGlobalLayoutListenerC2520Dh2;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f5603e;
        Drawable a9 = U.c.a(compoundButton);
        if (a9 != null) {
            if (this.f5600b || this.f5601c) {
                Drawable mutate = a9.mutate();
                if (this.f5600b) {
                    H.a.h(mutate, (ColorStateList) this.f5604f);
                }
                if (this.f5601c) {
                    H.a.i(mutate, (PorterDuff.Mode) this.f5605g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        m.r rVar = (m.r) this.f5603e;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f5600b || this.f5601c) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f5600b) {
                    H.a.h(mutate, (ColorStateList) this.f5604f);
                }
                if (this.f5601c) {
                    H.a.i(mutate, (PorterDuff.Mode) this.f5605g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(rVar.getDrawableState());
                }
                rVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f5603e;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC4518a.f37829m;
        Q0 p6 = Q0.p(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) p6.f39326c;
        X.n(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) p6.f39326c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(com.bumptech.glide.f.h(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    U.b.c(compoundButton, p6.f(2));
                }
                if (typedArray.hasValue(3)) {
                    U.b.d(compoundButton, AbstractC4742j0.b(typedArray.getInt(3, -1), null));
                }
                p6.q();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(com.bumptech.glide.f.h(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            p6.q();
        } catch (Throwable th) {
            p6.q();
            throw th;
        }
    }

    public void d() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.f5600b) {
            return;
        }
        Activity activity = (Activity) this.f5604f;
        ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = (ViewTreeObserverOnGlobalLayoutListenerC2520Dh) this.f5605g;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2520Dh);
            }
        }
        C2837Wb c2837Wb = p2.j.f39798C.f39800B;
        ViewTreeObserverOnGlobalLayoutListenerC3480kg viewTreeObserverOnGlobalLayoutListenerC3480kg = new ViewTreeObserverOnGlobalLayoutListenerC3480kg((ViewTreeObserverOnGlobalLayoutListenerC2520Dh) this.f5603e, viewTreeObserverOnGlobalLayoutListenerC2520Dh);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3480kg.f29483n).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3480kg.v1(viewTreeObserver2);
        }
        this.f5600b = true;
    }

    public String toString() {
        switch (this.f5599a) {
            case 0:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f5600b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f5601c + ", prettyPrintIndent='" + ((String) this.f5603e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f5604f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f5602d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, classDiscriminatorMode=" + ((EnumC0532a) this.f5605g) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j(TextView textView, int i) {
        this.f5599a = i;
        this.f5604f = null;
        this.f5605g = null;
        this.f5600b = false;
        this.f5601c = false;
        this.f5603e = textView;
    }

    public j(boolean z8, boolean z9, String prettyPrintIndent, String classDiscriminator, boolean z10, EnumC0532a classDiscriminatorMode) {
        this.f5599a = 0;
        kotlin.jvm.internal.h.e(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.h.e(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.h.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f5600b = z8;
        this.f5601c = z9;
        this.f5603e = prettyPrintIndent;
        this.f5604f = classDiscriminator;
        this.f5602d = z10;
        this.f5605g = classDiscriminatorMode;
    }
}
