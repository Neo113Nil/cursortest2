package com.yandex.passport.internal.ui.social.gimap;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.yandex.passport.internal.widget.InputFieldView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final InputFieldView b;
    public final /* synthetic */ com.yandex.passport.internal.ui.base.d c;

    public h(com.yandex.passport.internal.ui.social.mail.b bVar, InputFieldView inputFieldView) {
        inputFieldView.getClass();
        this.c = bVar;
        this.b = inputFieldView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                break;
            default:
                editable.getClass();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                charSequence.getClass();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        InputFieldView inputFieldView;
        int i4 = this.a;
        com.yandex.passport.internal.ui.base.d dVar = this.c;
        InputFieldView inputFieldView2 = this.b;
        switch (i4) {
            case 0:
                inputFieldView2.a();
                int i5 = j.t;
                ((j) dVar).N();
                return;
            default:
                charSequence.getClass();
                inputFieldView2.a();
                com.yandex.passport.internal.ui.social.mail.b bVar = (com.yandex.passport.internal.ui.social.mail.b) dVar;
                InputFieldView inputFieldView3 = bVar.j;
                if (inputFieldView3 == null) {
                    Intrinsics.j("inputLogin");
                    throw null;
                }
                String obj = inputFieldView3.getEditText().getText().toString();
                int length = obj.length() - 1;
                int i6 = 0;
                boolean z = false;
                while (i6 <= length) {
                    boolean z2 = Intrinsics.e(obj.charAt(!z ? i6 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            String obj2 = obj.subSequence(i6, length + 1).toString();
                            inputFieldView = bVar.k;
                            if (inputFieldView != null) {
                                Intrinsics.j("inputPassword");
                                throw null;
                            }
                            boolean z3 = obj2.length() == 0 || inputFieldView.getEditText().getText().toString().length() == 0;
                            Button button = bVar.l;
                            if (button != null) {
                                button.setEnabled(!z3);
                                return;
                            } else {
                                Intrinsics.j("signInButton");
                                throw null;
                            }
                        }
                        length--;
                    } else if (z2) {
                        i6++;
                    } else {
                        z = true;
                    }
                }
                String obj22 = obj.subSequence(i6, length + 1).toString();
                inputFieldView = bVar.k;
                if (inputFieldView != null) {
                }
                break;
        }
    }

    public h(j jVar, InputFieldView inputFieldView) {
        this.c = jVar;
        this.b = inputFieldView;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }
}
