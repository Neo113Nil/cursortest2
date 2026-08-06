package io.flutter.plugin.editing;

import F.C0038n;
import P.C0064m;
import P0.AbstractC0068a;
import P0.t;
import Z0.n;
import Z0.p;
import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final t f7815a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f7816b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f7817c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.e f7818d;

    /* renamed from: e, reason: collision with root package name */
    public C0064m f7819e = new C0064m(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public n f7820f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f7821g;

    /* renamed from: h, reason: collision with root package name */
    public f f7822h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7823i;

    /* renamed from: j, reason: collision with root package name */
    public c f7824j;

    /* renamed from: k, reason: collision with root package name */
    public final k f7825k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f7826l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f7827m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f7828n;

    /* renamed from: o, reason: collision with root package name */
    public p f7829o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7830p;

    public j(t tVar, x0.e eVar, Z0.i iVar, k kVar, io.flutter.plugin.platform.j jVar) {
        this.f7815a = tVar;
        this.f7822h = new f(null, tVar);
        this.f7816b = (InputMethodManager) tVar.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f7817c = AbstractC0068a.e(tVar.getContext().getSystemService(AbstractC0068a.j()));
        } else {
            this.f7817c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(tVar);
            this.f7828n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new i(this));
        }
        this.f7818d = eVar;
        eVar.f8531c = new i(this);
        ((I0.b) eVar.f8530b).G("TextInputClient.requestExistingInputState", null, null);
        this.f7825k = kVar;
        kVar.f7862f = this;
        this.f7826l = jVar;
        jVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f2027e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String fVar = this.f7822h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f7817c) != null && this.f7821g != null) {
                int hashCode = ((String) this.f7820f.f2016j.f532a).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f7815a, hashCode, forText);
            }
        }
        f fVar2 = this.f7822h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f7822h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f7822h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f7822h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f7822h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f7794e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f7829o != null) {
            if (this.f7822h.toString().equals(this.f7829o.f2023a)) {
                p pVar = this.f7829o;
                if (selectionStart == pVar.f2024b) {
                    if (selectionEnd == pVar.f2025c) {
                        if (composingSpanStart == pVar.f2026d) {
                        }
                    }
                }
            }
            this.f7822h.toString();
            boolean z3 = this.f7820f.f2011e;
            x0.e eVar = this.f7818d;
            if (z3) {
                int i2 = this.f7819e.f1356c;
                eVar.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    hVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", hVar.f7806a.toString());
                        jSONObject.put("deltaText", hVar.f7807b.toString());
                        jSONObject.put("deltaStart", hVar.f7808c);
                        jSONObject.put("deltaEnd", hVar.f7809d);
                        jSONObject.put("selectionBase", hVar.f7810e);
                        jSONObject.put("selectionExtent", hVar.f7811f);
                        jSONObject.put("composingBase", hVar.f7812g);
                        jSONObject.put("composingExtent", hVar.f7813h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((I0.b) eVar.f8530b).G("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f7822h.f7794e.clear();
            } else {
                int i3 = this.f7819e.f1356c;
                String fVar7 = this.f7822h.toString();
                eVar.getClass();
                ((I0.b) eVar.f8530b).G("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), x0.e.n(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f7829o = new p(this.f7822h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f7822h.f7794e.clear();
    }

    public final void b() {
        this.f7825k.f7862f = null;
        this.f7826l.getClass();
        this.f7818d.f8531c = null;
        c();
        this.f7822h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f7828n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        n nVar;
        C0038n c0038n;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f7817c) == null || (nVar = this.f7820f) == null || (c0038n = nVar.f2016j) == null || this.f7821g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f7815a, ((String) c0038n.f532a).hashCode());
    }

    public final void d(n nVar) {
        C0038n c0038n;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (nVar == null || (c0038n = nVar.f2016j) == null) {
            this.f7821g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f7821g = sparseArray;
        n[] nVarArr = nVar.f2018l;
        if (nVarArr == null) {
            sparseArray.put(((String) c0038n.f532a).hashCode(), nVar);
            return;
        }
        for (n nVar2 : nVarArr) {
            C0038n c0038n2 = nVar2.f2016j;
            if (c0038n2 != null) {
                SparseArray sparseArray2 = this.f7821g;
                String str = (String) c0038n2.f532a;
                sparseArray2.put(str.hashCode(), nVar2);
                AutofillManager autofillManager = this.f7817c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((p) c0038n2.f534c).f2023a);
                autofillManager.notifyValueChanged(this.f7815a, hashCode, forText);
            }
        }
    }
}
