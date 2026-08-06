package io.flutter.plugin.editing;

import P0.t;
import Z0.p;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f7790a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7791b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7792c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7793d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7794e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f7795f;

    /* renamed from: g, reason: collision with root package name */
    public String f7796g;

    /* renamed from: h, reason: collision with root package name */
    public int f7797h;

    /* renamed from: i, reason: collision with root package name */
    public int f7798i;

    /* renamed from: j, reason: collision with root package name */
    public int f7799j;

    /* renamed from: k, reason: collision with root package name */
    public int f7800k;

    /* renamed from: l, reason: collision with root package name */
    public final d f7801l;

    public f(p pVar, t tVar) {
        this.f7801l = new d(tVar, this);
        if (pVar != null) {
            f(pVar);
        }
    }

    public final void a(e eVar) {
        if (this.f7791b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f7790a <= 0) {
            this.f7792c.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f7793d.add(eVar);
        }
    }

    public final void b() {
        this.f7790a++;
        if (this.f7791b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f7790a != 1 || this.f7792c.isEmpty()) {
            return;
        }
        this.f7796g = toString();
        this.f7797h = Selection.getSelectionStart(this);
        this.f7798i = Selection.getSelectionEnd(this);
        this.f7799j = BaseInputConnection.getComposingSpanStart(this);
        this.f7800k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f7790a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f7792c;
        ArrayList arrayList2 = this.f7793d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f7791b++;
                eVar.a(true);
                this.f7791b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f7796g), (this.f7797h == Selection.getSelectionStart(this) && this.f7798i == Selection.getSelectionEnd(this)) ? false : true, (this.f7799j == BaseInputConnection.getComposingSpanStart(this) && this.f7800k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f7790a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator it = this.f7792c.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f7791b++;
                eVar.a(z2);
                this.f7791b--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f7791b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f7792c.remove(eVar);
        if (this.f7790a > 0) {
            this.f7793d.remove(eVar);
        }
    }

    public final void f(p pVar) {
        int i2;
        b();
        replace(0, length(), (CharSequence) pVar.f2023a);
        int i3 = pVar.f2024b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, pVar.f2025c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = pVar.f2026d;
        if (i4 < 0 || i4 >= (i2 = pVar.f2027e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f7801l.setComposingRegion(i4, i2);
        }
        this.f7794e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f7794e;
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f7810e = selectionStart;
        hVar.f7811f = selectionEnd;
        hVar.f7812g = composingSpanStart;
        hVar.f7813h = composingSpanEnd;
        hVar.f7806a = fVar;
        hVar.f7807b = "";
        hVar.f7808c = -1;
        hVar.f7809d = -1;
        arrayList.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f7795f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f7795f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f7791b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f7795f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f7794e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f7810e = selectionStart2;
        hVar.f7811f = selectionEnd2;
        hVar.f7812g = composingSpanStart2;
        hVar.f7813h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        hVar.f7806a = fVar;
        hVar.f7807b = charSequence2;
        hVar.f7808c = i2;
        hVar.f7809d = i3;
        arrayList.add(hVar);
        if (this.f7790a > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
