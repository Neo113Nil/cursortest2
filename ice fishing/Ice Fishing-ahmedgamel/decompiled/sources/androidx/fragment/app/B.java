package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e0.AbstractC4471a;
import f0.C4514c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B implements LayoutInflater.Factory2 {

    /* renamed from: n, reason: collision with root package name */
    public final N f4784n;

    public B(N n9) {
        this.f4784n = n9;
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
        boolean z6;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s;
        int i;
        V f2;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = null;
        int i4 = 0;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        N n9 = this.f4784n;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, n9);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4471a.f37210a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            int i6 = 2;
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z6 = AbstractComponentCallbacksC0479s.class.isAssignableFrom(G.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z6 = false;
                }
                if (z6) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0479s z9 = resourceId != -1 ? n9.z(resourceId) : null;
                    if (z9 == null && string != null) {
                        l4.q qVar = n9.f4820c;
                        ArrayList arrayList = (ArrayList) qVar.f38945n;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                abstractComponentCallbacksC0479s = abstractComponentCallbacksC0479s2;
                                i = i6;
                                Iterator it = ((HashMap) qVar.f38946u).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z9 = abstractComponentCallbacksC0479s;
                                        break;
                                    }
                                    V v9 = (V) it.next();
                                    if (v9 != null) {
                                        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s3 = v9.f4875c;
                                        if (string.equals(abstractComponentCallbacksC0479s3.f5011Q)) {
                                            z9 = abstractComponentCallbacksC0479s3;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                abstractComponentCallbacksC0479s = abstractComponentCallbacksC0479s2;
                                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s4 = (AbstractComponentCallbacksC0479s) arrayList.get(size);
                                i = i6;
                                if (abstractComponentCallbacksC0479s4 != null && string.equals(abstractComponentCallbacksC0479s4.f5011Q)) {
                                    z9 = abstractComponentCallbacksC0479s4;
                                    break;
                                }
                                size--;
                                i6 = i;
                                abstractComponentCallbacksC0479s2 = abstractComponentCallbacksC0479s;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0479s = null;
                        i = 2;
                    }
                    if (z9 == null && id != -1) {
                        z9 = n9.z(id);
                    }
                    if (z9 == null) {
                        G B3 = n9.B();
                        context.getClassLoader();
                        z9 = B3.a(attributeValue);
                        z9.f5001F = true;
                        z9.f5009O = resourceId != 0 ? resourceId : id;
                        z9.f5010P = id;
                        z9.f5011Q = string;
                        z9.f5002G = true;
                        z9.f5005K = n9;
                        C0483w c0483w = n9.f4836t;
                        z9.f5006L = c0483w;
                        AbstractActivityC0484x abstractActivityC0484x = c0483w.f5042A;
                        z9.f5016V = true;
                        if (c0483w != null) {
                            abstractComponentCallbacksC0479s = c0483w.f5046z;
                        }
                        if (abstractComponentCallbacksC0479s != null) {
                            z9.f5016V = true;
                        }
                        f2 = n9.a(z9);
                        if (N.E(i)) {
                            Log.v("FragmentManager", "Fragment " + z9 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (z9.f5002G) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        z9.f5002G = true;
                        z9.f5005K = n9;
                        C0483w c0483w2 = n9.f4836t;
                        z9.f5006L = c0483w2;
                        AbstractActivityC0484x abstractActivityC0484x2 = c0483w2.f5042A;
                        z9.f5016V = true;
                        if (c0483w2 != null) {
                            abstractComponentCallbacksC0479s = c0483w2.f5046z;
                        }
                        if (abstractComponentCallbacksC0479s != null) {
                            z9.f5016V = true;
                        }
                        f2 = n9.f(z9);
                        if (N.E(i)) {
                            Log.v("FragmentManager", "Retained Fragment " + z9 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C4514c c4514c = f0.d.f37421a;
                    f0.d.b(new f0.e(z9, viewGroup, 0));
                    f0.d.a(z9).getClass();
                    z9.f5017W = viewGroup;
                    f2.k();
                    f2.j();
                    View view2 = z9.f5018X;
                    if (view2 == null) {
                        throw new IllegalStateException(D.x.l("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (z9.f5018X.getTag() == null) {
                        z9.f5018X.setTag(string);
                    }
                    z9.f5018X.addOnAttachStateChangeListener(new A(i4, this, f2));
                    return z9.f5018X;
                }
            }
        }
        return null;
    }
}
