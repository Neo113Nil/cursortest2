package f8;

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
import com.google.android.gms.internal.ads.C2866Yb;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2572Gh;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC3629ng;
import g.AbstractC4518a;
import java.lang.ref.WeakReference;
import m.AbstractC4694j0;
import p2.C4835j;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37555a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37556b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37557c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37558d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f37559e;

    /* renamed from: f, reason: collision with root package name */
    public Object f37560f;

    /* renamed from: g, reason: collision with root package name */
    public Object f37561g;

    public j(Activity activity, ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh, ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh2) {
        this.f37555a = 3;
        this.f37560f = activity;
        this.f37559e = viewTreeObserverOnGlobalLayoutListenerC2572Gh;
        this.f37561g = viewTreeObserverOnGlobalLayoutListenerC2572Gh2;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f37559e;
        Drawable a9 = U.c.a(compoundButton);
        if (a9 != null) {
            if (this.f37556b || this.f37557c) {
                Drawable mutate = a9.mutate();
                if (this.f37556b) {
                    H.a.h(mutate, (ColorStateList) this.f37560f);
                }
                if (this.f37557c) {
                    H.a.i(mutate, (PorterDuff.Mode) this.f37561g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        m.r rVar = (m.r) this.f37559e;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f37556b || this.f37557c) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f37556b) {
                    H.a.h(mutate, (ColorStateList) this.f37560f);
                }
                if (this.f37557c) {
                    H.a.i(mutate, (PorterDuff.Mode) this.f37561g);
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
        CompoundButton compoundButton = (CompoundButton) this.f37559e;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC4518a.f37599m;
        j4.g s9 = j4.g.s(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) s9.f38405v;
        X.n(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) s9.f38405v, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(com.bumptech.glide.g.e(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    U.b.c(compoundButton, s9.h(2));
                }
                if (typedArray.hasValue(3)) {
                    U.b.d(compoundButton, AbstractC4694j0.b(typedArray.getInt(3, -1), null));
                }
                s9.t();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(com.bumptech.glide.g.e(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            s9.t();
        } catch (Throwable th) {
            s9.t();
            throw th;
        }
    }

    public void d() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.f37556b) {
            return;
        }
        Activity activity = (Activity) this.f37560f;
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = (ViewTreeObserverOnGlobalLayoutListenerC2572Gh) this.f37561g;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2572Gh);
            }
        }
        C2866Yb c2866Yb = C4835j.f39733C.f39735B;
        ViewTreeObserverOnGlobalLayoutListenerC3629ng viewTreeObserverOnGlobalLayoutListenerC3629ng = new ViewTreeObserverOnGlobalLayoutListenerC3629ng((ViewTreeObserverOnGlobalLayoutListenerC2572Gh) this.f37559e, viewTreeObserverOnGlobalLayoutListenerC2572Gh);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3629ng.f26598n).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3629ng.Q1(viewTreeObserver2);
        }
        this.f37556b = true;
    }

    public String toString() {
        switch (this.f37555a) {
            case 0:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f37556b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f37557c + ", prettyPrintIndent='" + ((String) this.f37559e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f37560f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f37558d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, classDiscriminatorMode=" + ((EnumC4514a) this.f37561g) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j(TextView textView, int i) {
        this.f37555a = i;
        this.f37560f = null;
        this.f37561g = null;
        this.f37556b = false;
        this.f37557c = false;
        this.f37559e = textView;
    }

    public j(boolean z3, boolean z6, String prettyPrintIndent, String classDiscriminator, boolean z9, EnumC4514a classDiscriminatorMode) {
        this.f37555a = 0;
        kotlin.jvm.internal.h.e(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.h.e(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.h.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f37556b = z3;
        this.f37557c = z6;
        this.f37559e = prettyPrintIndent;
        this.f37560f = classDiscriminator;
        this.f37558d = z9;
        this.f37561g = classDiscriminatorMode;
    }
}
