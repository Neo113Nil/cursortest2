package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class o implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final ChipTextInputComboView f2754a;

    /* renamed from: b, reason: collision with root package name */
    public final ChipTextInputComboView f2755b;

    /* renamed from: c, reason: collision with root package name */
    public final k f2756c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2757d = false;

    public o(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, k kVar) {
        this.f2754a = chipTextInputComboView;
        this.f2755b = chipTextInputComboView2;
        this.f2756c = kVar;
    }

    public final void a(int i) {
        this.f2755b.setChecked(i == 12);
        this.f2754a.setChecked(i == 10);
        this.f2756c.f2744f = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z2 = i == 5;
        if (z2) {
            a(12);
        }
        return z2;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f2757d) {
            return false;
        }
        boolean z2 = true;
        this.f2757d = true;
        EditText editText = (EditText) view;
        if (this.f2756c.f2744f != 12) {
            Editable text = editText.getText();
            if (text != null) {
                if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                    a(12);
                } else if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
            }
            z2 = false;
        } else if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z2 = false;
        }
        this.f2757d = false;
        return z2;
    }
}
