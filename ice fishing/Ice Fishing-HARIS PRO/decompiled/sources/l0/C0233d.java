package l0;

import D1.i;
import M0.h;
import O.K;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0093j;
import g.AbstractC0155a;
import h.C0166g;
import h0.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import m.AbstractC0265l0;
import m.C0277s;
import o.C0311b;
import o.C0312c;
import o.C0315f;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3781a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3782b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3783c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3784d;
    public Parcelable e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3785f;

    public /* synthetic */ C0233d(TextView textView) {
        this.e = null;
        this.f3785f = null;
        this.f3781a = false;
        this.f3782b = false;
        this.f3784d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f3784d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f3781a || this.f3782b) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f3781a) {
                    mutate.setTintList((ColorStateList) this.e);
                }
                if (this.f3782b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f3785f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        C0277s c0277s = (C0277s) this.f3784d;
        Drawable checkMarkDrawable = c0277s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f3781a || this.f3782b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f3781a) {
                    mutate.setTintList((ColorStateList) this.e);
                }
                if (this.f3782b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f3785f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c0277s.getDrawableState());
                }
                c0277s.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f3782b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.e = null;
        }
        return bundle2;
    }

    public InterfaceC0232c d() {
        String str;
        InterfaceC0232c interfaceC0232c;
        Iterator it = ((C0315f) this.f3784d).iterator();
        do {
            C0311b c0311b = (C0311b) it;
            if (!c0311b.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c0311b.next();
            i.d(entry, "components");
            str = (String) entry.getKey();
            interfaceC0232c = (InterfaceC0232c) entry.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0232c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f3784d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0155a.f3043m;
        h i2 = h.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f617c;
        K.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) i2.f617c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(f.n(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(i2.b(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(AbstractC0265l0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(f.n(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            i2.l();
        }
    }

    public void f(String str, InterfaceC0232c interfaceC0232c) {
        Object obj;
        i.e(interfaceC0232c, "provider");
        C0315f c0315f = (C0315f) this.f3784d;
        C0312c a2 = c0315f.a(str);
        if (a2 != null) {
            obj = a2.f4118b;
        } else {
            C0312c c0312c = new C0312c(str, interfaceC0232c);
            c0315f.f4127d++;
            C0312c c0312c2 = c0315f.f4125b;
            if (c0312c2 == null) {
                c0315f.f4124a = c0312c;
                c0315f.f4125b = c0312c;
            } else {
                c0312c2.f4119c = c0312c;
                c0312c.f4120d = c0312c2;
                c0315f.f4125b = c0312c;
            }
            obj = null;
        }
        if (((InterfaceC0232c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() {
        if (!this.f3783c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0166g c0166g = (C0166g) this.f3785f;
        if (c0166g == null) {
            c0166g = new C0166g(this);
        }
        this.f3785f = c0166g;
        try {
            C0093j.class.getDeclaredConstructor(null);
            C0166g c0166g2 = (C0166g) this.f3785f;
            if (c0166g2 != null) {
                ((LinkedHashSet) c0166g2.f3209b).add(C0093j.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C0093j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public C0233d() {
        this.f3784d = new C0315f();
        this.f3783c = true;
    }
}
