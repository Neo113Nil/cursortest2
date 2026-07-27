package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import c0.r;
import java.util.ArrayList;
import java.util.Iterator;
import l0.q;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f2396a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2397b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2398c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2399d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2400e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f2401f;

    /* renamed from: g, reason: collision with root package name */
    public String f2402g;

    /* renamed from: h, reason: collision with root package name */
    public int f2403h;

    /* renamed from: i, reason: collision with root package name */
    public int f2404i;

    /* renamed from: j, reason: collision with root package name */
    public int f2405j;

    /* renamed from: k, reason: collision with root package name */
    public int f2406k;

    /* renamed from: l, reason: collision with root package name */
    public final d f2407l;

    public f(q qVar, r rVar) {
        this.f2407l = new d(rVar, this);
        if (qVar != null) {
            f(qVar);
        }
    }

    public final void a(e eVar) {
        if (this.f2397b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f2396a <= 0) {
            this.f2398c.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f2399d.add(eVar);
        }
    }

    public final void b() {
        this.f2396a++;
        if (this.f2397b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f2396a != 1 || this.f2398c.isEmpty()) {
            return;
        }
        this.f2402g = toString();
        this.f2403h = Selection.getSelectionStart(this);
        this.f2404i = Selection.getSelectionEnd(this);
        this.f2405j = BaseInputConnection.getComposingSpanStart(this);
        this.f2406k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f2396a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f2398c;
        ArrayList arrayList2 = this.f2399d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f2397b++;
                eVar.a(true);
                this.f2397b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f2402g), (this.f2403h == Selection.getSelectionStart(this) && this.f2404i == Selection.getSelectionEnd(this)) ? false : true, (this.f2405j == BaseInputConnection.getComposingSpanStart(this) && this.f2406k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f2396a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator it = this.f2398c.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f2397b++;
                eVar.a(z2);
                this.f2397b--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f2397b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f2398c.remove(eVar);
        if (this.f2396a > 0) {
            this.f2399d.remove(eVar);
        }
    }

    public final void f(q qVar) {
        int i2;
        b();
        replace(0, length(), (CharSequence) qVar.f2757a);
        int i3 = qVar.f2758b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, qVar.f2759c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = qVar.f2760d;
        if (i4 < 0 || i4 >= (i2 = qVar.f2761e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f2407l.setComposingRegion(i4, i2);
        }
        this.f2400e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f2400e;
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f2416e = selectionStart;
        iVar.f2417f = selectionEnd;
        iVar.f2418g = composingSpanStart;
        iVar.f2419h = composingSpanEnd;
        iVar.f2412a = fVar;
        iVar.f2413b = "";
        iVar.f2414c = -1;
        iVar.f2415d = -1;
        arrayList.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f2401f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f2401f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f2397b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f2401f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f2400e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f2416e = selectionStart2;
        iVar.f2417f = selectionEnd2;
        iVar.f2418g = composingSpanStart2;
        iVar.f2419h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        iVar.f2412a = fVar;
        iVar.f2413b = charSequence2;
        iVar.f2414c = i2;
        iVar.f2415d = i3;
        arrayList.add(iVar);
        if (this.f2396a > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
