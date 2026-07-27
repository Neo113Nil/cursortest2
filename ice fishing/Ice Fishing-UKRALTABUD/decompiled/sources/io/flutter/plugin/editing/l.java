package io.flutter.plugin.editing;

import D.C0013n;
import L.C0051b;
import L.C0063n;
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
import l0.o;
import l0.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final r f2424a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f2425b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f2426c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f2427d;

    /* renamed from: e, reason: collision with root package name */
    public C0063n f2428e = new C0063n(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public o f2429f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f2430g;

    /* renamed from: h, reason: collision with root package name */
    public f f2431h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2432i;

    /* renamed from: j, reason: collision with root package name */
    public c f2433j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f2434k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f2435l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f2436m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f2437n;

    /* renamed from: o, reason: collision with root package name */
    public q f2438o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2439p;

    public l(r rVar, Q q2, C0200c c0200c, io.flutter.plugin.platform.k kVar, io.flutter.plugin.platform.j jVar) {
        this.f2424a = rVar;
        this.f2431h = new f(null, rVar);
        this.f2425b = (InputMethodManager) rVar.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2426c = AbstractC0099a.e(rVar.getContext().getSystemService(AbstractC0099a.j()));
        } else {
            this.f2426c = null;
        }
        if (i2 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(rVar);
            this.f2437n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new j(this));
        }
        this.f2427d = q2;
        q2.f598h = new j(this);
        ((C0051b) q2.f597g).D("TextInputClient.requestExistingInputState", null, null);
        this.f2434k = kVar;
        kVar.f2470k = this;
        this.f2435l = jVar;
        jVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10 == r0.f2761e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z2) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z2) {
            String fVar = this.f2431h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f2426c) != null && this.f2430g != null) {
                int hashCode = ((String) this.f2429f.f2750j.f242a).hashCode();
                forText = AutofillValue.forText(fVar);
                autofillManager.notifyValueChanged(this.f2424a, hashCode, forText);
            }
        }
        f fVar2 = this.f2431h;
        fVar2.getClass();
        int selectionStart = Selection.getSelectionStart(fVar2);
        f fVar3 = this.f2431h;
        fVar3.getClass();
        int selectionEnd = Selection.getSelectionEnd(fVar3);
        f fVar4 = this.f2431h;
        fVar4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar4);
        f fVar5 = this.f2431h;
        fVar5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar5);
        f fVar6 = this.f2431h;
        fVar6.getClass();
        ArrayList arrayList = fVar6.f2400e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f2438o != null) {
            if (this.f2431h.toString().equals(this.f2438o.f2757a)) {
                q qVar = this.f2438o;
                if (selectionStart == qVar.f2758b) {
                    if (selectionEnd == qVar.f2759c) {
                        if (composingSpanStart == qVar.f2760d) {
                        }
                    }
                }
            }
            this.f2431h.toString();
            boolean z3 = this.f2429f.f2745e;
            Q q2 = this.f2427d;
            if (z3) {
                int i2 = this.f2428e.f661c;
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
                        jSONObject.put("oldText", iVar.f2412a.toString());
                        jSONObject.put("deltaText", iVar.f2413b.toString());
                        jSONObject.put("deltaStart", iVar.f2414c);
                        jSONObject.put("deltaEnd", iVar.f2415d);
                        jSONObject.put("selectionBase", iVar.f2416e);
                        jSONObject.put("selectionExtent", iVar.f2417f);
                        jSONObject.put("composingBase", iVar.f2418g);
                        jSONObject.put("composingExtent", iVar.f2419h);
                    } catch (JSONException e2) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e2);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((C0051b) q2.f597g).D("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i2), hashMap), null);
                this.f2431h.f2400e.clear();
            } else {
                int i3 = this.f2428e.f661c;
                String fVar7 = this.f2431h.toString();
                q2.getClass();
                ((C0051b) q2.f597g).D("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), Q.o(fVar7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f2438o = new q(this.f2431h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.f2431h.f2400e.clear();
    }

    public final void b() {
        this.f2434k.f2470k = null;
        this.f2435l.getClass();
        this.f2427d.f598h = null;
        c();
        this.f2431h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f2437n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        o oVar;
        C0013n c0013n;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f2426c) == null || (oVar = this.f2429f) == null || (c0013n = oVar.f2750j) == null || this.f2430g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f2424a, ((String) c0013n.f242a).hashCode());
    }

    public final void d(o oVar) {
        C0013n c0013n;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (oVar == null || (c0013n = oVar.f2750j) == null) {
            this.f2430g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f2430g = sparseArray;
        o[] oVarArr = oVar.f2752l;
        if (oVarArr == null) {
            sparseArray.put(((String) c0013n.f242a).hashCode(), oVar);
            return;
        }
        for (o oVar2 : oVarArr) {
            C0013n c0013n2 = oVar2.f2750j;
            if (c0013n2 != null) {
                SparseArray sparseArray2 = this.f2430g;
                String str = (String) c0013n2.f242a;
                sparseArray2.put(str.hashCode(), oVar2);
                AutofillManager autofillManager = this.f2426c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((q) c0013n2.f244c).f2757a);
                autofillManager.notifyValueChanged(this.f2424a, hashCode, forText);
            }
        }
    }
}
