package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import c0.r;
import java.util.ArrayList;
import java.util.Iterator;
import l0.C0214q;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public int f2404a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2405b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2406c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2407d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2408e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f2409f;

    /* renamed from: g, reason: collision with root package name */
    public String f2410g;

    /* renamed from: h, reason: collision with root package name */
    public int f2411h;

    /* renamed from: i, reason: collision with root package name */
    public int f2412i;

    /* renamed from: j, reason: collision with root package name */
    public int f2413j;

    /* renamed from: k, reason: collision with root package name */
    public int f2414k;

    /* renamed from: l, reason: collision with root package name */
    public final d f2415l;

    public f(C0214q c0214q, r rVar) {
        this.f2415l = new d(rVar, this);
        if (c0214q != null) {
            f(c0214q);
        }
    }

    public final void a(e eVar) {
        if (this.f2405b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f2404a <= 0) {
            this.f2406c.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f2407d.add(eVar);
        }
    }

    public final void b() {
        this.f2404a++;
        if (this.f2405b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f2404a != 1 || this.f2406c.isEmpty()) {
            return;
        }
        this.f2410g = toString();
        this.f2411h = Selection.getSelectionStart(this);
        this.f2412i = Selection.getSelectionEnd(this);
        this.f2413j = BaseInputConnection.getComposingSpanStart(this);
        this.f2414k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i2 = this.f2404a;
        if (i2 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f2406c;
        ArrayList arrayList2 = this.f2407d;
        if (i2 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f2405b++;
                eVar.a(true);
                this.f2405b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f2410g), (this.f2411h == Selection.getSelectionStart(this) && this.f2412i == Selection.getSelectionEnd(this)) ? false : true, (this.f2413j == BaseInputConnection.getComposingSpanStart(this) && this.f2414k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f2404a--;
    }

    public final void d(boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            Iterator it = this.f2406c.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f2405b++;
                eVar.a(z2);
                this.f2405b--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f2405b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f2406c.remove(eVar);
        if (this.f2404a > 0) {
            this.f2407d.remove(eVar);
        }
    }

    public final void f(C0214q c0214q) {
        int i2;
        b();
        replace(0, length(), (CharSequence) c0214q.f2765a);
        int i3 = c0214q.f2766b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, c0214q.f2767c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = c0214q.f2768d;
        if (i4 < 0 || i4 >= (i2 = c0214q.f2769e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f2415l.setComposingRegion(i4, i2);
        }
        this.f2408e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        super.setSpan(obj, i2, i3, i4);
        ArrayList arrayList = this.f2408e;
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f2424e = selectionStart;
        iVar.f2425f = selectionEnd;
        iVar.f2426g = composingSpanStart;
        iVar.f2427h = composingSpanEnd;
        iVar.f2420a = fVar;
        iVar.f2421b = "";
        iVar.f2422c = -1;
        iVar.f2423d = -1;
        arrayList.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f2409f;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f2409f = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (this.f2405b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i6 = i3 - i2;
        boolean z2 = i6 != i5 - i4;
        for (int i7 = 0; i7 < i6 && !z2; i7++) {
            z2 |= charAt(i2 + i7) != charSequence.charAt(i4 + i7);
        }
        if (z2) {
            this.f2409f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i2, i3, charSequence, i4, i5);
        ArrayList arrayList = this.f2408e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f2424e = selectionStart2;
        iVar.f2425f = selectionEnd2;
        iVar.f2426g = composingSpanStart2;
        iVar.f2427h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        iVar.f2420a = fVar;
        iVar.f2421b = charSequence2;
        iVar.f2422c = i2;
        iVar.f2423d = i3;
        arrayList.add(iVar);
        if (this.f2404a > 0) {
            return replace;
        }
        d(z2, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
