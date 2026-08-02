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
import com.google.android.gms.internal.ads.C2889Yb;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2592Gh;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC3652ng;
import g.AbstractC4528a;
import java.lang.ref.WeakReference;
import m.AbstractC4707j0;
import r2.C4906k;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37517a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37518b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37519c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37520d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f37521e;

    /* renamed from: f, reason: collision with root package name */
    public Object f37522f;

    /* renamed from: g, reason: collision with root package name */
    public Object f37523g;

    public j(Activity activity, ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh, ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh2) {
        this.f37517a = 3;
        this.f37522f = activity;
        this.f37521e = viewTreeObserverOnGlobalLayoutListenerC2592Gh;
        this.f37523g = viewTreeObserverOnGlobalLayoutListenerC2592Gh2;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f37521e;
        Drawable a9 = U.c.a(compoundButton);
        if (a9 != null) {
            if (this.f37518b || this.f37519c) {
                Drawable mutate = a9.mutate();
                if (this.f37518b) {
                    H.a.h(mutate, (ColorStateList) this.f37522f);
                }
                if (this.f37519c) {
                    H.a.i(mutate, (PorterDuff.Mode) this.f37523g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        m.r rVar = (m.r) this.f37521e;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f37518b || this.f37519c) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f37518b) {
                    H.a.h(mutate, (ColorStateList) this.f37522f);
                }
                if (this.f37519c) {
                    H.a.i(mutate, (PorterDuff.Mode) this.f37523g);
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
        CompoundButton compoundButton = (CompoundButton) this.f37521e;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC4528a.f37561m;
        l4.g s9 = l4.g.s(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) s9.f38917v;
        X.n(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) s9.f38917v, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(com.bumptech.glide.g.h(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    U.b.c(compoundButton, s9.h(2));
                }
                if (typedArray.hasValue(3)) {
                    U.b.d(compoundButton, AbstractC4707j0.b(typedArray.getInt(3, -1), null));
                }
                s9.t();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(com.bumptech.glide.g.h(compoundButton.getContext(), resourceId));
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
        if (this.f37518b) {
            return;
        }
        Activity activity = (Activity) this.f37522f;
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = (ViewTreeObserverOnGlobalLayoutListenerC2592Gh) this.f37523g;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2592Gh);
            }
        }
        C2889Yb c2889Yb = C4906k.f40186C.f40188B;
        ViewTreeObserverOnGlobalLayoutListenerC3652ng viewTreeObserverOnGlobalLayoutListenerC3652ng = new ViewTreeObserverOnGlobalLayoutListenerC3652ng((ViewTreeObserverOnGlobalLayoutListenerC2592Gh) this.f37521e, viewTreeObserverOnGlobalLayoutListenerC2592Gh);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3652ng.f27380n).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3652ng.R1(viewTreeObserver2);
        }
        this.f37518b = true;
    }

    public String toString() {
        switch (this.f37517a) {
            case 0:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f37518b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f37519c + ", prettyPrintIndent='" + ((String) this.f37521e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f37522f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f37520d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, classDiscriminatorMode=" + ((EnumC4524a) this.f37523g) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j(TextView textView, int i) {
        this.f37517a = i;
        this.f37522f = null;
        this.f37523g = null;
        this.f37518b = false;
        this.f37519c = false;
        this.f37521e = textView;
    }

    public j(boolean z6, boolean z9, String prettyPrintIndent, String classDiscriminator, boolean z10, EnumC4524a classDiscriminatorMode) {
        this.f37517a = 0;
        kotlin.jvm.internal.h.e(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.h.e(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.h.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f37518b = z6;
        this.f37519c = z9;
        this.f37521e = prettyPrintIndent;
        this.f37522f = classDiscriminator;
        this.f37520d = z10;
        this.f37523g = classDiscriminatorMode;
    }
}
