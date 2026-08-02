package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.os.LocaleList;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import defpackage.cmy0;
import defpackage.cpy0;
import defpackage.dpy0;
import defpackage.duy;
import defpackage.dxc0;
import defpackage.epy0;
import defpackage.hwo0;
import defpackage.jkx;
import defpackage.l9s;
import defpackage.lon;
import defpackage.pgp0;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.TextInputChannel$TextCapitalization;
import io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType;
import io.flutter.plugin.platform.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public final class c implements duy {
    public final FlutterView a;
    public final InputMethodManager b;
    public final AutofillManager c;
    public final pgp0 d;
    public final epy0 e;
    public b f = new b(TextInputPlugin$InputTarget$Type.NO_TARGET, 0);
    public cpy0 g;
    public SparseArray h;
    public ListenableEditingState i;
    public boolean j;
    public InputConnection k;
    public final d l;
    public final dxc0 m;
    public Rect n;
    public final ImeSyncDeferringInsetsCallback o;
    public dpy0 p;
    public boolean q;

    public c(FlutterView flutterView, epy0 epy0Var, pgp0 pgp0Var, d dVar, dxc0 dxc0Var) {
        this.a = flutterView;
        this.i = new ListenableEditingState(null, flutterView);
        this.b = (InputMethodManager) flutterView.getContext().getSystemService("input_method");
        this.c = (AutofillManager) flutterView.getContext().getSystemService(AutofillManager.class);
        if (Build.VERSION.SDK_INT >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(flutterView);
            this.o = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.e = epy0Var;
        epy0Var.b = new a(this);
        epy0Var.a.a("TextInputClient.requestExistingInputState", null, null);
        this.d = pgp0Var;
        this.l = dVar;
        dVar.z = this;
        this.m = dxc0Var;
        dxc0Var.y = this;
    }

    public final void a(SparseArray sparseArray) {
        hwo0 hwo0Var;
        hwo0 hwo0Var2;
        cpy0 cpy0Var = this.g;
        if (cpy0Var == null || this.h == null || (hwo0Var = cpy0Var.j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            cpy0 cpy0Var2 = (cpy0) this.h.get(sparseArray.keyAt(i));
            if (cpy0Var2 != null && (hwo0Var2 = cpy0Var2.j) != null) {
                String str = (String) hwo0Var2.b;
                String charSequence = ((AutofillValue) sparseArray.valueAt(i)).getTextValue().toString();
                dpy0 dpy0Var = new dpy0(charSequence.length(), charSequence.length(), -1, -1, charSequence);
                if (str.equals((String) hwo0Var.b)) {
                    this.i.setEditingState(dpy0Var);
                } else {
                    hashMap.put(str, dpy0Var);
                }
            }
        }
        int i2 = this.f.b;
        epy0 epy0Var = this.e;
        epy0Var.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            dpy0 dpy0Var2 = (dpy0) entry.getValue();
            hashMap2.put((String) entry.getKey(), epy0.a(dpy0Var2.b, dpy0Var2.c, -1, -1, dpy0Var2.a));
        }
        epy0Var.a.a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i2), hashMap2), null);
    }

    public final void b(int i) {
        b bVar = this.f;
        TextInputPlugin$InputTarget$Type textInputPlugin$InputTarget$Type = bVar.a;
        if ((textInputPlugin$InputTarget$Type == TextInputPlugin$InputTarget$Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || textInputPlugin$InputTarget$Type == TextInputPlugin$InputTarget$Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && bVar.b == i) {
            this.f = new b(TextInputPlugin$InputTarget$Type.NO_TARGET, 0);
            f();
            FlutterView flutterView = this.a;
            IBinder applicationWindowToken = flutterView.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(flutterView);
            this.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection c(FlutterView flutterView, jkx jkxVar, EditorInfo editorInfo) {
        int i;
        int i2;
        b bVar = this.f;
        TextInputPlugin$InputTarget$Type textInputPlugin$InputTarget$Type = bVar.a;
        if (textInputPlugin$InputTarget$Type == TextInputPlugin$InputTarget$Type.NO_TARGET) {
            this.k = null;
            return null;
        }
        if (textInputPlugin$InputTarget$Type == TextInputPlugin$InputTarget$Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (textInputPlugin$InputTarget$Type == TextInputPlugin$InputTarget$Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.q) {
                return this.k;
            }
            InputConnection onCreateInputConnection = this.l.d(bVar.b).onCreateInputConnection(editorInfo);
            this.k = onCreateInputConnection;
            return onCreateInputConnection;
        }
        cpy0 cpy0Var = this.g;
        l9s l9sVar = cpy0Var.g;
        boolean z = cpy0Var.a;
        boolean z2 = cpy0Var.b;
        boolean z3 = cpy0Var.c;
        boolean z4 = cpy0Var.d;
        TextInputChannel$TextCapitalization textInputChannel$TextCapitalization = cpy0Var.f;
        TextInputChannel$TextInputType textInputChannel$TextInputType = (TextInputChannel$TextInputType) l9sVar.c;
        if (textInputChannel$TextInputType == TextInputChannel$TextInputType.DATETIME) {
            i = 4;
        } else if (textInputChannel$TextInputType == TextInputChannel$TextInputType.NUMBER) {
            int i3 = l9sVar.a ? 4098 : 2;
            i = l9sVar.b ? i3 | 8192 : i3;
        } else if (textInputChannel$TextInputType == TextInputChannel$TextInputType.PHONE) {
            i = 3;
        } else if (textInputChannel$TextInputType == TextInputChannel$TextInputType.NONE) {
            i = 0;
        } else {
            i = textInputChannel$TextInputType == TextInputChannel$TextInputType.MULTILINE ? 131073 : (textInputChannel$TextInputType == TextInputChannel$TextInputType.EMAIL_ADDRESS || textInputChannel$TextInputType == TextInputChannel$TextInputType.TWITTER) ? 33 : (textInputChannel$TextInputType == TextInputChannel$TextInputType.URL || textInputChannel$TextInputType == TextInputChannel$TextInputType.WEB_SEARCH) ? 17 : textInputChannel$TextInputType == TextInputChannel$TextInputType.VISIBLE_PASSWORD ? 145 : textInputChannel$TextInputType == TextInputChannel$TextInputType.NAME ? 97 : textInputChannel$TextInputType == TextInputChannel$TextInputType.POSTAL_ADDRESS ? 113 : 1;
            if (!z) {
                if (z2) {
                    i |= 32768;
                }
                i2 = z3 ? 524416 : 524432;
                if (textInputChannel$TextCapitalization != TextInputChannel$TextCapitalization.CHARACTERS) {
                    i |= 4096;
                } else if (textInputChannel$TextCapitalization == TextInputChannel$TextCapitalization.WORDS) {
                    i |= 8192;
                } else if (textInputChannel$TextCapitalization == TextInputChannel$TextCapitalization.SENTENCES) {
                    i |= 16384;
                }
            }
            i |= i2;
            if (textInputChannel$TextCapitalization != TextInputChannel$TextCapitalization.CHARACTERS) {
            }
        }
        editorInfo.inputType = i;
        editorInfo.imeOptions = SelfTester_JCP.DECRYPT_CFB;
        if (!z4) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = cpy0Var.h.intValue();
        cpy0 cpy0Var2 = this.g;
        String str = cpy0Var2.i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (cpy0Var2.m != null) {
            editorInfo.hintLocales = new LocaleList(this.g.m);
        }
        String[] strArr = this.g.k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            lon.c(editorInfo, true);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(flutterView, this.f.b, this.e, this.d, jkxVar, this.i, editorInfo);
        editorInfo.initialSelStart = this.i.getSelectionStart();
        editorInfo.initialSelEnd = this.i.getSelectionEnd();
        this.k = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    public final void d() {
        this.l.z = null;
        this.m.y = null;
        this.e.b = null;
        f();
        this.i.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.o;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r6 == r2.e) goto L42;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // defpackage.duy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didChangeEditingState(boolean z, boolean z2, boolean z3) {
        if (z) {
            String listenableEditingState = this.i.toString();
            AutofillManager autofillManager = this.c;
            if (autofillManager != null && this.h != null) {
                autofillManager.notifyValueChanged(this.a, ((String) this.g.j.b).hashCode(), AutofillValue.forText(listenableEditingState));
            }
        }
        int selectionStart = this.i.getSelectionStart();
        int selectionEnd = this.i.getSelectionEnd();
        int composingStart = this.i.getComposingStart();
        int composingEnd = this.i.getComposingEnd();
        ArrayList<cmy0> extractBatchTextEditingDeltas = this.i.extractBatchTextEditingDeltas();
        if (this.p != null) {
            if (this.i.toString().equals(this.p.a)) {
                dpy0 dpy0Var = this.p;
                if (selectionStart == dpy0Var.b) {
                    if (selectionEnd == dpy0Var.c) {
                        if (composingStart == dpy0Var.d) {
                        }
                    }
                }
            }
            this.i.toString();
            boolean z4 = this.g.e;
            b bVar = this.f;
            epy0 epy0Var = this.e;
            if (z4) {
                int i = bVar.b;
                epy0Var.getClass();
                extractBatchTextEditingDeltas.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator<cmy0> it = extractBatchTextEditingDeltas.iterator();
                while (it.hasNext()) {
                    cmy0 next = it.next();
                    next.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", next.a.toString());
                        jSONObject.put("deltaText", next.b.toString());
                        jSONObject.put("deltaStart", next.c);
                        jSONObject.put("deltaEnd", next.d);
                        jSONObject.put("selectionBase", next.e);
                        jSONObject.put("selectionExtent", next.f);
                        jSONObject.put("composingBase", next.g);
                        jSONObject.put("composingExtent", next.h);
                    } catch (JSONException e) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                epy0Var.a.a("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i), hashMap), null);
                this.i.clearBatchDeltas();
            } else {
                int i2 = bVar.b;
                String listenableEditingState2 = this.i.toString();
                epy0Var.getClass();
                epy0Var.a.a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i2), epy0.a(selectionStart, selectionEnd, composingStart, composingEnd, listenableEditingState2)), null);
            }
            this.p = new dpy0(selectionStart, selectionEnd, composingStart, composingEnd, this.i.toString());
            return;
        }
        this.i.clearBatchDeltas();
    }

    public final void e() {
        if (this.f.a == TextInputPlugin$InputTarget$Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.q = true;
        }
    }

    public final void f() {
        cpy0 cpy0Var;
        hwo0 hwo0Var;
        AutofillManager autofillManager = this.c;
        if (autofillManager == null || (cpy0Var = this.g) == null || (hwo0Var = cpy0Var.j) == null || this.h == null) {
            return;
        }
        autofillManager.notifyViewExited(this.a, ((String) hwo0Var.b).hashCode());
    }

    public final void g() {
        if (this.f.a == TextInputPlugin$InputTarget$Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.q = false;
        }
    }
}
