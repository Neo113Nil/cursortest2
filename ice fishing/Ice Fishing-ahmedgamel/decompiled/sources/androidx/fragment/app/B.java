package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e0.AbstractC4460a;
import f0.C4497c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B implements LayoutInflater.Factory2 {

    /* renamed from: n, reason: collision with root package name */
    public final N f4816n;

    public B(N n9) {
        this.f4816n = n9;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.fragment.app.x] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.fragment.app.x] */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z3;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s;
        int i;
        V f3;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = null;
        int i6 = 0;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        N n9 = this.f4816n;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, n9);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4460a.f37102a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            int i9 = 2;
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z3 = AbstractComponentCallbacksC0475s.class.isAssignableFrom(G.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z3 = false;
                }
                if (z3) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0475s z6 = resourceId != -1 ? n9.z(resourceId) : null;
                    if (z6 == null && string != null) {
                        S0.n nVar = n9.f4852c;
                        ArrayList arrayList = (ArrayList) nVar.f2802u;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                abstractComponentCallbacksC0475s = abstractComponentCallbacksC0475s2;
                                i = i9;
                                Iterator it = ((HashMap) nVar.f2803v).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z6 = abstractComponentCallbacksC0475s;
                                        break;
                                    }
                                    V v9 = (V) it.next();
                                    if (v9 != null) {
                                        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s3 = v9.f4907c;
                                        if (string.equals(abstractComponentCallbacksC0475s3.f5043Q)) {
                                            z6 = abstractComponentCallbacksC0475s3;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                abstractComponentCallbacksC0475s = abstractComponentCallbacksC0475s2;
                                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s4 = (AbstractComponentCallbacksC0475s) arrayList.get(size);
                                i = i9;
                                if (abstractComponentCallbacksC0475s4 != null && string.equals(abstractComponentCallbacksC0475s4.f5043Q)) {
                                    z6 = abstractComponentCallbacksC0475s4;
                                    break;
                                }
                                size--;
                                i9 = i;
                                abstractComponentCallbacksC0475s2 = abstractComponentCallbacksC0475s;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0475s = null;
                        i = 2;
                    }
                    if (z6 == null && id != -1) {
                        z6 = n9.z(id);
                    }
                    if (z6 == null) {
                        G B9 = n9.B();
                        context.getClassLoader();
                        z6 = B9.a(attributeValue);
                        z6.f5033F = true;
                        z6.f5041O = resourceId != 0 ? resourceId : id;
                        z6.f5042P = id;
                        z6.f5043Q = string;
                        z6.f5034G = true;
                        z6.f5037K = n9;
                        C0479w c0479w = n9.f4868t;
                        z6.f5038L = c0479w;
                        AbstractActivityC0480x abstractActivityC0480x = c0479w.f5076u;
                        z6.f5048V = true;
                        if (c0479w != null) {
                            abstractComponentCallbacksC0475s = c0479w.f5075n;
                        }
                        if (abstractComponentCallbacksC0475s != null) {
                            z6.f5048V = true;
                        }
                        f3 = n9.a(z6);
                        if (N.E(i)) {
                            Log.v("FragmentManager", "Fragment " + z6 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (z6.f5034G) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        z6.f5034G = true;
                        z6.f5037K = n9;
                        C0479w c0479w2 = n9.f4868t;
                        z6.f5038L = c0479w2;
                        AbstractActivityC0480x abstractActivityC0480x2 = c0479w2.f5076u;
                        z6.f5048V = true;
                        if (c0479w2 != null) {
                            abstractComponentCallbacksC0475s = c0479w2.f5075n;
                        }
                        if (abstractComponentCallbacksC0475s != null) {
                            z6.f5048V = true;
                        }
                        f3 = n9.f(z6);
                        if (N.E(i)) {
                            Log.v("FragmentManager", "Retained Fragment " + z6 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C4497c c4497c = f0.d.f37345a;
                    f0.d.b(new f0.e(z6, viewGroup, 0));
                    f0.d.a(z6).getClass();
                    z6.f5049W = viewGroup;
                    f3.k();
                    f3.j();
                    View view2 = z6.f5050X;
                    if (view2 == null) {
                        throw new IllegalStateException(D.y.o("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (z6.f5050X.getTag() == null) {
                        z6.f5050X.setTag(string);
                    }
                    z6.f5050X.addOnAttachStateChangeListener(new A(i6, this, f3));
                    return z6.f5050X;
                }
            }
        }
        return null;
    }
}
