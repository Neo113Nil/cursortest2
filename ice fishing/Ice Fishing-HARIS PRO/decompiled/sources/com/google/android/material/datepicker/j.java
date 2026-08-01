package com.google.android.material.datepicker;

import O.InterfaceC0039o;
import O.j0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import z.AbstractC0396r;
import z.C0392n;

/* loaded from: classes.dex */
public final class j implements InterfaceC0039o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2525a;

    /* renamed from: b, reason: collision with root package name */
    public int f2526b;

    /* renamed from: c, reason: collision with root package name */
    public int f2527c;

    public j(View view) {
        this.f2525a = view;
    }

    @Override // O.InterfaceC0039o
    public j0 s(View view, j0 j0Var) {
        int i = j0Var.f819a.f(7).f262b;
        View view2 = (View) this.f2525a;
        int i2 = this.f2526b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2527c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return j0Var;
    }

    public j(Context context, XmlResourceParser xmlResourceParser) {
        this.f2525a = new ArrayList();
        this.f2527c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0396r.f4971h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2526b = obtainStyledAttributes.getResourceId(index, this.f2526b);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f2527c);
                this.f2527c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0392n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public j(View view, int i, int i2) {
        this.f2526b = i;
        this.f2525a = view;
        this.f2527c = i2;
    }
}
