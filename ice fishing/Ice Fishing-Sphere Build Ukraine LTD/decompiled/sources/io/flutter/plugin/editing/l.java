package io.flutter.plugin.editing;

import D.C0013n;
import L.C0026b;
import L.C0038n;
import L.Q;
import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import c0.AbstractC0099a;
import c0.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import l0.C0200c;
import l0.C0212o;
import l0.C0214q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final r f2432a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f2433b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f2434c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f2435d;

    /* renamed from: e, reason: collision with root package name */
    public C0038n f2436e = new C0038n(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public C0212o f2437f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f2438g;

    /* renamed from: h, reason: collision with root package name */
    public f f2439h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2440i;

    /* renamed from: j, reason: collision with root package name */
    public c f2441j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f2442k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f2443l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f2444m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f2445n;

    /* renamed from: o, reason: collision with root package name */
    public C0214q f2446o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2447p;

    public l(r rVar, Q q2, C0200c c0200c, io.flutter.plugin.platform.k kVar, io.flutter.plugin.platform.j jVar) {
        this.f2432a = rVar;
        this.f2439h = new f(null, rVar);
        this.f2433b = (InputMethodManager) rVar.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2434c = AbstractC0099a.e(rVar.getContext().getSystemService(AbstractC0099a.j()));
        } else {
            this.f2434c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(rVar);
            this.f2445n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new j(this));
        }
        this.f2435d = q2;
        q2.f520g = new j(this);
        ((C0026b) q2.f519f).D("TextInputClient.requestExistingInputState", null, null);
        this.f2442k = kVar;
        kVar.f2478j = this;
        this.f2443l = jVar;
        jVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f2769e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String fVar = this.f2439h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f2434c) != null && this.f2438g != null) {
                int hashCode = ((String) this.f2437f.f2758j.f243a).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f2432a, hashCode, forText);
            }
        }
        f fVar2 = this.f2439h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f2439h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f2439h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f2439h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f2439h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f2408e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f2446o != null) {
            if (this.f2439h.toString().equals(this.f2446o.f2765a)) {
                C0214q c0214q = this.f2446o;
                if (selectionStart == c0214q.f2766b) {
                    if (selectionEnd == c0214q.f2767c) {
                        if (composingSpanStart == c0214q.f2768d) {
                        }
                    }
                }
            }
            this.f2439h.toString();
            boolean z3 = this.f2437f.f2753e;
            Q q2 = this.f2435d;
            if (z3) {
                int i2 = this.f2436e.f583c;
                q2.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", iVar.f2420a.toString());
                        jSONObject.put("deltaText", iVar.f2421b.toString());
                        jSONObject.put("deltaStart", iVar.f2422c);
                        jSONObject.put("deltaEnd", iVar.f2423d);
                        jSONObject.put("selectionBase", iVar.f2424e);
                        jSONObject.put("selectionExtent", iVar.f2425f);
                        jSONObject.put("composingBase", iVar.f2426g);
                        jSONObject.put("composingExtent", iVar.f2427h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((C0026b) q2.f519f).D("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f2439h.f2408e.clear();
            } else {
                int i3 = this.f2436e.f583c;
                String fVar7 = this.f2439h.toString();
                q2.getClass();
                ((C0026b) q2.f519f).D("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), Q.o(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f2446o = new C0214q(this.f2439h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f2439h.f2408e.clear();
    }

    public final void b() {
        this.f2442k.f2478j = null;
        this.f2443l.getClass();
        this.f2435d.f520g = null;
        c();
        this.f2439h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f2445n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        C0212o c0212o;
        C0013n c0013n;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f2434c) == null || (c0212o = this.f2437f) == null || (c0013n = c0212o.f2758j) == null || this.f2438g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f2432a, ((String) c0013n.f243a).hashCode());
    }

    public final void d(C0212o c0212o) {
        C0013n c0013n;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (c0212o == null || (c0013n = c0212o.f2758j) == null) {
            this.f2438g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f2438g = sparseArray;
        C0212o[] c0212oArr = c0212o.f2760l;
        if (c0212oArr == null) {
            sparseArray.put(((String) c0013n.f243a).hashCode(), c0212o);
            return;
        }
        for (C0212o c0212o2 : c0212oArr) {
            C0013n c0013n2 = c0212o2.f2758j;
            if (c0013n2 != null) {
                SparseArray sparseArray2 = this.f2438g;
                String str = (String) c0013n2.f243a;
                sparseArray2.put(str.hashCode(), c0212o2);
                AutofillManager autofillManager = this.f2434c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((C0214q) c0013n2.f245c).f2765a);
                autofillManager.notifyValueChanged(this.f2432a, hashCode, forText);
            }
        }
    }
}
