package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import defpackage.cmy0;
import defpackage.dpy0;
import defpackage.duy;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class ListenableEditingState extends SpannableStringBuilder {
    private static final String TAG = "ListenableEditingState";
    private int mComposingEndWhenBeginBatchEdit;
    private int mComposingStartWhenBeginBatchEdit;
    private BaseInputConnection mDummyConnection;
    private int mSelectionEndWhenBeginBatchEdit;
    private int mSelectionStartWhenBeginBatchEdit;
    private String mTextWhenBeginBatchEdit;
    private String mToStringCache;
    private int mBatchEditNestDepth = 0;
    private int mChangeNotificationDepth = 0;
    private ArrayList<duy> mListeners = new ArrayList<>();
    private ArrayList<duy> mPendingListeners = new ArrayList<>();
    private ArrayList<cmy0> mBatchTextEditingDeltas = new ArrayList<>();

    public ListenableEditingState(dpy0 dpy0Var, View view) {
        this.mDummyConnection = new BaseInputConnection(view, true) { // from class: io.flutter.plugin.editing.ListenableEditingState.1
            @Override // android.view.inputmethod.BaseInputConnection
            public Editable getEditable() {
                return this;
            }
        };
        if (dpy0Var != null) {
            setEditingState(dpy0Var);
        }
    }

    private void notifyListener(duy duyVar, boolean z, boolean z2, boolean z3) {
        this.mChangeNotificationDepth++;
        duyVar.didChangeEditingState(z, z2, z3);
        this.mChangeNotificationDepth--;
    }

    private void notifyListenersIfNeeded(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator<duy> it = this.mListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), z, z2, z3);
            }
        }
    }

    public void addEditingStateListener(duy duyVar) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "adding a listener " + duyVar.toString() + " in a listener callback");
        }
        if (this.mBatchEditNestDepth > 0) {
            this.mPendingListeners.add(duyVar);
        } else {
            this.mListeners.add(duyVar);
        }
    }

    public void beginBatchEdit() {
        this.mBatchEditNestDepth++;
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        if (this.mBatchEditNestDepth != 1 || this.mListeners.isEmpty()) {
            return;
        }
        this.mTextWhenBeginBatchEdit = toString();
        this.mSelectionStartWhenBeginBatchEdit = getSelectionStart();
        this.mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
        this.mComposingStartWhenBeginBatchEdit = getComposingStart();
        this.mComposingEndWhenBeginBatchEdit = getComposingEnd();
    }

    public void clearBatchDeltas() {
        this.mBatchTextEditingDeltas.clear();
    }

    public void endBatchEdit() {
        int i = this.mBatchEditNestDepth;
        if (i == 0) {
            Log.e(TAG, "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator<duy> it = this.mPendingListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), true, true, true);
            }
            if (!this.mListeners.isEmpty()) {
                this.mListeners.size();
                notifyListenersIfNeeded(!toString().equals(this.mTextWhenBeginBatchEdit), (this.mSelectionStartWhenBeginBatchEdit == getSelectionStart() && this.mSelectionEndWhenBeginBatchEdit == getSelectionEnd()) ? false : true, (this.mComposingStartWhenBeginBatchEdit == getComposingStart() && this.mComposingEndWhenBeginBatchEdit == getComposingEnd()) ? false : true);
            }
        }
        this.mListeners.addAll(this.mPendingListeners);
        this.mPendingListeners.clear();
        this.mBatchEditNestDepth--;
    }

    public ArrayList<cmy0> extractBatchTextEditingDeltas() {
        ArrayList<cmy0> arrayList = new ArrayList<>(this.mBatchTextEditingDeltas);
        this.mBatchTextEditingDeltas.clear();
        return arrayList;
    }

    public final int getComposingEnd() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int getComposingStart() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int getSelectionEnd() {
        return Selection.getSelectionEnd(this);
    }

    public final int getSelectionStart() {
        return Selection.getSelectionStart(this);
    }

    public void removeEditingStateListener(duy duyVar) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "removing a listener " + duyVar.toString() + " in a listener callback");
        }
        this.mListeners.remove(duyVar);
        if (this.mBatchEditNestDepth > 0) {
            this.mPendingListeners.remove(duyVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        String listenableEditingState = toString();
        int i5 = i2 - i;
        boolean z = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z; i6++) {
            z |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        if (z) {
            this.mToStringCache = null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int composingStart = getComposingStart();
        int composingEnd = getComposingEnd();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        ArrayList<cmy0> arrayList = this.mBatchTextEditingDeltas;
        int selectionStart2 = getSelectionStart();
        int selectionEnd2 = getSelectionEnd();
        int composingStart2 = getComposingStart();
        int composingEnd2 = getComposingEnd();
        cmy0 cmy0Var = new cmy0();
        cmy0Var.e = selectionStart2;
        cmy0Var.f = selectionEnd2;
        cmy0Var.g = composingStart2;
        cmy0Var.h = composingEnd2;
        String charSequence2 = charSequence.toString();
        cmy0Var.a = listenableEditingState;
        cmy0Var.b = charSequence2;
        cmy0Var.c = i;
        cmy0Var.d = i2;
        arrayList.add(cmy0Var);
        if (this.mBatchEditNestDepth > 0) {
            return replace;
        }
        notifyListenersIfNeeded(z, (getSelectionStart() == selectionStart && getSelectionEnd() == selectionEnd) ? false : true, (getComposingStart() == composingStart && getComposingEnd() == composingEnd) ? false : true);
        return replace;
    }

    public void setComposingRange(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.mDummyConnection.setComposingRegion(i, i2);
        }
    }

    public void setEditingState(dpy0 dpy0Var) {
        beginBatchEdit();
        replace(0, length(), (CharSequence) dpy0Var.a);
        int i = dpy0Var.b;
        if (i >= 0) {
            Selection.setSelection(this, i, dpy0Var.c);
        } else {
            Selection.removeSelection(this);
        }
        setComposingRange(dpy0Var.d, dpy0Var.e);
        clearBatchDeltas();
        endBatchEdit();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        super.setSpan(obj, i, i2, i3);
        ArrayList<cmy0> arrayList = this.mBatchTextEditingDeltas;
        String listenableEditingState = toString();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int composingStart = getComposingStart();
        int composingEnd = getComposingEnd();
        cmy0 cmy0Var = new cmy0();
        cmy0Var.e = selectionStart;
        cmy0Var.f = selectionEnd;
        cmy0Var.g = composingStart;
        cmy0Var.h = composingEnd;
        cmy0Var.a = listenableEditingState;
        cmy0Var.b = "";
        cmy0Var.c = -1;
        cmy0Var.d = -1;
        arrayList.add(cmy0Var);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.mToStringCache;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.mToStringCache = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
