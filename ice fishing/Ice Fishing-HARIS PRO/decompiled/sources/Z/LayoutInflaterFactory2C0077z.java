package Z;

import a0.AbstractC0082d;
import a0.C0079a;
import a0.C0081c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* renamed from: Z.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0077z implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final M f1639a;

    public LayoutInflaterFactory2C0077z(M m2) {
        this.f1639a = m2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        T f2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        M m2 = this.f1639a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, m2);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y.a.f1396a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = AbstractComponentCallbacksC0070s.class.isAssignableFrom(F.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0070s A2 = resourceId != -1 ? m2.A(resourceId) : null;
                if (A2 == null && string != null) {
                    A2 = m2.B(string);
                }
                if (A2 == null && id != -1) {
                    A2 = m2.A(id);
                }
                if (A2 == null) {
                    F D2 = m2.D();
                    context.getClassLoader();
                    A2 = D2.a(attributeValue);
                    A2.f1609n = true;
                    A2.f1618w = resourceId != 0 ? resourceId : id;
                    A2.f1619x = id;
                    A2.f1620y = string;
                    A2.f1610o = true;
                    A2.f1614s = m2;
                    C0074w c0074w = m2.f1452u;
                    A2.f1615t = c0074w;
                    A2.y(c0074w.f1629b, attributeSet, A2.f1600b);
                    f2 = m2.a(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + A2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (A2.f1610o) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    A2.f1610o = true;
                    A2.f1614s = m2;
                    C0074w c0074w2 = m2.f1452u;
                    A2.f1615t = c0074w2;
                    A2.y(c0074w2.f1629b, attributeSet, A2.f1600b);
                    f2 = m2.f(A2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + A2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C0081c c0081c = AbstractC0082d.f1667a;
                AbstractC0082d.b(new C0079a(A2, "Attempting to use <fragment> tag to add fragment " + A2 + " to container " + viewGroup));
                AbstractC0082d.a(A2).getClass();
                A2.f1583E = viewGroup;
                f2.k();
                f2.j();
                View view2 = A2.f1584F;
                if (view2 == null) {
                    throw new IllegalStateException(D1.h.g("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (A2.f1584F.getTag() == null) {
                    A2.f1584F.setTag(string);
                }
                A2.f1584F.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0076y(this, f2));
                return A2.f1584F;
            }
        }
        return null;
    }
}
