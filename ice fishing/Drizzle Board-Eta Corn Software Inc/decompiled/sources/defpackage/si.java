package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class si implements LayoutInflater.Factory2 {
    public final ej NCTxEWno;

    public si(ej ejVar) {
        this.NCTxEWno = ejVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        xj P7K7Inc8;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        ej ejVar = this.NCTxEWno;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, ejVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t00.qoPGr6Ce);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = li.class.isAssignableFrom(yi.NCTxEWno(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    li lwWCatUu = resourceId != -1 ? ejVar.lwWCatUu(resourceId) : null;
                    if (lwWCatUu == null && string != null) {
                        lwWCatUu = ejVar.U0LaHZX7(string);
                    }
                    if (lwWCatUu == null && id != -1) {
                        lwWCatUu = ejVar.lwWCatUu(id);
                    }
                    if (lwWCatUu == null) {
                        yi Mq3SeTnW = ejVar.Mq3SeTnW();
                        context.getClassLoader();
                        lwWCatUu = Mq3SeTnW.qoPGr6Ce(attributeValue);
                        lwWCatUu.lDXGDhIF = true;
                        lwWCatUu.gjV1z5T1 = resourceId != 0 ? resourceId : id;
                        lwWCatUu.WYNAV5pd = id;
                        lwWCatUu.DK9slbsy = string;
                        lwWCatUu.sjUBp5pO = true;
                        lwWCatUu.Ey6iv0m0 = ejVar;
                        ni niVar = ejVar.I5GHvsYW;
                        lwWCatUu.I5GHvsYW = niVar;
                        lwWCatUu.i7xS8jrb(niVar.OxcuoDLp, attributeSet, lwWCatUu.MdtA4re8);
                        P7K7Inc8 = ejVar.qoPGr6Ce(lwWCatUu);
                        if (ej.ytu5o6f4(2)) {
                            Log.v("FragmentManager", "Fragment " + lwWCatUu + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (lwWCatUu.sjUBp5pO) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        lwWCatUu.sjUBp5pO = true;
                        lwWCatUu.Ey6iv0m0 = ejVar;
                        ni niVar2 = ejVar.I5GHvsYW;
                        lwWCatUu.I5GHvsYW = niVar2;
                        lwWCatUu.i7xS8jrb(niVar2.OxcuoDLp, attributeSet, lwWCatUu.MdtA4re8);
                        P7K7Inc8 = ejVar.P7K7Inc8(lwWCatUu);
                        if (ej.ytu5o6f4(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + lwWCatUu + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    yj yjVar = zj.qoPGr6Ce;
                    zj.NCTxEWno(new uj(lwWCatUu, "Attempting to use <fragment> tag to add fragment " + lwWCatUu + " to container " + viewGroup));
                    zj.qoPGr6Ce(lwWCatUu).getClass();
                    lwWCatUu.SgZGMMPL = viewGroup;
                    P7K7Inc8.k3x7lurq();
                    P7K7Inc8.eVhOlqcC();
                    View view2 = lwWCatUu.ytu5o6f4;
                    if (view2 == null) {
                        m1.Ey6iv0m0(q70.P7K7Inc8("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (lwWCatUu.ytu5o6f4.getTag() == null) {
                        lwWCatUu.ytu5o6f4.setTag(string);
                    }
                    lwWCatUu.ytu5o6f4.addOnAttachStateChangeListener(new ri(this, P7K7Inc8));
                    return lwWCatUu.ytu5o6f4;
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
