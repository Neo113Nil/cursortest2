package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.fen;
import defpackage.hrg;
import defpackage.kuc;
import defpackage.luc;
import defpackage.muc;
import defpackage.nuc;
import defpackage.otc;
import defpackage.ptc;
import defpackage.xq0;

/* loaded from: classes.dex */
public final class v implements LayoutInflater.Factory2 {
    public final y a;

    public v(y yVar) {
        this.a = yVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        b0 g;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        y yVar = this.a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, yVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fen.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = o.class.isAssignableFrom(otc.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    o C = resourceId != -1 ? yVar.C(resourceId) : null;
                    if (C == null && string != null) {
                        C = yVar.D(string);
                    }
                    if (C == null && id != -1) {
                        C = yVar.C(id);
                    }
                    if (C == null) {
                        C = yVar.J().a(context.getClassLoader(), attributeValue);
                        C.mFromLayout = true;
                        C.mFragmentId = resourceId != 0 ? resourceId : id;
                        C.mContainerId = id;
                        C.mTag = string;
                        C.mInLayout = true;
                        C.mFragmentManager = yVar;
                        ptc ptcVar = yVar.x;
                        C.mHost = ptcVar;
                        C.onInflate((Context) ptcVar.b, attributeSet, C.mSavedFragmentState);
                        g = yVar.a(C);
                        if (y.M(2)) {
                            Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        C.mInLayout = true;
                        C.mFragmentManager = yVar;
                        ptc ptcVar2 = yVar.x;
                        C.mHost = ptcVar2;
                        C.onInflate((Context) ptcVar2.b, attributeSet, C.mSavedFragmentState);
                        g = yVar.g(C);
                        if (y.M(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    luc lucVar = muc.a;
                    nuc nucVar = new nuc(C, "Attempting to use <fragment> tag to add fragment " + C + " to container " + viewGroup);
                    muc.c(nucVar);
                    luc a = muc.a(C);
                    if (a.a.contains(kuc.d) && muc.e(a, C.getClass(), nuc.class)) {
                        muc.b(a, nucVar);
                    }
                    C.mContainer = viewGroup;
                    g.k();
                    g.j();
                    View view2 = C.mView;
                    if (view2 == null) {
                        xq0.q(hrg.q("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (C.mView.getTag() == null) {
                        C.mView.setTag(string);
                    }
                    C.mView.addOnAttachStateChangeListener(new u(this, g));
                    return C.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
